package org.webrtc.voiceengine;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class BuildInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313879);
    }

    public static String getAndroidBuildId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea3d0d49", new Object[0]);
        }
        return Build.ID;
    }

    public static String getBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935139c8", new Object[0]);
        }
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("425de2a", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d827a27", new Object[0]);
        }
        return Build.TYPE;
    }

    public static String getDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b1ef52d", new Object[0]);
        }
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551edfdc", new Object[0]);
        }
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[0]);
        }
        return Build.MODEL;
    }

    public static String getProduct() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("274903e0", new Object[0]);
        }
        return Build.PRODUCT;
    }

    public static int getSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("541225ae", new Object[0])).intValue();
        }
        return Build.VERSION.SDK_INT;
    }
}
