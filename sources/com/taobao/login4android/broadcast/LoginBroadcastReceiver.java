package com.taobao.login4android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginBroadcastReceiver";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.broadcast.LoginBroadcastReceiver$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
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
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_RESET_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_USER_LOGIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        t2o.a(516947972);
    }

    public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/broadcast/LoginBroadcastReceiver");
    }

    private void whenReceiveFailBrodcast(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d4b5cf", new Object[]{this, intent});
        } else if (intent == null || !"false".equals(intent.getStringExtra("resetFlag"))) {
            LoginStatus.resetLoginFlag();
        } else {
            LoginTLogAdapter.e(TAG, "force not resetLoginFlag");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            try {
                LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                if (valueOf != null) {
                    switch (AnonymousClass1.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()]) {
                        case 1:
                            LoginStatus.resetLoginFlag();
                            SessionManager.sendCustomTrack("RECEIVED_SUCCESS_BROADCAST");
                            return;
                        case 2:
                            whenReceiveFailBrodcast(intent);
                            return;
                        case 3:
                        case 4:
                            LoginStatus.resetLoginFlag();
                            return;
                        case 5:
                            LoginStatus.setUserLogin(true);
                            return;
                        case 6:
                            SessionManager.sendCustomTrack("RECEIVED_LOGOUT_BROADCAST");
                            if (!TextUtils.equals(intent.getStringExtra(LoginConstants.LOGOUT_TYPE), LoginConstants.LogoutType.CHANGE_ACCOUNT.getType())) {
                                LoginStatus.resetLoginFlag();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
