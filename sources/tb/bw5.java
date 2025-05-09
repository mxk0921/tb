package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELIMITER = " .[]";

    /* renamed from: a  reason: collision with root package name */
    public DXLongSparseArray<fw5> f16677a;
    public final Stack<fw5> b = new Stack<>();
    public final id6 c;

    static {
        t2o.a(444597033);
    }

    public bw5(id6 id6Var) {
        this.c = id6Var;
    }

    public fw5 a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fw5) ipChange.ipc$dispatch("713c1629", new Object[]{this, new Long(j)});
        }
        DXLongSparseArray<fw5> dXLongSparseArray = this.f16677a;
        if (dXLongSparseArray != null) {
            return dXLongSparseArray.get(j);
        }
        return null;
    }

    public DXLongSparseArray<fw5> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("f4dc2d01", new Object[]{this});
        }
        return this.f16677a;
    }

    public boolean c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("485e7dd0", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j == 33556442494L || j == 5326177973899923051L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e2, code lost:
        r20.f16677a.put(r11, r14);
        r9 = r9 + 1;
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r21, tb.lg5 r22, com.taobao.android.dinamicx.DXRuntimeContext r23) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bw5.d(int, tb.lg5, com.taobao.android.dinamicx.DXRuntimeContext):boolean");
    }
}
