package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.ucc.UccService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.utils.LoginSwitch;
import org.json.JSONObject;
import tb.mf0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.receiver.TBLoginReceiver$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_UCC_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(517996618);
    }

    public static /* synthetic */ Object ipc$super(TBLoginReceiver tBLoginReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/receiver/TBLoginReceiver");
    }

    private void jumpToTargetUrl(Context context) {
        String optString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc36c6c", new Object[]{this, context});
            return;
        }
        String extJson = Login.getExtJson();
        if (!TextUtils.isEmpty(extJson)) {
            try {
                optString = new JSONObject(extJson).optString("afterLoginH5Url");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!TextUtils.isEmpty(optString) && LoginSwitch.getSwitch("afterLoginH5Url", "true")) {
                Nav.from(context).toUri(optString);
                return;
            }
        }
        optString = "";
        if (!TextUtils.isEmpty(optString)) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            int i = AnonymousClass1.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
            if (i == 1) {
                try {
                    ((UccService) AliMemberSDK.getService(UccService.class)).logoutAll(context);
                    ((UccService) AliMemberSDK.getService(UccService.class)).logout(context, "eleme");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                mf0.c(context);
            } else if (i == 2) {
                if (!TextUtils.equals(intent.getStringExtra(LoginConstants.LOGIN_TYPE), LoginType.ServerLoginType.AutoLogin.getType()) || !TextUtils.isEmpty(intent.getStringExtra(LoginConstants.LOGIN_FROM))) {
                    mf0.l(context, "", "", "login");
                }
                jumpToTargetUrl(context);
            }
        }
    }
}
