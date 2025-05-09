package tb;

import com.unionpay.utils.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class czx {

    /* renamed from: a  reason: collision with root package name */
    public String f17476a = null;
    public InputStream b = null;
    public final x3y c;
    public final String d;

    public czx(x3y x3yVar, String str) {
        this.c = x3yVar;
        this.d = str;
    }

    public final int a() {
        InputStream inputStream;
        HttpsURLConnection httpsURLConnection;
        x3y x3yVar = this.c;
        int i = 1;
        try {
            try {
                if (x3yVar == null) {
                    return 1;
                }
                try {
                    try {
                        try {
                            try {
                                URL a2 = x3yVar.a();
                                if ("https".equals(a2.getProtocol().toLowerCase())) {
                                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) a2.openConnection();
                                    httpsURLConnection2.setSSLSocketFactory(new ptx(this.d).a().getSocketFactory());
                                    httpsURLConnection = httpsURLConnection2;
                                } else {
                                    httpsURLConnection = (HttpURLConnection) a2.openConnection();
                                }
                                httpsURLConnection.setRequestMethod(x3yVar.c());
                                httpsURLConnection.setReadTimeout(60000);
                                httpsURLConnection.setConnectTimeout(30000);
                                httpsURLConnection.setInstanceFollowRedirects(true);
                                httpsURLConnection.setUseCaches(false);
                                String c = x3yVar.c();
                                int hashCode = c.hashCode();
                                if (hashCode == 70454) {
                                    c.equals("GET");
                                } else if (hashCode == 2461856 && c.equals("POST")) {
                                    httpsURLConnection.setDoOutput(true);
                                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream(), "UTF-8");
                                    outputStreamWriter.write(x3yVar.e());
                                    outputStreamWriter.flush();
                                    outputStreamWriter.close();
                                }
                                httpsURLConnection.connect();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    InputStream inputStream2 = httpsURLConnection.getInputStream();
                                    this.b = inputStream2;
                                    if (inputStream2 != null) {
                                        this.f17476a = a.c(inputStream2, "UTF-8");
                                        i = 0;
                                    }
                                } else if (httpsURLConnection.getResponseCode() == 401) {
                                    i = 8;
                                } else if (httpsURLConnection.getResponseCode() == 404) {
                                    i = 22;
                                } else {
                                    httpsURLConnection.getResponseCode();
                                }
                                inputStream = this.b;
                                if (inputStream == null) {
                                    return i;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                inputStream = this.b;
                                if (inputStream == null) {
                                    return 1;
                                }
                            }
                        } catch (IllegalStateException e2) {
                            e2.printStackTrace();
                            inputStream = this.b;
                            if (inputStream == null) {
                                return 1;
                            }
                        }
                    } catch (SSLHandshakeException e3) {
                        e3.printStackTrace();
                        try {
                            InputStream inputStream3 = this.b;
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                        } catch (Exception unused) {
                        }
                        return 4;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                    inputStream = this.b;
                    if (inputStream == null) {
                        return 1;
                    }
                }
                inputStream.close();
                return i;
            } catch (Exception unused2) {
                return i;
            }
        } catch (Throwable th) {
            try {
                InputStream inputStream4 = this.b;
                if (inputStream4 != null) {
                    inputStream4.close();
                }
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final String b() {
        return this.f17476a;
    }
}
