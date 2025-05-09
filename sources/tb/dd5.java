package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dd5 extends fd5<DXResult<DXRootView>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596637);
    }

    public dd5(p pVar, k kVar, ph5 ph5Var, DXRenderOptions dXRenderOptions, List<DXRuntimeContext> list, cd5 cd5Var, boolean z) {
        super(pVar, kVar, ph5Var, dXRenderOptions, list, cd5Var, z);
    }

    public static /* synthetic */ Object ipc$super(dd5 dd5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/asyncrender/batch/DXBatchPreRenderWorkTask");
    }

    @Override // tb.fd5
    public List<bd5> j(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1f659c4", new Object[]{this, dXRenderOptions});
        }
        ArrayList arrayList = new ArrayList();
        for (DXRuntimeContext dXRuntimeContext : this.e) {
            arrayList.add(new l86(dXRuntimeContext, dXRenderOptions, this.f19210a, this.b, dXRuntimeContext.s(), this.c, g()));
        }
        return arrayList;
    }
}
