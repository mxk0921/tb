package com.taobao.themis.ability.taobao.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTBLoginAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(JSONObject jSONObject);

        void onFailed(int i, String str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[0])).booleanValue();
        }
        if (Login.getSid() != null) {
            return true;
        }
        return false;
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38994f0", new Object[]{bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isLogin", (Object) Boolean.valueOf(a()));
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }

    public static void c(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8f1e2", new Object[]{context, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (a()) {
            jSONObject.put("userId", (Object) Login.getUserId());
            jSONObject.put("nick", (Object) Login.getNick());
            if (bVar != null) {
                bVar.a(jSONObject);
            }
        } else if (context != null) {
            LoginBroadcastHelper.registerLoginReceiver(context, new LoginReceiver(bVar));
            Login.login(true);
        } else {
            bVar.onFailed(13, "Context null");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LoginReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f13449a;

        public LoginReceiver(b bVar) {
            this.f13449a = bVar;
        }

        public static /* synthetic */ Object ipc$super(LoginReceiver loginReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/taobao/impl/TMSTBLoginAbility$LoginReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && (action = intent.getAction()) != null) {
                LoginAction valueOf = LoginAction.valueOf(action);
                int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                if (i == 1 || i == 2) {
                    LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                    LoginAction loginAction = LoginAction.NOTIFY_LOGIN_CANCEL;
                    int i2 = valueOf == loginAction ? 12 : 11;
                    if (valueOf == loginAction) {
                        str = "登录取消";
                    } else {
                        str = ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL;
                    }
                    b bVar = this.f13449a;
                    if (bVar != null) {
                        bVar.onFailed(i2, str);
                    }
                } else if (i == 3) {
                    LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userId", (Object) Login.getUserId());
                    jSONObject.put("nick", (Object) Login.getNick());
                    b bVar2 = this.f13449a;
                    if (bVar2 != null) {
                        bVar2.a(jSONObject);
                    }
                }
                this.f13449a = null;
            }
        }
    }
}
