package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class r8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<IDMComponent> f27198a = null;
    public final String b;

    static {
        t2o.a(157286706);
    }

    public r8v(String str) {
        this.b = str;
    }

    public final boolean b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("335de4ff", new Object[]{this, iDMComponent, iDMComponent2})).booleanValue();
        }
        if (rcv.a(iDMComponent)) {
            return false;
        }
        return g9v.b(iDMComponent, iDMComponent2);
    }

    public boolean a(List<IDMComponent> list, vcv vcvVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9472994", new Object[]{this, list, vcvVar})).booleanValue();
        }
        if (vcvVar != null) {
            try {
                if (vcvVar.a()) {
                    if (!(list == null || this.f27198a == null)) {
                        if (!vav.a(this.b, "enableDiffRebuildHeader", false)) {
                            return false;
                        }
                        if (list.size() != this.f27198a.size()) {
                            return false;
                        }
                        int i = 0;
                        while (true) {
                            if (i >= list.size()) {
                                z = true;
                                break;
                            }
                            IDMComponent iDMComponent = this.f27198a.get(i);
                            IDMComponent iDMComponent2 = list.get(i);
                            if (iDMComponent != iDMComponent2) {
                                if (!Objects.equals(iDMComponent.getKey(), iDMComponent2.getKey()) || !b(iDMComponent, iDMComponent2)) {
                                    break;
                                }
                            }
                            i++;
                        }
                        return z;
                    }
                    return false;
                }
            } catch (Exception e) {
                f9v.q(xh8.a("Ultron").c("skipRebuildHeaderError").message(e.getMessage()));
                return false;
            } finally {
                this.f27198a = list;
            }
        }
        return false;
    }
}
