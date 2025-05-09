package tv.danmaku.ijk.media.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.LogPrinter;
import android.view.Surface;
import android.widget.Toast;
import anet.channel.strategy.HttpDnsAdapter;
import anet.channel.util.HttpConstant;
import anet.channel.util.Inet64Util;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.taobao.application.common.IApmEventListener;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.H264AuthenStrategy;
import com.taobao.mediaplay.H265AuthenStrategy;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import dt.a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.a7m;
import tb.atb;
import tb.bli;
import tb.c21;
import tb.c2v;
import tb.ct6;
import tb.e2n;
import tb.ew0;
import tb.f0;
import tb.f7l;
import tb.feh;
import tb.g0d;
import tb.gf4;
import tb.gov;
import tb.ied;
import tb.ja1;
import tb.nj9;
import tb.oxw;
import tb.pgi;
import tb.prp;
import tb.r7t;
import tb.t2o;
import tb.t7b;
import tb.tfb;
import tb.uyv;
import tb.vu3;
import tb.wei;
import tb.wua;
import tb.x3r;
import tb.yj4;
import tb.z5r;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class MonitorMediaPlayer extends a {
    private static final int CACHE_REASON_CACHE_KEY = 1;
    private static final int CACHE_REASON_OTHER = 99;
    private static final int CACHE_REASON_UNKNOWN = 0;
    private static final int CACHE_REASON_URL = 2;
    public static final String DEFAULT_NO_TRAFFIC_HOST = "";
    public static final int FFP_PROP_INT64_IS_LOCALHOST = 11405;
    public static final String HTTPDNS_IPV6_TOTAL_DISABLE = "disableTotalHttpDnsIPV6";
    public static final String LIVE_BACKUP_CDNIP_ENABLE = "LiveBackupCDNIpEnable";
    public static final int MAX_EVENT_NUM = 30;
    public static final int MAX_RTC_ABR_REASON_NUM = 80;
    public static final String MUSIC_URL_CACHE_BLACK_BIZCODE = "musicUrlCacheBlackFromList";
    public static final String MUSIC_URL_CACHE_BLACK_URL = "musicUrlCacheBlackUrlList";
    public static final String MUSIC_URL_CACHE_CONFIG = "musicUrlCacheConfig";
    public static final String MUSIC_URL_CACHE_ENABLE_FORCE = "enMusicUrlCacheForce";
    public static final String MUSIC_URL_CACHE_PATTERN = "musicUrlCachePattern";
    public static final String MornitorBufferingNew = "stalled";
    private static final int NET_UNUSE_PROXY_BY_CONTROL = 8;
    private static final int NET_UNUSE_PROXY_CONFIG_LIVE = 3;
    private static final int NET_UNUSE_PROXY_CONFIG_NULL = 2;
    private static final int NET_UNUSE_PROXY_FORMAT_ERROR = 5;
    private static final int NET_UNUSE_PROXY_FORMAT_HTTP_ERROR = 6;
    private static final int NET_UNUSE_PROXY_PROXTFAILED = 1;
    private static final int NET_UNUSE_PROXY_TIMEOUT_ERROR_CODE = 7;
    private static final int NET_UNUSE_PROXY_UNKNOWN = 0;
    private static final int NET_UNUSE_PROXY_URL_NULL = 4;
    public static final String ORANGE_DISABLE_HDR_TO_SDR_DEVICE_LIST = "disableHdrToSdrDevices";
    public static final String ORANGE_DYNAMIC_CHECK_VIDEO_CHANGE_SBT_WHITE_LIST = "dynamicCheckVideoChangeSbtWhiteList";
    public static final String ORANGE_DYNAMIC_CHECK_VIDEO_CHNAGE = "dynamicCheckVideoChange";
    public static final String ORANGE_ENABLE_HDR_TO_SDR = "enableHdrToSdr";
    public static final String ORANGE_ENABLE_PLAYBACK_FALLBACK_TO_ST = "enableFallbackToST";
    public static final String ORANGE_ENABLE_USE_SOUND_TOUCH_LIST = "useSTList";
    public static final String ORANGE_ENABLE_VF_PLUGIN_LIVE = "enableVfPluginList";
    public static final String ORANGE_ENABLE_VPM = "VPMEnabled";
    public static final String ORANGE_ENABLE_VPM_HEARTBEAT_REPORT_SUB_BUSINESS_WHITE_LIST = "VPMHeartBeatReportSubBusinessWhiteList";
    public static final String ORANGE_USE_EVENTID_19997 = "useEventId19997";
    public static final String ORANGE_VPM_ADAPTER_COLLECT_V_TWO_API = "VPMCollectNewApiSupport";
    public static final String ORANGE_VPM_HEARTBEAT_PLAY_SCENARIO_BLACK_LIST = "VPMHeartBeatPlayScenarioBlackList";
    public static final String ORANGE_VPM_HEARTBEAT_REPORT_PLAY_SCENARIOBLACKLIST = "VPMHeartBeatReportPlayScenarioBlackList";
    public static final String ORANGE_VPM_HEARTBEAT_SUB_BUSINESS_BLACK_LIST = "VPMHeartBeatSubBusinessBlackList";
    public static final String ORANGE_VPM_SUMMARY_SUB_BUSINESS_BLACK_LIST = "VPMSummarySubBusinessBlackList";
    public static final int PLAYER_AUDIO_OFF = 25;
    public static final int PLAYER_AUDIO_ON = 26;
    public static final int PLAYER_EVENT_CODEC_PARAM_CHANGED = 35;
    public static final int PLAYER_EVENT_COMPLETE = 6;
    public static final int PLAYER_EVENT_ERROR = 7;
    public static final int PLAYER_EVENT_FIRST_RENDER = 8;
    public static final int PLAYER_EVENT_NEW_AUDIO_OFF = 15;
    public static final int PLAYER_EVENT_NEW_AUDIO_ON = 14;
    public static final int PLAYER_EVENT_NEW_AUDIO_RENDER = 4;
    public static final int PLAYER_EVENT_NEW_COMPLETE = 10;
    public static final int PLAYER_EVENT_NEW_ERROR = 13;
    public static final int PLAYER_EVENT_NEW_FATAL_ERROR_SYNC_END = 24;
    public static final int PLAYER_EVENT_NEW_FATAL_ERROR_SYNC_START = 23;
    public static final int PLAYER_EVENT_NEW_PAUSE = 7;
    public static final int PLAYER_EVENT_NEW_PREPARED = 2;
    public static final int PLAYER_EVENT_NEW_RELEASE = 6;
    public static final int PLAYER_EVENT_NEW_RESOLUTION_CHANGED = 19;
    public static final int PLAYER_EVENT_NEW_SEAMLESS_SWITCH = 20;
    public static final int PLAYER_EVENT_NEW_SEAMLESS_SWITCH_FAILED = 22;
    public static final int PLAYER_EVENT_NEW_SEAMLESS_SWITCH_SUCC = 21;
    public static final int PLAYER_EVENT_NEW_SEEK_FINISH = 9;
    public static final int PLAYER_EVENT_NEW_SEEK_START = 8;
    public static final int PLAYER_EVENT_NEW_STALLED = 11;
    public static final int PLAYER_EVENT_NEW_STALL_FINISH = 12;
    public static final int PLAYER_EVENT_NEW_START = 3;
    public static final int PLAYER_EVENT_NEW_START_INIT = 1;
    public static final int PLAYER_EVENT_NEW_SWITCH = 16;
    public static final int PLAYER_EVENT_NEW_SWITCH_FAILED = 18;
    public static final int PLAYER_EVENT_NEW_SWITCH_SUCC = 17;
    public static final int PLAYER_EVENT_NEW_VIDEO_RENDER = 5;
    public static final int PLAYER_EVENT_PAUSE = 3;
    public static final int PLAYER_EVENT_PLAYING = 10;
    public static final int PLAYER_EVENT_PREPARED = 1;
    public static final int PLAYER_EVENT_SEEK = 5;
    public static final int PLAYER_EVENT_STALLED = 4;
    public static final int PLAYER_EVENT_START = 2;
    public static final int PLAYER_EVENT_SWITCH_FAIL = 31;
    public static final int PLAYER_EVENT_SWITCH_SUCC = 30;
    public static final int PLAYER_EVENT_TRIGGER_SWITCH_BY_RTC = 41;
    public static final int PLAYER_EVENT_VIDEO_BUFFER_STALL = 40;
    public static final int PLAYER_EVENT_VIDEO_RENDER_STALLED = 9;
    protected static final int RTCLIVE_SWITCH_STATUS_END = 1;
    protected static final int RTCLIVE_SWITCH_STATUS_START = 0;
    public static final String RTCSTREAM_MAIDIAN_DETAIL = "RtcStreamStats_Detail";
    public static final String RTCSTREAM_MAIDIAN_DOUDI = "RtcStreamStats_Degrade";
    public static final String RTCSTREAM_MAIDIAN_INFO = "RtcStreamStats_Info";
    public static final int SPEED_STATUS_NORMAL_PLAY = 0;
    public static final int SPEED_STATUS_QUICK_PLAY = 2;
    public static final int SPEED_STATUS_SLOW_PLAY = 1;
    public static final int STALL_REASON_DELAY = 1;
    public static final int STALL_REASON_FRAME_OUT_OF_ORDER = 4;
    public static final int STALL_REASON_INTERVAL = 2;
    public static final int STALL_REASON_STATE_CHANGE = 3;
    public static final int STALL_REASON_STATE_CHANGE_REASON_1 = 0;
    public static final int STALL_REASON_STATE_CHANGE_REASON_2 = 1;
    public static final int STALL_REASON_STATE_CHANGE_REASON_3 = 2;
    public static final int STALL_REASON_STATE_CHANGE_REASON_END = 3;
    public static final int STALL_REASON_STATE_CHANGE_REASON_START = 0;
    public static final int STALL_REASON_UNDEFINED = 0;
    public static final String VIDEO_CACHE_BLACK = "videoCacheBlackList";
    public static final String VIDEO_CACHE_ENABLE = "videoCacheEnable3";
    public static final String VIDEO_CLIP_CDNIP_ENABLE = "videoClipCDNIpEnable3";
    private static final String VIDEO_RESOLUTION_1080P = "1080p";
    private static final String VIDEO_RESOLUTION_2k = "2k";
    private static final String VIDEO_RESOLUTION_360P = "360p";
    private static final String VIDEO_RESOLUTION_540P = "540p";
    private static final String VIDEO_RESOLUTION_720P = "720p";
    private static final String VIDEO_RESOLUTION_over2k = "over2k";
    public static final String VIDEO_URL_CACHE_BLACK_BIZCODE = "videoUrlCacheBlackFromList";
    public static final String VIDEO_URL_CACHE_BLACK_URL = "videoUrlCacheBlackUrlList";
    public static final String VIDEO_URL_CACHE_CONFIG = "videoUrlCacheConfig";
    private static final int WATCH_MESSAGE_ID = 100;
    static String mOutputSampleRate = null;
    private static final int maxCongestBuffer = 1000;
    public static final String mornitorPlayerError = "playerError";
    protected String AppMonitor_Module;
    private final long MIN_FRAME_COUNT_IN_DELAY_STATE;
    private final long MIN_TIME_IN_DELAY_STATE;
    protected final long TIME_OF_COMMIT_FETCH_SO;
    private final long UNINITIALIZED_MIN_VAL;
    protected boolean bFirstFrameRendered;
    protected boolean bIgnoreAbnormalAfterVideoComplete;
    public boolean bInitEglError;
    protected boolean bInstantSeeked;
    protected volatile boolean bIsCompleteHitCache;
    protected volatile boolean bLooping;
    public boolean bMediacodeError;
    public boolean bNeedCommitPlayExperience;
    protected boolean bPauseInBackground;
    protected volatile boolean bPaused;
    protected boolean bSecondFrameRendered;
    protected boolean bSeeked;
    protected volatile boolean bUseVideoCache;
    protected volatile long duplicateFrameCount;
    private String end2endDelay;
    protected long firstStalledCount;
    protected long firstStalledPlayTime;
    int index;
    private boolean isFirstFrameRendered;
    protected int mAbIdOfSyncAfterSeek;
    protected f0 mAbTestAdapter;
    protected long mAbnormalPlayDuration;
    protected int mAbnormalPlayFrameCount;
    protected float mAbnormalPlaySpeedThreshold;
    private ct6 mActiveDataSource;
    protected volatile boolean mAlwaysFrontgroundPlay;
    protected boolean mAlwaysMutePlay;
    public BaseAnalysis mAnalysis;
    protected IApmEventListener mApmEventListener;
    protected long mArtcAbrRedundantRequestSwitchDownCount;
    protected long mArtcAbrRedundantRequestSwitchUpCount;
    protected long mArtcAbrRequestSwitchDownCount;
    protected long mArtcAbrRequestSwitchUpCount;
    protected long mArtcAbrSwitchDownCount;
    protected long mArtcAbrSwitchUpCount;
    protected long mArtcAbrTotalRequestSwitchDownCount;
    protected long mArtcAbrTotalRequestSwitchUpCount;
    protected long mArtcFirstAbrSwitchTime;
    protected long mArtcSwitchCount;
    protected long mArtcSwitchDownCount;
    protected long mArtcSwitchDownSucCount;
    protected long mArtcSwitchDownSucTotalTime;
    protected long mArtcSwitchDownSyncErrCount;
    protected long mArtcSwitchDownSyncSucCount;
    protected long mArtcSwitchDownTsDelta;
    protected long mArtcSwitchSucCount;
    protected long mArtcSwitchSucTotalTime;
    protected long mArtcSwitchUpCount;
    protected long mArtcSwitchUpSucCount;
    protected long mArtcSwitchUpSucTotalTime;
    protected long mArtcSwitchUpSyncErrCount;
    protected long mArtcSwitchUpSyncSucCount;
    protected long mArtcSwitchUpTsDelta;
    private int mArtcTraceDataIndex;
    long mAudioBytes;
    private float mAudioGainCoef;
    protected long mAudioStartTime;
    protected int mAuthResultCode;
    public volatile int mBeatCount;
    protected long mBufferingCountNew;
    protected long mBufferingHeartBeatCount;
    protected StringBuilder mBufferingHeartBeatMsg;
    protected long mBufferingHeartBeatTotalTime;
    protected long mBufferingStart;
    protected long mBufferingTotalTimeNew;
    protected long mCacheLengthAtStart;
    private int mCacheReason;
    protected int mCheckMp4PatternWhenUseUrlCache;
    protected boolean mCodeClean;
    protected String mCodeUsageCount;
    protected boolean mCommitLivePushControlInfo;
    protected gf4 mConfigAdapter;
    protected String mConfigParams;
    protected WeakReference<Context> mContextRef;
    protected Surface mControlSurface;
    protected boolean mCreateInBackground;
    protected int mCurrRenderingStatus;
    protected long mCurrSeekTime;
    protected String mCurrentPageName;
    protected String mDebugStatus;
    protected int mDegradeCode;
    protected volatile long mDelayTimeAtDelayBegin;
    protected boolean mDisableFixSeekCount;
    protected int mDisablePullAudio;
    protected volatile long mDisorderFrameCountNew;
    protected HashMap<String, String> mDynamicPlayExMap;
    protected boolean mEnableAddUnorderedStall;
    private boolean mEnableAudioClip;
    private boolean mEnableAudioGain;
    protected boolean mEnableChangeCurPositionToVideoPosition;
    protected boolean mEnableDecodeAACDSE;
    protected boolean mEnableFixAbnormalStatForFirstRender;
    protected boolean mEnableFixAbnormalStatForLoop;
    protected boolean mEnableMediacodecOpengl;
    protected boolean mEnablePlayrate3DropPKT;
    protected volatile boolean mEnableRenderStallCalNew;
    protected boolean mEnableRtcSwitch;
    private boolean mEnableSeekFlushBuffer;
    protected boolean mEnableSeekInPause;
    protected boolean mEnableStatRenderStallInNative;
    protected boolean mEnableStatRenderStallInNonSurface;
    protected boolean mEnableStatRenderStallInNonVisible;
    protected boolean mEnableSyncAfterSeek;
    protected boolean mEnableVFPlugin;
    protected boolean mEnableVPM;
    protected boolean mEnableWatch;
    String mEncodeType;
    protected int mErrorCodeInternal;
    boolean mExit;
    protected long mExperiment;
    protected long mFatalErrorASync;
    protected long mFatalErrorASyncTime;
    protected boolean mFetchArtcSoAfterSelect;
    protected boolean mFetchArtcSoReadyInit;
    protected boolean mFetchFFMpegSoReadyInit;
    protected boolean mFetchS266SoReadyInit;
    protected long mFetchSoStartTime;
    protected long mFetchSoTime;
    protected long mFirstFrameSurfaceUpdateTime;
    protected long mFirstFrameSurfaceUpdateTs;
    protected long mFirstPlayTime;
    protected long mFirstRenderRecvTime;
    protected long mFirstRenderStalledPts;
    public long mFirstRenderTime;
    protected long mFirstSetSurfaceTime;
    protected int mFirstSwitchDownReason;
    protected long mFirstUpdateTimeFromPlayerStart;
    private boolean mFixMisorderFrameCount;
    protected boolean mForceMuteMode;
    protected volatile long mFrameCountInDelayState;
    protected volatile long mFrameCountRecoverInDelayState;
    protected int mFrameInfoLevel;
    protected int mFrameInfoTop1Position;
    protected int mFrameInfoTop2Position;
    protected boolean mFromNotValid;
    protected int mGenerateCacheKeyModeWhenUseUrlCache;
    private H264AuthenStrategy mH264AuthenStrategy;
    private H265AuthenStrategy mH265AuthenStrategy;
    Handler mHandler;
    protected boolean mHasCommitFetchSoFinish;
    protected boolean mHasEverClose;
    protected boolean mHasEverEnableBluetooth;
    protected boolean mHasSetControlSurface;
    protected boolean mHasSetSurface;
    protected volatile boolean mHasUpdateSourceFps;
    StringBuilder mHeartBeatDecodeFPS;
    StringBuilder mHeartBeatDownloadFPS;
    StringBuilder mHeartBeatFPS;
    protected long mHeartBeatInterval;
    StringBuilder mHeartBeatNetSpeed;
    private final Object mHttpDnsOriginLock;
    protected long mHttpOpenTime;
    protected List<String> mIgnoreParamListWhenGenerateCacheKeyMode;
    long mInnerStartTime;
    protected String mInterfaceUsageCount;
    protected boolean mIsBackground;
    protected volatile boolean mIsDecoderLoaded;
    private volatile boolean mIsFirstFrameRenderedNewUpdate;
    protected boolean mIsFirstRenderStalledPtsRecorded;
    protected boolean mIsFloatWindow;
    protected volatile boolean mIsInDelayStallInterval;
    protected boolean mIsPlayingFlv;
    protected boolean mIsPlayingInBackground;
    protected boolean mIsPlayingInBackgroundNew;
    protected boolean mIsPlayingWhenInvisible;
    protected boolean mIsPrerelease;
    protected long mLastBgPlayTime;
    protected long mLastBufferDuration;
    protected long mLastBuffering;
    protected long mLastCommitPlaying;
    int mLastErrorCode;
    int mLastExtra;
    protected long mLastFloatWindowsPlayTime;
    private volatile long mLastFramePts;
    private volatile long mLastFrameRenderSystemTime;
    int mLastIsConnected;
    protected volatile long mLastMonitorRenderSystemTime;
    protected boolean mLastMuteState;
    protected int mLastPlayError;
    protected volatile long mLastPlayTime;
    protected long mLastPlayTimeInBackground;
    protected long mLastRenderVideoEveryFrame;
    private volatile long mLastStalledFrameFramePts;
    private volatile long mLastStalledFrameRenderSystemTime;
    private int mLastState;
    private String mLastVideoResolution;
    private long mLastVideoSizePlayTime;
    protected float mLastVolume;
    private int mLivePlayerNum;
    protected String mLivePushControlInfo;
    private int mLiveWarmupNum;
    String mLocalIP;
    private final Object mLock;
    private feh mLogContext;
    protected int mLoopCount;
    protected String mLowQualityUrl;
    protected volatile float mMaxFpsAtStalledCal;
    protected int mMaxPlayerInstanceCount;
    protected int mMaxRenderAbnormalInRenderThread;
    protected volatile long mMaxRenderInterval;
    protected volatile long mMaxStalledCountInDelay;
    protected volatile double mMaxStalledCountInInterval;
    protected int mMediaCodecABId;
    protected int mMediaCodecErrorReason;
    protected int mMediaCodecInputErrorCode;
    protected int mMediaCodecOutputErrorCode;
    protected int mMediaCodecProcessError;
    protected int mMessageWasteExceedThreshold;
    protected boolean mMuteAudio;
    protected List<Integer> mMuteStateNodes;
    protected volatile boolean mNeedRegisterFetchCallback;
    protected int mNetStackType;
    protected g0d mNetworkUtilsAdapter;
    private String mNewEventStatusNode;
    protected boolean mNotSetH26XInConfig;
    private long mOpenFileTime;
    protected String mOriginSelectedUrlName;
    protected String mPageUrl;
    protected int mPanoType;
    protected PhoneStateListener mPhoneStateListener;
    protected String mPlayExperienceStaticStatValue;
    protected boolean mPlayInPIP;
    protected float mPlayRate;
    private int mPlayStartVideoHeight;
    private int mPlayStartVideoWidth;
    protected String mPlayStatStaticValue;
    protected long mPlayTimeHd;
    protected long mPlayTimeInBackground;
    protected long mPlayTimeQhd;
    protected long mPlayTimeSd;
    protected long mPlayTimeUd;
    protected long mPlayTimeUhd;
    protected long mPlayerCreatTs;
    protected LinkedList<Integer> mPlayerEventList;
    protected long mPlayerIndex;
    protected long mPlayerInitTimeMS;
    protected long mPlayerP2ffFinishedTs;
    protected LinkedList<Integer> mPlayerPullAudioEventList;
    protected String mPlayingLiveDefinition;
    protected long mPrepareStartTime;
    private long mReceiveFramesInRendering;
    protected int mReleaseReason;
    long mRendedTimeInRenderThread;
    private String mRenderStallStatInfoForFirstTime;
    private final Object mRenderStatLock;
    long mRenderTimeFromInnerStart;
    volatile int mReportBitrateTimes;
    private long mRequestBytesInRendering;
    private long mResumeTs;
    private volatile long mResumeTsNew;
    protected boolean mReuseFlag;
    protected int mRotate;
    protected long mRtcAudioFirstPacketTime;
    protected volatile long mRtcAudioTrackBufferCount;
    protected volatile long mRtcAudioTrackBufferStart;
    protected volatile long mRtcAudioTrackBufferTotalTime;
    protected long mRtcCongestionMode;
    protected LinkedList<Integer> mRtcLiveAbrReasonList;
    protected boolean mRtcLiveAutoSwitch;
    protected int mRtcPacketBufferClearToKeyDiasble;
    protected float mRtcPlayRate;
    protected long mRtcStrategicAbnormalCount;
    protected long mRtcStrategicAbnormalTime;
    protected int mRtcTotalCount;
    protected float mRtcTotalRate;
    protected long mRtcVideoFirstFrameTime;
    protected long mRtcVideoFirstPacketTime;
    protected int mRtcVideoNackBackoffDisable;
    protected volatile long mRtcVideoTrackBufferCount;
    protected volatile long mRtcVideoTrackBufferStart;
    protected volatile long mRtcVideoTrackBufferTotalTime;
    protected boolean mSeamlessSwitchCanUsingSingleDecoder;
    protected int mSeamlessSwitchCode;
    protected long mSeamlessSwitchEndTime;
    protected long mSeamlessSwitchErrorCode;
    protected boolean mSeamlessSwitchForcedly;
    protected int mSeamlessSwitchIndex;
    protected String mSeamlessSwitchInfo;
    protected int mSeamlessSwitchMode;
    protected String mSeamlessSwitchPath;
    protected String mSeamlessSwitchSelectName;
    protected long mSeamlessSwitchStartTime;
    protected int mSeamlessSwitchStatus;
    protected String mSeamlessSwitchStatusAll;
    long mSecondEndtime;
    public long mSecondRenderTime;
    protected long mSeekCount;
    protected boolean mSeekFastMode;
    protected long mSeekPos;
    protected long mSeekStart;
    protected long mSeekTime;
    protected int mSelectFlvUrlReason;
    protected boolean mSendLogToken;
    protected int mServerAuthLevel;
    protected String mServerIPJson;
    protected long mSetUrlTs;
    protected boolean mShouldStatRenderStallInNative;
    protected volatile float mSourceFpsInterval;
    protected long mStallReason;
    protected long mStallStartTime;
    protected volatile long mStalledCountInDelayState;
    protected long mStartTime;
    private int mState;
    public LinkedList<Integer> mStreamSelectReasonList;
    protected Surface mSurface;
    protected long mSurfaceTime;
    protected boolean mSwitchByRtc;
    protected int mSwitchFailCounter;
    protected int mSwitchForceSuccCounter;
    protected int mSwitchRotate;
    protected String mSwitchScene;
    protected long mSwitchSceneTime;
    protected long mSwitchStreamSeamlessTs;
    protected int mSwitchSuccCounter;
    protected String mSwitchTargetLiveDefinition;
    protected String mSwitchToBackKey;
    protected boolean mSwitchToBackground;
    protected boolean mSwitchToForeground;
    protected String mSwitchToFrontKey;
    protected boolean mSyncNotifyHttpDns;
    protected volatile long mSystemTimeAtDelayBegin;
    private long mT;
    private long mTD;
    private long mTDn;
    protected TelephonyManager mTelephonyManager;
    private final Object mTimeLock;
    protected boolean mTmpEnableGetStartTimeInRelease;
    private long mTn;
    protected int mTotalBgCount;
    protected long mTotalBgPlayTime;
    protected volatile long mTotalDelayTime;
    protected int mTotalFloatWindowsCount;
    protected long mTotalFloatWindowsPlayTime;
    protected volatile long mTotalPlayTime;
    protected long mTotalQuickFrameCountAll;
    protected long mTotalQuickPlayFrameCount;
    protected long mTotalQuickPlayTime;
    protected long mTotalQuickPlayTimeAll;
    protected long mTotalRenderIntervalDiff;
    protected long mTotalSlowFrameCountAll;
    protected long mTotalSlowPlayFrameCount;
    protected long mTotalSlowPlayTime;
    protected long mTotalSlowPlayTimeAll;
    private Runnable mUTRun;
    private int mUnuseProxyReason;
    protected boolean mUseEventId19997;
    protected boolean mUseMediacodec;
    protected boolean mUsePlayRateCalSubStall;
    protected int mUseSoftwareByPolicy;
    protected boolean mUseSurfaceView;
    public long mUserFirstFrameTime;
    protected String mUsingInterface;
    protected int mValidAbnormalFrameCount;
    String mVia;
    long mVideoBytes;
    private long mVideoCacheBytesInRendering;
    private long mVideoCacheFramesInRendering;
    long mVideoDuration;
    protected long mVideoRenderStalledDurationThreshold;
    protected volatile long mVideoRenderingStalledCountNewUpdate;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r1;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r2;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r3;
    protected volatile long mVideoRenderingStalledCountNewUpdate_r4;
    private String mVideoResolution;
    private Map<String, Long> mVideoResolutionPlayTimeMap;
    private Map<String, Long> mVideoResolutionRenderingStalledCountMap;
    protected long mVideoStartTime;
    protected int mVideoSwitchHeight;
    protected int mVideoSwitchSarDen;
    protected int mVideoSwitchSarNum;
    protected int mVideoSwitchWidth;
    private String mVideoToken;
    protected boolean mViewIsVisible;
    private int mVodPlayerNum;
    protected float mVolume;
    protected List<Float> mVolumeStateNodes;
    protected long mWarmupEndTime;
    protected long mWarmupReceiveBytes;
    protected long mWarmupStartTime;
    private long mWatchExceedNum1;
    private long mWatchExceedNum2;
    protected long mWatchExceedThreshold;
    private long mWatchExceedTime1;
    private long mWatchExceedTime2;
    private Handler mWatchHandler;
    protected long mWatchInterval;
    private long mWatchLastMessageTime;
    private final Object mWatchLock;
    private final long mWatchMinTime;
    protected int mWatchPhase;
    public long maxSeekTime;
    protected long maxStalledCount;
    protected long maxStalledPlayTime;
    protected boolean monitorNewStalled;
    boolean pauseByTelephone;
    protected volatile String playerCreatedPageName;
    public List<Long> seekTimeList;
    protected long videoRenderingStalledCount;
    protected long videoRenderingStalledCountInRenderThread;
    protected volatile long videoRenderingStalledCountNewWithResolution;
    protected volatile long videoRenderingStalledCountNew_43833053;
    protected volatile long videoRenderingStalledCountNew_43833053_LastForVpm;
    protected volatile long videoRenderingStalledCountNew_43833053_r1;
    protected volatile long videoRenderingStalledCountNew_43833053_r2;
    protected long[] videoRenderingStalledCountNew_43833053_reasons;
    private long videoRenderingStalledCount_live;
    protected long videoRenderingStalledTotalDuration;
    protected long videoRenderingStalledTotalDurationInRenderThread;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053_LastForVpm;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053_r1;
    protected volatile long videoRenderingStalledTotalDurationNew_43833053_r2;
    private long videoRenderingStalledTotalDuration_live;
    protected static volatile AtomicReference<String> mArtcSoPath = new AtomicReference<>("");
    protected static volatile AtomicReference<String> mS266SoPath = new AtomicReference<>("");
    protected static volatile AtomicReference<String> mFFMpegSoPath = new AtomicReference<>("");
    protected static volatile AtomicReference<String> mArtcSoMajorVersion = new AtomicReference<>("");
    protected static volatile AtomicReference<String> mArtcSoMinorVersion = new AtomicReference<>("");
    protected static long mGlogalPlayerIndex = 0;
    protected static volatile boolean mHasSetLogPrinter = false;
    private static boolean isGetHdrResult = false;
    private static boolean bSupportHDR = false;
    protected static boolean mIsVPMLibLoaded = false;
    protected static boolean mVPMLibLoadError = false;
    protected static AtomicBoolean mIsDecoderLoadedGlobal = new AtomicBoolean(false);
    protected static volatile boolean mIs266DecoderLoadedGlobal = false;
    protected static AtomicBoolean mRegisterAppMonitor = new AtomicBoolean(false);
    private static ThreadLocal<StringBuilder> monitorReleaseBuilder = new ThreadLocal<StringBuilder>() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.5
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder(1024);
        }
    };
    private static ThreadLocal<StringBuilder> playExperienceBuilder = new ThreadLocal<StringBuilder>() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.6
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder(1024);
        }
    };

    static {
        t2o.a(774898032);
    }

    public MonitorMediaPlayer(Context context) {
        this(context, null);
    }

    public static /* synthetic */ long access$208(MonitorMediaPlayer monitorMediaPlayer) {
        long j = monitorMediaPlayer.mWatchExceedNum1;
        monitorMediaPlayer.mWatchExceedNum1 = 1 + j;
        return j;
    }

    public static /* synthetic */ long access$408(MonitorMediaPlayer monitorMediaPlayer) {
        long j = monitorMediaPlayer.mWatchExceedNum2;
        monitorMediaPlayer.mWatchExceedNum2 = 1 + j;
        return j;
    }

    private void appendExtraQueryToPath(StringBuilder sb) {
        if (this.mConfig.W > 0) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("connTimeout=" + this.mConfig.W);
        }
        if (this.mConfig.X > 0) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("readTimeout=" + this.mConfig.X);
        }
        if (this.mConfig.Y > 0) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("RetryTime=" + this.mConfig.Y);
        }
        String bizGroupCode = getBizGroupCode();
        if (!TextUtils.isEmpty(bizGroupCode)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("bizCode=" + bizGroupCode);
        }
        if (!TextUtils.isEmpty(this.mConfig.B)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("videoId=" + this.mConfig.B);
        }
        if (!TextUtils.isEmpty(this.mConfig.D)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("videoDefine=" + this.mConfig.D);
        }
    }

    private void checkFromIsValid(r7t r7tVar) {
        Map<String, String> map;
        if (this.mIsPrerelease) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "checkFromIsValid sub_business_type=" + r7tVar.y + ", videoId=" + r7tVar.B + ", mUsingInterface=" + r7tVar.k0);
            this.mFromNotValid = false;
            if (TextUtils.isEmpty(r7tVar.y) || TextUtils.isEmpty(r7tVar.B)) {
                this.mFromNotValid = true;
            } else if (r7tVar.d == 2) {
                String str = r7tVar.Q;
                if (TextUtils.isEmpty(str) && (map = r7tVar.T) != null && map.size() > 0) {
                    str = r7tVar.T.get("vod_scenario");
                }
                if (TextUtils.isEmpty(str) && !ew0.r(this.mUsingInterface, "[\"MyTBVideoEmbedView\", \"WXInteractiveComponent\"]")) {
                    this.mFromNotValid = true;
                }
            }
            WeakReference<Context> weakReference = this.mContextRef;
            Context context = weakReference == null ? null : weakReference.get();
            if (this.mFromNotValid) {
                Toast.makeText(context, "全场景videoId、bizCode/from与点播videoPlayScene不能为空，请联系播放器SDK同学获取值", 1).show();
            }
            if (!TextUtils.isEmpty(r7tVar.B) && r7tVar.B.startsWith("http")) {
                Toast.makeText(context, "请正确设置VideoId/FeedId（不要设置为url），有问题请联系播放器SDK同学", 1).show();
            }
        }
    }

    private void colloectMoreRenderStallInfo() {
        Context context;
        t7b d;
        if (this instanceof TaobaoMediaPlayer) {
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference == null) {
                context = null;
            } else {
                context = weakReference.get();
            }
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
            this.mVideoCacheFramesInRendering = taobaoMediaPlayer._getPropertyLong(20009, -2L);
            this.mVideoCacheBytesInRendering = taobaoMediaPlayer._getPropertyLong(20007, -2L);
            if (this.bUseVideoCache && !this.bIsCompleteHitCache && (d = a7m.d(context)) != null) {
                this.mReceiveFramesInRendering = d.w(this.mPlayUrl);
                this.mRequestBytesInRendering = d.y(this.mPlayUrl);
            }
        }
    }

    private void commitStat19997(String str, CT ct, String str2, String... strArr) {
        if (this.mUseEventId19997) {
            TBS.Ext.commitEvent(str, 19997, str + "_Button-" + str2, "", "", strArr);
            return;
        }
        TBS.Adv.ctrlClicked(str, ct, str2, strArr);
    }

    private HashMap<String, String> getBaseDimensionValues() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (this instanceof NativeMediaPlayer) {
            hashMap.put("player_type", "mediaplayer");
        } else if (this instanceof TaobaoMediaPlayer) {
            hashMap.put("player_type", "taobaoplayer");
        }
        hashMap.put("play_scenario", String.valueOf(this.mConfig.d));
        if (!TextUtils.isEmpty(this.mServerIP)) {
            hashMap.put("server_ip", this.mServerIP);
        }
        if (!TextUtils.isEmpty(this.mLocalIP)) {
            hashMap.put("local_ip", this.mLocalIP);
        }
        if (!TextUtils.isEmpty(this.mVia)) {
            hashMap.put("route_nodes", this.mVia);
        }
        if (!TextUtils.isEmpty(this.mEncodeType)) {
            hashMap.put("encode_type", this.mEncodeType);
        }
        if (!TextUtils.isEmpty(this.mPlayUrl)) {
            hashMap.put("media_url", this.mPlayUrl);
        }
        if (!TextUtils.isEmpty(this.mConfig.B)) {
            hashMap.put("feed_id", this.mConfig.B);
        }
        if (!TextUtils.isEmpty(this.mConfig.C)) {
            hashMap.put("anchor_account_id", this.mConfig.C);
        }
        if (!TextUtils.isEmpty(this.mConfig.A)) {
            hashMap.put("user_id", this.mConfig.A);
        }
        if (!TextUtils.isEmpty(this.mConfig.D)) {
            hashMap.put("video_definition", this.mConfig.D);
        }
        if (!TextUtils.isEmpty(this.mConfig.x)) {
            hashMap.put("business_type", this.mConfig.x);
        }
        if (!TextUtils.isEmpty(this.mConfig.y)) {
            hashMap.put(atb.EXP_KEY_SUB_BUSINESS_TYPE, this.mConfig.y);
        }
        hashMap.put("video_width", String.valueOf(getVideoWidth()));
        hashMap.put("video_height", String.valueOf(getVideoHeight()));
        hashMap.put("player_status_nodes", getPlayerEvent());
        hashMap.put("video_duration", String.valueOf(this.mVideoDuration));
        return hashMap;
    }

    private int getCdnCacheValue(Map<String, String> map) {
        if (map != null) {
            String str = map.get(HttpConstant.X_CACHE);
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("HIT")) {
                    return 1;
                }
                if (str.startsWith("MISS")) {
                    return 0;
                }
            }
        }
        return -1;
    }

    private long getColorPrimaries() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_COLOR_PRIMARIES, -1L);
        }
        return -1L;
    }

    private long getColorRange() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_COLOR_RANGE, -1L);
        }
        return -1L;
    }

    private long getColorSpace() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_COLOR_SPACE, -1L);
        }
        return -1L;
    }

    private String getGrtnDelayUrlParams() {
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        r7t r7tVar = this.mConfig;
        long a2 = ew0.a(gf4Var, "tblivertc", r7tVar.x, r7tVar.y);
        if (a2 >= 10 && a2 <= 10000) {
            long v = ew0.v(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnMaxDelayMs", "6000"));
            if (v >= a2 && v <= 30000) {
                return TextUtils.join("&", new String[]{"rtc_delay=" + a2, "mbdfu=" + v, "max_delay=" + v, "pidm=0"});
            }
        }
        return null;
    }

    private static boolean getHDRSupportInfo(Context context) {
        boolean isScreenWideColorGamut;
        if (isGetHdrResult) {
            return bSupportHDR;
        }
        if (context == null) {
            return bSupportHDR;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                isScreenWideColorGamut = context.getResources().getConfiguration().isScreenWideColorGamut();
                bSupportHDR = isScreenWideColorGamut;
                isGetHdrResult = true;
            }
        } catch (Exception e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "can't get screen wide color gamnut info " + e.getMessage());
        }
        return bSupportHDR;
    }

    private String getHttpDnsOriginIP(String str, boolean z) {
        synchronized (this.mHttpDnsOriginLock) {
            try {
                HttpDnsAdapter.HttpDnsOrigin f = z5r.f(str, z);
                this.mHttpDnsOrigin = f;
                if (f == null) {
                    return null;
                }
                return f.getOriginIP();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int getLastStreamSelectReason() {
        if (this.mStreamSelectReasonList.isEmpty()) {
            return -1;
        }
        int i = this.mLastErrorCode;
        if (i == 0 || i != -10900) {
            return this.mStreamSelectReasonList.getLast().intValue();
        }
        if (this.mStreamSelectReasonList.size() > 1) {
            return this.mStreamSelectReasonList.getFirst().intValue();
        }
        return -1;
    }

    private static String getMobileOutputSamplerRate(Context context) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(mOutputSampleRate)) {
            return mOutputSampleRate;
        }
        try {
            mOutputSampleRate = ((AudioManager) context.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        } catch (Exception unused) {
        }
        return mOutputSampleRate;
    }

    private String getPlayerEvent() {
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < this.mPlayerEventList.size(); i++) {
            if (i != 0) {
                sb.append("_");
            }
            int intValue = this.mPlayerEventList.get(i).intValue();
            if (intValue != 40 || !(this instanceof TaobaoMediaPlayer)) {
                sb.append(intValue);
            } else {
                sb.append(intValue + f7l.BRACKET_START_STR + TaobaoMediaPlayer._getLastCdnPlayingSpeedNodesStr() + f7l.BRACKET_END_STR);
            }
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "getPlayerEvent=" + ((Object) sb));
        return sb.toString();
    }

    public static String getProxyVideoUrl(Context context, r7t r7tVar, String str) {
        if (!(context == null || r7tVar == null)) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(r7tVar.r) && !str.contains(".m3u8") && str.startsWith("http")) {
                    StringBuilder sb = new StringBuilder(100);
                    if (!TextUtils.isEmpty(r7tVar.t)) {
                        if (!TextUtils.isEmpty(sb)) {
                            sb.append("&");
                        }
                        sb.append("playTokenId=" + r7tVar.t);
                    }
                    if (!TextUtils.isEmpty(r7tVar.r)) {
                        if (!TextUtils.isEmpty(sb)) {
                            sb.append("&");
                        }
                        sb.append("videoCacheId=" + r7tVar.r);
                    }
                    String b = ew0.b(str, sb);
                    if (r7tVar.o) {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("useTBNetProxy=" + r7tVar.o);
                        b = ew0.b(b, sb2);
                    }
                    return a7m.d(context).v(b);
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private String getRenderType() {
        if (this instanceof TaobaoMediaPlayer) {
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
            long _getPropertyLong = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_DECODER_TYPE, 0L);
            if (_getPropertyLong == 32) {
                return "mediacodec";
            }
            if (_getPropertyLong == 64) {
                return "mediacodec_egl";
            }
            long _getPropertyLong2 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_RENDERER_TYPE, 0L);
            if (_getPropertyLong2 == 4) {
                return UltronTradeHybridInstanceRenderMode.SURFACE;
            }
            if (_getPropertyLong2 == 8) {
                return "egl";
            }
            return "unknown";
        } else if (this instanceof NativeMediaPlayer) {
            return "native-player";
        } else {
            return "unknown";
        }
    }

    private String getRtcLiveAbrReason() {
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < this.mRtcLiveAbrReasonList.size(); i++) {
            if (i != 0) {
                sb.append("_");
            }
            sb.append(this.mRtcLiveAbrReasonList.get(i).intValue());
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "getRtcLiveAbrReason size is :" + sb.length());
        return sb.toString();
    }

    private String getRtcSfuIP() {
        if (this instanceof TaobaoMediaPlayer) {
            return ((TaobaoMediaPlayer) this)._getPropertyString(TaobaoMediaPlayer.FFP_PROP_STRING_SERVER_IP);
        }
        return null;
    }

    private String getStateNodes(List<Integer> list) {
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i) + "_");
        }
        if (list.size() > 0) {
            sb.append(list.get(list.size() - 1));
        }
        AVSDKLog.d(tfb.MODULE_SDK_PAGE, "getStateNodes size is :" + sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:9:0x003f, B:10:0x0044, B:12:0x004a, B:31:0x0087, B:33:0x008d, B:35:0x0097, B:37:0x009d), top: B:47:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean getUrlCacheConfig(java.lang.String r11, java.lang.String r12, java.lang.Integer[] r13, java.util.List<java.lang.String> r14) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            com.alibaba.fastjson.JSONArray r12 = com.alibaba.fastjson.JSON.parseArray(r12)     // Catch: all -> 0x006f
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r12.size()     // Catch: all -> 0x006f
            r6 = 1
            if (r2 >= r5) goto L_0x00ad
            java.lang.Object r3 = r12.get(r2)     // Catch: all -> 0x006f
            com.alibaba.fastjson.JSONObject r3 = (com.alibaba.fastjson.JSONObject) r3     // Catch: all -> 0x006f
            java.lang.String r4 = "business"
            java.lang.String r4 = r3.getString(r4)     // Catch: all -> 0x006f
            java.lang.String r5 = "checkMp4"
            java.lang.Integer r5 = r3.getInteger(r5)     // Catch: all -> 0x006f
            int r5 = r5.intValue()     // Catch: all -> 0x006f
            java.lang.String r7 = "cacheKeyMode"
            java.lang.Integer r7 = r3.getInteger(r7)     // Catch: all -> 0x006f
            int r7 = r7.intValue()     // Catch: all -> 0x006f
            java.lang.String r8 = "*"
            boolean r8 = r8.equals(r4)     // Catch: all -> 0x006f
            java.lang.String r9 = "ignoreParams"
            if (r8 == 0) goto L_0x005c
            com.alibaba.fastjson.JSONArray r11 = r3.getJSONArray(r9)     // Catch: all -> 0x0054
            r12 = 0
        L_0x0044:
            int r14 = r11.size()     // Catch: all -> 0x0054
            if (r12 >= r14) goto L_0x0058
            java.lang.Object r14 = r11.get(r12)     // Catch: all -> 0x0054
            r11.add(r14)     // Catch: all -> 0x0054
            int r12 = r12 + 1
            goto L_0x0044
        L_0x0054:
            r11 = move-exception
            r1 = 1
            goto L_0x00c0
        L_0x0058:
            r3 = r5
            r4 = r7
            r11 = 1
            goto L_0x00ae
        L_0x005c:
            if (r0 != 0) goto L_0x00a7
            java.lang.String r8 = "TRIVER_*"
            boolean r8 = r8.equals(r4)     // Catch: all -> 0x006f
            if (r8 == 0) goto L_0x0071
            java.lang.String r8 = "TRIVER_"
            boolean r8 = r11.startsWith(r8)     // Catch: all -> 0x006f
            if (r8 != 0) goto L_0x0087
            goto L_0x0071
        L_0x006f:
            r11 = move-exception
            goto L_0x00c0
        L_0x0071:
            java.lang.String r8 = "SPM_*"
            boolean r8 = r8.equals(r4)     // Catch: all -> 0x006f
            if (r8 == 0) goto L_0x0081
            java.lang.String r8 = "SPM_"
            boolean r8 = r11.startsWith(r8)     // Catch: all -> 0x006f
            if (r8 != 0) goto L_0x0087
        L_0x0081:
            boolean r4 = r4.equals(r11)     // Catch: all -> 0x006f
            if (r4 == 0) goto L_0x00a7
        L_0x0087:
            com.alibaba.fastjson.JSONArray r11 = r3.getJSONArray(r9)     // Catch: all -> 0x0054
            if (r11 != 0) goto L_0x0096
            tb.feh r11 = r10.mLogContext     // Catch: all -> 0x0054
            java.lang.String r12 = "ignoreParams is null"
            com.taobao.taobaoavsdk.AVSDKLog.e(r11, r12)     // Catch: all -> 0x0054
            goto L_0x0058
        L_0x0096:
            r12 = 0
        L_0x0097:
            int r0 = r11.size()     // Catch: all -> 0x0054
            if (r12 >= r0) goto L_0x0058
            java.lang.String r0 = r11.getString(r12)     // Catch: all -> 0x0054
            r14.add(r0)     // Catch: all -> 0x0054
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00a7:
            int r2 = r2 + 1
            r3 = r5
            r4 = r7
            goto L_0x000c
        L_0x00ad:
            r11 = 0
        L_0x00ae:
            if (r11 == 0) goto L_0x00d9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x00bd
            r13[r1] = r12     // Catch: all -> 0x00bd
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x00bd
            r13[r6] = r12     // Catch: all -> 0x00bd
            goto L_0x00d9
        L_0x00bd:
            r12 = move-exception
            r1 = r11
            r11 = r12
        L_0x00c0:
            tb.feh r12 = r10.mLogContext
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "getUrlCacheConfig error "
            r13.<init>(r14)
            java.lang.String r11 = r11.toString()
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r12, r11)
            r11 = r1
        L_0x00d9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.getUrlCacheConfig(java.lang.String, java.lang.String, java.lang.Integer[], java.util.List):boolean");
    }

    private String getVPMSummary() {
        StringBuilder sb = new StringBuilder(400);
        sb.append("play_token=");
        sb.append(this.mConfigClone.t);
        sb.append(",feed_id=");
        sb.append(this.mConfigClone.B);
        sb.append(",sub_business_type=");
        sb.append(this.mConfigClone.y);
        sb.append(",play_scenario=");
        sb.append(this.mConfigClone.d);
        sb.append(",quit_time=");
        sb.append(System.currentTimeMillis() - this.mPrepareStartTime);
        sb.append(",error_code=");
        sb.append(this.mLastErrorCode);
        sb.append(",first_frame_rendering_time=");
        sb.append(this.mFirstRenderTime);
        sb.append(",abnormal_total_time_new=");
        sb.append(this.mBufferingTotalTimeNew);
        sb.append(",play_time=");
        sb.append(this.mTotalPlayTime);
        sb.append(",vod_scenario=");
        sb.append(this.mConfigClone.Q);
        sb.append(",video_width=");
        sb.append(getVideoWidth());
        sb.append(",video_height=");
        sb.append(getVideoHeight());
        sb.append(",");
        AVSDKLog.d(tfb.MODULE_SDK_PAGE, "getVPMSummary size is :" + sb.length());
        return sb.toString();
    }

    private void heartBeatMonitorStart() {
        synchronized (this.mLock) {
            try {
                if (this.mHandler != null && this.mHeartBeatInterval > -1 && this.mUTRun == null) {
                    this.mUTRun = new Runnable() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.4
                        @Override // java.lang.Runnable
                        public void run() {
                            MonitorMediaPlayer.this.commitPlaying();
                            MonitorMediaPlayer monitorMediaPlayer = MonitorMediaPlayer.this;
                            Handler handler = monitorMediaPlayer.mHandler;
                            if (handler != null) {
                                handler.postDelayed(monitorMediaPlayer.mUTRun, MonitorMediaPlayer.this.mHeartBeatInterval);
                            }
                        }
                    };
                    this.mLastCommitPlaying = System.currentTimeMillis();
                    this.mHandler.postDelayed(this.mUTRun, this.mHeartBeatInterval);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initWatchHandler() {
        if (this.mEnableWatch && this.mWatchHandler == null && this.mWatchExceedThreshold > 10 && this.mWatchInterval > 10) {
            this.mWatchPhase = 1;
            this.mWatchHandler = new Handler() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what == 100) {
                        if (MonitorMediaPlayer.this.mWatchLastMessageTime > 0) {
                            long currentTimeMillis = System.currentTimeMillis() - MonitorMediaPlayer.this.mWatchLastMessageTime;
                            MonitorMediaPlayer monitorMediaPlayer = MonitorMediaPlayer.this;
                            if (currentTimeMillis > monitorMediaPlayer.mWatchExceedThreshold) {
                                long j = currentTimeMillis - monitorMediaPlayer.mWatchInterval;
                                int i = monitorMediaPlayer.mWatchPhase;
                                if (i == 1) {
                                    monitorMediaPlayer.mWatchExceedTime1 += j;
                                    MonitorMediaPlayer.access$208(MonitorMediaPlayer.this);
                                } else if (i == 2) {
                                    monitorMediaPlayer.mWatchExceedTime2 += j;
                                    MonitorMediaPlayer.access$408(MonitorMediaPlayer.this);
                                }
                            }
                        }
                        MonitorMediaPlayer.this.sendWatchMessage();
                    }
                }
            };
            sendWatchMessage();
        }
    }

    private void monitorPlayerEvent(int i) {
        try {
            int i2 = this.mState;
            this.mLastState = i2;
            this.mState = i;
            if (this.mConfigClone.d == 0) {
                if (i == 3 && i2 == 10) {
                    if (ja1.i0()) {
                        this.mSwitchToBackground = true;
                    }
                    this.mSwitchToForeground = false;
                }
                if (this.mState == 2 && this.mLastState == 3 && !ja1.i0() && this.mSwitchToBackground) {
                    this.mSwitchToForeground = true;
                    this.mSwitchToBackground = false;
                }
            }
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "FatalError monitorPlayerEvent " + i + ":" + getStateString(this.mState) + " mLastEvent: " + getStateString(this.mLastState) + " mIsBackground " + ja1.i0() + " mSwitchToBackground " + this.mSwitchToBackground + " mSwitchToForeground " + this.mSwitchToForeground);
            if (i == 2) {
                this.mLastPlayTime = System.currentTimeMillis();
                if (this.mIsBackground) {
                    this.mLastPlayTimeInBackground = this.mLastPlayTime;
                }
                updateVideoResolutionInfoForStart();
                removeWatchMessage();
                sendWatchMessage();
                setMessageLogging();
            } else if (this.mLastPlayTime > 0 && (i == 6 || i == 7 || i == 3)) {
                computePlayTimeForRtcSwitch();
                updateVideoResolutionInfoForEnd();
                removeWatchMessage();
                resetMessageLogging();
            }
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "monitorPlayerEvent " + i + ":" + getStateString(this.mState));
            this.mPlayerEventList.offer(Integer.valueOf(i));
            if (this.mPlayerEventList.size() > 30) {
                this.mPlayerEventList.poll();
            }
            List<IMediaPlayer.OnPlayerEventListener> list = this.mPlayerEventListener;
            if (list != null) {
                for (IMediaPlayer.OnPlayerEventListener onPlayerEventListener : list) {
                    onPlayerEventListener.onEvent(this, i);
                }
            }
        } catch (Exception unused) {
        }
    }

    private void monitorVideoRenderEveryFrameOld(long j) {
        long j2 = this.mLastRenderVideoEveryFrame;
        if (j2 > 0) {
            long j3 = j - j2;
            if (j3 > this.mMaxRenderAbnormalInRenderThread) {
                this.videoRenderingStalledCountInRenderThread++;
                this.videoRenderingStalledTotalDurationInRenderThread += j3;
            }
        }
        this.mLastRenderVideoEveryFrame = j;
    }

    private void registerMonitor() {
        try {
            if (!TextUtils.isEmpty(this.AppMonitor_Module)) {
                DimensionSet create = DimensionSet.create();
                create.addDimension("player_type", "");
                create.addDimension("media_url", "");
                create.addDimension("server_ip", "");
                create.addDimension("local_ip", "");
                create.addDimension("feed_id", "");
                create.addDimension("anchor_account_id", "");
                create.addDimension("user_id", "");
                create.addDimension("play_scenario", "");
                create.addDimension("error_code", "");
                create.addDimension("video_width", "");
                create.addDimension("video_height", "");
                create.addDimension("encode_type", "");
                create.addDimension("screen_size", "");
                create.addDimension("video_definition", "");
                create.addDimension("route_nodes", "");
                create.addDimension("business_type", "");
                create.addDimension(atb.EXP_KEY_SUB_BUSINESS_TYPE, "");
                create.addDimension("player_status_nodes", "");
                create.addDimension("video_duration", "");
                create.addDimension("extra", "");
                create.addDimension("page_url", "");
                MeasureSet create2 = MeasureSet.create();
                Measure measure = new Measure("buffering_start_time");
                measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure2 = new Measure("buffering_end_time");
                measure2.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure3 = new Measure("buffering_duration");
                measure3.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(10000.0d));
                Measure measure4 = new Measure("buffering_interval");
                measure4.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure5 = new Measure("video_decode_fps");
                measure5.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure6 = new Measure("video_cache");
                measure6.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure7 = new Measure("audio_cache");
                measure7.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                create2.addMeasure(measure);
                create2.addMeasure(measure2);
                create2.addMeasure(measure3);
                create2.addMeasure(measure4);
                create2.addMeasure(measure5);
                create2.addMeasure(measure6);
                create2.addMeasure(measure7);
                AppMonitor.register(this.AppMonitor_Module, MornitorBufferingNew, create2, create);
                MeasureSet create3 = MeasureSet.create();
                Measure measure8 = new Measure("time_stamp");
                measure8.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure9 = new Measure("is_connected");
                measure9.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure10 = new Measure("is_tbnet");
                measure10.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure11 = new Measure("hardware_hevc");
                measure11.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure12 = new Measure("hardware_avc");
                Measure measure13 = new Measure("is_usecache");
                measure13.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                measure12.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure14 = new Measure("video_interval_bit_rate");
                measure14.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                Measure measure15 = new Measure("cur_position");
                measure15.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(Double.MAX_VALUE));
                create3.addMeasure(measure8);
                create3.addMeasure(measure9);
                create3.addMeasure(measure14);
                create3.addMeasure(measure15);
                create3.addMeasure(measure10);
                create3.addMeasure(measure11);
                create3.addMeasure(measure12);
                create3.addMeasure(measure13);
                AppMonitor.register(this.AppMonitor_Module, mornitorPlayerError, create3, create);
            }
        } catch (Throwable unused) {
        }
    }

    private void releaseWatchHandler() {
        synchronized (this.mWatchLock) {
            try {
                Handler handler = this.mWatchHandler;
                if (handler != null) {
                    handler.removeMessages(100);
                    this.mWatchHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void removeWatchMessage() {
        synchronized (this.mWatchLock) {
            try {
                Handler handler = this.mWatchHandler;
                if (handler != null) {
                    handler.removeMessages(100);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetMessageLogging() {
        if (this.mIsPrerelease && mHasSetLogPrinter) {
            mHasSetLogPrinter = false;
            Looper.myLooper().setMessageLogging(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWatchMessage() {
        synchronized (this.mWatchLock) {
            try {
                if (this.mWatchHandler != null) {
                    this.mWatchLastMessageTime = System.currentTimeMillis();
                    this.mWatchHandler.sendEmptyMessageDelayed(100, this.mWatchInterval);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setMessageLogging() {
        if (this.mIsPrerelease && !mHasSetLogPrinter) {
            mHasSetLogPrinter = true;
            Looper.myLooper().setMessageLogging(new LogPrinter(1, tfb.MODULE_SDK_PAGE) { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.2
                long startTime = 0;

                @Override // android.util.LogPrinter, android.util.Printer
                public void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.startsWith(">>>>> Dispatching to")) {
                            this.startTime = System.currentTimeMillis();
                        } else if (str.startsWith("<<<<< Finished to")) {
                            long currentTimeMillis = System.currentTimeMillis() - this.startTime;
                            MonitorMediaPlayer monitorMediaPlayer = MonitorMediaPlayer.this;
                            if (currentTimeMillis > monitorMediaPlayer.mMessageWasteExceedThreshold) {
                                feh fehVar = monitorMediaPlayer.mLogContext;
                                AVSDKLog.e(fehVar, "the message waste " + currentTimeMillis + ", and message is that " + str);
                            }
                        }
                    }
                }
            });
        }
    }

    private void setUseLocalHostUrl() {
        if (this instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) this)._setPropertyLong(FFP_PROP_INT64_IS_LOCALHOST, 1L);
        }
    }

    private int unUseProxyReason() {
        r7t r7tVar = this.mConfig;
        if (r7tVar == null) {
            return 2;
        }
        if (r7tVar.d == 2) {
            return 3;
        }
        String str = this.mPlayUrl;
        if (str == null) {
            return 4;
        }
        if (str.contains(".m3u8")) {
            return 5;
        }
        return !this.mPlayUrl.startsWith("http") ? 6 : 0;
    }

    private boolean useCache() {
        String str;
        String str2;
        r7t r7tVar = this.mConfig;
        if (r7tVar == null || r7tVar.d != 2 || TextUtils.isEmpty(r7tVar.r) || (str = this.mPlayUrl) == null || str.contains(".m3u8") || !this.mPlayUrl.startsWith("http")) {
            if (this.mConfig == null) {
                AVSDKLog.e(this.mLogContext, "useCache false for null config");
            } else {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "useCache false for type=" + this.mConfig.d + ", cacheKey=" + this.mConfig.r);
            }
            return false;
        }
        gf4 gf4Var = this.mConfigAdapter;
        String str3 = "true";
        if (gf4Var != null) {
            str3 = gf4Var.getConfig("DWInteractive", VIDEO_CACHE_ENABLE, str3);
        }
        boolean s = ew0.s(str3);
        if (s) {
            gf4 gf4Var2 = this.mConfigAdapter;
            if (gf4Var2 != null && ew0.n(this.mConfig.y, gf4Var2.getConfig("DWInteractive", VIDEO_CACHE_BLACK, ""))) {
                return false;
            }
            feh fehVar2 = this.mLogContext;
            StringBuilder sb = new StringBuilder("useCache false for mSubBusinessType=");
            if (this.mConfigAdapter != null) {
                str2 = this.mConfig.y;
            } else {
                str2 = "NullConfig";
            }
            sb.append(str2);
            AVSDKLog.e(fehVar2, sb.toString());
        } else {
            AVSDKLog.e(this.mLogContext, "useCache false for orange");
        }
        return s;
    }

    public void artpEndtoEndDelayMsg(String str) {
        this.end2endDelay = str;
    }

    public void checkStatRenderStallFlag() {
        boolean z;
        long j = 0;
        if (this.mSurface == null || this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || ((this.mIsBackground && !this.mIsFloatWindow) || (!this.mEnableStatRenderStallInNonVisible && !this.mViewIsVisible))) {
            z = false;
        } else {
            z = true;
        }
        if (this.mShouldStatRenderStallInNative != z) {
            this.mShouldStatRenderStallInNative = z;
            if (this instanceof TaobaoMediaPlayer) {
                TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
                if (z) {
                    j = 1;
                }
                taobaoMediaPlayer._setPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_EXTEND_SHOULD_STAT_RENDER_STALL, j);
            }
        }
    }

    public void computePlayTimeForRtcSwitch() {
        synchronized (this.mTimeLock) {
            try {
                if (this.mLastPlayTime > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.mLastPlayTime;
                    if (currentTimeMillis > 0) {
                        this.mTotalPlayTime += currentTimeMillis;
                        this.mLastPlayTime = 0L;
                        if (this.mLastPlayTimeInBackground > 0) {
                            this.mPlayTimeInBackground += System.currentTimeMillis() - this.mLastPlayTimeInBackground;
                            this.mLastPlayTimeInBackground = 0L;
                        }
                        if (!MediaConstant.DEFINITION_UD.equals(this.mPlayingLiveDefinition) && !MediaConstant.DEFINITION_UD_60.equals(this.mPlayingLiveDefinition)) {
                            if (!MediaConstant.DEFINITION_HD.equals(this.mPlayingLiveDefinition) && !MediaConstant.DEFINITION_HD_60.equals(this.mPlayingLiveDefinition)) {
                                if (MediaConstant.DEFINITION_UHD.equals(this.mPlayingLiveDefinition)) {
                                    this.mPlayTimeUhd += currentTimeMillis;
                                } else if (MediaConstant.DEFINITION_QHD.equals(this.mPlayingLiveDefinition)) {
                                    this.mPlayTimeQhd += currentTimeMillis;
                                } else if (MediaConstant.DEFINITION_SD.equals(this.mPlayingLiveDefinition)) {
                                    this.mPlayTimeSd += currentTimeMillis;
                                }
                            }
                            this.mPlayTimeHd += currentTimeMillis;
                        }
                        this.mPlayTimeUd += currentTimeMillis;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean getAutoPause() {
        return this.pauseByTelephone;
    }

    public String getBizGroupCode() {
        String str;
        r7t r7tVar = this.mConfigClone;
        if (r7tVar == null) {
            return null;
        }
        Map<String, String> map = r7tVar.U;
        if (map == null && r7tVar.V == null) {
            return null;
        }
        String str2 = "";
        if (map != null) {
            str = map.get("bizGroup");
        } else {
            Map<String, String> map2 = r7tVar.V;
            str = map2 != null ? map2.get("bizGroup") : str2;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Map<String, String> map3 = this.mConfigClone.T;
        if (map3 != null && map3.size() > 0) {
            str2 = this.mConfigClone.T.get("vod_scenario");
        }
        if (TextUtils.isEmpty(str2)) {
            return this.mConfigClone.y;
        }
        return this.mConfigClone.y + "_" + str2;
    }

    public String getCdnIp() {
        try {
            WeakReference<Context> weakReference = this.mContextRef;
            Context context = weakReference == null ? null : weakReference.get();
            this.mNetStackType = Inet64Util.getStackType();
            boolean startsWith = this.mPlayUrl.startsWith(uyv.HTTPS_SCHEMA);
            String str = this.mPlayUrl;
            boolean z = false;
            if (str != null && ((str.startsWith("http:") || startsWith) && context != null)) {
                r7t r7tVar = this.mConfig;
                if (r7tVar != null && r7tVar.d != 2) {
                    boolean s = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "LiveEnableIPV6", "true"));
                    if (this.mNetStackType == 1) {
                        AVSDKLog.e(this.mLogContext, "only support ipv4 cdn ip");
                    } else {
                        z = s;
                    }
                    StringBuilder sb = new StringBuilder(128);
                    String k = z5r.k(this.mPlayUrl, z, sb);
                    if (!TextUtils.isEmpty(sb.toString())) {
                        this.mBackupCdnIp = sb.toString();
                    }
                    return k;
                } else if (r7tVar != null && r7tVar.d == 2) {
                    if (r7tVar.F0 && TextUtils.isEmpty(this.mBackupCdnIp.toString())) {
                        String g = z5r.g(this.mPlayUrl, false);
                        if (!TextUtils.isEmpty(g)) {
                            this.mBackupCdnIp = g;
                            feh fehVar = this.mLogContext;
                            AVSDKLog.e(fehVar, "get ipv4 mBackupCdnIp:" + this.mBackupCdnIp);
                        }
                    }
                    if (this.mNetStackType == 1) {
                        AVSDKLog.e(this.mLogContext, "only support ipv4 cdn_ip");
                        return z5r.g(this.mPlayUrl, false);
                    }
                    boolean s2 = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "VideoEnableIPV6", "true"));
                    feh fehVar2 = this.mLogContext;
                    AVSDKLog.e(fehVar2, "support ipv6 cdn_ip=" + s2);
                    return getHttpDnsOriginIP(this.mPlayUrl, s2);
                }
            } else if (isGrtnUrl(this.mPlayUrl)) {
                boolean s3 = ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GRTNEnableIPV6", "true"));
                if (this.mNetStackType != 1) {
                    z = s3;
                }
                if (ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "GrtnRtcLiveMultipleIPEnable", "true"))) {
                    try {
                        ArrayList<String> q = z5r.q(this.mPlayUrl, z);
                        if (!q.isEmpty()) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<String> it = q.iterator();
                            while (it.hasNext()) {
                                jSONArray.add(it.next());
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(DnsPreference.KEY_IPS, (Object) jSONArray);
                            this.mServerIPJson = jSONObject.toJSONString();
                            feh fehVar3 = this.mLogContext;
                            AVSDKLog.e(fehVar3, "getCdnIp get serverIPList is " + this.mServerIPJson);
                        }
                    } catch (Exception e) {
                        feh fehVar4 = this.mLogContext;
                        AVSDKLog.e(fehVar4, "getCdnIp get srverIPList exception " + e.toString());
                    }
                }
                return getHttpDnsOriginIP(this.mPlayUrl, z);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public String getCdnIpForDebug() {
        return this.mCdnIp;
    }

    public r7t getCloneConfig() {
        return this.mConfigClone;
    }

    public r7t getConfig() {
        return this.mConfig;
    }

    public long getConsumedData() {
        return 0L;
    }

    public String getDynamicPlayExParam(String str) {
        HashMap<String, String> hashMap;
        if (!TextUtils.isEmpty(str) && (hashMap = this.mDynamicPlayExMap) != null && hashMap.size() > 0) {
            for (Map.Entry<String, String> entry : this.mDynamicPlayExMap.entrySet()) {
                if (str.equals(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return "";
    }

    public String getEncodeType() {
        return this.mEncodeType;
    }

    public String getExperienceBuctetId() {
        return "";
    }

    public String getExperienceId() {
        return "";
    }

    public String getExperienceReleaseId() {
        return "";
    }

    public String getExterntPlayEx() {
        return "";
    }

    public int getLastErrorCode() {
        return this.mLastErrorCode;
    }

    public feh getLogContext() {
        return this.mLogContext;
    }

    public void getMoreRenderStallInfoIfNeeded() {
        if (this.videoRenderingStalledCountNew_43833053 == 1) {
            StringBuilder sb = playExperienceBuilder.get();
            sb.setLength(0);
            sb.append(",_vst_time=");
            sb.append(System.currentTimeMillis());
            sb.append(",_vst_video_bytes=");
            sb.append(this.mVideoCacheBytesInRendering);
            sb.append(",_vst_video_frames=");
            sb.append(this.mVideoCacheFramesInRendering);
            sb.append(",_vst_recv_byte=");
            sb.append(this.mReceiveFramesInRendering);
            sb.append(",_vst_req_byte=");
            sb.append(this.mRequestBytesInRendering);
            this.mRenderStallStatInfoForFirstTime = sb.toString();
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "_vst_video_bytes size is :" + this.mRenderStallStatInfoForFirstTime.length());
        }
    }

    public List<Integer> getNetworkQualityStateNodes() {
        return new ArrayList();
    }

    public long getPlayTimeByVideoResolution(String str) {
        if (TextUtils.isEmpty(str) || !this.mVideoResolutionPlayTimeMap.containsKey(str)) {
            return 0L;
        }
        return this.mVideoResolutionPlayTimeMap.get(str).longValue();
    }

    public String getPlayUrl() {
        return this.mPlayUrl;
    }

    public LinkedList<Integer> getPlayerEventListForDebug() {
        return this.mPlayerEventList;
    }

    public String getPlayingLiveDefinition() {
        return this.mPlayingLiveDefinition;
    }

    public long getPoorNetworkTime() {
        return -1L;
    }

    public long getRecData() {
        return 0L;
    }

    public long getRenderingStalledCountNewByVideoResolution(String str) {
        if (TextUtils.isEmpty(str) || !this.mVideoResolutionRenderingStalledCountMap.containsKey(str)) {
            return 0L;
        }
        return this.mVideoResolutionRenderingStalledCountMap.get(str).longValue();
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public String getVideoResolution(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        if (min <= 360 && max <= 640) {
            return VIDEO_RESOLUTION_360P;
        }
        if (min <= 540 && max <= 960) {
            return VIDEO_RESOLUTION_540P;
        }
        if (min <= 720 && max <= 1280) {
            return VIDEO_RESOLUTION_720P;
        }
        if (min <= 1088 && max <= 1920) {
            return VIDEO_RESOLUTION_1080P;
        }
        if (min <= 1440 && max <= 2560) {
            return "2k";
        }
        if (min > 1440 || max > 2560) {
            return VIDEO_RESOLUTION_over2k;
        }
        return "other";
    }

    public void initDisableAudio(boolean z) {
        if (z) {
            this.mDisablePullAudio = 1;
        } else {
            this.mDisablePullAudio = 0;
        }
    }

    public boolean isArtpUrl(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(TaoLiveVideoView.TBLIVE_ARTP_SCHEMA)) {
            return true;
        }
        return false;
    }

    public boolean isAudioHardwareDecode() {
        return true;
    }

    public boolean isCompleteHitCache() {
        return this.bIsCompleteHitCache;
    }

    public boolean isGrtnRtcLiveUrl(String str) {
        return isGrtnUrl(str) && MediaConstant.RTCLIVE_URL_NAME.equals(this.mConfigClone.N);
    }

    public boolean isGrtnUrl(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA)) {
            return true;
        }
        return false;
    }

    public boolean isHardwareDecode() {
        return true;
    }

    public boolean isHitCache() {
        return this.bIsHitCache;
    }

    public boolean isOptSourcerPipeSizeByExtern() {
        String str;
        r7t r7tVar = this.mConfigClone;
        if (r7tVar == null) {
            return false;
        }
        Map<String, String> map = r7tVar.U;
        if (map == null && r7tVar.V == null) {
            return false;
        }
        if (map != null) {
            str = map.get("optSourcerPipeSize");
        } else {
            Map<String, String> map2 = r7tVar.V;
            if (map2 != null) {
                str = map2.get("optSourcerPipeSize");
            } else {
                str = "";
            }
        }
        return ew0.s(str);
    }

    public boolean isRtcUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.contains(TaoLiveVideoView.TBLIVE_ARTP_SCHEMA) && !str.contains(TaoLiveVideoView.TBLIVE_GRTN_SCHEMA)) {
            return false;
        }
        return true;
    }

    public boolean isSwitchUp(String str, String str2) {
        boolean z = true;
        boolean z2 = MediaConstant.DEFINITION_UD.equals(str2) || MediaConstant.DEFINITION_UD_60.equals(str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return z2;
        }
        List asList = Arrays.asList(MediaPlayControlContext.PRIORITY_OF_NEW_DEFINITION);
        if (!asList.contains(str) || !asList.contains(str2)) {
            return z2;
        }
        if (asList.indexOf(str) <= asList.indexOf(str2)) {
            z = false;
        }
        return z;
    }

    public boolean isUseVideoCache() {
        return this.bUseVideoCache;
    }

    public boolean isUserIdHitRate(String str, long j) {
        if (j == 10000) {
            return true;
        }
        if (j != 0 && !TextUtils.isEmpty(str)) {
            long v = ew0.v(str);
            if (v == 0) {
                return false;
            }
            long j2 = v % 10000;
            if (j2 >= 0 && j2 < j) {
                return true;
            }
        }
        return false;
    }

    public void monitorAbnormalRenderSpeed(long j, long j2) {
        long j3 = j - this.mTn;
        long j4 = j2 - this.mTDn;
        float f = ((((float) (j3 - j4)) * 1.0f) / ((float) j4)) * 1.0f;
        if (j4 != 0) {
            float f2 = this.mAbnormalPlaySpeedThreshold;
            if (f >= f2) {
                if (this.mCurrRenderingStatus == 2) {
                    int i = this.mAbnormalPlayFrameCount;
                    if (i >= this.mValidAbnormalFrameCount) {
                        this.mTotalQuickPlayTime += this.mAbnormalPlayDuration;
                        this.mTotalQuickPlayFrameCount += i;
                    }
                    this.mTotalQuickFrameCountAll += i;
                    this.mTotalQuickPlayTimeAll += this.mAbnormalPlayDuration;
                    this.mAbnormalPlayFrameCount = 0;
                    this.mAbnormalPlayDuration = 0L;
                }
                this.mCurrRenderingStatus = 1;
                this.mAbnormalPlayFrameCount++;
                this.mAbnormalPlayDuration += j3;
            } else if (f <= f2 * (-1.0f)) {
                if (this.mCurrRenderingStatus == 1) {
                    int i2 = this.mAbnormalPlayFrameCount;
                    if (i2 >= this.mValidAbnormalFrameCount) {
                        this.mTotalSlowPlayTime += this.mAbnormalPlayDuration;
                        this.mTotalSlowPlayFrameCount += i2;
                    }
                    this.mTotalSlowFrameCountAll += i2;
                    this.mTotalSlowPlayTimeAll += this.mAbnormalPlayDuration;
                    this.mAbnormalPlayFrameCount = 0;
                    this.mAbnormalPlayDuration = 0L;
                }
                this.mCurrRenderingStatus = 2;
                this.mAbnormalPlayFrameCount++;
                this.mAbnormalPlayDuration += j3;
            } else {
                int i3 = this.mCurrRenderingStatus;
                if (i3 == 1) {
                    long j5 = this.mTotalSlowFrameCountAll;
                    int i4 = this.mAbnormalPlayFrameCount;
                    this.mTotalSlowFrameCountAll = j5 + i4;
                    long j6 = this.mTotalSlowPlayTimeAll;
                    long j7 = this.mAbnormalPlayDuration;
                    this.mTotalSlowPlayTimeAll = j6 + j7;
                    if (i4 >= this.mValidAbnormalFrameCount) {
                        this.mTotalSlowPlayTime += j7;
                        this.mTotalSlowPlayFrameCount += i4;
                    }
                } else if (i3 == 2) {
                    long j8 = this.mTotalQuickFrameCountAll;
                    int i5 = this.mAbnormalPlayFrameCount;
                    this.mTotalQuickFrameCountAll = j8 + i5;
                    long j9 = this.mTotalQuickPlayTimeAll;
                    long j10 = this.mAbnormalPlayDuration;
                    this.mTotalQuickPlayTimeAll = j9 + j10;
                    if (i5 >= this.mValidAbnormalFrameCount) {
                        this.mTotalQuickPlayTime += j10;
                        this.mTotalQuickPlayFrameCount += i5;
                    }
                }
                this.mCurrRenderingStatus = 0;
                this.mAbnormalPlayDuration = 0L;
                this.mAbnormalPlayFrameCount = 0;
            }
        }
    }

    public void monitorAfterPrepared(long j, String str) {
        Context context;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            context = null;
        } else {
            context = weakReference.get();
        }
        this.mEncodeType = str;
        bli.a().b(context);
        if (mRegisterAppMonitor.compareAndSet(false, true)) {
            registerMonitor();
        }
        this.mIsBackground = ja1.i0();
        IApmEventListener iApmEventListener = new IApmEventListener() { // from class: tv.danmaku.ijk.media.player.MonitorMediaPlayer.3
            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                String str2;
                if (i == 1) {
                    str2 = "NOTIFY_FOREGROUND_2_BACKGROUND";
                    MonitorMediaPlayer.this.changeToBackground(str2, true);
                } else if (i == 2) {
                    str2 = "NOTIFY_BACKGROUND_2_FOREGROUND";
                    MonitorMediaPlayer.this.changeToBackground(str2, false);
                } else if (i != 50) {
                    str2 = "unknown";
                    feh fehVar = MonitorMediaPlayer.this.mLogContext;
                    AVSDKLog.e(fehVar, " Apm event " + str2 + "， is playing " + MonitorMediaPlayer.this.isPlaying());
                } else {
                    str2 = "NOTIFY_FOR_IN_BACKGROUND";
                    MonitorMediaPlayer.this.changeToBackground(str2, true);
                }
                feh fehVar2 = MonitorMediaPlayer.this.mLogContext;
                AVSDKLog.e(fehVar2, " Apm event " + str2 + "， is playing " + MonitorMediaPlayer.this.isPlaying());
            }
        };
        this.mApmEventListener = iApmEventListener;
        c21.c(iApmEventListener);
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, " ApmManager addApmEventListener index = " + this.mPlayerIndex);
        x3r.j(context).i(this);
    }

    public void monitorBufferEnd(long j) {
        if (this.mConfig != null && this.bFirstFrameRendered && this.mBufferingStart > 0) {
            if (this.bSeeked) {
                this.bSeeked = false;
            } else if (!this.bIgnoreAbnormalAfterVideoComplete || !this.mEnableFixAbnormalStatForLoop) {
                if (j <= 0) {
                    j = System.currentTimeMillis();
                }
                long j2 = this.mBufferingStart;
                long j3 = j - j2;
                if (j3 >= 0 && j3 <= 10000) {
                    this.mLastBufferDuration = j3;
                    this.mLastBuffering = j;
                    if (this.mSeekStart == 0 && j2 > this.mRendedTimeInRenderThread) {
                        this.mBufferingCountNew++;
                        this.mBufferingTotalTimeNew += j3;
                    }
                    this.mBufferingCount++;
                    this.mBufferingTotalTime += j3;
                    this.mBufferingHeartBeatCount++;
                    this.mBufferingHeartBeatMsg.append(System.currentTimeMillis() + ":" + j3 + "#");
                    this.mBufferingHeartBeatTotalTime = this.mBufferingHeartBeatTotalTime + j3;
                }
            } else {
                this.bIgnoreAbnormalAfterVideoComplete = false;
            }
        }
    }

    public void monitorBufferStart(long j) {
        boolean z;
        boolean z2 = this.mEnableFixAbnormalStatForFirstRender;
        if (!z2 || (z2 && j > this.mRendedTimeInRenderThread)) {
            z = true;
        } else {
            z = false;
        }
        if (this.bFirstFrameRendered && z) {
            if (j <= 0) {
                j = System.currentTimeMillis();
            }
            this.mBufferingStart = j;
        }
        monitorPlayerEvent(4);
        this.mLastBufferDuration = 0L;
    }

    public void monitorCodecParamChanged() {
        monitorPlayerEvent(35);
    }

    public void monitorComplete() {
        this.bPaused = true;
        checkStatRenderStallFlag();
        monitorPlayerEvent(6);
        monitorPlayerEventNew(10);
        this.mLoopCount++;
    }

    public void monitorEndPlayInBackground() {
        if (this.mLastBgPlayTime != 0) {
            this.mTotalBgPlayTime += System.currentTimeMillis() - this.mLastBgPlayTime;
            this.mLastBgPlayTime = 0L;
        }
        this.mPlayInPIP = false;
    }

    public void monitorEndPlayWithFloatWindow() {
        if (this.mLastFloatWindowsPlayTime != 0) {
            this.mTotalFloatWindowsPlayTime += System.currentTimeMillis() - this.mLastFloatWindowsPlayTime;
            this.mLastFloatWindowsPlayTime = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorError(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorError(int, int):void");
    }

    public void monitorFirstFrameSurfaceUpdateNew(long j) {
        nj9 nj9Var;
        if (j > 0) {
            WeakReference<nj9> weakReference = this.mFirstRenderAdapterRef;
            if (weakReference == null) {
                nj9Var = null;
            } else {
                nj9Var = weakReference.get();
            }
            if (nj9Var == null || nj9Var.getStartTime() <= 0) {
                this.mFirstFrameSurfaceUpdateTime = 0L;
            } else {
                long startTime = j - nj9Var.getStartTime();
                this.mFirstFrameSurfaceUpdateTime = startTime;
                this.mFirstFrameSurfaceUpdateTime = Math.max(0L, startTime);
            }
            long j2 = this.mStartTime;
            if (j2 <= 0 || j - j2 < 0) {
                this.mFirstUpdateTimeFromPlayerStart = j - this.mPrepareStartTime;
            } else {
                this.mFirstUpdateTimeFromPlayerStart = this.mPreparedTime + (j - j2);
            }
        }
    }

    public synchronized void monitorHWContinousDecodeError() {
        ja1.p++;
    }

    public void monitorInitEglError() {
        this.bInitEglError = true;
        ja1.l = false;
    }

    public void monitorMediacodecError() {
        this.bMediacodeError = true;
        monitorHWContinousDecodeError();
        if ("HEVC".equals(this.mEncodeType) && ja1.p >= 2) {
            setForceSelectH264ForH265HWFailed(true);
            resetHWContinousDecodeErrorCount();
        } else if (ja1.p >= 2) {
            ja1.g = false;
            ja1.h = false;
            resetHWContinousDecodeErrorCount();
        }
    }

    public void monitorPause() {
        com.taobao.taobaoavsdk.Tracer.a.i(this.mAnalysis, "PAUSE");
        this.mDebugStatus = prp.CARD_MISS_VIDEO_STATUS_PAUSE;
        onRenderStalledWhenStateChanged(1);
        if (this.mEnableRenderStallCalNew) {
            onRenderStalledWhenStateChangedNew();
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "shengjian::mMaxRenderInterval7 before" + this.mMaxRenderInterval);
        if (this.bFirstFrameRendered && this.mLastMonitorRenderSystemTime > 0) {
            this.mMaxRenderInterval = Math.max(this.mMaxRenderInterval, System.currentTimeMillis() - this.mLastMonitorRenderSystemTime);
        } else if (!this.bFirstFrameRendered && this.mStartTime > 0) {
            this.mMaxRenderInterval = Math.max(this.mMaxRenderInterval, System.currentTimeMillis() - this.mStartTime);
        }
        feh fehVar2 = this.mLogContext;
        AVSDKLog.e(fehVar2, "shengjian::mMaxRenderInterval7 after" + this.mMaxRenderInterval);
        this.mLastRenderVideoEveryFrame = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.bPaused = true;
        monitorPlayerEvent(3);
        monitorPlayerEventNew(7);
        checkStatRenderStallFlag();
        onRenderingHung();
        if (this.mEnableRenderStallCalNew) {
            onRenderingHungV2();
        }
        com.taobao.taobaoavsdk.Tracer.a.h(this.mAnalysis, "PAUSE");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:7|(1:9)(1:10)|11|(68:398|12|13|(3:15|(1:17)(1:21)|22)(1:23)|24|(5:412|26|27|406|28)(1:34)|35|(1:39)|40|(1:42)(1:43)|44|(1:47)|48|49|(1:51)(2:52|(11:54|55|(1:63)(2:59|(1:61)(1:62))|64|(1:66)(2:67|(1:69)(1:70))|71|(1:73)|74|(2:76|(2:80|83))(1:82)|81|83)(1:84))|85|86|(1:91)(1:90)|92|(1:96)|97|(1:109)(2:100|(1:108))|110|(1:112)(1:113)|114|(3:122|(1:124)|125)|126|(1:130)|131|(1:135)|136|137|(6:392|139|140|(10:143|144|400|145|(2:436|147)(2:150|(2:435|152)(2:153|(4:434|155|440|438)(2:437|156)))|148|439|438|404|141)|433|158)(1:161)|162|(1:164)(1:165)|166|(1:168)|169|(1:171)|172|(1:174)|175|(4:177|(1:179)(1:180)|181|(1:183))(1:184)|185|(1:189)|190|(1:192)|193|(4:195|(1:197)|198|(1:200))|201|(1:203)|204|(3:206|(1:211)(1:210)|212)(1:213)|214|(2:218|(1:220))|221|(1:223)|224|(2:228|(1:230))|231|(1:233)(1:234)|235|(1:237)|390|238|394|239|240)|(7:(5:416|241|242|402|243)|(2:362|(16:364|366|(1:368)|369|(1:371)|372|(1:374)|375|396|376|377|410|378|(1:380)|383|442))|410|378|(0)|383|442)|248|(1:250)|251|(1:253)|254|(1:256)|257|(1:301)(24:263|(1:265)(1:266)|267|(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:284)|285|(1:287)|288|(1:290)|291|(1:293)|294|408|295|(1:297))|302|(3:304|(1:306)(1:307)|308)|309|(1:317)|318|(1:320)|321|(7:323|324|414|325|326|(1:328)(1:329)|330)|335|(3:337|(1:357)(3:343|(4:346|(3:426|348|(2:425|(2:424|(3:423|352|428)(3:419|353|429))(3:418|354|430))(3:421|355|431))(3:420|356|432)|427|344)|422)|358)|359|360|365|366|(0)|369|(0)|372|(0)|375|396|376|377) */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x2907, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x2908, code lost:
        r2 = r395;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09ac A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x09d9 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0ad7 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b05 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0b1f A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b2b A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b37 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b74 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0b94 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0bd4 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0be0 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0c64 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0c78 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0c88 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0c91 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0ca4 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0cb2 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0cb5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0cc2 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0d36 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d48 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d59 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0d6b A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0ec2 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0fba A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0fd6 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x114e A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x15c6 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1677 A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x1691  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x16a1  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x16ac A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x28e5 A[Catch: all -> 0x28f5, TryCatch #10 {all -> 0x28f5, blocks: (B:378:0x28e1, B:380:0x28e5, B:383:0x28f8), top: B:410:0x28e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0a20 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d6 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x037f A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:12:0x0086, B:15:0x008f, B:17:0x00d9, B:21:0x00ee, B:22:0x00f0, B:24:0x0118, B:33:0x0238, B:35:0x024f, B:37:0x02be, B:39:0x02c2, B:40:0x02d0, B:43:0x02d6, B:44:0x02dc, B:47:0x02e2, B:48:0x02ee, B:52:0x037f, B:54:0x0383, B:64:0x06a5, B:71:0x06c8, B:73:0x06d0, B:74:0x06db, B:76:0x07b6, B:78:0x07d1, B:80:0x07d7, B:83:0x07e5, B:85:0x091a, B:88:0x0926, B:92:0x0933, B:94:0x093b, B:96:0x0943, B:97:0x0947, B:100:0x0953, B:102:0x095b, B:104:0x0964, B:106:0x0971, B:108:0x0986, B:110:0x099c, B:112:0x09ac, B:114:0x09bc, B:116:0x09c0, B:118:0x09c4, B:120:0x09cd, B:122:0x09d3, B:124:0x09d9, B:125:0x09e0, B:126:0x09e7, B:128:0x09fa, B:130:0x0a00, B:131:0x0a07, B:133:0x0a0b, B:135:0x0a11, B:136:0x0a16, B:139:0x0a20, B:141:0x0a2a, B:143:0x0a30, B:145:0x0a3d, B:147:0x0a47, B:150:0x0a57, B:152:0x0a64, B:153:0x0a6d, B:155:0x0a7a, B:156:0x0a84, B:160:0x0aaf, B:162:0x0acf, B:164:0x0ad7, B:166:0x0b01, B:168:0x0b05, B:169:0x0b19, B:171:0x0b1f, B:172:0x0b25, B:174:0x0b2b, B:175:0x0b31, B:177:0x0b37, B:179:0x0b3f, B:180:0x0b48, B:181:0x0b61, B:183:0x0b69, B:184:0x0b74, B:185:0x0b7c, B:189:0x0b86, B:190:0x0b8e, B:192:0x0b94, B:193:0x0bab, B:197:0x0bb5, B:200:0x0bc0, B:201:0x0bca, B:203:0x0bd4, B:204:0x0bda, B:206:0x0be0, B:208:0x0be9, B:210:0x0bed, B:212:0x0c0d, B:214:0x0c5a, B:216:0x0c64, B:218:0x0c6a, B:220:0x0c78, B:221:0x0c80, B:223:0x0c88, B:224:0x0c8d, B:226:0x0c91, B:228:0x0c97, B:230:0x0ca4, B:231:0x0ca7, B:233:0x0cb2, B:235:0x0cb6, B:237:0x0cc2, B:238:0x0cc7, B:239:0x0ce9, B:241:0x0cf0, B:243:0x0d03, B:247:0x0d12, B:248:0x0d1e, B:250:0x0d36, B:251:0x0d40, B:253:0x0d48, B:254:0x0d52, B:256:0x0d59, B:257:0x0d65, B:259:0x0d6b, B:261:0x0d73, B:263:0x0d77, B:265:0x0d8d, B:267:0x0d9a, B:269:0x0da7, B:270:0x0daf, B:272:0x0dbc, B:273:0x0dc4, B:275:0x0dd1, B:276:0x0dd9, B:278:0x0de6, B:279:0x0dee, B:281:0x0dfb, B:282:0x0e03, B:284:0x0e10, B:285:0x0e18, B:287:0x0e2c, B:288:0x0e34, B:290:0x0e3a, B:291:0x0e42, B:293:0x0e51, B:294:0x0e59, B:295:0x0e81, B:297:0x0e93, B:300:0x0e9e, B:302:0x0ebe, B:304:0x0ec2, B:308:0x0f9e, B:309:0x0fa1, B:311:0x0fba, B:313:0x0fc0, B:315:0x0fc8, B:317:0x0fcc, B:318:0x0fd2, B:320:0x0fd6, B:321:0x0fe2, B:323:0x114e, B:326:0x119e, B:330:0x11b1, B:335:0x15c0, B:337:0x15c6, B:339:0x15d4, B:341:0x15d8, B:343:0x15e0, B:344:0x15ea, B:346:0x15f0, B:358:0x1611, B:359:0x1669, B:362:0x1677, B:364:0x167e, B:366:0x1686, B:369:0x1693, B:372:0x16a3, B:374:0x16ac, B:375:0x16c0), top: B:398:0x0086, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorPlayExperience() {
        /*
            Method dump skipped, instructions count: 10533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorPlayExperience():void");
    }

    public void monitorPrepared(long j) {
        nj9 nj9Var;
        com.taobao.taobaoavsdk.Tracer.a.h(this.mAnalysis, "PREPARE");
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.mPreparedTime = j - this.mPrepareStartTime;
        WeakReference<nj9> weakReference = this.mFirstRenderAdapterRef;
        Context context = null;
        if (weakReference == null) {
            nj9Var = null;
        } else {
            nj9Var = weakReference.get();
        }
        if (nj9Var == null || nj9Var.getStartTime() <= 0) {
            this.mUserPreparedTime = this.mPreparedTime;
        } else {
            this.mUserPreparedTime = j - nj9Var.getStartTime();
        }
        this.mStartTime = j;
        this.mVideoDuration = getDuration() / 1000;
        r7t r7tVar = this.mConfig;
        if (r7tVar != null) {
            this.mConfigClone = r7tVar.clone();
        }
        WeakReference<Context> weakReference2 = this.mContextRef;
        if (weakReference2 != null) {
            context = weakReference2.get();
        }
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (!(activity.getIntent() == null || activity.getIntent().getData() == null || TextUtils.isEmpty(activity.getIntent().getData().toString()))) {
                this.mPageUrl = activity.getIntent().getData().toString();
            }
        }
        monitorPlayerEvent(1);
        monitorPlayerEventNew(2);
    }

    public void monitorRenderSecondStart(long j) {
        long j2;
        this.mWatchPhase = 2;
        this.bSecondFrameRendered = true;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.mSecondEndtime = j;
        long j3 = this.mStartTime;
        if (j3 <= 0 || j - j3 < 0) {
            j2 = j - this.mPrepareStartTime;
        } else {
            j2 = this.mPreparedTime + (j - j3);
        }
        this.mSecondRenderTime = j2;
    }

    public void monitorReset() {
        this.mEnableVPM = false;
        this.mState = 0;
        this.mLastState = 0;
        this.mRotate = 0;
        this.mReuseFlag = false;
        this.mFirstRenderRecvTime = 0L;
        this.mLastCommitPlaying = 0L;
        this.mWarmupStartTime = 0L;
        this.mWarmupEndTime = 0L;
        this.mEnableVFPlugin = false;
        this.mEnableMediacodecOpengl = false;
        this.mWatchExceedNum1 = 0L;
        this.mWatchExceedTime1 = 0L;
        this.mWatchExceedNum2 = 0L;
        this.mWatchExceedTime2 = 0L;
        this.mSeamlessSwitchStatus = -1;
        this.mSeamlessSwitchIndex = 0;
        this.mSeekStart = 0L;
    }

    public void monitorRtcAudioTrackBufferEnd() {
        synchronized (this.mTimeLock) {
            try {
                if (this.mRtcAudioTrackBufferStart > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.mRtcAudioTrackBufferStart;
                    if (currentTimeMillis > 0) {
                        this.mRtcAudioTrackBufferCount++;
                        this.mRtcAudioTrackBufferTotalTime += currentTimeMillis;
                    }
                }
                this.mRtcAudioTrackBufferStart = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void monitorRtcAudioTrackBufferStart() {
        this.mRtcAudioTrackBufferStart = System.currentTimeMillis();
    }

    public void monitorRtcCommonTraceInfo(String str) {
        String str2;
        String next;
        if (!TextUtils.isEmpty(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                String optString = jSONObject.optString("traceType");
                if (!TextUtils.isEmpty(optString)) {
                    AVSDKLog.e(this.mLogContext, "monitorRtcCommonTraceInfo: " + str);
                    Iterator<String> keys = jSONObject.keys();
                    String str3 = "pageName=" + c2v.getInstance().getCurrentPageName();
                    while (keys.hasNext()) {
                        String str4 = str3 + ",";
                        str3 = ((str4 + keys.next()) + "=") + jSONObject.get(next);
                    }
                    long j = this.mTotalPlayTime;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis > this.mLastPlayTime) {
                        j += currentTimeMillis - this.mLastPlayTime;
                    }
                    String str5 = "playToken=" + this.mConfigClone.t;
                    String str6 = "accountId=" + this.mConfigClone.C;
                    String str7 = "feedId=" + this.mConfigClone.B;
                    String str8 = "playTime=" + j;
                    String str9 = "subBusinessType=" + this.mConfigClone.y;
                    String str10 = "switchReason=" + getLastStreamSelectReason();
                    StringBuilder sb = new StringBuilder();
                    sb.append("autoSwitch=");
                    if (this.mRtcLiveAutoSwitch) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    sb.append(str2);
                    String[] strArr = {str5, str6, str7, str8, str9, str10, sb.toString(), "abtestId=" + getDynamicPlayExParam("adaption_abtest_id"), str3};
                    if (TextUtils.equals(optString, "0")) {
                        commitStat19997("Page_Video", CT.Button, "RtcLiveSwitchStream", strArr);
                    }
                }
            } catch (Throwable th) {
                AVSDKLog.e(this.mLogContext, "monitorRtcCommonTraceInfo " + str + ", error: " + th.toString());
            }
        }
    }

    public void monitorRtcVideoTrackBufferEnd() {
        synchronized (this.mTimeLock) {
            try {
                if (this.mRtcVideoTrackBufferStart > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.mRtcVideoTrackBufferStart;
                    if (currentTimeMillis > 0) {
                        this.mRtcVideoTrackBufferCount++;
                        this.mRtcVideoTrackBufferTotalTime += currentTimeMillis;
                    }
                }
                this.mRtcVideoTrackBufferStart = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void monitorRtcVideoTrackBufferStart() {
        this.mRtcVideoTrackBufferStart = System.currentTimeMillis();
        monitorPlayerEvent(40);
        this.mStallReason = 1L;
        this.mStallStartTime = System.currentTimeMillis();
        monitorPlayerEventNew(11);
    }

    public void monitorSeamlessSwitchFailed(long j, long j2) {
        monitorPlayerEvent(31);
        this.mSwitchByRtc = false;
        this.mSwitchFailCounter++;
        this.mSeamlessSwitchStatus = 1;
        commitSeamlessSwitchStats(j, j2, false);
    }

    public void monitorSeek() {
        if (this.mDisableFixSeekCount || !(this instanceof TaobaoMediaPlayer)) {
            this.mSeekCount++;
        }
        this.bSeeked = true;
        monitorPlayerEvent(5);
    }

    public void monitorSeekEnd(long j) {
        com.taobao.taobaoavsdk.Tracer.a.h(this.mAnalysis, "SEEK");
        onRenderingResumed();
        if (this.mEnableRenderStallCalNew) {
            onRenderingResumedV2();
        }
        checkStatRenderStallFlag();
        long j2 = this.mSeekStart;
        if (j2 > 0 && j > j2) {
            long j3 = j - j2;
            this.mCurrSeekTime = j3;
            this.seekTimeList.add(Long.valueOf(j3));
            long j4 = this.mCurrSeekTime;
            if (j4 > this.maxSeekTime) {
                this.maxSeekTime = j4;
            }
            this.mSeekTime += j4;
            this.mSeekStart = 0L;
            this.mLastRenderVideoEveryFrame = 0L;
            this.mLastMonitorRenderSystemTime = 0L;
        }
    }

    public void monitorSeekStart(long j) {
        com.taobao.taobaoavsdk.Tracer.a.i(this.mAnalysis, "SEEK");
        if (this.bFirstFrameRendered) {
            this.mSeekStart = j;
            if (!this.mDisableFixSeekCount) {
                this.mSeekCount++;
            }
            onRenderStalledWhenStateChanged(2);
            if (this.mEnableRenderStallCalNew) {
                onRenderStalledWhenStateChangedNew();
            }
            this.mLastRenderVideoEveryFrame = 0L;
            this.mLastMonitorRenderSystemTime = 0L;
        }
        checkStatRenderStallFlag();
        onRenderingHung();
        if (this.mEnableRenderStallCalNew) {
            onRenderingHungV2();
        }
    }

    public void monitorSetAudiOff() {
        monitorPlayerEvent(25);
        monitorPlayerEventNew(15);
    }

    public void monitorSetAudioOn() {
        monitorPlayerEvent(26);
        monitorPlayerEventNew(14);
    }

    public synchronized void monitorSoftwareByFallBack() {
        ja1.o++;
    }

    public void monitorSourcerRetryErr(int i) {
        this.mLastErrorCode = i;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "monitorSourcerRetryErr errorCode: " + i);
    }

    public void monitorStart() {
        com.taobao.taobaoavsdk.Tracer.a.i(this.mAnalysis, "PLAYING");
        this.mDebugStatus = "Start";
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "monitorStart sys:" + System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        this.mStartTime = currentTimeMillis;
        if (this.mFirstPlayTime == 0) {
            this.mFirstPlayTime = currentTimeMillis;
        }
        if (this.mCacheLengthAtStart == -1) {
            WeakReference<Context> weakReference = this.mContextRef;
            this.mCacheLengthAtStart = ja1.w(weakReference == null ? null : weakReference.get(), this.mConfig.r, this.mPlayUrl);
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "mCacheLengthAtStart=" + this.mCacheLengthAtStart + ", cachekey=" + this.mConfig.r + ", mPlayUrl=" + this.mPlayUrl);
        }
        monitorPlayerEvent(2);
        monitorPlayerEventNew(3);
        onRenderingResumed();
        if (this.mEnableRenderStallCalNew) {
            onRenderingResumedV2();
        }
        this.bPaused = false;
        checkStatRenderStallFlag();
        com.taobao.taobaoavsdk.Tracer.a.h(this.mAnalysis, "PLAYING");
    }

    public void monitorStartPlayInBackground() {
        this.mLastBgPlayTime = System.currentTimeMillis();
        this.mPlayInPIP = true;
        this.mTotalBgCount++;
    }

    public void monitorStartPlayWithFloatWindow() {
        this.mLastFloatWindowsPlayTime = System.currentTimeMillis();
        this.mTotalFloatWindowsCount++;
    }

    public void monitorTriggerSwitchFromRtc() {
        this.mSwitchByRtc = true;
        if (this.mArtcFirstAbrSwitchTime <= 0) {
            long j = this.mTotalPlayTime;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.mLastPlayTime) {
                j += currentTimeMillis - this.mLastPlayTime;
            }
            this.mArtcFirstAbrSwitchTime = j;
        }
        monitorPlayerEvent(41);
    }

    public void monitorVideoRenderEveryFrame(long j) {
        int i;
        double d;
        float f;
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || ((ja1.i0() && !this.mIsFloatWindow) || ((!this.mEnableStatRenderStallInNonVisible && !this.mViewIsVisible) || (!this.mEnableStatRenderStallInNonSurface && this.mSurface == null)))) {
            this.mLastRenderVideoEveryFrame = 0L;
            if (ja1.i0() != this.mIsBackground) {
                AVSDKLog.e(this.mLogContext, " monitorVideoRenderEveryFrame ApplicationUtils.isRunBackground() is not equal!!!");
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        monitorVideoRenderEveryFrameOld(currentTimeMillis);
        if (!this.isFirstFrameRendered) {
            this.mTD = j;
            this.mT = currentTimeMillis;
            this.isFirstFrameRendered = true;
            this.mTn = currentTimeMillis;
            this.mTDn = j;
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "SYNC monitorVideoRenderEveryFrameT=" + this.mT + "TD=" + this.mTD);
            return;
        }
        long j2 = this.mT;
        double d2 = -1.0d;
        if (j2 == -9999) {
            long j3 = currentTimeMillis - this.mResumeTs;
            this.mT = currentTimeMillis;
            this.mTD = j;
            if (j3 > this.mMaxRenderAbnormalInRenderThread) {
                d2 = j3;
            }
            d = vu3.b.GEO_NOT_SUPPORT;
            i = 0;
        } else {
            long abs = Math.abs((currentTimeMillis - j2) - (j - this.mTD));
            long j4 = this.mTDn;
            if (j > j4 || !this.mEnableAddUnorderedStall) {
                long j5 = this.mT;
                long j6 = this.mTD;
                int i2 = this.mMaxRenderAbnormalInRenderThread;
                if ((currentTimeMillis - j5) - (j - j6) > i2) {
                    this.mTotalRenderIntervalDiff += abs;
                    double d3 = (currentTimeMillis - j5) - (j - j6);
                    if (this.mUsePlayRateCalSubStall) {
                        int i3 = this.mRtcTotalCount;
                        if (i3 != 0) {
                            f = this.mRtcTotalRate / i3;
                        } else {
                            f = 1.0f;
                        }
                        this.mRtcPlayRate = f;
                        if (f == 0.0f) {
                            f = 1.0f;
                        }
                        this.mRtcPlayRate = f;
                        if (((float) (currentTimeMillis - j5)) - (((float) (j - j6)) / f) < i2) {
                            this.mRtcStrategicAbnormalCount++;
                            this.mRtcStrategicAbnormalTime = (long) (this.mRtcStrategicAbnormalTime + d3);
                            this.mRtcTotalRate = 0.0f;
                            this.mRtcTotalCount = 0;
                            this.mT = currentTimeMillis;
                            this.mTD = j;
                            i = 1;
                            d2 = vu3.b.GEO_NOT_SUPPORT;
                        }
                    }
                    d2 = d3;
                    i = 1;
                } else {
                    long j7 = this.mTn;
                    if (currentTimeMillis - j7 > i2) {
                        i = 2;
                        d2 = currentTimeMillis - j7;
                    } else {
                        i = 0;
                    }
                }
            } else {
                double d4 = j4 - j;
                if (j == j4) {
                    this.duplicateFrameCount++;
                }
                d2 = d4;
                i = 4;
            }
            if (this.mTn != -9999 && this.mTDn != -9999 && j > 0 && currentTimeMillis > 0) {
                monitorAbnormalRenderSpeed(currentTimeMillis, j);
            }
            d = vu3.b.GEO_NOT_SUPPORT;
        }
        if (d2 > d || i == 4) {
            if (!this.mIsFirstRenderStalledPtsRecorded) {
                this.mFirstRenderStalledPts = j;
                this.mIsFirstRenderStalledPtsRecorded = true;
            }
            double abs2 = Math.abs(d2);
            if (abs2 <= currentTimeMillis - this.mLastPlayTime) {
                onRenderStalledNew_43833053(abs2, i, -1);
            }
            this.mT = currentTimeMillis;
            this.mTD = j;
            this.mRtcTotalRate = 0.0f;
            this.mRtcTotalCount = 0;
        }
        this.mTn = currentTimeMillis;
        this.mTDn = j;
        colloectMoreRenderStallInfo();
    }

    public void monitorVideoRenderNormal() {
        if (this.mState != 10) {
            monitorPlayerEvent(10);
        } else {
            monitorPlayerEventNew(12);
        }
    }

    public void monitorVideoRenderStalled(long j) {
        long j2;
        if (this.mConfig != null && this.bFirstFrameRendered) {
            com.taobao.taobaoavsdk.Tracer.a.j(this.mAnalysis, "VIDEO_STALL");
            monitorPlayerEvent(9);
            this.mStallStartTime = System.currentTimeMillis();
            monitorPlayerEventNew(11);
            this.videoRenderingStalledCount++;
            long j3 = this.videoRenderingStalledTotalDuration;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                j2 = j;
            } else {
                j2 = 0;
            }
            this.videoRenderingStalledTotalDuration = j3 + j2;
            if (this.mConfig.d == 0) {
                this.videoRenderingStalledCount_live++;
                long j4 = this.videoRenderingStalledTotalDuration_live;
                if (i <= 0) {
                    j = 0;
                }
                this.videoRenderingStalledTotalDuration_live = j4 + j;
            }
        }
    }

    public void monitorVideoRotateChange(int i) {
        this.mRotate = i;
    }

    public void monitorWarmup(long j) {
        this.mWarmupEndTime = System.currentTimeMillis();
        this.mWarmupReceiveBytes = j;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "monitorWarmup sys:" + this.mWarmupEndTime + ",receiveBytes=" + this.mWarmupReceiveBytes);
    }

    public void notifyHttpDnsAdapterConnectionEvent() {
        if (!TextUtils.isEmpty(this.mPlayUrl) && MediaAdapteManager.mConfigAdapter != null) {
            if (this.mConfig.d == 0 || this.mPlayUrl.contains(".m3u8") || this.bUseVideoCache) {
                synchronized (this.mHttpDnsOriginLock) {
                    try {
                        HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin = this.mHttpDnsOrigin;
                        if (httpDnsOrigin != null && !TextUtils.isEmpty(httpDnsOrigin.getOriginIP())) {
                            String originIP = this.mHttpDnsOrigin.getOriginIP();
                            if (originIP.contains(":")) {
                                boolean z = false;
                                if (isRtcUrl(this.mPlayUrl)) {
                                    String rtcSfuIP = getRtcSfuIP();
                                    if (!TextUtils.isEmpty(rtcSfuIP)) {
                                        if (originIP.equals(rtcSfuIP) && this.mLastErrorCode == -10608) {
                                            HttpDnsAdapter.notifyConnEvent(Uri.parse(this.mPlayUrl).getHost(), this.mHttpDnsOrigin, z);
                                        }
                                        z = true;
                                        HttpDnsAdapter.notifyConnEvent(Uri.parse(this.mPlayUrl).getHost(), this.mHttpDnsOrigin, z);
                                    }
                                } else if (this.mPlayUrl.contains(".flv")) {
                                    if (!TextUtils.isEmpty(this.mServerIP)) {
                                        if (!originIP.equals(this.mServerIP)) {
                                            if (!this.mServerIP.contains(":")) {
                                            }
                                            z = true;
                                        }
                                        HttpDnsAdapter.notifyConnEvent(Uri.parse(this.mPlayUrl).getHost(), this.mHttpDnsOrigin, z);
                                    }
                                } else if (!this.mPlayUrl.contains(".m3u8")) {
                                } else {
                                    if (!TextUtils.isEmpty(this.mServerIP)) {
                                        if (!originIP.equals(this.mServerIP)) {
                                            if (!this.mServerIP.contains(":")) {
                                            }
                                            z = true;
                                        }
                                        HttpDnsAdapter.notifyConnEvent(Uri.parse(this.mPlayUrl).getHost(), this.mHttpDnsOrigin, z);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void onRenderStalledNew_43833053(double d, int i, int i2) {
        this.videoRenderingStalledCountNew_43833053++;
        this.videoRenderingStalledTotalDurationNew_43833053 = (long) (this.videoRenderingStalledTotalDurationNew_43833053 + d);
        if (i == 1 || i == 3) {
            this.videoRenderingStalledCountNew_43833053_r1++;
            this.videoRenderingStalledTotalDurationNew_43833053_r1 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r1 + d);
        } else if (i == 4) {
            this.videoRenderingStalledCountNew_43833053_r2++;
            this.videoRenderingStalledTotalDurationNew_43833053_r2 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r2 + d);
        }
        if (i2 >= 0 && i2 < 3) {
            long[] jArr = this.videoRenderingStalledCountNew_43833053_reasons;
            jArr[i2] = jArr[i2] + 1;
        }
        this.monitorNewStalled = true;
        getMoreRenderStallInfoIfNeeded();
    }

    public void onRenderStalledNew_43833053_byDivided(int i, double d, int i2, int i3) {
        long j = i;
        this.videoRenderingStalledCountNew_43833053 += j;
        this.videoRenderingStalledTotalDurationNew_43833053 = (long) (this.videoRenderingStalledTotalDurationNew_43833053 + d);
        if (i2 == 1 || i2 == 3) {
            this.videoRenderingStalledCountNew_43833053_r1 += j;
            this.videoRenderingStalledTotalDurationNew_43833053_r1 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r1 + d);
        } else if (i2 == 4) {
            this.videoRenderingStalledCountNew_43833053_r2 += j;
            this.videoRenderingStalledTotalDurationNew_43833053_r2 = (long) (this.videoRenderingStalledTotalDurationNew_43833053_r2 + d);
        }
        if (i3 >= 0 && i3 < 3) {
            long[] jArr = this.videoRenderingStalledCountNew_43833053_reasons;
            jArr[i3] = jArr[i3] + j;
        }
        this.monitorNewStalled = true;
        getMoreRenderStallInfoIfNeeded();
    }

    public void onRenderStalledWhenStateChanged(int i) {
        if (this instanceof TaobaoMediaPlayer) {
            ((TaobaoMediaPlayer) this)._notifyVideoRenderStateChange();
        }
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || ja1.i0()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "skip stat with pause/seekFlg/error, pts:" + System.currentTimeMillis());
        } else if (this.mLastRenderVideoEveryFrame > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLastRenderVideoEveryFrame;
            if (currentTimeMillis > this.mMaxRenderAbnormalInRenderThread) {
                this.videoRenderingStalledCountInRenderThread++;
                this.videoRenderingStalledTotalDurationInRenderThread += currentTimeMillis;
                onRenderStalledNew_43833053(currentTimeMillis, 3, i);
            }
        }
    }

    public void onRenderStalledWhenStateChangedNew() {
        if (this.bPaused || this.mSeekStart > 0 || this.mLastErrorCode != 0 || ja1.i0()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onRenderStalledWhenStateChangedNew skip stat with pause/seekFlg/error, pts:" + System.currentTimeMillis());
        } else if (this.mLastMonitorRenderSystemTime > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLastMonitorRenderSystemTime;
            if (currentTimeMillis > this.mMaxRenderAbnormalInRenderThread && currentTimeMillis < Math.min(System.currentTimeMillis() - this.mLastPlayTime, 1000000000L)) {
                updateFpsIntervalForStalledCal();
                long floor = (long) (Math.floor((currentTimeMillis * 1.0d) / this.mSourceFpsInterval) - 1.0d);
                this.mVideoRenderingStalledCountNewUpdate += floor;
                this.mVideoRenderingStalledCountNewUpdate_r2 += floor;
                double d = floor;
                if (d > this.mMaxStalledCountInInterval) {
                    this.mMaxStalledCountInInterval = d;
                }
            }
        }
    }

    public void onRenderingHung() {
        if (this.isFirstFrameRendered) {
            this.mT = -9999L;
            this.mTD = -9999L;
            this.mTn = -9999L;
            this.mTDn = -9999L;
            this.mResumeTs = -9999L;
        }
    }

    public void onRenderingHungV2() {
        if (this.mIsFirstFrameRenderedNewUpdate) {
            updateDelayStalledV2WhenEnd();
            this.mLastStalledFrameFramePts = -9999L;
            this.mLastStalledFrameRenderSystemTime = -9999L;
            this.mLastFramePts = -9999L;
            this.mLastFrameRenderSystemTime = -9999L;
            this.mResumeTsNew = -9999L;
        }
    }

    public void onRenderingResumed() {
        if (this.isFirstFrameRendered) {
            this.mResumeTs = System.currentTimeMillis();
        }
    }

    public void onRenderingResumedV2() {
        if (this.mIsFirstFrameRenderedNewUpdate) {
            this.mResumeTsNew = System.currentTimeMillis();
        }
    }

    public synchronized void resetHWContinousDecodeErrorCount() {
        if (ja1.p > 0) {
            ja1.p = 0;
        }
    }

    public synchronized void resetSoftwareByFallBackCount() {
        if (ja1.o > 0) {
            ja1.o = 0;
        }
    }

    public void setABtestAdapter(f0 f0Var) {
        this.mAbTestAdapter = f0Var;
    }

    public void setActiveDataSource(ct6 ct6Var) {
        this.mActiveDataSource = ct6Var;
    }

    public void setAudioClip(boolean z) {
        this.mEnableAudioClip = z;
    }

    public void setAudioGainCoef(float f) {
        this.mAudioGainCoef = f;
    }

    public void setAudioGainEnable(boolean z) {
        this.mEnableAudioGain = z;
    }

    public void setAuthInfoResult(int i, int i2) {
        this.mAuthResultCode = i;
        this.mServerAuthLevel = i2;
    }

    public void setAutoPause(boolean z) {
        this.pauseByTelephone = z;
    }

    public int setConfig(r7t r7tVar) {
        String str;
        this.mConfig = r7tVar;
        this.mConfigClone = r7tVar;
        if (this.mLogContext == null) {
            this.mLogContext = new feh(toString(), this.mConfig.t);
        }
        this.bPauseInBackground = r7tVar.R;
        r7t r7tVar2 = this.mConfig;
        if (!(r7tVar2 == null || (str = r7tVar2.x) == null)) {
            if (str.replaceAll(" ", "").equals("TBLive")) {
                this.AppMonitor_Module = "TBMediaPlayerBundle-android";
            } else {
                this.AppMonitor_Module = "TBMediaPlayerBundle-video";
            }
        }
        this.mAnalysis = this.mConfig.U0;
        this.mUsingInterface = r7tVar.k0;
        checkFromIsValid(r7tVar);
        return 0;
    }

    public void setDegradeCode(int i, String str) {
        this.mDegradeCode = i;
        this.mOriginSelectedUrlName = str;
    }

    public void setDegradeFlvReason(int i) {
        this.mSelectFlvUrlReason = i;
    }

    public void setDynamicPlayExParam(String str) {
        HashMap<String, String> z;
        if (!TextUtils.isEmpty(str) && (z = ew0.z(str, ",", "=")) != null && z.size() > 0) {
            if (this.mDynamicPlayExMap == null) {
                this.mDynamicPlayExMap = new HashMap<>();
            }
            this.mDynamicPlayExMap.putAll(z);
        }
    }

    public void setExtInfo(Map<String, String> map) {
        this.mExtInfo = map;
    }

    public void setFirstRenderAdapter(nj9 nj9Var) {
        if (nj9Var != null) {
            this.mFirstRenderAdapterRef = new WeakReference<>(nj9Var);
        }
    }

    public synchronized void setForceSelectH264ForH265HWFailed(boolean z) {
        ja1.q = z;
    }

    public void setH264AuthenStrategy(H264AuthenStrategy h264AuthenStrategy) {
        this.mH264AuthenStrategy = h264AuthenStrategy;
    }

    public void setH265AuthenStrategy(H265AuthenStrategy h265AuthenStrategy) {
        this.mH265AuthenStrategy = h265AuthenStrategy;
    }

    public void setInnerStartFuncListener(InnerStartFuncListener innerStartFuncListener) {
        if (innerStartFuncListener != null) {
            this.mInnerStartFuncListener = new WeakReference<>(innerStartFuncListener);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z) {
        this.bLooping = z;
    }

    public void setMediaCodeError(int i, int i2) {
        if (this.mMediaCodecInputErrorCode == 0 && this.mMediaCodecOutputErrorCode == 0) {
            this.mMediaCodecInputErrorCode = i;
            this.mMediaCodecOutputErrorCode = i2;
        }
    }

    public void setMediaCodecProcessError(int i) {
        this.mMediaCodecErrorReason = i;
        this.mMediaCodecProcessError = 1;
        r7t r7tVar = this.mConfigClone;
        if (r7tVar != null && r7tVar.L0) {
            ja1.s++;
        }
        AVSDKLog.e(this.mLogContext, " setMediaCodecProcessError " + i);
    }

    public void setNetworkUtilsAdapter(g0d g0dVar) {
        this.mNetworkUtilsAdapter = g0dVar;
    }

    public void setSeekMode(boolean z) {
        this.mEnableSeekFlushBuffer = z;
    }

    public void updateDelayStalledV2WhenEnd() {
        if (this.mIsInDelayStallInterval) {
            this.mVideoRenderingStalledCountNewUpdate += this.mStalledCountInDelayState;
            this.mVideoRenderingStalledCountNewUpdate_r1 += this.mStalledCountInDelayState;
            if (this.mStalledCountInDelayState > this.mMaxStalledCountInDelay) {
                this.mMaxStalledCountInDelay = this.mStalledCountInDelayState;
            }
            this.mStalledCountInDelayState = 0L;
            this.mSystemTimeAtDelayBegin = 0L;
            this.mDelayTimeAtDelayBegin = 0L;
            this.mIsInDelayStallInterval = false;
        }
    }

    public void updateFpsIntervalForStalledCal() {
        if (this.mConfig.d == 2 && !this.mHasUpdateSourceFps) {
            this.mSourceFpsInterval = 1000.0f / ((TaobaoMediaPlayer) this)._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_FORMAT_FPS, 30.0f);
            this.mHasUpdateSourceFps = true;
        } else if (this.mConfig.d == 0) {
            this.mSourceFpsInterval = 1000.0f / ((TaobaoMediaPlayer) this)._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_RENDER_FPS_INTERVAL, 30.0f);
        }
        if (this.mSourceFpsInterval <= 0.0f || this.mSourceFpsInterval > 60.0f) {
            this.mSourceFpsInterval = 30.0f;
        }
        if (this.mMaxFpsAtStalledCal < this.mSourceFpsInterval) {
            this.mMaxFpsAtStalledCal = this.mSourceFpsInterval;
        }
    }

    public void updateVideoInfoWhenVideoResolutionSwitch(int i, int i2) {
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String videoResolution = getVideoResolution(i, i2);
        String str = this.mVideoResolution;
        this.mLastVideoResolution = str;
        long j = 0;
        if (this.mPlayStartVideoWidth == 0 && this.mPlayStartVideoHeight == 0) {
            long j2 = this.mLastVideoSizePlayTime;
            if (j2 > 0) {
                j = currentTimeMillis - j2;
                updateVideoResolutionPlayTimeMap(j, videoResolution);
            }
            updateVideoResolutionRenderStalledCountMap(this.mVideoResolution);
            this.mLastVideoSizePlayTime = currentTimeMillis;
            this.mPlayStartVideoWidth = i;
            this.mPlayStartVideoHeight = i2;
            this.mVideoResolution = videoResolution;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "MonitorMediaPlayer::updateVideoInfoWhenVideoResolutionSwitch start_play_video_width:" + i + ", start_play_video_height:" + i2 + ", last_play_time:" + j + ", total_play_time:" + this.mTotalPlayTime);
            return;
        }
        long j3 = this.mLastVideoSizePlayTime;
        if (j3 > 0) {
            long j4 = currentTimeMillis - j3;
            updateVideoResolutionPlayTimeMap(j4, str);
            updateVideoResolutionRenderStalledCountMap(this.mVideoResolution);
            this.mLastVideoSizePlayTime = currentTimeMillis;
            this.mVideoResolution = videoResolution;
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "MonitorMediaPlayer::updateVideoInfoWhenVideoResolutionSwitch new video_width:" + i + ", video_height:" + i2 + ", last_play_time:" + j4 + ", total_play_time:" + this.mTotalPlayTime + ", play_time_map: " + this.mVideoResolutionPlayTimeMap.toString());
        }
    }

    public void updateVideoResolutionInfoForEnd() {
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        if (this.mLastVideoSizePlayTime > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.mLastVideoSizePlayTime;
            updateVideoResolutionPlayTimeMap(currentTimeMillis, this.mVideoResolution);
            this.mLastVideoSizePlayTime = 0L;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "MonitorMediaPlayer::updateVideoResolutionInfoForEnd last_play_time:" + currentTimeMillis + ", total_play_time:" + this.mTotalPlayTime + ", play_time_map: " + this.mVideoResolutionPlayTimeMap.toString());
        }
        updateVideoResolutionRenderStalledCountMap(this.mVideoResolution);
    }

    public void updateVideoResolutionInfoForStart() {
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        if (this.mVideoResolutionRenderingStalledCountMap == null) {
            this.mVideoResolutionRenderingStalledCountMap = new HashMap();
        }
        int videoWidth = getVideoWidth();
        int videoHeight = getVideoHeight();
        if (this.mPlayStartVideoWidth == 0 && videoWidth != 0) {
            this.mPlayStartVideoWidth = videoWidth;
        }
        if (this.mPlayStartVideoHeight == 0 && videoHeight != 0) {
            this.mPlayStartVideoHeight = videoHeight;
        }
        this.mLastVideoSizePlayTime = System.currentTimeMillis();
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "MonitorMediaPlayer::updateVideoResolutionInfoForStart video_width:" + videoWidth + ", video_heigth:" + videoHeight);
    }

    public void updateVideoResolutionPlayTimeMap(long j, String str) {
        if (j > 0 && !TextUtils.isEmpty(str)) {
            if (this.mVideoResolutionPlayTimeMap.containsKey(str)) {
                j += this.mVideoResolutionPlayTimeMap.get(str).longValue();
            }
            this.mVideoResolutionPlayTimeMap.put(str, Long.valueOf(j));
        }
    }

    public void updateVideoResolutionRenderStalledCountMap(String str) {
        if (this.mVideoResolutionRenderingStalledCountMap == null) {
            this.mVideoResolutionRenderingStalledCountMap = new HashMap();
        }
        long j = this.videoRenderingStalledCountNew_43833053 - this.videoRenderingStalledCountNewWithResolution;
        if (j > 0 && !TextUtils.isEmpty(str)) {
            this.mVideoResolutionRenderingStalledCountMap.put(str, Long.valueOf(j));
            this.videoRenderingStalledCountNewWithResolution = this.videoRenderingStalledCountNew_43833053;
        }
    }

    public boolean useNoTraffic() {
        return false;
    }

    public MonitorMediaPlayer(Context context, gf4 gf4Var) {
        this.mContextRef = null;
        this.AppMonitor_Module = "";
        this.mDegradeCode = 0;
        this.mOriginSelectedUrlName = "";
        this.mBufferingStart = 0L;
        this.mLastBuffering = 0L;
        this.mLastCommitPlaying = 0L;
        this.mLastBufferDuration = 0L;
        this.mStallReason = 0L;
        this.mStallStartTime = 0L;
        this.mSeekStart = 0L;
        this.mSeekTime = 0L;
        this.mCurrSeekTime = 0L;
        this.mSeekPos = -1L;
        this.mPrepareStartTime = 0L;
        this.mStartTime = 0L;
        this.mFirstPlayTime = 0L;
        this.mFirstFrameSurfaceUpdateTime = -1L;
        this.mFirstFrameSurfaceUpdateTs = 0L;
        this.mFirstUpdateTimeFromPlayerStart = -1L;
        this.mFirstRenderTime = 0L;
        this.mSecondRenderTime = 0L;
        this.mUserFirstFrameTime = -1L;
        this.mLastPlayTime = 0L;
        this.mTotalPlayTime = 0L;
        this.mBufferingCountNew = 0L;
        this.mBufferingTotalTimeNew = 0L;
        this.mBufferingHeartBeatCount = 0L;
        this.mBufferingHeartBeatTotalTime = 0L;
        this.videoRenderingStalledCount = 0L;
        this.videoRenderingStalledTotalDuration = 0L;
        this.videoRenderingStalledCountInRenderThread = 0L;
        this.videoRenderingStalledTotalDurationInRenderThread = 0L;
        this.videoRenderingStalledCountNew_43833053 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053 = 0L;
        this.videoRenderingStalledCountNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledCountNew_43833053_r1 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r1 = 0L;
        this.videoRenderingStalledCountNew_43833053_r2 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r2 = 0L;
        this.videoRenderingStalledCountNewWithResolution = 0L;
        this.mEnableAddUnorderedStall = true;
        this.duplicateFrameCount = 0L;
        this.videoRenderingStalledCountNew_43833053_reasons = new long[]{0, 0, 0};
        this.mRtcStrategicAbnormalCount = 0L;
        this.mRtcStrategicAbnormalTime = 0L;
        this.mRtcTotalRate = 0.0f;
        this.mRtcPlayRate = 0.0f;
        this.mUsePlayRateCalSubStall = true;
        this.mRtcTotalCount = 0;
        this.videoRenderingStalledCount_live = 0L;
        this.videoRenderingStalledTotalDuration_live = 0L;
        this.mLock = new Object();
        this.mTimeLock = new Object();
        this.mRenderStatLock = new Object();
        this.mDebugStatus = ied.PULL_INIT;
        this.bNeedCommitPlayExperience = false;
        this.bMediacodeError = false;
        this.bInitEglError = false;
        this.bFirstFrameRendered = false;
        this.bSecondFrameRendered = false;
        this.mRtcVideoNackBackoffDisable = 0;
        this.mRtcPacketBufferClearToKeyDiasble = 0;
        this.mRtcCongestionMode = 0L;
        this.mServerIPJson = "";
        this.mNetStackType = 0;
        this.mPlayerEventList = new LinkedList<>();
        this.mPlayerPullAudioEventList = new LinkedList<>();
        this.mRtcLiveAbrReasonList = new LinkedList<>();
        this.mTmpEnableGetStartTimeInRelease = true;
        this.mSendLogToken = true;
        this.mFetchArtcSoReadyInit = false;
        this.mFetchS266SoReadyInit = false;
        this.mFetchFFMpegSoReadyInit = false;
        this.mFetchArtcSoAfterSelect = false;
        this.mFetchSoStartTime = 0L;
        this.mFetchSoTime = 0L;
        this.mHasCommitFetchSoFinish = false;
        this.TIME_OF_COMMIT_FETCH_SO = 10000L;
        this.mCommitLivePushControlInfo = true;
        this.mEnableSeekInPause = false;
        this.mIsFloatWindow = false;
        this.mSelectFlvUrlReason = 0;
        this.mLastPlayError = 0;
        this.mAuthResultCode = -1;
        this.mServerAuthLevel = -1;
        this.mViewIsVisible = true;
        this.mEnableStatRenderStallInNonVisible = false;
        this.mEnableStatRenderStallInNonSurface = false;
        this.mEnableStatRenderStallInNative = true;
        this.mShouldStatRenderStallInNative = true;
        this.mIsBackground = false;
        this.mSeekFastMode = true;
        this.mSwitchToBackground = false;
        this.mSwitchToForeground = false;
        this.mCheckMp4PatternWhenUseUrlCache = 1;
        this.mGenerateCacheKeyModeWhenUseUrlCache = 1;
        this.mIgnoreParamListWhenGenerateCacheKeyMode = new LinkedList();
        this.mSeamlessSwitchMode = 0;
        this.mSeamlessSwitchStatus = -1;
        this.mForceMuteMode = false;
        this.bPauseInBackground = false;
        this.mLastMuteState = true;
        this.mLastErrorCode = 0;
        this.mLastExtra = 0;
        this.mLastIsConnected = 1;
        this.mReportBitrateTimes = 0;
        this.mHandler = null;
        this.mAudioBytes = 0L;
        this.mVideoBytes = 0L;
        this.mVideoDuration = 0L;
        this.pauseByTelephone = false;
        this.bPaused = false;
        this.mHeartBeatInterval = -1L;
        this.mNewEventStatusNode = "";
        this.mFatalErrorASync = 0L;
        this.mFatalErrorASyncTime = 0L;
        this.mSwitchByRtc = false;
        this.mState = 0;
        this.mLastState = 0;
        this.end2endDelay = null;
        this.mLastVideoSizePlayTime = 0L;
        this.mPlayStartVideoWidth = 0;
        this.mPlayStartVideoHeight = 0;
        this.mVodPlayerNum = 0;
        this.mLivePlayerNum = 0;
        this.mLiveWarmupNum = 0;
        this.mUseMediacodec = true;
        this.mUseSoftwareByPolicy = 0;
        this.mNotSetH26XInConfig = false;
        this.mUTRun = null;
        this.mVideoRenderStalledDurationThreshold = 200L;
        this.UNINITIALIZED_MIN_VAL = -9999L;
        this.isFirstFrameRendered = false;
        this.mT = -9999L;
        this.mTD = -9999L;
        this.mTn = -9999L;
        this.mTDn = -9999L;
        this.mResumeTs = -9999L;
        this.monitorNewStalled = false;
        this.mRenderStallStatInfoForFirstTime = "";
        this.mVideoCacheBytesInRendering = -1L;
        this.mVideoCacheFramesInRendering = -1L;
        this.mRequestBytesInRendering = -1L;
        this.mReceiveFramesInRendering = -1L;
        this.mUseEventId19997 = false;
        this.mHttpDnsOriginLock = new Object();
        this.mPanoType = 0;
        this.mPlayerIndex = 0L;
        this.mCacheReason = 0;
        this.mUnuseProxyReason = 0;
        this.mEnableSyncAfterSeek = false;
        this.mEnablePlayrate3DropPKT = false;
        this.mAbIdOfSyncAfterSeek = -99;
        this.mMediaCodecInputErrorCode = 0;
        this.mMediaCodecOutputErrorCode = 0;
        this.mCurrentPageName = "";
        this.mIsPrerelease = false;
        this.mFromNotValid = false;
        this.mFrameInfoLevel = -1;
        this.mFrameInfoTop1Position = 0;
        this.mFrameInfoTop2Position = 0;
        this.mHeartBeatFPS = new StringBuilder(10);
        this.mHeartBeatDownloadFPS = new StringBuilder(10);
        this.mHeartBeatDecodeFPS = new StringBuilder(10);
        this.mHeartBeatNetSpeed = new StringBuilder(10);
        this.mDisableFixSeekCount = false;
        this.mEnableChangeCurPositionToVideoPosition = true;
        this.mIsPlayingFlv = false;
        this.mEnableDecodeAACDSE = false;
        this.mFirstRenderRecvTime = 0L;
        this.mRotate = 0;
        this.mH265AuthenStrategy = H265AuthenStrategy.WHITLIST;
        this.mH264AuthenStrategy = H264AuthenStrategy.WHITLIST;
        this.mAudioGainCoef = 1.0f;
        this.mEnableAudioGain = false;
        this.mLastRenderVideoEveryFrame = 0L;
        this.mMaxRenderAbnormalInRenderThread = 200;
        this.mEnableSeekFlushBuffer = true;
        this.mEnableAudioClip = false;
        this.mWarmupStartTime = 0L;
        this.mWarmupEndTime = 0L;
        this.mWarmupReceiveBytes = 0L;
        this.mWatchHandler = null;
        this.mWatchLastMessageTime = 0L;
        this.mWatchInterval = 0L;
        this.mWatchExceedThreshold = 0L;
        this.mMessageWasteExceedThreshold = 10;
        this.mWatchExceedTime1 = 0L;
        this.mWatchExceedNum1 = 0L;
        this.mWatchExceedTime2 = 0L;
        this.mWatchExceedNum2 = 0L;
        this.mWatchPhase = 0;
        this.mEnableWatch = false;
        this.mCodeClean = true;
        this.mWatchMinTime = 10L;
        this.mWatchLock = new Object();
        this.mEnableFixAbnormalStatForFirstRender = true;
        this.mEnableFixAbnormalStatForLoop = true;
        this.mDisablePullAudio = 0;
        this.mStreamSelectReasonList = new LinkedList<>();
        this.mIsDecoderLoaded = false;
        this.mMuteAudio = false;
        this.mPlayRate = 1.0f;
        this.mPlayInPIP = false;
        this.mTotalBgPlayTime = 0L;
        this.mLastBgPlayTime = 0L;
        this.mTotalFloatWindowsPlayTime = 0L;
        this.mLastFloatWindowsPlayTime = 0L;
        this.mTotalFloatWindowsCount = 0;
        this.mTotalBgCount = 0;
        this.mSwitchToBackKey = wua.KEY_SMALL_WINDOW;
        this.mSwitchToFrontKey = "liveRoom";
        this.mMediaCodecErrorReason = 0;
        this.mMediaCodecProcessError = 0;
        this.mSyncNotifyHttpDns = true;
        this.mFirstSwitchDownReason = -1;
        this.mArtcFirstAbrSwitchTime = 0L;
        this.mPlayingLiveDefinition = "";
        this.mSwitchTargetLiveDefinition = "";
        this.mArtcTraceDataIndex = 0;
        this.mRtcVideoFirstFrameTime = 0L;
        this.mRtcVideoFirstPacketTime = 0L;
        this.mRtcAudioFirstPacketTime = 0L;
        this.mAbnormalPlayDuration = 0L;
        this.mAbnormalPlayFrameCount = 0;
        this.mValidAbnormalFrameCount = 1;
        this.mAbnormalPlaySpeedThreshold = 0.2f;
        this.mCurrRenderingStatus = 0;
        this.mTotalQuickPlayTime = 0L;
        this.mTotalSlowPlayTime = 0L;
        this.mTotalQuickPlayFrameCount = 0L;
        this.mTotalSlowPlayFrameCount = 0L;
        this.mTotalQuickPlayTimeAll = 0L;
        this.mTotalSlowPlayTimeAll = 0L;
        this.mTotalQuickFrameCountAll = 0L;
        this.mTotalSlowFrameCountAll = 0L;
        this.mMaxPlayerInstanceCount = -1;
        this.seekTimeList = new LinkedList();
        this.maxSeekTime = -1L;
        this.mHasEverEnableBluetooth = false;
        this.mMuteStateNodes = new LinkedList();
        this.mVolumeStateNodes = new LinkedList();
        this.mAlwaysMutePlay = true;
        this.mIsPlayingWhenInvisible = false;
        this.mIsPlayingInBackground = false;
        this.mIsPlayingInBackgroundNew = false;
        this.mIsFirstRenderStalledPtsRecorded = false;
        this.mFirstRenderStalledPts = -1L;
        this.mCacheLengthAtStart = -1L;
        this.mPlayerInitTimeMS = -1L;
        this.mSetUrlTs = -1L;
        this.mVideoRenderingStalledCountNewUpdate = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r1 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r2 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r3 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r4 = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.mIsFirstFrameRenderedNewUpdate = false;
        this.mLastStalledFrameRenderSystemTime = -9999L;
        this.mLastStalledFrameFramePts = -9999L;
        this.mLastFrameRenderSystemTime = -9999L;
        this.mLastFramePts = -9999L;
        this.mResumeTsNew = -9999L;
        this.mDisorderFrameCountNew = 0L;
        this.mFrameCountInDelayState = 0L;
        this.mFrameCountRecoverInDelayState = 0L;
        this.mStalledCountInDelayState = 0L;
        this.mMaxStalledCountInDelay = 0L;
        this.mDelayTimeAtDelayBegin = 0L;
        this.mTotalDelayTime = 0L;
        this.mSystemTimeAtDelayBegin = 0L;
        this.mIsInDelayStallInterval = false;
        this.MIN_FRAME_COUNT_IN_DELAY_STATE = 10L;
        this.MIN_TIME_IN_DELAY_STATE = 500L;
        this.mEnableRenderStallCalNew = true;
        this.mHasUpdateSourceFps = false;
        this.mSourceFpsInterval = 0.0f;
        this.mMaxStalledCountInInterval = vu3.b.GEO_NOT_SUPPORT;
        this.mMaxFpsAtStalledCal = 0.0f;
        this.mMaxRenderInterval = -1L;
        this.mFixMisorderFrameCount = false;
        this.mAlwaysFrontgroundPlay = true;
        this.playerCreatedPageName = "default";
        this.mPlayerCreatTs = -1L;
        this.mPlayerP2ffFinishedTs = -1L;
        this.mExperiment = 0L;
        this.firstStalledCount = 0L;
        this.firstStalledPlayTime = 0L;
        this.maxStalledCount = 0L;
        this.maxStalledPlayTime = 0L;
        this.index = 0;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.mContextRef = weakReference;
        Context context2 = weakReference.get();
        long j = mGlogalPlayerIndex + 1;
        mGlogalPlayerIndex = j;
        this.mPlayerIndex = j;
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "new player index=" + this.mPlayerIndex);
        if (!(context2 == null || context2.getApplicationContext() == null)) {
            ja1.n0((Application) context2.getApplicationContext());
            if (context2 instanceof Activity) {
                this.playerCreatedPageName = ((Activity) context2).getLocalClassName();
            }
        }
        this.mConfigAdapter = gf4Var;
        if (this.mHandler == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.mHandler = new Handler();
            } else {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
        }
        if (this.mVideoResolutionPlayTimeMap == null) {
            this.mVideoResolutionPlayTimeMap = new HashMap();
        }
        if (this.mVideoResolutionRenderingStalledCountMap == null) {
            this.mVideoResolutionRenderingStalledCountMap = new HashMap();
        }
        if (!(context2 == null || context2.getApplicationContext() == null)) {
            ja1.S((Application) context2.getApplicationContext());
            ja1.M(context2);
        }
        this.mIsPrerelease = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_IS_PRE_RELEASE, "false"));
        this.mFrameInfoLevel = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_FRAME_INFO_LEVEL, "-1"));
        this.mFrameInfoTop1Position = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_FRAME_INFO_LEVEL1, "0"));
        this.mFrameInfoTop2Position = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_FRAME_INFO_LEVEL2, "200"));
        this.mEnableRenderStallCalNew = true;
        this.mCreateInBackground = ja1.i0();
        this.mFixMisorderFrameCount = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "fixMisorderFrameCount", "true"));
    }

    private String getVolumeStateNodes() {
        StringBuilder sb = new StringBuilder(50);
        for (int i = 0; i < this.mVolumeStateNodes.size() - 1; i++) {
            sb.append(String.format("%.2f", this.mVolumeStateNodes.get(i)).concat("_"));
        }
        if (this.mVolumeStateNodes.size() > 0) {
            List<Float> list = this.mVolumeStateNodes;
            sb.append(list.get(list.size() - 1));
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "getVolumeStateNodes=" + ((Object) sb));
        return sb.toString();
    }

    private boolean useUrlAudioCache() {
        r7t r7tVar = this.mConfig;
        boolean z = false;
        if (r7tVar == null || !r7tVar.Z || !r7tVar.l0 || TextUtils.isEmpty(this.mPlayUrl)) {
            return false;
        }
        if (this.mConfig.Z) {
            this.mCheckMp4PatternWhenUseUrlCache = 1;
            return true;
        }
        Integer[] numArr = {1, 1};
        LinkedList linkedList = new LinkedList();
        boolean urlCacheConfig = getUrlCacheConfig(this.mConfig.y, "", numArr, linkedList);
        if (urlCacheConfig) {
            this.mIgnoreParamListWhenGenerateCacheKeyMode.clear();
            if (ew0.p(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", MUSIC_URL_CACHE_BLACK_BIZCODE, ""))) {
                AVSDKLog.e(this.mLogContext, "useUrlCache false for matching black list");
            } else {
                int intValue = numArr[0].intValue();
                this.mCheckMp4PatternWhenUseUrlCache = intValue;
                if (1 != intValue || this.mPlayUrl.contains(gov.SUFFIX_MP4)) {
                    int intValue2 = numArr[1].intValue();
                    this.mGenerateCacheKeyModeWhenUseUrlCache = intValue2;
                    if (intValue2 == 1 && linkedList.size() > 0) {
                        this.mIgnoreParamListWhenGenerateCacheKeyMode.addAll(linkedList);
                    }
                    z = urlCacheConfig;
                } else {
                    AVSDKLog.e(this.mLogContext, "useUrlCache false for matching not mp4.");
                }
            }
            return z;
        }
        AVSDKLog.e(this.mLogContext, "useUrlCache false for not in white list");
        return urlCacheConfig;
    }

    public void monitorPlayerEventNew(int i) {
        String str;
        if (!TextUtils.isEmpty(this.mNewEventStatusNode)) {
            this.mNewEventStatusNode += "_";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%03d", Integer.valueOf(i)));
        sb.append(f7l.BRACKET_START_STR);
        if (i == 1) {
            sb.append(this.mPlayerCreatTs);
        } else {
            sb.append(System.currentTimeMillis() - this.mPlayerCreatTs);
        }
        switch (i) {
            case 6:
                sb.append("#0");
                break;
            case 8:
                sb.append("#");
                sb.append(Math.round(getVideoRenderPts() * 1000.0f));
                sb.append("#");
                sb.append(this.mSeekPos);
                break;
            case 9:
                sb.append("#");
                sb.append(this.mCurrSeekTime);
                break;
            case 10:
                sb.append("#");
                sb.append(this.bLooping ? 1 : 0);
                break;
            case 11:
                sb.append("#");
                sb.append(this.mStallReason);
                sb.append("#");
                sb.append(this.mNetType);
                sb.append("#");
                sb.append(z5r.d());
                sb.append("#");
                sb.append(z5r.c());
                this.mStallReason = 0L;
                break;
            case 12:
                sb.append("#");
                sb.append(this.mStallStartTime > 0 ? System.currentTimeMillis() - this.mStallStartTime : -1L);
                sb.append("#");
                sb.append(this.mNetType);
                sb.append("#");
                sb.append(z5r.d());
                sb.append("#");
                sb.append(z5r.c());
                this.mStallStartTime = 0L;
                break;
            case 13:
                sb.append("#");
                sb.append(this.mLastErrorCode);
                sb.append("#");
                sb.append(this.mLastExtra);
                break;
            case 14:
                sb.append("#");
                sb.append(this.mVolume);
                break;
            case 15:
                sb.append("#");
                sb.append(this.mVolume);
                break;
            case 16:
                sb.append("#");
                sb.append(this.mSwitchByRtc ? 1 : 0);
                sb.append("#0#");
                sb.append(this.mPlayingLiveDefinition);
                sb.append("#");
                sb.append(this.mSwitchTargetLiveDefinition);
                break;
            case 17:
                sb.append("#");
                sb.append(this.mPlayingLiveDefinition);
                sb.append("#");
                sb.append(this.mSwitchTargetLiveDefinition);
                sb.append("#");
                sb.append(this.mSeamlessSwitchEndTime - this.mSeamlessSwitchStartTime);
                break;
            case 18:
                sb.append("#");
                sb.append(this.mPlayingLiveDefinition);
                sb.append("#");
                sb.append(this.mSwitchTargetLiveDefinition);
                sb.append("#");
                sb.append(this.mSeamlessSwitchEndTime - this.mSeamlessSwitchStartTime);
                sb.append("#");
                sb.append(this.mSeamlessSwitchErrorCode);
                break;
            case 19:
                sb.append("#");
                if (TextUtils.isEmpty(this.mLastVideoResolution)) {
                    str = "null";
                } else {
                    str = this.mLastVideoResolution;
                }
                sb.append(str);
                sb.append("#");
                sb.append(this.mVideoResolution);
                break;
            case 20:
                sb.append("#ffmpeg#ffmpeg#rtc#rtc");
                break;
            case 21:
                sb.append("#");
                sb.append(System.currentTimeMillis() - this.mSwitchStreamSeamlessTs);
                sb.append("#null");
                break;
            case 22:
                sb.append("#");
                sb.append(this.mSeamlessSwitchCode);
                break;
            case 23:
                sb.append("#");
                sb.append(this.mFatalErrorASync);
                break;
            case 24:
                sb.append("#");
                sb.append(this.mFatalErrorASyncTime);
                break;
        }
        sb.append(f7l.BRACKET_END_STR);
        this.mNewEventStatusNode += sb.toString();
    }

    public void monitorPrepare() {
        int i;
        this.bNeedCommitPlayExperience = true;
        this.bFirstFrameRendered = false;
        this.bSecondFrameRendered = false;
        this.mBufferingHeartBeatCount = 0L;
        this.mBufferingHeartBeatTotalTime = 0L;
        this.mBufferingHeartBeatMsg = new StringBuilder(20);
        this.mBufferingCount = 0L;
        this.mBufferingTotalTime = 0L;
        this.mBufferingCountNew = 0L;
        this.mBufferingTotalTimeNew = 0L;
        this.videoRenderingStalledCount = 0L;
        this.videoRenderingStalledTotalDuration = 0L;
        this.videoRenderingStalledCount_live = 0L;
        this.videoRenderingStalledTotalDuration_live = 0L;
        this.mFirstRenderTime = 0L;
        this.mSecondRenderTime = 0L;
        this.mPreparedTime = 0L;
        this.mLastBuffering = 0L;
        this.mPrepareStartTime = System.currentTimeMillis();
        this.mLastErrorCode = 0;
        this.mLastExtra = 0;
        this.mLastIsConnected = 1;
        this.mUserStartTime = 0L;
        if (TextUtils.isEmpty(this.mPlayUrl) || ((i = this.mConfig.d) != 0 && (i != 2 || !this.mEnableVPM))) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "heartBeatMonitorStart failed, mEnableVPM is " + this.mEnableVPM);
        } else {
            AVSDKLog.e(this.mLogContext, "heartBeatMonitorStart ");
            heartBeatMonitorStart();
        }
        this.mVodPlayerNum = pgi.n().m();
        this.mLivePlayerNum = wei.n().m();
        this.mLiveWarmupNum = oxw.n().m();
        this.mMaxPlayerInstanceCount = pgi.n().e() + wei.n().e() + oxw.n().e();
        initWatchHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void commitPlaying() {
        Throwable th;
        Object obj;
        int i;
        String str;
        g0d g0dVar;
        if (this.mUTRun == null || TextUtils.isEmpty(this.mPlayUrl)) {
            AVSDKLog.e(this.mLogContext, "can't commit player vpm info\n");
            return;
        }
        int i2 = this.mConfig.d;
        if (i2 == 0 || (i2 == 2 && this.mEnableVPM)) {
            String currentPageName = c2v.getInstance().getCurrentPageName();
            if (!TextUtils.isEmpty(currentPageName)) {
                this.mCurrentPageName = currentPageName;
            }
            Object obj2 = this.mLock;
            synchronized (obj2) {
                try {
                    try {
                        double currentTimeMillis = this.mLastCommitPlaying != 0 ? (System.currentTimeMillis() - this.mLastCommitPlaying) / 1000.0d : vu3.b.GEO_NOT_SUPPORT;
                        this.mLastCommitPlaying = System.currentTimeMillis();
                        try {
                            WeakReference<Context> weakReference = this.mContextRef;
                            Context context = weakReference == null ? null : weakReference.get();
                            if (!(context == null || (g0dVar = MediaAdapteManager.mMediaNetworkUtilsAdapter) == null)) {
                                this.mLastIsConnected = z5r.r(g0dVar, context) ? 1 : 0;
                            }
                            if (this instanceof TaobaoMediaPlayer) {
                                this.mServerIP = ((TaobaoMediaPlayer) this)._getPropertyString(TaobaoMediaPlayer.FFP_PROP_STRING_SERVER_IP);
                            }
                            Uri parse = Uri.parse(this.mPlayUrl);
                            String host = parse.getHost();
                            String scheme = parse.getScheme();
                            int i3 = this.mPreparedTime > 0 ? 1 : 0;
                            r7t r7tVar = this.mConfigClone;
                            int i4 = ((r7tVar.e0 || r7tVar.a0) && this.mFirstEndtime <= 0) ? 1 : 0;
                            String str2 = "is_last=" + (this.mExit ? 1 : 0);
                            if (this instanceof TaobaoMediaPlayer) {
                                str = "page_name=";
                                i = i4;
                                float _getPropertyFloat = ((TaobaoMediaPlayer) this)._getPropertyFloat(10003, 1.0f);
                                obj = obj2;
                                if (Math.abs(_getPropertyFloat - 1.0f) > 0.001d) {
                                    try {
                                        str2 = str2 + ",playrate=" + String.format("%.2f", Float.valueOf(_getPropertyFloat));
                                    } catch (Throwable unused) {
                                    }
                                }
                            } else {
                                str = "page_name=";
                                i = i4;
                                obj = obj2;
                            }
                            if (this.mSeamlessSwitchIndex > 0) {
                                str2 = (((((str2 + ",switch_num=" + this.mSeamlessSwitchIndex) + ",switch_mode=" + this.mSeamlessSwitchMode) + ",seamless_switch_status=" + this.mSeamlessSwitchStatus) + ",seamless_switch_index=" + this.mSeamlessSwitchIndex) + ",seamless_switch_start_time=" + this.mSeamlessSwitchStartTime) + ",seamless_switch_end_time=" + this.mSeamlessSwitchEndTime;
                            }
                            String[] strArr = {"anchor_account_id=" + this.mConfigClone.C, "business_type=" + this.mConfigClone.x, "encode_type=" + this.mEncodeType, "feed_id=" + this.mConfigClone.B, "hbver=1.2", "host=" + host, "is_bg=" + (ja1.i0() ? 1 : 0), "is_prepared=" + i3, "is_preload=" + i, "last_status=" + this.mState, "last_status_en=" + getStateString(this.mState), "media_source_type=" + this.mConfigClone.F, str + this.mCurrentPageName, "play_scenario=" + this.mConfigClone.d, "play_token=" + this.mConfigClone.t, "source=" + scheme, "server_ip=" + this.mServerIP, "sub_business_type=" + this.mConfigClone.y, "video_width=" + getVideoWidth(), "video_height=" + getVideoHeight(), "video_renderer=" + getRenderType(), "vpm_time_interval=".concat(String.format("%.2f", Double.valueOf(currentTimeMillis))), "switch_id=" + this.mConfigClone.i0, "media_url=" + URLEncoder.encode(this.mPlayUrl, "utf-8"), ",video_rendering_stalled_time_new=" + (this.videoRenderingStalledTotalDurationNew_43833053 - this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm), ",video_rendering_stalled_count_new=" + (this.videoRenderingStalledCountNew_43833053 - this.videoRenderingStalledCountNew_43833053_LastForVpm), str2};
                            this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm = this.videoRenderingStalledTotalDurationNew_43833053;
                            this.videoRenderingStalledCountNew_43833053_LastForVpm = this.videoRenderingStalledCountNew_43833053;
                            if (this.mEnableVPM) {
                                String join = TextUtils.join(",", strArr);
                                this.mPlayStatStaticValue = join;
                                ((TaobaoMediaPlayer) this)._setPropertyString(TaobaoMediaPlayer.FFP_PROP_STRING_PLAYING_STAT_VALUE, join);
                            } else {
                                TBS.Adv.ctrlClicked("Page_Video", CT.Button, "Playing", strArr);
                            }
                            if (MediaSystemUtils.isApkDebuggable()) {
                                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "commit heartbeat play msg:" + Arrays.toString(strArr));
                            }
                            this.mBufferingHeartBeatCount = 0L;
                            this.mBufferingHeartBeatTotalTime = 0L;
                            this.mHeartBeatFPS.setLength(0);
                            this.mHeartBeatDecodeFPS.setLength(0);
                            this.mHeartBeatDownloadFPS.setLength(0);
                            this.mHeartBeatNetSpeed.setLength(0);
                            this.mBufferingHeartBeatMsg.setLength(0);
                            this.videoRenderingStalledCount_live = 0L;
                            this.videoRenderingStalledTotalDuration_live = 0L;
                        } catch (Throwable unused2) {
                            obj = obj2;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            throw th;
        }
    }

    private boolean useUrlCache() {
        String str;
        r7t r7tVar = this.mConfig;
        boolean z = false;
        if (r7tVar == null || r7tVar.d != 2 || this.mConfigAdapter == null || (str = this.mPlayUrl) == null || str.contains(".m3u8") || !this.mPlayUrl.startsWith("http")) {
            if (this.mConfig == null) {
                AVSDKLog.e(this.mLogContext, "useUrlCache false for null config");
            } else {
                feh fehVar = this.mLogContext;
                AVSDKLog.e(fehVar, "useUrlCache false for type=" + this.mConfig.d);
            }
            return false;
        }
        String config = this.mConfigAdapter.getConfig("DWInteractive", VIDEO_URL_CACHE_CONFIG, "");
        Integer[] numArr = {1, 1};
        LinkedList linkedList = new LinkedList();
        boolean urlCacheConfig = getUrlCacheConfig(this.mConfig.y, config, numArr, linkedList);
        if (urlCacheConfig) {
            this.mIgnoreParamListWhenGenerateCacheKeyMode.clear();
            if (ew0.p(this.mConfig.y, this.mConfigAdapter.getConfig("DWInteractive", VIDEO_URL_CACHE_BLACK_BIZCODE, ""))) {
                AVSDKLog.e(this.mLogContext, "useUrlCache false for matching black list");
            } else {
                int intValue = numArr[0].intValue();
                this.mCheckMp4PatternWhenUseUrlCache = intValue;
                if (1 != intValue || this.mPlayUrl.contains(gov.SUFFIX_MP4)) {
                    int intValue2 = numArr[1].intValue();
                    this.mGenerateCacheKeyModeWhenUseUrlCache = intValue2;
                    if (intValue2 == 1 && linkedList.size() > 0) {
                        this.mIgnoreParamListWhenGenerateCacheKeyMode.addAll(linkedList);
                    }
                    z = urlCacheConfig;
                } else {
                    AVSDKLog.e(this.mLogContext, "useUrlCache false for matching not mp4.");
                }
            }
            return z;
        }
        AVSDKLog.e(this.mLogContext, "useUrlCache false for not in white list");
        return urlCacheConfig;
    }

    public void changeToBackground(String str, boolean z) {
        gf4 gf4Var;
        if (z) {
            this.mAlwaysFrontgroundPlay = false;
        }
        if (this.mIsBackground != z) {
            this.mIsBackground = z;
            checkStatRenderStallFlag();
            if (!this.mIsBackground) {
                return;
            }
            if (isPlaying()) {
                AVSDKLog.e(this.mLogContext, "checkInvisible/BG playing:sbt=" + this.mConfig.y + ", still playing when changeToBackground");
                this.mIsPlayingInBackground = true;
                if ("NOTIFY_FOR_IN_BACKGROUND".equals(str)) {
                    this.mIsPlayingInBackgroundNew = true;
                }
                if (this.bPauseInBackground || ((gf4Var = this.mConfigAdapter) != null && ew0.n(this.mConfig.y, gf4Var.getConfig("DWInteractive", MediaConstant.ORANGE_SHOULD_PAUSE_IN_BACKGROUND_SBT, "")))) {
                    AVSDKLog.e(this.mLogContext, "yezo:pause in onMediaPrepared");
                    pause();
                }
                if (this.mLastPlayTime > 0) {
                    this.mLastPlayTimeInBackground = System.currentTimeMillis();
                }
            } else if (this.mLastPlayTimeInBackground > 0) {
                this.mPlayTimeInBackground += System.currentTimeMillis() - this.mLastPlayTimeInBackground;
                this.mLastPlayTimeInBackground = 0L;
            }
        }
    }

    private void commitSeamlessSwitchStats(long j, long j2, boolean z) {
        String[] strArr;
        if (this.mSeamlessSwitchIndex != 0 && (this instanceof TaobaoMediaPlayer) && this.mSeamlessSwitchStartTime != 0) {
            this.mSeamlessSwitchEndTime = System.currentTimeMillis();
            this.mSeamlessSwitchErrorCode = j2;
            if (j2 != 0) {
                monitorPlayerEventNew(18);
            } else {
                monitorPlayerEventNew(17);
            }
            try {
                long _getPropertyLong = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_PTS_LATENCY_INIT, 0L);
                long _getPropertyLong2 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_AVFORMAT_OPEN_TIME, 0L);
                long _getPropertyLong3 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_FIND_STREAM_INFO_TIME, 0L);
                long _getPropertyLong4 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_WIDTH, 0L);
                long _getPropertyLong5 = ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_VIDEO_HEIGHT, 0L);
                AVSDKLog.e(this.mLogContext, "TaobaoMediaPlayer: commitSeamlessSwitchStats: " + TextUtils.join(",", strArr));
                TBS.Adv.ctrlClicked("Page_Video", CT.Button, "SeamLessSwitchVideo", "page_name=" + c2v.getInstance().getCurrentPageName(), "play_token=" + this.mConfigClone.t, "sub_business_type=" + this.mConfigClone.y, "pts_latency_init=" + _getPropertyLong, "error_code=" + j2, "url=" + this.mSeamlessSwitchPath, "mode=" + this.mSeamlessSwitchMode, "index=" + this.mSeamlessSwitchIndex, "forced=" + (this.mSeamlessSwitchForcedly ? 1 : 0), "select_name=" + this.mSeamlessSwitchSelectName, "switch_time=" + (this.mSeamlessSwitchEndTime - this.mSeamlessSwitchStartTime), "open_time=" + _getPropertyLong2, "find_stream_time=" + _getPropertyLong3, HttpConstant.RANGE_PRE + ((TaobaoMediaPlayer) this)._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_SEAMLESS_SWITCH_READ_BYTES, 0L), "seamless_switch_status=" + this.mSeamlessSwitchStatus, "width=" + _getPropertyLong4, "height=" + _getPropertyLong5, "anchor_account_id=" + this.mConfigClone.C, "feed_id=" + this.mConfigClone.B, "switch_id=" + this.mConfigClone.i0, "force=" + (z ? 1 : 0));
                commitPlaying();
            } catch (Throwable unused) {
            }
            this.mSeamlessSwitchStartTime = 0L;
        }
    }

    public String monitorDataSource(String str) {
        String str2;
        String str3;
        Context context = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z = false;
        this.bUseVideoCache = false;
        this.bIsHitCache = false;
        this.bIsCompleteHitCache = false;
        this.mPlayUrl = str;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            context = weakReference.get();
        }
        feh fehVar = this.mLogContext;
        if (fehVar != null) {
            z5r.u(fehVar.b());
        }
        this.mNetType = z5r.n(this.mNetworkUtilsAdapter, context);
        if (z5r.a(str)) {
            this.mCdnIp = z5r.i(str);
            if (isGrtnUrl(str)) {
                this.mServerIPJson = z5r.j(str);
            }
        }
        String str4 = this.mCdnIp;
        if (str4 == null || str4.isEmpty()) {
            String cdnIp = getCdnIp();
            this.mCdnIp = cdnIp;
            if (!TextUtils.isEmpty(cdnIp)) {
                z5r.s(str, this.mCdnIp);
            }
            if (!TextUtils.isEmpty(this.mServerIPJson)) {
                z5r.t(str, this.mServerIPJson);
            }
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            Uri parse = Uri.parse(this.mPlayUrl);
            String host = parse.getHost();
            String path = parse.getPath();
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(path) && host.contains("cloud.video.taobao.com") && path.startsWith("/play/")) {
                Toast.makeText(context, "此链接有安全风险，并且影响秒开，请尽快下线，具体联系@香瓜", 1).show();
            }
        }
        if (!(!this.mFetchArtcSoAfterSelect || this.mConfig == null || this.mConfigClone == null)) {
            if (str.contains("artc")) {
                this.mConfig.N = MediaConstant.RTCLIVE_URL_NAME;
                this.mConfigClone.N = MediaConstant.RTCLIVE_URL_NAME;
            }
            if (str.contains(".flv")) {
                this.mConfig.N = yj4.PARAM_MEDIA_INFO_FLVURL;
                this.mConfigClone.N = yj4.PARAM_MEDIA_INFO_FLVURL;
            }
        }
        r7t r7tVar = this.mConfig;
        if (r7tVar.P0) {
            AVSDKLog.e(this.mLogContext, "not useCache ByErrorCode");
            this.mUnuseProxyReason = 7;
            return this.mPlayUrl;
        } else if (r7tVar.Q0) {
            AVSDKLog.e(this.mLogContext, "not useCache By Control");
            this.mUnuseProxyReason = 8;
            return this.mPlayUrl;
        } else if (useCache()) {
            AVSDKLog.e(this.mLogContext, "useCache of cacheKey branch");
            this.mCacheReason = 1;
            StringBuilder sb = new StringBuilder(128);
            if (!TextUtils.isEmpty(this.mCdnIp)) {
                sb.append("cdnIp=" + this.mCdnIp);
            }
            if (!TextUtils.isEmpty(this.mConfig.t)) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("playTokenId=" + this.mConfig.t);
                if (this.mSendLogToken) {
                    sb.append("&logToken=" + this.mConfig.t);
                }
            }
            int i = this.mConfig.u;
            if (i != Integer.MAX_VALUE && i > 0) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("videoLength=" + this.mConfig.u);
            }
            if (ja1.R != null && ja1.R.contains(this.mConfig.y)) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("preloadNetCutSize=" + ja1.Q);
            }
            if (!TextUtils.isEmpty(this.mConfig.r)) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append("&");
                }
                sb.append("videoCacheId=" + this.mConfig.r);
            }
            appendExtraQueryToPath(sb);
            String b = ew0.b(this.mPlayUrl, sb);
            if (!TextUtils.isEmpty(this.mConfig.s)) {
                str3 = this.mConfig.s;
            } else {
                str3 = a7m.b(context, b);
            }
            if (TextUtils.isEmpty(str3)) {
                if (this.mConfig.o) {
                    StringBuilder sb2 = new StringBuilder(20);
                    sb2.append("useTBNetProxy=" + this.mConfig.o);
                    b = ew0.b(b, sb2);
                }
                t7b d = a7m.d(context);
                if (d == null) {
                    this.bUseVideoCache = false;
                    this.bIsCompleteHitCache = false;
                    this.bIsHitCache = false;
                    return this.mPlayUrl;
                }
                str3 = d.v(b);
                this.bUseVideoCache = d.D();
                this.bIsCompleteHitCache = false;
                if (this.bUseVideoCache && d.E(b)) {
                    z = true;
                }
                this.bIsHitCache = z;
                if (!this.bUseVideoCache) {
                    feh fehVar2 = this.mLogContext;
                    AVSDKLog.e(fehVar2, "bUseVideoCache=" + this.bUseVideoCache);
                    this.mCacheReason = d.z();
                    this.mUnuseProxyReason = 1;
                    return this.mPlayUrl;
                }
                setUseLocalHostUrl();
                this.mPlayUrl = b;
            } else {
                this.bUseVideoCache = true;
                this.bIsCompleteHitCache = true;
                this.bIsHitCache = true;
            }
            feh fehVar3 = this.mLogContext;
            AVSDKLog.e(fehVar3, "proxyUrl=" + str3);
            return str3;
        } else if (useUrlCache() || useUrlAudioCache()) {
            AVSDKLog.e(this.mLogContext, "useUrlCache");
            this.mCacheReason = 2;
            int i2 = this.mGenerateCacheKeyModeWhenUseUrlCache;
            if (i2 == 1) {
                str2 = e2n.e(ew0.w(this.mPlayUrl, this.mIgnoreParamListWhenGenerateCacheKeyMode));
            } else if (i2 == 2) {
                str2 = e2n.e(this.mPlayUrl.substring(0, str.lastIndexOf("?") + 1));
            } else {
                str2 = "";
            }
            StringBuilder sb3 = new StringBuilder(64);
            if (!TextUtils.isEmpty(str2)) {
                sb3.append("videoCacheId=" + str2);
                this.mPlayUrl = ew0.b(this.mPlayUrl, sb3);
            }
            String b2 = a7m.b(context, this.mPlayUrl);
            if (TextUtils.isEmpty(b2)) {
                StringBuilder sb4 = new StringBuilder(128);
                if (!TextUtils.isEmpty(this.mConfig.t)) {
                    sb4.append("playTokenId=" + this.mConfig.t);
                    if (this.mSendLogToken) {
                        sb4.append("&logToken=" + this.mConfig.t);
                    }
                }
                int i3 = this.mConfig.u;
                if (i3 != Integer.MAX_VALUE && i3 > 0) {
                    if (!TextUtils.isEmpty(sb4)) {
                        sb4.append("&");
                    }
                    sb4.append("videoLength=" + this.mConfig.u);
                }
                appendExtraQueryToPath(sb4);
                String b3 = ew0.b(this.mPlayUrl, sb4);
                if (this.mConfig.o) {
                    StringBuilder sb5 = new StringBuilder(20);
                    sb5.append("useTBNetProxy=" + this.mConfig.o);
                    b3 = ew0.b(b3, sb5);
                }
                t7b d2 = a7m.d(context);
                if (d2 == null) {
                    this.bUseVideoCache = false;
                    this.bIsCompleteHitCache = false;
                    this.bIsHitCache = false;
                    return this.mPlayUrl;
                }
                String v = d2.v(b3);
                this.bUseVideoCache = d2.D();
                long n = d2.n(this.mPlayUrl);
                this.bIsCompleteHitCache = false;
                if (this.bUseVideoCache && d2.E(this.mPlayUrl)) {
                    z = true;
                }
                this.bIsHitCache = z;
                feh fehVar4 = this.mLogContext;
                AVSDKLog.e(fehVar4, "hit cache: " + this.bIsHitCache + "cacheLength: " + n);
                if (!this.bUseVideoCache) {
                    this.mCacheReason = d2.z();
                    return this.mPlayUrl;
                }
                setUseLocalHostUrl();
                this.mPlayUrl = b3;
                return v;
            }
            this.bUseVideoCache = true;
            this.bIsCompleteHitCache = true;
            this.bIsHitCache = true;
            return b2;
        } else {
            AVSDKLog.e(this.mLogContext, "not use cache");
            this.mCacheReason = 99;
            this.mUnuseProxyReason = unUseProxyReason();
            if (this.mConfig.S && this.mPlayUrl.contains("liveng.alicdn.com") && !this.mPlayUrl.contains(".m3u8") && this.mPlayUrl.contains(".flv")) {
                StringBuilder sb6 = new StringBuilder(10);
                sb6.append("onlyvideo=1");
                this.mPlayUrl = ew0.b(this.mPlayUrl, sb6);
            }
            if (this.mConfig.O && !TextUtils.isEmpty(this.mPlayUrl) && this.mPlayUrl.startsWith("http:") && this.mPlayUrl.contains("liveng.alicdn.com") && this.mPlayUrl.contains(".flv") && !this.mPlayUrl.contains(".m3u8") && !this.mPlayUrl.contains("liveng-")) {
                StringBuilder sb7 = new StringBuilder(30);
                sb7.append("ali_drop_0_ref_vf=on");
                int u = ew0.u(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", "dropFrameLevel", "1"));
                sb7.append("&ali_drop_skip_ref_vf=" + u);
                this.mPlayUrl = ew0.b(this.mPlayUrl, sb7);
            } else if (isArtpUrl(this.mPlayUrl) && MediaAdapteManager.mConfigAdapter != null) {
                StringBuilder sb8 = new StringBuilder(64);
                if (ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "ARTPUse302", "true"))) {
                    sb8.append("ali_artp_enable_302=on");
                }
                if (!TextUtils.isEmpty(sb8)) {
                    this.mPlayUrl = ew0.b(this.mPlayUrl, sb8);
                }
            } else if (isGrtnUrl(this.mPlayUrl) && MediaAdapteManager.mConfigAdapter != null) {
                StringBuilder sb9 = new StringBuilder(64);
                if (isGrtnRtcLiveUrl(this.mPlayUrl) && ew0.s(MediaAdapteManager.mConfigAdapter.getConfig("tblivertc", "EnableGRTNRtcLive", "true"))) {
                    sb9.append("rtclive=1");
                }
                if (TextUtils.isEmpty(ew0.c(this.mPlayUrl, "rtc_delay"))) {
                    String grtnDelayUrlParams = getGrtnDelayUrlParams();
                    if (!TextUtils.isEmpty(grtnDelayUrlParams)) {
                        sb9.append(grtnDelayUrlParams);
                    }
                }
                if (!TextUtils.isEmpty(sb9)) {
                    this.mPlayUrl = ew0.b(this.mPlayUrl, sb9);
                }
            }
            return this.mPlayUrl;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorRenderStart(long r18) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorRenderStart(long):void");
    }

    public void monitorRtcAdaptionTraceData(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                this.mArtcTraceDataIndex++;
                commitStat19997("Page_Video", CT.Button, "RtcLiveAdaptionData", "playToken=" + this.mConfigClone.t, "feedId=" + this.mConfigClone.B, "traceData=" + str, "traceLocalTime=" + jSONObject.optString("localTime"), "traceIndex=" + this.mArtcTraceDataIndex, "switchUpCount=" + this.mArtcSwitchUpCount, "switchDownCount=" + this.mArtcSwitchDownCount, "abrSwitchUpCount=" + this.mArtcAbrSwitchUpCount, "abrSwitchDownCount=" + this.mArtcAbrSwitchDownCount);
            } catch (Throwable th) {
                AVSDKLog.e(this.mLogContext, "monitorRtcAdaptionTraceData " + str + ", error: " + th.toString());
            }
        }
    }

    public void monitorRtcSwitch(String str, int i, boolean z) {
        String str2;
        String next;
        if (!TextUtils.isEmpty(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                boolean isSwitchUp = isSwitchUp(this.mPlayingLiveDefinition, this.mSwitchTargetLiveDefinition);
                int optInt = jSONObject.optInt("syncSwitchCode");
                if (i == 1 && z && optInt > 0) {
                    int optInt2 = jSONObject.optInt("audioSyncTsDiff");
                    int optInt3 = jSONObject.optInt("videoSyncTsDiff");
                    if (optInt2 == 0) {
                        optInt2 = optInt3;
                    }
                    if (isSwitchUp) {
                        this.mArtcSwitchUpTsDelta += Math.abs(optInt2);
                    } else {
                        this.mArtcSwitchDownTsDelta += Math.abs(optInt2);
                    }
                }
                String str3 = "pageName=" + c2v.getInstance().getCurrentPageName();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = str3 + ",";
                    str3 = ((str4 + keys.next()) + "=") + jSONObject.get(next);
                }
                long j = this.mTotalPlayTime;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > this.mLastPlayTime) {
                    j += currentTimeMillis - this.mLastPlayTime;
                }
                String str5 = "playToken=" + this.mConfigClone.t;
                String str6 = "accountId=" + this.mConfigClone.C;
                String str7 = "feedId=" + this.mConfigClone.B;
                String str8 = "playTime=" + j;
                String str9 = "subBusinessType=" + this.mConfigClone.y;
                String str10 = "switchReason=" + getLastStreamSelectReason();
                StringBuilder sb = new StringBuilder();
                sb.append("autoSwitch=");
                if (this.mRtcLiveAutoSwitch) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                sb.append(str2);
                commitStat19997("Page_Video", CT.Button, "RtcLiveSwitchStream", str5, str6, str7, str8, str9, str10, sb.toString(), "sourceDefinition=" + this.mPlayingLiveDefinition, "targetDefinition=" + this.mSwitchTargetLiveDefinition, "switchUp=" + (isSwitchUp ? 1 : 0), "abtestId=" + getDynamicPlayExParam("adaption_abtest_id"), str3);
            } catch (Throwable th) {
                AVSDKLog.e(this.mLogContext, "monitorRtcSwitch " + str + ", error: " + th.toString());
            }
        }
    }

    public void monitorSeamlessSwitchSucc(long j, long j2) {
        boolean z = false;
        if (this.mEnableRtcSwitch) {
            boolean z2 = MediaConstant.DEFINITION_UD.equals(this.mPlayingLiveDefinition) || MediaConstant.DEFINITION_UD_60.equals(this.mPlayingLiveDefinition);
            AVSDKLog.e(this.mLogContext, "monitorSeamlessSwitchSucc rtc_switch sync_code: " + j2 + ", use_time:" + j + ", downSwitch:" + z2);
            this.mArtcSwitchSucCount = this.mArtcSwitchSucCount + 1;
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.mArtcSwitchSucTotalTime;
            long j4 = this.mSeamlessSwitchStartTime;
            this.mArtcSwitchSucTotalTime = j3 + (currentTimeMillis - j4);
            if (z2) {
                this.mArtcSwitchDownSucCount++;
                this.mArtcSwitchDownSucTotalTime += currentTimeMillis - j4;
                int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i == 0) {
                    this.mArtcSwitchDownSyncSucCount++;
                } else if (i > 0) {
                    this.mArtcSwitchDownSyncErrCount++;
                }
            } else {
                this.mArtcSwitchUpSucCount++;
                this.mArtcSwitchUpSucTotalTime += currentTimeMillis - j4;
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i2 == 0) {
                    this.mArtcSwitchUpSyncSucCount++;
                } else if (i2 > 0) {
                    this.mArtcSwitchUpSyncErrCount++;
                }
            }
        }
        monitorPlayerEvent(30);
        this.mSwitchByRtc = false;
        this.mSwitchSuccCounter++;
        if (j2 > 0) {
            z = true;
        }
        if (z) {
            this.mSwitchForceSuccCounter++;
        }
        this.mSeamlessSwitchStatus = 1;
        commitSeamlessSwitchStats(j, 0L, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void monitorVideoRenderEveryFrameNew(long r26) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.danmaku.ijk.media.player.MonitorMediaPlayer.monitorVideoRenderEveryFrameNew(long):void");
    }

    private String getStateString(int i) {
        if (i == 35) {
            return "codec_param_changed";
        }
        switch (i) {
            case 1:
                return "prepared";
            case 2:
                return "start";
            case 3:
                return "paused";
            case 4:
                return MornitorBufferingNew;
            case 5:
                return "seek";
            case 6:
                return "ended";
            case 7:
                return "error";
            case 8:
                return "first_render";
            case 9:
                return "render_stalled";
            case 10:
                return "playing";
            default:
                return "no-name";
        }
    }

    public void monitorRelease() {
        r7t r7tVar;
        String str;
        t7b d;
        commitSeamlessSwitchStats(0L, -1L, false);
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        if (this.bUseVideoCache && !this.bIsCompleteHitCache && (d = a7m.d(context)) != null) {
            d.M(this.mPlayUrl);
        }
        try {
            x3r.j(context).l(this);
        } catch (Throwable th) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "TELEPHONY_SERVICE listen LISTEN_NONE error: " + th.getMessage());
        }
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        boolean s = gf4Var != null ? ew0.s(gf4Var.getConfig("tblivertc", "EnableStandaloneGrtnStat", "true")) : false;
        this.mBackupCdnIp = null;
        if (s && isRtcUrl(this.mPlayUrl) && (r7tVar = this.mConfig) != null && r7tVar.c != 2 && (this instanceof TaobaoMediaPlayer)) {
            StringBuilder sb = monitorReleaseBuilder.get();
            sb.setLength(0);
            sb.append("SeqNO=9998");
            sb.append(",feed_id=");
            sb.append(this.mConfigClone.B);
            sb.append(",anchor_account_id=");
            sb.append(this.mConfigClone.C);
            TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
            long _getPropertyLong = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_VIDEO_FPS, 0L);
            long _getPropertyLong2 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DECODER_VIDEO_FPS, 0L);
            long _getPropertyLong3 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_DOWNLOAD_VIDEO_FPS, 0L);
            float _getPropertyFloat = taobaoMediaPlayer._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_RENDER_FPS_INTERVAL, 0.0f);
            float _getPropertyFloat2 = taobaoMediaPlayer._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_DECODE_FPS_INTERVAL, 0.0f);
            float _getPropertyFloat3 = taobaoMediaPlayer._getPropertyFloat(TaobaoMediaPlayer.FFP_PROP_FLOAT_VIDEO_DOWNLOAD_FPS_INTERVAL, 0.0f);
            long _getPropertyLong4 = taobaoMediaPlayer._getPropertyLong(21012, 0L);
            long _getPropertyLong5 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_TOTAL_DECODE_DELAY_MS, 0L);
            long _getPropertyLong6 = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_VIDEO_TOTAL_RENDER_DELAY_MS, 0L);
            sb.append(",");
            sb.append(taobaoMediaPlayer._getPropertyString(21990));
            String _getPropertyString = taobaoMediaPlayer._getPropertyString(21008);
            if (!TextUtils.isEmpty(_getPropertyString)) {
                sb.append(",");
                sb.append(_getPropertyString);
            }
            String _getPropertyString2 = taobaoMediaPlayer._getPropertyString(21009);
            if (!TextUtils.isEmpty(_getPropertyString2)) {
                sb.append(",");
                sb.append(_getPropertyString2);
            }
            int i = MediaConstant.RTCLIVE_URL_NAME.equals(this.mOriginSelectedUrlName) ? this.mDegradeCode : 0;
            sb.append(",media_url=");
            sb.append(this.mPlayUrl);
            sb.append(",abnormal_count=");
            sb.append(this.mBufferingCount);
            sb.append(",abnormal_total_time=");
            sb.append(this.mBufferingTotalTime);
            sb.append(",video_rendering_stalled_count_v2=");
            sb.append(this.mVideoRenderingStalledCountNewUpdate);
            sb.append(",video_rendering_stalled_count_new=");
            sb.append(this.videoRenderingStalledCountNew_43833053);
            sb.append(",video_rendering_stalled_count_new_r1=");
            sb.append(this.videoRenderingStalledCountNew_43833053_r1);
            sb.append(",video_rendering_stalled_count_new_r2=");
            sb.append(this.videoRenderingStalledCountNew_43833053_r2);
            sb.append(",new_video_rendering_stalled_count=");
            sb.append(this.videoRenderingStalledCountInRenderThread);
            sb.append(",video_rendering_stalled_count=");
            sb.append(this.videoRenderingStalledCount);
            sb.append(",artc_strategic_abnormal_count=");
            sb.append(this.mRtcStrategicAbnormalCount);
            sb.append(",video_rendering_stalled_time_new=");
            sb.append(this.videoRenderingStalledTotalDurationNew_43833053);
            sb.append(",video_rendering_stalled_time_new_r1=");
            sb.append(this.videoRenderingStalledTotalDurationNew_43833053_r1);
            sb.append(",video_rendering_stalled_time_new_r2=");
            sb.append(this.videoRenderingStalledTotalDurationNew_43833053_r2);
            sb.append(",new_video_rendering_stalled_time=");
            sb.append(this.videoRenderingStalledTotalDurationInRenderThread);
            sb.append(",video_rendering_stalled_time=");
            sb.append(this.videoRenderingStalledTotalDuration);
            sb.append(",artc_strategic_abnormal_time=");
            sb.append(this.mRtcStrategicAbnormalTime);
            sb.append(",play_time=");
            sb.append(this.mTotalPlayTime);
            sb.append(",bg_play_time=");
            sb.append(this.mTotalBgPlayTime);
            sb.append(",bg_play_count=");
            sb.append(this.mTotalBgCount);
            sb.append(",pip_windur=");
            sb.append(this.mTotalFloatWindowsPlayTime);
            sb.append(",pip_succcnt=");
            sb.append(this.mTotalFloatWindowsCount);
            sb.append(",player_type=");
            sb.append("taobaoplayer");
            sb.append(",first_frame_rendering_time=");
            sb.append(this.mFirstRenderTime);
            sb.append(",second_frame_rendering_time=");
            sb.append(this.mSecondRenderTime);
            sb.append(",user_first_frame_time=");
            sb.append(this.mUserFirstRenderTime);
            sb.append(",encode_type=");
            sb.append(this.mEncodeType);
            sb.append(",hardware_avc=");
            sb.append(this.mConfigClone.g);
            sb.append(",hardware_hevc=");
            sb.append(this.mConfigClone.h);
            sb.append(",videoAvgDownloadFps=");
            sb.append(_getPropertyLong3);
            sb.append(",videoAvgDecodeFps=");
            sb.append(_getPropertyLong2);
            sb.append(",videoAvgFps=");
            sb.append(_getPropertyLong);
            sb.append(",video_render_fps_v0=");
            sb.append(String.format("%.2f", Float.valueOf(_getPropertyFloat)));
            sb.append(",video_decode_fps_v0=");
            sb.append(String.format("%.2f", Float.valueOf(_getPropertyFloat2)));
            sb.append(",video_read_fps_v0=");
            sb.append(String.format("%.2f", Float.valueOf(_getPropertyFloat3)));
            sb.append(",source_latency=");
            sb.append(_getPropertyLong4);
            sb.append(",decode_latency=");
            sb.append(_getPropertyLong5);
            sb.append(",render_latency=");
            sb.append(_getPropertyLong6);
            sb.append(",error_code=");
            sb.append(this.mLastErrorCode);
            sb.append(",play_token=");
            sb.append(this.mConfigClone.t);
            sb.append(",media_source_type=");
            sb.append(this.mConfigClone.F);
            sb.append(",sub_business_type=");
            sb.append(this.mConfigClone.y);
            sb.append(",selected_url_name=");
            sb.append(this.mConfigClone.N);
            sb.append(",play_start_definition=");
            sb.append(this.mConfigClone.u0);
            sb.append(",last_select_definition=");
            sb.append(this.mPlayingLiveDefinition);
            sb.append(",last_select_stream_reason=");
            sb.append(getLastStreamSelectReason());
            sb.append(",rtclive_degrade_code=");
            sb.append(i);
            sb.append(",audioOnly=");
            sb.append(this.mConfig.l0);
            sb.append(",netstack=");
            sb.append(this.mNetStackType);
            sb.append(",init_audio_off=");
            sb.append(this.mDisablePullAudio);
            sb.append(",video_nack_backoff_disable=");
            sb.append(this.mRtcVideoNackBackoffDisable);
            sb.append(",packet_buffer_clear_to_key_disable=");
            sb.append(this.mRtcPacketBufferClearToKeyDiasble);
            sb.append(",rtc_congestion_mode=");
            sb.append(this.mRtcCongestionMode);
            sb.append(",video_width=");
            sb.append(getVideoWidth());
            sb.append(",video_height=");
            sb.append(getVideoHeight());
            sb.append(",player_status_nodes=");
            sb.append(getPlayerEvent());
            sb.append(",play_start_resolution_code=");
            sb.append(this.mConfig.z0);
            sb.append(",exp_id=");
            sb.append(getExperienceId());
            sb.append(",exp_release_id=");
            sb.append(getExperienceReleaseId());
            sb.append(",exp_bucket_id=");
            sb.append(getExperienceBuctetId());
            sb.append(",play_start_video_width=");
            sb.append(this.mPlayStartVideoWidth);
            sb.append(",play_start_video_height=");
            sb.append(this.mPlayStartVideoHeight);
            sb.append(",play_time_1080p=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_1080P));
            sb.append(",play_time_720p=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_720P));
            sb.append(",play_time_540p=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_540P));
            sb.append(",play_time_2k=");
            sb.append(getPlayTimeByVideoResolution("2k"));
            sb.append(",play_time_over2k=");
            sb.append(getPlayTimeByVideoResolution(VIDEO_RESOLUTION_over2k));
            sb.append(",video_rendering_stalled_count_new_720p=");
            sb.append(getRenderingStalledCountNewByVideoResolution(VIDEO_RESOLUTION_720P));
            sb.append(",video_rendering_stalled_count_new_1080p=");
            sb.append(getRenderingStalledCountNewByVideoResolution(VIDEO_RESOLUTION_1080P));
            sb.append(",video_rendering_stalled_count_new_2k=");
            sb.append(getRenderingStalledCountNewByVideoResolution("2k"));
            sb.append(",video_rendering_stalled_count_new_over2k=");
            sb.append(getRenderingStalledCountNewByVideoResolution(VIDEO_RESOLUTION_over2k));
            if (!TextUtils.isEmpty(this.mSeamlessSwitchStatusAll)) {
                sb.append(",switch_status=");
                sb.append(this.mSeamlessSwitchStatusAll);
            }
            if (this.mConfigClone.d != 2) {
                sb.append(",SelectDefinitionReason=");
                sb.append(this.mConfig.z0);
            }
            if (this.mEnableRtcSwitch) {
                sb.append(",play_time_ud=");
                sb.append(this.mPlayTimeUd);
                sb.append(",play_time_hd=");
                sb.append(this.mPlayTimeHd);
                sb.append(",play_time_uhd=");
                sb.append(this.mPlayTimeUhd);
                sb.append(",play_time_qhd=");
                sb.append(this.mPlayTimeQhd);
                sb.append(",play_time_sd=");
                sb.append(this.mPlayTimeSd);
                sb.append(",first_switch_hd_reason=");
                sb.append(this.mFirstSwitchDownReason);
                sb.append(",artc_switch_count=");
                sb.append(this.mArtcSwitchCount);
                sb.append(",artc_abr_switch_up_count=");
                sb.append(this.mArtcAbrSwitchUpCount);
                sb.append(",artc_abr_switch_down_count=");
                sb.append(this.mArtcAbrSwitchDownCount);
                sb.append(",artc_abr_request_switch_up_count=");
                sb.append(this.mArtcAbrRequestSwitchUpCount - this.mArtcAbrRedundantRequestSwitchUpCount);
                sb.append(",artc_abr_request_switch_down_count=");
                sb.append(this.mArtcAbrRequestSwitchDownCount - this.mArtcAbrRedundantRequestSwitchDownCount);
                sb.append(",artc_abr_redundant_request_switch_up_count=");
                sb.append(this.mArtcAbrRedundantRequestSwitchUpCount);
                sb.append(",artc_abr_redundant_request_switch_down_count=");
                sb.append(this.mArtcAbrRedundantRequestSwitchDownCount);
                sb.append(",artc_abr_total_request_switch_up_count=");
                sb.append(this.mArtcAbrTotalRequestSwitchUpCount);
                sb.append(",artc_abr_total_request_switch_down_count=");
                sb.append(this.mArtcAbrTotalRequestSwitchDownCount);
                sb.append(",artc_switch_up_count=");
                sb.append(this.mArtcSwitchUpCount);
                sb.append(",artc_switch_down_count=");
                sb.append(this.mArtcSwitchDownCount);
                sb.append(",artc_switch_suc_count=");
                sb.append(this.mArtcSwitchSucCount);
                sb.append(",artc_switch_up_suc_count=");
                sb.append(this.mArtcSwitchUpSucCount);
                sb.append(",artc_switch_down_suc_count=");
                sb.append(this.mArtcSwitchDownSucCount);
                sb.append(",artc_switch_up_sync_suc_count=");
                sb.append(this.mArtcSwitchUpSyncSucCount);
                sb.append(",artc_switch_up_sync_err_count=");
                sb.append(this.mArtcSwitchUpSyncErrCount);
                sb.append(",artc_switch_down_sync_suc_count=");
                sb.append(this.mArtcSwitchDownSyncSucCount);
                sb.append(",artc_switch_down_sync_err_count=");
                sb.append(this.mArtcSwitchDownSyncErrCount);
                sb.append(",artc_switch_suc_total_time=");
                sb.append(this.mArtcSwitchSucTotalTime);
                sb.append(",artc_switch_up_suc_total_time=");
                sb.append(this.mArtcSwitchUpSucTotalTime);
                sb.append(",artc_switch_down_suc_total_time=");
                sb.append(this.mArtcSwitchDownSucTotalTime);
                sb.append(",artc_switch_up_ts_delta=");
                sb.append(this.mArtcSwitchUpTsDelta);
                sb.append(",artc_switch_down_ts_delta=");
                sb.append(this.mArtcSwitchDownTsDelta);
                sb.append(",artc_abr_switch_reasons=");
                sb.append(getRtcLiveAbrReason());
                sb.append(",artc_switch=");
                if (this.mEnableRtcSwitch) {
                    str = "1";
                } else {
                    str = "0";
                }
                sb.append(str);
                sb.append(",artc_abr_first_switch_time=");
                sb.append(this.mArtcFirstAbrSwitchTime);
                Map<String, String> map = this.mConfigClone.T;
                if (!(map == null || !map.containsKey("definition_list") || this.mConfigClone.T.get("definition_list") == null)) {
                    sb.append(",definition_list=");
                    sb.append(this.mConfigClone.T.get("definition_list"));
                }
            }
            sb.append(",error_code_new=");
            sb.append(taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ERROR_CODE_NEW, 0L));
            sb.append(",error_code_sub=");
            sb.append(taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_ERROR_CODE_SUB, 0L));
            if (this.mDynamicPlayExMap.size() > 0) {
                for (Map.Entry<String, String> entry : this.mDynamicPlayExMap.entrySet()) {
                    if (!atb.EXP_KEY_SUB_BUSINESS_TYPE.equals(entry.getKey()) && !"vod_scenario".equals(entry.getKey()) && !"videoActionType".equals(entry.getKey())) {
                        sb.append(",");
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                    }
                }
            }
            if (this.mActiveDataSource != null) {
                sb.append(",exp=");
                sb.append(this.mActiveDataSource.b);
            }
            try {
                commitStat19997("Page_Video", CT.Button, RTCSTREAM_MAIDIAN_INFO, sb.toString());
            } catch (Throwable unused) {
            }
        }
        synchronized (this.mLock) {
            try {
                this.mBeatCount = 0;
                if (this.mHandler != null) {
                    this.bPaused = false;
                    this.mExit = true;
                    commitPlaying();
                    this.bPaused = true;
                    this.mExit = false;
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                    this.mUTRun = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        releaseWatchHandler();
    }

    public MonitorMediaPlayer() {
        this.mContextRef = null;
        this.AppMonitor_Module = "";
        this.mDegradeCode = 0;
        this.mOriginSelectedUrlName = "";
        this.mBufferingStart = 0L;
        this.mLastBuffering = 0L;
        this.mLastCommitPlaying = 0L;
        this.mLastBufferDuration = 0L;
        this.mStallReason = 0L;
        this.mStallStartTime = 0L;
        this.mSeekStart = 0L;
        this.mSeekTime = 0L;
        this.mCurrSeekTime = 0L;
        this.mSeekPos = -1L;
        this.mPrepareStartTime = 0L;
        this.mStartTime = 0L;
        this.mFirstPlayTime = 0L;
        this.mFirstFrameSurfaceUpdateTime = -1L;
        this.mFirstFrameSurfaceUpdateTs = 0L;
        this.mFirstUpdateTimeFromPlayerStart = -1L;
        this.mFirstRenderTime = 0L;
        this.mSecondRenderTime = 0L;
        this.mUserFirstFrameTime = -1L;
        this.mLastPlayTime = 0L;
        this.mTotalPlayTime = 0L;
        this.mBufferingCountNew = 0L;
        this.mBufferingTotalTimeNew = 0L;
        this.mBufferingHeartBeatCount = 0L;
        this.mBufferingHeartBeatTotalTime = 0L;
        this.videoRenderingStalledCount = 0L;
        this.videoRenderingStalledTotalDuration = 0L;
        this.videoRenderingStalledCountInRenderThread = 0L;
        this.videoRenderingStalledTotalDurationInRenderThread = 0L;
        this.videoRenderingStalledCountNew_43833053 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053 = 0L;
        this.videoRenderingStalledCountNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_LastForVpm = 0L;
        this.videoRenderingStalledCountNew_43833053_r1 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r1 = 0L;
        this.videoRenderingStalledCountNew_43833053_r2 = 0L;
        this.videoRenderingStalledTotalDurationNew_43833053_r2 = 0L;
        this.videoRenderingStalledCountNewWithResolution = 0L;
        this.mEnableAddUnorderedStall = true;
        this.duplicateFrameCount = 0L;
        this.videoRenderingStalledCountNew_43833053_reasons = new long[]{0, 0, 0};
        this.mRtcStrategicAbnormalCount = 0L;
        this.mRtcStrategicAbnormalTime = 0L;
        this.mRtcTotalRate = 0.0f;
        this.mRtcPlayRate = 0.0f;
        this.mUsePlayRateCalSubStall = true;
        this.mRtcTotalCount = 0;
        this.videoRenderingStalledCount_live = 0L;
        this.videoRenderingStalledTotalDuration_live = 0L;
        this.mLock = new Object();
        this.mTimeLock = new Object();
        this.mRenderStatLock = new Object();
        this.mDebugStatus = ied.PULL_INIT;
        this.bNeedCommitPlayExperience = false;
        this.bMediacodeError = false;
        this.bInitEglError = false;
        this.bFirstFrameRendered = false;
        this.bSecondFrameRendered = false;
        this.mRtcVideoNackBackoffDisable = 0;
        this.mRtcPacketBufferClearToKeyDiasble = 0;
        this.mRtcCongestionMode = 0L;
        this.mServerIPJson = "";
        this.mNetStackType = 0;
        this.mPlayerEventList = new LinkedList<>();
        this.mPlayerPullAudioEventList = new LinkedList<>();
        this.mRtcLiveAbrReasonList = new LinkedList<>();
        this.mTmpEnableGetStartTimeInRelease = true;
        this.mSendLogToken = true;
        this.mFetchArtcSoReadyInit = false;
        this.mFetchS266SoReadyInit = false;
        this.mFetchFFMpegSoReadyInit = false;
        this.mFetchArtcSoAfterSelect = false;
        this.mFetchSoStartTime = 0L;
        this.mFetchSoTime = 0L;
        this.mHasCommitFetchSoFinish = false;
        this.TIME_OF_COMMIT_FETCH_SO = 10000L;
        this.mCommitLivePushControlInfo = true;
        this.mEnableSeekInPause = false;
        this.mIsFloatWindow = false;
        this.mSelectFlvUrlReason = 0;
        this.mLastPlayError = 0;
        this.mAuthResultCode = -1;
        this.mServerAuthLevel = -1;
        this.mViewIsVisible = true;
        this.mEnableStatRenderStallInNonVisible = false;
        this.mEnableStatRenderStallInNonSurface = false;
        this.mEnableStatRenderStallInNative = true;
        this.mShouldStatRenderStallInNative = true;
        this.mIsBackground = false;
        this.mSeekFastMode = true;
        this.mSwitchToBackground = false;
        this.mSwitchToForeground = false;
        this.mCheckMp4PatternWhenUseUrlCache = 1;
        this.mGenerateCacheKeyModeWhenUseUrlCache = 1;
        this.mIgnoreParamListWhenGenerateCacheKeyMode = new LinkedList();
        this.mSeamlessSwitchMode = 0;
        this.mSeamlessSwitchStatus = -1;
        this.mForceMuteMode = false;
        this.bPauseInBackground = false;
        this.mLastMuteState = true;
        this.mLastErrorCode = 0;
        this.mLastExtra = 0;
        this.mLastIsConnected = 1;
        this.mReportBitrateTimes = 0;
        this.mHandler = null;
        this.mAudioBytes = 0L;
        this.mVideoBytes = 0L;
        this.mVideoDuration = 0L;
        this.pauseByTelephone = false;
        this.bPaused = false;
        this.mHeartBeatInterval = -1L;
        this.mNewEventStatusNode = "";
        this.mFatalErrorASync = 0L;
        this.mFatalErrorASyncTime = 0L;
        this.mSwitchByRtc = false;
        this.mState = 0;
        this.mLastState = 0;
        this.end2endDelay = null;
        this.mLastVideoSizePlayTime = 0L;
        this.mPlayStartVideoWidth = 0;
        this.mPlayStartVideoHeight = 0;
        this.mVodPlayerNum = 0;
        this.mLivePlayerNum = 0;
        this.mLiveWarmupNum = 0;
        this.mUseMediacodec = true;
        this.mUseSoftwareByPolicy = 0;
        this.mNotSetH26XInConfig = false;
        this.mUTRun = null;
        this.mVideoRenderStalledDurationThreshold = 200L;
        this.UNINITIALIZED_MIN_VAL = -9999L;
        this.isFirstFrameRendered = false;
        this.mT = -9999L;
        this.mTD = -9999L;
        this.mTn = -9999L;
        this.mTDn = -9999L;
        this.mResumeTs = -9999L;
        this.monitorNewStalled = false;
        this.mRenderStallStatInfoForFirstTime = "";
        this.mVideoCacheBytesInRendering = -1L;
        this.mVideoCacheFramesInRendering = -1L;
        this.mRequestBytesInRendering = -1L;
        this.mReceiveFramesInRendering = -1L;
        this.mUseEventId19997 = false;
        this.mHttpDnsOriginLock = new Object();
        this.mPanoType = 0;
        this.mPlayerIndex = 0L;
        this.mCacheReason = 0;
        this.mUnuseProxyReason = 0;
        this.mEnableSyncAfterSeek = false;
        this.mEnablePlayrate3DropPKT = false;
        this.mAbIdOfSyncAfterSeek = -99;
        this.mMediaCodecInputErrorCode = 0;
        this.mMediaCodecOutputErrorCode = 0;
        this.mCurrentPageName = "";
        this.mIsPrerelease = false;
        this.mFromNotValid = false;
        this.mFrameInfoLevel = -1;
        this.mFrameInfoTop1Position = 0;
        this.mFrameInfoTop2Position = 0;
        this.mHeartBeatFPS = new StringBuilder(10);
        this.mHeartBeatDownloadFPS = new StringBuilder(10);
        this.mHeartBeatDecodeFPS = new StringBuilder(10);
        this.mHeartBeatNetSpeed = new StringBuilder(10);
        this.mDisableFixSeekCount = false;
        this.mEnableChangeCurPositionToVideoPosition = true;
        this.mIsPlayingFlv = false;
        this.mEnableDecodeAACDSE = false;
        this.mFirstRenderRecvTime = 0L;
        this.mRotate = 0;
        this.mH265AuthenStrategy = H265AuthenStrategy.WHITLIST;
        this.mH264AuthenStrategy = H264AuthenStrategy.WHITLIST;
        this.mAudioGainCoef = 1.0f;
        this.mEnableAudioGain = false;
        this.mLastRenderVideoEveryFrame = 0L;
        this.mMaxRenderAbnormalInRenderThread = 200;
        this.mEnableSeekFlushBuffer = true;
        this.mEnableAudioClip = false;
        this.mWarmupStartTime = 0L;
        this.mWarmupEndTime = 0L;
        this.mWarmupReceiveBytes = 0L;
        this.mWatchHandler = null;
        this.mWatchLastMessageTime = 0L;
        this.mWatchInterval = 0L;
        this.mWatchExceedThreshold = 0L;
        this.mMessageWasteExceedThreshold = 10;
        this.mWatchExceedTime1 = 0L;
        this.mWatchExceedNum1 = 0L;
        this.mWatchExceedTime2 = 0L;
        this.mWatchExceedNum2 = 0L;
        this.mWatchPhase = 0;
        this.mEnableWatch = false;
        this.mCodeClean = true;
        this.mWatchMinTime = 10L;
        this.mWatchLock = new Object();
        this.mEnableFixAbnormalStatForFirstRender = true;
        this.mEnableFixAbnormalStatForLoop = true;
        this.mDisablePullAudio = 0;
        this.mStreamSelectReasonList = new LinkedList<>();
        this.mIsDecoderLoaded = false;
        this.mMuteAudio = false;
        this.mPlayRate = 1.0f;
        this.mPlayInPIP = false;
        this.mTotalBgPlayTime = 0L;
        this.mLastBgPlayTime = 0L;
        this.mTotalFloatWindowsPlayTime = 0L;
        this.mLastFloatWindowsPlayTime = 0L;
        this.mTotalFloatWindowsCount = 0;
        this.mTotalBgCount = 0;
        this.mSwitchToBackKey = wua.KEY_SMALL_WINDOW;
        this.mSwitchToFrontKey = "liveRoom";
        this.mMediaCodecErrorReason = 0;
        this.mMediaCodecProcessError = 0;
        this.mSyncNotifyHttpDns = true;
        this.mFirstSwitchDownReason = -1;
        this.mArtcFirstAbrSwitchTime = 0L;
        this.mPlayingLiveDefinition = "";
        this.mSwitchTargetLiveDefinition = "";
        this.mArtcTraceDataIndex = 0;
        this.mRtcVideoFirstFrameTime = 0L;
        this.mRtcVideoFirstPacketTime = 0L;
        this.mRtcAudioFirstPacketTime = 0L;
        this.mAbnormalPlayDuration = 0L;
        this.mAbnormalPlayFrameCount = 0;
        this.mValidAbnormalFrameCount = 1;
        this.mAbnormalPlaySpeedThreshold = 0.2f;
        this.mCurrRenderingStatus = 0;
        this.mTotalQuickPlayTime = 0L;
        this.mTotalSlowPlayTime = 0L;
        this.mTotalQuickPlayFrameCount = 0L;
        this.mTotalSlowPlayFrameCount = 0L;
        this.mTotalQuickPlayTimeAll = 0L;
        this.mTotalSlowPlayTimeAll = 0L;
        this.mTotalQuickFrameCountAll = 0L;
        this.mTotalSlowFrameCountAll = 0L;
        this.mMaxPlayerInstanceCount = -1;
        this.seekTimeList = new LinkedList();
        this.maxSeekTime = -1L;
        this.mHasEverEnableBluetooth = false;
        this.mMuteStateNodes = new LinkedList();
        this.mVolumeStateNodes = new LinkedList();
        this.mAlwaysMutePlay = true;
        this.mIsPlayingWhenInvisible = false;
        this.mIsPlayingInBackground = false;
        this.mIsPlayingInBackgroundNew = false;
        this.mIsFirstRenderStalledPtsRecorded = false;
        this.mFirstRenderStalledPts = -1L;
        this.mCacheLengthAtStart = -1L;
        this.mPlayerInitTimeMS = -1L;
        this.mSetUrlTs = -1L;
        this.mVideoRenderingStalledCountNewUpdate = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r1 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r2 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r3 = 0L;
        this.mVideoRenderingStalledCountNewUpdate_r4 = 0L;
        this.mLastMonitorRenderSystemTime = 0L;
        this.mIsFirstFrameRenderedNewUpdate = false;
        this.mLastStalledFrameRenderSystemTime = -9999L;
        this.mLastStalledFrameFramePts = -9999L;
        this.mLastFrameRenderSystemTime = -9999L;
        this.mLastFramePts = -9999L;
        this.mResumeTsNew = -9999L;
        this.mDisorderFrameCountNew = 0L;
        this.mFrameCountInDelayState = 0L;
        this.mFrameCountRecoverInDelayState = 0L;
        this.mStalledCountInDelayState = 0L;
        this.mMaxStalledCountInDelay = 0L;
        this.mDelayTimeAtDelayBegin = 0L;
        this.mTotalDelayTime = 0L;
        this.mSystemTimeAtDelayBegin = 0L;
        this.mIsInDelayStallInterval = false;
        this.MIN_FRAME_COUNT_IN_DELAY_STATE = 10L;
        this.MIN_TIME_IN_DELAY_STATE = 500L;
        this.mEnableRenderStallCalNew = true;
        this.mHasUpdateSourceFps = false;
        this.mSourceFpsInterval = 0.0f;
        this.mMaxStalledCountInInterval = vu3.b.GEO_NOT_SUPPORT;
        this.mMaxFpsAtStalledCal = 0.0f;
        this.mMaxRenderInterval = -1L;
        this.mFixMisorderFrameCount = false;
        this.mAlwaysFrontgroundPlay = true;
        this.playerCreatedPageName = "default";
        this.mPlayerCreatTs = -1L;
        this.mPlayerP2ffFinishedTs = -1L;
        this.mExperiment = 0L;
        this.firstStalledCount = 0L;
        this.firstStalledPlayTime = 0L;
        this.maxStalledCount = 0L;
        this.maxStalledPlayTime = 0L;
        this.index = 0;
    }
}
