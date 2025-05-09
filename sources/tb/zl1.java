package tb;

import androidx.core.app.FrameMetricsAggregator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class zl1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32844a;
    public String b;
    public String c;
    public Map<String, String> d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        t2o.a(815793214);
    }

    public zl1() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1487d8c0", new Object[]{this});
        }
        return this.f32844a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d66351c3", new Object[]{this});
        }
        return this.e;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.h;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52495d42", new Object[]{this});
        }
        return this.f;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df2fcee", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        if (ckf.b(this.f32844a, zl1Var.f32844a) && ckf.b(this.b, zl1Var.b) && ckf.b(this.c, zl1Var.c) && ckf.b(this.d, zl1Var.d) && ckf.b(this.e, zl1Var.e) && ckf.b(this.f, zl1Var.f) && ckf.b(this.g, zl1Var.g) && ckf.b(this.h, zl1Var.h) && ckf.b(this.i, zl1Var.i)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4bbc9120", new Object[]{this});
        }
        return this.d;
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec62f42f", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942a6e1e", new Object[]{this, str});
        } else {
            this.f32844a = str;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f32844a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i10 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i11 = (i10 + i2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i12 = (i11 + i3) * 31;
        Map<String, String> map = this.d;
        if (map == null) {
            i4 = 0;
        } else {
            i4 = map.hashCode();
        }
        int i13 = (i12 + i4) * 31;
        String str4 = this.e;
        if (str4 == null) {
            i5 = 0;
        } else {
            i5 = str4.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        String str5 = this.f;
        if (str5 == null) {
            i6 = 0;
        } else {
            i6 = str5.hashCode();
        }
        int i15 = (i14 + i6) * 31;
        String str6 = this.g;
        if (str6 == null) {
            i7 = 0;
        } else {
            i7 = str6.hashCode();
        }
        int i16 = (i15 + i7) * 31;
        String str7 = this.h;
        if (str7 == null) {
            i8 = 0;
        } else {
            i8 = str7.hashCode();
        }
        int i17 = (i16 + i8) * 31;
        String str8 = this.i;
        if (str8 != null) {
            i9 = str8.hashCode();
        }
        return i17 + i9;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf06e13", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792006dc", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a02abe", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc68a3ac", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27562848", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1146b6e", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BGWordsCellBean(displayText=" + this.f32844a + ", recallType=" + this.b + ", searchText=" + this.c + ", searchparams=" + this.d + ", iconHeight=" + this.e + ", iconWidth=" + this.f + ", darkIconUrl=" + this.g + ", iconUrl=" + this.h + ", roughScore=" + this.i + ')';
    }

    public zl1(String str, String str2, String str3, Map<String, String> map, String str4, String str5, String str6, String str7, String str8) {
        this.f32844a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public /* synthetic */ zl1(String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }
}
