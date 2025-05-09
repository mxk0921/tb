package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static pb9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pb9) ipChange.ipc$dispatch("7921fecc", new Object[0]);
        }
        return new pb9();
    }

    public Integer b(File file) {
        Throwable th;
        Exception e;
        BufferedReader bufferedReader;
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d2fbdfd0", new Object[]{this, file});
        }
        if (file.exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null && (parseInt = Integer.parseInt(readLine)) > 0 && parseInt < 3) {
                    Integer valueOf = Integer.valueOf(parseInt);
                    nw3.a(bufferedReader);
                    return valueOf;
                }
                nw3.a(bufferedReader);
            } catch (Exception e3) {
                e = e3;
                bufferedReader2 = bufferedReader;
                yhh.a(e);
                nw3.a(bufferedReader2);
                return -1;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                nw3.a(bufferedReader2);
                throw th;
            }
        }
        return -1;
    }
}
