package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.d3o;
import tb.pvt;
import tb.qv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Oo0OOo extends d3o<OO000o> {
    private static final String O000000o = "com.mobile.auth.Oo0OOo";

    public Oo0OOo(qv2<OO000o> qv2Var, pvt<OO000o> pvtVar, long j, Class<OO000o> cls) {
        super(qv2Var, pvtVar, ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.COVER, j, cls);
    }

    @Override // tb.d3o
    public String getKey() {
        try {
            return O000000o;
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
