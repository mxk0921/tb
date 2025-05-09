package com.alipay.android.msp.ui.birdnest.render.api;

import android.content.Context;
import com.alipay.android.app.cctemplate.api.ITplTransport;
import com.alipay.android.app.crender.ext.TemplateTransport;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.ui.base.keyboard.MspKeyboardService;
import com.alipay.android.msp.ui.birdnest.render.ext.CashierProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspRenderImpl extends MspRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ICashierProvider mProvider;
    private ITplTransport mTransport;

    public MspRenderImpl() {
        this.mRender.setTplTransport(getTplTransport());
        this.mRender.setProvider(getProvider());
    }

    private ICashierProvider getProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierProvider) ipChange.ipc$dispatch("2dde5263", new Object[]{this});
        }
        CashierProvider cashierProvider = new CashierProvider();
        this.mProvider = cashierProvider;
        return cashierProvider;
    }

    private ITplTransport getTplTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITplTransport) ipChange.ipc$dispatch("e48f352a", new Object[]{this});
        }
        TemplateTransport templateTransport = new TemplateTransport();
        this.mTransport = templateTransport;
        return templateTransport;
    }

    public static /* synthetic */ Object ipc$super(MspRenderImpl mspRenderImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/birdnest/render/api/MspRenderImpl");
    }

    @Override // com.alipay.android.msp.ui.birdnest.render.api.MspRender
    public void initializeKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d173f49e", new Object[]{this});
        } else if (this.mMspKeyboardService == null) {
            this.mMspKeyboardService = new MspKeyboardService(MspKeyboardService.BIRDNEST_RENDER);
        }
    }

    @Override // com.alipay.android.msp.ui.birdnest.render.api.MspRender
    public void setKeyboardService(MspContext mspContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc46eddf", new Object[]{this, mspContext, context});
        } else {
            this.mRender.setKeyBoardService(this.mMspKeyboardService);
        }
    }
}
