package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rw8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ox8> f27646a = new ArrayList<>();

    static {
        t2o.a(297795626);
    }

    public void a(ox8 ox8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482aabe5", new Object[]{this, ox8Var});
        } else {
            this.f27646a.add(ox8Var);
        }
    }

    public String toString() {
        Iterator<ox8> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = "\tvertices: " + this.f27646a.size() + " :\n";
        while (this.f27646a.iterator().hasNext()) {
            str = str + " \t\t( " + it.next().toString() + " )\n";
        }
        return str;
    }
}
