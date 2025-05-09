package com.taobao.alimama.login;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.utils.ILoginInfoGetter;
import com.taobao.utils.LoginInfo;
import tb.nyn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ILoginInfoGetter f6185a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DefaultGetter implements ILoginInfoGetter {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String PREF_KEY = "login_info";
        private LoginInfo mCurrentLoginInfo;
        private a mStorageHelper;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public LoginInfo f6186a;

            static {
                t2o.a(1017118803);
            }

            public a() {
            }

            public static /* synthetic */ void a(a aVar, LoginInfo loginInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("72d3c7b3", new Object[]{aVar, loginInfo});
                } else {
                    aVar.d(loginInfo);
                }
            }

            public static /* synthetic */ LoginInfo b(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (LoginInfo) ipChange.ipc$dispatch("57c01694", new Object[]{aVar});
                }
                return aVar.c();
            }

            public final LoginInfo c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (LoginInfo) ipChange.ipc$dispatch("cd22722", new Object[]{this});
                }
                if (this.f6186a == null) {
                    try {
                        String string = SharedPreferencesUtils.getString(DefaultGetter.PREF_KEY, "");
                        if (!TextUtils.isEmpty(string)) {
                            this.f6186a = (LoginInfo) JSON.parseObject(string, LoginInfo.class);
                        }
                    } catch (Exception unused) {
                    }
                }
                return this.f6186a;
            }

            public final void d(LoginInfo loginInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("62847c19", new Object[]{this, loginInfo});
                    return;
                }
                this.f6186a = loginInfo;
                SharedPreferencesUtils.putString(DefaultGetter.PREF_KEY, JSON.toJSONString(loginInfo));
            }
        }

        static {
            t2o.a(1017118802);
            t2o.a(1017118871);
        }

        private DefaultGetter() {
            this.mCurrentLoginInfo = new LoginInfo();
            this.mStorageHelper = new a();
        }

        private void refreshLoginInfoFromMtop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d883e955", new Object[]{this});
                return;
            }
            LoginInfo from = LoginInfo.from(nyn.b());
            if (from.isValid() && !from.equals(this.mCurrentLoginInfo)) {
                a.a(this.mStorageHelper, from);
            }
            this.mCurrentLoginInfo = from;
        }

        @Override // com.taobao.utils.ILoginInfoGetter
        public LoginInfo getLastLoginUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("94461882", new Object[]{this});
            }
            refreshLoginInfoFromMtop();
            if (this.mCurrentLoginInfo.isValid()) {
                return this.mCurrentLoginInfo;
            }
            return a.b(this.mStorageHelper);
        }

        @Override // com.taobao.utils.ILoginInfoGetter
        public LoginInfo getLoginUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("b92fe5cc", new Object[]{this});
            }
            refreshLoginInfoFromMtop();
            return this.mCurrentLoginInfo;
        }
    }

    static {
        t2o.a(1017118800);
    }

    public static ILoginInfoGetter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILoginInfoGetter) ipChange.ipc$dispatch("4df01b7a", new Object[0]);
        }
        if (f6185a == null) {
            f6185a = new DefaultGetter();
        }
        return f6185a;
    }

    public static void b(ILoginInfoGetter iLoginInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cffcd0", new Object[]{iLoginInfoGetter});
        } else {
            f6185a = iLoginInfoGetter;
        }
    }
}
