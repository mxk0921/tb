package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.OO000OO;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.O00000Oo;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import tb.pvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class O0Oo00<T extends OO000OO> implements pvt<OO000OO> {
    private Context O000000o;
    private O00000Oo O00000Oo;

    public O0Oo00(Context context, O00000Oo o00000Oo) {
        this.O000000o = context.getApplicationContext();
        this.O00000Oo = o00000Oo;
    }

    public abstract T O000000o();

    public abstract T O000000o(String str);

    public OO000OO O00000Oo() {
        try {
            if (this.O00000Oo.O0000Oo()) {
                return O000000o();
            }
            this.O00000Oo.O0000OoO();
            return O000000o(EncryptUtils.generateAesKey());
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

    public Context O00000o0() {
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
    public abstract /* synthetic */ OO000OO onTimeout();
}
