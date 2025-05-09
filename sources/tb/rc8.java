package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rc8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f27274a;
    public final zxb b;

    static {
        t2o.a(479199481);
    }

    public rc8(kmb kmbVar) {
        this.f27274a = kmbVar;
        this.b = kmbVar.d();
    }

    public List<IDMComponent> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3c95538", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if ("header".equals(iDMComponent.getPosition()) || "footer".equals(iDMComponent.getPosition())) {
                    arrayList.add(iDMComponent);
                }
                if ("empty".equals(iDMComponent.getTag())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public List<IDMComponent> b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59fcbc37", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if ("header".equals(iDMComponent.getPosition()) || "footer".equals(iDMComponent.getPosition())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public void c(gsb gsbVar) {
        List<IDMComponent> list;
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9a80c4", new Object[]{this, gsbVar});
            return;
        }
        if (gsbVar == null) {
            list = this.b.c().e(this.b.z());
        } else {
            list = cb4.B(this.b, gsbVar);
        }
        if (list != null) {
            Iterator<IDMComponent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iDMComponent = null;
                    break;
                }
                iDMComponent = it.next();
                if ("empty".equals(iDMComponent.getTag())) {
                    break;
                }
            }
            if (iDMComponent != null) {
                iDMComponent.getData().put("status", (Object) "normal");
                this.f27274a.e().y0(a(list));
            }
        }
    }
}
