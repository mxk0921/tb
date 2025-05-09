package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFavoriteAbility;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oii {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AbsFavoriteAbility f25408a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337694);
        }

        public a() {
        }

        public static final /* synthetic */ ErrorResult a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("92a83441", new Object[]{aVar});
            }
            return aVar.c();
        }

        @JvmStatic
        public final oii b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oii) ipChange.ipc$dispatch("a2e37bbc", new Object[]{this});
            }
            try {
                Object d = yii.d(yii.INSTANCE, "Favorite", null, 2, null);
                if (!(d instanceof AbsFavoriteAbility)) {
                    d = null;
                }
                return new oii((AbsFavoriteAbility) d, null);
            } catch (Throwable th) {
                iih.INSTANCE.a("MegaFavorite", "create internal ability error: " + th.getMessage());
                return new oii(null, null);
            }
        }

        public final ErrorResult c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("21b1e117", new Object[]{this});
            }
            return new ErrorResult("500", "internal ability is null, please check if the class '" + yii.b(yii.INSTANCE, "Favorite", null, 2, null) + "' exists", (Map) null, 4, (a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337693);
    }

    public oii(AbsFavoriteAbility absFavoriteAbility) {
        this.f25408a = absFavoriteAbility;
    }

    @JvmStatic
    public static final oii c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oii) ipChange.ipc$dispatch("a2e37bbc", new Object[0]);
        }
        return Companion.b();
    }

    public final void a(g39 g39Var, hky hkyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465d433e", new Object[]{this, g39Var, hkyVar});
            return;
        }
        ckf.g(g39Var, "params");
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        if (absFavoriteAbility != null) {
            xq a2 = zhi.Companion.a();
            if (hkyVar == null) {
                hkyVar = new cny();
            }
            absFavoriteAbility.needShowGuide(a2, g39Var, hkyVar);
        } else if (hkyVar != null) {
            hkyVar.O(a.a(Companion));
        }
    }

    public final void b(h39 h39Var, usc uscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d9d65", new Object[]{this, h39Var, uscVar});
            return;
        }
        ckf.g(h39Var, "params");
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        if (absFavoriteAbility != null) {
            xq a2 = zhi.Companion.a();
            if (uscVar == null) {
                uscVar = new pii();
            }
            absFavoriteAbility.addFavorite(a2, h39Var, uscVar);
        } else if (uscVar != null) {
            uscVar.O(a.a(Companion));
        }
    }

    public final tao<String, ErrorResult> d(h39 h39Var) {
        tao<String, ErrorResult> favoriteCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d8378546", new Object[]{this, h39Var});
        }
        ckf.g(h39Var, "params");
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        return (absFavoriteAbility == null || (favoriteCount = absFavoriteAbility.getFavoriteCount(zhi.Companion.a(), h39Var)) == null) ? new tao<>(null, a.a(Companion)) : favoriteCount;
    }

    public final tao<String, ErrorResult> e(String str, String str2, String str3, String str4) {
        tao<String, ErrorResult> favoriteCountWithDefaultCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("7e3c9aa8", new Object[]{this, str, str2, str3, str4});
        }
        ckf.g(str, "bizCode");
        ckf.g(str2, "id");
        ckf.g(str3, "defaultCount");
        ckf.g(str4, "type");
        f39 a2 = f39.Companion.a(str, str2, str3, str4);
        if (a2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("params invalid"));
        }
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        return (absFavoriteAbility == null || (favoriteCountWithDefaultCount = absFavoriteAbility.getFavoriteCountWithDefaultCount(zhi.Companion.a(), a2)) == null) ? new tao<>(null, a.a(Companion)) : favoriteCountWithDefaultCount;
    }

    public final tao<String, ErrorResult> f(f39 f39Var) {
        tao<String, ErrorResult> favoriteCountWithDefaultCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("f465f4cf", new Object[]{this, f39Var});
        }
        ckf.g(f39Var, "params");
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        return (absFavoriteAbility == null || (favoriteCountWithDefaultCount = absFavoriteAbility.getFavoriteCountWithDefaultCount(zhi.Companion.a(), f39Var)) == null) ? new tao<>(null, a.a(Companion)) : favoriteCountWithDefaultCount;
    }

    public final tao<Boolean, ErrorResult> g(String str, String str2) {
        tao<Boolean, ErrorResult> favoriteStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("2e1fbc07", new Object[]{this, str, str2});
        }
        ckf.g(str, "id");
        ckf.g(str2, "type");
        h39 a2 = h39.Companion.a(str, str2);
        if (a2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("params invalid"));
        }
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        return (absFavoriteAbility == null || (favoriteStatus = absFavoriteAbility.getFavoriteStatus(zhi.Companion.a(), a2)) == null) ? new tao<>(null, a.a(Companion)) : favoriteStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r5, java.lang.String r6, tb.usc r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oii.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "37f417e8"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r5 = 3
            r2[r5] = r7
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = "id"
            tb.ckf.g(r5, r0)
            java.lang.String r0 = "type"
            tb.ckf.g(r6, r0)
            tb.h39$a r0 = tb.h39.Companion
            tb.h39 r5 = r0.a(r5, r6)
            if (r5 == 0) goto L_0x0058
            com.taobao.android.abilityidl.ability.AbsFavoriteAbility r6 = r4.f25408a
            if (r6 == 0) goto L_0x0048
            tb.zhi$a r0 = tb.zhi.Companion
            tb.xq r0 = r0.a()
            if (r7 == 0) goto L_0x003d
            r1 = r7
            goto L_0x0042
        L_0x003d:
            tb.pii r1 = new tb.pii
            r1.<init>()
        L_0x0042:
            r6.removeFavorite(r0, r5, r1)
        L_0x0045:
            tb.xhv r5 = tb.xhv.INSTANCE
            goto L_0x0055
        L_0x0048:
            if (r7 == 0) goto L_0x0054
            tb.oii$a r5 = tb.oii.Companion
            com.alibaba.ability.result.ErrorResult r5 = tb.oii.a.a(r5)
            r7.O(r5)
            goto L_0x0045
        L_0x0054:
            r5 = 0
        L_0x0055:
            if (r5 == 0) goto L_0x0058
            goto L_0x0068
        L_0x0058:
            if (r7 == 0) goto L_0x0068
            com.alibaba.ability.result.ErrorResult$a$a r5 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r6 = "params invalid"
            com.alibaba.ability.result.ErrorResult r5 = r5.g(r6)
            r7.O(r5)
            tb.xhv r5 = tb.xhv.INSTANCE
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oii.h(java.lang.String, java.lang.String, tb.usc):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r5, java.lang.String r6, tb.usc r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.oii.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "bf6f346b"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r5 = 3
            r2[r5] = r7
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = "id"
            tb.ckf.g(r5, r0)
            java.lang.String r0 = "type"
            tb.ckf.g(r6, r0)
            tb.h39$a r0 = tb.h39.Companion
            tb.h39 r5 = r0.a(r5, r6)
            if (r5 == 0) goto L_0x0058
            com.taobao.android.abilityidl.ability.AbsFavoriteAbility r6 = r4.f25408a
            if (r6 == 0) goto L_0x0048
            tb.zhi$a r0 = tb.zhi.Companion
            tb.xq r0 = r0.a()
            if (r7 == 0) goto L_0x003d
            r1 = r7
            goto L_0x0042
        L_0x003d:
            tb.pii r1 = new tb.pii
            r1.<init>()
        L_0x0042:
            r6.requestFavoriteStatus(r0, r5, r1)
        L_0x0045:
            tb.xhv r5 = tb.xhv.INSTANCE
            goto L_0x0055
        L_0x0048:
            if (r7 == 0) goto L_0x0054
            tb.oii$a r5 = tb.oii.Companion
            com.alibaba.ability.result.ErrorResult r5 = tb.oii.a.a(r5)
            r7.O(r5)
            goto L_0x0045
        L_0x0054:
            r5 = 0
        L_0x0055:
            if (r5 == 0) goto L_0x0058
            goto L_0x0068
        L_0x0058:
            if (r7 == 0) goto L_0x0068
            com.alibaba.ability.result.ErrorResult$a$a r5 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r6 = "params invalid"
            com.alibaba.ability.result.ErrorResult r5 = r5.g(r6)
            r7.O(r5)
            tb.xhv r5 = tb.xhv.INSTANCE
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oii.i(java.lang.String, java.lang.String, tb.usc):void");
    }

    public final void j(h39 h39Var, usc uscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959d3448", new Object[]{this, h39Var, uscVar});
            return;
        }
        ckf.g(h39Var, "params");
        AbsFavoriteAbility absFavoriteAbility = this.f25408a;
        if (absFavoriteAbility != null) {
            xq a2 = zhi.Companion.a();
            if (uscVar == null) {
                uscVar = new pii();
            }
            absFavoriteAbility.removeFavorite(a2, h39Var, uscVar);
        } else if (uscVar != null) {
            uscVar.O(a.a(Companion));
        }
    }

    public /* synthetic */ oii(AbsFavoriteAbility absFavoriteAbility, a07 a07Var) {
        this(absFavoriteAbility);
    }
}
