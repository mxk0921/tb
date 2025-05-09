package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ew0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f18844a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(774897952);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            if (Pattern.matches("cpu[0-9]", file.getName())) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(774897951);
    }

    public static long a(gf4 gf4Var, String str, String str2, String str3) {
        String str4;
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8bbb991", new Object[]{gf4Var, str, str2, str3})).longValue();
        }
        if (gf4Var != null && !TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str3)) {
                str4 = str2 + "-" + str3;
            } else {
                str4 = str2;
            }
            String str5 = null;
            try {
                config = gf4Var.getConfig(str, "GrtnInitialDelayWithBusinessIds", null);
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(config)) {
                return 0L;
            }
            JSONObject parseObject = JSON.parseObject(config);
            str5 = parseObject.getString(str4.toUpperCase());
            if (TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str2)) {
                str5 = parseObject.getString((str2 + "-*").toUpperCase());
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = parseObject.getString("ALL_BIZCODE");
            }
            if (TextUtils.isEmpty(str5)) {
                return 0L;
            }
            long v = v(str5);
            if (v >= 10 && v <= 10000) {
                return v;
            }
        }
        return 0L;
    }

    public static String b(String str, StringBuilder sb) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d4ead18", new Object[]{str, sb});
        }
        try {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            if (TextUtils.isEmpty(encodedQuery)) {
                str2 = sb.toString();
            } else {
                str2 = ((Object) sb) + "&" + encodedQuery;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme()).encodedAuthority(parse.getEncodedAuthority()).encodedPath(parse.getEncodedPath()).encodedQuery(str2).fragment(parse.getEncodedFragment());
            return builder.build().toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4eb46ab", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Uri.parse(str).getQueryParameter(str2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd8eb3f5", new Object[0]);
        }
        return System.currentTimeMillis() + "_" + new Random().nextInt(1000);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17a93efc", new Object[0]);
        }
        String str = Build.HARDWARE;
        return "qcom".equals(str) ? Build.BOARD : str;
    }

    public static List<String> f(String str, Boolean[] boolArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("263103c7", new Object[]{str, boolArr});
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < parseArray.size(); i++) {
                try {
                    if (!TextUtils.isEmpty(parseArray.getString(i))) {
                        String string = parseArray.getString(i);
                        if (boolArr == null || !"*".equals(string)) {
                            arrayList.add(string);
                        } else {
                            boolArr[0] = Boolean.TRUE;
                            return arrayList;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String g(int i) {
        String str;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14999176", new Object[]{new Integer(i)});
        }
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = new ProcessBuilder("/system/bin/cat", String.format("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i))).start().getInputStream();
            str = "";
            if (inputStream2 != null) {
                while (inputStream2.read(new byte[24]) != -1) {
                    str = str + new String(bArr);
                }
                inputStream2.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            str = "N/A";
        }
        AVSDKLog.d(tfb.MODULE_SDK_PAGE, "CPU max freq: " + str.trim());
        return str.trim();
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "CPU Count: Failed.");
            e.printStackTrace();
            return 1;
        }
    }

    public static String k(Exception exc) {
        Throwable th;
        PrintWriter printWriter;
        StringWriter stringWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c22df4", new Object[]{exc});
        }
        if (exc == null) {
            return "";
        }
        StringWriter stringWriter2 = null;
        try {
            try {
                stringWriter = new StringWriter();
                try {
                    printWriter = new PrintWriter(stringWriter);
                } catch (Throwable th2) {
                    th = th2;
                    printWriter = null;
                }
            } catch (Throwable th3) {
                th = th3;
                printWriter = null;
            }
            try {
                exc.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.flush();
                try {
                    stringWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                printWriter.close();
                return stringWriter.toString();
            } catch (Throwable th4) {
                th = th4;
                stringWriter2 = stringWriter;
                if (stringWriter2 != null) {
                    try {
                        stringWriter2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                if (printWriter != null) {
                    printWriter.close();
                }
                throw th;
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2526c5e3", new Object[]{context});
        }
        if (f18844a == null) {
            synchronized (ew0.class) {
                try {
                    if (context == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder("appVersion/");
                    try {
                        sb.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        sb.append("unknown");
                    }
                    sb.append(";appID/");
                    sb.append(context.getPackageName());
                    sb.append(";systemVersion/");
                    sb.append(Build.VERSION.SDK_INT);
                    sb.append(";systemName/Android");
                    f18844a = sb.toString();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18844a;
    }

    public static String m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37e478ed", new Object[]{str, str2});
        }
        return str + "_" + str2;
    }

    public static boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbdda4c", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            if ("*".equals(str2)) {
                return true;
            }
            Boolean[] boolArr = {Boolean.FALSE};
            List<String> f = f(str2, boolArr);
            if (boolArr[0].booleanValue()) {
                return true;
            }
            if (!TextUtils.isEmpty(str) && f != null) {
                for (String str3 : f) {
                    if (!TextUtils.isEmpty(str3)) {
                        if (str3.equalsIgnoreCase(str)) {
                            return true;
                        }
                        if ("TRIVER_*".equals(str3) && str.startsWith("TRIVER_")) {
                            return true;
                        }
                        if ("SPM_*".equals(str3) && str.startsWith("SPM_")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean o(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f488d21", new Object[]{new Integer(i), str})).booleanValue();
        }
        if ("*".equals(str)) {
            return true;
        }
        ArrayList<Integer> arrayList = null;
        try {
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < parseArray.size(); i2++) {
                    try {
                        if (!TextUtils.isEmpty(parseArray.getString(i2))) {
                            arrayList2.add(parseArray.getInteger(i2));
                        }
                    } catch (Throwable unused) {
                    }
                }
                arrayList = arrayList2;
            }
        } catch (Throwable unused2) {
        }
        if (arrayList != null) {
            for (Integer num : arrayList) {
                if (num.intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a983e1d", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            if ("*".equals(str2)) {
                return true;
            }
            Boolean[] boolArr = {Boolean.FALSE};
            List<String> f = f(str2, boolArr);
            if (boolArr[0].booleanValue()) {
                return true;
            }
            if (!TextUtils.isEmpty(str) && f != null) {
                for (String str3 : f) {
                    if (!TextUtils.isEmpty(str3) && Pattern.matches(str3, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4de1d4bc", new Object[0])).booleanValue();
        }
        String lowerCase = Build.HARDWARE.toLowerCase();
        return lowerCase.contains("qcom") || lowerCase.contains("qualcomm") || lowerCase.equalsIgnoreCase("msm") || lowerCase.startsWith("sdm");
    }

    public static boolean r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d5ebdb4", new Object[]{str, str2})).booleanValue();
        }
        List<String> f = f(str2, null);
        if (!TextUtils.isEmpty(str) && f != null) {
            for (String str3 : f) {
                if (!TextUtils.isEmpty(str3) && str.startsWith(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static float t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static int u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String w(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f24388d", new Object[]{str, list});
        }
        if (list == null || list.size() == 0) {
            return str;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            str = str.replaceAll("&?" + it.next() + "=[^&]*", "");
        }
        return str.replaceFirst("[?]&", "?");
    }

    public static String x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("152e3828", new Object[]{str, str2});
        }
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme()).encodedAuthority(parse.getHost()).encodedPath(str2);
            return builder.build().toString();
        } catch (Exception e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "replaceUriPath error " + e.toString());
            return str;
        }
    }

    public static boolean y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb48958", new Object[]{str, str2})).booleanValue();
        }
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            return false;
        }
        if (length != length2) {
            str = str.substring(0, length2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static HashMap<String, String> z(String str, String str2, String str3) {
        String[] split;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ce563498", new Object[]{str, str2, str3});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            for (String str4 : str.split(str2)) {
                int indexOf = str4.indexOf(str3);
                int length = str4.length();
                if (indexOf > 0 && (i = indexOf + 1) < length) {
                    hashMap.put(str4.substring(0, indexOf), str4.substring(i, length));
                }
            }
        }
        return hashMap;
    }

    public static int i(gf4 gf4Var, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("688d3710", new Object[]{gf4Var, str, str2, new Integer(i)})).intValue();
        }
        String str3 = null;
        try {
            JSONObject parseObject = JSON.parseObject(gf4Var.getConfig(str, "PlayerCoreType1", null));
            str3 = parseObject.getString(str2.toUpperCase());
            if (TextUtils.isEmpty(str3)) {
                str3 = parseObject.getString("ALL_BIZCODE");
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str3)) {
            if ("mediaplayer".equals(str3)) {
                return 2;
            }
            if ("ijkplayer".equals(str3)) {
                return 1;
            }
            if ("taobaoplayer".equals(str3)) {
                return 3;
            }
        }
        return i;
    }

    public static int j(gf4 gf4Var, String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9923406", new Object[]{gf4Var, str, str2, str3, new Integer(i)})).intValue();
        }
        String str4 = null;
        try {
            JSONObject parseObject = JSON.parseObject(gf4Var.getConfig(str, "PlayerCoreType1", null));
            str4 = parseObject.getString(str3.toUpperCase());
            if (TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str2)) {
                str4 = parseObject.getString((str2 + "-*").toUpperCase());
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = parseObject.getString("ALL_BIZCODE");
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str4)) {
            if ("mediaplayer".equals(str4)) {
                return 2;
            }
            if ("ijkplayer".equals(str4)) {
                return 1;
            }
            if ("taobaoplayer".equals(str4)) {
                return 3;
            }
        }
        return i;
    }
}
