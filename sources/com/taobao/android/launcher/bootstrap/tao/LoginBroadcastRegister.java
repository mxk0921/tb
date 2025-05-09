package com.taobao.android.launcher.bootstrap.tao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginBroadcastRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.android.launcher.bootstrap.tao.b f8149a;
    public BroadcastReceiver b;
    public b c;
    public volatile boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public LoginBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/LoginBroadcastRegister$LoginBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                if (i == 1) {
                    LoginBroadcastRegister.this.getClass();
                    LoginBroadcastRegister.this.getClass();
                    if (LoginBroadcastRegister.a(LoginBroadcastRegister.this).b() && !LoginBroadcastRegister.this.d) {
                        LoginBroadcastRegister.this.d = true;
                        b bVar2 = LoginBroadcastRegister.this.c;
                        if (bVar2 != null) {
                            bVar2.a(1);
                        }
                    }
                    b bVar3 = LoginBroadcastRegister.this.c;
                    if (bVar3 != null) {
                        bVar3.a(2);
                    }
                } else if (i == 2 && (bVar = LoginBroadcastRegister.this.c) != null) {
                    bVar.a(3);
                }
            }
        }

        public /* synthetic */ LoginBroadcastReceiver(LoginBroadcastRegister loginBroadcastRegister, a aVar) {
            this();
        }
    }

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
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i);
    }

    public LoginBroadcastRegister(com.taobao.android.launcher.bootstrap.tao.b bVar) {
        this.f8149a = bVar;
    }

    public static /* synthetic */ com.taobao.android.launcher.bootstrap.tao.b a(LoginBroadcastRegister loginBroadcastRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.launcher.bootstrap.tao.b) ipChange.ipc$dispatch("1a640a46", new Object[]{loginBroadcastRegister});
        }
        return loginBroadcastRegister.f8149a;
    }

    public void b(boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bcda9d", new Object[]{this, new Boolean(z), context});
        } else if (z) {
            if (this.b == null) {
                this.b = new LoginBroadcastReceiver(this, null);
            }
            LoginBroadcastHelper.registerLoginReceiver(context, this.b);
        } else {
            BroadcastReceiver broadcastReceiver = this.b;
            if (broadcastReceiver != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(context, broadcastReceiver);
                this.b = null;
            }
        }
    }
}
