package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CountObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String arg;
    public String module;
    public String modulePoint;
    public double value;

    static {
        t2o.a(607125754);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("[module:");
        sb.append(this.module);
        sb.append(" modulePoint:");
        sb.append(this.modulePoint);
        sb.append(" arg:");
        sb.append(this.arg);
        sb.append(" value:");
        sb.append(this.value);
        sb.append("]");
        return sb.toString();
    }
}
