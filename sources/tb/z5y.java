package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z5y extends xtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HttpURLConnection d = null;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g6y f32558a;
        public final /* synthetic */ int b;

        public a(g6y g6yVar, int i) {
            this.f32558a = g6yVar;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lxx e = z5y.this.e();
            try {
                z5y.h(z5y.this);
                Map<String, String> map = this.f32558a.f19764a;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        z5y.this.d.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (rtx.d(4)) {
                    rtx.a(4, "ShortLivedConnection", z5y.this.c + " URL:" + z5y.this.d.getURL().toString() + " RequestHeaders:" + z5y.this.d.getRequestProperties());
                }
                try {
                    z5y.this.d.connect();
                    if (e != null) {
                        e.c(z5y.this, this.b);
                    }
                    if (this.f32558a.b != null) {
                        boolean z = null;
                        try {
                            try {
                                z = z5y.this.d.getOutputStream();
                                g6y g6yVar = this.f32558a;
                                z.write(g6yVar.b, g6yVar.c, g6yVar.d);
                                z = rtx.d(4);
                                if (z) {
                                    rtx.a(4, "ShortLivedConnection", z5y.this.c + " BODY:" + new String(this.f32558a.b));
                                }
                            } catch (Exception e2) {
                                if (rtx.d(16)) {
                                    rtx.b(16, "ShortLivedConnection", z5y.this.c + " send data error.", e2);
                                }
                                z5y.this.d.disconnect();
                                ytx ytxVar = new ytx("100", "5", "send data error", true);
                                if (e != null) {
                                    e.a(z5y.this, ytxVar);
                                }
                                if (z != null) {
                                    try {
                                        z.close();
                                        return;
                                    } catch (IOException e3) {
                                        if (rtx.d(8)) {
                                            rtx.a(8, "ShortLivedConnection", e3.toString());
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } finally {
                            if (z != null) {
                                try {
                                    z.close();
                                } catch (IOException e4) {
                                    if (rtx.d(8)) {
                                        rtx.a(8, "ShortLivedConnection", e4.toString());
                                    }
                                }
                            }
                        }
                    }
                    if (e != null) {
                        e.d(z5y.this, this.b);
                    }
                    z5y z5yVar = z5y.this;
                    z5y.i(z5yVar, z5yVar.d, e);
                } catch (Exception e5) {
                    if (rtx.d(16)) {
                        rtx.b(16, "ShortLivedConnection", "connect error.", e5);
                    }
                    ytx ytxVar2 = new ytx("100", "4", "connect error", true);
                    if (e != null) {
                        e.a(z5y.this, ytxVar2);
                    }
                }
            } catch (Exception e6) {
                if (rtx.d(16)) {
                    rtx.b(16, "ShortLivedConnection", z5y.this.c + " open connection error, ", e6);
                }
                ytx ytxVar3 = new ytx("100", "3", "open connection error", true);
                if (e != null) {
                    e.a(z5y.this, ytxVar3);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements HostnameVerifier {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32559a;

        public b(z5y z5yVar, String str) {
            this.f32559a = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("563b2905", new Object[]{this, str, sSLSession})).booleanValue();
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f32559a, sSLSession);
        }
    }

    public z5y(com.uploader.implement.a aVar, w8y w8yVar) {
        super(aVar, w8yVar);
        this.e = w8yVar.f.startsWith(h1p.HTTPS_PREFIX);
    }

    public static /* synthetic */ void h(z5y z5yVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18db4d0b", new Object[]{z5yVar});
        } else {
            z5yVar.k();
        }
    }

    public static /* synthetic */ void i(z5y z5yVar, HttpURLConnection httpURLConnection, lxx lxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbf702d", new Object[]{z5yVar, httpURLConnection, lxxVar});
        } else {
            z5yVar.g(httpURLConnection, lxxVar);
        }
    }

    public static /* synthetic */ Object ipc$super(z5y z5yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/b/a/f");
    }

    @Override // tb.j5y
    public void a(g6y g6yVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432943c6", new Object[]{this, g6yVar, new Integer(i)});
        } else {
            ewx.a(new a(g6yVar, i));
        }
    }

    @Override // tb.j5y
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.j5y
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.j5y
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void f(HttpURLConnection httpURLConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a35969b", new Object[]{this, httpURLConnection, str});
        } else {
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new b(this, str));
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            this.d.disconnect();
        } catch (Exception unused) {
        }
    }

    public final void k() throws Exception {
        Proxy proxy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.d == null) {
            w8y w8yVar = (w8y) this.f31605a;
            URL url = new URL(w8yVar.f);
            if (this.e) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                this.d = httpURLConnection;
                f(httpURLConnection, w8yVar.g);
            } else {
                if (TextUtils.isEmpty(w8yVar.c) || w8yVar.d <= 0) {
                    proxy = null;
                } else {
                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(w8yVar.c, w8yVar.d));
                }
                if (proxy != null) {
                    this.d = (HttpURLConnection) url.openConnection(proxy);
                } else {
                    this.d = (HttpURLConnection) url.openConnection();
                }
            }
            this.d.setConnectTimeout(10000);
            this.d.setConnectTimeout(10000);
            this.d.setRequestMethod("POST");
            this.d.setDoOutput(true);
            this.d.setDoInput(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.net.HttpURLConnection r18, tb.lxx r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z5y.g(java.net.HttpURLConnection, tb.lxx):void");
    }
}
