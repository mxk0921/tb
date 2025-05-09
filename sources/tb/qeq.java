package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qeq implements lcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f26702a = o4p.T();

    static {
        t2o.a(815793380);
        t2o.a(993001475);
    }

    @Override // tb.lcc
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea80cb71", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return this.f26702a.contains(str);
    }
}
