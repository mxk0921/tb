package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b1n f21045a;

    public i1r(Map<String, Object> map) {
        this.f21045a = new b1n(map);
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5afce9f4", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return this.f21045a.c(str, i);
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afd29d6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return this.f21045a.b(str, z);
    }
}
