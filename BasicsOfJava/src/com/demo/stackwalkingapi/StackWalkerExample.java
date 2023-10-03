package com.demo.stackwalkingapi;

import java.lang.StackWalker.StackFrame;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class StackWalkerExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException,
	IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method fooMethod = FooHelper.class.getDeclaredMethod("foo", (Class<?>[])null);
		fooMethod.invoke(null, (Object[]) null);
	}
}

class FooHelper {
	protected static void foo() {
		BarHelper.bar();
	}
}

class BarHelper {
	protected static void bar() {
		List<StackFrame> stack = StackWalker.getInstance()
				.walk((s) -> s.collect(Collectors.toList()));
		for(StackFrame frame : stack) {
			System.out.println(frame.getClassName() + " " + frame.getLineNumber() + " " +
					frame.getMethodName());
		}
	}

}
