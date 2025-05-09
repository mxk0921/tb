package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface AConstants {
    public static final int ArtcErrorAccsBindServiceError = -7;
    public static final int ArtcErrorAccsBindServiceTimeout = -8;
    public static final int ArtcErrorAccsSendDataError = -9;
    public static final int ArtcErrorAccsStartError = -6;
    public static final int ArtcErrorAudioDeviceError = -360;
    public static final int ArtcErrorAudioDeviceStartPlayoutError = -362;
    public static final int ArtcErrorAudioDeviceStartRecordError = -363;
    public static final int ArtcErrorCameraFreeze = -101;
    public static final int ArtcErrorCameraSwitchError = -102;
    public static final int ArtcErrorCameraUnavailable = -100;
    public static final int ArtcErrorChannelIdError = -12;
    public static final int ArtcErrorChannelStatusError = -11;
    public static final int ArtcErrorConnectionInterrupt = -110;
    public static final int ArtcErrorConnectionLost = -111;
    public static final int ArtcErrorCreatePcError = -153;
    public static final int ArtcErrorGetConfigError = -156;
    public static final int ArtcErrorIceCandidateGatheringTimeOut = -150;
    public static final int ArtcErrorIceRecvCandidateTimeout = -151;
    public static final int ArtcErrorInitError = -300;
    public static final int ArtcErrorInitGetConfigTimeOut = -301;
    public static final int ArtcErrorInvalidParam = -2;
    public static final int ArtcErrorJoinChannelError = -320;
    public static final int ArtcErrorJoinChannelErrorTimeOut = -321;
    public static final int ArtcErrorJoinChannelMediaConnectionCheckFailed = -322;
    public static final int ArtcErrorLeaveChannelTiemout = -152;
    public static final int ArtcErrorMediaConnectionLost = -340;
    public static final int ArtcErrorMediaConnectionRtmpError = -341;
    public static final int ArtcErrorNeedRetry = -13;
    public static final int ArtcErrorNone = 0;
    public static final int ArtcErrorNotSupport = -4;
    public static final int ArtcErrorOutOfMemory = -3;
    public static final int ArtcErrorParseJsonError = -5;
    public static final int ArtcErrorPermisisionError = -103;
    public static final int ArtcErrorRecvJoinChannelError = -154;
    public static final int ArtcErrorServerErrorBlackList = 504;
    public static final int ArtcErrorServerErrorDropByCenter = 405;
    public static final int ArtcErrorServerErrorDropByMobility = 221;
    public static final int ArtcErrorSignalConnectionError = -104;
    public static final int ArtcErrorSignalVersionInvalid = -155;
    public static final int ArtcErrorUnInitialized = -10;
    public static final int ArtcErrorUnknown = -1;
    public static final int ArtcErrorVideoDeviceError = -361;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcAudioRouteDevice {
        ARTC_AUDIO_ROUTE_NONE,
        ARTC_AUDIO_ROUTE_SPEAKER,
        ARTC_AUDIO_ROUTE_EARPIECE,
        ARTC_AUDIO_ROUTE_WIRED_HEADSET,
        ARTC_AUDIO_ROUTE_BLUETOOTH_HEADSET;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcAudioRouteDevice artcAudioRouteDevice, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcAudioRouteDevice");
        }

        public static ArtcAudioRouteDevice valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcAudioRouteDevice) ipChange.ipc$dispatch("37254d5c", new Object[]{str});
            }
            return (ArtcAudioRouteDevice) Enum.valueOf(ArtcAudioRouteDevice.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcChannelProfile {
        ARTC_CHANNEL_PROFILE_BROADCAST,
        ARTC_CHANNEL_PROFILE_COMMUNICATION,
        ARTC_CHANNEL_PROFILE_CONFERENCE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcChannelProfile artcChannelProfile, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcChannelProfile");
        }

        public static ArtcChannelProfile valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcChannelProfile) ipChange.ipc$dispatch("dce9b49f", new Object[]{str});
            }
            return (ArtcChannelProfile) Enum.valueOf(ArtcChannelProfile.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcErrorEvent {
        ARTC_EVENT_SIGNALING_CONNECTION,
        ARTC_EVENT_SIGNALING_CREATINGCHANNEL,
        ARTC_EVENT_SIGNALING_CREATEDCHANNEL,
        ARTC_EVENT_SIGNALING_JOININGCHANNEL,
        ARTC_EVENT_SIGNALING_JOINEDCHANNEL,
        ARTC_EVENT_SIGNALING_SENDSDPCANDIDATE,
        ARTC_EVENT_SIGNALING_RECVSDPCANDIDATE,
        ARTC_EVENT_SIGNALING_ICE,
        ARTC_EVENT_SIGNALING_LEAVINGCHANNEL,
        ARTC_EVENT_SIGNALING_LEAVEDCHANNEL,
        ARTC_EVENT_LCAK_PERMISSION,
        ARTC_EVENT_OPEN_CAMERA,
        ARTC_EVENT_INIT_MEDIA_RESOURCE,
        ARTC_EVENT_AVAILABLE_VIDEO_CODEC,
        ARTC_EVENT_CAMERA_SWITCH,
        ARTC_EVENT_CAMERA_UNAVAILABLE,
        ARTC_EVENT_SERVER_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcErrorEvent artcErrorEvent, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcErrorEvent");
        }

        public static ArtcErrorEvent valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcErrorEvent) ipChange.ipc$dispatch("a81fc8d3", new Object[]{str});
            }
            return (ArtcErrorEvent) Enum.valueOf(ArtcErrorEvent.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcErrorEventNew {
        ARTC_ERROR_EVENT_INIT_ERROR,
        ARTC_ERROR_EVENT_JOINCHANNEL,
        ARTC_ERROR_EVENT_JONCHANNEL_ERROR_FROM_SERVER,
        ARTC_ERROR_EVENT_MEDIA_CONNECTION_ERROR,
        ARTC_ERROR_EVENT_MEDIA_DEVICE_ERROR,
        ARTC_ERROR_EVENT_CREATE_V4_ERROR,
        ARTC_ERROR_EVENT_LINKLIVE_ERROR,
        ARTC_ERROR_EVENT_MAX;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcErrorEventNew artcErrorEventNew, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcErrorEventNew");
        }

        public static ArtcErrorEventNew valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcErrorEventNew) ipChange.ipc$dispatch("cad54f23", new Object[]{str});
            }
            return (ArtcErrorEventNew) Enum.valueOf(ArtcErrorEventNew.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcInfoEvent {
        ARTC_INFO_EVENT_NEED_STOP;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcInfoEvent artcInfoEvent, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcInfoEvent");
        }

        public static ArtcInfoEvent valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcInfoEvent) ipChange.ipc$dispatch("8e5f8625", new Object[]{str});
            }
            return (ArtcInfoEvent) Enum.valueOf(ArtcInfoEvent.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcLogLevel {
        ARTC_LOG_UNKNOWN,
        ARTC_LOG_DEFAULT,
        ARTC_LOG_VERBOSE,
        ARTC_LOG_DEBUG,
        ARTC_LOG_INFO,
        ARTC_LOG_WARN,
        ARTC_LOG_ERROR,
        ARTC_LOG_FATAL,
        ARTC_LOG_SILENT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcLogLevel artcLogLevel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcLogLevel");
        }

        public static ArtcLogLevel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcLogLevel) ipChange.ipc$dispatch("d1a11be5", new Object[]{str});
            }
            return (ArtcLogLevel) Enum.valueOf(ArtcLogLevel.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcMediaRecordType {
        ARTC_MEDIA_RECORD_NONE,
        ARTC_MEDIA_RECORD_AUDIO_LOCAL,
        ARTC_MEDIA_RECORD_AUDIO_REMOTE,
        ARTC_MEDIA_RECORD_AUDIO_ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcMediaRecordType artcMediaRecordType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcMediaRecordType");
        }

        public static ArtcMediaRecordType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcMediaRecordType) ipChange.ipc$dispatch("c40ea662", new Object[]{str});
            }
            return (ArtcMediaRecordType) Enum.valueOf(ArtcMediaRecordType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcMediaType {
        AMT_NONE,
        AMT_AUDIO,
        AMT_VIDEO,
        AMT_BOTH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcMediaType artcMediaType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcMediaType");
        }

        public static ArtcMediaType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcMediaType) ipChange.ipc$dispatch("49e755b3", new Object[]{str});
            }
            return (ArtcMediaType) Enum.valueOf(ArtcMediaType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcTransportProfile {
        ATP_NO_SEND_RECV,
        ATP_SEND_ONLY,
        ATP_RECV_ONLY,
        ATP_SEND_RECV;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcTransportProfile artcTransportProfile, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcTransportProfile");
        }

        public static ArtcTransportProfile valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcTransportProfile) ipChange.ipc$dispatch("bae41e45", new Object[]{str});
            }
            return (ArtcTransportProfile) Enum.valueOf(ArtcTransportProfile.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcUtType {
        ARTC_UT_UNKNOWN,
        ARTC_UT_TB,
        ARTC_UT_ALIYUN,
        ARTC_UT_NONE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcUtType artcUtType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcUtType");
        }

        public static ArtcUtType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcUtType) ipChange.ipc$dispatch("de48e9ac", new Object[]{str});
            }
            return (ArtcUtType) Enum.valueOf(ArtcUtType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcVideoProfile {
        RTC_VIDEO_PROFILE_288P_20FPS_deprecated,
        ARTC_VIDEO_PROFILE_288P_25FPS_deprecated,
        ARTC_VIDEO_PROFILE_180P_10FPS,
        ARTC_VIDEO_PROFILE_240P_20FPS,
        ARTC_VIDEO_PROFILE_244P_20FPS,
        ARTC_VIDEO_PROFILE_270P_12FPS,
        ARTC_VIDEO_PROFILE_360P_15FPS,
        ARTC_VIDEO_PROFILE_360P_20FPS,
        ARTC_VIDEO_PROFILE_360P2_20FPS,
        ARTC_VIDEO_PROFILE_360P_25FPS,
        ARTC_VIDEO_PROFILE_368P_15FPS,
        ARTC_VIDEO_PROFILE_368P_20FPS,
        ARTC_VIDEO_PROFILE_480P_15FPS,
        ARTC_VIDEO_PROFILE_720P_20FPS,
        ARTC_VIDEO_PROFILE_720P_25FPS,
        ARTC_VIDEO_PROFILE_1080P_20FPS,
        ARTC_VIDEO_PROFILE_1080P_30FPS,
        ARTC_VIDEO_PROFILE_240P2_20FPS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcVideoProfile artcVideoProfile, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcVideoProfile");
        }

        public static ArtcVideoProfile valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcVideoProfile) ipChange.ipc$dispatch("f8477e97", new Object[]{str});
            }
            return (ArtcVideoProfile) Enum.valueOf(ArtcVideoProfile.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcVideoResolutionType {
        ARTC_VIDEO_RESOLUTION_180P,
        ARTC_VIDEO_RESOLUTION_240P,
        ARTC_VIDEO_RESOLUTION_224P,
        ARTC_VIDEO_RESOLUTION_270P,
        ARTC_VIDEO_RESOLUTION_288P,
        ARTC_VIDEO_RESOLUTION_360P,
        ARTC_VIDEO_RESOLUTION_368P,
        ARTC_VIDEO_RESOLUTION_720P,
        ARTC_VIDEO_RESOLUTION_1080P;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcVideoResolutionType artcVideoResolutionType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ArtcVideoResolutionType");
        }

        public static ArtcVideoResolutionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcVideoResolutionType) ipChange.ipc$dispatch("2e9b8c70", new Object[]{str});
            }
            return (ArtcVideoResolutionType) Enum.valueOf(ArtcVideoResolutionType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ColorSpace {
        C_TEXTURE,
        C_I420,
        C_NV12,
        C_NV21,
        C_RGBA;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ColorSpace colorSpace, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$ColorSpace");
        }

        public static ColorSpace valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorSpace) ipChange.ipc$dispatch("2ee4e082", new Object[]{str});
            }
            return (ColorSpace) Enum.valueOf(ColorSpace.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface Permission {
        public static final String[] MANDATORY = {"android.permission.RECORD_AUDIO", t4p.CAMERA};
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Role {
        ANCHOR,
        CHAT,
        CONFERENCE,
        MONITOR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Role role, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/AConstants$Role");
        }

        public static Role valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Role) ipChange.ipc$dispatch("4291394f", new Object[]{str});
            }
            return (Role) Enum.valueOf(Role.class, str);
        }
    }
}
