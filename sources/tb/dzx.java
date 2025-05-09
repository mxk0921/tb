package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile y6e f18186a;

    public static void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{str, str2, map, map2});
            return;
        }
        y6e y6eVar = f18186a;
        if (y6eVar != null) {
            y6eVar.onCommit(str, str2, map, map2);
        }
    }

    public static void b(String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85aefb8", new Object[]{str, str2, set, set2, new Boolean(z)});
            return;
        }
        y6e y6eVar = f18186a;
        if (y6eVar != null) {
            y6eVar.onRegister(str, str2, set, set2, z);
        }
    }

    public static final void c(y6e y6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0dfe7", new Object[]{y6eVar});
        } else {
            f18186a = y6eVar;
        }
    }
}
