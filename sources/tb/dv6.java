package tb;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class dv6 {
    public static final String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    public static final String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    public static final String DEBUG_PROPERTY_VALUE_OFF = "off";
    public static final String DEBUG_PROPERTY_VALUE_ON = "on";
    public static final String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18090a;
    public static final boolean b;
    public static final AtomicLong c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r0.equals("on") != false) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r0.equals("") != false) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = tb.o3r.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x003c
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0032
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0046
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0046
            goto L_0x0030
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0046
        L_0x0030:
            r0 = 0
            goto L_0x0063
        L_0x0032:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0046
            goto L_0x0044
        L_0x003c:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0046
        L_0x0044:
            r0 = 1
            goto L_0x0063
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.<init>(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0063:
            tb.dv6.f18090a = r0
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = tb.o3r.f(r0, r1)
            if (r0 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            tb.dv6.b = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            tb.dv6.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dv6.<clinit>():void");
    }

    public static final AtomicLong a() {
        return c;
    }

    public static final boolean b() {
        return f18090a;
    }

    public static final boolean c() {
        return b;
    }
}
