package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class itw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_CAPTURE_IMAGE = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=";
    public static final String URL_DATA_CHAR = "?";
    public static final String URL_SEPARATOR = "//";

    static {
        t2o.a(989856311);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.graphics.Bitmap r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.itw.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "54d16232"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r0 = 0
            if (r4 == 0) goto L_0x0054
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x003b, IOException -> 0x003d
            r1.<init>()     // Catch: all -> 0x003b, IOException -> 0x003d
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: all -> 0x0036, IOException -> 0x0039
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: all -> 0x0036, IOException -> 0x0039
            r1.flush()     // Catch: all -> 0x0036, IOException -> 0x0039
            r1.close()     // Catch: all -> 0x0036, IOException -> 0x0039
            byte[] r4 = r1.toByteArray()     // Catch: all -> 0x0036, IOException -> 0x0039
            r2 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r2)     // Catch: all -> 0x0036, IOException -> 0x0039
            r4 = r0
            r0 = r1
            goto L_0x0055
        L_0x0036:
            r4 = move-exception
            r0 = r1
            goto L_0x004b
        L_0x0039:
            r4 = move-exception
            goto L_0x003f
        L_0x003b:
            r4 = move-exception
            goto L_0x004b
        L_0x003d:
            r4 = move-exception
            r1 = r0
        L_0x003f:
            r4.printStackTrace()     // Catch: all -> 0x0036
            if (r1 == 0) goto L_0x005e
            r1.flush()     // Catch: Exception -> 0x005e
            r1.close()     // Catch: Exception -> 0x005e
            goto L_0x005e
        L_0x004b:
            if (r0 == 0) goto L_0x0053
            r0.flush()     // Catch: Exception -> 0x0053
            r0.close()     // Catch: Exception -> 0x0053
        L_0x0053:
            throw r4
        L_0x0054:
            r4 = r0
        L_0x0055:
            if (r0 == 0) goto L_0x005d
            r0.flush()     // Catch: Exception -> 0x005d
            r0.close()     // Catch: Exception -> 0x005d
        L_0x005d:
            r0 = r4
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.itw.a(android.graphics.Bitmap):java.lang.String");
    }

    public static String c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10b44240", new Object[]{l});
        }
        return "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + l;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8217fe59", new Object[]{context})).booleanValue();
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("500f2a51", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        if (str.startsWith(URL_SEPARATOR)) {
            str = "http:".concat(str);
        } else if (!str.contains(HttpConstant.SCHEME_SPLIT)) {
            str = h1p.HTTP_PREFIX.concat(str);
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        return parse.getHost();
    }

    public static long e(Bitmap bitmap) throws IOException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("955b1a40", new Object[]{bitmap})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        oqw oqwVar = new oqw();
        oqwVar.c = ql7.c("//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + currentTimeMillis);
        oqwVar.d = "image/jpeg";
        oqwVar.f25584a = System.currentTimeMillis() + pqw.DEFAULT_MAX_AGE;
        opw.e().i(oqwVar, new byte[]{0});
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(opw.e().b(true), oqwVar.c));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.close();
                return currentTimeMillis;
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                    return 0L;
                }
                fileOutputStream.close();
                return 0L;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
