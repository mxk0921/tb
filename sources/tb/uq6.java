package tb;

import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uq6 implements sq6, kr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286601);
        t2o.a(157286595);
        t2o.a(157286607);
    }

    @Override // tb.sq6
    public void a(wq6 wq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2b290d", new Object[]{this, wq6Var});
        }
    }

    @Override // tb.sq6
    public void b(wq6 wq6Var, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc6672d", new Object[]{this, wq6Var, ultronError});
        }
    }

    public lr6 c(lr6 lr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lr6) ipChange.ipc$dispatch("26f1b283", new Object[]{this, lr6Var});
        }
        return lr6Var;
    }

    public boolean d(wq6 wq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3da711", new Object[]{this, wq6Var})).booleanValue();
        }
        return true;
    }
}
