package com.ali.user.mobile.login.newui;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.BottomMethodFragment;
import com.ali.user.mobile.ui.widget.LoginMethodItem;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ScreenUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class NewBaseLoginFragment extends BaseLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254616);
    }

    public static /* synthetic */ void access$000(NewBaseLoginFragment newBaseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e47795", new Object[]{newBaseLoginFragment});
        } else {
            newBaseLoginFragment.openHelp();
        }
    }

    public static /* synthetic */ void access$100(NewBaseLoginFragment newBaseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416da860", new Object[]{newBaseLoginFragment, str});
        } else {
            newBaseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1000(NewBaseLoginFragment newBaseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f641c4e", new Object[]{newBaseLoginFragment, str});
        } else {
            newBaseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(NewBaseLoginFragment newBaseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35cfb897", new Object[]{newBaseLoginFragment});
        } else {
            newBaseLoginFragment.openFindAccountPage();
        }
    }

    public static /* synthetic */ void access$300(NewBaseLoginFragment newBaseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbf6ce2", new Object[]{newBaseLoginFragment, str});
        } else {
            newBaseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$400(NewBaseLoginFragment newBaseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabaf999", new Object[]{newBaseLoginFragment});
        } else {
            newBaseLoginFragment.switchAccount();
        }
    }

    public static /* synthetic */ void access$500(NewBaseLoginFragment newBaseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65309a1a", new Object[]{newBaseLoginFragment});
        } else {
            newBaseLoginFragment.openHelp();
        }
    }

    public static /* synthetic */ void access$600(NewBaseLoginFragment newBaseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653a13a5", new Object[]{newBaseLoginFragment, str});
        } else {
            newBaseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ String access$700(NewBaseLoginFragment newBaseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4e43504", new Object[]{newBaseLoginFragment});
        }
        return newBaseLoginFragment.mSource;
    }

    public static /* synthetic */ BaseActivity access$800(NewBaseLoginFragment newBaseLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseActivity) ipChange.ipc$dispatch("c046cc03", new Object[]{newBaseLoginFragment});
        }
        return newBaseLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$900(NewBaseLoginFragment newBaseLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab4ba68", new Object[]{newBaseLoginFragment, str});
        } else {
            newBaseLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(NewBaseLoginFragment newBaseLoginFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        } else if (hashCode == 382958558) {
            super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment");
        }
    }

    public void addFingeritem(BottomMethodFragment bottomMethodFragment, List<LoginMethodItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee63ee90", new Object[]{this, bottomMethodFragment, list});
        } else if (this.fingerLoginEnable && !(this instanceof NewFingerLoginFragment)) {
            LoginMethodItem create = LoginModeState.create(this, LoginModeState.BIOMETRIC);
            create.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$6");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseLoginFragment.this.isActive()) {
                        NewBaseLoginFragment.access$900(NewBaseLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FINGER);
                        NewBaseLoginFragment.this.addCheckAction(LoginClickAction.ACTION_FINGER);
                    }
                }
            });
            list.add(create);
        }
    }

    public void addOnekeyHistory(BottomMethodFragment bottomMethodFragment, List<LoginMethodItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea76890d", new Object[]{this, bottomMethodFragment, list});
        } else if (this.onekeyHistoryEnable) {
            LoginMethodItem create = LoginModeState.create(this, LoginModeState.SIM_LOGIN);
            create.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$7");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                    } else if (NewBaseLoginFragment.this.isActive()) {
                        NewBaseLoginFragment.access$1000(NewBaseLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SIM);
                        NewBaseLoginFragment newBaseLoginFragment = NewBaseLoginFragment.this;
                        UserLoginActivity userLoginActivity = newBaseLoginFragment.mUserLoginActivity;
                        if (userLoginActivity != null && userLoginActivity.mHistoryAccount != null) {
                            newBaseLoginFragment.addCheckAction(LoginClickAction.ACTION_ONEKEY_HISTORY);
                        }
                    }
                }
            });
            list.add(create);
        }
    }

    public void addReg(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8236388", new Object[]{this, bottomMenuFragment, list});
            return;
        }
        MenuItem menuItem = new MenuItem();
        menuItem.setText(getString(R.string.aliuser_reg));
        menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$5");
            }

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                } else if (NewBaseLoginFragment.this.isActive()) {
                    NewBaseLoginFragment.access$600(NewBaseLoginFragment.this, "Button-Reg");
                    RegistParam registParam = new RegistParam();
                    registParam.registSite = NewBaseLoginFragment.this.getLoginSite();
                    registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
                    registParam.source = NewBaseLoginFragment.access$700(NewBaseLoginFragment.this);
                    try {
                        UserLoginActivity userLoginActivity = NewBaseLoginFragment.this.mUserLoginActivity;
                        if (!(userLoginActivity == null || userLoginActivity.fireAppLaunchRes == null)) {
                            HashMap hashMap = new HashMap();
                            registParam.externParams = hashMap;
                            hashMap.put(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(NewBaseLoginFragment.this.mUserLoginActivity.fireAppLaunchRes));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(NewBaseLoginFragment.access$800(NewBaseLoginFragment.this), registParam);
                }
            }
        });
        list.add(menuItem);
    }

    public BottomMethodFragment getBottomMethodFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomMethodFragment) ipChange.ipc$dispatch("fd18ea78", new Object[]{this});
        }
        return new BottomMethodFragment();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_switch_recommend_login);
        try {
            updateLogo((TUrlImageView) view.findViewById(R.id.aliuser_taobao_logo));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        setOnClickListener(textView);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        if (view.getId() == R.id.aliuser_switch_recommend_login) {
            hideInputMethod(view);
            switchAccount();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        try {
            android.view.MenuItem findItem = menu.findItem(R.id.aliuser_menu_item_help);
            SpannableString spannableString = new SpannableString(getResources().getString(R.string.aliuser_menu_help));
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_showloginId_text_color)), 0, spannableString.length(), 0);
            findItem.setTitle(spannableString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            android.view.MenuItem findItem2 = menu.findItem(R.id.aliuser_menu_item_more);
            SpannableString spannableString2 = new SpannableString(getResources().getString(R.string.aliuser_more));
            spannableString2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_showloginId_text_color)), 0, spannableString2.length(), 0);
            findItem2.setTitle(spannableString2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onFaceLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5090d360", new Object[]{this, new Boolean(z)});
        } else if (ServiceFactory.getService(FaceService.class) != null) {
            LoginParam loginParam = new LoginParam();
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            HistoryAccount historyAccount = userLoginActivity.mHistoryAccount;
            loginParam.hid = historyAccount.userId;
            loginParam.deviceTokenKey = historyAccount.tokenKey;
            if (userLoginActivity != null) {
                loginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
            }
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            if (this.mFaceLoginPresenter == null) {
                return;
            }
            if (!z || !LoginSwitch.getSwitch("activateFace", "false")) {
                this.mFaceLoginPresenter.fetchScanToken(loginParam);
            } else {
                this.mFaceLoginPresenter.activeFaceLogin(loginParam);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        int i = R.id.aliuser_menu_item_help;
        if (menu.findItem(i) != null) {
            int i2 = R.id.aliuser_menu_item_more;
            if (menu.findItem(i2) == null) {
                return;
            }
            if (showMore()) {
                menu.findItem(i).setVisible(false);
                menu.findItem(i2).setVisible(true);
                return;
            }
            menu.findItem(i2).setVisible(false);
            menu.findItem(i).setVisible(true);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else if (isActive() && isVisible()) {
            BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            MenuItem menuItem = new MenuItem();
            menuItem.setText(getString(R.string.aliuser_other_account_login));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$3");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (NewBaseLoginFragment.this.isActive()) {
                        NewBaseLoginFragment.access$300(NewBaseLoginFragment.this, "Button-ChooseOtherAccountLogin");
                        NewBaseLoginFragment.access$400(NewBaseLoginFragment.this);
                    }
                }
            });
            addReg(bottomMenuFragment, arrayList);
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_menu_help));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$4");
                }

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (NewBaseLoginFragment.this.isActive()) {
                        NewBaseLoginFragment.access$500(NewBaseLoginFragment.this);
                    }
                }
            });
            arrayList.add(menuItem2);
            addMoreMenus(bottomMenuFragment, arrayList);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void showBottomMenuForFirstPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e264b44", new Object[]{this});
            return;
        }
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        ArrayList arrayList = new ArrayList();
        addReg(bottomMenuFragment, arrayList);
        MenuItem menuItem = new MenuItem();
        menuItem.setText(getString(R.string.aliuser_menu_help));
        menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$1");
            }

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                } else if (NewBaseLoginFragment.this.isActive()) {
                    NewBaseLoginFragment.access$000(NewBaseLoginFragment.this);
                }
            }
        });
        MenuItem menuItem2 = new MenuItem();
        menuItem2.setText(getFindAccountText());
        menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.newui.NewBaseLoginFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewBaseLoginFragment$2");
            }

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    return;
                }
                NewBaseLoginFragment.access$100(NewBaseLoginFragment.this, "findnick");
                if (NewBaseLoginFragment.this.isActive()) {
                    NewBaseLoginFragment.access$200(NewBaseLoginFragment.this);
                }
            }
        });
        arrayList.add(menuItem);
        arrayList.add(menuItem2);
        addMoreMenus(bottomMenuFragment, arrayList);
        bottomMenuFragment.setMenuItems(arrayList);
        bottomMenuFragment.setMenuTitle(getString(R.string.aliuser_login_more_func));
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    public boolean showMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c018ff7d", new Object[]{this})).booleanValue();
        }
        return this.isHistoryMode;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void updateAvatar(String str) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eeb3893", new Object[]{this, str});
            return;
        }
        try {
            if (this.mFragmentView != null && !TextUtils.isEmpty(str) && (tUrlImageView = (TUrlImageView) this.mFragmentView.findViewById(R.id.aliuser_login_avatar)) != null) {
                tUrlImageView.setVisibility(0);
                int dip2px = ScreenUtil.dip2px(getActivity(), 40.0f);
                tUrlImageView.setImageUrl(str, new PhenixOptions().bitmapProcessors(new RoundedCornersBitmapProcessor(dip2px, dip2px, ScreenUtil.dip2px(getActivity(), 6.0f), 0)));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
