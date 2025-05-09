package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.tao.Globals;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xza implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809371);
        t2o.a(729809365);
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return a(str2, wVCallBackContext);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("getFoldDeviceInfo");
    }

    public boolean a(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539e998d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            nsw nswVar = new nsw();
            if (b9b.e()) {
                str2 = "foldPhone";
                boolean g = b9b.g(Globals.getApplication());
                if (g) {
                    str3 = ytc.TYPE_FOLD;
                } else {
                    str3 = "expand";
                }
                jSONObject.put("foldStatus", str3);
                bqa.d("homepage.HomePageWVPlugin", "折叠屏手机weex折叠态判断， 折叠态：" + g);
            } else if (b9b.h()) {
                str2 = "androidPad";
                bqa.d("homepage.HomePageWVPlugin", "Pad weex判断机型参数");
            } else {
                str2 = "phone";
            }
            jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, str2);
            nswVar.d("deviceInfo", jSONObject);
            wVCallBackContext.success(nswVar);
            uqa.b("Bridge", "getFoldDeviceInfo", "homepage.HomePageWVPlugin.getFoldDeviceInfo; success");
        } catch (Throwable th) {
            uqa.b("Bridge", "getFoldDeviceInfo", "homepage.HomePageWVPlugin.getFoldDeviceInfo; fail; exception: " + Log.getStackTraceString(th));
        }
        return true;
    }
}
