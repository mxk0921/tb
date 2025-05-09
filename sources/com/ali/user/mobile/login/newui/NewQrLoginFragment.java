package com.ali.user.mobile.login.newui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.BaseLoginPresenter;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.ali.user.mobile.utils.MD5Util;
import com.ali.user.mobile.utils.NetworkUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.UIDataComponent;
import com.taobao.login4android.UIHavanaComponent;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.qrcode.NoLeakHandler;
import com.taobao.login4android.qrcode.callback.ICallback;
import com.taobao.login4android.qrcode.data.GenQrData;
import com.taobao.login4android.qrcode.data.GenQrResponse;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.taobao.login4android.qrcode.data.QrCodeParam2;
import com.taobao.login4android.qrcode.result.LoginResult;
import com.taobao.login4android.qrcode.view.QrCodeView;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewQrLoginFragment extends NewBaseLoginFragment implements Handler.Callback, BaseLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MESSAGE_GEN_QR_CODE_SUCCESS = 1103;
    public static final int MESSAGE_QR_CODE_INVALID = 1105;
    public static final int MESSAGE_QR_CODE_SCANED = 1106;
    public static final int MESSAGE_RE_GEN_QR_CODE = 1104;
    public static final String TAG = "Login.QrLogin";
    public BitmapDrawable mBitmapDrawable;
    public NoLeakHandler mHandler;
    public boolean mHasToasted;
    public BaseLoginPresenter mPresenter;
    public QrCodeData mQrCodeData;
    public int mQrCodeSize;
    public long mQrCodeStartTime;
    public QrCodeView mQrCodeView;
    public TextView otherLoginTV;
    public TextView scanTV;
    public TextView tipTextView;
    public LoginParam loginParam = null;
    public HashMap<String, WeakReference<Bitmap>> mQrCodeImageCache = new HashMap<>(1);
    public int qrMargin = 1;

    static {
        t2o.a(70254645);
        t2o.a(70254782);
    }

    public static /* synthetic */ Object ipc$super(NewQrLoginFragment newQrLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
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
            case 797441118:
                super.onPause();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewQrLoginFragment");
        }
    }

    public void genQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd4bca5", new Object[]{this});
            return;
        }
        this.mQrCodeStartTime = SystemClock.elapsedRealtime();
        if (getActivity() == null || !NetworkUtil.isNetworkConnected()) {
            toast(getString(R.string.aliuser_network_error), 0);
            this.mQrCodeView.setEnabled(true);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        UIHavanaComponent.genQrCode(genQrCodeParam(), new RpcRequestCallback() { // from class: com.ali.user.mobile.login.newui.NewQrLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (rpcResponse != null) {
                    GenQrResponse genQrResponse = (GenQrResponse) rpcResponse;
                    T t = genQrResponse.returnValue;
                    if (t == 0 || TextUtils.isEmpty(((GenQrData) t).qrCodeImgUrl)) {
                        NewQrLoginFragment.this.showDefaultQrCode();
                        return;
                    }
                    NewQrLoginFragment.this.mQrCodeData = new QrCodeData();
                    NewQrLoginFragment newQrLoginFragment = NewQrLoginFragment.this;
                    QrCodeData qrCodeData = newQrLoginFragment.mQrCodeData;
                    GenQrData genQrData = (GenQrData) genQrResponse.returnValue;
                    qrCodeData.qrCode = genQrData.token;
                    qrCodeData.qrCodeUrl = genQrData.qrCodeUrl;
                    qrCodeData.qrCodeImgUrl = genQrData.qrCodeImgUrl;
                    qrCodeData.cycleSecs = genQrData.pollMilliseconds;
                    if (newQrLoginFragment.mHandler != null) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        LoginTLogAdapter.e(NewQrLoginFragment.TAG, "genQrcode=" + (currentTimeMillis2 - currentTimeMillis));
                        NewQrLoginFragment.this.mHandler.sendEmptyMessage(1103);
                    }
                    UserTrackAdapter.sendUT(NewQrLoginFragment.this.getPageName(), "renderSuccess");
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                LoginTLogAdapter.e(NewQrLoginFragment.TAG, "reqFail" + rpcResponse.message);
                String string = NewQrLoginFragment.this.getString(R.string.aliuser_network_error);
                if (!TextUtils.isEmpty(rpcResponse.message)) {
                    string = rpcResponse.message;
                }
                NewQrLoginFragment.this.toast(string, 0);
                NewQrLoginFragment.this.showDefaultQrCode();
            }
        });
    }

    public QrCodeParam2 genQrCodeParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QrCodeParam2) ipChange.ipc$dispatch("f091aab2", new Object[]{this});
        }
        QrCodeParam2 qrCodeParam2 = new QrCodeParam2();
        qrCodeParam2.qrCodeSize = this.mQrCodeSize;
        return qrCodeParam2;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_qrlogin_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "Page_qr_login";
    }

    public int getRefreshIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b99a38", new Object[]{this})).intValue();
        }
        return R.drawable.aliuser_refresh_icon;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 1103:
                QrCodeData qrCodeData = this.mQrCodeData;
                if (qrCodeData != null) {
                    showQrCode(qrCodeData.qrCodeUrl, qrCodeData.qrCodeImgUrl);
                    qrCodeLogin(this.mQrCodeData);
                    break;
                }
                break;
            case 1104:
                genQrCode();
                break;
            case 1105:
                showRefresh();
                break;
            case 1106:
                showScaned();
                break;
        }
        return false;
    }

    public void handleQrLoginFail(LoginResult loginResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9898b05d", new Object[]{this, loginResult});
            return;
        }
        int resultCode = loginResult.getResultCode();
        String actionType = loginResult.getActionType();
        if (-105 != resultCode) {
            this.mQrCodeData = null;
            if ("H5".equals(actionType)) {
                NavigatorManager.getInstance().navToWebViewPage(this.mAttachedActivity, loginResult.getUrl(), new LoginParam(), loginResult.getLoginData());
            } else {
                NoLeakHandler noLeakHandler = this.mHandler;
                if (noLeakHandler != null) {
                    noLeakHandler.sendEmptyMessage(1105);
                }
            }
        }
        LoginTLogAdapter.w(TAG, "QrCodeLogin fail resultCode" + resultCode + ",resultMsg=" + loginResult.getResultMsg());
    }

    public void handleQrScaned(LoginResult loginResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322b2944", new Object[]{this, loginResult});
            return;
        }
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler != null) {
            noLeakHandler.sendEmptyMessage(1106);
        }
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.loginParam = null;
        if (arguments != null) {
            String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
            if (!TextUtils.isEmpty(str)) {
                this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
            }
        }
        this.mPresenter = new BaseLoginPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.qrMargin = 0;
        super.initViews(view);
        QrCodeView qrCodeView = (QrCodeView) view.findViewById(R.id.aliuser_login_qr_code);
        this.mQrCodeView = qrCodeView;
        qrCodeView.setOnClickListener(this);
        this.mPresenter.onStart();
        setNormalTip(R.string.aliuser_qr_tip2, true);
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().setTitle("");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.otherLoginTV = (TextView) view.findViewById(R.id.aliuser_login_other_login);
        this.tipTextView = (TextView) view.findViewById(R.id.qr_login_reg_tip_tv);
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.aliuser_qr_tip));
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_edittext_bg_color_normal)), 2, 7, 33);
        this.tipTextView.setText(spannableString);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.tipTextView);
        }
        setOnClickListener(this.otherLoginTV);
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
        this.mHandler = new NoLeakHandler(this);
        this.mAttachedActivity.supportTaobaoOrAlipay = true;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mBitmapDrawable = null;
        this.mQrCodeData = null;
        recycleBitmap();
        UIDataComponent.getInstance().stopQrLogin();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler != null) {
            noLeakHandler.setValid(false);
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mHasToasted = false;
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler != null) {
            noLeakHandler.setValid(false);
        }
        UIDataComponent.getInstance().stopQrLogin();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        NoLeakHandler noLeakHandler = this.mHandler;
        if (noLeakHandler != null) {
            noLeakHandler.setValid(true);
        }
        super.onResume();
        QrCodeData qrCodeData = this.mQrCodeData;
        if (qrCodeData == null || !qrCodeData.isValid()) {
            genQrCode();
            return;
        }
        showQrCodeEfficiently();
        qrCodeLogin(this.mQrCodeData);
    }

    public void qrCodeLogin(QrCodeData qrCodeData) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca84fc5", new Object[]{this, qrCodeData});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !isDetached()) {
            if (!NetworkUtil.isNetworkConnected() && !this.mHasToasted) {
                this.mHasToasted = true;
                toast(getString(R.string.aliuser_network_error), 0);
            } else if (this.mQrCodeView != null && qrCodeData != null) {
                UIDataComponent instance = UIDataComponent.getInstance();
                String str = qrCodeData.qrCode;
                int i = this.mQrCodeData.cycleSecs;
                if (i >= 2000) {
                    j = i;
                } else {
                    j = 3000;
                }
                instance.qrLogin(str, j, new ICallback<LoginResult>() { // from class: com.ali.user.mobile.login.newui.NewQrLoginFragment.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onFailure(LoginResult loginResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c8f2224a", new Object[]{this, loginResult});
                        } else {
                            NewQrLoginFragment.this.handleQrLoginFail(loginResult);
                        }
                    }

                    public void onScaned(LoginResult loginResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20ce5e3a", new Object[]{this, loginResult});
                            return;
                        }
                        NewQrLoginFragment.this.handleQrScaned(loginResult);
                        UserTrackAdapter.sendUT(NewQrLoginFragment.this.getPageName(), "qrCodeScaned");
                    }

                    public void onSuccess(LoginResult loginResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b6e171c3", new Object[]{this, loginResult});
                        } else {
                            UserTrackAdapter.sendUT(NewQrLoginFragment.this.getPageName(), "qrLoginSuccess");
                        }
                    }
                });
            }
        }
    }

    public void recycleBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48db929", new Object[]{this});
            return;
        }
        for (String str : this.mQrCodeImageCache.keySet()) {
            WeakReference<Bitmap> weakReference = this.mQrCodeImageCache.get(str);
            if (weakReference != null) {
                weakReference.clear();
            }
        }
        this.mQrCodeImageCache.clear();
    }

    public void setNormalTip(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a9216a", new Object[]{this, new Integer(i), new Boolean(z)});
        }
    }

    public void setScanDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72de2190", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Drawable drawable = getResources().getDrawable(R.drawable.aliuser_scan_logo);
            drawable.setBounds(0, 0, 39, 36);
            this.scanTV.setCompoundDrawables(null, null, drawable, null);
        } else {
            this.scanTV.setCompoundDrawables(null, null, null, null);
        }
    }

    public void showDefaultQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77de8d9", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public boolean showMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c018ff7d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void showQrCode(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaa2826", new Object[]{this, str, str2});
        } else if (this.mQrCodeView == null) {
            LoginTLogAdapter.w(TAG, "showQrCode fail");
        } else if (TextUtils.isEmpty(str) || str.equals(this.mQrCodeView.getTag()) || TextUtils.isEmpty(str2)) {
            LoginTLogAdapter.e(TAG, "showQrCode failed, aQrCodeStr = " + str + ",tag=" + this.mQrCodeView.getTag() + ", qrCodeImgUrl= " + str2);
        } else {
            if (this.mQrCodeSize <= 0) {
                this.mQrCodeSize = this.mQrCodeView.getWidth();
            }
            LoginTLogAdapter.e(TAG, "QrWidth=" + this.mQrCodeData);
            this.mQrCodeView.post(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewQrLoginFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NewQrLoginFragment.this.mQrCodeView.showPrompt(false);
                    NewQrLoginFragment.this.mQrCodeView.setSuccessVisible(8);
                    NewQrLoginFragment.this.mQrCodeView.setEnabled(false);
                    NewQrLoginFragment.this.mQrCodeView.setTag(str);
                    Bitmap bitmapFromMemoryCache = ImageUtil.getBitmapFromMemoryCache(MD5Util.getMD5(str2));
                    if (bitmapFromMemoryCache != null) {
                        NewQrLoginFragment.this.mQrCodeView.setQrCodeBitmap(bitmapFromMemoryCache);
                    } else {
                        new LoadImageTask(DataProviderFactory.getApplicationContext(), NewQrLoginFragment.this.mQrCodeView, "HeadImages", 200).execute(str2);
                    }
                }
            });
            recycleBitmap();
        }
    }

    public void showQrCodeEfficiently() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e78b66a", new Object[]{this});
            return;
        }
        QrCodeData qrCodeData = this.mQrCodeData;
        final String str = qrCodeData.qrCodeUrl;
        final String str2 = qrCodeData.qrCodeImgUrl;
        WeakReference<Bitmap> weakReference = this.mQrCodeImageCache.get(str);
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            this.mQrCodeView.showPrompt(false);
            this.mQrCodeView.setSuccessVisible(8);
            this.mQrCodeView.setEnabled(false);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            this.mBitmapDrawable = bitmapDrawable;
            this.mQrCodeView.setQrCodeBitmapDrawable(bitmapDrawable);
        } else if (this.mQrCodeSize > 0) {
            showQrCode(str, str2);
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.getWindow().getDecorView().post(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewQrLoginFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NewQrLoginFragment.this.mQrCodeView.post(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewQrLoginFragment.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    NewQrLoginFragment newQrLoginFragment = NewQrLoginFragment.this;
                                    newQrLoginFragment.mQrCodeSize = newQrLoginFragment.mQrCodeView.getWidth();
                                    AnonymousClass2 r0 = AnonymousClass2.this;
                                    NewQrLoginFragment.this.showQrCode(str, str2);
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    public void showReGenQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437fac75", new Object[]{this});
            return;
        }
        QrCodeView qrCodeView = this.mQrCodeView;
        if (qrCodeView != null) {
            qrCodeView.setIcon(getRefreshIcon());
            this.mQrCodeView.setText(R.string.passport_ott_re_gen_qr_code);
            this.mQrCodeView.setSuccessVisible(8);
            this.mQrCodeView.showPrompt(true);
            this.mQrCodeView.setEnabled(true);
        }
    }

    public void showRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb52ea5", new Object[]{this});
            return;
        }
        QrCodeView qrCodeView = this.mQrCodeView;
        if (qrCodeView != null) {
            qrCodeView.setText(R.string.passport_ott_refresh_qr_code);
            this.mQrCodeView.showPrompt(true);
            this.mQrCodeView.setSuccessVisible(8);
            this.mQrCodeView.setEnabled(true);
            this.mQrCodeView.requestFocus();
        }
        setNormalTip(R.string.aliuser_qr_tip2, true);
    }

    public void showScaned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba83d40", new Object[]{this});
            return;
        }
        QrCodeView qrCodeView = this.mQrCodeView;
        if (qrCodeView != null) {
            qrCodeView.showPrompt(false);
            this.mQrCodeView.setText(R.string.aliuser_scan_success_tip);
            this.mQrCodeView.setTextVisible(0);
            this.mQrCodeView.setSuccessVisible(0);
            this.mQrCodeView.setEnabled(false);
            this.mQrCodeView.setBackground(null);
        }
        setNormalTip(R.string.aliuser_qr_scaned_tip, false);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_login_other_login) {
            addControl("otherid");
            Intent intent = new Intent();
            intent.putExtra(LoginConstant.LAUNCH_PASS_QR_FRAGMENT, true);
            this.mUserLoginActivity.openLoginPageFromQrLogin(intent);
        } else {
            QrCodeView qrCodeView = this.mQrCodeView;
            if (qrCodeView == view) {
                qrCodeView.setEnabled(false);
                this.mQrCodeView.setIcon(getRefreshIcon());
                this.mQrCodeView.startAnimation();
                genQrCode();
                addControl("refresh");
                return;
            }
            super.onClick(view);
        }
    }
}
