package com.taobao.login4android.activity.auth;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.rmo;
import tb.t2o;
import tb.ws0;
import tb.xwr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AlipayAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REPEAT_CLICK_GAP = 3000;
    public static long mLastClickTime;

    static {
        t2o.a(70254919);
    }

    public static void alipayAuth(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b1b335", new Object[]{str, activity});
        } else {
            alipayAuth(str, activity, false);
        }
    }

    public static boolean isSupportAlipay(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c005cc", new Object[]{activity})).booleanValue();
        }
        if (AliMemberSDK.getService(OauthService.class) != null) {
            return ((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(activity, "alipay");
        }
        return false;
    }

    public static void showAlipay(BaseFragment baseFragment, TextView textView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9da06f", new Object[]{baseFragment, textView, view, new Boolean(z)});
        } else {
            showAlipayInner(baseFragment, textView, null, view, z);
        }
    }

    public static void showAlipayInner(final BaseFragment baseFragment, final View view, final View view2, final View view3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ed6901", new Object[]{baseFragment, view, view2, view3, new Boolean(z)});
        } else if (baseFragment != null && view != null) {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.activity.auth.AlipayAuth.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/activity/auth/AlipayAuth$1");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public Boolean doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("91b7eba9", new Object[]{this, objArr}) : Boolean.valueOf(AlipayAuth.isSupportAlipay(BaseFragment.this.getBaseActivity()));
                }

                public void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                    } else if (!BaseFragment.this.isActivityAvaiable()) {
                    } else {
                        if (bool.booleanValue()) {
                            View view4 = view;
                            if ((view4 instanceof TextView) && z) {
                                ((TextView) view4).setText(R.string.ali_user_alipay_quick_login);
                                Drawable drawable = BaseFragment.this.getResources().getDrawable(R.drawable.aliuser_alipay);
                                drawable.setBounds(0, 0, 50, 50);
                                ((TextView) view).setCompoundDrawables(drawable, null, null, null);
                            }
                            try {
                                view.setVisibility(0);
                                View view5 = view2;
                                if (view5 != null) {
                                    view5.setVisibility(0);
                                }
                                if (BaseFragment.this.needAdaptElder) {
                                    View view6 = view;
                                    if (view6 instanceof TextView) {
                                        ElderUtil.scaleTextSize((TextView) view6);
                                    }
                                }
                                View view7 = view3;
                                if (view7 != null) {
                                    view7.setVisibility(0);
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        } else {
                            view.setVisibility(8);
                            View view8 = view2;
                            if (view8 != null) {
                                view8.setVisibility(8);
                            }
                            View view9 = view3;
                            if (view9 != null) {
                                view9.setVisibility(8);
                            }
                        }
                    }
                }
            }, new Object[0]);
        }
    }

    public static void supportAlipay(final Activity activity, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a09cc3", new Object[]{activity, commonCallback});
        } else if (commonCallback != null && activity != null) {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.activity.auth.AlipayAuth.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/activity/auth/AlipayAuth$2");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public Boolean doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("91b7eba9", new Object[]{this, objArr}) : Boolean.valueOf(AlipayAuth.isSupportAlipay(activity));
                }

                public void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                    } else if (bool.booleanValue()) {
                        commonCallback.onSuccess();
                    } else {
                        commonCallback.onFail(-1, "not support alipay");
                    }
                }
            }, new Object[0]);
        }
    }

    private static boolean useSSO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4db7b93", new Object[0])).booleanValue();
        }
        return CommonUtil.isInABTestRegion("useSSO", 5000);
    }

    public static void alipayAuth(String str, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3385663f", new Object[]{str, activity, new Boolean(z)});
        } else if (activity == null || activity.isFinishing()) {
            LoginTLogAdapter.e("AlipayAuth", "return case fragment is not active or is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - mLastClickTime < 3000) {
                UserTrackAdapter.sendUT("ClickFastReturn");
                LoginTLogAdapter.e("login.LoginStatus", "click too fast ,return");
                return;
            }
            mLastClickTime = currentTimeMillis;
            if (useSSO()) {
                LoginParam loginParam = new LoginParam();
                loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, str);
                loginParam.utPageName = str;
                loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
                loginParam.alipayInstalled = true;
                loginParam.regXianyu = z;
                xwr.f(loginParam);
                ws0.b(activity);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, str);
            hashMap.put("alipayInstalled", "true");
            if (z) {
                hashMap.put("unionReg", "xianyu");
            }
            rmo.l(SNSPlatform.PLATFORM_ALIPAY, activity);
        }
    }

    public static void onAlipayLoginClick(BaseFragment baseFragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13633e18", new Object[]{baseFragment, new Boolean(z), new Boolean(z2)});
        } else if (baseFragment == null || !baseFragment.isActivityAvaiable() || !baseFragment.isActive()) {
            LoginTLogAdapter.e("AlipayAuth", "return case fragment is not active or is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - mLastClickTime < 3000) {
                UserTrackAdapter.sendUT("ClickFastReturn");
                LoginTLogAdapter.e("login.LoginStatus", "click too fast ,return");
                return;
            }
            mLastClickTime = currentTimeMillis;
            HashMap hashMap = new HashMap();
            hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, baseFragment.getPageName());
            hashMap.put("alipayInstalled", "true");
            if (z2) {
                hashMap.put("unionReg", "xianyu");
            }
            if (z) {
                rmo.m(SNSPlatform.PLATFORM_ALIPAYHK, baseFragment.getBaseActivity(), hashMap);
            } else if (useSSO()) {
                LoginParam loginParam = new LoginParam();
                loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, baseFragment.getPageName());
                loginParam.utPageName = baseFragment.getPageName();
                loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
                loginParam.alipayInstalled = true;
                loginParam.regXianyu = z2;
                xwr.f(loginParam);
                ws0.b(baseFragment.getActivity());
            } else {
                rmo.m(SNSPlatform.PLATFORM_ALIPAY, baseFragment.getBaseActivity(), hashMap);
            }
        }
    }

    public static void supportAlipayHK(Activity activity, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a61a06", new Object[]{activity, commonCallback});
        } else if (commonCallback != null && activity != null) {
            if (!CommonUtil.isInABTestRegion("showAlipayHK", 10000)) {
                commonCallback.onFail(-1, "not support alipayHK");
            } else {
                new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.activity.auth.AlipayAuth.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/activity/auth/AlipayAuth$3");
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.AsyncTask
                    public Boolean doInBackground(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("91b7eba9", new Object[]{this, objArr}) : Boolean.valueOf(BundleUtil.isAppInstalled(DataProviderFactory.getApplicationContext(), SNSPlatform.PLATFORM_ALIPAYHK.getPackageName()));
                    }

                    public void onPostExecute(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                        } else if (bool.booleanValue()) {
                            CommonCallback.this.onSuccess();
                        } else {
                            CommonCallback.this.onFail(-1, "not support alipayHK");
                        }
                    }
                }, new Object[0]);
            }
        }
    }
}
