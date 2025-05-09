package com.alipay.mobile.verifyidentity.module.password.pay.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.PwdInputAdapter;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.APLinearLayout;
import com.alipay.mobile.verifyidentity.ui.CustomProgressWheel;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayPwdDialogActivity extends PayDialogBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, PwdCommonHandler> p = new HashMap();
    public LinearLayout g;
    public PwdCommonHandler h;
    public String i;
    public String j;
    public BroadcastReceiver k;
    public LinearLayout l;
    public boolean m;
    public boolean n;
    public boolean isShowGetBackPwd = false;
    public final AtomicBoolean o = new AtomicBoolean(false);

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "PayPwdDialogActivity";
    }

    public static /* synthetic */ void access$100(PayPwdDialogActivity payPwdDialogActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2bc764", new Object[]{payPwdDialogActivity, str});
            return;
        }
        VerifyLogCat.i("PayPwdDialogActivity", "updatePubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i("PayPwdDialogActivity", "服务端没有提供新的公钥，不更新");
            return;
        }
        payPwdDialogActivity.generatePubKey(str);
        payPwdDialogActivity.mSafeInputContext.setRsaPublicKey(payPwdDialogActivity.mPubKey);
    }

    public static /* synthetic */ MicroModule access$1000(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("b343c54a", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1100(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("b557244b", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("b76a834c", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("b97de24d", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1400(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("bb91414e", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1500(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("bda4a04f", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ void access$1700(PayPwdDialogActivity payPwdDialogActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e790f4f", new Object[]{payPwdDialogActivity, mICRpcResponse});
        } else if (!TextUtils.isEmpty(mICRpcResponse.data) && mICRpcResponse.data.contains("bicAsyncData")) {
            try {
                JSONObject parseObject = JSON.parseObject(mICRpcResponse.data);
                if (parseObject != null) {
                    AuthenticatorManager.getInstance(payPwdDialogActivity).processAfterAuth(parseObject.getString("bicAsyncData"));
                }
            } catch (Throwable th) {
                VerifyLogCat.i("PayPwdDialogActivity", "handle km error:" + th.getMessage());
            }
        }
    }

    public static /* synthetic */ MicroModule access$1900(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("c5f21c53", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ PwdCommonHandler access$200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PwdCommonHandler) ipChange.ipc$dispatch("8308b1d2", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.h;
    }

    public static /* synthetic */ MicroModule access$2000(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("f39c4669", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2100(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("f5afa56a", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("f7c3046b", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("f9d6636c", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2400(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("fbe9c26d", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2500(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("fdfd216e", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2600(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("10806f", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2700(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("223df70", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2800(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("4373e71", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ AtomicBoolean access$2900(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("2fe6ef0", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.o;
    }

    public static /* synthetic */ String access$300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29d88504", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.j;
    }

    public static /* synthetic */ void access$3000(PayPwdDialogActivity payPwdDialogActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b722338", new Object[]{payPwdDialogActivity, mICRpcResponse});
            return;
        }
        payPwdDialogActivity.showProgress(8, 0);
        payPwdDialogActivity.content_desc.setText(mICRpcResponse.verifyMessage);
        payPwdDialogActivity.content_desc.setTextColor(-65536);
        payPwdDialogActivity.content_desc.setVisibility(0);
        payPwdDialogActivity.changeLayout(true, payPwdDialogActivity.n);
        payPwdDialogActivity.showKeyboard();
        payPwdDialogActivity.content_desc.setAnimation(payPwdDialogActivity.shakeAnimation(6));
        if ("Y".equalsIgnoreCase(payPwdDialogActivity.hind_other)) {
            payPwdDialogActivity.goBackPwd.setVisibility(8);
        } else if (payPwdDialogActivity.getOtherVerifyPayFlag(mICRpcResponse)) {
            payPwdDialogActivity.goBackPwd.setVisibility(0);
            payPwdDialogActivity.goBackPwd.setText(payPwdDialogActivity.getOtherVerifyPayText(mICRpcResponse));
            payPwdDialogActivity.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PayPwdDialogActivity.this.hideKeyboard();
                    PayPwdDialogActivity.this.mDialogLayout.setVisibility(4);
                    if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                        MicroModuleContext.getInstance().showProgressDialog("");
                    } else {
                        PayPwdDialogActivity.this.showViPayProgress("", false);
                    }
                    PayPwdDialogActivity.access$900(PayPwdDialogActivity.this, null, "Y", "forgotPwd");
                    if (PayPwdDialogActivity.access$1900(PayPwdDialogActivity.this) != null) {
                        PayPwdDialogActivity.access$2000(PayPwdDialogActivity.this).isFindAndPay = true;
                        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PayPwdDialogActivity.access$2100(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$2200(PayPwdDialogActivity.this).getVerifyId(), null, null);
                    }
                }
            });
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (payPwdDialogActivity.showFindPwdByResponse(mICRpcResponse, hashMap)) {
                String str = hashMap.get(PayPwdModule.FIND_PWD_TXT);
                payPwdDialogActivity.goBackPwd.setVisibility(0);
                if (!TextUtils.isEmpty(str)) {
                    payPwdDialogActivity.goBackPwd.setText(str);
                } else {
                    payPwdDialogActivity.goBackPwd.setText(R.string.pwd_forget_in_layout);
                }
            } else {
                payPwdDialogActivity.goBackPwd.setVisibility(8);
            }
            payPwdDialogActivity.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetMspPPW(PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                    LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).notifyCancel();
                }
            });
        }
    }

    public static /* synthetic */ boolean access$3102(PayPwdDialogActivity payPwdDialogActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("942a0c2f", new Object[]{payPwdDialogActivity, new Boolean(z)})).booleanValue();
        }
        payPwdDialogActivity.m = z;
        return z;
    }

    public static /* synthetic */ MicroModule access$3200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("381b858a", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$3300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("3a2ee48b", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("e708d3df", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("e91c32e0", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModuleContext access$600(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModuleContext) ipChange.ipc$dispatch("ae2a58fc", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mMicroModuleContext;
    }

    public static /* synthetic */ MicroModule access$700(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("ed42f0e2", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$800(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("ef564fe3", new Object[]{payPwdDialogActivity});
        }
        return payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ void access$900(PayPwdDialogActivity payPwdDialogActivity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec33080", new Object[]{payPwdDialogActivity, str, str2, str3});
        } else {
            payPwdDialogActivity.b(str, str2, str3);
        }
    }

    public static void addPwdHandler(String str, PwdCommonHandler pwdCommonHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d73cbc8", new Object[]{str, pwdCommonHandler});
        } else {
            ((HashMap) p).put(str, pwdCommonHandler);
        }
    }

    public static /* synthetic */ Object ipc$super(PayPwdDialogActivity payPwdDialogActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/password/pay/ui/PayPwdDialogActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final String c() {
        Bundle extParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        VerifyIdentityTask task = this.mModule.getTask();
        if (task == null || (extParams = task.getExtParams()) == null) {
            return null;
        }
        return extParams.getString("bizPwdType");
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.isIntellDecison = false;
            this.other_txt.setVisibility(0);
            this.other_txt.setText(str);
            this.other_txt.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("module", PayPwdDialogActivity.this.getLogicModuleName());
                        hashMap.put("ui_type", "alert");
                        if (!TextUtils.isEmpty(PayPwdDialogActivity.access$300(PayPwdDialogActivity.this))) {
                            hashMap.put("plusPwdType", "pwd");
                        } else {
                            hashMap.put("plusPwdType", "plus_pwd");
                        }
                        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-180927-01", Constants.VI_ENGINE_APPID, "zthlio", PayPwdDialogActivity.access$400(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$500(PayPwdDialogActivity.this).getVerifyId(), null, hashMap);
                    } catch (Throwable th) {
                        String access$000 = PayPwdDialogActivity.access$000();
                        VerifyLogCat.i(access$000, "log error:" + th.getMessage());
                    }
                    MicroModuleContext access$600 = PayPwdDialogActivity.access$600(PayPwdDialogActivity.this);
                    PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                    VIUtils.goOtherVerifyProduct(access$600, payPwdDialogActivity, PayPwdDialogActivity.access$700(payPwdDialogActivity));
                }
            });
        } else if (!TextUtils.isEmpty(this.top_to_product)) {
            this.isIntellDecison = true;
            this.other_txt.setVisibility(0);
            this.other_txt.setText(this.top_to_product);
            this.other_txt.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).isPluginMode) {
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusNew("end");
                    }
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).changeToBack();
                    new IDecisionHelper().recordBehavior("BACK_TO_BIO_PAY", "", PayPwdDialogActivity.access$800(PayPwdDialogActivity.this).getVerifyId(), "");
                }
            });
        } else {
            this.other_txt.setVisibility(8);
        }
    }

    public void initViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b862cc2", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mDialogLayout.getLayoutParams();
        layoutParams.width = (displayMetrics.widthPixels * 4) / 5;
        layoutParams.height = -2;
        this.mDialogLayout.setLayoutParams(layoutParams);
        if (this.isSimplePwd) {
            this.mDialogLayout.setMinimumHeight(DensityUtil.dip2px(this, 240.0f));
        } else {
            this.mDialogLayout.setMinimumHeight(DensityUtil.dip2px(this, 300.0f));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (!this.o.get()) {
            PwdCommonHandler pwdCommonHandler = this.h;
            if (pwdCommonHandler.isPluginMode) {
                pwdCommonHandler.mPlugin.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
            }
            notifyCancel("102");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ((HashMap) p).remove(this.mModule.getVerifyId());
        if (this.k != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.k);
        }
    }

    public void onPwdError(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a14cd", new Object[]{this, mICRpcResponse});
            return;
        }
        showProgress(8, 0);
        this.content_desc.setText(mICRpcResponse.verifyMessage);
        this.content_desc.setTextColor(-65536);
        this.content_desc.setVisibility(0);
        changeLayout(true, this.n);
        showKeyboard();
        this.content_desc.setAnimation(shakeAnimation(6));
    }

    public void writeBehavorWithPlus(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d003c84d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("module", getLogicModuleName());
            hashMap.put("code", str2);
            hashMap.put("source", str3);
            hashMap.put("ui_type", str4);
            if (!TextUtils.isEmpty(this.j)) {
                hashMap.put("plusPwdType", "pwd");
            } else {
                hashMap.put("plusPwdType", "plus_pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.i("PayPwdDialogActivity", "writeBehavorWithPlus error:" + th.getMessage());
        }
    }

    public static /* synthetic */ void access$1600(PayPwdDialogActivity payPwdDialogActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77076cd8", new Object[]{payPwdDialogActivity, str});
            return;
        }
        VerifyLogCat.i("PayPwdDialogActivity", "safeInputContext onUserInputConfirm");
        payPwdDialogActivity.hideKeyboard();
        payPwdDialogActivity.showProgress(0, 8);
        if (payPwdDialogActivity.h.isPluginMode) {
            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                payPwdDialogActivity.mDialogLayout.setVisibility(4);
                payPwdDialogActivity.mPayingTip.getText().toString();
                payPwdDialogActivity.showViPayProgress("", false);
            }
            payPwdDialogActivity.h.mPlugin.updateVerifyStatusNew("end");
            payPwdDialogActivity.b(str, null, "");
            return;
        }
        payPwdDialogActivity.verify(str, new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
            public void onResult(MICRpcResponse mICRpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                } else if (mICRpcResponse == null) {
                    VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd null result");
                    PayPwdDialogActivity.this.onNetError(false);
                } else if (mICRpcResponse.verifySuccess) {
                    PayPwdDialogActivity.this.startAnimationDone();
                    PayPwdDialogActivity.access$1700(PayPwdDialogActivity.this, mICRpcResponse);
                    PayPwdDialogActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "SUCCESS", "wallet_cn", "alert");
                } else {
                    PayPwdDialogActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "FAIL", "wallet_cn", "alert");
                    PayPwdDialogActivity.this.clearInputContent();
                    PayPwdDialogActivity.access$100(PayPwdDialogActivity.this, PubKeyHelper.updateLocalPubKey(PayPwdDialogActivity.this, mICRpcResponse));
                    if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd retry");
                        PayPwdDialogActivity payPwdDialogActivity2 = PayPwdDialogActivity.this;
                        if (payPwdDialogActivity2.useDialogPwd) {
                            PayPwdDialogActivity.access$1800(payPwdDialogActivity2, mICRpcResponse);
                        } else {
                            payPwdDialogActivity2.onPwdError(mICRpcResponse);
                        }
                    } else {
                        PayPwdDialogActivity.this.showProgress(8, 0);
                        PayPwdDialogActivity payPwdDialogActivity3 = PayPwdDialogActivity.this;
                        payPwdDialogActivity3.processErrorForDialog(payPwdDialogActivity3.mDialogLayout, mICRpcResponse);
                    }
                }
            }
        });
    }

    public final void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.o.set(true);
        writeBehavorWithPlus("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "alert");
        this.h.doRpc(str, str2, str3, this.isSimplePwd, this.predata, this.isIntellDecison, new PwdCommonHandler.NotifyMspResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyMspResultHandler
            public void notifyResult(MICRpcResponse mICRpcResponse, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52319fdb", new Object[]{this, mICRpcResponse, str4});
                    return;
                }
                PayPwdDialogActivity.this.predata = null;
                MicroModuleContext.getInstance().dismissProgressDialog();
                PayPwdDialogActivity.this.dissMissViPayProgress();
                if (mICRpcResponse == null) {
                    VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd null result");
                    PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                    PayPwdDialogActivity.this.onNetError(true);
                } else if (mICRpcResponse.verifySuccess) {
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).doNextStep(mICRpcResponse, str4);
                    PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                    PayPwdDialogActivity.access$1700(PayPwdDialogActivity.this, mICRpcResponse);
                    PayPwdDialogActivity.this.writeBehavorWithPlus("UC-MobileIC-20191030-2", "SUCCESS", "wallet_cn", "alert");
                } else {
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.awaitUser);
                    PayPwdDialogActivity.this.clearInputContent();
                    PayPwdDialogActivity.access$100(PayPwdDialogActivity.this, PubKeyHelper.updateLocalPubKey(PayPwdDialogActivity.this, mICRpcResponse));
                    if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd retry");
                        PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                        if (payPwdDialogActivity.useDialogPwd) {
                            PayPwdDialogActivity.access$1800(payPwdDialogActivity, mICRpcResponse);
                        } else {
                            payPwdDialogActivity.mDialogLayout.setVisibility(0);
                            PayPwdDialogActivity.access$3000(PayPwdDialogActivity.this, mICRpcResponse);
                        }
                        PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                    } else {
                        PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                        PayPwdDialogActivity.access$3102(PayPwdDialogActivity.this, true);
                        PwdCommonHandler access$200 = PayPwdDialogActivity.access$200(PayPwdDialogActivity.this);
                        PayPwdDialogActivity payPwdDialogActivity2 = PayPwdDialogActivity.this;
                        PwdCommonHandler.OnMspDialogConfirm onMspDialogConfirm = new PwdCommonHandler.OnMspDialogConfirm() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.16.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.OnMspDialogConfirm
                            public void onConfirm() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("310393e8", new Object[]{this});
                                    return;
                                }
                                if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                                    MicroModuleContext.getInstance().showProgressDialog("");
                                } else {
                                    PayPwdDialogActivity.this.showViPayProgress("", false);
                                }
                                PayPwdDialogActivity.access$900(PayPwdDialogActivity.this, null, "Y", "");
                                if (PayPwdDialogActivity.access$3200(PayPwdDialogActivity.this) != null) {
                                    PayPwdDialogActivity.access$3300(PayPwdDialogActivity.this).isFindAndPay = true;
                                }
                            }
                        };
                        PayPwdDialogActivity payPwdDialogActivity3 = PayPwdDialogActivity.this;
                        access$200.processErrorForNew(payPwdDialogActivity2, mICRpcResponse, onMspDialogConfirm, payPwdDialogActivity3.mDialogLayout, payPwdDialogActivity3.hind_other);
                    }
                    PayPwdDialogActivity.this.writeBehavorWithPlus("UC-MobileIC-20191030-3", "FAIL", "wallet_cn", "alert");
                }
            }
        });
    }

    public void initPwdInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01349c4", new Object[]{this});
            return;
        }
        VerifyLogCat.i("PayPwdDialogActivity", "initSixPwd: " + this.isSimplePwd);
        VISafeInputInterface vISafeInputForNew = new PwdInputAdapter().getVISafeInputForNew(this, this.isSimplePwd, c());
        this.mSafeInputContext = vISafeInputForNew;
        vISafeInputForNew.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
            public void onUserConfirm(String str) {
                int i = 0;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d51cf727", new Object[]{this, str});
                    return;
                }
                PayPwdDialogActivity.access$1600(PayPwdDialogActivity.this, str);
                PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                if (!TextUtils.isEmpty(str)) {
                    i = str.length();
                }
                payPwdDialogActivity.writePWDSwitchBehavorLog("1", String.valueOf(i));
            }
        });
        this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                String access$000 = PayPwdDialogActivity.access$000();
                VerifyLogCat.i(access$000, "safeInputContext onFocusChange: " + z);
                if (z) {
                    PayPwdDialogActivity.this.showKeyboard();
                }
            }
        });
        this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(PayPwdDialogActivity.access$000(), "safeInputContext onClick");
                PayPwdDialogActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
        this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randomafter);
        setSafeKeyboardPwdInput(this.mSafeInputContext.getEditText());
        this.mPwdInputLayout.addView(this.mSafeInputContext.getContentView());
        this.mPwdInputLayout.setVisibility(0);
        PwdCommonHandler pwdCommonHandler = this.h;
        if (pwdCommonHandler.isPluginMode) {
            String actConf = pwdCommonHandler.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.pwdInputBtn);
            String actConf2 = this.h.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.pwdPlaceHolder);
            if (!TextUtils.isEmpty(actConf)) {
                this.mSafeInputContext.setOkButtonText(actConf);
            }
            if (!TextUtils.isEmpty(actConf2)) {
                this.mSafeInputContext.getEditText().setHint(actConf2);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z) {
            return;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        try {
            RelativeLayout relativeLayout = this.mDialogLayout;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.17
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PayPwdDialogActivity.this.showKeyboard();
                        }
                    }
                }, 100L);
            }
        } catch (Throwable unused) {
            VerifyLogCat.i("PayPwdDialogActivity", "ui error");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        r1 = r12.getResources().getString(com.taobao.taobao.R.string.pwd_forget_in_layout);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void access$1800(com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity r12, final com.alipay.mobileic.core.model.rpc.MICRpcResponse r13) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "eaed4c2e"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r12
            r4[r0] = r13
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            r2 = 8
            r12.showProgress(r2, r1)
            r12.hideKeyboard()
            android.widget.RelativeLayout r2 = r12.mDialogLayout
            r3 = 4
            r2.setVisibility(r3)
            com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler r2 = r12.h
            boolean r2 = r2.isPluginMode
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = "Y"
            java.lang.String r4 = r12.hind_other
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0037
        L_0x0035:
            r2 = r3
            goto L_0x0085
        L_0x0037:
            boolean r2 = r12.getOtherVerifyPayFlag(r13)
            if (r2 == 0) goto L_0x0044
            java.lang.String r1 = r12.getOtherVerifyPayText(r13)
        L_0x0041:
            r2 = r1
        L_0x0042:
            r1 = 1
            goto L_0x0085
        L_0x0044:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r4 = r12.showFindPwdByResponse(r13, r2)
            if (r4 == 0) goto L_0x0035
            java.lang.String r1 = "findPwdTxt"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0041
            goto L_0x0078
        L_0x005e:
            boolean r1 = r12.isShowGetBackPwd
            if (r1 == 0) goto L_0x0083
            android.content.Intent r1 = r12.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r2 = "pwd_action"
            java.lang.String r1 = r1.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0078
            goto L_0x0041
        L_0x0078:
            android.content.res.Resources r1 = r12.getResources()
            int r2 = com.taobao.taobao.R.string.pwd_forget_in_layout
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0041
        L_0x0083:
            r2 = r3
            goto L_0x0042
        L_0x0085:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r4 = "alertTextColor"
            r11.putBoolean(r4, r0)
            java.lang.String r6 = r13.verifyMessage
            int r0 = com.taobao.taobao.R.string.pwd_error_retry
            java.lang.String r7 = r12.getString(r0)
            com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$14 r8 = new com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$14
            r8.<init>()
            if (r1 == 0) goto L_0x00a0
            r9 = r2
            goto L_0x00a1
        L_0x00a0:
            r9 = r3
        L_0x00a1:
            if (r1 == 0) goto L_0x00aa
            com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$15 r0 = new com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$15
            r0.<init>()
            r10 = r0
            goto L_0x00ac
        L_0x00aa:
            r13 = 0
            r10 = r13
        L_0x00ac:
            java.lang.String r5 = ""
            r4 = r12
            r4.alert(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.access$1800(com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity, com.alipay.mobileic.core.model.rpc.MICRpcResponse):void");
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity, com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.isNewPwdUi = true;
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().getExtras() != null && !this.mIsLogicInterrupted) {
            setContentView(R.layout.layout_paypwd_dialog);
            this.g = (LinearLayout) findViewById(R.id.keyboard_container);
            this.mDialogLayout = (RelativeLayout) findViewById(R.id.dialog_container);
            this.mPwdInputLayout = (APLinearLayout) findViewById(R.id.input_container);
            this.mProgressLayout = (LinearLayout) findViewById(R.id.progress_container);
            this.l = (LinearLayout) findViewById(R.id.closelayout);
            this.other_txt = (TextView) findViewById(R.id.other_txt);
            MicroModule microModule = this.mModule;
            if (microModule == null) {
                notifyError();
                return;
            }
            PwdCommonHandler pwdCommonHandler = (PwdCommonHandler) ((HashMap) p).get(microModule.getVerifyId());
            this.h = pwdCommonHandler;
            if (pwdCommonHandler != null) {
                pwdCommonHandler.bindAct(this);
                VerifyLogCat.i("PayPwdDialogActivity", "收银台链路的弹框密码");
            } else {
                VerifyLogCat.i("PayPwdDialogActivity", "非收银台链路的弹框密码");
                this.h = new PwdCommonHandler(this, this.mModule, null, null);
            }
            this.h.sourceToPwd = getIntent().getExtras().getString("sourceToPwd");
            this.j = getIntent().getExtras().getString("decisionToPwd");
            this.goOtherVerifyProduct = getIntent().getExtras().getString(PayPwdModule.PWD_MSP_FORGET_TIP);
            this.otherText = getIntent().getExtras().getString(PayPwdModule.PWD_MSP_FORGET_TO_VERIFY);
            this.isShowGetBackPwd = getIntent().getExtras().getBoolean("isFindPPW");
            this.i = getIntent().getExtras().getString(PayPwdModule.PWD_INPUT_TIP);
            this.top_to_product = getIntent().getExtras().getString("decisionToPwd_action");
            this.hind_other = getIntent().getExtras().getString(PayPwdModule.PWD_HIND_OTHER, "");
            this.useDialogPwd = getIntent().getExtras().getBoolean(PayPwdModule.PWD_USE_DIALOG_PWD, false);
            this.showFindPwd = getIntent().getExtras().getString(PayPwdModule.SHOW_FIND_PWD, "");
            this.findPwdTxt = getIntent().getExtras().getString(PayPwdModule.FIND_PWD_TXT, "");
            if (getIntent().getExtras().getBoolean("isSimplePwd") || "myBank".equalsIgnoreCase(c())) {
                this.isSimplePwd = true;
            } else {
                this.isSimplePwd = false;
            }
            this.k = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/password/pay/ui/PayPwdDialogActivity$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent.getAction() == null) {
                    } else {
                        if ("pwd_plugin_close".equalsIgnoreCase(intent.getAction())) {
                            VerifyLogCat.i(PayPwdDialogActivity.access$000(), "PayDialogActivity receive  pwd_plugin_close");
                            PayPwdDialogActivity.this.finish();
                        } else if ("on_pwd_plugin_action".equalsIgnoreCase(intent.getAction())) {
                            VerifyLogCat.i(PayPwdDialogActivity.access$000(), "PayDialogActivity receive  on_pwd_plugin_action");
                            String string = intent.getExtras().getString("data");
                            if (TextUtils.isEmpty(string) || string.startsWith(UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                                PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                                payPwdDialogActivity.isSimplePwd = true;
                                payPwdDialogActivity.initPwdInput();
                            } else if (UiUtil.INPUT_TYPE_VALUE_PAYPWD.equalsIgnoreCase(string)) {
                                PayPwdDialogActivity payPwdDialogActivity2 = PayPwdDialogActivity.this;
                                payPwdDialogActivity2.isSimplePwd = false;
                                payPwdDialogActivity2.initPwdInput();
                            } else {
                                try {
                                    jSONObject = JSON.parseObject(string);
                                } catch (JSONException e) {
                                    VerifyLogCat.e(PayPwdDialogActivity.access$000(), "json fail ".concat(string), e);
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    PayPwdDialogActivity.access$100(PayPwdDialogActivity.this, jSONObject.getString("pubKey"));
                                }
                            }
                        }
                    }
                }
            };
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("on_pwd_plugin_action");
            intentFilter.addAction("pwd_plugin_close");
            instance.registerReceiver(this.k, intentFilter);
            initViewParams();
            initKeyBoard(this.g);
            this.closeImg = (ImageView) findViewById(R.id.closeimg);
            this.l.bringToFront();
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).isPluginMode) {
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
                    }
                    PayPwdDialogActivity.this.notifyCancel("102");
                }
            });
            String string = getIntent().getExtras().getString("title");
            this.content_title = (TextView) findViewById(R.id.pwd_title);
            if (TextUtils.isEmpty(string)) {
                string = getResources().getString(R.string.pwd_input_alert_please);
            }
            this.content_title.setText(string);
            this.content_desc = (TextView) findViewById(R.id.pwd_desc);
            this.content_biz_desc = (TextView) findViewById(R.id.pwd_biz_desc);
            String string2 = getIntent().getExtras().getString("subtitle");
            if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(this.i)) {
                this.n = true;
                this.content_biz_desc.setVisibility(0);
                if (!TextUtils.isEmpty(this.i)) {
                    this.content_biz_desc.setText(this.i);
                } else {
                    this.content_biz_desc.setText(string2);
                }
            } else {
                this.n = false;
                this.content_biz_desc.setVisibility(8);
            }
            String string3 = getIntent().getExtras().getString("htip", "");
            if (!TextUtils.isEmpty(this.pwdTopTip)) {
                this.content_desc.setTextColor(-65536);
                this.content_desc.setText(this.pwdTopTip);
                this.content_desc.setVisibility(0);
                changeLayout(true, this.n);
            } else if (TextUtils.isEmpty(this.j) || "Y".equalsIgnoreCase(string3)) {
                this.content_desc.setVisibility(8);
                changeLayout(false, this.n);
            } else {
                this.content_desc.setText(this.j);
                this.content_desc.setVisibility(0);
                this.content_desc.setTextColor(Color.parseColor("#333333"));
                changeLayout(true, this.n);
            }
            initPwdInput();
            this.mPayingTip = (TextView) findViewById(R.id.paying_txt);
            this.mProgressWheel = (CustomProgressWheel) findViewById(R.id.paypwd_progress_new);
            String string4 = getIntent().getExtras().getString("loadingTip");
            if (TextUtils.isEmpty(string4)) {
                PwdCommonHandler pwdCommonHandler2 = this.h;
                if (pwdCommonHandler2.isPluginMode) {
                    string4 = pwdCommonHandler2.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.loadingPayingText);
                } else {
                    string4 = getResources().getString(R.string.pwd_is_paying);
                }
            }
            this.mPayingTip.setText(string4);
            this.goBackPwd = (TextView) findViewById(R.id.getbackpwd);
            if (!this.h.isPluginMode || !"Y".equalsIgnoreCase(getOtherPayConfig())) {
                if (this.h.isPluginMode) {
                    if ("Y".equalsIgnoreCase(this.hind_other)) {
                        this.goBackPwd.setVisibility(8);
                    } else {
                        if (TextUtils.isEmpty(this.showFindPwd) || "Y".equalsIgnoreCase(this.showFindPwd)) {
                            this.goBackPwd.setVisibility(0);
                            if (!TextUtils.isEmpty(this.findPwdTxt)) {
                                this.goBackPwd.setText(this.findPwdTxt);
                            } else {
                                this.goBackPwd.setText(R.string.pwd_forget_in_layout);
                            }
                        } else {
                            this.goBackPwd.setVisibility(8);
                        }
                        this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                                LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                                PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).notifyCancel();
                                if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeGetPwdDelay))) {
                                    try {
                                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.6.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetMspPPW(PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                                                }
                                            }
                                        }, 200L);
                                    } catch (Throwable th) {
                                        String access$000 = PayPwdDialogActivity.access$000();
                                        VerifyLogCat.i(access$000, "quit error:" + th.getMessage());
                                    }
                                } else {
                                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetMspPPW(PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                                }
                            }
                        });
                    }
                } else if (this.isShowGetBackPwd) {
                    String string5 = getIntent().getExtras().getString("pwd_action");
                    if (!TextUtils.isEmpty(string5)) {
                        this.goBackPwd.setText(string5);
                    } else {
                        this.goBackPwd.setText(R.string.pwd_forget_in_layout);
                    }
                    this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            if (PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).isPluginMode) {
                                PayPwdDialogActivity.this.showProgress(8, 0);
                                PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetBackPPW();
                                PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).notifyCancel();
                            } else {
                                PayPwdDialogActivity.this.goGetBackPPW();
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("module", PayPwdDialogActivity.this.getLogicModuleName());
                            hashMap.put("event", "find_password");
                            hashMap.put("type", "alert");
                            hashMap.put(PayPwdModule.PWD_USE_DIALOG_PWD, String.valueOf(PayPwdDialogActivity.this.useDialogPwd));
                            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160201-01", Constants.VI_ENGINE_APPID, "hswjmm", PayPwdDialogActivity.access$1400(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$1500(PayPwdDialogActivity.this).getVerifyId(), null, hashMap);
                        }
                    });
                    this.goBackPwd.setVisibility(0);
                    VerifyLogCat.i("PayPwdDialogActivity", "在不显示其它方式入口的情况下，根据需要，显示忘记密码入口");
                }
            } else if ("Y".equalsIgnoreCase(this.hind_other)) {
                this.goBackPwd.setVisibility(8);
            } else {
                this.goBackPwd.setVisibility(0);
                this.goBackPwd.setText(getOtherPayContent());
                this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        PayPwdDialogActivity.this.hideKeyboard();
                        PayPwdDialogActivity.this.mDialogLayout.setVisibility(4);
                        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                            MicroModuleContext.getInstance().showProgressDialog("");
                        } else {
                            PayPwdDialogActivity.this.showViPayProgress("", false);
                        }
                        PayPwdDialogActivity.access$900(PayPwdDialogActivity.this, null, "Y", "forgotPwd");
                        if (PayPwdDialogActivity.access$1000(PayPwdDialogActivity.this) != null) {
                            PayPwdDialogActivity.access$1100(PayPwdDialogActivity.this).isFindAndPay = true;
                            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PayPwdDialogActivity.access$1200(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$1300(PayPwdDialogActivity.this).getVerifyId(), null, null);
                        }
                    }
                });
            }
            if (getIntent().getExtras().getBoolean("hasOthers")) {
                String string6 = getIntent().getExtras().getString("switchOther");
                if (TextUtils.isEmpty(string6)) {
                    String string7 = getIntent().getExtras().getString("pwd_other");
                    if (TextUtils.isEmpty(string7)) {
                        string7 = getResources().getString(R.string.pwd_other_way);
                    }
                    d(string7);
                } else {
                    d(string6);
                }
                VerifyLogCat.i("PayPwdDialogActivity", "显示选择其它方式入口");
            } else {
                d("");
            }
            forbidCapture();
        }
    }
}
