package com.alibaba.ability.impl.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.abilityidl.ability.AbsUserAbility;
import com.taobao.android.abilityidl.ability.UserLoginResult;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.util.ErrorConstant;
import tb.a07;
import tb.bsv;
import tb.ckf;
import tb.j7e;
import tb.jsv;
import tb.kdb;
import tb.mpv;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UserAbility extends AbsUserAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f2059a = new AtomicBoolean(false);
    public UserBroadCastReceiver b;
    public Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(138412035);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(138412034);
    }

    public static /* synthetic */ Object ipc$super(UserAbility userAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/user/UserAbility");
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3db76c8", new Object[]{this, str})).booleanValue();
        }
        return com.taobao.login4android.api.Login.recordAndCheckNeedLogin(str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserAbility
    public tao<Boolean, ErrorResult> isLogin(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("84868e9d", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        return new tao<>(Boolean.valueOf(a()), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserAbility
    public void login(kdb kdbVar, bsv bsvVar, j7e j7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64999e53", new Object[]{this, kdbVar, bsvVar, j7eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(bsvVar, "params");
        ckf.g(j7eVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            j7eVar.O(ErrorResult.a.Companion.g("context 为空"));
        } else {
            b(context, kdbVar, bsvVar, j7eVar);
        }
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.f2059a.compareAndSet(true, false)) {
            UserBroadCastReceiver userBroadCastReceiver = this.b;
            if (userBroadCastReceiver != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(this.c, userBroadCastReceiver);
            }
            this.b = null;
            this.c = null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsUserAbility
    public tao<Boolean, ErrorResult> recordAndCheckNeedLogin(kdb kdbVar, jsv jsvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("95d23ad4", new Object[]{this, kdbVar, jsvVar});
        }
        ckf.g(kdbVar, "context");
        ckf.g(jsvVar, "params");
        String str = jsvVar.f22191a;
        if (str == null) {
            str = "";
        }
        return new tao<>(Boolean.valueOf(c(str)), null, 2, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class UserBroadCastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public j7e f2060a;

        static {
            t2o.a(138412036);
        }

        public UserBroadCastReceiver(j7e j7eVar) {
            ckf.g(j7eVar, "callback");
            this.f2060a = j7eVar;
        }

        public static /* synthetic */ Object ipc$super(UserBroadCastReceiver userBroadCastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/user/UserAbility$UserBroadCastReceiver");
        }

        public final void a(j7e j7eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("670e2e95", new Object[]{this, j7eVar});
                return;
            }
            ckf.g(j7eVar, "<set-?>");
            this.f2060a = j7eVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                try {
                    String action = intent.getAction();
                    ckf.d(action);
                    int i = mpv.$EnumSwitchMapping$0[LoginAction.valueOf(action).ordinal()];
                    if (i == 1) {
                        UserLoginResult userLoginResult = new UserLoginResult();
                        userLoginResult.result = Boolean.TRUE;
                        this.f2060a.v(userLoginResult);
                    } else if (i == 2) {
                        this.f2060a.O(new ErrorResult("LOGIN_ERROR", Constant.MSG_ERROR_USER_CANCEL, (Map) null, 4, (a07) null));
                    } else if (i == 3) {
                        this.f2060a.O(new ErrorResult("LOGIN_ERROR", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL, (Map) null, 4, (a07) null));
                    }
                } catch (Throwable th) {
                    j7e j7eVar = this.f2060a;
                    j7eVar.O(new ErrorResult("LOGIN_ERROR", "登录失败，错误信息：" + Log.getStackTraceString(th), (Map) null, 4, (a07) null));
                }
            }
        }
    }

    public final void b(Context context, kdb kdbVar, bsv bsvVar, j7e j7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8de813b", new Object[]{this, context, kdbVar, bsvVar, j7eVar});
            return;
        }
        this.c = context;
        if (a()) {
            UserLoginResult userLoginResult = new UserLoginResult();
            userLoginResult.result = Boolean.TRUE;
            j7eVar.v(userLoginResult);
            return;
        }
        if (this.f2059a.compareAndSet(false, true)) {
            UserBroadCastReceiver userBroadCastReceiver = new UserBroadCastReceiver(j7eVar);
            this.b = userBroadCastReceiver;
            LoginBroadcastHelper.registerLoginReceiver(context, userBroadCastReceiver);
        }
        UserBroadCastReceiver userBroadCastReceiver2 = this.b;
        if (userBroadCastReceiver2 != null) {
            userBroadCastReceiver2.a(j7eVar);
        }
        String str = (String) kdbVar.m("url");
        Bundle bundle = new Bundle();
        if (!(str == null || str.length() == 0)) {
            bundle.putString(LoginConstants.BROWSER_REF_URL, str);
        }
        String str2 = bsvVar.f16608a;
        if (!(str2 == null || str2.length() == 0)) {
            bundle.putString("source", bsvVar.f16608a);
        }
        Login.login(true, bundle);
    }
}
