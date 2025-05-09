package com.etao.feimagesearch.irp;

import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.DataPool;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.hgw;
import tb.mwo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NewIrpMuiseModule extends IrpMuiseModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857686);
    }

    public NewIrpMuiseModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(NewIrpMuiseModule newIrpMuiseModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/irp/NewIrpMuiseModule");
    }

    @MUSMethod
    public void addQuickSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d3dd1b", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 33) {
            hgw.c(getInstance().getUIContext());
        } else {
            mwo.a(getInstance().getUIContext());
        }
    }

    @MUSMethod(uiThread = true)
    public void metaCardJumpToResultView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd4e9e9", new Object[]{this, jSONObject});
            return;
        }
        try {
            DataPool.Companion.b(Integer.parseInt(jSONObject.getString("imageId")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
