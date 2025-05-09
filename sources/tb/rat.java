package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.single.OpenSingleViewContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093014);
        t2o.a(779093013);
    }

    public Object a(jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b52bb13", new Object[]{this, jbtVar, objArr});
        }
        if (jbtVar == null || jbtVar.f21907a == null || objArr == null || objArr.length <= 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof TaoliveOpenLiveRoom)) {
            return null;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) obj;
        OpenSingleViewContainer openSingleViewContainer = new OpenSingleViewContainer();
        openSingleViewContainer.k(jbtVar.f21907a, taoliveOpenLiveRoom);
        cf cfVar = taoliveOpenLiveRoom.eventCompontent;
        if (cfVar != null) {
            cfVar.f(new pbt(openSingleViewContainer));
        }
        cf cfVar2 = taoliveOpenLiveRoom.eventCompontent;
        if (cfVar2 != null) {
            cfVar2.d(jbtVar.e);
        }
        return openSingleViewContainer.e;
    }
}
