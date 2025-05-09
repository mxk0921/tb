package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wat extends sat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093017);
    }

    public static /* synthetic */ Object ipc$super(wat watVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/gateway/command/impl/TaoliveGCCreateOpenLiveRoomCommand");
    }

    public Object a(jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b52bb13", new Object[]{this, jbtVar, objArr});
        }
        kbt kbtVar = new kbt();
        mbt mbtVar = new mbt(jbtVar);
        rbt a2 = new rbt().a(jbtVar);
        ibt ibtVar = new ibt();
        ibtVar.a(jbtVar);
        return TaoliveOpenLiveRoom.builder().f(jbtVar).d(kbtVar).e(mbtVar).g(a2).b(ibtVar).c(jbtVar.b).a();
    }
}
