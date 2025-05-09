package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopCacheEvent extends MtopFinishEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299878);
    }

    public MtopCacheEvent(MtopResponse mtopResponse) {
        super(mtopResponse);
    }

    public static /* synthetic */ Object ipc$super(MtopCacheEvent mtopCacheEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/MtopCacheEvent");
    }

    @Override // mtopsdk.mtop.common.MtopFinishEvent
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopCacheEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", mtopResponse=");
        sb.append(this.mtopResponse);
        sb.append("]");
        return sb.toString();
    }
}
