package com.taobao.msgnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.ji0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AgooNotificationReceiverForChannel extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251146);
    }

    public static /* synthetic */ Object ipc$super(AgooNotificationReceiverForChannel agooNotificationReceiverForChannel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/AgooNotificationReceiverForChannel");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if ("com.taobao.taobao.intent.action.COMMAND.channel".equals(action)) {
            String stringExtra = intent.getStringExtra("command");
            TLog.loge("AgooNotificationReceiverForChannel", "onReceive: actionCommand = " + stringExtra + ", action = " + action);
            if (!TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                return;
            }
            if (EnvUtil.isProcessRight(context)) {
                TLog.loge("AgooNotificationReceiverForChannel", "转发到主进程处理事件");
                Intent createComandIntent = IntentUtil.createComandIntent(context, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED);
                createComandIntent.setPackage("com.taobao.taobao");
                if (intent.getExtras() != null) {
                    createComandIntent.putExtras(intent);
                }
                context.sendBroadcast(createComandIntent);
                return;
            }
            TLog.loge("AgooNotificationReceiverForChannel", "handle message delete");
            try {
                new ji0(context).g(intent);
            } catch (Throwable th) {
                TLog.loge("AgooNotificationReceiverForChannel", "error:" + th.toString());
            }
        }
    }
}
