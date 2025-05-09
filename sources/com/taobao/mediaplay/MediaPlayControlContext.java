package com.taobao.mediaplay;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.adaemon.ADaemon;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.vpm.VPMManagerInstance;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ca5;
import tb.cq;
import tb.ew0;
import tb.feh;
import tb.fq;
import tb.gf4;
import tb.ja1;
import tb.nfi;
import tb.qvd;
import tb.t2o;
import tb.tfb;
import tb.tug;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaPlayControlContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] PRIORITY_OF_NEW_DEFINITION = {MediaConstant.DEFINITION_UHD, MediaConstant.DEFINITION_QHD, MediaConstant.DEFINITION_UD_60, MediaConstant.DEFINITION_UD, MediaConstant.DEFINITION_HD_60, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_MD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_LLD};
    public static final String[] PRIORITY_OF_NEW_DEFINITION_REVERT = {MediaConstant.DEFINITION_LLD, MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_MD, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_HD_60, MediaConstant.DEFINITION_UD, MediaConstant.DEFINITION_UD_60, MediaConstant.DEFINITION_QHD, MediaConstant.DEFINITION_UHD};
    public static final String[] PRIORITY_OF_NEW_DEFINITION_UD = {MediaConstant.DEFINITION_UD_60, MediaConstant.DEFINITION_UD, MediaConstant.DEFINITION_HD_60, MediaConstant.DEFINITION_HD, MediaConstant.DEFINITION_UHD, MediaConstant.DEFINITION_QHD, MediaConstant.DEFINITION_MD, MediaConstant.DEFINITION_SD, MediaConstant.DEFINITION_LD, MediaConstant.DEFINITION_LLD};
    public static final int SELECT_DEFINITION_REASON_DEFAULT = 0;
    public static final int SELECT_DEFINITION_REASON_INIT_NEW_DEFINITION = 16;
    public static final int SELECT_DEFINITION_REASON_LOW_DEVICE = 1;
    public static final int SELECT_DEFINITION_REASON_LOW_NET = 2;
    public static final int SELECT_DEFINITION_REASON_NETWORK_TYPE = 128;
    public static final int SELECT_DEFINITION_REASON_NEW_DECISION = 32;
    public static final int SELECT_DEFINITION_REASON_NEW_DEFINITION = 8;
    public static final int SELECT_DEFINITION_REASON_ONE_DEFINITION = 64;
    public static final int SELECT_DEFINITION_REASON_RECOM = 4;
    public static final int SELECT_DEFINITION_REASON_RTC_WEAK_NET_FLAG = 1024;
    public static final int SELECT_DEFINITION_REASON_SUPPORT_60FPS_DEVICE_LEVEL = 256;
    public static final int SELECT_DEFINITION_REASON_SUPPORT_60FPS_DEVICE_MODEL = 512;
    public boolean isRtcVVC;
    public String mAccountId;
    private float mAudioGainCoef;
    public boolean mAutoDegradedWhenError;
    private int mAvdataBufferedMaxMBytes;
    private int mAvdataBufferedMaxTime;
    private String mBackupCacheKey;
    private String mBackupVideoDefinition;
    private int mBackupVideoLength;
    private String mBackupVideoUrl;
    public String mBusinessId;
    private String mCacheKey;
    public String mConfigGroup;
    public Context mContext;
    private int mCurrentBitRate;
    private int mCurrentLevel;
    public boolean mDegradeToFlvByArtoSoNoReady;
    private String mDevicePerformanceLevel;
    private boolean mDisableS266CountLimit;
    public boolean mDropFrameForH265;
    public boolean mEnableAdaptiveLiveSwitch;
    private boolean mEnableCacheLengthNew;
    private boolean mEnableGetRealLength;
    private String mEnableHDRDevices;
    private String mEnableHDRSBTForVideo;
    private boolean mEnableMediaInfoLength;
    private boolean mEnableNewNetPolicy;
    private boolean mEnableS266;
    private String mEnableS266Devices;
    private boolean mEnableS266InstanceErrorCondition;
    private String mEnableS266SBTForLive;
    private String mEnableS266SBTForVideo;
    private boolean mEnableSelectHdByClickLoad;
    public boolean mFixedSurfaceControl;
    public String mFrom;
    private double mGlobalCurrentBandWidth;
    private double mGlobalPredictBandWidth;
    private boolean mHandlingVVCError;
    public boolean mHasChooseS266;
    private boolean mHasInitS266Param;
    public boolean mHasVVCErrorEver;
    public String mHighCachePath;
    public String mHighVideoDefinition;
    public String mInitDefinition;
    public boolean mIsForPreDownload;
    private boolean mIsLiveRoom;
    public int mLastPlayError;
    public TBLiveMSGInfo mLiveMSGInfo;
    public HashMap<String, a> mLiveRateAdapteUrlNewPolicyMap;
    public boolean mLocalVideo;
    private feh mLogContext;
    public boolean mLowDeviceSVC;
    private boolean mLowPerformance;
    public String mLowQualityUrl;
    public String mLowSpeedArtpCommonParamsJson;
    public String mLowSpeedPolicyABConfigValue;
    public boolean mLowSpeedPolicyOperator;
    private int mMaxLevel;
    public JSONObject mMediaInfoParams;
    public MediaLiveInfo mMediaLiveInfo;
    public String mMediaSourceType;
    private int mNetSpeed;
    private int mNetWorkQuality;
    public boolean mOnlyVideoEnable;
    public String mPlayToken;
    private int mPlayableBytes;
    public PlayerQualityItem mPlayerQualityItem;
    public QualityLiveItem mQualityLiveItem;
    private String mRateAdaptePriority;
    public int mRuntimeLevel;
    public boolean mSVCEnable;
    public String mSeamlessSwitchingSelectName;
    public String mSeamlessSwitchingVideoPath;
    public int mSeekWhenPrepared;
    public String mSelectDefinition;
    public int mSelectFlvUrlReason;
    public String mSelectedUrlName;
    public PlayerQualityItem mSwitchingPlayerQualityItem;
    public boolean mTBLive;
    public qvd mTBVideoSourceAdapter;
    private boolean mUseTBNet;
    private String mVideoDefinition;
    private boolean mVideoDeviceMeaseureEnable;
    public String mVideoId;
    private int mVideoLength;
    public String mVideoSource;
    private String mVideoToken;
    private String mVideoUrl;
    public boolean mH265Enable = true;
    private boolean mTransH265 = true;
    private boolean mRateAdapte = false;
    private boolean mTopAnchor = false;
    private boolean mHardwareHevc = true;
    private boolean mForceMuteMode = false;
    private boolean mVideoIsHDR = false;
    private boolean mCanSelectHDR = false;
    private boolean mH265 = false;
    public boolean mUseMiniBfrtc = false;
    public boolean mSwitchingLower = false;
    private int mPlayerType = 1;
    public HashSet<Long> mExperienceIdSet = new HashSet<>();
    public HashSet<Long> mExperienceReleaseIdSet = new HashSet<>();
    public HashSet<Long> mExperienceBucketIdSet = new HashSet<>();
    private boolean mHardwareAvc = true;
    public boolean mUseArtp = false;
    public boolean mUseBfrtc = false;
    public boolean mUseRtcLive = false;
    public boolean mUseTransCodeRtcLive = true;
    public String mDefinitionBlackList = "";
    public int mDegradeCode = 0;
    public String mOriginSelectedUrlName = "";
    public boolean mHighPerformancePlayer = false;
    public boolean mBackgroundMode = true;
    public boolean mSeekIgnorePauseStateWhenPrepared = false;
    public boolean mEnableAutoPauseInBackground = true;
    public int mSelectDefinitionReason = 0;
    public int mSelectDefinitionSpeed = 0;
    public long mLiveDefinition1080AvgBitrate = -1;
    public long mLiveDefinition1080MaxBitrate = -1;
    public long mLiveMaxBitrate = -1;
    public boolean mRequestShortAudioFocus = false;
    public boolean mNeedInitLowSpeedPolicyAB = true;
    public boolean mEnableLowSpeedPolicy = true;
    public boolean mHasLowSpeedPolicy = false;
    public boolean mUseLowSpeedPolicy = false;
    public boolean mLowSpeedPolicy = false;
    public boolean mEnableLowSpeedPolicyAB = false;
    public int mLowSpeedPolicyABId = 0;
    public boolean mEnableSRSByRTCWeakNetFlag = false;
    public int mPlayerCoreWeakNetFlagLifeTime = JosStatusCodes.RTN_CODE_COMMON_ERROR;
    public boolean mLiveRtcWeakNetFlag = false;
    public boolean mEnableLiveRtcWeakNetSVCDrop = false;
    public boolean mLiveRtcWeakNetSVCDrop = false;
    public boolean mEnableLiveRtcHomePageCardSVCDrop = false;
    public boolean mEnableCdnStartPlaySpeed = true;
    public int mDefinitionDeciseWindow = 180000;
    public boolean mSetPauseFrameLock = false;
    public boolean mEnablePauseFrameLock = false;
    public String mLowSpeedNewPolicyConfigValue = "{\"ud\":{\"max_rtt\":\"40\",\"max_v_loss_rate\":\"0.2\",\"max_stall_time_msps\":\"50\",\"network_type_black_list\":[\"2G\",\"3G\",\"4G\",\"*\"]},\"hd\":{}}";
    public double mBetaForVodSelect = 0.5d;
    public String mBitRateMapStr = "";
    public int mSelectReasonForPreDownload = -1;
    public double mNetSpeedForPreDownload = -1.0d;
    public double mNetSpeedByRobustAtPreDL = -1.0d;
    public int mNetSpeedCalReasonForPreDL = -1;
    public boolean mUseRecDataTime = false;
    public int mDefDegradeReason = -1;
    public int mUD265BitRate = -1;
    public int mUD265HDRBitrate = -1;
    public int mHD265BitRate = -1;
    public int mHD265HDRBitRate = -1;
    public int mHD264BitRate = -1;
    public int mUD266BitRate = -1;
    public int mHD266BitRate = -1;
    private boolean mHasInitHDRParam = false;
    private boolean mEnableHDR = false;
    public boolean mForceHDR = false;
    public boolean mEnableFullPCMediaInfo = false;
    public VVC_CHOOSE_REASON mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_INIT;
    public boolean mCheckInvalidCalBitRateByAB = true;
    public boolean mForceUseSurfaceView = false;
    public boolean mUseSurfaceControl = false;
    private boolean mLowDeviceFirstRender = true;
    public boolean mEmbed = false;
    private boolean mMute = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
    private boolean mRtcLiveAutoSwitch = false;
    public H265AuthenStrategy mH265AuthenStrategy = H265AuthenStrategy.BLACKLIST;
    public H264AuthenStrategy mH264AuthenStrategy = H264AuthenStrategy.BLACKLIST;
    private boolean mSupportAudioGain = false;
    public Map<String, String> mHttpHeader = null;
    private boolean mAudioOff = false;
    public boolean mReleaseByCustom = false;
    public boolean mHasQueryMediaInfo = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum VVC_CHOOSE_REASON {
        VVC_CHOOSE_REASON_INIT(0),
        VVC_CHOOSE_REASON_INSTANCE_ERROR(1),
        VVC_CHOOSE_REASON_HANDLING_ERROR(2),
        VVC_CHOOSE_REASON_SO_NOT_READY(3),
        VVC_CHOOSE_REASON_PLAYING(4),
        VVC_CHOOSE_REASON_PRELOADING(5),
        VVC_CHOOSE_REASON_NOT_WHITE_DEVICE(6),
        VVC_CHOOSE_REASON_NOT_LIVE_SBT(7),
        VVC_CHOOSE_REASON_NOT_VOD_SBT(8),
        VVC_CHOOSE_REASON_AVCODEC_SO_NOT_READY(9),
        VVC_CHOOSE_REASON_BY_SKIP_ONCE_FOR_VVC(10);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        VVC_CHOOSE_REASON(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(VVC_CHOOSE_REASON vvc_choose_reason, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaPlayControlContext$VVC_CHOOSE_REASON");
        }

        public static VVC_CHOOSE_REASON valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VVC_CHOOSE_REASON) ipChange.ipc$dispatch("3921db20", new Object[]{str});
            }
            return (VVC_CHOOSE_REASON) Enum.valueOf(VVC_CHOOSE_REASON.class, str);
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
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f11019a = new LinkedList();

        static {
            t2o.a(774897724);
        }

        public a(MediaPlayControlContext mediaPlayControlContext) {
        }
    }

    public MediaPlayControlContext(Context context, String str) {
        this.mContext = context;
        this.mPlayToken = str;
        this.mLogContext = new feh(toString(), str);
        setHardwareAvc(canUseHardwardDecodeOf264());
        setHardwareHevc(canUseHardwardDecodeOf265());
        initS266ParamIfNeeded();
        initHDRParam(context);
        canFullPCMediaInfo();
    }

    public static boolean canUseHardwardDecodeOf264() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42249478", new Object[0])).booleanValue();
        }
        return checkDefaultValueAndList(MediaConstant.ORANGE_HARDWARD_H264_DEFAULT, MediaConstant.ORANGE_HARDWARD_H264_BLACK_LIST, true);
    }

    public static boolean canUseHardwardDecodeOf265() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4232abf9", new Object[0])).booleanValue();
        }
        return checkDefaultValueAndList(MediaConstant.ORANGE_HARDWARD_H265_DEFAULT, MediaConstant.ORANGE_HARDWARD_H265_BLACK_LIST, true);
    }

    private int getCurrentNewDefinitionIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6219a79c", new Object[]{this})).intValue();
        }
        if (this.mPlayerQualityItem == null) {
            return -1;
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(this.mPlayerQualityItem.newDefinition)) {
                return i;
            }
        }
        return -1;
    }

    private Pair<Integer, Integer> getNewDefintionByAvgNetSpeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1b9aa115", new Object[]{this, new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < this.mMediaLiveInfo.liveUrlList.size(); i2++) {
            QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(i2);
            if (!TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                String str = qualityLiveItem.newDefinition;
                String str2 = qualityLiveItem.newName;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    hashMap.put(str, Integer.valueOf(i2));
                }
            }
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        Pair<Integer, Integer> pair = null;
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (hashMap.containsKey(strArr[length])) {
                Integer num = (Integer) hashMap.get(strArr[length]);
                QualityLiveItem qualityLiveItem2 = this.mMediaLiveInfo.liveUrlList.get(num.intValue());
                if (pair == null) {
                    pair = new Pair<>(Integer.valueOf(length), num);
                }
                long streamAvgBitrate = qualityLiveItem2.getStreamAvgBitrate();
                if (streamAvgBitrate > 0 && i > streamAvgBitrate) {
                    return new Pair<>(Integer.valueOf(length), num);
                }
            }
        }
        return pair;
    }

    private void initHDRParam(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160ae1a", new Object[]{this, context});
        } else if (!this.mHasInitHDRParam) {
            ja1.r0(context);
            this.mEnableHDR = ja1.Y0;
            this.mForceHDR = ja1.Z0;
            this.mEnableHDRDevices = ja1.b1;
            this.mEnableHDRSBTForVideo = ja1.c1;
            this.mFixedSurfaceControl = ja1.a1;
            this.mHasInitHDRParam = true;
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "HDR initHDRParams true mEnableHDR " + this.mEnableHDR + " mForceHDR " + this.mForceHDR + " mEnableHDRDevices: " + this.mEnableHDRDevices + " mEnableHDRSBTForVideo " + this.mEnableHDRSBTForVideo);
        }
    }

    private boolean isLowNetSpeedByVpm(String str) {
        try {
            return ((Boolean) VPMManagerInstance.class.getMethod("filterHAMetricsWithCriteria", String.class, Boolean.class).invoke(VPMManagerInstance.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str, Boolean.valueOf(this.mLowSpeedPolicyOperator))).booleanValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "MediaPlayControlManager: class not found error:" + e.toString());
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "MediaPlayControlManager: vpmha ill:" + e2.toString());
            return false;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            feh fehVar3 = this.mLogContext;
            AVSDKLog.e(fehVar3, "MediaPlayControlManager: vpmha no such method:" + e3.toString());
            return false;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            feh fehVar4 = this.mLogContext;
            AVSDKLog.e(fehVar4, "MediaPlayControlManager: vpmha invocation excaption:" + e4.toString());
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            feh fehVar5 = this.mLogContext;
            AVSDKLog.e(fehVar5, "MediaPlayControlManager: vpmha exception:" + e5.toString());
            return false;
        }
    }

    public void addExperienceInfo(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fe0204", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        this.mExperienceIdSet.add(Long.valueOf(j));
        this.mExperienceReleaseIdSet.add(Long.valueOf(j2));
        this.mExperienceBucketIdSet.add(Long.valueOf(j3));
    }

    public void canFullPCMediaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278f5ea7", new Object[]{this});
        } else {
            this.mEnableFullPCMediaInfo = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enFullPC", "false"));
        }
    }

    public boolean canSelectHDRUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd918cb0", new Object[]{this})).booleanValue();
        }
        if (!this.mEnableHDR) {
            AVSDKLog.e(this.mLogContext, "HDR canSelectHDRUrl false by orange");
            return false;
        } else if (!ew0.n(Build.MODEL, this.mEnableHDRDevices)) {
            AVSDKLog.e(this.mLogContext, "HDR canSelectHDRUrl false by devices");
            return false;
        } else if (this.mForceHDR) {
            return true;
        } else {
            if (!this.mIsForPreDownload && (TextUtils.isEmpty(this.mEnableHDRSBTForVideo) || !ew0.n(getFrom(), this.mEnableHDRSBTForVideo))) {
                AVSDKLog.e(this.mLogContext, "HDR canSelectHDRUrl false by SBT");
                return false;
            } else if (!ja1.h || !ja1.g || ja1.q || ja1.s > 0 || ja1.p > 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean canSelectHDRUrlForVideo() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1c3002", new Object[]{this})).booleanValue();
        }
        if (!canSelectHDRUrl()) {
            return false;
        }
        if (!this.mIsForPreDownload) {
            if (this.mForceUseSurfaceView && this.mUseSurfaceControl) {
                z = true;
            }
            this.mCanSelectHDR = z;
        } else {
            this.mCanSelectHDR = true;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "HDR canSelectHDRUrlForVideo videoID " + this.mVideoId + " mIsForPreDownload " + this.mIsForPreDownload + " mForceUseSurfaceView " + this.mForceUseSurfaceView + " mUseSurfaceControl " + this.mUseSurfaceControl + " canSelectHDRUrl " + this.mCanSelectHDR);
        return this.mCanSelectHDR;
    }

    public boolean canSelectS266UrlForLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cabbf7c", new Object[]{this})).booleanValue();
        }
        if (!canSelectS266Url()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mEnableS266SBTForLive) && ew0.n(getFrom(), this.mEnableS266SBTForLive)) {
            return true;
        }
        this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_LIVE_SBT;
        return false;
    }

    public boolean canSelectS266UrlForVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edf0421", new Object[]{this})).booleanValue();
        }
        if (!canSelectS266Url()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mEnableS266SBTForVideo) && ew0.n(getFrom(), this.mEnableS266SBTForVideo)) {
            return true;
        }
        this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_VOD_SBT;
        return false;
    }

    public float getAudioGainCoef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69fb8ae3", new Object[]{this})).floatValue();
        }
        return this.mAudioGainCoef;
    }

    public boolean getAudioGainEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("279f1bad", new Object[]{this})).booleanValue();
        }
        return this.mSupportAudioGain;
    }

    public boolean getAudioOffFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e0f246", new Object[]{this})).booleanValue();
        }
        return this.mAudioOff;
    }

    public int getAvdataBufferedMaxMBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed48208", new Object[]{this})).intValue();
        }
        return this.mAvdataBufferedMaxMBytes;
    }

    public int getAvdataBufferedMaxTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b0ad57", new Object[]{this})).intValue();
        }
        return this.mAvdataBufferedMaxTime;
    }

    public String getBackupCacheKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3adfb1c4", new Object[]{this});
        }
        return this.mBackupCacheKey;
    }

    public String getBackupVideoDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b684063", new Object[]{this});
        }
        return this.mBackupVideoDefinition;
    }

    public int getBackupVideoLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ea4763", new Object[]{this})).intValue();
        }
        return this.mBackupVideoLength;
    }

    public String getBackupVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7c7dead", new Object[]{this});
        }
        return this.mBackupVideoUrl;
    }

    public String getCacheKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        return this.mCacheKey;
    }

    public int getCurrentBitRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("626b3c44", new Object[]{this})).intValue();
        }
        return this.mCurrentBitRate;
    }

    public int getCurrentLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88ef9ffb", new Object[]{this})).intValue();
        }
        return this.mCurrentLevel;
    }

    public int getDegradeCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4ceafc7", new Object[]{this})).intValue();
        }
        return this.mDegradeCode;
    }

    public String getDevicePerformanceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10e2ec59", new Object[]{this});
        }
        return this.mDevicePerformanceLevel;
    }

    public String getDisableDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd7cde74", new Object[]{this});
        }
        return this.mDefinitionBlackList;
    }

    public boolean getEnableCacheLengthNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b6485c", new Object[]{this})).booleanValue();
        }
        return this.mEnableCacheLengthNew;
    }

    public boolean getEnableMediaInfoLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e2b0b8a", new Object[]{this})).booleanValue();
        }
        return this.mEnableMediaInfoLength;
    }

    public boolean getEnableRealLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52bc7188", new Object[]{this})).booleanValue();
        }
        return this.mEnableGetRealLength;
    }

    public boolean getEnableSelectHdByClickLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bf17e11", new Object[]{this})).booleanValue();
        }
        return this.mEnableSelectHdByClickLoad;
    }

    public boolean getForceMuteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27611fbc", new Object[]{this})).booleanValue();
        }
        return this.mForceMuteMode;
    }

    public String getFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.mFrom;
    }

    public double getGlobalCurrentBandWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205e97c6", new Object[]{this})).doubleValue();
        }
        return this.mGlobalCurrentBandWidth;
    }

    public double getGlobalPredictBandWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfbe9c66", new Object[]{this})).doubleValue();
        }
        return this.mGlobalPredictBandWidth;
    }

    public String getHighCachePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38d522ca", new Object[]{this});
        }
        return this.mHighCachePath;
    }

    public boolean getLowDeviceFirstRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a320db3d", new Object[]{this})).booleanValue();
        }
        return this.mLowDeviceFirstRender;
    }

    public String getLowSpeedArtpCommonParamsJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8721618a", new Object[]{this});
        }
        return this.mLowSpeedArtpCommonParamsJson;
    }

    public int getMaxLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9529b70", new Object[]{this})).intValue();
        }
        return this.mMaxLevel;
    }

    public JSONObject getMediaInfoParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41ec4697", new Object[]{this});
        }
        if (ca5.t(this.mMediaInfoParams)) {
            return this.mMediaInfoParams;
        }
        return null;
    }

    public int getNetSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3442929a", new Object[]{this})).intValue();
        }
        return this.mNetSpeed;
    }

    public int getNetWorkQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb768cc1", new Object[]{this})).intValue();
        }
        return this.mNetWorkQuality;
    }

    public Pair<String, String> getNewDefintionByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9f8f4d5f", new Object[]{this, new Integer(i)});
        }
        QualityLiveItem qualityLiveItemByNewDefinitionIndex = getQualityLiveItemByNewDefinitionIndex(i);
        if (qualityLiveItemByNewDefinitionIndex != null) {
            return new Pair<>(qualityLiveItemByNewDefinitionIndex.newDefinition, qualityLiveItemByNewDefinitionIndex.newName);
        }
        return null;
    }

    public Pair<String, String> getNewDefintionByNetSpeed(int i, int i2, int i3) {
        ArrayList<QualityLiveItem> arrayList;
        PlayerQualityItem playerQualityItem;
        int currentNewDefinitionIndex;
        int i4;
        Pair<Integer, Integer> newDefintionByAvgNetSpeed;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("460d3db1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        MediaLiveInfo mediaLiveInfo = this.mMediaLiveInfo;
        if (mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || (playerQualityItem = this.mPlayerQualityItem) == null || playerQualityItem.index >= arrayList.size() || this.mPlayerQualityItem.index < 0 || (currentNewDefinitionIndex = getCurrentNewDefinitionIndex()) == -1) {
            return null;
        }
        QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(this.mPlayerQualityItem.index);
        if (i == 1) {
            QualityLiveItem qualityLiveItemByNewDefinitionIndex = getQualityLiveItemByNewDefinitionIndex(i);
            if (qualityLiveItemByNewDefinitionIndex != null) {
                j = qualityLiveItemByNewDefinitionIndex.getStreamMaxBitrate();
            } else {
                j = -1;
            }
            if (i3 <= j || j <= 0) {
                return null;
            }
            return getNewDefintionByIndex(i);
        } else if (i != -1) {
            return null;
        } else {
            long streamMinBitrate = qualityLiveItem.getStreamMinBitrate();
            int i5 = (i2 > streamMinBitrate ? 1 : (i2 == streamMinBitrate ? 0 : -1));
            if (i5 >= 0 || streamMinBitrate <= 0) {
                return getNewDefintionByIndex(i);
            }
            if (i5 >= 0 || i4 <= 0 || (newDefintionByAvgNetSpeed = getNewDefintionByAvgNetSpeed(i2)) == null || ((Integer) newDefintionByAvgNetSpeed.first).intValue() < 0 || currentNewDefinitionIndex >= ((Integer) newDefintionByAvgNetSpeed.first).intValue() || ((Integer) newDefintionByAvgNetSpeed.first).intValue() >= PRIORITY_OF_NEW_DEFINITION.length || ((Integer) newDefintionByAvgNetSpeed.second).intValue() > this.mMediaLiveInfo.liveUrlList.size()) {
                return null;
            }
            QualityLiveItem qualityLiveItem2 = this.mMediaLiveInfo.liveUrlList.get(((Integer) newDefintionByAvgNetSpeed.second).intValue());
            return new Pair<>(qualityLiveItem2.newDefinition, qualityLiveItem2.newName);
        }
    }

    public int getPlayableBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("164bd7c1", new Object[]{this})).intValue();
        }
        return this.mPlayableBytes;
    }

    public int getPlayerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec3a41ab", new Object[]{this})).intValue();
        }
        return this.mPlayerType;
    }

    public QualityLiveItem getQualityLiveItemByNewDefinitionIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QualityLiveItem) ipChange.ipc$dispatch("2c7908d9", new Object[]{this, new Integer(i)});
        }
        int currentNewDefinitionIndex = getCurrentNewDefinitionIndex();
        if (currentNewDefinitionIndex == -1) {
            return null;
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        int i2 = currentNewDefinitionIndex - i;
        if (i2 >= 0 && i2 < strArr.length) {
            for (int i3 = 0; i3 < this.mMediaLiveInfo.liveUrlList.size(); i3++) {
                QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(i3);
                if (!(!strArr[i2].equals(qualityLiveItem.newDefinition) || TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || TextUtils.isEmpty(qualityLiveItem.newName))) {
                    return qualityLiveItem;
                }
            }
        }
        return null;
    }

    public boolean getRateAdapte() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbe7684", new Object[]{this})).booleanValue();
        }
        return this.mRateAdapte;
    }

    public String getRateAdaptePriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fa15bdc", new Object[]{this});
        }
        return this.mRateAdaptePriority;
    }

    public boolean getTopAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7443583f", new Object[]{this})).booleanValue();
        }
        return this.mTopAnchor;
    }

    public String getVideoDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fe3c001", new Object[]{this});
        }
        return this.mVideoDefinition;
    }

    public boolean getVideoIsHDR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d515a2b2", new Object[]{this})).booleanValue();
        }
        return this.mVideoIsHDR;
    }

    public int getVideoLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72dc8105", new Object[]{this})).intValue();
        }
        return this.mVideoLength;
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

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        return this.mVideoUrl;
    }

    public boolean isH265() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b84f885e", new Object[]{this})).booleanValue();
        }
        return this.mH265;
    }

    public boolean isHardwareAvc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("827c16c7", new Object[]{this})).booleanValue();
        }
        return this.mHardwareAvc;
    }

    public boolean isHardwareHevc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("443eaf47", new Object[]{this})).booleanValue();
        }
        return this.mHardwareHevc;
    }

    public boolean isLiveDefinitionAutoSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfd057", new Object[]{this})).booleanValue();
        }
        return this.mRtcLiveAutoSwitch;
    }

    public boolean isLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35ab7b3c", new Object[]{this})).booleanValue();
        }
        return this.mIsLiveRoom;
    }

    public boolean isLowPerformance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb71191", new Object[]{this})).booleanValue();
        }
        return this.mLowPerformance;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        return this.mMute;
    }

    public boolean isUseTBNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ff21fd", new Object[]{this})).booleanValue();
        }
        return this.mUseTBNet;
    }

    public boolean isVideoDeviceMeaseureEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e79a2", new Object[]{this})).booleanValue();
        }
        return this.mVideoDeviceMeaseureEnable;
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.mMute = z;
        }
    }

    public void selecte266ToPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a82d1f", new Object[]{this});
        } else if (!this.mHasChooseS266) {
            if (this.mIsForPreDownload) {
                ja1.b++;
            } else {
                ja1.c++;
            }
            ja1.W0 = true;
            this.mHasChooseS266 = true;
        }
    }

    public void setAudioGainCoef(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca1bd39", new Object[]{this, new Float(f)});
        } else {
            this.mAudioGainCoef = f;
        }
    }

    public void setAudioGainEnble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc860ee", new Object[]{this, new Boolean(z)});
        } else {
            this.mSupportAudioGain = z;
        }
    }

    public void setAudioOffFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d41546", new Object[]{this, new Boolean(z)});
        } else {
            this.mAudioOff = z;
        }
    }

    public void setAvdataBufferedMaxMBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a5969a", new Object[]{this, new Integer(i)});
        } else {
            this.mAvdataBufferedMaxMBytes = i;
        }
    }

    public void setAvdataBufferedMaxTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6324282b", new Object[]{this, new Integer(i)});
        } else {
            this.mAvdataBufferedMaxTime = i;
        }
    }

    public void setBackupCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e2a832", new Object[]{this, str});
        } else {
            this.mBackupCacheKey = str;
        }
    }

    public void setBackupVideoDetail(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfce363", new Object[]{this, str, str2});
            return;
        }
        this.mBackupVideoUrl = str;
        this.mBackupVideoDefinition = str2;
    }

    public void setBackupVideoLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa2b59f", new Object[]{this, new Integer(i)});
        } else {
            this.mBackupVideoLength = i;
        }
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
            return;
        }
        this.mBusinessId = str;
        this.mTBLive = "TBLive".equals(str);
    }

    public void setCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c476ef50", new Object[]{this, str});
        } else {
            this.mCacheKey = str;
        }
    }

    public void setCurrentBitRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39418046", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentBitRate = i;
        }
    }

    public void setCurrentLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709ae06f", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentLevel = i;
        }
    }

    public void setDegradeCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318e63c5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mDegradeCode = i;
        this.mOriginSelectedUrlName = str;
    }

    public void setDevicePerformanceLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f4f43d", new Object[]{this, str});
        } else {
            this.mDevicePerformanceLevel = str;
        }
    }

    public void setDisableDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9df7ea", new Object[]{this, str});
        } else if (TextUtils.isEmpty(this.mDefinitionBlackList)) {
            this.mDefinitionBlackList = str;
        } else {
            this.mDefinitionBlackList += "," + str;
        }
    }

    public void setEnableCacheLengthNew(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfcdf0", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableCacheLengthNew = z;
        }
    }

    public void setEnableMediaInfoLength(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f5ce1a", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableMediaInfoLength = z;
        }
    }

    public void setEnableRealLength(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e52444", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableGetRealLength = z;
        }
    }

    public void setEnableSelectHdByClickLoad(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc673", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableSelectHdByClickLoad = z;
        }
    }

    public void setForceMuteMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bef0c28", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceMuteMode = z;
        }
    }

    public void setGlobalCurrentBandWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38cceda", new Object[]{this, new Double(d)});
        } else {
            this.mGlobalCurrentBandWidth = d;
        }
    }

    public void setGlobalPredictBandWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402d5e3a", new Object[]{this, new Double(d)});
        } else {
            this.mGlobalPredictBandWidth = d;
        }
    }

    public void setH264AuthenStrategy(H264AuthenStrategy h264AuthenStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fae2d6", new Object[]{this, h264AuthenStrategy});
        } else {
            this.mH264AuthenStrategy = h264AuthenStrategy;
        }
    }

    public void setH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67262582", new Object[]{this, new Boolean(z)});
        } else {
            this.mH265 = z;
        }
    }

    public void setH265AuthenStrategy(H265AuthenStrategy h265AuthenStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c909054", new Object[]{this, h265AuthenStrategy});
        } else {
            this.mH265AuthenStrategy = h265AuthenStrategy;
        }
    }

    public void setHandleVVCError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948cbe76", new Object[]{this});
        } else {
            this.mHandlingVVCError = true;
        }
    }

    public void setHardwareAvc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef3b3a9", new Object[]{this, new Boolean(z)});
        } else {
            this.mHardwareAvc = z;
        }
    }

    public void setHardwareHevc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3393b9", new Object[]{this, new Boolean(z)});
        } else {
            this.mHardwareHevc = z;
        }
    }

    public void setHighCachePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166f1854", new Object[]{this, str});
        } else {
            this.mHighCachePath = str;
        }
    }

    public void setLiveDefinitionAutoSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d128a9", new Object[]{this, new Boolean(z)});
        } else {
            this.mRtcLiveAutoSwitch = z;
        }
    }

    public void setLowDeviceFirstRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7972f", new Object[]{this, new Boolean(z)});
        } else {
            this.mLowDeviceFirstRender = z;
        }
    }

    public void setLowPerformance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7ca8af", new Object[]{this, new Boolean(z)});
        } else {
            this.mLowPerformance = z;
        }
    }

    public void setMaxLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d7ad9a", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxLevel = i;
        }
    }

    public void setMediaInfoParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f34241", new Object[]{this, jSONObject});
        } else {
            this.mMediaInfoParams = jSONObject;
        }
    }

    public void setNetSpeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e69bb0", new Object[]{this, new Integer(i)});
        } else {
            this.mNetSpeed = i;
        }
    }

    public void setNetWorkQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a03f69", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setNetWorkQuality=" + i);
        this.mNetWorkQuality = i;
    }

    public void setPlayableBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5b1701", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayableBytes = i;
        }
    }

    public void setPlayerType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e501bf", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayerType = i;
        }
    }

    public void setRateAdapte(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e7a5c8", new Object[]{this, new Boolean(z)});
        } else {
            this.mRateAdapte = z;
        }
    }

    public void setRateAdaptePriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85bdb1a", new Object[]{this, str});
        } else {
            this.mRateAdaptePriority = str;
        }
    }

    public void setRequestHeader(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39f9d24", new Object[]{this, map});
        } else {
            this.mHttpHeader = map;
        }
    }

    public void setTopAnchor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1eca05", new Object[]{this, new Boolean(z)});
        } else {
            this.mTopAnchor = z;
        }
    }

    public void setTransH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cfd2fe", new Object[]{this, new Boolean(z)});
        } else {
            this.mTransH265 = z;
        }
    }

    public void setUseArtp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5989b", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseArtp = z;
        }
    }

    public void setUseBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7977a955", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseBfrtc = z;
        }
    }

    public void setUseMiniBfrtc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec720e8c", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseMiniBfrtc = z;
        }
    }

    public void setUseRtcLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d482b6c5", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseRtcLive = z;
        }
    }

    public void setUseTBNet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34dc9bc3", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseTBNet = z;
        }
    }

    public void setUseTransCodeRtcLive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bd20f0", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseTransCodeRtcLive = z;
        }
    }

    public void setVdeoDeviceMeaseureEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b171f2d", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoDeviceMeaseureEnable = z;
        }
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
        } else {
            this.mVideoDefinition = str;
        }
    }

    public void setVideoIsHDR(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475ff5a", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoIsHDR = z;
        }
    }

    public void setVideoLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0a93d", new Object[]{this, new Integer(i)});
        } else {
            this.mVideoLength = i;
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

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
        } else {
            this.mVideoUrl = str;
        }
    }

    public void unselectS266OfPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c10ab66", new Object[]{this});
        } else if (this.mHasChooseS266) {
            this.mHasChooseS266 = false;
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_INIT;
            if (this.mIsForPreDownload) {
                if (ja1.b > 0) {
                    ja1.b--;
                }
            } else if (ja1.c > 0) {
                ja1.c--;
            }
        }
    }

    public void updateLogContextPlayToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c1a5e2", new Object[]{this, str});
        } else {
            this.mLogContext.c(str);
        }
    }

    public boolean useArtp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3680b1f", new Object[]{this})).booleanValue();
        }
        return this.mUseArtp;
    }

    public boolean useBfrtc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf4427e1", new Object[]{this})).booleanValue();
        }
        return this.mUseBfrtc;
    }

    public boolean useMiniBfrtc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac350ca", new Object[]{this})).booleanValue();
        }
        return this.mUseMiniBfrtc;
    }

    public boolean useRtcLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("799704f1", new Object[]{this})).booleanValue();
        }
        return this.mUseRtcLive;
    }

    public boolean useTransCodeRtcLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ff112a", new Object[]{this})).booleanValue();
        }
        return this.mUseTransCodeRtcLive;
    }

    public boolean useTransH265() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a3bed95", new Object[]{this})).booleanValue();
        }
        return this.mTransH265;
    }

    private void initS266ParamIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad15c157", new Object[]{this});
            return;
        }
        if (!ja1.d && cq.c()) {
            String w = fq.w();
            if (!TextUtils.isEmpty(w)) {
                if (TaobaoMediaPlayer.loadS266Decoder(w)) {
                    ja1.d = true;
                } else {
                    return;
                }
            }
        }
        if (!this.mHasInitS266Param) {
            this.mHasInitS266Param = true;
            this.mEnableS266 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enS266", "true"));
            this.mEnableS266Devices = OrangeConfig.getInstance().getConfig("DWInteractive", "enS266Devices", "[\"V2227A\",\"2211133C\",\"2210132C\",\"PGEM10\",\"PGT-AN10\",\"22127RK46C\"]");
            this.mEnableS266SBTForVideo = OrangeConfig.getInstance().getConfig("DWInteractive", "enS266SBTForVideo", "[\"guangguang_pick\"]");
            this.mEnableS266SBTForLive = OrangeConfig.getInstance().getConfig("DWInteractive", "enS266SBTForLive", "[\"LiveRoom\"]");
            this.mDisableS266CountLimit = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "disS266CountLimit", "true"));
            this.mEnableS266InstanceErrorCondition = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enS266InstError", "true"));
        }
    }

    public int getMediaLiveInfoTTL() {
        Object opt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d43cb3e", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.mMediaInfoParams;
        if (jSONObject == null || (opt = jSONObject.opt(RemoteMessageConst.TTL)) == null) {
            return 0;
        }
        return ew0.u(opt.toString());
    }

    public void pauseFrameLock(QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c0276a", new Object[]{this, qualityLiveItem});
        } else if (qualityLiveItem != null && isLiveRoom()) {
            boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PAUSE_FRAME_LOCK, "true"));
            this.mEnablePauseFrameLock = s;
            if (s) {
                if (!MediaConstant.DEFINITION_UD_60.equals(qualityLiveItem.newDefinition) && !MediaConstant.DEFINITION_HD_60.equals(qualityLiveItem.newDefinition)) {
                    resumeFrameLock();
                } else if (!this.mSetPauseFrameLock) {
                    feh fehVar = this.mLogContext;
                    AVSDKLog.e(fehVar, "CurrentPlayerQualityItem: " + qualityLiveItem.name + ",pauseFrameLock, definition=" + qualityLiveItem.newDefinition + "， mSetPauseFrameLock=" + this.mSetPauseFrameLock);
                    ADaemon.pauseFrameLock(3);
                    this.mSetPauseFrameLock = true;
                }
            }
        }
    }

    public void resumeFrameLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc5e592", new Object[]{this});
        } else if (this.mSetPauseFrameLock && this.mEnablePauseFrameLock) {
            feh fehVar = this.mLogContext;
            AVSDKLog.e(fehVar, "CurrentPlayerQualityItem: " + this.mPlayerQualityItem.name + ",resumeFrameLock , definition=" + this.mPlayerQualityItem.newDefinition + "， mSetPauseFrameLock=" + this.mSetPauseFrameLock);
            ADaemon.resumeFrameLock(3);
            this.mSetPauseFrameLock = false;
        }
    }

    public void setCurrentPlayerQualityItem(QualityLiveItem qualityLiveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdde5a1", new Object[]{this, qualityLiveItem, new Integer(i)});
            return;
        }
        this.mPlayerQualityItem = PlayerQualityItem.create(qualityLiveItem.name, qualityLiveItem.newName, qualityLiveItem.definition, qualityLiveItem.newDefinition, i);
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setCurrentPlayerQualityItem name=" + qualityLiveItem.name + ",  newName=" + qualityLiveItem.newName + " ,definition=" + qualityLiveItem.definition + " ,newDefinition=" + qualityLiveItem.newDefinition);
        this.mPlayerQualityItem.current = true;
        this.mSelectDefinition = qualityLiveItem.newDefinition;
        pauseFrameLock(qualityLiveItem);
    }

    private boolean canSelectS266Url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611defcf", new Object[]{this})).booleanValue();
        }
        if (ja1.W0 && ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "needSkipOnceSelectForVVC", "true"))) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_BY_SKIP_ONCE_FOR_VVC;
            ja1.W0 = false;
            return false;
        } else if (this.mHandlingVVCError) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_HANDLING_ERROR;
            return false;
        } else if (this.mHasVVCErrorEver && this.mEnableS266InstanceErrorCondition) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_INSTANCE_ERROR;
            return false;
        } else if (!ja1.d) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_SO_NOT_READY;
            return false;
        } else if (ja1.c > 0 && !this.mDisableS266CountLimit) {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_PLAYING;
            return false;
        } else if (!this.mIsForPreDownload || ja1.b <= 0) {
            String str = Build.MODEL;
            if (!ew0.n(str, this.mEnableS266Devices)) {
                this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_WHITE_DEVICE;
                return false;
            } else if (!fq.z()) {
                this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_AVCODEC_SO_NOT_READY;
                return false;
            } else {
                if (!TextUtils.isEmpty(getFrom())) {
                    String config = OrangeConfig.getInstance().getConfig("DWInteractive", getFrom() + "enS266Devices", "");
                    if (!TextUtils.isEmpty(config) && !ew0.n(str, config)) {
                        this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_NOT_WHITE_DEVICE;
                        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "can't select vvc, sbt is " + getFrom() + ",devicelist is " + config);
                        return false;
                    }
                }
                return true;
            }
        } else {
            this.mChooseVVCReason = VVC_CHOOSE_REASON.VVC_CHOOSE_REASON_PRELOADING;
            return false;
        }
    }

    private static boolean checkDefaultValueAndList(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cec1a0", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        gf4 gf4Var = MediaAdapteManager.mConfigAdapter;
        return (gf4Var != null && ew0.s(gf4Var.getConfig("DWInteractive", str, "true"))) ? !ew0.n(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", str2, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) : z;
    }

    public List<PlayerQualityItem> getDefinitionList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1c16f81", new Object[]{this, new Boolean(z)});
        }
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.mMediaLiveInfo.liveUrlList.size(); i++) {
            QualityLiveItem qualityLiveItem = this.mMediaLiveInfo.liveUrlList.get(i);
            if (!TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                String str = qualityLiveItem.newDefinition;
                if (!TextUtils.isEmpty(str)) {
                    if (str != null && MediaConstant.DEFINITION_UD_60.equals(str)) {
                        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_60FPS_DEVICE_LEVEL, "[0]");
                        boolean z2 = !TextUtils.isEmpty(config) && config.contains(String.valueOf(ja1.z()));
                        String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_60FPS_DEVICE_LIST, "");
                        tug tugVar = new tug();
                        tugVar.d("model", "" + Build.MODEL);
                        tugVar.g(config2);
                        if (!TextUtils.isEmpty(config2) && tugVar.e()) {
                            z2 = true;
                        }
                        if (!z2) {
                        }
                    }
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, Integer.valueOf(i));
                    } else {
                        PlayerQualityItem playerQualityItem = this.mPlayerQualityItem;
                        if (playerQualityItem != null && playerQualityItem.index == i) {
                            hashMap.put(str, Integer.valueOf(i));
                        }
                    }
                } else if (!z) {
                    PlayerQualityItem create = PlayerQualityItem.create(qualityLiveItem.name, qualityLiveItem.newName, qualityLiveItem.definition, qualityLiveItem.newDefinition, i);
                    create.current = create.equals(this.mPlayerQualityItem);
                    linkedList.add(create);
                }
            }
        }
        String[] strArr = PRIORITY_OF_NEW_DEFINITION;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (hashMap.containsKey(strArr[i2])) {
                int intValue = ((Integer) hashMap.get(strArr[i2])).intValue();
                QualityLiveItem qualityLiveItem2 = this.mMediaLiveInfo.liveUrlList.get(intValue);
                PlayerQualityItem create2 = PlayerQualityItem.create(qualityLiveItem2.name, qualityLiveItem2.newName, qualityLiveItem2.definition, qualityLiveItem2.newDefinition, intValue);
                create2.current = this.mPlayerQualityItem.index == intValue;
                linkedList.add(create2);
            }
        }
        return linkedList;
    }

    public String getRtcSwitchLiveInfo(MediaLiveInfo mediaLiveInfo) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ce166df", new Object[]{this, mediaLiveInfo});
        }
        if (mediaLiveInfo == null || mediaLiveInfo.liveUrlList.size() == 0 || this.mPlayerQualityItem == null) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < mediaLiveInfo.liveUrlList.size(); i++) {
            QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i);
            if (!TextUtils.isEmpty(qualityLiveItem.newDefinition) && !TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (qualityLiveItem.getStreamAvgBitrate() == 0) {
                        str = "-1";
                    } else {
                        str = "" + qualityLiveItem.getStreamAvgBitrate();
                    }
                    jSONObject.put("streamBitate", str);
                    jSONObject.put("streamDefinition", qualityLiveItem.newDefinition);
                    if (qualityLiveItem.newDefinition.equals(this.mPlayerQualityItem.newDefinition)) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    jSONObject.put("currentStream", str2);
                    jSONObject.put("streamTopic", nfi.c(qualityLiveItem.rtcLiveUrl));
                    ja1.u();
                    if (ja1.X && (str3 = qualityLiveItem.newDefinition) != null && str3.contains("_60")) {
                        jSONObject.put("streamFps", "60");
                        AVSDKLog.e(this.mLogContext, "60fpsSupports: send streamFps=60 to rtc.");
                    }
                } catch (Exception e) {
                    AVSDKLog.e(this.mLogContext, "getRtcSwitchLiveInfo " + e.toString());
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    public void initLowSpeedPolicyABIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533a1a4f", new Object[]{this});
            return;
        }
        ja1.V(this.mContext);
        this.mEnableLowSpeedPolicy = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_LOW_SPEED_POLICY, "true"));
        this.mEnableLowSpeedPolicyAB = ja1.mEnableLowSpeedPolicyAB.get();
        this.mLowSpeedPolicyABId = ja1.mLowSpeedPolicyABId.get();
        this.mLowSpeedPolicyABConfigValue = ja1.mLowSpeedPolicyABConfigValue.get();
        this.mLowSpeedPolicyOperator = ja1.mLowSpeedPolicyOperator.get();
        this.mEnableSRSByRTCWeakNetFlag = ja1.mEnableSRSByRTCWeakNetFlag.get();
        this.mPlayerCoreWeakNetFlagLifeTime = ja1.mWeakNetFlagLifeTime.get();
        this.mEnableLiveRtcWeakNetSVCDrop = ja1.mEnableLiveRtcWeakNetSVCDrop.get();
        this.mLowSpeedNewPolicyConfigValue = ja1.mLowSpeedNewPolicyConfigValue.get();
        this.mDefinitionDeciseWindow = ja1.mDefinitionDeciseWindow.get();
        this.mEnableCdnStartPlaySpeed = ja1.mEnableCdnStartPlaySpeed.get();
        this.mLowSpeedArtpCommonParamsJson = ja1.mLowSpeedArtpCommonParamsJson.get();
        this.mEnableLiveRtcHomePageCardSVCDrop = ja1.mEnableLiveRtcHomePageCardSVCDrop.get();
        addExperienceInfo(ja1.D("lowspeed"), ja1.E("lowspeed"), ja1.C("lowspeed"));
        this.mLiveRateAdapteUrlNewPolicyMap = new HashMap<>();
        if (!TextUtils.isEmpty(this.mLowSpeedNewPolicyConfigValue)) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(this.mLowSpeedNewPolicyConfigValue);
                if (parseObject != null) {
                    String[] strArr = PRIORITY_OF_NEW_DEFINITION;
                    for (int i = 0; i < strArr.length; i++) {
                        com.alibaba.fastjson.JSONObject jSONObject = parseObject.getJSONObject(strArr[i]);
                        if (jSONObject != null) {
                            a aVar = new a(this);
                            jSONObject.getInteger("max_rtt");
                            jSONObject.getFloat("max_v_loss_rate");
                            jSONObject.getInteger("max_stall_time_msps");
                            jSONObject.getInteger("version");
                            com.alibaba.fastjson.JSONArray jSONArray = jSONObject.getJSONArray("network_type_black_list");
                            if (jSONArray != null && jSONArray.size() > 0) {
                                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                    ((LinkedList) aVar.f11019a).add(jSONArray.getString(i2));
                                }
                            }
                            this.mLiveRateAdapteUrlNewPolicyMap.put(strArr[i], aVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
            return;
        }
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "setFrom=" + str + " by client.");
        this.mFrom = str;
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_LIVE_ROOM_BIZ_CODE, "LiveRoom");
        if (TextUtils.isEmpty(config) || !config.equals(this.mFrom)) {
            this.mIsLiveRoom = false;
        } else {
            this.mIsLiveRoom = true;
        }
    }

    static {
        t2o.a(774897723);
    }

    public boolean isLowNetSpeedByVpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e17d73", new Object[]{this})).booleanValue();
        }
        if (this.mHasLowSpeedPolicy) {
            return this.mLowSpeedPolicy;
        }
        initLowSpeedPolicyABIfNeeded();
        if (!this.mEnableLowSpeedPolicy || !this.mEnableLowSpeedPolicyAB || TextUtils.isEmpty(this.mLowSpeedPolicyABConfigValue)) {
            return false;
        }
        this.mHasLowSpeedPolicy = true;
        boolean isLowNetSpeedByVpm = isLowNetSpeedByVpm(this.mLowSpeedPolicyABConfigValue);
        this.mLowSpeedPolicy = isLowNetSpeedByVpm;
        return isLowNetSpeedByVpm;
    }
}
