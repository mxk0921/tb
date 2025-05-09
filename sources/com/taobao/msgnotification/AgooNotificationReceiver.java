package com.taobao.msgnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.TaobaoIntentService;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.ji0;
import tb.p9k;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AgooNotificationReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251145);
    }

    public static Intent c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("9e8ecd84", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        intent.putExtra("is_agoo_notify", true);
        return intent;
    }

    public static /* synthetic */ Object ipc$super(AgooNotificationReceiver agooNotificationReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/AgooNotificationReceiver");
    }

    public final String a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c72cc0f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                jSONObject = parseObject.getJSONObject(Constants.KEY_EXTS);
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.getJSONObject(MarketingInnerNotificationAdapter.IN_APP_PUSH);
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                jSONObject3 = jSONObject2.getJSONObject("inAppPushTemplateData");
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                return jSONObject3.getString("checkBizCode");
            }
            return null;
        } catch (Throwable th) {
            TLog.loge("AgooNotificationReceiver", "get checkBizCode error, " + Log.getStackTraceString(th));
            return null;
        }
    }

    public final void d(Intent intent) {
        Intent intent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d19f488", new Object[]{this, intent});
            return;
        }
        String a2 = a(intent.getStringExtra(AgooConstants.MESSAGE_BODY));
        if (TextUtils.isEmpty(a2) && (intent.getParcelableExtra("intentKey") instanceof Intent) && (intent2 = (Intent) intent.getParcelableExtra("intentKey")) != null) {
            a2 = a(intent2.getStringExtra(AgooConstants.MESSAGE_BODY));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("push_receive_intent", intent.toString());
        hashMap.put("is_agoo_notify", "true");
        if (a2 != null) {
            hashMap.put("checkBizCode", a2);
        }
        EnvUtil.UTReceive(hashMap);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            String agooCommand = IntentUtil.getAgooCommand(context);
            TLog.loge("AgooNotificationReceiver", "onReceive: actionCommand = " + agooCommand + ", action = " + action);
            if (TextUtils.equals(action, agooCommand)) {
                try {
                    c(intent);
                    b(context, intent);
                    d(intent);
                } catch (Throwable th) {
                    y7t.a("AgooNotificationReceiver", "AgooNotificationReceiver onUserCommand is error,e=" + th.toString());
                    TLog.loge("AgooNotificationReceiver", Log.getStackTraceString(th));
                }
            }
        }
    }

    @MethodSpy(name = "clickNotification")
    public static void b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65eec175", new Object[]{context, intent});
            return;
        }
        String stringExtra = intent.getStringExtra("command");
        ji0 ji0Var = new ji0(context);
        if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED) || TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
            ji0Var.c(intent);
            if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED)) {
                String stringExtra2 = intent.getStringExtra("id");
                String stringExtra3 = intent.getStringExtra("notifyContentTargetUrl");
                if (TextUtils.isEmpty(stringExtra3)) {
                    stringExtra3 = intent.getStringExtra(TaobaoConstants.MESSAGE_URL);
                }
                TLog.loge("AgooNotificationReceiver", " targetUrl " + stringExtra3);
                if (TextUtils.isEmpty(stringExtra3)) {
                    stringExtra3 = "http://tb.cn/n/ww/p";
                }
                Bundle bundleExtra = intent.getBundleExtra("notifyContentParamBundleKey");
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString("notifyContentIntentBody", intent.getStringExtra(AgooConstants.MESSAGE_BODY));
                if (stringExtra2 != null) {
                    bundleExtra.putString("AliAgooMsgID", stringExtra2);
                }
                TLog.loge("AgooNotificationReceiver", " agooId " + stringExtra2);
                if (TextUtils.isEmpty(stringExtra2)) {
                    TLog.loge("AgooNotificationReceiver", " COMMAND_SOUND_PROCESS ");
                }
                p9k.b(context, stringExtra3, bundleExtra);
            }
        } else if (TextUtils.equals(stringExtra, "commandSoundProcess")) {
            TaobaoIntentService.j(c((Intent) intent.getParcelableExtra("intentKey")), context, true);
        }
    }
}
