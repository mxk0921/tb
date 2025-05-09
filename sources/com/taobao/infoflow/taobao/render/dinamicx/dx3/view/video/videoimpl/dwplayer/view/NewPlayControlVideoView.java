package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.a18;
import tb.asc;
import tb.e9e;
import tb.fdv;
import tb.fra;
import tb.fve;
import tb.g1k;
import tb.gbw;
import tb.kr8;
import tb.mve;
import tb.ncw;
import tb.o6w;
import tb.t2o;
import tb.tve;
import tb.uve;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewPlayControlVideoView extends FrameLayout implements e9e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NewPlayControlVideoView";
    public static final String VIDEO_COUNT_MAIN_BIZ = "Page_Home_VideoPlayer_Count";
    public static final String VIDEO_FEATURE_TYPE = "video";
    public static final String VIDEO_MAIN_BIZ = "Page_Home_VideoPlayer";
    private static final String VIDEO_PLAY_FROM = "recmd";
    private static final String VIDEO_SUFFIX = ".mp4";
    public static final String VIDEO_TYPE_PLAY_INFO = "videoPlayInfo";
    public static final String VIDEO_TYPE_VIDEO_ID = "videoId";
    public static final String VIDEO_TYPE_VIDEO_URL = "videoUrl";
    private JSONObject mCurrentData;
    private boolean mIsAttachedToWindow;
    private String mSectionBizCode;
    private gbw mStatusListener;
    private s mTBPlayerInstance;
    private g1k mVideoUIController;
    private String mVideoUrl;
    private String mVideoPlayInfo = null;
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
    public String videoPlayType = "videoUrl";
    private volatile boolean needPauseWhenRealPlay = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            } else {
                fve.e(NewPlayControlVideoView.TAG, "onVideoClose");
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            } else {
                NewPlayControlVideoView.this.pauseVideo();
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
            } else if (!NewPlayControlVideoView.access$000(NewPlayControlVideoView.this)) {
                fve.e(NewPlayControlVideoView.TAG, "video View mIsAttachedToWindow false");
                NewPlayControlVideoView.this.pauseVideo();
            } else if (NewPlayControlVideoView.access$100(NewPlayControlVideoView.this)) {
                fve.e(NewPlayControlVideoView.TAG, "executed pause");
                NewPlayControlVideoView.this.pauseVideo();
            } else {
                NewPlayControlVideoView.access$202(NewPlayControlVideoView.this, System.currentTimeMillis());
                NewPlayControlVideoView newPlayControlVideoView = NewPlayControlVideoView.this;
                NewPlayControlVideoView.access$302(newPlayControlVideoView, NewPlayControlVideoView.access$400(NewPlayControlVideoView.this) + NewPlayControlVideoView.access$200(NewPlayControlVideoView.this));
                uve.a("cnxh_special", 12002, NewPlayControlVideoView.access$500(NewPlayControlVideoView.this), null, null, NewPlayControlVideoView.access$600(NewPlayControlVideoView.this));
                HashMap hashMap = new HashMap();
                hashMap.put("player_type", "dwplayer");
                tve.c("video", "video_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            NewPlayControlVideoView.this.stopVideo();
            NewPlayControlVideoView.access$900(NewPlayControlVideoView.this, 1, "play_complete", "播放完毕, itemId : " + NewPlayControlVideoView.access$800(NewPlayControlVideoView.this) + ", VideoUrl : " + NewPlayControlVideoView.access$1300(NewPlayControlVideoView.this), true);
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - NewPlayControlVideoView.access$700(NewPlayControlVideoView.this)));
            hashMap.put("player_type", "dwplayer");
            tve.c("video", "video_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            fve.e(NewPlayControlVideoView.TAG, "onVideoProgressChanged");
            if (i2 + 1 >= i3) {
                a18.e().g(NewPlayControlVideoView.this.getContext());
            } else {
                a18.e().c();
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            NewPlayControlVideoView.this.showCoverImageView();
            NewPlayControlVideoView.this.pauseVideo();
            NewPlayControlVideoView.access$900(NewPlayControlVideoView.this, 2, "player_play_error", "播放错误：, itemID:" + NewPlayControlVideoView.access$800(NewPlayControlVideoView.this) + ", what:" + i + ", extra:" + i2 + ", videoID:" + NewPlayControlVideoView.access$500(NewPlayControlVideoView.this), true);
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            } else if (j == 3) {
                NewPlayControlVideoView.access$1002(NewPlayControlVideoView.this, true);
                NewPlayControlVideoView.this.hideCoverImageView();
                tve.c("video", "video_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", null);
                HashMap hashMap = new HashMap(2);
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - NewPlayControlVideoView.access$1100(NewPlayControlVideoView.this)));
                hashMap.put("player_type", "dwplayer");
                NewPlayControlVideoView.access$1200(NewPlayControlVideoView.this, hashMap);
                tve.c("video", "video_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("cost", String.valueOf(System.currentTimeMillis() - NewPlayControlVideoView.access$200(NewPlayControlVideoView.this)));
                hashMap2.put("player_type", "dwplayer");
                tve.c("video", "video_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", hashMap2);
            }
        }
    }

    static {
        t2o.a(491782202);
        t2o.a(491782176);
    }

    public NewPlayControlVideoView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("868cbfa", new Object[]{newPlayControlVideoView})).booleanValue();
        }
        return newPlayControlVideoView.mIsAttachedToWindow;
    }

    public static /* synthetic */ boolean access$100(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c411fa19", new Object[]{newPlayControlVideoView})).booleanValue();
        }
        return newPlayControlVideoView.needPauseWhenRealPlay;
    }

    public static /* synthetic */ boolean access$1002(NewPlayControlVideoView newPlayControlVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1fb453", new Object[]{newPlayControlVideoView, new Boolean(z)})).booleanValue();
        }
        newPlayControlVideoView.mOnFirstFrame = z;
        return z;
    }

    public static /* synthetic */ long access$1100(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e71e3d7a", new Object[]{newPlayControlVideoView})).longValue();
        }
        return newPlayControlVideoView.mPlayStartTime;
    }

    public static /* synthetic */ void access$1200(NewPlayControlVideoView newPlayControlVideoView, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296b1140", new Object[]{newPlayControlVideoView, map});
        } else {
            newPlayControlVideoView.addVideoPlayStyleParams(map);
        }
    }

    public static /* synthetic */ String access$1300(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("489f9b5c", new Object[]{newPlayControlVideoView});
        }
        return newPlayControlVideoView.mVideoUrl;
    }

    public static /* synthetic */ long access$200(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fbb2828", new Object[]{newPlayControlVideoView})).longValue();
        }
        return newPlayControlVideoView.mMediaStartTime;
    }

    public static /* synthetic */ long access$202(NewPlayControlVideoView newPlayControlVideoView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de9c7906", new Object[]{newPlayControlVideoView, new Long(j)})).longValue();
        }
        newPlayControlVideoView.mMediaStartTime = j;
        return j;
    }

    public static /* synthetic */ String access$302(NewPlayControlVideoView newPlayControlVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc0e2c65", new Object[]{newPlayControlVideoView, str});
        }
        newPlayControlVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$400(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f5ba26e", new Object[]{newPlayControlVideoView});
        }
        return newPlayControlVideoView.mUttId;
    }

    public static /* synthetic */ String access$500(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f1e962f", new Object[]{newPlayControlVideoView});
        }
        return newPlayControlVideoView.mVideoId;
    }

    public static /* synthetic */ String access$600(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ee189f0", new Object[]{newPlayControlVideoView});
        }
        return newPlayControlVideoView.getStartUtArgs();
    }

    public static /* synthetic */ long access$700(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a090ec3", new Object[]{newPlayControlVideoView})).longValue();
        }
        return newPlayControlVideoView.mPlayerCreateTime;
    }

    public static /* synthetic */ String access$800(NewPlayControlVideoView newPlayControlVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e677172", new Object[]{newPlayControlVideoView});
        }
        return newPlayControlVideoView.getItemID();
    }

    public static /* synthetic */ void access$900(NewPlayControlVideoView newPlayControlVideoView, int i, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd71c6a", new Object[]{newPlayControlVideoView, new Integer(i), str, str2, new Boolean(z)});
        } else {
            newPlayControlVideoView.callbackStatus(i, str, str2, z);
        }
    }

    private void addVideoPlayStyleParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fad2275", new Object[]{this, map});
            return;
        }
        String str = this.videoPlayType;
        if (str != null) {
            map.put("player_data_style", str);
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

    private asc createMediaPlayLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asc) ipChange.ipc$dispatch("6c732f0f", new Object[]{this});
        }
        return new a();
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
            Object b = kr8.b("item.0.clickParam.itemId", jSONObject);
            if (b instanceof String) {
                this.mItemId = (String) b;
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

    private void initView(Context context, DWAspectRatio dWAspectRatio, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b242d9", new Object[]{this, context, dWAspectRatio, new Boolean(z)});
            return;
        }
        s.d createPlayInfo = createPlayInfo(context, dWAspectRatio, z);
        if (createPlayInfo != null) {
            this.mTBPlayerInstance = s.c.c("", createPlayInfo);
            this.mPlayerCreateTime = System.currentTimeMillis();
            g1k g1kVar = this.mVideoUIController;
            if (g1kVar != null) {
                g1kVar.h();
            }
            this.mVideoUIController = new g1k(context, this, (ViewGroup) this.mTBPlayerInstance.o(), this.videoPlayType);
            this.isNeedSetWidthAndHeight = true;
        }
    }

    public static /* synthetic */ Object ipc$super(NewPlayControlVideoView newPlayControlVideoView, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/render/dinamicx/dx3/view/video/videoimpl/dwplayer/view/NewPlayControlVideoView");
        }
    }

    private void registerListeners(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60f8fc5", new Object[]{this, context});
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
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar == null) {
            fve.e(TAG, "UIControl为空: hideCoverImageView Failed");
            return;
        }
        g1kVar.f();
        fve.e(TAG, "hide CoverImage:", this.mSectionBizCode);
    }

    public void init(Context context, boolean z, DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7471ca84", new Object[]{this, context, new Boolean(z), dWAspectRatio});
            return;
        }
        initView(context, dWAspectRatio, z);
        initVideoConfig();
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
        this.mVideoPlayInfo = null;
        this.mVideoId = null;
        callbackStatus(7, null, null, true);
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        this.needPauseWhenRealPlay = true;
        if (ncw.h(this.mTBPlayerInstance)) {
            this.mTBPlayerInstance.u();
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
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.h();
        }
    }

    @Override // tb.e9e
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    public void setCoverBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i)});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.i(i);
        }
    }

    @Override // tb.ybc
    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.j(str);
        }
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.k(drawable);
        }
    }

    @Override // tb.ybc
    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.l(scaleType);
        }
    }

    @Override // tb.ybc
    public void setDurationTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.m(str);
        }
    }

    @Override // tb.ybc
    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.n(str);
        }
    }

    @Override // tb.ybc
    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.o(str);
        }
    }

    public void setIvVideoVideoFakeBGColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i)});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.p(i);
        }
    }

    @Override // tb.ybc
    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.q(str);
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
            this.mVideoPlayInfo = str;
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
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar != null) {
            g1kVar.r(i);
        }
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        g1k g1kVar = this.mVideoUIController;
        if (g1kVar == null) {
            fve.e(TAG, "UIControl为空: showCoverImageView Failed");
            return;
        }
        g1kVar.s();
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

    private void initVideoConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc0fa74", new Object[]{this});
        } else if (this.mTBPlayerInstance != null && mve.a("enableVideoScreenSleep", true)) {
            HashMap hashMap = new HashMap();
            hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
            this.mTBPlayerInstance.D(4003, hashMap);
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mTBPlayerInstance != null && this.isNeedSetWidthAndHeight) {
            this.isNeedSetWidthAndHeight = false;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("width", Integer.valueOf(getMeasuredWidth()));
            hashMap.put("height", Integer.valueOf(getMeasuredHeight()));
            this.mTBPlayerInstance.c("setFrame", hashMap);
        }
    }

    @Override // tb.oib
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else if (this.mTBPlayerInstance == null) {
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
        } else if (ncw.h(this.mTBPlayerInstance)) {
            hideCoverImageView();
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
        if (this.mCanPlay && ((!TextUtils.isEmpty(this.mVideoUrl) || !TextUtils.isEmpty(this.mVideoPlayInfo)) && e)) {
            return true;
        }
        showCoverImageView();
        this.mTBPlayerInstance.u();
        callbackStatus(2, "business_logic_validation_failed", "mCanPlay：" + this.mCanPlay + ",playEnable: " + e + ",mVideoUrl: " + this.mVideoUrl, true);
        return false;
    }

    private s.d createPlayInfo(Context context, DWAspectRatio dWAspectRatio, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s.d) ipChange.ipc$dispatch("ee72730a", new Object[]{this, context, dWAspectRatio, new Boolean(z)});
        }
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            tve.c("video", "video_acInitError", "", "Page_Home_VideoPlayer_Count", "", null);
            return null;
        }
        s.d dVar = new s.d();
        dVar.g = activityFromContext;
        dVar.o = "recmd";
        dVar.i = true;
        dVar.m = this.mVideoId;
        try {
            String str = this.mVideoPlayInfo;
            if (str != null && !str.isEmpty()) {
                dVar.V = new org.json.JSONObject(this.mVideoPlayInfo);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.mVideoPlayInfo)) {
            dVar.k = 0;
            this.videoPlayType = VIDEO_TYPE_PLAY_INFO;
        } else if (!TextUtils.isEmpty(this.mVideoId)) {
            dVar.k = 1;
            this.videoPlayType = "videoId";
        } else {
            dVar.l = this.mVideoUrl;
            dVar.k = 2;
            this.videoPlayType = "videoUrl";
        }
        dVar.A = z;
        if (dWAspectRatio != null) {
            dVar.q = dWAspectRatio;
        }
        dVar.r = 2;
        dVar.n = "recom";
        dVar.t = createMediaPlayLifeCycleListener();
        return dVar;
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
            return;
        }
        s sVar = this.mTBPlayerInstance;
        if (sVar != null) {
            int i = sVar.e.f;
            if (i < 0) {
                UmbrellaTracker.commitFailureStability(fdv.F_DATA_PROCESS, TAG, "1.0", "Page_Home_VideoPlayer", TAG, null, "url not correct", "");
                uve.a("Page_Home", 19999, "HVideoView url error", "", "", "");
                fve.e(TAG, "url not correct: cur url：, target url:" + this.mVideoUrl + ", cur play state:" + i + " selfId:" + hashCode());
                return;
            }
            this.mPlayStartTime = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", "newdwplayer");
            addVideoPlayStyleParams(hashMap);
            tve.c("video", "video_startPlay", "", "Page_Home_VideoPlayer_Count", "", hashMap);
            this.mTBPlayerInstance.F();
            callbackStatus(6, null, null, true);
            if (this.mOnFirstFrame) {
                hideCoverImageView();
            }
            fve.e(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.mVideoUrl + "video isPlaying:" + ncw.h(this.mTBPlayerInstance) + "sectionBizCode:" + this.mSectionBizCode);
        }
    }
}
