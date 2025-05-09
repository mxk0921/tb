package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750498);
    }

    public static y7d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7d) ipChange.ipc$dispatch("af5810b3", new Object[]{str});
        }
        return new m7k(str);
    }
}
