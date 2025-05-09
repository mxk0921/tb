package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.AbsLocalBroadcastReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.ut.device.UTDevice;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.bra;
import tb.e9e;
import tb.ecw;
import tb.fdv;
import tb.fra;
import tb.fve;
import tb.gbw;
import tb.gov;
import tb.kr8;
import tb.lf9;
import tb.mve;
import tb.n6w;
import tb.ncw;
import tb.r7t;
import tb.s9m;
import tb.t2o;
import tb.w8w;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HVideoView extends FrameLayout implements e9e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_PAUSE_VIDEO = "pause";
    public static final String EVENT_TYPE_PLAY_VIDEO = "play";
    public static final String EVENT_TYPE_RELEASE_VIDEO = "release";
    public static final String HAS_ENQUEUE_KEY = "enqueued";
    private static final String H_VIDEO_VIEW_SHOW_COVER_IMAGE_DETACH_WINDOW_ENABLE = "showCoverImageViewDetachWindow";
    private static final String IMMEDIATELY_HIDE_COVER_VIEW_ENABLE = "immediatelyHideCoverViewEnable";
    public static final String S_BIZ_CODE = "sectionBizCode";
    private static final String TAG = "HVideoView";
    public static final String VIDEOVIEW_COVER_URL = "hCoverURL";
    public static final String VIDEOVIEW_DURATION_TEXT = "hDuration";
    public static final String VIDEOVIEW_DURITION_TEXT = "hDurition";
    public static final String VIDEOVIEW_ICON_OFFSETY = "hIconOffsetY";
    public static final String VIDEOVIEW_ICON_URL = "hIconURL";
    public static final String VIDEOVIEW_VIDEO_CAN_PLAY = "hCanPlay";
    public static final String VIDEOVIEW_VIDEO_SCALE_TYPE = "hScaleType";
    public static final String VIDEOVIEW_VIDEO_URL = "hVideoURL";
    public JSONObject currentData;
    private boolean isAttachedToWindow;
    private Context mContext;
    private n6w mVideoDownLoadListener;
    private ecw mVideoUIController;
    private TaoLiveVideoView mVideoView;
    private String sectionBizCode;
    public gbw statusListener;
    private String videoUrl;
    private boolean mCanPlay = true;
    private boolean mNeedAutoPlay = false;
    private String mVideoId = "";
    private String mUttId = UTDevice.getUtdid(Globals.getApplication());
    private String mPlayId = "";
    private String mUserId = Login.getOldUserId();
    private long mStartTime = 0;
    private String mScm = "";
    private String mItemID = "";
    private RecyclerViewStateReceiver mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
    private TaoLiveVideoView.n mOnStartListener = new d();
    private TaoLiveVideoView.m mOnPauseListener = new e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class RecyclerViewStateReceiver extends AbsLocalBroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10694a = 0;
        public final IntentFilter b = new IntentFilter("recyclerViewState");
        public final WeakReference<HVideoView> c;

        static {
            t2o.a(491782166);
        }

        public RecyclerViewStateReceiver(HVideoView hVideoView) {
            super(hVideoView);
            this.c = new WeakReference<>(hVideoView);
        }

        public static /* synthetic */ Object ipc$super(RecyclerViewStateReceiver recyclerViewStateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/HVideoView$RecyclerViewStateReceiver");
        }

        @Override // com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.lifecycle.AbsLocalBroadcastReceiver
        public IntentFilter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("c8ecf4ea", new Object[]{this});
            }
            return this.b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            this.f10694a = intent.getIntExtra("recyclerViewState", 0);
            fve.e(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: mCurrentRecyclerViewState" + this.f10694a);
            if (this.f10694a == 0) {
                HVideoView hVideoView = this.c.get();
                if (hVideoView == null) {
                    fve.e(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: hVideo == null");
                    c();
                } else if (!TextUtils.isEmpty(HVideoView.access$000(hVideoView)) && HVideoView.access$300(hVideoView).getCurrentState() == 0) {
                    hVideoView.playVideo();
                }
                if (hVideoView != null) {
                    fve.e(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: videoUrl:" + HVideoView.access$000(hVideoView) + " videoView.getCurrentState:" + HVideoView.access$300(hVideoView).getCurrentState());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    HVideoView.this.hideCoverImageView();
                }
            }
        }

        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (3 == j) {
                boolean z = iMediaPlayer instanceof MonitorMediaPlayer;
                if (z) {
                    str = ((MonitorMediaPlayer) iMediaPlayer).getPlayUrl();
                } else {
                    str = "";
                }
                String access$200 = HVideoView.access$200(HVideoView.access$000(HVideoView.this));
                fve.e(HVideoView.TAG, "HVideoView start play. selfId:" + hashCode() + ", playUrl=" + str + ", localPathUrl=" + access$200 + ", videoUrl=" + HVideoView.access$000(HVideoView.this));
                if (z && !TextUtils.equals(str, access$200)) {
                    TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView path error", "");
                    try {
                        HVideoView.access$300(HVideoView.this).pause();
                        fve.e(HVideoView.TAG, "selfId:" + hashCode() + ",path error: expect:url:" + HVideoView.access$000(HVideoView.this) + "，actualUrl:" + HVideoView.access$300(HVideoView.this).getMediaPlayUrl() + ",data:" + JSON.toJSONString(iMediaPlayer));
                    } catch (Throwable th) {
                        fve.c(HVideoView.TAG, "HVideoView pause error", th);
                    }
                    return true;
                } else if (mve.a(HVideoView.IMMEDIATELY_HIDE_COVER_VIEW_ENABLE, true)) {
                    HVideoView.this.hideCoverImageView();
                } else {
                    HVideoView.this.postDelayed(new a(), 1200L);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements n6w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f10698a;

        public c() {
            this.f10698a = HVideoView.this.currentData;
        }

        @Override // tb.n6w
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
                return;
            }
            HVideoView hVideoView = HVideoView.this;
            HVideoView.access$100(hVideoView, 4, "下载失败 ： " + HVideoView.access$000(HVideoView.this));
        }

        @Override // tb.n6w
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            fve.e(HVideoView.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + HVideoView.access$000(HVideoView.this) + " downLoadUrl:" + str);
            JSONObject jSONObject = this.f10698a;
            HVideoView hVideoView = HVideoView.this;
            if (jSONObject == hVideoView.currentData && TextUtils.equals(HVideoView.access$000(hVideoView), str)) {
                HVideoView hVideoView2 = HVideoView.this;
                HVideoView.access$100(hVideoView2, 3, "下载成功 " + HVideoView.access$000(HVideoView.this));
                HVideoView.this.playVideo();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements TaoLiveVideoView.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
        public void I(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            } else if (!TextUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                HVideoView.access$502(HVideoView.this, System.currentTimeMillis());
                HVideoView hVideoView = HVideoView.this;
                HVideoView.access$602(hVideoView, HVideoView.access$700(HVideoView.this) + HVideoView.access$500(HVideoView.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$800(HVideoView.this));
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
            } else if (!TextUtils.isEmpty(HVideoView.access$400(HVideoView.this))) {
                TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$400(HVideoView.this), null, null, HVideoView.access$900(HVideoView.this));
            }
        }
    }

    static {
        t2o.a(491782159);
        t2o.a(491782176);
    }

    public HVideoView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ String access$000(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ba64d52", new Object[]{hVideoView});
        }
        return hVideoView.videoUrl;
    }

    public static /* synthetic */ void access$100(HVideoView hVideoView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee8be1e", new Object[]{hVideoView, new Integer(i), str});
        } else {
            hVideoView.callbackStatus(i, str);
        }
    }

    public static /* synthetic */ String access$200(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("378a8f7d", new Object[]{str});
        }
        return getVideoFilePath(str);
    }

    public static /* synthetic */ TaoLiveVideoView access$300(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("30f35e57", new Object[]{hVideoView});
        }
        return hVideoView.mVideoView;
    }

    public static /* synthetic */ String access$400(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aa71bce", new Object[]{hVideoView});
        }
        return hVideoView.mVideoId;
    }

    public static /* synthetic */ long access$500(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9d51d87", new Object[]{hVideoView})).longValue();
        }
        return hVideoView.mStartTime;
    }

    public static /* synthetic */ long access$502(HVideoView hVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4fd6643", new Object[]{hVideoView, new Long(j)})).longValue();
        }
        hVideoView.mStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$602(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7825cec0", new Object[]{hVideoView, str});
        }
        hVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$700(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e7b6ab", new Object[]{hVideoView});
        }
        return hVideoView.mUttId;
    }

    public static /* synthetic */ String access$800(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99a7ea4a", new Object[]{hVideoView});
        }
        return hVideoView.getStartUtArgs();
    }

    public static /* synthetic */ String access$900(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69681de9", new Object[]{hVideoView});
        }
        return hVideoView.getEndUtArgs();
    }

    private void callbackStatus(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb1fbaf", new Object[]{this, new Integer(i), str});
            return;
        }
        gbw gbwVar = this.statusListener;
        if (gbwVar != null) {
            ((fra.a) gbwVar).a(i, "", str);
        }
        fve.e(TAG, "callbackStatus", "status:" + i + " msg:" + str);
    }

    private boolean checkNeedPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e0399d", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 0 && this.mRecyclerViewStateReceiver.f10694a == 0) {
            return true;
        }
        return false;
    }

    private String getCurrentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb9dd58c", new Object[]{this});
        }
        JSONObject jSONObject = this.currentData;
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
        long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
        return "userId=" + this.mUserId + ",video_id=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",type=end,duration_time=" + currentTimeMillis + ",item_id=" + getItemID();
    }

    private String getItemID() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edfaa715", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mItemID) && (jSONObject = this.currentData) != null) {
            Object b2 = kr8.b("item.0.clickParam.itemId", jSONObject);
            if (b2 instanceof String) {
                this.mItemID = (String) b2;
            }
        }
        return this.mItemID;
    }

    private String getScm() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        if (!(!TextUtils.isEmpty(this.mScm) || (jSONObject = this.currentData) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null)) {
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

    private static String getVideoFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3848e5c9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = getVideoFileRootPath() + ncw.a(str);
        if (TextUtils.isEmpty(str2)) {
            fve.e(TAG, "getVideoFilePath empty");
        }
        return str2;
    }

    private static String getVideoFileRootPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c00032d1", new Object[0]);
        }
        return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
    }

    private String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        this.mVideoId = "";
        JSONObject jSONObject = this.currentData;
        if (!(jSONObject == null || jSONObject.getJSONObject("item") == null || this.currentData.getJSONObject("item").getJSONObject("0") == null || this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("content") == null)) {
            this.mVideoId = this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString(lf9.KEY_VIDEO_ID);
        }
        return this.mVideoId;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        initView(context);
        initVideoConfig();
        ((Application) this.mContext.getApplicationContext()).registerActivityLifecycleCallbacks(new bra(this.mContext, this.mVideoView));
        this.mVideoView.registerOnErrorListener(new a());
        this.mVideoView.registerOnInfoListener(new b());
    }

    private void initVideoConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc0fa74", new Object[]{this});
            return;
        }
        this.mVideoView.setMuted(true);
        r7t r7tVar = new r7t(s9m.LPM_BIZ_CODE);
        r7tVar.d = 2;
        r7tVar.e = 2;
        r7tVar.f = 0;
        this.mVideoView.initConfig(r7tVar);
        this.mVideoView.setLooping(true);
        this.mVideoView.disableAutoPlayForBackground();
        setControlParams(this.mVideoView);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mVideoView = new TaoLiveVideoView(context);
        this.mVideoUIController = new ecw(context, this, this.mVideoView);
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
        } else if (this.mVideoView.getCurrentState() < 0) {
            UmbrellaTracker.commitFailureStability(fdv.F_DATA_PROCESS, TAG, "1.0", "Page_Home", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            fve.e(TAG, "url not correct: cur url：" + this.mVideoView.getMediaPlayUrl() + ", target url:" + this.videoUrl + ", cur play state:" + this.mVideoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.mVideoView.start();
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.mVideoView.isPlaying() + "sectionBizCode:" + this.sectionBizCode);
            if (!TextUtils.isEmpty(this.mVideoId)) {
                this.mVideoView.registerOnStartListener(this.mOnStartListener);
                this.mVideoView.registerOnPauseListener(this.mOnPauseListener);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(HVideoView hVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/HVideoView");
        }
    }

    private static boolean newCanPlayVideo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("708b530e", new Object[]{context})).booleanValue();
        }
        return ncw.e(context);
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
        fve.e(TAG, "hide CoverImage:", this.sectionBizCode);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (this.mNeedAutoPlay) {
            if (i == 0) {
                playVideo();
            } else {
                pauseVideo();
            }
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else if (this.mVideoView.isPlaying()) {
            fve.e(TAG, "pause video:", this.sectionBizCode);
            this.mVideoView.pause();
        }
    }

    @Override // tb.oib
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        boolean newCanPlayVideo = newCanPlayVideo(getContext());
        fve.e(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " videoUrl:" + this.videoUrl);
        if (!this.mCanPlay || TextUtils.isEmpty(this.videoUrl) || !newCanPlayVideo) {
            showCoverImageView();
            this.mVideoView.release();
            this.mVideoView.setTag("");
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " status_play_error videoUrl:" + this.videoUrl);
            callbackStatus(2, "播放错误 ：canplay " + this.mCanPlay + " playEnable: " + newCanPlayVideo + " videourl " + this.videoUrl);
        } else if (!this.isAttachedToWindow) {
            callbackStatus(2, " 播放错误 ： 未上屏");
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " isAttachedToWindow: false status_play_error videoUrl:" + this.videoUrl);
        } else {
            String c2 = w8w.b().c(this.videoUrl);
            String mediaPlayUrl = this.mVideoView.getMediaPlayUrl();
            if (this.mVideoView.isPlaying()) {
                if (TextUtils.equals(c2, mediaPlayUrl)) {
                    fve.e(TAG, "playVideo  selfId:" + hashCode() + " 当前videoView isPlaying videoUrl:" + this.videoUrl);
                    return;
                }
                this.mVideoView.pause();
            }
            if (c2 != null) {
                fve.e(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + c2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (!TextUtils.equals(mediaPlayUrl, c2)) {
                    this.mVideoView.release();
                    this.mVideoView.setVideoPath(c2);
                    if (!checkNeedPlay()) {
                        showCoverImageView();
                        fve.e(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + c2 + " videoUrl:" + this.videoUrl);
                        return;
                    }
                }
                fve.e(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + c2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (TextUtils.equals(c2, this.mVideoView.getMediaPlayUrl())) {
                    innerPlayVideo();
                    return;
                }
                return;
            }
            showCoverImageView();
            fve.e(TAG, "playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.mVideoView.isPlaying());
            this.mVideoDownLoadListener = new c();
            w8w.b().a(this.videoUrl, this.mVideoDownLoadListener);
        }
    }

    @Override // tb.e9e
    public void registerVideoStatusListener(gbw gbwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a88f6f", new Object[]{this, gbwVar});
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        showCoverImageView();
        this.mVideoView.release();
    }

    @Override // tb.e9e
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.seekTo(i);
        }
    }

    public void setCoverBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.h(i);
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

    public void setIvVideoVideoFakeBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.o(i);
        }
    }

    public void setNeedAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaa52", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAutoPlay = z;
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
        }
    }

    @Override // tb.ybc
    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.q(i);
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
        String str2 = "";
        if (str == null || !str.endsWith(gov.SUFFIX_MP4)) {
            this.videoUrl = str2;
        } else {
            this.videoUrl = str;
        }
        if (TextUtils.isEmpty(this.videoUrl)) {
            str2 = " , original Url = " + str;
        }
        fve.e(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.videoUrl + str2);
    }

    public void setVideoViewForeGroundBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoUIController.r(i);
        }
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        this.mVideoUIController.s();
        fve.e(TAG, "show CoverImage:", this.sectionBizCode);
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
        this.currentData = jSONObject;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.getString("sectionBizCode");
        }
        this.sectionBizCode = str;
        this.mVideoId = getVideoId();
        fve.e(TAG, "updateData. currentData = " + getCurrentData());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            HVideoView.this.showCoverImageView();
            HVideoView.this.pauseVideo();
            fve.e(HVideoView.TAG, "videoView OnErrorListener", "" + i);
            HVideoView hVideoView = HVideoView.this;
            HVideoView.access$100(hVideoView, 2, "播放错误 " + HVideoView.access$000(HVideoView.this));
            return false;
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
        this.isAttachedToWindow = true;
        this.mVideoView.setRenderType(2);
        fve.e(TAG, "onAttachedToWindow playVideo  selfId:" + hashCode() + " localPath:" + this.videoUrl);
        playVideo();
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
        if (mve.a(H_VIDEO_VIEW_SHOW_COVER_IMAGE_DETACH_WINDOW_ENABLE, true)) {
            showCoverImageView();
        }
        this.mVideoView.release();
        this.mVideoId = "";
    }

    public HVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
