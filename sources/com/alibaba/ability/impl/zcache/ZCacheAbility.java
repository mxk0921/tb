package com.alibaba.ability.impl.zcache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.cu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ZCacheAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ZCACHE_PREFETCH = "prefetch";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(143654915);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(143654914);
    }

    public static /* synthetic */ Object ipc$super(ZCacheAbility zCacheAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/zcache/ZCacheAbility");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (tb.kqu.l(r6) == false) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        r6 = (java.util.List) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (tb.kqu.l(r6) == false) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r6 == null) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        tb.yox.n(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        return new com.alibaba.ability.result.FinishResult(null, null, 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        return com.alibaba.ability.result.ErrorResult.a.Companion.g("ZCache prefetch list is empty");
     */
    @Override // tb.hdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r6, tb.kdb r7, java.util.Map<java.lang.String, ? extends java.lang.Object> r8, tb.vq r9) {
        /*
            r5 = this;
            r0 = 3
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.ability.impl.zcache.ZCacheAbility.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0021
            java.lang.String r2 = "b2cd7d0b"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r4 = 1
            r3[r4] = r6
            r6 = 2
            r3[r6] = r7
            r3[r0] = r8
            r6 = 4
            r3[r6] = r9
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            com.alibaba.ability.result.ExecuteResult r6 = (com.alibaba.ability.result.ExecuteResult) r6
            return r6
        L_0x0021:
            java.lang.String r1 = "api"
            tb.ckf.g(r6, r1)
            java.lang.String r1 = "context"
            tb.ckf.g(r7, r1)
            java.lang.String r7 = "params"
            tb.ckf.g(r8, r7)
            java.lang.String r7 = "callback"
            tb.ckf.g(r9, r7)
            int r7 = r6.hashCode()
            r9 = -1288666633(0xffffffffb33081f7, float:-4.1096396E-8)
            if (r7 == r9) goto L_0x0040
            goto L_0x0087
        L_0x0040:
            java.lang.String r7 = "prefetch"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0087
            java.lang.String r6 = "resources"
            java.lang.Object r7 = r8.get(r6)
            boolean r7 = tb.kqu.l(r7)
            r9 = 0
            if (r7 == 0) goto L_0x0065
            java.lang.Object r6 = r8.get(r6)
            boolean r7 = tb.kqu.l(r6)
            if (r7 != 0) goto L_0x0062
        L_0x0061:
            r6 = r9
        L_0x0062:
            java.util.List r6 = (java.util.List) r6
            goto L_0x0073
        L_0x0065:
            java.lang.String r6 = "prefetchList"
            java.lang.Object r6 = r8.get(r6)
            boolean r7 = tb.kqu.l(r6)
            if (r7 != 0) goto L_0x0062
            goto L_0x0061
        L_0x0073:
            if (r6 == 0) goto L_0x007e
            tb.yox.n(r6)
            com.alibaba.ability.result.FinishResult r6 = new com.alibaba.ability.result.FinishResult
            r6.<init>(r9, r9, r0, r9)
            return r6
        L_0x007e:
            com.alibaba.ability.result.ErrorResult$a$a r6 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r7 = "ZCache prefetch list is empty"
            com.alibaba.ability.result.ErrorResult r6 = r6.g(r7)
            return r6
        L_0x0087:
            com.alibaba.ability.result.ErrorResult$a$a r6 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r7 = "Api not found"
            com.alibaba.ability.result.ErrorResult r6 = r6.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.zcache.ZCacheAbility.execute(java.lang.String, tb.kdb, java.util.Map, tb.vq):com.alibaba.ability.result.ExecuteResult");
    }
}
