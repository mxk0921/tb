package tb;

import android.content.Context;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.Request;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionExtraCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v0x implements tbe, SessionCb, SessionExtraCb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = v0x.class.getSimpleName();
    public static final Executor n = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new a());
    public final Context b;
    public final RequestImpl c;
    public z0x d;
    public SpdyAgent e;
    public SessionInfo f;
    public SpdySession g;
    public StringBuilder h;
    public volatile int j;
    public boolean k;
    public int l;
    public final String i = tl1.b();

    /* renamed from: a  reason: collision with root package name */
    public final Queue<ByteBuffer> f29721a = new ArrayDeque();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f29722a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "WebSocketImpl:" + this.f29722a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                v0x v0xVar = v0x.this;
                v0x.b(v0xVar, SpdyAgent.getInstance(v0x.c(v0xVar), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION));
                v0x v0xVar2 = v0x.this;
                String host = v0x.m(v0xVar2).getURI().getHost();
                if (v0x.m(v0x.this).getURI().getPort() == -1) {
                    if (!"https".equals(v0x.m(v0x.this).getURI().getScheme()) && !"wss".equals(v0x.m(v0x.this).getURI().getScheme())) {
                        i = 80;
                    }
                    i = 443;
                } else {
                    i = v0x.m(v0x.this).getURI().getPort();
                }
                v0x.l(v0xVar2, new SessionInfo(host, i, null, null, 0, null, v0x.this, 16));
                v0x.k(v0x.this).setConnectionTimeoutMs(10000);
                v0x v0xVar3 = v0x.this;
                v0x.o(v0xVar3, v0x.a(v0xVar3).createSession(v0x.k(v0x.this)));
                v0x.n(v0x.this).sendCustomControlFrame(-1, -1, -1, v0x.p(v0x.this).length(), v0x.p(v0x.this).toString().getBytes());
            } catch (Exception e) {
                ALog.e(v0x.q(), "connect execute error", null, e, new Object[0]);
                v0x.r(v0x.this, 4);
                v0x.s(v0x.this).a(v0x.this, e, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29724a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public c(boolean z, boolean z2, String str, int i) {
            this.f29724a = z;
            this.b = z2;
            this.c = str;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f29724a) {
                if (!this.b) {
                    fxx fxxVar = new fxx();
                    fxxVar.m(this.c);
                    fxxVar.n(this.d);
                    fxxVar.e();
                    v0x.this.G(fxxVar);
                }
                v0x.s(v0x.this).f(v0x.this, this.d, this.c);
                v0x.t(v0x.this, this.d, this.c);
            } else {
                int i = this.d;
                if (i == -3) {
                    v0x.t(v0x.this, -3, this.c);
                } else if (i == 1002) {
                    v0x.t(v0x.this, i, this.c);
                } else {
                    v0x.t(v0x.this, -1, this.c);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f29725a;

        public d(byte[] bArr) {
            this.f29725a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!v0x.d(v0x.this)) {
                byte[] d = tl1.d(this.f29725a);
                byte[] e = tl1.e(this.f29725a);
                if (e != null) {
                    v0x v0xVar = v0x.this;
                    v0x.e(v0xVar, v0x.f(v0xVar, e));
                    if (v0x.d(v0x.this)) {
                        NetworkResponse networkResponse = new NetworkResponse();
                        networkResponse.setBytedata(e);
                        networkResponse.setStatusCode(v0x.g(v0x.this));
                        v0x.r(v0x.this, 2);
                        v0x.s(v0x.this).c(v0x.this, networkResponse);
                        if (d != null) {
                            v0x.h(v0x.this, ByteBuffer.wrap(d));
                            return;
                        }
                        return;
                    }
                    v0x.this.w(1006, new String(e).concat("\nthe server's shake hands response not correct, can't open websocket session"), false);
                    return;
                }
                v0x.this.w(1006, new String(this.f29725a).concat("\nthe server's shake hands response not correct, can't open websocket session"), false);
            } else {
                v0x.h(v0x.this, ByteBuffer.wrap(this.f29725a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29726a;

        public e(int i) {
            this.f29726a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            v0x.t(v0x.this, this.f29726a, "session failed error");
            NetworkResponse networkResponse = new NetworkResponse();
            SpdyErrorException spdyErrorException = new SpdyErrorException("create session fail with error code: " + this.f29726a, this.f29726a);
            networkResponse.setStatusCode(this.f29726a);
            networkResponse.setError(spdyErrorException);
            v0x.s(v0x.this).a(v0x.this, spdyErrorException, networkResponse);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29727a;

        public f(int i) {
            this.f29727a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                v0x.t(v0x.this, this.f29727a, "session close with call back");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (v0x.i(v0x.this)) {
                while (v0x.i(v0x.this).peek() != null) {
                    try {
                        v0x v0xVar = v0x.this;
                        v0x.j(v0xVar, (ByteBuffer) v0x.i(v0xVar).poll());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        t2o.a(401604625);
        t2o.a(401604613);
    }

    public v0x(Context context, Request request, z0x z0xVar) {
        this.b = context;
        this.d = z0xVar;
        this.c = (RequestImpl) request;
        u();
    }

    public static /* synthetic */ SpdyAgent a(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("f01bf8b7", new Object[]{v0xVar});
        }
        return v0xVar.e;
    }

    public static /* synthetic */ SpdyAgent b(v0x v0xVar, SpdyAgent spdyAgent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("7a9eb6cb", new Object[]{v0xVar, spdyAgent});
        }
        v0xVar.e = spdyAgent;
        return spdyAgent;
    }

    public static /* synthetic */ Context c(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("25024a84", new Object[]{v0xVar});
        }
        return v0xVar.b;
    }

    public static /* synthetic */ boolean d(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1ae6e2", new Object[]{v0xVar})).booleanValue();
        }
        return v0xVar.k;
    }

    public static /* synthetic */ boolean e(v0x v0xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282fdbc", new Object[]{v0xVar, new Boolean(z)})).booleanValue();
        }
        v0xVar.k = z;
        return z;
    }

    public static /* synthetic */ boolean f(v0x v0xVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ff8588", new Object[]{v0xVar, bArr})).booleanValue();
        }
        return v0xVar.v(bArr);
    }

    public static /* synthetic */ int g(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68e5510f", new Object[]{v0xVar})).intValue();
        }
        return v0xVar.l;
    }

    public static /* synthetic */ void h(v0x v0xVar, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b921f6", new Object[]{v0xVar, byteBuffer});
        } else {
            v0xVar.y(byteBuffer);
        }
    }

    public static /* synthetic */ Queue i(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("83f13efa", new Object[]{v0xVar});
        }
        return v0xVar.f29721a;
    }

    public static /* synthetic */ void j(v0x v0xVar, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd82a78", new Object[]{v0xVar, byteBuffer});
        } else {
            v0xVar.E(byteBuffer);
        }
    }

    public static /* synthetic */ SessionInfo k(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("7fe86fa8", new Object[]{v0xVar});
        }
        return v0xVar.f;
    }

    public static /* synthetic */ SessionInfo l(v0x v0xVar, SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("5cf0142d", new Object[]{v0xVar, sessionInfo});
        }
        v0xVar.f = sessionInfo;
        return sessionInfo;
    }

    public static /* synthetic */ RequestImpl m(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestImpl) ipChange.ipc$dispatch("841f3dea", new Object[]{v0xVar});
        }
        return v0xVar.c;
    }

    public static /* synthetic */ SpdySession n(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("e1de440a", new Object[]{v0xVar});
        }
        return v0xVar.g;
    }

    public static /* synthetic */ SpdySession o(v0x v0xVar, SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("d0b0ef2f", new Object[]{v0xVar, spdySession});
        }
        v0xVar.g = spdySession;
        return spdySession;
    }

    public static /* synthetic */ StringBuilder p(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("cb8ab423", new Object[]{v0xVar});
        }
        return v0xVar.h;
    }

    public static /* synthetic */ String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("582c4343", new Object[0]);
        }
        return m;
    }

    public static /* synthetic */ void r(v0x v0xVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45a2d7d", new Object[]{v0xVar, new Integer(i)});
        } else {
            v0xVar.H(i);
        }
    }

    public static /* synthetic */ z0x s(v0x v0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z0x) ipChange.ipc$dispatch("2d933431", new Object[]{v0xVar});
        }
        return v0xVar.d;
    }

    public static /* synthetic */ void t(v0x v0xVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58eb1309", new Object[]{v0xVar, new Integer(i), str});
        } else {
            v0xVar.z(i, str);
        }
    }

    public z0x A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z0x) ipChange.ipc$dispatch("46b6cb18", new Object[]{this});
        }
        return this.d;
    }

    public void B(zyx zyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6fc9e4", new Object[]{this, zyxVar});
        } else {
            G(new f5y((v3y) zyxVar));
        }
    }

    public void C(zyx zyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664f24ea", new Object[]{this, zyxVar});
        } else {
            G(new v3y());
        }
    }

    public final boolean D(Collection<zyx> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("925f1884", new Object[]{this, collection})).booleanValue();
        }
        if (this.j != 2 || collection == null) {
            return false;
        }
        for (zyx zyxVar : collection) {
            try {
                E(ltx.e().c(zyxVar));
            } catch (RuntimeException e2) {
                ALog.e(m, "create frame error", null, e2, new Object[0]);
                return false;
            }
        }
        return true;
    }

    public void F(Collection<zyx> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830be57d", new Object[]{this, collection});
        } else {
            D(collection);
        }
    }

    public void G(zyx zyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c938bb8", new Object[]{this, zyxVar});
        } else {
            F(Collections.singletonList(zyxVar));
        }
    }

    public final void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fc9eac", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void I(z0x z0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c99be9c", new Object[]{this, z0xVar});
        } else {
            this.d = z0xVar;
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
        }
    }

    @Override // tb.tbe
    public boolean close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ba683", new Object[]{this})).booleanValue();
        }
        w(1000, "client call for close…", false);
        return true;
    }

    @Override // tb.tbe
    public int getConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cf11709", new Object[]{this})).intValue();
        }
        return this.j;
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        return new byte[0];
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        return 0;
    }

    @Override // tb.tbe
    public boolean send(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1695341d", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !D(ltx.e().d(str, true))) {
            return false;
        }
        return true;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98e674f", new Object[]{this});
            return;
        }
        this.h = new StringBuilder(128);
        String rawPath = this.c.getURI().getRawPath();
        String rawQuery = this.c.getURI().getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + f7l.CONDITION_IF + rawQuery;
        }
        this.h.append("GET ");
        this.h.append(rawPath);
        this.h.append(" HTTP/1.1\r\n");
        this.h.append("Host: ");
        this.h.append(this.c.getURI().getHost());
        if (this.c.getURI().getPort() != -1) {
            this.h.append(":");
            this.h.append(this.c.getURI().getPort());
        }
        this.h.append("\r\n");
        if (this.c.getHeaders() != null && !this.c.getHeaders().isEmpty()) {
            for (Header header : this.c.getHeaders()) {
                this.h.append(header.getName());
                this.h.append(": ");
                this.h.append(header.getValue());
                this.h.append("\r\n");
            }
        }
        this.h.append("Upgrade: websocket\r\n");
        this.h.append("Connection: Upgrade\r\n");
        this.h.append("Sec-WebSocket-Key: ");
        this.h.append(this.i);
        this.h.append("\r\n");
        this.h.append("Sec-WebSocket-Version: 13\r\n\r\n");
    }

    public void w(int i, String str, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed16366", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        ALog.d(m, str, null, new Object[0]);
        synchronized (this) {
            if (!(this.j == 3 || this.j == 4)) {
                if (this.j == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                H(3);
                ((ThreadPoolExecutor) n).execute(new c(z2, z, str, i));
            }
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (this.j == 4 || this.j == 0) {
                    H(1);
                    ((ThreadPoolExecutor) n).execute(new b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dfd576", new Object[]{this, byteBuffer});
            return;
        }
        try {
            for (zyx zyxVar : ltx.e().k(byteBuffer)) {
                ltx.e().g(this, zyxVar);
            }
        } catch (com.taobao.aws.a.b e2) {
            w(e2.getCloseCode(), e2.getMessage(), false);
        }
    }

    public final void z(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f84701", new Object[]{this, new Integer(i), str});
        } else if (this.j != 4) {
            this.k = false;
            synchronized (this.f29721a) {
                ((ArrayDeque) this.f29721a).clear();
            }
            SpdySession spdySession = this.g;
            if (spdySession != null) {
                spdySession.closeSession();
                this.g = null;
            }
            if (this.e != null) {
                this.e = null;
            }
            ltx.e().l();
            H(4);
            this.d.d(this, i, str);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            return;
        }
        ALog.d(m, "session recv", null, new Object[0]);
        ((ThreadPoolExecutor) n).execute(new d(bArr));
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        ALog.d(m, "session close with call back", null, new Object[0]);
        ((ThreadPoolExecutor) n).execute(new f(i));
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
        } else {
            ALog.d(m, "session connect", null, new Object[0]);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        ALog.d(m, "session failed error", null, new Object[0]);
        ((ThreadPoolExecutor) n).execute(new e(i));
    }

    @Override // org.android.spdy.SessionExtraCb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        ALog.d(m, "session on writable", null, new Object[0]);
        ((ThreadPoolExecutor) n).execute(new g());
    }

    public final void E(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b58a405", new Object[]{this, byteBuffer});
        } else if (this.j == 2) {
            try {
                SpdySession spdySession = this.g;
                if (spdySession != null && spdySession.sendCustomControlFrame(-1, -1, -1, byteBuffer.limit(), byteBuffer.array()) == -3848) {
                    synchronized (this.f29721a) {
                        ((ArrayDeque) this.f29721a).add(byteBuffer);
                    }
                }
            } catch (Exception e2) {
                ALog.e(m, "send frame from queue error", null, e2, new Object[0]);
            }
        }
    }

    public final boolean v(byte[] bArr) {
        String[] split;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d88e9e59", new Object[]{this, bArr})).booleanValue();
        }
        String str = new String(bArr, Charset.forName("utf-8"));
        this.l = 0;
        if (str.startsWith("HTTP/1.") && (indexOf = str.indexOf(32)) > 0) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 < 0) {
                indexOf2 = str.length();
            }
            try {
                this.l = Integer.parseInt(str.substring(i, indexOf2));
            } catch (NumberFormatException unused) {
                this.l = -1;
            }
        }
        if (this.l == 101) {
            try {
                String str2 = "";
                String str3 = str2;
                String str4 = str3;
                for (String str5 : str.split("\r\n")) {
                    if (str5.startsWith("Upgrade: ")) {
                        str2 = str5.replace("Upgrade: ", "").toLowerCase();
                    } else if (str5.startsWith("Connection: ")) {
                        str3 = str5.replace("Connection: ", "").toLowerCase();
                    } else if (str5.startsWith("Sec-WebSocket-Accept: ")) {
                        str4 = str5.replace("Sec-WebSocket-Accept: ", "");
                    }
                }
                if (str2.equals("websocket") && str3.equals("upgrade") && str4.equals(tl1.a(this.i))) {
                    return true;
                }
            } catch (Exception e2) {
                ALog.e(m, "parse response error", null, e2, new Object[0]);
            }
        }
        return false;
    }
}
