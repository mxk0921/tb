package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.TokenResultListener;
import com.mobile.auth.gatewayauth.model.TokenRet;
import java.lang.Thread;
import java.util.concurrent.Future;
import tb.ln8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0000O0o {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class O000000o implements Runnable {
        private Thread.UncaughtExceptionHandler O000000o;

        public O000000o() {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    try {
                        O0000Oo0.O00000o0("未知异常:" + ln8.a(th));
                    } catch (Throwable th2) {
                        try {
                            ExceptionProcessor.processException(th2);
                        } catch (Throwable th3) {
                            ExceptionProcessor.processException(th3);
                        }
                    }
                }
            };
        }

        public abstract void O000000o();

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.currentThread().setUncaughtExceptionHandler(this.O000000o);
                O000000o();
                Thread.currentThread().setUncaughtExceptionHandler(null);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }

        public O000000o(final TokenResultListener tokenResultListener) {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, final Throwable th) {
                    try {
                        O0000O0o.O000000o(new ln8.b() { // from class: com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o.2.1
                            @Override // tb.ln8.b
                            public void safeRun() {
                                try {
                                    TokenResultListener tokenResultListener2 = tokenResultListener;
                                    if (tokenResultListener2 != null) {
                                        tokenResultListener2.onTokenFailed(O0000O0o.O000000o(th));
                                    } else {
                                        O0000Oo0.O000000o(th);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        ExceptionProcessor.processException(th2);
                                    } catch (Throwable th3) {
                                        ExceptionProcessor.processException(th3);
                                    }
                                }
                            }

                            @Override // tb.ln8.b
                            public void onException(Throwable th2) {
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            ExceptionProcessor.processException(th2);
                        } catch (Throwable th3) {
                            ExceptionProcessor.processException(th3);
                        }
                    }
                }
            };
        }
    }

    public static String O000000o(Throwable th) {
        try {
            TokenRet tokenRet = new TokenRet();
            tokenRet.setCode(com.mobile.auth.gatewayauth.utils.O000000o.O000000o ? ResultCode.CODE_ERROR_UNKNOWN_FAIL : Constant.CODE_ERROR_UNKNOWN_FAIL);
            tokenRet.setMsg("未知异常:" + ln8.a(th));
            return tokenRet.toJsonString();
        } catch (Throwable th2) {
            try {
                ExceptionProcessor.processException(th2);
                return null;
            } catch (Throwable th3) {
                ExceptionProcessor.processException(th3);
                return null;
            }
        }
    }

    public static Future<?> O000000o(Runnable runnable) {
        try {
            return ln8.b().h(runnable);
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

    public static void O000000o(ln8.b bVar) {
        try {
            ln8.b().c(bVar);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
