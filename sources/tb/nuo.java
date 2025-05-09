package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class nuo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MSG_CLOSE_DRAWER = "closeDrawer";
    public static final String MSG_FORCE_REFRESH = "forceRefresh";
    public static final String MSG_ICON_CHANGE = "iconChange";
    public static final String MSG_SELECT_TAB = "selectTab";
    public static final String MSG_URL_REFRESH = "urlRefresh";

    /* renamed from: a  reason: collision with root package name */
    public final String f24959a;
    public String b;
    public final Map<String, Object> c;
    public final int d;
    public final Object e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601334);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601333);
    }

    public nuo(String str, String str2, Map<String, Object> map, int i, Object obj) {
        ckf.g(str, "name");
        this.f24959a = str;
        this.b = str2;
        this.c = map;
        this.d = i;
        this.e = obj;
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.c;
    }

    public final Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("88ef371", new Object[]{this});
        }
        return this.e;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f24959a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return this.b;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof nuo) {
                nuo nuoVar = (nuo) obj;
                if (!ckf.b(this.f24959a, nuoVar.f24959a) || !ckf.b(this.b, nuoVar.b) || !ckf.b(this.c, nuoVar.c) || this.d != nuoVar.d || !ckf.b(this.e, nuoVar.e)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55b79e2", new Object[]{this, str});
        } else {
            this.b = str;
        }
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
        String str = this.f24959a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.d) * 31;
        Object obj = this.e;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SchedulerMessage(name=" + this.f24959a + ", page=" + this.b + ", args=" + this.c + ", timeout=" + this.d + ", extra=" + this.e + f7l.BRACKET_END_STR;
    }

    public /* synthetic */ nuo(String str, String str2, Map map, int i, Object obj, int i2, a07 a07Var) {
        this(str, str2, map, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? null : obj);
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5421e5a1", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.f24959a, MSG_ICON_CHANGE) || ckf.b(this.f24959a, MSG_URL_REFRESH);
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa785b17", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "page");
        return ckf.b(this.b, str) && (ckf.b(this.f24959a, MSG_ICON_CHANGE) || ckf.b(this.f24959a, MSG_URL_REFRESH));
    }
}
