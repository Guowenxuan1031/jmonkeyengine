package com.jme3.system.osvr.osvrclientreporttypes;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
/**
 * JNA Wrapper for library <b>osvrClientReportTypes</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OsvrClientReportTypesLibrary implements Library {
	public static final String JNA_LIBRARY_NAME = "osvrClientKit";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(OsvrClientReportTypesLibrary.JNA_LIBRARY_NAME);
	static {
		Native.register(OsvrClientReportTypesLibrary.class, OsvrClientReportTypesLibrary.JNA_NATIVE_LIB);
	}
	public static final int OSVR_TRUE = 1;
	public static final int OSVR_FALSE = 0;
	public static final int OSVR_BUTTON_PRESSED = 1;
	public static final int OSVR_BUTTON_NOT_PRESSED = 0;
	public static final int OSVR_EYE_BLINK = 1;
	public static final int OSVR_EYE_NO_BLINK = 0;
	/** Original signature : <code>double osvrVec3GetX(const OSVR_Vec3*)</code> */
	public static native double osvrVec3GetX(OSVR_Vec3 v);
	/** Original signature : <code>void osvrVec3SetX(OSVR_Vec3*, double)</code> */
	public static native void osvrVec3SetX(OSVR_Vec3 v, double val);
	/** Original signature : <code>double osvrVec3GetY(const OSVR_Vec3*)</code> */
	public static native double osvrVec3GetY(OSVR_Vec3 v);
	/** Original signature : <code>void osvrVec3SetY(OSVR_Vec3*, double)</code> */
	public static native void osvrVec3SetY(OSVR_Vec3 v, double val);
	/** Original signature : <code>double osvrVec3GetZ(const OSVR_Vec3*)</code> */
	public static native double osvrVec3GetZ(OSVR_Vec3 v);
	/** Original signature : <code>void osvrVec3SetZ(OSVR_Vec3*, double)</code> */
	public static native void osvrVec3SetZ(OSVR_Vec3 v, double val);
	/**
	 * Set a Vec3 to the zero vector.
	 * Original signature : <code>void osvrVec3Zero(OSVR_Vec3*)</code>
	 */
	public static native void osvrVec3Zero(OSVR_Vec3 v);
	/** Original signature : <code>double osvrQuatGetW(const OSVR_Quaternion*)</code> */
	public static native double osvrQuatGetW(OSVR_Quaternion q);
	/** Original signature : <code>void osvrQuatSetW(OSVR_Quaternion*, double)</code> */
	public static native void osvrQuatSetW(OSVR_Quaternion q, double val);
	/** Original signature : <code>double osvrQuatGetX(const OSVR_Quaternion*)</code> */
	public static native double osvrQuatGetX(OSVR_Quaternion q);
	/** Original signature : <code>void osvrQuatSetX(OSVR_Quaternion*, double)</code> */
	public static native void osvrQuatSetX(OSVR_Quaternion q, double val);
	/** Original signature : <code>double osvrQuatGetY(const OSVR_Quaternion*)</code> */
	public static native double osvrQuatGetY(OSVR_Quaternion q);
	/** Original signature : <code>void osvrQuatSetY(OSVR_Quaternion*, double)</code> */
	public static native void osvrQuatSetY(OSVR_Quaternion q, double val);
	/** Original signature : <code>double osvrQuatGetZ(const OSVR_Quaternion*)</code> */
	public static native double osvrQuatGetZ(OSVR_Quaternion q);
	/** Original signature : <code>void osvrQuatSetZ(OSVR_Quaternion*, double)</code> */
	public static native void osvrQuatSetZ(OSVR_Quaternion q, double val);
	/**
	 * Set a quaternion to the identity rotation.
	 * Original signature : <code>void osvrQuatSetIdentity(OSVR_Quaternion*)</code>
	 */
	public static native void osvrQuatSetIdentity(OSVR_Quaternion q);
	/**
	 * Set a pose to identity.
	 * Original signature : <code>void osvrPose3SetIdentity(OSVR_Pose3*)</code>
	 */
	public static native void osvrPose3SetIdentity(OSVR_Pose3 pose);
	/** Original signature : <code>double osvrVec2GetX(const OSVR_Vec2*)</code> */
	public static native double osvrVec2GetX(OSVR_Vec2 v);
	/** Original signature : <code>void osvrVec2SetX(OSVR_Vec2*, double)</code> */
	public static native void osvrVec2SetX(OSVR_Vec2 v, double val);
	/** Original signature : <code>double osvrVec2GetY(const OSVR_Vec2*)</code> */
	public static native double osvrVec2GetY(OSVR_Vec2 v);
	/** Original signature : <code>void osvrVec2SetY(OSVR_Vec2*, double)</code> */
	public static native void osvrVec2SetY(OSVR_Vec2 v, double val);
	/**
	 * Set a Vec2 to the zero vector.
	 * Original signature : <code>void osvrVec2Zero(OSVR_Vec2*)</code>
	 */
	public static native void osvrVec2Zero(OSVR_Vec2 v);
}
