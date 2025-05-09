package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O00000Oo;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo;
import com.mobile.auth.gatewayauth.model.psc_info_upload.PnsVendorQueryResponse;
import com.mobile.auth.gatewayauth.model.psc_info_upload.Result;
import com.mobile.auth.gatewayauth.network.RequestState;
import com.mobile.auth.gatewayauth.network.RequestUtil;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0Oo0 extends O0Oo00<OO000o0> {
    private O0Oo000 O000000o;
    private VendorSdkInfoManager O00000Oo;

    public O0Oo0(Context context, VendorSdkInfoManager vendorSdkInfoManager, O00000Oo o00000Oo, O0Oo000 o0Oo000) {
        super(context, o00000Oo);
        this.O000000o = o0Oo000;
        this.O00000Oo = vendorSdkInfoManager;
    }

    @Override // com.mobile.auth.O0Oo00
    public /* synthetic */ OO000o0 O000000o() {
        try {
            return O00000o();
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

    public OO000o0 O00000Oo(String str) {
        String str2 = "";
        try {
            try {
                if (RequestState.getInstance().checkTokenValied(1)) {
                    str2 = RequestUtil.getVendorListByPop(RequestState.getInstance().getKeyRespone().getSk(), EncryptUtils.encryptToken(O00000o0(), null, null, null, this.O00000Oo.O00000o0(), str, null, null, null, false, null));
                }
                O0Oo000 o0Oo000 = this.O000000o;
                o0Oo000.O000000o("PopRequest-GetVendorList:" + str2);
            } catch (Exception unused) {
            }
            return new OO000o0(false, str2, str);
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

    public OO000o0 O00000o() {
        try {
            AllRBInfo allRBInfo = new AllRBInfo();
            PnsVendorQueryResponse pnsVendorQueryResponse = new PnsVendorQueryResponse();
            Result result = new Result();
            result.setCode(ResultCode.CODE_ERROR_FUNCTION_LIMIT);
            result.setMessage("GetVendorList Limited");
            pnsVendorQueryResponse.setResult(result);
            allRBInfo.setResponse(pnsVendorQueryResponse);
            return new OO000o0(false, allRBInfo.toJson().toString(), "");
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

    public OO000OO O00000oO() {
        try {
            return new OO000o0(true, "{}", "");
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

    @Override // com.mobile.auth.O0Oo00, tb.pvt
    public /* synthetic */ OO000OO onTimeout() {
        try {
            return O00000oO();
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

    @Override // com.mobile.auth.O0Oo00
    public /* synthetic */ OO000o0 O000000o(String str) {
        try {
            return O00000Oo(str);
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
