package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsToastAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hji {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsToastAbility f20683a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337713);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("fdd42eba", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final hji b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hji) ipChange.ipc$dispatch("381ca77", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "toast", null, 2, null);
                if (!(d instanceof AbsToastAbility)) {
                    d = null;
                }
                return new hji((AbsToastAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaToast", "create internal ability error: " + th.getMessage());
                return new hji(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "toast", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337712);
    }

    public hji(AbsToastAbility absToastAbility) {
        this.f20683a = absToastAbility;
    }

    @JvmStatic
    public static final hji a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hji) ipChange.ipc$dispatch("381ca77", new Object[0]);
        }
        return Companion.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r5, tb.msc r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hji.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "64f1aa4a"
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
            java.lang.String r0 = "content"
            tb.ckf.g(r5, r0)
            tb.g0u$a r0 = tb.g0u.Companion
            tb.g0u r5 = r0.a(r5)
            if (r5 == 0) goto L_0x004e
            com.taobao.android.abilityidl.ability.AbsToastAbility r0 = r4.f20683a
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
            r0.show(r1, r5, r2)
        L_0x003b:
            tb.xhv r5 = tb.xhv.INSTANCE
            goto L_0x004b
        L_0x003e:
            if (r6 == 0) goto L_0x004a
            tb.hji$a r5 = tb.hji.Companion
            com.alibaba.ability.result.ErrorResult r5 = tb.hji.a.a(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: tb.hji.b(java.lang.String, tb.msc):void");
    }

    public final void c(g0u g0uVar, msc mscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3f1bab", new Object[]{this, g0uVar, mscVar});
            return;
        }
        ckf.g(g0uVar, "params");
        AbsToastAbility absToastAbility = this.f20683a;
        if (absToastAbility != null) {
            xq a2 = zhi.Companion.a();
            if (mscVar == null) {
                mscVar = new yhi();
            }
            absToastAbility.show(a2, g0uVar, mscVar);
        } else if (mscVar != null) {
            mscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ hji(AbsToastAbility absToastAbility, a07 a07Var) {
        this(absToastAbility);
    }
}
