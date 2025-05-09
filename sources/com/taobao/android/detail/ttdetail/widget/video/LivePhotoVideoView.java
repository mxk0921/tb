package com.taobao.android.detail.ttdetail.widget.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.b5m;
import tb.eo7;
import tb.hl6;
import tb.l38;
import tb.lg7;
import tb.mpe;
import tb.mr7;
import tb.nb4;
import tb.q84;
import tb.rc7;
import tb.rcw;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.tx9;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LivePhotoVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GIF_ANIMATION_COUNT = "gif_anim_count";
    private static final String GIF_ANIMATION_FIRST_TIME = "gif_anim_first_time";
    private static final String GIF_FEEDBACK_COUNT = "gif_feedback_count";
    private static final String KEY_SOURCE = "source";
    private static final String KEY_THUMBNAIL_URL = "thumbnailUrl";
    private static final String KEY_VIDEO_ID = "videoId";
    private static final String KEY_VIDEO_URL = "videoUrl";
    private static final String PLAY_BTN_STATE = "play_btn_state";
    private static final String TAG = "LivePhotoVideoView";
    private nb4 mComponentData;
    private Context mContext;
    private TTObservedImageView mCoverImageView;
    private ze7 mDetailContext;
    private FrameLayout mFloatView;
    private i mLivePhotoExposureListener;
    private ImageView mPlayBtn;
    private LinearLayout mPlayLayout;
    private String mThumbnailUrl;
    private String mVideoId;
    private VideoView.g mVideoOnClickListener;
    private String mVideoUrl;
    private VideoView mVideoView;
    private TTImageUrlView.a mCoverVisibilityChangeListener = new e();
    private VideoView.c mVideoViewChangeListener = new f();
    private VideoView.d mSimpleVideoLifecycleListener = new g();
    private VideoView.g mVideoViewOnClickListener = new h();

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
                LivePhotoVideoView.access$000(LivePhotoVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7041a;

        public c(View view) {
            this.f7041a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            View view = this.f7041a;
            if (view != null && view.getVisibility() != 8) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = this.f7041a.getLayoutParams();
                layoutParams.width = intValue;
                this.f7041a.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7042a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
                d dVar = d.this;
                LivePhotoVideoView.access$300(LivePhotoVideoView.this, dVar.f7042a);
            }
        }

        public d(View view) {
            this.f7042a = view;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/LivePhotoVideoView$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            LivePhotoVideoView.access$400(LivePhotoVideoView.this).h().h(new a(), 1000L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements TTImageUrlView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
        public void a(TTImageUrlView tTImageUrlView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bab7d67b", new Object[]{this, tTImageUrlView, new Integer(i)});
            } else if (!LivePhotoVideoView.access$500(LivePhotoVideoView.this).isVideoViewAttached()) {
            } else {
                if (i == 8 || i == 4) {
                    LivePhotoVideoView.this.hideCoverImage();
                } else if (i == 0) {
                    LivePhotoVideoView.this.showCoverImage();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements VideoView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a2838c", new Object[]{this, view});
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.c
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9a0d32c", new Object[]{this, view});
            } else if (LivePhotoVideoView.access$500(LivePhotoVideoView.this).isVideoViewAttached()) {
                LivePhotoVideoView.access$600(LivePhotoVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g extends VideoView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/LivePhotoVideoView$7");
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            LivePhotoVideoView.this.switchToPauseUI();
            LivePhotoVideoView.access$700(LivePhotoVideoView.this, true);
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (i == 12100) {
                LivePhotoVideoView.this.switchToPlayUI();
                LivePhotoVideoView.this.hideCoverImage();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                LivePhotoVideoView.this.switchToPauseUI();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else {
                LivePhotoVideoView.this.switchToPlayUI();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else {
                LivePhotoVideoView.this.switchToPlayUI();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements VideoView.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.g
        public boolean a(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93db45c3", new Object[]{this, videoView})).booleanValue();
            }
            if (LivePhotoVideoView.access$800(LivePhotoVideoView.this) != null) {
                LivePhotoVideoView.access$800(LivePhotoVideoView.this).a(videoView);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface i {
    }

    static {
        t2o.a(912263102);
    }

    public LivePhotoVideoView(Context context) {
        super(context);
        initControllerUI(context);
    }

    public static /* synthetic */ void access$000(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8080", new Object[]{livePhotoVideoView});
        } else {
            livePhotoVideoView.clickPlayIcon();
        }
    }

    public static /* synthetic */ FrameLayout access$100(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("95cf8", new Object[]{livePhotoVideoView});
        }
        return livePhotoVideoView.mFloatView;
    }

    public static /* synthetic */ Context access$200(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5c27cefa", new Object[]{livePhotoVideoView});
        }
        return livePhotoVideoView.mContext;
    }

    public static /* synthetic */ void access$300(LivePhotoVideoView livePhotoVideoView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151a032f", new Object[]{livePhotoVideoView, view});
        } else {
            livePhotoVideoView.hidePlayIconAnimation(view);
        }
    }

    public static /* synthetic */ ze7 access$400(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("b50959f6", new Object[]{livePhotoVideoView});
        }
        return livePhotoVideoView.mDetailContext;
    }

    public static /* synthetic */ VideoView access$500(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView) ipChange.ipc$dispatch("92aa1222", new Object[]{livePhotoVideoView});
        }
        return livePhotoVideoView.mVideoView;
    }

    public static /* synthetic */ void access$600(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36158106", new Object[]{livePhotoVideoView});
        } else {
            livePhotoVideoView.syncControllerState();
        }
    }

    public static /* synthetic */ void access$700(LivePhotoVideoView livePhotoVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb27fed", new Object[]{livePhotoVideoView, new Boolean(z)});
        } else {
            livePhotoVideoView.setPlayIconState(z);
        }
    }

    public static /* synthetic */ VideoView.g access$800(LivePhotoVideoView livePhotoVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView.g) ipChange.ipc$dispatch("7402b210", new Object[]{livePhotoVideoView});
        }
        return livePhotoVideoView.mVideoOnClickListener;
    }

    private boolean autoPlay() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("658c788e", new Object[]{this})).booleanValue();
        }
        boolean f2 = rcw.f(this.mDetailContext);
        trackPlayIconExposure(f2);
        setPlayIconState(f2);
        if (f2) {
            z = playLivePhoto(false);
        } else {
            showCoverImage();
            showPlayIconAnimation(this.mPlayLayout);
        }
        updateFloatView();
        return z;
    }

    private ValueAnimator createPlayIconAnimation(View view, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("c1ab29b4", new Object[]{this, view, new Integer(i2), new Integer(i3)});
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        ofInt.setDuration(600L);
        ofInt.addUpdateListener(new c(view));
        return ofInt;
    }

    private boolean enableShowPlayIconAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0b78a02", new Object[]{this})).booleanValue();
        }
        long e2 = lg7.e(this.mContext, GIF_ANIMATION_FIRST_TIME);
        if (e2 < 0) {
            lg7.k(this.mContext, GIF_ANIMATION_FIRST_TIME, SystemClock.uptimeMillis());
            lg7.j(this.mContext, GIF_ANIMATION_COUNT, 1);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            int c2 = lg7.c(this.mContext, GIF_ANIMATION_COUNT);
            if (c2 >= 3) {
                return false;
            }
            if (c2 >= 1) {
                if (uptimeMillis - e2 <= 604800000) {
                    return false;
                }
                lg7.j(this.mContext, GIF_ANIMATION_COUNT, c2 + 1);
                lg7.k(this.mContext, GIF_ANIMATION_FIRST_TIME, SystemClock.uptimeMillis());
            }
        }
        return true;
    }

    private JSONObject getFeedbackFloatData() {
        JSONObject f2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("54461392", new Object[]{this});
        }
        nb4 nb4Var = this.mComponentData;
        if (nb4Var == null || (f2 = nb4Var.f()) == null || (jSONObject = f2.getJSONObject("extra")) == null || (jSONObject2 = jSONObject.getJSONObject("feedback")) == null || jSONObject2.getJSONObject("template") == null) {
            return null;
        }
        return jSONObject2;
    }

    private String getVideoDimension(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85dfe53c", new Object[]{this, nb4Var});
        }
        if (nb4Var != null && (nb4Var instanceof tx9)) {
            return ((tx9) nb4Var).u();
        }
        return null;
    }

    private void hidePlayIconAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6087da36", new Object[]{this, view});
        } else if (view != null && view.getVisibility() == 0) {
            createPlayIconAnimation(view, mr7.a(108.0f), mr7.a(30.0f)).start();
        }
    }

    private void initControllerUI(Context context) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac620c1", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        PreRenderManager g2 = PreRenderManager.g(tq4.d(this));
        if (g2 != null) {
            view = g2.j(tq4.d(this), R.layout.tt_detail_live_photo_video_controller, this, true);
        } else {
            view = LayoutInflater.from(tq4.d(this)).inflate(R.layout.tt_detail_live_photo_video_controller, (ViewGroup) this, false);
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        VideoView videoView = (VideoView) view.findViewById(R.id.vv_live_photo_video_view);
        this.mVideoView = videoView;
        videoView.setVideoLifecycleListener(this.mSimpleVideoLifecycleListener);
        this.mVideoView.setVideoViewOnClickListener(this.mVideoViewOnClickListener);
        this.mVideoView.setVideoViewChangeListener(this.mVideoViewChangeListener);
        this.mVideoView.setVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        TTObservedImageView tTObservedImageView = (TTObservedImageView) view.findViewById(R.id.tiv_live_photo_cover);
        this.mCoverImageView = tTObservedImageView;
        tTObservedImageView.setBackgroundColor(-1);
        this.mPlayLayout = (LinearLayout) view.findViewById(R.id.iv_live_photo_play_hint);
        this.mPlayBtn = (ImageView) view.findViewById(R.id.iv_live_photo_play_btn);
        this.mFloatView = (FrameLayout) view.findViewById(R.id.iv_live_photo_float_view);
        this.mPlayLayout.setOnClickListener(new a());
    }

    public static /* synthetic */ Object ipc$super(LivePhotoVideoView livePhotoVideoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/LivePhotoVideoView");
    }

    private boolean playByManual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68cb725c", new Object[]{this})).booleanValue();
        }
        setPlayIconState(true);
        return playLivePhoto(true);
    }

    private boolean playLivePhoto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e4929f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        attachDwInstanceView();
        boolean play = this.mVideoView.play();
        if (!this.mVideoView.isNewPlayer()) {
            syncControllerState();
        }
        i iVar = this.mLivePhotoExposureListener;
        if (iVar != null) {
            ((LivePhotoComponent.b) iVar).a(z);
        }
        return play;
    }

    private void setPlayIconState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea052eb", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.mPlayBtn.setContentDescription(this.mContext.getResources().getString(R.string.tt_detail_content_description_gif_open));
            this.mPlayBtn.setImageResource(R.drawable.tt_detail_live_photo_play_bg);
        } else {
            this.mPlayBtn.setContentDescription(this.mContext.getResources().getString(R.string.tt_detail_content_description_gif_close));
            this.mPlayBtn.setImageResource(R.drawable.tt_detail_live_photo_stop_bg);
        }
        this.mDetailContext.i().f(PLAY_BTN_STATE, Boolean.valueOf(z));
        lg7.l(mr7.d(), PLAY_BTN_STATE, String.valueOf(z));
    }

    private void setVideoData() {
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aade7f8a", new Object[]{this});
            return;
        }
        nb4 nb4Var = this.mComponentData;
        if (nb4Var != null && (f2 = nb4Var.f()) != null) {
            String string = f2.getString("source");
            String string2 = f2.getString("videoId");
            String string3 = f2.getString("videoUrl");
            String string4 = f2.getString(KEY_THUMBNAIL_URL);
            String videoDimension = getVideoDimension(this.mComponentData.i());
            HashMap<String, String> h2 = rcw.h(this.mDetailContext.e());
            h2.put("videoAutoPlay", "true");
            if (!TextUtils.isEmpty(string)) {
                h2.put("spm-cnt", b5m.K().b());
                h2.put("source", string);
                h2.put("content_id", string2);
            }
            this.mVideoView.setVideoData(string2, string3, string4, videoDimension, h2);
            this.mThumbnailUrl = string4;
            this.mVideoUrl = string3;
            this.mVideoId = string2;
        }
    }

    private void showPlayIconAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100b40f1", new Object[]{this, view});
        } else if (view != null && view.getVisibility() == 0 && enableShowPlayIconAnimation()) {
            ((TextView) view.findViewById(R.id.iv_live_photo_text_hint)).setVisibility(0);
            ValueAnimator createPlayIconAnimation = createPlayIconAnimation(view, 0, mr7.a(108.0f));
            createPlayIconAnimation.addListener(new d(view));
            createPlayIconAnimation.start();
        }
    }

    private void syncControllerState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdddc1", new Object[]{this});
            return;
        }
        if (isVideoPlaying()) {
            switchToPlayUI();
        } else {
            switchToPauseUI();
        }
        if (isBuildInCoverVisible()) {
            showCoverImage();
        } else {
            hideCoverImage();
        }
    }

    private void updateFloatView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1294df", new Object[]{this});
            return;
        }
        JSONObject feedbackFloatData = getFeedbackFloatData();
        eo7 g2 = this.mDetailContext.g();
        if (feedbackFloatData == null || g2 == null || lg7.c(this.mContext, GIF_FEEDBACK_COUNT) >= 2) {
            if (this.mFloatView.getChildCount() != 0) {
                this.mFloatView.removeAllViews();
            }
            if (this.mFloatView.getVisibility() != 8) {
                this.mFloatView.setVisibility(8);
                return;
            }
            return;
        }
        l38 l38Var = new l38(feedbackFloatData.getJSONObject("template"));
        g2.k(l38Var, new b(feedbackFloatData, g2, l38Var));
    }

    public boolean attachDwInstanceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0cc63d", new Object[]{this})).booleanValue();
        }
        boolean attachDwInstanceView = this.mVideoView.attachDwInstanceView();
        this.mVideoView.setMute(true);
        setPlayIconState(rcw.f(this.mDetailContext));
        return attachDwInstanceView;
    }

    public boolean attachVideoLastFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e6c3ec", new Object[]{this})).booleanValue();
        }
        return this.mVideoView.attachDwInstanceLastFrame();
    }

    public void bindData(nb4 nb4Var, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b28fe2", new Object[]{this, nb4Var, ze7Var});
            return;
        }
        this.mDetailContext = ze7Var;
        this.mComponentData = nb4Var;
        setVideoData();
        mpe.m(this.mCoverImageView, this.mThumbnailUrl);
    }

    public TTObservedImageView getCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTObservedImageView) ipChange.ipc$dispatch("7251f1b7", new Object[]{this});
        }
        return this.mCoverImageView;
    }

    public String getThumbnailUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38969940", new Object[]{this});
        }
        return this.mThumbnailUrl;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.mVideoId;
    }

    public String getVideoUniqueIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af8041a", new Object[]{this});
        }
        return rcw.a(this.mVideoUrl, this.mVideoId);
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        return this.mVideoUrl;
    }

    public void hideAttachedVideoLastFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2db6469", new Object[]{this});
        } else {
            this.mVideoView.hideAttachedDwInstanceLastFrame();
        }
    }

    public void hideCoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f30604d", new Object[]{this});
        } else if (this.mCoverImageView.getVisibility() != 4) {
            this.mCoverImageView.setVisibility(4);
        }
    }

    public boolean isBuildInCoverVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60a9d8f", new Object[]{this})).booleanValue();
        }
        return this.mVideoView.isBuildInCoverVisible();
    }

    public boolean isVideoPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue();
        }
        return this.mVideoView.isVideoPlaying();
    }

    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        return this.mVideoView.pause();
    }

    public boolean play(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d42147d", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return playByManual();
        }
        return autoPlay();
    }

    public void setLivePhotoExposureListener(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbeb7832", new Object[]{this, iVar});
        } else {
            this.mLivePhotoExposureListener = iVar;
        }
    }

    public void setVideoOnClickListener(VideoView.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8b1ccd", new Object[]{this, gVar});
        } else {
            this.mVideoOnClickListener = gVar;
        }
    }

    public void showCoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837d3ac8", new Object[]{this});
        } else if (this.mCoverImageView.getVisibility() != 0) {
            if (!this.mVideoView.isNewPlayer() || !this.mVideoView.isVideoPlaying()) {
                this.mCoverImageView.setVisibility(0);
            }
        }
    }

    public void switchToPauseUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cc9642", new Object[]{this});
        } else if ((!this.mVideoView.isNewPlayer() || !this.mVideoView.isVideoPlaying()) && this.mPlayLayout.getVisibility() != 0) {
            this.mPlayLayout.setVisibility(0);
        }
    }

    public void switchToPlayUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324ea37e", new Object[]{this});
        } else if (this.mPlayLayout.getVisibility() != 4) {
            this.mPlayLayout.setVisibility(4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements eo7.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f7040a;
        public final /* synthetic */ eo7 b;
        public final /* synthetic */ l38 c;

        public b(JSONObject jSONObject, eo7 eo7Var, l38 l38Var) {
            this.f7040a = jSONObject;
            this.b = eo7Var;
            this.c = l38Var;
        }

        @Override // tb.eo7.s
        public void b(l38 l38Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                return;
            }
            if (LivePhotoVideoView.access$100(LivePhotoVideoView.this).getVisibility() != 8) {
                LivePhotoVideoView.access$100(LivePhotoVideoView.this).setVisibility(8);
            }
            tgh.b(LivePhotoVideoView.TAG, "downLoadTemplates onFailure:" + str + " name:" + l38Var.a());
        }

        @Override // tb.eo7.s
        public void a(l38 l38Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                return;
            }
            tgh.b(LivePhotoVideoView.TAG, "downLoadTemplates onSuccess: name:" + l38Var.a());
            JSONObject jSONObject = this.f7040a.getJSONObject("fields");
            if (jSONObject == null || jSONObject.isEmpty()) {
                if (LivePhotoVideoView.access$100(LivePhotoVideoView.this).getVisibility() != 8) {
                    LivePhotoVideoView.access$100(LivePhotoVideoView.this).setVisibility(8);
                }
                tgh.b(LivePhotoVideoView.TAG, "template fields is empty");
                return;
            }
            ViewGroup h = hl6.h(this.b, this.f7040a, this.c);
            if (h instanceof DXRootView) {
                LivePhotoVideoView.access$100(LivePhotoVideoView.this).removeAllViews();
                LivePhotoVideoView.access$100(LivePhotoVideoView.this).addView(h);
                LivePhotoVideoView.access$100(LivePhotoVideoView.this).setVisibility(0);
                this.b.y((DXRootView) h);
                lg7.j(LivePhotoVideoView.access$200(LivePhotoVideoView.this), LivePhotoVideoView.GIF_FEEDBACK_COUNT, lg7.c(LivePhotoVideoView.access$200(LivePhotoVideoView.this), LivePhotoVideoView.GIF_FEEDBACK_COUNT) + 1);
            }
        }
    }

    private void trackPlayIconClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e680fd", new Object[]{this, new Boolean(z)});
        } else {
            q84.f(this.mContext, new rc7("userTrack", new JSONObject(z) { // from class: com.taobao.android.detail.ttdetail.widget.video.LivePhotoVideoView.10
                public final /* synthetic */ boolean val$open;

                {
                    String str;
                    this.val$open = z;
                    put("eventId", "2101");
                    put("arg1", "Page_Detail_Button_Gificon");
                    JSONObject c2 = UtUtils.c(LivePhotoVideoView.access$400(LivePhotoVideoView.this).e());
                    if (z) {
                        str = "open";
                    } else {
                        str = "close";
                    }
                    c2.put("state", (Object) str);
                    put("args", (Object) c2);
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    private void trackPlayIconExposure(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2024bd2e", new Object[]{this, new Boolean(z)});
        } else {
            q84.f(this.mContext, new rc7("userTrack", new JSONObject(z) { // from class: com.taobao.android.detail.ttdetail.widget.video.LivePhotoVideoView.9
                public final /* synthetic */ boolean val$open;

                {
                    String str;
                    this.val$open = z;
                    put("eventId", "2201");
                    put("arg1", "Page_Detail_Show_Gificon");
                    JSONObject c2 = UtUtils.c(LivePhotoVideoView.access$400(LivePhotoVideoView.this).e());
                    if (z) {
                        str = "open";
                    } else {
                        str = "close";
                    }
                    c2.put("state", (Object) str);
                    put("args", (Object) c2);
                }
            }, new RuntimeAbilityParam[0]));
        }
    }

    private void clickPlayIcon() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b9657c", new Object[]{this});
            return;
        }
        boolean f2 = rcw.f(this.mDetailContext);
        setPlayIconState(!f2);
        Context context = this.mContext;
        if (f2) {
            str = "动图已关闭";
        } else {
            str = "动图已开启";
        }
        Toast.makeText(context, str, 0).show();
        if (!f2) {
            play(true);
        } else {
            this.mVideoView.seekTo(0.0f);
        }
        trackPlayIconClick(f2);
    }

    public LivePhotoVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initControllerUI(context);
    }

    public LivePhotoVideoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initControllerUI(context);
    }
}
