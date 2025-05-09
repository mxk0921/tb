package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.mobile.auth.oooOoO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00O000o implements oooOoO.O000000o {
    private static O00O000o O000000o;
    private O000o O00000Oo;
    private oooOoO O00000o;
    private O000o O00000o0;
    private Context O00000oO;

    private O00O000o(Context context) {
        this.O00000oO = context;
        O00000Oo();
    }

    private void O00000Oo() {
        String O00000Oo = O0OO0O.O00000Oo("sdk_config_version", "");
        if (TextUtils.isEmpty(O00000Oo) || !BuildConfig.CMCC_SDK_VERSION.equals(O00000Oo)) {
            oooOoO O000000o2 = oooOoO.O000000o(true);
            this.O00000o = O000000o2;
            this.O00000Oo = O000000o2.O000000o();
            if (!TextUtils.isEmpty(O00000Oo)) {
                O00000o0();
            }
        } else {
            oooOoO O000000o3 = oooOoO.O000000o(false);
            this.O00000o = O000000o3;
            this.O00000Oo = O000000o3.O00000Oo();
        }
        this.O00000o.O000000o(this);
        this.O00000o0 = this.O00000o.O000000o();
    }

    private void O00000o0() {
        O0O0O.O00000Oo("UmcConfigManager", "delete localConfig");
        this.O00000o.O00000o0();
    }

    public O000o O000000o() {
        try {
            return this.O00000Oo.clone();
        } catch (CloneNotSupportedException unused) {
            return this.O00000o0;
        }
    }

    public static O00O000o O000000o(Context context) {
        if (O000000o == null) {
            synchronized (O00O000o.class) {
                try {
                    if (O000000o == null) {
                        O000000o = new O00O000o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O000000o;
    }

    public void O000000o(a aVar) {
        this.O00000o.O000000o(aVar);
    }

    @Override // com.mobile.auth.oooOoO.O000000o
    public void O000000o(O000o o000o) {
        this.O00000Oo = o000o;
    }
}
