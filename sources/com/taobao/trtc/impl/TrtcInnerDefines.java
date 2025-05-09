package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface TrtcInnerDefines {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum CallState {
        E_CALL_IDLE,
        E_CALL_ING,
        E_CALL_SETUP,
        E_CALL_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CallState callState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcInnerDefines$CallState");
        }

        public static CallState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallState) ipChange.ipc$dispatch("29650cec", new Object[]{str});
            }
            return (CallState) Enum.valueOf(CallState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ChannelNotifyAction {
        E_INVITE,
        E_CANCEL_INVITE,
        E_AGREE,
        E_DISAGREE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ChannelNotifyAction channelNotifyAction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcInnerDefines$ChannelNotifyAction");
        }

        public static ChannelNotifyAction valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChannelNotifyAction) ipChange.ipc$dispatch("fd555f1d", new Object[]{str});
            }
            return (ChannelNotifyAction) Enum.valueOf(ChannelNotifyAction.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum EventType {
        ON_TRTC_LIVE_SUCCESS,
        ON_TRTC_MEDIA_CONNECTION_STATE,
        ON_TRTC_CALL_NOTIFY,
        ON_TRTC_CALL_RSP,
        ON_TRTC_ANSWER_NOTIFY,
        ON_TRTC_ANSWER_RSP,
        ON_TRTC_CANCEL_CALL_NOTIFY,
        ON_TRTC_HANGUP_NOTIFY,
        ON_TRTC_JOIN_CHANNEL_RSP,
        ON_TRTC_PEER_JOINED_CHANNEL,
        ON_TRTC_PEER_LEFT_CHANNEL,
        ON_TRTC_NOTIFY_CHANNEL_RSP,
        ON_TRTC_NOTIFY_CHANNEL,
        ON_TRTC_CALL_TIMEOUT,
        ON_TRTC_LINK_CONFIG_UPDATE,
        ON_TRTC_FIRST_MEDIA_FRAME,
        ON_TRTC_STATISTICS_UT,
        ON_TRTC_STATS,
        ON_TRTC_ERROR,
        ON_TRTC_STREAM_PROCESS_RESULT,
        ON_TRTC_CUSTOM_MESSAGE,
        ON_TRTC_STREAM_UPDATED,
        ON_TRTC_WRITE_LOCAL_CONFIG,
        ON_TRTC_UPDATE_HTTPDNS_AMDC,
        ON_TRTC_CANCEL_GET_HTTPDNS,
        ON_TRTC_CHANNEL_CLOSED,
        ON_TRTC_SPEECH_DETECT,
        ON_TRTC_BANDWIDTH_NOT_ENOUGH,
        ON_TRTC_MUTE_REMOTE_AUDIO_STREAMS,
        ON_TRTC_LOCAL_STREAM_STATUS_UPDATE,
        ON_TRTC_DEGRADE_TO_TCP,
        ON_TRTC_LIVE_CHANNEL_ID_SUCCESS,
        ON_TRTC_VIDEO_RESOLUTION_UPDATE,
        ON_TRTC_CHANNEL_MSG_BROADCAST_RSP,
        ON_TRTC_CHANNEL_MSG_BROADCAST_NOTIFY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(EventType eventType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcInnerDefines$EventType");
        }

        public static EventType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EventType) ipChange.ipc$dispatch("4d11ceb", new Object[]{str});
            }
            return (EventType) Enum.valueOf(EventType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum LiveState {
        E_LIVE_STATE_NON,
        E_LIVE_STATE_STARTING,
        E_LIVE_STATE_STARTED,
        E_LIVE_STATE_STOPPING,
        E_LIVE_STATE_STOPPED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LiveState liveState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcInnerDefines$LiveState");
        }

        public static LiveState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveState) ipChange.ipc$dispatch("fe9da0fa", new Object[]{str});
            }
            return (LiveState) Enum.valueOf(LiveState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LocalMediaConfig {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean audioEnable = true;
        public boolean videoEnable = true;
        public boolean dataEnable = false;
        public int videoMaxWidth = 720;
        public int videoMaxHeight = 1280;
        public int videoMaxFps = 20;
        public boolean audioMusicEnable = false;
        public int audioDenoiseDegree = 0;
        public int audioBitrate = 0;

        static {
            t2o.a(395313547);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "localMediaConfig: { a=" + this.audioEnable + ", v=" + this.videoEnable + ", d=" + this.dataEnable + " }";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class RemoteMediaConfig {
        public String audioMsid;
        public String dataMsid;
        public String url;
        public boolean videoFec;
        public String videoMsid;

        static {
            t2o.a(395313548);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class StartLiveParams {
        public String bizId;
        public Map<String, String> customInfo;
        public String extInfo;
        public String liveUrl;
        public LocalMediaConfig mediaConfig;

        static {
            t2o.a(395313549);
        }

        public StartLiveParams(TrtcDefines.h hVar) {
            LocalMediaConfig W0 = TrtcEngineImpl.W0(hVar.e);
            this.mediaConfig = W0;
            W0.audioEnable = true;
            W0.videoEnable = true;
            W0.dataEnable = false;
            String str = hVar.f13882a;
            String str2 = "";
            this.liveUrl = str == null ? str2 : str;
            String str3 = hVar.b;
            this.bizId = str3 == null ? str2 : str3;
            String str4 = hVar.c;
            this.extInfo = str4 != null ? str4 : str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcAnswerCallParams {
        public int answerType;
        public int audioTransProfile;
        public String extension;
        public ITrtcInputStream inputStream;
        public LocalMediaConfig mediaConfig;
        public String remoteUserId;
        public int videoTransProfile;
        public boolean isMultiChatMode = false;
        public String subType = "";

        static {
            t2o.a(395313550);
        }

        public TrtcAnswerCallParams() {
            TrtcDefines.TrtcMediaTransportProfile trtcMediaTransportProfile = TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_SEND_RECV;
            this.audioTransProfile = trtcMediaTransportProfile.ordinal();
            this.videoTransProfile = trtcMediaTransportProfile.ordinal();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcCallUserInfo {
        public Map<String, String> customInfo;
        public String deviceId;
        public String extension;
        public int role;
        public String userId;

        static {
            t2o.a(395313551);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcCancelCallParams {
        public ArrayList<TrtcCallUserInfo> userInfos;

        static {
            t2o.a(395313552);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcHangUpCallParams {
        public ArrayList<TrtcCallUserInfo> userInfos;
        public boolean isMultiChatMode = false;
        public String subType = "";
        public String extension = "";

        static {
            t2o.a(395313553);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcJoinChannelParams {
        public int channelDestroyType;
        public String channelId;
        public int channelRoleType;
        public boolean enableLive = false;
        public String extInfo;
        public boolean isMutliChatMode;
        public LocalMediaConfig mediaConfig;
        public String subType;

        static {
            t2o.a(395313554);
        }

        public TrtcJoinChannelParams(TrtcDefines.g gVar) {
            this.isMutliChatMode = false;
            this.subType = "";
            LocalMediaConfig W0 = TrtcEngineImpl.W0(gVar.c);
            this.mediaConfig = W0;
            W0.audioEnable = gVar.d;
            W0.videoEnable = gVar.e;
            W0.dataEnable = gVar.f;
            this.channelId = gVar.f13881a;
            this.extInfo = gVar.b;
            this.isMutliChatMode = gVar.h;
            this.subType = gVar.g;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcLocalVideoFreezeInfo {
        public boolean freeze;
        public int sendVideoType;

        static {
            t2o.a(395313555);
        }

        public TrtcLocalVideoFreezeInfo(boolean z, int i) {
            this.freeze = z;
            this.sendVideoType = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcMakeCallParams {
        public int audioTransProfile;
        public ITrtcInputStream inputStream;
        public LocalMediaConfig mediaConfig;
        public ArrayList<TrtcCallUserInfo> userInfos;
        public int videoTransProfile;
        public int callTimeout = 60;
        public boolean isMultiChatMode = false;
        public String subType = "";
        public String extension = "";
        public int maxChatUserNumber = 0;

        static {
            t2o.a(395313556);
        }

        public TrtcMakeCallParams() {
            TrtcDefines.TrtcMediaTransportProfile trtcMediaTransportProfile = TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_SEND_RECV;
            this.audioTransProfile = trtcMediaTransportProfile.ordinal();
            this.videoTransProfile = trtcMediaTransportProfile.ordinal();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcRemoteVideoFreezeInfo {
        public boolean freeze;
        public String remoteUserId;

        static {
            t2o.a(395313557);
        }

        public TrtcRemoteVideoFreezeInfo(String str, boolean z) {
            this.remoteUserId = str;
            this.freeze = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcRemoteVideoFreezeParams {
        public ArrayList<TrtcRemoteVideoFreezeInfo> userInfos;

        static {
            t2o.a(395313558);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcStreamProcessParams {
        public String extension;
        public LocalMediaConfig mediaConfig;
        public String processInfo;
        public RemoteMediaConfig remoteMediaConfig;
        public String streamId;
        public String subSfuIp;
        public int subSfuPort;

        static {
            t2o.a(395313559);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcUpdateStreamParams {
        public String extInfo = "";
        public LocalMediaConfig mediaConfig;
        public String streamId;

        static {
            t2o.a(395313560);
        }

        public TrtcUpdateStreamParams(String str, ITrtcInputStream iTrtcInputStream) {
            this.mediaConfig = TrtcEngineImpl.W0(iTrtcInputStream);
            this.streamId = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcVideoLayoutBackground {
        public int bB;
        public int bG;
        public int bHeight;
        public int bImageType;
        public int bR;
        public int bWidth;
        public int bType = 0;
        public String bImageUrl = "";

        static {
            t2o.a(395313561);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcVideoLayoutParams {
        public TrtcVideoLayoutBackground backgroundInfo;
        public String extension = "";
        public ArrayList<TrtcVideoLayoutRect> rects;
        public int subHeight;
        public int subWidth;

        static {
            t2o.a(395313562);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcVideoLayoutRect {
        public int height;
        public String userId;
        public int width;
        public int xPos;
        public int yPos;
        public int zPos;

        static {
            t2o.a(395313563);
        }
    }
}
