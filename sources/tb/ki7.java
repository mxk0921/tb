package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ki7 implements IContainerDataService.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IFoldDeviceAndPadService f22688a;

    static {
        t2o.a(491782513);
        t2o.a(488636644);
    }

    public ki7(cfc cfcVar) {
        this.f22688a = (IFoldDeviceAndPadService) cfcVar.a(IFoldDeviceAndPadService.class);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.f
    public Map<String, String> a(w1e w1eVar, String str) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("80a7626", new Object[]{this, w1eVar, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (gj7.a()) {
            boolean c = gj7.c(Globals.getApplication());
            IFoldDeviceAndPadService iFoldDeviceAndPadService = this.f22688a;
            if (iFoldDeviceAndPadService == null || !iFoldDeviceAndPadService.isAdaptHudScreen()) {
                z = false;
            }
            if (c) {
                str2 = ytc.TYPE_FOLD;
            } else {
                str2 = "expand";
            }
            jSONObject.put("foldStatus", (Object) str2);
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "foldPhone");
            jSONObject.put("isHudScreenData", (Object) String.valueOf(z));
            fve.e("DeviceInfoParamCreator", "折叠屏手机上行机型参数: " + c + " 当前是否是大屏数据: " + z);
        } else if (gj7.e()) {
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "androidPad");
            IFoldDeviceAndPadService iFoldDeviceAndPadService2 = this.f22688a;
            if (iFoldDeviceAndPadService2 == null || !iFoldDeviceAndPadService2.isAdaptHudScreen()) {
                z = false;
            }
            jSONObject.put("isHudScreenData", (Object) String.valueOf(z));
            fve.e("DeviceInfoParamCreator", "Pad上行机型参数, 当前是否是大屏数据: " + z);
        } else {
            fve.e("DeviceInfoParamCreator", "普通手机上行机型参数");
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) "phone");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceInfo", jSONObject.toJSONString());
        return hashMap;
    }
}
