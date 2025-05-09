package tb;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.VideoComponent;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sx9 extends qql<tx9> implements ntc<oqv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public volatile boolean c;
    public yqk d;
    public String e;
    public float f;
    public final View.OnClickListener g = new a(this);
    public final View.OnLongClickListener h = new b(this);
    public static final int ID_ROOT_VIEW = R.id.cl_frame_root;
    public static final int ID_CONTAINER_VIEW = R.id.fl_frame_container;
    public static final int TAG_CONTENT_VIEW = R.id.tt_detail_element_content_id;
    public static final int TAG_FLOAT_VIEW = R.id.tt_detail_element_float_id;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(sx9 sx9Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(sx9 sx9Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(912261414);
        t2o.a(912261362);
    }

    public sx9(Context context, ze7 ze7Var, tx9 tx9Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, tx9Var, dataEntryArr);
        q84.i(this.mContext, oqv.class, this);
        Y();
    }

    public static /* synthetic */ Object ipc$super(sx9 sx9Var, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/FrameComponent");
    }

    public final float A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1180fbd8", new Object[]{this})).floatValue();
        }
        float f = this.f;
        if (f != 0.0f) {
            return f;
        }
        return mr7.h(B());
    }

    public final String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c203f4d", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        if (TextUtils.isEmpty(this.b) || (!M() && !L())) {
            return ((tx9) this.mComponentData).u();
        }
        return this.b;
    }

    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        oa4 v = v(0);
        if (v instanceof bje) {
            return ((bje) v).K();
        }
        if (v instanceof s8e) {
            return ((s8e) v).o();
        }
        return null;
    }

    public float D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be4d49b8", new Object[]{this})).floatValue();
        }
        return A();
    }

    public String E() {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6707c2a", new Object[]{this});
        }
        nb4 t = ((tx9) this.mComponentData).t();
        if (t == null || (f = t.f()) == null || f.isEmpty()) {
            return null;
        }
        return f.getString("videoId");
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f293864b", new Object[]{this});
        }
        return rcw.a(G(), E());
    }

    public String G() {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c0356fe", new Object[]{this});
        }
        nb4 t = ((tx9) this.mComponentData).t();
        if (t == null || (f = t.f()) == null || f.isEmpty()) {
            return null;
        }
        return f.getString("videoUrl");
    }

    public final String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba6a71e5", new Object[]{this});
        }
        oa4 v = v(0);
        if (v instanceof s8e) {
            return ((s8e) v).l();
        }
        return null;
    }

    public FrameLayout I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d41fc862", new Object[]{this});
        }
        oa4 v = v(0);
        if (v instanceof VideoComponent) {
            return ((VideoComponent) v).P();
        }
        return null;
    }

    public View J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ae08db79", new Object[]{this});
        }
        PreRenderManager g = PreRenderManager.g(this.mContext);
        if (g != null) {
            return g.j(this.mContext, R.layout.tt_detail_frame_component, null, true);
        }
        return LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_frame_component, (ViewGroup) null);
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e7048", new Object[]{this})).booleanValue();
        }
        return yc4.t((tx9) this.mComponentData);
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a41a53", new Object[]{this})).booleanValue();
        }
        return yc4.v((tx9) this.mComponentData);
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786f0ed1", new Object[]{this})).booleanValue();
        }
        oa4 v = v(0);
        if (v instanceof s8e) {
            return ((s8e) v).g();
        }
        return false;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d3d21", new Object[]{this});
            return;
        }
        int w = w();
        for (int i = 0; i < w; i++) {
            oa4 v = v(i);
            if (v instanceof u3a) {
                ((u3a) v).E();
            }
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd24a7a", new Object[]{this});
            return;
        }
        int w = w();
        for (int i = 0; i < w; i++) {
            oa4 v = v(i);
            if (v instanceof u3a) {
                ((u3a) v).F();
            }
        }
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff291b1f", new Object[]{this})).booleanValue();
        }
        oa4 v = v(0);
        if (v instanceof s8e) {
            boolean pauseVideo = ((s8e) v).pauseVideo();
            this.c = pauseVideo;
            return pauseVideo;
        }
        this.c = false;
        return false;
    }

    /* renamed from: R */
    public boolean y1(oqv oqvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c226", new Object[]{this, oqvVar})).booleanValue();
        }
        if (M() && oqvVar.b() && TextUtils.equals(F(), oqvVar.a())) {
            Y();
            S();
        }
        return true;
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cbf6d6", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null && view.getWindowToken() != null) {
            int measuredWidth = this.mView.getMeasuredWidth();
            int measuredHeight = this.mView.getMeasuredHeight();
            a(this.mView);
            yqk yqkVar = this.d;
            if (yqkVar != null) {
                ((GalleryCore.h) yqkVar).a(((tx9) this.mComponentData).g(), measuredWidth, measuredHeight, measuredWidth, (int) (measuredWidth / A()));
            }
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a196f56", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            return false;
        }
        oa4 v = v(0);
        if (!(v instanceof s8e)) {
            return false;
        }
        this.c = false;
        return ((s8e) v).playVideo(false);
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00fffcc", new Object[]{this, str});
            return;
        }
        this.e = str;
        this.f = mr7.h(B());
        S();
    }

    public void V(yqk yqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e38f68e", new Object[]{this, yqkVar});
        } else {
            this.d = yqkVar;
        }
    }

    public void W(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208d10", new Object[]{this, new Float(f)});
            return;
        }
        oa4 v = v(0);
        if (v instanceof VideoComponent) {
            ((VideoComponent) v).Z(f);
        }
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public void X(VideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f338496", new Object[]{this, dVar});
            return;
        }
        oa4 v = v(0);
        if (v instanceof VideoComponent) {
            ((VideoComponent) v).a0(dVar);
        }
    }

    public final void Y() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955e124c", new Object[]{this});
            return;
        }
        this.b = null;
        Feature feature = (Feature) this.mDetailContext.e().f(Feature.class);
        if (rcw.o(feature)) {
            this.b = "1:1";
        }
        boolean e = com.taobao.android.detail.ttdetail.widget.video.a.d().e(this.mContext);
        if ((L() && rcw.f(this.mDetailContext)) || rcw.b(this.mContext, feature) || e) {
            z = true;
        }
        String H = H();
        if (!z && !TextUtils.isEmpty(H)) {
            this.b = H;
        }
        this.f = mr7.h(B());
    }

    public final void Z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d8add7", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.medical_main_mask_container);
        if (findViewById != null) {
            Feature feature = (Feature) this.mDetailContext.e().f(Feature.class);
            if (feature == null || !feature.isEnableMainPicMask()) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
            }
            ViewProxy.setOnClickListener(findViewById, this.g);
            ViewProxy.setOnLongClickListener(findViewById, this.h);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac08b1a", new Object[]{this, view});
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82285ae", new Object[]{this, new Boolean(z)});
            return;
        }
        oa4 v = v(0);
        if (v instanceof s8e) {
            ((s8e) v).d(z);
        }
    }

    @Override // tb.oa4
    public int getDataTypeHashId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30064ddd", new Object[]{this})).intValue();
        }
        String w = ((tx9) this.mComponentData).w();
        if (w == null) {
            return -1;
        }
        return w.hashCode();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07ba8b3", new Object[]{this});
            return;
        }
        oa4 v = v(0);
        if (v instanceof s8e) {
            ((s8e) v).n();
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        q84.m(this.mContext, this);
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        View view2;
        View view3;
        oa4 oa4Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        View view4 = null;
        if (view != null) {
            view2 = view.findViewWithTag(Integer.valueOf(TAG_CONTENT_VIEW));
        } else {
            view2 = null;
        }
        oa4 v = v(0);
        View componentView = v.getComponentView(view2);
        if (view != null) {
            view3 = view.findViewWithTag(Integer.valueOf(TAG_FLOAT_VIEW));
        } else {
            view3 = null;
        }
        if (w() >= 2) {
            oa4Var = v(1);
        } else {
            oa4Var = null;
        }
        if (oa4Var != null) {
            view4 = oa4Var.getComponentView(view3);
        }
        if (componentView == null || view4 == null) {
            if (componentView != null) {
                if (componentView == view2) {
                    FrameLayout frameLayout4 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                    if (view3 != null) {
                        frameLayout4.removeView(view3);
                    }
                } else {
                    if (view == null || view.getId() != ID_ROOT_VIEW) {
                        view = J();
                        frameLayout2 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                    } else {
                        frameLayout2 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                        frameLayout2.removeAllViews();
                    }
                    componentView.setTag(Integer.valueOf(TAG_CONTENT_VIEW));
                    zy9 frameSize = v.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                    frameLayout2.addView(componentView, new FrameLayout.LayoutParams(frameSize.c(), frameSize.b(), frameSize.a()));
                }
            } else if (view4 != null) {
                if (view4 == view3) {
                    FrameLayout frameLayout5 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                    if (view2 != null) {
                        frameLayout5.removeView(view2);
                    }
                } else {
                    if (view == null || view.getId() != ID_ROOT_VIEW) {
                        view = J();
                        frameLayout = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                    } else {
                        frameLayout = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                        frameLayout.removeAllViews();
                    }
                    view4.setTag(Integer.valueOf(TAG_FLOAT_VIEW));
                    zy9 frameSize2 = v.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                    frameLayout.addView(view4, new FrameLayout.LayoutParams(frameSize2.c(), frameSize2.b(), frameSize2.a()));
                }
            }
        } else if (!(componentView == view2 && view4 == view3)) {
            if (componentView == view2) {
                FrameLayout frameLayout6 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                if (view3 != null) {
                    frameLayout6.removeView(view3);
                }
                view4.setTag(Integer.valueOf(TAG_FLOAT_VIEW));
                zy9 frameSize3 = oa4Var.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                frameLayout6.addView(view4, new FrameLayout.LayoutParams(frameSize3.c(), frameSize3.b(), frameSize3.a()));
            } else if (view4 == view3) {
                FrameLayout frameLayout7 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                if (view2 != null) {
                    frameLayout7.removeView(view2);
                }
                componentView.setTag(Integer.valueOf(TAG_CONTENT_VIEW));
                zy9 frameSize4 = v.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                frameLayout7.addView(componentView, 0, new FrameLayout.LayoutParams(frameSize4.c(), frameSize4.b(), frameSize4.a()));
            } else {
                if (view == null || view.getId() != ID_ROOT_VIEW) {
                    view = J();
                    frameLayout3 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                } else {
                    frameLayout3 = (FrameLayout) view.findViewById(ID_CONTAINER_VIEW);
                    frameLayout3.removeAllViews();
                }
                componentView.setTag(Integer.valueOf(TAG_CONTENT_VIEW));
                view4.setTag(Integer.valueOf(TAG_FLOAT_VIEW));
                zy9 frameSize5 = v.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                zy9 frameSize6 = oa4Var.getFrameSize(this.mLastWidthMeasureSpec, this.mLastHeightMeasureSpec);
                frameLayout3.addView(componentView, new FrameLayout.LayoutParams(frameSize5.c(), frameSize5.b(), frameSize5.a()));
                frameLayout3.addView(view4, new FrameLayout.LayoutParams(frameSize6.c(), frameSize6.b(), frameSize6.a()));
            }
        }
        if (view == null) {
            view = J();
        }
        Z(view);
        a(view);
        return view;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c63db", new Object[]{this});
            return;
        }
        oa4 v = v(0);
        if (v instanceof s8e) {
            ((s8e) v).s();
        }
    }

    public Rect z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("a1d908a8", new Object[]{this});
        }
        oa4 v = v(0);
        if (v instanceof d8c) {
            return ((d8c) v).f();
        }
        return null;
    }

    public void K(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6163973c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int w = w();
        for (int i3 = 0; i3 < w; i3++) {
            String c = RuntimeUtils.c(v(i3));
            if (!TextUtils.isEmpty(c)) {
                UserBehaviorTracker.j(this.mContext, c, i);
                UserBehaviorTracker.k(this.mContext, c, "isGalleryContent", "true");
                Context context = this.mContext;
                UserBehaviorTracker.k(context, c, "index", "" + i2);
            }
        }
    }
}
