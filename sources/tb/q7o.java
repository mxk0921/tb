package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q7o implements ht6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fyl f26566a;
    public final li7 b = new li7();
    public final SparseArray<jxl> c = new SparseArray<>();

    public q7o(kt6 kt6Var, fyl fylVar) {
        this.f26566a = fylVar;
        kt6Var.d(4, this);
        kt6Var.d(2, this);
        kt6Var.d(1, this);
        kt6Var.d(3, this);
    }

    @Override // tb.ht6
    public void a(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2bf62e", new Object[]{this, it6Var});
            return;
        }
        eyl k = this.f26566a.k(it6Var);
        if (k != null) {
            e(k);
        }
    }

    public boolean b(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d3c15d", new Object[]{this, jxlVar})).booleanValue();
        }
        kxl kxlVar = new kxl(jxlVar);
        synchronized (this) {
            this.c.put(jxlVar.hashCode(), kxlVar);
        }
        return true;
    }

    public Map<String, String> c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e9513237", new Object[]{this, new Integer(i)});
        }
        return this.b.e(i);
    }

    public final void d(jxl jxlVar, eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee512", new Object[]{this, jxlVar, eylVar});
        } else {
            jxlVar.c(eylVar);
        }
    }

    public final void e(eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983f2a3d", new Object[]{this, eylVar});
            return;
        }
        synchronized (this) {
            for (int i = 0; i < this.c.size(); i++) {
                try {
                    jxl valueAt = this.c.valueAt(i);
                    if (valueAt.a() == 9) {
                        d(valueAt, eylVar);
                    } else if (valueAt.a() == eylVar.f18894a && (valueAt.b() == 999 || valueAt.a() == eylVar.f18894a)) {
                        d(valueAt, eylVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean f(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("845e8340", new Object[]{this, jxlVar})).booleanValue();
        }
        if (this.c.get(jxlVar.hashCode()) == null) {
            return false;
        }
        synchronized (this) {
            this.c.remove(jxlVar.hashCode());
        }
        return true;
    }
}
