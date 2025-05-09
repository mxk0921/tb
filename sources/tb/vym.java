package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f30346a;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[0]);
        }
        if (f30346a == null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/comm")));
                f30346a = bufferedReader.readLine();
                bufferedReader.close();
            } catch (Exception unused) {
                f30346a = "";
            }
        }
        return f30346a;
    }
}
