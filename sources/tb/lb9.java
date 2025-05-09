package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static lb9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lb9) ipChange.ipc$dispatch("1ae54053", new Object[0]);
        }
        return new lb9();
    }

    public Map<String, String> b(File file) {
        Throwable th;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3310f5e", new Object[]{this, file});
        }
        HashMap hashMap = new HashMap();
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            } else if (!readLine.startsWith("#")) {
                                String[] split = readLine.split("=");
                                if (split.length == 2) {
                                    hashMap.put(split[0].trim(), split[1].trim());
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            yhh.a(e);
                            nw3.a(bufferedReader);
                            return hashMap;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            nw3.a(bufferedReader);
                            throw th;
                        }
                    }
                    nw3.a(bufferedReader2);
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return hashMap;
    }
}
