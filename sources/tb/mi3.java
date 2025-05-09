package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mi3 extends ma4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject d;
    public vi3 e;
    public boolean f;

    static {
        t2o.a(667942969);
    }

    public static /* synthetic */ Object ipc$super(mi3 mi3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/ui/engine/structure/ChannelComponent");
    }

    public vi3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vi3) ipChange.ipc$dispatch("515674e8", new Object[]{this});
        }
        return this.e;
    }

    public void h(vi3 vi3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d12f612", new Object[]{this, vi3Var});
        } else {
            this.e = vi3Var;
        }
    }
}
