package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import tb.qvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO000o extends qvt {
    private ConfigRule O000000o;

    public OO000o(boolean z) {
        super(z);
    }

    public ConfigRule O000000o() {
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

    @Override // tb.qvt
    public boolean isResultTimeout() {
        return false;
    }

    public OO000o(boolean z, ConfigRule configRule) {
        super(z);
        this.O000000o = configRule;
    }
}
