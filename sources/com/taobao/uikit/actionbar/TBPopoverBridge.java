package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.actionbar.ShowTBPublicMenu;
import org.json.JSONException;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPopoverBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "TBPopoverBridge";
    private static final String SHOW = "show";

    static {
        t2o.a(927989810);
    }

    public static /* synthetic */ Object ipc$super(TBPopoverBridge tBPopoverBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/TBPopoverBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("show".equals(str)) {
            try {
                ShowTBPublicMenu.show((Activity) this.mContext, str2, new ShowTBPublicMenu.CallBack() { // from class: com.taobao.uikit.actionbar.TBPopoverBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.ShowTBPublicMenu.CallBack
                    public void callBack(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ef34536", new Object[]{this, str3});
                            return;
                        }
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 != null) {
                            WVStandardEventCenter.postNotificationToJS(wVCallBackContext2.getWebview(), "customPopoverItemClicked", str3);
                        }
                    }
                });
                wVCallBackContext.success();
            } catch (JSONException e) {
                TLog.loge(NAME, "JSONException", e);
                wVCallBackContext.error(e.getMessage());
            }
        }
        return false;
    }
}
