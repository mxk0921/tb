package com.taobao.taobao.wxapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.R;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import tb.acq;
import tb.bf3;
import tb.buw;
import tb.gvw;
import tb.hav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IWXAPI f12967a;

    public static /* synthetic */ Object ipc$super(WXPayEntryActivity wXPayEntryActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1264052993) {
            super.onNewIntent((Intent) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taobao/wxapi/WXPayEntryActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        getIntent().setData(Uri.parse("https://center.finnet.alibaba.com"));
        super.onCreate(bundle);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, buw.a(), false);
        this.f12967a = createWXAPI;
        createWXAPI.handleIntent(getIntent(), this);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        IWXAPI iwxapi = this.f12967a;
        if (iwxapi != null) {
            iwxapi.handleIntent(intent, this);
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7f213", new Object[]{this, baseReq});
            return;
        }
        hav.d("WXEntryActivity", "---[handleIntent.onReq]-----------------------------------------------");
        hav.d("WXEntryActivity", "---[handleIntent.onReq]---req.openId--------" + baseReq.openId);
        hav.d("WXEntryActivity", "---[handleIntent.onReq]---req.transaction---" + baseReq.transaction);
        hav.d("WXEntryActivity", "---[handleIntent.onReq]---req.getType-------" + baseReq.getType());
        finish();
    }

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
        if (gvw.h()) {
            hav.d("WXEntryActivity", "微信支付被杀死");
            bf3.g("WX_PAY_IS_KILLED", "微信支付被杀死");
            Nav.from(this).toUri(CashdeskConstants.ORDER_LIST_URL);
        } else {
            gvw.b().e(baseResp);
        }
        finish();
    }
}
