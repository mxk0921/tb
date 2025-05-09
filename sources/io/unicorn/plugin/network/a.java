package io.unicorn.plugin.network;

import android.text.TextUtils;
import io.unicorn.plugin.network.ExternalAdapterNetworkProvider;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a implements ExternalAdapterNetworkProvider {

    /* renamed from: a  reason: collision with root package name */
    public volatile ExecutorService f15202a;

    /* compiled from: Taobao */
    /* renamed from: io.unicorn.plugin.network.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class RunnableC0858a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExternalAdapterNetworkProvider.Request f15203a;
        final /* synthetic */ ExternalAdapterNetworkProvider.RequestListener b;

        public RunnableC0858a(ExternalAdapterNetworkProvider.Request request, ExternalAdapterNetworkProvider.RequestListener requestListener) {
            this.f15203a = request;
            this.b = requestListener;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                io.unicorn.plugin.network.a r1 = io.unicorn.plugin.network.a.this     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                io.unicorn.plugin.network.ExternalAdapterNetworkProvider$Request r2 = r4.f15203a     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                java.net.HttpURLConnection r1 = io.unicorn.plugin.network.a.a(r1, r2)     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                int r2 = r1.getResponseCode()     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 < r3) goto L_0x0024
                r3 = 299(0x12b, float:4.19E-43)
                if (r2 > r3) goto L_0x0024
                java.io.InputStream r1 = r1.getInputStream()     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                io.unicorn.plugin.network.a r3 = io.unicorn.plugin.network.a.this     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                byte[] r0 = io.unicorn.plugin.network.a.b(r3, r1)     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                goto L_0x0033
            L_0x0020:
                r1 = move-exception
                goto L_0x003b
            L_0x0022:
                r1 = move-exception
                goto L_0x003b
            L_0x0024:
                io.unicorn.plugin.network.a r3 = io.unicorn.plugin.network.a.this     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                java.io.InputStream r1 = r1.getErrorStream()     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                java.lang.String r1 = io.unicorn.plugin.network.a.c(r3, r1)     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                java.lang.String r3 = "DefaultNetworkProvider"
                tb.hdh.b(r3, r1)     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
            L_0x0033:
                io.unicorn.plugin.network.ExternalAdapterNetworkProvider$RequestListener r1 = r4.b     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                if (r1 == 0) goto L_0x0046
                r1.onRequestFinish(r2, r0)     // Catch: IllegalArgumentException -> 0x0020, IOException -> 0x0022
                goto L_0x0046
            L_0x003b:
                r1.printStackTrace()
                io.unicorn.plugin.network.ExternalAdapterNetworkProvider$RequestListener r1 = r4.b
                if (r1 == 0) goto L_0x0046
                r2 = -1
                r1.onRequestFinish(r2, r0)
            L_0x0046:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.unicorn.plugin.network.a.RunnableC0858a.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadFactory f15204a = Executors.defaultThreadFactory();
        public int b = 0;
        public final String c;

        static {
            t2o.a(945815791);
        }

        public b(String str) {
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f15204a.newThread(runnable);
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("-");
            int i = this.b + 1;
            this.b = i;
            sb.append(i);
            newThread.setName(sb.toString());
            return newThread;
        }
    }

    static {
        t2o.a(945815789);
        t2o.a(945815794);
    }

    public HttpURLConnection d(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public final void e(Runnable runnable) {
        if (this.f15202a == null) {
            synchronized (a.class) {
                try {
                    if (this.f15202a == null) {
                        this.f15202a = new ThreadPoolExecutor(3, 3, 3000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b("unicorn_network"));
                        ((ThreadPoolExecutor) this.f15202a).allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ((ThreadPoolExecutor) this.f15202a).execute(runnable);
    }

    public final HttpURLConnection f(ExternalAdapterNetworkProvider.Request request) throws IOException {
        HttpURLConnection d = d(new URL(request.url));
        d.setConnectTimeout(request.timeout);
        d.setReadTimeout(request.timeout);
        d.setUseCaches(false);
        d.setDoInput(true);
        Map<String, String> map = request.params;
        if (map != null) {
            for (String str : map.keySet()) {
                d.addRequestProperty(str, request.params.get(str));
            }
        }
        if ("POST".equals(request.method) || "PUT".equals(request.method) || "PATCH".equals(request.method)) {
            d.setRequestMethod(request.method);
            if (request.body != null) {
                d.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(d.getOutputStream());
                dataOutputStream.write(request.body.getBytes());
                dataOutputStream.close();
            }
        } else if (!TextUtils.isEmpty(request.method)) {
            d.setRequestMethod(request.method);
        } else {
            d.setRequestMethod("GET");
        }
        return d;
    }

    public final String g(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[2048];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public final byte[] h(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int read = inputStream.read(bArr, 0, 2048);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // io.unicorn.plugin.network.ExternalAdapterNetworkProvider
    public void sendRequest(ExternalAdapterNetworkProvider.Request request, ExternalAdapterNetworkProvider.RequestListener requestListener) {
        e(new RunnableC0858a(request, requestListener));
    }
}
