# GLGE-GWT [![Build Status](https://secure.travis-ci.org/neothemachine/glge-gwt.png)](http://travis-ci.org/neothemachine/glge-gwt)

GLGE-GWT is a wrapper of the [GLGE](http://www.glge.org) library for Google Web Toolkit (GWT).

## Usage

1. Include the following in your pom:

		<dependency>
			<groupId>com.github.neothemachine</groupId>
			<artifactId>glge-gwt</artifactId>
			<version>0.1.1</version>
		</dependency>
		<dependency>
			<groupId>com.github.neothemachine</groupId>
			<artifactId>glge-gwt</artifactId>
			<version>0.1.1</version>
			<classifier>sources</classifier>
		</dependency>
		
2. Add the following to your .gwt.xml file:

		<inherits name="com.github.neothemachine.glgegwt.GLGEGWT" />

3. Have a look at [neothemachine/glge-gwt-sample](https://github.com/neothemachine/glge-gwt-sample) to see a small example project.

## Notes

This is a work-in-progress! It hasn't been thoroughly tested yet and I won't wrap the whole API, just
the parts I need. If someone wants to contribute, that would be great :)
