package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import com.vivo.push.PushClientConstants;
import java.util.regex.Pattern;
import tb.f7l;
import tb.fdt;
import tb.rft;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    private static final Pattern c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private Context f5433a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.f5433a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.b = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.b.setKitSdkVersion(61200300);
    }

    private tct<Void> a(String str, String str2) {
        String reportEntry = PushBiUtil.reportEntry(this.f5433a, PushNaming.SUBSCRIBE);
        if (str == null || !c.matcher(str).matches()) {
            PushBiUtil.reportExit(this.f5433a, PushNaming.SUBSCRIBE, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
            throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        } else if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "use proxy subscribe.");
            return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.f5433a, str, reportEntry) : ProxyCenter.getProxy().unsubscribe(this.f5433a, str, reportEntry);
        } else {
            try {
                ErrorEnum a2 = v.a(this.f5433a);
                if (a2 != ErrorEnum.SUCCESS) {
                    throw a2.toApiException();
                } else if (NetWorkUtil.getNetworkType(this.f5433a) != 0) {
                    SubscribeReq subscribeReq = new SubscribeReq(this.f5433a, str2, str);
                    subscribeReq.setToken(BaseUtils.getLocalToken(this.f5433a, null));
                    if (d.b()) {
                        return this.b.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
                    }
                    return this.b.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
                } else {
                    HMSLog.e("HmsMessaging", "no network");
                    throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
                }
            } catch (ApiException e) {
                fdt fdtVar = new fdt();
                fdtVar.c(e);
                PushBiUtil.reportExit(this.f5433a, PushNaming.SUBSCRIBE, reportEntry, e.getStatusCode());
                return fdtVar.b();
            } catch (Exception unused) {
                fdt fdtVar2 = new fdt();
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                fdtVar2.c(errorEnum.toApiException());
                PushBiUtil.reportExit(this.f5433a, PushNaming.SUBSCRIBE, reportEntry, errorEnum);
                return fdtVar2.b();
            }
        }
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        HmsMessaging hmsMessaging;
        synchronized (HmsMessaging.class) {
            hmsMessaging = new HmsMessaging(context);
        }
        return hmsMessaging;
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.f5433a);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() == null) {
            HMSLog.i("HmsMessaging", "send upstream message");
            a(remoteMessage);
            return;
        }
        HMSLog.e("HmsMessaging", "Operation(send) unsupported");
        throw new UnsupportedOperationException("Operation(send) unsupported");
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.f5433a, z);
    }

    public tct<Void> subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public tct<Void> turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.f5433a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public tct<Void> turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.f5433a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public tct<Void> unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }

    private void a(RemoteMessage remoteMessage) {
        String reportEntry = PushBiUtil.reportEntry(this.f5433a, PushNaming.UPSEND_MSG);
        ErrorEnum a2 = v.a(this.f5433a);
        if (a2 != ErrorEnum.SUCCESS) {
            HMSLog.e("HmsMessaging", "Message sent failed:" + a2.getExternalCode() + f7l.CONDITION_IF_MIDDLE + a2.getMessage());
            PushBiUtil.reportExit(this.f5433a, PushNaming.UPSEND_MSG, reportEntry, a2);
            throw new UnsupportedOperationException(a2.getMessage());
        } else if (TextUtils.isEmpty(remoteMessage.getTo())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.f5433a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        } else if (TextUtils.isEmpty(remoteMessage.getMessageId())) {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
            PushBiUtil.reportExit(this.f5433a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
        } else if (!TextUtils.isEmpty(remoteMessage.getData())) {
            UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
            upSendMsgReq.setPackageName(this.f5433a.getPackageName());
            upSendMsgReq.setMessageId(remoteMessage.getMessageId());
            upSendMsgReq.setTo(remoteMessage.getTo());
            upSendMsgReq.setData(remoteMessage.getData());
            upSendMsgReq.setMessageType(remoteMessage.getMessageType());
            upSendMsgReq.setTtl(remoteMessage.getTtl());
            upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
            upSendMsgReq.setSendMode(remoteMessage.getSendMode());
            upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
            if (d.b()) {
                this.b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), reportEntry));
            } else {
                a(upSendMsgReq, reportEntry);
            }
        } else {
            HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
            PushBiUtil.reportExit(this.f5433a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'data' missing");
        }
    }

    private tct<Void> a(boolean z) {
        String reportEntry = PushBiUtil.reportEntry(this.f5433a, PushNaming.SET_NOTIFY_FLAG);
        if (!d.d(this.f5433a) || d.b()) {
            HMSLog.i("HmsMessaging", "turn on/off with AIDL");
            EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
            enableNotifyReq.setPackageName(this.f5433a.getPackageName());
            enableNotifyReq.setEnable(z);
            return this.b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), reportEntry));
        } else if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
            HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
            fdt fdtVar = new fdt();
            ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
            fdtVar.c(errorEnum.toApiException());
            PushBiUtil.reportExit(this.f5433a, PushNaming.SET_NOTIFY_FLAG, reportEntry, errorEnum);
            return fdtVar.b();
        } else if (d.b(this.f5433a) < 90101310) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
            Context context = this.f5433a;
            Intent putExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(context, this.f5433a.getPackageName() + "#" + z));
            putExtra.setPackage("android");
            return rft.b(new IntentCallable(this.f5433a, putExtra, reportEntry));
        } else if (d.b(this.f5433a) < 110118300) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
            new PushPreferences(this.f5433a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Uri parse = Uri.parse("content://" + this.f5433a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
            Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
            intent.putExtra("type", "enalbeFlag");
            intent.putExtra(PushClientConstants.TAG_PKG_NAME, this.f5433a.getPackageName());
            intent.putExtra("url", parse);
            intent.setPackage("android");
            return rft.b(new IntentCallable(this.f5433a, intent, reportEntry));
        } else {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v3");
            if (TextUtils.isEmpty(BaseUtils.getLocalToken(this.f5433a, null))) {
                fdt fdtVar2 = new fdt();
                fdtVar2.c(ErrorEnum.ERROR_NO_TOKEN.toApiException());
                return fdtVar2.b();
            }
            new PushPreferences(this.f5433a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Intent intent2 = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG");
            intent2.putExtra("enalbeFlag", z);
            intent2.putExtra(RemoteMessageConst.DEVICE_TOKEN, BaseUtils.getLocalToken(this.f5433a, null));
            intent2.putExtra(PushClientConstants.TAG_PKG_NAME, this.f5433a.getPackageName());
            intent2.putExtra("uid", this.f5433a.getApplicationInfo().uid);
            intent2.setPackage("android");
            return rft.b(new IntentCallable(this.f5433a, intent2, reportEntry));
        }
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.f5433a, null));
        try {
            this.b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.f5433a, PushNaming.UPSEND_MSG, str, ((ApiException) e.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.f5433a, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }
}
