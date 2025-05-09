package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pw9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMA = ",";

    public static String a(v9f v9fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafa73b3", new Object[]{v9fVar, str});
        }
        String str2 = (String) zv7.a(xh4.f31395a, str, "");
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str2.split(",");
        if (v9fVar.f == null) {
            v9fVar.f = new File[split.length];
            for (int i = 0; i < split.length; i++) {
                File[] fileArr = v9fVar.f;
                fileArr[i] = v9fVar.k(i + "");
                String[] split2 = split[i].split("-");
                if (split2 != null && split2.length == 3) {
                    long parseLong = Long.parseLong(split2[0]);
                    long parseLong2 = Long.parseLong(split2[1]);
                    long j = (parseLong2 - parseLong) + 1;
                    long d = v9fVar.d(v9fVar.f[i], j);
                    if (d != j) {
                        if (sb.toString().length() > 0) {
                            sb.append(",");
                        }
                        sb.append(parseLong + d);
                        sb.append("-");
                        sb.append(parseLong2);
                        sb.append("-");
                        sb.append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd7310", new Object[]{str});
        } else {
            zv7.b(xh4.f31395a, str);
        }
    }

    public static long c(File[] fileArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f4dc8a4", new Object[]{fileArr, new Integer(i)})).longValue();
        }
        long j = 0;
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                long b = mg9.b(file);
                fs7.e("Downloader.FragmentBoostUtils", "id: " + i + ", getFragmentFilesSize " + file.getName() + ", " + b, new Object[0]);
                j += b;
            }
        }
        return j;
    }

    public static boolean e(String str, String str2, int i) {
        int i2;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55f1fa6", new Object[]{str, str2, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || str2.split(",") == null || (length = str2.split(",").length) == 0) {
            StringBuilder sb = new StringBuilder("id: ");
            sb.append(i);
            sb.append(", saveFileFragmentContext url=");
            sb.append(str);
            sb.append(", fragmentListSize = ");
            if (str2 == null) {
                i2 = "null";
            } else {
                i2 = 0;
            }
            sb.append(i2);
            fs7.e("Downloader.FragmentBoostUtils", sb.toString(), new Object[0]);
            return false;
        }
        String str3 = (String) zv7.a(xh4.f31395a, str, "");
        if (!TextUtils.isEmpty(str3)) {
            fs7.e("Downloader.FragmentBoostUtils", "id: " + i + ", saveFileFragmentContext url=" + str + ", defaultValue = " + str3, new Object[0]);
            return false;
        }
        zv7.c(xh4.f31395a, str, str2);
        fs7.e("Downloader.FragmentBoostUtils", "id: " + i + ", saveFileFragmentContext url = " + str + ", " + str2 + ", fragmentListSize = " + length, new Object[0]);
        return true;
    }

    public static void d(File file, File[] fileArr, int i, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54851d00", new Object[]{file, fileArr, new Integer(i), new Boolean(z)});
            return;
        }
        Object obj = "";
        if (file == null || fileArr == null || fileArr.length == 0) {
            StringBuilder sb = new StringBuilder("id: ");
            sb.append(i);
            sb.append(", mergeFiles failed ");
            sb.append(file);
            sb.append(", ");
            Object obj2 = obj;
            if (fileArr != null) {
                obj2 = Integer.valueOf(fileArr.length);
            }
            sb.append(obj2);
            fs7.e("Downloader.FragmentBoostUtils", sb.toString(), new Object[0]);
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            byte[] bArr = new byte[4096];
            int length = fileArr.length;
            int i2 = 0;
            Object obj3 = obj;
            while (i2 < length) {
                File file2 = fileArr[i2];
                String str = obj3;
                if (z) {
                    str = bbi.b(file2.getAbsolutePath());
                }
                fs7.e("Downloader.FragmentBoostUtils", "id: " + i + ", mergeFile start " + file2.getName() + ", fileMd5 = " + str, new Object[0]);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                bufferedInputStream.close();
                fs7.e("Downloader.FragmentBoostUtils", "id: " + i + ", mergeFile end " + file2.getName(), new Object[0]);
                file2.delete();
                i2++;
                obj3 = str;
            }
            bufferedOutputStream.close();
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
            }
        }
    }
}
