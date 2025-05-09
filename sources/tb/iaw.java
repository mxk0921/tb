package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f21200a = new HashSet(10);

    static {
        t2o.a(468713523);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd42cfe6", new Object[]{this, str});
        } else {
            ((HashSet) this.f21200a).add(str);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a27df657", new Object[]{this, str})).booleanValue();
        }
        return ((HashSet) this.f21200a).contains(str);
    }
}
