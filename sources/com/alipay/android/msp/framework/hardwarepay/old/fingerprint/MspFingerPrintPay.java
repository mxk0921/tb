package com.alipay.android.msp.framework.hardwarepay.old.fingerprint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.hardwarepay.old.base.AbstractHardwarePay;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.SystemDefaultDialog;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspFingerPrintPay extends AbstractHardwarePay {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValidateDialogProxy dialog;
    private boolean mIsCancel = false;
    private String data = null;
    private boolean mHandleSuccessFlag = true;
    private boolean isValidateOk = false;
    private int fpRetryTimes = 0;
    private int scanType = 2;
    private String tipsMsg = null;
    private boolean fpSensorStatus = false;

    public static /* synthetic */ String access$000(MspFingerPrintPay mspFingerPrintPay, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95496b04", new Object[]{mspFingerPrintPay, new Integer(i)});
        }
        return mspFingerPrintPay.createInitReplyJson(i);
    }

    public static /* synthetic */ void access$100(MspFingerPrintPay mspFingerPrintPay, FingerprintPayHelper fingerprintPayHelper, Object obj, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb471999", new Object[]{mspFingerPrintPay, fingerprintPayHelper, obj, new Integer(i), str});
        } else {
            mspFingerPrintPay.toCallback(fingerprintPayHelper, obj, i, str);
        }
    }

    public static /* synthetic */ boolean access$1000(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("459b1dfa", new Object[]{mspFingerPrintPay})).booleanValue();
        }
        return mspFingerPrintPay.isValidateOk;
    }

    public static /* synthetic */ boolean access$1002(MspFingerPrintPay mspFingerPrintPay, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f90bd8e0", new Object[]{mspFingerPrintPay, new Boolean(z)})).booleanValue();
        }
        mspFingerPrintPay.isValidateOk = z;
        return z;
    }

    public static /* synthetic */ void access$1100(MspFingerPrintPay mspFingerPrintPay, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0242aac", new Object[]{mspFingerPrintPay, new Integer(i)});
        } else {
            mspFingerPrintPay.exitCashier(i);
        }
    }

    public static /* synthetic */ int access$1200(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22a9406b", new Object[]{mspFingerPrintPay})).intValue();
        }
        return mspFingerPrintPay.fpRetryTimes;
    }

    public static /* synthetic */ int access$1202(MspFingerPrintPay mspFingerPrintPay, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdc1c6bc", new Object[]{mspFingerPrintPay, new Integer(i)})).intValue();
        }
        mspFingerPrintPay.fpRetryTimes = i;
        return i;
    }

    public static /* synthetic */ int access$1208(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e20cac73", new Object[]{mspFingerPrintPay})).intValue();
        }
        int i = mspFingerPrintPay.fpRetryTimes;
        mspFingerPrintPay.fpRetryTimes = 1 + i;
        return i;
    }

    public static /* synthetic */ String access$1300(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74022c07", new Object[]{mspFingerPrintPay});
        }
        return mspFingerPrintPay.tipsMsg;
    }

    public static /* synthetic */ String access$1400(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d69a4e6", new Object[]{mspFingerPrintPay});
        }
        return mspFingerPrintPay.data;
    }

    public static /* synthetic */ String access$200(MspFingerPrintPay mspFingerPrintPay, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ab306fc", new Object[]{mspFingerPrintPay, new Integer(i), str});
        }
        return mspFingerPrintPay.createUserStatusReplyJson(i, str);
    }

    public static /* synthetic */ void access$300(MspFingerPrintPay mspFingerPrintPay, FingerprintPayHelper fingerprintPayHelper, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6d8e92", new Object[]{mspFingerPrintPay, fingerprintPayHelper, obj, new Integer(i), new Integer(i2)});
        } else {
            mspFingerPrintPay.sendOpenCallback(fingerprintPayHelper, obj, i, i2);
        }
    }

    public static /* synthetic */ boolean access$400(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33bdabcf", new Object[]{mspFingerPrintPay})).booleanValue();
        }
        return mspFingerPrintPay.mIsCancel;
    }

    public static /* synthetic */ boolean access$402(MspFingerPrintPay mspFingerPrintPay, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf3b05ab", new Object[]{mspFingerPrintPay, new Boolean(z)})).booleanValue();
        }
        mspFingerPrintPay.mIsCancel = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a244bd10", new Object[]{mspFingerPrintPay})).booleanValue();
        }
        return mspFingerPrintPay.fpSensorStatus;
    }

    public static /* synthetic */ boolean access$502(MspFingerPrintPay mspFingerPrintPay, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31961c8a", new Object[]{mspFingerPrintPay, new Boolean(z)})).booleanValue();
        }
        mspFingerPrintPay.fpSensorStatus = z;
        return z;
    }

    public static /* synthetic */ ValidateDialogProxy access$600(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValidateDialogProxy) ipChange.ipc$dispatch("9ad6b291", new Object[]{mspFingerPrintPay});
        }
        return mspFingerPrintPay.dialog;
    }

    public static /* synthetic */ ValidateDialogProxy access$602(MspFingerPrintPay mspFingerPrintPay, ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValidateDialogProxy) ipChange.ipc$dispatch("cfb21d69", new Object[]{mspFingerPrintPay, validateDialogProxy});
        }
        mspFingerPrintPay.dialog = validateDialogProxy;
        return validateDialogProxy;
    }

    public static /* synthetic */ int access$700(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f52df81", new Object[]{mspFingerPrintPay})).intValue();
        }
        return mspFingerPrintPay.scanType;
    }

    public static /* synthetic */ boolean access$800(MspFingerPrintPay mspFingerPrintPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edd9f0d3", new Object[]{mspFingerPrintPay})).booleanValue();
        }
        return mspFingerPrintPay.mHandleSuccessFlag;
    }

    public static /* synthetic */ boolean access$802(MspFingerPrintPay mspFingerPrintPay, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58a76127", new Object[]{mspFingerPrintPay, new Boolean(z)})).booleanValue();
        }
        mspFingerPrintPay.mHandleSuccessFlag = z;
        return z;
    }

    public static /* synthetic */ void access$900(MspFingerPrintPay mspFingerPrintPay, MspBasePresenter mspBasePresenter, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be61838", new Object[]{mspFingerPrintPay, mspBasePresenter, new Integer(i), str, str2});
        } else {
            mspFingerPrintPay.toSubmit(mspBasePresenter, i, str, str2);
        }
    }

    private String createInitReplyJson(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47febc6a", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", (Object) 6);
            jSONObject.put("message", (Object) "");
            jSONObject.put("result", (Object) Integer.valueOf(i));
            jSONObject.put("data", (Object) getAuthInfo());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject.toString();
    }

    private String createUserStatusReplyJson(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7eb1e773", new Object[]{this, new Integer(i), str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", (Object) Integer.valueOf(i));
            jSONObject.put("message", (Object) "");
            if (TextUtils.isEmpty(str)) {
                jSONObject.put("result", (Object) "");
            } else {
                jSONObject.put("result", (Object) str);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject.toString();
    }

    private void exitCashier(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b02a6b7", new Object[]{this, new Integer(i)});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId != null) {
            mspContextByBizId.exit(0);
        }
    }

    private static JSONObject getAuthInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1afad93", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String[] authInfo = FingerprintPayHelper.getInstance().getAuthInfo();
            jSONObject.put("authInfoType", (Object) authInfo[0]);
            jSONObject.put("vendor", (Object) authInfo[1]);
            jSONObject.put("phoneModel", (Object) authInfo[2]);
            jSONObject.put("protocolVersion", (Object) authInfo[3]);
            jSONObject.put("protocolType", (Object) authInfo[4]);
            jSONObject.put("mfacDownloadUrl", (Object) authInfo[5]);
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.FP_GET_AUTHINFO_EX, e);
        }
        return jSONObject;
    }

    public static /* synthetic */ Object ipc$super(MspFingerPrintPay mspFingerPrintPay, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/old/fingerprint/MspFingerPrintPay");
    }

    private void toCallback(FingerprintPayHelper fingerprintPayHelper, Object obj, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28ffcf8", new Object[]{this, fingerprintPayHelper, obj, new Integer(i), str});
            return;
        }
        fingerprintPayHelper.reflectCallBack(obj, i, str);
        MspHardwarePayUtil.getInstance().destroy();
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FingerprintPayHelper.getInstance().cancel();
                    }
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int val$command;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ Object val$fingerprintCallback;
        public final /* synthetic */ FingerprintPayHelper val$helper;

        public AnonymousClass3(Context context, FingerprintPayHelper fingerprintPayHelper, int i, Object obj) {
            this.val$context = context;
            this.val$helper = fingerprintPayHelper;
            this.val$command = i;
            this.val$fingerprintCallback = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = this.val$context;
            Activity activity = (Activity) context;
            final int initHardwarePay = this.val$helper.initHardwarePay(context, this.val$command, MspContextUtil.getUserId());
            if (initHardwarePay == 100 || initHardwarePay == 127) {
                String[] authInfo = this.val$helper.getAuthInfo();
                int registedFingerPrintNumber = this.val$helper.registedFingerPrintNumber();
                LogUtil.record(1, "phonecashiermsp#fingerprint", "MspFingerPrintPay.execute", "当前指纹数量:".concat(String.valueOf(registedFingerPrintNumber)));
                if ((registedFingerPrintNumber == 0 || registedFingerPrintNumber == -1) && !TextUtils.equals(authInfo[4], "1")) {
                    MspFingerPrintPay.access$402(MspFingerPrintPay.this, false);
                    activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Context context2 = AnonymousClass3.this.val$context;
                            SystemDefaultDialog.showDialog(context2, LanguageHelper.localizedStringForKey("mini_add_fp", context2.getString(R.string.mini_add_fp), new Object[0]), LanguageHelper.localizedStringForKey("alipay_cancel", AnonymousClass3.this.val$context.getString(R.string.alipay_cancel), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    MspFingerPrintPay.access$402(MspFingerPrintPay.this, true);
                                    AnonymousClass3 r5 = AnonymousClass3.this;
                                    MspFingerPrintPay.access$300(MspFingerPrintPay.this, r5.val$helper, r5.val$fingerprintCallback, 200, r5.val$command);
                                }
                            }, LanguageHelper.localizedStringForKey("mini_to_open", AnonymousClass3.this.val$context.getString(R.string.mini_to_open), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    LogUtil.record(2, "", "MspFingerPrintPay.execute", "开启添加指纹UI返回值:".concat(String.valueOf(AnonymousClass3.this.val$helper.process(0, "", 16))));
                                    dialogInterface.dismiss();
                                }
                            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.2.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnDismissListener
                                public void onDismiss(DialogInterface dialogInterface) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                                    } else if (!MspFingerPrintPay.access$400(MspFingerPrintPay.this)) {
                                        AnonymousClass3 r5 = AnonymousClass3.this;
                                        MspFingerPrintPay.access$300(MspFingerPrintPay.this, r5.val$helper, r5.val$fingerprintCallback, 200, r5.val$command);
                                    }
                                }
                            });
                        }
                    });
                    return;
                }
                PhoneCashierMspEngine.getMspViSec().hardwarePayOpt(this.val$command, "true");
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context2 = AnonymousClass3.this.val$context;
                    SystemDefaultDialog.showDialog(context2, LanguageHelper.localizedStringForKey("mini_to_open_error", AnonymousClass3.this.val$context.getString(R.string.mini_to_open_error), new Object[0]) + "[" + initHardwarePay + "]", LanguageHelper.localizedStringForKey("alipay_ensure", AnonymousClass3.this.val$context.getString(R.string.alipay_ensure), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                dialogInterface.dismiss();
                            }
                        }
                    }, (String) null, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.3.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                                return;
                            }
                            AnonymousClass3 r5 = AnonymousClass3.this;
                            MspFingerPrintPay.access$300(MspFingerPrintPay.this, r5.val$helper, r5.val$fingerprintCallback, 200, r5.val$command);
                        }
                    });
                }
            });
        }
    }

    private void sendOpenCallback(FingerprintPayHelper fingerprintPayHelper, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c293e", new Object[]{this, fingerprintPayHelper, obj, new Integer(i), new Integer(i2)});
            return;
        }
        if (obj != null) {
            LogUtil.record(1, "phonecashiermsp#callback", "MspFingerPrintPay.fpStatusReceiver.sendOpenCallback", "callback != null");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) 601);
        jSONObject.put("result", (Object) Integer.valueOf(i));
        toCallback(fingerprintPayHelper, obj, i2, jSONObject.toString());
    }

    private void toSubmit(MspBasePresenter mspBasePresenter, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cd28a2", new Object[]{this, mspBasePresenter, new Integer(i), str, str2});
            return;
        }
        String localizedStringForKey = LanguageHelper.localizedStringForKey("flybird_fp_validating", mspBasePresenter.getActivity().getString(R.string.flybird_fp_validating), new Object[0]);
        if (mspBasePresenter.getIView() != null) {
            mspBasePresenter.getIView().showLoadingView(localizedStringForKey);
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            String string = JSON.parseObject(str2).getString("name");
            ActionsCreator actionsCreator = ActionsCreator.get(tradeContextByBizId);
            if (string == null) {
                string = "";
            }
            actionsCreator.createSubmitEventAction(string, str, EventAction.SubmitType.CommonRequest, 0);
            tradeContextByBizId.getMspNetHandler().setLastSubmitAction(new JSONObject());
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void init(Context context, int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcb5adf", new Object[]{this, context, new Integer(i), objArr});
        } else if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                JsonUtil.addUniqueItem((JSONObject) obj, MspGlobalDefine.SUPPORT_APP, Boolean.valueOf(isSupportFingerprint(context, i)));
            }
        }
    }

    private boolean isSupportFingerprint(Context context, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e2f0625", new Object[]{this, context, new Integer(i)})).booleanValue();
        }
        FingerprintPayHelper instance = FingerprintPayHelper.getInstance();
        int initHardwarePay = instance.initHardwarePay(context, i, MspContextUtil.getUserId());
        if ((initHardwarePay == 100 || initHardwarePay == 127) && DeviceInfo.isInAlipayWallet(context) && instance.registedFingerPrintNumber() > 0) {
            z = true;
        }
        LogUtil.record(1, "", "MspFingerPrintPay::isSupportFingerprint", "support:".concat(String.valueOf(z)));
        return z;
    }

    private void toRegister(final FingerprintPayHelper fingerprintPayHelper, final int i, final JSONObject jSONObject, final Context context, final int i2, final MspBasePresenter mspBasePresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13987b6c", new Object[]{this, fingerprintPayHelper, new Integer(i), jSONObject, context, new Integer(i2), mspBasePresenter});
            return;
        }
        if (jSONObject != null) {
            jSONObject.getIntValue("bizId");
        }
        this.mHandleSuccessFlag = true;
        this.dialog = null;
        this.scanType = 2;
        this.tipsMsg = null;
        if (jSONObject != null) {
            if (jSONObject.containsKey("scanType")) {
                this.scanType = jSONObject.getIntValue("scanType");
                this.tipsMsg = jSONObject.getString("tipsMsg");
            }
            try {
                String decode = URLDecoder.decode(jSONObject.getString("data"), "UTF-8");
                this.data = decode;
                fingerprintPayHelper.process(i, 2, decode, i2, null, context);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            this.isValidateOk = false;
            this.fpSensorStatus = false;
            final JSONObject jSONObject2 = new JSONObject();
            final JSONObject jSONObject3 = new JSONObject();
            this.fpRetryTimes = 0;
            final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/old/fingerprint/MspFingerPrintPay$4");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                    LogUtil.record(1, "phonecashiermsp#fingerprint", "MspFingerPrintPay.fpStatusReceiver.onReceive", "开通指纹状态变化 :".concat(String.valueOf(intExtra)));
                    if (intExtra == 2) {
                        MspFingerPrintPay.access$502(MspFingerPrintPay.this, true);
                        if (MspFingerPrintPay.access$600(MspFingerPrintPay.this) != null) {
                            MspFingerPrintPay.access$600(MspFingerPrintPay.this).updateMsg(LanguageHelper.localizedStringForKey("flybird_fp_validating", context2.getString(R.string.flybird_fp_validating), new Object[0]), 0, -16777216);
                        }
                    } else if (intExtra == 100 || intExtra == 113 || intExtra == 102 || intExtra == 103) {
                        LogUtil.record(1, "phonecashiermsp#fingerprint", "MspFingerPrintPay.fpStatusReceiver.onReceive", "指纹支付状态变化 :".concat(String.valueOf(intExtra)));
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(broadcastReceiver, intentFilter, 4);
            } else {
                context.registerReceiver(broadcastReceiver, intentFilter);
            }
            final BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/old/fingerprint/MspFingerPrintPay$5");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    int intExtra = intent.getIntExtra("result", 0);
                    LogUtil.record(1, "phonecashiermsp#fingerprint", "MspFingerPrintPay.receiver.onReceive", "FP_REGISTER_ACTION result:".concat(String.valueOf(intExtra)));
                    if (TextUtils.equals(intent.getAction(), MspGlobalDefine.FP_REGISTER_ACTION)) {
                        if (MspFingerPrintPay.access$700(MspFingerPrintPay.this) == 4 || MspFingerPrintPay.access$700(MspFingerPrintPay.this) == 5) {
                            MspFingerPrintPay.access$502(MspFingerPrintPay.this, true);
                        }
                        if (intExtra != 129 && !MspFingerPrintPay.access$500(MspFingerPrintPay.this)) {
                            PowerManager powerManager = (PowerManager) context2.getSystemService("power");
                            if ((powerManager == null || !powerManager.isScreenOn()) && intExtra == 101) {
                                intExtra = 113;
                            }
                            if (intExtra != 113) {
                                return;
                            }
                        }
                        int i3 = -16777216;
                        if (intExtra != 100) {
                            if (intExtra == 102) {
                                MspFingerPrintPay.access$1100(MspFingerPrintPay.this, jSONObject.getIntValue("bizId"));
                                try {
                                    context.unregisterReceiver(broadcastReceiver);
                                    LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                                } catch (Throwable th) {
                                    LogUtil.printExceptionStackTrace(th);
                                }
                            } else if (intExtra != 113) {
                                if (intExtra == 129) {
                                    MspFingerPrintPay.access$1202(MspFingerPrintPay.this, 3);
                                }
                                if (MspFingerPrintPay.access$1200(MspFingerPrintPay.this) <= 2) {
                                    MspFingerPrintPay.access$1208(MspFingerPrintPay.this);
                                    if (MspFingerPrintPay.access$600(MspFingerPrintPay.this) != null) {
                                        MspFingerPrintPay.access$600(MspFingerPrintPay.this).showAnimation();
                                        MspFingerPrintPay.access$600(MspFingerPrintPay.this).updateMsg(LanguageHelper.localizedStringForKey("flybird_fp_val_failed", context.getString(R.string.flybird_fp_val_failed), new Object[0]), 0, -65536);
                                        ValidateDialogProxy access$600 = MspFingerPrintPay.access$600(MspFingerPrintPay.this);
                                        if (TextUtils.isEmpty(MspFingerPrintPay.access$1300(MspFingerPrintPay.this))) {
                                            str = LanguageHelper.localizedStringForKey("flybird_fp_open", context.getString(R.string.flybird_fp_open), new Object[0]);
                                        } else {
                                            str = MspFingerPrintPay.access$1300(MspFingerPrintPay.this);
                                        }
                                        access$600.updateMsg(str, 250, -16777216);
                                    }
                                    fingerprintPayHelper.process(i, 2, MspFingerPrintPay.access$1400(MspFingerPrintPay.this), i2, null, context);
                                } else if (MspFingerPrintPay.access$600(MspFingerPrintPay.this) != null) {
                                    MspFingerPrintPay.access$600(MspFingerPrintPay.this).showAnimation();
                                    String localizedStringForKey = LanguageHelper.localizedStringForKey("flybird_fp_retry_tips", context.getString(R.string.flybird_fp_retry_tips), new Object[0]);
                                    if (intExtra == 129) {
                                        localizedStringForKey = LanguageHelper.localizedStringForKey("flybird_fp_validate_too_often", context.getString(R.string.flybird_fp_validate_too_often), new Object[0]);
                                        i3 = -65536;
                                    }
                                    MspFingerPrintPay.access$600(MspFingerPrintPay.this).updateMsg(localizedStringForKey, 300, i3);
                                    MspFingerPrintPay.access$600(MspFingerPrintPay.this).dismiss(500);
                                    try {
                                        context.unregisterReceiver(broadcastReceiver);
                                        LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                                    } catch (Throwable th2) {
                                        LogUtil.printExceptionStackTrace(th2);
                                    }
                                }
                            } else if (MspFingerPrintPay.access$600(MspFingerPrintPay.this) != null) {
                                MspFingerPrintPay.access$600(MspFingerPrintPay.this).dismiss(0);
                                MspFingerPrintPay.access$1100(MspFingerPrintPay.this, jSONObject.getIntValue("bizId"));
                                try {
                                    context.unregisterReceiver(broadcastReceiver);
                                    LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                                } catch (Throwable th3) {
                                    LogUtil.printExceptionStackTrace(th3);
                                }
                            }
                        } else if (MspFingerPrintPay.access$800(MspFingerPrintPay.this)) {
                            MspFingerPrintPay.access$802(MspFingerPrintPay.this, false);
                            jSONObject2.put("name", (Object) jSONObject.getString("actionType"));
                            jSONObject3.put(jSONObject.getString("responseMsg"), (Object) intent.getStringExtra("responseMsg"));
                            jSONObject3.put(jSONObject.getString("token"), (Object) intent.getStringExtra("tokenId"));
                            if (MspFingerPrintPay.access$600(MspFingerPrintPay.this) != null) {
                                MspFingerPrintPay.access$600(MspFingerPrintPay.this).setValidateResult(true);
                                MspFingerPrintPay.access$600(MspFingerPrintPay.this).updateMsg(LanguageHelper.localizedStringForKey("flybird_fp_val_ok", context.getString(R.string.flybird_fp_val_ok), new Object[0]), 0, -16777216);
                                MspFingerPrintPay.access$600(MspFingerPrintPay.this).dismiss(200);
                            }
                            if (MspFingerPrintPay.access$700(MspFingerPrintPay.this) == 4 || MspFingerPrintPay.access$700(MspFingerPrintPay.this) == 5) {
                                MspFingerPrintPay.access$900(MspFingerPrintPay.this, mspBasePresenter, jSONObject.getIntValue("bizId"), jSONObject3.toString(), jSONObject2.toString());
                                try {
                                    context.unregisterReceiver(broadcastReceiver);
                                    LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                                } catch (Throwable th4) {
                                    LogUtil.printExceptionStackTrace(th4);
                                }
                            } else {
                                MspFingerPrintPay.access$1002(MspFingerPrintPay.this, true);
                            }
                        }
                    }
                }
            };
            ((Activity) context).runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MspFingerPrintPay.access$700(MspFingerPrintPay.this) != 4 && MspFingerPrintPay.access$700(MspFingerPrintPay.this) != 5) {
                        MspFingerPrintPay.access$602(MspFingerPrintPay.this, new ValidateDialogProxy(1, mspBasePresenter.getActivity()));
                        ValidateDialogProxy access$600 = MspFingerPrintPay.access$600(MspFingerPrintPay.this);
                        Context context2 = context;
                        access$600.showDialog((Activity) context2, 100, LanguageHelper.localizedStringForKey("flybird_fp_open", context2.getString(R.string.flybird_fp_open), new Object[0]), new IDialogActionListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                            public void onDialogAction(int i3) {
                                MspContext mspContextByBizId;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("2d7a4c5f", new Object[]{this, new Integer(i3)});
                                    return;
                                }
                                int intValue = jSONObject.getIntValue("bizId");
                                if (i3 == 0 && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(intValue)) != null) {
                                    mspContextByBizId.getStatisticInfo().addEvent(new StEvent(mspContextByBizId.getCurrentWinTpName(), "fp", CountValue.C_FP_OPEN_DLG_CANCEL));
                                }
                                if (MspFingerPrintPay.access$1000(MspFingerPrintPay.this)) {
                                    AnonymousClass6 r6 = AnonymousClass6.this;
                                    MspFingerPrintPay.access$900(MspFingerPrintPay.this, mspBasePresenter, jSONObject.getIntValue("bizId"), jSONObject3.toString(), jSONObject2.toString());
                                } else {
                                    AnonymousClass6 r62 = AnonymousClass6.this;
                                    MspFingerPrintPay.access$1100(MspFingerPrintPay.this, jSONObject.getIntValue("bizId"));
                                }
                                try {
                                    AnonymousClass6 r63 = AnonymousClass6.this;
                                    context.unregisterReceiver(broadcastReceiver);
                                    LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver2);
                                } catch (Throwable th) {
                                    LogUtil.printExceptionStackTrace(th);
                                }
                            }
                        });
                    }
                }
            });
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver2, new IntentFilter(MspGlobalDefine.FP_REGISTER_ACTION));
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void execute(final Context context, final int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7630931a", new Object[]{this, context, new Integer(i), objArr});
            return;
        }
        try {
            final FingerprintPayHelper instance = FingerprintPayHelper.getInstance();
            final Object obj = null;
            MspBasePresenter mspBasePresenter = null;
            String str = null;
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else if (obj2 instanceof MspBasePresenter) {
                        mspBasePresenter = (MspBasePresenter) obj2;
                    } else {
                        obj = obj2;
                    }
                }
            }
            if (obj != null) {
                LogUtil.record(1, "phonecashiermsp#callback", "MspFingerPrintPay.fpStatusReceiver.execute", "callback != null");
            }
            final JSONObject parseObject = JSON.parseObject(str);
            final int intValue = parseObject.getIntValue("type");
            if (intValue == 0) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int initHardwarePay = instance.initHardwarePay(context, i, MspContextUtil.getUserId());
                        LogUtil.record(1, "", "MspFingerPrintPay::execute", "指纹初始化结果(MSG_INIT_REQUEST)：".concat(String.valueOf(initHardwarePay)));
                        if (initHardwarePay == 127) {
                            initHardwarePay = 106;
                        }
                        MspFingerPrintPay mspFingerPrintPay = MspFingerPrintPay.this;
                        MspFingerPrintPay.access$100(mspFingerPrintPay, instance, obj, i, MspFingerPrintPay.access$000(mspFingerPrintPay, initHardwarePay));
                    }
                });
            } else if (intValue == 506) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) Integer.valueOf(AbstractHardwarePay.CURRENT_FP_REQUEST));
                jSONObject.put("result", (Object) 200);
                toCallback(instance, AbstractHardwarePay.FP_Callback, i, jSONObject.toString());
            } else if (intValue == 2 || intValue == 3 || intValue == 4) {
                LogUtil.record(1, "phonecashiermsp#fingerprint", "MspFingerPrintPay.execute", "指纹支付：type:" + intValue + " data:" + parseObject.getString("data") + " version:" + parseObject.getIntValue("version"));
                instance.process(intValue, parseObject.getIntValue("version"), parseObject.getString("data"), i, obj, context);
            } else if (intValue == 13) {
                toCallback(instance, obj, i, createUserStatusReplyJson(intValue, String.valueOf(instance.registedFingerPrintNumber())));
            } else if (intValue == 14) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.fingerprint.MspFingerPrintPay.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        instance.initHardwarePay(context, i, MspContextUtil.getUserId());
                        int checkUserStatus = instance.checkUserStatus(parseObject.getString("data"));
                        MspFingerPrintPay mspFingerPrintPay = MspFingerPrintPay.this;
                        MspFingerPrintPay.access$100(mspFingerPrintPay, instance, obj, i, MspFingerPrintPay.access$200(mspFingerPrintPay, intValue, String.valueOf(checkUserStatus)));
                    }
                });
            } else if (intValue == 16 || intValue == 17) {
                toCallback(instance, obj, i, createUserStatusReplyJson(intValue, instance.process(parseObject.getIntValue("version"), parseObject.getString("data"), intValue)));
            } else {
                switch (intValue) {
                    case 601:
                        TaskHelper.execute(new AnonymousClass3(context, instance, i, obj));
                        return;
                    case 602:
                        toRegister(instance, 2, parseObject, context, i, mspBasePresenter);
                        return;
                    case 603:
                        if (obj != null) {
                            LogUtil.record(1, "phonecashiermsp#callback", "MspFingerPrintPay.fpStatusReceiver.MSG_FINGERPRINT_AUTHENTICATOR_OPEN_OK", "callback != null");
                        }
                        sendOpenCallback(instance, obj, 100, i);
                        return;
                    case 604:
                        instance.process(4, 0, parseObject.getString("data"), i, null, context);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", (Object) 605);
                        jSONObject2.put("result", (Object) 100);
                        toCallback(instance, obj, i, jSONObject2.toString());
                        return;
                    case 605:
                        PhoneCashierMspEngine.getMspViSec().hardwarePayOpt(i, "false");
                        return;
                    default:
                        return;
                }
            }
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, e.getClass().getName(), e);
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
