package com.taobao.privacyguard.config;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.broadcast.LoginBroadcastReceiver;
import tb.t2o;
import tb.vhl;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LoginStateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(757071878);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130e1aac", new Object[]{context});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new LoginBroadcastReceiver() { // from class: com.taobao.privacyguard.config.LoginStateManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1006950490) {
                        super.onReceive((Context) objArr[0], (Intent) objArr[1]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/privacyguard/config/LoginStateManager$1");
                }

                @Override // com.taobao.login4android.broadcast.LoginBroadcastReceiver, android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    super.onReceive(context2, intent);
                    if (intent != null) {
                        try {
                            int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                            if (i == 1) {
                                vhl.a("TBMinorsProtect", "[LoginStateManager] NOTIFY_LOGIN_SUCCESS");
                            } else if (i == 2) {
                                vhl.a("TBMinorsProtect", "[LoginStateManager] NOTIFY_LOGOUT");
                                xpr.r(context2).B();
                            } else if (i == 3) {
                                vhl.a("TBMinorsProtect", "[LoginStateManager] NOTIFY_LOGIN_FAILED");
                            }
                        } catch (Throwable th) {
                            vhl.b("TBMinorsProtect", "error: " + th);
                        }
                    }
                }
            });
        }
    }
}
