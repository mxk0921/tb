package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup.JoingroupRequest;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vuf extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699596);
    }

    public vuf(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(vuf vufVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/profile/joingroup/JoinGroupBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3d47e0", new Object[]{this, str});
            return;
        }
        JoingroupRequest joingroupRequest = new JoingroupRequest();
        joingroupRequest.groupId = str;
        HashMap hashMap = new HashMap();
        hashMap.put("app", "live_fans_chat_group");
        joingroupRequest.properties = hashMap;
        C(0, joingroupRequest, null);
    }
}
