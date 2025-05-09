package tb;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class krg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOG_LEVEL_DEBUG = 9999;
    public static final int LOG_LEVEL_ERROR = 1;
    public static final int LOG_LEVEL_INFO = 0;
    public static final int LOG_STAGE_BEGIN = 1;
    public static final int LOG_STAGE_DEFAULT = 0;
    public static final int LOG_STAGE_END = 2;

    /* renamed from: a  reason: collision with root package name */
    public String f22867a = "";
    public String b = "";
    public String c = "";
    public ayu d = null;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public int k = 0;
    public int l = 0;
    public Map<UMDimKey, Object> m = null;
    public lrg n = null;
    public final String o = String.valueOf(System.currentTimeMillis());

    public krg A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("477f8c7", new Object[]{this, str});
        }
        if (byu.a(str)) {
            return this;
        }
        this.f = str;
        return this;
    }

    public krg B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("fbb58832", new Object[]{this, str});
        }
        if (byu.a(str)) {
            this.j = "";
        } else {
            this.j = str;
        }
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec203201", new Object[]{this});
        }
        return this.b;
    }

    public Map<UMDimKey, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("915526a6", new Object[]{this});
        }
        return this.m;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.h;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.i;
    }

    public lrg e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrg) ipChange.ipc$dispatch("872509dd", new Object[]{this});
        }
        return this.n;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7de091f", new Object[]{this});
        }
        return this.g;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4d513d5", new Object[]{this});
        }
        return this.c;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fe322e", new Object[]{this});
        }
        ayu ayuVar = this.d;
        if (ayuVar == null) {
            return "";
        }
        return ayuVar.a();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d423990", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d77140a", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c6d4a", new Object[]{this});
        }
        return this.f22867a;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.e;
    }

    public ayu m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("24de706d", new Object[]{this});
        }
        return this.d;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f00d779e", new Object[]{this});
        }
        return this.f;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86bed099", new Object[]{this});
        }
        return this.o;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        return this.j;
    }

    public krg q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("b8b4d1c6", new Object[]{this, str, str2});
        }
        if (byu.a(str)) {
            return this;
        }
        this.f22867a = str;
        if (str2 == null) {
            return this;
        }
        this.b = str2;
        return this;
    }

    public krg r(Map<UMDimKey, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("57c66fd7", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.m = map;
        }
        return this;
    }

    public krg s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("f532731d", new Object[]{this, str, str2});
        }
        if (byu.a(str)) {
            return this;
        }
        this.h = str;
        if (str2 == null) {
            return this;
        }
        this.i = str2;
        return this;
    }

    public krg t(lrg lrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("6d33cf62", new Object[]{this, lrgVar});
        }
        if (lrgVar != null && !lrgVar.c()) {
            this.n = lrgVar;
        }
        return this;
    }

    public krg u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("7e84a1ce", new Object[]{this, str});
        }
        if (byu.a(str)) {
            return this;
        }
        this.g = str;
        return this;
    }

    public krg v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("1f3e8d70", new Object[]{this, str});
        }
        if (byu.a(str)) {
            return this;
        }
        this.c = str;
        return this;
    }

    public krg w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("78e6e9a9", new Object[]{this, new Integer(i)});
        }
        this.k = i;
        return this;
    }

    public krg x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("9827a6f", new Object[]{this, new Integer(i)});
        }
        this.l = i;
        return this;
    }

    public krg y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("adf539fc", new Object[]{this, str});
        }
        if (byu.a(str)) {
            return this;
        }
        this.e = str;
        return this;
    }

    public krg z(ayu ayuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (krg) ipChange.ipc$dispatch("a842e4e4", new Object[]{this, ayuVar});
        }
        if (ayuVar == null) {
            return this;
        }
        this.d = ayuVar;
        return this;
    }
}
