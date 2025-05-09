package com.ali.user.mobile.login.newui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewPwdLoginFragment extends NewBaseHistoryFragment implements UserLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = NewPwdLoginFragment.class.getSimpleName();
    public boolean fromOversea;
    public String mCurrentAccount;
    public String mCurrentPassword;
    public TextView mForgetPasswordTV;
    public LinearLayout mHistoryLoginLL;
    public Button mLoginBtn;
    public LinearLayout mLoginBtnLL;
    public LinearLayout mLoginLL;
    public View mPasswordClearBtn;
    public EditText mPasswordET;
    public ImageView mShowPasswordIV;
    public String mSource;
    public UserLoginPresenter mUserLoginPresenter;
    public boolean isForceNormalMode = false;
    public TextWatcher mTextWatcherPassword = null;
    public boolean mActiveLogin = false;
    public LoginParam loginParam = null;
    private boolean checkcodeUT = true;

    static {
        t2o.a(70254640);
        t2o.a(70254805);
    }

    public static /* synthetic */ boolean access$002(NewPwdLoginFragment newPwdLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fedc83", new Object[]{newPwdLoginFragment, new Boolean(z)})).booleanValue();
        }
        newPwdLoginFragment.interact = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(NewPwdLoginFragment newPwdLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c93a121a", new Object[]{newPwdLoginFragment})).booleanValue();
        }
        return newPwdLoginFragment.checkcodeUT;
    }

    public static /* synthetic */ boolean access$102(NewPwdLoginFragment newPwdLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f747d04", new Object[]{newPwdLoginFragment, new Boolean(z)})).booleanValue();
        }
        newPwdLoginFragment.checkcodeUT = z;
        return z;
    }

    public static /* synthetic */ void access$200(NewPwdLoginFragment newPwdLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20473ff", new Object[]{newPwdLoginFragment, str});
        } else {
            newPwdLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$300(NewPwdLoginFragment newPwdLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d541a8d4", new Object[]{newPwdLoginFragment});
        } else {
            newPwdLoginFragment.goAlipay();
        }
    }

    public static /* synthetic */ void access$400(NewPwdLoginFragment newPwdLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db457433", new Object[]{newPwdLoginFragment});
        } else {
            newPwdLoginFragment.pwdErrorToSMS();
        }
    }

    public static /* synthetic */ IDialogHelper access$500(NewPwdLoginFragment newPwdLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogHelper) ipChange.ipc$dispatch("3ecce3ed", new Object[]{newPwdLoginFragment});
        }
        return newPwdLoginFragment.mDialogHelper;
    }

    public static /* synthetic */ IDialogHelper access$600(NewPwdLoginFragment newPwdLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogHelper) ipChange.ipc$dispatch("97d82f6e", new Object[]{newPwdLoginFragment});
        }
        return newPwdLoginFragment.mDialogHelper;
    }

    private void initTextWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a005a6", new Object[]{this});
        } else {
            this.mTextWatcherPassword = new TextWatcher() { // from class: com.ali.user.mobile.login.newui.NewPwdLoginFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else {
                        NewPwdLoginFragment.this.beforePasspordChange();
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    NewPwdLoginFragment.access$002(NewPwdLoginFragment.this, true);
                    if (NewPwdLoginFragment.this.mPasswordClearBtn != null) {
                        if (charSequence == null || charSequence.length() == 0) {
                            if (NewPwdLoginFragment.this.mPasswordClearBtn.getVisibility() != 8) {
                                NewPwdLoginFragment.this.mPasswordClearBtn.setVisibility(8);
                            }
                        } else if (NewPwdLoginFragment.this.mPasswordClearBtn.getVisibility() != 0) {
                            NewPwdLoginFragment.this.mPasswordClearBtn.setVisibility(0);
                        }
                    }
                    NewPwdLoginFragment newPwdLoginFragment = NewPwdLoginFragment.this;
                    if (newPwdLoginFragment.mPasswordET != null) {
                        newPwdLoginFragment.checkSignInable();
                        if (charSequence != null && charSequence.length() > 0 && NewPwdLoginFragment.access$100(NewPwdLoginFragment.this)) {
                            NewPwdLoginFragment.access$102(NewPwdLoginFragment.this, false);
                            NewPwdLoginFragment.access$200(NewPwdLoginFragment.this, "password_input");
                        }
                    }
                }
            };
        }
    }

    public static /* synthetic */ Object ipc$super(NewPwdLoginFragment newPwdLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewPwdLoginFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void appendIntent(Intent intent) {
        UserLoginPresenter userLoginPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        } else if (intent != null && (userLoginPresenter = this.mUserLoginPresenter) != null && userLoginPresenter.getLoginParam() != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
    }

    public void beforePasspordChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9210c7b8", new Object[]{this});
        }
    }

    public void checkSignInable() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6ca9cb", new Object[]{this});
            return;
        }
        String charSequence = this.mTitleView.getText().toString();
        String obj = this.mPasswordET.getText().toString();
        if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(obj)) {
            z = true;
        }
        this.mLoginBtn.setEnabled(z);
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void clearPasswordInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf5829", new Object[]{this});
            return;
        }
        EditText editText = this.mPasswordET;
        if (editText != null) {
            editText.setText("");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        return this.mCurrentSelectedAccount;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_user_login_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        if (this.isHistoryMode) {
            return UTConstant.PageName.UT_PAGE_HISTORY_LOGIN;
        }
        return UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.newui.NewPwdLoginFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                switch (i) {
                    case 5001:
                        NewPwdLoginFragment.access$400(NewPwdLoginFragment.this);
                        return;
                    case 5002:
                        NewPwdLoginFragment.this.onFaceLogin(true);
                        return;
                    case 5003:
                        NewPwdLoginFragment.access$300(NewPwdLoginFragment.this);
                        return;
                    case 5004:
                    default:
                        return;
                    case CommonUICallback.ACTION_PWD_ERROR_SHOW_EYE /* 5005 */:
                        if (NewPwdLoginFragment.this.isActive()) {
                            NewPwdLoginFragment.this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            NewPwdLoginFragment.this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                            NewPwdLoginFragment newPwdLoginFragment = NewPwdLoginFragment.this;
                            newPwdLoginFragment.mShowPasswordIV.setContentDescription(newPwdLoginFragment.getString(R.string.aliuser_assist_password_show));
                            NewPwdLoginFragment.this.mShowPasswordIV.setTag(Boolean.TRUE);
                            UserTrackAdapter.sendControlUT(NewPwdLoginFragment.this.getPageName(), "Button-ShowPwd");
                            return;
                        }
                        return;
                }
            }
        };
    }

    public void initParams() {
        AppLaunchInfoResponseData appLaunchInfoResponseData;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.loginParam = null;
        if (arguments != null) {
            this.mPreviousChecked = arguments.getBoolean("check");
            String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
            if (!TextUtils.isEmpty(str)) {
                LoginParam loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                this.loginParam = loginParam;
                if (loginParam != null) {
                    this.mSource = loginParam.source;
                }
            }
            this.isForceNormalMode = arguments.getBoolean(LoginConstant.FORCE_NORMAL_MODE);
            this.mCurrentAccount = arguments.getString(LoginConstant.ACCOUNT);
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (!(userLoginActivity == null || (appLaunchInfoResponseData = userLoginActivity.fireAppLaunchRes) == null || (t = appLaunchInfoResponseData.returnValue) == 0 || !((AppLaunchInfo) t).fromOversea)) {
                this.fromOversea = true;
            }
        }
        this.mUserLoginPresenter = new UserLoginPresenter(this, this.loginParam);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        ((BaseActivity) getActivity()).setNavigationBackIcon();
        initTextWatcher();
        this.mLoginLL = (LinearLayout) view.findViewById(R.id.aliuser_user_login_ll);
        this.mHistoryLoginLL = (LinearLayout) view.findViewById(R.id.aliuser_login_history_ll);
        EditText editText = (EditText) view.findViewById(R.id.aliuser_login_password_et);
        this.mPasswordET = editText;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.mPasswordET.addTextChangedListener(this.mTextWatcherPassword);
            this.mPasswordET.setTypeface(Typeface.SANS_SERIF);
            this.mPasswordET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewPwdLoginFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    EditText editText2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (NewPwdLoginFragment.this.getContext() != null && NewPwdLoginFragment.this.isActive() && (editText2 = NewPwdLoginFragment.this.mPasswordET) != null) {
                        editText2.requestFocus();
                        NewPwdLoginFragment.this.mPasswordET.requestFocusFromTouch();
                        InputMethodManager inputMethodManager = (InputMethodManager) NewPwdLoginFragment.this.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(NewPwdLoginFragment.this.mPasswordET, 1);
                        }
                    }
                }
            }, 300L);
        }
        this.mPasswordClearBtn = view.findViewById(R.id.aliuser_login_password_clear_iv);
        Button button = (Button) view.findViewById(R.id.aliuser_login_login_btn);
        this.mLoginBtn = button;
        if (button != null) {
            button.setEnabled(false);
            if (CommonUtil.autoCheckbox()) {
                this.mLoginBtn.setText(getResources().getString(R.string.aliuser_sign_in_title_auto));
            }
        }
        this.mForgetPasswordTV = (TextView) view.findViewById(R.id.aliuser_login_forgot_password_tv);
        this.mShowPasswordIV = (ImageView) view.findViewById(R.id.aliuser_login_show_password_btn);
        this.mLoginBtnLL = (LinearLayout) view.findViewById(R.id.aliuser_login_login_btn_ll);
        ImageView imageView = this.mShowPasswordIV;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        setOnClickListener(this.mLoginBtn, this.mForgetPasswordTV, this.mPasswordClearBtn);
        this.mUserLoginPresenter.onStart();
        showPushLogoutAlertIfHas();
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mLoginBtn, this.mForgetPasswordTV, this.mPasswordET);
        }
        showBottomAlipay(view);
        showQrLogin(view);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return this.isHistoryMode;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("resumeToOnekey" + getPageName(), 10000);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.mUserLoginPresenter.onActivityResult(i, i2, intent);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        int id = view.getId();
        if (id == R.id.aliuser_login_login_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else if (id == R.id.aliuser_login_forgot_password_tv) {
            addControl("Button-ForgetPwd");
            onForgetPasswordAction();
        } else if (id == R.id.aliuser_login_password_clear_iv) {
            this.mPasswordET.getEditableText().clear();
        } else if (id == R.id.aliuser_login_show_password_btn) {
            int selectionEnd = this.mPasswordET.getSelectionEnd();
            if (view.getTag() == null || !((Boolean) view.getTag()).booleanValue()) {
                this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                this.mShowPasswordIV.setContentDescription(getString(R.string.aliuser_assist_password_show));
                view.setTag(Boolean.TRUE);
                addControl("Button-ShowPwd");
            } else {
                this.mPasswordET.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility_off);
                this.mShowPasswordIV.setContentDescription(getString(R.string.aliuser_assist_password_hide));
                view.setTag(Boolean.FALSE);
                addControl("Button-HidePwd");
            }
            if (selectionEnd > 0) {
                this.mPasswordET.setSelection(selectionEnd);
            }
            this.mPasswordET.postInvalidate();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initParams();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null) {
            userLoginPresenter.onDestory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        EditText editText = this.mPasswordET;
        if (editText != null) {
            editText.removeTextChangedListener(this.mTextWatcherPassword);
        }
        super.onDestroyView();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onForgetPasswordAction() {
        String str;
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf966a84", new Object[]{this});
            return;
        }
        String accountName = getAccountName();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter == null || userLoginPresenter.getLoginParam() == null) {
            str = "";
        } else {
            str = this.mUserLoginPresenter.mLoginParam.source;
        }
        if (!this.isHistoryMode || (historyAccount = this.mUserLoginActivity.mHistoryAccount) == null) {
            this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, str);
        } else if (historyAccount.alipayHid != 0) {
            alert("", this.mAttachedActivity.getResources().getString(R.string.aliuser_alipay_findpwd), this.mAttachedActivity.getResources().getString(R.string.aliuser_confirm), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewPwdLoginFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (NewPwdLoginFragment.access$500(NewPwdLoginFragment.this) != null) {
                        NewPwdLoginFragment.access$600(NewPwdLoginFragment.this).dismissAlertDialog();
                    }
                }
            }, null, null);
        } else if (TextUtils.isEmpty(historyAccount.tokenKey) || getLoginSite() != 0) {
            this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, str);
        } else {
            this.mUserLoginPresenter.fetchUrlAndToWebViewWithUserId(this.mAttachedActivity, accountName, this.mUserLoginActivity.mHistoryAccount.userId, str);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.UserLoginView
    public void onPwdError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5f51", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void showErrorMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6369e460", new Object[]{this, new Integer(i)});
        } else {
            toast(getString(i), 0);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void showFindPasswordAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8313525e", new Object[]{this, loginParam, rpcResponse});
        } else {
            showFindPasswordAlert(loginParam, rpcResponse, this.mUserLoginPresenter, this.mPasswordET, this.mShowPasswordIV);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment
    public void switchToSmsLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab34886", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (!(userLoginPresenter == null || userLoginPresenter.getLoginParam() == null)) {
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
        }
        switchToSmsLogin(loginParam);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809ca427", new Object[]{this});
            return;
        }
        LoginFrom.setCurrentLoginFrom("4");
        this.mActiveLogin = true;
        this.mCurrentAccount = getAccountName();
        this.mCurrentPassword = this.mPasswordET.getText().toString().trim();
        if (TextUtils.isEmpty(this.mCurrentAccount)) {
            showErrorMessage(R.string.aliuser_sign_in_account_hint);
        } else if (TextUtils.isEmpty(this.mCurrentPassword)) {
            showErrorMessage(R.string.aliuser_sign_in_please_enter_password);
        } else {
            IDialogHelper iDialogHelper = this.mDialogHelper;
            if (iDialogHelper != null) {
                iDialogHelper.hideInputMethod();
            }
            this.mUserLoginPresenter.buildLoginParam(this.mCurrentAccount, this.mCurrentPassword);
            this.mUserLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.PWD_LOGIN, getPageName());
            this.mUserLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.PWD_LOGIN;
            this.mUserLoginPresenter.getLoginParam().utPageName = getPageName();
            this.mUserLoginPresenter.getLoginParam().hid = this.historyHid;
            if (this.mUserLoginActivity != null) {
                this.mUserLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mUserLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.PWD_LOGIN, hashMap);
            UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
            userLoginPresenter.login(this.mAttachedActivity, userLoginPresenter.getLoginParam(), getUICallback());
        }
    }
}
