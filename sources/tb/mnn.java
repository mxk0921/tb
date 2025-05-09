package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mnn implements ka4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031882);
        t2o.a(713031879);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RecommendGoodsComponent [result=null]";
    }
}
