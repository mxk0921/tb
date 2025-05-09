package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.LruCache;
import com.alibaba.ability.localization.Localization;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.utl.UTMini;
import com.taobao.android.base.Versions;
import com.taobao.android.task.Coordinator;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ii0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LruCache<String, Integer> e = new LruCache<>(50);
    public final Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public NotificationManager f21319a = (NotificationManager) Globals.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION);
    public final PowerManager b = (PowerManager) Globals.getApplication().getSystemService("power");
    public final Map<String, List<IOldAgooNotification>> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f21320a;
        public final /* synthetic */ Intent b;

        public a(Intent intent, Intent intent2) {
            this.f21320a = intent;
            this.b = intent2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("agoo_push", "agoo_arrive_biz");
            try {
                str = this.f21320a.getStringExtra("id");
            } catch (Exception e) {
                TLog.loge("agoo_push", Log.getStackTraceString(e));
                str = "";
            }
            AppMonitor.Counter.commit("accs", "agoo_arrive_biz", str, vu3.b.GEO_NOT_SUPPORT);
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_biz", null, null, null, "messageId=" + str);
            TLog.loge("agoo_push", "agoo_arrive_biz, messageId=" + str);
            IOldAgooNotification b = gi0.b(this.f21320a, this.b, Globals.getApplication());
            if (b == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("arg1", "Page_Push_TBMSGPush_Agoo_Exception");
                hashMap.put("pushType", "localPush");
                EnvUtil.alarmCommitFail(hashMap, EnvUtil.AGOO_PUSH_LOCAL_PUSH_CONSTRUCT_ERROR, "AgooNotificationManger.sendNotify notification is null");
            } else if (b.getMergeType() == 1) {
                ii0.a(ii0.this, "agoo", b);
            } else {
                try {
                    b.performNotify();
                } catch (Throwable th) {
                    y7t.a("AgooNotificationManger", "sendNotify is error,e=" + th.toString());
                    TLog.loge("AgooNotificationManger", Log.getStackTraceString(th));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("arg1", "Page_Push_TBMSGPush_Agoo_Exception");
                    hashMap2.put("pushType", "localPush");
                    EnvUtil.alarmCommitFail(hashMap2, EnvUtil.AGOO_PUSH_LOCAL_PUSH_SHOW_ERROR, "AgooNotificationManger.sendNotify try performNotify error");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ii0 f21322a = new ii0();

        static {
            t2o.a(588251144);
        }

        public static /* synthetic */ ii0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ii0) ipChange.ipc$dispatch("2ec53c47", new Object[0]);
            }
            return f21322a;
        }
    }

    static {
        t2o.a(588251141);
    }

    public static /* synthetic */ void a(ii0 ii0Var, String str, IOldAgooNotification iOldAgooNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b60e1ab", new Object[]{ii0Var, str, iOldAgooNotification});
        } else {
            ii0Var.h(str, iOldAgooNotification);
        }
    }

    public static /* synthetic */ Map b(ii0 ii0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8960dcfc", new Object[]{ii0Var});
        }
        return ii0Var.d;
    }

    public static ii0 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ii0) ipChange.ipc$dispatch("ae72882c", new Object[0]);
        }
        return c.a();
    }

    public static /* synthetic */ String l(ii0 ii0Var, int i, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac0c647e", new Object[]{ii0Var, new Integer(i), strArr});
        }
        return ii0Var.m(i, strArr);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05b96d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (Versions.isDebug()) {
            StringBuilder sb = new StringBuilder("cancelNotify NotifyId=");
            sb.append(i);
            sb.append(", mNotifyManager=");
            sb.append(this.f21319a);
        }
        if (this.f21319a == null) {
            this.f21319a = (NotificationManager) Globals.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION);
        }
        try {
            if (i == 0) {
                this.f21319a.cancelAll();
            } else {
                this.f21319a.cancel(i);
            }
        } catch (Exception e) {
            y7t.a("AgooNotificationManger", "cacelNotify;" + e.getMessage());
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e87bb1d", new Object[]{this, str})).booleanValue();
        }
        Integer num = this.e.get(str);
        if (num == null) {
            return false;
        }
        c(num.intValue());
        this.e.remove(str);
        return true;
    }

    public NotificationManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationManager) ipChange.ipc$dispatch("be3c7512", new Object[]{this});
        }
        return this.f21319a;
    }

    public PowerManager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerManager) ipChange.ipc$dispatch("b5426ec3", new Object[]{this});
        }
        return this.b;
    }

    public final void h(String str, IOldAgooNotification iOldAgooNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6999d90d", new Object[]{this, str, iOldAgooNotification});
            return;
        }
        if (((ConcurrentHashMap) this.d).containsKey(str)) {
            ((List) ((ConcurrentHashMap) this.d).get(str)).add(iOldAgooNotification);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(iOldAgooNotification);
            ((ConcurrentHashMap) this.d).put(str, arrayList);
        }
        this.c.postDelayed(new b(str), 1000L);
    }

    @MethodSpy(name = "showNotification")
    public void i(String str, int i, Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f695f5f", new Object[]{this, str, new Integer(i), notification});
            return;
        }
        try {
            e().notify(i, notification);
            j(str, i);
        } catch (SecurityException e) {
            y7t.a("AgooNotificationManger", e.toString());
        }
    }

    public void j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b3c26f", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            this.e.put(str.split("&&")[0], Integer.valueOf(i));
        }
    }

    public boolean k(Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13b64976", new Object[]{this, intent, intent2})).booleanValue();
        }
        Coordinator.execute(new a(intent, intent2));
        return true;
    }

    public final String m(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d606d132", new Object[]{this, new Integer(i), strArr});
        }
        return ewy.a(Localization.q(i), strArr);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21321a;

        public b(String str) {
            this.f21321a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IOldAgooNotification iOldAgooNotification;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ii0.b(ii0.this).get(this.f21321a) != null && ((List) ii0.b(ii0.this).get(this.f21321a)).size() > 0) {
                List list = (List) ii0.b(ii0.this).get(this.f21321a);
                if (list.size() == 1) {
                    iOldAgooNotification = (IOldAgooNotification) list.get(0);
                } else {
                    iOldAgooNotification = (IOldAgooNotification) list.get(list.size() - 1);
                    iOldAgooNotification.setTitle(Localization.q(R.string.mp_notification_taobao));
                    iOldAgooNotification.setContent(ii0.l(ii0.this, R.string.mp_notification_have_unread_notification, new String[]{String.valueOf(list.size())}));
                    iOldAgooNotification.setUrl("http://m.taobao.com/go/msgcentercategory");
                }
                ((List) ii0.b(ii0.this).get(this.f21321a)).clear();
                try {
                    iOldAgooNotification.performNotify();
                } catch (Throwable th) {
                    y7t.a("AgooNotificationManger", "sendNotify is error,e=" + th.toString());
                    TLog.loge("AgooNotificationManger", Log.getStackTraceString(th));
                    HashMap hashMap = new HashMap();
                    hashMap.put("arg1", "Page_Push_TBMSGPush_Agoo_Exception");
                    hashMap.put("pushType", "localPush");
                    EnvUtil.alarmCommitFail(hashMap, EnvUtil.AGOO_PUSH_LOCAL_PUSH_SHOW_ERROR, "AgooNotificationManger.mergeNotification try performNotify error");
                }
            }
        }
    }
}
