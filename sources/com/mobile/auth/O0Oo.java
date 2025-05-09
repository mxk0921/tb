package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.model.psc_sdk_config.ConfigRB;
import com.mobile.auth.gatewayauth.network.RequestState;
import com.mobile.auth.gatewayauth.network.RequestUtil;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.mobile.auth.gatewayauth.utils.O000000o;
import com.mobile.auth.gatewayauth.utils.O00000Oo;
import tb.mj4;
import tb.pvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0Oo implements pvt<OO000o> {
    private Context O000000o;
    private O0Oo000 O00000Oo;
    private VendorSdkInfoManager O00000o0;

    public O0Oo(Context context, VendorSdkInfoManager vendorSdkInfoManager, O0Oo000 o0Oo000) {
        this.O000000o = context;
        this.O00000Oo = o0Oo000;
        this.O00000o0 = vendorSdkInfoManager;
    }

    public OO000o O000000o() {
        try {
            return new OO000o(true);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public OO000o O00000Oo() throws Exception {
        try {
            if (!RequestState.getInstance().checkTokenValied(1)) {
                this.O00000Oo.O00000o("request expiration date out");
                return new OO000o(false);
            }
            try {
                EncryptUtils.generateAesKey();
                String sDKConfigByPop = RequestUtil.getSDKConfigByPop(RequestState.getInstance().getKeyRespone().getSk(), EncryptUtils.noEncryptTinfo(this.O000000o, this.O00000o0.O00000o0(), O00000Oo.O00000Oo(this.O000000o)));
                this.O00000Oo.O000000o("getSdkConfig Ret:", sDKConfigByPop);
                ConfigRB fromJson = ConfigRB.fromJson(sDKConfigByPop);
                if (fromJson != null) {
                    if (fromJson.getResponse() == null || fromJson.getResponse().getResult() == null) {
                        if (fromJson.getErrorResponse() != null) {
                            if (fromJson.getErrorResponse().getCode() == 22) {
                                UTSharedPreferencesHelper.saveSDKConfigCloseFlag(this.O000000o, true);
                            } else if (fromJson.getErrorResponse().getCode() == 7) {
                                UTSharedPreferencesHelper.saveSDKConfigLimitFlag(this.O000000o, O000000o.O000000o());
                            }
                        }
                    } else if (fromJson.getResponse().getResult().getModel() != null && mj4.CONTROL_NAME_OK.equals(fromJson.getResponse().getResult().getCode())) {
                        return new OO000o(false, fromJson.getResponse().getResult().getModel());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new OO000o(false);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public /* synthetic */ Object call() throws Exception {
        try {
            return O00000Oo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    @Override // tb.pvt
    public /* synthetic */ OO000o onTimeout() {
        try {
            return O000000o();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
