package com.ali.user.mobile.login.newui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.ui.widget.BottomMethodFragment;
import com.ali.user.mobile.ui.widget.LoginMethodItem;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class NewBaseHistoryFragment extends NewBaseLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mCurrentSelectedAccount;
    public TextView mTitleView;
    public boolean pwdLoginEnable = false;
    public boolean smsLoginEnable = false;
    public boolean faceLoginEnable = false;

    static {
        t2o.a(70254608);
    }

    public static /* synthetic */ boolean access$002(NewBaseHistoryFragment newBaseHistoryFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c117634c", new Object[]{newBaseHistoryFragment, new Boolean(z)})).booleanValue();
        }
        newBaseHistoryFragment.interact = z;
        return z;
    }

    public static /* synthetic */ void access$100(NewBaseHistoryFragment newBaseHistoryFragment, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988852a7", new Object[]{newBaseHistoryFragment, view});
        } else {
            newBaseHistoryFragment.hideInputMethod(view);
        }
    }

    public static /* synthetic */ boolean access$202(NewBaseHistoryFragment newBaseHistoryFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdd96b0a", new Object[]{newBaseHistoryFragment, new Boolean(z)})).booleanValue();
        }
        newBaseHistoryFragment.interact = z;
        return z;
    }

    public static /* synthetic */ void access$300(NewBaseHistoryFragment newBaseHistoryFragment, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eb26e5", new Object[]{newBaseHistoryFragment, view});
        } else {
            newBaseHistoryFragment.hideInputMethod(view);
        }
    }

    public static /* synthetic */ void access$400(NewBaseHistoryFragment newBaseHistoryFragment, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2d3d2d", new Object[]{newBaseHistoryFragment, str, map});
        } else {
            newBaseHistoryFragment.addControl(str, map);
        }
    }

    public static /* synthetic */ void access$500(NewBaseHistoryFragment newBaseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20bd959", new Object[]{newBaseHistoryFragment, str});
        } else {
            newBaseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$600(NewBaseHistoryFragment newBaseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2852f5a", new Object[]{newBaseHistoryFragment, str});
        } else {
            newBaseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$700(NewBaseHistoryFragment newBaseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fe855b", new Object[]{newBaseHistoryFragment, str});
        } else {
            newBaseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$800(NewBaseHistoryFragment newBaseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a377db5c", new Object[]{newBaseHistoryFragment, str});
        } else {
            newBaseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$900(NewBaseHistoryFragment newBaseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f1315d", new Object[]{newBaseHistoryFragment, str});
        } else {
            newBaseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(NewBaseHistoryFragment newBaseHistoryFragment, String str, Object... objArr) {
        if (str.hashCode() == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseHistoryFragment");
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public void addFingeritem(BottomMethodFragment bottomMethodFragment, List<LoginMethodItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee63ee90", new Object[]{this, bottomMethodFragment, list});
        } else if (this.fingerLoginEnable && !(this instanceof NewFingerLoginFragment)) {
            LoginMethodItem create = LoginModeState.create(this, LoginModeState.BIOMETRIC);
            create.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create) { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseHistoryFragment$7");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseHistoryFragment.this.isActive()) {
                        NewBaseHistoryFragment.access$900(NewBaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FINGER);
                        NewBaseHistoryFragment.this.addCheckAction(LoginClickAction.ACTION_FINGER);
                    }
                }
            });
            list.add(create);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public void addOnekeyHistory(BottomMethodFragment bottomMethodFragment, List<LoginMethodItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea76890d", new Object[]{this, bottomMethodFragment, list});
        } else if (this.onekeyHistoryEnable) {
            LoginMethodItem create = LoginModeState.create(this, LoginModeState.SIM_LOGIN);
            create.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create) { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseHistoryFragment$6");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseHistoryFragment.this.isActive()) {
                        NewBaseHistoryFragment.access$800(NewBaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SIM);
                        NewBaseHistoryFragment newBaseHistoryFragment = NewBaseHistoryFragment.this;
                        UserLoginActivity userLoginActivity = newBaseHistoryFragment.mUserLoginActivity;
                        if (userLoginActivity != null && userLoginActivity.mHistoryAccount != null) {
                            newBaseHistoryFragment.addCheckAction(LoginClickAction.ACTION_ONEKEY_HISTORY);
                        }
                    }
                }
            });
            list.add(create);
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void commonAddCheck(int i, int i2, CheckBox checkBox, CheckBox checkBox2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d336cb9", new Object[]{this, new Integer(i), new Integer(i2), checkBox, checkBox2});
        } else if (checkBox == null || checkBox.isChecked()) {
            doRealAction(i);
        } else if (isActive()) {
            if (isFromOversea() || !LoginClickAction.canShowAutoCheckbox(i)) {
                popProtocol(i, checkBox, needAutoReg(), this.mProtocolTitle, this.mProtocolUrl);
                return;
            }
            checkBox.setChecked(true);
            addControl("checkAgreement_auto");
            doRealAction(i);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public BottomMethodFragment getBottomMethodFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomMethodFragment) ipChange.ipc$dispatch("fd18ea78", new Object[]{this});
        }
        return new BottomMethodFragment();
    }

    public List<LoginMethodItem> getMethodItems(BottomMethodFragment bottomMethodFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bcd69c", new Object[]{this, bottomMethodFragment});
        }
        ArrayList arrayList = new ArrayList();
        if (this.onekeyHistoryEnable && !(this instanceof NewOneKeyHistoryFragment)) {
            addOnekeyHistory(bottomMethodFragment, arrayList);
        }
        if (this.smsLoginEnable && !(this instanceof NewMobileHistoryFragment)) {
            LoginMethodItem create = LoginModeState.create(this, LoginModeState.SMS_LOGIN);
            create.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create) { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseHistoryFragment$3");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseHistoryFragment.this.isActive()) {
                        NewBaseHistoryFragment.access$500(NewBaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SMS);
                        NewBaseHistoryFragment.this.switchToSmsLogin();
                    }
                }
            });
            arrayList.add(create);
        }
        if (this.pwdLoginEnable && !(this instanceof NewPwdLoginFragment)) {
            LoginMethodItem create2 = LoginModeState.create(this, LoginModeState.PASSWORD);
            create2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create2) { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseHistoryFragment$4");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseHistoryFragment.this.isActive()) {
                        NewBaseHistoryFragment.access$600(NewBaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OHTER_PWD);
                        NewBaseHistoryFragment.this.switchToPwdLogin();
                    }
                }
            });
            arrayList.add(create2);
        }
        if (this.faceLoginEnable && !(this instanceof NewFingerLoginFragment) && !(this instanceof NewFaceLoginFragment)) {
            LoginMethodItem create3 = LoginModeState.create(this, LoginModeState.SCAN_FACE);
            create3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create3) { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseHistoryFragment$5");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseHistoryFragment.this.isActive()) {
                        NewBaseHistoryFragment.access$700(NewBaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FACE);
                        NewBaseHistoryFragment.this.addCheckAction(LoginClickAction.ACTION_FACE);
                    }
                }
            });
            arrayList.add(create3);
        }
        addFingeritem(bottomMethodFragment, arrayList);
        return arrayList;
    }

    public void handleClickMore(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57925596", new Object[]{this, view});
        } else if (view != null) {
            final View findViewById = view.findViewById(R.id.aliuser_other_divider);
            TextView textView = (TextView) view.findViewById(R.id.aliuser_other_tv);
            if (findViewById != null && textView != null) {
                List<LoginMethodItem> methodItems = getMethodItems(null);
                if (methodItems == null || methodItems.size() == 0) {
                    findViewById.setVisibility(8);
                } else if (methodItems.size() == 1) {
                    findViewById.setVisibility(0);
                    final LoginMethodItem loginMethodItem = methodItems.get(0);
                    textView.setText(loginMethodItem.getText());
                    ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                                return;
                            }
                            NewBaseHistoryFragment.access$002(NewBaseHistoryFragment.this, true);
                            NewBaseHistoryFragment.access$100(NewBaseHistoryFragment.this, findViewById);
                            loginMethodItem.getMenuItemOnClickListener().onClick(view2);
                        }
                    });
                } else {
                    findViewById.setVisibility(0);
                    ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewBaseHistoryFragment.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                                return;
                            }
                            NewBaseHistoryFragment.access$202(NewBaseHistoryFragment.this, true);
                            NewBaseHistoryFragment.access$300(NewBaseHistoryFragment.this, findViewById);
                            NewBaseHistoryFragment newBaseHistoryFragment = NewBaseHistoryFragment.this;
                            NewBaseHistoryFragment.access$400(newBaseHistoryFragment, UTConstans.Controls.UT_CHOOSE_OTHER, newBaseHistoryFragment.getOnekeyEnableMap());
                            NewBaseHistoryFragment.this.showBottomMore();
                        }
                    });
                }
            }
        }
    }

    public void initMode() {
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621aedda", new Object[]{this});
            return;
        }
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (!userLoginActivity.hadReadHistory || (historyAccount = userLoginActivity.mHistoryAccount) == null) {
            this.isHistoryMode = false;
            this.historyHid = 0L;
            switchAccount();
            return;
        }
        this.isHistoryMode = true;
        switchToHistoryMode(historyAccount);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mTitleView = (TextView) view.findViewById(R.id.aliuser_login_account_tv);
        initMode();
        generateProtocol(this.mProtocolTitle, this.mProtocolUrl, false);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mTitleView);
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setTextSize(2, 18.0f);
        }
        handleClickMore(view);
    }

    public void showBottomMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439cd904", new Object[]{this});
            return;
        }
        BottomMethodFragment bottomMethodFragment = getBottomMethodFragment();
        bottomMethodFragment.setMenuTitle(getResources().getString(R.string.aliuser_change_login_method));
        bottomMethodFragment.setMethods(getMethodItems(bottomMethodFragment));
        bottomMethodFragment.show(getFragmentManager(), getPageName());
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public boolean showXianyuSeperate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cab88ba9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        } else if (isActivityAvaiable() && historyAccount != null) {
            this.historyHid = historyAccount.userId;
            String str = historyAccount.userInputName;
            this.mCurrentSelectedAccount = str;
            String dataMasking = StringUtil.dataMasking(str, true);
            if (this.mTitleView != null && !TextUtils.isEmpty(dataMasking)) {
                this.mTitleView.setText(dataMasking);
            }
            updateAvatar(historyAccount.headImg);
            if (historyAccount.hasPwd == 1) {
                this.pwdLoginEnable = true;
            }
            if (DataProviderFactory.getDataProvider().supportFaceLogin()) {
                UserLoginActivity userLoginActivity = this.mUserLoginActivity;
                if (userLoginActivity.isFaceLoginEnvEnable || userLoginActivity.isFaceLoginActivate) {
                    this.faceLoginEnable = true;
                }
            }
            this.smsLoginEnable = checkSMSLoginEnable(historyAccount);
            this.fingerLoginEnable = isFingerEnable(historyAccount);
            this.onekeyHistoryEnable = isHistoryOnekeyEnable(historyAccount);
        }
    }

    public void switchToPwdLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343fb322", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        this.mUserLoginActivity.gotoPwdLoginFragment(intent);
    }

    public void switchToSmsLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab34886", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        this.mUserLoginActivity.gotoMobileLoginFragment(intent);
    }
}
