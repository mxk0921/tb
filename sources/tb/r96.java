package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r96 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<b> f27206a = new SparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<xm6> f27207a;

        static {
            t2o.a(806355052);
        }

        public b() {
            this.f27207a = new ArrayList<>();
        }
    }

    static {
        t2o.a(806355050);
    }

    public xm6 a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xm6) ipChange.ipc$dispatch("a215100", new Object[]{this, new Integer(i)});
        }
        b bVar = this.f27206a.get(i);
        if (bVar == null || bVar.f27207a.isEmpty()) {
            return null;
        }
        ArrayList<xm6> arrayList = bVar.f27207a;
        return arrayList.remove(arrayList.size() - 1);
    }

    public final b b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f39e0bd6", new Object[]{this, new Integer(i)});
        }
        b bVar = this.f27206a.get(i);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f27206a.put(i, bVar2);
        return bVar2;
    }

    public void c(xm6 xm6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172e76b4", new Object[]{this, xm6Var});
            return;
        }
        int b2 = xm6Var.b();
        if (b2 != -1) {
            ArrayList<xm6> arrayList = b(b2).f27207a;
            if (2 > arrayList.size()) {
                arrayList.add(xm6Var);
            }
        }
    }
}
