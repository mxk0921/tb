package com.alipay.mobile.common.netsdkextdependapi.network;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.ariver.utils.AppInfoUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MiscNetUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f4021a;
    public static Boolean b;

    public static String getAppId() {
        try {
            return (String) AppInfoUtils.class.getMethod("getAppId", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            LogCatUtil.error("MiscNetUtils", "ex:" + th);
            return "";
        }
    }

    public static String getAppKey() {
        try {
            return (String) AppInfoUtils.class.getMethod("getAppKey", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            LogCatUtil.error("MiscNetUtils", "ex:" + th);
            return "";
        }
    }

    public static boolean isInTaobaoApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae6684c1", new Object[]{context})).booleanValue();
        }
        Boolean bool = f4021a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        if (packageName.startsWith("com.taobao.taobao")) {
            Boolean bool2 = Boolean.TRUE;
            f4021a = bool2;
            return bool2.booleanValue();
        }
        Boolean bool3 = Boolean.FALSE;
        f4021a = bool3;
        return bool3.booleanValue();
    }

    public static boolean isTLogBuiltIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df24874", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            IpChange ipChange2 = TLog.$ipChange;
            b = Boolean.TRUE;
        } catch (Throwable unused) {
            b = Boolean.FALSE;
        }
        return b.booleanValue();
    }
}
