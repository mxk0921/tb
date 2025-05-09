package com.taobao.search.sf.newsearch.widgets;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.sf.newsearch.widgets.NSSceneHeaderWeexWidget;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget;
import tb.a07;
import tb.acx;
import tb.af8;
import tb.auc;
import tb.bsh;
import tb.ckf;
import tb.h19;
import tb.hml;
import tb.iml;
import tb.jml;
import tb.kml;
import tb.kr1;
import tb.nde;
import tb.o02;
import tb.o4p;
import tb.p1p;
import tb.qrl;
import tb.slo;
import tb.t2o;
import tb.ude;
import tb.vfw;
import tb.xhj;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class NSSceneHeaderWeexWidget extends SearchSceneEnhancedWeexModWidget implements auc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public boolean P;
    public int Q = -1;
    public int R;
    public int S;
    public Integer T;
    public Integer U;
    public Integer V;
    public af8 W;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class NSSceneHeaderContainer extends SearchSceneEnhancedWeexModWidget.SceneHeaderContainer implements NestedScrollingParent2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean intercepted;
        private int mAccY;
        public final /* synthetic */ NSSceneHeaderWeexWidget this$0;

        static {
            t2o.a(815793442);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NSSceneHeaderContainer(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget, Context context) {
            super(context);
            ckf.g(context, "context");
            this.this$0 = nSSceneHeaderWeexWidget;
            ViewCompat.setNestedScrollingEnabled(this, true);
        }

        public static /* synthetic */ Object ipc$super(NSSceneHeaderContainer nSSceneHeaderContainer, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1533054272) {
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            }
            if (hashCode == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode == 2114251219) {
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/newsearch/widgets/NSSceneHeaderWeexWidget$NSSceneHeaderContainer");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "ev");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (NSSceneHeaderWeexWidget.e(this.this$0) || xhj.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), this)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.intercepted = true;
                }
                if (!NSSceneHeaderWeexWidget.d(this.this$0) && NSSceneHeaderWeexWidget.e(this.this$0)) {
                    af8 m3 = NSSceneHeaderWeexWidget.m3(this.this$0);
                    if (m3 != null) {
                        af8.x(m3, false, 1, null);
                    }
                    this.this$0.postScopeEvent(iml.a("clickCoverExpand"), "childPageWidget");
                }
            } else if (actionMasked == 1 && this.intercepted) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget.SceneHeaderContainer, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "ev");
            View.OnTouchListener onTouchListener = this.mInterceptTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    af8 m3 = NSSceneHeaderWeexWidget.m3(this.this$0);
                    if (m3 != null) {
                        NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget = this.this$0;
                        if (this.mHideSceneLayer && !this.mSkipIntercept) {
                            m3.y();
                            nSSceneHeaderWeexWidget.postScopeEvent(kml.a("fromWeex"), "childPageWidget");
                            this.mHideSceneLayer = false;
                            return true;
                        }
                    }
                } else if (actionMasked == 2) {
                    int y = (int) (motionEvent.getY() - this.mDownY);
                    if (y >= 0 || Math.abs(y) <= SearchSceneEnhancedWeexModWidget.HIDDEN_THRESHOLD) {
                        z = false;
                    }
                    this.mHideSceneLayer = z;
                }
                return originInterceptTouch(motionEvent);
            }
            this.mSkipIntercept = false;
            this.mHideSceneLayer = false;
            this.mDownY = (int) motionEvent.getY();
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedFling(View view, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            ckf.g(view, "target");
            return super.onNestedFling(view, f, f2, z);
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
            }
            ckf.g(view, "target");
            return super.onNestedPreFling(view, f, f2);
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
                return;
            }
            ckf.g(view, "target");
            ckf.g(iArr, "consumed");
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
                return;
            }
            ckf.g(view, "child");
            ckf.g(view2, "target");
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onStopNestedScroll(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
                return;
            }
            ckf.g(view, "target");
            if (i == 0) {
                this.mAccY = 0;
                if (this.mHideSceneLayer && !this.mSkipIntercept) {
                    af8 m3 = NSSceneHeaderWeexWidget.m3(this.this$0);
                    if (m3 != null) {
                        m3.y();
                    }
                    this.this$0.postScopeEvent(kml.a("fromWeex"), "childPageWidget");
                }
                this.mHideSceneLayer = false;
            }
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                return;
            }
            ckf.g(view, "target");
            if (i5 == 0) {
                this.mAccY += i4;
                if (i4 == 0 && i2 < 0) {
                    this.mAccY = 0;
                }
                int i6 = this.mAccY;
                if (i6 <= 0 || Math.abs(i6) <= SearchSceneEnhancedWeexModWidget.HIDDEN_THRESHOLD) {
                    z = false;
                }
                this.mHideSceneLayer = z;
            } else if (o4p.T1() && i2 == 0 && i4 > 0 && (view instanceof RecyclerView)) {
                ((RecyclerView) view).stopScroll();
            }
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
            }
            ckf.g(view, "child");
            ckf.g(view2, "target");
            return i == 2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793441);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793440);
        t2o.a(993001866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSSceneHeaderWeexWidget(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
    }

    public static final /* synthetic */ boolean d(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2efd136", new Object[]{nSSceneHeaderWeexWidget})).booleanValue();
        }
        return nSSceneHeaderWeexWidget.D;
    }

    public static final /* synthetic */ boolean e(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("743ba02f", new Object[]{nSSceneHeaderWeexWidget})).booleanValue();
        }
        return nSSceneHeaderWeexWidget.B;
    }

    public static final void g(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc6cc9d", new Object[]{nSSceneHeaderWeexWidget, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(nSSceneHeaderWeexWidget, "this$0");
        af8 af8Var = nSSceneHeaderWeexWidget.W;
        if (af8Var != null) {
            af8Var.u(nSSceneHeaderWeexWidget.e3() - ((nSSceneHeaderWeexWidget.S - i) + i2));
        }
    }

    public static /* synthetic */ Object ipc$super(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1849801422:
                super.i3();
                return null;
            case -658989337:
                super.onEventMainThread((jml) objArr[0]);
                return null;
            case 283416391:
                super.j3();
                return null;
            case 1021735943:
                super.bindWithData((WeexBean) objArr[0]);
                return null;
            case 2122179860:
                super.D2();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/widgets/NSSceneHeaderWeexWidget");
        }
    }

    public static final /* synthetic */ af8 m3(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (af8) ipChange.ipc$dispatch("d4969a95", new Object[]{nSSceneHeaderWeexWidget});
        }
        return nSSceneHeaderWeexWidget.W;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.b7x
    public void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        } else if (this.Q <= 0) {
            super.D2();
        }
    }

    @Override // tb.m6p
    public String J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf806360", new Object[]{this});
        }
        return null;
    }

    @Override // tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        b3();
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null && z) {
            frameLayout.setAlpha(f);
            postEvent(hml.a((int) ((1.0f - f) * frameLayout.getMeasuredHeight())));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.smd
    public Integer W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4246d547", new Object[]{this});
        }
        return this.V;
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
        } else {
            S0();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public SearchSceneEnhancedWeexModWidget.SceneHeaderContainer a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchSceneEnhancedWeexModWidget.SceneHeaderContainer) ipChange.ipc$dispatch("a6bb4c04", new Object[]{this});
        }
        Activity activity = getActivity();
        ckf.f(activity, "getActivity(...)");
        return new NSSceneHeaderContainer(this, activity);
    }

    @Override // tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        } else {
            this.R = i;
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public int e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue();
        }
        nde root = getRoot();
        ckf.f(root, "getRoot(...)");
        if (!(root instanceof bsh)) {
            return 0;
        }
        ROOT_VIEW view = ((bsh) root).getView();
        ckf.d(view);
        return ((FrameLayout) view).getMeasuredHeight();
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        if (this.P) {
            return p1p.a(10.0f);
        }
        return 0;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.smd
    public Integer f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2027a5aa", new Object[]{this});
        }
        return this.U;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.smd
    public int g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e18dc9c", new Object[]{this})).intValue();
        }
        if (getView() == 0) {
            return 0;
        }
        ROOT_VIEW view = getView();
        ckf.d(view);
        return ((FrameLayout) view).getMeasuredHeight();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void g3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4da7c3a", new Object[]{this, new Integer(i)});
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        if (!this.B) {
            return null;
        }
        af8 af8Var = new af8(getView(), this);
        this.W = af8Var;
        af8Var.D((e3() - this.S) + f());
        af8 af8Var2 = this.W;
        if (af8Var2 != null) {
            af8Var2.C(this);
        }
        af8 af8Var3 = this.W;
        if (af8Var3 != null) {
            af8Var3.B(this.s);
        }
        return this.W;
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
        } else {
            j2();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.smd
    public boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36698c09", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void h3(final int i, final int i2) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352e420d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getView() != 0 && (frameLayout = (FrameLayout) getView()) != null) {
            frameLayout.post(new Runnable() { // from class: tb.aiz
                @Override // java.lang.Runnable
                public final void run() {
                    NSSceneHeaderWeexWidget.g(NSSceneHeaderWeexWidget.this, i2, i);
                }
            });
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.smd
    public Integer i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("209ec8de", new Object[]{this});
        }
        return this.T;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91be4532", new Object[]{this});
            return;
        }
        super.i3();
        af8 af8Var = this.W;
        if (af8Var != null) {
            af8Var.w(false);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e49747", new Object[]{this});
            return;
        }
        super.j3();
        this.r = this.R;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void onEventMainThread(jml jmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b89ee7", new Object[]{this, jmlVar});
            return;
        }
        ckf.g(jmlVar, "event");
        super.onEventMainThread(jmlVar);
        af8 af8Var = this.W;
        if (af8Var != null) {
            af8Var.A();
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return h2();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.m6p, tb.b7x
    /* renamed from: q2 */
    public void bindWithData(WeexBean weexBean) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce67407", new Object[]{this, weexBean});
            return;
        }
        q3(weexBean);
        super.bindWithData(weexBean);
        if (!this.B && (frameLayout = (FrameLayout) getView()) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.S;
        }
    }

    public final void q3(WeexBean weexBean) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bb803f", new Object[]{this, weexBean});
        } else if (getView() != 0 && weexBean != null) {
            JSONObject jSONObject = weexBean.model;
            ckf.f(jSONObject, "model");
            JSONObject d = h19.d(jSONObject, "style");
            if (d != null) {
                this.P = TextUtils.equals(d.getString(slo.KEY_IMMERSE_STYLE), slo.VALUE_YES);
                JSONObject jSONObject2 = weexBean.extraStatus;
                ckf.f(jSONObject2, XslMUSComponent.KEY_EXTRA_STATUS);
                jSONObject2.put((JSONObject) slo.KEY_IMMERSE_STYLE, String.valueOf(this.P));
                this.U = qrl.c(d.getString("tabTextSelectedColor"), null);
                this.T = qrl.c(d.getString("tabTextNormalColor"), null);
                this.V = Integer.valueOf(SFPromotionBean.b(d.getString("statusBarStyle")));
                String string = d.getString("width");
                String string2 = d.getString("height");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    int e = qrl.e(string, -1);
                    int e2 = qrl.e(string2, -1);
                    if (e <= 0 || e2 <= 0) {
                        e = (int) qrl.d(string, -1.0f);
                        e2 = (int) qrl.d(string2, -1.0f);
                        if (e <= 0 || e2 <= 0) {
                            return;
                        }
                    }
                    this.Q = (int) (((e2 * 1.0f) * zuo.e()) / e);
                    boolean z = this.P;
                    int i2 = z ? this.R : 0;
                    if (z) {
                        i = f();
                    }
                    this.S = i2 + this.Q + i;
                }
            }
        }
    }
}
