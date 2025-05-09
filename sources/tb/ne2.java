package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ut.device.UTDevice;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ne2 {

    /* renamed from: a  reason: collision with root package name */
    public static String f24674a = null;

    static {
        t2o.a(813695001);
    }

    public static String a(String str, Context context) {
        String str2 = zap.b().d;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (f24674a == null) {
            try {
                f24674a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                f24674a = "Unknown";
            }
        }
        String str4 = zap.b().e;
        if (str4 != null) {
            str3 = str4;
        }
        String utdid = UTDevice.getUtdid(context);
        String str5 = "ak=" + str + "&av=" + str2 + "&avsys=" + f24674a + "&c=" + str3 + "&d=" + utdid + "&sv=6.5.1.3";
        lgh.d("send url :".concat(str5));
        return str5;
    }

    public static byte[] b(String str, Context context, Map<String, String> map) throws Exception {
        return c(str, context, map, 1);
    }

    public static byte[] c(String str, Context context, Map<String, String> map, int i) throws Exception {
        byte[] a2 = eoa.a(d(str, context, map));
        if (a2 == null || a2.length >= 16777216) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(jp2.d(a2.length));
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write((byte) 9);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(a2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            lgh.b(e.toString());
        }
        return byteArray;
    }

    public static byte[] d(String str, Context context, Map<String, String> map) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String a2 = a(str, context);
        if (a2.length() > 0) {
            byteArrayOutputStream.write(jp2.c(a2.getBytes().length));
            byteArrayOutputStream.write(a2.getBytes());
        } else {
            byteArrayOutputStream.write(jp2.c(0));
        }
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                byteArrayOutputStream.write(jp2.e(Integer.parseInt(str2)));
                String str3 = map.get(str2);
                if (str3 != null) {
                    byteArrayOutputStream.write(jp2.e(str3.getBytes().length));
                    byteArrayOutputStream.write(str3.getBytes());
                } else {
                    byteArrayOutputStream.write(jp2.e(0));
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            lgh.b(e.toString());
        }
        return byteArray;
    }

    public static int e(byte[] bArr) {
        int i = -1;
        if (bArr == null || bArr.length < 12) {
            lgh.b("recv errCode UNKNOWN_ERROR");
        } else {
            boolean z = true;
            if (jp2.b(bArr, 1, 3) + 8 != bArr.length) {
                lgh.b("recv len error");
            } else {
                if (1 != (bArr[5] & 1)) {
                    z = false;
                }
                i = jp2.b(bArr, 8, 4);
                int length = bArr.length - 12 >= 0 ? bArr.length - 12 : 0;
                if (length > 0) {
                    if (z) {
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 12, bArr2, 0, length);
                        byte[] b = eoa.b(bArr2);
                        new String(b, 0, b.length);
                    } else {
                        new String(bArr, 12, length);
                    }
                }
            }
        }
        lgh.a("errCode:" + i);
        return i;
    }
}
