package com.taobao.login4android.api;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.login4android.api.aidl.ILogin;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class LoginServiceTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginServiceTask";
    private LoginTrackableServiceConnection connection;

    static {
        t2o.a(512753707);
    }

    public LoginServiceTask() {
        Login.sendUT("LoginAPI_LoginServiceTask");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.login4android.api.aidl.ILogin getLoginService() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.api.LoginServiceTask.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "150fa670"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            com.taobao.login4android.api.aidl.ILogin r0 = (com.taobao.login4android.api.aidl.ILogin) r0
            return r0
        L_0x0015:
            java.lang.String r0 = "Login_bindService"
            r1 = 0
            com.taobao.statistic.TBS.Ext.commitEvent(r0, r1)
            com.taobao.login4android.api.LoginTrackableServiceConnection r0 = new com.taobao.login4android.api.LoginTrackableServiceConnection     // Catch: all -> 0x0032
            r0.<init>()     // Catch: all -> 0x0032
            r4.connection = r0     // Catch: all -> 0x0032
            android.content.Context r2 = com.taobao.login4android.api.Login.mContext     // Catch: all -> 0x0032
            java.lang.Class<com.taobao.login4android.api.aidl.ILogin> r3 = com.taobao.login4android.api.aidl.ILogin.class
            com.taobao.android.service.Services.bind(r2, r3, r0)     // Catch: all -> 0x0032
            com.taobao.login4android.api.LoginTrackableServiceConnection r0 = r4.connection     // Catch: all -> 0x0032, InterruptedException -> 0x0034, TimeoutException -> 0x0036
            r2 = 10000(0x2710, double:4.9407E-320)
            android.os.IBinder r0 = r0.waitUntilConnected(r2)     // Catch: all -> 0x0032, InterruptedException -> 0x0034, TimeoutException -> 0x0036
            goto L_0x0048
        L_0x0032:
            r0 = move-exception
            goto L_0x004f
        L_0x0034:
            r0 = move-exception
            goto L_0x0038
        L_0x0036:
            r0 = move-exception
            goto L_0x0040
        L_0x0038:
            java.lang.String r2 = "LoginServiceTask_Interrupt"
            java.lang.String r3 = "ILogin Service connection Interrupt"
            reportError(r2, r3, r0)     // Catch: all -> 0x0032
            return r1
        L_0x0040:
            java.lang.String r2 = "LoginServiceTask_Timeout"
            java.lang.String r3 = "ILogin Service connection timeout"
            reportError(r2, r3, r0)     // Catch: all -> 0x0032
            r0 = r1
        L_0x0048:
            if (r0 == 0) goto L_0x0056
            com.taobao.login4android.api.aidl.ILogin r0 = com.taobao.login4android.api.aidl.ILogin.Stub.asInterface(r0)     // Catch: all -> 0x0032
            goto L_0x0057
        L_0x004f:
            java.lang.String r2 = "LoginServiceTask_Error"
            java.lang.String r3 = "ILogin Service connection Error"
            reportError(r2, r3, r0)
        L_0x0056:
            r0 = r1
        L_0x0057:
            if (r0 != 0) goto L_0x005e
            java.lang.String r2 = "Login_bindServiceFailed"
            com.taobao.statistic.TBS.Ext.commitEvent(r2, r1)
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.api.LoginServiceTask.getLoginService():com.taobao.login4android.api.aidl.ILogin");
    }

    public static /* synthetic */ Object ipc$super(LoginServiceTask loginServiceTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/LoginServiceTask");
    }

    private static void reportError(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2387c006", new Object[]{str, str2, th});
            return;
        }
        Login.sendUT(str);
        LoginTLogAdapter.e(TAG, str2, th);
    }

    public void doFinally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc23aff", new Object[]{this});
        }
    }

    @Override // android.os.AsyncTask
    public Result doInBackground(Params... paramsArr) {
        Result result;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("e83e4786", new Object[]{this, paramsArr});
        }
        try {
            ILogin loginService = getLoginService();
            if (loginService != null) {
                result = excuteTask(loginService);
            } else {
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
                result = null;
            }
            return result;
        } catch (Throwable th) {
            try {
                reportError("LoginServiceTask_bg_Error", "LoginServiceTask bg excute faile", th);
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
                try {
                    doFinally();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                try {
                    LoginTrackableServiceConnection loginTrackableServiceConnection = this.connection;
                    if (loginTrackableServiceConnection == null) {
                        return null;
                    }
                    Services.unbind(Login.mContext, loginTrackableServiceConnection);
                    this.connection = null;
                    return null;
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return null;
                }
            } finally {
                try {
                    doFinally();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                try {
                    LoginTrackableServiceConnection loginTrackableServiceConnection2 = this.connection;
                    if (loginTrackableServiceConnection2 != null) {
                        Services.unbind(Login.mContext, loginTrackableServiceConnection2);
                        this.connection = null;
                    }
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
            }
        }
    }

    public abstract Result excuteTask(ILogin iLogin) throws Exception;

    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            ILogin loginService = getLoginService();
            if (loginService != null) {
                excuteTask(loginService);
            } else {
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
            }
            try {
                doFinally();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            LoginTrackableServiceConnection loginTrackableServiceConnection = this.connection;
            if (loginTrackableServiceConnection != null) {
                Services.unbind(Login.mContext, loginTrackableServiceConnection);
                this.connection = null;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
