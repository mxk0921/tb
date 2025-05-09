package com.taobao.android.weex_plugin.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.security.realidentity.e2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.Constants;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.a7m;
import tb.asc;
import tb.aub;
import tb.c21;
import tb.cub;
import tb.dwh;
import tb.htb;
import tb.nj9;
import tb.pg1;
import tb.prj;
import tb.pvh;
import tb.qtb;
import tb.s8d;
import tb.tmu;
import tb.uaw;
import tb.uvh;
import tb.vfl;
import tb.w3x;
import tb.w4x;
import tb.x6x;
import tb.x9x;
import tb.yio;
import tb.z74;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VideoPlatformView extends WeexPlatformView implements asc, aub, qtb, htb, nj9, cub {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_CAN_PLAY_THROUGH = "canplaythrough";
    private static final String EVENT_CLICK = "click";
    private static final String EVENT_ENDED = "ended";
    private static final String EVENT_ERROR = "error";
    private static final String EVENT_FINISH = "finish";
    private static final String EVENT_FIRST_FRAME = "firstvideoframe";
    private static final String EVENT_FIRST_FRAME_IN_RENDER = "firstvideoframeinrender";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_PLAYING = "playing";
    private static final String EVENT_POSTER_LOAD_FAIL = "posterloaderror";
    private static final String EVENT_POSTER_LOAD_SUCCESS = "posterload";
    private static final String EVENT_STALLED = "stalled";
    private static final String EVENT_TIMEUPDATE = "timeupdate";
    private static final String LOG_MODULE = "Weex/VideoPlatformView";
    private static final String ORANGE_KEY_POSTER = "enable_new_poster";
    private static final String TAG = "VideoPlatformView";
    public static final int TYPE_DISK = 2;
    public static final int TYPE_MEMORY = 1;
    private DWAspectRatio mAspectRatio;
    private String mContentId;
    private String mFrom;
    private boolean mHasClickEvent;
    private boolean mHasEndEvent;
    private boolean mHasErrorEvent;
    private boolean mHasFinishEvent;
    private boolean mHasFirstFrameEvent;
    private boolean mHasFirstFrameInRenderEvent;
    private boolean mHasPausedEvent;
    private boolean mHasPlayingEvent;
    private boolean mHasPreparedEvent;
    private boolean mHasStalledEvent;
    private boolean mHasTimeUpdateEvent;
    private boolean mHideThinProgressBar;
    private boolean mHideThumbnailPlayBtn;
    private boolean mLoadingLazy;
    private String mPlayScene;
    private String mPlayStatus;
    private String mPoster;
    private AliUrlImageView mPosterImageView;
    private ImageView.ScaleType mPosterScaleType;
    private String mPreload;
    private VideoRootView mRootView;
    private ImageView mSnapshotImageView;
    private String mSrc;
    private long mStartTime;
    private boolean mSwitchVideoTrackOpen;
    private boolean mTBEnv;
    private s mTBPlayerInstance;
    private HashMap<String, String> mUTParams;
    private int mVideoDuration;
    private String mVideoID;
    private HashMap<String, Object> mVideoSourceConfig;
    private String mVideoSourceStr;
    private boolean mLoop = false;
    private boolean mAutoplay = false;
    private boolean mPrepareToFirstFrame = false;
    private boolean mShowControls = true;
    private boolean mMuted = false;
    private int mCurrentTime = 0;
    private long mUserId = -1;
    private long mInteractiveId = -1;
    private String mVideoSource = "TBVideo";
    private boolean mProgressGesture = false;
    private boolean mShownMuteBtn = false;
    private boolean mUseShortAudioFocus = false;
    private boolean mIsReleaseShortFocusWhenPause = true;
    private boolean mHidePlayingIcon = true;
    private boolean mFullscreenBtnHidden = false;
    private boolean mLoadingHide = false;
    private boolean mShowNotWifiHint = true;
    private boolean mHasPlay = false;
    private boolean isCompleted = false;
    private boolean mLandscape = false;
    private boolean mExpectPlay = false;
    private boolean mHiddenPlayErrorView = false;
    private int mWidth = 0;
    private int mHeight = 0;
    private int mBackgroundColor = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class TBVideoInfo implements Serializable {
        public String bizCode;
        public String url;
        public String videoId;
        public String videoSource;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class VideoRootView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private h mDetachedFromWindowListener;
        private i mSizeChangedListener;
        private j mVisibilityChangedListener;

        public VideoRootView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(VideoRootView videoRootView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 348684699) {
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode == 1389530587) {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_plugin/component/VideoPlatformView$VideoRootView");
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
            h hVar = this.mDetachedFromWindowListener;
            if (hVar != null) {
                ((b) hVar).a();
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            i iVar = this.mSizeChangedListener;
            if (iVar != null) {
                ((a) iVar).a(i, i2, i3, i4);
            }
        }

        @Override // android.view.View
        public void onVisibilityChanged(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            } else {
                super.onVisibilityChanged(view, i);
            }
        }

        public VideoRootView whenDetachedFromWindow(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRootView) ipChange.ipc$dispatch("281b0616", new Object[]{this, hVar});
            }
            this.mDetachedFromWindowListener = hVar;
            return this;
        }

        public VideoRootView whenSizeChanged(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRootView) ipChange.ipc$dispatch("fecb7f7c", new Object[]{this, iVar});
            }
            this.mSizeChangedListener = iVar;
            return this;
        }

        public VideoRootView whenVisibilityChanged(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRootView) ipChange.ipc$dispatch("3688875c", new Object[]{this, jVar});
            }
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                VideoPlatformView.access$000(VideoPlatformView.this, i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(VideoPlatformView videoPlatformView) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorResultCode", Integer.valueOf(failPhenixEvent.getResultCode()));
            hashMap.put("error", failPhenixEvent.getHttpMessage());
            hashMap.put("errorHttpCode", Integer.valueOf(failPhenixEvent.getHttpCode()));
            VideoPlatformView.access$100(VideoPlatformView.this, VideoPlatformView.EVENT_POSTER_LOAD_FAIL, hashMap);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            HashMap hashMap = new HashMap();
            if (succPhenixEvent.isImmediate()) {
                str = "1";
            } else if (succPhenixEvent.isFromDisk()) {
                str = "2";
            } else {
                str = "-1";
            }
            hashMap.put("cacheType", str);
            VideoPlatformView.access$200(VideoPlatformView.this, VideoPlatformView.EVENT_POSTER_LOAD_SUCCESS, hashMap);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/component/VideoPlatformView$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            AppMonitor.register(w3x.MODULE_NAME, "weex2video", new String[0], new String[]{"url"}, false);
            if (VideoPlatformView.access$300(VideoPlatformView.this) != null) {
                str = VideoPlatformView.access$400(VideoPlatformView.this).getBundleUrl();
            } else {
                str = "";
            }
            MeasureValueSet create = MeasureValueSet.create();
            DimensionValueSet create2 = DimensionValueSet.create();
            create2.setValue("url", str);
            AppMonitor.Stat.commit(w3x.MODULE_NAME, "weex2video", create2, create);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9992a;

        public f(VideoPlatformView videoPlatformView, float f) {
            this.f9992a = f;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/component/VideoPlatformView$6");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f9992a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface h {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface i {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface j {
    }

    public VideoPlatformView(Context context, int i2) {
        super(context, i2);
        this.mTBEnv = true;
        this.mSwitchVideoTrackOpen = false;
        this.mTBEnv = isTaobaoEnv(context);
        VideoRootView videoRootView = new VideoRootView(context);
        this.mRootView = videoRootView;
        videoRootView.whenSizeChanged(new a());
        this.mRootView.whenDetachedFromWindow(new b(this));
        this.mSwitchVideoTrackOpen = w4x.s("switch_video_track_open", true, false);
    }

    public static /* synthetic */ void access$000(VideoPlatformView videoPlatformView, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94dfaf6", new Object[]{videoPlatformView, new Integer(i2), new Integer(i3)});
        } else {
            videoPlatformView.resizeVideoInstance(i2, i3);
        }
    }

    public static /* synthetic */ void access$100(VideoPlatformView videoPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c621df7d", new Object[]{videoPlatformView, str, obj});
        } else {
            videoPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ void access$200(VideoPlatformView videoPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9884ebe", new Object[]{videoPlatformView, str, obj});
        } else {
            videoPlatformView.fireEvent(str, obj);
        }
    }

    public static /* synthetic */ WeexInstance access$300(VideoPlatformView videoPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("a063fbb", new Object[]{videoPlatformView});
        }
        return videoPlatformView.getWeexInstance();
    }

    public static /* synthetic */ WeexInstance access$400(VideoPlatformView videoPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("336db89a", new Object[]{videoPlatformView});
        }
        return videoPlatformView.getWeexInstance();
    }

    private void changeVideoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e74109", new Object[]{this});
        } else if (this.mWidth != 0 && this.mHeight != 0 && this.mTBPlayerInstance != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(this.mWidth));
            hashMap.put("height", Integer.valueOf(this.mHeight));
            this.mTBPlayerInstance.c("setFrame", hashMap);
        }
    }

    private void destroyTBPlayerInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10a9225", new Object[]{this});
        } else if (this.mTBPlayerInstance != null) {
            getWxVideoResolver().b(this);
            if (this.mTBPlayerInstance.m(1503) == 1) {
                View o = this.mTBPlayerInstance.o();
                ViewGroup viewGroup = (ViewGroup) o.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(o);
                }
                this.mTBPlayerInstance.c("toggleScreen", null);
            }
            this.mRootView.removeView(this.mTBPlayerInstance.o());
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("IMediaPlayLifecycleListener", this);
            this.mTBPlayerInstance.c("unRegisterIMediaPlayLifecycleListener", hashMap);
            this.mTBPlayerInstance.c("unRegisterSeekCompleteListener", hashMap);
            this.mTBPlayerInstance.h();
            this.mTBPlayerInstance = null;
        }
    }

    private static x9x getWxVideoResolver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9x) ipChange.ipc$dispatch("d7cd5215", new Object[0]);
        }
        return (x9x) uvh.f().k();
    }

    public static /* synthetic */ Object ipc$super(VideoPlatformView videoPlatformView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1496307301) {
            super.onFlutterViewDetached();
            return null;
        } else if (hashCode == -499918508) {
            super.onUpdateStyles((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_plugin/component/VideoPlatformView");
        }
    }

    private boolean isTaobaoEnv(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45aece70", new Object[]{this, context})).booleanValue();
        }
        return !"com.unicorn.playground".equals(context.getPackageName());
    }

    private void loadPosterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183caf9f", new Object[]{this});
            return;
        }
        AliUrlImageView aliUrlImageView = new AliUrlImageView(getContext());
        this.mPosterImageView = aliUrlImageView;
        aliUrlImageView.setImageUrl(this.mPoster);
        this.mPosterImageView.succListener(new d()).failListener(new c());
        DWAspectRatio dWAspectRatio = this.mAspectRatio;
        if (dWAspectRatio == DWAspectRatio.DW_CENTER_CROP) {
            this.mPosterImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (dWAspectRatio == DWAspectRatio.DW_FIT_X_Y) {
            this.mPosterImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (dWAspectRatio == DWAspectRatio.DW_FIT_CENTER) {
            this.mPosterImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.mRootView.addView(this.mPosterImageView, new FrameLayout.LayoutParams(-1, -1));
    }

    private void reportErrorException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fcf9cc", new Object[]{this, str});
            return;
        }
        try {
            WeexInstance weexInstance = getWeexInstance();
            if (weexInstance != null) {
                weexInstance.reportInnerException(WeexErrorType.VIDEO_ERROR, "VIDEO_" + str, "video error src:" + this.mSrc);
            }
            setWhiteScreenInfo("video error src:" + this.mSrc + ",videoId:" + this.mVideoID + ",VIDEO_" + str);
        } catch (Exception e2) {
            weexLog("exception error:" + e2.toString());
        }
    }

    private void resizeVideoInstance(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf104403", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.mWidth != i2 || this.mHeight != i3) {
            this.mWidth = i2;
            this.mHeight = i3;
            if (this.mTBPlayerInstance != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("width", Integer.valueOf(this.mWidth));
                hashMap.put("height", Integer.valueOf(this.mHeight));
                this.mTBPlayerInstance.c("setFrame", hashMap);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals("cover") == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setContentMode(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_plugin.component.VideoPlatformView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "f05e5b0b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x0064
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 3143043: goto L_0x003c;
                case 94852023: goto L_0x0033;
                case 951526612: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0046
        L_0x0028:
            java.lang.String r0 = "contain"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r0 = 2
            goto L_0x0046
        L_0x0033:
            java.lang.String r1 = "cover"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0046
            goto L_0x0026
        L_0x003c:
            java.lang.String r0 = "fill"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x0026
        L_0x0045:
            r0 = 0
        L_0x0046:
            switch(r0) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0053;
                case 2: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0064
        L_0x004a:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_FIT_CENTER
            r5.mAspectRatio = r6
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5.mPosterScaleType = r6
            goto L_0x0064
        L_0x0053:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_CENTER_CROP
            r5.mAspectRatio = r6
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.mPosterScaleType = r6
            goto L_0x0064
        L_0x005c:
            com.taobao.avplayer.DWAspectRatio r6 = com.taobao.avplayer.DWAspectRatio.DW_FIT_X_Y
            r5.mAspectRatio = r6
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_XY
            r5.mPosterScaleType = r6
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_plugin.component.VideoPlatformView.setContentMode(java.lang.String):void");
    }

    private void weexLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54965d4", new Object[]{this, str});
        } else if (getMUSInstance() != null) {
            x6x.c(getMUSInstance().getInstanceId(), TAG, str).f();
        } else {
            TLog.loge(LOG_MODULE, TAG, str);
        }
    }

    @JSMethod
    public void commitEndForMultiplexing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.c("commitEndForMultiplexing", null);
        }
    }

    @JSMethod
    public void exitFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb41bfa0", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null && sVar.m(1503) == 1) {
            this.mTBPlayerInstance.c("toggleScreen", null);
        }
    }

    public s extractVideoInstanceNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("28e31ae3", new Object[]{this});
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar == null || sVar.o() == null) {
            return null;
        }
        this.mRootView.removeView(sVar.o());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("IMediaPlayLifecycleListener", this);
        sVar.c("unRegisterIMediaPlayLifecycleListener", hashMap);
        sVar.c("unRegisterSeekCompleteListener", hashMap);
        getWxVideoResolver().b(this);
        this.mTBPlayerInstance = null;
        return sVar;
    }

    @JSMethod
    public void getCurrentTime(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1239af60", new Object[]{this, pvhVar});
        } else if (pvhVar != null) {
            HashMap hashMap = new HashMap(1);
            s sVar = this.mTBPlayerInstance;
            hashMap.put("result", Float.valueOf(sVar != null ? ((float) sVar.m(1502)) / 1000.0f : -1.0f));
            pvhVar.b(MUSValue.ofJSON(hashMap));
        }
    }

    @JSMethod
    public void getDuration(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e0cf3a", new Object[]{this, pvhVar});
        } else if (pvhVar != null) {
            HashMap hashMap = new HashMap(1);
            s sVar = this.mTBPlayerInstance;
            hashMap.put("result", Float.valueOf(sVar != null ? ((float) sVar.m(1501)) / 1000.0f : -1.0f));
            pvhVar.b(MUSValue.ofJSON(hashMap));
        }
    }

    @JSGetter(name = "muted")
    public boolean getMutedProp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b3e3543", new Object[]{this})).booleanValue();
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar == null || sVar.m(1007) != 1) {
            return false;
        }
        return true;
    }

    @Override // tb.nj9
    public long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.mStartTime;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mRootView;
    }

    @Override // tb.qtb
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        if (this.mHasClickEvent) {
            fireEvent("click");
        }
        return false;
    }

    @JSMethod
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
        } else if ((!TextUtils.isEmpty(this.mSrc) || "TBVideo".equals(this.mVideoSource) || ("YKVideo".equals(this.mVideoSource) && !TextUtils.isEmpty(this.mVideoID))) && !this.mLoadingLazy) {
            try {
                initNewTBPlayer();
            } catch (Exception e2) {
                x6x.a(getMUSInstance().getInstanceId(), TAG, e2.toString());
            }
        } else if (!this.mLoadingLazy || TextUtils.isEmpty(this.mPoster)) {
            Log.e(TAG, "src or videoid is empty");
        } else {
            loadPosterView();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
        } else {
            destroyTBPlayerInstance();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onFlutterViewDetached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d0299b", new Object[]{this});
            return;
        }
        super.onFlutterViewDetached();
        destroyTBPlayerInstance();
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        if (this.mHasEndEvent) {
            fireEvent(EVENT_ENDED);
        }
        if (this.mHasFinishEvent) {
            fireEvent("finish");
        }
        getWxVideoResolver().c(this, false);
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        } else {
            getWxVideoResolver().c(this, false);
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        this.isCompleted = true;
        this.mHasPlay = false;
        this.mCurrentTime = 0;
        if (this.mHasEndEvent) {
            fireEvent(EVENT_ENDED);
        }
        if (this.mHasFinishEvent) {
            fireEvent("finish");
        }
        getWxVideoResolver().c(this, false);
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.mHasErrorEvent) {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Integer.valueOf(i2));
            hashMap.put("message", "");
            fireEvent("error", hashMap);
            weexLog("onVideoError:" + i2);
        }
        reportErrorException(String.valueOf(i2));
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        this.isCompleted = false;
        if (this.mHasPreparedEvent) {
            fireEvent(EVENT_CAN_PLAY_THROUGH);
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mCurrentTime = i2;
        if (this.mVideoDuration == 0) {
            this.mVideoDuration = i4;
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
    public void onMediaSeekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i2)});
        } else {
            this.mCurrentTime = i2;
        }
    }

    @Override // tb.htb
    public void onMutedChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff26311", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateStyles(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e233d954", new Object[]{this, map});
            return;
        }
        super.onUpdateStyles(map);
        if (map.get(pg1.ATOM_EXT_UDL_object_fit) != null) {
            setContentMode(map.get(pg1.ATOM_EXT_UDL_object_fit));
        }
        if (map.get(pg1.ATOM_EXT_UDL_border_radius) != null) {
            setRoundRect(Float.parseFloat(map.get(pg1.ATOM_EXT_UDL_border_radius)));
        }
    }

    @Override // tb.cub
    public void onVideoPlayTimeChanged(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c0ba6", new Object[]{this, new Long(j2)});
            return;
        }
        if (this.mHasTimeUpdateEvent) {
            HashMap hashMap = new HashMap();
            hashMap.put(tmu.CURRENT_TIME, Float.valueOf(this.mCurrentTime / 1000.0f));
            hashMap.put("duration", Float.valueOf(this.mVideoDuration / 1000.0f));
            hashMap.put("totalPlayTime", Long.valueOf(j2));
            fireEvent(EVENT_TIMEUPDATE, hashMap);
        }
        ImageView imageView = this.mSnapshotImageView;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.mSnapshotImageView.setVisibility(8);
        }
        AliUrlImageView aliUrlImageView = this.mPosterImageView;
        if (aliUrlImageView != null && aliUrlImageView.getVisibility() == 0) {
            this.mPosterImageView.setVisibility(8);
        }
    }

    @JSMethod
    public void playbackRate(float f2) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf32b5e", new Object[]{this, new Float(f2)});
        } else if (f2 <= 2.0f && f2 >= 0.5f && (sVar = this.mTBPlayerInstance) != null) {
            sVar.B(2000, f2);
        }
    }

    @JSMethod
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else if (this.mTBPlayerInstance != null) {
            destroyTBPlayerInstance();
            initNewTBPlayer();
        }
    }

    @JSMethod
    public void requestFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea31f51", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null && sVar.m(1503) != 1) {
            this.mTBPlayerInstance.c("toggleScreen", null);
        }
    }

    @JSMethod
    public void seek(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i2)});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.y(i2 * 1000, false);
        }
    }

    @WXComponentProp(name = Constants.Name.AUTO_PLAY)
    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoplay = z;
        }
    }

    @WXComponentProp(name = "autoplay")
    public void setAutoplay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c74e68", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoplay = z;
        }
    }

    @WXComponentProp(name = "from")
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mFrom = str;
        }
    }

    @WXComponentProp(name = "contentId")
    public void setContentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.mContentId = str;
        }
    }

    @WXComponentProp(name = "controls")
    public void setControls(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78a5cf5", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowControls = z;
        }
    }

    @JSMethod
    public void setCurrentTime(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105bb8", new Object[]{this, new Integer(i2)});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.y(i2 * 1000, false);
        }
    }

    @WXComponentProp(name = "enable-progress-gesture")
    public void setEnableProgressGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b6be76", new Object[]{this, new Boolean(z)});
        } else {
            this.mProgressGesture = z;
        }
    }

    @WXComponentProp(name = "height")
    public void setHeight(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde360e", new Object[]{this, new Double(d2)});
            return;
        }
        this.mHeight = (int) (d2 * getContext().getResources().getDisplayMetrics().density);
        changeVideoFrame();
    }

    @WXComponentProp(name = "hide-play-error-view")
    public void setHiddenPlayErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420e84a0", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenPlayErrorView = z;
        }
    }

    @WXComponentProp(name = "loadingHidden")
    public void setHideLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79879e55", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoadingHide = z;
        }
    }

    @WXComponentProp(name = "hide-mini-progress-view")
    public void setHideMiniProgressView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7892fe00", new Object[]{this, new Boolean(z)});
        } else {
            setMiniProgressViewHidden(z);
        }
    }

    @WXComponentProp(name = "playingIconHidden")
    public void setHidePlayingIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4952aa", new Object[]{this, new Boolean(z)});
        } else {
            this.mHidePlayingIcon = z;
        }
    }

    @WXComponentProp(name = "interactiveId")
    public void setInteractiveId(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b29f9a2", new Object[]{this, new Long(j2)});
        } else {
            this.mInteractiveId = j2;
        }
    }

    @JSSetter(name = tmu.CURRENT_TIME)
    public void setJSCurrentTime(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47022281", new Object[]{this, new Integer(i2)});
        } else {
            setCurrentTime(i2);
        }
    }

    @WXComponentProp(name = "loading")
    public void setLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c022d8b", new Object[]{this, str});
        } else {
            this.mLoadingLazy = "lazy".equals(str);
        }
    }

    @WXComponentProp(name = "loop")
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoop = z;
        }
    }

    @WXComponentProp(name = "miniProgressViewHidden")
    public void setMiniProgressViewHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2d5d8", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideThinProgressBar = z;
        }
    }

    @WXComponentProp(name = "muted")
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @JSSetter(name = "muted")
    public void setMutedProp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47f8d81", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuted = z;
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @WXComponentProp(name = pg1.ATOM_EXT_UDL_object_fit)
    public void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else {
            setContentMode(str);
        }
    }

    @WXComponentProp(name = "outStartTime")
    public void setOutStartTime(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60a40da", new Object[]{this, new Long(j2)});
        } else {
            this.mStartTime = j2;
        }
    }

    @WXComponentProp(name = "play-control")
    public void setPlayControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68518", new Object[]{this, str});
        } else {
            setPlaystatus(str);
        }
    }

    @WXComponentProp(name = pg1.ATOM_EXT_UDL_background_color)
    public void setPlaygroundColor(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd56c137", new Object[]{this, new Long(j2)});
        } else {
            this.mBackgroundColor = Long.valueOf(j2).intValue();
        }
    }

    @WXComponentProp(name = "poster")
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
        } else {
            this.mPoster = str;
        }
    }

    @WXComponentProp(name = "preload")
    public void setPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63c7298", new Object[]{this, str});
        } else {
            this.mPreload = str;
        }
    }

    @WXComponentProp(name = "p2ff")
    public void setPrepareToFirstFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa2e4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mPrepareToFirstFrame = z;
        }
    }

    @WXComponentProp(name = "short-focus-when-pause")
    public void setReleaseShortFocusWhenPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47d2112", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsReleaseShortFocusWhenPause = z;
        }
    }

    public void setRoundRect(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a02bc9", new Object[]{this, new Float(f2)});
        } else if (getContext() != null) {
            this.mRootView.setOutlineProvider(new f(this, f2 * getContext().getResources().getDisplayMetrics().density));
            this.mRootView.setClipToOutline(true);
        }
    }

    @WXComponentProp(name = "seek-to-time")
    public void setSeekToTime(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ea0ed7", new Object[]{this, new Float(f2)});
        } else {
            this.mCurrentTime = (int) (f2 * 1000.0f);
        }
    }

    @WXComponentProp(name = "show-center-play-btn")
    public void setShowCenterPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8aa6379", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideThumbnailPlayBtn = !z;
        }
    }

    @WXComponentProp(name = "show-fullscreen-btn")
    public void setShowFullScreenBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1945602b", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullscreenBtnHidden = !z;
        }
    }

    @WXComponentProp(name = "show-mute-btn")
    public void setShowMuteBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7dffa9", new Object[]{this, new Boolean(z)});
        } else {
            this.mShownMuteBtn = z;
        }
    }

    @WXComponentProp(name = "showNotWifiHint")
    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowNotWifiHint = z;
        }
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
            return;
        }
        this.mSrc = str;
        if (str.contains("videoId")) {
            try {
                TBVideoInfo tBVideoInfo = (TBVideoInfo) JSON.parseObject(this.mSrc, TBVideoInfo.class);
                this.mSrc = tBVideoInfo.url;
                this.mVideoID = tBVideoInfo.videoId;
                this.mVideoSource = tBVideoInfo.videoSource;
                this.mFrom = tBVideoInfo.bizCode;
            } catch (Throwable unused) {
            }
        }
    }

    @WXComponentProp(name = "utParams")
    public void setUTParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        this.mUTParams = hashMap;
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.D(4000, hashMap);
        }
    }

    @WXComponentProp(name = "use-short-audio-focus")
    public void setUseShortAudioFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c253f14", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseShortAudioFocus = z;
        }
    }

    @WXComponentProp(name = "userId")
    public void setUserId(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdec0ad5", new Object[]{this, new Long(j2)});
        } else {
            this.mUserId = j2;
        }
    }

    @WXComponentProp(name = "video-id")
    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
        } else {
            this.mVideoID = str;
        }
    }

    @WXComponentProp(name = a7m.VIDEO_PLAY_SCENES)
    public void setVideoScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6bb924", new Object[]{this, str});
        } else {
            this.mPlayScene = str;
        }
    }

    @WXComponentProp(name = "video-source")
    public void setVideoSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        } else {
            this.mVideoSource = str;
        }
    }

    @WXComponentProp(name = "videoSourceConfig")
    public void setVideoSourceConfig(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc24df6", new Object[]{this, hashMap});
        } else {
            this.mVideoSourceConfig = hashMap;
        }
    }

    @WXComponentProp(name = "videoSourceStr")
    public void setVideoSourceStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfe45ae", new Object[]{this, str});
        } else {
            this.mVideoSourceStr = str;
        }
    }

    @WXComponentProp(name = "width")
    public void setWidth(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f093", new Object[]{this, new Double(d2)});
            return;
        }
        this.mWidth = (int) (d2 * getContext().getResources().getDisplayMetrics().density);
        changeVideoFrame();
    }

    @JSMethod
    public void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else {
            initNewTBPlayer();
        }
    }

    @JSMethod
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            destroyTBPlayerInstance();
        }
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j2, long j3, long j4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j2), new Long(j3), new Long(j4), obj});
            return;
        }
        int i2 = (int) j2;
        if (i2 == 3) {
            if (this.mHasFirstFrameEvent) {
                fireEvent(EVENT_FIRST_FRAME);
            }
            AliUrlImageView aliUrlImageView = this.mPosterImageView;
            if (aliUrlImageView != null) {
                aliUrlImageView.setVisibility(8);
            }
        } else if (i2 == 12100) {
            if (this.mHasFirstFrameInRenderEvent) {
                fireEvent(EVENT_FIRST_FRAME_IN_RENDER);
            }
            AliUrlImageView aliUrlImageView2 = this.mPosterImageView;
            if (aliUrlImageView2 != null) {
                aliUrlImageView2.setVisibility(8);
            }
        } else if (i2 != 701) {
            if (i2 == 702 && this.mHasPreparedEvent) {
                fireEvent(EVENT_CAN_PLAY_THROUGH);
            }
        } else if (this.mHasStalledEvent) {
            fireEvent("stalled");
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mHasPlay = false;
        }
        if (this.mHasPausedEvent) {
            fireEvent("pause");
        }
        getWxVideoResolver().c(this, false);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateEvents(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
        } else if (hashSet != null) {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (EVENT_CAN_PLAY_THROUGH.equals(next)) {
                    this.mHasPreparedEvent = true;
                } else if (EVENT_ENDED.equals(next)) {
                    this.mHasEndEvent = true;
                } else if ("finish".equals(next)) {
                    this.mHasFinishEvent = true;
                } else if ("error".equals(next)) {
                    this.mHasErrorEvent = true;
                } else if (EVENT_PLAYING.equals(next)) {
                    this.mHasPlayingEvent = true;
                } else if ("stalled".equals(next)) {
                    this.mHasStalledEvent = true;
                } else if ("pause".equals(next)) {
                    this.mHasPausedEvent = true;
                } else if (EVENT_TIMEUPDATE.equals(next)) {
                    this.mHasTimeUpdateEvent = true;
                } else if ("click".equals(next)) {
                    this.mHasClickEvent = true;
                } else if (EVENT_FIRST_FRAME.equals(next)) {
                    this.mHasFirstFrameEvent = true;
                } else if (EVENT_FIRST_FRAME_IN_RENDER.equals(next)) {
                    this.mHasFirstFrameInRenderEvent = true;
                }
            }
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.u();
            weexLog("pauseVideo");
            return;
        }
        this.mExpectPlay = false;
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        if (this.mLoadingLazy) {
            initNewTBPlayer();
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.F();
            weexLog("playVideo by newPlayer");
            return;
        }
        this.mExpectPlay = true;
    }

    @WXComponentProp(name = Constants.Name.PLAY_STATUS)
    public void setPlaystatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d6d6b9", new Object[]{this, str});
            return;
        }
        this.mPlayStatus = str;
        if ("play".equals(str)) {
            this.mHasPlay = true;
            play();
        } else if ("pause".equals(this.mPlayStatus)) {
            pause();
        } else if ("stop".equals(this.mPlayStatus)) {
            stop();
        }
    }

    private void initNewTBPlayer() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5684c666", new Object[]{this});
        } else if (this.mTBPlayerInstance == null) {
            if (!(getContext() instanceof Activity)) {
                reportErrorException("Illegal_Context");
                dwh.f("Weex error", "video context only support activity");
                return;
            }
            s.d dVar = new s.d();
            dVar.g = (Activity) getContext();
            dVar.o = this.mFrom;
            dVar.m = this.mVideoID;
            dVar.j = this.mVideoSource;
            dVar.l = this.mSrc;
            dVar.i = this.mMuted;
            dVar.x = this.mWidth;
            dVar.y = this.mHeight;
            dVar.A = this.mLoop;
            dVar.O = true;
            dVar.X = true;
            dVar.s = this.mUseShortAudioFocus;
            dVar.a0 = this.mIsReleaseShortFocusWhenPause;
            dVar.W = this.mPlayScene;
            dVar.Q = "weexOldVideo";
            dVar.n = "weexOldVideo";
            HashMap<String, String> hashMap = this.mUTParams;
            if (hashMap != null) {
                dVar.c0 = hashMap;
            }
            DWAspectRatio dWAspectRatio = this.mAspectRatio;
            if (dWAspectRatio != null) {
                dVar.q = dWAspectRatio;
            }
            if (!TextUtils.isEmpty(this.mVideoSourceStr)) {
                try {
                    JSONObject a2 = vfl.b().a(new JSONObject(this.mVideoSourceStr), new prj(((Boolean) this.mVideoSourceConfig.get("enable")).booleanValue(), (float) ((Double) this.mVideoSourceConfig.get("ratio")).doubleValue(), ((Integer) this.mVideoSourceConfig.get("netSpeedType")).intValue(), 0.0f, this.mVideoSourceConfig.get("limitDeviceScore") != null ? ((Integer) this.mVideoSourceConfig.get("limitDeviceScore")).intValue() : 0, -1.0f));
                    if (a2 != null) {
                        dVar.V = a2;
                    }
                } catch (Exception e2) {
                    x6x.a(getMUSInstance().getInstanceId(), TAG, e2.toString());
                }
            }
            HashMap<String, String> hashMap2 = new HashMap<>();
            int i2 = c21.g().getInt("deviceLevel", -1);
            if (i2 == 0) {
                str = "50";
            } else if (i2 == 1) {
                str = "100";
            } else if (i2 == 2) {
                str = "200";
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap2.put("_progressTime", str);
                dVar.w = hashMap2;
            }
            if (this.mShowControls) {
                dVar.T = true;
            }
            dVar.u = this;
            dVar.t = this;
            if (this.mLoop) {
                dVar.I = this;
            }
            dVar.G = this;
            dVar.H = this;
            dVar.M = this;
            this.mTBPlayerInstance = s.c.c("", dVar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (this.mLoadingLazy) {
                this.mRootView.addView(this.mTBPlayerInstance.o(), 0, layoutParams);
            } else {
                this.mRootView.addView(this.mTBPlayerInstance.o(), layoutParams);
                if (!TextUtils.isEmpty(this.mPoster)) {
                    loadPosterView();
                }
            }
            if (this.mAutoplay || "play".equals(this.mPlayStatus)) {
                this.mTBPlayerInstance.F();
            } else if (!"none".equals(this.mPreload)) {
                this.mTBPlayerInstance.c("asyncPrepareVideo", null);
            } else if (this.mPrepareToFirstFrame) {
                this.mTBPlayerInstance.v();
            }
            getWxVideoResolver().a(this);
            weexLog("initNewTBPlayer");
            if (this.mSwitchVideoTrackOpen) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new e());
            }
        }
    }

    @JSMethod
    public void getSnapshotImage(float f2, pvh pvhVar) {
        TextureView a2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d01be1", new Object[]{this, new Float(f2), pvhVar});
        } else if (getView() != null && (a2 = z74.a((ViewGroup) getView())) != null && getContext() != null) {
            int i2 = getContext().getResources().getDisplayMetrics().widthPixels;
            if (a2.getWidth() >= i2) {
                bitmap = a2.getBitmap(i2, a2.getHeight());
            } else {
                bitmap = a2.getBitmap();
            }
            if (bitmap != null) {
                ImageView imageView = this.mSnapshotImageView;
                if (imageView == null) {
                    ImageView imageView2 = new ImageView(getContext());
                    this.mSnapshotImageView = imageView2;
                    imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.mSnapshotImageView.setImageBitmap(bitmap);
                    this.mRootView.addView(this.mSnapshotImageView, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    imageView.setImageBitmap(bitmap);
                    this.mSnapshotImageView.setVisibility(0);
                }
                String str = "video" + System.currentTimeMillis();
                uaw.b().c(str, bitmap);
                HashMap hashMap = new HashMap(1);
                hashMap.put("fileName", str);
                pvhVar.b(MUSValue.ofJSON(hashMap));
            }
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        ImageView imageView = this.mSnapshotImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.mHasPlay = true;
        this.isCompleted = false;
        if (this.mHasPlayingEvent) {
            fireEvent(EVENT_PLAYING);
        }
        getWxVideoResolver().c(this, true);
    }

    @Override // tb.asc
    public void onMediaStart() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        this.isCompleted = false;
        this.mHasPlay = true;
        int i2 = this.mCurrentTime;
        if (i2 > 0 && (sVar = this.mTBPlayerInstance) != null) {
            sVar.y(i2, false);
        }
        this.mCurrentTime = 0;
        if (this.mHasPlayingEvent) {
            fireEvent(EVENT_PLAYING);
        }
        getWxVideoResolver().c(this, true);
    }

    public void recoverVideoInstanceNew(s sVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100d6ee0", new Object[]{this, sVar});
        } else if (this.mTBPlayerInstance != null) {
            sVar.h();
        } else {
            this.mTBPlayerInstance = sVar;
            sVar.D(4009, this);
            this.mTBPlayerInstance.D(4015, this);
            this.mTBPlayerInstance.D(e2.y0, this);
            if (this.mLoop) {
                this.mTBPlayerInstance.D(4010, this);
            }
            this.mRootView.addView(this.mTBPlayerInstance.o());
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(this.mWidth));
            hashMap.put("height", Integer.valueOf(this.mHeight));
            this.mTBPlayerInstance.c("setFrame", hashMap);
            this.mTBPlayerInstance.t(this.mMuted);
            getWxVideoResolver().a(this);
            x9x wxVideoResolver = getWxVideoResolver();
            if (this.mTBPlayerInstance.m(1500) != 1) {
                z = false;
            }
            wxVideoResolver.c(this, z);
        }
    }

    @JSGetter(name = tmu.CURRENT_TIME)
    public float getCurrentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            return ((float) sVar.m(1502)) / 1000.0f;
        }
        return 0.0f;
    }

    @JSGetter(name = "duration")
    public float getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue();
        }
        try {
            s sVar = this.mTBPlayerInstance;
            if (sVar != null) {
                return ((float) sVar.m(1501)) / 1000.0f;
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
