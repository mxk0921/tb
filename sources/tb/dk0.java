package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ay1> f17877a;
    public final u92 b;

    static {
        t2o.a(500170764);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dk0(List<? extends ay1> list, u92 u92Var) {
        ckf.g(list, "data");
        ckf.g(u92Var, "bgm");
        this.f17877a = list;
        this.b = u92Var;
    }

    public final List<ay1> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.f17877a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof dk0) {
                dk0 dk0Var = (dk0) obj;
                if (!ckf.b(this.f17877a, dk0Var.f17877a) || !ckf.b(this.b, dk0Var.b)) {
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
        List<ay1> list = this.f17877a;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        u92 u92Var = this.b;
        if (u92Var != null) {
            i2 = u92Var.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AlbumModel(data=" + this.f17877a + ", bgm=" + this.b + f7l.BRACKET_END_STR;
    }
}
