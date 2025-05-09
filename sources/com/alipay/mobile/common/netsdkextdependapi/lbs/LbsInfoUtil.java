package com.alipay.mobile.common.netsdkextdependapi.lbs;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LbsInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final LbsInfoManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LbsInfoManager) ipChange.ipc$dispatch("a1f18372", new Object[0]);
        }
        return LbsInfoManagerFactory.getInstance().getDefaultBean();
    }

    public static String getExtLbsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78d67059", new Object[0]);
        }
        return a().getExtLbsInfo();
    }

    public static String getKeyLBSInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bd5f97", new Object[0]);
        }
        return a().getKeyLBSInfo();
    }

    public static double getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[0])).doubleValue();
        }
        return a().getLatitude();
    }

    public static Long getLocationtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("92019036", new Object[0]);
        }
        return a().getLocationtime();
    }

    public static double getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b61adaee", new Object[0])).doubleValue();
        }
        return a().getLongitude();
    }
}
