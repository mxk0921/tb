package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class btq extends cs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IDMComponent g;

    static {
        t2o.a(479199315);
    }

    public btq(zxb zxbVar, Context context, b3o b3oVar) {
        super(zxbVar, context, b3oVar);
    }

    public static /* synthetic */ Object ipc$super(btq btqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/StructureCartRequester");
    }

    @Override // tb.cs1
    public opq d(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("ae91335f", new Object[]{this, fsbVar});
        }
        return i().j(this.g, fsbVar);
    }

    @Override // tb.cs1
    public void g(ux uxVar, fsb fsbVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa576c99", new Object[]{this, uxVar, fsbVar, obj});
        } else if (this.g != null) {
            this.e.m().c(this.d, new o3o(uxVar));
        } else {
            throw new IllegalStateException("we find you not call setTrigger() method first before you call AdjustCartRequester's sendRequest() method");
        }
    }

    public w55 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("9c8c26c0", new Object[]{this});
        }
        return e();
    }

    public void j(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7fbef7", new Object[]{this, iDMComponent});
        } else {
            this.g = iDMComponent;
        }
    }
}
