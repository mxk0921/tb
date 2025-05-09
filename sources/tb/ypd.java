package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.ShopTwoFloorSingleRoomController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ypd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092844);
    }

    public static xpd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd) ipChange.ipc$dispatch("ede089b2", new Object[0]);
        }
        return new ShopTwoFloorSingleRoomController();
    }
}
