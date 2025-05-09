package tb;

import android.content.Context;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ikz extends a02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(393216039);
    }

    public ikz(Call call) throws IPCException {
        super(call);
    }

    public static /* synthetic */ Object ipc$super(ikz ikzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/reply/impl/ProcessInfoReplyHandler");
    }

    @Override // tb.a02
    public Object b(Object[] objArr) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("40032da0", new Object[]{this, objArr});
        }
        Context r = re.r();
        String str = "pkg:" + r.getPackageName() + ", process:" + cp.b(r) + ", pid:" + Process.myPid();
        b5d.i("ProcessInfoReplyHandler", "invoke", "result", str);
        return str;
    }
}
