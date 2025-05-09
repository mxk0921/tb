package com.taobao.mediaplay;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import com.taobao.taobaoavsdk.Tracer.b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.ew0;
import tb.jrc;
import tb.krc;
import tb.sei;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BaseAnalysis mAnalysis;
    public AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    private boolean mAudioOnly;
    private WeakReference<Context> mContextRef;
    private Map<String, String> mControlParams;
    private Map<String, String> mCustomParams;
    public boolean mDisableSurfaceView;
    public String mDynamicPlayEx;
    public boolean mHiddenGestureView;
    public boolean mHiddenLoading;
    public boolean mHiddenMiniProgressBar;
    public boolean mHiddenNetworkErrorView;
    public boolean mHiddenPlayErrorView;
    public boolean mHiddenPlayingIcon;
    public boolean mHiddenThumbnailPlayBtn;
    public boolean mHiddenToastView;
    private boolean mHideControllder;
    public boolean mHookKeyBackToggleEvent;
    public boolean mIsFloat;
    private sei mKeyBackController;
    public String mLivePushControlInfo;
    public boolean mLoop;
    private jrc mMedia;
    public MediaPlayControlContext mMediaPlayContext;
    public MediaType mMediaType;
    private boolean mNeedGesture;
    private Map<String, String> mPlayExpUtParams;
    public String mPlayScenes;
    public String mPlayToken;
    private String mRID;
    public String mSwitchScene;
    public long mSwitchSceneTime;
    public String mUserId;
    public String mUsingInterface;
    private Map<String, String> mUtParams;
    public int mVRLat;
    public int mVRLng;
    public int mVRRenderType;
    private String mVideoToken;
    private Window mWindow;
    public boolean mbShowNoWifiToast;
    public boolean mVRLive = false;
    public int mSwitchStreamABId = 0;
    public boolean mSwitchStreamEnable = true;
    public int mEnablePlayInBackground = -1;
    public int mEnterVoiceRoom = -1;
    public boolean mIsPlayBackScenario = false;
    public int mConnectTimeout = 0;
    public int mReadTimeout = 0;
    public int mRetryTime = 0;
    public boolean mNeedScreenButton = true;
    private boolean mNeedCloseUT = true;
    private boolean mNeedFirstPlayUT = true;
    private MediaPlayScreenType mVideoScreenType = MediaPlayScreenType.NORMAL;
    private boolean mNeedCommitUserToFirstFrame = true;
    private boolean mNeedPlayControlView = true;
    private boolean mPrepareToFirstFrame = false;
    private boolean mWarmupFlag = false;
    private int mWarmupLevel = 1;
    public int mScenarioType = 0;
    public boolean mRequestLandscape = true;
    private MediaAspectRatio mAspectRatio = MediaAspectRatio.DW_FIT_CENTER;
    private int mStartPos = 0;
    public boolean mUseCache = false;
    private Surface mExternSurface = null;
    public boolean mEnableNewTBPlayer = false;

    static {
        t2o.a(774897703);
    }

    public MediaContext(Context context) {
        this.mContextRef = null;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.mContextRef = weakReference;
        Context context2 = weakReference.get();
        if (context instanceof Activity) {
            this.mKeyBackController = new sei((Activity) context2);
        }
        this.mUtParams = new HashMap();
        this.mPlayExpUtParams = new HashMap();
        this.mCustomParams = new HashMap();
        this.mControlParams = new HashMap();
        this.mAnalysis = new b();
    }

    public void addControlParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e2fabc", new Object[]{this, map});
        } else if (map != null) {
            this.mControlParams.putAll(map);
        }
    }

    public void addCustomParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18497403", new Object[]{this, map});
        } else if (map != null) {
            this.mCustomParams.putAll(map);
        }
    }

    public void addPlayExpUtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3d2b71", new Object[]{this, map});
        } else if (map != null) {
            this.mPlayExpUtParams.putAll(map);
        }
    }

    public void addUtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e23998", new Object[]{this, map});
        } else if (map != null) {
            this.mUtParams.putAll(map);
        }
    }

    public void genPlayToken(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8339e98", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (TextUtils.isEmpty(this.mPlayToken) || z) {
                this.mPlayToken = ew0.d() + new Random().nextInt(100000);
            }
        } catch (Throwable unused) {
            this.mPlayToken = System.currentTimeMillis() + "_";
        }
    }

    public boolean getAudioOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cecb7477", new Object[]{this})).booleanValue();
        }
        return this.mAudioOnly;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Map<String, String> getControlParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef0f02c9", new Object[]{this});
        }
        return this.mControlParams;
    }

    public Map<String, String> getCustomParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62345009", new Object[]{this});
        }
        return this.mCustomParams;
    }

    public Surface getExternSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("11eb1424", new Object[]{this});
        }
        return this.mExternSurface;
    }

    public MediaType getMediaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaType) ipChange.ipc$dispatch("8cfeb342", new Object[]{this});
        }
        return this.mMediaType;
    }

    public boolean getNeedCommitUserToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f3055f1", new Object[]{this})).booleanValue();
        }
        return this.mNeedCommitUserToFirstFrame;
    }

    public Map<String, String> getPlayExpUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66adc894", new Object[]{this});
        }
        return this.mPlayExpUtParams;
    }

    public boolean getPrepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef5134f4", new Object[]{this})).booleanValue();
        }
        return this.mPrepareToFirstFrame;
    }

    public String getRID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b3a582", new Object[]{this});
        }
        return this.mRID;
    }

    public int getStartPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("417d0082", new Object[]{this})).intValue();
        }
        return this.mStartPos;
    }

    public Map<String, String> getUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d81bf417", new Object[]{this});
        }
        return this.mUtParams;
    }

    public jrc getVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrc) ipChange.ipc$dispatch("306f6478", new Object[]{this});
        }
        return this.mMedia;
    }

    public MediaAspectRatio getVideoAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaAspectRatio) ipChange.ipc$dispatch("13c7669d", new Object[]{this});
        }
        return this.mAspectRatio;
    }

    public String getVideoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        return this.mVideoToken;
    }

    public boolean getWarmupFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64d52ed", new Object[]{this})).booleanValue();
        }
        return this.mWarmupFlag;
    }

    public int getWarmupLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcb4f7c8", new Object[]{this})).intValue();
        }
        return this.mWarmupLevel;
    }

    public Window getWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("7f59f544", new Object[]{this});
        }
        return this.mWindow;
    }

    public void handleKeyBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53144225", new Object[]{this});
            return;
        }
        sei seiVar = this.mKeyBackController;
        if (seiVar != null) {
            seiVar.b();
        }
    }

    public void hideControllerView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc697eca", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideControllder = z;
        }
    }

    public boolean isHiddenLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eee90fb3", new Object[]{this})).booleanValue();
        }
        return this.mHiddenLoading;
    }

    public boolean isHideControllder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ad7361", new Object[]{this})).booleanValue();
        }
        return this.mHideControllder;
    }

    public boolean isNeedPlayControlView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d0c5659", new Object[]{this})).booleanValue();
        }
        return this.mNeedPlayControlView;
    }

    public boolean needCloseUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("431eb12c", new Object[]{this})).booleanValue();
        }
        return this.mNeedCloseUT;
    }

    public boolean needFirstPlayUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c38bf38", new Object[]{this})).booleanValue();
        }
        return this.mNeedFirstPlayUT;
    }

    public void registerKeyBackEventListener(krc krcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c0b2a", new Object[]{this, krcVar});
            return;
        }
        sei seiVar = this.mKeyBackController;
        if (seiVar != null) {
            seiVar.c(krcVar);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mDisableSurfaceView = false;
        sei seiVar = this.mKeyBackController;
        if (seiVar != null) {
            seiVar.a();
        }
        MediaPlayControlContext mediaPlayControlContext = this.mMediaPlayContext;
        mediaPlayControlContext.mMediaSourceType = "";
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.mDropFrameForH265 = false;
            mediaPlayControlContext.mSVCEnable = false;
            mediaPlayControlContext.mLowQualityUrl = "";
            mediaPlayControlContext.mOnlyVideoEnable = false;
            mediaPlayControlContext.setAvdataBufferedMaxMBytes(0);
            MediaPlayControlContext mediaPlayControlContext2 = this.mMediaPlayContext;
            mediaPlayControlContext2.mHasLowSpeedPolicy = false;
            mediaPlayControlContext2.mNeedInitLowSpeedPolicyAB = true;
            mediaPlayControlContext2.mEnableLowSpeedPolicyAB = false;
            mediaPlayControlContext2.mInitDefinition = null;
            mediaPlayControlContext2.mSelectedUrlName = "";
            mediaPlayControlContext2.mEnableAdaptiveLiveSwitch = false;
            mediaPlayControlContext2.mExperienceIdSet.clear();
            this.mMediaPlayContext.mExperienceReleaseIdSet.clear();
            this.mMediaPlayContext.mExperienceBucketIdSet.clear();
            MediaPlayControlContext mediaPlayControlContext3 = this.mMediaPlayContext;
            mediaPlayControlContext3.mDegradeToFlvByArtoSoNoReady = false;
            mediaPlayControlContext3.mReleaseByCustom = true;
        }
        this.mSwitchStreamABId = 0;
        this.mSwitchStreamEnable = true;
        this.mUsingInterface = null;
        this.mPlayScenes = null;
        this.mAudioOnly = false;
        this.mCustomParams.clear();
        this.mPlayExpUtParams.clear();
        this.mControlParams.clear();
        this.mLivePushControlInfo = null;
        this.mDynamicPlayEx = null;
        this.mSwitchScene = null;
        this.mSwitchSceneTime = 0L;
        this.mIsFloat = false;
        this.mEnterVoiceRoom = -1;
    }

    public MediaPlayScreenType screenType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayScreenType) ipChange.ipc$dispatch("10ccfea4", new Object[]{this});
        }
        return this.mVideoScreenType;
    }

    public void setAudioOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a34cd", new Object[]{this, new Boolean(z)});
        } else {
            this.mAudioOnly = z;
        }
    }

    public void setExternSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980fefe", new Object[]{this, surface});
        } else {
            this.mExternSurface = surface;
        }
    }

    public void setHiddenLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c612ea3d", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenLoading = z;
        }
    }

    public void setMediaAspectRatio(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e63654", new Object[]{this, mediaAspectRatio});
        } else {
            this.mAspectRatio = mediaAspectRatio;
        }
    }

    public void setMediaType(MediaType mediaType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb6a3de", new Object[]{this, mediaType});
        } else {
            this.mMediaType = mediaType;
        }
    }

    public void setNeedCloseUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d232e", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedCloseUT = z;
        }
    }

    public void setNeedCommitUserToFirstFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84584bfb", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedCommitUserToFirstFrame = z;
        }
    }

    public void setNeedFirstPlayUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fec5a2", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedFirstPlayUT = z;
        }
    }

    public void setNeedPlayControlView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b4ae57", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedPlayControlView = z;
        }
    }

    public void setPrepareToFirstFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa2e4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mPrepareToFirstFrame = z;
        }
    }

    public void setRID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614ded9c", new Object[]{this, str});
        } else {
            this.mRID = str;
        }
    }

    public void setStartPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f9eac8", new Object[]{this, new Integer(i)});
        } else {
            this.mStartPos = i;
        }
    }

    public void setVideo(jrc jrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cebc2bc", new Object[]{this, jrcVar});
        } else {
            this.mMedia = jrcVar;
        }
    }

    public void setVideoScreenType(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595ab2a1", new Object[]{this, mediaPlayScreenType});
        } else {
            this.mVideoScreenType = mediaPlayScreenType;
        }
    }

    public void setVideoToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bedad1", new Object[]{this, str});
        } else {
            this.mVideoToken = str;
        }
    }

    public void setWarmupFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa34567f", new Object[]{this, new Boolean(z)});
        } else {
            this.mWarmupFlag = z;
        }
    }

    public void setWarmupLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de70ada", new Object[]{this, new Integer(i)});
        } else {
            this.mWarmupLevel = i;
        }
    }

    public void unregisterKeyBackEventListener(krc krcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c47fc3", new Object[]{this, krcVar});
            return;
        }
        sei seiVar = this.mKeyBackController;
        if (seiVar != null) {
            seiVar.d(krcVar);
        }
    }
}
