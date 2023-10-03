package com.demo.test;

public class TestByteCodeModification {

	Map<String, ClassNode> loadClasses(File jarFile) throws IOException {
		Map<String, ClassNode> classes = new HashMap<String, ClassNode>();
		JarFile jar = new JarFile(jarFile);
		Stream<JarEntry> str = jar.stream();
		str.forEach(z -> readJar(jar, z, classes));
		jar.close();
		return classes;
	}
	Map<String, ClassNode> readJar(JarFile jar, JarEntry entry, Map<String, ClassNode> classes) {
		String name = entry.getName();
		try (InputStream jis = jar.getInputStream(entry)){
			if (name.endsWith(".class")) {
				byte[] bytes = IOUtils.toByteArray(jis);
				String cafebabe = String.format("%02X%02X%02X%02X", bytes[0], bytes[1], bytes[2],
						bytes[3]);
				if (!cafebabe.toLowerCase().equals("cafebabe")) {
					// This class doesn't have a valid magic
					return classes;
				}
				try {
					ClassNode cn = getNode(bytes);
					classes.put(cn.name, cn);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return classes;
	}
	ClassNode getNode(byte[] bytes) {
		ClassReader cr = new ClassReader(bytes);
		ClassNode cn = new ClassNode();
		try {
			cr.accept(cn, ClassReader.EXPAND_FRAMES);
		} catch (Exception e) {
			e.printStackTrace();
		}
		cr = null;
		return cn;
	}

	public static void main(String[] args) {





	}

}
