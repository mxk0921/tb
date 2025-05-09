package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xoh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31499a;
    public final String b;
    public final String c;
    public final Map<String, Object> d;

    static {
        t2o.a(1007681564);
    }

    public xoh(String str, String str2, String str3, Map<String, ? extends Object> map) {
        ckf.g(str2, "ID");
        ckf.g(str3, "type");
        this.f31499a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.f31499a;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this});
        }
        return this.d;
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
        if (!(obj instanceof xoh)) {
            return false;
        }
        xoh xohVar = (xoh) obj;
        if (ckf.b(this.f31499a, xohVar.f31499a) && ckf.b(this.b, xohVar.b) && ckf.b(this.c, xohVar.c) && ckf.b(this.d, xohVar.d)) {
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
        String str = this.f31499a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = ((((i * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        Map<String, Object> map = this.d;
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
        return "MGAFavoriteRequestParams(bizCode=" + this.f31499a + ", ID=" + this.b + ", type=" + this.c + ", ext=" + this.d + ')';
    }
}
