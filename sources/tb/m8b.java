package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class m8b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f23843a = null;

        static {
            t2o.a(962592942);
        }
    }

    public a a(String str) {
        Throwable th;
        IOException e;
        DataInputStream dataInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e3daaebc", new Object[]{this, str});
        }
        a aVar = new a();
        if (TextUtils.isEmpty(str)) {
            return aVar;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (httpURLConnection != null) {
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setDoInput(true);
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    System.currentTimeMillis();
                    try {
                        httpURLConnection.connect();
                        try {
                            httpURLConnection.getResponseCode();
                        } catch (IOException e2) {
                            nhh.f("HttpsUtil", e2);
                        }
                        System.currentTimeMillis();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataInputStream dataInputStream2 = null;
                        try {
                            try {
                                dataInputStream = new DataInputStream(httpURLConnection.getInputStream());
                            } catch (IOException e3) {
                                e = e3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = dataInputStream.read(bArr, 0, 2048);
                                if (read != -1) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } else {
                                    try {
                                        break;
                                    } catch (Exception e4) {
                                        nhh.f("HttpsUtil", e4);
                                    }
                                }
                            }
                            dataInputStream.close();
                            if (byteArrayOutputStream.size() > 0) {
                                aVar.f23843a = byteArrayOutputStream.toByteArray();
                            }
                        } catch (IOException e5) {
                            e = e5;
                            dataInputStream2 = dataInputStream;
                            nhh.h("HttpsUtil", e, new Object[0]);
                            if (dataInputStream2 != null) {
                                try {
                                    dataInputStream2.close();
                                } catch (Exception e6) {
                                    nhh.f("HttpsUtil", e6);
                                }
                            }
                            return aVar;
                        } catch (Throwable th3) {
                            th = th3;
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                try {
                                    dataInputStream2.close();
                                } catch (Exception e7) {
                                    nhh.f("HttpsUtil", e7);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e8) {
                        nhh.h("HttpsUtil", e8, new Object[0]);
                        System.currentTimeMillis();
                        return aVar;
                    }
                } catch (ProtocolException e9) {
                    nhh.h("HttpsUtil", e9, new Object[0]);
                }
            }
            return aVar;
        } catch (MalformedURLException e10) {
            nhh.h("HttpsUtil", e10, new Object[0]);
            return aVar;
        } catch (IOException e11) {
            nhh.h("HttpsUtil", e11, new Object[0]);
            return aVar;
        }
    }

    static {
        t2o.a(962592941);
        System.setProperty("http.keepAlive", "true");
    }
}
