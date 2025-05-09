package com.alibaba.wireless.security.framework;

import android.content.pm.PackageInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    public PackageInfo c = null;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f3412a = null;

    static {
        t2o.a(659554326);
    }

    public a(String str) {
        this.b = str;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            JSONObject a2 = a();
            return a2 != null ? a2.getString(str) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return new File(this.b).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public JSONObject a() {
        JSONObject jSONObject;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this});
        }
        JSONObject jSONObject2 = this.f3412a;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        try {
            a2 = com.alibaba.wireless.security.framework.utils.a.a(new File(this.b));
        } catch (Exception unused) {
        }
        if (a2 != null && a2.length() > 0) {
            jSONObject = new JSONObject(a2);
            this.f3412a = jSONObject;
            return jSONObject;
        }
        jSONObject = null;
        this.f3412a = jSONObject;
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.content.pm.PackageInfo r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "keepaliveprocs"
            java.lang.String r3 = "thirdpartyso"
            java.lang.String r4 = "reversedependencies"
            java.lang.String r5 = "weakdependenciesNotDelay"
            java.lang.String r6 = "weakdependencies"
            java.lang.String r7 = "dependencies"
            java.lang.String r8 = "pluginclass"
            java.lang.String r9 = "pluginname"
            java.lang.String r10 = "hasso"
            com.android.alibaba.ip.runtime.IpChange r11 = com.alibaba.wireless.security.framework.a.$ipChange
            boolean r12 = r11 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r12 == 0) goto L_0x003b
            java.lang.String r2 = "fc9b3b4d"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r13
            r3[r0] = r14
            r14 = 2
            r3[r14] = r15
            java.lang.Object r14 = r11.ipc$dispatch(r2, r3)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            return r14
        L_0x003b:
            if (r14 == 0) goto L_0x00dc
            if (r15 != 0) goto L_0x0041
            goto L_0x00dc
        L_0x0041:
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r11 = "version"
            java.lang.String r12 = r14.versionName     // Catch: Exception -> 0x00db
            r15.put(r11, r12)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r11 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r11 = r11.metaData     // Catch: Exception -> 0x00db
            boolean r11 = r11.getBoolean(r10, r1)     // Catch: Exception -> 0x00db
            r15.put(r10, r11)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r10 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r10 = r10.metaData     // Catch: Exception -> 0x00db
            java.lang.String r10 = r10.getString(r9)     // Catch: Exception -> 0x00db
            r15.put(r9, r10)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r9 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r9 = r9.metaData     // Catch: Exception -> 0x00db
            java.lang.String r9 = r9.getString(r8)     // Catch: Exception -> 0x00db
            r15.put(r8, r9)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r8 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r8 = r8.metaData     // Catch: Exception -> 0x00db
            java.lang.String r8 = r8.getString(r7)     // Catch: Exception -> 0x00db
            r15.put(r7, r8)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r7 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r7 = r7.metaData     // Catch: Exception -> 0x00db
            java.lang.String r7 = r7.getString(r6)     // Catch: Exception -> 0x00db
            r15.put(r6, r7)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r6 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r6 = r6.metaData     // Catch: Exception -> 0x00db
            java.lang.String r6 = r6.getString(r5)     // Catch: Exception -> 0x00db
            r15.put(r5, r6)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r5 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r5 = r5.metaData     // Catch: Exception -> 0x00db
            java.lang.String r5 = r5.getString(r4)     // Catch: Exception -> 0x00db
            r15.put(r4, r5)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r4 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r4 = r4.metaData     // Catch: Exception -> 0x00db
            boolean r4 = r4.getBoolean(r3)     // Catch: Exception -> 0x00db
            r15.put(r3, r4)     // Catch: Exception -> 0x00db
            android.content.pm.ApplicationInfo r14 = r14.applicationInfo     // Catch: Exception -> 0x00db
            android.os.Bundle r14 = r14.metaData     // Catch: Exception -> 0x00db
            java.lang.String r14 = r14.getString(r2)     // Catch: Exception -> 0x00db
            r15.put(r2, r14)     // Catch: Exception -> 0x00db
            java.io.File r14 = new java.io.File     // Catch: Exception -> 0x00c4
            java.lang.String r2 = r13.b     // Catch: Exception -> 0x00c4
            r14.<init>(r2)     // Catch: Exception -> 0x00c4
            boolean r2 = r14.exists()     // Catch: Exception -> 0x00c2
            if (r2 != 0) goto L_0x00d0
            r14.createNewFile()     // Catch: Exception -> 0x00c2
            goto L_0x00d0
        L_0x00c2:
            goto L_0x00c5
        L_0x00c4:
            r14 = 0
        L_0x00c5:
            boolean r2 = r14.exists()
            if (r2 != 0) goto L_0x00d0
            r14.createNewFile()     // Catch: Exception -> 0x00cf
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            java.lang.String r15 = r15.toString()
            boolean r14 = com.alibaba.wireless.security.framework.utils.a.a(r14, r15)
            if (r14 != 0) goto L_0x00db
            r0 = 0
        L_0x00db:
            return r0
        L_0x00dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.a.a(android.content.pm.PackageInfo, java.lang.String):boolean");
    }
}
