package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ohz implements s2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int e = 99;
    public static final int f = 2;
    public static final String g = "onError";

    /* renamed from: a  reason: collision with root package name */
    public final m9z f25400a;
    public final Map<String, Integer> b;
    public final String c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737369);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public ohz(m9z m9zVar, Map<String, Integer> map, String str, String str2) {
        ckf.g(m9zVar, "ncCallMegaContext");
        ckf.g(str, "megaName");
        ckf.g(str2, "megaApi");
        this.f25400a = m9zVar;
        this.b = map;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    @Override // tb.s2d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCallback(com.alibaba.ability.result.ExecuteResult r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ohz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "f183ed74"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.lang.String r0 = "executeResult"
            tb.ckf.g(r6, r0)
            tb.u7z$a r0 = tb.u7z.Companion
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x003b
            tb.iiz$a r0 = tb.iiz.Companion
            java.lang.String r1 = r5.c
            java.lang.String r2 = r5.d
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r6)
            java.lang.String r4 = "toJSONString(executeResult)"
            tb.ckf.f(r3, r4)
            java.lang.String r4 = " onCallback result "
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r4, r3}
            r0.q(r1)
        L_0x003b:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            if (r0 != 0) goto L_0x0040
            return
        L_0x0040:
            int r0 = r6.getStatusCode()
            int r1 = tb.ohz.f
            if (r0 != r1) goto L_0x0049
            return
        L_0x0049:
            int r0 = r6.getStatusCode()
            int r1 = tb.ohz.e
            if (r0 <= r1) goto L_0x0071
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            tb.ckf.d(r0)
            java.lang.String r1 = tb.ohz.g
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0096
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            tb.ckf.d(r0)
            java.lang.Object r0 = r0.get(r1)
            tb.ckf.d(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0097
        L_0x0071:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            tb.ckf.d(r0)
            java.lang.String r1 = r6.getType()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x008d
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            tb.ckf.d(r0)
            java.lang.String r1 = r6.getModType()
            java.lang.Object r0 = r0.get(r1)
        L_0x008d:
            if (r0 == 0) goto L_0x0096
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0097
        L_0x0096:
            r0 = -1
        L_0x0097:
            if (r0 >= 0) goto L_0x00c2
            tb.iiz$a r0 = tb.iiz.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "找不到对应的callback type "
            r1.<init>(r2)
            java.lang.String r2 = r6.getType()
            r1.append(r2)
            java.lang.String r2 = " statueCode  "
            r1.append(r2)
            int r6 = r6.getStatusCode()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r0.q(r6)
            return
        L_0x00c2:
            tb.ehz r6 = tb.ehz.INSTANCE
            tb.m9z r1 = r5.f25400a
            tb.n9z r1 = r1.a()
            tb.ckf.d(r1)
            r6.m(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ohz.onCallback(com.alibaba.ability.result.ExecuteResult):void");
    }

    static {
        t2o.a(598737368);
        t2o.a(144703517);
    }
}
