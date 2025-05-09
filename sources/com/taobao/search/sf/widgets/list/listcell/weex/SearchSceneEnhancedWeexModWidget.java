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
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.abk;
import tb.acx;
import tb.b12;
import tb.b64;
import tb.cbk;
import tb.d6p;
import tb.f6p;
import tb.fml;
import tb.fmo;
import tb.gml;
import tb.h19;
import tb.hml;
import tb.hq9;
import tb.hto;
import tb.iml;
import tb.j5p;
import tb.jml;
import tb.k5p;
import tb.kml;
import tb.l5p;
import tb.m6p;
import tb.mec;
import tb.nde;
import tb.o02;
import tb.o1p;
import tb.p9a;
import tb.qrl;
import tb.sen;
import tb.sif;
import tb.slo;
import tb.smd;
import tb.t2o;
import tb.ude;
import tb.uz;
import tb.vfw;
import tb.yj4;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchSceneEnhancedWeexModWidget extends m6p implements smd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int HIDDEN_THRESHOLD = o1p.b(40);
    public boolean A;
    public FrameLayout F;
    public View G;
    public View H;
    public View I;
    public p9a N;
    public String n;
    public String o;
    public String p;
    public fmo q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public String m = "";
    public int y = 0;
    public int z = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = true;
    public Integer J = null;
    public Integer K = null;
    public Integer L = 0;
    public int M = 10001;
    public boolean O = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SceneHeaderContainer extends FrameLayout implements sif {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mDownY;
        public View.OnTouchListener mInterceptTouchListener;
        public boolean mHideSceneLayer = false;
        public boolean mSkipIntercept = false;

        static {
            t2o.a(815793671);
            t2o.a(993001955);
        }

        public SceneHeaderContainer(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(SceneHeaderContainer sceneHeaderContainer, String str, Object... objArr) {
            if (str.hashCode() == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchSceneEnhancedWeexModWidget$SceneHeaderContainer");
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
            SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget = SearchSceneEnhancedWeexModWidget.this;
            if (!searchSceneEnhancedWeexModWidget.B || SearchSceneEnhancedWeexModWidget.W2(searchSceneEnhancedWeexModWidget) == 10002) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int y = (int) (motionEvent.getY() - this.mDownY);
                            if (y >= 0 || Math.abs(y) <= SearchSceneEnhancedWeexModWidget.HIDDEN_THRESHOLD) {
                                this.mHideSceneLayer = false;
                            } else {
                                this.mHideSceneLayer = true;
                            }
                        }
                    } else if (this.mHideSceneLayer && !this.mSkipIntercept) {
                        SearchSceneEnhancedWeexModWidget.this.postEvent(kml.a("fromWeex"));
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
                this.mSkipIntercept = false;
                this.mHideSceneLayer = false;
                this.mDownY = (int) motionEvent.getY();
                return false;
            }
            this.mSkipIntercept = true;
            SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget2 = SearchSceneEnhancedWeexModWidget.this;
            if (!searchSceneEnhancedWeexModWidget2.D) {
                searchSceneEnhancedWeexModWidget2.postEvent(iml.a("clickCoverExpand"));
            }
            return false;
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
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget = SearchSceneEnhancedWeexModWidget.this;
            SearchSceneEnhancedWeexModWidget.R2(searchSceneEnhancedWeexModWidget, SearchSceneEnhancedWeexModWidget.P2(searchSceneEnhancedWeexModWidget), SearchSceneEnhancedWeexModWidget.Q2(SearchSceneEnhancedWeexModWidget.this));
            if (SearchSceneEnhancedWeexModWidget.S2(SearchSceneEnhancedWeexModWidget.this) > 0) {
                SearchSceneEnhancedWeexModWidget.T2(SearchSceneEnhancedWeexModWidget.this, "");
            } else {
                SearchSceneEnhancedWeexModWidget.T2(SearchSceneEnhancedWeexModWidget.this, "");
            }
        }
    }

    static {
        t2o.a(815793666);
        t2o.a(993001662);
    }

    public SearchSceneEnhancedWeexModWidget(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
    }

    public static /* synthetic */ String P2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c6c0eed", new Object[]{searchSceneEnhancedWeexModWidget});
        }
        return searchSceneEnhancedWeexModWidget.n;
    }

    public static /* synthetic */ int Q2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7333307", new Object[]{searchSceneEnhancedWeexModWidget})).intValue();
        }
        return searchSceneEnhancedWeexModWidget.y;
    }

    public static /* synthetic */ void R2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f592044", new Object[]{searchSceneEnhancedWeexModWidget, str, new Integer(i)});
        } else {
            searchSceneEnhancedWeexModWidget.Z2(str, i);
        }
    }

    public static /* synthetic */ int S2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7942bd09", new Object[]{searchSceneEnhancedWeexModWidget})).intValue();
        }
        return searchSceneEnhancedWeexModWidget.v;
    }

    public static /* synthetic */ void T2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a681f421", new Object[]{searchSceneEnhancedWeexModWidget, str});
        } else {
            searchSceneEnhancedWeexModWidget.d3(str);
        }
    }

    public static /* synthetic */ int U2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b52470b", new Object[]{searchSceneEnhancedWeexModWidget})).intValue();
        }
        return searchSceneEnhancedWeexModWidget.x;
    }

    public static /* synthetic */ int V2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("345a0c0c", new Object[]{searchSceneEnhancedWeexModWidget})).intValue();
        }
        return searchSceneEnhancedWeexModWidget.w;
    }

    public static /* synthetic */ int W2(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d61d10d", new Object[]{searchSceneEnhancedWeexModWidget})).intValue();
        }
        return searchSceneEnhancedWeexModWidget.M;
    }

    public static /* synthetic */ Object ipc$super(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2064087969:
                return super.v2((WeexBean) objArr[0]);
            case -1630488714:
                super.H((cbk) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 761104299:
                super.z2((Map) objArr[0]);
                return null;
            case 1021735943:
                super.bindWithData((WeexBean) objArr[0]);
                return null;
            case 1373327421:
                super.K1((cbk) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchSceneEnhancedWeexModWidget");
        }
    }

    @Override // tb.b7x
    public void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    @Override // tb.b7x, tb.uz.d
    public void H(cbk cbkVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed0b776", new Object[]{this, cbkVar, str, str2});
            return;
        }
        super.H(cbkVar, str, str2);
        if (!this.A) {
            if (!TextUtils.isEmpty(this.m)) {
                c3(this.m);
            } else {
                ((FrameLayout) getView()).setVisibility(8);
            }
            this.B = false;
        }
    }

    @Override // tb.b7x, tb.uz.d
    public void K1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db503d", new Object[]{this, cbkVar});
            return;
        }
        super.K1(cbkVar);
        this.A = true;
        this.b.j(this.F, cbkVar, false);
        if (!this.C) {
            Z2(this.n, this.y);
        } else if (TextUtils.equals(this.p, "drop")) {
            ((FrameLayout) getView()).postDelayed(new a(), 500L);
        } else {
            Z2(this.n, this.y);
            l3();
        }
    }

    public Integer W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4246d547", new Object[]{this});
        }
        return this.L;
    }

    public final void Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444cfb6c", new Object[]{this});
            return;
        }
        String str = this.n;
        this.o = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.n;
            str2.hashCode();
            if (str2.equals("advance")) {
                int i = this.v;
                int i2 = this.x;
                if (i > i2) {
                    h3(i, i2);
                }
            } else if (str2.equals(abk.FROM_FULL)) {
                ((FrameLayout) getView()).post(new j5p(this));
            }
        }
    }

    public final void Z2(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a955d81", new Object[]{this, str, new Integer(i)});
        } else if (i > 0) {
            b3();
            p9a p9aVar = new p9a(getActivity(), this, getModel(), (ViewGroup) getView(), new k5p(this, str));
            this.N = p9aVar;
            p9aVar.bindWithData(Integer.valueOf(i));
            this.N.attachToContainer();
            this.N.w2();
        }
    }

    public SceneHeaderContainer a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneHeaderContainer) ipChange.ipc$dispatch("a6bb4c04", new Object[]{this});
        }
        return new SceneHeaderContainer(getActivity());
    }

    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f934da52", new Object[]{this});
            return;
        }
        p9a p9aVar = this.N;
        if (p9aVar != null) {
            p9aVar.destroyAndRemoveFromParent();
            this.N = null;
        }
    }

    public final void c3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f737ad3c", new Object[]{this, str});
            return;
        }
        this.F.setVisibility(8);
        postScopeEvent(jml.a("degrade"), "childPageWidget");
        d3("degrade");
        if (this.q == null) {
            fmo fmoVar = new fmo(getActivity(), this, (b64) getModel(), (ViewGroup) getView(), new l5p(this), null);
            this.q = fmoVar;
            fmoVar.y2(new d6p());
            this.q.attachToContainer();
        }
        this.q.z2(this.r + this.x + this.s);
        this.q.u2(str);
    }

    public final void d3(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862f8af3", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        int i = this.M;
        if (i == 10002) {
            str2 = abk.FROM_FULL;
        } else if (i == 10003) {
            str2 = "hidden";
        } else {
            str2 = "normal";
        }
        hashMap.put("showType", str2);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("triggerSource", str);
        }
        HashMap hashMap2 = new HashMap();
        if (getModel().e().getTotalSearchResult() != 0) {
            str3 = ((BaseSearchResult) getModel().e().getTotalSearchResult()).getMainInfo().rn;
        } else {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap2.put(yj4.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        hashMap.put("trace", hashMap2);
        if (this.b.r() != null) {
            this.b.r().B("onOperateSearchList", hashMap);
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("showType", str2);
        if (!TextUtils.isEmpty(str3)) {
            arrayMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        if (!TextUtils.isEmpty(this.n)) {
            arrayMap.put("defaultShowType", this.n);
        }
        arrayMap.put("q", getModel().b().getKeyword());
        sen.f("OperateGiraffe", arrayMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public int e3() {
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

    public Integer f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2027a5aa", new Object[]{this});
        }
        return this.K;
    }

    public final void f3(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a84480", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            this.H.setVisibility(8);
        } else {
            this.H.setVisibility(0);
            View view = this.G;
            if (!(view == null || view.getLayoutParams() == null)) {
                this.G.getLayoutParams().height = this.r;
            }
            if (z2) {
                this.I.setVisibility(0);
                this.G.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_non_gradient);
                return;
            }
            this.I.setVisibility(8);
            this.G.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_no_tab);
        }
    }

    public int g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e18dc9c", new Object[]{this})).intValue();
        }
        return this.x;
    }

    public void g3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4da7c3a", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY(i * 0.5f);
        }
        if ("advance".equals(this.o) && i != 0) {
            this.o = "normal";
            postScopeEvent(jml.a("userScroll"), "childPageWidget");
        }
        k3(Math.abs(i));
    }

    public boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36698c09", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public void h3(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352e420d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            postScopeEvent(gml.a(i - i2), "childPageWidget");
        }
    }

    public Integer i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("209ec8de", new Object[]{this});
        }
        return this.J;
    }

    public void i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91be4532", new Object[]{this});
        } else {
            postScopeEvent(iml.b("", true), "childPageWidget");
        }
    }

    public void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e49747", new Object[]{this});
        }
    }

    public final void k3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90154dd", new Object[]{this, new Integer(i)});
            return;
        }
        WXSDKInstance r = this.b.r();
        if (r != null) {
            int i2 = this.x;
            if (i >= i2 && this.O) {
                this.O = false;
                r.onActivityPause();
            } else if (i < i2 && !this.O) {
                this.O = true;
                r.onActivityResume();
            }
        }
    }

    public final void l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fdea82", new Object[]{this});
        }
    }

    public void onEventMainThread(hml hmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb8ea", new Object[]{this, hmlVar});
        } else if (getModel().g()) {
            g3(hmlVar.f20749a);
        }
    }

    @Override // tb.m6p, tb.b7x
    /* renamed from: q2 */
    public void bindWithData(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce67407", new Object[]{this, weexBean});
            return;
        }
        X2(weexBean);
        Y2();
        super.bindWithData(weexBean);
        this.b.j((ViewGroup) getView(), this.b.r(), false);
    }

    @Override // tb.b7x
    public uz s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uz) ipChange.ipc$dispatch("835f0cb2", new Object[]{this});
        }
        return new hto(this.mActivity, c(), this, this, w2(), getModel());
    }

    @Override // tb.m6p, tb.b7x
    public Map<String, Object> v2(WeexBean weexBean) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84f8845f", new Object[]{this, weexBean});
        }
        Map<String, Object> v2 = super.v2(weexBean);
        if (!(v2 == null || !(v2.get("model") instanceof JSONObject) || (jSONObject = (JSONObject) v2.get("model")) == null)) {
            jSONObject.put("offsetbottom", (Object) Integer.valueOf(this.u));
            jSONObject.put("offsettop", (Object) Integer.valueOf(this.t));
        }
        return v2;
    }

    @Override // tb.smd
    public boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5083ab1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.m6p, tb.b7x
    /* renamed from: y2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        SceneHeaderContainer a3 = a3();
        a3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(getActivity());
        this.F = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        a3.addView(this.F);
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_scene_layer_mask, (ViewGroup) a3, false);
        this.H = inflate;
        this.G = inflate.findViewById(R.id.v_non_gradient_mask);
        this.I = this.H.findViewById(R.id.v_gradient_mask_bottom);
        a3.addView(this.H);
        return a3;
    }

    @Override // tb.m6p, tb.b7x
    public void z2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        super.z2(map);
        map.put("immersedTopHeight", Integer.valueOf(this.t));
        map.put("immersedBottomHeight", Integer.valueOf(this.u));
        int e3 = e3();
        if (e3 > 0) {
            map.put("containerHeight", String.valueOf(o1p.f(e3)));
        }
    }

    public void X2(WeexBean weexBean) {
        JSONObject d;
        boolean z = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fdc34f", new Object[]{this, weexBean});
        } else if (weexBean != null && getView() != 0 && (d = h19.d(weexBean.model, "style")) != null) {
            String string = d.getString("width");
            String string2 = d.getString("height");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                int e = qrl.e(string, -1);
                int e2 = qrl.e(string2, -1);
                if (e > 0 && e2 > 0) {
                    this.B = TextUtils.equals(d.getString("isGiraffe"), slo.VALUE_YES);
                    this.n = d.getString("showType");
                    this.p = d.getString("enterAnimation");
                    this.y = qrl.e(d.getString("collapseSecond"), -1);
                    this.z = qrl.e(d.getString("repeatCollapseSecond"), -1);
                    this.C = TextUtils.equals(slo.VALUE_YES, d.getString("enableGuide"));
                    this.x = (int) ((e2 / e) * zuo.e());
                    this.r = o1p.b(48);
                    if ((getActivity() instanceof mec) && ((mec) getActivity()).o2()) {
                        this.r += SystemBarDecorator.getStatusBarHeight(getActivity());
                    }
                    BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().b().getTotalSearchResult();
                    if (baseSearchResult == null || baseSearchResult.getTabs() == null || baseSearchResult.getTabs().size() <= 1) {
                        z = false;
                    }
                    f3(TextUtils.equals(d.getString("hideMaskView"), slo.VALUE_YES), z);
                    if (z) {
                        this.r += o1p.b(48);
                    }
                    this.s = o1p.b(TextUtils.equals(d.getString("enableSlide"), slo.VALUE_YES) ? 54 : 40);
                    j3();
                    this.t = o1p.f(this.r);
                    this.u = o1p.f(this.s);
                    int a2 = zuo.a(getActivity());
                    this.w = (a2 - o1p.b(qrl.e(d.getString("fullBottomSearchListHeight"), 0))) - (this.r + this.s);
                    int e3 = qrl.e(d.getString("advanceBottomSearchListHeight"), -1);
                    if (e3 > 0) {
                        this.v = (a2 - o1p.b(e3)) - (this.r + this.s);
                    }
                    int min = Math.min(this.v, this.w);
                    this.v = min;
                    this.v = Math.max(min, this.x);
                    String string3 = d.getString(hq9.DEGTAGE_H5URL);
                    this.m = string3;
                    if (!TextUtils.isEmpty(string3)) {
                        this.m = f6p.b(this.m, "offsetbottom", String.valueOf(this.u));
                    }
                    this.D = TextUtils.equals(d.getString("disableAutoExpand"), slo.VALUE_YES);
                    boolean equals = TextUtils.equals(d.getString(slo.KEY_IMMERSE_STYLE), slo.VALUE_YES);
                    this.E = equals;
                    if (!equals) {
                        this.H.setVisibility(8);
                    }
                    if (!this.E) {
                        i = this.r;
                    }
                    ((FrameLayout) getView()).setPadding(((FrameLayout) getView()).getPaddingLeft(), i, ((FrameLayout) getView()).getPaddingRight(), ((FrameLayout) getView()).getPaddingBottom());
                    this.J = qrl.c(d.getString("tabTextNormalColor"), null);
                    this.K = qrl.c(d.getString("tabTextSelectedColor"), null);
                    this.L = Integer.valueOf(SFPromotionBean.b(d.getString("statusBarStyle")));
                }
            }
        }
    }

    public void onEventMainThread(iml imlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711629ae", new Object[]{this, imlVar});
        } else if (this.B) {
            this.o = abk.FROM_FULL;
            this.M = 10002;
            d3(imlVar.f21429a);
            int i = this.z;
            if (i > 0) {
                Z2(abk.FROM_FULL, i);
            }
        }
    }

    public void onEventMainThread(jml jmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b89ee7", new Object[]{this, jmlVar});
        } else if (this.B) {
            this.o = "normal";
            b3();
            this.M = 10001;
            d3(jmlVar.f22080a);
        }
    }

    public void onEventMainThread(kml kmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18b509e", new Object[]{this, kmlVar});
        } else if (this.B) {
            this.o = "hidden";
            b3();
            this.M = 10003;
            d3(kmlVar.f22762a);
        }
    }

    public void onEventMainThread(fml fmlVar) {
        WXSDKInstance r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dbb382", new Object[]{this, fmlVar});
        } else if (!getModel().g() && (r = this.b.r()) != null) {
            r.onActivityResult(fmlVar.f19408a, fmlVar.b, fmlVar.c);
        }
    }
}
