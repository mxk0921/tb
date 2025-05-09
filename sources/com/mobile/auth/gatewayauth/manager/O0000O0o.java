package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.util.SparseArray;
import com.mobile.auth.O0Oo0;
import com.mobile.auth.O0Oo00;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.OO0000;
import com.mobile.auth.OO000OO;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.n5o;
import tb.qv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0000O0o {
    private O0Oo00 O000000o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface O000000o {
        void O000000o(String str, String str2);

        void O000000o(String str, String str2, SparseArray<VendorConfig> sparseArray);
    }

    public O0000O0o(O0Oo00 o0Oo00) {
        this.O000000o = o0Oo00;
    }

    public static final O0000O0o O000000o(Context context, VendorSdkInfoManager vendorSdkInfoManager, O00000Oo o00000Oo, O0Oo000 o0Oo000) {
        try {
            return new O0000O0o(new O0Oo0(context, vendorSdkInfoManager, o00000Oo, o0Oo000));
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

    public void O000000o(final O000000o o000000o) {
        try {
            n5o.a().b(new OO0000(new qv2<OO000OO>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.O0000O0o.1
                public void O000000o(OO000OO oo000oo) {
                    try {
                        if (o000000o != null) {
                            if (oo000oo.O000000o()) {
                                o000000o.O000000o(oo000oo.O00000o0(), oo000oo.O00000Oo(), oo000oo.O00000oO());
                            } else {
                                o000000o.O000000o(oo000oo.O00000o0(), oo000oo.O00000Oo());
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.qv2
                public /* synthetic */ void onResult(OO000OO oo000oo) {
                    try {
                        O000000o(oo000oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, this.O000000o));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
