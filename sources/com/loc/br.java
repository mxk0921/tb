package com.loc;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.loc.bo;
import com.loc.bt;
import com.loc.m;
import com.taobao.trtc.api.TrtcConstants;
import java.lang.ref.SoftReference;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import org.apache.http.conn.ConnectTimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class br {
    private static SoftReference<SSLContext> k;
    private static SoftReference<bs> t;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5603a;
    private SSLContext b;
    private Proxy c;
    private String g;
    private bo.a h;
    private d i;
    private boolean l;
    private String m;
    private String n;
    private volatile boolean d = false;
    private long e = -1;
    private long f = 0;
    private String j = "";
    private boolean o = false;
    private boolean p = false;
    private String q = "";
    private String r = "";
    private String s = "";
    private f u = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Cloneable, Comparable {

        /* renamed from: a  reason: collision with root package name */
        public int f5604a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public long i;
        public volatile AtomicInteger j = new AtomicInteger(1);

        public a(c cVar) {
            this.b = cVar.c;
            this.c = cVar.e;
            this.e = cVar.d;
            this.f = cVar.m;
            this.g = cVar.n;
            this.h = cVar.b.a();
            this.d = cVar.f5606a;
            this.i = cVar.f;
            if (this.f == 10) {
                this.f5604a = 0;
            }
        }

        /* renamed from: a */
        public final a clone() {
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public final String b() {
            StringBuilder sb;
            StringBuilder sb2;
            StringBuilder sb3;
            StringBuilder sb4;
            try {
                String str = this.f + "#";
                if (!TextUtils.isEmpty(this.e)) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.e);
                    sb.append("#");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("-#");
                }
                String str2 = (sb.toString() + this.h + "#") + this.j + "#";
                if (!TextUtils.isEmpty(this.b)) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(this.b);
                    sb2.append("#");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append("-#");
                }
                String sb5 = sb2.toString();
                if (this.f == 1) {
                    sb3 = new StringBuilder();
                    sb3.append(sb5);
                    sb3.append(this.d);
                    sb3.append("#");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(sb5);
                    sb3.append("-#");
                }
                String sb6 = sb3.toString();
                if (this.f == 1) {
                    sb4 = new StringBuilder();
                    sb4.append(sb6);
                    sb4.append(this.i);
                    sb4.append("#");
                } else {
                    sb4 = new StringBuilder();
                    sb4.append(sb6);
                    sb4.append("-#");
                }
                String b = p.b(bk.a(((sb4.toString() + this.c + "#") + this.g).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                br.a();
                return b;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f5604a - ((a) obj).f5604a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public HttpURLConnection f5605a;
        public int b = this.b;
        public int b = this.b;

        public b(HttpURLConnection httpURLConnection) {
            this.f5605a = httpURLConnection;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        public String f5606a = "";
        public bt.b b = bt.b.FIRST_NONDEGRADE;
        public String c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;
        public String k = "-";
        public String l = "-";
        public int m = 0;
        public int n = 0;

        /* renamed from: a */
        public final c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public final String b() {
            String str;
            String str2;
            if (!TextUtils.isEmpty(this.c)) {
                str = this.c + "#";
            } else {
                str = "-#";
            }
            if (!TextUtils.isEmpty(this.d)) {
                str2 = str + this.d + "#";
            } else {
                str2 = str + "-#";
            }
            String b = p.b(bk.a(((((str2 + this.b.a() + "#") + this.h + "#") + this.j + "#") + this.f).getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
            br.a();
            return b;
        }

        public final String toString() {
            return "RequestInfo{csid='" + this.f5606a + "', degradeType=" + this.b + ", serverIp='" + this.c + "', path='" + this.d + "', hostname='" + this.e + "', totalTime=" + this.f + ", DNSTime=" + this.g + ", connectionTime=" + this.h + ", writeTime=" + this.i + ", readTime=" + this.j + ", serverTime='" + this.k + "', datasize='" + this.l + "', errorcode=" + this.m + ", errorcodeSub=" + this.n + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private Vector<e> f5607a;
        private volatile e b;

        private d() {
            this.f5607a = new Vector<>();
            this.b = new e((byte) 0);
        }

        public final e a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.b;
            }
            for (int i = 0; i < this.f5607a.size(); i++) {
                e eVar = this.f5607a.get(i);
                if (eVar != null && eVar.a().equals(str)) {
                    return eVar;
                }
            }
            e eVar2 = new e((byte) 0);
            eVar2.b(str);
            this.f5607a.add(eVar2);
            return eVar2;
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        private String f5608a;
        private String b;

        private e() {
        }

        public final String a() {
            return this.b;
        }

        public final void b(String str) {
            this.b = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (!TextUtils.isEmpty(this.f5608a)) {
                return this.f5608a.equals(str);
            }
            if (!TextUtils.isEmpty(this.b)) {
                return defaultHostnameVerifier.verify(this.b, sSLSession);
            }
            return defaultHostnameVerifier.verify(str, sSLSession);
        }

        public /* synthetic */ e(byte b) {
            this();
        }

        public final void a(String str) {
            String[] split;
            if (TextUtils.isEmpty(this.f5608a) || !str.contains(":") || (split = str.split(":")) == null || split.length <= 0) {
                this.f5608a = str;
            } else {
                this.f5608a = split[0];
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        long f5609a = 0;
        long b = 0;
        c c = new c();
        a d;
        c e;
        String f;
        URL g;

        public f() {
        }

        public final void a() {
            this.c.h = SystemClock.elapsedRealtime() - this.b;
        }

        public final void b() {
            this.c.i = SystemClock.elapsedRealtime() - this.b;
        }

        public final void c() {
            this.c.j = SystemClock.elapsedRealtime() - this.b;
        }

        public final void d() {
            c a2 = this.c.clone();
            if (this.c.f > m.e) {
                a2.m = 1;
            }
            m.a(a2);
        }

        public final void a(int i) {
            "----errorcode-----".concat(String.valueOf(i));
            br.a();
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.f5609a;
                c cVar = this.c;
                cVar.m = i;
                if (cVar.b.e()) {
                    m.a(false, this.c.e);
                }
                boolean a2 = br.this.a(this.c.e);
                if (a2) {
                    if (br.this.p && !TextUtils.isEmpty(br.this.n) && this.c.b.b()) {
                        m.d();
                    }
                    if (this.c.b.c()) {
                        m.a(this.c.b.c(), this.c.e);
                    }
                    m.c(this.e);
                    m.a(false, this.d);
                    m.b(this.c);
                }
                m.a(this.g.toString(), this.c.b.c(), true, a2);
                this.c.toString();
                br.a();
            } catch (Throwable unused) {
            }
        }

        public final void b(int i) {
            this.c.n = i;
        }

        public final void a(long j) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            this.c.l = decimalFormat.format(((float) j) / 1024.0f);
        }

        public final void a(bt btVar, URL url) {
            this.g = url;
            this.c.d = url.getPath();
            this.c.e = url.getHost();
            if (!TextUtils.isEmpty(br.this.n) && btVar.u().b()) {
                c cVar = this.c;
                cVar.c = cVar.e.replace("[", "").replace("]", "");
                this.c.e = br.this.n;
            }
            if (btVar.u().b()) {
                btVar.a(this.c.e);
            }
            if (btVar.u().d()) {
                this.f = btVar.x();
            }
        }

        public final void a(bu buVar) {
            c a2;
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.f5609a;
                if (buVar != null) {
                    buVar.f = this.c.b.c();
                }
                if (this.c.b.b()) {
                    c cVar = this.c;
                    if (cVar.f > 10000) {
                        m.a(false, cVar.e);
                    }
                }
                if (this.c.b.d()) {
                    m.a(false, this.f);
                }
                boolean a3 = br.this.a(this.c.e);
                if (a3) {
                    m.c(this.c);
                    m.a(true, this.d);
                    c cVar2 = this.c;
                    if (cVar2.f > m.e && (a2 = cVar2.clone()) != null) {
                        a2.m = 1;
                        m.b(a2);
                        a2.toString();
                        br.a();
                    }
                }
                m.a(this.g.toString(), this.c.b.c(), false, a3);
                this.c.toString();
                br.a();
            } catch (Throwable unused) {
            }
        }
    }

    public br() {
        m.e();
        try {
            this.g = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        } catch (Throwable th) {
            as.a(th, "ht", "ic");
        }
    }

    private static int a(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            return 4101;
        }
        if (exc instanceof SSLKeyException) {
            return 4102;
        }
        if (exc instanceof SSLProtocolException) {
            return 4103;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            return TrtcConstants.TRTC_ERROR_CODE_CALLEE_SDK_VERSION_IS_LOW;
        }
        if (exc instanceof ConnectException) {
            return 6101;
        }
        if (exc instanceof SocketException) {
            return 6102;
        }
        if (exc instanceof ConnectTimeoutException) {
            return 2101;
        }
        return exc instanceof SocketTimeoutException ? 2102 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000e, B:11:0x001e, B:13:0x0022, B:16:0x002e), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x000c, TRY_LEAVE, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000e, B:11:0x001e, B:13:0x0022, B:16:0x002e), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.bs b() {
        /*
            r5 = this;
            r0 = 0
            java.lang.ref.SoftReference<com.loc.bs> r1 = com.loc.br.t     // Catch: all -> 0x000c
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r1.get()     // Catch: all -> 0x000c
            if (r1 != 0) goto L_0x001e
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            goto L_0x0038
        L_0x000e:
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch: all -> 0x000c
            com.loc.bs r2 = new com.loc.bs     // Catch: all -> 0x000c
            android.content.Context r3 = com.loc.m.c     // Catch: all -> 0x000c
            javax.net.ssl.SSLContext r4 = r5.b     // Catch: all -> 0x000c
            r2.<init>(r3, r4)     // Catch: all -> 0x000c
            r1.<init>(r2)     // Catch: all -> 0x000c
            com.loc.br.t = r1     // Catch: all -> 0x000c
        L_0x001e:
            java.lang.ref.SoftReference<javax.net.ssl.SSLContext> r1 = com.loc.br.k     // Catch: all -> 0x000c
            if (r1 == 0) goto L_0x002b
            java.lang.ref.SoftReference<com.loc.bs> r1 = com.loc.br.t     // Catch: all -> 0x000c
            java.lang.Object r1 = r1.get()     // Catch: all -> 0x000c
            com.loc.bs r1 = (com.loc.bs) r1     // Catch: all -> 0x000c
            goto L_0x002c
        L_0x002b:
            r1 = r0
        L_0x002c:
            if (r1 != 0) goto L_0x0037
            com.loc.bs r1 = new com.loc.bs     // Catch: all -> 0x000c
            android.content.Context r2 = com.loc.m.c     // Catch: all -> 0x000c
            javax.net.ssl.SSLContext r3 = r5.b     // Catch: all -> 0x000c
            r1.<init>(r2, r3)     // Catch: all -> 0x000c
        L_0x0037:
            return r1
        L_0x0038:
            java.lang.String r2 = "ht"
            java.lang.String r3 = "gsf"
            com.loc.av.b(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.b():com.loc.bs");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #2 {all -> 0x01ed, blocks: (B:97:0x01e2, B:99:0x01e6, B:103:0x01ef, B:104:0x01fa, B:106:0x01fe), top: B:131:0x01e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:40:0x00c5, B:43:0x00dd, B:45:0x00e0, B:47:0x00e4, B:49:0x00ea, B:54:0x00f6, B:57:0x0102, B:59:0x0105, B:61:0x010b, B:62:0x0121, B:64:0x0125, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:71:0x0137, B:73:0x013d, B:75:0x0147, B:77:0x0158, B:79:0x0180, B:81:0x01a1, B:82:0x01a4), top: B:127:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:40:0x00c5, B:43:0x00dd, B:45:0x00e0, B:47:0x00e4, B:49:0x00ea, B:54:0x00f6, B:57:0x0102, B:59:0x0105, B:61:0x010b, B:62:0x0121, B:64:0x0125, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:71:0x0137, B:73:0x013d, B:75:0x0147, B:77:0x0158, B:79:0x0180, B:81:0x01a1, B:82:0x01a4), top: B:127:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.br.b c(com.loc.bt r15) throws java.io.IOException, com.loc.k {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.c(com.loc.bt):com.loc.br$b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f A[Catch: all -> 0x0032, IOException -> 0x0038, SocketTimeoutException -> 0x003e, ConnectTimeoutException -> 0x0044, TRY_ENTER, TryCatch #20 {SocketTimeoutException -> 0x003e, ConnectTimeoutException -> 0x0044, IOException -> 0x0038, all -> 0x0032, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:9:0x002a, B:18:0x004a, B:52:0x00c2, B:108:0x018f, B:109:0x01dc), top: B:152:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[Catch: all -> 0x0032, IOException -> 0x0038, SocketTimeoutException -> 0x003e, ConnectTimeoutException -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #20 {SocketTimeoutException -> 0x003e, ConnectTimeoutException -> 0x0044, IOException -> 0x0038, all -> 0x0032, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:9:0x002a, B:18:0x004a, B:52:0x00c2, B:108:0x018f, B:109:0x01dc), top: B:152:0x0008 }] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.bu a(com.loc.br.b r15) throws com.loc.k, java.io.IOException {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.a(com.loc.br$b):com.loc.bu");
    }

    private static String b(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("sc");
            if (list == null || list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.contains("#")) {
                return str;
            }
            String[] split = str.split("#");
            return split.length > 1 ? split[0] : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private void b(bt btVar) throws k {
        this.i = new d((byte) 0);
        this.p = btVar.y();
        this.c = btVar.o();
        this.h = btVar.t();
        this.l = btVar.q();
        this.j = btVar.z();
        this.f5603a = q.a().a(btVar.s());
        String m = btVar.u().b() ? btVar.m() : btVar.l();
        this.m = m;
        this.m = bq.a(m, this.j);
        this.n = btVar.g();
        if (MspEventTypes.ACTION_INVOKE_LOC.equals(this.j)) {
            String l = btVar.l();
            String m2 = btVar.m();
            if (!TextUtils.isEmpty(l)) {
                try {
                    this.r = new URL(l).getHost();
                } catch (Exception unused) {
                }
            }
            if (!TextUtils.isEmpty(m2)) {
                try {
                    if (!TextUtils.isEmpty(this.n)) {
                        this.q = this.n;
                    } else {
                        this.q = new URL(m2).getHost();
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:127|8|(8:10|(1:12)|(9:122|44|120|45|116|46|47|(1:49)|50)|63|125|64|67|68)|33|(1:(1:36)(1:37))|38|(1:40)|(10:42|122|44|120|45|116|46|47|(0)|50)|63|125|64|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
        com.loc.as.a(r0, "ht", "mPt");
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[Catch: all -> 0x0041, k -> 0x0045, IOException -> 0x0049, SocketTimeoutException -> 0x004d, SocketException -> 0x0051, UnknownHostException -> 0x0055, MalformedURLException -> 0x0059, ConnectTimeoutException -> 0x005d, ConnectException -> 0x0061, SSLException -> 0x0065, InterruptedIOException -> 0x00de, TryCatch #10 {k -> 0x0045, InterruptedIOException -> 0x00de, ConnectException -> 0x0061, MalformedURLException -> 0x0059, SocketException -> 0x0051, SocketTimeoutException -> 0x004d, UnknownHostException -> 0x0055, SSLException -> 0x0065, ConnectTimeoutException -> 0x005d, IOException -> 0x0049, all -> 0x0041, blocks: (B:8:0x0027, B:10:0x003d, B:33:0x0069, B:36:0x0073, B:38:0x0078, B:40:0x0082, B:42:0x0088, B:47:0x009f, B:49:0x00a4, B:50:0x00a7, B:58:0x00b9, B:60:0x00be, B:61:0x00c1, B:62:0x00c6, B:63:0x00c7), top: B:127:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.bu a(com.loc.bt r14) throws com.loc.k {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.a(com.loc.bt):com.loc.bu");
    }

    private static String a(String str, String str2) {
        String str3 = Build.MANUFACTURER;
        Context context = m.c;
        String a2 = context != null ? x.a(context) : "";
        return "platform=Android&sdkversion=" + str + "&product=" + str2 + "&manufacture=" + str3 + "&abitype=" + a2;
    }

    private static boolean b(String str) {
        return str.contains("rest") || str.contains("apilocate");
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(key));
            sb.append("=");
            sb.append(URLEncoder.encode(value));
        }
        return sb.toString();
    }

    public static void a() {
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        c g;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    httpURLConnection.addRequestProperty(str, map.get(str));
                }
            } catch (Throwable th) {
                as.a(th, "ht", "adh");
                return;
            }
        }
        HashMap<String, String> hashMap = bo.d;
        if (hashMap != null) {
            for (String str2 : hashMap.keySet()) {
                httpURLConnection.addRequestProperty(str2, bo.d.get(str2));
            }
        }
        String str3 = "";
        if (!this.m.contains("/v3/iasdkauth") && !TextUtils.isEmpty(this.j) && m.d(this.j)) {
            this.o = true;
            m.g f2 = m.f(this.j);
            httpURLConnection.addRequestProperty("lct", String.valueOf(f2.f5740a));
            httpURLConnection.addRequestProperty("lct-info", f2.b);
            httpURLConnection.addRequestProperty("aks", m.c(m.a(this.j)));
            httpURLConnection.addRequestProperty("lct-args", a(m.b(this.j) != null ? m.b(this.j).b() : str3, this.j));
        }
        httpURLConnection.addRequestProperty("csid", this.g);
        if (a(this.u.c.e)) {
            f fVar = this.u;
            if (!TextUtils.isEmpty(fVar.c.c)) {
                str3 = p.b(bk.a(fVar.c.c.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                String str4 = fVar.c.c;
            }
            if (!TextUtils.isEmpty(str3)) {
                httpURLConnection.addRequestProperty("sip", str3);
            }
            if (m.j && (g = m.g()) != null) {
                httpURLConnection.addRequestProperty("nls", g.b());
                this.u.e = g;
            }
            a f3 = m.f();
            if (f3 != null) {
                httpURLConnection.addRequestProperty("nlf", f3.b());
                this.u.d = f3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (!this.l) {
            return (!TextUtils.isEmpty(this.n) && (this.n.contains("rest") || this.n.contains("apilocate"))) || b(str);
        }
        return true;
    }

    private boolean a(Map<String, List<String>> map, boolean z) {
        List<String> list;
        try {
            List<String> list2 = map.get("sc");
            if (list2 == null || list2.size() <= 0) {
                return false;
            }
            String str = list2.get(0);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.contains("#")) {
                String[] split = str.split("#");
                if (split.length <= 1 || !"1".equals(split[1])) {
                    return false;
                }
            }
            if (!z) {
                return true;
            }
            if (!map.containsKey("lct") || (list = map.get("lct")) == null || list.size() <= 0) {
                return false;
            }
            return m.a(this.j, m.a(list));
        } catch (Throwable unused) {
            return false;
        }
    }
}
