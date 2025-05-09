package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class cz implements rtd, u3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740740);
        t2o.a(157286534);
        t2o.a(80740748);
    }

    @Override // tb.rtd
    public final void c(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797ded1", new Object[]{this, b8vVar});
        } else if (b8vVar == null) {
            dxu.a().e(getClass().getSimpleName(), "ultronEvent is null");
        } else {
            Object i = b8vVar.i("umfEventModel");
            if (!(i instanceof bxu)) {
                b4e a2 = dxu.a();
                String simpleName = getClass().getSimpleName();
                a2.e(simpleName, "extra data[" + i + "] of UMFTaobaoAdapterConstant.EventParams.KEY_EVENT_MODEL is not UMFEventModel");
                return;
            }
            e((bxu) i);
        }
    }

    public abstract void e(bxu bxuVar);
}
