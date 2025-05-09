package com.alipay.android.msp.ui.birdnest.render.ext;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TplProvider implements ITplProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.app.cctemplate.api.ITplProvider
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return GlobalHelper.getInstance().getContext();
    }

    @Override // com.alipay.android.app.cctemplate.api.ITplProvider
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return PhoneCashierMspEngine.getMspBase().getResources(null);
    }

    @Override // com.alipay.android.app.cctemplate.api.ITplProvider
    public void onComplated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb68e37", new Object[]{this});
        }
    }
}
