package tb;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.Network;
import anetwork.channel.aidl.Connection;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.InterruptedProxyCacheException;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e8b implements z9q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RANGE_END_VALUE_EXCEED_LENGTH = -2;
    public static final int RANGE_END_VALUE_INIT = -1;
    public static final int RANGE_END_VALUE_WITHOUT_CACAHE = -3;
    public static final int RANGE_START_VALUE_INIT = -1;
    public final String A;
    public final long B;
    public final boolean C;
    public boolean D;
    public boolean H;
    public String I;
    public final int N;
    public feh O;
    public String b;
    public volatile yaf c;
    public volatile vi4 d;
    public volatile long e;
    public volatile long f;
    public volatile String g;
    public final String h;
    public boolean i;
    public final String j;
    public Network k;
    public final ruc l;
    public String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final int r;
    public final l7b s;
    public final String z;

    /* renamed from: a  reason: collision with root package name */
    public int f18350a = 1048576;
    public long t = -1;
    public long u = -1;
    public boolean v = false;
    public String w = "";
    public boolean x = false;
    public long y = -2147483648L;
    public long E = 0;
    public long F = 0;
    public boolean G = true;
    public boolean J = false;
    public long K = -1;
    public long L = -1;
    public final List<String> M = Arrays.asList("srtt", "minRtt", "connInFlight", "totalSize", "dataSpeed", "firstDataTime", "recDataTime");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f18351a = new b();

        static {
            t2o.a(774897892);
        }

        public e8b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e8b) ipChange.ipc$dispatch("e145758c", new Object[]{this});
            }
            return new e8b(this.f18351a);
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1d2945a9", new Object[]{this, str});
            }
            this.f18351a.k = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ea68415", new Object[]{this, str});
            }
            this.f18351a.h = str;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("97b3c335", new Object[]{this, new Integer(i)});
            }
            this.f18351a.l = i;
            return this;
        }

        public a e(l7b l7bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("146dad60", new Object[]{this, l7bVar});
            }
            this.f18351a.b = l7bVar;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cdeab704", new Object[]{this, new Integer(i)});
            }
            this.f18351a.i = i;
            return this;
        }

        public a g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a92cb092", new Object[]{this, new Integer(i)});
            }
            this.f18351a.j = i;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("48a863d1", new Object[]{this, str});
            }
            this.f18351a.e = str;
            return this;
        }

        public a i(ruc rucVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6d80e7b", new Object[]{this, rucVar});
            }
            this.f18351a.f18352a = rucVar;
            return this;
        }

        public a j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1e6bae44", new Object[]{this, str});
            }
            this.f18351a.g = str;
            return this;
        }

        public a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("525e0df2", new Object[]{this, new Boolean(z)});
            }
            this.f18351a.r = z;
            return this;
        }

        public a l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b0825cc9", new Object[]{this, new Integer(i)});
            }
            this.f18351a.s = i;
            return this;
        }

        public a m(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("53ff659b", new Object[]{this, new Long(j)});
            }
            this.f18351a.q = j;
            return this;
        }

        public a n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc8e0e45", new Object[]{this, new Integer(i)});
            }
            this.f18351a.m = i;
            return this;
        }

        public a o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("842cd46f", new Object[]{this, new Integer(i)});
            }
            this.f18351a.n = i;
            return this;
        }

        public a p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2039eba", new Object[]{this, str});
            }
            this.f18351a.c = str;
            return this;
        }

        public a q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1a6cc4ad", new Object[]{this, new Boolean(z)});
            }
            this.f18351a.f = z;
            return this;
        }

        public a r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7a3ccc0f", new Object[]{this, str});
            }
            this.f18351a.d = str;
            return this;
        }

        public a s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f1882af3", new Object[]{this, str});
            }
            this.f18351a.p = str;
            return this;
        }

        public a t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("65107f13", new Object[]{this, str});
            }
            this.f18351a.o = str;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public ruc f18352a;
        public l7b b;
        public String c;
        public String d;
        public String e;
        public boolean f;
        public String g;
        public String h;
        public int i;
        public int j;
        public String k;
        public int l;
        public int m;
        public int n;
        public String o;
        public String p;
        public long q;
        public boolean r;
        public int s;

        static {
            t2o.a(774897893);
        }
    }

    static {
        t2o.a(774897891);
        t2o.a(774897903);
    }

    public e8b(e8b e8bVar) {
        this.e = -2147483648L;
        this.f = -2147483648L;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.N = -1;
        this.b = e8bVar.b;
        this.g = e8bVar.g;
        this.e = e8bVar.e;
        this.f = e8bVar.f;
        this.h = e8bVar.h;
        this.i = e8bVar.i;
        this.j = e8bVar.j;
        this.l = e8bVar.l;
        this.n = e8bVar.n;
        this.o = e8bVar.o;
        this.p = e8bVar.p;
        this.q = e8bVar.q;
        this.r = e8bVar.r;
        this.s = e8bVar.s;
        this.z = e8bVar.z;
        this.A = e8bVar.A;
        this.B = e8bVar.B;
        this.C = e8bVar.C;
        this.N = e8bVar.N;
        q();
    }

    public final void c(int i, long j) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325010b9", new Object[]{this, new Integer(i), new Long(j)});
        } else if (d() && i == 416) {
            this.y = this.e;
            this.e = -2147483648L;
            this.g = "";
            e();
            feh fehVar = this.O;
            AVSDKLog.e(fehVar, "update length from " + this.y + " to " + this.e);
            if (j >= this.e) {
                throw new ProxyCacheException("offset " + j + " is larger than length " + this.e);
            }
        }
    }

    @Override // tb.z9q
    public synchronized void close() throws ProxyCacheException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        if (this.c != null) {
            try {
                this.c.a();
                this.L = System.currentTimeMillis();
                this.c = null;
            } catch (Exception e) {
                AVSDKLog.e("HttpUrlSource", " HttpUrlSource inputStream close error:" + e.getMessage());
            }
        }
        if (this.d != null) {
            try {
                this.d.a();
                StringBuilder sb = new StringBuilder("playToken=");
                sb.append(this.j);
                sb.append(",");
                sb.append(this.d.f());
                sb.append(",url=");
                sb.append(this.b);
                sb.append(",length=");
                sb.append(this.e);
                sb.append(",rangestart=");
                sb.append(this.t);
                sb.append(",rangeend=");
                sb.append(this.u);
                sb.append(",usecache=");
                sb.append(this.v);
                sb.append(",videoid=");
                sb.append(this.z);
                sb.append(",videodefine=");
                sb.append(this.A);
                sb.append(",errorLength=");
                sb.append(this.y);
                sb.append(",headtime=");
                sb.append(this.E);
                sb.append(",redirect=");
                sb.append(this.F);
                sb.append(",down2sys=");
                if (this.J) {
                    str = "1";
                } else {
                    str = "0";
                }
                sb.append(str);
                sb.append(",useNet=");
                sb.append(this.i ? 1 : 0);
                sb.append(",beginTime=");
                sb.append(this.K);
                sb.append(",endTime=");
                sb.append(this.L);
                this.m = sb.toString();
                b(this.d);
                this.d = null;
                feh fehVar = this.O;
                AVSDKLog.e(fehVar, "HttpUrlSource.close " + this + ", " + this.m);
            } catch (Exception e2) {
                throw new ProxyCacheException("Error disconnecting HttpUrlConnection", e2);
            }
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6473b3dd", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public final HttpURLConnection f(int i) throws IOException, ProxyCacheException {
        HttpURLConnection httpURLConnection;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("f9c9cb77", new Object[]{this, new Integer(i)});
        }
        String str = this.b;
        int i2 = 0;
        do {
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(this.n)) {
                str = str.replaceFirst(parse.getHost(), this.n);
            }
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            if (!TextUtils.isEmpty(this.n)) {
                httpURLConnection.setRequestProperty(HttpConstant.HOST, parse.getHost());
            }
            if (!TextUtils.isEmpty(this.h)) {
                httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, this.h);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 301 || responseCode == 302 || responseCode == 303) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                feh fehVar = this.O;
                AVSDKLog.e(fehVar, "getConnectionHead 302 " + this.F);
                this.F = this.F + 1;
                String headerField = httpURLConnection.getHeaderField("Location");
                if (this.G) {
                    headerField = t(str, headerField);
                }
                this.b = headerField;
                i2++;
                httpURLConnection.disconnect();
                str = headerField;
            } else if (responseCode == 403 || responseCode == 404) {
                return null;
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    public final Connection g(int i) throws ProxyCacheException, RemoteException {
        Connection connection;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("d0c499d7", new Object[]{this, new Integer(i)});
        }
        if (this.k == null) {
            this.k = new DegradableNetwork(ja1.f21858a);
        }
        int i2 = 0;
        do {
            RequestImpl requestImpl = new RequestImpl(this.b);
            requestImpl.setMethod("HEAD");
            if (i > 0) {
                requestImpl.setConnectTimeout(i);
                requestImpl.setReadTimeout(i);
            }
            if (!TextUtils.isEmpty(this.h)) {
                requestImpl.addHeader(HttpConstant.USER_AGENT, this.h);
            }
            connection = this.k.getConnection(requestImpl, null);
            int statusCode = connection.getStatusCode();
            if (statusCode == 301 || statusCode == 302 || statusCode == 303) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                feh fehVar = this.O;
                AVSDKLog.e(fehVar, "getConnectionHead1 302 " + this.F);
                this.F = this.F + 1;
                String b2 = new vi4(connection).b("Location");
                if (this.G) {
                    b2 = t(this.b, b2);
                }
                this.b = b2;
                i2++;
                connection.cancel();
            } else if (statusCode == 403 || statusCode == 404) {
                return null;
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return connection;
    }

    public final long h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea5a421c", new Object[]{this, new Long(j)})).longValue();
        }
        long j2 = this.B;
        if (j2 >= 2147483647L || j2 <= 0 || !this.D) {
            return j;
        }
        return Math.min(j2, j);
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff7594d", new Object[]{this})).intValue();
        }
        return this.f18350a;
    }

    public synchronized String j() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7e6108f", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            s();
        }
        if (TextUtils.isEmpty(this.g)) {
            e();
        }
        return this.g;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb989ea", new Object[]{this});
        }
        return this.j;
    }

    public synchronized String l() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d03fe73", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            s();
        }
        return this.g;
    }

    @Override // tb.z9q
    public synchronized long length() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc61", new Object[]{this})).longValue();
        } else if (this.f > 0) {
            this.e = this.f;
            return this.e;
        } else {
            s();
            if (this.e == -2147483648L) {
                e();
            }
            return this.e;
        }
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de691d0d", new Object[]{this})).longValue();
        }
        if (this.u < -1 && this.e > 0) {
            return this.e;
        }
        long j = this.u - this.t;
        if (j > 0) {
            return j + 1;
        }
        return 0L;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60134415", new Object[]{this});
        }
        return this.m;
    }

    public final boolean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43a8ee1a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.H) {
            if (ew0.n("" + i, this.I)) {
                return true;
            }
        }
        return false;
    }

    public final boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29dda0af", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0) {
            if (!ew0.n("" + i, this.w)) {
                return false;
            }
        }
        return true;
    }

    @Override // tb.z9q
    public int read(byte[] bArr) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        if (this.c != null) {
            try {
                return this.c.b(bArr);
            } catch (InterruptedIOException e) {
                throw new InterruptedProxyCacheException("Reading source " + this.b + " is interrupted", e);
            } catch (Exception e2) {
                throw new ProxyCacheException("Error reading data from " + this.b, e2);
            }
        } else {
            throw new ProxyCacheException("Error reading data from " + this.b + ": connection is absent!");
        }
    }

    public final void s() {
        cov k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eaf29ef", new Object[]{this});
            return;
        }
        ruc rucVar = this.l;
        if (rucVar != null && (k = ((u7b) rucVar).k(this.b)) != null && !TextUtils.isEmpty(k.b()) && k.a() != -2147483648L && this.e != k.a()) {
            this.g = k.b();
            this.e = k.a();
        }
    }

    public final String t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1876d5bd", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str2.startsWith("/")) {
            return ew0.x(str, str2);
        }
        return str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HttpUrlSource{url='" + this.b + "}";
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b984666", new Object[]{this});
            return;
        }
        ruc rucVar = this.l;
        if (rucVar != null) {
            ((u7b) rucVar).v(this.b, this.e, this.g);
        }
    }

    public synchronized long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12e95ea9", new Object[]{this})).longValue();
        } else if (this.f > 0) {
            this.e = this.f;
            return this.e;
        } else {
            s();
            return this.e;
        }
    }

    @Override // tb.z9q
    public void a(long j, boolean z) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1625a21", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        try {
            if (this.i) {
                this.J = false;
                this.d = new vi4(v(j, -1, z));
                if (o(this.d.e())) {
                    this.J = true;
                    this.d = new vi4(u(j, -1, z));
                } else if (p(this.d.e())) {
                    throw new ProxyCacheException("Error opening connection for " + this.b + " with offset " + j + " error");
                }
            } else {
                this.d = new vi4(u(j, -1, z));
            }
            this.g = this.d.b("Content-Type");
            if (this.e == -1 || this.e == -2147483648L) {
                long j2 = this.e;
                this.e = this.d.c("Content-Length", -1);
                feh fehVar = this.O;
                AVSDKLog.e(fehVar, "open oldLength " + j2 + ", length=" + this.e);
                if (this.e > 0) {
                    w();
                }
            }
            this.c = this.d.d();
        } catch (Exception e) {
            throw new ProxyCacheException("Error opening connection for " + this.b + " with offset " + j + " error message:" + e.getMessage(), e);
        }
    }

    public final void b(vi4 vi4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20de571a", new Object[]{this, vi4Var});
        } else if (vi4Var != null) {
            try {
                String f = vi4Var.f();
                if (!TextUtils.isEmpty(f)) {
                    String[] split = f.split(",");
                    JSONObject jSONObject = new JSONObject();
                    for (String str : split) {
                        String[] split2 = str.split("=");
                        String str2 = split2[0];
                        long v = ew0.v(split2[1]);
                        if (this.M.contains(str2)) {
                            jSONObject.put(str2, (Object) Long.valueOf(v));
                        }
                    }
                    jSONObject.put("startTime", (Object) Long.valueOf(this.K));
                    jSONObject.put("duration", (Object) Long.valueOf(Math.max(this.L - this.K, -1L)));
                    if (r(jSONObject)) {
                        ja1.o0(jSONObject);
                    }
                }
            } catch (Exception e) {
                AVSDKLog.e(this.O, "getNetInfoForVideoABR failed!" + e.toString());
            }
        }
    }

    public final void e() throws ProxyCacheException {
        Throwable th;
        Exception e;
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55317b4", new Object[]{this});
            return;
        }
        vi4 vi4Var = null;
        try {
            try {
                try {
                    AVSDKLog.e(this.O, "fetchContentInfo start");
                    currentTimeMillis = System.currentTimeMillis();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (this.i) {
                vi4 vi4Var2 = new vi4(g(-1));
                try {
                } catch (Exception e4) {
                    e = e4;
                    vi4Var = vi4Var2;
                    feh fehVar = this.O;
                    AVSDKLog.e(fehVar, "fetchContentInfo error " + e.toString());
                    if (vi4Var != null) {
                        vi4Var.a();
                        this.m = "playToken=" + this.j + "," + vi4Var.f() + ",url=" + this.b;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    vi4Var = vi4Var2;
                    if (vi4Var != null) {
                        try {
                            vi4Var.a();
                            this.m = "playToken=" + this.j + "," + vi4Var.f() + ",url=" + this.b;
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
                if (o(vi4Var2.e())) {
                    this.J = true;
                    this.i = false;
                    vi4Var = new vi4(f(10000));
                } else {
                    vi4Var = vi4Var2;
                    this.g = vi4Var.b("Content-Type");
                    this.e = vi4Var.c("Content-Length", -1);
                    vi4Var.b("Expires");
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    this.E = currentTimeMillis2;
                    ((u7b) this.s).q("HeadRequetTime", String.valueOf(currentTimeMillis2));
                    w();
                    feh fehVar2 = this.O;
                    AVSDKLog.e(fehVar2, "fetchContentInfo end, Head Request time is " + this.E);
                    vi4Var.a();
                    this.m = "playToken=" + this.j + "," + vi4Var.f() + ",url=" + this.b;
                }
            } else {
                vi4Var = new vi4(f(10000));
            }
            this.g = vi4Var.b("Content-Type");
            this.e = vi4Var.c("Content-Length", -1);
            vi4Var.b("Expires");
            long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
            this.E = currentTimeMillis22;
            ((u7b) this.s).q("HeadRequetTime", String.valueOf(currentTimeMillis22));
            w();
            feh fehVar22 = this.O;
            AVSDKLog.e(fehVar22, "fetchContentInfo end, Head Request time is " + this.E);
            vi4Var.a();
            this.m = "playToken=" + this.j + "," + vi4Var.f() + ",url=" + this.b;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.O = new feh(toString(), this.j);
        this.x = true;
        this.w = OrangeConfig.getInstance().getConfig("DWInteractive", "throwErrorInResponseCodeList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        this.G = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "en302AbsolutePath", "true"));
        this.D = true;
        this.H = true;
        this.I = OrangeConfig.getInstance().getConfig("DWInteractive", "enDownErrorSys", "[\"-202\"]");
        if (!this.i || ja1.f21858a == null) {
            this.i = false;
        } else {
            this.k = new DegradableNetwork(ja1.f21858a);
        }
        int i = this.N;
        if (i <= 0 || i > 1048576) {
            this.f18350a = 1048576;
        } else {
            this.f18350a = i;
        }
    }

    public final boolean r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e304b2e", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            try {
                Double d = jSONObject.getDouble("totalSize");
                if (d != null && d.doubleValue() < ja1.y) {
                    return false;
                }
                Double d2 = jSONObject.getDouble("dataSpeed");
                if (d2 != null && d != null && d2.equals(d)) {
                    return false;
                }
                Double d3 = jSONObject.getDouble("firstDataTime");
                if (d3 != null) {
                    if (d3.equals(0)) {
                        return false;
                    }
                }
            } catch (Exception unused) {
                AVSDKLog.e(this.O, "isNetCutInfoValid judge failed and catch.");
            }
        }
        return true;
    }

    public final HttpURLConnection u(long j, int i, boolean z) throws IOException, ProxyCacheException {
        int i2;
        long j2;
        long j3;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("f567779", new Object[]{this, new Long(j), new Integer(i), new Boolean(z2)});
        }
        long j4 = j;
        String str = this.b;
        int i3 = 0;
        while (true) {
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(this.n) && !str.startsWith("https")) {
                str = str.replaceFirst(parse.getHost(), this.n);
            }
            AVSDKLog.e(this.O, "openConnection " + str + ", " + this);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (j4 < 0) {
                j4 = 0;
            }
            if (!z2) {
                long j5 = -1;
                if (x() > 0) {
                    if (this.f18350a + j4 < x()) {
                        j5 = (this.f18350a + j4) - 1;
                    }
                    if (this.f18350a != 1048576) {
                        i2 = i3;
                        AVSDKLog.e(this.O, "openConnection1: the reset MAX_EXTEND_DATA_REQUIRE=" + this.f18350a + ", end=" + j5);
                    } else {
                        i2 = i3;
                    }
                    j3 = h(j5);
                    j2 = 0;
                } else {
                    i2 = i3;
                    j3 = -1;
                    j2 = 0;
                }
                if (j3 < j2) {
                    httpURLConnection.setRequestProperty(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j4 + "-");
                } else {
                    httpURLConnection.setRequestProperty(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j4 + "-" + j3);
                }
            } else {
                i2 = i3;
                if (j4 > 0) {
                    httpURLConnection.setRequestProperty(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j4 + "-");
                }
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            if (!TextUtils.isEmpty(this.n)) {
                httpURLConnection.setRequestProperty(HttpConstant.HOST, parse.getHost());
            }
            if (!TextUtils.isEmpty(this.h)) {
                httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, this.h);
            }
            int responseCode = httpURLConnection.getResponseCode();
            c(responseCode, j4);
            boolean z3 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z3) {
                AVSDKLog.e(this.O, "openConnection " + this.F);
                this.F = this.F + 1;
                String headerField = httpURLConnection.getHeaderField("Location");
                if (this.G) {
                    headerField = t(str, headerField);
                }
                this.b = headerField;
                i3 = i2 + 1;
                httpURLConnection.disconnect();
                str = headerField;
            } else {
                i3 = i2;
            }
            if (i3 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i3);
            } else if (!z3) {
                return httpURLConnection;
            } else {
                z2 = z;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final anetwork.channel.aidl.Connection v(long r25, int r27, boolean r28) throws com.taobao.taobaoavsdk.cache.library.ProxyCacheException, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e8b.v(long, int, boolean):anetwork.channel.aidl.Connection");
    }

    public e8b(b bVar) {
        this.e = -2147483648L;
        this.f = -2147483648L;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.N = -1;
        this.b = (String) epm.b(bVar.c);
        this.g = bVar.e;
        this.h = bVar.d;
        this.i = bVar.f;
        this.e = bVar.i;
        this.f = bVar.j;
        this.j = bVar.g;
        this.l = bVar.f18352a;
        this.n = bVar.h;
        this.o = bVar.k;
        this.p = bVar.l;
        this.q = bVar.m;
        this.r = bVar.n;
        this.s = bVar.b;
        this.z = bVar.o;
        this.A = bVar.p;
        this.B = bVar.q;
        this.C = bVar.r;
        this.N = bVar.s;
        q();
    }
}
