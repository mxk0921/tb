package tb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.android.agoo.common.AgooConstants;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ji0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<a> c = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22004a;
    public final Map<String, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        PendingIntent process(Context context, Bundle bundle, int i);
    }

    static {
        t2o.a(588251147);
    }

    public ji0(Context context) {
        this.f22004a = context;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("showLoc", "0");
    }

    public static void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f5c78e", new Object[]{aVar});
        } else {
            ((CopyOnWriteArrayList) c).add(aVar);
        }
    }

    public static void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0aea67", new Object[]{aVar});
        } else {
            ((CopyOnWriteArrayList) c).remove(aVar);
        }
    }

    public final void e(Context context, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6598c92", new Object[]{this, context, bundle, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(context.getPackageName() + ".intent.action.NOTFIY_MESSAGE");
        intent.putExtra("click_message_type", str);
        intent.putExtras(bundle);
        intent.setPackage("com.taobao.taobao");
        context.sendBroadcast(intent);
    }

    public void g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7a6532", new Object[]{this, intent});
            return;
        }
        AppMonitor.Counter.commit("accs", BaseMonitor.COUNT_AGOO_CLICK, "delete", vu3.b.GEO_NOT_SUPPORT);
        String stringExtra = intent.getStringExtra("id");
        AppMonitor.Counter.commit("accs", "agoo_delete_id", stringExtra, vu3.b.GEO_NOT_SUPPORT);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_delete_id", null, null, null, "messageId=" + stringExtra);
        TLog.loge("agoo_push", "agoo_delete_id, messageId=" + stringExtra);
        TLog.loge("AgooNotifyReporter", "notification--delete[messageId:" + stringExtra + "]");
        TaobaoRegister.dismissMessage(this.f22004a, stringExtra, JSON.toJSONString(this.b));
    }

    public static PendingIntent b(Context context, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("e98212ee", new Object[]{context, bundle, new Integer(i)});
        }
        if (TextUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_business_switch", "AgooPushClickChangeSwitch", "0"))) {
            TLog.loge("agoo_push", "AgooPushClickChangeSwitch open");
            return null;
        }
        String string = bundle.getString(AgooConstants.MESSAGE_BODY);
        TLog.loge("AgooNotifyReporter", " agooBody :" + string);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(context.getApplicationInfo().packageName);
        intent.setData(Uri.parse("http://tb.cn/n/ww/notifyjump"));
        intent.setFlags(335544320);
        intent.putExtras(bundle);
        return ya.c(context, i + 1, intent, 134217728);
    }

    public final void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f674fc", new Object[]{this, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("command");
            y7t.a("AgooNotifyReporter", "AgooNotifyReporter,onUserCommand,command=" + stringExtra + ",intent=" + intent.toString());
            if (!TextUtils.isEmpty(stringExtra)) {
                intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
                if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                    g(intent);
                    e(this.f22004a, intent.getExtras(), "dismiss");
                } else if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED)) {
                    AppMonitor.Counter.commit("accs", BaseMonitor.COUNT_AGOO_CLICK, "click", vu3.b.GEO_NOT_SUPPORT);
                    String stringExtra2 = intent.getStringExtra("id");
                    AppMonitor.Counter.commit("accs", "agoo_click_id", stringExtra2, vu3.b.GEO_NOT_SUPPORT);
                    TLog.loge("agoo_push", "agoo_click_id, messageId=" + stringExtra2);
                    String stringExtra3 = intent.getStringExtra("show_type");
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        hashMap.put("show_type", stringExtra3);
                    }
                    if (p9k.c()) {
                        HashMap hashMap2 = new HashMap();
                        JSONObject jSONObject = JSON.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_BODY)).getJSONObject(Constants.KEY_EXTS);
                        if (jSONObject != null) {
                            String string = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                            if (!TextUtils.isEmpty(string)) {
                                try {
                                    for (Map.Entry<String, Object> entry : JSON.parseObject(string).entrySet()) {
                                        if (entry.getValue() instanceof String) {
                                            hashMap2.put(entry.getKey(), (String) entry.getValue());
                                        }
                                    }
                                    if (!hashMap2.isEmpty()) {
                                        hashMap.putAll(hashMap2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                    EnvUtil.UTClick(EnvUtil.createUTData("agoo^0^" + stringExtra2, stringExtra2, null, "0", null, null, hashMap), 0, intent.getStringExtra(TaobaoConstants.MESSAGE_URL));
                    StringBuilder sb = new StringBuilder();
                    sb.append("notification--read[messageId:");
                    sb.append(stringExtra2);
                    sb.append("]");
                    TaobaoRegister.clickMessage(this.f22004a, stringExtra2, JSON.toJSONString(this.b));
                    e(this.f22004a, intent.getExtras(), "click");
                }
            }
        } catch (Throwable th) {
            AppMonitor.Counter.commit("accs", "handleUserCommand_exception", "", vu3.b.GEO_NOT_SUPPORT);
            y7t.a("AgooNotifyReporter", "onUserCommand" + th.toString());
            TLog.loge("AgooNotifyReporter", Log.getStackTraceString(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.app.NotificationCompat.Builder a(androidx.core.app.NotificationCompat.Builder r22, android.content.Context r23, android.os.Bundle r24, int r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ji0.a(androidx.core.app.NotificationCompat$Builder, android.content.Context, android.os.Bundle, int, android.content.Intent):androidx.core.app.NotificationCompat$Builder");
    }
}
