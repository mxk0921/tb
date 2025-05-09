package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.taobaoavsdk.AVSDKLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985072);
    }

    public static ContentDetailData a(DWResponse dWResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentDetailData) ipChange.ipc$dispatch("d4b8f4f7", new Object[]{dWResponse});
        }
        if (dWResponse == null || (jSONObject = dWResponse.data) == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            return (ContentDetailData) JSON.parseObject(dWResponse.data.toString(), ContentDetailData.class);
        } catch (Throwable th) {
            AVSDKLog.e("HIV", th.toString());
            return null;
        }
    }

    public static DWInteractiveVideoObject b(DWResponse dWResponse) throws JSONException {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveVideoObject) ipChange.ipc$dispatch("83a12cd6", new Object[]{dWResponse});
        }
        if (dWResponse == null || (jSONObject = dWResponse.data) == null || jSONObject.length() <= 0) {
            return null;
        }
        return new DWInteractiveVideoObject(dWResponse.data);
    }
}
