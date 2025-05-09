package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f25100a = new CopyOnWriteArrayList();

    static {
        t2o.a(844103716);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59241472", new Object[]{this, str});
            return;
        }
        ckf.g(str, "apiName");
        ((CopyOnWriteArrayList) this.f25100a).add(str);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "apiName");
        return ((CopyOnWriteArrayList) this.f25100a).contains(str);
    }
}
