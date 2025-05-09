package tb;

import android.util.Log;
import com.alibaba.android.bindingx.plugin.weex.WXBindingXModule;
import com.alibaba.android.bindingx.plugin.weex.WXExpressionBindingModule;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ab2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else if (k21.d()) {
            Log.e(k21.APM_POINT, "bindingx plugin is disabled by orange...");
        } else {
            WXSDKEngine.registerModule("expressionBinding", WXExpressionBindingModule.class);
            WXSDKEngine.registerModule("binding", WXBindingXModule.class);
            WXSDKEngine.registerModule(k21.APM_POINT, WXBindingXModule.class);
        }
    }
}
