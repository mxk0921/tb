package com.alibaba.flexa.compat;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DelegatePM {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String sProxyVersionName = "";
    public static String sBaseVersionName = "";

    static {
        t2o.a(677380290);
    }

    public static PackageInfo proxy_getPackageInfo(PackageManager packageManager, String str, int i) throws PackageManager.NameNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("55c32fdc", new Object[]{packageManager, str, new Integer(i)});
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
        if (!TextUtils.isEmpty(sProxyVersionName)) {
            packageInfo.versionName = sProxyVersionName;
        }
        return packageInfo;
    }
}
