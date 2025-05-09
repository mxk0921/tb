package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static vnq a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vnq) ipChange.ipc$dispatch("b50aa114", new Object[]{new Integer(i)});
        }
        return new aq();
    }
}
