package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.utils.CommonUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AccountListComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.AccountListComponent";
    private static OnAccountChangedListener mOnAccountChangedListener;

    static {
        t2o.a(70254925);
    }

    public static OnAccountChangedListener getOnAccountChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnAccountChangedListener) ipChange.ipc$dispatch("247b1310", new Object[0]);
        }
        return mOnAccountChangedListener;
    }

    public static void isMultiAccountPageEnable(DataCallback<Boolean> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c575d9", new Object[]{dataCallback});
        } else if (isMultiAccountPageEnable()) {
            if (dataCallback != null) {
                dataCallback.result(Boolean.TRUE);
            }
        } else if (dataCallback != null) {
            dataCallback.result(Boolean.FALSE);
        }
    }

    public static void newLogoutPanel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb25e87", new Object[]{context});
        } else {
            showLogoutPanel(context);
        }
    }

    public static void openMultiAccountPage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b84e74", new Object[]{context});
        } else {
            openMultiAccountPage(context, null);
        }
    }

    public static void setOnAccountChangedListener(OnAccountChangedListener onAccountChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f4ab54", new Object[]{onAccountChangedListener});
        } else {
            mOnAccountChangedListener = onAccountChangedListener;
        }
    }

    public static void showAgreement(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38220b4", new Object[]{context});
            return;
        }
        UserTrackAdapter.sendUT("Agreement");
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        Intent intent = new Intent(context, LogoutPanelActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("actionType", "agreement");
        context.startActivity(intent);
    }

    public static void showLogoutPanel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6512ee4", new Object[]{context});
            return;
        }
        UserTrackAdapter.sendUT("LogoutSimple");
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        Intent intent = new Intent(context, LogoutPanelActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("actionType", "logout_panel");
        context.startActivity(intent);
    }

    public static void openMultiAccountPage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31179e0", new Object[]{context, bundle});
            return;
        }
        Intent intent = new Intent(context, MultiAccountActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
        UserTrackAdapter.sendUT(NewMultiAccountFragment.PAGE_NAME, "Page_AccountManager_ShowView");
    }

    public static void isLogoutPanelEnable(final DataCallback<Boolean> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e89eb56", new Object[]{dataCallback});
            return;
        }
        final int i = LoginSwitch.getSwitch("trigger_logout_panel_new", 1);
        new CoordinatorWrapper().execute(new AsyncTask<Object, Void, SessionList>() { // from class: com.taobao.login4android.membercenter.account.AccountListComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/AccountListComponent$1");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.AsyncTask
            public SessionList doInBackground(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SessionList) ipChange2.ipc$dispatch("eddb0b47", new Object[]{this, objArr}) : SecurityGuardManagerWraper.getSessionListFromFile();
            }

            public void onPostExecute(SessionList sessionList) {
                int i2;
                List<SessionModel> list;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e4cb11ee", new Object[]{this, sessionList});
                } else if (!AccountListComponent.isMultiAccountPageEnable() || (i2 = i) < 1 || sessionList == null || (list = sessionList.sessionModels) == null || i2 > list.size()) {
                    dataCallback.result(Boolean.FALSE);
                } else {
                    dataCallback.result(Boolean.TRUE);
                }
            }
        }, new Object[0]);
    }

    public static boolean isMultiAccountPageEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59209d1b", new Object[0])).booleanValue() : CommonUtil.isInABTestRegion("enable_multi_account_new", 10000);
    }
}
