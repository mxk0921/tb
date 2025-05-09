package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gcq implements fcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380230);
        t2o.a(676331548);
    }

    @Override // tb.fcq
    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5be851c", new Object[]{this, str});
        }
        try {
            File c = acq.p().i().i(str).c();
            if (c != null && c.exists()) {
                return c;
            }
            File E = acq.p().e().E(str);
            if (E == null) {
                return null;
            }
            if (E.exists()) {
                return E;
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
