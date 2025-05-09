package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class e7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final waz f18347a;
    public final List<e7z> b;
    public final jkz c;

    static {
        t2o.a(598737467);
    }

    public e7z(waz wazVar, int i, int i2, List<e7z> list) {
        ckf.g(wazVar, "layoutNode");
        ckf.g(list, "children");
        this.f18347a = wazVar;
        this.b = list;
        this.c = wazVar.s();
    }

    public final List<e7z> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        return this.b;
    }

    public final waz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("96cd5d5e", new Object[]{this});
        }
        return this.f18347a;
    }

    public final jkz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("ab805e8e", new Object[]{this});
        }
        return this.c;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("52271ef", new Object[]{this});
        }
        return null;
    }

    public /* synthetic */ e7z(waz wazVar, int i, int i2, List list, int i3, a07 a07Var) {
        this(wazVar, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new ArrayList() : list);
    }
}
