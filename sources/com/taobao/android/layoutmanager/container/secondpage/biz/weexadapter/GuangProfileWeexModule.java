package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import tb.cod;
import tb.d7x;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GuangProfileWeexModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GuangProfileWeexModule";
    private d7x mWeexModuleInterface;

    static {
        t2o.a(502268077);
        t2o.a(982515802);
    }

    @WeexMethod(uiThread = true)
    public void back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58bdee", new Object[]{this});
            return;
        }
        Object tag = this.mWeexModuleInterface.getInstance().getTag("profileContainer");
        tfs.e(TAG, "weex profile click back in " + tag);
        if (tag instanceof cod) {
            ((cod) tag).back();
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
        } else {
            this.mWeexModuleInterface = d7xVar;
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }
}
