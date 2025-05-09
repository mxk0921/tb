package com.alipay.android.app.render.birdnest;

import com.alipay.android.app.render.api.callback.ICashierRenderCallback;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback3;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class RenderCallbackProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ICashierRenderCallback f3488a;

    public RenderCallbackProxy(ICashierRenderCallback iCashierRenderCallback) {
        this.f3488a = iCashierRenderCallback;
    }

    public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str});
            return;
        }
        onTemplateCallbackChanged(iTemplateClickCallback);
        ICashierRenderCallback iCashierRenderCallback = this.f3488a;
        if (iCashierRenderCallback instanceof ICashierRenderCallback3) {
            ((ICashierRenderCallback3) iCashierRenderCallback).onAsyncEvent(iTemplateClickCallback, obj, str);
        } else if (iCashierRenderCallback != null) {
            iCashierRenderCallback.onAsyncEvent(str);
        }
    }

    public void onEvent(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str});
            return;
        }
        ICashierRenderCallback iCashierRenderCallback = this.f3488a;
        if (iCashierRenderCallback instanceof ICashierRenderCallback3) {
            ((ICashierRenderCallback3) iCashierRenderCallback).onEvent(obj, str);
        } else if (iCashierRenderCallback != null) {
            iCashierRenderCallback.onEvent(str);
        }
    }

    public String onGetCustomAttr(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8229915a", new Object[]{this, obj, str});
        }
        ICashierRenderCallback iCashierRenderCallback = this.f3488a;
        if (iCashierRenderCallback != null) {
            return iCashierRenderCallback.onGetCustomAttr(obj, str);
        }
        return "";
    }

    public abstract void onTemplateCallbackChanged(ITemplateClickCallback iTemplateClickCallback);
}
