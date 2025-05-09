package com.mobile.auth;

import android.util.SparseArray;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import tb.qvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class OO000OO extends qvt {
    private boolean O000000o;
    private String O00000Oo;
    private String O00000o;
    private String O00000o0;

    public OO000OO(boolean z, String str, String str2) {
        super(z);
        this.O00000Oo = str;
        this.O00000o = str2;
    }

    public void O000000o(String str) {
        try {
            this.O00000o0 = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public String O00000Oo() {
        try {
            String str = this.O00000o0;
            if (str == null) {
                return "";
            }
            return str;
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

    public String O00000o() {
        try {
            return this.O00000o;
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

    public String O00000o0() {
        try {
            return this.O00000Oo;
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

    public abstract SparseArray<VendorConfig> O00000oO();

    public void O000000o(boolean z) {
        try {
            this.O000000o = z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O000000o() {
        try {
            return this.O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
