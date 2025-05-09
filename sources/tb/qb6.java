package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.s16;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597037);
    }

    public boolean a(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41eb5edb", new Object[]{this, dXRuntimeContext, new Boolean(z)})).booleanValue();
        }
        jb6.r(new s16.a(dXRuntimeContext, z));
        return true;
    }
}
