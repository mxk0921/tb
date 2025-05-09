package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.wireless.link.model.BrandVersion;
import com.taobao.wireless.link.model.MessageData;
import com.taobao.wireless.link.model.SupportBrandVersion;
import com.taobao.wireless.link.notification.NotificationBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q9k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Notification f26596a;
    public static NotificationManager b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26597a;

        public a(Context context) {
            this.f26597a = context;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            q9k.b(this.f26597a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26598a;

        public b(Context context) {
            this.f26598a = context;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            mr4.b().g = succPhenixEvent.getDrawable().getBitmap();
            q9k.l(this.f26598a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26599a;

        public c(Context context) {
            this.f26599a = context;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            q9k.b(this.f26599a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26600a;

        public d(Context context) {
            this.f26600a = context;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            mr4.b().h = succPhenixEvent.getDrawable().getBitmap();
            q9k.l(this.f26600a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26601a;

        public e(Context context) {
            this.f26601a = context;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            q9k.b(this.f26601a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26602a;

        public f(Context context) {
            this.f26602a = context;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            mr4.b().e = succPhenixEvent.getDrawable().getBitmap();
            q9k.l(this.f26602a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26603a;

        public g(Context context) {
            this.f26603a = context;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            mr4.b().f = succPhenixEvent.getDrawable().getBitmap();
            q9k.l(this.f26603a);
            return false;
        }
    }

    static {
        t2o.a(1030750302);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ed841d", new Object[]{context});
        } else if (context != null) {
            mr4.b().j = "false";
            mr4.b().k = "false";
            cno b2 = cno.b(context);
            b2.d("isShowNotifi", "false");
            b2.d("isShowNotifiSwitch", "false");
            NotificationManager notificationManager = b;
            if (notificationManager != null) {
                notificationManager.cancel(20191111);
                irg.a("link_tag", "NotificationUtils === closeNotificationMessage === 取消通知");
            }
            esg.b(esg.ARG1_NOTIFICATION_SWITCH_STATE, "false", "", null);
        }
    }

    public static RemoteViews d(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("13a4a74d", new Object[]{context, messageData});
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_bar);
        if (messageData != null && !TextUtils.isEmpty(messageData.noti_text_title)) {
            remoteViews.setTextViewText(R.id.tv_name, messageData.noti_text_title);
        }
        if (mr4.b().e != null) {
            remoteViews.setImageViewBitmap(R.id.iv_title_logo, mr4.b().e);
        }
        if (mr4.b().f != null) {
            remoteViews.setImageViewBitmap(R.id.iv_setting, mr4.b().f);
        }
        if (mr4.b().g != null) {
            remoteViews.setImageViewBitmap(R.id.iv_left_logo, mr4.b().g);
        }
        if (messageData != null && !TextUtils.isEmpty(messageData.noti_text_hc)) {
            remoteViews.setTextViewText(R.id.tv_left_name, messageData.noti_text_hc);
        }
        if (mr4.b().h != null) {
            remoteViews.setImageViewBitmap(R.id.iv_right_logo, mr4.b().h);
        }
        if (messageData != null && !TextUtils.isEmpty(messageData.noti_text_hd)) {
            remoteViews.setTextViewText(R.id.tv_right_name, messageData.noti_text_hd);
        }
        return remoteViews;
    }

    public static MessageData e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageData) ipChange.ipc$dispatch("17bdbd8d", new Object[]{context});
        }
        MessageData messageData = mr4.b().f24246a;
        return TextUtils.isEmpty(messageData.noti_type) ? (MessageData) cno.b(context).a("message_data", new MessageData()) : messageData;
    }

    public static void i(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff76e99", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        esg.b(str2, mr4.b().f24246a.message_id, str, null);
        jsg.v(context, str3, str, str4, str5);
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5fa80dd", new Object[]{context});
            return;
        }
        try {
            MessageData e2 = e(context);
            s0m.B().N0(context).T(e2.noti_picUrl_hc).succListener(new b(context)).failListener(new a(context)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "1111").fetch();
            s0m.B().N0(context).T(e2.noti_picUrl_hd).succListener(new d(context)).failListener(new c(context)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "1111").fetch();
            s0m.B().N0(context).T(e2.noti_title_left).succListener(new f(context)).failListener(new e(context)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "1111").fetch();
            s0m.B().N0(context).T("https://gw.alicdn.com/tfs/TB1Cyhfe1P2gK0jSZFoXXauIVXa-66-66.png").succListener(new g(context)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "1111").fetch();
        } catch (Exception e3) {
            irg.a("link_tag", "NotificationUtils === loadPic 异常：" + e3.getMessage());
        }
    }

    public static void m(Context context, RemoteViews remoteViews, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7c9890", new Object[]{context, remoteViews, messageData});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.ll_left_zone));
        arrayList.add(Integer.valueOf(R.id.ll_right_zone));
        arrayList.add(Integer.valueOf(R.id.iv_setting));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Intent intent = new Intent(context, NotificationBroadcastReceiver.class);
            if (num.intValue() == R.id.ll_left_zone) {
                intent.putExtra(ActivityJumpUtil.LANDING_URL, messageData.noti_linkUrl_hc);
                intent.setAction("com.taobao.taobao.notification_left");
            } else if (num.intValue() == R.id.ll_right_zone) {
                intent.putExtra(ActivityJumpUtil.LANDING_URL, messageData.noti_linkUrl_hd);
                intent.setAction("com.taobao.taobao.notification_right");
            } else if (num.intValue() == R.id.iv_setting) {
                intent.putExtra(ActivityJumpUtil.LANDING_URL, "http%3A%2F%2Fm.taobao.com%2Fgo%2Fmytaobaocommonsettings");
                intent.setAction("com.taobao.taobao.notification_set");
            }
            remoteViews.setOnClickPendingIntent(num.intValue(), ya.e(context, (int) System.currentTimeMillis(), intent, 134217728));
        }
    }

    public static void o(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f732686", new Object[]{context, new Boolean(z)});
            return;
        }
        cno b2 = cno.b(context);
        if (z) {
            mr4.b().j = "true";
            mr4.b().k = "true";
            b2.d("isShowNotifi", "true");
            b2.d("isShowNotifiSwitch", "true");
            return;
        }
        mr4.b().j = "false";
        b2.d("isShowNotifi", "false");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0138fe", new Object[]{context});
        } else if (context != null) {
            o(context, false);
            NotificationManager notificationManager = b;
            if (notificationManager != null) {
                notificationManager.cancel(20191111);
                irg.a("link_tag", "NotificationUtils === closeNotification === 取消通知");
            }
            esg.b(esg.ARG1_NOTIFICATION_SWITCH_STATE, "false", "", null);
        }
    }

    public static void c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e57670", new Object[]{context, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                irg.a("link_tag", "NotificationUtils === dealWithNotification === 收到orange推送，处理消息：canShowNotification=" + mr4.b().j);
                if (!f(0) && f26596a != null) {
                    b(context);
                }
            } else if (f(0)) {
                if (!TextUtils.isEmpty(e(context).noti_type)) {
                    k(context);
                }
            }
        } catch (Throwable th) {
            TLog.loge("linkManager", "assistant", "启动或者orange异常=" + th);
        }
    }

    public static boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55bb7739", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            String str = mr4.b().j;
            if (TextUtils.isEmpty(str)) {
                str = (String) cno.b(ypg.e().f32260a).a("isShowNotifi", "false");
            }
            return TextUtils.equals(str, "true");
        } catch (Exception e2) {
            irg.a("link_tag", "NotificationUtils === getSwitchState === 获取开关状态异常：" + e2.getMessage());
            return false;
        }
    }

    public static boolean g(Context context) {
        List<BrandVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26aeaaed", new Object[]{context})).booleanValue();
        }
        try {
            SupportBrandVersion supportBrandVersion = ypg.e().c.f;
            if (supportBrandVersion == null) {
                supportBrandVersion = (SupportBrandVersion) cno.b(context).a("notificationSupportBrandVersion", new SupportBrandVersion());
            }
            if (!(supportBrandVersion == null || (list = supportBrandVersion.supportBrandVersion) == null)) {
                for (BrandVersion brandVersion : list) {
                    String str = brandVersion.brand;
                    String str2 = Build.MANUFACTURER;
                    if (str.contains(str2.toLowerCase())) {
                        String str3 = brandVersion.version;
                        String str4 = Build.VERSION.RELEASE;
                        if (str3.contains(str4)) {
                            irg.a("link_tag", "NotificationUtils === isInWhiteLIst === 系统版本为：" + str4 + " 手机厂商为：" + str2.toLowerCase() + "，支持通知栏功能");
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            irg.a("link_tag", "NotificationUtils === isInWhiteLIst === 获取小助手支持的品牌和系统版本异常=" + e2.getMessage());
        }
        return false;
    }

    public static boolean h(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c5396e5", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            cno b2 = cno.b(ypg.e().f32260a);
            str = mr4.b().k;
            if (TextUtils.isEmpty(str)) {
                str = (String) b2.a("isShowNotifiSwitch", "false");
            }
        } catch (Throwable th) {
            irg.a("link_tag", "NotificationUtils === isShowSwitch === 获取开关状态异常：" + th.getMessage());
        }
        if (!f(0)) {
            if (!TextUtils.equals("true", str)) {
                return false;
            }
        }
        return true;
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8ef4ec", new Object[]{context});
        } else if (context != null) {
            j(context);
            MessageData e2 = e(context);
            irg.a("link_tag", "NotificationUtils === openNotification === 开始绘制通知");
            o(context, true);
            Notification n = n(context, e2, false);
            NotificationManager notificationManager = b;
            if (notificationManager != null) {
                notificationManager.notify(20191111, n);
                irg.a("link_tag", "NotificationUtils === openNotification === 通知绘制完成");
            }
            esg.b(esg.ARG1_NOTIFICATION_SWITCH_STATE, "true", "", null);
        }
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648d1f7b", new Object[]{context});
        } else if (f(0)) {
            irg.a("link_tag", "NotificationUtils === refreshNotification == 刷新消息");
            Notification n = n(context, e(context), true);
            f26596a = n;
            if (n != null) {
                b.notify(20191111, n);
            }
        }
    }

    public static Notification n(Context context, MessageData messageData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("14aeb04c", new Object[]{context, messageData, new Boolean(z)});
        }
        if (context == null) {
            return f26596a;
        }
        irg.a("link_tag", "NotificationUtils === showNotification === 绘制通知");
        if (!z) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", messageData.message_id);
            hashMap.put("hc_url", messageData.noti_linkUrl_hd);
            hashMap.put("hd_url", messageData.noti_linkUrl_hc);
            esg.b(esg.ARG1_NOTIFICATION_EXPOSE, "", "", hashMap);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.assistant_logo);
        builder.setOngoing(true);
        builder.setPriority(2);
        RemoteViews d2 = d(context, messageData);
        m(context, d2, messageData);
        b = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (Build.VERSION.SDK_INT >= 26) {
            b.createNotificationChannel(aig.a("淘宝小助手", "天猫双十一", 3));
            builder.setChannelId("淘宝小助手");
            irg.a("link_tag", "NotificationUtils === showNotification === 设置通知channel");
        }
        irg.a("link_tag", "NotificationUtils === showNotification === 设置通知布局");
        builder.setCustomContentView(d2);
        Notification build = builder.build();
        f26596a = build;
        return build;
    }
}
