package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.model.DXLongSparseArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class id6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXLongSparseArray<String> f21251a;

    static {
        t2o.a(444597039);
        t2o.a(444597041);
    }

    public String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("faeee2ea", new Object[]{this, new Long(j)});
        }
        DXLongSparseArray<String> dXLongSparseArray = this.f21251a;
        if (dXLongSparseArray != null && dXLongSparseArray.get(j) != null) {
            return this.f21251a.get(j);
        }
        if (!DinamicXEngine.j0()) {
            return null;
        }
        Log.e("StringLoader_TMTEST", "getString null:" + j);
        return null;
    }

    public boolean b(int i, lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("197e3192", new Object[]{this, new Integer(i), lg5Var, dXRuntimeContext})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        int b = lg5Var.b();
        short j = lg5Var.j();
        if (j < 0) {
            dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_VARSTRING_LOADER_COUNT_ERROR));
            return false;
        }
        this.f21251a = new DXLongSparseArray<>(j);
        for (int i2 = 0; i2 < j; i2++) {
            long i3 = lg5Var.i();
            short j2 = lg5Var.j();
            if (lg5Var.c() + j2 <= b) {
                this.f21251a.put(i3, new String(lg5Var.a(), lg5Var.c(), (int) j2));
                lg5Var.l(j2);
            } else {
                dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", 70005));
                Log.e("StringLoader_TMTEST", "read string over");
                return false;
            }
        }
        return true;
    }
}
