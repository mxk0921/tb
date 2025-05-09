package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s7b extends d2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final feh A;
    public final e8b p;
    public final pr2 q;
    public ss2 r;
    public final boolean v;
    public final boolean w;
    public long s = 0;
    public long t = 0;
    public long u = 0;
    public long x = 0;
    public long y = 0;
    public final AtomicLong z = new AtomicLong(0);

    static {
        t2o.a(774897877);
    }

    public s7b(e8b e8bVar, pr2 pr2Var, t7b t7bVar) {
        super(e8bVar, pr2Var, t7bVar);
        String str;
        this.q = pr2Var;
        this.p = e8bVar;
        if (e8bVar != null) {
            str = e8bVar.k();
        } else {
            str = "";
        }
        this.A = new feh(toString(), str);
        this.v = true;
        this.w = true;
    }

    public static /* synthetic */ Object ipc$super(s7b s7bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/cache/library/HttpProxyCache");
    }

    public void A(ss2 ss2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae0f27f", new Object[]{this, ss2Var});
        } else {
            this.r = ss2Var;
        }
    }

    public void B(eq9 eq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97234607", new Object[]{this, eq9Var});
        } else {
            this.f17527a = eq9Var;
        }
    }

    @Override // tb.d2n
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44231840", new Object[]{this, new Integer(i)});
            return;
        }
        ss2 ss2Var = this.r;
        if (ss2Var != null) {
            ss2Var.a(((wb9) this.q).b, this.p.b, i);
        }
    }

    public void t(b8a b8aVar, boolean z, t7b t7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42ee2a1", new Object[]{this, b8aVar, new Boolean(z), t7bVar});
        } else if (this.q != null && b8aVar != null && t7bVar != null) {
            s(b8aVar, z);
            if (this.u > 0) {
                t7bVar.J(b8aVar.f16243a);
            }
        }
    }

    public long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e591b4b5", new Object[]{this})).longValue();
        }
        return this.z.get();
    }

    public final boolean v(b8a b8aVar) throws ProxyCacheException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eb07954", new Object[]{this, b8aVar})).booleanValue();
        }
        pr2 pr2Var = this.q;
        if (pr2Var != null && pr2Var.isCompleted()) {
            return true;
        }
        long x = this.p.x();
        if (x == -1) {
            AVSDKLog.e(this.A, "isUseCache return false because of sourceLength=-1");
            return false;
        }
        if (x > 0) {
            z = true;
        } else {
            z = false;
        }
        long available = this.q.available();
        if (!z || !b8aVar.c || ((float) b8aVar.b) <= ((float) available) + (((float) x) * 0.2f)) {
            return true;
        }
        return false;
    }

    public final void x(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acb2a0", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        eq9 eq9Var = this.f17527a;
        if (eq9Var != null) {
            ((u7b) eq9Var).r(i, i2, z);
        }
    }

    public final void D(OutputStream outputStream, long j, b8a b8aVar) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d682760c", new Object[]{this, outputStream, new Long(j), b8aVar});
            return;
        }
        e8b e8bVar = new e8b(this.p);
        try {
            try {
                e8bVar.a((int) j, true);
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = e8bVar.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    x(read, 0, false);
                    i += read;
                }
                outputStream.flush();
                this.y = System.currentTimeMillis();
                feh fehVar = this.A;
                AVSDKLog.e(fehVar, "mResponseWithoutCacheTimeStamp is " + this.y + " from mGetRequestTimeStamp is " + (this.y - this.x));
                feh fehVar2 = this.A;
                StringBuilder sb = new StringBuilder();
                sb.append("responseWithoutCache ");
                sb.append(i);
                AVSDKLog.e(fehVar2, sb.toString());
            } catch (Exception e) {
                feh fehVar3 = this.A;
                AVSDKLog.e(fehVar3, "responseWithoutCache error " + e.toString());
            }
            e8bVar.close();
        } catch (Throwable th) {
            e8bVar.close();
            throw th;
        }
    }

    public void z(b8a b8aVar, Socket socket) throws IOException, ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7415063a", new Object[]{this, b8aVar, socket});
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        this.x = System.currentTimeMillis();
        String w = w(b8aVar, false);
        bufferedOutputStream.write(w.getBytes("UTF-8"));
        AVSDKLog.e(this.A, "response ".concat(w));
        long j = b8aVar.b;
        if (v(b8aVar)) {
            C(bufferedOutputStream, j, b8aVar, (j < this.q.available() || j - this.q.available() <= ((long) (this.p.i() / 2))) ? this.v : false);
        } else {
            D(bufferedOutputStream, j, b8aVar);
        }
    }

    public final void C(OutputStream outputStream, long j, b8a b8aVar, boolean z) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb37ada8", new Object[]{this, outputStream, new Long(j), b8aVar, new Boolean(z)});
            return;
        }
        int i = 8192;
        byte[] bArr = new byte[8192];
        long available = this.q.available();
        long j2 = j;
        int i2 = 0;
        while (true) {
            int m = m(bArr, j2, i, z, false);
            if (m != -1) {
                this.z.compareAndSet(0L, System.currentTimeMillis());
                int i3 = (int) (available - j2);
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 > m) {
                    i3 = m;
                }
                x(m, i3, true);
                outputStream.write(bArr, 0, m);
                i2 += m;
                j2 += m;
                i = 8192;
            } else {
                outputStream.flush();
                this.y = System.currentTimeMillis();
                feh fehVar = this.A;
                AVSDKLog.e(fehVar, "mResponseWithCacheTimeStamp is " + this.y + " from mGetRequestTimeStamp is " + (this.y - this.x));
                feh fehVar2 = this.A;
                StringBuilder sb = new StringBuilder("responseWithCache ");
                sb.append(i2);
                AVSDKLog.e(fehVar2, sb.toString());
                return;
            }
        }
    }

    public final void s(b8a b8aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e0cd85", new Object[]{this, b8aVar, new Boolean(z)});
            return;
        }
        try {
            String str = System.currentTimeMillis() + "_" + new Random().nextInt(1000);
            StringBuilder sb = new StringBuilder("errorcode=");
            sb.append(z ? -99 : 0);
            TBS.Ext.commitEvent("Page_Video", 19997, "Page_Video_Button-TBPlayerPrecache", "", "", sb.toString(), "downloaded_bytes=" + this.u, "download_time=" + this.t, "request_bytes=" + b8aVar.i, "video_id=" + b8aVar.p, "video_url=" + b8aVar.f16243a, "cache_download_bytes=" + (this.u - this.s), "cache_hit_bytes=" + this.s, "play_token=" + str, "from=" + b8aVar.n, "videoPlayScenes=" + b8aVar.o, "is_tbnet=" + (b8aVar.e ? 1 : 0));
        } catch (Exception e) {
            AVSDKLog.e(this.A, "commitPreloadStat error " + e.toString());
        }
    }

    public void y(b8a b8aVar, Socket socket) throws IOException, ProxyCacheException {
        long j;
        long j2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b483dcf", new Object[]{this, b8aVar, socket});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String queryParameter = Uri.parse(b8aVar.f16243a).getQueryParameter(a7m.VIDEO_CACHE_ID);
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = e2n.e(b8aVar.f16243a);
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(w(b8aVar, true).getBytes("UTF-8"));
        long j3 = b8aVar.b;
        long j4 = b8aVar.i;
        pr2 pr2Var = this.q;
        if (pr2Var == null || !pr2Var.isCompleted()) {
            this.s = this.q.available();
            if (j3 < j4 && this.p.length() != -1) {
                byte[] bArr = new byte[8192];
                long currentTimeMillis2 = System.currentTimeMillis();
                boolean z2 = this.w;
                if (j4 - j3 > this.p.i() || j3 > 0) {
                    j = currentTimeMillis2;
                    j2 = j3;
                    z = false;
                } else {
                    j = currentTimeMillis2;
                    j2 = j3;
                    z = z2;
                }
                int i = 0;
                while (true) {
                    int m = m(bArr, j2, 8192, z, true);
                    if (m == -1 || j2 > j4) {
                        break;
                    }
                    j2 += m;
                    int i2 = i + m;
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (currentTimeMillis3 - j >= 100) {
                        rmm.e().i(queryParameter, i2);
                        j = currentTimeMillis3;
                    }
                    i = i2;
                }
                bufferedOutputStream.flush();
                this.u = this.q.available();
                this.t = System.currentTimeMillis() - currentTimeMillis;
                rmm.e().h(queryParameter, (int) this.q.available());
                return;
            }
            return;
        }
        this.u = this.q.available();
        this.t = System.currentTimeMillis() - currentTimeMillis;
        rmm.e().h(queryParameter, (int) this.q.available());
    }

    public final String w(b8a b8aVar, boolean z) throws ProxyCacheException {
        String str;
        long j;
        long j2;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("431c3cdc", new Object[]{this, b8aVar, new Boolean(z)});
        }
        boolean z2 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "disableHeadReq", "true")) && !z;
        e8b e8bVar = this.p;
        if (z2) {
            str = e8bVar.l();
        } else {
            str = e8bVar.j();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        e8b e8bVar2 = this.p;
        if (z2) {
            j = e8bVar2.x();
        } else {
            j = e8bVar2.length();
        }
        AVSDKLog.e(this.A, "source.rawLength() :" + this.p.x() + " + length :" + this.p.length());
        if (j < 0 && z2) {
            j = this.p.length();
        }
        if (this.q.isCompleted() && this.q.available() > b8aVar.b) {
            j = this.q.available();
        }
        boolean z3 = j >= 0;
        boolean z4 = b8aVar.c;
        long j3 = z4 ? j - b8aVar.b : j;
        if (z4) {
            j2 = this.q.available() - b8aVar.b;
        } else {
            j2 = this.q.available();
        }
        boolean z5 = z3 && b8aVar.c;
        StringBuilder sb = new StringBuilder();
        if (b8aVar.c) {
            str2 = "HTTP/1.1 206 PARTIAL CONTENT\n";
        } else {
            str2 = "HTTP/1.1 200 OK\n";
        }
        sb.append(str2);
        sb.append("Accept-Ranges: bytes\n");
        String str4 = "";
        sb.append(z3 ? String.format("Content-Length: %d\n", Long.valueOf(j3)) : str4);
        sb.append(z5 ? String.format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(b8aVar.b), Long.valueOf(j - 1), Long.valueOf(j)) : str4);
        if (!isEmpty) {
            str3 = "Content-Type: " + str + "\n";
        } else {
            str3 = str4;
        }
        sb.append(str3);
        if (z3) {
            if (j2 <= 0) {
                j2 = 0;
            }
            str4 = String.format("X-CACHE-CACHED-BYTES: %d\n", Long.valueOf(j2));
        }
        sb.append(str4);
        sb.append("\n");
        String sb2 = sb.toString();
        AVSDKLog.e(this.A, "headers = " + sb2 + "source.rawLength()" + j);
        return sb2;
    }
}
