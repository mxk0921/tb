package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.baobao.BaobaoManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xso implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        JSONObject parseObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (i != 3005 || objArr == null) {
            return null;
        }
        try {
            Object obj = objArr[0];
            if (obj == null || (parseObject = JSON.parseObject(obj.toString())) == null || !"sceneCartRefresh".equals(parseObject.getString("event"))) {
                return null;
            }
            BaobaoManager instance = BaobaoManager.getInstance();
            if (parseObject.getJSONObject("param") != null && "checkClick.cartSelect".equals(parseObject.getJSONObject("param").getString("operatorEvent"))) {
                z = false;
            }
            instance.doRequest(false, z);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
