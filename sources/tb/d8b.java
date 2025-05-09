package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d8b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(950009889);
    }

    public String getResponse(String str) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee87cc98", new Object[]{this, str});
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = httpURLConnection.getInputStream().read(bArr);
                    if (-1 != read) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        httpURLConnection.disconnect();
                        return str2;
                    }
                }
            } else {
                httpURLConnection.disconnect();
                return "";
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                th.printStackTrace();
                return null;
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }
}
