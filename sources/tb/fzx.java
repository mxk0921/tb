package tb;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f19651a = new AtomicLong(1);

    public static Pair<byte[], Pair<String, String>> a(File file) throws Exception {
        ByteBuffer byteBuffer;
        Throwable th;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1966f869", new Object[]{file});
        }
        try {
            byteBuffer = ByteBuffer.allocate(204800);
        } catch (OutOfMemoryError unused) {
            byteBuffer = ByteBuffer.allocate(131072);
        }
        FileInputStream fileInputStream = null;
        byte[] bArr = null;
        try {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                vtx vtxVar = new vtx();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                while (true) {
                    try {
                        int read = fileInputStream2.getChannel().read(byteBuffer);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(byteBuffer.array(), byteBuffer.arrayOffset(), read);
                        vtxVar.update(byteBuffer.array(), byteBuffer.arrayOffset(), read);
                        byteBuffer.clear();
                        i++;
                    } catch (NoSuchAlgorithmException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                String e3 = e(instance.digest());
                String valueOf = String.valueOf(vtxVar.getValue());
                if (i == 1) {
                    bArr = byteBuffer.array();
                }
                Pair<byte[], Pair<String, String>> pair = new Pair<>(bArr, new Pair(e3, valueOf));
                try {
                    fileInputStream2.close();
                } catch (Exception unused3) {
                }
                return pair;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (NoSuchAlgorithmException e4) {
            throw e4;
        } catch (Exception e5) {
            throw e5;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return Long.toString(f19651a.getAndIncrement() % 10000);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
    }

    public static Pair<ytx, kxx> b(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("37bb54cf", new Object[]{z6eVar});
        }
        if (z6eVar != null) {
            try {
                if (!TextUtils.isEmpty(z6eVar.getFilePath()) && !TextUtils.isEmpty(z6eVar.getBizType())) {
                    kxx kxxVar = new kxx();
                    kxxVar.f22995a = z6eVar.getFilePath();
                    kxxVar.e = z6eVar.getBizType();
                    kxxVar.h = z6eVar.getMetaInfo();
                    z6eVar.getFileType();
                    File file = new File(kxxVar.f22995a);
                    if (!file.exists()) {
                        return new Pair<>(new ytx("200", "3", "!file.exists()", false), null);
                    }
                    if (file.length() == 0) {
                        return new Pair<>(new ytx("200", "9", "file.length() == 0", false), null);
                    }
                    kxxVar.b = file;
                    kxxVar.c = file.getName();
                    Pair<byte[], Pair<String, String>> a2 = a(file);
                    kxxVar.k = (byte[]) a2.first;
                    Object obj = a2.second;
                    kxxVar.g = (String) ((Pair) obj).first;
                    kxxVar.l = (String) ((Pair) obj).second;
                    kxxVar.f = file.length();
                    kxxVar.j = file.lastModified();
                    kxxVar.m = g(file.getPath());
                    Map<String, String> map = kxxVar.h;
                    if (map != null) {
                        kxxVar.o = map.get("x-arup-track-id");
                        try {
                            String str = kxxVar.h.get("x-arup-page-background");
                            if (!TextUtils.isEmpty(str)) {
                                Integer.valueOf(str).intValue();
                            }
                        } catch (Exception e) {
                            if (rtx.d(16)) {
                                rtx.b(16, "ProtocolUtils", "pageBack format error", e);
                            }
                        }
                    }
                    return new Pair<>(null, kxxVar);
                }
            } catch (Exception e2) {
                if (rtx.d(16)) {
                    rtx.b(16, "ProtocolUtils", "createFileDescription", e2);
                }
                return new Pair<>(new ytx("200", "4", e2.toString(), false), null);
            }
        }
        return new Pair<>(new ytx("200", "4", "task getFilePath == null || getBizType == null", false), null);
    }
}
