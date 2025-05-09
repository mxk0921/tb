package com.uc.webview.internal.stats;

import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class c {
    private static final Random b = new Random();

    /* renamed from: a  reason: collision with root package name */
    protected int f14510a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        c a(Map<String, String> map);
    }

    public boolean a(c cVar) {
        return false;
    }

    public abstract h b();

    public void b(c cVar) {
    }

    public abstract int c();

    public abstract int d();

    public abstract Map<String, String> e();

    public abstract c f();

    public final String g() {
        return b().f14513a;
    }

    public boolean h() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r2 > 50000) goto L_0x0049;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r4 = this;
            com.uc.webview.internal.stats.h r0 = r4.b()
            boolean r1 = r4.h()
            if (r1 == 0) goto L_0x0050
            com.uc.webview.internal.stats.h r1 = r4.b()
            int r2 = r1.size()
            r3 = 50
            if (r2 <= r3) goto L_0x0017
            goto L_0x0049
        L_0x0017:
            int r2 = r1.size()
            int r3 = r4.d()
            int r2 = r2 * r3
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 <= r3) goto L_0x0026
            goto L_0x0049
        L_0x0026:
            int r2 = r1.size()
            r3 = 7
            if (r2 <= r3) goto L_0x0050
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0032:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r1.next()
            com.uc.webview.internal.stats.c r3 = (com.uc.webview.internal.stats.c) r3
            int r3 = r3.c()
            int r2 = r2 + r3
            goto L_0x0032
        L_0x0044:
            r1 = 50000(0xc350, float:7.0065E-41)
            if (r2 <= r1) goto L_0x0050
        L_0x0049:
            r4.j()
            com.uc.webview.base.Log.b()
            return
        L_0x0050:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0076
            java.util.Iterator r1 = r0.iterator()
        L_0x005a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()
            com.uc.webview.internal.stats.c r2 = (com.uc.webview.internal.stats.c) r2
            boolean r3 = r2.a(r4)
            if (r3 == 0) goto L_0x005a
            r2.b(r4)
            r4.toString()
            com.uc.webview.base.Log.b()
            return
        L_0x0076:
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.c.i():void");
    }

    public abstract String j();

    public abstract void k();

    public final void l() {
        StatsManager.a(f());
        k();
    }

    public static String a(String str, Map map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(map.size() * 16);
        if (str.isEmpty()) {
            sb.append(str);
            sb.append(": ");
        }
        sb.append("{");
        for (Object obj : map.keySet()) {
            sb.append(obj);
            sb.append(": ");
            sb.append(map.get(obj));
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("}");
        return sb.toString();
    }
}
