package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXLongSparseArray<Map<String, Integer>> f18089a;
    public final id6 b;

    static {
        t2o.a(444597030);
    }

    public dv5(id6 id6Var) {
        this.b = id6Var;
    }

    public DXLongSparseArray<Map<String, Integer>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("d9aac96d", new Object[]{this});
        }
        return this.f18089a;
    }

    public boolean b(int i, lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("197e3192", new Object[]{this, new Integer(i), lg5Var, dXRuntimeContext})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        int c = lg5Var.c();
        short j = lg5Var.j();
        if (j < 0) {
            dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_COUNT_ERROR, "totalSize < 0"));
            return false;
        }
        this.f18089a = new DXLongSparseArray<>(j);
        int i2 = 0;
        while (i2 < j) {
            long i3 = lg5Var.i();
            byte e = lg5Var.e();
            if (e <= 0) {
                dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_ERROR, "count <= 0"));
                return z;
            }
            HashMap hashMap = new HashMap(e);
            for (int i4 = 0; i4 < e; i4++) {
                hashMap.put(this.b.a(lg5Var.i()), Integer.valueOf(lg5Var.h()));
            }
            this.f18089a.put(i3, hashMap);
            i2++;
            z = false;
        }
        if (lg5Var.c() - c == i) {
            return true;
        }
        dXRuntimeContext.m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_ERROR, "reader.getPos() - startPos != length"));
        return false;
    }
}
