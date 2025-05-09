package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.BaseLogonFragment;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.model.AutoLoginCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.SiteUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.autologin.AutoLoginParam;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.membercenter.account.adapter.AccountHelper;
import com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.g1v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewMultiAccountFragment extends BaseLogonFragment implements View.OnClickListener, View.OnFocusChangeListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_AccountManager";
    public static final String TAG = "login.MultiAccount";
    public static final int TYPE_ADD = 1;
    public static final int TYPE_CHANGE = 2;
    public boolean loginMode;
    public ListView mAccountListView;
    public NewAccountAdapter mAdapter;
    public View mAddAccountBtn;
    public Activity mAttachedActivity;
    public View mBackBtn;
    public TextView mDeleteManagerBtn;
    public List<SessionModel> mListAccounts;
    public SessionList mSessionList;
    private BroadcastReceiver mSwitchLoginReceiver;
    public TextView mTitleTV;
    private String changingUserId = "";
    public boolean isFromAccount = true;
    private final int ADD_ACCOUNT = 1;
    private final int SWITCH_ACCOUNT = 2;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.membercenter.account.NewMultiAccountFragment$11  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass11 {
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
        }
    }

    static {
        t2o.a(70254938);
    }

    public static /* synthetic */ boolean access$000(NewMultiAccountFragment newMultiAccountFragment, SessionList sessionList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5302985", new Object[]{newMultiAccountFragment, sessionList})).booleanValue();
        }
        return newMultiAccountFragment.sessionListEmpty(sessionList);
    }

    public static /* synthetic */ void access$100(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b151e89", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$300(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d17c1c7", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$400(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6191366", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$500(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1a6505", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ String access$600(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb5da7c", new Object[]{newMultiAccountFragment});
        }
        return newMultiAccountFragment.changingUserId;
    }

    private void addConfirmListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5280bba", new Object[]{this});
        } else {
            this.mAdapter.setConfirmClickListener(new NewAccountAdapter.OnButtonClickListener() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private boolean isClicked = false;

                public static /* synthetic */ boolean access$202(AnonymousClass5 r3, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("16d63843", new Object[]{r3, new Boolean(z)})).booleanValue();
                    }
                    r3.isClicked = z;
                    return z;
                }

                @Override // com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.OnButtonClickListener
                public void click(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d7d00", new Object[]{this, view, new Integer(i)});
                    } else if (!this.isClicked || LoginSwitch.getSwitch("ignoreClickCheck", "false")) {
                        this.isClicked = true;
                        new Handler().postDelayed(new Runnable() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AnonymousClass5.access$202(AnonymousClass5.this, false);
                                }
                            }
                        }, 200L);
                        NewAccountAdapter newAccountAdapter = NewMultiAccountFragment.this.mAdapter;
                        if (newAccountAdapter == null || !newAccountAdapter.isDeleteMode()) {
                            NewMultiAccountFragment.this.registerSwitchUserLoginStatus(2);
                            NewMultiAccountFragment.this.doChangeThing(i);
                        }
                    } else {
                        UserTrackAdapter.sendUT("duplicateClick");
                    }
                }
            });
        }
    }

    private void addDeleteListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cf2f07", new Object[]{this});
        } else {
            this.mAdapter.setOnDeleteClickListener(new NewAccountAdapter.OnButtonClickListener() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.OnButtonClickListener
                public void click(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d7d00", new Object[]{this, view, new Integer(i)});
                    } else {
                        NewMultiAccountFragment.this.doDeleteThing(i);
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(NewMultiAccountFragment newMultiAccountFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/NewMultiAccountFragment");
        }
    }

    private boolean sessionListEmpty(SessionList sessionList) {
        List<SessionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51709bcf", new Object[]{this, sessionList})).booleanValue();
        }
        if (sessionList == null || (list = sessionList.sessionModels) == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public void afterViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb54a979", new Object[]{this});
            return;
        }
        this.mAccountListView.setOnItemClickListener(this);
        this.mAccountListView.setOnItemLongClickListener(this);
    }

    public boolean checkBeforeDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("104e6796", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    public void deleteUser(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40070506", new Object[]{this, new Integer(i)});
            return;
        }
        sendControl("Button-DeleteUser");
        if (this.mListAccounts.size() <= 0) {
            this.mAttachedActivity.finish();
            gotoLoginActivity(null, false);
        } else if (this.mListAccounts.size() <= i) {
            this.mAttachedActivity.finish();
        } else {
            SessionModel remove = this.mListAccounts.remove(i);
            SecurityGuardManagerWraper.removeSessionModelFromFile(remove.userId);
            try {
                SecurityGuardManagerWraper.removeHistoryAccount(SecurityGuardManagerWraper.findHistoryAccount(Long.parseLong(remove.userId)));
            } catch (NumberFormatException unused) {
            }
            if (AccountHelper.isCurrentLoginUser(remove)) {
                this.mAttachedActivity.finish();
                Login.logout(DataProviderFactory.getApplicationContext());
                sendControl("Button_PreDeleteCurrent");
                return;
            }
            sendControl("Button_PreDelete");
            if (this.mListAccounts.size() > 0) {
                this.mAccountListView.setAdapter((ListAdapter) null);
                boolean isDeleteMode = this.mAdapter.isDeleteMode();
                this.mAdapter = null;
                initAdapter();
                this.mAdapter.setDeleteMode(isDeleteMode);
                return;
            }
            Activity activity = this.mAttachedActivity;
            if (activity instanceof MultiAccountActivity) {
                activity.finish();
            }
            gotoLoginActivity(null, true);
        }
    }

    public void doAddThing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6696ff", new Object[]{this});
            return;
        }
        sendControl("Button_Add_Click");
        if (Login.checkSessionValid()) {
            gotoLoginActivity(null, true, 1);
            sendControl("Button_Add");
        } else if (TextUtils.isEmpty(Login.getUserId()) || TextUtils.isEmpty(Login.getLoginToken())) {
            toLoginWithCurrent(true);
        } else {
            LoginController.getInstance().doAutoLoginWithCallback(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer(), false, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onBizFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str});
                    } else {
                        NewMultiAccountFragment.this.toLoginWithCurrent(true);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onNetworkError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                    } else {
                        Toast.makeText(DataProviderFactory.getApplicationContext(), NewMultiAccountFragment.this.mAttachedActivity.getString(R.string.aliuser_network_error), 0).show();
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        NewMultiAccountFragment.this.gotoLoginActivity(null, true, 1);
                    }
                }
            });
        }
    }

    public void doChange(int i) {
        SessionModel sessionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2c2021", new Object[]{this, new Integer(i)});
        } else if (isActivityAvaiable() && (sessionModel = this.mListAccounts.get(i)) != null && !isCurrentLoginUser(sessionModel)) {
            String str = sessionModel.userId;
            this.changingUserId = str;
            sendControl("Button_Change", str);
            showProgress(getResources().getString(R.string.con_ali_multi_account_change));
            LoginStatus.compareAndSetFromChangeAccount(false, true);
            autologinTarget(sessionModel);
        }
    }

    public void doChangeThing(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18bcda9", new Object[]{this, new Integer(i)});
            return;
        }
        sendControl("Button_Change_Click");
        if (Login.checkSessionValid()) {
            doChange(i);
        } else if (TextUtils.isEmpty(Login.getUserId()) || TextUtils.isEmpty(Login.getLoginToken())) {
            LoginStatus.compareAndSetFromChangeAccount(false, true);
            toLoginWithCurrent(false);
        } else {
            LoginStatus.compareAndSetFromChangeAccount(false, true);
            LoginController.getInstance().doAutoLoginWithCallback(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer(), false, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onBizFail(int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i2), str});
                    } else {
                        NewMultiAccountFragment.this.toLoginWithCurrent(false);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onNetworkError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                        return;
                    }
                    NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                    newMultiAccountFragment.toast(newMultiAccountFragment.mAttachedActivity.getString(R.string.aliuser_network_error), 0);
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        NewMultiAccountFragment.this.doChange(i);
                    }
                }
            });
        }
    }

    public boolean doDelete(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eebb30a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mListAccounts.get(i) != null) {
            showBottomMenu(i);
        }
        return true;
    }

    public boolean doDeleteThing(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7d41e8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        sendControl("Button_Delete_Click");
        if (Login.checkSessionValid()) {
            doDelete(i);
            sendControl("Button_Delete");
        } else if (TextUtils.isEmpty(Login.getUserId()) || TextUtils.isEmpty(Login.getLoginToken())) {
            toLoginWithCurrent(false);
        } else {
            LoginController.getInstance().doAutoLoginWithCallback(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer(), false, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onBizFail(int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i2), str});
                    } else {
                        NewMultiAccountFragment.this.toLoginWithCurrent(false);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onNetworkError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                        return;
                    }
                    NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                    newMultiAccountFragment.toast(newMultiAccountFragment.mAttachedActivity.getString(R.string.aliuser_network_error), 0);
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        NewMultiAccountFragment.this.doDelete(i);
                    }
                }
            });
        }
        return true;
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceiveFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfd7383", new Object[]{this});
        } else {
            dismissProgress();
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceiveSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ad5f6c", new Object[]{this});
        } else if (isActivityAvaiable()) {
            drawView();
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceivedCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a964207", new Object[]{this});
            return;
        }
        if (!Login.checkSessionValid()) {
            Activity activity = this.mAttachedActivity;
            if (activity != null) {
                activity.finish();
            }
            if (AccountListComponent.getOnAccountChangedListener() != null) {
                AccountListComponent.getOnAccountChangedListener().OnAccountChanged();
            }
        }
        dismissProgress();
    }

    public void drawView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15eef210", new Object[]{this});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, SessionList>() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/NewMultiAccountFragment$2");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public SessionList doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (SessionList) ipChange2.ipc$dispatch("eddb0b47", new Object[]{this, objArr}) : SecurityGuardManagerWraper.getSessionListFromFile();
                }

                public void onPostExecute(SessionList sessionList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e4cb11ee", new Object[]{this, sessionList});
                    } else if (NewMultiAccountFragment.this.isActivityAvaiable()) {
                        NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                        newMultiAccountFragment.mSessionList = sessionList;
                        if (sessionList != null) {
                            newMultiAccountFragment.mListAccounts = sessionList.sessionModels;
                        }
                        if (NewMultiAccountFragment.access$000(newMultiAccountFragment, sessionList)) {
                            NewMultiAccountFragment.this.gotoLoginActivity(null, true);
                            return;
                        }
                        NewMultiAccountFragment.this.initAdapter();
                        NewMultiAccountFragment.this.afterViews();
                        NewMultiAccountFragment.access$100(NewMultiAccountFragment.this);
                    }
                }
            }, new Object[0]);
        }
    }

    public String getHintInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94296a4c", new Object[]{this});
        }
        String email = Login.getEmail();
        if (TextUtils.isEmpty(email)) {
            return Login.getNick();
        }
        return email;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_multiaccount_list_layout;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return PAGE_NAME;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return "switchAccount";
    }

    public void gotoLoginActivity(SessionModel sessionModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b632ba", new Object[]{this, sessionModel, new Boolean(z)});
        } else {
            gotoLoginActivity(sessionModel, z, -1);
        }
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        NewAccountAdapter newAccountAdapter = new NewAccountAdapter(this.mAttachedActivity, this.mAccountListView, this.mListAccounts, this.loginMode);
        this.mAdapter = newAccountAdapter;
        this.mAccountListView.setAdapter((ListAdapter) newAccountAdapter);
        addDeleteListener();
        addConfirmListener();
        this.mAdapter.notifyDataSetChanged();
        String pageName = getPageName();
        UserTrackAdapter.sendUT(pageName, "OnlineAccountList", "size=" + this.mListAccounts.size(), null);
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mAccountListView = (ListView) view.findViewById(R.id.aliuser_multi_account_lv);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_multi_account_delete_manager_btn);
        this.mDeleteManagerBtn = textView;
        textView.setOnClickListener(this);
        View findViewById = view.findViewById(R.id.aliuser_custom_back);
        this.mBackBtn = findViewById;
        ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                Activity activity = NewMultiAccountFragment.this.mAttachedActivity;
                if (activity != null && (activity instanceof BaseActivity)) {
                    ((BaseActivity) activity).onClickBack(view2);
                }
            }
        });
        View findViewById2 = view.findViewById(R.id.aliuser_multi_account_add_btn);
        this.mAddAccountBtn = findViewById2;
        ViewProxy.setOnClickListener(findViewById2, this);
        TextView textView2 = (TextView) view.findViewById(R.id.aliuser_multi_account_title);
        this.mTitleTV = textView2;
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mDeleteManagerBtn, textView2);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean isActivityAvaiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ec97ffb", new Object[]{this})).booleanValue();
        }
        Activity activity = this.mAttachedActivity;
        if (activity == null || activity.isFinishing() || this.mAttachedActivity.isDestroyed() || !isAdded()) {
            return false;
        }
        return true;
    }

    public boolean isCurrentLoginUser(SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5655d0e", new Object[]{this, sessionModel})).booleanValue();
        }
        return AccountHelper.isCurrentLoginUser(sessionModel);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        if (checkBeforeDraw()) {
            drawView();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.mAttachedActivity = activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_multi_account_add_btn) {
            registerSwitchUserLoginStatus(1);
            doAddThing();
        } else if (id == R.id.aliuser_multi_account_delete_manager_btn) {
            NewAccountAdapter newAccountAdapter = this.mAdapter;
            if (newAccountAdapter != null && !newAccountAdapter.isDeleteMode()) {
                switchDeleteMode();
            } else if (this.mAdapter != null) {
                switchNormalMode();
            }
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        boolean z = this.isFromAccount;
        if (z) {
            LoginStatus.resetLoginFlag(!z);
        }
        initParams();
        loginBeforeRender();
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unregisterSwitchLoginReceiver();
        super.onDestroy();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            return;
        }
        NewAccountAdapter newAccountAdapter = this.mAdapter;
        if (newAccountAdapter == null || !newAccountAdapter.isDeleteMode()) {
            registerSwitchUserLoginStatus(2);
            doChangeThing(i);
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf3a110", new Object[]{this, adapterView, view, new Integer(i), new Long(j)})).booleanValue();
        }
        return doDeleteThing(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserTrackAdapter.updatePageName(getActivity(), getPageName(), BaseLoginFragment.getTraces());
    }

    public void registerSwitchUserLoginStatus(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70c7bc3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mSwitchLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/NewMultiAccountFragment$10");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    int i2 = AnonymousClass11.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                    if (i2 == 1) {
                        int i3 = i;
                        if (i3 == 1) {
                            UserTrackAdapter.sendUT(NewMultiAccountFragment.this.getPageName(), "AddMultiAccountsSuc");
                        } else if (i3 == 2) {
                            UserTrackAdapter.sendUT(NewMultiAccountFragment.this.getPageName(), "ChangeMultiAccountsSuc");
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.10.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (NewMultiAccountFragment.this.isActivityAvaiable()) {
                                    NewMultiAccountFragment.this.mAttachedActivity.finish();
                                }
                                if (AccountListComponent.getOnAccountChangedListener() != null) {
                                    AccountListComponent.getOnAccountChangedListener().OnAccountChanged();
                                }
                            }
                        }, 100L);
                        NewMultiAccountFragment.this.unregisterSwitchLoginReceiver();
                    } else if (i2 == 2 || i2 == 3) {
                        NewMultiAccountFragment.this.unregisterSwitchLoginReceiver();
                        if (!Login.checkSessionValid()) {
                            if (NewMultiAccountFragment.this.isActivityAvaiable()) {
                                NewMultiAccountFragment.this.mAttachedActivity.finish();
                            }
                            if (AccountListComponent.getOnAccountChangedListener() != null) {
                                AccountListComponent.getOnAccountChangedListener().OnAccountChanged();
                            }
                        }
                        if (valueOf == LoginAction.NOTIFY_LOGIN_FAILED && i == 2) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("arg2", NewMultiAccountFragment.access$600(NewMultiAccountFragment.this));
                            hashMap.put(g1v.FIELD_ARG2, NewMultiAccountFragment.access$600(NewMultiAccountFragment.this));
                            UserTrackAdapter.sendUserTrack(NewMultiAccountFragment.this.getPageName(), "ChangeMultiAccountsFail", hashMap);
                        }
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mSwitchLoginReceiver);
    }

    public void sendControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3cb986", new Object[]{this, str});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), str, "", new HashMap());
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void setVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7643c8c", new Object[]{this, view, new Integer(i)});
        } else if (view != null) {
            view.setVisibility(i);
        }
    }

    public void showBottomMenu(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e796b5", new Object[]{this, new Integer(i)});
        } else if (isActivityAvaiable() && isVisible() && this.mListAccounts.get(i) != null) {
            BottomMenuFragment bottomMenuFragment = new BottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            MenuItem menuItem = new MenuItem();
            menuItem.setText(getString(R.string.aliuser_multi_account_delete_confirm_title));
            menuItem.textColor = getResources().getColor(R.color.aliuser_text_light_gray);
            menuItem.textSize = getResources().getDimension(R.dimen.aliuser_textsize_small);
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_multi_account_delete_confirm));
            menuItem2.textColor = getResources().getColor(R.color.aliuser_edittext_bg_color_normal);
            menuItem2.textSize = getResources().getDimension(R.dimen.aliuser_textsize_normal);
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/account/NewMultiAccountFragment$9");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                        return;
                    }
                    NewMultiAccountFragment.this.sendControl("Button-Reg");
                    NewMultiAccountFragment.this.deleteUser(i);
                }
            });
            arrayList.add(menuItem);
            arrayList.add(menuItem2);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    public void switchDeleteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6271bc9", new Object[]{this});
            return;
        }
        this.mTitleTV.setText(R.string.aliuser_multi_account_delete_account_title);
        this.mDeleteManagerBtn.setText(R.string.aliuser_cancel);
        this.mAddAccountBtn.setVisibility(8);
        this.mAdapter.setDeleteMode(true);
        addDeleteListener();
        addConfirmListener();
        this.mAccountListView.setAdapter((ListAdapter) this.mAdapter);
        this.mAdapter.notifyDataSetChanged();
    }

    public void switchNormalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9baa5705", new Object[]{this});
            return;
        }
        this.mTitleTV.setText(R.string.aliuser_multi_change_account);
        this.mDeleteManagerBtn.setText(R.string.aliuser_text_manage);
        this.mAddAccountBtn.setVisibility(0);
        if (this.mAdapter == null) {
            this.mAdapter = new NewAccountAdapter(this.mAttachedActivity, this.mAccountListView, this.mListAccounts, this.loginMode);
            addDeleteListener();
            addConfirmListener();
        }
        this.mAdapter.setDeleteMode(false);
        this.mAccountListView.setAdapter((ListAdapter) this.mAdapter);
        this.mAdapter.notifyDataSetChanged();
    }

    public void toLoginWithCurrent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47397f08", new Object[]{this, new Boolean(z)});
        } else {
            gotoLoginActivity(null, z);
        }
    }

    public void unregisterSwitchLoginReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60be44f", new Object[]{this});
        } else if (this.mSwitchLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mSwitchLoginReceiver);
            this.mSwitchLoginReceiver = null;
        }
    }

    public void gotoLoginActivity(SessionModel sessionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96109789", new Object[]{this, sessionModel, new Boolean(z), new Integer(i)});
            return;
        }
        dismissProgress();
        if (this.isFromAccount) {
            LoginStatus.compareAndSetFromChangeAccount(false, true);
        }
        Bundle bundle = new Bundle();
        if (sessionModel != null) {
            LoginParam loginParam = new LoginParam();
            try {
                loginParam.hid = Long.parseLong(sessionModel.userId);
            } catch (Throwable unused) {
            }
            bundle.putString(LoginConstant.LOGINPARAM, JSON.toJSONString(loginParam));
        }
        if (i == 1) {
            bundle.putString("source", "MultiAddAccount");
        } else if (i == 2) {
            bundle.putString("source", "MultiSwitchAccount");
        } else {
            bundle.putString("source", "MultiCheckLogin");
        }
        bundle.putBoolean(LoginConstant.FORM_ADD_ACCOUNT, z);
        bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
        LoginController.getInstance().userLogin(true, true, bundle);
    }

    public void loginBeforeRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b05585", new Object[]{this});
        } else if (!Login.checkSessionValid()) {
            Bundle bundle = new Bundle();
            String hintInput = getHintInput();
            if (!TextUtils.isEmpty(hintInput)) {
                LoginParam loginParam = new LoginParam();
                loginParam.loginId = hintInput;
                bundle.putString(LoginConstant.LOGINPARAM, JSON.toJSONString(loginParam));
            }
            bundle.putString("source", "MultiCheckLogin");
            Login.login(true, bundle);
        }
    }

    public void autologinTarget(final SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e937e330", new Object[]{this, sessionModel});
            return;
        }
        boolean isInABTestRegion = CommonUtil.isInABTestRegion(LoginSwitch.NEED_KEEP_SGCOOKIE_IN_CHANGE_ACCOUNT, 0);
        if (Login.session == null) {
            Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        }
        if (isInABTestRegion) {
            Login.session.clearCookieManager(true);
        } else {
            Login.session.clearCookieManager();
        }
        AutoLoginParam autoLoginParam = new AutoLoginParam();
        autoLoginParam.token = sessionModel.autoLoginToken;
        autoLoginParam.userId = sessionModel.userId;
        autoLoginParam.site = SiteUtil.getDefaultLoginSite();
        autoLoginParam.apiRefer = ApiReferer.generateApiReferer();
        autoLoginParam.needBroadcast = true;
        autoLoginParam.source = getSource();
        autoLoginParam.isFromChangeAccount = true;
        autoLoginParam.apiRefer = "changeAccount";
        LoginController.getInstance().doAutoLoginWithCallback(autoLoginParam, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onBizFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str});
                    return;
                }
                NewMultiAccountFragment.access$400(NewMultiAccountFragment.this);
                NewMultiAccountFragment.this.gotoLoginActivity(sessionModel, false, 2);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onNetworkError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                    return;
                }
                NewMultiAccountFragment.access$500(NewMultiAccountFragment.this);
                NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                newMultiAccountFragment.toast(newMultiAccountFragment.mAttachedActivity.getString(R.string.aliuser_network_error), 0);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    NewMultiAccountFragment.access$300(NewMultiAccountFragment.this);
                }
            }
        });
    }

    public void sendControl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd4cdd0", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), str, str2, new HashMap());
        }
    }
}
