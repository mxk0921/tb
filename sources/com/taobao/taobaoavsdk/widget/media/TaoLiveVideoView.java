package com.taobao.taobaoavsdk.widget.media;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.player.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.c15;
import tb.dq;
import tb.ew0;
import tb.gf4;
import tb.itw;
import tb.izq;
import tb.ja1;
import tb.nj9;
import tb.pgi;
import tb.r7t;
import tb.rgi;
import tb.s9m;
import tb.t2o;
import tb.tcw;
import tb.wdh;
import tb.x3r;
import tb.zyi;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaoLiveVideoView extends FrameLayout implements rgi.a, a.AbstractC0594a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARTP_ERRCODE_ACTIVE_DEGRADE = -10611;
    public static final int ARTP_ERRCODE_FAILED_SWITCH_STREAM = -10900;
    public static final int ARTP_ERRCODE_PACKETRECVTIMEOUT = -10610;
    public static final int ARTP_ERRCODE_SPSPPSAaACCONFTIMEOUT = -10609;
    public static final int ARTP_ERRCODE_STARTPLAYTIMEOUT = -10608;
    public static final int ARTP_ERRCODE_STOPBYSFUBASE = -10000;
    public static final int ARTP_ERRCODE_STREAMHASSTOPPED = -10605;
    public static final int ARTP_ERRCODE_STREAMILLEGAL = -10603;
    public static final int ARTP_ERRCODE_STREAMNOTFOUND = -10604;
    public static final int ARTP_ERRCODE_UDP_NOUSABLE = -10612;
    private static final String COMPONENT_NAME = "avliveview";
    public static final int FLV_ERRCODE_CONNECTION_FAILED = -5;
    public static int SDK_INT_FOR_OPTIMIZE = 23;
    public static final int STATE_ERROR = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_PLAYBACK_COMPLETED = 5;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PREPARED = 2;
    public static final int STATE_PREPARING = 1;
    private static final String TAG = "AVSDK";
    public static final String TBLIVE_ARTP_SCHEMA = "artp://";
    private static final String TBLIVE_BUSIINESS_ID = "TBLive";
    public static final String TBLIVE_GRTN_SCHEMA = "artc://";
    public static final String TBLIVE_ORANGE_ACCELERATESPEED = "AccelerateSpeed";
    public static final String TBLIVE_ORANGE_ACCELERATESPEED_LINK = "AudioAccelerateSpeedLink";
    public static final String TBLIVE_ORANGE_FAST_LOADING = "fast_loading";
    public static final String TBLIVE_ORANGE_FIRSTPLAY_BUFFER_TIME = "FirstBufferMS";
    public static final String TBLIVE_ORANGE_FUSION_MODE = "SensorFusionCalibrate";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";
    public static final String TBLIVE_ORANGE_NETWORK_TRAFFIC_REPORT = "NetworkTrafficReportTrigger";
    public static final String TBLIVE_ORANGE_PLAYBUFFER_TIME = "PlayBufferMS";
    public static final String TBLIVE_ORANGE_REPORT_INTERNAL = "LogReportIntervalSeconds";
    public static final String TBLIVE_ORANGE_RETAIN_FLV = "RetainFlv";
    public static final String TBLIVE_ORANGE_SLOWSPEED = "AudioSlowSpeed";
    public static final String TBLIVE_ORANGE_SLOWSPEED_LINK = "AudioSlowSpeedLink";
    private static final int TBMPBBufferLoadCountLimit = 3;
    private static final int TBMPBBufferLoadCountTimeInterval = 15000;
    public boolean bAudioOnly;
    public boolean bAutoPause;
    public boolean bFirstFrameRendered;
    public boolean bLooping;
    public boolean bPlayerTypeChanged;
    public boolean bmuted;
    public int bufferLoadCountLimit;
    public int bufferLoadCountTimeInterval;
    public int bufferLoadFrequencyCounter;
    private String cdn_ip;
    public long lastBufferLoadTime;
    private com.taobao.mediaplay.player.a mActivityLifecycleCallbacks;
    private boolean mBlockTouchEvent;
    private IMediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mCompletionListener;
    public r7t mConfig;
    public gf4 mConfigAdapter;
    private Context mContext;
    private boolean mControlScreenByParams;
    public ImageView mCoverImgView;
    public int mCurrentBufferPercentage;
    public c15 mCustomLibLoader;
    private boolean mDisableFixPauseOnAcctivity;
    private boolean mDisableFixPauseOnPrepared;
    private boolean mEnableAutoAfterDisconnect;
    private boolean mEnableAutoPlayForBackground;
    private boolean mEnableGlobalKeepScreenOn;
    private boolean mEnableOpenGLCrop;
    private boolean mEnableSurfaceView;
    private boolean mEnableVideoDetect;
    private IMediaPlayer.OnErrorListener mErrorListener;
    private Map<String, String> mExtInfo;
    private nj9 mFirstRenderAdapter;
    private boolean mHasKeepScreenOn;
    private IMediaPlayer.OnInfoListener mInfoListener;
    public boolean mIsConnected;
    public boolean mIsMuteWhenStart;
    public wdh mLogAdapter;
    private rgi mMediaPlayerRecycler;
    public BroadcastReceiver mNetworkReceiver;
    private com.taobao.taobaoavsdk.widget.media.a mNextRenderView;
    public a.AbstractC0740a mNextSHCallback;
    private a.b mNextSurfaceHolder;
    private List<IMediaPlayer.OnBufferingUpdateListener> mOnBufferingUpdateListeners;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private List<IMediaPlayer.OnCompletionListener> mOnCompletionListeners;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private List<IMediaPlayer.OnErrorListener> mOnErrorListeners;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private List<IMediaPlayer.OnInfoListener> mOnInfoListeners;
    private List<m> mOnPauseListeners;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private List<IMediaPlayer.OnPreparedListener> mOnPreparedListeners;
    private IMediaPlayer.OnSeekCompletionListener mOnSeekCompletionListener;
    private List<IMediaPlayer.OnSeekCompletionListener> mOnSeekCompletionListeners;
    private List<n> mOnStartListeners;
    private List<IMediaPlayer.OnVideoClickListener> mOnVideoClickListeners;
    public String mPlayUrl;
    private IMediaPlayer.OnPreparedListener mPreparedListener;
    private SparseArray<Float> mPropertyFloat;
    private SparseArray<Long> mPropertyLong;
    private boolean mReleaseByExtern;
    public int mReleaseFocusCount;
    public View mRenderUIView;
    public com.taobao.taobaoavsdk.widget.media.a mRenderView;
    public boolean mRequestAudioFocus;
    public int mRequestFocusCount;
    public boolean mRequestLongFocus;
    public a.AbstractC0740a mSHCallback;
    private IMediaPlayer.OnSeekCompletionListener mSeekCompletionListener;
    public int mSeekWhenPrepared;
    private String mSeiData;
    private boolean mSetDefaultPlayToken;
    private boolean mShouldInitBeforeStart;
    public IMediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    private long mStartTime;
    public a.b mSurfaceHolder;
    private p mSurfaceListener;
    private Runnable mSwitchRunnable;
    public int mTargetState;
    private float mTouchX;
    private float mTouchY;
    private boolean mUseShortAudioFocus;
    public String mUsingInterface;
    public int mVideoHeight;
    public int mVideoRotationDegree;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    private boolean mbIsSwitchingPath;
    public long timeOutUs;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class NetworkBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(774897984);
        }

        public NetworkBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(NetworkBroadcastReceiver networkBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/widget/media/TaoLiveVideoView$NetworkBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            TaoLiveVideoView taoLiveVideoView;
            r7t r7tVar;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int type = activeNetworkInfo.getType();
                    if (!(type == 1 || type == ja1.e || (r7tVar = (taoLiveVideoView = TaoLiveVideoView.this).mConfig) == null || !r7tVar.n)) {
                        Toast.makeText(TaoLiveVideoView.access$2600(taoLiveVideoView), TaoLiveVideoView.access$2600(TaoLiveVideoView.this).getString(R.string.avsdk_mobile_network_hint), 1).show();
                    }
                    if (!TaoLiveVideoView.this.mIsConnected || !(type == ja1.e || ja1.e == -1)) {
                        TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                        if (taoLiveVideoView2.mPlayUrl != null) {
                            r7t r7tVar2 = taoLiveVideoView2.mConfig;
                            if (!(r7tVar2 == null || r7tVar2.d != 2 || TaoLiveVideoView.access$400(taoLiveVideoView2) == null || TaoLiveVideoView.access$400(TaoLiveVideoView.this).f == null)) {
                                i = (int) TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.getCurrentPosition();
                            }
                            TaoLiveVideoView.this.release();
                            TaoLiveVideoView.this.start();
                            TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                            r7t r7tVar3 = taoLiveVideoView3.mConfig;
                            if (r7tVar3 != null && r7tVar3.d == 2) {
                                taoLiveVideoView3.seekTo(i);
                            }
                        }
                    }
                    ja1.e = type;
                }
                TaoLiveVideoView.this.mIsConnected = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.AbstractC0740a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.AbstractC0740a
        public void a(a.b bVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94193bd5", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
                return;
            }
            TaoLiveVideoView.access$2202(TaoLiveVideoView.this, bVar);
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            TaoLiveVideoView.access$2300(taoLiveVideoView, TaoLiveVideoView.access$400(taoLiveVideoView).g, TaoLiveVideoView.access$2200(TaoLiveVideoView.this));
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.AbstractC0740a
        public void b(a.b bVar, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26bc9082", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.AbstractC0740a
        public void c(a.b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d658ae", new Object[]{this, bVar, new Boolean(z)});
            } else {
                TaoLiveVideoView.access$2202(TaoLiveVideoView.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements a.AbstractC0740a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.AbstractC0740a
        public void c(a.b bVar, boolean z) {
            com.taobao.taobaoavsdk.widget.media.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d658ae", new Object[]{this, bVar, new Boolean(z)});
                return;
            }
            AVSDKLog.e("AVSDK", this + " onSurfaceDestroyed holder=" + bVar + ", mTargetState=" + TaoLiveVideoView.this.mTargetState + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
            com.taobao.taobaoavsdk.widget.media.a renderView = bVar.getRenderView();
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            if (renderView != taoLiveVideoView.mRenderView) {
                wdh wdhVar = taoLiveVideoView.mLogAdapter;
                if (wdhVar != null) {
                    ((tcw) wdhVar).a("AVSDK", "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                return;
            }
            TaoLiveVideoView.access$2500(taoLiveVideoView, taoLiveVideoView.mSurfaceHolder);
            TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
            taoLiveVideoView2.mSurfaceHolder = null;
            if (!(!z || TaoLiveVideoView.access$400(taoLiveVideoView2) == null || TaoLiveVideoView.access$400(TaoLiveVideoView.this).f == null || (aVar = TaoLiveVideoView.this.mRenderView) == null || !(aVar instanceof SurfaceRenderView))) {
                AVSDKLog.e("AVSDK", this + " onSurfaceDestroyed setSurface to null");
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.setSurface(null);
            }
            if (TaoLiveVideoView.access$2400(TaoLiveVideoView.this) != null) {
                TaoLiveVideoView.access$2400(TaoLiveVideoView.this).onSurfaceDestroyed();
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.AbstractC0740a
        public void a(a.b bVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94193bd5", new Object[]{this, bVar, new Integer(i), new Integer(i2)});
                return;
            }
            AVSDKLog.e("AVSDK", this + " onSurfaceCreated holder=" + bVar + ", width=" + i + ", height=" + i2 + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
            AVSDKLog.e("AVSDK", this + " onSurfaceCreated holder=" + bVar + ", width=" + i + ", height=" + i2 + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
            com.taobao.taobaoavsdk.widget.media.a renderView = bVar.getRenderView();
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            if (renderView != taoLiveVideoView.mRenderView) {
                wdh wdhVar = taoLiveVideoView.mLogAdapter;
                if (wdhVar != null) {
                    ((tcw) wdhVar).a("AVSDK", "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                return;
            }
            taoLiveVideoView.mSurfaceHolder = bVar;
            if (!(TaoLiveVideoView.access$400(taoLiveVideoView) == null || TaoLiveVideoView.access$400(TaoLiveVideoView.this).f == null)) {
                TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                TaoLiveVideoView.access$2300(taoLiveVideoView2, TaoLiveVideoView.access$400(taoLiveVideoView2).f, bVar);
                TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                if (taoLiveVideoView3.mTargetState == 3 && TaoLiveVideoView.access$400(taoLiveVideoView3).e != 3) {
                    TaoLiveVideoView taoLiveVideoView4 = TaoLiveVideoView.this;
                    int i3 = taoLiveVideoView4.mSeekWhenPrepared;
                    if (i3 != 0) {
                        taoLiveVideoView4.seekTo(i3);
                    }
                    TaoLiveVideoView.this.start();
                }
            }
            if (TaoLiveVideoView.access$2400(TaoLiveVideoView.this) != null) {
                TaoLiveVideoView.access$2400(TaoLiveVideoView.this).onSurfaceCreated();
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.AbstractC0740a
        public void b(a.b bVar, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26bc9082", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            AVSDKLog.e("AVSDK", this + " onSurfaceChanged holder=" + bVar + ", format=" + i + ", width=" + i2 + ", height=" + i3 + ", TaoLiveVideoView.this=" + TaoLiveVideoView.this);
            com.taobao.taobaoavsdk.widget.media.a renderView = bVar.getRenderView();
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            if (renderView != taoLiveVideoView.mRenderView) {
                wdh wdhVar = taoLiveVideoView.mLogAdapter;
                if (wdhVar != null) {
                    ((tcw) wdhVar).a("AVSDK", "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                return;
            }
            taoLiveVideoView.mSurfaceHolder = bVar;
            if (TaoLiveVideoView.access$400(taoLiveVideoView) != null && TaoLiveVideoView.access$400(TaoLiveVideoView.this).f != null) {
                TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                TaoLiveVideoView.access$2300(taoLiveVideoView2, TaoLiveVideoView.access$400(taoLiveVideoView2).f, bVar);
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.setSurfaceSize(i2, i3);
                TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                if (taoLiveVideoView3.mTargetState == 3 && TaoLiveVideoView.access$400(taoLiveVideoView3).e != 3) {
                    TaoLiveVideoView taoLiveVideoView4 = TaoLiveVideoView.this;
                    int i4 = taoLiveVideoView4.mSeekWhenPrepared;
                    if (i4 != 0) {
                        taoLiveVideoView4.seekTo(i4);
                    }
                    TaoLiveVideoView.this.start();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12977a;

        public c(View view) {
            this.f12977a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            View view = this.f12977a;
            if (view != null) {
                view.setVisibility(8);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements IMediaPlayer.OnVideoSizeChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2aeaa0", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            wdh wdhVar = TaoLiveVideoView.this.mLogAdapter;
            if (wdhVar != null) {
                ((tcw) wdhVar).b("AVSDK", "player onVideoSizeChanged, width: " + i + " height: " + i2 + " sarNum: " + i3 + " sarDen: " + i4);
            }
            TaoLiveVideoView.access$000(TaoLiveVideoView.this, i, i2, i3, i4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements IMediaPlayer.OnCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            } else {
                TaoLiveVideoView.this.onCompletion();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements IMediaPlayer.OnSeekCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompletionListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a9f3179", new Object[]{this, iMediaPlayer});
                return;
            }
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", OnSeekCompletion");
            TaoLiveVideoView.this.OnSeekCompletion();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            String str;
            boolean z;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + iMediaPlayer + "player onInfo, arg1: " + j + " arg2: " + j2 + " arg3: " + j3);
            if (TaoLiveVideoView.access$100(TaoLiveVideoView.this) != null) {
                str = "AVSDK";
                TaoLiveVideoView.access$100(TaoLiveVideoView.this).onInfo(iMediaPlayer, j, j2, j3, obj);
            } else {
                str = "AVSDK";
            }
            if (TaoLiveVideoView.access$200(TaoLiveVideoView.this) != null) {
                for (IMediaPlayer.OnInfoListener onInfoListener : TaoLiveVideoView.access$200(TaoLiveVideoView.this)) {
                    if (onInfoListener != null) {
                        onInfoListener.onInfo(iMediaPlayer, j, j2, j3, obj);
                    }
                }
            }
            int i = (int) j;
            if (i == 3) {
                AVSDKLog.d(str, "~~~~ MEDIA_INFO_VIDEO_RENDERING_START ~~~~~~");
                TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
                taoLiveVideoView.bFirstFrameRendered = true;
                ImageView imageView = taoLiveVideoView.mCoverImgView;
                if (imageView == null) {
                    return true;
                }
                TaoLiveVideoView.startViewFadeAnimation(imageView);
                return true;
            } else if (i != 701) {
                if (i == 713) {
                    wdh wdhVar = TaoLiveVideoView.this.mLogAdapter;
                    if (wdhVar != null) {
                        ((tcw) wdhVar).b(str, "MEDIA_INFO_FRAME_QUEUE_NULL");
                    }
                } else if (i == 715) {
                    String str3 = (String) obj;
                    TaoLiveVideoView.access$302(TaoLiveVideoView.this, str3);
                    wdh wdhVar2 = TaoLiveVideoView.this.mLogAdapter;
                    if (wdhVar2 != null) {
                        ((tcw) wdhVar2).b(str, "SEI STRUCT: " + str3 + ",pts: " + j3);
                    }
                } else if (i != 10001) {
                    if (i != 10003) {
                        switch (i) {
                            case 705:
                                wdh wdhVar3 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar3 != null) {
                                    ((tcw) wdhVar3).b(str, "MEDIA_INFO_STREAM_ABNORMAL_ADJOIN: " + j2 + " -> " + j3);
                                    break;
                                }
                                break;
                            case 706:
                                wdh wdhVar4 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar4 != null) {
                                    ((tcw) wdhVar4).b(str, "MEDIA_INFO_STREAM_ABNORMAL_VIDEO: " + j2 + " -> " + j3);
                                    break;
                                }
                                break;
                            case 707:
                                wdh wdhVar5 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar5 != null) {
                                    ((tcw) wdhVar5).b(str, "MEDIA_INFO_STREAM_ABNORMAL_AUDIO: " + j2 + " -> " + j3);
                                    break;
                                }
                                break;
                            case IMediaPlayer.MEDIA_INFO_STREAM_ABNORMAL_AVSTREAM /* 708 */:
                                wdh wdhVar6 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar6 != null) {
                                    ((tcw) wdhVar6).b(str, "MEDIA_INFO_STREAM_ABNORMAL_AVSTREAM: " + j2 + " -> " + j3);
                                    break;
                                }
                                break;
                            case IMediaPlayer.MEDIA_INFO_STREAM_ABNORMAL_VIDEO_DTS /* 709 */:
                                wdh wdhVar7 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar7 != null) {
                                    ((tcw) wdhVar7).b(str, "MEDIA_INFO_STREAM_ABNORMAL_VIDEO_DTS");
                                    break;
                                }
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_SHAKE /* 710 */:
                                str2 = str;
                                wdh wdhVar8 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar8 != null) {
                                    ((tcw) wdhVar8).b(str2, "MEDIA_INFO_NETWORK_SHAKE: " + j2);
                                    break;
                                }
                                break;
                            case 711:
                                wdh wdhVar9 = TaoLiveVideoView.this.mLogAdapter;
                                if (wdhVar9 != null) {
                                    ((tcw) wdhVar9).b(str, "MEDIA_INFO_STREAM_ABNORMAL_ADJOIN: " + j2 + " -> " + j3);
                                    break;
                                }
                                break;
                        }
                    } else {
                        str2 = str;
                    }
                    wdh wdhVar10 = TaoLiveVideoView.this.mLogAdapter;
                    if (wdhVar10 != null) {
                        ((tcw) wdhVar10).b(str2, "MEDIA_INFO_VIDEO_CODEC_ID_CHANGE:arg1" + j + " arg2:" + j2);
                    }
                } else {
                    TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
                    int i2 = (int) j2;
                    taoLiveVideoView2.mVideoRotationDegree = i2;
                    com.taobao.taobaoavsdk.widget.media.a aVar = taoLiveVideoView2.mRenderView;
                    if (aVar != null) {
                        aVar.setVideoRotation(i2);
                    }
                }
                return true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                long j4 = taoLiveVideoView3.lastBufferLoadTime;
                if (j4 == 0) {
                    z = true;
                    taoLiveVideoView3.bufferLoadFrequencyCounter++;
                } else {
                    z = true;
                    if (currentTimeMillis - j4 > taoLiveVideoView3.bufferLoadCountTimeInterval) {
                        taoLiveVideoView3.bufferLoadFrequencyCounter = 0;
                    } else {
                        taoLiveVideoView3.bufferLoadFrequencyCounter++;
                    }
                }
                taoLiveVideoView3.lastBufferLoadTime = currentTimeMillis;
                if (taoLiveVideoView3.bufferLoadFrequencyCounter < taoLiveVideoView3.bufferLoadCountLimit) {
                    return z;
                }
                wdh wdhVar11 = taoLiveVideoView3.mLogAdapter;
                if (wdhVar11 != null) {
                    ((tcw) wdhVar11).b(str, "adapt: " + TaoLiveVideoView.this.bufferLoadFrequencyCounter + " , 15000");
                }
                if (TaoLiveVideoView.access$100(TaoLiveVideoView.this) != null) {
                    TaoLiveVideoView.access$100(TaoLiveVideoView.this).onInfo(iMediaPlayer, 903L, 0L, 0L, null);
                }
                if (TaoLiveVideoView.access$200(TaoLiveVideoView.this) == null) {
                    return z;
                }
                for (IMediaPlayer.OnInfoListener onInfoListener2 : TaoLiveVideoView.access$200(TaoLiveVideoView.this)) {
                    onInfoListener2.onInfo(iMediaPlayer, 903L, 0L, 0L, null);
                }
                return z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements IMediaPlayer.OnBufferingUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f723554e", new Object[]{this, iMediaPlayer, new Integer(i)});
                return;
            }
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            taoLiveVideoView.mCurrentBufferPercentage = i;
            if (TaoLiveVideoView.access$800(taoLiveVideoView) != null) {
                for (IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener : TaoLiveVideoView.access$800(TaoLiveVideoView.this)) {
                    if (onBufferingUpdateListener != null) {
                        onBufferingUpdateListener.onBufferingUpdate(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f, i);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements IMediaPlayer.OnPreparedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
                return;
            }
            wdh wdhVar = TaoLiveVideoView.this.mLogAdapter;
            if (wdhVar != null) {
                ((tcw) wdhVar).b("AVSDK", "player onPrepared");
            }
            TaoLiveVideoView.access$400(TaoLiveVideoView.this).e = 2;
            if (TaoLiveVideoView.access$900(TaoLiveVideoView.this) != null) {
                TaoLiveVideoView.access$900(TaoLiveVideoView.this).onPrepared(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f);
            }
            if (TaoLiveVideoView.access$1000(TaoLiveVideoView.this) != null) {
                for (IMediaPlayer.OnPreparedListener onPreparedListener : TaoLiveVideoView.access$1000(TaoLiveVideoView.this)) {
                    if (onPreparedListener != null) {
                        onPreparedListener.onPrepared(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f);
                    }
                }
            }
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            int i = taoLiveVideoView.mSeekWhenPrepared;
            if (i != 0) {
                taoLiveVideoView.seekTo(i);
            }
            TaoLiveVideoView taoLiveVideoView2 = TaoLiveVideoView.this;
            if (taoLiveVideoView2.mTargetState == 3) {
                taoLiveVideoView2.start();
            } else if (!TaoLiveVideoView.access$1100(taoLiveVideoView2)) {
                TaoLiveVideoView taoLiveVideoView3 = TaoLiveVideoView.this;
                if (taoLiveVideoView3.mTargetState == 4 && TaoLiveVideoView.access$400(taoLiveVideoView3).f != null) {
                    TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.pause();
                    if (TaoLiveVideoView.access$1200(TaoLiveVideoView.this) != null) {
                        for (m mVar : TaoLiveVideoView.access$1200(TaoLiveVideoView.this)) {
                            if (mVar != null) {
                                mVar.v(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f);
                            }
                        }
                    }
                    wdh wdhVar2 = TaoLiveVideoView.this.mLogAdapter;
                    if (wdhVar2 != null) {
                        ((tcw) wdhVar2).b("AVSDK", "player pause in onPrepared");
                    }
                    r7t r7tVar = TaoLiveVideoView.this.mConfig;
                    if (r7tVar != null && r7tVar.m) {
                        pgi.n().j();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements nj9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // tb.nj9
        public long getStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
            }
            if (TaoLiveVideoView.access$1400(TaoLiveVideoView.this) != null) {
                return TaoLiveVideoView.access$1400(TaoLiveVideoView.this).getStartTime();
            }
            return TaoLiveVideoView.access$1500(TaoLiveVideoView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements IMediaPlayer.OnPreparedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12986a;

        public l(boolean z) {
            this.f12986a = z;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            int i;
            TaoLiveVideoView taoLiveVideoView;
            r7t r7tVar;
            TaoLiveVideoView taoLiveVideoView2;
            r7t r7tVar2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            } else if (TaoLiveVideoView.access$400(TaoLiveVideoView.this) != null && TaoLiveVideoView.access$400(TaoLiveVideoView.this).g != null) {
                if (!this.f12986a || (r7tVar2 = (taoLiveVideoView2 = TaoLiveVideoView.this).mConfig) == null || r7tVar2.d != 2) {
                    i = 0;
                } else {
                    i = taoLiveVideoView2.getCurrentPosition();
                }
                TaoLiveVideoView.this.release(false);
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f = TaoLiveVideoView.access$400(TaoLiveVideoView.this).g;
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).g = null;
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).e = 2;
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnPreparedListener(TaoLiveVideoView.access$1600(TaoLiveVideoView.this));
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnVideoSizeChangedListener(TaoLiveVideoView.this.mSizeChangedListener);
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnCompletionListener(TaoLiveVideoView.access$1700(TaoLiveVideoView.this));
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnErrorListener(TaoLiveVideoView.access$1800(TaoLiveVideoView.this));
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnInfoListener(TaoLiveVideoView.access$1900(TaoLiveVideoView.this));
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnBufferingUpdateListener(TaoLiveVideoView.access$2000(TaoLiveVideoView.this));
                TaoLiveVideoView.access$400(TaoLiveVideoView.this).f.registerOnSeekCompleteListener(TaoLiveVideoView.access$2100(TaoLiveVideoView.this));
                TaoLiveVideoView.this.start();
                if (this.f12986a && (r7tVar = (taoLiveVideoView = TaoLiveVideoView.this).mConfig) != null && r7tVar.d == 2) {
                    taoLiveVideoView.seekTo(i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface m {
        void v(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface n {
        void I(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface p {
        void onSurfaceCreated();

        void onSurfaceDestroyed();
    }

    static {
        t2o.a(774897971);
        t2o.a(774897931);
        t2o.a(774897783);
    }

    public TaoLiveVideoView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(TaoLiveVideoView taoLiveVideoView, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11b1b69", new Object[]{taoLiveVideoView, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            taoLiveVideoView.changeVideoSize(i2, i3, i4, i5);
        }
    }

    public static /* synthetic */ IMediaPlayer.OnInfoListener access$100(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnInfoListener) ipChange.ipc$dispatch("c5763ea3", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnInfoListener;
    }

    public static /* synthetic */ List access$1000(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("619cbc2f", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnPreparedListeners;
    }

    public static /* synthetic */ boolean access$1100(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db5239d", new Object[]{taoLiveVideoView})).booleanValue();
        }
        return taoLiveVideoView.mDisableFixPauseOnPrepared;
    }

    public static /* synthetic */ List access$1200(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e5cb16ed", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnPauseListeners;
    }

    public static /* synthetic */ nj9 access$1400(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nj9) ipChange.ipc$dispatch("450db7f1", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mFirstRenderAdapter;
    }

    public static /* synthetic */ long access$1500(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("878ba591", new Object[]{taoLiveVideoView})).longValue();
        }
        return taoLiveVideoView.mStartTime;
    }

    public static /* synthetic */ IMediaPlayer.OnPreparedListener access$1600(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnPreparedListener) ipChange.ipc$dispatch("ceb4eb68", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mPreparedListener;
    }

    public static /* synthetic */ IMediaPlayer.OnCompletionListener access$1700(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnCompletionListener) ipChange.ipc$dispatch("5b8633ea", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mCompletionListener;
    }

    public static /* synthetic */ IMediaPlayer.OnErrorListener access$1800(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnErrorListener) ipChange.ipc$dispatch("37d8a1bf", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mErrorListener;
    }

    public static /* synthetic */ IMediaPlayer.OnInfoListener access$1900(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnInfoListener) ipChange.ipc$dispatch("bb03c59a", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mInfoListener;
    }

    public static /* synthetic */ List access$200(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17ba26bc", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnInfoListeners;
    }

    public static /* synthetic */ IMediaPlayer.OnBufferingUpdateListener access$2000(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnBufferingUpdateListener) ipChange.ipc$dispatch("f6bc6125", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mBufferingUpdateListener;
    }

    public static /* synthetic */ IMediaPlayer.OnSeekCompletionListener access$2100(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnSeekCompletionListener) ipChange.ipc$dispatch("c4a452b", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mSeekCompletionListener;
    }

    public static /* synthetic */ a.b access$2200(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("26d83131", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mNextSurfaceHolder;
    }

    public static /* synthetic */ a.b access$2202(TaoLiveVideoView taoLiveVideoView, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("82a4d8fb", new Object[]{taoLiveVideoView, bVar});
        }
        taoLiveVideoView.mNextSurfaceHolder = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$2300(TaoLiveVideoView taoLiveVideoView, IMediaPlayer iMediaPlayer, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf06610", new Object[]{taoLiveVideoView, iMediaPlayer, bVar});
        } else {
            taoLiveVideoView.bindSurfaceHolder(iMediaPlayer, bVar);
        }
    }

    public static /* synthetic */ p access$2400(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("e0ea2050", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mSurfaceListener;
    }

    public static /* synthetic */ void access$2500(TaoLiveVideoView taoLiveVideoView, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ecf530", new Object[]{taoLiveVideoView, bVar});
        } else {
            taoLiveVideoView.releaseHolderSurface(bVar);
        }
    }

    public static /* synthetic */ Context access$2600(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6765edb5", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mContext;
    }

    public static /* synthetic */ String access$302(TaoLiveVideoView taoLiveVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29150f28", new Object[]{taoLiveVideoView, str});
        }
        taoLiveVideoView.mSeiData = str;
        return str;
    }

    public static /* synthetic */ rgi access$400(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgi) ipChange.ipc$dispatch("6f9c105b", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mMediaPlayerRecycler;
    }

    public static /* synthetic */ void access$500(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0ed1ae", new Object[]{taoLiveVideoView});
        } else {
            taoLiveVideoView.clearKeepScreenOn();
        }
    }

    public static /* synthetic */ IMediaPlayer.OnErrorListener access$600(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnErrorListener) ipChange.ipc$dispatch("323f7190", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnErrorListener;
    }

    public static /* synthetic */ List access$700(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("622e0997", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnErrorListeners;
    }

    public static /* synthetic */ List access$800(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a44536f6", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnBufferingUpdateListeners;
    }

    public static /* synthetic */ IMediaPlayer.OnPreparedListener access$900(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.OnPreparedListener) ipChange.ipc$dispatch("19c042fc", new Object[]{taoLiveVideoView});
        }
        return taoLiveVideoView.mOnPreparedListener;
    }

    private void bindSurfaceHolder(IMediaPlayer iMediaPlayer, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c962c99", new Object[]{this, iMediaPlayer, bVar});
            return;
        }
        AVSDKLog.e("AVSDK", this + ", bindSurfaceHolder " + bVar);
        if (iMediaPlayer != null) {
            if (bVar == null) {
                AVSDKLog.e("AVSDK", this + " bindSurfaceHolder setSurface to null");
                iMediaPlayer.setSurface(null);
                return;
            }
            releaseHolderSurface(bVar);
            bVar.a(iMediaPlayer);
        }
    }

    private void changeVideoSize(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a94eb13", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (i2 != 0 && i3 != 0) {
            if (i2 != this.mVideoWidth || i3 != this.mVideoHeight) {
                this.mVideoWidth = i2;
                this.mVideoHeight = i3;
                this.mVideoSarNum = i4;
                this.mVideoSarDen = i5;
                com.taobao.taobaoavsdk.widget.media.a aVar = this.mRenderView;
                if (aVar != null) {
                    aVar.setVideoSize(i2, i3);
                    this.mRenderView.setVideoSampleAspectRatio(this.mVideoSarNum, this.mVideoSarDen);
                }
            }
        }
    }

    private void clearKeepScreenOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0265704", new Object[]{this});
            return;
        }
        try {
            if (this.mControlScreenByParams) {
                AVSDKLog.e("AVSDK", "ClearScreeon do nothing");
                return;
            }
            AVSDKLog.e("AVSDK", this + "clearKeepScreenOn " + this.mContext + ", " + ja1.L());
            if (this.mEnableGlobalKeepScreenOn) {
                if (this.mHasKeepScreenOn) {
                    this.mHasKeepScreenOn = false;
                    ja1.r();
                    if (ja1.L() == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Context context = this.mContext;
            if (context != null && (context instanceof Activity)) {
                ((Activity) context).getWindow().clearFlags(128);
            }
        } catch (Throwable unused) {
        }
    }

    private void initVideoView(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92adac91", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mVideoSarNum = 0;
        this.mVideoSarDen = 0;
        this.mTargetState = 0;
        setBackgroundColor(context.getResources().getColor(17170444));
        this.mSetDefaultPlayToken = true;
        this.mEnableGlobalKeepScreenOn = true;
        Context context2 = this.mContext;
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            str = r7tVar.t;
        } else {
            str = "";
        }
        this.mEnableSurfaceView = izq.i(context2, str).c();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveVideoView taoLiveVideoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/widget/media/TaoLiveVideoView");
    }

    private boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper().getThread() == VExecutors.currentThread()) {
            return true;
        }
        return false;
    }

    private void keepScreenOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd09697", new Object[]{this});
            return;
        }
        try {
            if (this.mControlScreenByParams) {
                AVSDKLog.e("AVSDK", "KeepScreeon do nothing");
                return;
            }
            AVSDKLog.e("AVSDK", this + "keepScreenOn " + this.mContext + ", " + ja1.L());
            if (this.mEnableGlobalKeepScreenOn) {
                if (!this.mHasKeepScreenOn) {
                    this.mHasKeepScreenOn = true;
                    ja1.R();
                } else {
                    return;
                }
            }
            Context context = this.mContext;
            if (context != null && (context instanceof Activity)) {
                ((Activity) context).getWindow().addFlags(128);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean needSetFusionMode() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("620cabde", new Object[]{this})).booleanValue();
        }
        gf4 gf4Var = this.mConfigAdapter;
        if (gf4Var != null) {
            str = gf4Var.getConfig(this.mConfig.q, TBLIVE_ORANGE_FUSION_MODE, "");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = Build.MODEL;
        String[] split = str.split(";");
        if (split.length > 0) {
            for (String str3 : split) {
                if (TextUtils.equals(str2, str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void notifyOnVideoClick(int i2, int i3, int i4, int i5, int i6, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6309c8d1", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), str});
            return;
        }
        List<IMediaPlayer.OnVideoClickListener> list = this.mOnVideoClickListeners;
        if (list != null) {
            for (IMediaPlayer.OnVideoClickListener onVideoClickListener : list) {
                onVideoClickListener.onClick(i2, i3, i4, i5, i6, str);
            }
        }
    }

    private void pause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5ae2f7", new Object[]{this, new Boolean(z)});
            return;
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (!(rgiVar == null || this.mTargetState == 4)) {
            if (!z) {
                this.bAutoPause = true;
            }
            if (rgiVar.f != null && isPlaying()) {
                wdh wdhVar = this.mLogAdapter;
                if (wdhVar != null) {
                    ((tcw) wdhVar).b("AVSDK", "player pause begin");
                }
                try {
                    BroadcastReceiver broadcastReceiver = this.mNetworkReceiver;
                    if (broadcastReceiver != null) {
                        this.mContext.unregisterReceiver(broadcastReceiver);
                    }
                } catch (Exception unused) {
                }
                this.mMediaPlayerRecycler.f.pause();
                clearKeepScreenOn();
                List<m> list = this.mOnPauseListeners;
                if (list != null) {
                    for (m mVar : list) {
                        if (mVar != null) {
                            mVar.v(this.mMediaPlayerRecycler.f);
                        }
                    }
                }
                wdh wdhVar2 = this.mLogAdapter;
                if (wdhVar2 != null) {
                    ((tcw) wdhVar2).b("AVSDK", "player pause end");
                }
                r7t r7tVar = this.mConfig;
                if (r7tVar != null && r7tVar.m) {
                    pgi.n().j();
                }
                this.mMediaPlayerRecycler.e = 4;
            }
            this.mTargetState = 4;
        }
    }

    private void registerActivityLifecycleCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d7907d", new Object[]{this});
        } else if (this.mContext != null && this.mActivityLifecycleCallbacks == null) {
            this.mActivityLifecycleCallbacks = new com.taobao.mediaplay.player.a(this, (Application) this.mContext.getApplicationContext());
        }
    }

    private void releaseHolderSurface(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec9a815", new Object[]{this, bVar});
        } else if (bVar != null && bVar.getSurface() != null && Build.VERSION.SDK_INT < SDK_INT_FOR_OPTIMIZE) {
            bVar.getSurface().release();
        }
    }

    private void setAspectRatioToNative(int i2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31af42d9", new Object[]{this, new Integer(i2)});
            return;
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null && (abstractMediaPlayer instanceof TaobaoMediaPlayer)) {
            ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_VIDEO_ASPECT_RATIO, i2);
        }
    }

    private void setCoverImg(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3617d0e", new Object[]{this, new Integer(i2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setCoverImg: " + i2 + ", playState: " + isInPlaybackState());
        if (i2 != 0 && !isInPlaybackState()) {
            if (this.mCoverImgView == null) {
                this.mCoverImgView = new ImageView(this.mContext);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                addView(this.mCoverImgView, layoutParams);
            }
            this.mCoverImgView.setVisibility(0);
            this.mCoverImgView.setImageResource(i2);
        }
    }

    private void setH264Hardware(r7t r7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26ad69", new Object[]{this, r7tVar});
        } else if (r7tVar.g != 1 && Build.VERSION.SDK_INT >= 23 && ew0.n(ew0.e(), MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_H264_WHITE, "")) && !ew0.n(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_H264_BLACK, ""))) {
            r7tVar.g = 1;
        }
    }

    private void setH265Hardware(r7t r7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8232946a", new Object[]{this, r7tVar});
        } else if (r7tVar.h != 1 && Build.VERSION.SDK_INT >= 23 && ew0.n(ew0.e(), MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_HEVC_WHITE, "")) && !ew0.n(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_HARDWARE_HEVC_BLACK, ""))) {
            r7tVar.h = 1;
        }
    }

    private void setNextRenderView() {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f12a37", new Object[]{this});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            int i4 = r7tVar.e;
            if (i4 == 1) {
                this.mNextRenderView = new SurfaceRenderView(getContext());
            } else if (i4 == 2) {
                this.mNextRenderView = new TextureRenderView(getContext());
            }
            this.mNextRenderView.setAspectRatio(this.mConfig.f);
            int i5 = this.mVideoWidth;
            if (i5 > 0 && (i3 = this.mVideoHeight) > 0) {
                this.mNextRenderView.setVideoSize(i5, i3);
            }
            int i6 = this.mVideoSarNum;
            if (i6 > 0 && (i2 = this.mVideoSarDen) > 0) {
                this.mNextRenderView.setVideoSampleAspectRatio(i6, i2);
            }
            addView(this.mNextRenderView.getView(), 0, new FrameLayout.LayoutParams(-2, -2, 17));
            this.mNextRenderView.addRenderCallback(this.mNextSHCallback);
            this.mNextRenderView.setVideoRotation(this.mVideoRotationDegree);
        }
    }

    private void setVideoPath(String str, AbstractMediaPlayer abstractMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e78ec0", new Object[]{this, str, abstractMediaPlayer});
        } else if (str != null) {
            this.mPlayUrl = str;
            if (str.startsWith(itw.URL_SEPARATOR)) {
                this.mPlayUrl = "http:" + this.mPlayUrl;
            }
            rgi rgiVar = this.mMediaPlayerRecycler;
            if (rgiVar != null && abstractMediaPlayer != null && rgiVar.e == 0) {
                String str2 = this.mPlayUrl;
                if (this.bAudioOnly) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("onlyaudio=1");
                    str2 = ew0.b(this.mPlayUrl, sb);
                }
                try {
                    abstractMediaPlayer.setDataSource(str2);
                } catch (Exception unused) {
                    this.mMediaPlayerRecycler.e = -1;
                    this.mTargetState = -1;
                    this.mErrorListener.onError(abstractMediaPlayer, 1, 0);
                }
            }
        }
    }

    public static void startViewFadeAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afd7a4a", new Object[]{view});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new c(view));
        view.startAnimation(alphaAnimation);
    }

    private void unregisterActivityLifecycleCallbacks() {
        com.taobao.mediaplay.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f0e456", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context != null && (aVar = this.mActivityLifecycleCallbacks) != null) {
            aVar.b((Application) context.getApplicationContext());
            this.mActivityLifecycleCallbacks = null;
        }
    }

    public void OnSeekCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe46e75a", new Object[]{this});
            return;
        }
        if (this.mOnSeekCompletionListener != null) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", mOnSeekCompletionListener OnSeekCompletion");
            this.mOnSeekCompletionListener.onSeekComplete(this.mMediaPlayerRecycler.f);
        }
        if (this.mOnSeekCompletionListeners != null) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", mOnSeekCompletionListenerOnSeekCompletion");
            for (IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener : this.mOnSeekCompletionListeners) {
                if (onSeekCompletionListener != null) {
                    onSeekCompletionListener.onSeekComplete(this.mMediaPlayerRecycler.f);
                }
            }
        }
    }

    public void blockTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e7d25", new Object[]{this, new Boolean(z)});
        } else {
            this.mBlockTouchEvent = z;
        }
    }

    public void disableAutoPlayForBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd65293", new Object[]{this});
        } else {
            this.mEnableAutoPlayForBackground = false;
        }
    }

    public void enableVideoClickDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d143b09a", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableVideoDetect = z;
        }
    }

    public int getBufferPercentage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4a46ea", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar == null || rgiVar.f == null) {
            return 0;
        }
        return this.mCurrentBufferPercentage;
    }

    public r7t getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7t) ipChange.ipc$dispatch("dd807347", new Object[]{this});
        }
        return this.mConfig;
    }

    @Override // tb.rgi.a
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        if (isInPlaybackState()) {
            return (int) this.mMediaPlayerRecycler.f.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f537a88", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null) {
            return rgiVar.e;
        }
        return 0;
    }

    @Override // tb.rgi.a
    public int getDestoryState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d805014d", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        if (isInPlaybackState()) {
            return (int) this.mMediaPlayerRecycler.f.getDuration();
        }
        return -1;
    }

    public String getMediaPlayUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("854e018c", new Object[]{this});
        }
        return this.mPlayUrl;
    }

    public rgi getMediaPlayerRecycler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgi) ipChange.ipc$dispatch("f7fcc2f3", new Object[]{this});
        }
        if (!this.mConfig.m) {
            return this.mMediaPlayerRecycler;
        }
        return null;
    }

    public com.taobao.taobaoavsdk.widget.media.a getRenderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taobaoavsdk.widget.media.a) ipChange.ipc$dispatch("12305290", new Object[]{this});
        }
        return this.mRenderView;
    }

    public String getSEIData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6f5b6e", new Object[]{this});
        }
        return this.mSeiData;
    }

    public int getVideoHeight() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            return 0;
        }
        return abstractMediaPlayer.getVideoHeight();
    }

    public float getVideoRenderPts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        if (isInPlaybackState()) {
            return this.mMediaPlayerRecycler.f.getVideoRenderPts();
        }
        return 0.0f;
    }

    public int getVideoWidth() {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            return 0;
        }
        return abstractMediaPlayer.getVideoWidth();
    }

    public AbstractMediaPlayer initPlayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractMediaPlayer) ipChange.ipc$dispatch("f1ea51f7", new Object[]{this});
        }
        return openVideo(this.mPlayUrl, true, false);
    }

    public boolean isInPlaybackState() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar == null || rgiVar.f == null || (i2 = rgiVar.e) == -1 || i2 == 0 || i2 == 1) {
            return false;
        }
        return true;
    }

    @Override // tb.rgi.a
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        if (!isInPlaybackState() || !this.mMediaPlayerRecycler.f.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // tb.rgi.a
    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        Rect rect = new Rect();
        View view = this.mRenderUIView;
        if (view == null) {
            return false;
        }
        if (view.getVisibility() == 0 || this.mRenderUIView.getGlobalVisibleRect(rect)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        this.mStartTime = 0L;
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && r7tVar.m && this.mContext == activity && this.mEnableAutoPlayForBackground) {
            if (!this.mDisableFixPauseOnAcctivity) {
                rgi rgiVar = this.mMediaPlayerRecycler;
                if (rgiVar != null && rgiVar.f != null) {
                    int i2 = rgiVar.e;
                    if (!(i2 == 3 || i2 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            pause(false);
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        if (this.mContext == activity) {
            this.mStartTime = System.currentTimeMillis();
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && r7tVar.m && this.mContext == activity && this.bAutoPause && this.mEnableAutoPlayForBackground) {
            start();
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public void onCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313c222", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", onCompletion");
        wdh wdhVar = this.mLogAdapter;
        if (wdhVar != null) {
            ((tcw) wdhVar).b("AVSDK", "player onCompletion");
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && r7tVar.m) {
            pgi.n().j();
        }
        this.mMediaPlayerRecycler.e = 5;
        this.mTargetState = 5;
        clearKeepScreenOn();
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(this.mMediaPlayerRecycler.f);
        }
        List<IMediaPlayer.OnCompletionListener> list = this.mOnCompletionListeners;
        if (list != null) {
            for (IMediaPlayer.OnCompletionListener onCompletionListener2 : list) {
                if (onCompletionListener2 != null) {
                    onCompletionListener2.onCompletion(this.mMediaPlayerRecycler.f);
                }
            }
        }
    }

    public void prepareAsync() {
        rgi rgiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d411b3bc", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", prepareAsync");
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && (rgiVar = this.mMediaPlayerRecycler) != null) {
            if (r7tVar.m) {
                if (rgiVar.d) {
                    this.mMediaPlayerRecycler = pgi.n().g(this.mMediaPlayerRecycler);
                } else {
                    this.mMediaPlayerRecycler = pgi.n().f(this.mConfig.p, this);
                }
            }
            rgi rgiVar2 = this.mMediaPlayerRecycler;
            if (rgiVar2.f == null) {
                rgiVar2.f = initPlayer();
            }
            if (this.mConfig.m) {
                rgi rgiVar3 = this.mMediaPlayerRecycler;
                if (rgiVar3.d) {
                    rgiVar3.d = false;
                }
            }
            rgi rgiVar4 = this.mMediaPlayerRecycler;
            AbstractMediaPlayer abstractMediaPlayer = rgiVar4.f;
            if (abstractMediaPlayer != null && rgiVar4.e == 0) {
                abstractMediaPlayer.prepareAsync();
                this.mMediaPlayerRecycler.e = 1;
            }
            this.mTargetState = 1;
        }
    }

    public void registerOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6b5eca", new Object[]{this, onBufferingUpdateListener});
            return;
        }
        if (this.mOnBufferingUpdateListeners == null) {
            this.mOnBufferingUpdateListeners = new LinkedList();
        }
        this.mOnBufferingUpdateListeners.add(onBufferingUpdateListener);
    }

    public void registerOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9b4082", new Object[]{this, onCompletionListener});
            return;
        }
        if (this.mOnCompletionListeners == null) {
            this.mOnCompletionListeners = new LinkedList();
        }
        this.mOnCompletionListeners.add(onCompletionListener);
    }

    public void registerOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6077aa", new Object[]{this, onErrorListener});
            return;
        }
        if (this.mOnErrorListeners == null) {
            this.mOnErrorListeners = new LinkedList();
        }
        this.mOnErrorListeners.add(onErrorListener);
    }

    public void registerOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0468de", new Object[]{this, onInfoListener});
            return;
        }
        if (this.mOnInfoListeners == null) {
            this.mOnInfoListeners = new LinkedList();
        }
        this.mOnInfoListeners.add(onInfoListener);
    }

    public void registerOnPauseListener(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c0a7a", new Object[]{this, mVar});
            return;
        }
        if (this.mOnPauseListeners == null) {
            this.mOnPauseListeners = new LinkedList();
        }
        this.mOnPauseListeners.add(mVar);
    }

    public void registerOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652e1840", new Object[]{this, onPreparedListener});
            return;
        }
        if (this.mOnPreparedListeners == null) {
            this.mOnPreparedListeners = new LinkedList();
        }
        this.mOnPreparedListeners.add(onPreparedListener);
    }

    public void registerOnSeekCompletionListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6d7152", new Object[]{this, onSeekCompletionListener});
            return;
        }
        if (this.mOnSeekCompletionListeners == null) {
            this.mOnSeekCompletionListeners = new LinkedList();
        }
        this.mOnSeekCompletionListeners.add(onSeekCompletionListener);
    }

    public void registerOnStartListener(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f636bfa", new Object[]{this, nVar});
            return;
        }
        if (this.mOnStartListeners == null) {
            this.mOnStartListeners = new LinkedList();
        }
        this.mOnStartListeners.add(nVar);
    }

    public void registerOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        if (this.mOnVideoClickListeners == null) {
            this.mOnVideoClickListeners = new LinkedList();
        }
        this.mOnVideoClickListeners.add(onVideoClickListener);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", release");
        this.mShouldInitBeforeStart = true;
        this.mReleaseByExtern = true;
        try {
            BroadcastReceiver broadcastReceiver = this.mNetworkReceiver;
            if (broadcastReceiver != null) {
                this.mContext.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception unused) {
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar == null || !r7tVar.m) {
            release(true);
        } else {
            pgi.n().i(this.mConfig.p, this);
        }
    }

    public void requestAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40594b3c", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", requestAudioFocus: " + z);
        try {
            AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (z) {
                String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DISABLE_LONG_AUDIO_FOCUS_SBT, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                String str = "";
                r7t r7tVar = this.mConfig;
                if (r7tVar != null) {
                    str = r7tVar.y;
                }
                if ((TextUtils.isEmpty(config) || TextUtils.isEmpty(str) || !ew0.n(str, config)) && !this.mUseShortAudioFocus) {
                    AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ",requestAudioFocus sbt=" + str + " request long AudioFocus with mVolume: " + this.mMediaPlayerRecycler.i);
                    x3r.j(this.mContext).h(null, 1);
                    this.mRequestLongFocus = true;
                } else {
                    AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ",requestAudioFocus sbt=" + str + " only request short AudioFocus with mVolume: " + this.mMediaPlayerRecycler.i);
                    x3r.j(this.mContext).h(null, 2);
                }
                this.mRequestFocusCount++;
                this.mRequestAudioFocus = true;
                return;
            }
            x3r.j(this.mContext).k(null);
            this.mReleaseFocusCount++;
            this.mRequestAudioFocus = false;
        } catch (Exception e2) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", RequestAudioFocus error" + e2.getMessage());
        }
    }

    public void setAccountId(String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.C = str;
            rgi rgiVar = this.mMediaPlayerRecycler;
            if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                if (((MonitorMediaPlayer) abstractMediaPlayer).getConfig() != null) {
                    ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().C = str;
                }
                if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig() != null) {
                    ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().C = str;
                }
            }
        }
    }

    public void setAspectRatio(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setAspectRatio: " + i2);
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.f = i2;
            com.taobao.taobaoavsdk.widget.media.a aVar = this.mRenderView;
            if (aVar != null) {
                aVar.setAspectRatio(i2);
                setAspectRatioToNative(i2);
            }
        }
    }

    public void setAudioOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a34cd", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setAudioOnly: " + z);
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && r7tVar.d == 0) {
            this.bAudioOnly = z;
        }
    }

    public void setAutoPlayAfterDisconnect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b323a", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAutoAfterDisconnect = z;
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.y = str;
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LIVE_ROOM_BIZ_CODE, "LiveRoom");
            if (TextUtils.isEmpty(config) || !config.equals(str)) {
                this.mConfig.F0 = false;
            } else {
                this.mConfig.F0 = true;
            }
        }
    }

    public void setCdnIP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217763e3", new Object[]{this, str});
            return;
        }
        this.cdn_ip = str.replaceAll(" ", "");
        AVSDKLog.d("AVSDK", "CDN IP: " + this.cdn_ip);
    }

    public void setConfigAdapter(gf4 gf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05c0327", new Object[]{this, gf4Var});
        } else {
            this.mConfigAdapter = gf4Var;
        }
    }

    public void setControlParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfa74ab", new Object[]{this, hashMap});
        } else if (hashMap != null && hashMap.get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM) != null) {
            if (ew0.s(hashMap.get(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM))) {
                this.mControlScreenByParams = true;
            } else {
                this.mControlScreenByParams = false;
            }
        }
    }

    public void setCustomLibLoader(c15 c15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa6e867", new Object[]{this, c15Var});
        }
    }

    public void setFeedId(String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.B = str;
            rgi rgiVar = this.mMediaPlayerRecycler;
            if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                if (((MonitorMediaPlayer) abstractMediaPlayer).getConfig() != null) {
                    ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().B = str;
                }
                if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig() != null) {
                    ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig().B = str;
                }
            }
        }
    }

    public void setFirstRenderAdapter(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
        } else {
            this.mFirstRenderAdapter = nj9Var;
        }
    }

    public void setFirstRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9951f98", new Object[]{this});
        } else {
            this.mStartTime = System.currentTimeMillis();
        }
    }

    public void setLogAdapter(wdh wdhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be5a18f", new Object[]{this, wdhVar});
        } else {
            this.mLogAdapter = wdhVar;
        }
    }

    public void setLooping(boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.bLooping = z;
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            abstractMediaPlayer.setLooping(z);
        }
    }

    public void setMediaSourceType(String str) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.F = str;
            rgi rgiVar = this.mMediaPlayerRecycler;
            if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
                if (((MonitorMediaPlayer) abstractMediaPlayer).getConfig() != null) {
                    ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getConfig().F = str;
                }
                if (((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig() != null) {
                    ((MonitorMediaPlayer) this.mMediaPlayerRecycler.f).getCloneConfig().F = str;
                }
            }
        }
    }

    @Deprecated
    public void setMonitorAdapter(zyi zyiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca313bb", new Object[]{this, zyiVar});
        }
    }

    public void setMuted(boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setMuted: " + z);
        this.bmuted = z;
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            abstractMediaPlayer.setMuted(z);
        }
    }

    @Deprecated
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16523e3", new Object[]{this, onCompletionListener});
        } else {
            this.mOnCompletionListener = onCompletionListener;
        }
    }

    @Deprecated
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4bf04b", new Object[]{this, onErrorListener});
        } else {
            this.mOnErrorListener = onErrorListener;
        }
    }

    @Deprecated
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30795bf", new Object[]{this, onInfoListener});
        } else {
            this.mOnInfoListener = onInfoListener;
        }
    }

    @Deprecated
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6ad421", new Object[]{this, onPreparedListener});
        } else {
            this.mOnPreparedListener = onPreparedListener;
        }
    }

    @Deprecated
    public void setOnSeekCompletionListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19263b3", new Object[]{this, onSeekCompletionListener});
        } else {
            this.mOnSeekCompletionListener = onSeekCompletionListener;
        }
    }

    public void setPlayRate(float f2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f2)});
            return;
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            abstractMediaPlayer.setPlayRate(f2);
        }
    }

    public void setPlayerType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e501bf", new Object[]{this, new Integer(i2)});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null && r7tVar.c != i2) {
            r7tVar.c = i2;
            this.bPlayerTypeChanged = true;
        }
    }

    public void setPropertyFloat(int i2, float f2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3a069", new Object[]{this, new Integer(i2), new Float(f2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setPropertyFloat: " + i2 + ", " + f2);
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            if (this.mPropertyFloat == null) {
                this.mPropertyFloat = new SparseArray<>();
            }
            this.mPropertyFloat.put(i2, Float.valueOf(f2));
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyFloat(i2, f2);
        }
    }

    public void setPropertyLong(int i2, long j2) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff41b", new Object[]{this, new Integer(i2), new Long(j2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setPropertyLong: " + i2 + ", " + j2);
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar == null || (abstractMediaPlayer = rgiVar.f) == null) {
            if (this.mPropertyLong == null) {
                this.mPropertyLong = new SparseArray<>();
            }
            this.mPropertyLong.put(i2, Long.valueOf(j2));
        } else if (abstractMediaPlayer instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) abstractMediaPlayer)._setPropertyLong(i2, j2);
        }
    }

    public void setRenderType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a016aa", new Object[]{this, new Integer(i2)});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            setRenderType(i2, r7tVar.j, r7tVar.k, r7tVar.l);
        }
    }

    public void setScenarioType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i2)});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.d = i2;
        }
    }

    public void setSurfaceListener(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b06e5b", new Object[]{this, pVar});
        } else {
            this.mSurfaceListener = pVar;
        }
    }

    public void setTimeout(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f7de", new Object[]{this, new Long(j2)});
        } else if (j2 > 0) {
            this.timeOutUs = j2;
        } else {
            this.timeOutUs = 10000000L;
        }
    }

    public void setUseShortAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c253f14", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mUseShortAudioFocus = z;
        AVSDKLog.e("AVSDK", "taoLiveVideoView: setUseShortAudioFocus=" + z);
    }

    public void setUsingInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad57968", new Object[]{this, str});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar == null || TextUtils.isEmpty(r7tVar.k0)) {
            this.mUsingInterface = str;
            return;
        }
        r7t r7tVar2 = this.mConfig;
        if (r7tVar2 != null) {
            r7tVar2.k0 = str + ".avliveview";
        }
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            r7tVar.D = str;
        }
    }

    public void setVolume(float f2, float f3) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef12afe3", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setVolume: " + f2 + ", " + f3);
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null && (abstractMediaPlayer = rgiVar.f) != null) {
            abstractMediaPlayer.setVolume(f2, f3);
            this.mMediaPlayerRecycler.i = f2;
        }
    }

    public boolean switchVideoPath(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c3b567b", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null && rgiVar.g == null) {
            rgiVar.g = openVideo(str, false, false);
            AbstractMediaPlayer abstractMediaPlayer = this.mMediaPlayerRecycler.g;
            if (abstractMediaPlayer != null) {
                abstractMediaPlayer.setOnPreparedListener(new l(z));
                return true;
            }
        }
        return false;
    }

    public void switchVideoPathSyncFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84509897", new Object[]{this, str});
        } else {
            switchPathError(str, -748);
        }
    }

    public void unregisterOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c01851", new Object[]{this, onBufferingUpdateListener});
            return;
        }
        List<IMediaPlayer.OnBufferingUpdateListener> list = this.mOnBufferingUpdateListeners;
        if (list != null) {
            list.remove(onBufferingUpdateListener);
        }
    }

    public void unregisterOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b519e6c9", new Object[]{this, onCompletionListener});
            return;
        }
        List<IMediaPlayer.OnCompletionListener> list = this.mOnCompletionListeners;
        if (list != null) {
            list.remove(onCompletionListener);
        }
    }

    public void unregisterOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965fab1", new Object[]{this, onErrorListener});
            return;
        }
        List<IMediaPlayer.OnErrorListener> list = this.mOnErrorListeners;
        if (list != null) {
            list.remove(onErrorListener);
        }
    }

    public void unregisterOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cd01a5", new Object[]{this, onInfoListener});
            return;
        }
        List<IMediaPlayer.OnInfoListener> list = this.mOnInfoListeners;
        if (list != null) {
            list.remove(onInfoListener);
        }
    }

    public void unregisterOnPauseListener(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ea3b01", new Object[]{this, mVar});
            return;
        }
        List<m> list = this.mOnPauseListeners;
        if (list != null) {
            list.remove(mVar);
        }
    }

    public void unregisterOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff10fa07", new Object[]{this, onPreparedListener});
            return;
        }
        List<IMediaPlayer.OnPreparedListener> list = this.mOnPreparedListeners;
        if (list != null) {
            list.remove(onPreparedListener);
        }
    }

    public void unregisterOnSeekCompletionListener(IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e0e099", new Object[]{this, onSeekCompletionListener});
            return;
        }
        List<IMediaPlayer.OnSeekCompletionListener> list = this.mOnSeekCompletionListeners;
        if (list != null) {
            list.remove(onSeekCompletionListener);
        }
    }

    public void unregisterOnStartListener(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d19c81", new Object[]{this, nVar});
            return;
        }
        List<n> list = this.mOnStartListeners;
        if (list != null) {
            list.remove(nVar);
        }
    }

    public void unregisterOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        List<IMediaPlayer.OnVideoClickListener> list = this.mOnVideoClickListeners;
        if (list != null) {
            list.remove(onVideoClickListener);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + iMediaPlayer + " " + ("player onError, framework_err: " + i + ", impl_err: " + i2));
            TaoLiveVideoView.access$400(TaoLiveVideoView.this).e = -1;
            TaoLiveVideoView taoLiveVideoView = TaoLiveVideoView.this;
            taoLiveVideoView.mTargetState = -1;
            TaoLiveVideoView.access$500(taoLiveVideoView);
            r7t r7tVar = TaoLiveVideoView.this.mConfig;
            if (r7tVar != null && r7tVar.m) {
                pgi.n().j();
            }
            if ((TaoLiveVideoView.access$600(TaoLiveVideoView.this) != null && TaoLiveVideoView.access$600(TaoLiveVideoView.this).onError(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f, i, i2)) || TaoLiveVideoView.access$700(TaoLiveVideoView.this) == null) {
                return true;
            }
            for (IMediaPlayer.OnErrorListener onErrorListener : TaoLiveVideoView.access$700(TaoLiveVideoView.this)) {
                z = onErrorListener.onError(TaoLiveVideoView.access$400(TaoLiveVideoView.this).f, i, i2);
            }
            return z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AbstractMediaPlayer f12987a;

        static {
            t2o.a(774897987);
        }

        private o() {
            this.f12987a = TaoLiveVideoView.access$400(TaoLiveVideoView.this).f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AbstractMediaPlayer abstractMediaPlayer = this.f12987a;
            if (abstractMediaPlayer != null) {
                abstractMediaPlayer.stop();
                this.f12987a.release();
            }
        }

        public /* synthetic */ o(TaoLiveVideoView taoLiveVideoView, d dVar) {
            this();
        }
    }

    public TaoLiveVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initConfig(r7t r7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37491d49", new Object[]{this, r7tVar});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", initConfig");
        if ((this.mConfig == null && r7tVar != null) || this.mShouldInitBeforeStart) {
            this.mConfig = r7tVar;
            if (TextUtils.isEmpty(this.mUsingInterface)) {
                this.mConfig.k0 = COMPONENT_NAME;
            } else {
                r7t r7tVar2 = this.mConfig;
                r7tVar2.k0 = this.mUsingInterface + ".avliveview";
            }
            this.mConfig.U0 = new com.taobao.taobaoavsdk.Tracer.c();
            r7t r7tVar3 = this.mConfig;
            r7tVar3.getClass();
            r7tVar3.j0 = false;
            setBusinessId(r7tVar3.x);
            r7t r7tVar4 = this.mConfig;
            _setRenderType(r7tVar4.e, r7tVar4.j, r7tVar4.k, r7tVar4.l);
            setCoverImg(this.mConfig.i);
            if (TextUtils.isEmpty(this.mConfig.q)) {
                this.mConfig.q = "tblive";
            }
            if (TextUtils.isEmpty(this.mConfig.p)) {
                this.mConfig.p = ew0.d();
            }
            if (TextUtils.isEmpty(this.mConfig.t) && (TBLIVE_BUSIINESS_ID.equals(this.mConfig.x) || (this.mSetDefaultPlayToken && s9m.LPM_BIZ_CODE.equals(this.mConfig.x)))) {
                this.mConfig.t = ew0.d();
            }
            if (TBLIVE_BUSIINESS_ID.equals(this.mConfig.x)) {
                this.mConfig.m = false;
            }
            if (this.mConfig.m) {
                this.mMediaPlayerRecycler = pgi.n().f(this.mConfig.p, this);
            } else {
                this.mMediaPlayerRecycler = new rgi(this.mConfig.p, this);
            }
            AbstractMediaPlayer abstractMediaPlayer = this.mMediaPlayerRecycler.f;
            if (abstractMediaPlayer != null) {
                abstractMediaPlayer.registerOnPreparedListener(this.mPreparedListener);
                this.mMediaPlayerRecycler.f.registerOnVideoSizeChangedListener(this.mSizeChangedListener);
                this.mMediaPlayerRecycler.f.registerOnCompletionListener(this.mCompletionListener);
                this.mMediaPlayerRecycler.f.registerOnErrorListener(this.mErrorListener);
                this.mMediaPlayerRecycler.f.registerOnInfoListener(this.mInfoListener);
                this.mMediaPlayerRecycler.f.registerOnBufferingUpdateListener(this.mBufferingUpdateListener);
                this.mMediaPlayerRecycler.f.registerOnSeekCompleteListener(this.mSeekCompletionListener);
            }
            this.mShouldInitBeforeStart = false;
        }
    }

    public void seekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", seekTo: " + i2);
        if (isInPlaybackState()) {
            wdh wdhVar = this.mLogAdapter;
            if (wdhVar != null) {
                ((tcw) wdhVar).b("AVSDK", "player seekTo begin: " + i2);
            }
            this.mMediaPlayerRecycler.f.seekTo(i2);
            wdh wdhVar2 = this.mLogAdapter;
            if (wdhVar2 != null) {
                ((tcw) wdhVar2).b("AVSDK", "player seekTo end: " + i2);
            }
            this.mSeekWhenPrepared = 0;
            return;
        }
        this.mSeekWhenPrepared = i2;
    }

    public void seekToPause(int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8536d9", new Object[]{this, new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", seekTo: " + i2 + ",pause is" + z + ", ignoreInPauseState is " + z2);
        if (isInPlaybackState()) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", Inner seekTo: " + i2);
            this.mMediaPlayerRecycler.f.seekTo((long) i2, z, z2);
            wdh wdhVar = this.mLogAdapter;
            if (wdhVar != null) {
                ((tcw) wdhVar).b("AVSDK", "player seekTo end: " + i2);
            }
            this.mSeekWhenPrepared = 0;
            return;
        }
        this.mSeekWhenPrepared = i2;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", start");
        r7t r7tVar = this.mConfig;
        if (!(r7tVar == null || this.mMediaPlayerRecycler == null)) {
            if (this.mShouldInitBeforeStart) {
                initConfig(r7tVar);
            }
            if (!this.bmuted && this.mMediaPlayerRecycler.i > 0.0f) {
                this.mIsMuteWhenStart = false;
            }
            this.bAutoPause = false;
            wdh wdhVar = this.mLogAdapter;
            if (wdhVar != null) {
                ((tcw) wdhVar).b("AVSDK", "player start,mMediaPlayer :".concat(String.valueOf(this.mMediaPlayerRecycler.f)));
            }
            if (this.mConfig.m) {
                if (this.mMediaPlayerRecycler.d) {
                    this.mMediaPlayerRecycler = pgi.n().g(this.mMediaPlayerRecycler);
                } else {
                    this.mMediaPlayerRecycler = pgi.n().f(this.mConfig.p, this);
                }
            }
            if (this.mMediaPlayerRecycler.f == null) {
                wdh wdhVar2 = this.mLogAdapter;
                if (wdhVar2 != null) {
                    ((tcw) wdhVar2).b("AVSDK", "player start init");
                }
                this.mMediaPlayerRecycler.f = initPlayer();
            }
            if (this.mConfig.m) {
                rgi rgiVar = this.mMediaPlayerRecycler;
                if (rgiVar.d) {
                    rgiVar.d = false;
                    if (rgiVar.f != null) {
                        int i2 = rgiVar.c;
                        if (i2 == 4) {
                            seekTo(rgiVar.b);
                        } else if (i2 == 5) {
                            seekTo(0);
                        } else if (i2 == 3) {
                            seekTo(rgiVar.b);
                            start();
                        }
                    }
                } else {
                    AbstractMediaPlayer abstractMediaPlayer = rgiVar.f;
                    if (abstractMediaPlayer != null) {
                        changeVideoSize(abstractMediaPlayer.getVideoWidth(), this.mMediaPlayerRecycler.f.getVideoHeight(), this.mMediaPlayerRecycler.f.getVideoSarNum(), this.mMediaPlayerRecycler.f.getVideoSarDen());
                    }
                }
            }
            if (isInPlaybackState() && this.mSurfaceHolder != null) {
                wdh wdhVar3 = this.mLogAdapter;
                if (wdhVar3 != null) {
                    ((tcw) wdhVar3).b("AVSDK", "player start begin");
                }
                bindSurfaceHolder(this.mMediaPlayerRecycler.f, this.mSurfaceHolder);
                this.mMediaPlayerRecycler.f.start();
                keepScreenOn();
                if (this.mEnableAutoAfterDisconnect) {
                    try {
                        if (this.mNetworkReceiver == null) {
                            this.mNetworkReceiver = new NetworkBroadcastReceiver();
                        }
                        this.mContext.registerReceiver(this.mNetworkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    } catch (Exception unused) {
                    }
                }
                List<n> list = this.mOnStartListeners;
                if (list != null) {
                    for (n nVar : list) {
                        if (nVar != null) {
                            nVar.I(this.mMediaPlayerRecycler.f);
                        }
                    }
                }
                wdh wdhVar4 = this.mLogAdapter;
                if (wdhVar4 != null) {
                    ((tcw) wdhVar4).b("AVSDK", "player start end");
                }
                this.mMediaPlayerRecycler.e = 3;
            }
            this.mTargetState = 3;
        }
    }

    public TaoLiveVideoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.cdn_ip = "";
        this.mIsConnected = true;
        this.mPlayUrl = "";
        this.mTargetState = 0;
        this.mSurfaceHolder = null;
        this.bufferLoadCountTimeInterval = 15000;
        this.bufferLoadCountLimit = 3;
        this.lastBufferLoadTime = 0L;
        this.bufferLoadFrequencyCounter = 0;
        this.timeOutUs = 10000000L;
        this.mDisableFixPauseOnAcctivity = false;
        this.mDisableFixPauseOnPrepared = false;
        this.mRequestLongFocus = false;
        this.mRequestFocusCount = 0;
        this.mReleaseFocusCount = 0;
        this.mIsMuteWhenStart = true;
        this.bmuted = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        this.bLooping = false;
        this.bFirstFrameRendered = false;
        this.bPlayerTypeChanged = false;
        this.bAudioOnly = false;
        this.mEnableVideoDetect = false;
        this.mBlockTouchEvent = false;
        this.mStartTime = 0L;
        this.mEnableAutoPlayForBackground = true;
        this.mEnableAutoAfterDisconnect = true;
        this.mSetDefaultPlayToken = false;
        this.mShouldInitBeforeStart = true;
        this.mEnableSurfaceView = false;
        this.mEnableOpenGLCrop = false;
        this.mEnableGlobalKeepScreenOn = true;
        this.mUseShortAudioFocus = false;
        this.mControlScreenByParams = false;
        this.mSizeChangedListener = new d();
        this.mCompletionListener = new e();
        this.mSeekCompletionListener = new f();
        this.mInfoListener = new g();
        this.mErrorListener = new h();
        this.mBufferingUpdateListener = new i();
        this.mPreparedListener = new j();
        this.mNextSHCallback = new a();
        this.mSHCallback = new b();
        initVideoView(context);
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
        } else if (this.mConfig != null) {
            AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setBusinessId businessId=" + str);
            r7t r7tVar = this.mConfig;
            r7tVar.x = str;
            r7tVar.L0 = false;
            if (s9m.LPM_BIZ_CODE.equals(str)) {
                r7t r7tVar2 = this.mConfig;
                r7tVar2.y = "recmd";
                boolean b2 = izq.i(this.mContext, r7tVar2.t).b(this.mContext, this.mConfig.y);
                if (this.mEnableSurfaceView && b2) {
                    r7t r7tVar3 = this.mConfig;
                    r7tVar3.L0 = true;
                    r7tVar3.O0 = true;
                }
            }
        }
    }

    public void setRenderType(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146b8fb9", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar == null) {
            return;
        }
        if (r7tVar.e != i2 || r7tVar.j != i3 || r7tVar.k != i4 || r7tVar.l != i5) {
            _setRenderType(i2, i3, i4, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.taobao.taobaoavsdk.widget.media.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.taobao.taobaoavsdk.widget.media.TextureRenderView] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.taobao.taobaoavsdk.widget.media.TextureRenderView] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.taobao.taobaoavsdk.widget.media.SurfaceRenderView] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.taobao.taobaoavsdk.widget.media.SurfaceRenderView] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _setRenderType(int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView._setRenderType(int, int, int, int):void");
    }

    private void switchPathError(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479359a3", new Object[]{this, str, new Integer(i2)});
            return;
        }
        this.mbIsSwitchingPath = false;
        Runnable runnable = this.mSwitchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mSwitchRunnable = null;
        }
        AbstractMediaPlayer abstractMediaPlayer = this.mMediaPlayerRecycler.g;
        if (abstractMediaPlayer != null) {
            abstractMediaPlayer.resetListeners();
            this.mMediaPlayerRecycler.g.release();
            this.mMediaPlayerRecycler.g = null;
        }
        com.taobao.taobaoavsdk.widget.media.a aVar = this.mNextRenderView;
        if (aVar != null) {
            removeView(aVar.getView());
            this.mNextRenderView = null;
        }
        this.mNextSurfaceHolder = null;
        IMediaPlayer.OnInfoListener onInfoListener = this.mInfoListener;
        if (onInfoListener != null) {
            onInfoListener.onInfo(null, 718L, 0L, 0L, null);
        }
        try {
            TBS.Adv.ctrlClicked("Page_Video", CT.Button, "SwitchPath", "feed_id=" + this.mConfig.B, "url_before=" + this.mPlayUrl, "url_after=" + str, "is_success=0", "error_code=" + i2);
        } catch (Throwable unused) {
        }
    }

    @Override // tb.rgi.a
    public void release(boolean z) {
        AbstractMediaPlayer abstractMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", release, " + z);
        if (this.mMediaPlayerRecycler != null) {
            this.mShouldInitBeforeStart = true;
            if (!isMainThread()) {
                AVSDKLog.e("AVSDK", this + " not main thread in release");
            }
            if (z) {
                Runnable runnable = this.mSwitchRunnable;
                if (runnable != null) {
                    removeCallbacks(runnable);
                    this.mSwitchRunnable = null;
                }
                List<m> list = this.mOnPauseListeners;
                if (list != null) {
                    for (m mVar : list) {
                        if (mVar != null) {
                            mVar.v(this.mMediaPlayerRecycler.f);
                        }
                    }
                }
                this.mSeekWhenPrepared = 0;
                clearKeepScreenOn();
            }
            if (this.mRequestAudioFocus) {
                requestAudioFocus(false);
            }
            unregisterActivityLifecycleCallbacks();
            AbstractMediaPlayer abstractMediaPlayer2 = this.mMediaPlayerRecycler.f;
            if (abstractMediaPlayer2 != null) {
                abstractMediaPlayer2.resetListeners();
                try {
                    AbstractMediaPlayer abstractMediaPlayer3 = this.mMediaPlayerRecycler.f;
                    if (abstractMediaPlayer3 instanceof TaobaoMediaPlayer) {
                        TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) abstractMediaPlayer3;
                        HashMap hashMap = new HashMap();
                        hashMap.put(MediaConstant.CMD_SET_RECYCEL_REASON, this.mReleaseByExtern ? "1" : "0");
                        String str = MediaConstant.CMD_UPDATE_PLAY_EX;
                        hashMap.put(str, "is_mute_prepare=" + (this.mIsMuteWhenStart ? 1 : 0) + ",request_long_focus=" + (this.mRequestLongFocus ? 1 : 0) + ",request_focus_count=" + this.mRequestFocusCount + ",release_focus_count=" + this.mReleaseFocusCount);
                        taobaoMediaPlayer.callWithMsg(hashMap);
                        if (this.mConfig.j0) {
                            AVSDKLog.e("AVSDK", this + " release mHandleSurfaceDestroy setSurface to null");
                            this.mMediaPlayerRecycler.f.setSurface(null);
                        }
                        ((TaobaoMediaPlayer) this.mMediaPlayerRecycler.f).setShowViewParent(null);
                        this.mMediaPlayerRecycler.f.releasePrefixInUIThread();
                        dq.b().submit(new o(this, null));
                    } else {
                        abstractMediaPlayer3.release();
                    }
                } catch (Throwable unused) {
                }
                rgi rgiVar = this.mMediaPlayerRecycler;
                rgiVar.f = null;
                rgiVar.e = 0;
                if (z) {
                    com.taobao.taobaoavsdk.widget.media.a aVar = this.mRenderView;
                    if (aVar != null && (aVar instanceof TextureRenderView)) {
                        ((TextureRenderView) aVar).releaseSurface();
                    }
                    this.mTargetState = 0;
                }
            }
            if (z && (abstractMediaPlayer = this.mMediaPlayerRecycler.g) != null) {
                abstractMediaPlayer.resetListeners();
                this.mMediaPlayerRecycler.g.release();
                this.mMediaPlayerRecycler.g = null;
            }
        }
    }

    public void setCoverImg(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1014bb", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", setCoverImg: " + drawable + ", " + z);
        if (drawable != null && !isInPlaybackState()) {
            if (this.mCoverImgView == null) {
                ImageView imageView = new ImageView(this.mContext);
                this.mCoverImgView = imageView;
                addView(imageView);
            }
            if (z) {
                this.mCoverImgView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.mCoverImgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                this.mCoverImgView.setLayoutParams(layoutParams);
            }
            this.mCoverImgView.setVisibility(0);
            this.mCoverImgView.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027c A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0288 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a4 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cd A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f2 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0366 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0374 A[Catch: all -> 0x020b, TRY_ENTER, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0388 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0390 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a2 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a8 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b7 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c1 A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #0 {all -> 0x020b, blocks: (B:98:0x0200, B:100:0x0207, B:108:0x0222, B:110:0x0226, B:112:0x0233, B:113:0x0261, B:114:0x026d, B:116:0x027c, B:117:0x0284, B:119:0x0288, B:120:0x028d, B:122:0x02a4, B:123:0x02cd, B:124:0x02d0, B:126:0x02d4, B:128:0x02dc, B:130:0x02e4, B:131:0x02ee, B:133:0x02f2, B:134:0x02f8, B:137:0x02fd, B:139:0x0305, B:141:0x0317, B:143:0x031c, B:146:0x0325, B:147:0x0328, B:148:0x032b, B:149:0x0330, B:152:0x0335, B:154:0x033d, B:156:0x034f, B:158:0x0354, B:160:0x035a, B:161:0x035d, B:162:0x035f, B:164:0x0366, B:165:0x036b, B:168:0x0374, B:170:0x0380, B:172:0x0388, B:173:0x038c, B:175:0x0390, B:176:0x039a, B:178:0x03a2, B:179:0x03a4, B:181:0x03a8, B:182:0x03b0, B:184:0x03b7, B:186:0x03c1), top: B:202:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Type inference failed for: r1v1, types: [tv.danmaku.ijk.media.player.IMediaPlayer$OnErrorListener] */
    /* JADX WARN: Type inference failed for: r3v1, types: [tv.danmaku.ijk.media.player.AbstractMediaPlayer] */
    /* JADX WARN: Type inference failed for: r3v10, types: [tv.danmaku.ijk.media.player.IMediaPlayer, tv.danmaku.ijk.media.player.MonitorMediaPlayer, tv.danmaku.ijk.media.player.AbstractMediaPlayer] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [tv.danmaku.ijk.media.player.IMediaPlayer] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v8, types: [tb.r7t] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tv.danmaku.ijk.media.player.AbstractMediaPlayer openVideo(java.lang.String r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.openVideo(java.lang.String, boolean, boolean):tv.danmaku.ijk.media.player.AbstractMediaPlayer");
    }

    public void setVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        rgi rgiVar = this.mMediaPlayerRecycler;
        if (rgiVar != null) {
            setVideoPath(str, rgiVar.f);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK", "TaoLiveVideoView " + this + ", pause");
        this.bAutoPause = false;
        pause(true);
    }
}
