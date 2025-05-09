package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.VideoComponent;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.text.DecimalFormat;
import java.util.HashMap;
import tb.b5m;
import tb.bvk;
import tb.mpe;
import tb.nb4;
import tb.rcw;
import tb.rql;
import tb.t2o;
import tb.tq4;
import tb.tx9;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NormalVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_SOURCE = "source";
    private static final String KEY_THUMBNAIL_URL = "thumbnailUrl";
    private static final String KEY_VIDEO_ID = "videoId";
    private static final String KEY_VIDEO_URL = "videoUrl";
    private static final String TAG = "NormalVideoView";
    private static final String TAG_VIDEO_MUTE_STATE = "video_mute_state";
    private volatile boolean isChangingVolumeState;
    private ImageView mCoverImageView;
    private ze7 mDetailContext;
    private FrameLayout mExtraView;
    private boolean mForceHideMiniProgressBar;
    private boolean mIsOnUserSeeking;
    private ProgressBar mMiniProgressBar;
    private k mOnMuteClick;
    private l mOnUserClickPlay;
    private ImageView mPlayBtn;
    private ViewGroup mSeekBarContainer;
    private String mThumbnailUrl;
    private ImageView mUnMuteBtn;
    private VideoView.d mVideoLifecycleListener;
    private VideoView.g mVideoOnClickListener;
    private TextView mVideoProgressTimeTv;
    private SeekBar mVideoSeekBar;
    private VideoView mVideoView;
    private bvk mVolumeChangeListener = new b();
    private Handler mUIHandler = new Handler(Looper.getMainLooper());
    private Runnable mDelayHideControllerUi = new g();
    private TTImageUrlView.a mCoverVisibilityChangeListener = new h();
    private VideoView.c mVideoViewChangeListener = new i();
    private VideoView.d mSimpleVideoLifecycleListener = new j();
    private VideoView.g mVideoViewOnClickListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements VideoView.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.g
        public boolean a(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93db45c3", new Object[]{this, videoView})).booleanValue();
            }
            if (NormalVideoView.access$1800(NormalVideoView.this) == null || !NormalVideoView.access$1800(NormalVideoView.this).a(videoView)) {
                if (NormalVideoView.access$1900(NormalVideoView.this)) {
                    NormalVideoView.access$1300(NormalVideoView.this);
                } else {
                    NormalVideoView.access$2000(NormalVideoView.this);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
            } else if (!NormalVideoView.access$000(NormalVideoView.this)) {
                if (obj2 instanceof Boolean) {
                    z = ((Boolean) obj2).booleanValue();
                } else {
                    z = NormalVideoView.access$100(NormalVideoView.this);
                }
                NormalVideoView.access$200(NormalVideoView.this, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NormalVideoView.access$300(NormalVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Rect f7057a = new Rect();
        public boolean b = false;

        public d() {
        }

        public final boolean a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7313059f", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            NormalVideoView.access$400(NormalVideoView.this).getHitRect(this.f7057a);
            int visibility = NormalVideoView.access$400(NormalVideoView.this).getVisibility();
            if (!this.f7057a.contains(i, i2) || (visibility != 8 && visibility != 4)) {
                return false;
            }
            return true;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int x = (int) (motionEvent.getX() + view.getScrollX());
            int y = (int) (motionEvent.getY() + view.getScrollY());
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = false;
                this.f7057a.setEmpty();
                if (a(x, y)) {
                    this.b = true;
                }
            } else if (action == 1 && this.b && a(x, y)) {
                NormalVideoView.access$300(NormalVideoView.this);
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            boolean z = !NormalVideoView.access$100(NormalVideoView.this);
            NormalVideoView.access$200(NormalVideoView.this, z);
            if (NormalVideoView.access$1200(NormalVideoView.this) != null) {
                NormalVideoView.access$1200(NormalVideoView.this).a(NormalVideoView.this, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NormalVideoView.access$1300(NormalVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements TTImageUrlView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTImageUrlView.a
        public void a(TTImageUrlView tTImageUrlView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bab7d67b", new Object[]{this, tTImageUrlView, new Integer(i)});
            } else if (!NormalVideoView.access$1400(NormalVideoView.this).isVideoViewAttached()) {
            } else {
                if (i == 8 || i == 4) {
                    NormalVideoView.this.hideCoverImage();
                } else if (i == 0) {
                    NormalVideoView.this.showCoverImage();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements VideoView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
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
            } else if (NormalVideoView.access$1400(NormalVideoView.this).isVideoViewAttached()) {
                NormalVideoView.access$1500(NormalVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j extends VideoView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/NormalVideoView$9");
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoClose();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            NormalVideoView.this.switchToPauseUI();
            if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoComplete();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoError(obj, i, i2);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            } else if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoFullScreen();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            if (i == 12100) {
                NormalVideoView.this.switchToPlayUI();
                NormalVideoView.this.hideCoverImage();
            }
            if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoInfo(obj, i, i2);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            } else if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoNormalScreen();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            NormalVideoView.this.switchToPauseUI();
            if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoPause(z);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            NormalVideoView.this.switchToPlayUI();
            if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoPlay();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoPrepared(obj);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            float f = i / i3;
            NormalVideoView.access$1700(NormalVideoView.this).setProgress((int) (100.0f * f));
            if (!NormalVideoView.access$600(NormalVideoView.this)) {
                NormalVideoView.access$700(NormalVideoView.this, f);
            }
            if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoSeekTo(i);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.video.VideoView.d, tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            NormalVideoView.this.switchToPlayUI();
            if (NormalVideoView.access$1600(NormalVideoView.this) != null) {
                NormalVideoView.access$1600(NormalVideoView.this).onVideoStart();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface k {
        void a(NormalVideoView normalVideoView, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
    }

    static {
        t2o.a(912263122);
    }

    public NormalVideoView(Context context) {
        super(context);
        initControllerUI();
    }

    public static /* synthetic */ boolean access$000(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f36fb121", new Object[]{normalVideoView})).booleanValue();
        }
        return normalVideoView.isChangingVolumeState;
    }

    public static /* synthetic */ boolean access$100(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75ba6600", new Object[]{normalVideoView})).booleanValue();
        }
        return normalVideoView.isVideoMute();
    }

    public static /* synthetic */ ze7 access$1000(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("89b192ec", new Object[]{normalVideoView});
        }
        return normalVideoView.mDetailContext;
    }

    public static /* synthetic */ void access$1100(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee516ad", new Object[]{normalVideoView});
        } else {
            normalVideoView.hideSeekBarGroup();
        }
    }

    public static /* synthetic */ k access$1200(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("a1e78364", new Object[]{normalVideoView});
        }
        return normalVideoView.mOnMuteClick;
    }

    public static /* synthetic */ void access$1300(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337a806b", new Object[]{normalVideoView});
        } else {
            normalVideoView.hideControlButtonAndSeekBar();
        }
    }

    public static /* synthetic */ VideoView access$1400(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView) ipChange.ipc$dispatch("98b030e7", new Object[]{normalVideoView});
        }
        return normalVideoView.mVideoView;
    }

    public static /* synthetic */ void access$1500(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380fea29", new Object[]{normalVideoView});
        } else {
            normalVideoView.syncControllerState();
        }
    }

    public static /* synthetic */ VideoView.d access$1600(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView.d) ipChange.ipc$dispatch("d41a8918", new Object[]{normalVideoView});
        }
        return normalVideoView.mVideoLifecycleListener;
    }

    public static /* synthetic */ ProgressBar access$1700(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("204786c3", new Object[]{normalVideoView});
        }
        return normalVideoView.mMiniProgressBar;
    }

    public static /* synthetic */ VideoView.g access$1800(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView.g) ipChange.ipc$dispatch("760c1b12", new Object[]{normalVideoView});
        }
        return normalVideoView.mVideoOnClickListener;
    }

    public static /* synthetic */ boolean access$1900(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("413abda9", new Object[]{normalVideoView})).booleanValue();
        }
        return normalVideoView.isControlButtonAndSeekBarShowing();
    }

    public static /* synthetic */ void access$200(NormalVideoView normalVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ef359", new Object[]{normalVideoView, new Boolean(z)});
        } else {
            normalVideoView.setMuteState(z);
        }
    }

    public static /* synthetic */ void access$2000(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a648cf", new Object[]{normalVideoView});
        } else {
            normalVideoView.showControlButtonAndSeekBar();
        }
    }

    public static /* synthetic */ void access$300(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4fcfba", new Object[]{normalVideoView});
        } else {
            normalVideoView.onPlayButtonClicked();
        }
    }

    public static /* synthetic */ ImageView access$400(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("cd0f2917", new Object[]{normalVideoView});
        }
        return normalVideoView.mPlayBtn;
    }

    public static /* synthetic */ void access$500(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee53978", new Object[]{normalVideoView});
        } else {
            normalVideoView.showSeekBarGroup();
        }
    }

    public static /* synthetic */ boolean access$600(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12fee5b", new Object[]{normalVideoView})).booleanValue();
        }
        return normalVideoView.mIsOnUserSeeking;
    }

    public static /* synthetic */ boolean access$602(NormalVideoView normalVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb25f5e3", new Object[]{normalVideoView, new Boolean(z)})).booleanValue();
        }
        normalVideoView.mIsOnUserSeeking = z;
        return z;
    }

    public static /* synthetic */ void access$700(NormalVideoView normalVideoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebda2b4a", new Object[]{normalVideoView, new Float(f2)});
        } else {
            normalVideoView.updateProgressIndicator(f2);
        }
    }

    public static /* synthetic */ void access$800(NormalVideoView normalVideoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e6124b", new Object[]{normalVideoView, new Float(f2)});
        } else {
            normalVideoView.seekTo(f2);
        }
    }

    public static /* synthetic */ long access$900(NormalVideoView normalVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88100ce8", new Object[]{normalVideoView})).longValue();
        }
        return normalVideoView.getVideoDuration();
    }

    public static String getThumbnailUrl(nb4 nb4Var) {
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2572c874", new Object[]{nb4Var});
        }
        if (nb4Var == null || (f2 = nb4Var.f()) == null) {
            return null;
        }
        return f2.getString(KEY_THUMBNAIL_URL);
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

    private long getVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3db6f774", new Object[]{this})).longValue();
        }
        return this.mVideoView.getVideoDuration();
    }

    public static String getVideoId(nb4 nb4Var) {
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("162c7d5b", new Object[]{nb4Var});
        }
        if (nb4Var == null || (f2 = nb4Var.f()) == null) {
            return null;
        }
        return f2.getString("videoId");
    }

    public static String getVideoUrl(nb4 nb4Var) {
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b867b805", new Object[]{nb4Var});
        }
        if (nb4Var == null || (f2 = nb4Var.f()) == null) {
            return null;
        }
        return f2.getString("videoUrl");
    }

    private void hideControlButtonAndSeekBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc40d158", new Object[]{this});
            return;
        }
        this.mUIHandler.removeCallbacks(this.mDelayHideControllerUi);
        if (!this.mForceHideMiniProgressBar) {
            this.mMiniProgressBar.setVisibility(0);
        }
        this.mSeekBarContainer.setVisibility(4);
        this.mPlayBtn.setVisibility(8);
    }

    private void hideSeekBarGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e638ad", new Object[]{this});
            return;
        }
        this.mSeekBarContainer.setVisibility(4);
        if (!this.mForceHideMiniProgressBar) {
            this.mMiniProgressBar.setVisibility(0);
        }
    }

    private void initControllerUI() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6503ece7", new Object[]{this});
            return;
        }
        PreRenderManager g2 = PreRenderManager.g(tq4.d(this));
        if (g2 != null) {
            view = g2.j(tq4.d(this), R.layout.tt_detail_video_controller, this, true);
        } else {
            view = LayoutInflater.from(tq4.d(this)).inflate(R.layout.tt_detail_video_controller, (ViewGroup) this, false);
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        VideoView videoView = (VideoView) view.findViewById(R.id.vv_actually_video_view);
        this.mVideoView = videoView;
        videoView.setVideoLifecycleListener(this.mSimpleVideoLifecycleListener);
        this.mVideoView.setVideoViewOnClickListener(this.mVideoViewOnClickListener);
        this.mVideoView.setVideoViewChangeListener(this.mVideoViewChangeListener);
        this.mVideoView.setVisibilityChangeListener(this.mCoverVisibilityChangeListener);
        ImageView imageView = (ImageView) view.findViewById(R.id.tiv_cover);
        this.mCoverImageView = imageView;
        imageView.setBackgroundColor(-1);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_play_btn);
        this.mPlayBtn = imageView2;
        imageView2.setOnClickListener(new c());
        ViewProxy.setOnTouchListener(view.findViewById(R.id.view_pause_video_interceptor), new d());
        this.mMiniProgressBar = (ProgressBar) view.findViewById(R.id.pb_mini_progress);
        this.mSeekBarContainer = (ViewGroup) view.findViewById(R.id.ll_seek_container);
        this.mExtraView = (FrameLayout) view.findViewById(R.id.extra_view);
        this.mVideoSeekBar = (SeekBar) view.findViewById(R.id.sb_drag_progress);
        ViewProxy.setOnTouchListener(view.findViewById(R.id.seek_touch_container), new e());
        this.mVideoProgressTimeTv = (TextView) view.findViewById(R.id.tv_video_progress_time);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_mute_btn);
        this.mUnMuteBtn = imageView3;
        imageView3.setOnClickListener(new f());
    }

    public static /* synthetic */ Object ipc$super(NormalVideoView normalVideoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/NormalVideoView");
    }

    private boolean isControlButtonAndSeekBarShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac864da7", new Object[]{this})).booleanValue();
        }
        if (this.mSeekBarContainer.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private void onPlayButtonClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53b0d29", new Object[]{this});
            return;
        }
        boolean isVideoPlaying = isVideoPlaying();
        boolean z = true ^ isVideoPlaying;
        com.taobao.android.detail.ttdetail.widget.video.a.d().i(tq4.d(this), z);
        l lVar = this.mOnUserClickPlay;
        if (lVar != null) {
            ((VideoComponent.a) lVar).a(this, z);
        }
        if (!isVideoPlaying) {
            play();
        } else {
            pause();
        }
    }

    private void seekTo(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644ce6", new Object[]{this, new Float(f2)});
        } else {
            this.mVideoView.seekTo(f2);
        }
    }

    private void setVideoData(nb4 nb4Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d03c31", new Object[]{this, nb4Var, hashMap});
        } else if (nb4Var != null) {
            JSONObject f2 = nb4Var.f();
            rql i2 = nb4Var.i();
            if (f2 != null) {
                String string = f2.getString("source");
                String string2 = f2.getString("videoId");
                String string3 = f2.getString("videoUrl");
                String string4 = f2.getString(KEY_THUMBNAIL_URL);
                String videoDimension = getVideoDimension(i2);
                HashMap<String, String> h2 = rcw.h(this.mDetailContext.e());
                if (hashMap != null && !hashMap.isEmpty()) {
                    h2.putAll(hashMap);
                }
                if (!TextUtils.isEmpty(string)) {
                    h2.put("spm-cnt", b5m.K().b());
                    h2.put("source", string);
                    h2.put("content_id", string2);
                }
                this.mVideoView.setVideoData(string2, string3, string4, videoDimension, h2);
                this.mThumbnailUrl = string4;
            }
        }
    }

    private void showControlButtonAndSeekBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b616bd", new Object[]{this});
            return;
        }
        this.mMiniProgressBar.setVisibility(8);
        this.mSeekBarContainer.setVisibility(0);
        this.mPlayBtn.setVisibility(0);
        this.mUIHandler.postDelayed(this.mDelayHideControllerUi, 3000L);
    }

    private void showSeekBarGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6666068", new Object[]{this});
            return;
        }
        this.mSeekBarContainer.setVisibility(0);
        this.mMiniProgressBar.setVisibility(8);
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

    private void updateProgressIndicator(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03d1b20", new Object[]{this, new Float(f2)});
        } else if (this.mSeekBarContainer.getVisibility() == 0) {
            this.mVideoSeekBar.setProgress((int) (100.0f * f2));
            long videoDuration = getVideoDuration();
            int i2 = (int) (videoDuration / 3600000);
            int i3 = (int) ((videoDuration % 3600000) / 60000);
            int i4 = (int) ((videoDuration % 60000) / 1000);
            long j2 = f2 * ((float) videoDuration);
            int i5 = (int) (j2 / 3600000);
            int i6 = (int) ((j2 % 3600000) / 60000);
            int i7 = (int) ((j2 % 60000) / 1000);
            DecimalFormat decimalFormat = new DecimalFormat("00");
            StringBuilder sb = new StringBuilder();
            if (i5 > 0) {
                sb.append(i5);
                sb.append(":");
            }
            sb.append(decimalFormat.format(i6));
            sb.append(":");
            sb.append(decimalFormat.format(i7));
            sb.append(" / ");
            if (i2 > 0) {
                sb.append(i2);
                sb.append(":");
            }
            sb.append(decimalFormat.format(i3));
            sb.append(":");
            sb.append(decimalFormat.format(i4));
            this.mVideoProgressTimeTv.setText(sb.toString());
        }
    }

    public boolean attachDwInstanceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0cc63d", new Object[]{this})).booleanValue();
        }
        boolean attachDwInstanceView = this.mVideoView.attachDwInstanceView();
        setMuteState(isVideoMute());
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
        } else {
            bindData(nb4Var, ze7Var, null);
        }
    }

    public ImageView getCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("307a7faa", new Object[]{this});
        }
        return this.mCoverImageView;
    }

    public FrameLayout getExtraView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ba27f7f3", new Object[]{this});
        }
        return this.mExtraView;
    }

    public String getVideoUniqueIdentifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3af8041a", new Object[]{this}) : this.mVideoView.getVideoUniqueIdentifier();
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
        } else if (this.mCoverImageView.getVisibility() != 8) {
            this.mCoverImageView.setVisibility(8);
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

    public boolean play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue();
        }
        attachDwInstanceView();
        boolean play = this.mVideoView.play();
        if (!this.mVideoView.isNewPlayer()) {
            syncControllerState();
        }
        return play;
    }

    public void setControllerAlpha(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cc45b9", new Object[]{this, new Float(f2)});
            return;
        }
        this.mSeekBarContainer.setAlpha(f2);
        this.mUnMuteBtn.setAlpha(f2);
        this.mPlayBtn.setAlpha(f2);
        this.mMiniProgressBar.setAlpha(f2);
    }

    public void setForceHideMiniProgressBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf647be9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mForceHideMiniProgressBar = z;
        if (z) {
            this.mMiniProgressBar.setVisibility(8);
        } else if (!isControlButtonAndSeekBarShowing()) {
            this.mMiniProgressBar.setVisibility(0);
        }
    }

    public void setOnMuteClick(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867385b3", new Object[]{this, kVar});
        } else {
            this.mOnMuteClick = kVar;
        }
    }

    public void setOnUserClickPlay(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4da16f", new Object[]{this, lVar});
        } else {
            this.mOnUserClickPlay = lVar;
        }
    }

    public void setVideoLifecycleListener(VideoView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f338496", new Object[]{this, dVar});
        } else {
            this.mVideoLifecycleListener = dVar;
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
        } else if (!this.mVideoView.isNewPlayer() || !this.mVideoView.isVideoPlaying()) {
            this.mPlayBtn.setImageResource(R.drawable.tt_detail_video_player_play_bg);
            this.mPlayBtn.setVisibility(0);
        }
    }

    public void switchToPlayUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324ea37e", new Object[]{this});
            return;
        }
        this.mPlayBtn.setImageResource(R.drawable.tt_detail_video_player_pause_bg);
        this.mPlayBtn.setVisibility(8);
    }

    public static String getVideoUniqueIdentifier(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d084b05a", new Object[]{nb4Var});
        }
        if (nb4Var == null) {
            return null;
        }
        return rcw.a(getVideoUrl(nb4Var), getVideoId(nb4Var));
    }

    private boolean isVideoMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a50746b5", new Object[]{this})).booleanValue();
        }
        ze7 ze7Var = this.mDetailContext;
        if (ze7Var == null) {
            return true;
        }
        Object c2 = ze7Var.i().c(TAG_VIDEO_MUTE_STATE);
        if (c2 instanceof Boolean) {
            return ((Boolean) c2).booleanValue();
        }
        return this.mVideoView.isMute();
    }

    public void bindData(nb4 nb4Var, ze7 ze7Var, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad4e291", new Object[]{this, nb4Var, ze7Var, hashMap});
            return;
        }
        this.mDetailContext = ze7Var;
        setVideoData(nb4Var, hashMap);
        this.mDetailContext.i().e(TAG_VIDEO_MUTE_STATE, this.mVolumeChangeListener);
        mpe.m(this.mCoverImageView, this.mThumbnailUrl);
    }

    private void setMuteState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85048537", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isChangingVolumeState = true;
        if (z) {
            this.mUnMuteBtn.setContentDescription(getResources().getString(R.string.tt_detail_content_description_unmute));
            this.mUnMuteBtn.setImageResource(R.drawable.tt_detail_video_player_mute_bg);
        } else {
            this.mUnMuteBtn.setContentDescription(getResources().getString(R.string.tt_detail_content_description_mute));
            this.mUnMuteBtn.setImageResource(R.drawable.tt_detail_video_player_unmute_bg);
        }
        this.mVideoView.setMute(z);
        ze7 ze7Var = this.mDetailContext;
        if (ze7Var != null) {
            ze7Var.i().f(TAG_VIDEO_MUTE_STATE, Boolean.valueOf(z));
        }
        this.isChangingVolumeState = false;
    }

    public String getThumbnailUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38969940", new Object[]{this}) : this.mThumbnailUrl;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this}) : this.mVideoView.getVideoId();
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this}) : this.mVideoView.getVideoUrl();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f7058a;
        public float b;
        public float c;
        public int d;

        public e() {
            this.f7058a = ViewConfiguration.get(tq4.d(NormalVideoView.this)).getScaledTouchSlop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
            if (r4 != 3) goto L_0x0105;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.video.NormalVideoView.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public NormalVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initControllerUI();
    }

    public NormalVideoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initControllerUI();
    }
}
