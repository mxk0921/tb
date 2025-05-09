package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p2i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_MANAGE_CHANGED = "manageClick";

    /* renamed from: a  reason: collision with root package name */
    public final zxb f25830a;
    public boolean b = false;

    static {
        t2o.a(479199276);
    }

    public p2i(zxb zxbVar) {
        this.f25830a = zxbVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4ac28e", new Object[]{this});
            return;
        }
        boolean z = true ^ this.b;
        this.b = z;
        c(z);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e42ab7", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c(boolean z) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf7d394", new Object[]{this, new Boolean(z)});
            return;
        }
        fsb c = this.f25830a.c();
        if (!(c == null || (components = c.getComponents()) == null)) {
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : components) {
                if (iDMComponent != null) {
                    boolean P = cb4.P(iDMComponent);
                    String tag = iDMComponent.getTag();
                    if ("item".equals(tag)) {
                        iDMComponent.getFields().put("isManaging", (Object) String.valueOf(z));
                        IDMComponent parent = iDMComponent.getParent();
                        if (parent != null) {
                            boolean b = cb4.b(z, iDMComponent);
                            if (!z && P && !b) {
                                cb4.Z(iDMComponent, false);
                                arrayList.add(iDMComponent);
                                IDMComponent parent2 = parent.getParent();
                                if (parent2 != null) {
                                    Iterator<IDMComponent> it = parent2.getChildren().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        IDMComponent next = it.next();
                                        if (next != null && "shop".equals(next.getTag())) {
                                            cb4.Z(next, false);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ("shop".equals(tag) || "bundleHeader".equals(tag)) {
                        iDMComponent.getFields().put("isManaging", (Object) String.valueOf(z));
                        boolean b2 = cb4.b(z, iDMComponent);
                        if (!z && P && !b2) {
                            cb4.Z(iDMComponent, false);
                        }
                    } else if ("submit".equals(tag)) {
                        iDMComponent.getFields().put("isManaging", (Object) String.valueOf(z));
                    } else if (z && ("submitPromotion".equals(tag) || "cartTimePromotion".equals(tag))) {
                        iDMComponent.getData().put("status", (Object) "hidden");
                    }
                }
            }
        }
    }
}
