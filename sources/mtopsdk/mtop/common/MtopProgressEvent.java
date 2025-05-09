package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopProgressEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String desc;
    public String seqNo;
    public int size;
    public int total;

    static {
        t2o.a(589299890);
    }

    public MtopProgressEvent(String str, int i, int i2) {
        this.desc = str;
        this.size = i;
        this.total = i2;
    }

    public static /* synthetic */ Object ipc$super(MtopProgressEvent mtopProgressEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/MtopProgressEvent");
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.desc;
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.size;
    }

    public int getTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue();
        }
        return this.total;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("MtopProgressEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", total=");
        sb.append(this.total);
        sb.append("]");
        return sb.toString();
    }
}
