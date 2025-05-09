package com.meizu.cloud.pushsdk.e.d;

import android.net.TrafficStats;
import com.meizu.cloud.pushsdk.e.d.k;
import com.meizu.cloud.pushsdk.e.h.c;
import com.meizu.cloud.pushsdk.e.h.d;
import com.meizu.cloud.pushsdk.e.h.g;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e implements com.meizu.cloud.pushsdk.e.d.a {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HttpURLConnection f5819a;
        final /* synthetic */ d b;

        public a(HttpURLConnection httpURLConnection, d dVar) {
            this.f5819a = httpURLConnection;
            this.b = dVar;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.l
        public d f() {
            return this.b;
        }
    }

    private HttpURLConnection b(i iVar) throws IOException {
        URL url = new URL(iVar.e().toString());
        if (MinSdkChecker.isSupportNotificationChannel()) {
            TrafficStats.setThreadStatsTag(2006537699);
        }
        HttpURLConnection a2 = a(url);
        a2.setConnectTimeout(60000);
        a2.setReadTimeout(60000);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        return a2;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.a
    public k a(i iVar) throws IOException {
        HttpURLConnection b = b(iVar);
        for (String str : iVar.c().a()) {
            String a2 = iVar.a(str);
            com.meizu.cloud.pushsdk.e.b.a.b("current header name " + str + " value " + a2);
            b.addRequestProperty(str, a2);
        }
        b(b, iVar);
        int responseCode = b.getResponseCode();
        return new k.b().a(responseCode).a(iVar.c()).a(b.getResponseMessage()).a(iVar).a(a(b)).a();
    }

    private static l a(HttpURLConnection httpURLConnection) throws IOException {
        if (!httpURLConnection.getDoInput()) {
            return null;
        }
        return new a(httpURLConnection, g.a(g.a(a(httpURLConnection.getResponseCode()) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream())));
    }

    private static void b(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        String str;
        String str2;
        int b = iVar.b();
        if (b != 0) {
            if (b == 1) {
                str2 = "POST";
            } else if (b == 2) {
                str2 = "PUT";
            } else if (b == 3) {
                str = "DELETE";
            } else if (b == 4) {
                str = "HEAD";
            } else if (b == 5) {
                str2 = "PATCH";
            } else {
                throw new IllegalStateException("Unknown method type.");
            }
            httpURLConnection.setRequestMethod(str2);
            a(httpURLConnection, iVar);
            return;
        }
        str = "GET";
        httpURLConnection.setRequestMethod(str);
    }

    public HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        j a2 = iVar.a();
        if (a2 != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", a2.b().toString());
            c a3 = g.a(g.a(httpURLConnection.getOutputStream()));
            a2.a(a3);
            a3.close();
        }
    }

    public static boolean a(int i) {
        return i >= 200 && i < 300;
    }
}
