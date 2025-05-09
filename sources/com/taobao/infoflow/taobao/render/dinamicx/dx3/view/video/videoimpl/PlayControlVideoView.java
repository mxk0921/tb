package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.ut.device.UTDevice;
import java.util.HashMap;
import tb.bra;
import tb.e9e;
import tb.ecw;
import tb.fdv;
import tb.fra;
import tb.fve;
import tb.gbw;
import tb.kr8;
import tb.lf9;
import tb.mve;
import tb.n6w;
import tb.ncw;
import tb.r7t;
import tb.s9m;
import tb.t2o;
import tb.tcw;
import tb.tve;
import tb.w8w;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PlayControlVideoView extends FrameLayout implements e9e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NON_AUTOMATIC_PLAY_AFTER_DISCONNECT_ENABLE = "nonAutomaticPlayAfterDisconnectEnable";
    private static final String OPEN_PRE_DOWNLOAD_VIDEO = "openPreDownloadVideo";
    public static final String S_BIZ_CODE = "sectionBizCode";
    private static final String TAG = "PlayControlVideoView";
    public static final String VIDEO_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String VIDEO_FEATURE_TYPE = "video";
    public static final String VIDEO_MAIN_BIZ = "Page_Home_VideoPlayer";
    private static final String VIDEO_SUFFIX = ".mp4";
    private boolean isPlayButPreDownload;
    private boolean isUsePreDownloadVideo;
    private JSONObject mCurrentData;
    private boolean mIsAttachedToWindow;
    private boolean mIsNeedWaitSeekComplete;
    private boolean mIsPlayerInError;
    private n6w mPreVideoDownLoadListener;
    private String mSectionBizCode;
    private gbw mStatusListener;
    private n6w mVideoDownLoadListener;
    private ecw mVideoUIController;
    private String mVideoUrl;
    private TaoLiveVideoView mVideoView;
    private boolean mOnFirstFrame = false;
    private boolean mCanPlay = true;
    private String mVideoId = "";
    private final String mUttId = UTDevice.getUtdid(Globals.getApplication());
    private String mPlayId = "";
    private final String mUserId = Login.getOldUserId();
    private long mMediaStartTime = 0;
    private long mPlayStartTime = 0;
    private long mPlayerCreateTime = 0;
    private long mPlayControlStartTime = 0;
    private String mScm = "";
    private String mItemId = "";
    private int mSeekTime = 0;
    private volatile boolean needPauseWhenRealPlay = false;
    private final IMediaPlayer.OnPreparedListener mOnPreparedListener = new a();
    private final TaoLiveVideoView.n mOnStartListener = new b();
    private final IMediaPlayer.OnErrorListener mErrorListener = new c();
    private final IMediaPlayer.OnInfoListener mOnInfoListener = new d();
    private final TaoLiveVideoView.m mOnPauseListener = new e();
    private final IMediaPlayer.OnSeekCompletionListener seekCompletionListener = new f();
    private final IMediaPlayer.OnCompletionListener mOnCompletionListener = new g();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements TaoLiveVideoView.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
        public void I(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            } else if (!PlayControlVideoView.access$500(PlayControlVideoView.this)) {
                fve.e(PlayControlVideoView.TAG, "video View mIsAttachedToWindow false");
                PlayControlVideoView.this.pauseVideo();
            } else if (PlayControlVideoView.access$600(PlayControlVideoView.this)) {
                fve.e(PlayControlVideoView.TAG, "executed pause");
                PlayControlVideoView.this.pauseVideo();
            } else {
                PlayControlVideoView.access$702(PlayControlVideoView.this, System.currentTimeMillis());
                PlayControlVideoView playControlVideoView = PlayControlVideoView.this;
                PlayControlVideoView.access$802(playControlVideoView, PlayControlVideoView.access$900(PlayControlVideoView.this) + PlayControlVideoView.access$700(PlayControlVideoView.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, PlayControlVideoView.access$1000(PlayControlVideoView.this), null, null, PlayControlVideoView.access$1100(PlayControlVideoView.this));
                tve.c("video", "video_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements TaoLiveVideoView.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.m
        public void v(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
            } else if (!TextUtils.isEmpty(PlayControlVideoView.access$1000(PlayControlVideoView.this))) {
                PlayControlVideoView.access$1400(PlayControlVideoView.this, 5, null, null, true);
                TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, PlayControlVideoView.access$1000(PlayControlVideoView.this), null, null, PlayControlVideoView.access$1800(PlayControlVideoView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
            if (PlayControlVideoView.access$200(PlayControlVideoView.this) > 0) {
                fve.e(PlayControlVideoView.TAG, "seekTo onSeekComplete 隐藏封面");
                PlayControlVideoView.access$202(PlayControlVideoView.this, 0);
                PlayControlVideoView.this.hideCoverImageView();
            }
            if (PlayControlVideoView.access$100(PlayControlVideoView.this)) {
                if (PlayControlVideoView.access$300(PlayControlVideoView.this).isPlaying()) {
                    fve.e(PlayControlVideoView.TAG, "seekTo onSeekComplete pauseVideo");
                    PlayControlVideoView.access$300(PlayControlVideoView.this).pause();
                }
                PlayControlVideoView.access$102(PlayControlVideoView.this, false);
                fve.e(PlayControlVideoView.TAG, "seekTo onSeekComplete playVideo");
                PlayControlVideoView.this.playVideo();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements IMediaPlayer.OnCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
                return;
            }
            PlayControlVideoView.this.stopVideo();
            PlayControlVideoView.access$1400(PlayControlVideoView.this, 1, "play_complete", "播放完毕, itemId : " + PlayControlVideoView.access$1200(PlayControlVideoView.this) + ", VideoUrl : " + PlayControlVideoView.access$1300(PlayControlVideoView.this), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements n6w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f10709a;
        public final /* synthetic */ long b;

        public h(long j) {
            this.b = j;
            this.f10709a = PlayControlVideoView.access$1900(PlayControlVideoView.this);
        }

        @Override // tb.n6w
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
                return;
            }
            PlayControlVideoView.access$1400(PlayControlVideoView.this, 4, "normal_download_failed", "下载失败,itemID:" + PlayControlVideoView.access$1200(PlayControlVideoView.this) + ",videoUrl : " + PlayControlVideoView.access$1300(PlayControlVideoView.this), true);
        }

        @Override // tb.n6w
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            fve.e(PlayControlVideoView.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + PlayControlVideoView.access$1300(PlayControlVideoView.this) + " downLoadUrl:" + str);
            HashMap hashMap = new HashMap(2);
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - this.b));
            tve.c("video", "video_fetchCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            if (this.f10709a == PlayControlVideoView.access$1900(PlayControlVideoView.this) && TextUtils.equals(PlayControlVideoView.access$1300(PlayControlVideoView.this), str)) {
                fve.e(PlayControlVideoView.TAG, "downLoadFinish playVideo  data == currentData;");
                PlayControlVideoView.this.playVideo();
                PlayControlVideoView.access$1400(PlayControlVideoView.this, 3, "download_success", "下载成功,itemID:" + PlayControlVideoView.access$1200(PlayControlVideoView.this) + ",videoUrl : " + PlayControlVideoView.access$1300(PlayControlVideoView.this), true);
            }
        }
    }

    static {
        t2o.a(491782177);
        t2o.a(491782176);
    }

    public PlayControlVideoView(Context context, boolean z) {
        super(context);
        init(context, z);
    }

    public static /* synthetic */ boolean access$000(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5482f2bf", new Object[]{playControlVideoView})).booleanValue();
        }
        return playControlVideoView.mIsPlayerInError;
    }

    public static /* synthetic */ boolean access$002(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcdfa73b", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.mIsPlayerInError = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843a26c0", new Object[]{playControlVideoView})).booleanValue();
        }
        return playControlVideoView.mIsNeedWaitSeekComplete;
    }

    public static /* synthetic */ String access$1000(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea55b2b6", new Object[]{playControlVideoView});
        }
        return playControlVideoView.mVideoId;
    }

    public static /* synthetic */ boolean access$102(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40ef35a", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.mIsNeedWaitSeekComplete = z;
        return z;
    }

    public static /* synthetic */ String access$1100(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5fee0d5", new Object[]{playControlVideoView});
        }
        return playControlVideoView.getStartUtArgs();
    }

    public static /* synthetic */ String access$1200(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61a80ef4", new Object[]{playControlVideoView});
        }
        return playControlVideoView.getItemID();
    }

    public static /* synthetic */ String access$1300(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d513d13", new Object[]{playControlVideoView});
        }
        return playControlVideoView.mVideoUrl;
    }

    public static /* synthetic */ void access$1400(PlayControlVideoView playControlVideoView, int i2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e11bcb", new Object[]{playControlVideoView, new Integer(i2), str, str2, new Boolean(z)});
        } else {
            playControlVideoView.callbackStatus(i2, str, str2, z);
        }
    }

    public static /* synthetic */ boolean access$1502(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76076947", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.mOnFirstFrame = z;
        return z;
    }

    public static /* synthetic */ long access$1600(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d4bf324", new Object[]{playControlVideoView})).longValue();
        }
        return playControlVideoView.mPlayStartTime;
    }

    public static /* synthetic */ long access$1700(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d032725", new Object[]{playControlVideoView})).longValue();
        }
        return playControlVideoView.mPlayControlStartTime;
    }

    public static /* synthetic */ String access$1800(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c79f23ae", new Object[]{playControlVideoView});
        }
        return playControlVideoView.getEndUtArgs();
    }

    public static /* synthetic */ JSONObject access$1900(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("44aeae53", new Object[]{playControlVideoView});
        }
        return playControlVideoView.mCurrentData;
    }

    public static /* synthetic */ int access$200(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3f15ab0", new Object[]{playControlVideoView})).intValue();
        }
        return playControlVideoView.mSeekTime;
    }

    public static /* synthetic */ boolean access$2002(PlayControlVideoView playControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0d5246d", new Object[]{playControlVideoView, new Boolean(z)})).booleanValue();
        }
        playControlVideoView.isUsePreDownloadVideo = z;
        return z;
    }

    public static /* synthetic */ int access$202(PlayControlVideoView playControlVideoView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b3dff97", new Object[]{playControlVideoView, new Integer(i2)})).intValue();
        }
        playControlVideoView.mSeekTime = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$2100(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e73b4e", new Object[]{playControlVideoView})).booleanValue();
        }
        return playControlVideoView.isPlayButPreDownload;
    }

    public static /* synthetic */ n6w access$2200(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n6w) ipChange.ipc$dispatch("d6a8cfd9", new Object[]{playControlVideoView});
        }
        return playControlVideoView.mVideoDownLoadListener;
    }

    public static /* synthetic */ TaoLiveVideoView access$300(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("c2c0f24a", new Object[]{playControlVideoView});
        }
        return playControlVideoView.mVideoView;
    }

    public static /* synthetic */ long access$400(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("135fc2b3", new Object[]{playControlVideoView})).longValue();
        }
        return playControlVideoView.mPlayerCreateTime;
    }

    public static /* synthetic */ boolean access$500(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4316f6c4", new Object[]{playControlVideoView})).booleanValue();
        }
        return playControlVideoView.mIsAttachedToWindow;
    }

    public static /* synthetic */ boolean access$600(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72ce2ac5", new Object[]{playControlVideoView})).booleanValue();
        }
        return playControlVideoView.needPauseWhenRealPlay;
    }

    public static /* synthetic */ long access$700(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2855eb6", new Object[]{playControlVideoView})).longValue();
        }
        return playControlVideoView.mMediaStartTime;
    }

    public static /* synthetic */ long access$702(PlayControlVideoView playControlVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f2a7ff4", new Object[]{playControlVideoView, new Long(j)})).longValue();
        }
        playControlVideoView.mMediaStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$802(PlayControlVideoView playControlVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("683896b1", new Object[]{playControlVideoView, str});
        }
        playControlVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$900(PlayControlVideoView playControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("603c0e5c", new Object[]{playControlVideoView});
        }
        return playControlVideoView.mUttId;
    }

    private void addVideoPlayAbnormalStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994686e0", new Object[]{this});
            return;
        }
        fve.e(TAG, "video_stop_abnormal，sectionBizCode" + this.mSectionBizCode);
        tve.c("video", "video_stop_abnormal", "", "Page_Home_VideoPlayer_Count", "", null);
    }

    private void callbackStatus(int i2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4660723b", new Object[]{this, new Integer(i2), str, str2, new Boolean(z)});
            return;
        }
        gbw gbwVar = this.mStatusListener;
        if (gbwVar != null && z) {
            ((fra.a) gbwVar).a(i2, str, str2);
        }
        fve.e(TAG, "callbackStatus", "status:" + i2 + " msg:" + str2);
    }

    private boolean checkNeedPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e0399d", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private void downloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65d53da", new Object[]{this});
            return;
        }
        showCoverImageView();
        if (this.mCurrentData == null) {
            fve.e(TAG, "download error mCurrentData is null");
            return;
        }
        this.mVideoDownLoadListener = new h(System.currentTimeMillis());
        w8w.b().a(this.mVideoUrl, this.mVideoDownLoadListener);
    }

    private String getCurrentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb9dd58c", new Object[]{this});
        }
        JSONObject jSONObject = this.mCurrentData;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    private String getEndUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d81fb78", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mMediaStartTime;
        return "userId=" + this.mUserId + ",video_id=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",type=end,duration_time=" + currentTimeMillis + ",item_id=" + getItemID();
    }

    private String getItemID() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edfaa715", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mItemId) && (jSONObject = this.mCurrentData) != null) {
            Object b2 = kr8.b("item.0.clickParam.itemId", jSONObject);
            if (b2 instanceof String) {
                this.mItemId = (String) b2;
            }
        }
        return this.mItemId;
    }

    private String getScm() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        if (!(!TextUtils.isEmpty(this.mScm) || (jSONObject = this.mCurrentData) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null)) {
            this.mScm = jSONObject2.getString("scm");
        }
        return this.mScm;
    }

    private String getStartUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92025e11", new Object[]{this});
        }
        return "userId=" + this.mUserId + ",video_id=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",scm=" + getScm() + ",item_id=" + getItemID();
    }

    private String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        this.mVideoId = "";
        JSONObject jSONObject = this.mCurrentData;
        if (!(jSONObject == null || jSONObject.getJSONObject("item") == null || this.mCurrentData.getJSONObject("item").getJSONObject("0") == null || this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("content") == null)) {
            this.mVideoId = this.mCurrentData.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString(lf9.KEY_VIDEO_ID);
        }
        return this.mVideoId;
    }

    private void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        initView(context);
        initVideoConfig(z);
        registerListeners(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mPlayerCreateTime = System.currentTimeMillis();
        this.mVideoView = new TaoLiveVideoView(context);
        this.mVideoUIController = new ecw(context, this, this.mVideoView);
        this.mVideoView.disableAutoPlayForBackground();
    }

    public static /* synthetic */ Object ipc$super(PlayControlVideoView playControlVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/videoimpl/PlayControlVideoView");
        }
    }

    private void registerListeners(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60f8fc5", new Object[]{this, context});
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new bra(context, this.mVideoView));
        this.mVideoView.registerOnErrorListener(this.mErrorListener);
        this.mVideoView.registerOnInfoListener(this.mOnInfoListener);
        this.mVideoView.registerOnStartListener(this.mOnStartListener);
        this.mVideoView.registerOnSeekCompletionListener(this.seekCompletionListener);
        this.mVideoView.registerOnPreparedListener(this.mOnPreparedListener);
        this.mVideoView.registerOnPauseListener(this.mOnPauseListener);
        this.mVideoView.registerOnCompletionListener(this.mOnCompletionListener);
    }

    @Override // tb.e9e
    public void canPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609d7e89", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.mVideoUIController.e();
        fve.e(TAG, "hide CoverImage:", this.mSectionBizCode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        release();
    }

    @Override // tb.e9e
    public void registerVideoStatusListener(gbw gbwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a88f6f", new Object[]{this, gbwVar});
        } else {
            this.mStatusListener = gbwVar;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mOnFirstFrame = false;
        showCoverImageView();
        this.mVideoView.release();
        callbackStatus(7, null, null, true);
    }

    public void setCoverBGColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i2)});
        } else {
            this.mVideoUIController.h(i2);
        }
    }

    @Override // tb.ybc
    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
        } else {
            this.mVideoUIController.i(str);
        }
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
        } else {
            this.mVideoUIController.j(drawable);
        }
    }

    @Override // tb.ybc
    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
        } else {
            this.mVideoUIController.k(scaleType);
        }
    }

    @Override // tb.ybc
    public void setDurationTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
        } else {
            this.mVideoUIController.l(str);
        }
    }

    @Override // tb.ybc
    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
        } else {
            this.mVideoUIController.m(str);
        }
    }

    @Override // tb.ybc
    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
        } else {
            this.mVideoUIController.n(str);
        }
    }

    public void setIvVideoVideoFakeBGColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i2)});
        } else {
            this.mVideoUIController.o(i2);
        }
    }

    @Override // tb.ybc
    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
        } else {
            this.mVideoUIController.p(str);
        }
    }

    public void setPlayEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36fc262", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    @Override // tb.ybc
    public void setScaleType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i2)});
        } else {
            this.mVideoUIController.q(i2);
        }
    }

    @Override // tb.e9e
    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        }
    }

    @Override // tb.e9e
    public void setVideoPlayInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f1ceac", new Object[]{this, str});
        }
    }

    @Override // tb.e9e
    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        if (str == null || !str.endsWith(".mp4")) {
            this.mVideoUrl = "";
        } else {
            this.mVideoUrl = str;
        }
        fve.e(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.mVideoUrl);
        preDownloadVideo(this.mVideoUrl);
    }

    public void setVideoViewForeGroundBGColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i2)});
        } else {
            this.mVideoUIController.r(i2);
        }
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        this.mVideoUIController.s();
        fve.e(TAG, "show CoverImage:", this.mSectionBizCode);
    }

    @Override // tb.oib
    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            pauseVideo();
        }
    }

    @Override // tb.e9e
    public void updateData(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
            return;
        }
        this.mCurrentData = jSONObject;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.getString("sectionBizCode");
        }
        this.mSectionBizCode = str;
        this.mVideoId = getVideoId();
        fve.e(TAG, "updateData. currentData = " + getCurrentData());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements n6w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10710a;

        public i(long j) {
            this.f10710a = j;
        }

        @Override // tb.n6w
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
                return;
            }
            PlayControlVideoView.access$2002(PlayControlVideoView.this, false);
            PlayControlVideoView.access$1400(PlayControlVideoView.this, 4, "pre_download_failed", "预下载失败,itemID:" + PlayControlVideoView.access$1200(PlayControlVideoView.this) + ",videoUrl : " + PlayControlVideoView.access$1300(PlayControlVideoView.this), true);
        }

        @Override // tb.n6w
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            PlayControlVideoView.access$2002(PlayControlVideoView.this, true);
            HashMap hashMap = new HashMap(2);
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - this.f10710a));
            tve.c("video", "video_downloadCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            if (PlayControlVideoView.access$2100(PlayControlVideoView.this)) {
                PlayControlVideoView.access$2200(PlayControlVideoView.this).onSuccess(str);
            }
        }
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
        } else if (this.mVideoView.getCurrentState() < 0) {
            UmbrellaTracker.commitFailureStability(fdv.F_DATA_PROCESS, TAG, "1.0", "Page_Home_VideoPlayer", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            fve.e(TAG, "url not correct: cur url：" + this.mVideoView.getMediaPlayUrl() + ", target url:" + this.mVideoUrl + ", cur play state:" + this.mVideoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.mPlayStartTime = System.currentTimeMillis();
            tve.c("video", "video_startPlay", "", "Page_Home_VideoPlayer_Count", "", null);
            this.mVideoView.start();
            callbackStatus(6, null, null, true);
            fve.e(TAG, "startPlay mOnFirstFrame:" + this.mOnFirstFrame + ",mSeekTime:" + this.mSeekTime);
            if (this.mOnFirstFrame && this.mSeekTime <= 0) {
                fve.e(TAG, "start hideCoverImageView");
                hideCoverImageView();
            }
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.mVideoUrl + "video isPlaying:" + this.mVideoView.isPlaying() + "sectionBizCode:" + this.mSectionBizCode);
        }
    }

    private void preDownloadVideo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f364f581", new Object[]{this, str});
        } else if (mve.a(OPEN_PRE_DOWNLOAD_VIDEO, true) && !TextUtils.isEmpty(str)) {
            this.mPreVideoDownLoadListener = new i(System.currentTimeMillis());
            w8w.b().a(str, this.mPreVideoDownLoadListener);
        }
    }

    private void setControlParams(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e275c0fa", new Object[]{this, taoLiveVideoView});
        } else if (mve.a("enableVideoScreenSleep", true)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
            taoLiveVideoView.setControlParams(hashMap);
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
        this.mIsAttachedToWindow = true;
        this.mVideoView.setRenderType(2);
        tve.c("video", "video_exposure", "", "Page_Home_VideoPlayer_Count", "", null);
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        showCoverImageView();
        if (this.mVideoView.isPlaying()) {
            fve.e(TAG, "pause video:", this.mSectionBizCode);
            this.mVideoView.pause();
            callbackStatus(5, null, null, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IMediaPlayer.OnPreparedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
                return;
            }
            fve.e(PlayControlVideoView.TAG, "mOnPreparedListener");
            if (PlayControlVideoView.access$000(PlayControlVideoView.this)) {
                PlayControlVideoView.access$002(PlayControlVideoView.this, false);
                fve.e(PlayControlVideoView.TAG, "mOnPreparedListener seekToPause");
                PlayControlVideoView.access$102(PlayControlVideoView.this, false);
                PlayControlVideoView.access$300(PlayControlVideoView.this).seekToPause(PlayControlVideoView.access$200(PlayControlVideoView.this), false, true);
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$400(PlayControlVideoView.this)));
            tve.c("video", "video_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            PlayControlVideoView.this.showCoverImageView();
            PlayControlVideoView.this.pauseVideo();
            PlayControlVideoView.access$1400(PlayControlVideoView.this, 2, "player_play_error", "播放错误：, itemID:" + PlayControlVideoView.access$1200(PlayControlVideoView.this) + ", what:" + i + ", extra:" + i2 + ", videoUrl:" + PlayControlVideoView.access$1300(PlayControlVideoView.this), true);
            return false;
        }
    }

    private boolean checkPlayEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e06a0a", new Object[]{this})).booleanValue();
        }
        boolean e2 = ncw.e(getContext());
        if (this.mCanPlay && !TextUtils.isEmpty(this.mVideoUrl) && e2) {
            return true;
        }
        showCoverImageView();
        this.mVideoView.release();
        this.mVideoView.setTag("");
        callbackStatus(2, "business_logic_validation_failed", "mCanPlay：" + this.mCanPlay + ",playEnable: " + e2 + ",mVideoUrl: " + this.mVideoUrl, true);
        return false;
    }

    @Override // tb.oib
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (checkPlayEnable()) {
            if (!this.mIsAttachedToWindow) {
                callbackStatus(2, "view_not_attach_to_window", "播放失败， mIsAttachedToWindow:false, itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
            } else if (this.mIsNeedWaitSeekComplete) {
                showCoverImageView();
                fve.e(TAG, "seekTo playVideo 等待seek complete");
            } else if (this.mVideoView.isPlaying()) {
                ecw ecwVar = this.mVideoUIController;
                if (ecwVar != null && ecwVar.g()) {
                    addVideoPlayAbnormalStatistics();
                }
                hideCoverImageView();
                callbackStatus(2, "video_is_playing", "播放失败， mVideoView.isPlaying(), itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
            } else {
                this.mPlayControlStartTime = System.currentTimeMillis();
                String c2 = w8w.b().c(this.mVideoUrl);
                if (c2 != null) {
                    this.isPlayButPreDownload = false;
                    String mediaPlayUrl = this.mVideoView.getMediaPlayUrl();
                    if (!TextUtils.equals(mediaPlayUrl, c2)) {
                        this.mVideoView.release();
                        fve.e(TAG, "playVideo do release, : " + this.mVideoView);
                        this.mVideoView.setVideoPath(c2);
                        if (!checkNeedPlay()) {
                            showCoverImageView();
                            fve.e(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + c2 + " videoUrl:" + this.mVideoUrl);
                            return;
                        }
                    }
                    fve.e(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + c2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.mVideoUrl);
                    if (!this.mVideoView.isPlaying() && TextUtils.equals(c2, this.mVideoView.getMediaPlayUrl())) {
                        innerPlayVideo();
                        if (this.isUsePreDownloadVideo) {
                            UmbrellaTracker.commitSuccessStability(fdv.F_DATA_PROCESS, TAG, "1.0", "Page_Home_VideoPlayer", TAG, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.isPlayButPreDownload = true;
                downloadVideo();
            }
        }
    }

    @Override // tb.e9e
    public void seekTo(int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i2)});
        } else if (this.mVideoView == null || i2 <= 0 || this.mSeekTime > 0) {
            StringBuilder sb = new StringBuilder("seekTo mVideoView null ");
            if (this.mVideoView != null) {
                z = false;
            }
            sb.append(z);
            sb.append(",time ");
            sb.append(i2);
            sb.append(",already mSeekTime :");
            sb.append(this.mSeekTime);
            fve.e(TAG, sb.toString());
        } else {
            this.mSeekTime = i2;
            fve.e(TAG, "seekTo time :" + i2);
            showCoverImageView();
            if (!this.mVideoView.isInPlaybackState()) {
                fve.e(TAG, "seekTo 播放器实例异常 ");
                this.mIsPlayerInError = true;
                return;
            }
            if (this.mVideoView.isPlaying()) {
                fve.e(TAG, "seekTo do pause");
                this.mVideoView.pause();
            }
            fve.e(TAG, "seekTo seekToPause");
            this.mIsNeedWaitSeekComplete = true;
            this.mVideoView.seekToPause(this.mSeekTime, false, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3) {
                PlayControlVideoView.access$1502(PlayControlVideoView.this, true);
                if (!PlayControlVideoView.access$100(PlayControlVideoView.this)) {
                    fve.e(PlayControlVideoView.TAG, "mOnInfoListener 不用等待seek 隐藏cover");
                    PlayControlVideoView.this.hideCoverImageView();
                }
                tve.c("video", "video_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", null);
                HashMap hashMap = new HashMap(2);
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$1600(PlayControlVideoView.this)));
                tve.c("video", "video_startPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                tve.c("video", "video_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$1700(PlayControlVideoView.this)));
                tve.c("video", "video_playControlFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlVideoView.access$700(PlayControlVideoView.this)));
                tve.c("video", "video_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap3);
            }
            return true;
        }
    }

    private void initVideoConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f06e0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mVideoView.setMuted(true);
        r7t r7tVar = new r7t(s9m.LPM_BIZ_CODE);
        r7tVar.d = 2;
        r7tVar.e = 2;
        r7tVar.f = 0;
        this.mVideoView.setConfigAdapter(new tcw());
        this.mVideoView.initConfig(r7tVar);
        this.mVideoView.setLooping(z);
        if (mve.a(NON_AUTOMATIC_PLAY_AFTER_DISCONNECT_ENABLE, true)) {
            this.mVideoView.setAutoPlayAfterDisconnect(false);
        }
        setControlParams(this.mVideoView);
    }
}
