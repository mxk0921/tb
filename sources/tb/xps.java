package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31536a;
    public final ArrayList<TabBarItem> b;
    public boolean c;
    public final ArrayList<lds> d;

    static {
        t2o.a(839909705);
    }

    public xps(int i, ArrayList<TabBarItem> arrayList, boolean z, ArrayList<lds> arrayList2) {
        ckf.g(arrayList, "tabBarItemModels");
        ckf.g(arrayList2, "tmsTabItems");
        this.f31536a = i;
        this.b = arrayList;
        this.c = z;
        this.d = arrayList2;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b87ae2", new Object[]{this})).booleanValue();
        }
        if (!this.c || this.b.size() % 2 != 1) {
            return false;
        }
        return true;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be74673b", new Object[]{this})).intValue();
        }
        return this.f31536a;
    }

    public final ArrayList<TabBarItem> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6bb24192", new Object[]{this});
        }
        return this.b;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19fa3502", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public final ArrayList<lds> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5406110", new Object[]{this});
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xps)) {
            return false;
        }
        xps xpsVar = (xps) obj;
        if (this.f31536a == xpsVar.f31536a && ckf.b(this.b, xpsVar.b) && this.c == xpsVar.c && ckf.b(this.d, xpsVar.d)) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89a036", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i)});
        } else {
            this.f31536a = i;
        }
    }

    public int hashCode() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((this.f31536a * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        if (!z) {
            i = z ? 1 : 0;
        }
        return ((hashCode + i) * 31) + this.d.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabBarState(selectedIndex=" + this.f31536a + ", tabBarItemModels=" + this.b + ", isBulge=" + this.c + ", tmsTabItems=" + this.d + ')';
    }
}
