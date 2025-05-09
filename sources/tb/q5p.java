package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class q5p extends v0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793525);
    }

    public static /* synthetic */ Object ipc$super(q5p q5pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/video/SearchSingleVideoManager");
    }

    public final boolean o(NavigableMap<Integer, wg3> navigableMap, y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ac8d26b", new Object[]{this, navigableMap, y8eVar})).booleanValue();
        }
        wg3 value = navigableMap.firstEntry().getValue();
        Integer key = navigableMap.firstEntry().getKey();
        if (key.intValue() > 0) {
            return false;
        }
        int e = value.e();
        int v = value.v();
        if (v - ((xw1) y8eVar).E0() < (v - e) * k()) {
            return false;
        }
        l(value, key.intValue());
        return true;
    }

    @Override // tb.z8e
    public void c(y8e y8eVar) {
        int c;
        int c2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687fc934", new Object[]{this, y8eVar});
            return;
        }
        ckf.g(y8eVar, "videoList");
        if (!this.c.isEmpty()) {
            NavigableMap<Integer, wg3> navigableMap = this.c;
            ckf.f(navigableMap, "mInScreenPlayable");
            if (!o(navigableMap, y8eVar)) {
                xw1 xw1Var = (xw1) y8eVar;
                int y0 = xw1Var.y0();
                int x0 = xw1Var.x0();
                int E0 = xw1Var.E0();
                int D0 = xw1Var.D0();
                NavigableMap<Integer, wg3> navigableMap2 = this.c;
                ckf.f(navigableMap2, "mInScreenPlayable");
                int i2 = -1;
                wg3 wg3Var = null;
                for (Map.Entry entry : ((TreeMap) navigableMap2).entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    wg3 wg3Var2 = (wg3) entry.getValue();
                    int e = wg3Var2.e();
                    int v = wg3Var2.v();
                    if (e <= x0 && v >= y0 && (c2 = c(y0, x0, e, v)) > i) {
                        i2 = num.intValue();
                        wg3Var = wg3Var2;
                        i = c2;
                    }
                }
                if (wg3Var != null) {
                    l(wg3Var, i2);
                    return;
                }
                NavigableMap<Integer, wg3> navigableMap3 = this.c;
                ckf.f(navigableMap3, "mInScreenPlayable");
                for (Map.Entry entry2 : ((TreeMap) navigableMap3).entrySet()) {
                    Integer num2 = (Integer) entry2.getKey();
                    wg3 wg3Var3 = (wg3) entry2.getValue();
                    int e2 = wg3Var3.e();
                    int v2 = wg3Var3.v();
                    if (v2 - E0 >= (v2 - e2) * 0.5f && (c = c(E0, D0, e2, v2)) > i) {
                        i2 = num2.intValue();
                        wg3Var = wg3Var3;
                        i = c;
                    }
                }
                if (wg3Var != null) {
                    l(wg3Var, i2);
                }
            }
        }
    }
}
