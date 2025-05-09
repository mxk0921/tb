package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ta.utdid2.device.UTDevice;
import java.util.Locale;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vj7 {
    public static final String NETWORK_CLASS_WIFI = "Wi-Fi";

    /* renamed from: a  reason: collision with root package name */
    public static String f30041a = null;
    public static final String[] b = {"Unknown", "Unknown"};
    public static String c = null;
    public static String d = null;

    static {
        t2o.a(813695040);
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) % 256), (byte) ((i >> 16) % 256), (byte) ((i >> 8) % 256), (byte) (i % 256)};
    }

    public static String b() {
        try {
            return Locale.getDefault().getCountry();
        } catch (Exception e) {
            lgh.c("get country error ", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        if (r0 != null) goto L_0x0039;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c() {
        /*
            java.lang.String r0 = tb.vj7.f30041a
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r0 = "/proc/cpuinfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: all -> 0x0045, IOException -> 0x004a
            r2.<init>(r0)     // Catch: all -> 0x0045, IOException -> 0x004a
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: all -> 0x003d, IOException -> 0x0042
            r0.<init>(r2)     // Catch: all -> 0x003d, IOException -> 0x0042
        L_0x0012:
            java.lang.String r3 = r0.readLine()     // Catch: all -> 0x0032, IOException -> 0x0034
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "Hardware"
            boolean r4 = r3.contains(r4)     // Catch: all -> 0x0032, IOException -> 0x0034
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch: all -> 0x0032, IOException -> 0x0034
            r4 = 1
            r3 = r3[r4]     // Catch: all -> 0x0032, IOException -> 0x0034
            tb.vj7.f30041a = r3     // Catch: all -> 0x0032, IOException -> 0x0034
            r2.close()     // Catch: Exception -> 0x0031
            r0.close()     // Catch: Exception -> 0x0031
        L_0x0031:
            return r3
        L_0x0032:
            r1 = move-exception
            goto L_0x004e
        L_0x0034:
            goto L_0x0059
        L_0x0036:
            r2.close()     // Catch: Exception -> 0x0061
        L_0x0039:
            r0.close()     // Catch: Exception -> 0x0061
            goto L_0x0061
        L_0x003d:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x004e
        L_0x0042:
            r0 = r1
            goto L_0x0059
        L_0x0045:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x004e
        L_0x004a:
            r0 = r1
            r2 = r0
            goto L_0x0059
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch: Exception -> 0x0058
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch: Exception -> 0x0058
        L_0x0058:
            throw r1
        L_0x0059:
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch: Exception -> 0x0061
        L_0x005e:
            if (r0 == 0) goto L_0x0061
            goto L_0x0039
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vj7.c():java.lang.String");
    }

    public static String d(Context context) {
        String str = d;
        if (str != null) {
            return str;
        }
        String j = j();
        d = j;
        return j;
    }

    public static String e(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        String j = j();
        c = j;
        if (TextUtils.isEmpty(j)) {
            return "unknown";
        }
        return c;
    }

    public static String f() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e) {
            lgh.c("get country error ", e);
            return null;
        }
    }

    public static String g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    public static String[] h(Context context) {
        String[] strArr = b;
        if (context == null) {
            return strArr;
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            return strArr;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return strArr;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return strArr;
        }
        if (activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                strArr[0] = "Wi-Fi";
                return strArr;
            } else if (activeNetworkInfo.getType() == 0) {
                strArr[0] = g(activeNetworkInfo.getSubtype());
                strArr[1] = activeNetworkInfo.getSubtypeName();
            }
        }
        return strArr;
    }

    public static String i(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                int i3 = i ^ i2;
                i2 ^= i3;
                i = i3 ^ i2;
            }
            return i2 + "*" + i;
        } catch (Exception e) {
            lgh.c("DeviceUtils getResolution: error", e);
            return "Unknown";
        }
    }

    public static final String j() {
        try {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int nanoTime = (int) System.nanoTime();
            int nextInt = new Random().nextInt();
            int nextInt2 = new Random().nextInt();
            byte[] a2 = a(currentTimeMillis);
            byte[] a3 = a(nanoTime);
            byte[] a4 = a(nextInt);
            byte[] a5 = a(nextInt2);
            byte[] bArr = new byte[16];
            System.arraycopy(a2, 0, bArr, 0, 4);
            System.arraycopy(a3, 0, bArr, 4, 4);
            System.arraycopy(a4, 0, bArr, 8, 4);
            System.arraycopy(a5, 0, bArr, 12, 4);
            return up1.g(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String k(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Exception e) {
            lgh.c("get utdid error ", e);
            return null;
        }
    }
}
