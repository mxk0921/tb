package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nfl extends ky1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593232);
    }

    public static /* synthetic */ Object ipc$super(nfl nflVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/edgecomputing/node/OtherNode");
    }

    @Override // tb.ky1
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35374867", new Object[]{this});
        }
        return "other_node";
    }
}
