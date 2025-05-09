package com.taobao.login4android.ui;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.SDKUtil;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginCouponHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254990);
    }

    public static void handleCoupon(View view, UserLoginActivity userLoginActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f664ac", new Object[]{view, userLoginActivity});
        } else {
            handleCoupon(view, userLoginActivity, true);
        }
    }

    private static void setText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{textView, str});
        } else if (textView != null && str != null) {
            textView.setText(str);
        }
    }

    public static void handleCoupon(View view, UserLoginActivity userLoginActivity, boolean z) {
        View findViewById;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d6e3a8", new Object[]{view, userLoginActivity, new Boolean(z)});
        } else if (view != null && userLoginActivity != null) {
            try {
                String sourceOrApi = CommonUtil.getSourceOrApi();
                String config = LoginSwitch.getConfig("gifts", "mtop.alibaba.catapult.gift.receive.gift");
                int i2 = 8;
                if (!TextUtils.isEmpty(sourceOrApi) && LanguageUtil.isChineseLanguage() && SDKUtil.inList(sourceOrApi, config)) {
                    String replaceSpot = CommonUtil.replaceSpot(sourceOrApi);
                    DisplayMetrics displayMetrics = userLoginActivity.getResources().getDisplayMetrics();
                    int i3 = (int) (displayMetrics.density * 12.0f);
                    View findViewById2 = view.findViewById(R.id.aliuser_login_coupon_tip);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(0);
                        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                        layoutParams.height = (int) (displayMetrics.density * 45.0f);
                        findViewById2.setLayoutParams(layoutParams);
                        view.findViewById(R.id.aliuser_main_coupon).getLayoutParams().height = (int) (displayMetrics.density * 35.0f);
                        TextView textView = (TextView) findViewById2.findViewById(R.id.aliuser_login_coupon_left);
                        if (textView != null) {
                            textView.setVisibility(8);
                            textView.setText("");
                        }
                        TextView textView2 = (TextView) findViewById2.findViewById(R.id.aliuser_login_coupon_amount);
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            textView2.setText("");
                            ImageUtil.updateBackground(textView2, LoginSwitch.getConfig("icon_" + replaceSpot, "https://gw.alicdn.com/imgextra/i3/O1CN01YzAteh1UTIJmjbR00_!!6000000002518-2-tps-80-80.png"));
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                            float f = displayMetrics.density;
                            int i4 = (int) (20.0f * f);
                            layoutParams2.width = i4;
                            layoutParams2.height = i4;
                            layoutParams2.leftMargin = (int) (f * 16.0f);
                            textView2.setLayoutParams(layoutParams2);
                        }
                        TextView textView3 = (TextView) findViewById2.findViewById(R.id.aliuser_coupon_subtitle);
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        TextView textView4 = (TextView) findViewById2.findViewById(R.id.aliuser_coupon_title);
                        if (textView4 != null) {
                            String config2 = LoginSwitch.getConfig("text_" + replaceSpot, "登录后查看惊喜礼物");
                            textView4.setTextSize(2, 15.0f);
                            SpannableString spannableString = new SpannableString(config2);
                            spannableString.setSpan(new StyleSpan(0), 0, config2.length(), 33);
                            textView4.setText(spannableString);
                        }
                        View findViewById3 = findViewById2.findViewById(R.id.aliuser_coupon_triangle);
                        if (findViewById3 != null) {
                            if (z) {
                                i2 = 0;
                            }
                            findViewById3.setVisibility(i2);
                        }
                        View findViewById4 = findViewById2.findViewById(R.id.aliuser_login_coupon_line);
                        if (findViewById4 != null) {
                            findViewById4.setVisibility(0);
                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) findViewById4.getLayoutParams();
                            float f2 = displayMetrics.density;
                            layoutParams3.width = (int) (1.0f * f2);
                            layoutParams3.height = (int) (f2 * 13.0f);
                            layoutParams3.leftMargin = i3;
                            findViewById4.setLayoutParams(layoutParams3);
                            ImageUtil.updateBackground(findViewById4, "https://gw.alicdn.com/imgextra/i2/O1CN01ZSBWX31V9t9ZfNy4K_!!6000000002611-2-tps-4-104.png");
                        }
                        View findViewById5 = findViewById2.findViewById(R.id.aliuser_right_ll);
                        if (findViewById5 != null) {
                            findViewById5.setPadding(i3, 0, 0, 0);
                        }
                    }
                } else if (userLoginActivity.shouldShowLoginBenefit() && (findViewById = view.findViewById(R.id.aliuser_login_coupon_tip)) != null) {
                    findViewById.setVisibility(0);
                    setText((TextView) findViewById.findViewById(R.id.aliuser_login_coupon_amount), ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo.benefitAmountText);
                    setText((TextView) findViewById.findViewById(R.id.aliuser_coupon_subtitle), ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo.benefitSubTitle);
                    setText((TextView) findViewById.findViewById(R.id.aliuser_coupon_title), ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo.benefitTitle);
                    View findViewById6 = findViewById.findViewById(R.id.aliuser_coupon_triangle);
                    if (findViewById6 != null) {
                        if (!z) {
                            i = 8;
                        }
                        findViewById6.setVisibility(i);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
