package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.LoginInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q27 implements loc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LoginInfo f26457a = new LoginInfo();
    public final b b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public LoginInfo f26458a;

        static {
            t2o.a(1018167393);
        }

        public b() {
        }

        public static /* synthetic */ void a(b bVar, LoginInfo loginInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a4f533d", new Object[]{bVar, loginInfo});
            } else {
                bVar.d(loginInfo);
            }
        }

        public static /* synthetic */ LoginInfo b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("f4d727d0", new Object[]{bVar});
            }
            return bVar.c();
        }

        public final LoginInfo c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("f6dd478c", new Object[]{this});
            }
            if (this.f26458a == null) {
                try {
                    String string = SharedPreferencesUtils.getString("login_info", "");
                    if (!TextUtils.isEmpty(string)) {
                        this.f26458a = (LoginInfo) JSON.parseObject(string, LoginInfo.class);
                    }
                } catch (Exception unused) {
                }
            }
            return this.f26458a;
        }

        public final void d(LoginInfo loginInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d52b6f", new Object[]{this, loginInfo});
                return;
            }
            this.f26458a = loginInfo;
            SharedPreferencesUtils.putString("login_info", JSON.toJSONString(loginInfo));
        }
    }

    static {
        t2o.a(1018167391);
        t2o.a(1018167380);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d883e955", new Object[]{this});
            return;
        }
        LoginInfo from = LoginInfo.from(nyn.b());
        if (from.isValid() && !from.equals(this.f26457a)) {
            b.a(this.b, from);
        }
        this.f26457a = from;
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1300238f", new Object[]{this});
        }
        return IBaseService.Names.SERVICE_LOGIN.name();
    }

    @Override // tb.loc
    public LoginInfo getLastLoginUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginInfo) ipChange.ipc$dispatch("78d6ba2c", new Object[]{this});
        }
        c();
        if (this.f26457a.isValid()) {
            return this.f26457a;
        }
        return b.b(this.b);
    }
}
