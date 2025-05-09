package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fbf implements rb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<IDMComponent> f19164a;
    public IDMComponent b;
    public IDMComponent c;

    static {
        t2o.a(83886227);
        t2o.a(83886225);
    }

    public List<IDMComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this});
        }
        return this.f19164a;
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("fa7ee8aa", new Object[]{this});
        }
        return this.b;
    }

    public void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6023090", new Object[]{this, list});
        } else {
            this.f19164a = list;
        }
    }

    public void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de58af01", new Object[]{this, iDMComponent});
        } else {
            this.c = iDMComponent;
        }
    }

    public void e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a760bfe2", new Object[]{this, iDMComponent});
        } else {
            this.b = iDMComponent;
        }
    }
}
