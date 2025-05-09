package com.taobao.login4android.ui.oversea;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.ali.user.mobile.login.newui.NewRegFragment;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.rmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OverseaRegisterFragment extends NewRegFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipay;
    public TextView mAlipayHK;
    public View mAlipayHKLL;
    public View mAlipayLL;
    public View mBackBtn;
    public TextView mFacebook;
    public LinearLayout mFbLL;
    public LinearLayout mGgLL;
    public TextView mGoogle;
    public View mHelpTV;
    public TextView mLine;
    public LinearLayout mLineLL;
    public TextView mRegTitle;
    public LinearLayout mSnsLL;
    public View mTopRectangle;
    public TextView snsTextView;

    static {
        t2o.a(70255004);
    }

    public static /* synthetic */ void access$000(OverseaRegisterFragment overseaRegisterFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1e2e16", new Object[]{overseaRegisterFragment, new Integer(i)});
        } else {
            overseaRegisterFragment.addCheckAction(i);
        }
    }

    public static /* synthetic */ void access$100(OverseaRegisterFragment overseaRegisterFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6fbd97", new Object[]{overseaRegisterFragment, new Integer(i)});
        } else {
            overseaRegisterFragment.addCheckAction(i);
        }
    }

    public static /* synthetic */ void access$200(OverseaRegisterFragment overseaRegisterFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc14d18", new Object[]{overseaRegisterFragment, new Integer(i)});
        } else {
            overseaRegisterFragment.addCheckAction(i);
        }
    }

    public static /* synthetic */ void access$300(OverseaRegisterFragment overseaRegisterFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f12dc99", new Object[]{overseaRegisterFragment, new Integer(i)});
        } else {
            overseaRegisterFragment.addCheckAction(i);
        }
    }

    public static /* synthetic */ void access$400(OverseaRegisterFragment overseaRegisterFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50646c1a", new Object[]{overseaRegisterFragment, new Integer(i)});
        } else {
            overseaRegisterFragment.addCheckAction(i);
        }
    }

    public static /* synthetic */ Object ipc$super(OverseaRegisterFragment overseaRegisterFragment, String str, Object... objArr) {
        if (str.hashCode() == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/ui/oversea/OverseaRegisterFragment");
    }

    @Override // com.ali.user.mobile.login.newui.NewRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_two_step_mobile_register_oversea;
    }

    @Override // com.ali.user.mobile.login.newui.NewRegFragment, com.ali.user.mobile.login.newui.BaseRegisterFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        String regBgImage = UserLoginActivity.getRegBgImage(this.mFireAppLaunchRes);
        int i = 8;
        if (!TextUtils.isEmpty(regBgImage)) {
            TextView textView = this.mWelcomeTV;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (this.mTitleTV != null) {
                float dimension = getResources().getDimension(R.dimen.aliuser_space_30);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mTitleTV.getLayoutParams();
                layoutParams.setMargins(0, (int) dimension, 0, 0);
                this.mTitleTV.setLayoutParams(layoutParams);
            }
            this.mTopRectangle = view.findViewById(R.id.aliuser_top_rectangle);
            Window window = getActivity().getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.setStatusBarColor(0);
            View view2 = this.mTopRectangle;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            getActivity().getWindow().getDecorView().setSystemUiVisibility(1280);
            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }
            View findViewById = view.findViewById(R.id.aliuser_custom_back);
            this.mBackBtn = findViewById;
            if (findViewById != null) {
                ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            OverseaRegisterFragment.this.onBackPressed();
                        }
                    }
                });
            }
            View findViewById2 = view.findViewById(R.id.aliuser_custom_help);
            this.mHelpTV = findViewById2;
            if (findViewById2 != null) {
                ViewProxy.setOnClickListener(findViewById2, new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            AliUserRegisterActivity.goRegHelp(OverseaRegisterFragment.this.getActivity());
                        }
                    }
                });
            }
            TextView textView2 = (TextView) view.findViewById(R.id.aliuser_register_tips_title);
            this.mRegTitle = textView2;
            if (textView2 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams2.setMargins(0, 36, 0, 0);
                this.mRegTitle.setLayoutParams(layoutParams2);
                this.mRegTitle.setTextSize(25.0f);
            }
            this.mTopRectangle.setBackgroundColor(getResources().getColor(R.color.aliuser_oversea_color));
            ImageUtil.updateBackground(this.mTopRectangle, regBgImage);
            TextView textView3 = (TextView) view.findViewById(R.id.aliuser_reg_func_menu);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else if (getSupportActionBar() != null) {
            getSupportActionBar().show();
        }
        this.snsTextView = (TextView) view.findViewById(R.id.aliuser_sns_hint_tv);
        boolean supportGoogleFB = UserLoginActivity.supportGoogleFB();
        TextView textView4 = this.snsTextView;
        if (supportGoogleFB) {
            i = 0;
        }
        textView4.setVisibility(i);
        this.mSnsLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_ll);
        this.mAlipayHK = (TextView) view.findViewById(R.id.ali_user_login_alipayhk_login_tv);
        this.mAlipayHKLL = view.findViewById(R.id.aliuser_sns_alipayhk_ll);
        this.mAlipayHK.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                } else {
                    OverseaRegisterFragment.access$000(OverseaRegisterFragment.this, LoginClickAction.ACTION_ALIPAYHK_LOGIN);
                }
            }
        });
        this.mAlipay = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        this.mAlipayLL = view.findViewById(R.id.aliuser_sns_alipay_ll);
        this.mAlipay.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                } else {
                    OverseaRegisterFragment.access$100(OverseaRegisterFragment.this, LoginClickAction.ACTION_ALIPAY);
                }
            }
        });
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str});
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                OverseaRegisterFragment.this.snsTextView.setVisibility(0);
                OverseaRegisterFragment.this.mAlipay.setVisibility(0);
                OverseaRegisterFragment.this.mAlipayLL.setVisibility(0);
            }
        });
        AlipayAuth.supportAlipayHK(getActivity(), new CommonCallback() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str});
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else if (LanguageUtil.isHK()) {
                    OverseaRegisterFragment.this.snsTextView.setVisibility(0);
                    OverseaRegisterFragment.this.mAlipayHK.setVisibility(0);
                    OverseaRegisterFragment.this.mAlipayHKLL.setVisibility(0);
                }
            }
        });
        if (UserLoginActivity.displayOversea(this.mFireAppLaunchRes)) {
            if (isChineseLanguage()) {
                this.mMobileET.setBackgroundResource(R.drawable.aliuser_edittext_bg_tb);
            } else {
                this.mMobileET.setBackgroundResource(R.drawable.aliuser_edittext_square_bg);
            }
            TextView textView5 = this.toEmailTV;
            if (textView5 != null) {
                textView5.setVisibility(0);
                this.toEmailTV.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isRegState", true);
                        NavigatorManager.getInstance().navToEmailRegPage(OverseaRegisterFragment.this.getActivity(), bundle);
                    }
                });
            }
            if (UserLoginActivity.supportGoogleFB()) {
                this.mSnsLL.setVisibility(0);
                this.mGgLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_gg_ll);
                this.mFbLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_fb_ll);
                TextView textView6 = (TextView) view.findViewById(R.id.aliuser_recommend_google);
                this.mGoogle = textView6;
                if (textView6 != null) {
                    LinearLayout linearLayout = this.mGgLL;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    this.mGoogle.setVisibility(0);
                    this.mGoogle.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                OverseaRegisterFragment.access$200(OverseaRegisterFragment.this, LoginClickAction.ACTION_GOOGLE_LOGIN);
                            }
                        }
                    });
                }
                TextView textView7 = (TextView) view.findViewById(R.id.aliuser_recommend_facebook);
                this.mFacebook = textView7;
                if (textView7 != null) {
                    LinearLayout linearLayout2 = this.mFbLL;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    this.mFacebook.setVisibility(0);
                    this.mFacebook.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                OverseaRegisterFragment.access$300(OverseaRegisterFragment.this, LoginClickAction.ACTION_FACEBOOK_LOGIN);
                            }
                        }
                    });
                }
            }
            setupLineLogin(view);
        }
    }

    public void setupLineLogin(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9181a413", new Object[]{this, view});
        } else if (rmo.j()) {
            this.mLine = (TextView) view.findViewById(R.id.aliuser_recommend_line);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.aliuser_sns_line_ll);
            this.mLineLL = linearLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView = this.mLine;
            if (textView != null) {
                textView.setVisibility(0);
                this.mLine.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            OverseaRegisterFragment.access$400(OverseaRegisterFragment.this, LoginClickAction.ACTION_LINE_LOGIN);
                        }
                    }
                });
            }
        }
    }
}
