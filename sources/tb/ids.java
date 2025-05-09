package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.kit.core.GlobalContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ids {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3ff2598", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
        if (!(messageBoxService == null || messageBoxService.getUnreadInfo() == null)) {
            jSONObject.put(mop.KEY_MSG_COUNT, (Object) Integer.valueOf(messageBoxService.getUnreadInfo().getTipNumber()));
        }
        return jSONObject;
    }
}
