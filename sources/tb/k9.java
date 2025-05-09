package tb;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import java.lang.ref.WeakReference;
import tb.h9;
import tb.hab;
import tb.n9;
import tb.u3g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class k9<PARAMS extends h9, CONTEXT extends n9> extends AKBasePopPresenter<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View k;
    public u3g l;
    public boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements u3g.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f22483a;
        public final /* synthetic */ View c;
        public final /* synthetic */ h9 d;
        public final /* synthetic */ hab.a e;

        public a(View view, h9 h9Var, hab.a aVar) {
            this.c = view;
            this.d = h9Var;
            this.e = aVar;
        }

        @Override // tb.u3g.d
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
            }
            ckf.g(keyEvent, "e");
            if (keyEvent.getKeyCode() != 4) {
                return false;
            }
            if (keyEvent.getAction() == 0) {
                this.f22483a = true;
                return true;
            } else if (!this.f22483a || keyEvent.getAction() != 1) {
                return true;
            } else {
                if (this.d.f20479a.F()) {
                    this.e.a(null);
                    return true;
                }
                k9.this.a(null, true);
                return true;
            }
        }
    }

    static {
        t2o.a(336593004);
    }

    public static /* synthetic */ Object ipc$super(k9 k9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/presenter/AKPopViewPresenter");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (tb.ckf.b((r3 == null || (r3 = r3.f20479a) == null) ? null : r3.D(), tb.h9.PAD_FULL_SCREEN_DRAWER) != false) goto L_0x0063;
     */
    @Override // com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k() {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.k9.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "92c7c886"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r5
            r1.ipc$dispatch(r2, r0)
            return
        L_0x0012:
            boolean r1 = r5.m
            if (r1 == 0) goto L_0x0017
            return
        L_0x0017:
            boolean r1 = tb.abl.l()
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.taobao.android.abilitykit.ability.pop.render.IAKPopRender r1 = r5.p()
            if (r1 == 0) goto L_0x002a
            java.lang.String r3 = "std_pop_did_close"
            r1.n(r3, r2)
        L_0x002a:
            android.view.View r1 = r5.k
            if (r1 == 0) goto L_0x0063
            tb.h9 r3 = r5.o()
            if (r3 == 0) goto L_0x0052
            boolean r3 = r3.k
            if (r3 != r0) goto L_0x0052
            tb.h9 r3 = r5.o()
            if (r3 == 0) goto L_0x0047
            tb.e9 r3 = r3.f20479a
            if (r3 == 0) goto L_0x0047
            java.lang.String r3 = r3.D()
            goto L_0x0048
        L_0x0047:
            r3 = r2
        L_0x0048:
            java.lang.String r4 = "padFullScreen"
            boolean r3 = tb.ckf.b(r3, r4)
            if (r3 == 0) goto L_0x0052
            goto L_0x0063
        L_0x0052:
            android.view.ViewParent r3 = r1.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0063
            r2.removeView(r1)
        L_0x0063:
            tb.u3g r1 = r5.l
            if (r1 == 0) goto L_0x006a
            r1.c()
        L_0x006a:
            r5.m = r0
            r5.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.k9.k():void");
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter
    public boolean l(PARAMS params, View view, View view2, View view3, hab.a aVar) {
        Window window;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17152025", new Object[]{this, params, view, view2, view3, aVar})).booleanValue();
        }
        ckf.g(params, "params");
        ckf.g(view, "container");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        if (this.m) {
            return false;
        }
        WeakReference<Context> n = n();
        ViewGroup viewGroup = null;
        Context context = n != null ? n.get() : null;
        iih iihVar = iih.INSTANCE;
        StringBuilder sb = new StringBuilder("doShowPresenter ctx : ");
        sb.append(context != null ? context.getClass().getName() : null);
        iihVar.a("stdPopTag", sb.toString());
        boolean z = context instanceof Activity;
        if (!z) {
            IAKPopRender<PARAMS, CONTEXT> p = p();
            if (p != null) {
                str = p.getClass().getSimpleName();
            } else {
                str = "";
            }
            z71.e(new n8(str, params.b()), new a8(90001, "Ctx Not Activity"));
        }
        if (!z) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return false;
        }
        this.k = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float f = 0;
        if (params.f20479a.a0() > f) {
            marginLayoutParams.topMargin = ywo.a(activity, params.f20479a.a0());
        }
        if (params.f20479a.z() > f) {
            marginLayoutParams.bottomMargin = ywo.a(activity, params.f20479a.z());
        }
        if (params.f20479a.P() > f) {
            marginLayoutParams.leftMargin = ywo.a(activity, params.f20479a.P());
        }
        if (params.f20479a.W() > f) {
            marginLayoutParams.rightMargin = ywo.a(activity, params.f20479a.W());
        }
        if (ckf.b(params.f20479a.u(), "activity")) {
            activity.setContentView(view, marginLayoutParams);
        } else if (params.f20479a.V() != -1) {
            View findViewById = activity.findViewById(params.f20479a.V());
            if (findViewById instanceof ViewGroup) {
                viewGroup = findViewById;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.addView(view, marginLayoutParams);
            } else {
                iihVar.a("stdPopTag", "can't findViewById : " + params.f20479a.V());
            }
        } else {
            activity.addContentView(view, marginLayoutParams);
        }
        if (!params.f20479a.I()) {
            return true;
        }
        Activity parent = activity.getParent();
        if (parent == null || (window = parent.getWindow()) == null) {
            window = activity.getWindow();
        }
        ckf.f(window, pg1.ATOM_EXT_window);
        u3g u3gVar = new u3g(window, new a(view, params, aVar));
        u3gVar.b();
        xhv xhvVar = xhv.INSTANCE;
        this.l = u3gVar;
        return true;
    }
}
