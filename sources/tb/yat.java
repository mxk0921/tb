package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093024);
        t2o.a(779093013);
    }

    public Object a(jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b52bb13", new Object[]{this, jbtVar, objArr});
        }
        if (jbtVar == null || jbtVar.f21907a == null || objArr == null) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        Object obj2 = map.get("activity");
        Object obj3 = map.get("url");
        Object obj4 = map.get(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Object obj5 = map.get("taoliveOpenLiveRoom");
        Object obj6 = map.get("tLiveRoomConfig");
        if (obj4 != null) {
            if (!(obj2 instanceof Activity) || !(obj4 instanceof Intent) || !(obj5 instanceof TaoliveOpenLiveRoom)) {
                return null;
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) obj5;
            obt obtVar = new obt((Activity) obj2, (Intent) obj4, taoliveOpenLiveRoom);
            cf cfVar = taoliveOpenLiveRoom.eventCompontent;
            if (cfVar != null) {
                cfVar.f(obtVar);
            }
            cf cfVar2 = taoliveOpenLiveRoom.eventCompontent;
            if (cfVar2 != null) {
                cfVar2.d(jbtVar.e);
            }
            return obtVar.getView();
        } else if (!(obj2 instanceof Activity) || !(obj3 instanceof String) || !(obj5 instanceof TaoliveOpenLiveRoom)) {
            return null;
        } else {
            TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = (TaoliveOpenLiveRoom) obj5;
            obt obtVar2 = new obt((Activity) obj2, String.valueOf(obj3), (y3s) obj6, taoliveOpenLiveRoom2);
            cf cfVar3 = taoliveOpenLiveRoom2.eventCompontent;
            if (cfVar3 != null) {
                cfVar3.f(obtVar2);
            }
            cf cfVar4 = taoliveOpenLiveRoom2.eventCompontent;
            if (cfVar4 != null) {
                cfVar4.d(jbtVar.e);
            }
            return obtVar2.getView();
        }
    }
}
