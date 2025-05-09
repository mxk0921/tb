package anet.channel.request;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FutureCancelable implements Cancelable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FutureCancelable NULL = new FutureCancelable(null, null);
    private final Future<?> future;
    private final String seq;

    static {
        t2o.a(607125696);
        t2o.a(607125695);
    }

    public FutureCancelable(Future<?> future, String str) {
        this.future = future;
        this.seq = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.future != null) {
            ALog.i("awcn.FutureCancelable", "cancel request", this.seq, new Object[0]);
            this.future.cancel(true);
        }
    }
}
