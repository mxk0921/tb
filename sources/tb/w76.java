package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596940);
    }

    public void a(svb svbVar, svb svbVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f392b7d", new Object[]{this, svbVar, svbVar2, dXRuntimeContext});
        } else if ((svbVar != null || svbVar2 != null) && svbVar2 != null) {
            ex5 ex5Var = (ex5) svbVar2;
            if (svbVar == null) {
                z76.b(dXRuntimeContext, ex5Var.z());
                return;
            }
            ex5 ex5Var2 = (ex5) svbVar;
            int j = ex5Var.j();
            int j2 = ex5Var2.j();
            if (!(j == 0 && j2 == 0)) {
                if (j == 0 && j2 > 0) {
                    return;
                }
                if (j <= 0 || j2 != 0) {
                    HashMap hashMap = new HashMap(j2);
                    for (int i = 0; i < ex5Var2.j(); i++) {
                        hashMap.put(Integer.valueOf(ex5Var2.h(i).g()), Integer.valueOf(i));
                    }
                    ArrayList arrayList = new ArrayList(j2);
                    for (int i2 = 0; i2 < j2; i2++) {
                        arrayList.add(-1);
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < ex5Var.j(); i4++) {
                        ex5 h = ex5Var.h(i4);
                        int g = h.g();
                        if (!hashMap.containsKey(Integer.valueOf(g))) {
                            z76.b(dXRuntimeContext, h.z());
                        } else {
                            arrayList.set(((Integer) hashMap.get(Integer.valueOf(g))).intValue(), Integer.valueOf(i3));
                        }
                        i3++;
                    }
                    for (int i5 = 0; i5 < j2; i5++) {
                        int intValue = ((Integer) arrayList.get(i5)).intValue();
                        ex5 h2 = ex5Var2.h(i5);
                        if (intValue != -1) {
                            ex5 h3 = ex5Var.h(intValue);
                            if (h2 == null || h3.B().getClass() == h2.B().getClass()) {
                                h2.U(h3.z());
                                if (h2.z() != null) {
                                    kl6.d(h2, h2.z());
                                }
                                if (h2.j() > 0 || h3.j() > 0) {
                                    a(h2, h3, dXRuntimeContext);
                                }
                            } else {
                                z76.b(dXRuntimeContext, h3.z());
                            }
                        }
                    }
                    return;
                }
                z76.a(ex5Var.z(), dXRuntimeContext);
            }
        }
    }
}
