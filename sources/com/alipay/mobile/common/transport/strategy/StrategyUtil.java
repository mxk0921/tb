package com.alipay.mobile.common.transport.strategy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StrategyUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean grayscaleUtdid(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da6bb5c", new Object[]{str, iArr})).booleanValue();
        }
        return MiscUtils.grayscaleUtdid(str, iArr);
    }

    public static final boolean isRetryTaskForSwitchRpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d86d80", new Object[]{str})).booleanValue();
        }
        if (!isSwitchRpc(str)) {
            return false;
        }
        return TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.AFTER_LOGIN_GO_EXT, "T");
    }

    public static final boolean isSwitchRpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe357b5c", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "alipay.client.switches.all.get.afterlogin") || str.contains("alipay.client.switches.all.get")) {
            return true;
        }
        return false;
    }

    public static final boolean isUse4Brand(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be00885", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = Build.BRAND;
            if (!TextUtils.isEmpty(str2) && str.contains(str2.trim().toLowerCase().replaceAll("\\s+", "_"))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isUse4Hardware(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f1a8434", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = Build.HARDWARE;
            if (!TextUtils.isEmpty(str2) && str.contains(str2.trim().toLowerCase().replaceAll("\\s+", "_"))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isUse4Model(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edf72a7", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = Build.MODEL;
            if (!TextUtils.isEmpty(str2) && str.contains(str2.trim().toLowerCase().replaceAll("\\s+", "_"))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isUse4Net(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a1a9da9", new Object[]{context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        int connType = ConnectionUtil.getConnType(context);
        if (TextUtils.isEmpty(str) || !str.contains(String.valueOf(connType))) {
            return true;
        }
        return false;
    }

    public static final boolean isUse4OperationType(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c5fa70", new Object[]{list, str})).booleanValue();
        }
        if (!list.contains("ALL") && !list.contains("ALL1") && !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final boolean isUse4SdkVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("466b6b4a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.contains(String.valueOf(Build.VERSION.SDK_INT))) {
            return true;
        }
        return false;
    }
}
