package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopHeaderEvent extends MtopEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int code;
    private Map<String, List<String>> headers;
    public String seqNo;

    static {
        t2o.a(589299887);
    }

    public MtopHeaderEvent(int i, Map<String, List<String>> map) {
        this.code = i;
        this.headers = map;
    }

    public static /* synthetic */ Object ipc$super(MtopHeaderEvent mtopHeaderEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/common/MtopHeaderEvent");
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public Map<String, List<String>> getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this});
        }
        return this.headers;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopHeaderEvent [seqNo=");
        sb.append(this.seqNo);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append("]");
        return sb.toString();
    }
}
