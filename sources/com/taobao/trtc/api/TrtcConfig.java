package com.taobao.trtc.api;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String accsCfgTag;
    private String appKey;
    private String appVersion;
    @Deprecated
    private ITrtcObserver.b callEventObserver;
    @Deprecated
    private ITrtcObserver.c channelEventObserver;
    private String deviceId;
    private boolean enableSpeechDetect;
    @Deprecated
    private ITrtcObserver.e engineObserver;
    private int environment;
    private com.taobao.trtc.api.a eventHandler;
    private boolean initAccs;
    private boolean isChatroom;
    private int localAudioLevelMs;
    private boolean preferFrontCamera;
    private boolean preferHandset;
    private String regId;
    private String serverName;
    private boolean useBlueTooth;
    private boolean useExternalVideoCapture;
    private boolean useExternalVideoRender;
    private boolean useMusicMode;
    private boolean useTaoAudio;
    private String userId;
    private boolean videoFecEnable;
    private TrtcDefines.TrtcWorkMode workMode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f13874a = "";
        public String b = "";
        public String c = "";
        public String d = "";
        public final String e = "";
        public final boolean f = true;
        public boolean g = false;
        public boolean h = false;
        public boolean i = true;
        public boolean j = false;
        public boolean k = false;
        public final TrtcDefines.TrtcWorkMode l = TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_LIVE;
        public boolean m = false;
        public boolean n = true;
        public com.taobao.trtc.api.a o = null;
        public boolean p = false;
        public boolean q = false;
        public boolean r = false;
        @Deprecated
        public ITrtcObserver.e s = null;
        @Deprecated
        public ITrtcObserver.b t = null;
        @Deprecated
        public ITrtcObserver.c u = null;
        public int v = 1;
        public String w = "";
        public int x = 0;
        public String y = "";

        static {
            t2o.a(395313407);
        }

        public TrtcConfig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcConfig) ipChange.ipc$dispatch("c5e1fb3d", new Object[]{this});
            }
            TrtcConfig trtcConfig = new TrtcConfig();
            TrtcConfig.access$002(trtcConfig, this.f13874a);
            TrtcConfig.access$102(trtcConfig, this.b);
            TrtcConfig.access$202(trtcConfig, this.c);
            TrtcConfig.access$302(trtcConfig, this.d);
            TrtcConfig.access$402(trtcConfig, this.e);
            TrtcConfig.access$502(trtcConfig, this.g);
            TrtcConfig.access$602(trtcConfig, this.h);
            TrtcConfig.access$702(trtcConfig, this.i);
            TrtcConfig.access$802(trtcConfig, this.j);
            TrtcConfig.access$902(trtcConfig, this.l);
            TrtcConfig.access$1002(trtcConfig, this.k);
            TrtcConfig.access$1102(trtcConfig, this.m);
            TrtcConfig.access$1202(trtcConfig, this.n);
            TrtcConfig.access$1302(trtcConfig, this.v);
            TrtcConfig.access$1402(trtcConfig, this.w);
            TrtcConfig.access$1502(trtcConfig, this.o);
            TrtcConfig.access$1602(trtcConfig, this.s);
            TrtcConfig.access$1702(trtcConfig, this.t);
            TrtcConfig.access$1802(trtcConfig, this.u);
            TrtcConfig.access$1902(trtcConfig, this.f);
            TrtcConfig.access$2002(trtcConfig, this.x);
            TrtcConfig.access$2102(trtcConfig, this.y);
            TrtcConfig.access$2202(trtcConfig, this.p);
            TrtcConfig.access$2302(trtcConfig, this.q);
            TrtcConfig.access$2402(trtcConfig, this.r);
            return trtcConfig;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("89ee0220", new Object[]{this, str});
            }
            this.w = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("69ecfbaa", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("102b3431", new Object[]{this, str});
            }
            this.y = str;
            return this;
        }

        @Deprecated
        public a e(ITrtcObserver.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("91724d5a", new Object[]{this, bVar});
            }
            this.t = bVar;
            return this;
        }

        @Deprecated
        public a f(ITrtcObserver.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("91874ca", new Object[]{this, cVar});
            }
            this.u = cVar;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("32b69f77", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21f22758", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        @Deprecated
        public a i(ITrtcObserver.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9de450cc", new Object[]{this, eVar});
            }
            this.s = eVar;
            return this;
        }

        public a j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a88dd8aa", new Object[]{this, new Integer(i)});
            }
            this.v = i;
            return this;
        }

        public a k(com.taobao.trtc.api.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78f9dd35", new Object[]{this, aVar});
            }
            this.o = aVar;
            return this;
        }

        public a l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c8144d2", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public a m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a73d260d", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public a n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a1bd063b", new Object[]{this, new Integer(i)});
            }
            this.x = i;
            return this;
        }

        public a o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b950934a", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public a p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2f49edaf", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2d375aba", new Object[]{this, str});
            }
            this.f13874a = str;
            return this;
        }

        public a r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6194bd7", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a s(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8a54a973", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.g = z;
            this.h = z2;
            return this;
        }

        public a t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8981bb1", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("86f1efc7", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public a v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f0550ee2", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }
    }

    static {
        t2o.a(395313406);
    }

    public static /* synthetic */ String access$002(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af4e9c1", new Object[]{trtcConfig, str});
        }
        trtcConfig.serverName = str;
        return str;
    }

    public static /* synthetic */ boolean access$1002(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daa1d3f4", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useTaoAudio = z;
        return z;
    }

    public static /* synthetic */ String access$102(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a565e2e0", new Object[]{trtcConfig, str});
        }
        trtcConfig.appKey = str;
        return str;
    }

    public static /* synthetic */ boolean access$1102(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31bfc4d3", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.initAccs = z;
        return z;
    }

    public static /* synthetic */ boolean access$1202(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88ddb5b2", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.preferFrontCamera = z;
        return z;
    }

    public static /* synthetic */ int access$1302(TrtcConfig trtcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dffb66af", new Object[]{trtcConfig, new Integer(i)})).intValue();
        }
        trtcConfig.environment = i;
        return i;
    }

    public static /* synthetic */ String access$1402(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfa16ae", new Object[]{trtcConfig, str});
        }
        trtcConfig.accsCfgTag = str;
        return str;
    }

    public static /* synthetic */ com.taobao.trtc.api.a access$1502(TrtcConfig trtcConfig, com.taobao.trtc.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.a) ipChange.ipc$dispatch("bf529ca5", new Object[]{trtcConfig, aVar});
        }
        trtcConfig.eventHandler = aVar;
        return aVar;
    }

    public static /* synthetic */ ITrtcObserver.e access$1602(TrtcConfig trtcConfig, ITrtcObserver.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.e) ipChange.ipc$dispatch("83912dac", new Object[]{trtcConfig, eVar});
        }
        trtcConfig.engineObserver = eVar;
        return eVar;
    }

    public static /* synthetic */ ITrtcObserver.b access$1702(TrtcConfig trtcConfig, ITrtcObserver.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.b) ipChange.ipc$dispatch("5727a48b", new Object[]{trtcConfig, bVar});
        }
        trtcConfig.callEventObserver = bVar;
        return bVar;
    }

    public static /* synthetic */ ITrtcObserver.c access$1802(TrtcConfig trtcConfig, ITrtcObserver.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.c) ipChange.ipc$dispatch("d5907a12", new Object[]{trtcConfig, cVar});
        }
        trtcConfig.channelEventObserver = cVar;
        return cVar;
    }

    public static /* synthetic */ boolean access$1902(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaaf4bcb", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.videoFecEnable = z;
        return z;
    }

    public static /* synthetic */ int access$2002(TrtcConfig trtcConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6741bf13", new Object[]{trtcConfig, new Integer(i)})).intValue();
        }
        trtcConfig.localAudioLevelMs = i;
        return i;
    }

    public static /* synthetic */ String access$202(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfd6dbff", new Object[]{trtcConfig, str});
        }
        trtcConfig.userId = str;
        return str;
    }

    public static /* synthetic */ String access$2102(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2555612", new Object[]{trtcConfig, str});
        }
        trtcConfig.appVersion = str;
        return str;
    }

    public static /* synthetic */ boolean access$2202(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("157de0b3", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.preferHandset = z;
        return z;
    }

    public static /* synthetic */ boolean access$2302(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c9bd192", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.enableSpeechDetect = z;
        return z;
    }

    public static /* synthetic */ boolean access$2402(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3b9c271", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.isChatroom = z;
        return z;
    }

    public static /* synthetic */ String access$302(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da47d51e", new Object[]{trtcConfig, str});
        }
        trtcConfig.deviceId = str;
        return str;
    }

    public static /* synthetic */ String access$402(TrtcConfig trtcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4b8ce3d", new Object[]{trtcConfig, str});
        }
        trtcConfig.regId = str;
        return str;
    }

    public static /* synthetic */ boolean access$502(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365d39e", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useExternalVideoCapture = z;
        return z;
    }

    public static /* synthetic */ boolean access$602(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a83c47d", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useExternalVideoRender = z;
        return z;
    }

    public static /* synthetic */ boolean access$702(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a1b55c", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useBlueTooth = z;
        return z;
    }

    public static /* synthetic */ boolean access$802(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bfa63b", new Object[]{trtcConfig, new Boolean(z)})).booleanValue();
        }
        trtcConfig.useMusicMode = z;
        return z;
    }

    public static /* synthetic */ TrtcDefines.TrtcWorkMode access$902(TrtcConfig trtcConfig, TrtcDefines.TrtcWorkMode trtcWorkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcWorkMode) ipChange.ipc$dispatch("75554b78", new Object[]{trtcConfig, trtcWorkMode});
        }
        trtcConfig.workMode = trtcWorkMode;
        return trtcWorkMode;
    }

    public String ToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a47ed", new Object[]{this});
        }
        return "{ serviceName:" + this.serverName + ", appkey:" + this.appKey + ", uid:" + this.userId + ", did: " + this.deviceId + ", rid: " + this.regId + ", musicMode:" + this.useMusicMode + ", BT:" + this.useBlueTooth + ", taoAudio:" + this.useTaoAudio + ", workMode:" + this.workMode + ", extVCapture:" + this.useExternalVideoCapture + ", extVRender:" + this.useExternalVideoRender + ", initAccs:" + this.initAccs + ", fromtCamera:" + this.preferFrontCamera + ", vfec: " + this.videoFecEnable + ", appVersion: " + this.appVersion + ", eventHandler: " + this.eventHandler + ", engineObserver: " + this.engineObserver + ", channelObserver:" + this.channelEventObserver + ", callObserver:" + this.callEventObserver + ", env: " + this.environment + ", accsTag: " + this.accsCfgTag + ", localAudioLevelMs: " + this.localAudioLevelMs + ", preferHandset: " + this.preferHandset + ", enableSpeechDetect: " + this.enableSpeechDetect + ", isChatroom: " + this.isChatroom + " }";
    }

    public String getAccsCfgTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e139e7b", new Object[]{this});
        }
        return this.accsCfgTag;
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return this.appKey;
    }

    @Deprecated
    public ITrtcObserver.b getCallEventObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.b) ipChange.ipc$dispatch("893251d", new Object[]{this});
        }
        return this.callEventObserver;
    }

    @Deprecated
    public ITrtcObserver.c getChannelEventObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.c) ipChange.ipc$dispatch("557a47c1", new Object[]{this});
        }
        return this.channelEventObserver;
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return this.deviceId;
    }

    @Deprecated
    public ITrtcObserver.e getEngineObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcObserver.e) ipChange.ipc$dispatch("9808feaf", new Object[]{this});
        }
        return this.engineObserver;
    }

    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
        }
        return this.environment;
    }

    public com.taobao.trtc.api.a getEventHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.a) ipChange.ipc$dispatch("10d1591c", new Object[]{this});
        }
        return this.eventHandler;
    }

    public String getRegId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2950b580", new Object[]{this});
        }
        return this.regId;
    }

    public String getServerName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9851915", new Object[]{this});
        }
        return this.serverName;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public boolean getVideoFecEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efe06d", new Object[]{this})).booleanValue();
        }
        return this.videoFecEnable;
    }

    public TrtcDefines.TrtcWorkMode getWorkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcWorkMode) ipChange.ipc$dispatch("ba7b30f6", new Object[]{this});
        }
        return this.workMode;
    }

    public boolean isChatroom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda9cd88", new Object[]{this})).booleanValue();
        }
        return this.isChatroom;
    }

    public boolean isInitAccs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da716f17", new Object[]{this})).booleanValue();
        }
        return this.initAccs;
    }

    public boolean isPreferFrontCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f4acff", new Object[]{this})).booleanValue();
        }
        return this.preferFrontCamera;
    }

    public boolean isPreferHandset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78f2ec64", new Object[]{this})).booleanValue();
        }
        return this.preferHandset;
    }

    public boolean isUseBlueTooth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d288fb1c", new Object[]{this})).booleanValue();
        }
        return this.useBlueTooth;
    }

    public boolean isUseExternalVideoCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8580e85e", new Object[]{this})).booleanValue();
        }
        return this.useExternalVideoCapture;
    }

    public boolean isUseExternalVideoRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3252b5f4", new Object[]{this})).booleanValue();
        }
        return this.useExternalVideoRender;
    }

    public boolean isUseMusicMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7682cf6", new Object[]{this})).booleanValue();
        }
        return this.useMusicMode;
    }

    public boolean isUseTaoAudio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fc1947c", new Object[]{this})).booleanValue();
        }
        return this.useTaoAudio;
    }

    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
        } else {
            this.deviceId = str;
        }
    }

    public void setPreferFrontCamera(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557f9a71", new Object[]{this, new Boolean(z)});
        } else {
            this.preferFrontCamera = z;
        }
    }

    public void setRegId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9e905e", new Object[]{this, str});
        } else {
            this.regId = str;
        }
    }

    public void setWorkMode(TrtcDefines.TrtcWorkMode trtcWorkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e3d62e", new Object[]{this, trtcWorkMode});
        } else {
            this.workMode = trtcWorkMode;
        }
    }
}
