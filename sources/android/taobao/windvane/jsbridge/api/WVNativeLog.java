package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.lcn;
import tb.t2o;
import tb.vpw;
import tb.wpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVNativeLog extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mUsedSize = 0;

    static {
        t2o.a(989856291);
    }

    public static /* synthetic */ Object ipc$super(WVNativeLog wVNativeLog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVNativeLog");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("write".equals(str)) {
            return write(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean write(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b410071", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        wpw wpwVar = vpw.commonConfig;
        if (!wpwVar.W0 || wVCallBackContext == null || wVCallBackContext.getWebview() == null) {
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                return false;
            }
            String string = parseObject.getString("ext");
            String string2 = parseObject.getString("errorMsg");
            if (string != null) {
                this.mUsedSize += string.length();
            }
            if (string2 != null) {
                this.mUsedSize += string2.length();
            }
            if (this.mUsedSize >= wpwVar.f1) {
                wVCallBackContext.error("FAILED", "累计的日志已超过单个页面写入客户端日志的上限 " + wpwVar.f1 + "KB");
                return false;
            }
            lcn.g("JS/TraceLog", wVCallBackContext.getPid(), str);
            wVCallBackContext.success();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
