package com.mobile.auth;

import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.O0000OOo;
import com.mobile.auth.gatewayauth.manager.RequestCallback;
import com.mobile.auth.gatewayauth.manager.base.O00000Oo;
import com.mobile.auth.gatewayauth.utils.O00000o0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.ln8;
import tb.pvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OoO0o implements pvt<OO00O0> {
    private O0000OOo O000000o;
    private O000000o.O00000Oo O00000Oo;
    private long O00000o;
    private String O00000o0;

    public OoO0o(O0000OOo o0000OOo, String str, O000000o.O00000Oo o00000Oo, long j) {
        this.O000000o = o0000OOo;
        this.O00000Oo = o00000Oo;
        this.O00000o0 = str;
        this.O00000o = j;
    }

    public OO00O0 O000000o() {
        try {
            OO00O0 oo00o0 = new OO00O0(true);
            oo00o0.O000000o(O00000Oo.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"));
            return oo00o0;
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

    public OO00O0 O00000Oo() {
        try {
            O00000o0.O000000o().O000000o(this.O00000Oo.O00000Oo(), "doRequest", System.currentTimeMillis());
            O000000o O000000o = this.O000000o.O000000o(this.O00000o0);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final OO00O0 oo00o0 = new OO00O0(false);
            O000000o.O00000o0(new RequestCallback<O000000o.C0296O000000o, O00000Oo>() { // from class: com.mobile.auth.OoO0o.1
                public void O000000o(O000000o.C0296O000000o o000000o) {
                    try {
                        oo00o0.O000000o(true);
                        oo00o0.O000000o(O00000Oo.O000000o().O00000o0(o000000o.O00000o0()).O000000o(o000000o.O00000o()).O000000o());
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onError(O00000Oo o00000Oo) {
                    try {
                        O000000o(o00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onSuccess(O000000o.C0296O000000o o000000o) {
                    try {
                        O000000o(o000000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                public void O000000o(O00000Oo o00000Oo) {
                    try {
                        oo00o0.O000000o(o00000Oo);
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, this.O00000Oo);
            try {
                long j = this.O00000o;
                if (j <= 5000) {
                    j = 5000;
                }
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                oo00o0.O000000o(O00000Oo.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, ln8.a(e)));
            }
            return oo00o0;
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
    public /* synthetic */ OO00O0 onTimeout() {
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
