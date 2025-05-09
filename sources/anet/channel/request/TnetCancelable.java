package anet.channel.request;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TnetCancelable implements Cancelable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TnetCancelable NULL = new TnetCancelable(null, 0, null);
    private final String seq;
    private final SpdySession spdySession;
    private final int streamId;

    static {
        t2o.a(607125701);
        t2o.a(607125695);
    }

    public TnetCancelable(SpdySession spdySession, int i, String str) {
        this.spdySession = spdySession;
        this.streamId = i;
        this.seq = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        try {
            if (this.spdySession != null && (i = this.streamId) != 0) {
                ALog.i("awcn.TnetCancelable", "cancel tnet request", this.seq, "streamId", Integer.valueOf(i));
                this.spdySession.streamReset(this.streamId, 5);
            }
        } catch (SpdyErrorException e) {
            ALog.e("awcn.TnetCancelable", "request cancel failed.", this.seq, e, "errorCode", Integer.valueOf(e.SpdyErrorGetCode()));
        }
    }
}
