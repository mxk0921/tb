package com.alibaba.analytics;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.alibaba.ut.abtest.UTABEnvironment;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitABTest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitABTest";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Nav.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(InitABTest initABTest) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class b {
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

    public void init(Application application, HashMap<String, Object> hashMap) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e(TAG, "init error: application is null");
            }
            if (hashMap == null) {
                Log.e(TAG, "init error: params is null");
            }
        } else {
            if (hashMap.get("isDebuggable") != null ? ((Boolean) hashMap.get("isDebuggable")).booleanValue() : false) {
                application.toString();
                hashMap.toString();
            }
            if (hashMap.get("isUserTracklogEnable") != null) {
                z = ((Boolean) hashMap.get("isUserTracklogEnable")).booleanValue();
            }
            UTABEnvironment uTABEnvironment = UTABEnvironment.Product;
            try {
                Number number = (Number) hashMap.get(OConstant.LAUNCH_ENVINDEX);
                if (number != null) {
                    int intValue = number.intValue();
                    if (intValue == 1) {
                        uTABEnvironment = UTABEnvironment.Prepare;
                    } else if (intValue == 2) {
                        uTABEnvironment = UTABEnvironment.Daily;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                UTABTest.initialize(application, UTABTest.newConfigurationBuilder().b(z).c(uTABEnvironment).d(UTABMethod.Push).a());
                UTABTest.updateUserAccount(Login.getNick(), Login.getUserId());
                LoginBroadcastHelper.registerLoginReceiver(application, new BroadcastReceiver(this) { // from class: com.alibaba.analytics.InitABTest.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/InitABTest$1");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        LoginAction valueOf;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                            int i = b.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                            if (i == 1 || i == 2) {
                                UTABTest.updateUserAccount(Login.getNick(), Login.getUserId());
                            }
                        }
                    }
                });
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Nav.registerPreprocessor(new a(this));
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }
}
