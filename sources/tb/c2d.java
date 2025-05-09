package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final wnc f16790a = (wnc) d62.b(wnc.class, vas.TAG);

    public static boolean a(File file, File file2) {
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9623e14", new Object[]{file, file2})).booleanValue();
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            bufferedInputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            file.delete();
            return true;
        } catch (Throwable unused3) {
            bufferedInputStream2 = bufferedInputStream;
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                return false;
            } finally {
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        }
    }

    public static String b(String str, String str2) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe4ef1ad", new Object[]{str, str2});
        }
        try {
            if (new File(str).exists()) {
                file = bcq.a().e().K(str2);
                wnc wncVar = f16790a;
                wncVar.c("IOUtils rename from:" + str + " to :" + file.getAbsolutePath(), new Object[0]);
                if (!new File(str).renameTo(file)) {
                    wncVar.c("IOUtils rename from:" + str + " to :" + file.getAbsolutePath() + " failed", new Object[0]);
                    if (!a(new File(str), file)) {
                        wncVar.c("IOUtils copy from:" + str + " to :" + file.getAbsolutePath() + " failed", new Object[0]);
                        return "";
                    }
                }
            } else {
                file = null;
            }
            return file.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
