package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class voh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30141a;
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, Object> e;

    static {
        t2o.a(1007681562);
    }

    public voh(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        ckf.g(str2, "ID");
        ckf.g(str3, "defaultCount");
        ckf.g(str4, "type");
        this.f30141a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.f30141a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c30653b5", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b12904a8", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voh)) {
            return false;
        }
        voh vohVar = (voh) obj;
        if (ckf.b(this.f30141a, vohVar.f30141a) && ckf.b(this.b, vohVar.b) && ckf.b(this.c, vohVar.c) && ckf.b(this.d, vohVar.d) && ckf.b(this.e, vohVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f30141a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = ((((((i * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Map<String, Object> map = this.e;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MGAFavoriteCountRequestParams(bizCode=" + this.f30141a + ", ID=" + this.b + ", defaultCount=" + this.c + ", type=" + this.d + ", ext=" + this.e + ')';
    }
}
