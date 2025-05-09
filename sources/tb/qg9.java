package tb;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BUFF_SIZE = 4096;

    static {
        t2o.a(806355852);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5833c6e5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = Environment.getDownloadCacheDirectory().getAbsolutePath();
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            return str;
        }
        return str + str2;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a33a29a", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("../");
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83792107", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context.getExternalCacheDir() != null) {
            return context.getExternalCacheDir().getPath();
        }
        return context.getCacheDir().getPath();
    }

    public static String d(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3f43b33", new Object[]{context, str});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        try {
        } catch (Exception e) {
            str2 = context.getFilesDir().getAbsolutePath();
            q0h.a(f.f2692a, "getDiskFileDir EXP :" + e.getMessage());
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            if (!Environment.isExternalStorageRemovable()) {
            }
            str2 = context.getFilesDir().getAbsolutePath();
            return str2 + File.separator + str;
        }
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getAbsolutePath();
            return str2 + File.separator + str;
        }
        str2 = context.getFilesDir().getAbsolutePath();
        return str2 + File.separator + str;
    }

    public static String e(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a21f0f", new Object[]{str, str2});
        }
        File file = new File(str + File.separator + str2);
        if (!file.exists()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static void f(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be06471", new Object[]{str, str2});
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        String substring = name.substring(0, name.length() - 1);
                        new File(str2 + File.separator + substring).mkdirs();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        String str3 = File.separator;
                        sb.append(str3);
                        sb.append(name);
                        Log.e(f.f2692a, sb.toString());
                        File file = new File(str2 + str3 + name);
                        if (!file.exists()) {
                            Log.e(f.f2692a, "Create the file:" + str2 + str3 + name);
                            file.getParentFile().mkdirs();
                            file.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        fileOutputStream.close();
                    }
                }
            } else {
                zipInputStream.close();
                fileInputStream.close();
                return;
            }
        }
    }

    public static void g(String str, String str2, String str3) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ed2e44", new Object[]{str, str2, str3});
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            File file2 = new File(str + File.separator + str2);
            if (file2.exists() || file2.createNewFile()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(str3.getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
                return;
            }
            Log.e(f.f2692a, "文件创建失败");
        } else if (!file.mkdirs()) {
            Log.e(f.f2692a, "文件夹创建失败");
        }
    }
}
