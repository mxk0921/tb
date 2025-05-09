package com.taobao.android.sso.v2.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.NavUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.thread.LoginAsyncTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AccsLoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_ACTION = "com.ali.user.sdk.login.notification";

    public static /* synthetic */ void access$000(AccsLoginReceiver accsLoginReceiver, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e0efb4", new Object[]{accsLoginReceiver, context, str});
        } else {
            accsLoginReceiver.showWebViewPage(context, str);
        }
    }

    private void deleteAccsLoginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7026e761", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = DataProviderFactory.getApplicationContext().getSharedPreferences("userinfo", 4).edit();
        edit.remove("accs_login");
        edit.apply();
    }

    public static /* synthetic */ Object ipc$super(AccsLoginReceiver accsLoginReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sso/v2/service/AccsLoginReceiver");
    }

    private void showWebViewPage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c352640", new Object[]{this, context, str});
        } else {
            NavUtil.navTo(context, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            try {
                if (!TextUtils.isEmpty(intent.getStringExtra(WebConstant.WEBURL))) {
                    deleteAccsLoginInfo();
                    new LoginAsyncTask<Void, Void, Void>() { // from class: com.taobao.android.sso.v2.service.AccsLoginReceiver.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sso/v2/service/AccsLoginReceiver$1");
                        }

                        public Void excuteTask(Void... voidArr) throws RemoteException {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Void) ipChange2.ipc$dispatch("35b37603", new Object[]{this, voidArr});
                            }
                            if (Login.checkSessionValid() || TextUtils.isEmpty(Login.getLoginToken()) || TextUtils.isEmpty(Login.getUserId())) {
                                return null;
                            }
                            LoginTLogAdapter.e(LoginAsyncTask.TAG, "checkSessionValid, do autoLogin");
                            try {
                                new AutoLoginBusiness().autoLogin(Login.getLoginToken(), Login.getUserId(), DataProviderFactory.getDataProvider().getSite(), true, "auto login for accs");
                                return null;
                            } catch (Throwable th) {
                                th.printStackTrace();
                                return null;
                            }
                        }

                        public void onPostExecute(Void r5) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("213d104", new Object[]{this, r5});
                            } else {
                                AccsLoginReceiver.access$000(AccsLoginReceiver.this, context, intent.getStringExtra(WebConstant.WEBURL));
                            }
                        }
                    }.execute(new Void[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}
