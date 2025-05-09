package com.ali.user.mobile.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.utils.NavUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BaseFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern REG_EMAIL = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
    public AliUserDialog mAliUserQuitDialog;
    public BaseActivity mAttachedActivity;
    public IDialogHelper mDialogHelper;
    public View mFragmentView;
    public Activity mHostActivity;
    public boolean needHandleBack;
    public boolean isConfigureChanged = false;
    public int mCurrentScreenOrientation = 1;
    public boolean needAdaptElder = true;

    static {
        t2o.a(69206088);
    }

    public static /* synthetic */ Object ipc$super(BaseFragment baseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/base/ui/BaseFragment");
        }
    }

    public void addControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a730d", new Object[]{this, str});
        } else {
            UserTrackAdapter.control(getPageName(), str);
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper != null) {
            iDialogHelper.alert(this.mHostActivity, str, str2, str3, onClickListener, str4, onClickListener2);
        }
    }

    public void alertList(String[] strArr, DialogInterface.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c07305", new Object[]{this, strArr, onClickListener, new Boolean(z)});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper != null) {
            iDialogHelper.alertList(strArr, onClickListener, z);
        }
    }

    public void backHomepage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0fe3fc", new Object[]{this});
        } else if (isActivityAvaiable()) {
            finishLoginActivity();
            NavUtil.navToHomePage();
        }
    }

    public ValueAnimator createAnimator(final View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("30ce614c", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ali.user.mobile.base.ui.BaseFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = intValue;
                view.setLayoutParams(layoutParams);
            }
        });
        return ofInt;
    }

    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper != null) {
            iDialogHelper.dismissAlertDialog();
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (getActivity() != null && !getActivity().isFinishing()) {
            dismissProgress();
        }
    }

    public void dismissProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8efde", new Object[]{this});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper != null) {
            iDialogHelper.dismissProgressDialog();
        }
    }

    public void finishLoginActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98cd1cc", new Object[]{this});
        } else if (isActivityAvaiable()) {
            getActivity().finish();
        }
    }

    public AppCompatActivity getAppCompatActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("6bf44950", new Object[]{this});
        }
        return this.mAttachedActivity;
    }

    public Activity getBaseActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("57c5e1cb", new Object[]{this});
        }
        return this.mAttachedActivity;
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return -1;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "";
    }

    public ActionBar getSupportActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("e9bb2ffd", new Object[]{this});
        }
        return getAppCompatActivity().getSupportActionBar();
    }

    public void hideInputMethod(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a96f022", new Object[]{this, view});
        } else if (view != null) {
            view.postDelayed(new Runnable() { // from class: com.ali.user.mobile.base.ui.BaseFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        IDialogHelper iDialogHelper = BaseFragment.this.mDialogHelper;
                        if (iDialogHelper != null) {
                            iDialogHelper.hideInputMethod();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, 100L);
        }
    }

    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
        }
    }

    public boolean isActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return isActivityAvaiable();
    }

    public boolean isActivityAvaiable() {
        BaseActivity baseActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ec97ffb", new Object[]{this})).booleanValue();
        }
        if (getActivity() == null || (baseActivity = this.mAttachedActivity) == null || baseActivity.isFinishing() || this.mAttachedActivity.isDestroyed() || !isAdded()) {
            return false;
        }
        return true;
    }

    public boolean isChineseLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a92e3e6", new Object[]{this})).booleanValue();
        }
        if (this.mAttachedActivity == null) {
            return true;
        }
        return BaseActivity.isChinese;
    }

    public boolean isEmailValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e943899f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !REG_EMAIL.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BaseActivity) {
            this.mAttachedActivity = (BaseActivity) activity;
        }
        this.mHostActivity = activity;
        LoginApprearanceExtensions loginApprearanceExtensions = AliUserLogin.mAppreanceExtentions;
        if (loginApprearanceExtensions != null && loginApprearanceExtensions.getDialogHelper() != null) {
            try {
                this.mDialogHelper = (IDialogHelper) AliUserLogin.mAppreanceExtentions.getDialogHelper().newInstance();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.mCurrentScreenOrientation = i;
        onScreenRotate(i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(getLayoutContent(), (ViewGroup) null);
        this.mFragmentView = inflate;
        initViews(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (this.isConfigureChanged && !z) {
            onScreenRotate(this.mCurrentScreenOrientation);
            this.isConfigureChanged = false;
        }
    }

    public void onScreenRotate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfd3ab6", new Object[]{this, new Integer(i)});
        }
    }

    public void setVisibility(View view, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7647c5d", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (!z) {
            i = 8;
        }
        setVisibility(view, i);
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    public void showProgress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f3b5b", new Object[]{this, str});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper != null) {
            iDialogHelper.showProgressDialog(this.mHostActivity, str, true);
        }
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else if (this.mDialogHelper != null && isActivityAvaiable()) {
            this.mDialogHelper.toast(getActivity(), str, i);
        }
    }

    public void uiShown(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa789ae", new Object[]{this, str});
        } else {
            UserTrackAdapter.UIShown(getPageName(), str);
        }
    }

    public void viewGoneAnimate(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18381aee", new Object[]{this, view});
            return;
        }
        ValueAnimator createAnimator = createAnimator(view, view.getHeight(), 0);
        createAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.ali.user.mobile.base.ui.BaseFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/base/ui/BaseFragment$2");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    view.setVisibility(8);
                }
            }
        });
        createAnimator.start();
    }

    public void viewVisibleAnimate(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2ab8c", new Object[]{this, view, new Integer(i)});
            return;
        }
        view.setVisibility(0);
        createAnimator(view, 0, ScreenUtil.dip2px(getContext(), i)).start();
    }

    public void addControl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efab4cd8", new Object[]{this, str, map});
        } else {
            UserTrackAdapter.control(getPageName(), str, map);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (LoginSwitch.getSwitch("flag_secure", "true") && getActivity() != null && !Debuggable.isDebug() && DataProviderFactory.getDataProvider().getEnvType() == LoginEnvType.ONLINE.getSdkEnvType()) {
            getActivity().getWindow().addFlags(8192);
        }
    }

    public void setVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7643c8c", new Object[]{this, view, new Integer(i)});
        } else if (view != null) {
            view.setVisibility(i);
        }
    }

    public void updateLogo(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ac1401", new Object[]{this, tUrlImageView});
            return;
        }
        String config = LoginSwitch.getConfig("taobaoLogo", "");
        if (!TextUtils.isEmpty(config) && tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
            try {
                tUrlImageView.setImageUrl(config);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        addControl("close");
        Log.e(RPCDataItems.SWITCH_TAG_LOG, "freq " + LoginStatus.openFrequentCount);
        int i = LoginSwitch.getSwitch("openFrequentCount", 4);
        if (!this.needHandleBack || !isChineseLanguage() || i <= 0 || LoginStatus.openFrequentCount <= i) {
            return false;
        }
        UserTrackAdapter.sendUT("hitBackHome");
        LoginStatus.openFrequentCount = 0;
        this.mAliUserQuitDialog = AliUserDialog.Builder(getActivity()).setTitle(getString(R.string.aliuser_back_title)).setOnNegativeClickListener(getString(R.string.aliuser_back_home), new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.base.ui.BaseFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = BaseFragment.this.mAliUserQuitDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                BaseFragment.this.addControl("backHome");
                if (BaseFragment.this.isActive() && BaseFragment.this.getActivity() != null) {
                    BaseFragment.this.backHomepage();
                }
            }
        }).setOnPositiveClickListener(getString(R.string.aliuser_back_last), new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.base.ui.BaseFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = BaseFragment.this.mAliUserQuitDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                BaseFragment.this.addControl("backLastPage");
                BaseFragment.this.finishLoginActivity();
            }
        }).build().shown();
        return true;
    }
}
