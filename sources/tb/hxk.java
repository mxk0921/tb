package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793725);
    }

    public static hxk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hxk) ipChange.ipc$dispatch("f4befb3b", new Object[0]);
        }
        return new hxk();
    }
}
