# GLGE-GWT [![Build Status](https://secure.travis-ci.org/neothemachine/glge-gwt.png)](http://travis-ci.org/neothemachine/glge-gwt)

GLGE-GWT is a wrapper of the [GLGE](http://www.glge.org) library for Google Web Toolkit (GWT).

## Usage

Include the following in your pom:

		<dependency>
			<groupId>com.github.neothemachine</groupId>
			<artifactId>glge-gwt</artifactId>
			<version>x.y.z</version>
		</dependency>
		<dependency>
			<groupId>com.github.neothemachine</groupId>
			<artifactId>glge-gwt</artifactId>
			<version>x.y.z</version>
			<classifier>sources</classifier>
		</dependency>
		
You need both, as the GWT compiler needs the Java sources.

## Notes

This is a work-in-progress! It hasn't been tested yet and I won't wrap the whole API, just
the parts I need. If someone wants to contribute, that would be great :)