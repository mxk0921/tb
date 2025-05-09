package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsBroadcastAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsBroadcastAbility f17845a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337688);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("cd4cecd4", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final dii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dii) ipChange.ipc$dispatch("ecf1519d", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "broadcast", null, 2, null);
                if (!(d instanceof AbsBroadcastAbility)) {
                    d = null;
                }
                return new dii((AbsBroadcastAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaBroadcast", "create internal ability error: " + th.getMessage());
                return new dii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "broadcast", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337687);
    }

    public dii(AbsBroadcastAbility absBroadcastAbility) {
        this.f17845a = absBroadcastAbility;
    }

    @JvmStatic
    public static final dii c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dii) ipChange.ipc$dispatch("ecf1519d", new Object[0]);
        }
        return Companion.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r5, tb.qsc r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dii.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "f909068b"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.lang.String r0 = "eventName"
            tb.ckf.g(r5, r0)
            tb.el2$a r0 = tb.el2.Companion
            tb.el2 r5 = r0.a(r5)
            if (r5 == 0) goto L_0x004e
            com.taobao.android.abilityidl.ability.AbsBroadcastAbility r0 = r4.f17845a
            if (r0 == 0) goto L_0x003e
            tb.zhi$a r1 = tb.zhi.Companion
            tb.xq r1 = r1.a()
            if (r6 == 0) goto L_0x0033
            r2 = r6
            goto L_0x0038
        L_0x0033:
            tb.lii r2 = new tb.lii
            r2.<init>()
        L_0x0038:
            r0.addEventListener(r1, r5, r2)
        L_0x003b:
            tb.xhv r5 = tb.xhv.INSTANCE
            goto L_0x004b
        L_0x003e:
            if (r6 == 0) goto L_0x004a
            tb.dii$a r5 = tb.dii.Companion
            com.alibaba.ability.result.ErrorResult r5 = tb.dii.a.a(r5)
            r6.O(r5)
            goto L_0x003b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            if (r6 == 0) goto L_0x005e
            com.alibaba.ability.result.ErrorResult$a$a r5 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r0 = "params invalid"
            com.alibaba.ability.result.ErrorResult r5 = r5.g(r0)
            r6.O(r5)
            tb.xhv r5 = tb.xhv.INSTANCE
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dii.a(java.lang.String, tb.qsc):void");
    }

    public final void b(el2 el2Var, qsc qscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c313980", new Object[]{this, el2Var, qscVar});
            return;
        }
        ckf.g(el2Var, "params");
        AbsBroadcastAbility absBroadcastAbility = this.f17845a;
        if (absBroadcastAbility != null) {
            xq a2 = zhi.Companion.a();
            if (qscVar == null) {
                qscVar = new lii();
            }
            absBroadcastAbility.addEventListener(a2, el2Var, qscVar);
        } else if (qscVar != null) {
            qscVar.O(a.a(Companion));
        }
    }

    public final void d(ll2 ll2Var, msc mscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c9a781", new Object[]{this, ll2Var, mscVar});
            return;
        }
        ckf.g(ll2Var, "params");
        AbsBroadcastAbility absBroadcastAbility = this.f17845a;
        if (absBroadcastAbility != null) {
            xq a2 = zhi.Companion.a();
            if (mscVar == null) {
                mscVar = new yhi();
            }
            absBroadcastAbility.dispatchEvent(a2, ll2Var, mscVar);
        } else if (mscVar != null) {
            mscVar.O(a.a(Companion));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r5, tb.msc r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dii.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "a6b8d8dd"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.lang.String r0 = "eventName"
            tb.ckf.g(r5, r0)
            tb.vl2$a r0 = tb.vl2.Companion
            tb.vl2 r5 = r0.a(r5)
            if (r5 == 0) goto L_0x004e
            com.taobao.android.abilityidl.ability.AbsBroadcastAbility r0 = r4.f17845a
            if (r0 == 0) goto L_0x003e
            tb.zhi$a r1 = tb.zhi.Companion
            tb.xq r1 = r1.a()
            if (r6 == 0) goto L_0x0033
            r2 = r6
            goto L_0x0038
        L_0x0033:
            tb.yhi r2 = new tb.yhi
            r2.<init>()
        L_0x0038:
            r0.removeEventListener(r1, r5, r2)
        L_0x003b:
            tb.xhv r5 = tb.xhv.INSTANCE
            goto L_0x004b
        L_0x003e:
            if (r6 == 0) goto L_0x004a
            tb.dii$a r5 = tb.dii.Companion
            com.alibaba.ability.result.ErrorResult r5 = tb.dii.a.a(r5)
            r6.O(r5)
            goto L_0x003b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            if (r6 == 0) goto L_0x005e
            com.alibaba.ability.result.ErrorResult$a$a r5 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r0 = "params invalid"
            com.alibaba.ability.result.ErrorResult r5 = r5.g(r0)
            r6.O(r5)
            tb.xhv r5 = tb.xhv.INSTANCE
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dii.e(java.lang.String, tb.msc):void");
    }

    public final void f(vl2 vl2Var, msc mscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3c36ad", new Object[]{this, vl2Var, mscVar});
            return;
        }
        ckf.g(vl2Var, "params");
        AbsBroadcastAbility absBroadcastAbility = this.f17845a;
        if (absBroadcastAbility != null) {
            xq a2 = zhi.Companion.a();
            if (mscVar == null) {
                mscVar = new yhi();
            }
            absBroadcastAbility.removeEventListener(a2, vl2Var, mscVar);
        } else if (mscVar != null) {
            mscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ dii(AbsBroadcastAbility absBroadcastAbility, a07 a07Var) {
        this(absBroadcastAbility);
    }
}
