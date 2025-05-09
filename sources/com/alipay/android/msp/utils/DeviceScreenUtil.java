package com.alipay.android.msp.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.List;
import tb.slo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceScreenUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HUAWEI_BRAND = "HUAWEI";
    private static final List<String> HUAWEI_FOLD_DEVICES;
    private static final List<String> HUAWEI_FOLD_MODELS;
    private static final String SAMSUNG_BRAND = "samsung";

    static {
        ArrayList arrayList = new ArrayList();
        HUAWEI_FOLD_DEVICES = arrayList;
        arrayList.add("unknownRLI");
        arrayList.add("HWTAH");
        arrayList.add("MRX-AL09");
        arrayList.add("HWMRX");
        arrayList.add("TAH-AN00m");
        arrayList.add("HWTAH-C");
        arrayList.add("RHA-AN00m");
        arrayList.add("unknowRHA");
        arrayList.add("unknownTXL");
        arrayList.add("HWTET");
        arrayList.add("PAL-AL00");
        arrayList.add("PAL-LX9");
        arrayList.add("DHF-AL00");
        arrayList.add("DHF-LX9");
        ArrayList arrayList2 = new ArrayList();
        HUAWEI_FOLD_MODELS = arrayList2;
        arrayList2.add("TAH-N29m");
        arrayList2.add("ALT-AL00");
        arrayList2.add("TGW-AL00");
        arrayList2.add("ALT-L29");
        arrayList2.add("TGW-L29");
        arrayList2.add("ALT-AL10");
        arrayList2.add("TWH-AL10");
    }

    public static boolean isFoldDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        if ("samsung".equalsIgnoreCase(str) && TextUtils.equals("SM-F9000", Build.MODEL)) {
            return true;
        }
        if (("HUAWEI".equalsIgnoreCase(str) && (HUAWEI_FOLD_DEVICES.contains(Build.DEVICE) || HUAWEI_FOLD_MODELS.contains(Build.MODEL))) || TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_foldable_device_model_10550"), slo.VALUE_YES)) {
            return true;
        }
        if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_degrade_foldable_device_10550"), slo.VALUE_YES)) {
            return false;
        }
        return isOPPOFold() || isVivoFoldableDevice() || isXiaomiFold() || isHwFoldableDevice(GlobalHelper.getInstance().getContext()) || isHonorFoldableDevice(GlobalHelper.getInstance().getContext());
    }

    private static boolean isHonorFoldableDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aa5e234", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(Build.MANUFACTURER)) {
                if (context.getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    private static boolean isHwFoldableDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edc561b", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER)) {
                if (context.getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    public static boolean isPadWindow(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19517105", new Object[]{resources})).booleanValue();
        }
        if ((resources.getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    private static boolean isVivoFoldableDevice() {
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "foldable".equals(cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static boolean isOPPOFold() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static boolean isPadDevice() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.characteristics", "")).contains("tablet");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static boolean isXiaomiFold() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }
}
