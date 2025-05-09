package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zs9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Comparator<pei> h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f32988a;
    public final String b;
    public final LinkedList<pei> c = new LinkedList<>();
    public final LinkedList<pei> d = new LinkedList<>();
    public final LinkedList<pei> e = new LinkedList<>();
    public final LinkedList<pei> f = new LinkedList<>();
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Comparator<pei> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(pei peiVar, pei peiVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c70679ad", new Object[]{this, peiVar, peiVar2})).intValue();
            }
            if (peiVar.c() < peiVar2.c()) {
                return 1;
            }
            if (peiVar.c() > peiVar2.c()) {
                return -1;
            }
            return 0;
        }
    }

    static {
        t2o.a(481296463);
    }

    public zs9(String str) {
        this.f32988a = str;
        this.b = str.substring(str.lastIndexOf(File.separator) + 1);
    }

    public void a(List<pei> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a6e846", new Object[]{this, list});
            return;
        }
        this.d.addAll(list);
        for (pei peiVar : list) {
            if (peiVar.p()) {
                this.f.add(peiVar);
            }
        }
    }

    public boolean b(pei peiVar) {
        LinkedList<pei> linkedList;
        LinkedList<pei> linkedList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ea3eb19", new Object[]{this, peiVar})).booleanValue();
        }
        if (peiVar == null || (linkedList = this.c) == null) {
            return false;
        }
        linkedList.addFirst(peiVar);
        if (peiVar.p() && (linkedList2 = this.e) != null) {
            linkedList2.addFirst(peiVar);
        }
        return true;
    }

    public void c(zs9 zs9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3834535c", new Object[]{this, zs9Var});
            return;
        }
        this.c.clear();
        this.c.addAll(zs9Var.d);
        this.e.clear();
        this.e.addAll(zs9Var.f);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43fbd6a9", new Object[]{this});
        }
        return this.c.size() + Localization.q(R.string.taobao_app_1007_1_19001);
    }

    public zs9 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("129d419d", new Object[]{this});
        }
        zs9 zs9Var = new zs9(this.f32988a);
        zs9Var.d.addAll(this.d);
        zs9Var.f.addAll(this.f);
        return zs9Var;
    }

    public LinkedList<pei> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("88f1f432", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.f32988a;
    }

    public LinkedList<pei> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("aacaa779", new Object[]{this});
        }
        return this.e;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b984662d", new Object[]{this})).booleanValue();
        }
        return true ^ this.c.isEmpty();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29af9692", new Object[]{this});
        } else if (!this.d.isEmpty()) {
            Collections.sort(this.d, h);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a376", new Object[]{this});
        } else if (!this.f.isEmpty()) {
            Collections.sort(this.f, h);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return " name " + this.b + ", path " + this.f32988a + ", count " + this.c.size();
    }
}
