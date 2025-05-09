package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f21607a;
    public SparseArray<byte[]> b;

    static {
        t2o.a(444597860);
        t2o.a(444597873);
    }

    public iw5(a16 a16Var) {
        this.f21607a = a16Var;
    }

    public final void a(lg5 lg5Var, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901c188e", new Object[]{this, lg5Var, new Integer(i), new Integer(i2)});
            return;
        }
        lg5Var.k(i);
        if (lg5Var.h() == 5566) {
            int h = lg5Var.h();
            if (h > i2) {
                throw new DXLoaderException("Invalid binary, offset: " + i + "+ fileLen: " + h + " > bytes.length: " + i2);
            }
            return;
        }
        throw new DXLoaderException("Invalid binary, invalid magic number");
    }

    public final void b(lg5 lg5Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b95a3af", new Object[]{this, lg5Var, new Integer(i)});
            return;
        }
        lg5Var.k(i + 8);
        int h = i + 12 + (lg5Var.h() * 12);
        lg5Var.k(h);
        int h2 = lg5Var.h();
        if (h2 != 0) {
            this.b = new SparseArray<>();
            for (int i2 = 0; i2 < h2; i2++) {
                int i3 = i2 * 8;
                lg5Var.k(h + 4 + i3);
                int h3 = lg5Var.h();
                lg5Var.k(h + 8 + i3);
                int i4 = h3 + i;
                this.b.put(i2, lg5Var.d(i4, lg5Var.h() + i4));
            }
        }
    }

    public SparseArray<byte[]> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("dd425d0d", new Object[]{this});
        }
        return this.b;
    }

    public boolean d(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        a16 a16Var = this.f21607a;
        if (a16Var != null) {
            int e = a16Var.e();
            lg5Var.k(e);
            try {
                a(lg5Var, e, this.f21607a.d());
                b(lg5Var, e);
                return true;
            } catch (Exception e2) {
                throw new DXLoaderException("error load expr " + e2.getMessage());
            }
        } else {
            throw new DXLoaderException("error load expr indexSectionLoader null");
        }
    }
}
