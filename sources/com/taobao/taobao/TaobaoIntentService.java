package com.taobao.taobao;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoBaseIntentService;
import com.taobao.android.base.Versions;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.bt4;
import tb.ii0;
import tb.t2o;
import tb.vu3;
import tb.zh0;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaobaoIntentService extends TaobaoBaseIntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251200);
    }

    public static long c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44fc52ef", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null) {
            return -1L;
        }
        try {
            return d(jSONObject.getJSONObject(Constants.KEY_EXTS));
        } catch (Throwable th) {
            TLog.loge("TaobaoIntentService", "getValidBizTypeInBody error, " + Log.getStackTraceString(th));
            th.printStackTrace();
            return -1L;
        }
    }

    public static long d(JSONObject jSONObject) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("430a141f", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("bizType") || (l = jSONObject.getLong("bizType")) == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static long e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a91275", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null) {
            return -1L;
        }
        try {
            return f(jSONObject.getJSONObject(Constants.KEY_EXTS));
        } catch (Throwable th) {
            TLog.loge("TaobaoIntentService", "getValidIdInBody error, " + Log.getStackTraceString(th));
            th.printStackTrace();
            return -1L;
        }
    }

    public static long f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("feb6d3a5", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null || !jSONObject.containsKey("msg_type_id")) {
            return -1L;
        }
        long parseLong = Long.parseLong(jSONObject.getString("msg_type_id"));
        if (parseLong > 0) {
            return parseLong;
        }
        return -1L;
    }

    public static /* synthetic */ Object ipc$super(TaobaoIntentService taobaoIntentService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/TaobaoIntentService");
    }

    public static void j(Intent intent, Context context, boolean z) {
        JSONObject jSONObject;
        InnerPushNotification innerPushNotification;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2bc1cb6", new Object[]{intent, context, new Boolean(z)});
        } else if (context != null && intent != null) {
            if (Versions.isDebug()) {
                TLog.loge("TaobaoIntentService", "agooExt:" + intent.getStringExtra(AgooConstants.MESSAGE_EXT));
            }
            try {
                JSONObject parseObject = JSON.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT));
                String string = parseObject.getString(Constants.KEY_CMD_TYPE);
                String string2 = parseObject.getString("cmdValue");
                if (TextUtils.equals(string, "1") && !TextUtils.isEmpty(string)) {
                    TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_recall_onmessage_id", Boolean.valueOf(ii0.g().d(string2)), null, null, "messageId=" + string2);
                    TLog.loge("TaobaoIntentService", "notifyProcess, cmdValue = " + string2);
                    return;
                }
            } catch (Throwable th) {
                TLog.loge("TaobaoIntentService", Log.getStackTraceString(th));
                Log.e("TaobaoIntentService", "cmd handle error,e=" + th);
            }
            String str = "";
            try {
                str = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
                TLog.loge("TaobaoIntentService", "TaobaoIntentService,onUserMessag=" + str);
            } catch (Throwable th2) {
                TLog.loge("TaobaoIntentService", Log.getStackTraceString(th2));
                Log.e("TaobaoIntentService", "onMessage get body error,e=" + Log.getStackTraceString(th2));
                EnvUtil.alarmCommitFail(EnvUtil.AGOO_PUSH_DATA_PROCESS_FAIL, "TaobaoIntentService.notifyProcess get body crash");
            }
            try {
                jSONObject = JSON.parseObject(str);
            } catch (Throwable th3) {
                Log.e("TaobaoIntentService", "JSONObject.parseObject error,e = " + Log.getStackTraceString(th3));
                jSONObject = null;
            }
            if (!h(jSONObject) || !z) {
                innerPushNotification = null;
            } else {
                TLog.loge("TaobaoIntentService", " isMessageBoxCanHandle and isProcessRight");
                new Intent().putExtra("taobao_msg_intent", intent);
                innerPushNotification = zh0.a(intent, Globals.getApplication());
                if (innerPushNotification != null) {
                    innerPushNotification.show();
                } else {
                    TLog.loge("TaobaoIntentService", "AgooInnerNotificationFactory.createAgooNotification returns null");
                }
            }
            if (i(jSONObject)) {
                TLog.loge("TaobaoIntentService", "isNotifyMessage true");
            } else if (!bt4.f(intent)) {
                TLog.loge("TaobaoIntentService", "agoo server notifPop enable false");
            } else if (innerPushNotification == null || !(innerPushNotification.getInnerNotificationAdapter() instanceof MarketingInnerNotificationAdapter) || ((MarketingInnerNotificationAdapter) innerPushNotification.getInnerNotificationAdapter()).getshowSystemNotification()) {
                boolean k = ii0.g().k(intent, null);
                TLog.loge("TaobaoIntentService", "TaobaoIntentService, notificationFlag = " + k);
                if (!k) {
                    Intent intent2 = new Intent("com.taobao.taobao.TAOBAO_AGOO_MSG_ACTION");
                    intent2.putExtra("taobao_agoo_msg", str);
                    Globals.getApplication().sendBroadcast(intent2);
                }
            }
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onError(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d9be22", new Object[]{this, context, str});
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onMessage(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853839b6", new Object[]{this, context, intent});
        } else {
            g(context, intent);
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService, org.android.agoo.control.BaseIntentService
    public void onRegistered(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214ccca", new Object[]{this, context, str});
        }
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    public void onUnregistered(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c11c11", new Object[]{this, context, str});
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask<Object, Void, Object[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(588251201);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/TaobaoIntentService$NotifyProcessTask");
        }

        /* renamed from: a */
        public Object[] doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("aebd08d", new Object[]{this, objArr});
            }
            Context context = (Context) objArr[0];
            Intent intent = (Intent) objArr[1];
            try {
                JSONObject parseObject = JSON.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT));
                String string = parseObject.getString(Constants.KEY_CMD_TYPE);
                String string2 = parseObject.getString("cmdValue");
                if (TextUtils.equals(string, "1") && !TextUtils.isEmpty(string)) {
                    boolean d = ii0.g().d(string2);
                    Boolean valueOf = Boolean.valueOf(d);
                    TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_recall_onmessage_id", valueOf, null, null, "messageId=" + string2);
                    if (d) {
                        TLog.loge("TaobaoIntentService", "cancel result  true, cmdValue = " + string2);
                        return null;
                    }
                }
            } catch (Throwable th) {
                TLog.loge("TaobaoIntentService", Log.getStackTraceString(th));
                Log.e("TaobaoIntentService", "cmd handle error,e=" + th);
            }
            if (EnvUtil.isProcessRight(context)) {
                Intent createComandIntent = IntentUtil.createComandIntent(context, "commandSoundProcess");
                createComandIntent.putExtra("intentKey", intent);
                if (Globals.getApplication() != null) {
                    Globals.getApplication().sendBroadcast(createComandIntent);
                } else {
                    context.sendBroadcast(createComandIntent);
                }
                TLog.loge("TaobaoIntentService", " processed in mainprocess");
                return null;
            }
            TLog.loge("TaobaoIntentService", " not processed in mainprocess");
            return objArr;
        }

        /* renamed from: b */
        public void onPostExecute(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7672734", new Object[]{this, objArr});
            } else if (objArr != null) {
                TLog.loge("TaobaoIntentService", "process in this process, " + objArr);
                TaobaoIntentService.j((Intent) objArr[1], (Context) objArr[0], false);
            }
        }
    }

    public static boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ecc28e3", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            if (i(jSONObject)) {
                return true;
            }
            if (!TextUtils.isEmpty(jSONObject.getString("title"))) {
                return e(jSONObject) > 0 || c(jSONObject) > 0;
            }
            TLog.loge("TaobaoIntentService", "isMessageBoxCanHandle, title is empty");
            return false;
        } catch (Throwable th) {
            TLog.loge("TaobaoIntentService", "isMessageBoxCanHandle error, " + Log.getStackTraceString(th));
            return false;
        }
    }

    public static boolean i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9fd3859", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            Long l = jSONObject.getLong("notification_type");
            TLog.loge("TaobaoIntentService", "isNotifyMessage, notificationType = " + l);
            if (l != null) {
                if (l.longValue() > 1) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TLog.loge("TaobaoIntentService", "isNotifyMessage error, " + Log.getStackTraceString(th));
            return false;
        }
    }

    @MethodSpy(name = "agooArrive")
    public static void g(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f55e7f", new Object[]{context, intent});
            return;
        }
        String str = "";
        AppMonitor.Counter.commit("accs", "agoo_arrive_onmessage", str, vu3.b.GEO_NOT_SUPPORT);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_onmessage");
        TLog.loge("agoo_push", "agoo_arrive_onmessage" + VExecutors.currentThread().getName());
        try {
            str = intent.getStringExtra("id");
        } catch (Exception e) {
            TLog.loge("agoo_push", Log.getStackTraceString(e));
        }
        AppMonitor.Counter.commit("accs", "agoo_arrive_onmessage_id", str, vu3.b.GEO_NOT_SUPPORT);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_onmessage_id", null, null, null, "messageId=" + str);
        new a().execute(context, intent);
    }
}
