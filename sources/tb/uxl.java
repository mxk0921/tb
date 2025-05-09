package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uxl implements ht6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<it6> f29660a = new SparseArray<>();
    public final fyl b;

    public uxl(kt6 kt6Var, fyl fylVar) {
        this.b = fylVar;
        kt6Var.d(4, this);
        kt6Var.d(1, this);
        kt6Var.d(2, this);
    }

    @Override // tb.ht6
    public void a(it6 it6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2bf62e", new Object[]{this, it6Var});
        } else {
            this.f29660a.put(it6Var.b, it6Var);
        }
    }

    public eyl b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("36385add", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        it6 it6Var = this.f29660a.get(c(i2));
        if (it6Var != null && it6Var.f21563a == i) {
            return this.b.l(it6Var);
        }
        return null;
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b9dc48a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 101) {
            return 6;
        }
        if (i == 401) {
            return 2;
        }
        if (i == 402) {
            return 5;
        }
        switch (i) {
            case 201:
                return 3;
            case 202:
                return 9;
            case 203:
                return 8;
            default:
                return i;
        }
    }
}
