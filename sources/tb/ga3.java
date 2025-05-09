package tb;

import com.alibaba.android.icart.core.view.ViewManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ga3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f19827a;
    public boolean b = false;

    static {
        t2o.a(479199554);
    }

    public ga3(kmb kmbVar) {
        this.f19827a = kmbVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f403632", new Object[]{this});
            return;
        }
        ViewManager Z = this.f19827a.e();
        if (Z != null) {
            List<IDMComponent> c = Z.h0().getDataSource().c();
            if (c != null) {
                Iterator<IDMComponent> it = c.iterator();
                while (it.hasNext()) {
                    IDMComponent next = it.next();
                    if (!(next == null || next.getFields() == null || !next.getFields().getBooleanValue("calculatePopIsCalculateComponent"))) {
                        it.remove();
                    }
                }
            }
            Z.B0();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9a139a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d8b741", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
