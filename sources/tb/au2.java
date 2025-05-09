package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.trtc.adapter.TrtcAdapter;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceViewRenderer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class au2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String g;
    public AConstants.ArtcChannelProfile h;
    public String m;
    public String n;
    public boolean o;
    public TrtcEngineImpl p;
    public ITrtcInputStream t;
    public TrtcInnerDefines.TrtcLocalVideoFreezeInfo y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f16007a = new ArrayList<>();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public ArtcEngineEventHandler c = null;
    public boolean d = false;
    public boolean e = false;
    public SurfaceViewRenderer f = null;
    public boolean i = true;
    public boolean j = true;
    public String k = "";
    public String l = "";
    public int q = 720;
    public int r = 1280;
    public int s = 20;
    public ITrtcInputStream u = null;
    public int v = 1;
    public String w = "";
    public String x = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcEngineImpl f16008a;

        public a(TrtcEngineImpl trtcEngineImpl) {
            this.f16008a = trtcEngineImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcStreamConfig.a aVar = new TrtcStreamConfig.a();
            au2 au2Var = au2.this;
            au2.this.t = this.f16008a.h().startCapture(aVar.f(au2Var.r, au2Var.q, au2Var.s).c(true).a());
        }
    }

    static {
        t2o.a(395313345);
    }

    public au2(TrtcAdapter trtcAdapter) {
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5aeb122", new Object[]{this})).booleanValue();
        }
        return this.b.get();
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd09a731", new Object[]{this, str});
            return;
        }
        this.f16007a.add(str);
        TrtcLog.j("CachedInfoHandler", "add api: " + str);
    }

    public final TrtcDefines.TrtcWorkMode c(AConstants.ArtcChannelProfile artcChannelProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcWorkMode) ipChange.ipc$dispatch("84c7ce05", new Object[]{this, artcChannelProfile});
        }
        TrtcDefines.TrtcWorkMode trtcWorkMode = TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_UNKOWN;
        if (artcChannelProfile == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
            return TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_LIVE;
        }
        if (artcChannelProfile == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_COMMUNICATION) {
            return TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_CHAT;
        }
        if (artcChannelProfile == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_CONFERENCE) {
            return TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_MEETING;
        }
        return trtcWorkMode;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f16007a.clear();
        this.b.set(false);
        TrtcLog.j("CachedInfoHandler", "Clear");
    }

    public synchronized String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        if (this.w.isEmpty()) {
            TrtcEngineImpl trtcEngineImpl = this.p;
            String str = this.m;
            if (str == null) {
                str = "123456";
            }
            this.w = trtcEngineImpl.d(str);
        }
        return this.w;
    }

    public synchronized void f(TrtcEngineImpl trtcEngineImpl) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3550b326", new Object[]{this, trtcEngineImpl});
            return;
        }
        this.p = trtcEngineImpl;
        Iterator<String> it = this.f16007a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            TrtcLog.j("CachedInfoHandler", "process cached api: " + next);
            switch (next.hashCode()) {
                case -2064288062:
                    if (next.equals("setTransportProfile")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1939772245:
                    if (next.equals("createChannel2")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1870406559:
                    if (next.equals("registUser")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1586811453:
                    if (next.equals("setVideoLayout")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1550999976:
                    if (next.equals("setVideoMirror")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146668052:
                    if (next.equals("startPreview2")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -79488385:
                    if (next.equals("setBroadcast")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 334238318:
                    if (next.equals("setLocalView")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 542896873:
                    if (next.equals("setlocalVideoFreeze")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 546804519:
                    if (next.equals("registerHandler")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1517754893:
                    if (next.equals("setRemoteView")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1728001524:
                    if (next.equals("setEnableSpeakerphone")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1937162280:
                    if (next.equals("setChannelProfile")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2080680496:
                    if (next.equals("setVideoProfile")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2106766303:
                    if (next.equals("enableBeauty")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.c.onSignalChannelAvailable();
            } else if (c == 1) {
                trtcEngineImpl.E1(c(this.h));
            } else if (c == 6) {
                trtcEngineImpl.h().setVideoMirror(this.d, this.e);
            } else if (c == 7) {
                trtcEngineImpl.h().setLocalView(this.f);
            } else if (c == '\t') {
                nf.g(new a(trtcEngineImpl), 0L);
            } else if (c != '\n') {
                switch (c) {
                    case '\f':
                        trtcEngineImpl.q0(this.o);
                        continue;
                    case '\r':
                        trtcEngineImpl.p0(false);
                        continue;
                    case 14:
                        trtcEngineImpl.p1(this.y);
                        continue;
                    default:
                        continue;
                }
            } else {
                ArtcEngineEventHandler artcEngineEventHandler = this.c;
                if (artcEngineEventHandler != null) {
                    artcEngineEventHandler.onCreateChannelSuccess(e());
                }
            }
        }
        TrtcLog.j("CachedInfoHandler", "all cached grtn api process done!");
        this.b.set(true);
    }
}
