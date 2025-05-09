package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g6y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f19764a;
    public byte[] b;
    public int c;
    public int d;

    public String toString() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("ProtocolData[");
        sb.append(hashCode());
        sb.append("] header==null:");
        if (this.f19764a == null) {
            z = true;
        }
        sb.append(z);
        sb.append(" offset:");
        sb.append(this.c);
        sb.append(" length:");
        sb.append(this.d);
        return sb.toString();
    }
}
