package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.ExtraHeightLinearLayout;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.android.detail.ttdetail.widget.video.NormalVideoView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.a4a;
import tb.c8n;
import tb.cg2;
import tb.d8c;
import tb.ir;
import tb.nb4;
import tb.oqv;
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
import tb.vbl;
import tb.wua;
import tb.xau;
import tb.y3l;
import tb.ze7;
import tb.zy9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VideoComponent extends u3a implements d8c, s8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public NormalVideoView e;
    public VideoView.d g;
    public final zy9 d = new zy9(-1, -1, 17);
    public volatile boolean f = true;
    public final NormalVideoView.l h = new a();
    public final NormalVideoView.k i = new b();
    public final VideoView.g j = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements NormalVideoView.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(NormalVideoView normalVideoView, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36dcee99", new Object[]{this, normalVideoView, new Boolean(z)});
                return;
            }
            q84.f(VideoComponent.this.mContext, new oqv(z, VideoComponent.this.S()));
            VideoComponent.this.c0(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements NormalVideoView.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.k
        public void a(NormalVideoView normalVideoView, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a1aa37", new Object[]{this, normalVideoView, new Boolean(z)});
            } else {
                VideoComponent.this.b0(z);
            }
        }
    }

    static {
        t2o.a(912261451);
        t2o.a(912263016);
        t2o.a(912261428);
    }

    public VideoComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ boolean H(VideoComponent videoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c579c4a", new Object[]{videoComponent})).booleanValue();
        }
        return videoComponent.W();
    }

    public static /* synthetic */ List I(VideoComponent videoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4563c60", new Object[]{videoComponent});
        }
        return videoComponent.M();
    }

    public static /* synthetic */ Object ipc$super(VideoComponent videoComponent, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/VideoComponent");
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
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null && !(z = normalVideoView.attachDwInstanceView())) {
            V();
        }
        return z;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ab5edc", new Object[]{this});
        } else if (!X()) {
            J();
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbac91e", new Object[]{this});
        } else if (!this.mDetailContext.e().o() && W() && !X()) {
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
        jSONObject3.put("arg1", (Object) "Page_Detail_Button_DetailVideo_industry");
        jSONObject3.put("eventId", (Object) "2101");
        jSONObject3.put("page", (Object) "Page_Detail");
        JSONObject c2 = UtUtils.c(this.mDetailContext.e());
        c2.put("spm", (Object) "a2141.7631564.detailpic");
        c2.putAll(B());
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
        if (view == null || view.getId() != R.id.fl_video_frame_container) {
            PreRenderManager g = PreRenderManager.g(this.mContext);
            if (g != null) {
                view = g.j(this.mContext, R.layout.tt_detail_video_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_video_component, (ViewGroup) null);
            }
        }
        NormalVideoView normalVideoView = (NormalVideoView) view.findViewById(R.id.vv_video_content);
        ImageView coverImageView = normalVideoView.getCoverImageView();
        if (coverImageView instanceof TTObservedImageView) {
            ((TTObservedImageView) coverImageView).setObserveListener(this.c);
        }
        normalVideoView.bindData(this.mComponentData, this.mDetailContext, new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.VideoComponent.1
            {
                put("videoAutoPlay", String.valueOf(VideoComponent.H(VideoComponent.this)));
            }
        });
        normalVideoView.setOnUserClickPlay(this.h);
        normalVideoView.setOnMuteClick(this.i);
        normalVideoView.setVideoOnClickListener(this.j);
        normalVideoView.setVideoLifecycleListener(this.g);
        if (this.f) {
            normalVideoView.showCoverImage();
            normalVideoView.switchToPauseUI();
            this.f = false;
        }
        ExtraHeightLinearLayout extraHeightLinearLayout = (ExtraHeightLinearLayout) view.findViewById(R.id.tiv_mask_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.tiv_mask);
        boolean U = U();
        if (!U) {
            i = 8;
        }
        extraHeightLinearLayout.setVisibility(i);
        if (U) {
            normalVideoView.setForceHideMiniProgressBar(true);
            int c2 = rua.c(this.mContext, this.mDetailContext.g().o(), (wua) this.mDetailContext.e().e(a4a.PARSER_ID));
            extraHeightLinearLayout.setExtraHeight(c2);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = c2;
            imageView.setLayoutParams(layoutParams);
            Y(normalVideoView.getThumbnailUrl(), imageView, c2);
        } else {
            cg2.p(this.mDetailContext.i().b(), imageView, null, 0, 0, false);
        }
        this.e = normalVideoView;
        return view;
    }

    public String O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("955fe42f", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "Page_Detail_Button-VideoPlay";
        }
        return "Page_Detail_Button-VideoPause";
    }

    public FrameLayout P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d41fc862", new Object[]{this});
        }
        return this.e.getExtraView();
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return NormalVideoView.getVideoId(this.mComponentData);
    }

    public String R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b059e5d6", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "Page_Detail_Button-VoiceOff";
        }
        return "Page_Detail_Button-VoiceOn";
    }

    public String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af8041a", new Object[]{this});
        }
        return NormalVideoView.getVideoUniqueIdentifier(this.mComponentData);
    }

    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        return NormalVideoView.getVideoUrl(this.mComponentData);
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68ec0716", new Object[]{this})).booleanValue();
        }
        return rua.h(this.mContext, (wua) this.mDetailContext.e().e(a4a.PARSER_ID));
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2db6469", new Object[]{this});
            return;
        }
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null) {
            normalVideoView.hideAttachedVideoLastFrame();
        }
    }

    public final boolean W() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51e20539", new Object[]{this})).booleanValue();
        }
        boolean e = com.taobao.android.detail.ttdetail.widget.video.a.d().e(this.mContext);
        Feature feature = (Feature) this.mDetailContext.e().f(Feature.class);
        if (rcw.b(this.mContext, feature) || e) {
            z = true;
        } else {
            z = false;
        }
        boolean m = rcw.m(feature);
        if (!z || m) {
            return false;
        }
        return true;
    }

    public final boolean X() {
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

    public final void Y(String str, ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f9dce1", new Object[]{this, str, imageView, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
            tgh.b("VideoComponent", "loadBgMask url is empty");
        } else {
            cg2.p(this.mDetailContext.i().b(), imageView, str, rua.e(this.mContext, C()), i, false);
        }
    }

    public void Z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cc45b9", new Object[]{this, new Float(f)});
            return;
        }
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null) {
            normalVideoView.setControllerAlpha(f);
        }
    }

    public void a0(VideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f338496", new Object[]{this, dVar});
            return;
        }
        this.g = dVar;
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null) {
            normalVideoView.setVideoLifecycleListener(dVar);
        }
    }

    public void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e0acf5", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject c2 = UtUtils.c(this.mDetailContext.e());
        c2.putAll(B());
        UtUtils.f(2101, O(z), c2);
    }

    @Override // tb.s8e
    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82285ae", new Object[]{this, new Boolean(z)});
            return;
        }
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null && TextUtils.equals(normalVideoView.getVideoUniqueIdentifier(), NormalVideoView.getVideoUniqueIdentifier(this.mComponentData))) {
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

    public final void d0(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbc9d2e", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject c2 = UtUtils.c(this.mDetailContext.e());
        c2.putAll(B());
        if (z) {
            str = BizTaskData.MANUAL_TIME;
        } else {
            str = "auto";
        }
        c2.put("playType", (Object) str);
        UtUtils.h(2101, "DetailVideoPlay_industry", c2);
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
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView == null || !normalVideoView.isVideoPlaying()) {
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
        } else if (!X() && !J()) {
            V();
        }
    }

    @Override // tb.s8e
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38969940", new Object[]{this});
        }
        return NormalVideoView.getThumbnailUrl(this.mComponentData);
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
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null) {
            return normalVideoView.pause();
        }
        return false;
    }

    @Override // tb.s8e
    public final boolean playVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce4535ea", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        d0(z);
        return this.e.play();
    }

    @Override // tb.s8e
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e6c3ec", new Object[]{this})).booleanValue();
        }
        NormalVideoView normalVideoView = this.e;
        if (normalVideoView != null) {
            return normalVideoView.attachVideoLastFrame();
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
        String T = T();
        if (TextUtils.isEmpty(T)) {
            return Q();
        }
        return T;
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b29236e", new Object[]{this, new Boolean(z)});
        } else {
            q84.f(this.mContext, new rc7("userTrack", new JSONObject(z) { // from class: com.taobao.android.detail.ttdetail.component.module.VideoComponent.4
                public final /* synthetic */ boolean val$toMute;

                {
                    this.val$toMute = z;
                    put("eventId", "2101");
                    put("arg1", (Object) VideoComponent.this.R(z));
                    put("args", (Object) VideoComponent.this.B());
                }
            }, new RuntimeAbilityParam[0]));
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
            if (!VideoComponent.this.g()) {
                return true;
            }
            sx9 sx9Var = (sx9) VideoComponent.this.getParentComponent();
            String g = sx9Var != null ? ((tx9) sx9Var.getComponentData()).g() : null;
            int[] iArr = new int[2];
            videoView.getLocationOnScreen(iArr);
            if (vbl.u()) {
                AbilityCenter b = VideoComponent.this.mDetailContext.b();
                List<ir> I = VideoComponent.I(VideoComponent.this);
                VideoComponent videoComponent = VideoComponent.this;
                RuntimeAbilityParam runtimeAbilityParam = new RuntimeAbilityParam(y3l.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.VIDEO_COMPONENT);
                RuntimeAbilityParam runtimeAbilityParam2 = new RuntimeAbilityParam(y3l.KEY_FRAME_COMPONENT_ID, g);
                int i = iArr[0];
                b.g(I, videoComponent.appendTriggerComponent(false, runtimeAbilityParam, runtimeAbilityParam2, new RuntimeAbilityParam(y3l.KEY_TRIGGER_VIEW_RECT, new Rect(i, iArr[1], i + videoView.getWidth(), iArr[1] + videoView.getHeight()))));
            } else {
                VideoComponent videoComponent2 = VideoComponent.this;
                RuntimeAbilityParam runtimeAbilityParam3 = new RuntimeAbilityParam(y3l.KEY_OPEN_SOURCE, ShowLightOffMessage.Source.VIDEO_COMPONENT);
                RuntimeAbilityParam runtimeAbilityParam4 = new RuntimeAbilityParam(y3l.KEY_FRAME_COMPONENT_ID, g);
                int i2 = iArr[0];
                videoComponent2.triggerClickEvent(runtimeAbilityParam3, runtimeAbilityParam4, new RuntimeAbilityParam(y3l.KEY_TRIGGER_VIEW_RECT, new Rect(i2, iArr[1], videoView.getWidth() + i2, iArr[1] + videoView.getHeight())));
            }
            return true;
        }
    }
}
