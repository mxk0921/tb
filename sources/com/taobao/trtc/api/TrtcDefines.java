package com.taobao.trtc.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface TrtcDefines {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcAnswerType {
        E_ANSWER_TYPE_NONE,
        E_ANSWER_TYPE_AGREE,
        E_ANSWER_TYPE_REJECT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcAnswerType trtcAnswerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcAnswerType");
        }

        public static TrtcAnswerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcAnswerType) ipChange.ipc$dispatch("60cc768a", new Object[]{str});
            }
            return (TrtcAnswerType) Enum.valueOf(TrtcAnswerType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcAudioFocusState {
        E_AUDIO_FOCUS_LOSS,
        E_AUDIO_FOCUS_GAINED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcAudioFocusState trtcAudioFocusState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcAudioFocusState");
        }

        public static TrtcAudioFocusState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcAudioFocusState) ipChange.ipc$dispatch("8ae1d805", new Object[]{str});
            }
            return (TrtcAudioFocusState) Enum.valueOf(TrtcAudioFocusState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcAudioRouteDevice {
        E_AUDIO_ROUTE_NONE,
        E_AUDIO_ROUTE_EARPIECE,
        E_AUDIO_ROUTE_SPEAKER,
        E_AUDIO_ROUTE_WIRED_HEADSET,
        E_AUDIO_ROUTE_BLUETOOTH_HEADSET;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcAudioRouteDevice trtcAudioRouteDevice, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcAudioRouteDevice");
        }

        public static TrtcAudioRouteDevice valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcAudioRouteDevice) ipChange.ipc$dispatch("e64ebb39", new Object[]{str});
            }
            return (TrtcAudioRouteDevice) Enum.valueOf(TrtcAudioRouteDevice.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcBackgroundImageType {
        E_BACKGROUND_FROM_LOCAL,
        E_BACKGROUND_FROM_SERVER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcBackgroundImageType trtcBackgroundImageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcBackgroundImageType");
        }

        public static TrtcBackgroundImageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcBackgroundImageType) ipChange.ipc$dispatch("bdd6abed", new Object[]{str});
            }
            return (TrtcBackgroundImageType) Enum.valueOf(TrtcBackgroundImageType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcChannelAction {
        E_CHANNEL_NOTIFY_INVITE,
        E_CHANNEL_NOTIFY_CANCELED,
        E_CHANNEL_NOTIFY_AGREE,
        E_CHANNEL_NOTIFY_DIS_AGREE,
        E_CHANNEL_NOTIFY_UNKNOWN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcChannelAction trtcChannelAction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcChannelAction");
        }

        public static TrtcChannelAction valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcChannelAction) ipChange.ipc$dispatch("1c4d957b", new Object[]{str});
            }
            return (TrtcChannelAction) Enum.valueOf(TrtcChannelAction.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcErrorEvent {
        E_ERROR_EVENT_INITIALIZE,
        E_ERROR_EVENT_LIVE,
        E_ERROR_EVENT_MEDIA_CONNECTION,
        E_ERROR_EVENT_NEED_RETRY,
        E_ERROR_EVENT_NEED_STOP,
        E_ERROR_EVENT_MEDIA_DEVICE,
        E_ERROR_EVENT_DNS_FAILD,
        E_ERROR_EVENT_LINK_LIVE,
        E_ERROR_EVENT_LINKLIVE_MEDIA_CONNECTION;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcErrorEvent trtcErrorEvent, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcErrorEvent");
        }

        public static TrtcErrorEvent valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcErrorEvent) ipChange.ipc$dispatch("16f42070", new Object[]{str});
            }
            return (TrtcErrorEvent) Enum.valueOf(TrtcErrorEvent.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcFrameType {
        E_FRAME_PRI,
        E_FRAME_SUB,
        E_FRAME_STREAM;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcFrameType trtcFrameType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcFrameType");
        }

        public static TrtcFrameType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcFrameType) ipChange.ipc$dispatch("bcb6a8d", new Object[]{str});
            }
            return (TrtcFrameType) Enum.valueOf(TrtcFrameType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcMediaConnectionState {
        E_MEDIA_CONNECTION_NOT_USE,
        E_MEDIA_CONNECTION_CONNECTED,
        E_MEDIA_CONNECTION_TIMEOUT,
        E_MEDIA_CONNECTION_DISCONNECTED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcMediaConnectionState trtcMediaConnectionState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcMediaConnectionState");
        }

        public static TrtcMediaConnectionState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcMediaConnectionState) ipChange.ipc$dispatch("7ffcd8f3", new Object[]{str});
            }
            return (TrtcMediaConnectionState) Enum.valueOf(TrtcMediaConnectionState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcMediaTransportProfile {
        E_MEDIA_INACTIVE,
        E_MEDIA_SEND_ONLY,
        E_MEDIA_RECV_ONLY,
        E_MEDIA_SEND_RECV;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcMediaTransportProfile trtcMediaTransportProfile, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcMediaTransportProfile");
        }

        public static TrtcMediaTransportProfile valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcMediaTransportProfile) ipChange.ipc$dispatch("2551e4b0", new Object[]{str});
            }
            return (TrtcMediaTransportProfile) Enum.valueOf(TrtcMediaTransportProfile.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcMixMode {
        MIX_NONE,
        MIX_LOCAL,
        MiX_SERVER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcMixMode trtcMixMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcMixMode");
        }

        public static TrtcMixMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcMixMode) ipChange.ipc$dispatch("1efb67f5", new Object[]{str});
            }
            return (TrtcMixMode) Enum.valueOf(TrtcMixMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcNetWorkQuality {
        E_NETWORK_QUALITY_GOOD,
        E_NETWORK_QUALITY_NORMAL,
        E_NETWORK_QUALITY_BAD;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcNetWorkQuality trtcNetWorkQuality, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcNetWorkQuality");
        }

        public static TrtcNetWorkQuality valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcNetWorkQuality) ipChange.ipc$dispatch("25567f71", new Object[]{str});
            }
            return (TrtcNetWorkQuality) Enum.valueOf(TrtcNetWorkQuality.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcSendVideoType {
        E_SEND_VIDEO_TYPE_SEND_VIDEO,
        E_SEND_VIDEO_TYPE_NO_SEND,
        E_SEND_VIDEO_TYPE_SEND_PIC;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcSendVideoType trtcSendVideoType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcSendVideoType");
        }

        public static TrtcSendVideoType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcSendVideoType) ipChange.ipc$dispatch("affc1567", new Object[]{str});
            }
            return (TrtcSendVideoType) Enum.valueOf(TrtcSendVideoType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcUserRole {
        E_ROLE_NONE,
        E_ROLE_ANCHOR,
        E_ROLE_FANS_OR_CALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcUserRole trtcUserRole, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcUserRole");
        }

        public static TrtcUserRole valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcUserRole) ipChange.ipc$dispatch("c1da2ea1", new Object[]{str});
            }
            return (TrtcUserRole) Enum.valueOf(TrtcUserRole.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcVideoLayoutBgType {
        E_VIDEO_LAYOUT_BG_COLOR,
        E_VIDEO_LAYOUT_BG_IMAGE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcVideoLayoutBgType trtcVideoLayoutBgType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcVideoLayoutBgType");
        }

        public static TrtcVideoLayoutBgType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcVideoLayoutBgType) ipChange.ipc$dispatch("c7c55a70", new Object[]{str});
            }
            return (TrtcVideoLayoutBgType) Enum.valueOf(TrtcVideoLayoutBgType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcWorkMode {
        E_TRTC_WORK_MODE_UNKOWN,
        E_TRTC_WORK_MODE_LIVE,
        E_TRTC_WORK_MODE_CHAT,
        E_TRTC_WORK_MODE_MEETING;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcWorkMode trtcWorkMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/api/TrtcDefines$TrtcWorkMode");
        }

        public static TrtcWorkMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcWorkMode) ipChange.ipc$dispatch("ee56db8e", new Object[]{str});
            }
            return (TrtcWorkMode) Enum.valueOf(TrtcWorkMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13875a;

        static {
            t2o.a(395313415);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f13876a;
        public TrtcUserRole b;
        public TrtcMediaTransportProfile c;
        public TrtcMediaTransportProfile d;
        public String e;
        public boolean f = false;
        public String g;

        static {
            t2o.a(395313417);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f13877a;
        public int b;
        public String c;
        public String d;

        static {
            t2o.a(395313418);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public TrtcChannelAction f13878a;
        public String b;
        public String c;
        public boolean d;
        public boolean e;
        public String f;

        static {
            t2o.a(395313421);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f13879a;
        public int b;
        public String c;
        public String d;
        public boolean e = false;

        static {
            t2o.a(395313422);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f13880a;
        public int b = -1;

        static {
            t2o.a(395313423);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public String f13881a;
        public String b;
        public ITrtcInputStream c;
        public boolean d = true;
        public boolean e = true;
        public boolean f = false;
        public String g = "";
        public boolean h = false;

        static {
            t2o.a(395313426);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public String f13882a;
        public String b;
        public String c;
        public Map<String, String> d;
        public ITrtcInputStream e;

        static {
            t2o.a(395313427);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public String f13883a;
        public int b;
        public k c;

        static {
            t2o.a(395313428);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13884a;
        public TrtcSendVideoType b;

        static {
            t2o.a(395313429);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public int f13885a;
        public int b;
        public int c;

        static {
            t2o.a(395313430);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public long f13886a;
        public long b;
        public int c;
        public int d;
        public int e;

        static {
            t2o.a(395313435);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public String f13887a;
        public String b;
        public boolean c;
        public boolean d;
        public String e;

        static {
            t2o.a(395313436);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public String f13888a;
        public TrtcUserRole b;
        public String c;

        static {
            t2o.a(395313437);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public String f13889a;
        public a b;

        static {
            t2o.a(395313438);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public String f13890a;
        public boolean b;

        static {
            t2o.a(395313439);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class q {
        static {
            t2o.a(395313440);
        }
    }
}
