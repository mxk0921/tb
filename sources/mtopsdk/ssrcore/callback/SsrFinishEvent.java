package mtopsdk.ssrcore.callback;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopEvent;
import tb.egq;
import tb.i7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SsrFinishEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String seqNo;
    private egq ssrResponse;
    public i7j statistics;

    public SsrFinishEvent(egq egqVar) {
        this.ssrResponse = egqVar;
    }

    public static /* synthetic */ Object ipc$super(SsrFinishEvent ssrFinishEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/ssrcore/callback/SsrFinishEvent");
    }

    public egq getSsrResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egq) ipChange.ipc$dispatch("62350f96", new Object[]{this});
        }
        return this.ssrResponse;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrFinishEvent{ssrResponse=" + this.ssrResponse + ", seqNo='" + this.seqNo + "'}";
    }
}
