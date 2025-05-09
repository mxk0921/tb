package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e2n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final String LOG_TAG = "ProxyCache";
    public static final int MAX_ARRAY_PREVIEW = 16;

    static {
        t2o.a(774897902);
    }

    public static void a(byte[] bArr, long j, int i) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b17df3", new Object[]{bArr, new Long(j), new Integer(i)});
            return;
        }
        epm.c(bArr, "Buffer must be not null!");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        epm.a(z, "Data offset must be positive!");
        if (i < 0 || i > bArr.length) {
            z2 = false;
        }
        epm.a(z2, "Length must be in range [0..buffer.length]");
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return stringBuffer.toString();
    }

    public static void c(ParcelableInputStream parcelableInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1f866c", new Object[]{parcelableInputStream});
        } else if (parcelableInputStream != null) {
            try {
                parcelableInputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2096a668", new Object[]{str});
        }
        try {
            return b(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("803d4c81", new Object[]{str});
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc246f1a", new Object[]{str});
        }
        String queryParameter = Uri.parse(str).getQueryParameter(a7m.VIDEO_CACHE_ID);
        return TextUtils.isEmpty(queryParameter) ? e(str) : queryParameter;
    }

    public static String i(String str) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9656dcf7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf2 = str.lastIndexOf(35);
        if (lastIndexOf2 > 0) {
            str = str.substring(0, lastIndexOf2);
        }
        int lastIndexOf3 = str.lastIndexOf(63);
        if (lastIndexOf3 > 0) {
            str = str.substring(0, lastIndexOf3);
        }
        int lastIndexOf4 = str.lastIndexOf(47);
        if (lastIndexOf4 >= 0) {
            str = str.substring(lastIndexOf4 + 1);
        }
        if (str.isEmpty() || !Pattern.matches("[a-zA-Z_0-9\\@\\.\\-\\(\\)\\%]+", str) || (lastIndexOf = str.lastIndexOf(46)) < 0) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bcdb571", new Object[]{str});
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String i = i(str);
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(i);
    }
}
