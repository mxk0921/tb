package tb;

import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356105);
    }

    public static String a(String str, String str2) throws IOException {
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

    public static void b(String str, String str2, String str3) throws IOException {
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
            o3s.b(f.f2692a, "文件创建失败");
        } else if (!file.mkdirs()) {
            o3s.b(f.f2692a, "文件夹创建失败");
        }
    }
}
