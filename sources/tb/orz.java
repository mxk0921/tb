package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class orz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final orz INSTANCE = new orz();

    /* renamed from: a  reason: collision with root package name */
    public static final r2z f25605a = new r2z(0, 0, 3, null);

    static {
        t2o.a(598737214);
        t2o.a(598737206);
    }

    public void a(String str, g1a<? super byte[], xhv> g1aVar, g1a<? super String, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc728a5", new Object[]{this, str, g1aVar, g1aVar2});
            return;
        }
        ckf.g(str, "urlString");
        ckf.g(g1aVar, "onSuccess");
        ckf.g(g1aVar2, "onError");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("GET");
            r2z r2zVar = f25605a;
            httpURLConnection.setConnectTimeout(r2zVar.a());
            httpURLConnection.setReadTimeout(r2zVar.b());
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        inputStream.close();
                        Object byteArray = byteArrayOutputStream.toByteArray();
                        ckf.f(byteArray, "baos.toByteArray()");
                        g1aVar.invoke(byteArray);
                        iiz.Companion.j("文件下载完成");
                        return;
                    }
                }
            } else {
                g1aVar2.invoke(ckf.p("下载失败，HTTP错误码: ", Integer.valueOf(httpURLConnection.getResponseCode())));
                iiz.Companion.j(ckf.p("下载失败，HTTP错误码: ", Integer.valueOf(httpURLConnection.getResponseCode())));
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }
}
