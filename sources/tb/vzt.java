package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean NeedMiniWua = false;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f30373a = new Object();
    public static final Object b = new Object();
    public static int c = -1;
    public static int d = 0;
    public static SpdySession e = null;
    public static ByteArrayOutputStream f = null;
    public static long g = 0;
    public static long h = 0;
    public static byte[] i = null;
    public static boolean j = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements AccsSSLCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // org.android.spdy.AccsSSLCallback
        public byte[] getSSLPublicKey(int i, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
            }
            return tzt.c().g(16, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements SessionCb, SessionExtraCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f30374a;
        public final String b;

        static {
            t2o.a(962592952);
        }

        public b(String str) {
            this.b = "accs_ssl_key2_" + str;
        }

        public final int a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("42b664a5", new Object[]{this, bArr})).intValue();
            }
            if (bArr == null || tzt.c().e(this.b, bArr) == 0) {
                return -1;
            }
            return 0;
        }

        @Override // org.android.spdy.SessionCb
        public void bioPingRecvCallback(SpdySession spdySession, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
            }
        }

        @Override // org.android.spdy.SessionCb
        public byte[] getSSLMeta(SpdySession spdySession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
            }
            if (!tzt.c().b()) {
                return this.f30374a;
            }
            byte[] a2 = tzt.c().a(this.b);
            if (a2 != null) {
                return a2;
            }
            return new byte[0];
        }

        @Override // org.android.spdy.SessionCb
        public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
            }
            if (tzt.c().b()) {
                return a(bArr);
            }
            this.f30374a = bArr;
            return 0;
        }

        @Override // org.android.spdy.SessionCb
        public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            } else if (spdySession == vzt.a()) {
                if (vzt.d() == null) {
                    vzt.e(new ByteArrayOutputStream(1024));
                    vzt.g(vzt.h(bArr));
                }
                if (vzt.f() != -1) {
                    try {
                        vzt.d().write(bArr);
                    } catch (IOException unused) {
                    }
                    vzt.j(bArr.length);
                    if (vzt.f() == vzt.i() - 8) {
                        try {
                            vzt.d().flush();
                        } catch (IOException unused2) {
                        }
                        byte[] byteArray = vzt.d().toByteArray();
                        try {
                            vzt.d().close();
                        } catch (IOException unused3) {
                        }
                        vzt.l(oe2.n(byteArray));
                        if (vzt.k() != 0) {
                            vzt.m();
                        }
                        vzt.n();
                        return;
                    }
                    return;
                }
                vzt.l(-1);
                vzt.m();
                vzt.n();
            } else {
                nhh.v("TnetUtil", "[spdyCustomControlFrameRecvCallback] session != spdySessionUT");
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            } else if (spdySession == vzt.a()) {
                vzt.l(i);
                if (bbq.b()) {
                    synchronized (vzt.o()) {
                        vzt.b(null);
                    }
                    return;
                }
                vzt.m();
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            } else if (spdySession == vzt.a()) {
                vzt.c(spdySession);
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            } else if (spdySession == vzt.a()) {
                vzt.l(i);
                vzt.m();
            }
        }

        @Override // org.android.spdy.SessionExtraCb
        public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            } else if (spdySession == vzt.a()) {
                vzt.c(spdySession);
            }
        }
    }

    static {
        t2o.a(962592950);
    }

    public static /* synthetic */ SpdySession a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("fe4ede3c", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ SpdySession b(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("665cbe1d", new Object[]{spdySession});
        }
        e = spdySession;
        return spdySession;
    }

    public static /* synthetic */ void c(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136e1ff5", new Object[]{spdySession});
        } else {
            u(spdySession);
        }
    }

    public static /* synthetic */ ByteArrayOutputStream d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("b83ddcf4", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ ByteArrayOutputStream e(ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("7a6f8aeb", new Object[]{byteArrayOutputStream});
        }
        f = byteArrayOutputStream;
        return byteArrayOutputStream;
    }

    public static /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92e", new Object[0])).longValue();
        }
        return h;
    }

    public static /* synthetic */ long g(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f895fc", new Object[]{new Long(j2)})).longValue();
        }
        h = j2;
        return j2;
    }

    public static /* synthetic */ long h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("309a3676", new Object[]{bArr})).longValue();
        }
        return r(bArr);
    }

    public static /* synthetic */ long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552fb0", new Object[0])).longValue();
        }
        return g;
    }

    public static /* synthetic */ long j(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("210adc39", new Object[]{new Long(j2)})).longValue();
        }
        long j3 = g + j2;
        g = j3;
        return j3;
    }

    public static /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa3b6af0", new Object[0])).intValue();
        }
        return c;
    }

    public static /* synthetic */ int l(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c18d7", new Object[]{new Integer(i2)})).intValue();
        }
        c = i2;
        return i2;
    }

    public static /* synthetic */ void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f21a63e", new Object[0]);
        } else {
            p();
        }
    }

    public static /* synthetic */ void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6407e17f", new Object[0]);
        } else {
            t();
        }
    }

    public static /* synthetic */ Object o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("596e1272", new Object[0]);
        }
        return b;
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a316ab05", new Object[0]);
            return;
        }
        nhh.d();
        synchronized (b) {
            try {
                SpdySession spdySession = e;
                if (spdySession != null) {
                    spdySession.closeSession();
                }
                e = null;
                oe2.a();
                kqx.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        t();
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52474410", new Object[0]);
            return;
        }
        nhh.d();
        synchronized (b) {
            try {
                SpdySession spdySession = e;
                if (spdySession != null) {
                    spdySession.closeSession();
                }
                j = true;
                e = null;
                oe2.a();
                kqx.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        t();
    }

    public static long r(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e322dde", new Object[]{bArr})).longValue();
        }
        if (bArr == null || bArr.length < 12) {
            return -1L;
        }
        return kp2.b(bArr, 1, 3);
    }

    public static void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce666ac0", new Object[0]);
            return;
        }
        synchronized (b) {
            try {
                if (e == null) {
                    kqx.b();
                    oe2.m();
                    j = true;
                } else {
                    j = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9650331d", new Object[0]);
            return;
        }
        Object obj = f30373a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public static void u(SpdySession spdySession) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba9f90d", new Object[]{spdySession});
            return;
        }
        synchronized (b) {
            while (true) {
                try {
                    SpdySession spdySession2 = e;
                    if (spdySession == spdySession2 && spdySession2 != null && (bArr = i) != null) {
                        int length = bArr.length;
                        int i2 = d;
                        if (length <= i2) {
                            break;
                        }
                        try {
                            if (bArr.length - i2 > 131072) {
                                spdySession.sendCustomControlFrame(-1, -1, -1, 131072, kp2.g(bArr, i2, 131072));
                                d += 131072;
                            } else {
                                int length2 = bArr.length - i2;
                                if (length2 > 0) {
                                    spdySession.sendCustomControlFrame(-1, -1, -1, length2, kp2.g(bArr, i2, length2));
                                    d += length2;
                                }
                            }
                        } catch (SpdyErrorException e2) {
                            nhh.i("TnetUtil", "SpdyErrorException", e2);
                            if (e2.SpdyErrorGetCode() != -3848) {
                                c = e2.SpdyErrorGetCode();
                                p();
                            }
                            return;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c8412", new Object[0])).booleanValue();
        }
        if (e != null || (!j && !o2w.k().G())) {
            return false;
        }
        return true;
    }

    public static qe2 v(byte[] bArr) {
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qe2) ipChange.ipc$dispatch("299aa660", new Object[]{bArr});
        }
        nhh.d();
        qe2 qe2Var = new qe2();
        synchronized (b) {
            try {
                i = bArr;
                d = 0;
                if (bArr == null) {
                    qe2Var.d = 0L;
                } else {
                    qe2Var.d = bArr.length;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (f30373a) {
            ByteArrayOutputStream byteArrayOutputStream = f;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
            f = null;
            g = 0L;
            h = 0L;
            long currentTimeMillis2 = System.currentTimeMillis();
            c = -1;
            try {
                if (w()) {
                    SpdyAgent instance = SpdyAgent.getInstance(o2w.k().g(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                    if (tzt.c().b()) {
                        instance.setAccsSslCallback(new a());
                    }
                    ozt f2 = qzt.b().f();
                    String a2 = f2.a();
                    int b2 = f2.b();
                    nhh.f("TnetUtil", "host", a2, "port", Integer.valueOf(b2));
                    SessionInfo sessionInfo = new SessionInfo(a2, b2, null, null, 0, null, new b(a2), SpdyProtocol.SSSL_0RTT_CUSTOM);
                    if (tzt.c().b()) {
                        sessionInfo.setPubKeySeqNum(8);
                    } else {
                        sessionInfo.setPubKeySeqNum(9);
                    }
                    sessionInfo.setConnectionTimeoutMs(10000);
                    synchronized (b) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        e = instance.createSession(sessionInfo);
                        qe2Var.b = System.currentTimeMillis() - currentTimeMillis3;
                    }
                    nhh.f("TnetUtil", "createSession");
                    f30373a.wait(60000L);
                } else if (e == null || (j && !o2w.k().G())) {
                    p();
                } else {
                    u(e);
                    f30373a.wait(60000L);
                }
            } catch (Exception e2) {
                p();
                nhh.i("TnetUtil", "CreateSession Exception", e2);
            }
            currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
            if (currentTimeMillis >= 60000) {
                p();
                nhh.v("TnetUtil", "WAIT_TIMEOUT");
            }
        }
        oe2.o(d);
        synchronized (b) {
            i = null;
            d = 0;
        }
        qe2Var.f26695a = c;
        qe2Var.c = currentTimeMillis;
        qe2Var.e = oe2.f25326a;
        oe2.f25326a = null;
        nhh.f("TnetUtil", "PostData isSuccess", Boolean.valueOf(qe2Var.a()), "errCode", Integer.valueOf(qe2Var.f26695a), "rt", Long.valueOf(qe2Var.c));
        return qe2Var;
    }
}
