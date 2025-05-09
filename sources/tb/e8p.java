package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e8p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18360a;
    public final String b;
    public Object c = null;
    public Object d = null;
    public Class e = null;
    public Field f = null;
    public Field g = null;
    public Field h = null;
    public Method i = null;
    public final int j = 3;
    public boolean k = false;

    static {
        t2o.a(962593269);
    }

    public e8p(String str, String str2) {
        this.f18360a = str;
        this.b = str2;
    }

    public String getSign(String str) {
        Class cls;
        nhh.f("SecuritySDK", "toBeSignedStr", str);
        if (!this.k) {
            a();
        }
        String str2 = this.f18360a;
        String str3 = null;
        if (str2 == null) {
            nhh.f("SecuritySDK", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            Object obj = this.c;
            if (obj == null || (cls = this.e) == null || this.f == null || this.g == null || this.h == null || this.i == null || this.d == null) {
                nhh.v("SecuritySDK", "UTSecurityThridRequestAuthentication.getSign s_securityGuardManagerObj", obj, "s_securityGuardParamContextClz", this.e, "s_securityGuardParamContext_appKey", this.f, "s_securityGuardParamContext_paramMap", this.g, "s_securityGuardParamContext_requestType", this.h, "s_signRequestMethod", this.i);
            } else {
                try {
                    Object newInstance = cls.newInstance();
                    this.f.set(newInstance, str2);
                    ((Map) this.g.get(newInstance)).put("INPUT", str);
                    this.h.set(newInstance, Integer.valueOf(this.j));
                    str3 = (String) this.i.invoke(this.d, newInstance, this.b);
                } catch (Exception e) {
                    nhh.h("SecuritySDK", e, new Object[0]);
                }
            }
            nhh.f("SecuritySDK", "lSignedStr", str3);
            return str3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009e, blocks: (B:4:0x0004, B:14:0x0046, B:19:0x00a0, B:16:0x0055), top: B:26:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() {
        /*
            r9 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            monitor-enter(r9)
            boolean r3 = r9.k     // Catch: all -> 0x009e
            if (r3 == 0) goto L_0x000a
            monitor-exit(r9)
            return
        L_0x000a:
            r3 = 0
            java.lang.Class<com.alibaba.wireless.security.open.SecurityGuardManager> r4 = com.alibaba.wireless.security.open.SecurityGuardManager.class
            com.android.alibaba.ip.runtime.IpChange r5 = com.alibaba.wireless.security.open.SecurityGuardManager.$ipChange     // Catch: all -> 0x0042
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: all -> 0x0040
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r1] = r7     // Catch: all -> 0x0040
            java.lang.reflect.Method r5 = r4.getMethod(r5, r6)     // Catch: all -> 0x0040
            tb.o2w r6 = tb.o2w.k()     // Catch: all -> 0x0040
            android.content.Context r6 = r6.g()     // Catch: all -> 0x0040
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: all -> 0x0040
            r7[r1] = r6     // Catch: all -> 0x0040
            java.lang.Object r3 = r5.invoke(r3, r7)     // Catch: all -> 0x0040
            r9.c = r3     // Catch: all -> 0x0040
            java.lang.String r3 = "getSecureSignatureComp"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: all -> 0x0040
            java.lang.reflect.Method r3 = r4.getMethod(r3, r5)     // Catch: all -> 0x0040
            java.lang.Object r5 = r9.c     // Catch: all -> 0x0040
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: all -> 0x0040
            java.lang.Object r3 = r3.invoke(r5, r6)     // Catch: all -> 0x0040
            r9.d = r3     // Catch: all -> 0x0040
            goto L_0x0053
        L_0x0040:
            r3 = move-exception
            goto L_0x0046
        L_0x0042:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L_0x0046:
            java.lang.String r5 = "SecuritySDK"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: all -> 0x009e
            java.lang.String r7 = "initSecurityCheck"
            r6[r1] = r7     // Catch: all -> 0x009e
            r6[r2] = r3     // Catch: all -> 0x009e
            tb.nhh.v(r5, r6)     // Catch: all -> 0x009e
        L_0x0053:
            if (r4 == 0) goto L_0x00a0
            java.lang.Class<com.alibaba.wireless.security.open.SecurityGuardParamContext> r3 = com.alibaba.wireless.security.open.SecurityGuardParamContext.class
            int r4 = com.alibaba.wireless.security.open.SecurityGuardParamContext.f3433a     // Catch: all -> 0x008f
            r9.e = r3     // Catch: all -> 0x008f
            java.lang.String r4 = "appKey"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: all -> 0x008f
            r9.f = r3     // Catch: all -> 0x008f
            java.lang.Class r3 = r9.e     // Catch: all -> 0x008f
            java.lang.String r4 = "paramMap"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: all -> 0x008f
            r9.g = r3     // Catch: all -> 0x008f
            java.lang.Class r3 = r9.e     // Catch: all -> 0x008f
            java.lang.String r4 = "requestType"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: all -> 0x008f
            r9.h = r3     // Catch: all -> 0x008f
            java.lang.Class<com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent> r3 = com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent.class
            java.lang.String r4 = "signRequest"
            java.lang.Class r5 = r9.e     // Catch: all -> 0x008f
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: all -> 0x008f
            r6[r1] = r5     // Catch: all -> 0x008f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6[r2] = r5     // Catch: all -> 0x008f
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: all -> 0x008f
            r9.i = r3     // Catch: all -> 0x008f
            goto L_0x00a0
        L_0x008f:
            r3 = move-exception
            java.lang.String r4 = "SecuritySDK"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x009e
            java.lang.String r5 = "initSecurityCheck"
            r0[r1] = r5     // Catch: all -> 0x009e
            r0[r2] = r3     // Catch: all -> 0x009e
            tb.nhh.v(r4, r0)     // Catch: all -> 0x009e
            goto L_0x00a0
        L_0x009e:
            r0 = move-exception
            goto L_0x00a4
        L_0x00a0:
            r9.k = r2     // Catch: all -> 0x009e
            monitor-exit(r9)
            return
        L_0x00a4:
            monitor-exit(r9)     // Catch: all -> 0x009e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e8p.a():void");
    }
}
