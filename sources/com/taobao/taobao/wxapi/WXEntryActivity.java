package com.taobao.taobao.wxapi;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import tb.acq;
import tb.hav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WXEntryActivity extends WXPayEntryActivity implements IWXAPIEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WXEntryActivity wXEntryActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/wxapi/WXEntryActivity");
    }

    @Override // com.taobao.taobao.wxapi.WXPayEntryActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.taobao.wxapi.WXPayEntryActivity, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f10f5f", new Object[]{this, baseResp});
            return;
        }
        int i2 = baseResp.errCode;
        if (i2 == -5) {
            i = R.string.errcode_unsupported;
        } else if (i2 == -4) {
            i = R.string.errcode_deny;
        } else if (i2 == -2) {
            i = R.string.errcode_cancel;
        } else if (i2 != 0) {
            i = R.string.errcode_unknown;
        } else {
            i = R.string.errcode_success;
        }
        hav.d("WXEntryActivity", "---[handleIntent.onResp]---resp.openId--------" + baseResp.openId + " resp.transaction = " + baseResp.transaction + " resp.getType = " + baseResp.getType() + " resp.errCode = " + baseResp.errCode + " resp.errStr = " + baseResp.errStr + " result = " + i);
        finish();
    }
}
