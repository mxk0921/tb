package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopFinishEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MtopResponse mtopResponse;
    public String seqNo;

    static {
        t2o.a(589299886);
    }

    public MtopFinishEvent(MtopResponse mtopResponse) {
        this.mtopResponse = mtopResponse;
    }

    public static /* synthetic */ Object ipc$super(MtopFinishEvent mtopFinishEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/MtopFinishEvent");
    }

    public MtopResponse getMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this});
        }
        return this.mtopResponse;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopFinishEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", mtopResponse");
        sb.append(this.mtopResponse);
        sb.append("]");
        return sb.toString();
    }
}
