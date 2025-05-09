package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a76 extends w76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596946);
    }

    public static /* synthetic */ Object ipc$super(a76 a76Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/pipeline/opt/DXOptSimplePipelineDiff");
    }

    @Override // tb.w76
    public void a(svb svbVar, svb svbVar2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f392b7d", new Object[]{this, svbVar, svbVar2, dXRuntimeContext});
            return;
        }
        zg5.p4();
        if (!(svbVar == null && svbVar2 == null)) {
            ex5 ex5Var = (ex5) svbVar2;
            if (svbVar2 != null) {
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
                        SparseArray sparseArray = new SparseArray();
                        for (int i = 0; i < ex5Var2.j(); i++) {
                            DXWidgetNode u = ex5Var2.h(i).u();
                            if (u != null) {
                                int autoId = u.getAutoId();
                                List list = (List) sparseArray.get(autoId);
                                if (list == null) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(i));
                                    sparseArray.put(autoId, arrayList);
                                } else {
                                    list.add(Integer.valueOf(i));
                                }
                            } else if (zg5.q5()) {
                                int t = ex5Var2.h(i).t();
                                List list2 = (List) sparseArray.get(t);
                                if (list2 == null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(Integer.valueOf(i));
                                    sparseArray.put(t, arrayList2);
                                } else {
                                    list2.add(Integer.valueOf(i));
                                }
                            }
                        }
                        int[] iArr = new int[j2];
                        for (int i2 = 0; i2 < j2; i2++) {
                            iArr[i2] = -1;
                        }
                        for (int i3 = 0; i3 < ex5Var.j(); i3++) {
                            ex5 h = ex5Var.h(i3);
                            if (h.B().getSourceWidget() != null && sparseArray.size() != 0) {
                                List list3 = (List) sparseArray.get(h.u().getAutoId());
                                if (list3 == null || list3.isEmpty()) {
                                    z76.b(dXRuntimeContext, h.z());
                                } else {
                                    iArr[((Integer) list3.get(0)).intValue()] = i3;
                                    list3.remove(0);
                                }
                            } else if (!zg5.q5() || h.t() < 0 || sparseArray.size() == 0) {
                                z76.b(dXRuntimeContext, h.z());
                            } else {
                                List list4 = (List) sparseArray.get(h.t());
                                if (list4 == null || list4.isEmpty()) {
                                    z76.b(dXRuntimeContext, h.z());
                                } else {
                                    iArr[((Integer) list4.get(0)).intValue()] = i3;
                                    list4.remove(0);
                                }
                            }
                        }
                        for (int i4 = 0; i4 < j2; i4++) {
                            int i5 = iArr[i4];
                            ex5 h2 = ex5Var2.h(i4);
                            if (i5 != -1) {
                                ex5 h3 = ex5Var.h(i5);
                                if (h2 == null || h3.m() == h2.m()) {
                                    h2.U(h3.z());
                                    if (h2.z() != null) {
                                        kl6.e(h2.z(), h2);
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
}
