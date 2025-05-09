package com.taobao.android.detail.ttdetail.widget.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.video.a;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.q;
import com.taobao.avplayer.s;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.b5m;
import tb.bw6;
import tb.f1k;
import tb.mr7;
import tb.q75;
import tb.qok;
import tb.qtb;
import tb.rcw;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.u9d;
import tb.vbl;
import tb.ztb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_CODE = "DETAILMAIN";
    private static final String BIZ_TYPE = "detail";
    private static final int SCENARIO_TYPE = 2;
    private static final String SOURCE_CODE = "TBVideo";
    private static final String TAG = "VideoView";
    private static final String VIEW_TAG_PLAYER = "player_view";
    private boolean isMute;
    private TTImageUrlView.a mCoverVisibilityChangeListener;
    private int[] mFixedWidthHeight;
    private volatile boolean mHasSetVideoData;
    private qtb mIDWRootViewClickListener;
    private volatile boolean mIsLayoutRequested;
    private ImageView mPlaceHolder;
    private int mPlaceHolderHideSkipFrames;
    private volatile u9d mPlayerInstance;
    private volatile a.C0387a mPlayerInstanceWrapper;
    private String mThumbnailUrl;
    private HashMap<String, String> mUtArgs;
    private int mVideoHeight;
    private String mVideoId;
    private d mVideoLifecycleListener;
    private final e mVideoPlayLifecycleListenerAdapter;
    private String mVideoUrl;
    private c mVideoViewChangeListener;
    private g mVideoViewOnClickListener;
    private int mVideoWidth;
    private TTImageUrlView.a mVisibilityChangeListener;
    private float mWidthHeightRatio;
    private boolean showNotWifiHint;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements TTImageUrlView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
        public void a(TTImageUrlView tTImageUrlView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bab7d67b", new Object[]{this, tTImageUrlView, new Integer(i)});
            } else if ((VideoView.access$100(VideoView.this) == null || !VideoView.access$100(VideoView.this).b()) && VideoView.access$200(VideoView.this) != null) {
                VideoView.access$200(VideoView.this).a(tTImageUrlView, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qtb
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            if (VideoView.access$500(VideoView.this) == null || !VideoView.access$500(VideoView.this).a(VideoView.this)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(View view);

        void b(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements ztb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912263142);
            t2o.a(452985010);
        }

        @Override // tb.ztb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.ztb
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.ztb
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // tb.ztb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            }
        }

        @Override // tb.ztb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.ztb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912263143);
        }

        public e() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
                return;
            }
            if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoClose();
            }
            if (VideoView.access$400(VideoView.this)) {
                VideoView.this.requestLayout();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            if (VideoView.access$100(VideoView.this) != null) {
                VideoView.access$100(VideoView.this).d();
            }
            if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoComplete();
            }
            if (VideoView.access$400(VideoView.this)) {
                VideoView.this.requestLayout();
            }
        }

        public void c(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoError(obj, i, i2);
            }
            if (VideoView.access$400(VideoView.this)) {
                VideoView.this.requestLayout();
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                return;
            }
            if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoFullScreen();
            }
            if (VideoView.access$400(VideoView.this)) {
                VideoView.this.requestLayout();
            }
        }

        public void e(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoInfo(obj, i, i2);
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                return;
            }
            if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoNormalScreen();
            }
            if (VideoView.access$400(VideoView.this)) {
                VideoView.this.requestLayout();
            }
        }

        public void g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoPause(z);
            }
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoPlay();
            }
        }

        public void i(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoPrepared(obj);
            }
        }

        public void j(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoProgressChanged(i, i2, i3);
            }
        }

        public void k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoSeekTo(i);
            }
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else if (VideoView.access$300(VideoView.this) != null) {
                VideoView.access$300(VideoView.this).onVideoStart();
            }
        }

        public void m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2c0f13a", new Object[]{this, new Boolean(z)});
            } else if (z) {
                VideoView.access$200(VideoView.this).a(null, 0);
            } else {
                VideoView.access$200(VideoView.this).a(null, 4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f7067a;
        private ImageView b;

        static {
            t2o.a(912263144);
        }

        public f(ImageView imageView) {
            this.f7067a = VideoView.access$000(VideoView.this);
            this.b = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f7067a > 0) {
                VideoView.this.post(this);
                this.f7067a--;
            } else {
                this.b.setVisibility(4);
                this.b.setImageDrawable(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        boolean a(VideoView videoView);
    }

    static {
        t2o.a(912263138);
    }

    public VideoView(Context context) {
        super(context);
        this.mUtArgs = new HashMap<>(0);
        this.mFixedWidthHeight = new int[2];
        this.showNotWifiHint = true;
        this.isMute = Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sEnableVolumeSetting)) ? b5m.Q().b(mr7.d()) : true;
        this.mWidthHeightRatio = 1.0f;
        this.mPlaceHolderHideSkipFrames = 1;
        this.mCoverVisibilityChangeListener = new a();
        this.mVideoPlayLifecycleListenerAdapter = new e();
        this.mIDWRootViewClickListener = new b();
        initView(context);
    }

    public static /* synthetic */ int access$000(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a20b8509", new Object[]{videoView})).intValue();
        }
        return videoView.mPlaceHolderHideSkipFrames;
    }

    public static /* synthetic */ u9d access$100(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u9d) ipChange.ipc$dispatch("719d0dd3", new Object[]{videoView});
        }
        return videoView.mPlayerInstance;
    }

    public static /* synthetic */ TTImageUrlView.a access$200(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTImageUrlView.a) ipChange.ipc$dispatch("bd9a2e1d", new Object[]{videoView});
        }
        return videoView.mVisibilityChangeListener;
    }

    public static /* synthetic */ d access$300(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("804fda4d", new Object[]{videoView});
        }
        return videoView.mVideoLifecycleListener;
    }

    public static /* synthetic */ boolean access$400(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ac9a596", new Object[]{videoView})).booleanValue();
        }
        return videoView.mIsLayoutRequested;
    }

    public static /* synthetic */ g access$500(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("12141847", new Object[]{videoView});
        }
        return videoView.mVideoViewOnClickListener;
    }

    private u9d build(TTImageUrlView tTImageUrlView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u9d) ipChange.ipc$dispatch("f723a31", new Object[]{this, tTImageUrlView});
        }
        if (vbl.C0()) {
            return buildPlayerInstance();
        }
        return buildDWInstance(tTImageUrlView);
    }

    private u9d buildDWInstance(TTImageUrlView tTImageUrlView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u9d) ipChange.ipc$dispatch("4edd10f9", new Object[]{this, tTImageUrlView});
        }
        q.a aVar = new q.a((Activity) tq4.d(this));
        aVar.n(BIZ_CODE);
        aVar.n0("TBVideo");
        aVar.J(this.isMute);
        aVar.U(true);
        aVar.d0(false);
        aVar.I(false);
        aVar.R(false);
        aVar.j(true);
        aVar.k(true);
        aVar.L(false);
        aVar.k0(DWAspectRatio.DW_FIT_CENTER);
        aVar.l0(this.mVideoId);
        aVar.p0(this.mVideoUrl);
        aVar.h(false);
        aVar.i(false);
        aVar.l(false);
        aVar.g0(true);
        aVar.Y(true);
        aVar.Q(true);
        q75 q75Var = new q75();
        tTImageUrlView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tTImageUrlView.setBackgroundColor(0);
        q75Var.c(tTImageUrlView);
        aVar.v(q75Var);
        q r0 = aVar.r0();
        r0.hideController();
        r0.hideMiniProgressBar();
        r0.setVideoBackgroundColor(0);
        r0.orientationDisable();
        r0.setShowNotWifiHint(this.showNotWifiHint);
        r0.addUtParams(this.mUtArgs);
        return new qok(r0);
    }

    private u9d buildPlayerInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u9d) ipChange.ipc$dispatch("9da69c9", new Object[]{this});
        }
        Context d2 = tq4.d(this);
        s.d dVar = new s.d();
        dVar.g = (Activity) d2;
        dVar.n = "detail";
        dVar.o = BIZ_CODE;
        dVar.i = this.isMute;
        dVar.m = this.mVideoId;
        dVar.l = this.mVideoUrl;
        dVar.q = DWAspectRatio.DW_FIT_CENTER;
        dVar.s = true;
        dVar.a0 = true;
        dVar.r = 2;
        dVar.P = true;
        dVar.c0 = this.mUtArgs;
        dVar.S = false;
        dVar.G = this.mIDWRootViewClickListener;
        return new f1k(s.c.c("", dVar));
    }

    private BitmapDrawable captureVideo() {
        TextureView textureView;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("6942202f", new Object[]{this});
        }
        if (this.mPlayerInstance == null) {
            return null;
        }
        View view = this.mPlayerInstance.getView();
        if (view instanceof TextureView) {
            textureView = (TextureView) view;
        } else if (view instanceof ViewGroup) {
            textureView = findTextureView((ViewGroup) view);
        } else {
            textureView = null;
        }
        if (textureView == null || (bitmap = textureView.getBitmap()) == null || bitmap.getByteCount() <= 0) {
            return null;
        }
        return new BitmapDrawable(tq4.d(textureView).getResources(), bitmap);
    }

    private TextureView findTextureView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("4d19f8c2", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                return findTextureView((ViewGroup) childAt);
            }
        }
        return null;
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        ImageView imageView = new ImageView(context);
        this.mPlaceHolder = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.mPlaceHolder, 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public static /* synthetic */ Object ipc$super(VideoView videoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1557272881:
                super.onViewRemoved((View) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1361193775:
                super.onViewAdded((View) objArr[0]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/VideoView");
        }
    }

    private boolean isCoverNeedAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77593ae3", new Object[]{this})).booleanValue();
        }
        int videoState = this.mPlayerInstance.getVideoState();
        if (videoState == 1 || videoState == 2) {
            return false;
        }
        return true;
    }

    private void resetDwInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d147d5fe", new Object[]{this});
            return;
        }
        this.mPlayerInstanceWrapper = null;
        this.mPlayerInstance = null;
    }

    public boolean attachDwInstanceLastFrame() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ffd415", new Object[]{this})).booleanValue();
        }
        BitmapDrawable captureVideo = captureVideo();
        if (captureVideo == null) {
            z = false;
        }
        if (captureVideo != null) {
            this.mPlaceHolder.setVisibility(0);
            this.mPlaceHolder.setImageDrawable(captureVideo);
        } else {
            this.mPlaceHolder.setVisibility(4);
            this.mPlaceHolder.setImageDrawable(null);
        }
        invalidate();
        return z;
    }

    public void detachDwInstanceView() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7297807", new Object[]{this});
        } else if (this.mPlayerInstance != null && (view = this.mPlayerInstance.getView()) != null && view.getParent() == this) {
            removeView(view);
            this.mPlayerInstance.pauseVideo();
            resetDwInstance();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public String getThumbnailUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38969940", new Object[]{this});
        }
        return this.mThumbnailUrl;
    }

    public long getVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3db6f774", new Object[]{this})).longValue();
        }
        if (isVideoViewAttached()) {
            return this.mPlayerInstance.getDuration();
        }
        return 0L;
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

    public void hideAttachedDwInstanceLastFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5105c30", new Object[]{this});
        } else {
            post(new f(this.mPlaceHolder));
        }
    }

    public boolean isBuildInCoverVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60a9d8f", new Object[]{this})).booleanValue();
        }
        ensureDwInstanceCreated();
        if (this.mPlayerInstance != null && this.mPlayerInstance.b()) {
            return isCoverNeedAppear();
        }
        if (this.mPlayerInstanceWrapper != null) {
            return this.mPlayerInstanceWrapper.a().isViewVisible();
        }
        return true;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        return this.isMute;
    }

    public boolean isNewPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309d1ba2", new Object[]{this})).booleanValue();
        }
        if (this.mPlayerInstance != null) {
            return this.mPlayerInstance.b();
        }
        return false;
    }

    public boolean isVideoPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue();
        }
        if (!isVideoViewAttached() || this.mPlayerInstance.getVideoState() != 1) {
            return false;
        }
        return true;
    }

    public boolean isVideoViewAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ad75305", new Object[]{this})).booleanValue();
        }
        if (this.mPlayerInstance == null || this.mPlayerInstance.getView() == null || this.mPlayerInstance.getView().getParent() != this) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        updateVideoFrame(getWidth(), getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int ceil = (int) Math.ceil(size / this.mWidthHeightRatio);
        if (size2 > ceil || size2 <= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(ceil, 1073741824);
        }
        super.onMeasure(i, i2);
        updateVideoFrame(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        Object tag = view.getTag(R.id.tt_detail_video_dwinstance_id);
        Object tag2 = view.getTag(R.id.tt_detail_video_dwinstance_wrapper_id);
        if (tag instanceof u9d) {
            if (tag2 instanceof a.C0387a) {
                ((a.C0387a) tag2).a().registerVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            u9d u9dVar = (u9d) tag;
            u9dVar.c(this.mVideoPlayLifecycleListenerAdapter);
            u9dVar.a(this.mIDWRootViewClickListener);
            setShowNotWifiHint(this.showNotWifiHint);
            setMute(this.isMute);
            c cVar = this.mVideoViewChangeListener;
            if (cVar != null) {
                cVar.b(view);
            }
            post(new f(this.mPlaceHolder));
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        Object tag = view.getTag(R.id.tt_detail_video_dwinstance_id);
        Object tag2 = view.getTag(R.id.tt_detail_video_dwinstance_wrapper_id);
        if (tag instanceof u9d) {
            if (tag2 instanceof a.C0387a) {
                ((a.C0387a) tag2).a().unregisterVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            u9d u9dVar = (u9d) tag;
            u9dVar.c(null);
            u9dVar.a(null);
            c cVar = this.mVideoViewChangeListener;
            if (cVar != null) {
                cVar.a(view);
            }
            post(new f(this.mPlaceHolder));
        }
    }

    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        if (!isVideoViewAttached() || 1 != this.mPlayerInstance.getVideoState()) {
            return false;
        }
        this.mPlayerInstance.pauseVideo();
        return true;
    }

    public boolean play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue();
        }
        ensureDwInstanceCreated();
        if (this.mPlayerInstance == null) {
            return false;
        }
        if (!attachDwInstanceView()) {
            hideAttachedDwInstanceLastFrame();
        }
        int videoState = this.mPlayerInstance.getVideoState();
        if (videoState == 0 || videoState == 6 || videoState == 4) {
            this.mPlayerInstance.start();
            return true;
        } else if (videoState == 1) {
            return false;
        } else {
            this.mPlayerInstance.playVideo();
            return true;
        }
    }

    public void seekTo(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644ce6", new Object[]{this, new Float(f2)});
        } else if (isVideoViewAttached()) {
            this.mPlayerInstance.seekTo((int) (f2 * ((float) this.mPlayerInstance.getDuration())));
        }
    }

    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isMute = z;
        if (isVideoViewAttached()) {
            this.mPlayerInstance.mute(this.isMute);
        }
    }

    public void setPlaceHolderHideSkipFrames(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe7ce44", new Object[]{this, new Integer(i)});
        } else {
            this.mPlaceHolderHideSkipFrames = i;
        }
    }

    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.showNotWifiHint = z;
        if (isVideoViewAttached()) {
            this.mPlayerInstance.e(this.showNotWifiHint);
        }
    }

    public synchronized void setVideoData(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        u9d u9dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14db0ac1", new Object[]{this, str, str2, str3, str4, hashMap});
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            String a2 = rcw.a(str2, str);
            String videoUniqueIdentifier = getVideoUniqueIdentifier();
            a.C0387a c2 = com.taobao.android.detail.ttdetail.widget.video.a.d().c(tq4.d(this), videoUniqueIdentifier);
            if (c2 != null && !TextUtils.equals(a2, videoUniqueIdentifier)) {
                c2.a().unregisterVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            this.mVideoId = str;
            this.mVideoUrl = str2;
            this.mThumbnailUrl = str3;
            this.mWidthHeightRatio = mr7.h(str4);
            if (!TextUtils.equals(a2, videoUniqueIdentifier)) {
                this.mUtArgs = new HashMap<>(0);
                resetDwInstance();
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                this.mUtArgs.putAll(hashMap);
            }
            this.mPlayerInstanceWrapper = com.taobao.android.detail.ttdetail.widget.video.a.d().c(tq4.d(this), a2);
            if (this.mPlayerInstanceWrapper != null) {
                u9dVar = this.mPlayerInstanceWrapper.c();
            } else {
                u9dVar = null;
            }
            this.mPlayerInstance = u9dVar;
            if (isVideoViewAttached()) {
                this.mPlayerInstanceWrapper.a().registerVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            this.mHasSetVideoData = true;
        }
    }

    public void setVideoLifecycleListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f338496", new Object[]{this, dVar});
        } else {
            this.mVideoLifecycleListener = dVar;
        }
    }

    public void setVideoViewChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb3e9c3", new Object[]{this, cVar});
        } else {
            this.mVideoViewChangeListener = cVar;
        }
    }

    public void setVideoViewOnClickListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0206e8", new Object[]{this, gVar});
        } else {
            this.mVideoViewOnClickListener = gVar;
        }
    }

    public void setVisibilityChangeListener(TTImageUrlView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69056fa", new Object[]{this, aVar});
        } else {
            this.mVisibilityChangeListener = aVar;
        }
    }

    private void showIsNewPlayerToast() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99bbcf4", new Object[]{this});
            return;
        }
        if (this.mPlayerInstance == null || !this.mPlayerInstance.b()) {
            str2 = "use OLD player with url: " + getVideoUrl() + " id: " + getVideoId();
            str = "tt OLD video player";
        } else {
            str2 = "use NEW player with url: " + getVideoUrl() + " id: " + getVideoId();
            str = "tt NEW video player";
        }
        if (bw6.a(tq4.d(this))) {
            Toast.makeText(tq4.d(this), str, 0).show();
        }
        tgh.b(TAG, str2);
    }

    private boolean ensureDwInstanceCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7cde6d", new Object[]{this})).booleanValue();
        }
        if (!this.mHasSetVideoData) {
            return false;
        }
        String videoUniqueIdentifier = getVideoUniqueIdentifier();
        this.mPlayerInstanceWrapper = com.taobao.android.detail.ttdetail.widget.video.a.d().c(tq4.d(this), videoUniqueIdentifier);
        this.mPlayerInstance = this.mPlayerInstanceWrapper != null ? this.mPlayerInstanceWrapper.c() : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mPlayerInstance == null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            TTImageUrlView tTImageUrlView = new TTImageUrlView(tq4.d(this));
            this.mPlayerInstance = build(tTImageUrlView);
            showIsNewPlayerToast();
            this.mPlayerInstanceWrapper = new a.C0387a(this.mPlayerInstance, tTImageUrlView);
            com.taobao.android.detail.ttdetail.widget.video.a.d().g(tq4.d(this), videoUniqueIdentifier, this.mPlayerInstanceWrapper);
            if (isVideoViewAttached()) {
                tTImageUrlView.registerVisibilityChangeListener(this.mCoverVisibilityChangeListener);
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            Log.e("TTDetailPerTag", "buildDWInstance(): " + (currentTimeMillis3 - currentTimeMillis2));
        }
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis4 > 0) {
            PerformanceUtils.l(tq4.d(this), "playerInit", currentTimeMillis4);
        }
        return true;
    }

    private void updateVideoFrame(int i, int i2) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afff5642", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mVideoWidth;
        if (i3 == 0 || this.mVideoHeight == 0 || Math.abs(i3 - i) > 0 || Math.abs(this.mVideoHeight - i2) > 0) {
            mr7.c(i, i2, this.mWidthHeightRatio, this.mFixedWidthHeight);
            int i4 = this.mVideoWidth;
            int[] iArr = this.mFixedWidthHeight;
            int i5 = iArr[0];
            if (i4 != i5 || this.mVideoHeight != iArr[1]) {
                this.mVideoWidth = i5;
                this.mVideoHeight = iArr[1];
                Log.e(TAG, "updateVideoFrame vWidth: " + this.mVideoWidth + " vHeight: " + this.mVideoHeight);
                if (this.mPlayerInstance != null && (view = this.mPlayerInstance.getView()) != null && view.getParent() == this) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = this.mVideoWidth;
                    layoutParams.height = this.mVideoHeight;
                    view.requestLayout();
                    this.mPlayerInstance.f(this.mVideoWidth, this.mVideoHeight);
                }
            }
        }
    }

    public boolean attachDwInstanceView() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0cc63d", new Object[]{this})).booleanValue();
        }
        if (this.mPlayerInstance == null || (view = this.mPlayerInstance.getView()) == null || view.getParent() == this) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        View findViewWithTag = findViewWithTag(VIEW_TAG_PLAYER);
        if (findViewWithTag != null) {
            Object tag = findViewWithTag.getTag(R.id.tt_detail_video_dwinstance_id);
            if (tag instanceof u9d) {
                ((u9d) tag).pauseVideo();
            }
            removeView(findViewWithTag);
        }
        view.setTag(R.id.tt_detail_video_dwinstance_id, this.mPlayerInstance);
        view.setTag(R.id.tt_detail_video_dwinstance_wrapper_id, this.mPlayerInstanceWrapper);
        view.setTag(VIEW_TAG_PLAYER);
        addView(view, 0, new FrameLayout.LayoutParams(this.mVideoWidth, this.mVideoHeight, 17));
        this.mPlayerInstance.f(this.mVideoWidth, this.mVideoHeight);
        return true;
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUtArgs = new HashMap<>(0);
        this.mFixedWidthHeight = new int[2];
        this.showNotWifiHint = true;
        this.isMute = Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sEnableVolumeSetting)) ? b5m.Q().b(mr7.d()) : true;
        this.mWidthHeightRatio = 1.0f;
        this.mPlaceHolderHideSkipFrames = 1;
        this.mCoverVisibilityChangeListener = new a();
        this.mVideoPlayLifecycleListenerAdapter = new e();
        this.mIDWRootViewClickListener = new b();
        initView(context);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUtArgs = new HashMap<>(0);
        this.mFixedWidthHeight = new int[2];
        this.showNotWifiHint = true;
        this.isMute = Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sEnableVolumeSetting)) ? b5m.Q().b(mr7.d()) : true;
        this.mWidthHeightRatio = 1.0f;
        this.mPlaceHolderHideSkipFrames = 1;
        this.mCoverVisibilityChangeListener = new a();
        this.mVideoPlayLifecycleListenerAdapter = new e();
        this.mIDWRootViewClickListener = new b();
        initView(context);
    }
}
