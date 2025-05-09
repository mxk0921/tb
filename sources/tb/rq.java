package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final idb f27548a;
    public final Set<String> b;

    static {
        t2o.a(144703505);
    }

    public rq(idb idbVar, Set<String> set) {
        ckf.g(idbVar, "abilityBuilder");
        ckf.g(set, "namespaces");
        this.f27548a = idbVar;
        this.b = set;
    }

    public final idb a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idb) ipChange.ipc$dispatch("7eef73f8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.f27548a;
        }
        if (this.b.isEmpty() || i04.R(this.b, str)) {
            return this.f27548a;
        }
        return null;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof rq) {
                rq rqVar = (rq) obj;
                if (!ckf.b(this.f27548a, rqVar.f27548a) || !ckf.b(this.b, rqVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        idb idbVar = this.f27548a;
        if (idbVar != null) {
            i = idbVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Set<String> set = this.b;
        if (set != null) {
            i2 = set.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AbilityBuilderBox(abilityBuilder=" + this.f27548a + ", namespaces=" + this.b + f7l.BRACKET_END_STR;
    }

    public /* synthetic */ rq(idb idbVar, Set set, int i, a07 a07Var) {
        this(idbVar, (i & 2) != 0 ? kfp.d() : set);
    }
}
