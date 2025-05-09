package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j7b implements hvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597010);
        t2o.a(444597011);
    }

    @Override // tb.hvb
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aaa436e4", new Object[]{this, str});
        }
        return b(str, null, null);
    }

    public byte[] b(String str, String str2, DXTemplateItem dXTemplateItem) {
        BufferedInputStream bufferedInputStream;
        IOException e;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bd414b51", new Object[]{this, str, str2, dXTemplateItem});
        }
        if (TextUtils.isEmpty(str)) {
            la6.e(str + "下载链接为空");
            try {
                f fVar = new f(str2);
                f.a aVar = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_DOWNLOAD_ERROR_60023);
                aVar.e = "下载链接为空" + str;
                fVar.b = dXTemplateItem;
                fVar.c.add(aVar);
                ic5.p(fVar);
            } catch (Throwable th) {
                xv5.b(th);
            }
            return null;
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (IOException e2) {
            e = e2;
            bufferedInputStream = null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[2048];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    httpURLConnection.disconnect();
                    inputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    bufferedInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            try {
                f fVar2 = new f(str2);
                f.a aVar2 = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_DOWNLOAD_ERROR_60024);
                aVar2.e = "url: " + str + " stack: " + xv5.a(e);
                fVar2.b = dXTemplateItem;
                fVar2.c.add(aVar2);
                ic5.p(fVar2);
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Throwable th2) {
                xv5.b(th2);
            }
            return null;
        }
    }
}
