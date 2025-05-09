package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.a;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nlu extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITrtcObserver.e f24819a;
    public final ITrtcObserver.c b;
    public final ITrtcObserver.b c;
    public ITrtcObserver.a d;
    public ITrtcObserver.f e;
    public final Object f = new Object();
    public final a g;

    static {
        t2o.a(395313533);
    }

    public nlu(ITrtcObserver.e eVar, ITrtcObserver.c cVar, ITrtcObserver.b bVar, a aVar) {
        this.f24819a = eVar;
        this.c = bVar;
        this.b = cVar;
        this.g = aVar;
    }

    public static /* synthetic */ Object ipc$super(nlu nluVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcEventProxy");
    }

    public static String s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51826913", new Object[]{new Integer(i)});
        }
        if (i == 200) {
            return "TRTC_EVENT_START_LIVE_SUCCESS";
        }
        if (i == 201) {
            return "TRTC_EVENT_LINK_LIVE_NEED_MIX";
        }
        switch (i) {
            case 100:
                return "TRTC_EVENT_ENGINE_INITIALIZE";
            case 101:
                return "TRTC_EVENT_NETWORK_QUALITY";
            case 102:
                return "TRTC_EVENT_NETWORK_STATS";
            case 103:
                return "TRTC_EVENT_MEDIA_CONNECTION_CHANGE";
            case 104:
                return "TRTC_EVENT_ERROR";
            case 105:
                return "TRTC_EVENT_PHONE_STATE";
            case 106:
                return "TRTC_EVENT_FIRST_REMOTE_VIDEO_FRAME";
            case 107:
                return "TRTC_EVENT_FIRST_REMOTE_AUDIO_FRAME";
            case 108:
                return "TRTC_EVENT_LOCAL_STREAM_UPDATED";
            case 109:
                return "TRTC_EVENT_REMOTE_STREAM_UPDATED";
            default:
                switch (i) {
                    case 300:
                        return "TRTC_EVENT_CAMERA_OPEN_ERROR";
                    case 301:
                        return "TRTC_EVENT_CAMERA_DISCONNECT";
                    case 302:
                        return "TRTC_EVENT_CAMERA_FREEZE";
                    case 303:
                        return "TRTC_EVENT_CAMERA_OPENING";
                    case 304:
                        return "TRTC_EVENT_CAMERA_FIRST_FRAME";
                    case 305:
                        return "TRTC_EVENT_CAMERA_CLOSED";
                    case 306:
                        return "TRTC_EVENT_CAMERA_SWITCH_DONE";
                    case 307:
                        return "TRTC_EVENT_CAMERA_SWITCH_ERROR";
                    default:
                        switch (i) {
                            case 400:
                                return "TRTC_EVENT_AUDIO_RECORD_INIT_ERROR";
                            case 401:
                                return "TRTC_EVENT_AUDIO_RECORD_START_ERROR";
                            case 402:
                                return "TRTC_EVENT_AUDIO_RECORD_READ_ERROR";
                            case 403:
                                return "TRTC_EVENT_AUDIO_BLUETOOTH_CONNECTED";
                            case 404:
                                return "TRTC_EVENT_AUDIO_BLUETOOTH_DISCONNECTED";
                            case 405:
                                return "TRTC_EVENT_AUDIO_ROUTE_CHANGED";
                            default:
                                switch (i) {
                                    case 500:
                                        return "TRTC_EVENT_MAKE_CALL_RSP";
                                    case 501:
                                        return "TRTC_EVENT_NEW_CALL";
                                    case 502:
                                        return "TRTC_EVENT_REMOTE_ANSWER";
                                    case 503:
                                        return "TRTC_EVENT_ANSWER_RSP";
                                    case 504:
                                        return "TRTC_EVENT_REMOTE_HANGUP";
                                    case 505:
                                        return "TRTC_EVENT_CALL_TIMEOUT";
                                    case 506:
                                        return "TRTC_EVENT_REMOTE_CANCEL";
                                    default:
                                        switch (i) {
                                            case 600:
                                                return "TRTC_EVENT_JOIN_CHANNEL_RSP";
                                            case 601:
                                                return "TRTC_EVENT_REMOTE_JOINED_CHANNEL";
                                            case 602:
                                                return "TRTC_EVENT_REMOTE_LEFT_CHANNEL";
                                            case 603:
                                                return "TRTC_EVENT_REMOTE_NOTIFY_CHANNEL";
                                            default:
                                                return "UNKNOW";
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.taobao.trtc.api.a
    public void A(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c61d2", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.c cVar = this.b;
                if (cVar != null) {
                    cVar.n(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.klu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.b1(str, str2);
                }
            });
        }
    }

    public final /* synthetic */ void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6ec5a7", new Object[]{this});
            return;
        }
        f1(404, null, null);
        this.g.d(404, null);
    }

    public void A1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb0de8d", new Object[]{this, str});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.onLiveChannelIdUpdate(str);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void B(final ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08348ac", new Object[]{this, arrayList});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.c cVar = this.b;
                if (cVar != null) {
                    cVar.G(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.clu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.c1(arrayList);
                }
            });
        }
    }

    public final /* synthetic */ void B0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd5a78b", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        f1(505, bundle, null);
        this.g.e(str);
    }

    public void B1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a151f", new Object[]{this, new Boolean(z)});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.o(z);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void C(final a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34478d89", new Object[]{this, bVar});
        } else if (this.g != null) {
            r0(new Runnable() { // from class: tb.xku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.d1(bVar);
                }
            });
        }
    }

    public final /* synthetic */ void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c43ec1", new Object[]{this});
            return;
        }
        f1(305, null, null);
        this.g.E(305, null);
    }

    public void C1(boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98900e3d", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.I(z, i, i2, i3);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void D(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb3c428", new Object[]{this, new Integer(i)});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.p(i);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.mlu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.e1(i);
                }
            });
        }
    }

    public final /* synthetic */ void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40de2c0d", new Object[]{this});
            return;
        }
        f1(301, null, null);
        this.g.E(301, null);
    }

    public void D1(boolean z, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f99e15", new Object[]{this, new Boolean(z), arrayList});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.j(z, arrayList);
        }
    }

    public final /* synthetic */ void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bb65a2", new Object[]{this});
            return;
        }
        f1(304, null, null);
        this.g.E(304, null);
    }

    public final /* synthetic */ void F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd8bbd", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        f1(302, bundle, null);
        this.g.E(302, bundle);
    }

    public void F1(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2744305", new Object[]{this, arrayList});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.e(arrayList);
        }
    }

    public final /* synthetic */ void G0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b42723", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        f1(300, bundle, null);
        this.g.E(300, bundle);
    }

    public final /* synthetic */ void H0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f7a5ff", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TrtcConstants.TRTC_PARAMS_CAMERA_NAME, str);
        f1(303, bundle, null);
        this.g.E(303, bundle);
    }

    public void H1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0f112c", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).T(str);
            }
        }
    }

    public final /* synthetic */ void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289da5bc", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_CAMERA_IS_FRONT, z);
        f1(306, bundle, null);
        this.g.E(306, bundle);
    }

    public void I1(ITrtcObserver.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7335ea97", new Object[]{this, aVar});
            return;
        }
        synchronized (this.f) {
            this.d = aVar;
        }
    }

    public final /* synthetic */ void J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dadc27", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        f1(307, bundle, null);
        this.g.E(307, bundle);
    }

    public void J1(ITrtcObserver.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfad4e1", new Object[]{this, fVar});
            return;
        }
        synchronized (this.f) {
            this.e = fVar;
        }
    }

    public final /* synthetic */ void K0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346406ab", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", z);
        f1(100, bundle, null);
        this.g.f(z);
    }

    public final /* synthetic */ void L0(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc8eaf5", new Object[]{this, trtcErrorEvent, new Integer(i), str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ERROR_EVENT, trtcErrorEvent.ordinal());
        bundle.putInt("errorCode", i);
        bundle.putString("errorMsg", str);
        f1(104, bundle, null);
        this.g.g(trtcErrorEvent, i, str);
    }

    public final /* synthetic */ void M0(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b437ab36", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putInt("width", i);
        bundle.putInt("height", i2);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ELAPSED, i3);
        f1(106, bundle, null);
        this.g.j(str, i, i2, i3);
    }

    public final /* synthetic */ void N0(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350bfe83", new Object[]{this, eVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("channelId", eVar.f13879a);
        bundle.putInt("errorCode", eVar.b);
        bundle.putString("errorMsg", eVar.c);
        f1(600, bundle, null);
        this.g.k(eVar);
    }

    public final /* synthetic */ void O0(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c50fae", new Object[]{this, str, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("streamId", str);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_NEED_MIX, z);
        f1(201, bundle, null);
        this.g.l(str, z);
    }

    public final /* synthetic */ void P0(a.C0782a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91331f1", new Object[]{this, aVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("audioEnable", aVar.f13892a);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE, aVar.b);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_DATA_ENABLE, aVar.c);
        f1(108, bundle, null);
        this.g.m(aVar);
    }

    public final /* synthetic */ void Q0(ArrayList arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e1b4ee", new Object[]{this, arrayList, str});
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TrtcDefines.c cVar = (TrtcDefines.c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("userId", cVar.f13877a);
            bundle.putInt("errorCode", cVar.b);
            bundle.putString("errorMsg", cVar.c);
            f1(500, bundle, null);
        }
        this.g.n(arrayList, str);
    }

    public final /* synthetic */ void R0(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9ef7c3", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("state", trtcMediaConnectionState.ordinal());
        f1(103, bundle, null);
        this.g.o(trtcMediaConnectionState);
    }

    public final /* synthetic */ void S0(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f740c76", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("quality", trtcNetWorkQuality.ordinal());
        f1(101, bundle, null);
        this.g.p(trtcNetWorkQuality);
    }

    public final /* synthetic */ void T0(TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3d0086", new Object[]{this, lVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(TrtcConstants.TRTC_PARAMS_TOTAL_TX_BYTES, lVar.f13886a);
        bundle.putLong(TrtcConstants.TRTC_PARAMS_TOTAL_RX_BYTES, lVar.b);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_TOTAL_TX_KBPS, lVar.c);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_TOTAL_RX_KBPS, lVar.d);
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AVAILABLE_BANDWIDTH, lVar.e);
        f1(102, bundle, null);
        this.g.q(lVar);
    }

    public final /* synthetic */ void U0(TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f0e445", new Object[]{this, bVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", bVar.f13876a);
        bundle.putInt("role", bVar.b.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_TRANS, bVar.c.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_VIDEO_TRANS, bVar.d.ordinal());
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, bVar.e);
        f1(501, bundle, null);
        this.g.r(bVar);
    }

    public final /* synthetic */ void V0(TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129013de", new Object[]{this, dVar});
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.t(dVar);
        }
        s(dVar.f13878a, dVar.b, dVar.c, dVar.f);
    }

    public final /* synthetic */ void W0(TrtcDefines.TrtcAnswerType trtcAnswerType, TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da47615", new Object[]{this, trtcAnswerType, bVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ANSWER_TYPE, trtcAnswerType.ordinal());
        bundle.putString("userId", bVar.f13876a);
        bundle.putInt("role", bVar.b.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_TRANS, bVar.c.ordinal());
        bundle.putInt(TrtcConstants.TRTC_PARAMS_VIDEO_TRANS, bVar.d.ordinal());
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, bVar.e);
        f1(502, bundle, null);
        this.g.v(bVar, trtcAnswerType);
    }

    public final /* synthetic */ void X0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2419f3a9", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        f1(506, bundle, null);
        this.g.w(str, str2);
    }

    public final /* synthetic */ void Y0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0624b7", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        f1(504, bundle, null);
        this.g.x(str, str2);
    }

    public final /* synthetic */ void Z0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ae3747", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        f1(601, bundle, null);
        this.g.y(str, str2);
    }

    public final /* synthetic */ void a1(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdb2af6", new Object[]{this, arrayList});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TrtcConstants.TRTC_PARAMS_PEER_LIST, arrayList.toString());
        f1(601, bundle, null);
        this.g.z(arrayList);
    }

    public final /* synthetic */ void b1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c7eb07", new Object[]{this, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
        f1(602, bundle, null);
        this.g.A(str, str2);
    }

    @Override // com.taobao.trtc.api.a
    public void c(final TrtcDefines.c cVar, final TrtcDefines.TrtcAnswerType trtcAnswerType, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daedd92a", new Object[]{this, cVar, trtcAnswerType, str});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar = this.c;
                if (bVar != null) {
                    bVar.t(cVar, trtcAnswerType, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.flu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.t0(cVar, trtcAnswerType, str);
                }
            });
        }
    }

    public final /* synthetic */ void c1(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47886f36", new Object[]{this, arrayList});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TrtcConstants.TRTC_PARAMS_PEER_LIST, arrayList.toString());
        f1(602, bundle, null);
        this.g.B(arrayList);
    }

    public final /* synthetic */ void d1(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a072c0", new Object[]{this, bVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("audioEnable", bVar.b);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_VIDEO_ENABLE, bVar.c);
        bundle.putBoolean(TrtcConstants.TRTC_PARAMS_DATA_ENABLE, bVar.d);
        bundle.putString("streamId", bVar.f13893a);
        f1(109, bundle, null);
        this.g.C(bVar);
    }

    @Override // com.taobao.trtc.api.a
    public void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99dfd55", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar = this.c;
                if (bVar != null) {
                    bVar.v(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.llu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.B0(str);
                }
            });
        }
    }

    public final /* synthetic */ void e1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554ad61e", new Object[]{this, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_ELAPSED, i);
        f1(200, bundle, null);
        this.g.D(i);
    }

    @Override // com.taobao.trtc.api.a
    public void f(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda22ffa", new Object[]{this, new Boolean(z)});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.z(z);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.cku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.K0(z);
                }
            });
        }
    }

    public final void f1(int i, Bundle bundle, Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d371f29c", new Object[]{this, new Integer(i), bundle, map});
            return;
        }
        StringBuilder sb = new StringBuilder("NotifyEvent >>>> ");
        sb.append(s0(i));
        sb.append(" ### ");
        if (bundle != null) {
            str = bundle.toString();
        } else {
            str = "";
        }
        sb.append(str);
        TrtcLog.j("EventProxy", sb.toString());
        a aVar = this.g;
        if (aVar != null) {
            aVar.h(i, bundle, map);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void g(final TrtcDefines.TrtcErrorEvent trtcErrorEvent, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3875e64a", new Object[]{this, trtcErrorEvent, new Integer(i), str});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.H(trtcErrorEvent, i, str);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.iku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.L0(trtcErrorEvent, i, str);
                }
            });
        }
    }

    public void g1(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4a957a", new Object[]{this, new Boolean(z)});
        } else if (this.g != null) {
            r0(new Runnable() { // from class: tb.tku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.u0(z);
                }
            });
        }
    }

    public void h1(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e74d5e1", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.a aVar = this.d;
                if (aVar != null) {
                    aVar.y(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.zku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.v0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d449a76a", new Object[]{this, str, new Integer(i)});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.i(str, i);
        }
        if (this.g != null) {
            Bundle bundle = new Bundle();
            bundle.putString("userId", str);
            bundle.putInt(TrtcConstants.TRTC_PARAMS_ELAPSED, i);
            f1(107, bundle, null);
            this.g.i(str, i);
        }
    }

    public void i1(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d023d9b", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.a aVar = this.d;
                if (aVar != null) {
                    aVar.c(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.mku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.w0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void j(final String str, final int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a155f2f", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.A(str, i, i2, i3);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.bku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.M0(str, i, i2, i3);
                }
            });
        }
    }

    public void j1(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf89f55f", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.a aVar = this.d;
                if (aVar != null) {
                    aVar.l(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.fku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.x0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void k(final TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0423f27", new Object[]{this, eVar});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.c cVar = this.b;
                if (cVar != null) {
                    cVar.x(eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.yku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.N0(eVar);
                }
            });
        }
    }

    public void k1(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a6119a", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.a aVar = this.d;
                if (aVar != null) {
                    aVar.onAudioRouteChanged(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.nku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.y0(i);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void l(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43c5222", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.J(str, z);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.jlu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.O0(str, z);
                }
            });
        }
    }

    public void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1580a46b", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.a aVar = this.d;
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.wku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.z0();
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void m(final a.C0782a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a357a41", new Object[]{this, aVar});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            aVar.getClass();
            bVar.b(0, null);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.hku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.P0(aVar);
                }
            });
        }
    }

    public void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c28207", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.a aVar = this.d;
                if (aVar != null) {
                    aVar.onBlueToothDeviceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.eku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.A0();
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void n(final ArrayList<TrtcDefines.c> arrayList, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a61b229", new Object[]{this, arrayList, str});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar = this.c;
                if (bVar != null) {
                    bVar.w(arrayList, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.uku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.Q0(arrayList, str);
                }
            });
        }
    }

    public void n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128938f7", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).K();
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.dlu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.C0();
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void o(final TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20a9d0", new Object[]{this, trtcMediaConnectionState});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.C(trtcMediaConnectionState);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.blu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.R0(trtcMediaConnectionState);
                }
            });
        }
    }

    public void o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfd7627", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).L();
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.glu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.D0();
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void p(final TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fee0eb", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.g(trtcNetWorkQuality);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.hlu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.S0(trtcNetWorkQuality);
                }
            });
        }
    }

    public void p0(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cdaea5f", new Object[]{this, arrayList});
        }
    }

    public void p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f322af", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).M();
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.dku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.E0();
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void q(final TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1e4d2", new Object[]{this, lVar});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.f(lVar);
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.qku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.T0(lVar);
                }
            });
        }
    }

    public void q1(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce610b6", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).N(str, str2);
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.vku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.F0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void r(final TrtcDefines.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2eb917f", new Object[]{this, bVar});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar2 = this.c;
                if (bVar2 != null) {
                    bVar2.r(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.oku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.U0(bVar);
                }
            });
        }
    }

    public final void r0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            nf.h(runnable);
        }
    }

    public void r1(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846f9b6b", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).O(str);
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.jku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.G0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void s(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee6972a", new Object[]{this, trtcChannelAction, str, str2, str3});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.c cVar = this.b;
                if (cVar != null) {
                    cVar.E(trtcChannelAction, str, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("action", trtcChannelAction.ordinal());
        bundle.putString("userId", str);
        bundle.putString("channelId", str2);
        bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str3);
        f1(603, bundle, null);
        this.g.s(trtcChannelAction, str, str2, str3);
    }

    public void s1(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226fce65", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).P(str);
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.pku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.H0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void t(final TrtcDefines.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18f8c4b", new Object[]{this, dVar});
        } else {
            r0(new Runnable() { // from class: tb.rku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.V0(dVar);
                }
            });
        }
    }

    public final /* synthetic */ void t0(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c80f968", new Object[]{this, cVar, trtcAnswerType, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("userId", cVar.f13877a);
        bundle.putInt("errorCode", cVar.b);
        bundle.putString("errorMsg", cVar.c);
        f1(503, bundle, null);
        this.g.c(cVar, trtcAnswerType, str);
    }

    public void t1(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).Q(z);
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.gku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.I0(z);
                }
            });
        }
    }

    public final /* synthetic */ void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2bb01e", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_FOCUS, z ? 1 : 0);
        this.g.d(406, bundle);
    }

    public void u1(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c5941", new Object[]{this, str});
            return;
        }
        synchronized (this.f) {
            ITrtcObserver.f fVar = this.e;
            if (fVar != null) {
                ((aju) fVar).R(str);
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.alu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.J0(str);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.a
    public void v(final TrtcDefines.b bVar, final TrtcDefines.TrtcAnswerType trtcAnswerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7316f370", new Object[]{this, bVar, trtcAnswerType});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar2 = this.c;
                if (bVar2 != null) {
                    bVar2.q(bVar, trtcAnswerType);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.kku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.W0(trtcAnswerType, bVar);
                }
            });
        }
    }

    public final /* synthetic */ void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52659d6f", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        f1(400, bundle, null);
        this.g.d(400, bundle);
    }

    public void v1(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e4711c", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.d(str, str2, str3, str4);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void w(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6e88fa", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar = this.c;
                if (bVar != null) {
                    bVar.B(str, str2);
                } else {
                    TrtcLog.j("EventProxy", "onRemoteCancel, callEventObserver is null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.sku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.X0(str, str2);
                }
            });
        }
    }

    public final /* synthetic */ void w0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c610fcb6", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        f1(402, bundle, null);
        this.g.d(402, null);
    }

    public void w1(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d7bba5", new Object[]{this, str, new Integer(i), str2, str3, str4});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.u(str, i, str2, str3, str4);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void x(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89e060d", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.b bVar = this.c;
                if (bVar != null) {
                    bVar.m(str, str2);
                } else {
                    TrtcLog.j("EventProxy", "onRemoteHangup, callEventObserver is null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.lku
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.Y0(str, str2);
                }
            });
        }
    }

    public final /* synthetic */ void x0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7d60a", new Object[]{this, str});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMsg", str);
        f1(401, bundle, null);
        this.g.d(401, bundle);
    }

    public void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89945196", new Object[]{this});
            return;
        }
        ITrtcObserver.e eVar = this.f24819a;
        if (eVar != null) {
            eVar.s();
        }
    }

    @Override // com.taobao.trtc.api.a
    public void y(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54825390", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.c cVar = this.b;
                if (cVar != null) {
                    cVar.D(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.elu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.Z0(str, str2);
                }
            });
        }
    }

    public final /* synthetic */ void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70aa8a1d", new Object[]{this, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TrtcConstants.TRTC_PARAMS_AUDIO_ROUTE, i);
        f1(405, bundle, null);
        this.g.d(405, bundle);
    }

    public void y1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87eb63ea", new Object[]{this, str});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.F(str);
        }
    }

    @Override // com.taobao.trtc.api.a
    public void z(final ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bd2ae", new Object[]{this, arrayList});
            return;
        }
        synchronized (this.f) {
            try {
                ITrtcObserver.c cVar = this.b;
                if (cVar != null) {
                    cVar.h(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g != null) {
            r0(new Runnable() { // from class: tb.ilu
                @Override // java.lang.Runnable
                public final void run() {
                    nlu.this.a1(arrayList);
                }
            });
        }
    }

    public final /* synthetic */ void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f55ece8", new Object[]{this});
            return;
        }
        f1(403, null, null);
        this.g.d(403, null);
    }

    public void z1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a423734f", new Object[]{this, str});
            return;
        }
        ITrtcObserver.b bVar = this.c;
        if (bVar != null) {
            bVar.k(str);
        }
    }

    public void E1(int i, String str) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ff9ce4", new Object[]{this, new Integer(i), str});
            return;
        }
        TrtcLog.j("EventProxy", "onPhoneState, stat: " + i);
        Bundle bundle = new Bundle();
        if (i != 113) {
            i2 = 0;
        }
        bundle.putInt(TrtcConstants.TRTC_PARAMS_PHONE_STATE, i2);
        f1(105, bundle, null);
        if (this.g != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(TrtcConstants.TRTC_PARAMS_PHONE_NUMBER, str);
            this.g.u(i, bundle2);
        }
    }
}
