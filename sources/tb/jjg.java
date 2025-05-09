package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237928);
    }

    public static IDMComponent a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("b5946347", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        iDMComponent.setLayoutType("linear");
        return iDMComponent;
    }

    public static void c(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc3c4f0", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null) {
            if (TextUtils.isEmpty(iDMComponent.getLayoutType())) {
                List<IDMComponent> children = iDMComponent.getChildren();
                if (!(children == null || children.isEmpty())) {
                    if (f(children)) {
                        list.add(a(iDMComponent));
                    }
                    for (int i = 0; i < children.size(); i++) {
                        IDMComponent iDMComponent2 = children.get(i);
                        if (!TextUtils.isEmpty(iDMComponent2.getLayoutType())) {
                            list.add(iDMComponent2);
                        } else {
                            c(iDMComponent2, list);
                        }
                    }
                    return;
                }
                return;
            }
            list.add(iDMComponent);
        }
    }

    public static void d(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1fb5a0", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null) {
            if ("linear".equals(iDMComponent.getLayoutType())) {
                for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
                    c(iDMComponent2, list);
                }
                return;
            }
            c(iDMComponent, list);
        }
    }

    public static a e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f61f2161", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        Object obj = iDMComponent.getExtMap().get("LayoutHelper");
        if (obj instanceof a) {
            return (a) obj;
        }
        return null;
    }

    public static boolean f(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8df7b9", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() < 1) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (iDMComponent.getChildren() != null && iDMComponent.getChildren().size() >= 1) {
                return false;
            }
        }
        return true;
    }

    public static void g(IDMComponent iDMComponent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbc5c1f", new Object[]{iDMComponent, aVar});
        } else if (iDMComponent != null) {
            iDMComponent.getExtMap().put("LayoutHelper", aVar);
        }
    }

    public static List<a> h(Context context, IDMComponent iDMComponent, List<IDMComponent> list, af5 af5Var) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc77e1a9", new Object[]{context, iDMComponent, list, af5Var});
        }
        if (list == null) {
            list = new ArrayList<>();
        } else {
            list.clear();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d(iDMComponent, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            IDMComponent iDMComponent2 = (IDMComponent) it.next();
            ArrayList arrayList3 = new ArrayList();
            b(iDMComponent2, arrayList3);
            list.addAll(arrayList3);
            String layoutType = iDMComponent2.getLayoutType();
            if (e(iDMComponent2) == null) {
                aVar = af5Var.a(layoutType).b(context, iDMComponent2.getLayoutStyle());
                g(iDMComponent2, aVar);
            } else {
                aVar = e(iDMComponent2);
            }
            aVar.z(arrayList3.size());
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static void b(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e438342", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null) {
            if ("tabcontent".equals(iDMComponent.getLayoutType())) {
                list.add(iDMComponent);
                return;
            }
            List<IDMComponent> children = iDMComponent.getChildren();
            if (!(children == null || children.isEmpty())) {
                for (int i = 0; i < children.size(); i++) {
                    IDMComponent iDMComponent2 = children.get(i);
                    if (iDMComponent2.getChildren() == null || iDMComponent2.getChildren().isEmpty()) {
                        list.add(iDMComponent2);
                    } else {
                        b(iDMComponent2, list);
                    }
                }
            }
        }
    }
}
