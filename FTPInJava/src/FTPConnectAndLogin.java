

import java.lang.System.Logger;
import java.net.UnknownHostException;

public class FTPConnectAndLogin {

	Logger logger
	= LoggerFactory.getLogger(FtpConnector.class);

	public FTPClient connect() throws IOException
	{
		// Create an instance of FTPClient
		FTPClient ftpClient = new FTPClient();
		try {
			// establish a connection with specific host and
			// port.
			ftpClient.connect("localhost", 21);

			int replyCode = ftpClient.getReplyCode();
			if (!FTPReply.isPositiveCompletion(replyCode)) {
				logger.info(
						"Operation failed. Server reply code: "
								+ replyCode);
				ftpClient.disconnect();
			}

			// login to ftp server with username and
			// password.
			boolean success
			= ftpClient.login("testuser", "123");
			if (!success) {
				ftpClient.disconnect();
			}
			// assign file type according to the server.
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			ftpClient.enterLocalPassiveMode();

			// change specific directory of ftp server from
			// you want to download files.
			boolean changedRemoteDir
			= ftpClient.changeWorkingDirectory(
					"/home/testuser/directory");
			if (!changedRemoteDir) {
				logger.info("Remote directory not found.");
			}
		}
		catch (UnknownHostException E) {
			logger.info("No such ftp server");
		}
		catch (IOException e) {
			logger.info(e.getMessage());
		}
		return ftpClient;
	}

}
