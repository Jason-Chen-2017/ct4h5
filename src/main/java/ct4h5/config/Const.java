package ct4h5.config;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 东海陈光剑 2014年2月17日 下午7:01:26
 */
public class Const {
	/**
	 * 预发首页地址
	 */
	final public static String urlEtaoPre = "http://wapa.etao.com/";
	/**
	 * 线上首页地址
	 */
	final public static String urlEtaoOnline = "http://m.etao.com/";

	/**
	 * 预发首页地址
	 */
	final public static String urlTaobaoPre = "http://wapa.taobao.com/";
	/**
	 * 线上首页地址
	 */
	final public static String urlTaobaoOnline = "http://m.taobao.com/";

	/**
	 * WebDriver server包的路径
	 */
	final public static String apkPath = "D:/Android/ct4h5/android-server.apk";
	/**
	 * Test类所在的package路径
	 */
	final public static String packageEtaoH5Path = "ct4etaoh5.test";
	final public static String packageTaobaoH5Path = "ct4taobaoh5.test";
	public static String timestamp = (new SimpleDateFormat("yyyyMMddhhmmss"))
			.format(new Date());
	/**
	 * 截图保存的路径
	 */
	// public static String photoSavePath = new File("src/test/resources/"
	// + timestamp + "/").getAbsolutePath();

	public static String photoSavePath = "D:/Apache2.2/htdocs/resources/"
			+ timestamp + "/";
	public static String photoSrcPath = "http://127.0.0.1:88/resources/"
			+ timestamp + "/";

	public static StringBuffer report = new StringBuffer("<table border=\"0\">"
			+ "<tr><th width=\"80\" scope=\"col\">deviceId</th>");

}