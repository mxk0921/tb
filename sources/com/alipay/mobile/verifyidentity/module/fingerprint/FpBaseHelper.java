package com.alipay.mobile.verifyidentity.module.fingerprint;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.AuthenticatorManagerProxy;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpBaseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DataHelper f4317a;
    public FingerprintCheckActivity b;
    public AuthenticatorManager c;
    public AuthenticatorManagerProxy e;
    public SafepayChecker mSafepayChecker = new SafepayChecker();
    public final String d = FpBaseHelper.class.getSimpleName();

    public static /* synthetic */ FingerprintCheckActivity access$000(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintCheckActivity) ipChange.ipc$dispatch("4d8f2395", new Object[]{fpBaseHelper});
        }
        return fpBaseHelper.b;
    }

    public static /* synthetic */ String access$100(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a86f04e", new Object[]{fpBaseHelper});
        }
        return fpBaseHelper.d;
    }

    public static /* synthetic */ DataHelper access$200(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataHelper) ipChange.ipc$dispatch("74baff3b", new Object[]{fpBaseHelper});
        }
        return fpBaseHelper.f4317a;
    }

    public static /* synthetic */ boolean access$300(FpBaseHelper fpBaseHelper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76cb562", new Object[]{fpBaseHelper, str})).booleanValue();
        }
        return fpBaseHelper.b(str);
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
        authenticatorResponse.setResult(i);
        this.f4317a.goToPayPwd(authenticatorResponse);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        DataHelper dataHelper = this.f4317a;
        if (!dataHelper.multiBio || !dataHelper.hasNextBio()) {
            return false;
        }
        DataHelper dataHelper2 = this.f4317a;
        dataHelper2.mulitiSourceTo = "fp2" + this.f4317a.getNextBioType();
        if (!TextUtils.isEmpty(str)) {
            DataHelper dataHelper3 = this.f4317a;
            dataHelper3.logMultiBioBehavior(str, "fp", dataHelper3.getNextBioType());
        }
        AuthenticatorManager authenticatorManager = this.c;
        if (authenticatorManager != null) {
            authenticatorManager.stopAuth(this.b, 1);
        }
        cancelVerify();
        this.f4317a.parseNextBio();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FpBaseHelper.access$000(FpBaseHelper.this).handleBio();
                }
            }
        });
        this.b.updateVerifyStatus("end");
        return true;
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        this.mSafepayChecker.getFingerprintManager(this.b).cancelVerify();
        AuthenticatorManager authenticatorManager = this.c;
        if (authenticatorManager != null) {
            authenticatorManager.stopAuth(this.b, 1);
        }
        AuthenticatorManagerProxy authenticatorManagerProxy = this.e;
        if (authenticatorManagerProxy != null) {
            authenticatorManagerProxy.cancel();
        }
    }

    public void init(FingerprintCheckActivity fingerprintCheckActivity, DataHelper dataHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3afe5f", new Object[]{this, fingerprintCheckActivity, dataHelper});
            return;
        }
        this.b = fingerprintCheckActivity;
        this.f4317a = dataHelper;
    }

    public static /* synthetic */ void access$400(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c664ef95", new Object[]{fpBaseHelper});
            return;
        }
        final String string = fpBaseHelper.b.getResources().getString(R.string.go_pwd_pay);
        DataHelper dataHelper = fpBaseHelper.f4317a;
        if (dataHelper.multiBio && dataHelper.hasNextBio()) {
            String nextBioType = fpBaseHelper.f4317a.getNextBioType();
            if (nextBioType.equalsIgnoreCase(DataHelper.FACEID_TYPE_VALUE)) {
                string = fpBaseHelper.b.getResources().getString(R.string.go_faceid_pay);
            } else if (nextBioType.equalsIgnoreCase(DataHelper.ZFACE_TYPE_VALUE)) {
                string = fpBaseHelper.b.getResources().getString(R.string.go_face_pay);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.STRING_AUTH_SWITCH, (Object) string);
        if (!TextUtils.isEmpty(fpBaseHelper.f4317a.mDecisionTip)) {
            jSONObject.put(Constants.STRING_AUTH_TITLE, (Object) fpBaseHelper.f4317a.mDecisionTip);
        } else if (!TextUtils.isEmpty(fpBaseHelper.f4317a.errorForFp)) {
            jSONObject.put(Constants.STRING_AUTH_TITLE, (Object) fpBaseHelper.f4317a.errorForFp);
        } else {
            jSONObject.put(Constants.STRING_AUTH_TITLE, (Object) fpBaseHelper.b.getResources().getString(R.string.vi_verify_fp_please));
        }
        String jSONString = jSONObject.toJSONString();
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(3, 2, fpBaseHelper.f4317a.challenge);
        authenticatorMessage.setUiType(1);
        authenticatorMessage.setAuthenticatorType(1);
        authenticatorMessage.setSwitchBtnType(1);
        AuthenticatorManager instance = AuthenticatorManager.getInstance(fpBaseHelper.b);
        fpBaseHelper.c = instance;
        AuthenticatorManagerProxy authenticatorManagerProxy = new AuthenticatorManagerProxy(instance);
        fpBaseHelper.e = authenticatorManagerProxy;
        authenticatorManagerProxy.startAuth(fpBaseHelper.b, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
            public void onResult(final AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                } else if (FpBaseHelper.access$000(FpBaseHelper.this) != null) {
                    if (FpBaseHelper.access$000(FpBaseHelper.this).hasCancelled.get()) {
                        VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "指纹校验已取消，不处理回调结果");
                        return;
                    }
                    if (authenticatorResponse == null) {
                        FpBaseHelper.access$200(FpBaseHelper.this).exceptionLogBehavior("get_authenticatorResponse_null");
                    }
                    int result = authenticatorResponse.getResult();
                    if (100 == result) {
                        VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "getOnFingerResult success");
                        FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior(String.valueOf(result), "fpbase_newinterface_client");
                        FpBaseHelper.access$200(FpBaseHelper.this).buildRequestData(FpBaseHelper.access$200(FpBaseHelper.this).predata_type, true, authenticatorResponse);
                        FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                        FpBaseHelper.access$000(FpBaseHelper.this).checkByServer();
                    } else if (102 == result) {
                        VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "getOnFingerResult 指纹校验【取消】");
                        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.openOldAlert)) && FpBaseHelper.access$200(FpBaseHelper.this).isPluginMode) {
                            if (TextUtils.equals(FpBaseHelper.access$200(FpBaseHelper.this).mPlugin.getActConf("supportEmbedVi"), "Y")) {
                                VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "supportEmbedVi CANCLE_TO_PWD");
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("CANCLE_TO_PWD", "fpbase_newinterface_client");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                                FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwd(authenticatorResponse);
                                return;
                            }
                            String actConf = FpBaseHelper.access$200(FpBaseHelper.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.supportRetain);
                            if (!TextUtils.isEmpty(actConf) && "Y".equalsIgnoreCase(actConf)) {
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("RESULT_USER_CANCEL", "REMOVE_ALERT");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateStatuesWithSecne(BaseFBPlugin.VERIFY_STATUS.abort, LoginConstant.FETCH_IV_FAIL_CANCEL);
                                FpBaseHelper.access$200(FpBaseHelper.this).notifyResult(new DefaultModuleResult("1003"));
                                return;
                            }
                        }
                        FpBaseHelper.access$000(FpBaseHelper.this).alert((String) null, FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.face_really_wanna_leave), string, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "【用户选择切密码】");
                                if (!FpBaseHelper.access$300(FpBaseHelper.this, "CANCLE_TO_BIO")) {
                                    FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("CANCLE_TO_PWD", "fpbase_newinterface_client");
                                    FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                                    FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwd(authenticatorResponse);
                                }
                            }
                        }, FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "【用户选择放弃】");
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("RESULT_USER_CANCEL", "fpbase_newinterface_client");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
                                FpBaseHelper.access$200(FpBaseHelper.this).notifyResult(new DefaultModuleResult("1003"));
                            }
                        }, Boolean.FALSE);
                    } else {
                        String access$100 = FpBaseHelper.access$100(FpBaseHelper.this);
                        VerifyLogCat.i(access$100, "getOnFingerResult 指纹校验【失败】：" + result);
                        if (!FpBaseHelper.access$300(FpBaseHelper.this, "")) {
                            if (result == 121 || result == 135) {
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("RESULT_FALLBACK", "fpbase_newinterface_client");
                            } else if (result == 138) {
                                String string2 = FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_retry);
                                if (!TextUtils.isEmpty(string2)) {
                                    FpBaseHelper.access$200(FpBaseHelper.this).updateTipToPwd(string2);
                                }
                                DataHelper access$200 = FpBaseHelper.access$200(FpBaseHelper.this);
                                access$200.logFpResBehavior("RESULT_FP_FALL-" + result, "fpbase_newinterface_client");
                            } else {
                                DataHelper access$2002 = FpBaseHelper.access$200(FpBaseHelper.this);
                                access$2002.logFpResBehavior("RESULT_FP_FALL-" + result, "fpbase_newinterface_client");
                                FpBaseHelper.access$200(FpBaseHelper.this).exceptionLogBehavior(String.valueOf(result));
                            }
                            FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                            FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwd(authenticatorResponse);
                        } else if (result == 135) {
                            FpBaseHelper.access$200(FpBaseHelper.this).logMultiBioBehavior("CLICK_TO_BIO", "fp", FpBaseHelper.access$200(FpBaseHelper.this).predata_type);
                        } else if (result == 138) {
                            String string3 = FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_retry);
                            if (!TextUtils.isEmpty(string3)) {
                                FpBaseHelper.access$000(FpBaseHelper.this).toast(string3, 0);
                            }
                            FpBaseHelper.access$200(FpBaseHelper.this).logMultiBioBehavior("FAIL_TO_BIO", "fp", FpBaseHelper.access$200(FpBaseHelper.this).predata_type);
                        } else {
                            FpBaseHelper.access$200(FpBaseHelper.this).logMultiBioBehavior("FAIL_TO_BIO", "fp", FpBaseHelper.access$200(FpBaseHelper.this).predata_type);
                        }
                    }
                }
            }
        }, jSONString);
    }

    public void startSpFingerprintChecker() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc7c377", new Object[]{this});
            return;
        }
        this.f4317a.logBehavior("fpbasestart", "UC-MobileIC-20190426-6", null);
        this.mSafepayChecker.init(this.b, 1);
        if (!TextUtils.isEmpty(this.f4317a.userId)) {
            int checkUserStatus = this.mSafepayChecker.checkUserStatus(this.f4317a.userId);
            if (checkUserStatus == 2) {
                VerifyLogCat.i(this.d, "用户本地指纹状态正常");
            } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeFpStatusAction))) {
                String str = this.d;
                VerifyLogCat.i(str, "用户本地指纹状态不正确[" + checkUserStatus + "]");
                a(checkUserStatus);
                return;
            } else if (!b("USER_STATUS_ERROR")) {
                a(checkUserStatus);
                return;
            } else {
                return;
            }
        }
        JSONObject jSONObject = this.f4317a.newUiParamsObj;
        if (jSONObject != null) {
            z = jSONObject.getBooleanValue(DataHelper.FP_TYPE_VALUE);
        }
        HashMap hashMap = new HashMap();
        if (z && this.f4317a.supporNewVerison) {
            hashMap.put("isNewMUI", "true");
        }
        this.f4317a.startBioCheck(new DataHelper.BioCheckCallBack() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.utils.DataHelper.BioCheckCallBack
            public void bioCheckResult(boolean z2, boolean z3, boolean z4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bf1b0eb0", new Object[]{this, new Boolean(z2), new Boolean(z3), new Boolean(z4)});
                } else if (z2) {
                    if (!FpBaseHelper.access$200(FpBaseHelper.this).ppwFirst || FpBaseHelper.access$200(FpBaseHelper.this).isFromUserBackNoCashier || FpBaseHelper.access$200(FpBaseHelper.this).isFromUserBack) {
                        FpBaseHelper.access$400(FpBaseHelper.this);
                    } else {
                        FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwdWithStr(FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.go_fp_pay), FpBaseHelper.access$200(FpBaseHelper.this).getIdTip("PWD", FpBaseHelper.access$000(FpBaseHelper.this)));
                    }
                } else if (z3) {
                    FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwdWithStr(FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.go_fp_pay), FpBaseHelper.access$200(FpBaseHelper.this).getIdTip("PWD", FpBaseHelper.access$000(FpBaseHelper.this)));
                } else if (z4) {
                    FpBaseHelper.access$200(FpBaseHelper.this).isIntelligent = true;
                    if (FpBaseHelper.access$200(FpBaseHelper.this).bioTypes != null) {
                        if (DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(FpBaseHelper.access$200(FpBaseHelper.this).bioTypes.getString(0))) {
                            FpBaseHelper.access$000(FpBaseHelper.this).showNewToast(FpBaseHelper.access$200(FpBaseHelper.this).getIdTip(DataHelper.ZFACE_TYPE_VALUE, FpBaseHelper.access$000(FpBaseHelper.this)), 0);
                        } else if (DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(FpBaseHelper.access$200(FpBaseHelper.this).bioTypes.getString(0))) {
                            FpBaseHelper.access$000(FpBaseHelper.this).showNewToast(FpBaseHelper.access$200(FpBaseHelper.this).getIdTip(DataHelper.FACEID_TYPE_VALUE, FpBaseHelper.access$000(FpBaseHelper.this)), 0);
                        }
                    }
                    FpBaseHelper.access$000(FpBaseHelper.this).handleBio();
                }
            }
        }, DataHelper.FP_TYPE_VALUE);
    }
}
