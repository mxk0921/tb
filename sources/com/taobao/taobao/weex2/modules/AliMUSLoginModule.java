package com.taobao.taobao.weex2.modules;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import tb.pvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AliMUSLoginModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "user";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AliMUSLoginModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(AliMUSLoginModule aliMUSLoginModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/weex2/modules/AliMUSLoginModule");
    }

    private boolean isLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(Login.getSid()) || !Login.checkSessionValid()) {
            return false;
        }
        return true;
    }

    @MUSMethod(uiThread = true)
    public void logout(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936039ba", new Object[]{this, pvhVar});
        }
    }

    @MUSMethod(uiThread = true)
    public void getUserInfo(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c387887f", new Object[]{this, pvhVar});
            return;
        }
        String nick = Login.getNick();
        String userId = Login.getUserId();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!isLogin() || TextUtils.isEmpty(nick) || TextUtils.isEmpty(userId)) {
            hashMap.put("isLogin", "false");
        } else {
            hashMap.put("isLogin", "true");
            hashMap.put("nick", nick);
            hashMap.put("userId", userId);
            hashMap2.put("nick", nick);
            hashMap2.put("userId", userId);
            hashMap.put("info", hashMap2);
        }
        pvhVar.b(JSON.toJSON(hashMap));
    }

    @MUSMethod(uiThread = true)
    public void login(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899a2ed9", new Object[]{this, pvhVar});
        } else if (isLogin()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "success");
            JSONObject jSONObject2 = new JSONObject();
            String nick = Login.getNick();
            String userId = Login.getUserId();
            jSONObject2.put("nick", (Object) nick);
            jSONObject2.put("userId", (Object) userId);
            jSONObject.put("info", (Object) jSONObject2);
            pvhVar.b(jSONObject);
        } else {
            LoginReceiver loginReceiver = new LoginReceiver(getInstance().getUIContext());
            loginReceiver.a(pvhVar);
            LoginBroadcastHelper.registerLoginReceiver(getInstance().getUIContext(), loginReceiver);
            Login.login(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class LoginReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f12964a;
        public pvh b;

        public LoginReceiver(Context context) {
            this.f12964a = context;
        }

        public static /* synthetic */ Object ipc$super(LoginReceiver loginReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/weex2/modules/AliMUSLoginModule$LoginReceiver");
        }

        public void a(pvh pvhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91136cb7", new Object[]{this, pvhVar});
            } else {
                this.b = pvhVar;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                if (i == 1 || i == 2) {
                    LoginBroadcastHelper.unregisterLoginReceiver(this.f12964a, this);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", (Object) "failed");
                    pvh pvhVar = this.b;
                    if (pvhVar != null) {
                        pvhVar.b(jSONObject);
                    }
                } else if (i == 3) {
                    LoginBroadcastHelper.unregisterLoginReceiver(this.f12964a, this);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", (Object) "success");
                    pvh pvhVar2 = this.b;
                    if (pvhVar2 != null) {
                        pvhVar2.b(jSONObject2);
                    }
                } else if (i == 4) {
                    LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "success");
                    JSONObject jSONObject4 = new JSONObject();
                    String nick = Login.getNick();
                    String userId = Login.getUserId();
                    jSONObject4.put("nick", (Object) nick);
                    jSONObject4.put("userId", (Object) userId);
                    jSONObject3.put("info", (Object) jSONObject4);
                    pvh pvhVar3 = this.b;
                    if (pvhVar3 != null) {
                        pvhVar3.b(jSONObject3);
                    }
                }
            }
        }
    }
}
