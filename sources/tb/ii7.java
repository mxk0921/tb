package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ii7 implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808959);
        t2o.a(729808960);
    }

    @Override // tb.fjb
    public String build() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (b9b.e()) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "foldPhone");
            boolean g = b9b.g(Globals.getApplication());
            if (g) {
                str = ytc.TYPE_FOLD;
            } else {
                str = "expand";
            }
            jSONObject.put("foldStatus", (Object) str);
            bqa.d("DeviceInfoBizParams", "折叠屏手机上行机型参数, 折叠态：" + g);
            return jSONObject.toJSONString();
        } else if (b9b.h()) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "androidPad");
            bqa.d("DeviceInfoBizParams", "Pad上行机型参数");
            return jSONObject.toJSONString();
        } else {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "phone");
            bqa.d("DeviceInfoBizParams", "Phone上行机型参数");
            return jSONObject.toJSONString();
        }
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "deviceInfo";
    }
}
