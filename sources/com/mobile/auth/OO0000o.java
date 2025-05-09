package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.O0000OOo;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.d3o;
import tb.qv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO0000o extends d3o<OO00O0> {
    private String O000000o;

    public OO0000o(O0000OOo o0000OOo, qv2<OO00O0> qv2Var, long j, String str, O000000o.O00000Oo o00000Oo) {
        super(qv2Var, new OoO0o(o0000OOo, str, o00000Oo, j), ThreadStrategy.THREAD, ExecuteStrategy.USE_PREV, CallbackStrategy.LIST, j, OO00O0.class);
        this.O000000o = o00000Oo.O00000Oo();
    }

    @Override // tb.d3o
    public String getKey() {
        try {
            return this.O000000o;
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
