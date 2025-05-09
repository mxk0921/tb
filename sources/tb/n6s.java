package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f24546a = "yyyyMMdd";

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c786840", new Object[]{context})).booleanValue();
        }
        if (((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            return true;
        }
        return false;
    }

    public static boolean b(File file) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f348246", new Object[]{file})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            boolean z2 = true;
            for (File file2 : listFiles) {
                z2 &= b(file2);
            }
            z = z2;
        }
        file.delete();
        return z;
    }

    public static LogLevel c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("4a26c7aa", new Object[]{str});
        }
        LogLevel logLevel = LogLevel.L;
        if ("ERROR".equalsIgnoreCase(str)) {
            return LogLevel.E;
        }
        if ("WARN".equalsIgnoreCase(str)) {
            return LogLevel.W;
        }
        if ("INFO".equalsIgnoreCase(str)) {
            return LogLevel.I;
        }
        if ("DEBUG".equalsIgnoreCase(str)) {
            return LogLevel.D;
        }
        if ("VERBOSE".equalsIgnoreCase(str)) {
            return LogLevel.V;
        }
        return logLevel;
    }

    public static boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{file})).booleanValue();
        }
        if (!b(file) || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public static String e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5da7b309", new Object[]{new Long(j)});
        }
        return new SimpleDateFormat(f24546a).format(new Date(j));
    }

    public static String[] f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c542c4be", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = new long[i];
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = currentTimeMillis - (i2 * 86400000);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f24546a);
            for (int i3 = 0; i3 < i; i3++) {
                strArr[i3] = simpleDateFormat.format(new Date(jArr[i3]));
            }
            return strArr;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1f2ebe4", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean h(Context context) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ef874e", new Object[]{context})).booleanValue();
        }
        if (context == null || (sharedPreferences = context.getSharedPreferences(gjv.INNER_USER_CONFIG, 0)) == null) {
            return false;
        }
        return sharedPreferences.getBoolean(mk7.IS_INNER_USER, false);
    }

    public static Map<String, LogLevel> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af2ff400", new Object[]{str});
        }
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("off")) {
            return null;
        }
        String[] split = str.split(",");
        if (split != null) {
            hashMap = new HashMap();
            for (String str2 : split) {
                String[] split2 = str2.split("@");
                if (split2 != null && split2.length > 0) {
                    if (split2.length == 1) {
                        hashMap.put(split2[0], LogLevel.N);
                    } else if (split2.length == 2) {
                        hashMap.put(split2[0], c(split2[1]));
                    }
                }
            }
        }
        return hashMap;
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        bufferedReader.close();
                        fileInputStream.close();
                        return sb2;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean k(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ada8e84", new Object[]{file})).booleanValue();
        }
        if (!(file.exists() && file.isDirectory())) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z &= b(file2);
        }
        return z;
    }

    public static List<File> l(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a94561e", new Object[]{file, str});
        }
        ArrayList arrayList = null;
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    List<File> l = l(file2, str);
                    if (l != null && !l.isEmpty()) {
                        arrayList.addAll(l);
                    }
                } else if (file2.exists() && file2.getName().matches(str)) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    public static void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6c0efa", new Object[]{str, str2});
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            FileChannel channel = fileOutputStream.getChannel();
            channel.write(Charset.forName("utf8").encode(str2));
            channel.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean n(List<File> list, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e4a33f0", new Object[]{list, file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            WritableByteChannel newChannel = Channels.newChannel(zipOutputStream);
            try {
                for (File file2 : list) {
                    o(file2, null, zipOutputStream, newChannel);
                }
                if (newChannel != null) {
                    newChannel.close();
                }
                zipOutputStream.close();
                return true;
            } catch (Throwable th) {
                if (newChannel != null) {
                    try {
                        newChannel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (file.exists()) {
                file.delete();
            }
            return false;
        }
    }

    public static void o(File file, String str, ZipOutputStream zipOutputStream, WritableByteChannel writableByteChannel) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2890cd34", new Object[]{file, str, zipOutputStream, writableByteChannel});
        } else if (file != null) {
            if (TextUtils.isEmpty(str)) {
                str2 = file.getName();
            } else {
                str2 = str + file.getName();
            }
            try {
                if (file.isDirectory()) {
                    String str3 = str2 + "/";
                    zipOutputStream.putNextEntry(new ZipEntry(str3));
                    zipOutputStream.closeEntry();
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            o(file2, str3, zipOutputStream, writableByteChannel);
                        }
                        return;
                    }
                    return;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileChannel channel = fileInputStream.getChannel();
                    zipOutputStream.putNextEntry(new ZipEntry(str2));
                    channel.transferTo(0L, file.length(), writableByteChannel);
                    zipOutputStream.closeEntry();
                    channel.close();
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        t2o.a(767557654);
    }
}
