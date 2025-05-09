package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.util.UUID;
import tb.d3o;
import tb.qv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO0000 extends d3o<OO000OO> {
    public OO0000(qv2<OO000OO> qv2Var, O0Oo00 o0Oo00) {
        super(qv2Var, o0Oo00, ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.LIST, 5000L, OO000OO.class);
    }

    public static synchronized String O000000o() {
        String uuid;
        synchronized (OO0000.class) {
            try {
                uuid = UUID.randomUUID().toString();
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
        return uuid;
    }

    @Override // tb.d3o
    public String getKey() {
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
