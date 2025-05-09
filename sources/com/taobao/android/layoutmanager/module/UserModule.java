package com.taobao.android.layoutmanager.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(502268149);
        t2o.a(503316559);
    }

    public static void getUserInfo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5932dd", new Object[]{jVar});
        } else if (Login.checkSessionValid()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uId", (Object) Login.getUserId());
            jSONObject.put("nick", (Object) Login.getNick());
            jSONObject.put("userLogo", (Object) Login.getHeadPicLink());
            jVar.c.a(jVar, jSONObject);
        } else {
            jVar.c.a(jVar, new JSONObject());
        }
    }

    public static void isLogin(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422ba50d", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (Login.checkSessionValid()) {
            jSONObject.put("result", (Object) Boolean.TRUE);
            jVar.c.a(jVar, jSONObject);
            return;
        }
        jSONObject.put("result", (Object) Boolean.FALSE);
        jVar.c.a(jVar, jSONObject);
    }

    public static void logout(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc91a42", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (Login.checkSessionValid()) {
            Login.logout(false);
            jSONObject.put("result", (Object) Boolean.TRUE);
            jVar.c.a(jVar, jSONObject);
            return;
        }
        jSONObject.put("result", (Object) Boolean.TRUE);
        jVar.c.a(jVar, jSONObject);
    }

    public static void login(final d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d684143", new Object[]{jVar});
        } else if (!Login.checkSessionValid()) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.layoutmanager.module.UserModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/module/UserModule$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                        int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("uId", (Object) Login.getUserId());
                            jSONObject.put("nick", (Object) Login.getNick());
                            jSONObject.put("userLogo", (Object) Login.getHeadPicLink());
                            d.j jVar2 = d.j.this;
                            jVar2.c.a(jVar2, jSONObject);
                            LoginBroadcastHelper.unregisterLoginReceiver(o.J(), this);
                        } else if (i == 2) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("result", (Object) Boolean.FALSE);
                            d.j jVar3 = d.j.this;
                            jVar3.c.a(jVar3, jSONObject2);
                            LoginBroadcastHelper.unregisterLoginReceiver(o.J(), this);
                        } else if (i == 3) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("result", (Object) Boolean.FALSE);
                            d.j jVar4 = d.j.this;
                            jVar4.c.a(jVar4, jSONObject3);
                            LoginBroadcastHelper.unregisterLoginReceiver(o.J(), this);
                        }
                    }
                }
            };
            JSON json = jVar.b;
            if ((json instanceof JSONObject) && ((JSONObject) json).containsKey("auto")) {
                z = true;
            }
            Login.login(!z);
            LoginBroadcastHelper.registerLoginReceiver(o.J(), broadcastReceiver);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uId", (Object) Login.getUserId());
            jSONObject.put("nick", (Object) Login.getNick());
            jSONObject.put("userLogo", (Object) Login.getHeadPicLink());
            jVar.c.a(jVar, jSONObject);
        }
    }
}
