package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class g1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19682a;
    public final String b;
    public final Map<String, String> c;
    public final Integer d;
    public final Long e;
    public final Long f;
    public final String g;

    public g1p(String str, String str2, Map<String, String> map, Integer num, Long l, Long l2, String str3) {
        this.f19682a = str;
        this.b = str2;
        this.c = map;
        this.d = num;
        this.e = l;
        this.f = l2;
        this.g = str3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.f19682a;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.c;
    }

    public final Long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("efc1a077", new Object[]{this});
        }
        return this.e;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6db27662", new Object[]{this});
        }
        return this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g1p) {
                g1p g1pVar = (g1p) obj;
                if (!ckf.b(this.f19682a, g1pVar.f19682a) || !ckf.b(this.b, g1pVar.b) || !ckf.b(this.c, g1pVar.c) || !ckf.b(this.d, g1pVar.d) || !ckf.b(this.e, g1pVar.e) || !ckf.b(this.f, g1pVar.f) || !ckf.b(this.g, g1pVar.g)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("919cf356", new Object[]{this});
        }
        return this.f;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("699c90ca", new Object[]{this});
        }
        return this.g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f19682a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        Map<String, String> map = this.c;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        Integer num = this.d;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        Long l = this.e;
        if (l != null) {
            i5 = l.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Long l2 = this.f;
        if (l2 != null) {
            i6 = l2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return i13 + i7;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SearchConfig(api=" + this.f19682a + ", version=" + this.b + ", params=" + this.c + ", retryTimes=" + this.d + ", retryInterval=" + this.e + ", waitTime=" + this.f + ", institutionCode=" + this.g + f7l.BRACKET_END_STR;
    }
}
