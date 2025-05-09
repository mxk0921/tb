package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s3b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809376);
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
        return Collections.singletonList("scrollToPosition");
    }

    public final boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e1ce0df", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("popParam");
            IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
            if (iHomeControllerService == null) {
                wVCallBackContext.error();
                return false;
            }
            IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
            if (currentSubTabController == null) {
                wVCallBackContext.error();
                return false;
            }
            wVCallBackContext.success();
            String string = jSONObject.getString("index");
            int parseInt = TextUtils.isEmpty(string) ? 0 : Integer.parseInt(string);
            if (!TextUtils.equals(jSONObject.getString("area"), "infoFlow")) {
                return false;
            }
            return currentSubTabController.smoothScrollToPositionFromInfoFlow(parseInt);
        } catch (Exception unused) {
            uqa.b("Bridge", "scrollToItem", "params parse exception");
            wVCallBackContext.error();
            return false;
        }
    }
}
