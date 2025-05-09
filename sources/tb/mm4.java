package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mm4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<unl> f24132a;
    public final AppManifest.Performance b;
    public final Window c;
    public final TabBar d;
    public final transient List<unl> e;
    public final JSONObject f;

    static {
        t2o.a(839909499);
    }

    public mm4() {
        this(null, null, null, null, 15, null);
    }

    public final List<unl> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e998a5f", new Object[]{this});
        }
        return this.e;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2d8e901", new Object[]{this});
        }
        return this.f;
    }

    public final List<unl> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("51843212", new Object[]{this});
        }
        return this.f24132a;
    }

    public final AppManifest.Performance d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest.Performance) ipChange.ipc$dispatch("23078708", new Object[]{this});
        }
        return this.b;
    }

    public final TabBar e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBar) ipChange.ipc$dispatch("9b9cb12e", new Object[]{this});
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
        if (!(obj instanceof mm4)) {
            return false;
        }
        mm4 mm4Var = (mm4) obj;
        if (ckf.b(this.f24132a, mm4Var.f24132a) && ckf.b(this.b, mm4Var.b) && ckf.b(this.c, mm4Var.c) && ckf.b(this.d, mm4Var.d)) {
            return true;
        }
        return false;
    }

    public final Window f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("2b6b0304", new Object[]{this});
        }
        return this.c;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        List<unl> list = this.f24132a;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i5 = i * 31;
        AppManifest.Performance performance = this.b;
        if (performance == null) {
            i2 = 0;
        } else {
            i2 = performance.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        Window window = this.c;
        if (window == null) {
            i3 = 0;
        } else {
            i3 = window.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        TabBar tabBar = this.d;
        if (tabBar != null) {
            i4 = tabBar.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ContainerModel(pages=" + this.f24132a + ", performance=" + this.b + ", window=" + this.c + ", tabBar=" + this.d + ')';
    }

    public mm4(List<unl> list, AppManifest.Performance performance, Window window, TabBar tabBar) {
        this.f24132a = list;
        this.b = performance;
        this.c = window;
        this.d = tabBar;
        this.e = new CopyOnWriteArrayList();
        this.f = new JSONObject();
    }

    public /* synthetic */ mm4(List list, AppManifest.Performance performance, Window window, TabBar tabBar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : performance, (i & 4) != 0 ? null : window, (i & 8) != 0 ? null : tabBar);
    }
}
