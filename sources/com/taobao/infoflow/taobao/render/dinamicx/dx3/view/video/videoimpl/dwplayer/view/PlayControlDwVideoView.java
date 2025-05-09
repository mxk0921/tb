package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.r;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.a18;
import tb.b18;
import tb.c18;
import tb.e9e;
import tb.fdv;
import tb.fra;
import tb.fve;
import tb.gbw;
import tb.hnn;
import tb.kr8;
import tb.mve;
import tb.ncw;
import tb.o6w;
import tb.t2o;
import tb.tve;
import tb.uve;
import tb.ytb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PlayControlDwVideoView extends FrameLayout implements e9e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DwPlayControlVideoView";
    public static final String VIDEO_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String VIDEO_FEATURE_TYPE = "video";
    public static final String VIDEO_MAIN_BIZ = "Page_Home_VideoPlayer";
    private static final String VIDEO_PLAY_FROM = "recmd";
    private static final String VIDEO_SUFFIX = ".mp4";
    private JSONObject mCurrentData;
    private boolean mIsAttachedToWindow;
    private String mSectionBizCode;
    private gbw mStatusListener;
    private b18 mVideoUIController;
    private String mVideoUrl;
    private r mVideoView;
    private String videoPlayInfo = null;
    private String mVideoId = null;
    private boolean mOnFirstFrame = false;
    private boolean isNeedSetWidthAndHeight = false;
    private boolean mCanPlay = true;
    private final String mUttId = UTDevice.getUtdid(Globals.getApplication());
    private String mPlayId = "";
    private final String mUserId = Login.getOldUserId();
    private long mMediaStartTime = 0;
    private long mPlayStartTime = 0;
    private long mPlayerCreateTime = 0;
    private String mScm = "";
    private String mItemId = "";
    public boolean isPlayByVideoInfo = false;
    private volatile boolean needPauseWhenRealPlay = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class b implements ytb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782206);
            t2o.a(452985011);
        }

        public b() {
        }

        @Override // tb.ytb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                fve.e(PlayControlDwVideoView.TAG, "onVideoClose");
            }
        }

        @Override // tb.ytb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                PlayControlDwVideoView.this.pauseVideo();
            }
        }

        @Override // tb.ytb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            }
        }

        @Override // tb.ytb
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            }
        }

        @Override // tb.ytb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.ytb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else if (!PlayControlDwVideoView.access$000(PlayControlDwVideoView.this)) {
                fve.e(PlayControlDwVideoView.TAG, "video View mIsAttachedToWindow false");
                PlayControlDwVideoView.this.pauseVideo();
            } else if (PlayControlDwVideoView.access$100(PlayControlDwVideoView.this)) {
                fve.e(PlayControlDwVideoView.TAG, "executed pause");
                PlayControlDwVideoView.this.pauseVideo();
            } else {
                PlayControlDwVideoView.access$202(PlayControlDwVideoView.this, System.currentTimeMillis());
                PlayControlDwVideoView playControlDwVideoView = PlayControlDwVideoView.this;
                PlayControlDwVideoView.access$302(playControlDwVideoView, PlayControlDwVideoView.access$400(PlayControlDwVideoView.this) + PlayControlDwVideoView.access$200(PlayControlDwVideoView.this));
                uve.a("cnxh_special", 12002, PlayControlDwVideoView.access$500(PlayControlDwVideoView.this), null, null, PlayControlDwVideoView.access$600(PlayControlDwVideoView.this));
                HashMap hashMap = new HashMap();
                hashMap.put("player_type", "dwplayer");
                tve.c("video", "video_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            }
        }

        @Override // tb.ytb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            PlayControlDwVideoView.this.stopVideo();
            PlayControlDwVideoView.access$900(PlayControlDwVideoView.this, 1, "play_complete", "播放完毕, itemId : " + PlayControlDwVideoView.access$800(PlayControlDwVideoView.this) + ", VideoUrl : " + PlayControlDwVideoView.access$1300(PlayControlDwVideoView.this), true);
        }

        @Override // tb.ytb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlDwVideoView.access$700(PlayControlDwVideoView.this)));
            hashMap.put("player_type", "dwplayer");
            tve.c("video", "video_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }

        @Override // tb.ytb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            fve.e(PlayControlDwVideoView.TAG, "onVideoProgressChanged");
            if (i2 + 1 >= i3) {
                a18.e().g(PlayControlDwVideoView.this.getContext());
            } else {
                a18.e().c();
            }
        }

        @Override // tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            PlayControlDwVideoView.this.showCoverImageView();
            PlayControlDwVideoView.this.pauseVideo();
            PlayControlDwVideoView.access$900(PlayControlDwVideoView.this, 2, "player_play_error", "播放错误：, itemID:" + PlayControlDwVideoView.access$800(PlayControlDwVideoView.this) + ", what:" + i + ", extra:" + i2 + ", videoID:" + PlayControlDwVideoView.access$500(PlayControlDwVideoView.this), true);
        }

        @Override // tb.ytb
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else if (j == 3) {
                PlayControlDwVideoView.access$1002(PlayControlDwVideoView.this, true);
                PlayControlDwVideoView.this.hideCoverImageView();
                tve.c("video", "video_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", null);
                HashMap hashMap = new HashMap(2);
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlDwVideoView.access$1100(PlayControlDwVideoView.this)));
                hashMap.put("player_type", "dwplayer");
                PlayControlDwVideoView.access$1200(PlayControlDwVideoView.this, hashMap);
                tve.c("video", "video_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cost", String.valueOf(System.currentTimeMillis() - PlayControlDwVideoView.access$200(PlayControlDwVideoView.this)));
                hashMap2.put("player_type", "dwplayer");
                tve.c("video", "video_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
            }
        }
    }

    static {
        t2o.a(491782204);
        t2o.a(491782176);
    }

    public PlayControlDwVideoView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("890e5603", new Object[]{playControlDwVideoView})).booleanValue();
        }
        return playControlDwVideoView.mIsAttachedToWindow;
    }

    public static /* synthetic */ boolean access$100(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c876804", new Object[]{playControlDwVideoView})).booleanValue();
        }
        return playControlDwVideoView.needPauseWhenRealPlay;
    }

    public static /* synthetic */ boolean access$1002(PlayControlDwVideoView playControlDwVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e1b3e8", new Object[]{playControlDwVideoView, new Boolean(z)})).booleanValue();
        }
        playControlDwVideoView.mOnFirstFrame = z;
        return z;
    }

    public static /* synthetic */ long access$1100(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1c7263", new Object[]{playControlDwVideoView})).longValue();
        }
        return playControlDwVideoView.mPlayStartTime;
    }

    public static /* synthetic */ void access$1200(PlayControlDwVideoView playControlDwVideoView, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a254e915", new Object[]{playControlDwVideoView, map});
        } else {
            playControlDwVideoView.addVideoPlayStyleParams(map);
        }
    }

    public static /* synthetic */ String access$1300(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2ceee4f", new Object[]{playControlDwVideoView});
        }
        return playControlDwVideoView.mVideoUrl;
    }

    public static /* synthetic */ long access$200(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f00079f5", new Object[]{playControlDwVideoView})).longValue();
        }
        return playControlDwVideoView.mMediaStartTime;
    }

    public static /* synthetic */ long access$202(PlayControlDwVideoView playControlDwVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c279095", new Object[]{playControlDwVideoView, new Long(j)})).longValue();
        }
        playControlDwVideoView.mMediaStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$302(PlayControlDwVideoView playControlDwVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfc3a112", new Object[]{playControlDwVideoView, str});
        }
        playControlDwVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$400(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbccbcfd", new Object[]{playControlDwVideoView});
        }
        return playControlDwVideoView.mUttId;
    }

    public static /* synthetic */ String access$500(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5febcd1c", new Object[]{playControlDwVideoView});
        }
        return playControlDwVideoView.mVideoId;
    }

    public static /* synthetic */ String access$600(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f40add3b", new Object[]{playControlDwVideoView});
        }
        return playControlDwVideoView.getStartUtArgs();
    }

    public static /* synthetic */ long access$700(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("715dd3fa", new Object[]{playControlDwVideoView})).longValue();
        }
        return playControlDwVideoView.mPlayerCreateTime;
    }

    public static /* synthetic */ String access$800(PlayControlDwVideoView playControlDwVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c48fd79", new Object[]{playControlDwVideoView});
        }
        return playControlDwVideoView.getItemID();
    }

    public static /* synthetic */ void access$900(PlayControlDwVideoView playControlDwVideoView, int i, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f51525", new Object[]{playControlDwVideoView, new Integer(i), str, str2, new Boolean(z)});
        } else {
            playControlDwVideoView.callbackStatus(i, str, str2, z);
        }
    }

    private void addVideoPlayStyleParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fad2275", new Object[]{this, map});
        } else if (this.isPlayByVideoInfo) {
            map.put("player_data_style", "videoInfo");
        } else {
            map.put("player_data_style", "dwVideoUrl");
        }
    }

    private void callbackStatus(int i, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4660723b", new Object[]{this, new Integer(i), str, str2, new Boolean(z)});
            return;
        }
        gbw gbwVar = this.mStatusListener;
        if (gbwVar != null && z) {
            ((fra.a) gbwVar).a(i, str, str2);
        }
        fve.e(TAG, "callbackStatus", "status:" + i + " msg:" + str2);
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

    public static Activity getActivityFromContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        tve.c("video", "video_acInitError", "", "Page_Home_VideoPlayer_Count", "", null);
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        return null;
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

    public static /* synthetic */ Object ipc$super(PlayControlDwVideoView playControlDwVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/videoimpl/dwplayer/view/PlayControlDwVideoView");
        }
    }

    private void registerListeners(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60f8fc5", new Object[]{this, context});
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c18(context, this.mVideoView));
        r rVar = this.mVideoView;
        if (rVar != null) {
            rVar.H0(new b());
        }
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

    public String getVideoID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e096c59", new Object[]{this});
        }
        return this.mVideoId;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        return this.mVideoUrl;
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var == null) {
            fve.e(TAG, "UIControl为空: hideCoverImageView Failed");
            return;
        }
        b18Var.f();
        fve.e(TAG, "hide CoverImage:", this.mSectionBizCode);
    }

    public void init(Context context, boolean z, DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7471ca84", new Object[]{this, context, new Boolean(z), dWAspectRatio});
            return;
        }
        initView(context, dWAspectRatio);
        initVideoConfig(z);
        registerListeners(context);
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
        if (!(this.mVideoId == null || this.mVideoUrl == null)) {
            a18.e().f(getContext(), new o6w(this.mVideoUrl, this.mVideoId));
        }
        this.videoPlayInfo = null;
        this.mVideoId = null;
        callbackStatus(7, null, null, true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        r rVar = this.mVideoView;
        if (rVar != null && this.isNeedSetWidthAndHeight) {
            this.isNeedSetWidthAndHeight = false;
            rVar.m0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        this.needPauseWhenRealPlay = true;
        if (ncw.g(this.mVideoView)) {
            this.mVideoView.W();
        }
        showCoverImageView();
        callbackStatus(5, null, null, true);
        uve.a("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, this.mVideoId, null, null, getEndUtArgs());
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
        r rVar = this.mVideoView;
        if (rVar != null) {
            rVar.y();
        }
    }

    @Override // tb.e9e
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        r rVar = this.mVideoView;
        if (rVar != null) {
            rVar.d0(i);
        }
    }

    public void setCoverBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i)});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.i(i);
        }
    }

    @Override // tb.ybc
    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.j(str);
        }
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.k(drawable);
        }
    }

    @Override // tb.ybc
    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.l(scaleType);
        }
    }

    @Override // tb.ybc
    public void setDurationTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.m(str);
        }
    }

    @Override // tb.ybc
    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.n(str);
        }
    }

    @Override // tb.ybc
    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.o(str);
        }
    }

    public void setIvVideoVideoFakeBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i)});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.p(i);
        }
    }

    @Override // tb.ybc
    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.q(str);
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
    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.e9e
    public void setVideoID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
        } else if (str != null) {
            this.mVideoId = str;
        }
    }

    @Override // tb.e9e
    public void setVideoPlayInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f1ceac", new Object[]{this, str});
        } else if (str != null) {
            this.videoPlayInfo = str;
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
    }

    public void setVideoViewForeGroundBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i)});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.r(i);
        }
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        b18 b18Var = this.mVideoUIController;
        if (b18Var == null) {
            fve.e(TAG, "UIControl为空: showCoverImageView Failed");
            return;
        }
        b18Var.s();
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
        fve.e(TAG, "updateData. currentData = " + getCurrentData());
    }

    private void initVideoConfig(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f06e0", new Object[]{this, new Boolean(z)});
            return;
        }
        r rVar = this.mVideoView;
        if (rVar != null) {
            rVar.I0(z);
            if (mve.a("enableVideoScreenSleep", true)) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
                this.mVideoView.n(hashMap);
            }
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
        tve.c("video", "video_exposure", "", "Page_Home_VideoPlayer_Count", "", null);
    }

    @Override // tb.oib
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (this.mVideoView == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", "dwplayer");
            hashMap.put("msg", "videoView为空");
            tve.c("video", "video_buildError", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        } else if (!checkPlayEnable()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("player_type", "dwplayer");
            hashMap2.put("msg", "checkPlayEnable false");
            tve.c("video", "video_buildError", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
        } else if (!this.mIsAttachedToWindow) {
            callbackStatus(2, "view_not_attach_to_window", "播放失败， mIsAttachedToWindow:false, itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
        } else if (ncw.g(this.mVideoView)) {
            callbackStatus(2, "video_is_playing", "播放失败， mVideoView.isPlaying(), itemID:" + getItemID() + ",videoUrl:" + this.mVideoUrl, false);
        } else {
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " videoID:" + this.mVideoId);
            this.needPauseWhenRealPlay = false;
            innerPlayVideo();
        }
    }

    private boolean checkPlayEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67e06a0a", new Object[]{this})).booleanValue();
        }
        boolean e = ncw.e(getContext());
        if (this.mCanPlay && ((!TextUtils.isEmpty(this.mVideoUrl) || !TextUtils.isEmpty(this.videoPlayInfo)) && e)) {
            return true;
        }
        showCoverImageView();
        this.mVideoView.u();
        callbackStatus(2, "business_logic_validation_failed", "mCanPlay：" + this.mCanPlay + ",playEnable: " + e + ",mVideoUrl: " + this.mVideoUrl, true);
        return false;
    }

    private void initView(Context context, DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf89db5b", new Object[]{this, context, dWAspectRatio});
            return;
        }
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            tve.c("video", "video_acInitError", "", "Page_Home_VideoPlayer_Count", "", null);
            return;
        }
        r.a aVar = new r.a(activityFromContext);
        if (TextUtils.isEmpty(this.videoPlayInfo)) {
            aVar.d0(hnn.VALUE_TB_VIDEO_URL);
            aVar.f0(this.mVideoUrl);
            aVar.b0(null);
            aVar.y(null);
            this.isPlayByVideoInfo = false;
        } else {
            aVar.d0("TBVideo");
            aVar.b0(this.mVideoId);
            try {
                aVar.y(new org.json.JSONObject(this.videoPlayInfo));
            } catch (JSONException e) {
                fve.e(TAG, "播控信息流设置异常");
                e.printStackTrace();
            }
            this.isPlayByVideoInfo = true;
        }
        aVar.f(true);
        aVar.G(true);
        aVar.B(false);
        aVar.A(true);
        aVar.g("recmd");
        aVar.L("cnxh");
        aVar.Z(dWAspectRatio);
        this.mVideoView = aVar.a();
        this.mPlayerCreateTime = System.currentTimeMillis();
        b18 b18Var = this.mVideoUIController;
        if (b18Var != null) {
            b18Var.h();
        }
        this.mVideoUIController = new b18(context, this, this.mVideoView, this.isPlayByVideoInfo);
        this.isNeedSetWidthAndHeight = true;
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
            return;
        }
        r rVar = this.mVideoView;
        if (rVar != null) {
            if (rVar.H() < 0) {
                UmbrellaTracker.commitFailureStability(fdv.F_DATA_PROCESS, TAG, "1.0", "Page_Home_VideoPlayer", TAG, null, "url not correct", "");
                uve.a("Page_Home", 19999, "HVideoView url error", "", "", "");
                fve.e(TAG, "url not correct: cur url：, target url:" + this.mVideoUrl + ", cur play state:" + this.mVideoView.H() + " selfId:" + hashCode());
                return;
            }
            this.mPlayStartTime = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", "dwplayer");
            addVideoPlayStyleParams(hashMap);
            tve.c("video", "video_startPlay", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            if (ncw.f(this.mVideoView)) {
                this.mVideoView.Y();
            } else {
                this.mVideoView.O0();
            }
            callbackStatus(6, null, null, true);
            if (this.mOnFirstFrame) {
                hideCoverImageView();
            }
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.mVideoUrl + "video isPlaying:" + ncw.g(this.mVideoView) + "sectionBizCode:" + this.mSectionBizCode);
        }
    }
}
