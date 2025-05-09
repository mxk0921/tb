package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXJSExceptionInfo;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qtw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTERACTION_TAG = "wxInteractionAnalyzer";

    static {
        t2o.a(985661630);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a693d191", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void b(WXJSExceptionInfo wXJSExceptionInfo, String str) {
        List<zae> wXAnalyzerList;
        WXSDKInstance sDKInstance;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e6b173", new Object[]{wXJSExceptionInfo, str});
        } else if (WXEnvironment.isApkDebugable() && (wXAnalyzerList = WXSDKManager.getInstance().getWXAnalyzerList()) != null && wXAnalyzerList.size() != 0 && (sDKInstance = WXSDKManager.getInstance().getSDKInstance(str)) != null) {
            WXErrorCode errCode = wXJSExceptionInfo.getErrCode();
            try {
                str2 = new JSONObject().put("instanceId", str).put("url", sDKInstance.getBundleUrl()).put("errorCode", errCode.getErrorCode()).put("errorMsg", errCode.getErrorMsg()).put("errorGroup", errCode.getErrorGroup()).toString();
            } catch (Exception e) {
                e.printStackTrace();
                str2 = "";
            }
            for (zae zaeVar : wXAnalyzerList) {
                zaeVar.a("WXAnalyzer", "WXError", errCode.getErrorType().toString(), str2);
            }
        }
    }
}
