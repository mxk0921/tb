package com.taobao.android.weex_ability.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSEventModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "event";

    static {
        t2o.a(980418663);
    }

    public MUSEventModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSEventModule mUSEventModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/MUSEventModule");
    }

    @MUSMethod(uiThread = true)
    public void openURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2792af96", new Object[]{this, str});
        } else if (getInstance() != null) {
            MUSDKInstance mUSDKInstance = (MUSDKInstance) getInstance();
            if (mUSDKInstance.getActivityNav() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                mUSDKInstance.getActivityNav().a(getInstance().getUIContext(), getInstance(), jSONObject.toString());
            }
        }
    }
}
