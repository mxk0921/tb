package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a75 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<osb, z65> f15580a = new HashMap();
    public final Map<osb, z65> b = new HashMap();
    public final Map<osb, z65> c = new HashMap();

    static {
        t2o.a(452985063);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((HashMap) this.f15580a).clear();
        ((HashMap) this.b).clear();
    }

    public void b(osb osbVar, osb osbVar2, osb osbVar3, z65 z65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a324e0", new Object[]{this, osbVar, osbVar2, osbVar3, z65Var});
            return;
        }
        ((HashMap) this.f15580a).put(osbVar, z65Var);
        ((HashMap) this.c).put(osbVar2, z65Var);
        ((HashMap) this.b).put(osbVar3, z65Var);
    }

    public void c(osb osbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0602a71", new Object[]{this, osbVar});
        } else {
            ((HashMap) this.f15580a).remove(osbVar);
        }
    }

    public void d(osb osbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfa2efd", new Object[]{this, osbVar});
        } else {
            ((HashMap) this.f15580a).remove(osbVar);
        }
    }

    public void e(osb osbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6dbe6e", new Object[]{this, osbVar});
        } else {
            ((HashMap) this.f15580a).remove(osbVar);
        }
    }
}
