package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import com.taobao.taobaoavsdk.Tracer.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.a75;
import tb.b75;
import tb.c75;
import tb.ew0;
import tb.g0d;
import tb.ige;
import tb.j75;
import tb.krc;
import tb.ktb;
import tb.l75;
import tb.l95;
import tb.ltb;
import tb.n75;
import tb.p75;
import tb.pge;
import tb.psb;
import tb.q75;
import tb.qsb;
import tb.r65;
import tb.r95;
import tb.sei;
import tb.sge;
import tb.stb;
import tb.t2o;
import tb.t65;
import tb.tge;
import tb.usb;
import tb.utb;
import tb.vtb;
import tb.wge;
import tb.wtb;
import tb.xge;
import tb.zsb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWContext implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SP_KEY_DANMA_SHOWN = "SP_KEY_DANMA_SHOWN";
    private Activity mActivity;
    private boolean mActivityToggleForLandscape;
    public Bitmap mAlbumArtBitamp;
    public BaseAnalysis mAnalysis;
    public Context mApplicationontext;
    public boolean mAudioOnly;
    private t65 mBackCover;
    public String mBackCoverWXUrl;
    public boolean mBackgroundAudio;
    public boolean mBackgroundVideo;
    public String mBusinessType;
    public boolean mCanShowPreviousNextButton;
    public String mCid;
    public psb mConfigAdapter;
    public qsb mConfigParamsAdapter;
    public int mConnectTimeout;
    public String mContentId;
    private Map<String, String> mControlParams;
    private Map<String, String> mCustomParams;
    public stb mDWAlarmAdapter;
    private a75 mDWComponentWrapperManager;
    private c75 mDWConfigObject;
    private j75 mDWDataManager;
    public zsb mDWImageAdapter;
    private r95 mDWToastContainer;
    public boolean mDisableSurfaceView;
    private sei mDwKeyBackController;
    public String mDynamicPlayEx;
    public boolean mEnableSurfaceView;
    private Map<Integer, p75> mEventSubscriberMap;
    private String mFirstRenderOptimize;
    private boolean mFloating;
    private boolean mFloatingToggle;
    public String mFrom;
    private q75 mFrontCover;
    private boolean mFullScreenMode;
    private boolean mGoodsListFullScreenShown;
    public long mGradualVolumeTime;
    private boolean mHardwareAvc;
    public int mHeight;
    public boolean mHiddenGestureView;
    public boolean mHiddenLoading;
    public boolean mHiddenMiniProgressBar;
    public boolean mHiddenNetworkErrorView;
    public boolean mHiddenPlayErrorView;
    public boolean mHiddenPlayingIcon;
    public boolean mHiddenThumbnailPlayBtn;
    public boolean mHiddenToastView;
    public boolean mHideController;
    private boolean mHideNormalGoodsView;
    public boolean mHookKeyBackToggleEvent;
    public Map<String, String> mHttpHeader;
    private ige mIctAddWeexCallback;
    private pge mIctShowWeexCallback;
    private sge mIctTmpCallback;
    private tge mIctUpdateWeexCmpAnchorCallback;
    private xge mIctWXCmpUtilsCallback;
    private wge mIctWXCmpUtilsCallback2;
    public boolean mInVideoDetail;
    private DWVideoScreenType mInitScreenType;
    private DWInstanceType mInstanceType;
    private boolean mInstantSeekingEnable;
    public long mInteractiveId;
    public Map<String, String> mInteractiveParms;
    public boolean mIsFloat;
    private boolean mIsShare;
    public boolean mLoop;
    public HashMap<String, String> mMetaData;
    private boolean mMiniProgressAnchorShown;
    private boolean mMute;
    public boolean mMuteDisplay;
    public int mMuteIconBottomMargin;
    public boolean mMuteIconDisplay;
    public int mMuteIconLeftMargin;
    public int mMuteIconRightMargin;
    public int mMuteIconTopMargin;
    private boolean mNeedAD;
    private boolean mNeedAfterAD;
    private boolean mNeedBackCover;
    private boolean mNeedCloseUT;
    private boolean mNeedCommitUserToFirstFrame;
    private boolean mNeedFirstPlayUT;
    private boolean mNeedFrontCover;
    private boolean mNeedGesture;
    public boolean mNeedLoadingUI;
    private boolean mNeedMSG;
    public boolean mNeedOldPlayerUI;
    public boolean mNeedRequestAudio;
    public boolean mNeedScreenButton;
    public boolean mNeedSmallWindow;
    public boolean mNeedVideoCache;
    public ktb mNetworkAdapter;
    public g0d mNetworkUtilsAdapter;
    public int mNormalHeight;
    public int mNormalWidth;
    private String mOrangeGoodsListShown;
    private String mOrangeReportShown;
    public int mPanoType;
    public boolean mPauseInBackground;
    public MediaPlayControlContext mPlayContext;
    private Map<String, String> mPlayExpUtParams;
    private boolean mPlayRateBtnEnable;
    public String mPlayScenes;
    private String mPlayToken;
    private boolean mPredisPlayInteractiveRightBar;
    private boolean mPrepareToFirstFrame;
    private String mRID;
    public int mReadTimeout;
    private boolean mRecommendVideoOnlyShowFullscreen;
    public boolean mReleaseShortFocusWhenPause;
    private boolean mReportFullScreenShown;
    private boolean mReportShown;
    public int mRetryTime;
    private View mRightBottomIcon;
    private LinearLayout.LayoutParams mRightBottomLp;
    private View mRightUpIcon;
    private LinearLayout.LayoutParams mRightUpLp;
    public String mScene;
    private ArrayList<Boolean> mShowCustomIconOrNotList;
    private boolean mShowGoodsList;
    private boolean mShowInteractive;
    private boolean mShowNotWifiHint;
    public boolean mShowPlayRate;
    private boolean mShowPlayWithCacheHint;
    private boolean mShowWXBackCoverOrNot;
    private String mSourcePageName;
    public int mStartPos;
    private String mStatRemoveList;
    private Surface mSurface;
    public boolean mSwitchFadeIn;
    public String mSwitchScene;
    public long mSwitchSceneTime;
    public float mToastTopMargin;
    public vtb mUTAdapter;
    public boolean mUseAudioCache;
    public boolean mUseShortAudioFocus;
    public long mUserId;
    private utb mUserInfoAdapter;
    public String mUsingInterface;
    private Map<String, String> mUtParams;
    private wtb mVideo;
    private DWAspectRatio mVideoAspectRatio;
    public String mVideoId;
    private DWVideoScreenType mVideoScreenType;
    public String mVideoSource;
    private String mVideoToken;
    private float mVolume;
    public int mWidth;
    private Window mWindow;
    private HashMap<String, Boolean> whiteWeexCmpList;

    static {
        t2o.a(452984838);
        t2o.a(452985056);
    }

    public DWContext(Activity activity) {
        this.mMute = true;
        this.mShowInteractive = true;
        this.whiteWeexCmpList = new HashMap<>();
        this.mShowNotWifiHint = true;
        this.mShowPlayWithCacheHint = true;
        this.mPauseInBackground = false;
        this.mInstanceType = DWInstanceType.VIDEO;
        this.mConnectTimeout = 0;
        this.mReadTimeout = 0;
        this.mRetryTime = 0;
        this.mShowWXBackCoverOrNot = true;
        this.mShowPlayRate = true;
        this.mInteractiveId = -1L;
        this.mUserId = -1L;
        this.mNeedScreenButton = true;
        this.mNeedCloseUT = true;
        this.mNeedFirstPlayUT = true;
        this.mVideoScreenType = DWVideoScreenType.NORMAL;
        this.mFirstRenderOptimize = "true";
        this.mShowGoodsList = true;
        this.mScene = "";
        this.mMuteIconLeftMargin = -1;
        this.mMuteIconRightMargin = -1;
        this.mMuteIconBottomMargin = -1;
        this.mMuteIconTopMargin = -1;
        this.mPanoType = 0;
        this.mDisableSurfaceView = false;
        this.mEnableSurfaceView = false;
        this.mStartPos = 0;
        this.mNeedRequestAudio = true;
        this.mOrangeReportShown = "true";
        this.mOrangeGoodsListShown = "true";
        this.mVideoAspectRatio = DWAspectRatio.DW_FIT_CENTER;
        this.mVolume = Float.valueOf(OrangeConfig.getInstance().getConfig("DWInteractive", "initVolume", "0")).floatValue();
        this.mHttpHeader = null;
        this.mNeedOldPlayerUI = false;
        this.mNeedLoadingUI = false;
        this.mGradualVolumeTime = 0L;
        this.mSwitchFadeIn = false;
        this.mPrepareToFirstFrame = false;
        this.mUseShortAudioFocus = false;
        this.mReleaseShortFocusWhenPause = true;
        this.mActivity = activity;
        this.mDWComponentWrapperManager = new a75();
        this.mDwKeyBackController = new sei(this.mActivity);
        this.mDWDataManager = new j75(this);
        this.mUtParams = new HashMap();
        this.mPlayExpUtParams = new HashMap();
        this.mEventSubscriberMap = new HashMap(8);
        this.mCustomParams = new HashMap();
        this.mControlParams = new HashMap();
        initExtra();
    }

    private void initExtra() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6dfd67", new Object[]{this});
        } else {
            this.mStatRemoveList = OrangeConfig.getInstance().getConfig("DWInteractive", "StatRemoveList", "[\"videoFirstPlay\", \"videoRealPlay\", \"videoClose\", \"videoShow\", \"videoComplete\"]");
        }
    }

    public void addControlParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e2fabc", new Object[]{this, map});
        } else if (map != null) {
            this.mControlParams.putAll(map);
        }
    }

    public void addCustomParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7d0586", new Object[]{this, map});
        } else if (map != null) {
            this.mCustomParams.putAll(map);
        }
    }

    public void addIctAddWeexCallback(ige igeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d9c71", new Object[]{this, igeVar});
        } else {
            this.mIctAddWeexCallback = igeVar;
        }
    }

    public void addIctShowWeexCallback(pge pgeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1661bc7", new Object[]{this, pgeVar});
        } else {
            this.mIctShowWeexCallback = pgeVar;
        }
    }

    public void addIctTempCallback(sge sgeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f13e60", new Object[]{this, sgeVar});
        } else {
            this.mIctTmpCallback = sgeVar;
        }
    }

    public void addIctUpdateWeexCmpAnchorCallback(tge tgeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5297a91", new Object[]{this, tgeVar});
        } else {
            this.mIctUpdateWeexCmpAnchorCallback = tgeVar;
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

    public void addViewToRightInteractiveView(View view, boolean z, LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b6808a", new Object[]{this, view, new Boolean(z), layoutParams});
        } else if (z) {
            this.mRightUpIcon = view;
            this.mRightUpLp = layoutParams;
        } else {
            this.mRightBottomIcon = view;
            this.mRightBottomLp = layoutParams;
        }
    }

    public void bindWindow(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c507bd3", new Object[]{this, window});
            return;
        }
        this.mWindow = window;
        this.mDwKeyBackController.e(window);
    }

    public void clearEventSubscribers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa250805", new Object[]{this});
        } else {
            this.mEventSubscriberMap.clear();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a75 a75Var = this.mDWComponentWrapperManager;
        if (a75Var != null) {
            a75Var.a();
        }
        sei seiVar = this.mDwKeyBackController;
        if (seiVar != null) {
            seiVar.a();
        }
        j75 j75Var = this.mDWDataManager;
        if (j75Var != null) {
            j75Var.B();
        }
        if (this.mEventSubscriberMap != null) {
            clearEventSubscribers();
        }
        this.mDynamicPlayEx = null;
        this.mSwitchScene = null;
        this.mSwitchSceneTime = 0L;
        this.mIsFloat = false;
    }

    public void genPlayToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9e8bbc", new Object[]{this});
            return;
        }
        try {
            if (TextUtils.isEmpty(this.mPlayToken)) {
                if (getUserInfoAdapter() != null) {
                    this.mPlayToken = l95.a(getUserInfoAdapter().getDeviceId());
                } else {
                    this.mPlayToken = System.currentTimeMillis() + "_" + (Math.random() * 100000.0d);
                }
            }
        } catch (Throwable unused) {
            this.mPlayToken = System.currentTimeMillis() + "_";
        }
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.mActivity;
    }

    public t65 getBackCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t65) ipChange.ipc$dispatch("a140c0ed", new Object[]{this});
        }
        return this.mBackCover;
    }

    public String getBackCoverWXUrl() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7091fcc5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mBackCoverWXUrl)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mBackCoverWXUrl);
        sb.append("&isShare=");
        if (this.mIsShare) {
            str = "1";
        } else {
            str = "0";
        }
        sb.append(str);
        return sb.toString();
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

    public a75 getDWComponentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a75) ipChange.ipc$dispatch("d5c940dd", new Object[]{this});
        }
        return this.mDWComponentWrapperManager;
    }

    public a75 getDWComponentWrapperManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a75) ipChange.ipc$dispatch("6826eaa8", new Object[]{this});
        }
        return this.mDWComponentWrapperManager;
    }

    public c75 getDWConfigObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c75) ipChange.ipc$dispatch("951dcdb5", new Object[]{this});
        }
        return this.mDWConfigObject;
    }

    public usb getDWEventAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (usb) ipChange.ipc$dispatch("3b46bad", new Object[]{this});
        }
        return r65.f27136a;
    }

    public Surface getExternSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("11eb1424", new Object[]{this});
        }
        return this.mSurface;
    }

    public q75 getFrontCoverData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q75) ipChange.ipc$dispatch("4ff6689", new Object[]{this});
        }
        return this.mFrontCover;
    }

    public boolean getFullScreenMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5c579f", new Object[]{this})).booleanValue();
        }
        return this.mFullScreenMode;
    }

    public boolean getGoodsListFullScreenShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bcf2443", new Object[]{this})).booleanValue();
        }
        return this.mGoodsListFullScreenShown;
    }

    public boolean getHideNormalGoodsView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff3d83a7", new Object[]{this})).booleanValue();
        }
        return this.mHideNormalGoodsView;
    }

    public ige getIctAddWeexCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ige) ipChange.ipc$dispatch("a5e8e2e8", new Object[]{this});
        }
        return this.mIctAddWeexCallback;
    }

    public pge getIctShowWeexCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pge) ipChange.ipc$dispatch("c0cd3588", new Object[]{this});
        }
        return this.mIctShowWeexCallback;
    }

    public sge getIctTmpCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sge) ipChange.ipc$dispatch("b42d143e", new Object[]{this});
        }
        return this.mIctTmpCallback;
    }

    public tge getIctUpdateWeexCmpAnchorCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tge) ipChange.ipc$dispatch("fc72fdca", new Object[]{this});
        }
        return this.mIctUpdateWeexCmpAnchorCallback;
    }

    public DWVideoScreenType getInitScreenType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType) ipChange.ipc$dispatch("64e72b5c", new Object[]{this});
        }
        return this.mInitScreenType;
    }

    public DWInstanceType getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstanceType) ipChange.ipc$dispatch("43ddfe31", new Object[]{this});
        }
        return this.mInstanceType;
    }

    public boolean getNeedCommitUserToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f3055f1", new Object[]{this})).booleanValue();
        }
        return this.mNeedCommitUserToFirstFrame;
    }

    public boolean getNeedGesture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d3eca8", new Object[]{this})).booleanValue();
        }
        return this.mNeedGesture;
    }

    public boolean getNeedMSG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2ea20e0", new Object[]{this})).booleanValue();
        }
        return this.mNeedMSG;
    }

    public String getOrangeGoodsListShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f606f8", new Object[]{this});
        }
        return this.mOrangeGoodsListShown;
    }

    public String getOrangeReportShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29c50420", new Object[]{this});
        }
        return this.mOrangeReportShown;
    }

    public String getPanoTyeStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0173b00", new Object[]{this});
        }
        int i = this.mPanoType;
        if (i == 1) {
            return "ERP";
        }
        if (i == 2) {
            return "EAC";
        }
        return "";
    }

    public Map<String, String> getPlayExpUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66adc894", new Object[]{this});
        }
        return this.mPlayExpUtParams;
    }

    public String getPlayToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
        }
        return this.mPlayToken;
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

    public boolean getRecommendVideoOnlyShowFullscreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12175064", new Object[]{this})).booleanValue();
        }
        return this.mRecommendVideoOnlyShowFullscreen;
    }

    public boolean getReportFullScreenShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("320ff2f7", new Object[]{this})).booleanValue();
        }
        return this.mReportFullScreenShown;
    }

    public ArrayList<Boolean> getShowCustomIconOrNotList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("892eefb2", new Object[]{this});
        }
        return this.mShowCustomIconOrNotList;
    }

    public boolean getShowNotWifiHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f481047", new Object[]{this})).booleanValue();
        }
        return this.mShowNotWifiHint;
    }

    public boolean getShowPlayWithCacheHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82016f87", new Object[]{this})).booleanValue();
        }
        return this.mShowPlayWithCacheHint;
    }

    public boolean getShowWXBackCoverOrNot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aabe39ff", new Object[]{this})).booleanValue();
        }
        return this.mShowWXBackCoverOrNot;
    }

    public String getSourcePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9611fee", new Object[]{this});
        }
        return this.mSourcePageName;
    }

    public Map<String, String> getUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d81bf417", new Object[]{this});
        }
        return this.mUtParams;
    }

    public utb getUserInfoAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utb) ipChange.ipc$dispatch("29934660", new Object[]{this});
        }
        return this.mUserInfoAdapter;
    }

    public wtb getVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wtb) ipChange.ipc$dispatch("14431f54", new Object[]{this});
        }
        return this.mVideo;
    }

    public DWAspectRatio getVideoAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("21c49cc", new Object[]{this});
        }
        return this.mVideoAspectRatio;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return this.mVideoId;
    }

    public String getVideoSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("534d0fb9", new Object[]{this});
        }
        return this.mVideoSource;
    }

    public String getVideoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        return this.mVideoToken;
    }

    public float getVolume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91a40687", new Object[]{this})).floatValue();
        }
        return this.mVolume;
    }

    public xge getWXCmpUtilsCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xge) ipChange.ipc$dispatch("285591ba", new Object[]{this});
        }
        return this.mIctWXCmpUtilsCallback;
    }

    public wge getWXCmpUtilsCallback2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wge) ipChange.ipc$dispatch("f2c9a1a6", new Object[]{this});
        }
        return this.mIctWXCmpUtilsCallback2;
    }

    public Map<String, Boolean> getWhiteWeexCmpList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ccda61cc", new Object[]{this});
        }
        return Collections.unmodifiableMap(this.whiteWeexCmpList);
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
        } else {
            this.mDwKeyBackController.b();
        }
    }

    public void hideControllerView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc697eca", new Object[]{this, new Boolean(z)});
        } else {
            this.mHideController = z;
        }
    }

    public boolean isActivityToggleForLandscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9766f8aa", new Object[]{this})).booleanValue();
        }
        return this.mActivityToggleForLandscape;
    }

    public boolean isFirstRenderOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a947e3e4", new Object[]{this})).booleanValue();
        }
        return "true".equalsIgnoreCase(this.mFirstRenderOptimize);
    }

    public boolean isFloating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53950bdb", new Object[]{this})).booleanValue();
        }
        return this.mFloating;
    }

    public boolean isFloatingToggle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad611d4f", new Object[]{this})).booleanValue();
        }
        return this.mFloatingToggle;
    }

    public boolean isHiddenGestureView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("910c1f05", new Object[]{this})).booleanValue();
        }
        return this.mHiddenGestureView;
    }

    public boolean isHiddenLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eee90fb3", new Object[]{this})).booleanValue();
        }
        return this.mHiddenLoading;
    }

    public boolean isHiddenMiniProgressBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211aec6", new Object[]{this})).booleanValue();
        }
        return this.mHiddenMiniProgressBar;
    }

    public boolean isHiddenNetworkErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee7264de", new Object[]{this})).booleanValue();
        }
        return this.mHiddenNetworkErrorView;
    }

    public boolean isHiddenPlayErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e76a12f0", new Object[]{this})).booleanValue();
        }
        return this.mHiddenPlayErrorView;
    }

    public boolean isHiddenPlayingIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("317cd4be", new Object[]{this})).booleanValue();
        }
        return this.mHiddenPlayingIcon;
    }

    public boolean isHiddenThumbnailPlayBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f78c1b", new Object[]{this})).booleanValue();
        }
        return this.mHiddenThumbnailPlayBtn;
    }

    public boolean isHiddenToastView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2024e3", new Object[]{this})).booleanValue();
        }
        return this.mHiddenToastView;
    }

    public boolean isHideController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b319ad3", new Object[]{this})).booleanValue();
        }
        return this.mHideController;
    }

    public boolean isInstantSeekingEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d2e7201", new Object[]{this})).booleanValue();
        }
        return this.mInstantSeekingEnable;
    }

    public boolean isMiniProgressAnchorShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55be1a19", new Object[]{this})).booleanValue();
        }
        return this.mMiniProgressAnchorShown;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        return this.mMute;
    }

    public boolean isNeedBackCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed878a9b", new Object[]{this})).booleanValue();
        }
        return this.mNeedBackCover;
    }

    public boolean isNeedFrontCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c956d99", new Object[]{this})).booleanValue();
        }
        return this.mNeedFrontCover;
    }

    public boolean isNeedSmallWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24ff3e2", new Object[]{this})).booleanValue();
        }
        return this.mNeedSmallWindow;
    }

    public boolean isPlayRateBtnEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59bf1b2c", new Object[]{this})).booleanValue();
        }
        return this.mPlayRateBtnEnable;
    }

    public boolean isShowInteractive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2753bc26", new Object[]{this})).booleanValue();
        }
        return this.mShowInteractive;
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.mMute = z;
        }
    }

    public boolean needAD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f130344", new Object[]{this})).booleanValue();
        }
        return this.mNeedAD;
    }

    public boolean needAfterAD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2350f994", new Object[]{this})).booleanValue();
        }
        return this.mNeedAfterAD;
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

    public boolean needPredisplayInteractiveRightBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73f8b7af", new Object[]{this})).booleanValue();
        }
        return this.mPredisPlayInteractiveRightBar;
    }

    public boolean needRequestFrontCoverData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f72e515c", new Object[]{this})).booleanValue();
        }
        if (!this.mNeedFrontCover || this.mFrontCover != null) {
            return false;
        }
        return true;
    }

    public synchronized void post(l75 l75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e62c52e", new Object[]{this, l75Var});
        } else {
            post(l75Var, null);
        }
    }

    public void predisplayInteractiveRightBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf5d5a1", new Object[]{this});
        } else {
            this.mPredisPlayInteractiveRightBar = true;
        }
    }

    public void queryBackCoverData(ltb ltbVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec225073", new Object[]{this, ltbVar, map, new Boolean(z)});
        } else {
            this.mDWDataManager.D(ltbVar, map, z);
        }
    }

    public void queryConfigData(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9d57d2", new Object[]{this, ltbVar, new Boolean(z)});
        } else {
            this.mDWDataManager.E(ltbVar, z);
        }
    }

    public void queryInteractiveData(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592266a2", new Object[]{this, ltbVar, new Boolean(z)});
        } else {
            this.mDWDataManager.F(ltbVar, z);
        }
    }

    public void queryInteractiveDataFromHiv(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2605ba85", new Object[]{this, ltbVar, new Boolean(z)});
        } else {
            this.mDWDataManager.G(ltbVar, z);
        }
    }

    public void queryVideoConfigData(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37a265d", new Object[]{this, ltbVar, new Boolean(z)});
        } else {
            this.mDWDataManager.H(ltbVar, z);
        }
    }

    public void queryVideoConfigData2(ltb ltbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d86671", new Object[]{this, ltbVar, new Boolean(z)});
        } else {
            this.mDWDataManager.I(ltbVar, z);
        }
    }

    public void registerKeyBackEventListener(krc krcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c0b2a", new Object[]{this, krcVar});
        } else {
            this.mDwKeyBackController.c(krcVar);
        }
    }

    public synchronized void registerSubscriber(l75 l75Var, p75 p75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e9f2ca", new Object[]{this, l75Var, p75Var});
        } else {
            this.mEventSubscriberMap.put(Integer.valueOf(l75Var.getEventId()), p75Var);
        }
    }

    public DWVideoScreenType screenType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType) ipChange.ipc$dispatch("f79d40b6", new Object[]{this});
        }
        return this.mVideoScreenType;
    }

    public void sendTaokeRequest(Map<String, String> map, ltb ltbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2519779a", new Object[]{this, map, ltbVar});
        } else {
            this.mDWDataManager.L(map, ltbVar);
        }
    }

    public void setActivityToggleForLandscape(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8f38b6", new Object[]{this, new Boolean(z)});
        } else {
            this.mActivityToggleForLandscape = z;
        }
    }

    public void setBackCoverWXUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b279bd51", new Object[]{this, str});
        } else {
            this.mBackCoverWXUrl = str;
        }
    }

    public void setBacktCover(t65 t65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5855d2eb", new Object[]{this, t65Var});
        } else {
            this.mBackCover = t65Var;
        }
    }

    public void setDWConfigObject(c75 c75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8d577", new Object[]{this, c75Var});
        } else {
            this.mDWConfigObject = c75Var;
        }
    }

    public void setDWToastContainer(r95 r95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c3533f", new Object[]{this, r95Var});
        } else {
            this.mDWToastContainer = r95Var;
        }
    }

    public void setExternSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980fefe", new Object[]{this, surface});
        } else {
            this.mSurface = surface;
        }
    }

    public void setFloating(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee03eda5", new Object[]{this, new Boolean(z)});
        } else {
            this.mFloating = z;
        }
    }

    public void setFloatingToggle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221414b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mFloatingToggle = z;
        }
    }

    public void setFrontCoverData(q75 q75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d06bc9", new Object[]{this, q75Var});
        } else {
            this.mFrontCover = q75Var;
        }
    }

    public void setFullScreenMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c740e0d", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullScreenMode = z;
        }
    }

    public void setGoodsListFullScreenShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05914e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mGoodsListFullScreenShown = z;
        }
    }

    public void setHiddenGestureView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c56692b", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenGestureView = z;
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

    public void setHiddenMiniProgressBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4515758a", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenMiniProgressBar = z;
        }
    }

    public void setHiddenNetworkErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fd7702", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenNetworkErrorView = z;
        }
    }

    public void setHiddenPlayErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420e84a0", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenPlayErrorView = z;
        }
    }

    public void setHiddenThumbnailPlayBtn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251d3765", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenThumbnailPlayBtn = z;
        }
    }

    public void setHiddenToastView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faf0d0d", new Object[]{this, new Boolean(z)});
        } else {
            this.mHiddenToastView = z;
        }
    }

    public void setHideNormalGoodsView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98406c9d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mHideNormalGoodsView = z;
        setShowGoodsList(false);
    }

    public void setInitScreenType(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c426d1a", new Object[]{this, dWVideoScreenType});
        } else {
            this.mInitScreenType = dWVideoScreenType;
        }
    }

    public void setInstanceType(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
        } else {
            this.mInstanceType = dWInstanceType;
        }
    }

    public void setInstantSeekingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31be03f", new Object[]{this, new Boolean(z)});
            return;
        }
        psb psbVar = this.mConfigAdapter;
        if (psbVar == null || ((b75) psbVar).a()) {
            this.mInstantSeekingEnable = z;
        }
    }

    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoop = z;
        }
    }

    public void setMiniProgressAnchorShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed350697", new Object[]{this, new Boolean(z)});
        } else {
            this.mMiniProgressAnchorShown = z;
        }
    }

    public void setNeedAD(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c389d1d2", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAD = z;
        }
    }

    public void setNeedAfterAD(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a3e7c6", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAfterAD = z;
        }
    }

    public void setNeedBackCover(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b43cc55", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedBackCover = z;
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

    public void setNeedFrontCover(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9969cda7", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedFrontCover = z;
        }
    }

    public void setNeedGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a6efbc", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedGesture = z;
        }
    }

    public void setNeedMSG(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a3a884", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedMSG = z;
        }
    }

    public void setNeedSmallWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e791dee", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedSmallWindow = z;
        }
    }

    public void setPauseInBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
        } else {
            this.mPauseInBackground = z;
        }
    }

    public void setPlayRateBtnEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a02f1e4", new Object[]{this, new Boolean(z)});
            return;
        }
        psb psbVar = this.mConfigAdapter;
        if (psbVar == null || ((b75) psbVar).b()) {
            this.mPlayRateBtnEnable = z;
        }
    }

    public void setPlayScenes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.mPlayScenes = str;
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

    public void setRecommendVideoOnlyShowFullscreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463ab8e8", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendVideoOnlyShowFullscreen = z;
        }
    }

    public void setReportFullScreenShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffadd44d", new Object[]{this, new Boolean(z)});
        } else {
            this.mReportFullScreenShown = z;
        }
    }

    public void setReportShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284f992", new Object[]{this, new Boolean(z)});
        } else {
            this.mReportShown = z;
        }
    }

    public void setShowCustomIconOrNotList(ArrayList<Boolean> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f04f6dde", new Object[]{this, arrayList});
        } else if (arrayList != null) {
            ArrayList<Boolean> arrayList2 = this.mShowCustomIconOrNotList;
            if (arrayList2 == null) {
                this.mShowCustomIconOrNotList = new ArrayList<>();
            } else {
                arrayList2.clear();
            }
            Iterator<Boolean> it = arrayList.iterator();
            while (it.hasNext()) {
                Boolean next = it.next();
                next.booleanValue();
                this.mShowCustomIconOrNotList.add(next);
            }
        } else {
            this.mShowCustomIconOrNotList = null;
        }
    }

    public void setShowGoodsList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a436f8", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowGoodsList = z;
        }
    }

    public void setShowNotWifiHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140dd9fd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowNotWifiHint = z;
        }
    }

    public void setShowPlayWithCacheHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adebe9bd", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowPlayWithCacheHint = z;
        }
    }

    public void setSourcePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338eff48", new Object[]{this, str});
        } else {
            this.mSourcePageName = str;
        }
    }

    public void setTaowaIsShare(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b85342", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsShare = z;
        }
    }

    public void setUserInfoAdapter(utb utbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b58e", new Object[]{this, utbVar});
        } else {
            this.mUserInfoAdapter = utbVar;
        }
    }

    public void setVideo(wtb wtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da7e78a", new Object[]{this, wtbVar});
        } else {
            this.mVideo = wtbVar;
        }
    }

    public void setVideoAspectRatio(DWAspectRatio dWAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89072586", new Object[]{this, dWAspectRatio});
        } else {
            this.mVideoAspectRatio = dWAspectRatio;
        }
    }

    public void setVideoScreenType(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9049c6d3", new Object[]{this, dWVideoScreenType});
        } else {
            this.mVideoScreenType = dWVideoScreenType;
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

    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else {
            this.mVolume = f;
        }
    }

    public void setWXCmpUtilsCallback(xge xgeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c82c762", new Object[]{this, xgeVar});
        } else {
            this.mIctWXCmpUtilsCallback = xgeVar;
        }
    }

    public void setWXCmpUtilsCallback2(wge wgeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb6bbe8", new Object[]{this, wgeVar});
        } else {
            this.mIctWXCmpUtilsCallback2 = wgeVar;
        }
    }

    public void showInteractive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cf72a8", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowInteractive = z;
        }
    }

    public void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else if (this.mDWToastContainer != null && !TextUtils.isEmpty(str) && !isHiddenToastView()) {
            this.mDWToastContainer.c(str, this.mToastTopMargin);
        }
    }

    public void showWXBackCoverOrNot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db841aef", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowWXBackCoverOrNot = z;
        }
    }

    public void showWeexLayer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fac438", new Object[]{this, view});
            return;
        }
        r95 r95Var = this.mDWToastContainer;
        if (r95Var != null) {
            r95Var.b(view);
        }
    }

    public boolean statInRemoveList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53ae310", new Object[]{this, str})).booleanValue();
        }
        return ew0.n(str, this.mStatRemoveList);
    }

    public void unbindWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c058f6d", new Object[]{this});
            return;
        }
        this.mWindow = null;
        this.mDwKeyBackController.f();
    }

    public void unregisterKeyBackEventListener(krc krcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c47fc3", new Object[]{this, krcVar});
        } else {
            this.mDwKeyBackController.d(krcVar);
        }
    }

    public synchronized void unregisterSubscriber(l75 l75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e911fb8a", new Object[]{this, l75Var});
        } else {
            this.mEventSubscriberMap.remove(Integer.valueOf(l75Var.getEventId()));
        }
    }

    public boolean getReportShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c25012", new Object[]{this})).booleanValue();
        }
        if (this.mConfigAdapter != null) {
            if ("true".equals(this.mOrangeReportShown)) {
                return this.mReportShown;
            }
            if ("false".equals(this.mOrangeReportShown)) {
                return false;
            }
        }
        return this.mReportShown;
    }

    public boolean getShowGoodsList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df35aec", new Object[]{this})).booleanValue();
        }
        if (this.mConfigAdapter != null) {
            if ("true".equals(this.mOrangeGoodsListShown)) {
                return this.mShowGoodsList;
            }
            if ("false".equals(this.mOrangeGoodsListShown)) {
                return false;
            }
        }
        return this.mShowGoodsList;
    }

    public synchronized void post(l75 l75Var, n75 n75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4393ce42", new Object[]{this, l75Var, n75Var});
            return;
        }
        if (this.mEventSubscriberMap.containsKey(Integer.valueOf(l75Var.getEventId()))) {
            this.mEventSubscriberMap.get(Integer.valueOf(l75Var.getEventId())).a(l75Var, n75Var);
        }
    }

    public DWContext(Activity activity, boolean z) {
        this.mMute = true;
        this.mShowInteractive = true;
        this.whiteWeexCmpList = new HashMap<>();
        this.mShowNotWifiHint = true;
        this.mShowPlayWithCacheHint = true;
        this.mPauseInBackground = false;
        this.mInstanceType = DWInstanceType.VIDEO;
        this.mConnectTimeout = 0;
        this.mReadTimeout = 0;
        this.mRetryTime = 0;
        this.mShowWXBackCoverOrNot = true;
        this.mShowPlayRate = true;
        this.mInteractiveId = -1L;
        this.mUserId = -1L;
        this.mNeedScreenButton = true;
        this.mNeedCloseUT = true;
        this.mNeedFirstPlayUT = true;
        this.mVideoScreenType = DWVideoScreenType.NORMAL;
        this.mFirstRenderOptimize = "true";
        this.mShowGoodsList = true;
        this.mScene = "";
        this.mMuteIconLeftMargin = -1;
        this.mMuteIconRightMargin = -1;
        this.mMuteIconBottomMargin = -1;
        this.mMuteIconTopMargin = -1;
        this.mPanoType = 0;
        this.mDisableSurfaceView = false;
        this.mEnableSurfaceView = false;
        this.mStartPos = 0;
        this.mNeedRequestAudio = true;
        this.mOrangeReportShown = "true";
        this.mOrangeGoodsListShown = "true";
        this.mVideoAspectRatio = DWAspectRatio.DW_FIT_CENTER;
        this.mVolume = Float.valueOf(OrangeConfig.getInstance().getConfig("DWInteractive", "initVolume", "0")).floatValue();
        this.mHttpHeader = null;
        this.mNeedOldPlayerUI = false;
        this.mNeedLoadingUI = false;
        this.mGradualVolumeTime = 0L;
        this.mSwitchFadeIn = false;
        this.mPrepareToFirstFrame = false;
        this.mUseShortAudioFocus = false;
        this.mReleaseShortFocusWhenPause = true;
        this.mActivity = activity;
        this.mDwKeyBackController = new sei(this.mActivity);
        this.mDWDataManager = new j75(this);
        this.mUtParams = new HashMap();
        this.mPlayExpUtParams = new HashMap();
        this.mCustomParams = new HashMap();
        this.mControlParams = new HashMap();
        this.mAnalysis = new c();
        initExtra();
    }
}
