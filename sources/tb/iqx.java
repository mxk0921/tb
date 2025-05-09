package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.model.ZCacheResourceResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class iqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856361);
    }

    @Deprecated
    public static String getLocPathByUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6df5f26", new Object[]{str, new Boolean(z)});
        }
        return "";
    }

    @Deprecated
    public static String getStreamByUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9528cd63", new Object[]{str, str2});
        }
        return null;
    }

    @Deprecated
    public static String getStreamByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53ae132d", new Object[]{str});
        }
        InputStream inputStreamByUrl = getInputStreamByUrl(str);
        if (inputStreamByUrl == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStreamByUrl.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static InputStream getInputStreamByUrl(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("c225c158", new Object[]{str});
        }
        String b = gtw.b(gtw.i(str));
        fpx.a().b();
        ZCacheResourceResponse b2 = gpx.d().b(b);
        StringBuilder sb = new StringBuilder("getInputStreamByUrl，url=[");
        sb.append(b);
        sb.append("], with response=[");
        if (b2 != null && b2.isSuccess) {
            z = true;
        }
        sb.append(z);
        sb.append("]");
        v7t.i("ZCache", sb.toString());
        if (b2 == null || !b2.isSuccess) {
            return null;
        }
        return b2.inputStream;
    }
}
