package com.taobao.android.dinamicx.widget.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.video.a;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.asc;
import tb.h36;
import tb.nj9;
import tb.qtb;
import tb.wfp;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNewVideoView extends FrameLayout implements Application.ActivityLifecycleCallbacks, com.taobao.android.dinamicx.widget.video.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TSSingletonVideoView";
    private String bizId;
    private TUrlImageView coverImageView;
    private String instanceIdentifier;
    private boolean isAttachedToWindow;
    private TUrlImageView ivPlayButton;
    private Context mContext;
    private DXWidgetNode mCustomerPlayIcon;
    private String mVideoId;
    private String mVideoUrl;
    private boolean manualPause;
    private String passOnTrack;
    private boolean playIgnoreNetwork;
    private String subBusinessId;
    private s.d tbPlayerInfo;
    private s tbPlayerInstance;
    private a.b tsVideoStatusCallback;
    private int videoHeight;
    private int videoWidth;
    private boolean isLoop = false;
    private boolean mMuted = false;
    private boolean mCanPlay = true;
    private boolean mAutoControl = true;
    private boolean hideIconOnStop = false;
    private int mScaleType = 1;
    private int coverImageScaleType = 1;
    private boolean viewEnable = true;
    private boolean enablePlayControl = false;
    public FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
    public Handler handler = new Handler(Looper.getMainLooper());
    private long startTime = 0;
    private int progressInterval = -1;
    public asc idwVideoLifecycleListener = new h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                DXNewVideoView.this.responseOnClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DXNewVideoView.this.responseOnClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            return DXNewVideoView.access$000(DXNewVideoView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements qtb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(DXNewVideoView dXNewVideoView) {
        }

        @Override // tb.qtb
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DXNewVideoView.access$100(DXNewVideoView.this) != null && DXNewVideoView.access$100(DXNewVideoView.this).o() != null) {
                ViewParent parent = DXNewVideoView.access$100(DXNewVideoView.this).o().getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(DXNewVideoView.access$100(DXNewVideoView.this).o());
                }
                DXNewVideoView dXNewVideoView = DXNewVideoView.this;
                dXNewVideoView.addView(DXNewVideoView.access$100(dXNewVideoView).o(), 0, DXNewVideoView.this.layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DXNewVideoView.this.responseOnClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/video/DXNewVideoView$7");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (DXNewVideoView.access$200(DXNewVideoView.this) != null) {
                DXNewVideoView.access$200(DXNewVideoView.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            if (DXNewVideoView.access$100(DXNewVideoView.this) != null && DXNewVideoView.access$100(DXNewVideoView.this).m(1500) == 4) {
                DXNewVideoView.this.showCoverImageView();
                DXNewVideoView.this.showPlayerBtn();
            }
            if (DXNewVideoView.access$300(DXNewVideoView.this) != null) {
                DXNewVideoView.access$300(DXNewVideoView.this).onPlayCompleted();
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            DXNewVideoView.this.showCoverImageView();
            DXNewVideoView.this.showPlayerBtn();
            DXNewVideoView.this.pauseVideo();
            if (DXNewVideoView.access$300(DXNewVideoView.this) != null) {
                DXNewVideoView.access$300(DXNewVideoView.this).a();
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            } else if (j == 12100) {
                DXNewVideoView.access$400(DXNewVideoView.this);
                DXNewVideoView.this.hidePlayerBtn();
                if (DinamicXEngine.j0()) {
                    Log.e("dx_video_cost", "cost:" + (System.currentTimeMillis() - DXNewVideoView.access$000(DXNewVideoView.this)));
                }
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            DXVideoViewWidgetNode dXVideoViewWidgetNode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            Object tag = DXNewVideoView.this.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if (tag instanceof DXWidgetNode) {
                DXWidgetNode dXWidgetNode = (DXWidgetNode) tag;
                if ((dXWidgetNode instanceof DXVideoViewWidgetNode) && (dXVideoViewWidgetNode = (DXVideoViewWidgetNode) dXWidgetNode.getReferenceNode()) != null) {
                    dXVideoViewWidgetNode.onVideoProgressChanged(i, i2, i3);
                }
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            }
        }
    }

    public DXNewVideoView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ long access$000(DXNewVideoView dXNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b5fbb1e", new Object[]{dXNewVideoView})).longValue();
        }
        return dXNewVideoView.startTime;
    }

    public static /* synthetic */ s access$100(DXNewVideoView dXNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("af72672", new Object[]{dXNewVideoView});
        }
        return dXNewVideoView.tbPlayerInstance;
    }

    public static /* synthetic */ TUrlImageView access$200(DXNewVideoView dXNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("5527a814", new Object[]{dXNewVideoView});
        }
        return dXNewVideoView.coverImageView;
    }

    public static /* synthetic */ a.b access$300(DXNewVideoView dXNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("99fcc1ca", new Object[]{dXNewVideoView});
        }
        return dXNewVideoView.tsVideoStatusCallback;
    }

    public static /* synthetic */ void access$400(DXNewVideoView dXNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e3caa6", new Object[]{dXNewVideoView});
        } else {
            dXNewVideoView.hideCoverImageView();
        }
    }

    private void addVideoSurfaceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0708bf", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        this.coverImageView = tUrlImageView;
        tUrlImageView.setWhenNullClearImg(true);
        this.coverImageView.setAutoRelease(false);
        this.coverImageView.enableSizeInLayoutParams(true);
        validateCoverImageScaleType();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dx_video_view_extend, (ViewGroup) this, false);
        this.ivPlayButton = (TUrlImageView) inflate.findViewById(R.id.iv_play_btn);
        addView(this.coverImageView, this.layoutParams);
        addView(inflate, this.layoutParams);
        this.ivPlayButton.setOnClickListener(new b());
    }

    private DWAspectRatio changeAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("3fc44930", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return DWAspectRatio.DW_FIT_X_Y;
        }
        if (i != 2) {
            return DWAspectRatio.DW_FIT_CENTER;
        }
        return DWAspectRatio.DW_CENTER_CROP;
    }

    private View getCustomerPlayIconView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46d6560f", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.mCustomerPlayIcon;
        if (dXWidgetNode == null) {
            return null;
        }
        View D = dXWidgetNode.getDXRuntimeContext().D();
        if (this.viewEnable && D != null && !D.hasOnClickListeners()) {
            ViewProxy.setOnClickListener(D, new f());
        }
        return D;
    }

    private boolean hasPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9549414", new Object[]{this})).booleanValue();
        }
        return true;
    }

    private void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView != null && tUrlImageView.getVisibility() != 8) {
            this.coverImageView.animate().alpha(0.0f).setDuration(300L).setListener(new g()).start();
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            h36.d(TAG, "registerActivityLifecycleCallbacks", th);
        }
        addVideoSurfaceView();
        initTbPlayerInfoBuilder();
    }

    private void initTbPlayerInfoBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65822af5", new Object[]{this});
            return;
        }
        s.d dVar = new s.d();
        this.tbPlayerInfo = dVar;
        dVar.b0 = false;
    }

    public static /* synthetic */ Object ipc$super(DXNewVideoView dXNewVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/video/DXNewVideoView");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
        if (r1.isEmpty() != false) goto L_0x00e7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
        r1.put("passOnTrack", r4.passOnTrack);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
        if (r1.isEmpty() == false) goto L_0x00f4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
        r4.tbPlayerInfo.c0.putAll(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void makeTbPlayerInstance() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.video.DXNewVideoView.makeTbPlayerInstance():void");
    }

    private void prepareInstance() {
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb0d543", new Object[]{this});
            return;
        }
        validateInstanceIdentifier();
        s sVar = this.tbPlayerInstance;
        if (sVar == null || sVar.o() == null) {
            z = true;
        }
        if (z || this.instanceIdentifier.equals(this.tbPlayerInstance.o().getTag(R.id.dx_video_player_instance_identifier))) {
            z2 = z;
        } else {
            if (isPlaying()) {
                this.tbPlayerInstance.u();
            }
            removeView(this.tbPlayerInstance.o());
            showCoverImageView();
            this.tbPlayerInstance.i(0L);
        }
        if (z2) {
            makeTbPlayerInstance();
        }
    }

    private void validateCoverImageScaleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2252b1", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView != null) {
            int i = this.coverImageScaleType;
            if (i == 0) {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else if (i != 2) {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void canPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609d7e89", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void destroyVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545abca8", new Object[]{this});
            return;
        }
        showPlayerBtn();
        showCoverImageView();
        s sVar = this.tbPlayerInstance;
        if (sVar != null) {
            if (sVar.o() != null) {
                removeView(this.tbPlayerInstance.o());
            }
            this.tbPlayerInstance.i(0L);
            this.tbPlayerInstance = null;
        }
    }

    public void hidePlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0510a0", new Object[]{this});
            return;
        }
        View customerPlayIconView = getCustomerPlayIconView();
        if (customerPlayIconView == null) {
            customerPlayIconView = this.ivPlayButton;
        }
        if (customerPlayIconView != null && customerPlayIconView.getVisibility() != 8) {
            customerPlayIconView.setVisibility(8);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        return this.mMuted;
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        s sVar = this.tbPlayerInstance;
        if (sVar == null || sVar.m(1500) != 1) {
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        if (this.mContext != activity) {
            if (TextUtils.equals(TBMainHost.b().getSimpleName(), activity.getLocalClassName())) {
                Context context = this.mContext;
                if (context != context.getApplicationContext()) {
                    return;
                }
            } else {
                return;
            }
        }
        s sVar = this.tbPlayerInstance;
        if (sVar != null) {
            sVar.i(0L);
        }
        try {
            ((Application) this.mContext.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (this.mAutoControl && hasPermission() && !this.enablePlayControl && wfp.INSTANCE.a(getContext())) {
            playVideo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        if (this.mAutoControl && !this.enablePlayControl) {
            pauseVideo();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        s sVar = this.tbPlayerInstance;
        if (sVar != null) {
            sVar.u();
        }
        showPlayerBtn();
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            playVideo(false);
        }
    }

    public void preRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4294ea20", new Object[]{this});
        } else {
            prepareInstance();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        s sVar = this.tbPlayerInstance;
        if (sVar != null) {
            sVar.v();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void responseOnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5093ef", new Object[]{this});
        } else if (isPlaying()) {
            this.manualPause = true;
            pauseVideo();
        } else {
            this.manualPause = false;
            playVideo();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.tbPlayerInstance;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setAutoControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eea4bc1", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoControl = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setBackGroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c8b549", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.bizId = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setClickListenerControlPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab860d6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.viewEnable = z;
        if (z) {
            setOnClickListener(new a());
        } else {
            setOnClickListener(null);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView != null) {
            tUrlImageView.animate().cancel();
            this.coverImageView.setAlpha(1.0f);
            this.coverImageView.setVisibility(0);
            this.coverImageView.setImageUrl(str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setCoverImageScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43ef5be", new Object[]{this, new Integer(i)});
            return;
        }
        this.coverImageScaleType = i;
        validateCoverImageScaleType();
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setCustomerPlayIcon(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9903eb5b", new Object[]{this, dXWidgetNode});
            return;
        }
        this.mCustomerPlayIcon = dXWidgetNode;
        if (dXWidgetNode != null) {
            this.ivPlayButton.setVisibility(8);
        } else {
            this.ivPlayButton.setVisibility(0);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setEnablePlayControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b600f3e9", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePlayControl = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setHideIconOnStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ccc5af", new Object[]{this, new Boolean(z)});
            return;
        }
        this.hideIconOnStop = z;
        if (z) {
            hidePlayerBtn();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setITSVideoStatusCallback(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b05298e", new Object[]{this, bVar});
            return;
        }
        this.tsVideoStatusCallback = bVar;
        s sVar = this.tbPlayerInstance;
        if (sVar != null && sVar.o() != null) {
            this.tbPlayerInstance.o().setTag(R.id.dx_video_player_control, bVar);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isLoop = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        s sVar = this.tbPlayerInstance;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setPassOnTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bc16a", new Object[]{this, str});
        } else {
            this.passOnTrack = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.iv_play_btn);
        this.ivPlayButton = tUrlImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setPlayIgnoreNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fa2e07", new Object[]{this, new Boolean(z)});
        } else {
            this.playIgnoreNetwork = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setProgressInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f657148", new Object[]{this, new Integer(i)});
        } else {
            this.progressInterval = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mScaleType = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setSubBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804f77ea", new Object[]{this, str});
        } else {
            this.subBusinessId = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.mVideoId = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.videoWidth = i;
        this.videoHeight = i2;
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(this.mVideoUrl) && !this.mVideoUrl.equals(str) && this.manualPause) {
            this.manualPause = false;
        }
        this.mVideoUrl = str;
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.coverImageView;
        if (tUrlImageView != null) {
            tUrlImageView.animate().cancel();
            this.coverImageView.setAlpha(1.0f);
            this.handler.removeCallbacksAndMessages(null);
            this.coverImageView.setVisibility(0);
        }
    }

    public void showPlayerBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc57ac5", new Object[]{this});
            return;
        }
        View customerPlayIconView = getCustomerPlayIconView();
        if (customerPlayIconView == null) {
            customerPlayIconView = this.ivPlayButton;
        }
        if (customerPlayIconView != null && customerPlayIconView.getVisibility() != 0) {
            if (this.manualPause || !this.hideIconOnStop) {
                customerPlayIconView.setVisibility(0);
            } else {
                customerPlayIconView.setVisibility(8);
            }
        }
    }

    public void triggerPlayEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13592ff", new Object[]{this, new Boolean(z)});
            return;
        }
        Object tag = getTag(R.id.dx_video_player_event);
        if (tag instanceof a.AbstractC0403a) {
            ((a.AbstractC0403a) tag).a(hasPermission(), z);
        }
    }

    public void validateInstanceIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc11d5b", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mVideoId)) {
            this.instanceIdentifier = this.mVideoId;
        } else {
            String str = this.mVideoUrl;
            if (str != null) {
                this.instanceIdentifier = String.valueOf(str.hashCode());
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.video.a
    public void playVideo(boolean z) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4535e6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.startTime = System.currentTimeMillis();
        validateInstanceIdentifier();
        if (!this.mCanPlay || TextUtils.isEmpty(this.instanceIdentifier) || this.manualPause) {
            showPlayerBtn();
            showCoverImageView();
            pauseVideo();
            return;
        }
        prepareInstance();
        if (this.isAttachedToWindow && (sVar = this.tbPlayerInstance) != null && sVar.m(1500) != 1) {
            if (this.tbPlayerInstance.m(1500) == 2 || this.tbPlayerInstance.m(1500) == 6 || this.tbPlayerInstance.m(1500) == 3) {
                hideCoverImageView();
                hidePlayerBtn();
                this.tbPlayerInstance.F();
                triggerPlayEvent(true);
                return;
            }
            this.tbPlayerInstance.F();
            triggerPlayEvent(false);
        }
    }

    public DXNewVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DXNewVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
