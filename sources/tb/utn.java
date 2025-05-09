package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class utn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dck f29606a;
    public final String b;

    static {
        t2o.a(315621416);
    }

    public utn(dck dckVar, String str) {
        this.f29606a = dckVar;
        this.b = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1b158ea", new Object[]{this});
        }
        return this.b;
    }

    public dck b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dck) ipChange.ipc$dispatch("aaca520c", new Object[]{this});
        }
        return this.f29606a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || utn.class != obj.getClass()) {
            return false;
        }
        utn utnVar = (utn) obj;
        if (!this.f29606a.equals(utnVar.f29606a) || !this.b.equals(utnVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Arrays.hashCode(new Object[]{this.f29606a, this.b});
    }
}
