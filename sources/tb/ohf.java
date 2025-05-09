package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list.InteractiveNeedShowRequest;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list.InteractiveNeedShowResponse;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ohf extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699843);
    }

    public ohf(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(ohf ohfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/business/list/InteractiveNeedShowBusiness");
    }

    public final String K(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc963a0a", new Object[]{this, hashMap});
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(z9u.KEY_ROOMTYPE, hashMap.get(z9u.KEY_ROOMTYPE));
        hashMap2.put("newRoomType", hashMap.get("newRoomType"));
        hashMap2.put("isLandScape", hashMap.get("isLandScape"));
        return fkx.i(hashMap2);
    }

    public void L(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cbbdf3", new Object[]{this, str, str2, hashMap});
            return;
        }
        JSONObject d = fkx.d(str);
        if (d != null) {
            InteractiveNeedShowRequest interactiveNeedShowRequest = new InteractiveNeedShowRequest();
            interactiveNeedShowRequest.setAPI_NAME(d.getString("api"));
            interactiveNeedShowRequest.setVERSION(d.getString("version"));
            interactiveNeedShowRequest.liveId = hashMap.get("live_id");
            interactiveNeedShowRequest.anchorId = hashMap.get(z9u.KEY_ACCOUNT_ID);
            interactiveNeedShowRequest.source = hashMap.get("livesource");
            interactiveNeedShowRequest.componentName = str2;
            interactiveNeedShowRequest.liveUrl = hashMap.get(yj4.PARAM_MEDIA_INFO_LIVEURL);
            interactiveNeedShowRequest.extendParams = K(hashMap);
            E(1, interactiveNeedShowRequest, InteractiveNeedShowResponse.class, false, true);
        }
    }
}
