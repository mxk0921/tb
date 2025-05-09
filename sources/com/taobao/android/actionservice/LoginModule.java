package com.taobao.android.actionservice;

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
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LoginModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGIN_STATUS = "status";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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

    public static void login(JSON json, ActionService.h hVar, ActionService.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7979d8fd", new Object[]{json, hVar, gVar});
        } else if (!Login.checkSessionValid()) {
            Login.login(true);
        }
    }

    public static void loginAsync(JSON json, final ActionService.h hVar, final ActionService.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a804a7", new Object[]{json, hVar, gVar});
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        if (!Login.checkSessionValid()) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.actionservice.LoginModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/actionservice/LoginModule$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                        int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            JSONObject.this.put("status", (Object) "SUCCESS");
                            gVar.a(hVar, JSONObject.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(zca.a(), this);
                        } else if (i == 2) {
                            JSONObject.this.put("status", (Object) "FAILED");
                            gVar.a(hVar, JSONObject.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(zca.a(), this);
                        } else if (i == 3) {
                            JSONObject.this.put("status", (Object) "CANCEL");
                            gVar.a(hVar, JSONObject.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(zca.a(), this);
                        }
                    }
                }
            };
            Login.login(true);
            LoginBroadcastHelper.registerLoginReceiver(zca.a(), broadcastReceiver);
            return;
        }
        jSONObject.put("status", (Object) "SUCCESS");
        gVar.a(hVar, jSONObject);
    }
}
