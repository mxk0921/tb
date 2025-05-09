package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static kb9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kb9) ipChange.ipc$dispatch("a71661f3", new Object[0]);
        }
        return new kb9();
    }

    public List<String> b(File file) {
        Throwable th;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2e67a3e", new Object[]{this, file});
        }
        ArrayList arrayList = new ArrayList();
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
                                arrayList.add(readLine);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader = bufferedReader2;
                            yhh.a(e);
                            nw3.a(bufferedReader);
                            return arrayList;
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
        return arrayList;
    }
}
