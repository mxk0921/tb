package com.taobao.login4android.scan;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.BaseLogonFragment;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.scan.impl.ScanServiceImpl;
import com.ali.user.mobile.scan.model.CommonScanParam;
import com.ali.user.mobile.scan.model.CommonScanResponse;
import com.ali.user.mobile.scan.model.CommonScanResult;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class QrScanFragment extends BaseLogonFragment implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.qrScanFragment";
    public FragmentActivity mAttachedActivity;
    public Button mCancelButton;
    public Button mConfirmButton;
    public String mConfirmMsg;
    public ImageView mHintImageView;
    public String mScanKey;
    public TextView mScanSubTitleView;
    public TextView mScanTitleTextView;
    public int mSessionExpiredCount = 0;
    public String mUrl;

    static {
        t2o.a(70254982);
    }

    public static /* synthetic */ void access$000(QrScanFragment qrScanFragment, CommonScanResponse commonScanResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b449f04", new Object[]{qrScanFragment, commonScanResponse});
        } else {
            qrScanFragment.alertMessage(commonScanResponse);
        }
    }

    public static /* synthetic */ void access$100(QrScanFragment qrScanFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda0f585", new Object[]{qrScanFragment});
        } else {
            qrScanFragment.dismissAlertDialog();
        }
    }

    private void alertMessage(CommonScanResponse commonScanResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2afe36", new Object[]{this, commonScanResponse});
        } else if (commonScanResponse != null && !TextUtils.isEmpty(commonScanResponse.message)) {
            alertMessage(commonScanResponse.message);
        }
    }

    private CommonScanParam getCommonScanParam() {
        Bundle serialBundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonScanParam) ipChange.ipc$dispatch("6c24e7ba", new Object[]{this});
        }
        CommonScanParam commonScanParam = new CommonScanParam();
        commonScanParam.appName = DataProviderFactory.getDataProvider().getAppkey();
        commonScanParam.havanaId = Login.getUserId();
        commonScanParam.sid = Login.getSid();
        commonScanParam.currentSite = Login.getLoginSite();
        if (TextUtils.isEmpty(this.mUrl)) {
            return null;
        }
        if (TextUtils.isEmpty(this.mScanKey) && (serialBundle = BundleUtil.serialBundle(Uri.parse(this.mUrl).getQuery())) != null) {
            this.mScanKey = serialBundle.getString("lgToken");
        }
        commonScanParam.key = this.mScanKey;
        return commonScanParam;
    }

    public static /* synthetic */ Object ipc$super(QrScanFragment qrScanFragment, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/scan/QrScanFragment");
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceiveSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ad5f6c", new Object[]{this});
        } else {
            drawView();
        }
    }

    public void drawView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15eef210", new Object[]{this});
            return;
        }
        this.mHintImageView.setImageResource(getHitImageResource());
        if (this.mUrl != null) {
            ScanServiceImpl.getInstance().commonScanWithRemoteBiz(getCommonScanParam(), new RpcRequestCallback() { // from class: com.taobao.login4android.scan.QrScanFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        QrScanFragment.this.onRequestError(rpcResponse);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    FragmentActivity fragmentActivity = QrScanFragment.this.mAttachedActivity;
                    if (fragmentActivity != null && !fragmentActivity.isFinishing() && rpcResponse != null) {
                        CommonScanResponse commonScanResponse = (CommonScanResponse) rpcResponse;
                        int i = commonScanResponse.code;
                        if (i == 3000) {
                            T t = commonScanResponse.returnValue;
                            if (t != 0) {
                                String str = ((CommonScanResult) t).titleMsg;
                                String str2 = ((CommonScanResult) t).subTitleMsg;
                                QrScanFragment.this.mConfirmMsg = ((CommonScanResult) t).confirmMsg;
                                if (!TextUtils.isEmpty(str)) {
                                    QrScanFragment.this.mScanTitleTextView.setText(str);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    QrScanFragment.this.mScanSubTitleView.setText(str2);
                                }
                                QrScanFragment qrScanFragment = QrScanFragment.this;
                                TextView textView = qrScanFragment.mScanSubTitleView;
                                Resources resources = qrScanFragment.mAttachedActivity.getResources();
                                QrScanFragment qrScanFragment2 = QrScanFragment.this;
                                textView.setTextColor(resources.getColor(qrScanFragment2.getSubTitleTextColor(true ^ TextUtils.isEmpty(qrScanFragment2.mConfirmMsg))));
                                QrScanFragment.this.updateLogo(((CommonScanResult) commonScanResponse.returnValue).logoUrl);
                                return;
                            }
                            QrScanFragment qrScanFragment3 = QrScanFragment.this;
                            qrScanFragment3.toast(qrScanFragment3.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
                        } else if (i == 14034) {
                            QrScanFragment.this.handleSessionExpired();
                        } else if ("H5".equals(commonScanResponse.actionType)) {
                            QrScanFragment.this.handleH5(commonScanResponse);
                        } else if (QrScanFragment.this.handleIntercept(commonScanResponse)) {
                        } else {
                            if (!TextUtils.isEmpty(commonScanResponse.message)) {
                                QrScanFragment.access$000(QrScanFragment.this, commonScanResponse);
                                return;
                            }
                            QrScanFragment qrScanFragment4 = QrScanFragment.this;
                            qrScanFragment4.toast(qrScanFragment4.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
                        }
                    }
                }
            });
        }
    }

    public int getHitImageResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38f3ffa6", new Object[]{this})).intValue();
        }
        return R.drawable.aliuser_scan_default_bg;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_scan_fragment_tb_new;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "Page_LoginConfirm";
    }

    public int getSubTitleTextColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95c84fb8", new Object[]{this, new Boolean(z)})).intValue();
        }
        if (z) {
            return R.color.aliuser_scancode_warning_color;
        }
        return R.color.aliuser_color_hint_gray;
    }

    public void handleBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a998e836", new Object[]{this});
        } else {
            ScanServiceImpl.getInstance().commonCancelWithRemoteBiz(getCommonScanParam(), new RpcRequestCallback() { // from class: com.taobao.login4android.scan.QrScanFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        onSuccess(rpcResponse);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    FragmentActivity fragmentActivity = QrScanFragment.this.mAttachedActivity;
                    if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                        QrScanFragment.this.mAttachedActivity.finish();
                    }
                }
            });
        }
    }

    public void handleConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346d5bff", new Object[]{this});
        } else {
            ScanServiceImpl.getInstance().commonConfirmWithRemoteBiz(getCommonScanParam(), new RpcRequestCallback() { // from class: com.taobao.login4android.scan.QrScanFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        QrScanFragment.this.onRequestError(rpcResponse);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    FragmentActivity fragmentActivity = QrScanFragment.this.mAttachedActivity;
                    if (fragmentActivity != null && !fragmentActivity.isFinishing() && rpcResponse != null) {
                        CommonScanResponse commonScanResponse = (CommonScanResponse) rpcResponse;
                        int i = commonScanResponse.code;
                        if (i == 3000) {
                            QrScanFragment.this.mAttachedActivity.setResult(-1);
                            QrScanFragment.this.mAttachedActivity.finish();
                        } else if (i == 14034) {
                            QrScanFragment.this.handleSessionExpired();
                        } else if ("H5".equals(commonScanResponse.actionType)) {
                            QrScanFragment.this.handleH5(commonScanResponse);
                        } else if (QrScanFragment.this.handleIntercept(commonScanResponse)) {
                        } else {
                            if (!TextUtils.isEmpty(commonScanResponse.message)) {
                                QrScanFragment.access$000(QrScanFragment.this, commonScanResponse);
                                return;
                            }
                            QrScanFragment qrScanFragment = QrScanFragment.this;
                            qrScanFragment.toast(qrScanFragment.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
                        }
                    }
                }
            });
        }
    }

    public void handleH5(CommonScanResponse commonScanResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbefcec", new Object[]{this, commonScanResponse});
            return;
        }
        T t = commonScanResponse.returnValue;
        if (t == 0) {
            toast(this.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
        } else if (!TextUtils.isEmpty(((CommonScanResult) t).h5Url)) {
            Login.openUrl(this.mAttachedActivity, ((CommonScanResult) commonScanResponse.returnValue).h5Url);
            this.mAttachedActivity.finish();
        } else if (!TextUtils.isEmpty(commonScanResponse.message)) {
            alertMessage(commonScanResponse);
        } else {
            toast(this.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
        }
    }

    public boolean handleIntercept(CommonScanResponse commonScanResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b13bceb", new Object[]{this, commonScanResponse})).booleanValue();
        }
        return false;
    }

    public void handleSessionExpired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7accfe", new Object[]{this});
            return;
        }
        int i = this.mSessionExpiredCount + 1;
        this.mSessionExpiredCount = i;
        if (i <= 20) {
            Login.login(true);
        } else {
            alertMessage(this.mAttachedActivity.getResources().getString(R.string.aliuser_login_exception));
        }
    }

    public void initParams() {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mUrl = (String) arguments.get(LoginConstant.SCAN_KEY);
            }
            if (TextUtils.isEmpty(this.mUrl) && (fragmentActivity = this.mAttachedActivity) != null) {
                fragmentActivity.finish();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        Button button = (Button) view.findViewById(R.id.aliuser_scan_confirmButton);
        this.mConfirmButton = button;
        button.setOnClickListener(this);
        Button button2 = (Button) view.findViewById(R.id.aliuser_scan_cancelButton);
        this.mCancelButton = button2;
        button2.setOnClickListener(this);
        this.mHintImageView = (ImageView) view.findViewById(R.id.aliuser_scan_bg_imageview);
        this.mScanTitleTextView = (TextView) view.findViewById(R.id.aliuser_scan_textview);
        this.mScanSubTitleView = (TextView) view.findViewById(R.id.aliuser_scan_subTitleTextView);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        drawView();
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.mAttachedActivity = (QrScanActivity) activity;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        handleBack();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_scan_confirmButton) {
            UserTrackAdapter.sendControlUT(getPageName(), "Confirm_Click");
            if (TextUtils.isEmpty(this.mConfirmMsg)) {
                handleConfirm();
            } else {
                alert("", this.mConfirmMsg, this.mAttachedActivity.getResources().getString(R.string.aliuser_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.scan.QrScanFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            QrScanFragment.this.handleConfirm();
                        }
                    }
                }, this.mAttachedActivity.getResources().getString(R.string.aliuser_cancel), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.scan.QrScanFragment.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            QrScanFragment.access$100(QrScanFragment.this);
                        }
                    }
                });
            }
        } else if (id == R.id.aliuser_scan_cancelButton) {
            UserTrackAdapter.sendControlUT(getPageName(), "Cancel_Click");
            handleBack();
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
        if (!Login.checkSessionValid()) {
            Login.login(true);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(getLayoutContent(), viewGroup, false);
        initViews(inflate);
        initParams();
        return inflate;
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mHintImageView = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UserTrackAdapter.pageDisAppear(getActivity());
    }

    public void onRequestError(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e19ff8e", new Object[]{this, rpcResponse});
            return;
        }
        FragmentActivity fragmentActivity = this.mAttachedActivity;
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            if (rpcResponse instanceof CommonScanResponse) {
                CommonScanResponse commonScanResponse = (CommonScanResponse) rpcResponse;
                if (!TextUtils.isEmpty(commonScanResponse.message)) {
                    alertMessage(commonScanResponse);
                } else {
                    toast(this.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
                }
            } else {
                toast(this.mAttachedActivity.getResources().getString(R.string.aliuser_network_error), 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserTrackAdapter.updatePageName(getActivity(), getPageName());
    }

    public void updateLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec399a5", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            new LoadImageTask(this.mAttachedActivity.getApplicationContext(), this.mHintImageView, "LogoImages", 800).execute(str);
        }
    }

    private void alertMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e19f5c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            alert("", str, this.mAttachedActivity.getResources().getString(R.string.aliuser_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.scan.QrScanFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        QrScanFragment.this.mAttachedActivity.finish();
                    }
                }
            }, null, null);
        }
    }
}
