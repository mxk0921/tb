package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093021);
        t2o.a(779093013);
    }

    public Object a(jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b52bb13", new Object[]{this, jbtVar, objArr});
        }
        if (jbtVar == null || jbtVar.f21907a == null || objArr == null || objArr.length <= 1) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof TaoliveOpenLiveRoom)) {
            return null;
        }
        nbt nbtVar = new nbt(jbtVar.f21907a, objArr[1]);
        cf cfVar = ((TaoliveOpenLiveRoom) obj).eventCompontent;
        if (cfVar != null) {
            cfVar.f(nbtVar);
        }
        return nbtVar.f;
    }
}
