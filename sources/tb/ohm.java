package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.AnimationModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.PopCloseBtnModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.oe8;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ohm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RENDER_MODE_INIT = 0;
    public static final int RENDER_MODE_REFRESH = 3;
    public static final int RENDER_MODE_RERENDER = 2;
    public static final int RENDER_MODE_SWITCH = 1;

    /* renamed from: a  reason: collision with root package name */
    public final jlj f25397a;
    public FrameLayout b;
    public FrameLayout c;
    public RelativeLayout d;
    public View e;
    public View f;
    public final List<ubm> g = new CopyOnWriteArrayList();

    static {
        t2o.a(790626419);
        t2o.a(790626432);
    }

    public ohm(jlj jljVar) {
        this.f25397a = jljVar;
    }

    public static /* synthetic */ void q(oe8 oe8Var, PopCloseBtnModel popCloseBtnModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81911665", new Object[]{oe8Var, popCloseBtnModel});
        } else {
            oe8Var.l(popCloseBtnModel, "click", popCloseBtnModel.action, popCloseBtnModel.actions);
        }
    }

    public static /* synthetic */ void r(oe8 oe8Var, StateBaseModel stateBaseModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300bf235", new Object[]{oe8Var, stateBaseModel});
        } else {
            oe8Var.l(stateBaseModel, "click", stateBaseModel.action, stateBaseModel.actions);
        }
    }

    public static /* synthetic */ boolean s(oe8 oe8Var, StateBaseModel stateBaseModel, View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bcf0ec2", new Object[]{oe8Var, stateBaseModel, view, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            return sfu.b(oe8Var, sfu.TRIGGER_ACTION_KEY_BACK, true, stateBaseModel.triggerActions);
        }
        return false;
    }

    public static /* synthetic */ void z(final oe8 oe8Var, final PopCloseBtnModel popCloseBtnModel, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2279606f", new Object[]{oe8Var, popCloseBtnModel, view, view2});
        } else {
            oe8Var.f().e(oe8Var, "click", popCloseBtnModel.animation, view, popCloseBtnModel, new yam.f() { // from class: tb.lhm
                @Override // tb.yam.f
                public final void onAnimationEnd() {
                    ohm.q(oe8.this, popCloseBtnModel);
                }
            });
        }
    }

    public final /* synthetic */ void B(final oe8 oe8Var, final StateBaseModel stateBaseModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a850c33e", new Object[]{this, oe8Var, stateBaseModel, view});
        } else {
            oe8Var.f().e(oe8Var, "click", stateBaseModel.animation, this.e, stateBaseModel, new yam.f() { // from class: tb.nhm
                @Override // tb.yam.f
                public final void onAnimationEnd() {
                    ohm.r(oe8.this, stateBaseModel);
                }
            });
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.l();
            }
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.m();
            }
        }
    }

    public void G(final oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e733cf0c", new Object[]{this, bVar});
            return;
        }
        try {
            final int size = ((CopyOnWriteArrayList) this.g).size() + 1;
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            M(new oe8.b() { // from class: tb.ahm
                @Override // tb.oe8.b
                public final void a(boolean z) {
                    ohm.this.t(size, atomicInteger, bVar, z);
                }
            });
            Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
            while (it.hasNext()) {
                ubm ubmVar = (ubm) it.next();
                if (ubmVar != null) {
                    ubmVar.q(new oe8.b() { // from class: tb.bhm
                        @Override // tb.oe8.b
                        public final void a(boolean z) {
                            ohm.this.u(size, atomicInteger, bVar, z);
                        }
                    });
                } else {
                    I(size, atomicInteger, bVar);
                }
            }
        } catch (Throwable th) {
            wdm.h("PopStateManager.onClosed.error", th);
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    public boolean H(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d42ba2", new Object[]{this, str, str2})).booleanValue();
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null && ubmVar.n(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final void J(oe8 oe8Var, View view, final ComponentBaseModel componentBaseModel, List<AnimationModel> list, final int i, final AtomicInteger atomicInteger, final oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd58a1", new Object[]{this, oe8Var, view, componentBaseModel, list, new Integer(i), atomicInteger, bVar});
        } else if (view == null || componentBaseModel == null || list == null) {
            I(i, atomicInteger, bVar);
        } else {
            oe8Var.f().e(oe8Var, "close", list, view, componentBaseModel, new yam.f() { // from class: tb.ehm
                @Override // tb.yam.f
                public final void onAnimationEnd() {
                    ohm.this.v(componentBaseModel, i, atomicInteger, bVar);
                }
            });
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
            return;
        }
        if (!this.f25397a.S()) {
            T();
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.o();
            }
        }
    }

    public void M(oe8.b bVar) {
        List<AnimationModel> list;
        List<AnimationModel> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d9ccc3", new Object[]{this, bVar});
            return;
        }
        oe8 J = this.f25397a.J();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        StateBaseModel f = J.j().f();
        View view = this.e;
        if (f != null) {
            list = f.animation;
        } else {
            list = null;
        }
        J(J, view, f, list, 2, atomicInteger, bVar);
        RelativeLayout relativeLayout = this.d;
        if (f != null) {
            list2 = f.pageAnimation;
        } else {
            list2 = null;
        }
        J(J, relativeLayout, f, list2, 2, atomicInteger, bVar);
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf9c8d0", new Object[]{this});
            return;
        }
        T();
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.r();
            }
        }
    }

    public void O(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ef08c9", new Object[]{this, str, jSONObject});
        } else if (rgm.PAGE_EVENT_NAME.equals(str)) {
            oe8 J = this.f25397a.J();
            StateBaseModel f = J.j().f();
            PopCloseBtnModel g = J.j().g();
            gk8.a(J, f, jSONObject);
            if (f != null) {
                J.f().h(J, jSONObject, f, this.e);
            }
            if (g != null) {
                J.f().h(J, jSONObject, g, this.f);
            }
            Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
            while (it.hasNext()) {
                ubm ubmVar = (ubm) it.next();
                if (ubmVar != null) {
                    ubmVar.s(str, jSONObject);
                }
            }
            J.f().n(jSONObject);
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24202be5", new Object[]{this});
            return;
        }
        T();
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.t();
            }
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce3d8c3", new Object[]{this});
        }
    }

    public final void S(StateModel stateModel, StateVersionModel stateVersionModel, FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        View e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c661c6c", new Object[]{this, stateModel, stateVersionModel, frameLayout, frameLayout2, new Integer(i)});
            return;
        }
        final StateModel stateModel2 = stateVersionModel != 0 ? stateVersionModel : stateModel;
        final oe8 J = this.f25397a.J();
        this.e = frameLayout;
        me8 j = J.j();
        j.Q(stateModel);
        j.S(stateVersionModel);
        j.N(stateModel2);
        if (i == 1) {
            j.I();
        }
        if (i == 3) {
            j.H();
        }
        List<JSONObject> arrayList = new ArrayList(stateModel2.children);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Collections.sort(arrayList, new Comparator() { // from class: tb.fhm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int y;
                y = ohm.y(atomicBoolean, (JSONObject) obj, (JSONObject) obj2);
                return y;
            }
        });
        if (!atomicBoolean.get()) {
            arrayList = stateModel2.children;
        }
        if (i == 0) {
            this.f25397a.t0(plj.f(J, arrayList, true));
        }
        final PopCloseBtnModel popCloseBtnModel = null;
        for (JSONObject jSONObject : arrayList) {
            String string = jSONObject.getString("type");
            if (!Boolean.FALSE.equals(jSONObject.getBoolean("vConditionResult"))) {
                if (vbm.TYPE_CLOSE_BTN.equals(string)) {
                    popCloseBtnModel = (PopCloseBtnModel) jSONObject.toJavaObject(PopCloseBtnModel.class);
                } else {
                    ubm a2 = vbm.a(jSONObject, J, false, false);
                    if (!(a2 == null || (e = a2.e()) == null)) {
                        frameLayout.addView(e);
                        ((CopyOnWriteArrayList) this.g).add(a2);
                    }
                }
            }
        }
        if (((CopyOnWriteArrayList) this.g).isEmpty()) {
            J.s("StateNoUiContent", "");
            return;
        }
        Context e2 = J.j().e();
        jl1 g = J.g();
        boolean equals = "center".equals(stateModel2.layout);
        boolean equals2 = "fullscreen".equals(stateModel2.layout);
        if (popCloseBtnModel != null) {
            rbm rbmVar = new rbm(J, popCloseBtnModel);
            final View e3 = rbmVar.e();
            ((CopyOnWriteArrayList) this.g).add(rbmVar);
            StyleModel styleModel = popCloseBtnModel.style;
            int h = plj.h(J, styleModel.width);
            int h2 = plj.h(J, styleModel.height);
            if (equals) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h, h2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.leftMargin = layoutParams2.leftMargin;
                int i2 = (layoutParams2.height / 2) + (h2 / 2);
                int i3 = popCloseBtnModel.belowStateMargin;
                layoutParams.topMargin = i2 + (i3 > 0 ? (int) g.c(e2, i3) : 0) + layoutParams2.topMargin;
                frameLayout2.addView(e3, layoutParams);
            } else if (equals2) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(h, h2);
                int i4 = popCloseBtnModel.alignScreenRightMargin;
                layoutParams3.rightMargin = i4 > 0 ? (int) g.c(e2, i4) : 0;
                if (p()) {
                    int i5 = popCloseBtnModel.alignScreenTopMargin;
                    layoutParams3.topMargin = (i5 > 0 ? (int) g.c(e2, i5) : 0) + lyv.g(e2);
                } else {
                    int i6 = popCloseBtnModel.alignScreenTopMargin;
                    layoutParams3.topMargin = i6 > 0 ? (int) g.c(e2, i6) : 0;
                }
                layoutParams3.addRule(10);
                layoutParams3.addRule(11);
                this.d.addView(e3, layoutParams3);
            } else {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(h, h2);
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                int i7 = popCloseBtnModel.alignLeftStateMargin;
                layoutParams4.leftMargin = i7 > 0 ? (int) g.c(e2, i7) : 0;
                int i8 = popCloseBtnModel.belowStateMargin;
                layoutParams4.topMargin = (i8 > 0 ? (int) g.c(e2, i8) : 0) - layoutParams5.bottomMargin;
                int i9 = R.id.poplayer_native_state_id;
                layoutParams4.addRule(5, i9);
                layoutParams4.addRule(3, i9);
                this.d.addView(e3, layoutParams4);
            }
            ViewProxy.setOnClickListener(e3, new View.OnClickListener() { // from class: tb.ghm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ohm.z(oe8.this, popCloseBtnModel, e3, view);
                }
            });
            ViewProxy.setOnLongClickListener(e3, new View.OnLongClickListener() { // from class: tb.hhm
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean A;
                    A = ohm.A(oe8.this, popCloseBtnModel, view);
                    return A;
                }
            });
            this.f = e3;
            j.O(popCloseBtnModel);
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.ihm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ohm.this.B(J, stateModel2, view);
            }
        });
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.jhm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean C;
                C = ohm.C(oe8.this, stateModel2, view);
                return C;
            }
        });
        J.y(new Runnable() { // from class: tb.khm
            @Override // java.lang.Runnable
            public final void run() {
                ohm.this.D(stateModel2, J);
            }
        }, 200L);
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd086fe", new Object[]{this});
            return;
        }
        oe8 J = this.f25397a.J();
        me8 j = J.j();
        StateBaseModel f = j.f();
        PopCloseBtnModel g = j.g();
        if (f != null) {
            J.f().e(J, "expose", f.animation, this.e, f, null);
            J.f().e(J, "expose", f.pageAnimation, this.d, f, null);
        }
        if (g != null) {
            J.f().e(J, "expose", g.animation, this.f, g, null);
        }
    }

    public final RelativeLayout o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("d4f80377", new Object[]{this});
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f25397a.M().c());
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b414cda", new Object[]{this})).booleanValue();
        }
        if (!this.f25397a.M().K().enableFullScreenInImmersive || !lyv.j(this.f25397a.M().c())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e13491", new Object[]{this});
            return;
        }
        try {
            ViewParent parent = this.b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.b);
            }
            this.c.addView(this.b);
            View findViewById = this.c.findViewById(R.id.poplayer_native_state_center_loading_id);
            if (findViewById != null) {
                this.c.removeView(findViewById);
            }
        } catch (Throwable th) {
            wdm.h("PopStateManager.onGradualExpose.error", th);
        }
    }

    public final /* synthetic */ void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ef4c12", new Object[]{this});
            return;
        }
        T();
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.p();
            }
        }
    }

    public static /* synthetic */ boolean A(oe8 oe8Var, PopCloseBtnModel popCloseBtnModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25aab766", new Object[]{oe8Var, popCloseBtnModel, view})).booleanValue();
        }
        oe8Var.l(popCloseBtnModel, "longClick", popCloseBtnModel.action, popCloseBtnModel.actions);
        return true;
    }

    public static /* synthetic */ boolean C(oe8 oe8Var, StateBaseModel stateBaseModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b82bae1", new Object[]{oe8Var, stateBaseModel, view})).booleanValue();
        }
        oe8Var.l(stateBaseModel, "longClick", stateBaseModel.action, stateBaseModel.actions);
        return true;
    }

    public static /* synthetic */ int y(AtomicBoolean atomicBoolean, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6996131", new Object[]{atomicBoolean, jSONObject, jSONObject2})).intValue();
        }
        try {
            return jSONObject.getJSONObject("style").getIntValue(pg1.ATOM_EXT_zIndex) - jSONObject2.getJSONObject("style").getIntValue(pg1.ATOM_EXT_zIndex);
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            return 0;
        }
    }

    public final void I(int i, AtomicInteger atomicInteger, oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b7797a", new Object[]{this, new Integer(i), atomicInteger, bVar});
            return;
        }
        atomicInteger.incrementAndGet();
        wdm.d("onClosed.onComponentPreCloseAnimDone.curCount.get()=" + atomicInteger.get() + ".allCount=" + i, new Object[0]);
        if (atomicInteger.get() == i && bVar != null) {
            bVar.a(false);
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2cee1e", new Object[]{this});
            return;
        }
        wdm.d("onGradualExpose", new Object[0]);
        if (this.c != null && this.b != null) {
            oe8 J = this.f25397a.J();
            J.x(new Runnable() { // from class: tb.chm
                @Override // java.lang.Runnable
                public final void run() {
                    ohm.this.w();
                }
            });
            J.w(new Runnable() { // from class: tb.dhm
                @Override // java.lang.Runnable
                public final void run() {
                    ohm.this.x();
                }
            });
        }
    }

    public final /* synthetic */ void t(int i, AtomicInteger atomicInteger, oe8.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8227f0", new Object[]{this, new Integer(i), atomicInteger, bVar, new Boolean(z)});
            return;
        }
        wdm.d("onClosed.executeAnimate.mStateComponents.done", new Object[0]);
        I(i, atomicInteger, bVar);
    }

    public final /* synthetic */ void u(int i, AtomicInteger atomicInteger, oe8.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23febdb1", new Object[]{this, new Integer(i), atomicInteger, bVar, new Boolean(z)});
            return;
        }
        wdm.d("onClosed.executeAnimate.mCurComponents.Item.done", new Object[0]);
        I(i, atomicInteger, bVar);
    }

    public final /* synthetic */ void v(ComponentBaseModel componentBaseModel, int i, AtomicInteger atomicInteger, oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63098bd9", new Object[]{this, componentBaseModel, new Integer(i), atomicInteger, bVar});
            return;
        }
        wdm.d("onClosed.executeAnimate.Item.done.componentModelId=" + componentBaseModel.id, new Object[0]);
        I(i, atomicInteger, bVar);
    }

    public final /* synthetic */ void D(final StateBaseModel stateBaseModel, final oe8 oe8Var) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b04607", new Object[]{this, stateBaseModel, oe8Var});
            return;
        }
        try {
            if (TextUtils.isEmpty(stateBaseModel.focusComponent) && (view = this.f) != null && view.isAttachedToWindow()) {
                this.f.sendAccessibilityEvent(8);
            }
        } catch (Throwable th) {
            wdm.h("sendAccessibilityEvent.error", th);
        }
        try {
            if (sfu.d(sfu.TRIGGER_ACTION_KEY_BACK, stateBaseModel.triggerActions)) {
                this.d.setFocusable(true);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.d.setDefaultFocusHighlightEnabled(false);
                }
                this.d.requestFocusFromTouch();
                this.d.setOnKeyListener(new View.OnKeyListener() { // from class: tb.mhm
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                        boolean s;
                        s = ohm.s(oe8.this, stateBaseModel, view2, i, keyEvent);
                        return s;
                    }
                });
            }
        } catch (Throwable th2) {
            wdm.h("needHandleTriggerKeyBack.error", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View R(com.taobao.tbpoplayer.nativerender.dsl.StateModel r20, com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel r21, int r22) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ohm.R(com.taobao.tbpoplayer.nativerender.dsl.StateModel, com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel, int):android.view.View");
    }
}
