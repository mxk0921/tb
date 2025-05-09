package com.taobao.android.ucp.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import tb.gwv;
import tb.iaa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFY_LOGIN_SUCCESS = "NOTIFY_LOGIN_SUCCESS";
    public static final String NOTIFY_LOGOUT = "NOTIFY_LOGOUT";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ Intent c;

        public a(String str, Intent intent) {
            this.b = str;
            this.c = intent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/util/LoginBroadcastReceiver$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (TextUtils.equals(this.b, LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS)) {
                gwv.B();
                String stringExtra = this.c.getStringExtra("uid");
                iaa.f21189a = stringExtra;
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.USER_LOGIN_IN_CHANGE, com.taobao.android.behavir.util.a.b("userId", stringExtra), null);
            } else if (LoginBroadcastReceiver.NOTIFY_LOGOUT.equals(this.b)) {
                iaa.f21189a = "";
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.USER_LOGIN_IN_CHANGE, com.taobao.android.behavir.util.a.b("userId", ""), null);
            }
        }
    }

    static {
        t2o.a(404750756);
    }

    public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/util/LoginBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            b.b(new a(intent.getAction(), intent));
        }
    }
}
