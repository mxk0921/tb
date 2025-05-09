package com.taobao.search.sf.newsearch.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.newsearch.widgets.NSSceneHeaderMuiseWidget;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.acx;
import tb.af8;
import tb.bsh;
import tb.ckf;
import tb.dvk;
import tb.fw;
import tb.fxh;
import tb.h19;
import tb.hml;
import tb.iml;
import tb.jml;
import tb.kml;
import tb.kr1;
import tb.mnq;
import tb.n5i;
import tb.nde;
import tb.o02;
import tb.o4p;
import tb.p1p;
import tb.qrl;
import tb.slo;
import tb.t2o;
import tb.ude;
import tb.vfw;
import tb.vqc;
import tb.xhj;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class NSSceneHeaderMuiseWidget extends SearchSceneEnhancedMuiseModWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public boolean b0;
    public int c0 = -1;
    public int d0;
    public int e0;
    public af8 f0;
    public Integer g0;
    public Integer h0;
    public Integer i0;
    public int j0;
    public Boolean k0;
    public boolean l0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class NSSceneHeaderContainer extends SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean intercepted;
        private final n5i maskHelper = new n5i(this);
        public final /* synthetic */ NSSceneHeaderMuiseWidget this$0;

        static {
            t2o.a(815793437);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NSSceneHeaderContainer(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, Context context) {
            super(context);
            ckf.g(context, "context");
            this.this$0 = nSSceneHeaderMuiseWidget;
            ViewCompat.setNestedScrollingEnabled(this, true);
        }

        public static /* synthetic */ Object ipc$super(NSSceneHeaderContainer nSSceneHeaderContainer, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1533054272:
                    return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
                case 623593120:
                    super.dispatchDraw((Canvas) objArr[0]);
                    return null;
                case 1389530587:
                    super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                    return null;
                case 2075560917:
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                case 2114251219:
                    return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/widgets/NSSceneHeaderMuiseWidget$NSSceneHeaderContainer");
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
                return;
            }
            ckf.g(canvas, "canvas");
            super.dispatchDraw(canvas);
            this.maskHelper.b(canvas);
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
                if (NSSceneHeaderMuiseWidget.h(this.this$0) || xhj.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), this)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.intercepted = true;
                }
                if (!NSSceneHeaderMuiseWidget.g(this.this$0) && NSSceneHeaderMuiseWidget.h(this.this$0)) {
                    af8 Y3 = NSSceneHeaderMuiseWidget.Y3(this.this$0);
                    if (Y3 != null) {
                        af8.x(Y3, false, 1, null);
                    }
                    this.this$0.postScopeEvent(iml.a("clickCoverExpand"), "childPageWidget");
                }
            } else if (actionMasked != 1) {
                if (actionMasked == 3 && this.intercepted) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (this.intercepted) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final n5i getMaskHelper() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n5i) ipChange.ipc$dispatch("4eaed51f", new Object[]{this});
            }
            return this.maskHelper;
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "ev");
            View.OnTouchListener onTouchListener = this.mInterceptTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
            return originInterceptTouch(motionEvent);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedFling(View view, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            ckf.g(view, "target");
            return super.onNestedFling(view, f, f2, z);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
            }
            ckf.g(view, "target");
            return super.onNestedPreFling(view, f, f2);
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            this.maskHelper.d(i2);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, androidx.core.view.NestedScrollingParent2
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
                    af8 Y3 = NSSceneHeaderMuiseWidget.Y3(this.this$0);
                    if (Y3 != null) {
                        Y3.y();
                    }
                    this.this$0.postScopeEvent(kml.a("fromWeex"), "childPageWidget");
                }
                this.mHideSceneLayer = false;
            }
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, androidx.core.view.NestedScrollingParent2
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
                if (i6 <= 0 || Math.abs(i6) <= SearchSceneEnhancedMuiseModWidget.HIDDEN_THRESHOLD) {
                    z = false;
                }
                this.mHideSceneLayer = z;
            } else if (o4p.T1() && i2 == 0 && i4 > 0 && (view instanceof RecyclerView)) {
                ((RecyclerView) view).stopScroll();
            }
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, androidx.core.view.NestedScrollingParent2
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
            t2o.a(815793436);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements vqc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.vqc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbbbe38f", new Object[]{this});
            } else {
                NSSceneHeaderMuiseWidget.i(NSSceneHeaderMuiseWidget.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements dvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.dvk
        public void a(boolean z) {
            com.taobao.android.weex_framework.a x;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86309fb5", new Object[]{this, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "sticky", String.valueOf(z));
            fw j = NSSceneHeaderMuiseWidget.j(NSSceneHeaderMuiseWidget.this);
            if (j != null && (x = j.x()) != null) {
                x.sendInstanceMessage("MUISE", "stickychange", jSONObject);
            }
        }
    }

    static {
        t2o.a(815793435);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSSceneHeaderMuiseWidget(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
    }

    public static final /* synthetic */ af8 Y3(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (af8) ipChange.ipc$dispatch("fa647b81", new Object[]{nSSceneHeaderMuiseWidget});
        }
        return nSSceneHeaderMuiseWidget.f0;
    }

    public static final /* synthetic */ boolean g(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1177fd26", new Object[]{nSSceneHeaderMuiseWidget})).booleanValue();
        }
        return nSSceneHeaderMuiseWidget.N;
    }

    public static final /* synthetic */ boolean h(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9a60d4d", new Object[]{nSSceneHeaderMuiseWidget})).booleanValue();
        }
        return nSSceneHeaderMuiseWidget.L;
    }

    public static final /* synthetic */ View i(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e227d4d6", new Object[]{nSSceneHeaderMuiseWidget});
        }
        return nSSceneHeaderMuiseWidget.S;
    }

    public static /* synthetic */ Object ipc$super(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1969925363:
                super.Z0();
                return null;
            case -1849801422:
                super.S3();
                return null;
            case -1641373480:
                return new Integer(super.U3((String) objArr[0]));
            case -658989337:
                super.onEventMainThread((jml) objArr[0]);
                return null;
            case 283416391:
                super.T3();
                return null;
            case 574955962:
                super.K0(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 1268056981:
                super.bindWithData((MuiseBean) objArr[0]);
                return null;
            case 1897277870:
                super.onEventMainThread((iml) objArr[0]);
                return null;
            case 1919588296:
                super.h0();
                return null;
            case 2122179860:
                super.R2();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/widgets/NSSceneHeaderMuiseWidget");
        }
    }

    public static final /* synthetic */ fw j(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fw) ipChange.ipc$dispatch("d7af6b0c", new Object[]{nSSceneHeaderMuiseWidget});
        }
        return nSSceneHeaderMuiseWidget.c;
    }

    public static final void k(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78502a82", new Object[]{nSSceneHeaderMuiseWidget, new Integer(i)});
            return;
        }
        ckf.g(nSSceneHeaderMuiseWidget, "this$0");
        FrameLayout frameLayout = (FrameLayout) nSSceneHeaderMuiseWidget.getView();
        if (frameLayout != null) {
            nSSceneHeaderMuiseWidget.e0 = i;
            frameLayout.getLayoutParams().height = i;
            frameLayout.requestLayout();
            if (ckf.b(nSSceneHeaderMuiseWidget.k0, Boolean.TRUE)) {
                RESULT totalSearchResult = nSSceneHeaderMuiseWidget.getModel().e().getTotalSearchResult();
                CommonSearchResult commonSearchResult = totalSearchResult instanceof CommonSearchResult ? (CommonSearchResult) totalSearchResult : null;
                if (commonSearchResult != null) {
                    commonSearchResult.sceneStickyHeight = i - nSSceneHeaderMuiseWidget.d0;
                }
            }
        }
    }

    public static final void l(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e78d74", new Object[]{nSSceneHeaderMuiseWidget, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(nSSceneHeaderMuiseWidget, "this$0");
        af8 af8Var = nSSceneHeaderMuiseWidget.f0;
        if (af8Var != null) {
            af8Var.u(nSSceneHeaderMuiseWidget.K3() - ((nSSceneHeaderMuiseWidget.e0 - i) + i2));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public int D3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d7307be", new Object[]{this, new Integer(i)})).intValue();
        }
        return i;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer F3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer) ipChange.ipc$dispatch("fae3e800", new Object[]{this, activity});
        }
        ckf.g(activity, "activity");
        return new NSSceneHeaderContainer(this, activity);
    }

    @Override // tb.j4p, tb.auc
    public void K0(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            NSSceneHeaderContainer nSSceneHeaderContainer = (NSSceneHeaderContainer) frameLayout;
            n5i maskHelper = nSSceneHeaderContainer.getMaskHelper();
            if (maskHelper.c()) {
                maskHelper.h(f);
                ROOT_VIEW view = getView();
                ckf.d(view);
                postEvent(hml.a((int) ((1.0f - f) * ((FrameLayout) view).getMeasuredHeight())));
            } else if (z) {
                Boolean bool = this.k0;
                if ((bool == null || ckf.b(bool, Boolean.FALSE)) && this.j0 <= 0) {
                    nSSceneHeaderContainer.setAlpha(f);
                    frameLayout.invalidate();
                    TUrlImageView tUrlImageView = this.A;
                    if (tUrlImageView != null && !this.l0) {
                        tUrlImageView.setAlpha(f);
                    }
                }
                ROOT_VIEW view2 = getView();
                ckf.d(view2);
                postEvent(hml.a((int) ((1.0f - f) * ((FrameLayout) view2).getMeasuredHeight())));
            }
        }
        if (f < 1.0f) {
            G3();
        }
        super.K0(z, f);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public int K3() {
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

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void P3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4da7c3a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void Q3(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da13938b", new Object[]{this, new Integer(i)});
        } else {
            new Handler().post(new Runnable() { // from class: tb.zhz
                @Override // java.lang.Runnable
                public final void run() {
                    NSSceneHeaderMuiseWidget.k(NSSceneHeaderMuiseWidget.this, i);
                }
            });
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.m8j
    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        } else if (this.c0 <= 0) {
            super.R2();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void R3(final int i, final int i2) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352e420d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getView() != 0 && (frameLayout = (FrameLayout) getView()) != null) {
            frameLayout.post(new Runnable() { // from class: tb.yhz
                @Override // java.lang.Runnable
                public final void run() {
                    NSSceneHeaderMuiseWidget.l(NSSceneHeaderMuiseWidget.this, i2, i);
                }
            });
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91be4532", new Object[]{this});
            return;
        }
        super.S3();
        af8 af8Var = this.f0;
        if (af8Var != null) {
            af8Var.w(false);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e49747", new Object[]{this});
            return;
        }
        super.T3();
        this.B = this.d0;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public int U3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e2aa0d8", new Object[]{this, str})).intValue();
        }
        int U3 = super.U3(str);
        if (U3 == -1) {
            return (int) qrl.d(str, -1.0f);
        }
        return U3;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.smd
    public Integer W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4246d547", new Object[]{this});
        }
        return this.i0;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void W3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfaeb36d", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.j4p, tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
            return;
        }
        super.Z0();
        S0();
    }

    @Override // tb.j4p, tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        } else {
            this.d0 = i;
        }
    }

    @Override // tb.j4p, tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        if (!this.b0) {
            return 0;
        }
        if (this.P) {
            return this.C;
        }
        return p1p.a(10.0f);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.smd
    public Integer f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2027a5aa", new Object[]{this});
        }
        return this.h0;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.smd
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

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.j4p, tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        if (this.L) {
            af8 af8Var = new af8(getView(), this);
            this.f0 = af8Var;
            af8Var.C(this);
            af8 af8Var2 = this.f0;
            if (af8Var2 != null) {
                af8Var2.B(this.C);
            }
            af8 af8Var3 = this.f0;
            if (af8Var3 != null) {
                af8Var3.D((K3() - this.e0) + f());
            }
            return this.f0;
        } else if (this.j0 > 0 || ckf.b(this.k0, Boolean.TRUE)) {
            return new mnq(getView(), this.k0, this, this.b0, this.j0, new c());
        } else {
            return null;
        }
    }

    @Override // tb.j4p, tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
            return;
        }
        super.h0();
        j2();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.smd
    public boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36698c09", new Object[]{this})).booleanValue();
        }
        return this.b0;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.smd
    public Integer i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("209ec8de", new Object[]{this});
        }
        return this.g0;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void onEventMainThread(jml jmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b89ee7", new Object[]{this, jmlVar});
            return;
        }
        ckf.g(jmlVar, "event");
        super.onEventMainThread(jmlVar);
        af8 af8Var = this.f0;
        if (af8Var != null) {
            af8Var.A();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.j4p, tb.m8j
    /* renamed from: v2 */
    public void bindWithData(MuiseBean muiseBean) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b950395", new Object[]{this, muiseBean});
            return;
        }
        h4(muiseBean);
        super.bindWithData(muiseBean);
        if (!(this.L || (frameLayout = (FrameLayout) getView()) == null || (layoutParams = frameLayout.getLayoutParams()) == null)) {
            layoutParams.height = this.e0;
        }
        ROOT_VIEW view = getView();
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.sf.newsearch.widgets.NSSceneHeaderMuiseWidget.NSSceneHeaderContainer");
        n5i maskHelper = ((NSSceneHeaderContainer) view).getMaskHelper();
        maskHelper.f(this.b0);
        maskHelper.e(this.L);
        maskHelper.g(new b());
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.smd
    public boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5083ab1", new Object[]{this})).booleanValue();
        }
        return this.l0;
    }

    public final void h4(MuiseBean muiseBean) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e617e5d", new Object[]{this, muiseBean});
        } else if (getView() != 0 && muiseBean != null) {
            JSONObject jSONObject = muiseBean.model;
            ckf.f(jSONObject, "model");
            JSONObject d = h19.d(jSONObject, "style");
            if (d != null) {
                this.b0 = TextUtils.equals(d.getString(slo.KEY_IMMERSE_STYLE), slo.VALUE_YES);
                JSONObject jSONObject2 = muiseBean.extraStatus;
                ckf.f(jSONObject2, XslMUSComponent.KEY_EXTRA_STATUS);
                jSONObject2.put((JSONObject) slo.KEY_IMMERSE_STYLE, String.valueOf(this.b0));
                CommonSearchResult commonSearchResult = null;
                this.h0 = qrl.c(d.getString("tabTextSelectedColor"), null);
                this.g0 = qrl.c(d.getString("tabTextNormalColor"), null);
                this.i0 = Integer.valueOf(SFPromotionBean.b(d.getString("statusBarStyle")));
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
                    this.c0 = (int) (((e2 * 1.0f) * zuo.e()) / e);
                    boolean z = this.b0;
                    this.e0 = (z ? this.d0 : 0) + this.c0 + (z ? f() : 0);
                    String string3 = d.getString("stickyHeight");
                    this.k0 = d.getBoolean("sticky");
                    this.l0 = d.getBooleanValue("keepImmersedBg");
                    if (!TextUtils.isEmpty(string3)) {
                        try {
                            i = (int) fxh.e(string3);
                        } catch (Exception unused) {
                        }
                        this.j0 = i;
                        RESULT totalSearchResult = getModel().e().getTotalSearchResult();
                        CommonSearchResult commonSearchResult2 = totalSearchResult instanceof CommonSearchResult ? (CommonSearchResult) totalSearchResult : null;
                        if (commonSearchResult2 != null) {
                            commonSearchResult2.sceneStickyHeight = this.j0;
                        }
                        if (ckf.b(this.k0, Boolean.TRUE)) {
                            RESULT totalSearchResult2 = getModel().e().getTotalSearchResult();
                            if (totalSearchResult2 instanceof CommonSearchResult) {
                                commonSearchResult = (CommonSearchResult) totalSearchResult2;
                            }
                            if (commonSearchResult != null) {
                                commonSearchResult.sceneStickyHeight = this.c0 - this.d0;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void onEventMainThread(iml imlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711629ae", new Object[]{this, imlVar});
            return;
        }
        ckf.g(imlVar, "event");
        super.onEventMainThread(imlVar);
        af8 af8Var = this.f0;
        if (af8Var != null) {
            af8Var.w(!imlVar.b);
        }
    }
}
