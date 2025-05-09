package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.a;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dsr implements j8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dsr INSTANCE = new dsr();

    @Override // tb.j8d
    public nyl a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nyl) ipChange.ipc$dispatch("fa5979b2", new Object[]{this, str, strArr});
        }
        ckf.g(strArr, "permissions");
        qzl d = a.d(MegaUtils.f(), str, strArr);
        if (d == null) {
            return new nyl(kotlin.collections.a.h());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int[] iArr = d.b;
        ckf.f(iArr, "result.grantResults");
        int i = 0;
        for (int i2 : iArr) {
            i++;
            linkedHashMap.put(strArr[i], Boolean.valueOf(i2 == 0));
        }
        return new nyl(linkedHashMap);
    }
}
