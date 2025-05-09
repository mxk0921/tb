package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<byte[]> f20924a;
    public int b;
    public int c;

    static {
        t2o.a(444597891);
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
            this.f20924a = new SparseArray<>();
            for (int i2 = 0; i2 < h2; i2++) {
                int i3 = i2 * 8;
                lg5Var.k(h + 4 + i3);
                int h3 = lg5Var.h();
                lg5Var.k(h + 8 + i3);
                int i4 = h3 + i;
                this.f20924a.put(i2, lg5Var.d(i4, lg5Var.h() + i4));
            }
        }
    }

    public SparseArray<byte[]> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("dd425d0d", new Object[]{this});
        }
        return this.f20924a;
    }

    public boolean d(lg5 lg5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a05386f6", new Object[]{this, lg5Var})).booleanValue();
        }
        lg5Var.k(this.b);
        try {
            a(lg5Var, this.b, this.c);
            b(lg5Var, this.b);
            return true;
        } catch (Exception e) {
            throw new DXLoaderException("error load expr " + e.getMessage());
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6241c511", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75807baa", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
