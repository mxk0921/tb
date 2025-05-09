package com.taobao.message.notification.util;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.t2o;
import tb.why;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BrandUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_COLOR = "#ffffff$#999999@default";
    public static final String TAG = "BrandUtil";
    private static BrandUtil mBrandUtil;
    private static final String mBrand = Build.BRAND;
    private static final String mModel = Build.MODEL.replace(" ", "");
    private static final String mRelease = Build.VERSION.RELEASE;

    static {
        t2o.a(610271338);
    }

    public static synchronized BrandUtil getInstance() {
        synchronized (BrandUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BrandUtil) ipChange.ipc$dispatch("dca6380e", new Object[0]);
            }
            if (mBrandUtil == null) {
                mBrandUtil = new BrandUtil();
            }
            return mBrandUtil;
        }
    }

    private String getUsefulColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a3a22", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("BRAND=");
        String str = mBrand;
        sb.append(str);
        sb.append(", MODEL=");
        String str2 = mModel;
        sb.append(str2);
        sb.append(", mRelease=");
        String str3 = mRelease;
        sb.append(str3);
        TLog.loge(TAG, sb.toString());
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        Map<String, Map<String, Map<String, String>>> map = BrandList.mBrandMap;
        if (map.get(str) == null || map.get(str).get(str2) == null || map.get(str).get(str2).get(str3) == null) {
            return null;
        }
        return map.get(str).get(str2).get(str3);
    }

    public static boolean isHonor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b602deb", new Object[0])).booleanValue();
        }
        return Build.MANUFACTURER.equalsIgnoreCase("honor");
    }

    public static boolean isHuawei() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2815d7bc", new Object[0])).booleanValue();
        }
        return Build.MANUFACTURER.equalsIgnoreCase("huawei");
    }

    public static boolean isOPPO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f03f1755", new Object[0])).booleanValue();
        }
        return mBrand.toLowerCase().equals("oppo");
    }

    public static boolean isVivo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("347e3281", new Object[0])).booleanValue();
        }
        return mBrand.toLowerCase().equals("vivo");
    }

    public static boolean isXiaoMi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9518cb0", new Object[0])).booleanValue();
        }
        return Build.MANUFACTURER.equalsIgnoreCase("xiaomi");
    }

    public String getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
        }
        String usefulColor = getUsefulColor();
        if (TextUtils.isEmpty(usefulColor) || "default".equals(usefulColor)) {
            return null;
        }
        return usefulColor.substring(usefulColor.indexOf("@") + 1);
    }

    public String getContentColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e3fa19", new Object[]{this});
        }
        if (EmuiAdapter.isOn()) {
            TLog.logd(TAG, "EmuiAdapter is on");
            return DEFAULT_COLOR.substring(8, 15);
        }
        String usefulColor = getUsefulColor();
        if (!TextUtils.isEmpty(usefulColor)) {
            return usefulColor.substring(usefulColor.indexOf("$") + 1, usefulColor.indexOf("@"));
        }
        return null;
    }

    public String getTitleColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2889b8", new Object[]{this});
        }
        if (EmuiAdapter.isOn()) {
            TLog.logd(TAG, "EmuiAdapter is on");
            return why.DEFAULT_MASK_BACKGROUND_COLOR;
        }
        String usefulColor = getUsefulColor();
        if (!TextUtils.isEmpty(usefulColor)) {
            return usefulColor.substring(usefulColor.indexOf("#"), usefulColor.indexOf("$"));
        }
        return null;
    }

    public boolean isVivoAnd5x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f59a2f", new Object[]{this})).booleanValue();
        }
        getInstance();
        if (!isVivo()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            return true;
        }
        return false;
    }

    public boolean shouldNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("604dfd67", new Object[]{this})).booleanValue();
        }
        if (isVivoAnd5x()) {
            return false;
        }
        return true;
    }
}
