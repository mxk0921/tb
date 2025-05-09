package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.interact.comment.SendCommentsRequest;
import com.taobao.taolive.sdk.business.interact.comment.SendCommentsResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cap extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356009);
    }

    public cap(b0d b0dVar) {
        super(b0dVar, true);
    }

    public static /* synthetic */ Object ipc$super(cap capVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/comment/SendCommentsBusiness");
    }

    public final void K(SendCommentsRequest sendCommentsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431f4c89", new Object[]{this, sendCommentsRequest});
        } else if (dlg.a() != null) {
            String L = L(dlg.a().e());
            if (!TextUtils.isEmpty(L)) {
                sendCommentsRequest.extraFlag = L;
            }
        }
    }

    public final String L(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d97ac30", new Object[]{this, map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (map.keySet() != null && map.keySet().size() > 0) {
            for (String str : map.keySet()) {
                jSONObject.put(str, (Object) map.get(str));
            }
        }
        return JSON.toJSONString(jSONObject);
    }

    public void M(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a24c652", new Object[]{this, str, str2, str3, hashMap});
            return;
        }
        SendCommentsRequest sendCommentsRequest = new SendCommentsRequest();
        sendCommentsRequest.accountId = str;
        sendCommentsRequest.topic = str2;
        sendCommentsRequest.content = str3;
        sendCommentsRequest.renders = hashMap;
        K(sendCommentsRequest);
        C(1, sendCommentsRequest, SendCommentsResponse.class);
        Q();
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c53b4b1", new Object[]{this});
        } else {
            giv.f().f("comment_test", new HashMap());
        }
    }
}
