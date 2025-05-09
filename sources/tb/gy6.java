package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import tb.o9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class gy6 extends i00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ExecutorService i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends q9o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ InputStream c;

        public a(gy6 gy6Var, String str, int i, InputStream inputStream) {
            this.b = i;
            this.c = inputStream;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in qmtopsdk/network/impl/DefaultCallImpl$1");
        }

        @Override // tb.q9o
        public InputStream a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("9a7074b2", new Object[]{this});
            }
            return this.c;
        }

        @Override // tb.q9o
        public long b() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public h3o f20311a;
        public htj b;

        static {
            t2o.a(590348300);
        }

        public b(h3o h3oVar, htj htjVar) {
            this.f20311a = h3oVar;
            this.b = htjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (gy6.e(gy6.this)) {
                    TBSdkLog.d("qmtopsdk.DefaultCallImpl", gy6.f(gy6.this), "call task is canceled.");
                    this.b.onCancel(gy6.this);
                    return;
                }
                o9o h = gy6.this.h();
                if (h == null) {
                    this.b.onFailure(gy6.this, new Exception("response is null"));
                } else {
                    this.b.onResponse(gy6.this, h);
                }
            } catch (InterruptedException unused) {
                this.b.onCancel(gy6.this);
            } catch (CancellationException unused2) {
                this.b.onCancel(gy6.this);
            } catch (Exception e) {
                this.b.onFailure(gy6.this, e);
                TBSdkLog.e("qmtopsdk.DefaultCallImpl", gy6.g(gy6.this), "do call.execute failed.", e);
            }
        }
    }

    static {
        t2o.a(590348298);
    }

    public gy6(h3o h3oVar, ExecutorService executorService) {
        super(h3oVar, null);
        this.i = executorService;
    }

    public static /* synthetic */ boolean e(gy6 gy6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e727baf", new Object[]{gy6Var})).booleanValue();
        }
        return gy6Var.c;
    }

    public static /* synthetic */ String f(gy6 gy6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5ae6896", new Object[]{gy6Var});
        }
        return gy6Var.e;
    }

    public static /* synthetic */ String g(gy6 gy6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("993decd7", new Object[]{gy6Var});
        }
        return gy6Var.e;
    }

    public static /* synthetic */ Object ipc$super(gy6 gy6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in qmtopsdk/network/impl/DefaultCallImpl");
    }

    @Override // tb.zu2
    public void a(htj htjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f3d5fd", new Object[]{this, htjVar});
            return;
        }
        ExecutorService executorService = this.i;
        if (executorService != null) {
            try {
                this.d = executorService.submit(new b(request(), htjVar));
            } catch (Exception e) {
                htjVar.onFailure(this, e);
            }
        } else {
            htjVar.onFailure(this, new Exception("miss executorService in CallImpl "));
        }
    }

    @Override // tb.bs8
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7299db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == -1 || i == -2 || i == -3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[LOOP:0: B:40:0x0056->B:39:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.o9o h() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gy6.h():tb.o9o");
    }

    public HttpURLConnection i(h3o h3oVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("b37deaa3", new Object[]{this, h3oVar});
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(h3oVar.f20395a).openConnection();
        httpURLConnection.setConnectTimeout(h3oVar.f);
        httpURLConnection.setReadTimeout(h3oVar.g);
        return httpURLConnection;
    }

    public void j(HttpURLConnection httpURLConnection, h3o h3oVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a787a45", new Object[]{this, httpURLConnection, h3oVar});
            return;
        }
        httpURLConnection.setRequestMethod(h3oVar.b);
        for (Map.Entry<String, String> entry : h3oVar.c.entrySet()) {
            if (!entry.getKey().equalsIgnoreCase("Cookie")) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (!StringUtils.isBlank(jt4.a(h3oVar.f20395a))) {
            httpURLConnection.addRequestProperty("Cookie", jt4.a(h3oVar.f20395a));
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            String str = h3oVar.e;
            TBSdkLog.i("qmtopsdk.DefaultCallImpl", str, "request url =" + h3oVar.f20395a);
            String str2 = h3oVar.e;
            TBSdkLog.i("qmtopsdk.DefaultCallImpl", str2, "request headers =" + httpURLConnection.getRequestProperties());
        }
        if ("POST".equalsIgnoreCase(h3oVar.b)) {
            httpURLConnection.setDoOutput(true);
        }
        l3o l3oVar = h3oVar.d;
        if (l3oVar != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", l3oVar.contentType());
            long contentLength = l3oVar.contentLength();
            if (contentLength != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                httpURLConnection.addRequestProperty("Content-Length", String.valueOf(contentLength));
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                try {
                    l3oVar.writeTo(outputStream);
                } catch (Exception e) {
                    TBSdkLog.e("qmtopsdk.DefaultCallImpl", "write outputstream error.", e);
                }
            } finally {
                xvj.b(outputStream);
            }
        }
    }

    public o9o k(HttpURLConnection httpURLConnection, h3o h3oVar) throws IOException {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o9o) ipChange.ipc$dispatch("c4fc7ed7", new Object[]{this, httpURLConnection, h3oVar});
        }
        if (!Thread.currentThread().isInterrupted()) {
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            if (responseMessage == null) {
                responseMessage = "";
            }
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            l(h3oVar.f20395a, headerFields);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                String str = h3oVar.e;
                TBSdkLog.i("qmtopsdk.DefaultCallImpl", str, "response headers:" + headerFields);
            }
            String contentType = httpURLConnection.getContentType();
            int contentLength = httpURLConnection.getContentLength();
            boolean a2 = xvj.a(headerFields);
            if (responseCode >= 400) {
                inputStream = httpURLConnection.getErrorStream();
            } else if (a2) {
                inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
            } else {
                inputStream = httpURLConnection.getInputStream();
            }
            a aVar = new a(this, contentType, contentLength, inputStream);
            if (!Thread.currentThread().isInterrupted()) {
                aVar.c();
                return new o9o.b().l(h3oVar).g(responseCode).i(responseMessage).h(HeaderHandlerUtil.cloneHeaderMap(headerFields)).d(aVar).e();
            }
            TBSdkLog.d("qmtopsdk.DefaultCallImpl", this.e, "[readResponse]call task is canceled.");
            throw new CancellationException("call canceled");
        }
        TBSdkLog.d("qmtopsdk.DefaultCallImpl", this.e, "[readResponse]call task is canceled.");
        throw new CancellationException("call canceled");
    }

    public void l(String str, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb144726", new Object[]{this, str, map});
        } else if (str != null && map != null) {
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (key.equalsIgnoreCase("Set-Cookie") || key.equalsIgnoreCase(HttpConstant.SET_COOKIE2))) {
                        for (String str2 : entry.getValue()) {
                            jt4.b(str, str2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
