package com.alipay.android.msp.framework.hardwarepay.old.bracelet;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.hardwarepay.old.base.AbstractHardwarePay;
import com.alipay.android.msp.framework.hardwarepay.old.base.HardwareConstants;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BraceletPay extends AbstractHardwarePay {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isCallBack;
    private Object callBack = null;
    private int supportHardwarePay;

    public BraceletPay() {
        EventLogUtil.SpecificEvent.wearableUsage("bracePayCons");
    }

    public static /* synthetic */ int access$000(BraceletPay braceletPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f29b7040", new Object[]{braceletPay})).intValue();
        }
        return braceletPay.supportHardwarePay;
    }

    public static /* synthetic */ int access$002(BraceletPay braceletPay, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6270094b", new Object[]{braceletPay, new Integer(i)})).intValue();
        }
        braceletPay.supportHardwarePay = i;
        return i;
    }

    public static /* synthetic */ Object access$100(BraceletPay braceletPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a850eac6", new Object[]{braceletPay});
        }
        return braceletPay.callBack;
    }

    public static /* synthetic */ Object ipc$super(BraceletPay braceletPay, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/old/bracelet/BraceletPay");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            EventLogUtil.SpecificEvent.wearableUsage("bracePayCancel");
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void init(Context context, int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcb5adf", new Object[]{this, context, new Integer(i), objArr});
        } else if (objArr != null && objArr.length != 0 && (objArr[0] instanceof JSONObject)) {
            LogUtil.record(2, "phonecashiermsp#bracelet", "BraceletPay.init", "BraceletPayHelper startPay msms");
            this.supportHardwarePay = BraceletPayHelper.getInstance().initHardwarePay(context, i, PhoneCashierMspEngine.getMspWallet().getUserId());
            LogUtil.record(2, "phonecashiermsp#bracelet", "BraceletPay.init", "BraceletPayHelper end msms");
            LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPay.init", "支付请求手环初始化结果：" + this.supportHardwarePay);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public void execute(final Context context, final int i, Object... objArr) {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7630931a", new Object[]{this, context, new Integer(i), objArr});
            return;
        }
        EventLogUtil.SpecificEvent.wearableUsage("bracePayExc");
        try {
            final BraceletPayHelper instance = BraceletPayHelper.getInstance();
            if (instance != null) {
                String str3 = null;
                if (objArr == null || objArr.length <= 0) {
                    jSONObject = null;
                } else {
                    JSONObject jSONObject3 = null;
                    for (Object obj : objArr) {
                        if (obj != null) {
                            if (obj instanceof JSONObject) {
                                jSONObject3 = (JSONObject) obj;
                            } else if (obj instanceof String) {
                                jSONObject3 = JSON.parseObject((String) obj);
                            } else {
                                this.callBack = obj;
                            }
                        }
                    }
                    jSONObject = jSONObject3;
                }
                if (jSONObject != null) {
                    int intValue = jSONObject.getIntValue("type");
                    final int intValue2 = jSONObject.getIntValue(MspGlobalDefine.AUTH_TYPE);
                    final int intValue3 = jSONObject.getIntValue(MspGlobalDefine.WEAR_TYPE);
                    if (intValue != 0) {
                        if (intValue == 503) {
                            str2 = "phonecashiermsp#bracelet";
                            jSONObject.remove("type");
                            jSONObject.put("type", (Object) Integer.valueOf(HardwareConstants.getReqRespCodeMap().get(AbstractHardwarePay.CURRENT_BL_REQUEST)));
                            toCallback(instance, this.callBack, i, jSONObject.toString());
                            isCallBack = true;
                        } else if (intValue == 506) {
                            str2 = "phonecashiermsp#bracelet";
                            if (!isCallBack) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("type", (Object) Integer.valueOf(HardwareConstants.getReqRespCodeMap().get(AbstractHardwarePay.CURRENT_BL_REQUEST)));
                                jSONObject4.put("result", (Object) (-1));
                                LogUtil.record(1, str2, "BraceletPay.execute", "[BraceletPay-execute-MSG_MSP_EXIT]:".concat(String.valueOf(jSONObject4)));
                                toCallback(instance, this.callBack, i, jSONObject4.toString());
                                isCallBack = true;
                            }
                        } else if (intValue == 2 || intValue == 3 || intValue == 4) {
                            if (jSONObject.containsKey("extraPara")) {
                                str3 = jSONObject.getString("extraPara");
                            }
                            String string = jSONObject.getString("data");
                            if (str3 != null) {
                                string = string + "[extraPara:" + str3 + "]";
                            }
                            str2 = "phonecashiermsp#bracelet";
                            instance.process(intValue, jSONObject.getIntValue("version"), string, 2, this.callBack, context);
                        } else {
                            jSONObject2 = jSONObject;
                            str2 = "phonecashiermsp#bracelet";
                            str = "BraceletPay.execute";
                        }
                        str = "BraceletPay.execute";
                        jSONObject2 = jSONObject;
                    } else {
                        str2 = "phonecashiermsp#bracelet";
                        str = "BraceletPay.execute";
                        jSONObject2 = jSONObject;
                        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPay.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                BraceletPay.access$002(BraceletPay.this, instance.initHardwarePay(context, i, MspContextUtil.getUserId()));
                                if (AbstractHardwarePay.CURRENT_BL_REQUEST == 0) {
                                    if (BraceletPay.access$000(BraceletPay.this) == 100 || BraceletPay.access$000(BraceletPay.this) == 105 || BraceletPay.access$000(BraceletPay.this) == 106 || BraceletPay.access$000(BraceletPay.this) == 123 || BraceletPay.access$000(BraceletPay.this) == 127 || BraceletPay.access$000(BraceletPay.this) == 126) {
                                        BraceletPay.access$002(BraceletPay.this, 100);
                                    }
                                    BraceletPay braceletPay = BraceletPay.this;
                                    BraceletPayHelper braceletPayHelper = instance;
                                    Object access$100 = BraceletPay.access$100(braceletPay);
                                    int i2 = i;
                                    BraceletPay braceletPay2 = BraceletPay.this;
                                    braceletPay.toCallback(braceletPayHelper, access$100, i2, braceletPay2.createInitReplyJson(BraceletPay.access$000(braceletPay2), intValue2, intValue3));
                                }
                                LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPay.execute", "钱包发起请求手环初始化结果：" + BraceletPay.access$000(BraceletPay.this));
                            }
                        });
                    }
                    LogUtil.record(1, str2, str, "[BraceletPay-execute]:" + jSONObject2 + "[isCallBack]=>" + isCallBack);
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
