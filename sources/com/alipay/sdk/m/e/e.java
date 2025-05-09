package com.alipay.sdk.m.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.m.d.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import tb.pg1;
import tb.tck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(a aVar, byte[] bArr) {
        BigInteger modulus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f60558a", new Object[]{aVar, bArr});
        }
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("149a1ee1", new Object[]{str});
        }
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static Map<String, String> c(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{str});
        }
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), d(str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static boolean e(PackageInfo packageInfo) {
        Signature[] signatureArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf2c343", new Object[]{packageInfo})).booleanValue();
        }
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
            return false;
        }
        return true;
    }

    public static DisplayMetrics f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("ac51d8a2", new Object[]{context});
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        String c = c();
        String b = b();
        String a2 = a(context);
        String c2 = c(context);
        return " (" + c + ";" + b + ";" + a2 + ";;" + c2 + ")(sdk android)";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String d = d();
        int indexOf = d.indexOf("-");
        if (indexOf != -1) {
            d = d.substring(0, indexOf);
        }
        int indexOf2 = d.indexOf("\n");
        if (indexOf2 != -1) {
            d = d.substring(0, indexOf2);
        }
        return "Linux " + d;
    }

    public static b a(a aVar, Context context, List<c> list) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a3b7c0f1", new Object[]{aVar, context, list});
        }
        if (list == null) {
            return null;
        }
        for (c cVar : list) {
            if (cVar != null && (b = b(context, cVar.f4526a, cVar.b, cVar.c)) != null && !b.a(aVar) && !b.a()) {
                return b;
            }
        }
        return null;
    }

    public static b b(Context context, String str, int i, String str2) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2c36afb8", new Object[]{context, str, new Integer(i), str2});
        }
        try {
            packageInfo = a(context, str);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (!e(packageInfo)) {
            return null;
        }
        return c(packageInfo, i, str2);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (!matcher.matches() || matcher.groupCount() < 4) {
                return "Unavailable";
            }
            return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static PackageInfo a(Context context, String str) throws PackageManager.NameNotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PackageInfo) ipChange.ipc$dispatch("93a5c43", new Object[]{context, str}) : context.getPackageManager().getPackageInfo(str, tck.DETECT_WIDTH);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : context.getResources().getConfiguration().locale.toString();
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        DisplayMetrics f = f(context);
        return f.widthPixels + "*" + f.heightPixels;
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append((char) Math.round((Math.random() * 25.0d) + 65.0d));
            } else if (nextInt == 1) {
                sb.append((char) Math.round((Math.random() * 25.0d) + 97.0d));
            } else if (nextInt == 2) {
                sb.append(new Random().nextInt(10));
            }
        }
        return sb.toString();
    }

    public static b c(PackageInfo packageInfo, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4c45c3cd", new Object[]{packageInfo, new Integer(i), str});
        }
        if (packageInfo == null) {
            return null;
        }
        return new b(packageInfo, i, str);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static <T> T a(WeakReference<T> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7adabc", new Object[]{weakReference});
        }
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
