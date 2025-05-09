package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionExtraCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyProtocol;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kyx implements SessionCb, SessionExtraCb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.uploader.implement.a f23009a;
    public SpdyAgent b;
    public SpdySession c;
    public final Context d;
    public final s7y e;
    public volatile c f;
    public volatile String g = "DISCONNECTED";
    public final List<d> h = new LinkedList();
    public final int i = hashCode();
    public final c5y j = new c5y();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements AccsSSLCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // org.android.spdy.AccsSSLCallback
        public byte[] getSSLPublicKey(int i, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
            }
            try {
                return kyx.g(kyx.this).b.decrypt(kyx.a(kyx.this), SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
            } catch (Exception e) {
                if (!rtx.d(16)) {
                    return null;
                }
                rtx.b(16, "CustomizedSession", "call config.decrypt error.", e);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f23011a;

        public b(d dVar) {
            this.f23011a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kyx kyxVar = kyx.this;
            d dVar = this.f23011a;
            kyxVar.d(dVar.c, dVar.f23012a, dVar.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();

        void a(int i);

        void a(int i, int i2);

        void a(byte[] bArr, int i);

        void b(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f23012a;
        public final int b;
        public final int c;

        public d(byte[] bArr, int i, int i2) {
            this.f23012a = bArr;
            this.b = i;
            this.c = i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append(hashCode());
            sb.append(" WaitingData{ length=");
            sb.append(this.b);
            sb.append(", sendSequence=");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }
    }

    public kyx(com.uploader.implement.a aVar, s7y s7yVar) {
        this.f23009a = aVar;
        this.d = aVar.c;
        this.e = s7yVar;
    }

    public static /* synthetic */ Context a(kyx kyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3ab0e4e6", new Object[]{kyxVar});
        }
        return kyxVar.d;
    }

    public static /* synthetic */ com.uploader.implement.a g(kyx kyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.uploader.implement.a) ipChange.ipc$dispatch("60c430b1", new Object[]{kyxVar});
        }
        return kyxVar.f23009a;
    }

    public void b() {
        int i;
        int i2;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (i()) {
            try {
                this.g = "CONNECTING";
                if (this.e.b()) {
                    i = 20;
                } else {
                    if (this.e.f) {
                        i2 = SpdyProtocol.SSSL_0RTT_CUSTOM;
                    } else {
                        i2 = 16;
                    }
                    i = i2;
                }
                c5y c5yVar = this.j;
                s7y s7yVar = this.e;
                String str = s7yVar.f30918a;
                c5yVar.f16884a = str;
                int i3 = s7yVar.b;
                c5yVar.b = i3;
                c5yVar.c = s7yVar.g;
                SessionInfo sessionInfo = new SessionInfo(str, i3, Integer.toString(this.i), null, 0, null, this, i);
                sessionInfo.setConnectionTimeoutMs(10000);
                if (this.e.b() && cwx.p()) {
                    sessionInfo.setXquicLossDetect(true);
                }
                if (this.e.b()) {
                    sessionInfo.setCertHost("arup-gateway.m.taobao.com");
                    int o = cwx.o();
                    if (o < 0) {
                        sessionInfo.setXquicCongControl(2);
                    } else {
                        sessionInfo.setXquicCongControl(o);
                    }
                } else if (this.e.f) {
                    if (2 == this.f23009a.b.a().f31379a) {
                        sessionInfo.setPubKeySeqNum(0);
                    } else {
                        sessionInfo.setPubKeySeqNum(6);
                    }
                }
                if (this.b == null) {
                    j();
                }
                this.c = this.b.createSession(sessionInfo);
                if (rtx.d(4)) {
                    rtx.a(4, "CustomizedSession", this.i + " CustomizedSession createSession,mSession:" + this.c.hashCode() + " getRefCount:" + this.c.getRefCount());
                }
            } catch (SpdyErrorException e) {
                this.g = "CONNECTFAILED";
                if (rtx.d(16)) {
                    rtx.b(16, "CustomizedSession", this.i + "CustomizedSession connect failed", e);
                }
                c(e.SpdyErrorGetCode());
            }
        } else if (rtx.d(8)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(" CustomizedSession already connected,mSession:");
            SpdySession spdySession = this.c;
            if (spdySession != null) {
                obj = Integer.valueOf(spdySession.hashCode());
            } else {
                obj = "";
            }
            sb.append(obj);
            rtx.a(8, "CustomizedSession", sb.toString());
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
        }
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.h) {
            ((LinkedList) this.h).clear();
        }
        if (rtx.d(8)) {
            rtx.a(8, "CustomizedSession", this.i + " CustomizedSession onClose, error:" + i);
        }
        if (this.f != null) {
            this.f.a(i);
        }
    }

    public void d(int i, byte[] bArr, int i2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1099a1", new Object[]{this, new Integer(i), bArr, new Integer(i2)});
            return;
        }
        try {
            if (!i()) {
                this.c.sendCustomControlFrame(i, -1, -1, i2, bArr);
                if (rtx.d(4)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(this.i);
                    sb.append(" send sendCustomControlFrame. sequence=");
                    sb.append(i);
                    sb.append(", length=");
                    sb.append(i2);
                    sb.append(", mSession:");
                    sb.append(this.c.hashCode());
                    rtx.a(4, "CustomizedSession", sb.toString());
                }
                if (this.f != null) {
                    this.f.b(i);
                }
            } else if (rtx.d(16)) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(this.i);
                sb2.append(" send failed, needConnect and return, sequence:");
                sb2.append(i);
                sb2.append(", length=");
                sb2.append(i2);
                sb2.append(", mSession:");
                SpdySession spdySession = this.c;
                if (spdySession != null) {
                    obj = Integer.valueOf(spdySession.hashCode());
                } else {
                    obj = "";
                }
                sb2.append(obj);
                rtx.a(16, "CustomizedSession", sb2.toString());
            }
        } catch (SpdyErrorException e) {
            int SpdyErrorGetCode = e.SpdyErrorGetCode();
            if (-3848 == SpdyErrorGetCode) {
                f(new d(bArr, i2, i));
                return;
            }
            if (rtx.d(16)) {
                rtx.b(16, "CustomizedSession", this.i + " send sendCustomControlFrame failed", e);
            }
            if (this.f != null) {
                this.f.a(i, SpdyErrorGetCode);
            }
        }
    }

    public void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f2a491", new Object[]{this, cVar});
        } else {
            this.f = cVar;
        }
    }

    public final void f(d dVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f318f0", new Object[]{this, dVar});
            return;
        }
        synchronized (this.h) {
            try {
                ((LinkedList) this.h).add(dVar);
                if (rtx.d(8)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(this.i);
                    sb.append(" [addWaitingData] ");
                    sb.append(dVar);
                    sb.append(", mSession:");
                    SpdySession spdySession = this.c;
                    if (spdySession != null) {
                        obj = Integer.valueOf(spdySession.hashCode());
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    rtx.a(8, "CustomizedSession", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        try {
            return this.f23009a.b.getSslTicket(this.d, "ARUP_SSL_TICKET_KEY");
        } catch (Exception e) {
            if (!rtx.d(16)) {
                return null;
            }
            rtx.b(16, "CustomizedSession", "CustomizedSession call config.getSslTicket error.", e);
            return null;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SpdySession spdySession = this.c;
        if (spdySession != null) {
            spdySession.closeSession();
            if (rtx.d(4)) {
                rtx.a(4, "CustomizedSession", this.i + " CustomizedSession closeSession,session:" + this.c.hashCode());
            }
        }
        this.g = "DISCONNECTED";
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        String str = this.g;
        if ("CONNECTED".equals(str) || "CONNECTING".equals(str)) {
            return false;
        }
        return true;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            SpdyAgent.enableDebug = false;
            this.b = SpdyAgent.getInstance(this.d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (this.e.b()) {
                this.b.InitializeSecurityStuff();
            }
            s7y s7yVar = this.e;
            if (s7yVar.f && !s7yVar.b()) {
                this.b.setAccsSslCallback(new a());
            }
            if (rtx.d(4)) {
                rtx.a(4, "CustomizedSession", this.i + " initSpdyAgent");
            }
        } catch (Exception e) {
            if (rtx.d(16)) {
                rtx.b(16, "CustomizedSession", this.i + " init SpdyAgent failed.", e);
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.h) {
            try {
                if (!this.h.isEmpty()) {
                    d dVar = (d) ((LinkedList) this.h).remove(0);
                    if (dVar != null) {
                        ewx.a(new b(dVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        try {
            return this.f23009a.b.putSslTicket(this.d, "ARUP_SSL_TICKET_KEY", bArr);
        } catch (Exception e) {
            if (!rtx.d(16)) {
                return -1;
            }
            rtx.b(16, "CustomizedSession", "CustomizedSession call config.putSslTicket error.", e);
            return -1;
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
        } else if (rtx.d(4)) {
            rtx.a(4, "CustomizedSession", this.i + " CustomizedSession spdyCustomControlFrameFailCallback, session:" + spdySession.hashCode() + ", id:" + i + ", error:" + i2);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
        } else if (this.f != null) {
            this.f.a(bArr, i4);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
                spdySession.clearAllStreamCb();
            } catch (Throwable unused) {
            }
        }
        this.g = "DISCONNECTED";
        if (rtx.d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(" CustomizedSession spdySessionCloseCallback,session:");
            if (spdySession != null) {
                obj2 = Integer.valueOf(spdySession.hashCode());
            } else {
                obj2 = "";
            }
            sb.append(obj2);
            sb.append(", error:");
            sb.append(i);
            sb.append(", sessionInfo:");
            sb.append(spdySession.getConnectInfoOnDisConnected());
            rtx.a(2, "CustomizedSession", sb.toString());
        }
        c(i);
        c5y c5yVar = this.j;
        if (c5yVar.e == 0) {
            c5yVar.e = i;
        }
        if (superviseConnectInfo != null) {
            c5yVar.k = superviseConnectInfo.reused_counter;
            c5yVar.j = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.e.b()) {
                    c5y c5yVar2 = this.j;
                    c5yVar2.i = superviseConnectInfo.xqc0RttStatus;
                    c5yVar2.m = superviseConnectInfo.retransmissionRate;
                    c5yVar2.n = superviseConnectInfo.lossRate;
                    c5yVar2.o = superviseConnectInfo.tlpCount;
                    c5yVar2.p = superviseConnectInfo.rtoCount;
                    c5yVar2.q = superviseConnectInfo.srtt;
                    c5yVar2.l = superviseConnectInfo.sendCount;
                }
            } catch (Exception unused2) {
            }
        }
        this.j.b();
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        this.g = "CONNECTED";
        if (rtx.d(4)) {
            rtx.a(4, "CustomizedSession", this.i + " CustomizedSession spdySessionConnectCB,session:" + spdySession.hashCode() + ", sessionInfo:" + spdySession.getConnectInfoOnConnected());
        }
        if (this.f != null) {
            this.f.a();
        }
        this.j.d = 1;
        if (this.e.b() && superviseConnectInfo != null) {
            c5y c5yVar = this.j;
            c5yVar.f = superviseConnectInfo.scid;
            c5yVar.g = superviseConnectInfo.dcid;
            c5yVar.h = superviseConnectInfo.congControlKind;
        }
        k();
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        if (spdySession != null) {
            spdySession.cleanUp();
        }
        this.g = "CONNECTFAILED";
        c5y c5yVar = this.j;
        c5yVar.d = 0;
        c5yVar.e = i;
        c5yVar.b();
        if (rtx.d(4)) {
            rtx.a(4, "CustomizedSession", this.i + " CustomizedSession spdySessionFailedError,session:" + spdySession + ", error:" + i);
        }
        c(i);
    }

    @Override // org.android.spdy.SessionExtraCb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        if (rtx.d(8)) {
            rtx.a(8, "CustomizedSession", this.i + " CustomizedSession spdySessionOnWritable session:" + spdySession.hashCode() + ",size:" + i);
        }
        k();
    }
}
