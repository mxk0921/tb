package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hh5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f20638a;
    public SparseArray<Object> b;

    static {
        t2o.a(444597859);
        t2o.a(444597873);
    }

    public hh5(a16 a16Var) {
        this.f20638a = a16Var;
    }

    public SparseArray<Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("1db0e933", new Object[]{this});
        }
        return this.b;
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af58d378", new Object[]{this, new Integer(i)});
        }
        SparseArray<Object> sparseArray = this.b;
        if (sparseArray == null) {
            return null;
        }
        return String.valueOf(sparseArray.valueAt(i));
    }

    public final int d(lg5 lg5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("198a4fdb", new Object[]{this, lg5Var})).intValue();
        }
        byte e = lg5Var.e();
        if (e >= 0 && e <= 125) {
            return e;
        }
        if (e == 126) {
            return lg5Var.j();
        }
        if (e == Byte.MAX_VALUE) {
            return lg5Var.h();
        }
        if (!DinamicXEngine.j0()) {
            return -1;
        }
        throw new DXLoaderException("字符串过长, 已经超出最大长度2147483647");
    }

    public boolean c(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f20638a.c());
        int h = lg5Var.h();
        for (int i = 0; i < h; i++) {
            short j = lg5Var.j();
            if (j == 4) {
                int d = d(lg5Var);
                if (d > 0) {
                    str = new String(lg5Var.a(), lg5Var.c(), d);
                    lg5Var.k(lg5Var.c() + d);
                } else if (d == 0) {
                    str = "";
                } else {
                    throw new DXLoaderException("字符串长度有问题: " + d);
                }
                if (this.b == null) {
                    this.b = new SparseArray<>();
                }
                this.b.put(i, str);
            } else {
                throw new DXLoaderException("不认识的常量类型" + ((int) j));
            }
        }
        return true;
    }
}
