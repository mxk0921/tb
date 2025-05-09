package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d07 implements a.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u55 f17486a;

    static {
        t2o.a(157286663);
        t2o.a(157286653);
    }

    public d07(u55 u55Var) {
        this.f17486a = u55Var;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.a.h
    public final void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
        } else if (this.f17486a != null && list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    String h = ParseModule.h(iDMComponent);
                    if ("footer".equals(h)) {
                        arrayList2.add(iDMComponent);
                    } else if ("header".equals(h)) {
                        arrayList.add(iDMComponent);
                    } else if ("foreground".equalsIgnoreCase(h)) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iDMComponent);
                    } else if ("background".equalsIgnoreCase(h)) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(iDMComponent);
                    }
                }
                arrayList3.add(iDMComponent);
            }
            et6Var.q(arrayList);
            et6Var.o(arrayList2);
            et6Var.l(arrayList3);
            et6Var.p(arrayList4);
            et6Var.k(arrayList5);
        }
    }
}
