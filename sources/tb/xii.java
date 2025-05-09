package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsMEMKVStorageAbility f31410a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337708);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("54d6f500", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final xii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xii) ipChange.ipc$dispatch("b3a8f65d", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "MEMKVStorage", null, 2, null);
                if (!(d instanceof AbsMEMKVStorageAbility)) {
                    d = null;
                }
                return new xii((AbsMEMKVStorageAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaMEMKVStorage", "create internal ability error: " + th.getMessage());
                return new xii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "MEMKVStorage", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337707);
    }

    public xii(AbsMEMKVStorageAbility absMEMKVStorageAbility) {
        this.f31410a = absMEMKVStorageAbility;
    }

    @JvmStatic
    public static final xii a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xii) ipChange.ipc$dispatch("b3a8f65d", new Object[0]);
        }
        return Companion.b();
    }

    public final tao<String, ErrorResult> b(String str) {
        tao<String, ErrorResult> item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("695dfae2", new Object[]{this, str});
        }
        ckf.g(str, "key");
        soh a2 = soh.Companion.a(str);
        if (a2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("params invalid"));
        }
        AbsMEMKVStorageAbility absMEMKVStorageAbility = this.f31410a;
        return (absMEMKVStorageAbility == null || (item = absMEMKVStorageAbility.getItem(zhi.Companion.a(), a2)) == null) ? new tao<>(null, a.a(Companion)) : item;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r5, tb.msc r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xii.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "50b7d150"
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
            java.lang.String r0 = "key"
            tb.ckf.g(r5, r0)
            tb.soh$a r0 = tb.soh.Companion
            tb.soh r5 = r0.a(r5)
            if (r5 == 0) goto L_0x004f
            com.taobao.android.abilityidl.ability.AbsMEMKVStorageAbility r0 = r4.f31410a
            if (r0 == 0) goto L_0x003f
            tb.zhi$a r1 = tb.zhi.Companion
            tb.xq r1 = r1.a()
            if (r6 == 0) goto L_0x0034
            r2 = r6
            goto L_0x0039
        L_0x0034:
            tb.yhi r2 = new tb.yhi
            r2.<init>()
        L_0x0039:
            r0.removeItem(r1, r5, r2)
        L_0x003c:
            tb.xhv r5 = tb.xhv.INSTANCE
            goto L_0x004c
        L_0x003f:
            if (r6 == 0) goto L_0x004b
            tb.xii$a r5 = tb.xii.Companion
            com.alibaba.ability.result.ErrorResult r5 = tb.xii.a.a(r5)
            r6.O(r5)
            goto L_0x003c
        L_0x004b:
            r5 = 0
        L_0x004c:
            if (r5 == 0) goto L_0x004f
            goto L_0x005f
        L_0x004f:
            if (r6 == 0) goto L_0x005f
            com.alibaba.ability.result.ErrorResult$a$a r5 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r0 = "params invalid"
            com.alibaba.ability.result.ErrorResult r5 = r5.g(r0)
            r6.O(r5)
            tb.xhv r5 = tb.xhv.INSTANCE
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xii.c(java.lang.String, tb.msc):void");
    }

    public final void d(toh tohVar, msc mscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287aced0", new Object[]{this, tohVar, mscVar});
            return;
        }
        ckf.g(tohVar, "params");
        AbsMEMKVStorageAbility absMEMKVStorageAbility = this.f31410a;
        if (absMEMKVStorageAbility != null) {
            xq a2 = zhi.Companion.a();
            if (mscVar == null) {
                mscVar = new yhi();
            }
            absMEMKVStorageAbility.setItem(a2, tohVar, mscVar);
        } else if (mscVar != null) {
            mscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ xii(AbsMEMKVStorageAbility absMEMKVStorageAbility, a07 a07Var) {
        this(absMEMKVStorageAbility);
    }
}
