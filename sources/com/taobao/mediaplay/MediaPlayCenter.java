package com.taobao.mediaplay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.InputDeviceCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.model.MediaConfig;
import com.taobao.mediaplay.model.MediaConfigInfo;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.asc;
import tb.ew0;
import tb.feh;
import tb.fsc;
import tb.gf4;
import tb.hfi;
import tb.isc;
import tb.izq;
import tb.ja1;
import tb.jsc;
import tb.jsr;
import tb.nfi;
import tb.nj9;
import tb.qvd;
import tb.rb;
import tb.sdi;
import tb.t2o;
import tb.tbn;
import tb.urc;
import tb.vrc;
import tb.wdh;
import tb.ykd;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.InnerStartFuncListenerImpl;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaPlayCenter implements Serializable, urc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COMPONENT_NAME = "avcenter";
    private Drawable backGroundSetByClient;
    private Drawable coverSetByClient;
    public AlphaAnimation mAlphaAnimation;
    private long mBeginTime;
    public ImageView mCoverImgView;
    private boolean mDestroy;
    private long mDurationTime;
    private nj9 mExternFirstRenderAdapter;
    private InnerStartFuncListener mExternInnerStartFuncListener;
    private InnerStartFuncListener mInnerStartListener;
    private wdh mLogAdapter;
    private feh mLogContext;
    private IMediaPlayer.OnVideoClickListener mMediaClickListener;
    private MediaContext mMediaContext;
    private sdi mMediaController;
    private vrc mMediaLoopCompleteListener;
    private asc mMediaPlayLifecycleListener;
    private fsc mMediaRecycleListener;
    private isc mMediaSwitchListener;
    private hfi mPicController;
    private FrameLayout mRootView;
    private ykd mRootViewClickListener;
    private boolean mSetup;
    public TaoLiveVideoView.p mSurfaceListener;
    private float mTranslationX;
    private float mTranslationY;
    private String mUsingInterface;
    private boolean mEnableSwitch = true;
    private boolean mEnableSwitchAB = true;
    private boolean mEnableSwitchABEnable = false;
    private boolean mEnableSwitchWithoutAB = false;
    private boolean mNeedInitSwitchControlParam = true;
    private boolean mEnableSwitchToNewDefinition = true;
    private boolean mDisSetRecycleListenerAtOldPath = true;
    private long mAnimationTime = 200;
    private String mSubBusinessType = "";
    private boolean mLiveRoomInitWithPreloadVideoData = true;
    private boolean mFirstFrameUpdated = false;
    private MediaLifecycleType mCurrentLifecycleType = MediaLifecycleType.DEFAULT;
    private boolean mHasWarmuped = false;
    private boolean mHasSOW = false;
    private boolean mSOWFinished = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum UpdataUrlListMode {
        INIT(0),
        REPLACE_BY_URL_ID_OF_NEW_DEFINITION(1),
        REPLACE_FORCE_OF_NEW_DEFINITION(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        UpdataUrlListMode(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(UpdataUrlListMode updataUrlListMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaPlayCenter$UpdataUrlListMode");
        }

        public static UpdataUrlListMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UpdataUrlListMode) ipChange.ipc$dispatch("1438a9c2", new Object[]{str});
            }
            return (UpdataUrlListMode) Enum.valueOf(UpdataUrlListMode.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

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
                AVSDKLog.e(MediaPlayCenter.access$100(MediaPlayCenter.this), "onMediaClose");
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            } else {
                AVSDKLog.e(MediaPlayCenter.access$100(MediaPlayCenter.this), "onMediaComplete");
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
            AVSDKLog.e(access$100, "onMediaError " + iMediaPlayer + "what: " + i + ", extra: " + i2);
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                return;
            }
            feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
            AVSDKLog.e(access$100, "onMediaPause " + z);
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            } else {
                AVSDKLog.e(MediaPlayCenter.access$100(MediaPlayCenter.this), "onMediaPlay");
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                return;
            }
            feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
            AVSDKLog.e(access$100, "onMediaPrepared " + iMediaPlayer);
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
                return;
            }
            feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
            AVSDKLog.e(access$100, "onMediaScreenChanged " + mediaPlayScreenType);
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
                return;
            }
            feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
            AVSDKLog.e(access$100, "onMediaSeekTo " + i);
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
                return;
            }
            MediaPlayCenter.access$002(MediaPlayCenter.this, System.currentTimeMillis());
            AVSDKLog.e(MediaPlayCenter.access$100(MediaPlayCenter.this), "onMediaStart");
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            if (j == 12101) {
                MediaPlayCenter.access$202(MediaPlayCenter.this, true);
                MediaPlayCenter.this.setMediaLifecycleType(MediaLifecycleType.PLAY);
            }
            if (j != 715) {
                feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
                AVSDKLog.e(access$100, "onMediaInfo " + iMediaPlayer + "what: " + j + ", extra: " + j2 + ", ext: " + j3 + ", obj: " + obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f11017a;

        public b(Bitmap bitmap) {
            this.f11017a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ImageView imageView = MediaPlayCenter.this.mCoverImgView;
            if (imageView != null) {
                imageView.setImageBitmap(this.f11017a);
            }
            if (MediaPlayCenter.access$300(MediaPlayCenter.this)) {
                MediaPlayCenter.this.mCoverImgView = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements isc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.isc
        public void A(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eed540ac", new Object[]{this, hashMap});
                return;
            }
            feh access$100 = MediaPlayCenter.access$100(MediaPlayCenter.this);
            AVSDKLog.e(access$100, this + " onSwitchedToDefinition, result: " + hashMap);
            MediaPlayCenter.access$402(MediaPlayCenter.this, true);
            if (hashMap.containsKey(rb.RESULT_KEY) && "0".equals(hashMap.get(rb.RESULT_KEY))) {
                MediaPlayCenter.this.setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_HAS_SWITCH_RTC_BEFORE_START, 1L);
                MediaPlayCenter.access$500(MediaPlayCenter.this).C0();
            } else if (hashMap.containsKey(rb.RESULT_KEY) && !"-4".equals(hashMap.get(rb.RESULT_KEY))) {
                MediaPlayCenter.access$500(MediaPlayCenter.this).C0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements jsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(MediaPlayCenter mediaPlayCenter) {
        }

        @Override // tb.jsc
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            }
        }
    }

    static {
        t2o.a(774897717);
        t2o.a(774897700);
    }

    public MediaPlayCenter(Context context) {
        MediaContext mediaContext = new MediaContext(context);
        this.mMediaContext = mediaContext;
        mediaContext.genPlayToken(false);
        feh fehVar = new feh(toString(), this.mMediaContext.mPlayToken);
        this.mLogContext = fehVar;
        AVSDKLog.e(fehVar, "new MediaPlayCenter, mMediaContext=" + this.mMediaContext);
        this.mMediaContext.mMediaPlayContext = new MediaPlayControlContext(context, this.mMediaContext.mPlayToken);
        this.mRootView = new FrameLayout(context);
        if (ja1.y() >= 0) {
            this.mRootView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        } else {
            this.mRootView.setBackgroundColor(-16777216);
        }
    }

    public static /* synthetic */ long access$002(MediaPlayCenter mediaPlayCenter, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aa9a2d3", new Object[]{mediaPlayCenter, new Long(j)})).longValue();
        }
        mediaPlayCenter.mBeginTime = j;
        return j;
    }

    public static /* synthetic */ feh access$100(MediaPlayCenter mediaPlayCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("9030307f", new Object[]{mediaPlayCenter});
        }
        return mediaPlayCenter.mLogContext;
    }

    public static /* synthetic */ boolean access$202(MediaPlayCenter mediaPlayCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed98fa31", new Object[]{mediaPlayCenter, new Boolean(z)})).booleanValue();
        }
        mediaPlayCenter.mFirstFrameUpdated = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(MediaPlayCenter mediaPlayCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4322ce8a", new Object[]{mediaPlayCenter})).booleanValue();
        }
        return mediaPlayCenter.mDestroy;
    }

    public static /* synthetic */ boolean access$402(MediaPlayCenter mediaPlayCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6088156f", new Object[]{mediaPlayCenter, new Boolean(z)})).booleanValue();
        }
        mediaPlayCenter.mSOWFinished = z;
        return z;
    }

    public static /* synthetic */ sdi access$500(MediaPlayCenter mediaPlayCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdi) ipChange.ipc$dispatch("e04a6d87", new Object[]{mediaPlayCenter});
        }
        return mediaPlayCenter.mMediaController;
    }

    private HashMap<String, String> callWithMsgAndResultInner(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("168bf182", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "CallWithMsgAndResultInner " + map);
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            str = "1";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (MediaConstant.CMD_LIVE_PUSH_CONTROL_INFO.equals(key) && !TextUtils.isEmpty(value)) {
                this.mMediaContext.mLivePushControlInfo = value;
            } else if (MediaConstant.CMD_LIVE_REMOVE_CONTROL_INFO.equals(key)) {
                this.mMediaContext.mLivePushControlInfo = null;
            } else if (MediaConstant.CMD_UPDATE_PLAY_EX.equals(key) && !TextUtils.isEmpty(value)) {
                this.mMediaContext.mDynamicPlayEx = value;
            } else if (MediaConstant.CMD_SWITCH_SCENE.equals(key)) {
                MediaContext mediaContext = this.mMediaContext;
                mediaContext.mSwitchScene = value;
                mediaContext.mSwitchSceneTime = System.currentTimeMillis();
            } else if (MediaConstant.CMD_ENTER_FLOATING.equals(key)) {
                this.mMediaContext.mIsFloat = str.equals(value);
            } else if (MediaConstant.CMD_SET_INIT_DEFINITION.equals(key)) {
                this.mMediaContext.mMediaPlayContext.mInitDefinition = value;
            } else if (MediaConstant.CMD_SET_ENABLE_ADAPTIVE_LIVE_SWITCH.equals(key)) {
                this.mMediaContext.mMediaPlayContext.mEnableAdaptiveLiveSwitch = str.equals(value);
            } else if (MediaConstant.CMD_SET_ENTER_VOICE_ROOM.equals(key)) {
                this.mMediaContext.mEnterVoiceRoom = ew0.u(value);
            } else if (MediaConstant.CMD_DISABLE_SURFACE_VIEW.equals(key)) {
                this.mMediaContext.mDisableSurfaceView = str.equals(value);
            } else if (MediaConstant.CMD_IS_PLAY_BACK_SCENARIO.equals(key)) {
                this.mMediaContext.mIsPlayBackScenario = str.equals(value);
            }
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.w(map);
        } else {
            String str2 = map.get(MediaConstant.CMD_ENABLE_AUTO_PAUSE_IN_BACKGROUND);
            if (str.equals(str2)) {
                this.mMediaContext.mEnablePlayInBackground = 1;
            } else if ("0".equals(str2)) {
                this.mMediaContext.mEnablePlayInBackground = 0;
            } else {
                this.mMediaContext.mEnablePlayInBackground = -1;
            }
        }
        if (map.containsKey(TaobaoMediaPlayer.AUDIO_OFF_KEY)) {
            this.mMediaContext.mMediaPlayContext.setAudioOffFlag(true);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (map.containsKey(MediaConstant.CMD_GET_LOW_SPEED_POLICY)) {
            boolean isLowNetSpeedByVpm = this.mMediaContext.mMediaPlayContext.isLowNetSpeedByVpm();
            String str3 = MediaConstant.CMD_GET_LOW_SPEED_POLICY;
            if (!isLowNetSpeedByVpm) {
                str = "0";
            }
            hashMap.put(str3, str);
        }
        return hashMap;
    }

    private boolean canSwitchStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ec5a4f", new Object[]{this})).booleanValue();
        }
        if (!this.mEnableSwitch) {
            return false;
        }
        if (this.mEnableSwitchAB) {
            return this.mEnableSwitchABEnable;
        }
        return this.mEnableSwitchWithoutAB;
    }

    private void initMediaMode(MediaType mediaType) {
        fsc fscVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155fa7d9", new Object[]{this, mediaType});
            return;
        }
        this.mMediaContext.mMediaType = mediaType;
        if (this.mMediaController == null) {
            sdi sdiVar = new sdi(this.mMediaContext);
            this.mMediaController = sdiVar;
            sdiVar.t0(null);
            this.mRootView.addView(this.mMediaController.I(), new FrameLayout.LayoutParams(-1, -1, 17));
            this.mMediaContext.getVideo().k(this.mMediaLoopCompleteListener);
            this.mMediaContext.getVideo().h(this.mMediaPlayLifecycleListener);
            this.mMediaContext.getVideo().a(this.mMediaClickListener);
            if (!this.mDisSetRecycleListenerAtOldPath || (fscVar = this.mMediaRecycleListener) == null) {
                this.mMediaContext.getVideo().g(this.mMediaRecycleListener);
                return;
            }
            this.mMediaController.b0(fscVar);
            this.mMediaRecycleListener = null;
        }
    }

    private void initPicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9924", new Object[]{this});
            return;
        }
        this.mMediaContext.setMediaType(MediaType.PIC);
        hfi hfiVar = new hfi(this.mMediaContext);
        this.mPicController = hfiVar;
        this.mRootView.addView(hfiVar.a(), new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private void pareseMediaConfigData(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26be7002", new Object[]{this, mediaLiveInfo});
            return;
        }
        AVSDKLog.e(this.mLogContext, "pareseMediaConfigData");
        if (mediaLiveInfo != null) {
            try {
                if (!TextUtils.isEmpty(mediaLiveInfo.mediaConfig)) {
                    MediaConfig mediaConfig = new MediaConfig();
                    mediaLiveInfo.mMediaConfigData = mediaConfig;
                    mediaConfig.mediaConfigInfoList = (ArrayList) JSON.parseArray(mediaLiveInfo.mediaConfig, MediaConfigInfo.class);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void setInnerStartFuncListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2c79ed", new Object[]{this});
            return;
        }
        if (this.mInnerStartListener == null) {
            this.mInnerStartListener = new InnerStartFuncListenerImpl();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.m0(this.mInnerStartListener);
        } else {
            this.mExternInnerStartFuncListener = this.mInnerStartListener;
        }
    }

    public void addControlParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0193d6a", new Object[]{this, hashMap});
            return;
        }
        this.mMediaContext.addControlParams(hashMap);
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("hasPreloadVideoData"))) {
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("fromRecmd", "1");
            addPlayExpUtParams(hashMap2);
            this.mLiveRoomInitWithPreloadVideoData = ew0.s(hashMap.get("hasPreloadVideoData"));
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "MediaPlayCenter: get mLiveRoomInitWithPreloadVideoData=" + this.mLiveRoomInitWithPreloadVideoData + " from addControlParams");
            if (!this.mLiveRoomInitWithPreloadVideoData && izq.m) {
                setForceUseSurfaceView(true);
            }
        }
    }

    public void addCustomParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
        } else {
            this.mMediaContext.addCustomParam(hashMap);
        }
    }

    public void addFullScreenCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.s(view);
        }
    }

    public void addPlayExpUtParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
        } else {
            this.mMediaContext.addPlayExpUtParams(hashMap);
        }
    }

    public void audioOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450701c0", new Object[]{this});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.u();
        }
        MediaPlayControlContext mediaPlayControlContext = this.mMediaContext.mMediaPlayContext;
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.setAudioOffFlag(true);
        }
    }

    public void audioOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13155a5c", new Object[]{this});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.v();
        }
        MediaPlayControlContext mediaPlayControlContext = this.mMediaContext.mMediaPlayContext;
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.setAudioOffFlag(false);
        }
    }

    public void blockTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e7d25", new Object[]{this, new Boolean(z)});
        } else if (this.mMediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().l(z);
        }
    }

    public void callWithMsg(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
        } else {
            callWithMsgAndResultInner(map);
        }
    }

    public HashMap<String, String> callWithMsgAndResult(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c7b19faa", new Object[]{this, map});
        }
        return callWithMsgAndResultInner(map);
    }

    public boolean canSwitchHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f3551e", new Object[]{this})).booleanValue();
        }
        if (!canSwitchStream() || this.mMediaController == null) {
            return false;
        }
        AVSDKLog.e(this.mLogContext, "SeamlessSwitch mediaplay center canSwitchHigher");
        return this.mMediaController.y(false);
    }

    public boolean canSwitchLower() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ce32848", new Object[]{this})).booleanValue();
        }
        if (!canSwitchStream() || this.mMediaController == null) {
            return false;
        }
        AVSDKLog.e(this.mLogContext, "SeamlessSwitch mediaplay center canSwitchLower");
        return this.mMediaController.y(true);
    }

    public void changeQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d518e58d", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "pareseMediaConfigData index: " + i);
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.z(i);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.mLogContext, "destroy");
        this.mDestroy = true;
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.A();
        }
        AlphaAnimation alphaAnimation = this.mAlphaAnimation;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
    }

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        }
    }

    public void enableVideoClickDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d143b09a", new Object[]{this, new Boolean(z)});
        } else if (this.mMediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().b(z);
        }
    }

    public int getBufferPercentage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4a46ea", new Object[]{this})).intValue();
        }
        if (this.mMediaContext.getVideo() != null) {
            return this.mMediaContext.getVideo().getBufferPercentage();
        }
        return 0;
    }

    public PlayerQualityItem getCurrentDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerQualityItem) ipChange.ipc$dispatch("14736907", new Object[]{this});
        }
        MediaPlayControlContext mediaPlayControlContext = this.mMediaContext.mMediaPlayContext;
        if (mediaPlayControlContext.isRtcVVC) {
            return null;
        }
        if (!MediaConstant.RTCLIVE_URL_NAME.equals(mediaPlayControlContext.mSelectedUrlName) && !MediaConstant.BFRTC_URL_NAME.equals(this.mMediaContext.mMediaPlayContext.mSelectedUrlName)) {
            return null;
        }
        MediaPlayControlContext mediaPlayControlContext2 = this.mMediaContext.mMediaPlayContext;
        if (mediaPlayControlContext2.mMediaLiveInfo == null) {
            return null;
        }
        PlayerQualityItem playerQualityItem = mediaPlayControlContext2.mPlayerQualityItem;
        if (playerQualityItem != null) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "getCurrentDefinition name=" + playerQualityItem.name + ",  newName=" + playerQualityItem.newName + " ,current=" + playerQualityItem.current + " ,definition=" + playerQualityItem.definition + " ,newDefinition=" + playerQualityItem.newDefinition);
        }
        return playerQualityItem;
    }

    public Bitmap getCurrentFrame() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        Bitmap bitmap = null;
        if (!this.mSetup) {
            return null;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            bitmap = sdiVar.B();
        }
        if (bitmap != null || (drawable = this.coverSetByClient) == null) {
            return bitmap;
        }
        try {
            return ((BitmapDrawable) drawable).getBitmap();
        } catch (Exception e) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "getCurrentFrame failed when getBitmap from coverSetByClient, error=" + e.toString());
            return bitmap;
        }
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        if (this.mMediaContext.getVideo() != null) {
            return this.mMediaContext.getVideo().getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        if (this.mMediaContext.getVideo() != null) {
            return this.mMediaContext.getVideo().getDuration();
        }
        return 0;
    }

    public long getDurationTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8205edf2", new Object[]{this})).longValue();
        }
        long j = 0;
        if (System.currentTimeMillis() - this.mBeginTime > 0) {
            j = System.currentTimeMillis() - this.mBeginTime;
        }
        this.mDurationTime = j;
        return j;
    }

    public String getMediaPlayUrl() {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("854e018c", new Object[]{this});
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext == null || (mediaPlayControlContext = mediaContext.mMediaPlayContext) == null) {
            return "";
        }
        return mediaPlayControlContext.getVideoUrl();
    }

    public String getPlayToken() {
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
        }
        if (this.mSetup && (mediaContext = this.mMediaContext) != null) {
            return mediaContext.mPlayToken;
        }
        return "";
    }

    public Map<String, String> getPlayerQos() {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        if (this.mSetup && (sdiVar = this.mMediaController) != null) {
            return sdiVar.C();
        }
        return null;
    }

    public String getSEIData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6f5b6e", new Object[]{this});
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            return sdiVar.D();
        }
        return null;
    }

    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            return sdiVar.E();
        }
        return 0;
    }

    public float getVideoRenderPts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        if (this.mMediaContext.getVideo() != null) {
            return this.mMediaContext.getVideo().getVideoRenderPts();
        }
        return 0.0f;
    }

    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            return sdiVar.F();
        }
        return 0;
    }

    public String getVideoToken() {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        if (this.mSetup && (sdiVar = this.mMediaController) != null) {
            return sdiVar.G();
        }
        return "";
    }

    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            return sdiVar.H();
        }
        return 0;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mRootView;
    }

    public void hiddenLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8b063b", new Object[]{this, new Boolean(z)});
        } else if (!this.mSetup) {
            this.mMediaContext.mHiddenLoading = z;
        }
    }

    public void hiddenMiniProgressBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f628b388", new Object[]{this, new Boolean(z)});
        } else if (!this.mSetup) {
            this.mMediaContext.mHiddenMiniProgressBar = z;
        }
    }

    public void hiddenPlayingIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dea5790", new Object[]{this, new Boolean(z)});
        } else if (!this.mSetup) {
            this.mMediaContext.mHiddenPlayingIcon = z;
        }
    }

    public void hiddenThumbnailPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9671b927", new Object[]{this, new Boolean(z)});
        } else if (!this.mSetup) {
            this.mMediaContext.mHiddenThumbnailPlayBtn = z;
        }
    }

    public void hideController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.mLogContext, "hideController");
        this.mMediaContext.hideControllerView(true);
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.J();
        }
    }

    public boolean isInPlaybackState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f2d892", new Object[]{this})).booleanValue();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            return sdiVar.L();
        }
        return false;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            return sdiVar.M();
        }
        return false;
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (!(mediaContext == null || mediaContext.mMediaPlayContext == null)) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, " MediaPlayCenter, sbt=" + this.mMediaContext.mMediaPlayContext.getFrom() + ",setMute=" + z);
            this.mMediaContext.mMediaPlayContext.mute(z);
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.r0(z);
        }
    }

    public void pause() {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "pause destroy: " + this.mDestroy + ", setup: " + this.mSetup);
        if (!this.mDestroy && this.mSetup && (sdiVar = this.mMediaController) != null) {
            sdiVar.S();
        }
    }

    public void prepareToFirstFrame() {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "prepareToFirstFrame destroy: " + this.mDestroy + ", setup: " + this.mSetup);
        if (!this.mDestroy && this.mSetup && (sdiVar = this.mMediaController) != null) {
            sdiVar.T();
        }
    }

    public void reattach(Context context) {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a117dde9", new Object[]{this, context});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "reattach " + context);
        if (this.mSetup && (sdiVar = this.mMediaController) != null) {
            sdiVar.U(context);
        }
    }

    public void registerOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae58360", new Object[]{this, onVideoClickListener});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.Z(onVideoClickListener);
        }
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.d0();
        }
    }

    public boolean removeVFPlugin(jsr jsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6285d7d", new Object[]{this, jsrVar})).booleanValue();
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar == null) {
            return false;
        }
        return sdiVar.e0(jsrVar);
    }

    public void seamlessDegradeForVVC(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c8f62a", new Object[]{this, str});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.f0(str);
        }
    }

    public void seamlessSwitchStream(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4aa802", new Object[]{this, new Boolean(z)});
        } else if (canSwitchStream() && this.mMediaController != null) {
            AVSDKLog.e(this.mLogContext, "SeamlessSwitch mediaplay center seamlessSwitchStream");
            this.mMediaController.g0(z);
        }
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "seekTo " + i);
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.seekTo(i);
        } else {
            this.mMediaContext.mMediaPlayContext.mSeekWhenPrepared = i;
        }
    }

    public void setAccountId(String str) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setAccountId " + str);
        MediaContext mediaContext = this.mMediaContext;
        if (!(mediaContext == null || (mediaPlayControlContext = mediaContext.mMediaPlayContext) == null)) {
            mediaPlayControlContext.mAccountId = str;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.i0(str);
        }
    }

    public void setAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474dba2b", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setAudioFocusChangeListener " + onAudioFocusChangeListener);
        this.mMediaContext.mAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    public void setAudioOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a34cd", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            mediaContext.setAudioOnly(z);
        }
    }

    public void setAutoDegradedWhenError(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac54e5e", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setAutoDegradedWhenError " + z);
        this.mMediaContext.mMediaPlayContext.mAutoDegradedWhenError = z;
    }

    public void setBackgroundResource(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e14d89", new Object[]{this, drawable});
            return;
        }
        this.backGroundSetByClient = drawable;
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null && this.mMediaContext.mEnableNewTBPlayer) {
            frameLayout.setBackground(drawable);
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setBizCode " + str);
        if (TextUtils.isEmpty(this.mSubBusinessType)) {
            this.mSubBusinessType = str;
        }
        this.mMediaContext.mMediaPlayContext.setFrom(str);
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setBusinessId " + str);
        if (!this.mSetup) {
            this.mMediaContext.mMediaPlayContext.setBusinessId(str);
        }
    }

    public void setConfigGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13da7aec", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setConfigGroup " + str);
        this.mMediaContext.mMediaPlayContext.mConfigGroup = str;
    }

    public void setConnectTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabec0e3", new Object[]{this, new Integer(i)});
        } else {
            this.mMediaContext.mConnectTimeout = i;
        }
    }

    public void setCoverImg(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1014bb", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        this.coverSetByClient = drawable;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setCoverImg coverDrawable=" + drawable + ", bFullscreen=" + z + ", mPicController=" + this.mPicController);
        if (this.mPicController == null || this.mCoverImgView == null) {
            this.mPicController = new hfi(this.mMediaContext);
            ImageView imageView = new ImageView(this.mMediaContext.getContext());
            this.mCoverImgView = imageView;
            this.mPicController.b(imageView);
            this.mRootView.addView(this.mPicController.a(), new FrameLayout.LayoutParams(-1, -1, 17));
            this.mPicController.a().bringToFront();
        }
        if (!this.mFirstFrameUpdated) {
            setMediaLifecycleType(MediaLifecycleType.BEFORE);
        }
        if (z) {
            this.mCoverImgView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mCoverImgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mCoverImgView.setLayoutParams(layoutParams);
        }
        if (ja1.y() >= 0) {
            this.mCoverImgView.setBackgroundColor(-65536);
        } else {
            this.mCoverImgView.setImageDrawable(drawable);
        }
    }

    public void setEmbedLivePlay(boolean z) {
        MediaContext mediaContext;
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964f3a96", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setEmbedLivePlay " + z + ", setup: " + this.mSetup);
        if (!this.mSetup && (mediaContext = this.mMediaContext) != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.mEmbed = z;
        }
    }

    public void setExternSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980fefe", new Object[]{this, surface});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            mediaContext.setExternSurface(surface);
        }
    }

    public void setFadeAnimationTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d11fea", new Object[]{this, new Long(j)});
        } else {
            this.mAnimationTime = j;
        }
    }

    public void setForceUseSurfaceView(boolean z) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec6c6b9", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.mForceUseSurfaceView = z;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "setForceUseSurfaceView=" + z);
        }
    }

    public void setH265Enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac81cdff", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setH265Enable " + z + ", setup:" + this.mSetup);
        if (!this.mSetup) {
            this.mMediaContext.mMediaPlayContext.mH265Enable = z;
        }
    }

    public void setHardwareAvc(boolean z) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef3b3a9", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setHardwareAvc " + z + ", setup: " + this.mSetup);
        if (!this.mSetup && (mediaPlayControlContext = this.mMediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.setHardwareAvc(z);
        }
    }

    public void setHardwareHevc(boolean z) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3393b9", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setHardwareHevc " + z + ", setup: " + this.mSetup);
        if (!this.mSetup && (mediaPlayControlContext = this.mMediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.setHardwareHevc(z);
        }
    }

    public void setIMediaLoopCompleteListener(vrc vrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19563374", new Object[]{this, vrcVar});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setIMediaLoopCompleteListener " + vrcVar);
        this.mMediaLoopCompleteListener = vrcVar;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().k(vrcVar);
        }
    }

    public void setIMediaSwitchInnerListener(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6509b308", new Object[]{this, iscVar});
        } else if (this.mMediaController != null) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "setIMediaSwitchInnerListener " + iscVar);
            this.mMediaController.k0(iscVar);
        }
    }

    public void setIMediaSwitchListener(isc iscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ad0854", new Object[]{this, iscVar});
            return;
        }
        this.mMediaSwitchListener = iscVar;
        if (this.mMediaController != null) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "setIMediaSwitchListener " + iscVar);
            this.mMediaController.l0(iscVar);
        }
    }

    public void setIsTBLive(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182d1000", new Object[]{this, bool});
        } else {
            this.mMediaContext.mMediaPlayContext.mTBLive = bool.booleanValue();
        }
    }

    public void setLiveDefinitionAutoSwitch(boolean z) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setLiveDefinitionAutoSwitch " + z);
        MediaContext mediaContext = this.mMediaContext;
        if (!(mediaContext == null || (mediaPlayControlContext = mediaContext.mMediaPlayContext) == null)) {
            mediaPlayControlContext.setLiveDefinitionAutoSwitch(z);
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.o0(z);
        }
    }

    public void setLocalVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf85c9b", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setLocalVideo " + z + ", setup: " + this.mSetup);
        if (!this.mSetup) {
            this.mMediaContext.mMediaPlayContext.mLocalVideo = z;
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

    public void setLowDeviceFirstRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7972f", new Object[]{this, new Boolean(z)});
        } else {
            this.mMediaContext.mMediaPlayContext.setLowDeviceFirstRender(z);
        }
    }

    public void setMediaAspectRatio(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e63654", new Object[]{this, mediaAspectRatio});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaAspectRatio " + mediaAspectRatio);
        this.mMediaContext.setMediaAspectRatio(mediaAspectRatio);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().i(mediaAspectRatio);
        }
    }

    public void setMediaId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608c02e", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaId " + str);
        this.mMediaContext.mMediaPlayContext.mVideoId = str;
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.p0(str);
            this.mMediaController.L0();
        }
    }

    public void setMediaInfoParams(JSONObject jSONObject) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f34241", new Object[]{this, jSONObject});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.mMediaInfoParams = jSONObject;
        }
    }

    public void setMediaLifecycleListener(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39001713", new Object[]{this, ascVar});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaLifecycleListener " + ascVar);
        this.mMediaPlayLifecycleListener = ascVar;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().h(ascVar);
        }
    }

    public void setMediaLifecycleType(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d26f66e", new Object[]{this, mediaLifecycleType});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaLifecycleType " + mediaLifecycleType);
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.n0(mediaLifecycleType);
        }
    }

    public void setMediaLoopCompleteListener(vrc vrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4002219", new Object[]{this, vrcVar});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaLoopCompleteListener " + vrcVar);
        this.mMediaLoopCompleteListener = vrcVar;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().k(vrcVar);
        }
    }

    public void setMediaSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6109aa2e", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaSource " + str);
        this.mMediaContext.mMediaPlayContext.mVideoSource = str;
    }

    public void setMediaSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaSourceType " + str);
        this.mMediaContext.mMediaPlayContext.mMediaSourceType = str;
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.q0(str);
        }
    }

    public void setMediaType(MediaType mediaType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb6a3de", new Object[]{this, mediaType});
        } else if (!this.mSetup) {
            this.mMediaContext.setMediaType(mediaType);
        } else if (!this.mDestroy) {
            MediaType mediaType2 = this.mMediaContext.getMediaType();
            MediaType mediaType3 = MediaType.PIC;
            if (mediaType2 == mediaType3 && mediaType != mediaType3) {
                this.mMediaContext.setMediaType(mediaType);
                initMediaMode(mediaType);
            } else if ((this.mMediaContext.getMediaType() == MediaType.VIDEO || this.mMediaContext.getMediaType() == MediaType.LIVE) && this.mMediaController != null && mediaType == mediaType3) {
                this.mMediaContext.setMediaType(mediaType3);
                if (this.mPicController == null) {
                    initPicMode();
                } else {
                    this.mMediaController.n0(MediaLifecycleType.BEFORE);
                }
            }
        }
    }

    public void setMediaUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a47c3e", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMediaUrl:" + str);
        this.mMediaContext.mMediaPlayContext.setVideoUrl(str);
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.K0();
        }
    }

    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        mute(z);
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setMute " + z);
    }

    public void setNeedPlayControlView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b4ae57", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setNeedPlayControlView " + z);
        this.mMediaContext.setNeedPlayControlView(z);
    }

    public void setNeedScreenButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f4adf7", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setNeedScreenButton " + z);
        if (!this.mSetup) {
            this.mMediaContext.mNeedScreenButton = z;
        }
    }

    public void setPauseInBackground(boolean z) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.mEnableAutoPauseInBackground = z;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "set mEnableAutoPauseInBackground=" + z);
        }
    }

    public void setPicImageView(ImageView imageView) {
        hfi hfiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
        } else if (imageView != null && (hfiVar = this.mPicController) != null) {
            hfiVar.b(imageView);
        }
    }

    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setPlayRate " + f);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().setPlayRate(f);
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mMediaContext.mPlayScenes = str;
        }
    }

    public void setPlayerType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e501bf", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setPlayerType " + i);
        this.mMediaContext.mMediaPlayContext.setPlayerType(i);
    }

    public void setPropertyFloat(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3a069", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setPropertyFloat property:" + i + ", value: " + f);
        if (this.mMediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().f(i, f);
        }
    }

    public void setPropertyLong(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5ff41b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setPropertyLong property:" + i + ", value: " + j);
        if (this.mMediaContext.getVideo() != null) {
            this.mMediaContext.getVideo().j(i, j);
        }
    }

    public void setReadTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585fd3", new Object[]{this, new Integer(i)});
        } else {
            this.mMediaContext.mReadTimeout = i;
        }
    }

    public void setRenderType(boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316df248", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.mSetup) {
            MediaContext mediaContext = this.mMediaContext;
            mediaContext.mVRRenderType = i;
            mediaContext.mVRLive = z;
            mediaContext.mVRLng = i2;
            mediaContext.mVRLat = i3;
        }
    }

    public void setRequestFullScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d390a5", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setRequestFullScreen " + z);
        this.mMediaContext.mRequestLandscape = z;
    }

    public void setRequestHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.s0(map);
        }
    }

    public void setRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
        } else {
            this.mMediaContext.mRetryTime = i;
        }
    }

    public void setRootViewClickListener(ykd ykdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab8c6a3", new Object[]{this, ykdVar});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.t0(null);
        }
    }

    public void setSEIVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc0248d", new Object[]{this, onVideoClickListener});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setSEIVideoClickListener " + onVideoClickListener);
        this.mMediaClickListener = onVideoClickListener;
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && mediaContext.getVideo() != null && onVideoClickListener != null) {
            this.mMediaContext.getVideo().a(onVideoClickListener);
        }
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setScenarioType " + i);
        this.mMediaContext.mScenarioType = i;
    }

    public void setSeamlessSwitchOption(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6875c", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.u0(z, i, z2);
        }
    }

    public void setSeamlessSwitchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53919393", new Object[]{this, str});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.v0(str);
        }
    }

    public void setShowNoWifiToast(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a031b", new Object[]{this, new Boolean(z)});
        } else {
            this.mMediaContext.mbShowNoWifiToast = z;
        }
    }

    public void setStartPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f9eac8", new Object[]{this, new Integer(i)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            mediaContext.setStartPos(i);
        }
    }

    public void setSurfaceListener(TaoLiveVideoView.p pVar) {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b06e5b", new Object[]{this, pVar});
            return;
        }
        this.mSurfaceListener = pVar;
        if (pVar != null && (sdiVar = this.mMediaController) != null) {
            sdiVar.w0(pVar);
        }
    }

    public void setTBLiveMSGInfo(TBLiveMSGInfo tBLiveMSGInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e025e64", new Object[]{this, tBLiveMSGInfo});
            return;
        }
        this.mMediaContext.mMediaPlayContext.mLiveMSGInfo = tBLiveMSGInfo;
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.x0();
        }
    }

    public void setTBVideoSourceAdapter(qvd qvdVar) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea70ce1b", new Object[]{this, qvdVar});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.mTBVideoSourceAdapter = qvdVar;
        }
    }

    public void setTransH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cfd2fe", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setTransH265 " + z);
        this.mMediaContext.mMediaPlayContext.setTransH265(z);
    }

    public void setTranslation(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae597476", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setTranslation translationX is " + f + " translationY is " + f2);
        this.mTranslationX = f;
        this.mTranslationY = f2;
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.y0(f, f2);
        }
    }

    public void setUseBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7977a955", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setUseBfrtc " + z);
        this.mMediaContext.mMediaPlayContext.setUseBfrtc(z);
    }

    public void setUseCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setUseCache " + z);
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            mediaContext.mUseCache = z;
        }
    }

    public void setUseMiniBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec720e8c", new Object[]{this, new Boolean(z)});
        } else if (canSwitchStream()) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "setUseMiniBfrtc " + z);
            this.mMediaContext.mMediaPlayContext.setUseMiniBfrtc(z);
        }
    }

    public void setUseRtcLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d482b6c5", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setUseRtcLive " + z);
        this.mMediaContext.mMediaPlayContext.setUseRtcLive(z);
    }

    public void setUseShortAudioFocus(boolean z) {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c253f14", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null && (mediaPlayControlContext = mediaContext.mMediaPlayContext) != null) {
            mediaPlayControlContext.mRequestShortAudioFocus = z;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "mediaPlayCenter: setUseShortAudioFocus=" + z);
        }
    }

    public void setUserId(String str) {
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setUserId " + str + ", setup: " + this.mSetup);
        if (!this.mSetup && (mediaContext = this.mMediaContext) != null) {
            mediaContext.mUserId = str;
        }
    }

    public void setUsingInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad57968", new Object[]{this, str});
        } else {
            this.mUsingInterface = str;
        }
    }

    public void setUsingNewPlayerInstance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4eb1079", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            mediaContext.mEnableNewTBPlayer = z;
        }
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setVideoLoop " + z);
        this.mMediaContext.mLoop = z;
    }

    public void setVideoRecycleListener(fsc fscVar) {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7ec244", new Object[]{this, fscVar});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "registerVideoRecycleListener " + fscVar);
        this.mMediaRecycleListener = fscVar;
        if (!this.mDisSetRecycleListenerAtOldPath) {
            MediaContext mediaContext = this.mMediaContext;
            if (mediaContext != null && mediaContext.getVideo() != null) {
                this.mMediaContext.getVideo().g(fscVar);
            }
        } else if (fscVar != null && (sdiVar = this.mMediaController) != null) {
            sdiVar.b0(fscVar);
        }
    }

    public void setVideoToken(String str) {
        MediaContext mediaContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bedad1", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setVideoToken " + str + ", setup: " + this.mSetup);
        if (!this.mSetup && (mediaContext = this.mMediaContext) != null) {
            mediaContext.setVideoToken(str);
        }
    }

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.z0(f);
        }
    }

    public void setup() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.mLogContext, "Setup called");
        if (!this.mSetup) {
            this.mSetup = true;
            if (TextUtils.isEmpty(this.mUsingInterface)) {
                this.mMediaContext.mUsingInterface = COMPONENT_NAME;
            } else {
                this.mMediaContext.mUsingInterface = this.mUsingInterface + ".avcenter";
            }
            if (!checkParams()) {
                if (MediaSystemUtils.isApkDebuggable()) {
                    if (this.mMediaContext.getUTParams() != null) {
                        str = "";
                        for (Map.Entry<String, String> entry : this.mMediaContext.getUTParams().entrySet()) {
                            str = str + entry.getKey() + "=" + entry.getValue() + ";";
                        }
                    } else {
                        str = "";
                    }
                    AVSDKLog.e(this.mLogContext, " please set mBizCode , mVideoSource and  mVideoId parameters" + str);
                } else {
                    AVSDKLog.e(this.mLogContext, " please set mBizCode , mVideoSource and  mVideoId parameters" + this.mMediaContext.mMediaPlayContext.getVideoUrl());
                }
            }
            if (this.mMediaController == null) {
                sdi sdiVar = new sdi(this.mMediaContext);
                this.mMediaController = sdiVar;
                nj9 nj9Var = this.mExternFirstRenderAdapter;
                if (nj9Var != null) {
                    sdiVar.j0(nj9Var);
                    this.mExternFirstRenderAdapter = null;
                }
                InnerStartFuncListener innerStartFuncListener = this.mExternInnerStartFuncListener;
                if (innerStartFuncListener != null) {
                    this.mMediaController.m0(innerStartFuncListener);
                    this.mExternInnerStartFuncListener = null;
                }
                this.mMediaController.t0(null);
                this.mMediaController.V(this);
                TaoLiveVideoView.p pVar = this.mSurfaceListener;
                if (pVar != null) {
                    this.mMediaController.w0(pVar);
                }
                this.mRootView.addView(this.mMediaController.I(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
                if (!(this.mRootView == null || this.mMediaController.I() == null)) {
                    this.mMediaController.y0(this.mTranslationX, this.mTranslationY);
                }
                this.mMediaController.r0(this.mMediaContext.mMediaPlayContext.isMute());
                this.mMediaController.o0(this.mMediaContext.mMediaPlayContext.isLiveDefinitionAutoSwitch());
                if (this.mMediaLoopCompleteListener != null) {
                    this.mMediaContext.getVideo().k(this.mMediaLoopCompleteListener);
                }
                if (this.mMediaPlayLifecycleListener != null) {
                    this.mMediaContext.getVideo().h(this.mMediaPlayLifecycleListener);
                }
                if (this.mMediaClickListener != null) {
                    this.mMediaContext.getVideo().a(this.mMediaClickListener);
                }
                fsc fscVar = this.mMediaRecycleListener;
                if (fscVar != null) {
                    if (this.mDisSetRecycleListenerAtOldPath) {
                        this.mMediaController.b0(fscVar);
                        this.mMediaRecycleListener = null;
                    } else {
                        this.mMediaContext.getVideo().g(this.mMediaRecycleListener);
                    }
                }
                isc iscVar = this.mMediaSwitchListener;
                if (iscVar != null) {
                    this.mMediaController.l0(iscVar);
                }
                int i = this.mMediaContext.mEnablePlayInBackground;
                if (i == 0 || i == 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(MediaConstant.CMD_ENABLE_AUTO_PAUSE_IN_BACKGROUND, "" + this.mMediaContext.mEnablePlayInBackground);
                    this.mMediaController.w(hashMap);
                }
                MediaContext mediaContext = this.mMediaContext;
                mediaContext.mEnablePlayInBackground = -1;
                if (this.mLogAdapter != null || mediaContext.mEnableNewTBPlayer) {
                    mediaContext.getVideo().h(new a());
                }
            }
        }
    }

    public void startViewFadeAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afd7a4a", new Object[]{this, view});
        } else if (view != null) {
            if (this.mAnimationTime > 0) {
                if (this.mAlphaAnimation == null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    this.mAlphaAnimation = alphaAnimation;
                    alphaAnimation.setDuration(this.mAnimationTime);
                }
                view.startAnimation(this.mAlphaAnimation);
            }
            AVSDKLog.e(this.mLogContext, "the cover view set to invisible, hide cover start.");
            view.setVisibility(4);
            AVSDKLog.e(this.mLogContext, "the cover view set to invisible, hide cover finished.");
        }
    }

    public void stopSwitch() {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6621cb5d", new Object[]{this});
        } else if (canSwitchStream() && (sdiVar = this.mMediaController) != null) {
            sdiVar.D0();
        }
    }

    public void switchHigher(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38dfa6ea", new Object[]{this, new Boolean(z)});
        } else if (canSwitchHigher()) {
            this.mMediaContext.mMediaPlayContext.mSwitchingLower = false;
            seamlessSwitchStream(z);
        }
    }

    public void switchLower(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4966f20", new Object[]{this, new Boolean(z)});
        } else if (canSwitchLower()) {
            this.mMediaContext.mMediaPlayContext.mSwitchingLower = true;
            seamlessSwitchStream(z);
        }
    }

    public void toggleScreen() {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "toggleScreen setup: " + this.mSetup);
        if (this.mSetup && (sdiVar = this.mMediaController) != null) {
            sdiVar.F0();
        }
    }

    public void unregisterOnVideoClickListener(IMediaPlayer.OnVideoClickListener onVideoClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16429a7", new Object[]{this, onVideoClickListener});
            return;
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.H0(onVideoClickListener);
        }
    }

    public void unregisterVideoRecycleListener(fsc fscVar) {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41442e2a", new Object[]{this, fscVar});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "unRegisterRecycleListener " + fscVar);
        if (fscVar != null && (sdiVar = this.mMediaController) != null) {
            sdiVar.I0(fscVar);
            this.mMediaRecycleListener = null;
        }
    }

    public void updateCoverImg(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a47b32", new Object[]{this, bitmap});
            return;
        }
        ImageView imageView = this.mCoverImgView;
        if (imageView != null) {
            imageView.post(new b(bitmap));
        } else if (bitmap != null) {
            setCoverImg(new BitmapDrawable(bitmap), true);
        }
    }

    public boolean addVFPlugin(jsr jsrVar) {
        sdi sdiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89570f5a", new Object[]{this, jsrVar})).booleanValue();
        }
        if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_VF_PLUGIN, "true")) || (sdiVar = this.mMediaController) == null) {
            return false;
        }
        return sdiVar.t(jsrVar);
    }

    @Override // tb.urc
    public void onLifecycleChanged(MediaLifecycleType mediaLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fa27", new Object[]{this, mediaLifecycleType});
        } else if (mediaLifecycleType == this.mCurrentLifecycleType) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "onLifecycleChanged return because same type=" + mediaLifecycleType);
        } else if (mediaLifecycleType == MediaLifecycleType.PLAY) {
            if (this.mPicController != null) {
                feh fehVar2 = this.mLogContext;
                AVSDKLog.e(fehVar2, "onLifecycleChanged " + mediaLifecycleType + ", hide cover start");
                startViewFadeAnimation(this.mPicController.a());
                feh fehVar3 = this.mLogContext;
                AVSDKLog.e(fehVar3, "onLifecycleChanged " + mediaLifecycleType + ", hide cover finished immediatly.");
                this.mCurrentLifecycleType = mediaLifecycleType;
            }
        } else if (mediaLifecycleType == MediaLifecycleType.BEFORE && this.mPicController != null) {
            if (this.mFirstFrameUpdated && this.mMediaContext.mEnableNewTBPlayer) {
                updateCoverImg(getCurrentFrame());
            }
            feh fehVar4 = this.mLogContext;
            AVSDKLog.e(fehVar4, "onLifecycleChanged " + mediaLifecycleType + ", show cover");
            AlphaAnimation alphaAnimation = this.mAlphaAnimation;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.mPicController.a().setVisibility(0);
            this.mCurrentLifecycleType = mediaLifecycleType;
        }
    }

    public void setUseArtp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5989b", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setUseArtp " + z);
        this.mMediaContext.mMediaPlayContext.setUseArtp(false);
    }

    public void showController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.mLogContext, "showController");
        this.mMediaContext.hideControllerView(false);
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.A0();
        }
    }

    public void warmupLiveStream(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "warmupLiveStream sys:" + System.currentTimeMillis());
        if (this.mMediaController != null) {
            gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
            if (gf4Var == null || ew0.s(gf4Var.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_WARMUP, "true"))) {
                if (mediaLiveWarmupConfig != null) {
                    this.mMediaController.M0(mediaLiveWarmupConfig);
                } else {
                    this.mMediaController.M0(new MediaLiveWarmupConfig());
                }
                this.mHasWarmuped = true;
            }
        }
    }

    private boolean checkParams() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.getFrom()) || TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoSource) || TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoId)) {
            AVSDKLog.e(this.mLogContext, "缺少必填参数 bizCode、videoSource、videoId！！");
            MediaPlayControlContext mediaPlayControlContext = this.mMediaContext.mMediaPlayContext;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "checkParams from: " + mediaPlayControlContext.getFrom() + ", videoSource: " + mediaPlayControlContext.mVideoSource + ", videoId: " + mediaPlayControlContext.mVideoId);
        }
        if (TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.getFrom())) {
            this.mMediaContext.mMediaPlayContext.setFrom("default");
        }
        if (!TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.getVideoUrl()) && TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoId) && "TBVideo".equals(this.mMediaContext.mMediaPlayContext.mVideoSource)) {
            try {
                String rawPath = new URI(this.mMediaContext.mMediaPlayContext.getVideoUrl()).getRawPath();
                int lastIndexOf = rawPath.lastIndexOf(47);
                int lastIndexOf2 = rawPath.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && (i = lastIndexOf + 1) < rawPath.length() && lastIndexOf2 > i) {
                    this.mMediaContext.mMediaPlayContext.mVideoId = rawPath.substring(i, lastIndexOf2);
                }
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mVideoId);
    }

    public List<PlayerQualityItem> getDefinitionList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1c16f81", new Object[]{this, new Boolean(z)});
        }
        MediaPlayControlContext mediaPlayControlContext = this.mMediaContext.mMediaPlayContext;
        if (mediaPlayControlContext.isRtcVVC) {
            AVSDKLog.e(this.mLogContext, "getDefinitionList return at isRtcVVC");
            return null;
        } else if (MediaConstant.RTCLIVE_URL_NAME.equals(mediaPlayControlContext.mSelectedUrlName) || MediaConstant.BFRTC_URL_NAME.equals(this.mMediaContext.mMediaPlayContext.mSelectedUrlName)) {
            MediaPlayControlContext mediaPlayControlContext2 = this.mMediaContext.mMediaPlayContext;
            if (mediaPlayControlContext2.mMediaLiveInfo == null) {
                AVSDKLog.e(this.mLogContext, "getDefinitionList return at mMediaLiveInfo == nullc");
                return null;
            }
            List<PlayerQualityItem> definitionList = mediaPlayControlContext2.getDefinitionList(z);
            if (definitionList == null || definitionList.size() == 0) {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "getDefinitionList " + z + " null");
                return definitionList;
            }
            for (int i = 0; i < definitionList.size(); i++) {
                feh fehVar2 = this.mLogContext;
                AVSDKLog.e(fehVar2, "getDefinitionList  " + i + ", onlySwitable=" + z + " index=" + definitionList.get(i).index + ", name=" + definitionList.get(i).name + ", newName=" + definitionList.get(i).newName + ", current=" + definitionList.get(i).current + ", newDefinition=" + definitionList.get(i).newDefinition);
            }
            return definitionList;
        } else {
            AVSDKLog.e(this.mLogContext, "getDefinitionList return at not rtc");
            return null;
        }
    }

    public void release() {
        hfi hfiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.mLogContext, "release called");
        this.mSetup = false;
        this.mInnerStartListener = null;
        this.mExternInnerStartFuncListener = null;
        this.mTranslationY = 0.0f;
        this.mTranslationX = 0.0f;
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.c0();
        }
        MediaContext mediaContext = this.mMediaContext;
        if (mediaContext != null) {
            if (mediaContext.mEnableNewTBPlayer) {
                updateCoverImg(getCurrentFrame());
                setMediaLifecycleType(MediaLifecycleType.BEFORE);
            }
            this.mMediaContext.release();
        }
        this.mNeedInitSwitchControlParam = true;
        this.mMediaSwitchListener = null;
        if ("homepageLiveCard".equals(this.mSubBusinessType) && (hfiVar = this.mPicController) != null) {
            startViewFadeAnimation(hfiVar.a());
        }
    }

    public void setFirstRenderAdapter(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setFirstRenderAdapter " + nj9Var);
        if (nj9Var != null) {
            this.mMediaContext.setNeedCommitUserToFirstFrame(true);
        } else {
            this.mMediaContext.setNeedCommitUserToFirstFrame(false);
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.j0(nj9Var);
        } else {
            this.mExternFirstRenderAdapter = nj9Var;
        }
    }

    public void start() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "start begin: destroy state=" + this.mDestroy + ", setup state=" + this.mSetup + ", sys: " + System.currentTimeMillis());
        if (!this.mDestroy && this.mSetup) {
            if (this.mMediaController != null) {
                setInnerStartFuncListener();
                if (ja1.M0 && ja1.N0) {
                    z = true;
                }
                feh fehVar2 = this.mLogContext;
                AVSDKLog.e(fehVar2, this + " mHasSOW: " + this.mHasSOW + ", mHasWarmuped: " + this.mHasWarmuped + ", enableSwitchOnWarmup: " + z + ", sns: " + ja1.M0 + ", mEnableSwitchOnWarmup: " + ja1.N0);
                boolean z2 = this.mHasSOW;
                if (z2 && !this.mSOWFinished) {
                    AVSDKLog.e(this.mLogContext, "abort start, sow hasnt finished");
                    return;
                } else if (z2 || !this.mHasWarmuped || !z || !tbn.c(this.mMediaContext.mMediaPlayContext.getVideoDefinition(), this.mMediaContext.mMediaPlayContext)) {
                    this.mMediaController.C0();
                } else {
                    String a2 = tbn.a(this.mMediaContext.mMediaPlayContext);
                    if (!TextUtils.isEmpty(a2)) {
                        setIMediaSwitchInnerListener(new c());
                        switchToNewDefinition(10, a2);
                        this.mHasSOW = true;
                    } else {
                        this.mMediaController.C0();
                    }
                }
            }
            feh fehVar3 = this.mLogContext;
            AVSDKLog.e(fehVar3, "start finish sys:" + System.currentTimeMillis());
        }
    }

    public boolean switchToNewDefinition(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5be6cf26", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "switchToNewDefinition " + i + ", " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.mEnableSwitchToNewDefinition || this.mMediaSwitchListener == null) {
            sdi sdiVar = this.mMediaController;
            if (sdiVar != null) {
                sdiVar.E0(i, str);
            }
            return true;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(rb.RESULT_KEY, "-1");
        hashMap.put("newDefinition", str);
        hashMap.put("protocol", "");
        hashMap.put("reason", "" + i);
        hashMap.put("detail", "{\"msg\":\"error when orange close\", \"error\":-1}");
        feh fehVar2 = this.mLogContext;
        AVSDKLog.e(fehVar2, "switchToNewDefinition " + hashMap);
        this.mMediaSwitchListener.A(hashMap);
        return false;
    }

    public void updateLiveMediaInfoData(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21553a6f", new Object[]{this, mediaLiveInfo});
            return;
        }
        AVSDKLog.e(this.mLogContext, "updateLiveMediaInfoData");
        this.mMediaContext.mMediaPlayContext.mMediaLiveInfo = mediaLiveInfo;
        pareseMediaConfigData(mediaLiveInfo);
        MediaLiveInfo mediaLiveInfo2 = this.mMediaContext.mMediaPlayContext.mMediaLiveInfo;
        if (!(mediaLiveInfo2 == null || mediaLiveInfo2.liveUrlList == null)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.size(); i++) {
                QualityLiveItem qualityLiveItem = this.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.get(i);
                if (!TextUtils.isEmpty(qualityLiveItem.newDefinition)) {
                    if (sb.length() > 0) {
                        sb.append("_");
                    }
                    sb.append(qualityLiveItem.newDefinition);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("definition_list", sb.toString());
            this.mMediaContext.addPlayExpUtParams(hashMap);
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "updateLiveMediaInfoData definition_list: " + sb.toString());
        }
        sdi sdiVar = this.mMediaController;
        if (sdiVar != null) {
            sdiVar.J0();
        }
    }

    public void seekTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mMediaController != null) {
            AVSDKLog.e(this.mLogContext, "MediaController.seekTo");
            this.mMediaController.h0(i, z, false);
        }
    }

    public void seekTo(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else if (this.mMediaController != null) {
            AVSDKLog.e(this.mLogContext, "MediaController.seekTo");
            this.mMediaController.h0(i, z, z2);
        }
    }

    public void updateUrlList(List<QualityLiveItem> list, UpdataUrlListMode updataUrlListMode) {
        MediaLiveInfo mediaLiveInfo;
        MediaPlayCenter mediaPlayCenter = this;
        List<QualityLiveItem> list2 = list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c845c561", new Object[]{mediaPlayCenter, list2, updataUrlListMode});
            return;
        }
        AVSDKLog.e(mediaPlayCenter.mLogContext, "call updateUrlList");
        if (updataUrlListMode == UpdataUrlListMode.INIT) {
            AVSDKLog.e(mediaPlayCenter.mLogContext, "Not updateUrlList because mode is init");
            return;
        }
        MediaPlayControlContext mediaPlayControlContext = mediaPlayCenter.mMediaContext.mMediaPlayContext;
        if (mediaPlayControlContext == null || (mediaLiveInfo = mediaPlayControlContext.mMediaLiveInfo) == null || mediaLiveInfo.liveUrlList == null || list2 == null || list.size() == 0) {
            AVSDKLog.e(mediaPlayCenter.mLogContext, "Not updateUrlList because some info is null.");
            return;
        }
        feh fehVar = mediaPlayCenter.mLogContext;
        AVSDKLog.e(fehVar, "updateUrlList size=" + list.size() + ", mode=" + updataUrlListMode.getValue());
        int i = 0;
        while (i < mediaPlayCenter.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.size()) {
            QualityLiveItem qualityLiveItem = mediaPlayCenter.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.get(i);
            feh fehVar2 = mediaPlayCenter.mLogContext;
            AVSDKLog.e(fehVar2, "updateUrlList before1 index=" + i + ", recomm=" + qualityLiveItem.recomm + ", newDefinition=" + qualityLiveItem.newDefinition + ", definition=" + qualityLiveItem.definition + ", name=" + qualityLiveItem.name + ", newName=" + qualityLiveItem.newName + ", rtcUrl=" + qualityLiveItem.rtcLiveUrl + ", flvUrl=" + qualityLiveItem.flvUrl + ", bfrtcUrl=" + qualityLiveItem.bfrtcUrl + ", additionUrlMap= " + qualityLiveItem.additionUrlMap + ", extInfo= " + qualityLiveItem.extInfo);
            i++;
            mediaPlayCenter = this;
        }
        int i2 = 0;
        while (i2 < list.size()) {
            QualityLiveItem qualityLiveItem2 = list2.get(i2);
            feh fehVar3 = this.mLogContext;
            AVSDKLog.e(fehVar3, "updateUrlList before2 index=" + i2 + ", recomm=" + qualityLiveItem2.recomm + ", newDefinition=" + qualityLiveItem2.newDefinition + ", definition=" + qualityLiveItem2.definition + ", name=" + qualityLiveItem2.name + ", newName=" + qualityLiveItem2.newName + ", rtcUrl=" + qualityLiveItem2.rtcLiveUrl + ", flvUrl=" + qualityLiveItem2.flvUrl + ", bfrtcUrl=" + qualityLiveItem2.bfrtcUrl + ", additionUrlMap= " + qualityLiveItem2.additionUrlMap + ", extInfo= " + qualityLiveItem2.extInfo);
            i2++;
            list2 = list;
        }
        nfi.d(this.mMediaContext.mMediaPlayContext.mMediaLiveInfo, list, updataUrlListMode.getValue());
        MediaPlayControlContext mediaPlayControlContext2 = this.mMediaContext.mMediaPlayContext;
        nfi.e(mediaPlayControlContext2.mPlayerQualityItem, mediaPlayControlContext2.mMediaLiveInfo);
        for (int i3 = 0; i3 < this.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.size(); i3++) {
            QualityLiveItem qualityLiveItem3 = this.mMediaContext.mMediaPlayContext.mMediaLiveInfo.liveUrlList.get(i3);
            feh fehVar4 = this.mLogContext;
            AVSDKLog.e(fehVar4, "updateUrlList after index=" + i3 + ", recomm=" + qualityLiveItem3.recomm + ", newDefinition=" + qualityLiveItem3.newDefinition + ", definition=" + qualityLiveItem3.definition + ", name=" + qualityLiveItem3.name + ", newName=" + qualityLiveItem3.newName + ", rtcUrl=" + qualityLiveItem3.rtcLiveUrl + ", flvUrl=" + qualityLiveItem3.flvUrl + ", bfrtcUrl=" + qualityLiveItem3.bfrtcUrl + ", additionUrlMap= " + qualityLiveItem3.additionUrlMap + ", extInfo= " + qualityLiveItem3.extInfo);
        }
        UpdataUrlListMode updataUrlListMode2 = UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION;
        if (updataUrlListMode2 == updataUrlListMode && this.mMediaContext.mMediaPlayContext.mEnableAdaptiveLiveSwitch) {
            HashMap hashMap = new HashMap();
            hashMap.put(MediaConstant.CMD_REPLACE_FORCE_OF_NEW_DEFINITION, "1");
            if (!TextUtils.isEmpty(this.mMediaContext.mLivePushControlInfo)) {
                hashMap.put(MediaConstant.CMD_LIVE_PUSH_CONTROL_INFO, this.mMediaContext.mLivePushControlInfo);
            }
            callWithMsgAndResult(hashMap);
            PlayerQualityItem playerQualityItem = this.mMediaContext.mMediaPlayContext.mPlayerQualityItem;
            if (playerQualityItem == null) {
                AVSDKLog.e(this.mLogContext, "updateUrlList return by playing url mode.");
                return;
            }
            boolean isEmpty = TextUtils.isEmpty(playerQualityItem.newDefinition);
            if (this.mMediaContext.mMediaPlayContext.isLiveDefinitionAutoSwitch() || (updataUrlListMode2 == updataUrlListMode && isEmpty)) {
                MediaPlayControlContext mediaPlayControlContext3 = new MediaPlayControlContext(this.mMediaContext.getContext(), this.mMediaContext.mPlayToken);
                mediaPlayControlContext3.mMediaLiveInfo = this.mMediaContext.mMediaPlayContext.mMediaLiveInfo;
                mediaPlayControlContext3.mTBLive = true;
                mediaPlayControlContext3.setUseRtcLive(true);
                try {
                    new com.taobao.mediaplay.a(mediaPlayControlContext3).L(new d(this));
                } catch (Exception unused) {
                    AVSDKLog.e(this.mLogContext, "updateUrlList and select url exception.");
                }
                if (mediaPlayControlContext3.mPlayerQualityItem == null || ((!MediaConstant.RTCLIVE_URL_NAME.equals(mediaPlayControlContext3.mSelectedUrlName) && !MediaConstant.BFRTC_URL_NAME.equals(mediaPlayControlContext3.mSelectedUrlName)) || TextUtils.isEmpty(mediaPlayControlContext3.mPlayerQualityItem.newDefinition))) {
                    AVSDKLog.e(this.mLogContext, "updateUrlList with select no rtc url.");
                } else if (ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "resumeUpSwitchAtUpdateUrlList", "false"))) {
                    if (TextUtils.isEmpty(this.mMediaContext.mMediaPlayContext.mPlayerQualityItem.newDefinition) || !this.mMediaContext.mMediaPlayContext.mPlayerQualityItem.newDefinition.equals(mediaPlayControlContext3.mPlayerQualityItem.newDefinition)) {
                        switchToNewDefinition(9, mediaPlayControlContext3.mPlayerQualityItem.newDefinition);
                    }
                }
            }
        }
    }
}
