package com.taobao.uikit.actionbar;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.actionbar.ShowTBPublicMenu;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import org.json.JSONException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBPopoverModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBPopoverModule";

    static {
        t2o.a(927989812);
    }

    public static /* synthetic */ Object ipc$super(TBPopoverModule tBPopoverModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/TBPopoverModule");
    }

    @JSMethod(uiThread = true)
    public void show(String str, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190563fa", new Object[]{this, str, jSCallback});
            return;
        }
        try {
            ShowTBPublicMenu.show((Activity) this.mWXSDKInstance.getContext(), str, new ShowTBPublicMenu.CallBack() { // from class: com.taobao.uikit.actionbar.TBPopoverModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.ShowTBPublicMenu.CallBack
                public void callBack(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ef34536", new Object[]{this, str2});
                    } else {
                        jSCallback.invoke(str2);
                    }
                }
            });
        } catch (JSONException e) {
            TLog.loge(TAG, "JSONException", e);
        }
    }
}
