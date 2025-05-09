package com.taobao.browser.commonUrlFilter;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ejh;
import tb.t2o;
import tb.v7t;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_LOGIN = 102;
    public static final int ACTION_LOGOUT = 103;
    public static final int ACTION_REFRESH_COOKIE = 101;
    public static final String TAG = "LoginBroadcastReceiver";
    public static final Map<Integer, LoginBroadcastReceiver> d = new ConcurrentHashMap();
    public static final Map<Integer, LoginBroadcastReceiver> e = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<IWVWebView> f10255a;
    public final WeakReference<ejh> b;
    public final WeakReference<Activity> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_REFRESH_COOKIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(619708478);
    }

    public LoginBroadcastReceiver(Activity activity, IWVWebView iWVWebView, ejh ejhVar) {
        this.c = new WeakReference<>(activity);
        this.f10255a = new WeakReference<>(iWVWebView);
        this.b = new WeakReference<>(ejhVar);
    }

    public static void a(Activity activity, IWVWebView iWVWebView, ejh ejhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71540103", new Object[]{activity, iWVWebView, ejhVar, new Integer(i)});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        switch (i) {
            case 101:
                intentFilter.addAction(LoginAction.NOTIFY_REFRESH_COOKIES.name());
                break;
            case 102:
            case 103:
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_CANCEL.name());
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_FAILED.name());
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_SUCCESS.name());
                intentFilter.addAction(LoginAction.NOTIFY_LOGOUT.name());
                break;
        }
        LoginBroadcastReceiver loginBroadcastReceiver = new LoginBroadcastReceiver(activity, iWVWebView, ejhVar);
        if (activity == null) {
            v7t.d(TAG, "Activity is null?");
        } else if (i == 101) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d;
            if (!concurrentHashMap.containsKey(Integer.valueOf(activity.hashCode()))) {
                concurrentHashMap.put(Integer.valueOf(activity.hashCode()), loginBroadcastReceiver);
                LoginBroadcastHelper.registerLoginReceiver(activity.getApplicationContext(), loginBroadcastReceiver, intentFilter);
            }
        } else if (i == 102 || i == 103) {
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) e;
            if (!concurrentHashMap2.containsKey(Integer.valueOf(activity.hashCode()))) {
                concurrentHashMap2.put(Integer.valueOf(activity.hashCode()), loginBroadcastReceiver);
                LoginBroadcastHelper.registerLoginReceiver(activity.getApplicationContext(), loginBroadcastReceiver, intentFilter);
            }
        } else {
            v7t.a(TAG, "Activity " + activity.hashCode() + " has register for:" + i);
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74501b24", new Object[]{activity});
            return;
        }
        LoginBroadcastReceiver loginBroadcastReceiver = (LoginBroadcastReceiver) ((ConcurrentHashMap) d).remove(Integer.valueOf(activity.hashCode()));
        if (loginBroadcastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(activity.getApplicationContext(), loginBroadcastReceiver);
        }
        LoginBroadcastReceiver loginBroadcastReceiver2 = (LoginBroadcastReceiver) ((ConcurrentHashMap) e).remove(Integer.valueOf(activity.hashCode()));
        if (loginBroadcastReceiver2 != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(activity.getApplicationContext(), loginBroadcastReceiver2);
        }
    }

    public static /* synthetic */ Object ipc$super(LoginBroadcastReceiver loginBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/commonUrlFilter/LoginBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        IWVWebView iWVWebView = this.f10255a.get();
        Activity activity = this.c.get();
        ejh ejhVar = this.b.get();
        if (iWVWebView == null || activity == null) {
            LoginBroadcastHelper.unregisterLoginReceiver(context.getApplicationContext(), this);
        } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            String str2 = "";
            if (ejhVar != null) {
                str = ejhVar.a();
                str2 = ejhVar.c(str2);
            } else {
                str = str2;
            }
            String url = TextUtils.isEmpty(str2) ? iWVWebView.getUrl() : str2;
            LoginAction valueOf = LoginAction.valueOf(intent.getAction());
            try {
                BrowserUtil.b(TAG, "onReceive", "action" + valueOf, url, null);
                i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
            } catch (Exception e2) {
                y7t.a(TAG, "Exception when processing login message: " + e2.getMessage());
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        if (!TextUtils.isEmpty(str)) {
                            iWVWebView.evaluateJavascript("javascript:window." + str + "('TBLOGIN:CANCEL');");
                        }
                    } else if (i == 5) {
                        if (!TextUtils.isEmpty(str)) {
                            iWVWebView.evaluateJavascript("window." + str + "('TBLOGOUT:SUCCESS');");
                        } else if (TextUtils.isEmpty(str2) || !str2.startsWith("http") || !Nav.from(activity).disallowLoopback().toUri(str2)) {
                            iWVWebView.loadUrl(url);
                        } else {
                            activity.finish();
                        }
                    } else {
                        return;
                    }
                } else if (!TextUtils.isEmpty(str)) {
                    iWVWebView.evaluateJavascript("javascript:window." + str + "('TBLOGIN:SUCCESS');");
                } else if (TextUtils.isEmpty(str2) || !str2.startsWith("http") || !Nav.from(activity).disallowLoopback().toUri(str2)) {
                    iWVWebView.loadUrl(url);
                } else {
                    activity.finish();
                }
                LoginBroadcastHelper.unregisterLoginReceiver(context.getApplicationContext(), this);
                a(activity, iWVWebView, null, 101);
            } else if (intent.getBooleanExtra("refreshResult", false)) {
                iWVWebView.fireEvent("WVLogin.Cookie.refreshSuccess", "{}");
            }
        }
    }
}
