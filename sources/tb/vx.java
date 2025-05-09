package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class vx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30307a;
    public final b3o b;

    static {
        t2o.a(155189256);
    }

    public vx(ct1 ct1Var, Context context, b3o b3oVar) {
        if (ct1Var == null) {
            throw new NullPointerException("param dataManager can not be null");
        } else if (context == null) {
            throw new NullPointerException("param context can not be null");
        } else if (b3oVar != null) {
            this.f30307a = context;
            this.b = b3oVar;
        } else {
            throw new NullPointerException("param request can not be null");
        }
    }

    public static void b(ct1 ct1Var, fsb fsbVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a11efbe", new Object[]{ct1Var, fsbVar, context, new Boolean(z)});
        } else if (ct1Var != null) {
            ct1Var.m(fsbVar);
            if (!(fsbVar == null || fsbVar.getComponents() == null)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (IDMComponent iDMComponent : fsbVar.getComponents()) {
                    if (iDMComponent != null) {
                        bwa.s(context, iDMComponent);
                        String h = ParseModule.h(iDMComponent);
                        if ("footer".equals(h)) {
                            arrayList2.add(iDMComponent);
                        } else if ("header".equals(h)) {
                            arrayList.add(iDMComponent);
                        } else if ("stickyTop".equals(h)) {
                            arrayList4.add(iDMComponent);
                        } else if ("stickyBottom".equals(h)) {
                            arrayList5.add(iDMComponent);
                        }
                    }
                    if (!z || !(iDMComponent == null || iDMComponent.getStatus() == 0)) {
                        arrayList3.add(iDMComponent);
                    }
                }
                kcu kcuVar = new kcu(arrayList, arrayList3, arrayList2);
                kcuVar.i(arrayList4);
                kcuVar.h(arrayList5);
                ct1Var.n(kcuVar);
            }
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761956de", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.b.a(map);
        }
    }

    public b3o c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3o) ipChange.ipc$dispatch("70c8fa42", new Object[]{this});
        }
        return this.b;
    }
}
