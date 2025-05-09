package com.taobao.login4android.jsbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.kpw;
import tb.rmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AuthBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver mLoginReceiver;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.jsbridge.AuthBridge$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_ALIPAY_SSO_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_ALIPAY_SSO_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(517996602);
    }

    public static /* synthetic */ void access$000(AuthBridge authBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73fcc93", new Object[]{authBridge, wVCallBackContext});
        } else {
            authBridge.doWhenReceiveSuccess(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(AuthBridge authBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac76f94", new Object[]{authBridge, wVCallBackContext});
        } else {
            authBridge.doWhenReceivedCancel(wVCallBackContext);
        }
    }

    private synchronized void alipay(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522c8a8e", new Object[]{this, wVCallBackContext});
            return;
        }
        if (this.mContext instanceof Activity) {
            registerBroadcast(wVCallBackContext);
            rmo.l(SNSPlatform.PLATFORM_ALIPAY, (Activity) this.mContext);
        } else {
            wVCallBackContext.error();
        }
    }

    private synchronized void checkIfExist(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e959f6", new Object[]{this, wVCallBackContext});
            return;
        }
        if (AliMemberSDK.getService(OauthService.class) == null || !((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(this.mContext, "alipay")) {
            wVCallBackContext.error();
        } else {
            wVCallBackContext.success();
        }
    }

    private synchronized void checkIfTaobaoExist(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117e7f28", new Object[]{this, wVCallBackContext});
            return;
        }
        if (isSupportTBAuthBind(this.mContext)) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private void doWhenReceiveSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71be28a9", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
    }

    private void doWhenReceivedCancel(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e383c4", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
    }

    public static /* synthetic */ Object ipc$super(AuthBridge authBridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/AuthBridge");
    }

    private static boolean isSchemeSupport(Context context, String str, String str2) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c617c59", new Object[]{context, str, str2})).booleanValue();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.taobao.taobao", 1);
            intent = new Intent();
            intent.setAction(str);
            intent.setData(Uri.parse(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (packageManager.queryIntentActivities(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isSupportTBAuthBind(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abdbec8d", new Object[]{context})).booleanValue();
        }
        return isSchemeSupport(context, "com.taobao.open.intent.action.BIND_AUTH", "tbopen://m.taobao.com/bind_auth?");
    }

    private void registerBroadcast(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b175a2", new Object[]{this, wVCallBackContext});
            return;
        }
        this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.jsbridge.AuthBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/jsbridge/AuthBridge$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LoginAction valueOf;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                    int i = AnonymousClass2.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                    if (i == 1) {
                        AuthBridge.access$000(AuthBridge.this, wVCallBackContext);
                    } else if (i == 2) {
                        AuthBridge.access$100(AuthBridge.this, wVCallBackContext);
                    } else if (i == 3 || i == 4 || i == 5) {
                        AuthBridge.access$100(AuthBridge.this, wVCallBackContext);
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
    }

    private synchronized void taobao(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121e2572", new Object[]{this, wVCallBackContext});
            return;
        }
        if (this.mContext instanceof Activity) {
            registerBroadcast(wVCallBackContext);
        } else {
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("bridgeAlipaySSOLogin".equals(str)) {
            alipay(wVCallBackContext);
        } else if ("bridgeAlipaySupported".equals(str)) {
            checkIfExist(wVCallBackContext);
        } else if ("bridgeTaobaoSSOLogin".equals(str)) {
            taobao(wVCallBackContext);
        } else if (!"bridgeTaobaoSupported".equals(str)) {
            return false;
        } else {
            checkIfTaobaoExist(wVCallBackContext);
        }
        return true;
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
        }
    }
}
