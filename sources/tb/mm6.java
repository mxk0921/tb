package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mm6 implements Comparator<iew> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597107);
    }

    /* renamed from: a */
    public int compare(iew iewVar, iew iewVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66cd699f", new Object[]{this, iewVar, iewVar2})).intValue();
        }
        return (int) (iewVar.a() - iewVar2.a());
    }
}
