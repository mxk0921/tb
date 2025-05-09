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
public abstract class OooOO implements pvt<OO00OO> {
    private O0000OOo O000000o;
    private String O00000Oo;
    private String O00000o;
    private long O00000o0;

    public OooOO(O0000OOo o0000OOo, String str, long j, String str2) {
        this.O000000o = o0000OOo;
        this.O00000Oo = str;
        this.O00000o0 = j;
        this.O00000o = str2;
    }

    public OO00OO O000000o() {
        try {
            OO00OO oo00oo = new OO00OO(true);
            oo00oo.O000000o(O00000Oo.O000000o(ResultCode.CODE_ERROR_FUNCTION_TIME_OUT, "请求超时"));
            return oo00oo;
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

    public abstract void O000000o(RequestCallback requestCallback, O000000o o000000o);

    public OO00OO O00000Oo() {
        try {
            O00000o0.O000000o().O000000o(this.O00000o, "doRequest", System.currentTimeMillis());
            O000000o O000000o = this.O000000o.O000000o(this.O00000Oo);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final OO00OO oo00oo = new OO00OO(false);
            O000000o(new RequestCallback<O000000o.C0296O000000o, O00000Oo>() { // from class: com.mobile.auth.OooOO.1
                public void O000000o(O000000o.C0296O000000o o000000o) {
                    try {
                        oo00oo.O000000o(true);
                        oo00oo.O000000o(o000000o);
                        oo00oo.O000000o(O00000Oo.O000000o().O00000o0(o000000o.O00000o0()).O000000o(o000000o.O00000o()).O000000o());
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
                        oo00oo.O000000o(o00000Oo);
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, O000000o);
            try {
                long j = this.O00000o0;
                if (j <= 5000) {
                    j = 5000;
                }
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                oo00oo.O000000o(O00000Oo.O000000o(Constant.CODE_ERROR_UNKNOWN_FAIL, ln8.a(e)));
            }
            return oo00oo;
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
    public /* synthetic */ OO00OO onTimeout() {
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
