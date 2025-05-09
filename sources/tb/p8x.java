package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p8x implements fde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515948);
        t2o.a(982515945);
    }

    @Override // tb.fde
    public ede a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ede) ipChange.ipc$dispatch("f4450b4e", new Object[]{this, str});
        }
        return new n8x(str);
    }
}
