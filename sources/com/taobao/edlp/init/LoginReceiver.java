package com.taobao.edlp.init;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.a68;
import tb.a98;
import tb.a9f;
import tb.aba;
import tb.t2o;
import tb.uto;
import tb.vk8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a9f.c();
            if (a98.a() && aba.g().d(IEdlpTabBarActionButtonProvider.class) == null) {
                aba.g().f(IEdlpTabBarActionButtonProvider.class, new EdlpTabBarActionButtonProvider());
            }
        }
    }

    static {
        t2o.a(1032847370);
    }

    public static /* synthetic */ Object ipc$super(LoginReceiver loginReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/init/LoginReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
            TLog.loge(a68.TAG, "intent action is null");
        } else if (LoginAction.NOTIFY_LOGIN_SUCCESS.name().equals(intent.getAction())) {
            TLog.loge(a68.TAG, "NOTIFY_LOGIN_SUCCESS " + Login.getUserId());
            HashMap hashMap = new HashMap();
            hashMap.put("userId", Login.getUserId());
            vk8.b().d("login", hashMap);
            uto.a().execute(new a());
        } else if (LoginAction.NOTIFY_LOGOUT.name().equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("nick");
            String stringExtra2 = intent.getStringExtra("uid");
            TLog.loge(a68.TAG, LoginBroadcastReceiver.NOTIFY_LOGOUT + stringExtra2 + "|" + stringExtra);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("userId", stringExtra2);
            vk8.b().d("logout", hashMap2);
            a9f.b(stringExtra2);
        }
    }
}
