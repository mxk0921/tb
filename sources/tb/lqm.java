package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lqm extends b1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f23514a;
    public int b;
    public int c;
    public boolean d;
    public final List<String> e;
    public final List<String> f;
    public final List<Throwable> g = new ArrayList();

    static {
        t2o.a(620757105);
    }

    public lqm(List<String> list, List<String> list2) {
        super(null);
        this.e = list;
        this.f = list2;
    }

    public static /* synthetic */ Object ipc$super(lqm lqmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/intf/event/PrefetchEvent");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (!xv8.g(3)) {
            return "PrefetchEvent@Release";
        }
        return "PrefetchEvent@" + Integer.toHexString(hashCode()) + "(totalCount:" + this.f23514a + ", completeCount:" + this.b + ", completeSize:" + xv8.j(this.c) + ", allSucceeded:" + this.d + ", succeeded:" + this.e.size() + ", failed:" + this.f.size() + f7l.BRACKET_END_STR;
    }
}
