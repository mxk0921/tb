package tb;

import androidx.core.graphics.drawable.IconCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ozf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ozf INSTANCE = new ozf();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, nzf> f25763a = new LinkedHashMap();

    static {
        t2o.a(1029701653);
    }

    public final String a(nzf nzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f37d00", new Object[]{this, nzfVar});
        }
        ckf.g(nzfVar, IconCompat.EXTRA_OBJ);
        String a2 = e5v.a();
        Map<String, nzf> map = f25763a;
        if (((LinkedHashMap) map).values().contains(nzfVar)) {
            return null;
        }
        map.put(a2, nzfVar);
        return a2;
    }

    public final nzf b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzf) ipChange.ipc$dispatch("14bf43ae", new Object[]{this, str});
        }
        return f25763a.remove(str);
    }
}
