package com.taobao.themis.kernel.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.RequestParams;
import tb.p8s;
import tb.r64;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class b<E extends RequestParams, T, D> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909854);
    }

    public abstract D configFailureResponse(byte[] bArr);

    public abstract T configSuccessResponse(byte[] bArr);

    public r64<T, D> execute(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r64) ipChange.ipc$dispatch("5e8981db", new Object[]{this, e});
        }
        try {
            return buildResponse(((IMtopInnerAdapter) p8s.g(IMtopInnerAdapter.class)).requestSync(e));
        } catch (Exception e2) {
            TMSLogger.c("SyncRequestClient", "execute error", e2);
            r64<T, D> r64Var = new r64<>();
            r64Var.f27135a = false;
            r64Var.b = "REQUEST_UNKNOWN_ERROR";
            r64Var.c = e2.getMessage();
            return r64Var;
        }
    }

    public r64<T, D> buildResponse(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r64) ipChange.ipc$dispatch("e13f2dbb", new Object[]{this, response});
        }
        r64<T, D> r64Var = new r64<>();
        if (response == null) {
            r64Var.f27135a = false;
            r64Var.b = "MTOP_RESPONSE_NULL";
            r64Var.c = "网络请求异常";
            return r64Var;
        } else if (response.getData() == null) {
            TMSLogger.a("[mtop]", "response data is null");
            r64Var.f27135a = false;
            r64Var.b = response.getErrorCode();
            r64Var.c = response.getErrorMsg();
            return r64Var;
        } else {
            if (response.getSuccess()) {
                r64Var.f27135a = true;
                try {
                    r64Var.d = configSuccessResponse(response.getRawData());
                } catch (Exception e) {
                    r64Var.f27135a = false;
                    r64Var.b = "MTOP_RESPONSE_JSON_PARSE_ERROR";
                    r64Var.c = "网络请求异常";
                    TMSLogger.c("SyncRequestClient", "configSuccessResponse error", e);
                }
            } else {
                r64Var.f27135a = false;
                r64Var.b = response.getErrorCode();
                r64Var.c = response.getErrorMsg();
                try {
                    r64Var.e = configFailureResponse(response.getRawData());
                } catch (Exception e2) {
                    TMSLogger.c("SyncRequestClient", "configSuccessResponse error", e2);
                }
            }
            return r64Var;
        }
    }
}
