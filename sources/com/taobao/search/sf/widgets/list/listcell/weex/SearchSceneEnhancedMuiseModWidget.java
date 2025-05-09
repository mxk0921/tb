package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import androidx.core.view.NestedScrollingParent2;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.abk;
import tb.acx;
import tb.b12;
import tb.b64;
import tb.d6p;
import tb.f6p;
import tb.fmo;
import tb.fw;
import tb.gml;
import tb.h19;
import tb.hml;
import tb.hq9;
import tb.igw;
import tb.iml;
import tb.j4p;
import tb.jml;
import tb.kml;
import tb.kr1;
import tb.mec;
import tb.nde;
import tb.o02;
import tb.o1p;
import tb.o4p;
import tb.o8j;
import tb.oxb;
import tb.p9a;
import tb.qrl;
import tb.sen;
import tb.sif;
import tb.slo;
import tb.smd;
import tb.t2o;
import tb.ude;
import tb.vfw;
import tb.yj4;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchSceneEnhancedMuiseModWidget extends j4p implements smd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int HIDDEN_THRESHOLD = o1p.b(40);
    public TUrlImageView A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean K;
    public FrameLayout Q;
    public View R;
    public View S;
    public View T;
    public p9a Y;
    public String w;
    public String x;
    public String y;
    public fmo z;
    public String v = "";
    public int I = 0;
    public int J = 0;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public boolean O = true;
    public boolean P = false;
    public Integer U = null;
    public Integer V = null;
    public Integer W = null;
    public int X = 10001;
    public boolean Z = true;
    public boolean a0 = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SceneHeaderContainer extends FrameLayout implements NestedScrollingParent2, sif {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public View.OnTouchListener mInterceptTouchListener;
        public int mAccY = 0;
        public boolean mHideSceneLayer = false;
        public boolean mSkipIntercept = false;

        static {
            t2o.a(815793665);
            t2o.a(993001955);
        }

        public SceneHeaderContainer(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(SceneHeaderContainer sceneHeaderContainer, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1533054272) {
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            }
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode == 2114251219) {
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchSceneEnhancedMuiseModWidget$SceneHeaderContainer");
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            View.OnTouchListener onTouchListener = this.mInterceptTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget = SearchSceneEnhancedMuiseModWidget.this;
            if (searchSceneEnhancedMuiseModWidget.L && SearchSceneEnhancedMuiseModWidget.z3(searchSceneEnhancedMuiseModWidget) != 10002) {
                this.mSkipIntercept = true;
                SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget2 = SearchSceneEnhancedMuiseModWidget.this;
                if (!searchSceneEnhancedMuiseModWidget2.N) {
                    searchSceneEnhancedMuiseModWidget2.postEvent(iml.a("clickCoverExpand"));
                }
                return false;
            } else if (motionEvent.getActionMasked() != 0) {
                return super.onInterceptTouchEvent(motionEvent);
            } else {
                this.mSkipIntercept = false;
                this.mHideSceneLayer = false;
                this.mAccY = 0;
                return false;
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedFling(View view, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            return super.onNestedFling(view, f, f2, z);
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
            }
            return super.onNestedPreFling(view, f, f2);
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            }
        }

        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                return;
            }
            int i6 = this.mAccY + i4;
            this.mAccY = i6;
            if (i6 <= 0 || Math.abs(i6) <= SearchSceneEnhancedMuiseModWidget.HIDDEN_THRESHOLD) {
                this.mHideSceneLayer = false;
            } else {
                this.mHideSceneLayer = true;
            }
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
            }
        }

        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i2 == 0 && i == 2) {
                return true;
            }
            return false;
        }

        public void onStopNestedScroll(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
                return;
            }
            this.mAccY = 0;
            if (this.mHideSceneLayer && !this.mSkipIntercept) {
                SearchSceneEnhancedMuiseModWidget.this.postEvent(kml.a("fromWeex"));
            }
        }

        public boolean originInterceptTouch(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8de33d03", new Object[]{this, motionEvent})).booleanValue();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // tb.sif
        public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
            } else {
                this.mInterceptTouchListener = onTouchListener;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int D3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int L3 = SearchSceneEnhancedMuiseModWidget.this.L3();
            if (L3 != 0 && SearchSceneEnhancedMuiseModWidget.r3(SearchSceneEnhancedMuiseModWidget.this) != (D3 = SearchSceneEnhancedMuiseModWidget.this.D3(L3))) {
                SearchSceneEnhancedMuiseModWidget.s3(SearchSceneEnhancedMuiseModWidget.this, D3);
                SearchSceneEnhancedMuiseModWidget.this.Q3(D3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((ViewGroup) ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).getParent().getParent()).addView(SearchSceneEnhancedMuiseModWidget.this.A, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SearchSceneEnhancedMuiseModWidget.this.S3();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget = SearchSceneEnhancedMuiseModWidget.this;
            SearchSceneEnhancedMuiseModWidget.v3(searchSceneEnhancedMuiseModWidget, SearchSceneEnhancedMuiseModWidget.t3(searchSceneEnhancedMuiseModWidget), SearchSceneEnhancedMuiseModWidget.u3(SearchSceneEnhancedMuiseModWidget.this));
            if (SearchSceneEnhancedMuiseModWidget.w3(SearchSceneEnhancedMuiseModWidget.this) > 0) {
                SearchSceneEnhancedMuiseModWidget.x3(SearchSceneEnhancedMuiseModWidget.this, "");
            } else {
                SearchSceneEnhancedMuiseModWidget.x3(SearchSceneEnhancedMuiseModWidget.this, "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11717a;

        public e(String str) {
            this.f11717a = str;
        }

        @Override // tb.vfw
        public void a(View view) {
            int w3;
            int r3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.gravity = 49;
            int r32 = (SearchSceneEnhancedMuiseModWidget.r3(SearchSceneEnhancedMuiseModWidget.this) + SearchSceneEnhancedMuiseModWidget.this.B) - o1p.b(41);
            if (TextUtils.equals(this.f11717a, abk.FROM_FULL)) {
                w3 = SearchSceneEnhancedMuiseModWidget.y3(SearchSceneEnhancedMuiseModWidget.this);
                r3 = SearchSceneEnhancedMuiseModWidget.r3(SearchSceneEnhancedMuiseModWidget.this);
            } else {
                if (TextUtils.equals(this.f11717a, "advance")) {
                    w3 = SearchSceneEnhancedMuiseModWidget.w3(SearchSceneEnhancedMuiseModWidget.this);
                    r3 = SearchSceneEnhancedMuiseModWidget.r3(SearchSceneEnhancedMuiseModWidget.this);
                }
                ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).addView(view, layoutParams);
                view.setTranslationY(r32);
            }
            r32 += w3 - r3;
            ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).addView(view, layoutParams);
            view.setTranslationY(r32);
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).removeView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).addView(view, 0);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).removeView(view);
            }
        }
    }

    static {
        t2o.a(815793658);
        t2o.a(993001662);
    }

    public SearchSceneEnhancedMuiseModWidget(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
        Q2(false);
    }

    public static /* synthetic */ Object ipc$super(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1674519569:
                return super.getBehavior();
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 543094913:
                super.H2((com.taobao.android.weex_framework.a) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 761104299:
                super.K2((Map) objArr[0]);
                return null;
            case 857891591:
                return super.C2((MuiseBean) objArr[0]);
            case 1268056981:
                super.bindWithData((MuiseBean) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchSceneEnhancedMuiseModWidget");
        }
    }

    public static /* synthetic */ int r3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1aa92a38", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue();
        }
        return searchSceneEnhancedMuiseModWidget.H;
    }

    public static /* synthetic */ int s3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8c1b53", new Object[]{searchSceneEnhancedMuiseModWidget, new Integer(i)})).intValue();
        }
        searchSceneEnhancedMuiseModWidget.H = i;
        return i;
    }

    public static /* synthetic */ String t3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e046e3bc", new Object[]{searchSceneEnhancedMuiseModWidget});
        }
        return searchSceneEnhancedMuiseModWidget.w;
    }

    public static /* synthetic */ int u3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a8ae076", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue();
        }
        return searchSceneEnhancedMuiseModWidget.I;
    }

    public static /* synthetic */ void v3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f868f97", new Object[]{searchSceneEnhancedMuiseModWidget, str, new Integer(i)});
        } else {
            searchSceneEnhancedMuiseModWidget.E3(str, i);
        }
    }

    public static /* synthetic */ int w3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa6c96b4", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue();
        }
        return searchSceneEnhancedMuiseModWidget.F;
    }

    public static /* synthetic */ void x3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21de3aa", new Object[]{searchSceneEnhancedMuiseModWidget, str});
        } else {
            searchSceneEnhancedMuiseModWidget.J3(str);
        }
    }

    public static /* synthetic */ int y3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4e4cf2", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue();
        }
        return searchSceneEnhancedMuiseModWidget.G;
    }

    public static /* synthetic */ int z3(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a23f2811", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue();
        }
        return searchSceneEnhancedMuiseModWidget.X;
    }

    public final void A3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84566455", new Object[]{this, jSONObject});
        } else if (this.O && !N3()) {
            String string = jSONObject.getString("immersedBgImg");
            String string2 = jSONObject.getString("immersedPadBgImg");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                I3();
                ScreenType g = ScreenType.g(getActivity());
                if (ScreenType.IS_PAD) {
                    this.A.setImageUrl(string2);
                } else if (!ScreenType.IS_FOLDABLE || g == null) {
                    this.A.setImageUrl(string);
                } else if (g.c() == 3) {
                    this.A.setImageUrl(string2);
                } else {
                    this.A.setImageUrl(string);
                }
            }
        }
    }

    public final void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444cfb6c", new Object[]{this});
            return;
        }
        String str = this.w;
        this.x = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.w;
            str2.hashCode();
            if (str2.equals("advance")) {
                int i = this.F;
                int i2 = this.H;
                if (i > i2) {
                    R3(i, i2);
                }
            } else if (str2.equals(abk.FROM_FULL)) {
                ((FrameLayout) getView()).post(new c());
            }
        }
    }

    @Override // tb.j4p, tb.m8j
    public Map<String, Object> C2(MuiseBean muiseBean) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("33226307", new Object[]{this, muiseBean});
        }
        Map<String, Object> C2 = super.C2(muiseBean);
        if (!(C2 == null || !(C2.get("model") instanceof JSONObject) || (jSONObject = (JSONObject) C2.get("model")) == null)) {
            jSONObject.put("offsettop", (Object) Integer.valueOf(this.D));
            if (O3() && !this.O) {
                return C2;
            }
            jSONObject.put("offsetbottom", (Object) Integer.valueOf(this.E));
        }
        return C2;
    }

    public int D3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d7307be", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.P) {
            return i;
        }
        int i2 = i - this.C;
        if (!this.O || ((CommonBaseDatasource) getModel().e()).isMetaMode()) {
            return i2;
        }
        return i2 - this.B;
    }

    public final void E3(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a955d81", new Object[]{this, str, new Integer(i)});
        } else if (i > 0) {
            G3();
            p9a p9aVar = new p9a(getActivity(), this, getModel(), (ViewGroup) getView(), new e(str));
            this.Y = p9aVar;
            p9aVar.bindWithData(Integer.valueOf(i));
            this.Y.attachToContainer();
            this.Y.w2();
        }
    }

    public SceneHeaderContainer F3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneHeaderContainer) ipChange.ipc$dispatch("fae3e800", new Object[]{this, activity});
        }
        return new SceneHeaderContainer(activity);
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        SceneHeaderContainer F3 = F3(getActivity());
        F3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.Q = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        F3.addView(this.Q);
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_scene_layer_mask, (ViewGroup) F3, false);
        this.S = inflate;
        this.R = inflate.findViewById(R.id.v_non_gradient_mask);
        this.T = this.S.findViewById(R.id.v_gradient_mask_bottom);
        F3.addView(this.S);
        return F3;
    }

    public void G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f934da52", new Object[]{this});
            return;
        }
        p9a p9aVar = this.Y;
        if (p9aVar != null) {
            p9aVar.destroyAndRemoveFromParent();
            this.Y = null;
        }
    }

    @Override // tb.m8j
    public void H2(com.taobao.android.weex_framework.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205ef881", new Object[]{this, aVar, str, str2});
            return;
        }
        super.H2(aVar, str, str2);
        if (!this.K) {
            if (!TextUtils.isEmpty(this.v)) {
                H3(this.v);
            } else {
                ((FrameLayout) getView()).setVisibility(8);
            }
            this.L = false;
        }
    }

    public final void H3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f737ad3c", new Object[]{this, str});
            return;
        }
        this.Q.setVisibility(8);
        postScopeEvent(jml.a("degrade"), "childPageWidget");
        J3("degrade");
        if (this.z == null) {
            fmo fmoVar = new fmo(getActivity(), this, (b64) getModel(), (ViewGroup) getView(), new f(), null);
            this.z = fmoVar;
            fmoVar.y2(new d6p());
            this.z.attachToContainer();
        }
        this.z.z2(this.B + this.H + this.C);
        this.z.u2(str);
    }

    public final void I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865e906b", new Object[]{this});
        } else if (this.A == null) {
            TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
            this.A = tUrlImageView;
            tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.A.setAdjustViewBounds(true);
            ((FrameLayout) getView()).post(new b());
        }
    }

    public final void J3(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862f8af3", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        int i = this.X;
        if (i == 10002) {
            str2 = abk.FROM_FULL;
        } else if (i == 10003) {
            str2 = "hidden";
        } else {
            str2 = "normal";
        }
        jSONObject.put("showType", (Object) str2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("triggerSource", (Object) str);
        }
        HashMap hashMap = new HashMap();
        if (getModel().e().getTotalSearchResult() != 0) {
            str3 = ((BaseSearchResult) getModel().e().getTotalSearchResult()).getMainInfo().rn;
        } else {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        jSONObject.put("trace", (Object) hashMap);
        if (this.c.x() != null) {
            this.c.x().sendInstanceMessage("onOperateSearchList", jSONObject);
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("showType", str2);
        if (!TextUtils.isEmpty(str3)) {
            arrayMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        if (!TextUtils.isEmpty(this.w)) {
            arrayMap.put("defaultShowType", this.w);
        }
        arrayMap.put("q", getModel().b().getKeyword());
        sen.f("OperateGiraffe", arrayMap);
    }

    @Override // tb.j4p, tb.m8j
    public void K2(Map<String, Object> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        super.K2(map);
        if (o4p.U1()) {
            if (this.O) {
                i = this.D;
            }
            map.put("immersedTopHeight", Integer.valueOf(i));
        } else {
            map.put("immersedTopHeight", Integer.valueOf(this.D));
        }
        if (!O3() || this.O) {
            map.put("immersedBottomHeight", Integer.valueOf(this.E));
        }
        int K3 = K3();
        if (K3 > 0) {
            map.put("containerHeight", String.valueOf(o1p.f(K3)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public int K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue();
        }
        nde root = getRoot();
        if (root instanceof b12) {
            return ((b12) root).getView().getMeasuredHeight();
        }
        return 0;
    }

    public int L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3785b61e", new Object[]{this})).intValue();
        }
        fw fwVar = this.c;
        if (fwVar == null || fwVar.x() == null) {
            return 0;
        }
        return this.c.x().getRootHeight();
    }

    public final void M3(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a84480", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            this.S.setVisibility(8);
        } else {
            this.S.setVisibility(0);
            View view = this.R;
            if (!(view == null || view.getLayoutParams() == null)) {
                this.R.getLayoutParams().height = this.B;
            }
            if (z2) {
                this.T.setVisibility(0);
                this.R.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_non_gradient);
                return;
            }
            this.T.setVisibility(8);
            this.R.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_no_tab);
        }
    }

    public final boolean N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (!(activity instanceof oxb) || !((oxb) activity).E1()) {
            return false;
        }
        return true;
    }

    public boolean O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f890c7", new Object[]{this})).booleanValue();
        }
        if (!o4p.V1() || this.L) {
            return false;
        }
        if (!this.O || this.P) {
            return true;
        }
        return false;
    }

    public void P3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4da7c3a", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            frameLayout.setTranslationY(i * 0.5f);
        }
        if ("advance".equals(this.x) && i != 0) {
            this.x = "normal";
            postScopeEvent(jml.a("userScroll"), "childPageWidget");
        }
        V3(Math.abs(i));
    }

    public void Q3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da13938b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.m8j
    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    public void R3(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352e420d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            postScopeEvent(gml.a(i - i2), "childPageWidget");
        }
    }

    public void S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91be4532", new Object[]{this});
        } else {
            postScopeEvent(iml.b("", true), "childPageWidget");
        }
    }

    public void T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e49747", new Object[]{this});
        }
    }

    public int U3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e2aa0d8", new Object[]{this, str})).intValue();
        }
        return qrl.e(str, -1);
    }

    public final void V3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90154dd", new Object[]{this, new Integer(i)});
        } else if (this.c.x() != null) {
            int i2 = this.H;
            if (i >= i2 && this.Z) {
                this.Z = false;
                j2();
            } else if (i < i2 && !this.Z) {
                this.Z = true;
                S0();
            }
        }
    }

    public Integer W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4246d547", new Object[]{this});
        }
        return this.W;
    }

    public void W3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfaeb36d", new Object[]{this, new Integer(i)});
        } else {
            ((FrameLayout) getView()).setPadding(((FrameLayout) getView()).getPaddingLeft(), i, ((FrameLayout) getView()).getPaddingRight(), ((FrameLayout) getView()).getPaddingBottom());
        }
    }

    public final void X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fdea82", new Object[]{this});
        }
    }

    public Integer f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2027a5aa", new Object[]{this});
        }
        return this.V;
    }

    public int g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e18dc9c", new Object[]{this})).intValue();
        }
        return this.H;
    }

    @Override // tb.j4p, tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return super.getBehavior();
    }

    public boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36698c09", new Object[]{this})).booleanValue();
        }
        return this.O;
    }

    public Integer i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("209ec8de", new Object[]{this});
        }
        return this.U;
    }

    @Override // tb.j4p, tb.m8j, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        TUrlImageView tUrlImageView = this.A;
        if (tUrlImageView != null) {
            igw.a(tUrlImageView);
        }
    }

    public void onEventMainThread(hml hmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb8ea", new Object[]{this, hmlVar});
        } else if (getModel().g()) {
            P3(hmlVar.f20749a);
        }
    }

    @Override // tb.j4p, tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        this.K = true;
        this.c.r(this.Q, aVar, false, -1, -1);
        if (!this.M) {
            E3(this.w, this.I);
        } else if (TextUtils.equals(this.y, "drop")) {
            ((FrameLayout) getView()).postDelayed(new d(), 500L);
        } else {
            E3(this.w, this.I);
            X3();
        }
    }

    @Override // tb.j4p, tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return this.O;
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: v2 */
    public void bindWithData(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b950395", new Object[]{this, muiseBean});
            return;
        }
        C3(muiseBean);
        B3();
        super.bindWithData(muiseBean);
        S0();
        if (O3() && !this.a0) {
            this.a0 = true;
            ((FrameLayout) getView()).addOnLayoutChangeListener(new a());
        }
    }

    @Override // tb.m8j
    public fw w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fw) ipChange.ipc$dispatch("81a4cfc8", new Object[]{this});
        }
        return new o8j(this.mActivity, c(), this, this, D2(), getModel());
    }

    public boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5083ab1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void C3(MuiseBean muiseBean) {
        JSONObject d2;
        boolean z = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5376fdf", new Object[]{this, muiseBean});
        } else if (muiseBean != null && getView() != 0 && (d2 = h19.d(muiseBean.model, "style")) != null) {
            this.P = d2.getBooleanValue("autoFit");
            String string = d2.getString("width");
            String string2 = d2.getString("height");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                int U3 = U3(string);
                int U32 = U3(string2);
                if (U3 > 0 && U32 > 0) {
                    this.L = TextUtils.equals(d2.getString("isGiraffe"), slo.VALUE_YES);
                    this.w = d2.getString("showType");
                    this.y = d2.getString("enterAnimation");
                    this.I = qrl.e(d2.getString("collapseSecond"), -1);
                    this.J = qrl.e(d2.getString("repeatCollapseSecond"), -1);
                    this.M = TextUtils.equals(slo.VALUE_YES, d2.getString("enableGuide"));
                    int i2 = this.o;
                    if (i2 <= 0) {
                        i2 = zuo.e();
                    }
                    this.H = (int) ((U32 / U3) * i2);
                    this.B = o1p.b(48);
                    if ((getActivity() instanceof mec) && ((mec) getActivity()).o2()) {
                        this.B += SystemBarDecorator.getStatusBarHeight(getActivity());
                    }
                    BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().b().getTotalSearchResult();
                    if (baseSearchResult == null || baseSearchResult.getTabs() == null || baseSearchResult.getTabs().size() <= 1) {
                        z = false;
                    }
                    M3(TextUtils.equals(d2.getString("hideMaskView"), slo.VALUE_YES), z);
                    if (z) {
                        this.B += o1p.b(48);
                    }
                    this.C = o1p.b(TextUtils.equals(d2.getString("enableSlide"), slo.VALUE_YES) ? 54 : 40);
                    T3();
                    this.D = o1p.f(this.B);
                    this.E = o1p.f(this.C);
                    int a2 = zuo.a(getActivity());
                    this.G = (a2 - o1p.b(qrl.e(d2.getString("fullBottomSearchListHeight"), 0))) - (this.B + this.C);
                    int e2 = qrl.e(d2.getString("advanceBottomSearchListHeight"), -1);
                    if (e2 > 0) {
                        this.F = (a2 - o1p.b(e2)) - (this.B + this.C);
                    }
                    int min = Math.min(this.F, this.G);
                    this.F = min;
                    this.F = Math.max(min, this.H);
                    String string3 = d2.getString(hq9.DEGTAGE_H5URL);
                    this.v = string3;
                    if (!TextUtils.isEmpty(string3)) {
                        this.v = f6p.b(this.v, "offsetbottom", String.valueOf(this.E));
                    }
                    this.N = TextUtils.equals(d2.getString("disableAutoExpand"), slo.VALUE_YES);
                    boolean equals = TextUtils.equals(d2.getString(slo.KEY_IMMERSE_STYLE), slo.VALUE_YES);
                    this.O = equals;
                    if (!equals) {
                        this.S.setVisibility(8);
                    }
                    if (!this.O) {
                        i = this.B;
                    }
                    W3(i);
                    A3(d2);
                    this.U = qrl.c(d2.getString("tabTextNormalColor"), null);
                    this.V = qrl.c(d2.getString("tabTextSelectedColor"), null);
                    this.W = Integer.valueOf(SFPromotionBean.b(d2.getString("statusBarStyle")));
                }
            }
        }
    }

    public void onEventMainThread(iml imlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711629ae", new Object[]{this, imlVar});
        } else if (this.L) {
            this.x = abk.FROM_FULL;
            this.X = 10002;
            J3(imlVar.f21429a);
            int i = this.J;
            if (i > 0) {
                E3(abk.FROM_FULL, i);
            }
        }
    }

    public void onEventMainThread(jml jmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b89ee7", new Object[]{this, jmlVar});
        } else if (this.L) {
            this.x = "normal";
            G3();
            this.X = 10001;
            J3(jmlVar.f22080a);
        }
    }

    public void onEventMainThread(kml kmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18b509e", new Object[]{this, kmlVar});
        } else if (this.L) {
            this.x = "hidden";
            G3();
            this.X = 10003;
            J3(kmlVar.f22762a);
        }
    }
}
