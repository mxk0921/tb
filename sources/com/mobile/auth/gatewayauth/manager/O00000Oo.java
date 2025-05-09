package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.O0Oo;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.OO000o;
import com.mobile.auth.Oo0OOo;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import com.mobile.auth.gatewayauth.utils.O000000o;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.n5o;
import tb.qv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00000Oo {
    private Context O000000o;
    private O0Oo000 O00000Oo;
    private VendorSdkInfoManager O00000o;
    private volatile ConfigRule O00000o0;

    public O00000Oo(Context context, VendorSdkInfoManager vendorSdkInfoManager, O00000o o00000o) {
        Context applicationContext = context.getApplicationContext();
        this.O000000o = applicationContext;
        this.O00000o0 = UTSharedPreferencesHelper.readSDKConfig(applicationContext);
        this.O00000o = vendorSdkInfoManager;
        this.O00000Oo = o00000o.O000000o();
        if (this.O00000o0 != null) {
            this.O00000Oo.O000000o(this.O00000o0);
        }
    }

    public static /* synthetic */ ConfigRule O000000o(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000o0;
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

    public static /* synthetic */ O0Oo000 O00000Oo(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000Oo;
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

    public static /* synthetic */ Context O00000o0(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O000000o;
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

    private boolean O0000oO() {
        try {
            if (this.O00000o0 != null) {
                return true;
            }
            return false;
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

    private boolean O0000oOO() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getAuth_token().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getAuth_token().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    private boolean O0000oOo() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getLogin_token().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getLogin_token().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    private boolean O0000oo() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getGet_vendor_list().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getGet_vendor_list().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    private boolean O0000oo0() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getSls().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getSls().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    private boolean O0000ooO() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getLogin_page().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getLogin_page().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    private boolean O0000ooo() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getLogin_phone().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getLogin_phone().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    private boolean O00oOooO() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getGet_config().getIs_limited())) {
                return false;
            }
            if (this.O00000o0.getGet_config().getLimit_time_hour() > 0) {
                return true;
            }
            return false;
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

    public boolean O00000o() {
        try {
            if (!O0000oO() || !O0000oOO()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readAuthTokenLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getAuth_token().getLimit_time_hour())) >= this.O00000o0.getAuth_token().getLimit_count()) {
                return true;
            }
            return false;
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

    public void O00000oO() {
        try {
            if (O0000oO() && O0000oOO()) {
                UTSharedPreferencesHelper.saveAuthTokenLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getAuth_token().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O00000oo() {
        try {
            if (!O0000oO() || !O0000oOo()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readLoginTokenLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getLogin_token().getLimit_time_hour())) >= this.O00000o0.getLogin_token().getLimit_count()) {
                return true;
            }
            return false;
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

    public void O0000O0o() {
        try {
            if (O0000oO() && O0000oOo()) {
                UTSharedPreferencesHelper.saveLoginTokenLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getLogin_token().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000OOo() {
        try {
            if (!O0000oO() || !O0000oo0()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readSLSLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getSls().getLimit_time_hour())) >= this.O00000o0.getSls().getLimit_count()) {
                return true;
            }
            return false;
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

    public boolean O0000Oo() {
        try {
            if (!O0000oO() || !O0000oo()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readVendorLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getGet_vendor_list().getLimit_time_hour())) >= this.O00000o0.getGet_vendor_list().getLimit_count()) {
                return true;
            }
            return false;
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

    public void O0000Oo0() {
        try {
            if (O0000oO() && O0000oo0()) {
                UTSharedPreferencesHelper.saveSLSLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getSls().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O0000OoO() {
        try {
            if (O0000oO() && O0000oo()) {
                UTSharedPreferencesHelper.saveVendorLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getGet_vendor_list().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000Ooo() {
        try {
            if (!O0000oO() || !O0000ooO()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readLoginPageLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getLogin_page().getLimit_time_hour())) >= this.O00000o0.getLogin_page().getLimit_count()) {
                return true;
            }
            return false;
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

    public void O0000o() {
        try {
            if (O0000oO() && O00oOooO()) {
                UTSharedPreferencesHelper.saveConfigLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getGet_config().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000o0() {
        try {
            if (!O0000oO() || !O0000ooo()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readLoginPhoneLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getLogin_phone().getLimit_time_hour())) >= this.O00000o0.getLogin_phone().getLimit_count()) {
                return true;
            }
            return false;
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

    public void O0000o00() {
        try {
            if (O0000oO() && O0000ooO()) {
                UTSharedPreferencesHelper.saveLoginPageLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getLogin_page().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O0000o0O() {
        try {
            if (O0000oO() && O0000ooo()) {
                UTSharedPreferencesHelper.saveLoginPhoneLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getLogin_phone().getLimit_time_hour()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000o0o() {
        try {
            if (!O0000oO() || !O00oOooO()) {
                return false;
            }
            if (UTSharedPreferencesHelper.readConfigLimitCount(this.O000000o, O000000o.O000000o(this.O00000o0.getGet_config().getLimit_time_hour())) >= this.O00000o0.getGet_config().getLimit_count()) {
                return true;
            }
            return false;
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

    public boolean O0000oO0() {
        try {
            String readSDKConfigLimitFlag = UTSharedPreferencesHelper.readSDKConfigLimitFlag(this.O000000o);
            if ((!TextUtils.isEmpty(readSDKConfigLimitFlag) && O000000o.O000000o(readSDKConfigLimitFlag)) || UTSharedPreferencesHelper.readSDKConfigCloseFlag(this.O000000o)) {
                return true;
            }
            if (O0000o0o()) {
                return true;
            }
            return false;
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

    public static /* synthetic */ ConfigRule O000000o(O00000Oo o00000Oo, ConfigRule configRule) {
        try {
            o00000Oo.O00000o0 = configRule;
            return configRule;
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

    public void O00000Oo(int i) {
        try {
            switch (i) {
                case 1:
                    O0000Oo0();
                    break;
                case 2:
                    O0000OoO();
                    break;
                case 3:
                    O0000o();
                    break;
                case 4:
                    O00000oO();
                    break;
                case 5:
                    O0000O0o();
                    break;
                case 6:
                    O0000o0O();
                    break;
                case 7:
                    O0000o00();
                    break;
                default:
                    return;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O00000o0() {
        try {
            if (!O0000oO()) {
                return false;
            }
            if (!O000000o()) {
                if (!Boolean.parseBoolean(this.O00000o0.getIs_login_demoted())) {
                    return false;
                }
            }
            return true;
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

    public void O000000o(final RequestCallback<ConfigRule, Void> requestCallback) {
        try {
            if (O0000oO0()) {
                requestCallback.onError(null);
                return;
            }
            O0000o();
            n5o.a().b(new Oo0OOo(new qv2<OO000o>(ThreadStrategy.THREAD, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.O00000Oo.1
                public void O000000o(OO000o oO000o) {
                    try {
                        if (oO000o.O000000o() != null) {
                            ConfigRule O000000o = oO000o.O000000o();
                            if (O00000Oo.O000000o(O00000Oo.this) != null) {
                                if (!O00000Oo.O000000o(O00000Oo.this).toString().equals(O000000o.toString())) {
                                }
                                requestCallback.onSuccess(O00000Oo.O000000o(O00000Oo.this));
                                return;
                            }
                            O00000Oo.O000000o(O00000Oo.this, O000000o);
                            O00000Oo.O00000Oo(O00000Oo.this).O000000o(O00000Oo.O000000o(O00000Oo.this));
                            UTSharedPreferencesHelper.clearLimitCount(O00000Oo.O00000o0(O00000Oo.this));
                            UTSharedPreferencesHelper.saveSDKConfig(O00000Oo.O00000o0(O00000Oo.this), O00000Oo.O000000o(O00000Oo.this).toJsonString());
                            requestCallback.onSuccess(O00000Oo.O000000o(O00000Oo.this));
                            return;
                        }
                        requestCallback.onError(null);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.qv2
                public /* synthetic */ void onResult(OO000o oO000o) {
                    try {
                        O000000o(oO000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, new O0Oo(this.O000000o, this.O00000o, this.O00000Oo), 5000L, OO000o.class));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O00000Oo() {
        try {
            if (!O0000oO()) {
                return false;
            }
            if (!O000000o()) {
                if (!Boolean.parseBoolean(this.O00000o0.getIs_auth_demoted())) {
                    return false;
                }
            }
            return true;
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

    public boolean O000000o() {
        try {
            if (O0000oO()) {
                return Boolean.parseBoolean(this.O00000o0.getIs_demoted());
            }
            return false;
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

    public boolean O000000o(int i) {
        try {
            switch (i) {
                case 1:
                    return O0000OOo();
                case 2:
                    return O0000Oo();
                case 3:
                    return O0000o0o();
                case 4:
                    return O00000o();
                case 5:
                    return O00000oo();
                case 6:
                    return O0000o0();
                case 7:
                    return O0000Ooo();
                default:
                    return false;
            }
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
