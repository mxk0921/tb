package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.ExtraHeightLinearLayout;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.android.detail.ttdetail.widget.video.LivePhotoVideoView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.a4a;
import tb.c8n;
import tb.cg2;
import tb.d8c;
import tb.ir;
import tb.nb4;
import tb.q84;
import tb.rc7;
import tb.rcw;
import tb.rql;
import tb.rua;
import tb.s8e;
import tb.sx9;
import tb.t2o;
import tb.tgh;
import tb.tx9;
import tb.u3a;
import tb.wua;
import tb.xau;
import tb.y3l;
import tb.ze7;
import tb.zy9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LivePhotoComponent extends u3a implements d8c, s8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LivePhotoVideoView e;
    public final zy9 d = new zy9(-1, -1, 17);
    public volatile boolean f = true;
    public final LivePhotoVideoView.i g = new b();
    public final VideoView.g h = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                LivePhotoComponent.H(LivePhotoComponent.this, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements LivePhotoVideoView.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a0f32e7", new Object[]{this, new Boolean(z)});
            } else {
                LivePhotoComponent.I(LivePhotoComponent.this, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements VideoView.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.g
        public boolean a(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93db45c3", new Object[]{this, videoView})).booleanValue();
            }
            LivePhotoComponent.H(LivePhotoComponent.this, videoView);
            return true;
        }
    }

    static {
        t2o.a(912261436);
        t2o.a(912263016);
        t2o.a(912261428);
    }

    public LivePhotoComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ void H(LivePhotoComponent livePhotoComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2bf941", new Object[]{livePhotoComponent, view});
        } else {
            livePhotoComponent.O(view);
        }
    }

    public static /* synthetic */ void I(LivePhotoComponent livePhotoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc70e6e2", new Object[]{livePhotoComponent, new Boolean(z)});
        } else {
            livePhotoComponent.V(z);
        }
    }

    public static /* synthetic */ Object ipc$super(LivePhotoComponent livePhotoComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -267981795:
                return super.B();
            case -236809011:
                super.onWillAppear();
                return null;
            case 211631393:
                super.E();
                return null;
            case 395904714:
                super.disAppear();
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            case 2094156410:
                super.F();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/LivePhotoComponent");
        }
    }

    @Override // tb.u3a
    public JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f006ec1d", new Object[]{this});
        }
        JSONObject B = super.B();
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            B.put(xau.PROPERTY_VIDEO_ID, (Object) f.getString("videoId"));
        }
        return B;
    }

    @Override // tb.u3a
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d3d21", new Object[]{this});
            return;
        }
        super.E();
        Object data = getData("isGalleryScrollMode");
        if ((data instanceof Boolean) && ((Boolean) data).booleanValue()) {
            L();
        }
    }

    @Override // tb.u3a
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd24a7a", new Object[]{this});
            return;
        }
        super.F();
        Object data = getData("isGalleryScrollMode");
        if ((data instanceof Boolean) && ((Boolean) data).booleanValue()) {
            pauseVideo();
        }
    }

    public boolean J() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0cc63d", new Object[]{this})).booleanValue();
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null && !(z = livePhotoVideoView.attachDwInstanceView())) {
            S();
        }
        return z;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ab5edc", new Object[]{this});
        } else if (!T()) {
            J();
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbac91e", new Object[]{this});
        } else if (!T()) {
            playVideo(false);
        }
    }

    public final List<ir> M() {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f27c99f3", new Object[]{this});
        }
        rql i = this.mComponentData.i();
        if (i == null || (d = i.d()) == null || !d.getBooleanValue(tx9.KEY_ENABLE_LIGHT_OFF)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) y3l.EVENT_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "userTrack");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("arg1", (Object) "Page_Detail_Button_DetailGifPlay_industry");
        jSONObject3.put("eventId", (Object) "2101");
        JSONObject c2 = UtUtils.c(this.mDetailContext.e());
        c2.put("spm", (Object) "a2141.7631564.detailpic");
        JSONObject B = B();
        if (B != null) {
            c2.putAll(B);
        }
        c2.put("playType", (Object) BizTaskData.MANUAL_TIME);
        jSONObject3.put("args", (Object) c2);
        jSONObject2.put("fields", (Object) jSONObject3);
        arrayList.add(new ir(jSONObject));
        arrayList.add(new ir(jSONObject2));
        return arrayList;
    }

    public View N(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.fl_live_photo_video_frame_container) {
            PreRenderManager g = PreRenderManager.g(this.mContext);
            if (g != null) {
                view = g.j(this.mContext, R.layout.tt_detail_live_photo_video_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_live_photo_video_component, (ViewGroup) null);
            }
        }
        LivePhotoVideoView livePhotoVideoView = (LivePhotoVideoView) view.findViewById(R.id.vv_live_photo_video_content);
        TTObservedImageView coverImageView = livePhotoVideoView.getCoverImageView();
        coverImageView.setObserveListener(this.c);
        coverImageView.setOnClickListener(new a());
        livePhotoVideoView.bindData(this.mComponentData, this.mDetailContext);
        livePhotoVideoView.setLivePhotoExposureListener(this.g);
        livePhotoVideoView.setVideoOnClickListener(this.h);
        if (this.f) {
            livePhotoVideoView.showCoverImage();
            livePhotoVideoView.switchToPauseUI();
            this.f = false;
        }
        ExtraHeightLinearLayout extraHeightLinearLayout = (ExtraHeightLinearLayout) view.findViewById(R.id.tiv_live_photo_mask_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.tiv_live_photo_mask);
        boolean R = R();
        if (!R) {
            i = 8;
        }
        extraHeightLinearLayout.setVisibility(i);
        if (R) {
            int c2 = rua.c(this.mContext, this.mDetailContext.g().o(), (wua) this.mDetailContext.e().e(a4a.PARSER_ID));
            extraHeightLinearLayout.setExtraHeight(c2);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = c2;
            imageView.setLayoutParams(layoutParams);
            U(livePhotoVideoView.getThumbnailUrl(), imageView, c2);
        } else {
            cg2.p(this.mDetailContext.i().b(), imageView, null, 0, 0, false);
        }
        this.e = livePhotoVideoView;
        return view;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            return livePhotoVideoView.getVideoId();
        }
        return rcw.i(this.mComponentData);
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            return livePhotoVideoView.getVideoUrl();
        }
        return rcw.k(this.mComponentData);
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68ec0716", new Object[]{this})).booleanValue();
        }
        return rua.h(this.mContext, (wua) this.mDetailContext.e().e(a4a.PARSER_ID));
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2db6469", new Object[]{this});
            return;
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            livePhotoVideoView.hideAttachedVideoLastFrame();
        }
    }

    public final boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c8f7de5", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) q84.g(this.mContext, new c8n());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void U(String str, ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f9dce1", new Object[]{this, str, imageView, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
            tgh.b("LivePhotoComponent", "loadBgMask url is empty");
        } else {
            cg2.p(this.mDetailContext.i().b(), imageView, str, rua.e(this.mContext, C()), i, false);
        }
    }

    @Override // tb.s8e
    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82285ae", new Object[]{this, new Boolean(z)});
            return;
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null && TextUtils.equals(livePhotoVideoView.getVideoUniqueIdentifier(), rcw.j(this.mComponentData))) {
            if (!this.e.isBuildInCoverVisible()) {
                s();
                this.e.hideCoverImage();
            } else {
                this.e.showCoverImage();
            }
            if (z || this.e.isVideoPlaying()) {
                this.e.switchToPlayUI();
            } else {
                this.e.switchToPauseUI();
            }
        }
    }

    @Override // tb.oa4
    public void disAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
        } else {
            super.disAppear();
        }
    }

    @Override // tb.d8c
    public Rect f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        View view = this.mView;
        if (view == null || view.getWindowToken() == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], this.mView.getWidth() + i, iArr[1] + this.mView.getHeight());
    }

    @Override // tb.s8e
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue();
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView == null || !livePhotoVideoView.isVideoPlaying()) {
            return false;
        }
        return true;
    }

    @Override // tb.s8e
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d550bb4", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            return f.getString("thumbnailDimension");
        }
        return null;
    }

    @Override // tb.s8e
    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07ba8b3", new Object[]{this});
        } else if (!T() && !J()) {
            S();
        }
    }

    @Override // tb.s8e
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38969940", new Object[]{this});
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            return livePhotoVideoView.getThumbnailUrl();
        }
        return rcw.g(this.mComponentData);
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        Object data = getData("isGalleryScrollMode");
        if (!(data instanceof Boolean) || !((Boolean) data).booleanValue()) {
            L();
        }
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        pauseVideo();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return N(view);
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.d;
    }

    @Override // tb.oa4
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        K();
    }

    @Override // tb.s8e
    public final boolean pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf673230", new Object[]{this})).booleanValue();
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            return livePhotoVideoView.pause();
        }
        return false;
    }

    @Override // tb.s8e
    public final boolean playVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce4535ea", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            return livePhotoVideoView.play(z);
        }
        return false;
    }

    @Override // tb.s8e
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e6c3ec", new Object[]{this})).booleanValue();
        }
        LivePhotoVideoView livePhotoVideoView = this.e;
        if (livePhotoVideoView != null) {
            return livePhotoVideoView.attachVideoLastFrame();
        }
        return false;
    }

    @Override // tb.u3a
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2c1fb0f", new Object[]{this});
        }
        String o = o();
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        String Q = Q();
        if (TextUtils.isEmpty(Q)) {
            return P();
        }
        return Q;
    }

    public final void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a74aeab", new Object[]{this, new Boolean(z)});
        } else {
            q84.f(this.mContext, new rc7("userTrack", new JSONObject(z) { // from class: com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent.3
                public final /* synthetic */ boolean val$byManual;

                {
                    String str;
                    this.val$byManual = z;
                    put("eventId", "2101");
                    put("arg1", "Page_Detail_Button_DetailGifPlay_industry");
                    JSONObject c2 = UtUtils.c(LivePhotoComponent.this.mDetailContext.e());
                    c2.put("spm", (Object) "a2141.7631564.detailpic");
                    JSONObject B = LivePhotoComponent.this.B();
                    if (B != null) {
                        c2.putAll(B);
                    }
                    if (z) {
                        str = BizTaskData.MANUAL_TIME;
                    } else {
                        str = "auto";
                    }
                    c2.put("playType", (Object) str);
                    put("args", (Object) c2);
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    public final void O(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8ecdaf", new Object[]{this, view});
        } else if (view != null) {
            sx9 sx9Var = (sx9) getParentComponent();
            String g = sx9Var != null ? ((tx9) sx9Var.getComponentData()).g() : null;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            AbilityCenter b2 = this.mDetailContext.b();
            List<ir> M = M();
            RuntimeAbilityParam runtimeAbilityParam = new RuntimeAbilityParam(y3l.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.VIDEO_COMPONENT);
            RuntimeAbilityParam runtimeAbilityParam2 = new RuntimeAbilityParam(y3l.KEY_FRAME_COMPONENT_ID, g);
            int i = iArr[0];
            b2.g(M, appendTriggerComponent(false, runtimeAbilityParam, runtimeAbilityParam2, new RuntimeAbilityParam(y3l.KEY_TRIGGER_VIEW_RECT, new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()))));
        }
    }
}
