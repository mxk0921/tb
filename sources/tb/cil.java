package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cil extends zt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(cil cilVar, String str, Object... objArr) {
        if (str.hashCode() == 1847240272) {
            super.onUCCorePrepared();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pha/tb/PHAUcEnv$1");
    }

    @Override // tb.zt4
    public void onUCCorePrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
            return;
        }
        super.onUCCorePrepared();
        lcn.f(RVLLevel.Error, "PHASetUp", "WVCore onUCCorePrepared");
    }
}
