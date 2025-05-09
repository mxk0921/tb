package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.RatioFrameLayout;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.b5m;
import tb.cbw;
import tb.ksk;
import tb.mpe;
import tb.nb4;
import tb.rcw;
import tb.t2o;
import tb.tq4;
import tb.tx9;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MiniVideoView extends AbsMiniVideoView<tx9> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_SOURCE = "source";
    private static final String KEY_THUMBNAIL_URL = "thumbnailUrl";
    private static final String KEY_VIDEO_ID = "videoId";
    private static final String KEY_VIDEO_TYPE = "videoType";
    private static final String KEY_VIDEO_URL = "videoUrl";
    private View mClickMask;
    private View mCloseBtn;
    private boolean mCoverHiding;
    private ImageView mCoverImageView;
    private View mGradientView;
    private RatioFrameLayout mLayout;
    private ConstraintLayout mRootLayout;
    private TextView mTvVideoType;
    private VideoView mVideoView;
    private List<f> mVideoDataList = new ArrayList(0);
    private String mRealDimensionRatio = cbw.VALUE_THREE_FOUR_RATIO;
    private TTImageUrlView.a mCoverVisibilityChangeListener = new d();
    private VideoView.d mSimpleVideoLifecycleListener = new e();

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
                return;
            }
            ksk kskVar = MiniVideoView.this.mOnMiniVideoListener;
            if (kskVar != null) {
                kskVar.b(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MiniVideoView miniVideoView = MiniVideoView.this;
            if (miniVideoView.mOnMiniVideoListener != null) {
                f access$100 = MiniVideoView.access$100(miniVideoView, MiniVideoView.access$000(miniVideoView).getVideoUniqueIdentifier());
                MiniVideoView miniVideoView2 = MiniVideoView.this;
                ksk kskVar = miniVideoView2.mOnMiniVideoListener;
                if (access$100 != null) {
                    str = access$100.f;
                } else {
                    str = null;
                }
                kskVar.a(miniVideoView2, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                MiniVideoView.access$200(MiniVideoView.this).setVisibility(8);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements TTImageUrlView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
        public void a(TTImageUrlView tTImageUrlView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bab7d67b", new Object[]{this, tTImageUrlView, new Integer(i)});
            } else if (i == 8 || i == 4) {
                MiniVideoView.access$300(MiniVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends VideoView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -742210244) {
                super.onVideoComplete();
                return null;
            } else if (hashCode == 1266309869) {
                super.onVideoInfo(objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/video/MiniVideoView$5");
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            super.onVideoComplete();
            MiniVideoView miniVideoView = MiniVideoView.this;
            f access$400 = MiniVideoView.access$400(miniVideoView, MiniVideoView.access$000(miniVideoView).getVideoUniqueIdentifier());
            if (access$400 != null) {
                MiniVideoView.access$500(MiniVideoView.this, access$400);
            }
            MiniVideoView.access$000(MiniVideoView.this).play();
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            super.onVideoInfo(obj, i, i2);
            if (i == 12100) {
                MiniVideoView.access$300(MiniVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f7053a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        static {
            t2o.a(912263121);
        }

        public f(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f7053a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }
    }

    static {
        t2o.a(912263115);
    }

    public MiniVideoView(Context context) {
        super(context);
        initViews();
    }

    public static /* synthetic */ VideoView access$000(MiniVideoView miniVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView) ipChange.ipc$dispatch("a1deedea", new Object[]{miniVideoView});
        }
        return miniVideoView.mVideoView;
    }

    public static /* synthetic */ f access$100(MiniVideoView miniVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f74bc060", new Object[]{miniVideoView, str});
        }
        return miniVideoView.getCurrentVideoData(str);
    }

    public static /* synthetic */ ImageView access$200(MiniVideoView miniVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("85c73ca5", new Object[]{miniVideoView});
        }
        return miniVideoView.mCoverImageView;
    }

    public static /* synthetic */ void access$300(MiniVideoView miniVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdd9dea", new Object[]{miniVideoView});
        } else {
            miniVideoView.hideCoverImage();
        }
    }

    public static /* synthetic */ f access$400(MiniVideoView miniVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5d1a997d", new Object[]{miniVideoView, str});
        }
        return miniVideoView.getNextVideoData(str);
    }

    public static /* synthetic */ void access$500(MiniVideoView miniVideoView, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d548c92", new Object[]{miniVideoView, fVar});
        } else {
            miniVideoView.setMiniVideoData(fVar);
        }
    }

    private f getCurrentVideoData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c202033d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.mVideoDataList.isEmpty()) {
            return null;
        }
        for (f fVar : this.mVideoDataList) {
            if (TextUtils.equals(rcw.a(fVar.c, fVar.b), str)) {
                return fVar;
            }
        }
        return null;
    }

    private f getNextVideoData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3ef99d57", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.mVideoDataList.isEmpty()) {
            return null;
        }
        int size = this.mVideoDataList.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.mVideoDataList.get(i);
            if (TextUtils.equals(rcw.a(fVar.c, fVar.b), str)) {
                int i2 = i + 1;
                if (i2 < size) {
                    return this.mVideoDataList.get(i2);
                }
                return this.mVideoDataList.get(0);
            }
        }
        return null;
    }

    private void hideCoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f30604d", new Object[]{this});
        } else if (!this.mCoverHiding && this.mCoverImageView.getVisibility() != 8) {
            this.mCoverHiding = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(168L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setAnimationListener(new c());
            this.mCoverImageView.startAnimation(alphaAnimation);
        }
    }

    private void initViews() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        PreRenderManager g = PreRenderManager.g(tq4.d(this));
        if (g != null) {
            view = g.j(tq4.d(this), R.layout.tt_detail_mini_video_container, this, true);
        } else {
            view = LayoutInflater.from(tq4.d(this)).inflate(R.layout.tt_detail_mini_video_container, (ViewGroup) this, false);
        }
        addView(view, new FrameLayout.LayoutParams(-1, -2));
        this.mRootLayout = (ConstraintLayout) view.findViewById(R.id.cl_root_container);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) view.findViewById(R.id.rfl_constraint_container);
        this.mLayout = ratioFrameLayout;
        ratioFrameLayout.setWHRatio(this.mRealDimensionRatio);
        ImageView imageView = (ImageView) view.findViewById(R.id.tiv_cover);
        this.mCoverImageView = imageView;
        imageView.setBackgroundColor(0);
        this.mVideoView = (VideoView) view.findViewById(R.id.vv_actually_video_view);
        this.mGradientView = view.findViewById(R.id.v_video_view_bg_gradient);
        this.mVideoView.setVideoLifecycleListener(this.mSimpleVideoLifecycleListener);
        this.mVideoView.setVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        this.mVideoView.setShowNotWifiHint(false);
        this.mVideoView.setMute(true);
        this.mCloseBtn = view.findViewById(R.id.view_close);
        this.mClickMask = view.findViewById(R.id.view_click_mask);
        this.mTvVideoType = (TextView) view.findViewById(R.id.tv_video_type);
        ViewProxy.setOnClickListener(this.mCloseBtn, new a());
        ViewProxy.setOnClickListener(this.mClickMask, new b());
    }

    public static /* synthetic */ Object ipc$super(MiniVideoView miniVideoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/MiniVideoView");
    }

    private boolean play() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue() : play(null, null);
    }

    private void setVideoTypeText(String str) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9551e71", new Object[]{this, str});
            return;
        }
        TextView textView = this.mTvVideoType;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        textView.setText(str2);
        View view = this.mGradientView;
        if (TextUtils.isEmpty(str)) {
            i = 4;
        }
        view.setVisibility(i);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void attachVideoLastFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09c3b2", new Object[]{this, str});
            return;
        }
        f currentVideoData = getCurrentVideoData(str);
        if (currentVideoData != null) {
            setMiniVideoData(currentVideoData);
            this.mVideoView.attachDwInstanceLastFrame();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void detachVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d239f174", new Object[]{this});
        } else {
            this.mVideoView.detachDwInstanceView();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public Rect getContentScreenRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        int[] iArr = new int[2];
        this.mVideoView.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], this.mVideoView.getWidth() + i, iArr[1] + this.mVideoView.getHeight());
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public Map<String, String> getVideoInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dece48cf", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoId", this.mVideoView.getVideoId());
        hashMap.put("videoUrl", this.mVideoView.getVideoUrl());
        return hashMap;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        return this.mVideoView.pause();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean playWithUniqueIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e861d29", new Object[]{this, str})).booleanValue();
        }
        if (this.mVideoDataList.isEmpty()) {
            return false;
        }
        closeGlobalLiveVideoView();
        if (!TextUtils.isEmpty(str) || !this.mVideoView.isVideoPlaying()) {
            if (TextUtils.isEmpty(str)) {
                setMiniVideoData(this.mVideoDataList.get(0));
            } else if (!TextUtils.equals(str, this.mVideoView.getVideoUniqueIdentifier())) {
                Iterator<f> it = this.mVideoDataList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        f next = it.next();
                        if (TextUtils.equals(str, rcw.a(next.c, next.b))) {
                            setMiniVideoData(next);
                            break;
                        }
                    } else if (!this.mVideoView.isVideoPlaying()) {
                        setMiniVideoData(this.mVideoDataList.get(0));
                    }
                }
            }
        }
        this.mVideoView.setMute(true);
        return this.mVideoView.play();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void setVideoData(List<tx9> list) {
        nb4 t;
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a80b87b", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            String str = this.mRealDimensionRatio;
            this.mVideoDataList.clear();
            for (tx9 tx9Var : list) {
                if (!(tx9Var == null || (t = tx9Var.t()) == null || (f2 = t.f()) == null || f2.isEmpty())) {
                    String string = f2.getString("source");
                    String string2 = f2.getString("videoId");
                    String string3 = f2.getString("videoUrl");
                    String string4 = f2.getString("videoType");
                    String string5 = f2.getString(KEY_THUMBNAIL_URL);
                    String g = tx9Var.g();
                    if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
                        this.mVideoDataList.add(new f(string, string2, string3, string4, string5, g));
                    }
                    str = tx9Var.u();
                    this.mRealDimensionRatio = str;
                }
            }
            if ("1:1".equalsIgnoreCase(this.mRealDimensionRatio) || TextUtils.isEmpty(this.mRealDimensionRatio)) {
                str = cbw.VALUE_THREE_FOUR_RATIO;
            }
            this.mLayout.setWHRatio(str);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean play(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d49d8953", new Object[]{this, str, str2})).booleanValue() : playWithUniqueIdentifier(rcw.a(str, str2));
    }

    private void setMiniVideoData(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc41427", new Object[]{this, fVar});
        } else if (fVar != null) {
            HashMap<String, String> hashMap = new HashMap<>(0);
            ze7 ze7Var = this.mDetailContext;
            if (ze7Var != null) {
                hashMap = rcw.h(ze7Var.e());
            }
            hashMap.put("videoAutoPlay", "true");
            if (!TextUtils.isEmpty(fVar.f7053a)) {
                hashMap.put("spm-cnt", b5m.K().b());
                hashMap.put("source", fVar.f7053a);
                hashMap.put("content_id", fVar.b);
            }
            this.mVideoView.setVideoData(fVar.b, fVar.c, fVar.e, this.mRealDimensionRatio, hashMap);
            setVideoTypeText(fVar.d);
            if (!this.mCoverHiding && this.mCoverImageView.getVisibility() == 0) {
                if (!this.mVideoView.isBuildInCoverVisible()) {
                    hideCoverImage();
                } else {
                    mpe.r(this.mCoverImageView, this.mVideoView.getThumbnailUrl(), true);
                }
            }
        }
    }

    public MiniVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews();
    }

    public MiniVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();
    }
}
