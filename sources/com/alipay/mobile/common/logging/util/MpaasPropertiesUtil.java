package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MpaasPropertiesUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f3994a = new HashMap();

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: IOException -> 0x0068
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    public static java.util.Map<java.lang.String, java.lang.String> a(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.MpaasPropertiesUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "4d84e95"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            r4 = move-result
            java.util.Map r4 = (java.util.Map) r4
            return r4
            r0 = 0
            r4.getAssets()
            r4 = move-result
            java.lang.String r1 = "mpaas.properties"
            r4.open(r1)
            r0 = move-result
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r4.load(r0)
            r4.size()
            r1 = move-result
            if (r1 > 0) goto L_0x0037
            java.util.Collections.emptyMap()
            r4 = move-result
            r0.close()
            return r4
            java.util.HashMap r1 = new java.util.HashMap
            r4.size()
            r2 = move-result
            r1.<init>(r2)
            r4.entrySet()
            r4 = move-result
            r4.iterator()
            r4 = move-result
            r4.hasNext()
            r2 = move-result
            if (r2 == 0) goto L_0x0064
            r4.next()
            r2 = move-result
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r2.getKey()
            r3 = move-result
            java.lang.String r3 = (java.lang.String) r3
            r2.getValue()
            r2 = move-result
            java.lang.String r2 = (java.lang.String) r2
            r1.put(r3, r2)
            goto L_0x0048
            r0.close()
            return r1
        L_0x0068:
            r0.close()
            java.util.Collections.emptyMap()
            r4 = move-result
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.MpaasPropertiesUtil.a(android.content.Context):java.util.Map");
    }

    public static String getAppID(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93d43865", new Object[]{context});
        }
        return getKeyFromManifest(context, "ALIPUSH_APPID");
    }

    public static String getAppKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40f00213", new Object[]{context});
        }
        return getKeyFromManifest(context, "appkey");
    }

    public static String getKeyFromManifest(Context context, String str) {
        ApplicationInfo applicationInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f199d17", new Object[]{context, str});
        }
        Map<String, String> map = f3994a;
        if (((HashMap) map).containsKey(str)) {
            return (String) ((HashMap) map).get(str);
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            try {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    String string = bundle.getString(str);
                    ((HashMap) f3994a).put(str, string);
                    return string;
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static String getKeyFromMpaasProperties(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97026d85", new Object[]{context, str});
        }
        Map<String, String> map = f3994a;
        HashMap hashMap = (HashMap) map;
        if (hashMap.containsKey(str)) {
            return (String) hashMap.get(str);
        }
        String str2 = null;
        try {
            Map<String, String> a2 = a(context);
            ((HashMap) map).putAll(a2);
            if (a2 != null) {
                str2 = a2.get(str);
            }
            if (str2 != null) {
                ((HashMap) map).put(str, str2);
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static String getMpaasapi(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("874f5f", new Object[]{context});
        }
        return getKeyFromManifest(context, "mpaasapi");
    }

    public static String getProductId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7797ca53", new Object[]{context});
        }
        return getAppKey(context) + "-" + getWorkSpaceId(context);
    }

    public static String getWorkSpaceId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8facb59", new Object[]{context});
        }
        return getKeyFromMpaasProperties(context, "WorkspaceId");
    }
}
