package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.model.DXLongSparseArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gd5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f19909a;
    public int b;
    public DXLongSparseArray<String> c;

    static {
        t2o.a(444597026);
        t2o.a(444597041);
    }

    public String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("faeee2ea", new Object[]{this, new Long(j)});
        }
        DXLongSparseArray<String> dXLongSparseArray = this.c;
        if (dXLongSparseArray != null && dXLongSparseArray.get(j) != null) {
            return this.c.get(j);
        }
        if (!DinamicXEngine.j0()) {
            return null;
        }
        Log.e("DXBigStringLoader", "getString null:" + j);
        return null;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18bb5c7", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5395b", new Object[]{this, new Integer(i)});
        } else {
            this.f19909a = i;
        }
    }

    public boolean b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        if (this.b == 0) {
            return true;
        }
        int i = this.f19909a;
        if (i <= 0) {
            return false;
        }
        lg5Var.k(i);
        int b = lg5Var.b();
        short j = lg5Var.j();
        if (j < 0) {
            dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_VARSTRING_LOADER_COUNT_ERROR));
            return false;
        }
        this.c = new DXLongSparseArray<>(j);
        for (int i2 = 0; i2 < j; i2++) {
            long i3 = lg5Var.i();
            int h = lg5Var.h();
            if (lg5Var.c() + h <= b) {
                this.c.put(i3, new String(lg5Var.a(), lg5Var.c(), h));
                lg5Var.l(h);
            } else {
                dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_BIGSTRING_LOADER_ERROR));
                Log.e("DXBigStringLoader", "read bigstring over");
                return false;
            }
        }
        return true;
    }
}
