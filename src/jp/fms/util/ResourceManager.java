package jp.fms.util;

import java.net.URL;

public class ResourceManager {

	public static final ResourceManager instance = new ResourceManager();

	private ResourceManager(){

	}

	/**
	 * Change relatice path into URL to use in JAR File
	 * @param Relative path
	 * @return URL
	 */
	public URL getResource(String path){
		return getClass().getClassLoader().getResource(path.toLowerCase());
	}
}
