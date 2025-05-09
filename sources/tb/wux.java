package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str, String str2) {
        Throwable th;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                file = new File(str, str2);
            } catch (Throwable unused) {
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!file.exists()) {
            return null;
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        while (true) {
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            } catch (IOException unused3) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return sb.toString();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th;
            }
        }
        bufferedReader2.close();
        return sb.toString();
    }
}
