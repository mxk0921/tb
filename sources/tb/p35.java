package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p35 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T, R> m35<T, R> a(n35<T, R> n35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m35) ipChange.ipc$dispatch("9732106b", new Object[]{n35Var});
        }
        return new o35(n35Var);
    }
}
