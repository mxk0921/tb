package com.taobao.trtc.call;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcDataStream;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.c;
import com.taobao.trtc.call.ITrtcCallEngine;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.ConcurrentHashMap;
import tb.smu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcCallImpl extends com.taobao.trtc.api.a implements ITrtcCallEngine, NetworkStatusHelper.INetworkStatusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f13906a;
    public final ITrtcCallEngine.b b;
    public final ITrtcCallEngine.d c;
    public String e;
    public String f;
    public ITrtcInputStream g;
    public boolean h;
    public String d = "";
    public final Handler j = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap<String, b> i = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum CallStatus {
        E_CALL_STATUS_IDLE,
        E_CALL_STATUS_TALKING,
        E_CALL_STATUS_CALLING;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CallStatus callStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/call/TrtcCallImpl$CallStatus");
        }

        public static CallStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallStatus) ipChange.ipc$dispatch("e0fb68e5", new Object[]{str});
            }
            return (CallStatus) Enum.valueOf(CallStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ITrtcDataStream.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13907a;

        public a(b bVar) {
            this.f13907a = bVar;
        }

        @Override // com.taobao.trtc.api.ITrtcDataStream.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb96a256", new Object[]{this});
            }
        }

        @Override // com.taobao.trtc.api.ITrtcDataStream.a
        public void b(TrtcDefines.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eefbb65d", new Object[]{this, fVar});
            } else if (TrtcCallImpl.K(TrtcCallImpl.this) != null) {
                try {
                    TrtcCallImpl.K(TrtcCallImpl.this).a(this.f13907a.f13908a, fVar);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.taobao.trtc.api.ITrtcDataStream.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29a10add", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f13908a;
        public smu c;
        public ITrtcOutputStream e;
        public ITrtcDataStream.a f;
        public CallStatus b = CallStatus.E_CALL_STATUS_IDLE;
        public boolean d = false;

        static {
            t2o.a(395313479);
        }
    }

    static {
        t2o.a(395313477);
        t2o.a(395313470);
        t2o.a(607125819);
    }

    public TrtcCallImpl(Context context, ITrtcCallEngine.d dVar) {
        this.c = dVar;
        this.b = dVar.c;
        TrtcConfig a2 = new TrtcConfig.a().q(dVar.b).v(dVar.d).c(dVar.f13904a).k(this).n(dVar.e).p(true).a();
        c c = c.c(context);
        this.f13906a = c;
        c.i(a2);
        NetworkStatusHelper.startListener(context);
        NetworkStatusHelper.addStatusChangeListener(this);
        onNetworkStatusChanged(NetworkStatusHelper.getStatus());
    }

    public static /* synthetic */ ITrtcCallEngine.b K(TrtcCallImpl trtcCallImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallEngine.b) ipChange.ipc$dispatch("cecac7a6", new Object[]{trtcCallImpl});
        }
        return trtcCallImpl.b;
    }

    public static /* synthetic */ Object ipc$super(TrtcCallImpl trtcCallImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/call/TrtcCallImpl");
    }

    @Override // com.taobao.trtc.api.a
    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c61d2", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("CallEngine", "remote leave, " + str);
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).b0(str, str2);
        }
        Z(str);
    }

    public final void L(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad1f5b3", new Object[]{this, bVar});
        } else if (bVar != null) {
            smu smuVar = bVar.c;
            if (smuVar != null) {
                smuVar.c();
            }
            c cVar = this.f13906a;
            if (cVar != null) {
                if (bVar.d) {
                    cVar.a(this.d, bVar.f13908a, null);
                }
                if (bVar.e != null) {
                    this.f13906a.o(bVar.f13908a);
                }
            }
        }
    }

    public final void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d5836a", new Object[]{this, str});
            return;
        }
        TrtcLog.j("CallEngine", "clear call list for: " + str);
        for (b bVar : this.i.values()) {
            L(bVar);
        }
        this.i.clear();
        if (this.h) {
            this.h = false;
            this.f13906a.h().stopScreenCapture();
        }
        if (this.g != null) {
            this.f13906a.n(this.c.d);
            this.g = null;
        }
        this.f = null;
        this.e = null;
        this.d = "";
    }

    public final void N(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d73a428", new Object[]{this, bVar});
            return;
        }
        TrtcLog.j("CallEngine", "createInputAndOutputForData " + bVar.f13908a);
        if (this.f13906a != null) {
            if (this.g == null) {
                this.g = this.f13906a.e(this.c.d, new TrtcStreamConfig.a().b(true).e(false).c(true).a(), null);
            }
            if (bVar.e == null) {
                ITrtcOutputStream f = this.f13906a.f(bVar.f13908a);
                bVar.e = f;
                if (f != null) {
                    a aVar = new a(bVar);
                    bVar.f = aVar;
                    f.setDataStreamObserver(aVar);
                }
            }
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        NetworkStatusHelper.removeStatusChangeListener(this);
        if (!TextUtils.isEmpty(this.d)) {
            this.f13906a.k(this.d, "Dispose");
        }
        M("Dispose");
        this.f13906a.p();
    }

    public boolean P(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8b7d3b5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.j.post(new Runnable() { // from class: tb.gju
            @Override // java.lang.Runnable
            public final void run() {
                TrtcCallImpl.this.R(z);
            }
        });
        return true;
    }

    public final b Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aafb25c7", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.i.get(str);
        }
        TrtcLog.i("CallEngine", "can not find call node by id: " + str);
        return null;
    }

    public final /* synthetic */ void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5af643f", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.f13906a;
        if (cVar != null && cVar.g() != null) {
            this.f13906a.g().enableSpeakerphone(z);
        }
    }

    public final /* synthetic */ void S(ITrtcCallEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2446d191", new Object[]{this, cVar});
            return;
        }
        TrtcLog.j("CallEngine", "call timeout, remoteId: " + cVar.f13903a);
        Z(cVar.f13903a);
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).Y(-103);
        }
    }

    public final /* synthetic */ void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ecce0eb", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.f13906a;
        if (cVar != null && cVar.g() != null) {
            this.f13906a.g().muteLocal(z);
        }
    }

    public final /* synthetic */ void U(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4f14d9", new Object[]{this, str, new Boolean(z)});
            return;
        }
        c cVar = this.f13906a;
        if (cVar != null && cVar.g() != null) {
            this.f13906a.g().muteRemote(str, z);
        }
    }

    public final /* synthetic */ void V(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3737af90", new Object[]{this, bVar});
            return;
        }
        ITrtcCallEngine.b bVar2 = this.b;
        if (bVar2 != null) {
            ((com.taobao.trtc.rtcroom.c) bVar2).c0(bVar);
        }
    }

    public final void Y(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c15f0c3", new Object[]{this, bVar});
        } else {
            Z(bVar.f13908a);
        }
    }

    public final void Z(String str) {
        ConcurrentHashMap<String, b> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdda1db5", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (concurrentHashMap = this.i) != null && concurrentHashMap.containsKey(str)) {
            L(this.i.get(str));
            this.i.remove(str);
            TrtcLog.j("CallEngine", "remove call node by id: " + str + ", remain size: " + this.i.size());
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9032e145", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (!TextUtils.isEmpty(this.d)) {
            this.f13906a.l(this.d, str, i);
        }
        M("HangUpAll");
    }

    public boolean a0(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a25c3c4", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        TrtcDefines.f fVar = new TrtcDefines.f();
        fVar.f13880a = str.getBytes();
        fVar.b = i;
        this.g.sendDataFrame(fVar);
        return true;
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean b(final boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d053911c", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        this.j.post(new Runnable() { // from class: tb.eju
            @Override // java.lang.Runnable
            public final void run() {
                TrtcCallImpl.this.U(str, z);
            }
        });
        return true;
    }

    @Override // com.taobao.trtc.api.a
    public void d(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20c2125", new Object[]{this, new Integer(i), bundle});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null && bundle != null) {
            try {
                if (i == 405) {
                    ((com.taobao.trtc.rtcroom.c) bVar).X(TrtcDefines.TrtcAudioRouteDevice.values()[bundle.getInt(TrtcConstants.TRTC_PARAMS_AUDIO_ROUTE)]);
                } else if (i == 406) {
                    ((com.taobao.trtc.rtcroom.c) bVar).W(TrtcDefines.TrtcAudioFocusState.values()[bundle.getInt(TrtcConstants.TRTC_PARAMS_AUDIO_FOCUS)]);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.trtc.api.a
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda22ffa", new Object[]{this, new Boolean(z)});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        if (z) {
            this.f13906a.g().setAudioObserver(new TrtcAudioDevice.a() { // from class: tb.hju
                @Override // com.taobao.trtc.api.TrtcAudioDevice.a
                public final void a(TrtcAudioDevice.b bVar2) {
                    TrtcCallImpl.this.V(bVar2);
                }
            });
            ((com.taobao.trtc.rtcroom.c) this.b).h0();
            return;
        }
        ((com.taobao.trtc.rtcroom.c) bVar).Y(-101);
    }

    @Override // com.taobao.trtc.api.a
    public void g(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3875e64a", new Object[]{this, trtcErrorEvent, new Integer(i), str});
        }
    }

    @Override // com.taobao.trtc.api.a
    public void i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d449a76a", new Object[]{this, str, new Integer(i)});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).Z(true, str);
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine
    public boolean muteLocal(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29bbed9f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.j.post(new Runnable() { // from class: tb.fju
            @Override // java.lang.Runnable
            public final void run() {
                TrtcCallImpl.this.T(z);
            }
        });
        return true;
    }

    @Override // com.taobao.trtc.api.a
    public void o(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20a9d0", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).d0(trtcMediaConnectionState);
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
        } else if (this.b != null) {
            if (!networkStatus.isWifi()) {
                if (networkStatus.isMobile()) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            ((com.taobao.trtc.rtcroom.c) this.b).f0(i);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void p(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fee0eb", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).e0(trtcNetWorkQuality);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void u(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8132c4bb", new Object[]{this, new Integer(i), bundle});
            return;
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).g0(i);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void k(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0423f27", new Object[]{this, eVar});
        } else if (eVar.b != 0) {
            M("JoinError");
            ((com.taobao.trtc.rtcroom.c) this.b).Y(-102);
        } else if (TextUtils.isEmpty(this.e)) {
            TrtcLog.i("CallEngine", "join success, but no remote to notify");
            ((com.taobao.trtc.rtcroom.c) this.b).Y(-104);
        } else {
            b Q = Q(this.e);
            if (Q != null) {
                Q.d = true;
            }
            TrtcDefines.m mVar = new TrtcDefines.m();
            mVar.f13887a = eVar.f13879a;
            mVar.b = this.e;
            mVar.c = true;
            if (!TextUtils.isEmpty(this.f)) {
                mVar.e = this.f;
            }
            this.f = null;
            this.e = null;
            TrtcLog.j("CallEngine", "joinsuccess, start notify channel to " + mVar.b);
            this.f13906a.m(mVar);
        }
    }

    public boolean W(final ITrtcCallEngine.c cVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e62247e", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null || this.f13906a == null || TextUtils.isEmpty(cVar.f13903a) || (i = cVar.c) > 1 || i < 0) {
            TrtcLog.i("CallEngine", "params invalid");
            return false;
        } else if (!TextUtils.isEmpty(this.d) || this.i.get(cVar.f13903a) != null) {
            TrtcLog.i("CallEngine", "already joined or call node exist, remote id: " + cVar.f13903a);
            return false;
        } else {
            if (TextUtils.isEmpty(cVar.b)) {
                cVar.b = this.f13906a.d("trtc-channel-call");
                TrtcLog.j("CallEngine", "create channel: " + cVar.b);
            }
            this.f = cVar.h;
            this.e = cVar.f13903a;
            b bVar = new b();
            String str = cVar.f13903a;
            bVar.f13908a = str;
            bVar.b = CallStatus.E_CALL_STATUS_CALLING;
            this.i.put(str, bVar);
            try {
                this.d = cVar.b;
                TrtcDefines.g gVar = new TrtcDefines.g();
                gVar.f13881a = cVar.b;
                gVar.d = true;
                gVar.e = false;
                gVar.f = true;
                this.f13906a.j(gVar);
                if (cVar.g > 0) {
                    smu smuVar = new smu(false, cVar.g, new smu.b() { // from class: tb.dju
                        @Override // tb.smu.b
                        public final void onTimeOut() {
                            TrtcCallImpl.this.S(cVar);
                        }
                    });
                    bVar.c = smuVar;
                    smuVar.b();
                }
            } catch (Throwable th) {
                TrtcLog.j("CallEngine", "exception when makecall, " + th.getMessage());
                Y(bVar);
            }
            return true;
        }
    }

    public boolean X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("703cdcc7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!this.h) {
            return false;
        }
        TrtcLog.j("CallEngine", "pauseSendScreen, enable: " + z);
        this.f13906a.h().pauseScreenCapture(z);
        return true;
    }

    public boolean b0(ITrtcCallEngine.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ebadba0", new Object[]{this, eVar})).booleanValue();
        }
        TrtcLog.j("CallEngine", "startAndSendScrren");
        ITrtcInputStream iTrtcInputStream = this.g;
        if (iTrtcInputStream == null) {
            TrtcLog.i("CallEngine", "no inputstream");
            return false;
        }
        TrtcStreamConfig streamConfig = iTrtcInputStream.streamConfig();
        streamConfig.setVideoEnable(true);
        if (this.f13906a.h().startScreenCapture(new TrtcStreamConfig.a().b(streamConfig.isAudioEnable()).c(streamConfig.isDataEnable()).e(streamConfig.isVideoEnable()).f(eVar.f13905a, eVar.b, eVar.c).a(), eVar.d) == null) {
            TrtcLog.i("CallEngine", "startScreenCapture error");
            return false;
        }
        this.h = true;
        TrtcDefines.g gVar = new TrtcDefines.g();
        gVar.d = streamConfig.isAudioEnable();
        gVar.f = streamConfig.isDataEnable();
        gVar.e = streamConfig.isVideoEnable();
        gVar.f13881a = this.d;
        gVar.c = this.g;
        this.f13906a.r(gVar);
        return true;
    }

    public boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22e2b941", new Object[]{this})).booleanValue();
        }
        if (!this.h || this.g == null) {
            return false;
        }
        TrtcLog.j("CallEngine", "stopSendSceen");
        TrtcStreamConfig streamConfig = this.g.streamConfig();
        streamConfig.setVideoEnable(false);
        TrtcDefines.g gVar = new TrtcDefines.g();
        gVar.d = streamConfig.isAudioEnable();
        gVar.f = streamConfig.isDataEnable();
        gVar.e = streamConfig.isVideoEnable();
        gVar.c = this.g;
        gVar.f13881a = this.d;
        this.f13906a.r(gVar);
        this.f13906a.h().stopScreenCapture();
        this.h = false;
        return true;
    }

    @Override // com.taobao.trtc.api.a
    public void t(TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18f8c4b", new Object[]{this, dVar});
            return;
        }
        TrtcLog.j("CallEngine", "onNotifyEvent, action: " + dVar.f13878a + ", remoteId: " + dVar.b);
        b Q = Q(dVar.b);
        if (Q != null) {
            CallStatus callStatus = Q.b;
            CallStatus callStatus2 = CallStatus.E_CALL_STATUS_TALKING;
            if (callStatus != callStatus2) {
                Q.c.c();
                Q.d = false;
                ITrtcCallEngine.a aVar = new ITrtcCallEngine.a();
                aVar.b = dVar.c;
                String str = dVar.b;
                aVar.f13902a = str;
                aVar.e = dVar.f;
                aVar.c = dVar.e ? 1 : 0;
                TrtcDefines.TrtcChannelAction trtcChannelAction = dVar.f13878a;
                if (trtcChannelAction == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_AGREE) {
                    aVar.d = true;
                    Q.b = callStatus2;
                    N(Q);
                } else if (trtcChannelAction == TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_DIS_AGREE) {
                    aVar.d = false;
                    Z(str);
                }
                ITrtcCallEngine.b bVar = this.b;
                if (bVar != null) {
                    ((com.taobao.trtc.rtcroom.c) bVar).V(aVar);
                }
            }
        }
    }

    @Override // com.taobao.trtc.api.a
    public void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54825390", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("CallEngine", "onRemoteJoinedChannel, id: " + str + ", extension: " + str2);
        if (Q(str) != null) {
            TrtcDefines.d dVar = new TrtcDefines.d();
            dVar.f13878a = TrtcDefines.TrtcChannelAction.E_CHANNEL_NOTIFY_AGREE;
            dVar.b = str;
            dVar.c = this.d;
            dVar.f = str2;
            dVar.d = true;
            dVar.e = false;
            t(dVar);
        }
        ITrtcCallEngine.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.trtc.rtcroom.c) bVar).a0(str, str2);
        }
    }
}
