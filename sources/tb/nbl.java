package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f24619a;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d103e93", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "liveMessageCDNInterval", "5"));
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2d4d305", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "liveMessageCDNMaxInterval", "10"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaa79abe", new Object[0]);
        }
        return v2s.o().p().b("tblive", "liveMessageCDNUrl", "https://impaas.alicdn.com/live/message/");
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63ae86da", new Object[0]);
        }
        return v2s.o().p().b("tblive", "liveMessageLongFetchCDNUrl", "https://livemsgconnect.taobao.com/live/message/");
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7dc9e97", new Object[0]);
        }
        return v2s.o().p().b("tblive", "liveMessageDefaultColorRate", "{\"10036\":100000,\"10086\":100000,\"10131\":100000,\"10132\":100000}");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("793dfed9", new Object[0])).booleanValue();
        }
        if (prq.a(v2s.o().p().b("tblive", "enableCommentUseLMSDK", "true"))) {
            return prq.a(v2s.o().c().b("taolive", "enableCommentUseLMSDK", "enable", "false"));
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f74c85a", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return prq.a(v2s.o().p().b("tblive", "enableLiveMessageLogger", "true"));
        }
        return true;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526dc033", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null ? prq.a(v2s.o().p().b("tblive", "enableLiveMessageLogger", "true")) : true) {
            if (f24619a == null && v2s.o().c() != null) {
                f24619a = v2s.o().c().b("taolive", "EnableKMPOpenPM", "enabled", "null");
            }
            if ("false".equals(f24619a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b035bb6", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "enableUTFullLink", "false"));
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4937172", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "liveMessageDeduplicationSize", "10000"));
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e93b8905", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "liveMessageHeartFetchStatusInterval", "1"));
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95d1d12a", new Object[0]);
        }
        return v2s.o().p().b("tblive", "liveMessageCommonExtraParams", "account_id;feed_id;livesource;livestatus;clickid;isAD;roomType;newRoomType;isChatRoom;roomStatus;streamStatus;scene;");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eda0f4d7", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "stopHeartbeatDisable", "true"));
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a672a9db", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "liveMessageHeartbeatInterval", "5"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6bf90d7", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "isAddDeviceIdCdnFetchMSG", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9d3edfd", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "isDebugLiveMessage", "false"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5df27767", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "isNeedCDNMessageGet", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1915cc57", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "liveMessageLongPullDisable", "false"));
    }

    public static int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29eba353", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "timeOutCNDLongPull", "15000"));
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b95980f5", new Object[0])).intValue();
        }
        return prq.b(v2s.o().p().b("tblive", "timeoutCDNMessageGet", "3000"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbca37b8", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "liveMessageUseCdnFetchMSG", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6110f540", new Object[0])).booleanValue();
        }
        return prq.a(v2s.o().p().b("tblive", "liveMessageUseHeartbeat", "true"));
    }
}
