package com.uc.webview.internal.setup.download.impl;

import android.text.TextUtils;
import com.uc.webview.base.Log;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    int f14457a = 5000;
    int b = 5000;
    Map<String, String> c = null;
    int d = 0;
    long e = 0;
    long f = 0;
    private String g;
    private a h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(InputStream inputStream);
    }

    public b(String str, a aVar) {
        this.g = str;
        this.h = aVar;
    }

    public final boolean a() {
        return this.h == null ? a(this.g, null) : a(this.g);
    }

    public final boolean b() {
        int i = this.d;
        if (i < 200 || i > 303) {
            return false;
        }
        return true;
    }

    private boolean a(String str, URL url) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Log.d("UpdRequest", "startHead url:" + str + ", ref:" + url);
        try {
            httpURLConnection = a(str, url, true);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.connect();
            this.d = httpURLConnection.getResponseCode();
            if (!b()) {
                Log.d("UpdRequest", "startHead failed, httpCode:" + this.d);
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable unused) {
                }
                return false;
            }
            switch (this.d) {
                case 300:
                case 301:
                case 302:
                case 303:
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        Log.d("UpdRequest", "startHead failed, location is empty");
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused2) {
                        }
                        return false;
                    }
                    boolean a2 = a(headerField, new URL(url, str));
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused3) {
                    }
                    return a2;
                default:
                    long contentLength = httpURLConnection.getContentLength();
                    this.e = contentLength;
                    if (contentLength <= 0) {
                        Log.d("UpdRequest", "startHead failed, invalid size:" + this.e);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused4) {
                        }
                        return false;
                    }
                    this.f = httpURLConnection.getLastModified();
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused5) {
                    }
                    return true;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                Log.d("UpdRequest", "startHead failed", th);
                return false;
            } finally {
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused6) {
                    }
                }
            }
        }
    }

    private boolean a(String str) {
        Log.d("UpdRequest", "start url:".concat(String.valueOf(str)));
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a2 = a(str, null, false);
            a2.connect();
            this.d = a2.getResponseCode();
            if (!b()) {
                Log.d("UpdRequest", "start failed, error httpCode:" + this.d);
                try {
                    a2.disconnect();
                } catch (Throwable unused) {
                }
                return false;
            }
            this.e = a2.getContentLength();
            this.f = a2.getLastModified();
            this.h.a(a2.getInputStream());
            try {
                a2.disconnect();
                return true;
            } catch (Throwable unused2) {
                return true;
            }
        } catch (Throwable th) {
            try {
                Log.d("UpdRequest", "start failed", th);
                return false;
            } finally {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    private HttpURLConnection a(String str, URL url, boolean z) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url, str).openConnection();
        if (z) {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("HEAD");
        } else {
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("GET");
        }
        httpURLConnection.setConnectTimeout(this.f14457a);
        httpURLConnection.setReadTimeout(this.b);
        Map<String, String> map = this.c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return httpURLConnection;
    }
}
