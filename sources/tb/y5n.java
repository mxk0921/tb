package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.McsEventConstant$EventId;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.constant.ConfigConstant;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y5n {
    public int b;
    public int c;
    public int e;
    public int f;

    /* renamed from: a  reason: collision with root package name */
    public final List<NotificationSortMessage> f31871a = new ArrayList();
    public final List<String> d = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final y5n f31872a = new y5n();

        static {
            t2o.a(612368411);
        }
    }

    static {
        t2o.a(612368410);
    }

    public static y5n i() {
        return a.f31872a;
    }

    public final void a(ISortListener iSortListener, boolean z, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z, builder, this.d);
        }
    }

    public final DataMessage b(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMcs", "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put("clientStatisticData", statisticData);
            }
            dataMessage.setStatisticsExtra(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return dataMessage;
    }

    public final boolean c(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        boolean z = true;
        if (this.e + this.f < 3) {
            if (notificationSortMessage.getAutoDelete() == -1) {
                notificationSortMessage.setGroup("mcs." + context.getPackageName());
            } else {
                notificationSortMessage.setGroup("mcs.enable." + context.getPackageName());
            }
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            notificationSortMessage.setGroup("mcs." + context.getPackageName());
            int i = this.f;
            if (3 - i > 0) {
                e(context, notificationManager, 2 - i);
            } else {
                Notification a2 = j9k.a(context, notificationSortMessage.getGroup(), builder);
                if (a2 != null) {
                    notificationManager.notify(4096, a2);
                }
            }
        } else {
            z = o(context, notificationManager, notificationSortMessage);
        }
        if (z) {
            g(builder, notificationSortMessage);
        } else {
            xai.a(context, McsEventConstant$EventId.EVENT_ID_PUSH_NO_SHOW_BY_FOLD, b(context, notificationSortMessage));
        }
        return z;
    }

    public final void d(NotificationManager notificationManager, Context context) {
        m(j9k.b(notificationManager, context.getPackageName()));
    }

    public final void e(Context context, NotificationManager notificationManager, int i) {
        List<NotificationSortMessage> list = this.f31871a;
        p(list, i);
        r(context, notificationManager, list);
    }

    public final void f(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_NOTIFY_ID, notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                list2.add(b(context, notificationSortMessage));
                ((ArrayList) this.d).add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    public final void g(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, notificationSortMessage.getAutoDelete());
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, notificationSortMessage.getImportantLevel());
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
        bundle.putLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, System.currentTimeMillis());
        bundle.putBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, false);
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA, notificationSortMessage.getStatisticData());
        builder.addExtras(bundle);
        builder.setGroup(notificationSortMessage.getGroup());
    }

    public final boolean h(PushNotification.Builder builder, int i, int i2, String str, String str2) {
        Context q = b6n.s().q();
        if (builder == null || q == null) {
            return false;
        }
        NotificationManager c = j9k.c(q);
        NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i2, i, false, System.currentTimeMillis(), str2);
        if (!n(q, c, notificationSortMessage, builder)) {
            return true;
        }
        d(c, q);
        return c(c, q, builder, notificationSortMessage);
    }

    public final void j(int i) {
        if (i == -1) {
            this.f++;
        } else if (i == 1) {
            this.e++;
        }
    }

    public final void k(int i) {
        if (i == 7) {
            this.b++;
        } else if (i == 5) {
            this.c++;
        }
    }

    public final void l(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() == 1) {
            List<NotificationSortMessage> list = this.f31871a;
            if (((ArrayList) list).size() != 0) {
                for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
                    NotificationSortMessage notificationSortMessage2 = (NotificationSortMessage) ((ArrayList) list).get(size);
                    if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                        ((ArrayList) list).add(size + 1, notificationSortMessage2);
                        return;
                    }
                }
            }
            ((ArrayList) list).add(0, notificationSortMessage);
        }
    }

    public final void m(StatusBarNotification[] statusBarNotificationArr) {
        q();
        if (!(statusBarNotificationArr == null || statusBarNotificationArr.length == 0)) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                Bundle bundle = statusBarNotification.getNotification().extras;
                boolean z = bundle.getBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, true);
                long j = bundle.getLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, statusBarNotification.getPostTime());
                String string = bundle.getString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, "");
                int i = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, 1);
                int i2 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, 7);
                NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i2, i, z, j, statusBarNotification.getId(), bundle.getString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA));
                j(i);
                k(i2);
                l(notificationSortMessage);
            }
        }
    }

    public boolean n(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        int i;
        if (notificationSortMessage.getAutoDelete() == 0 || (i = Build.VERSION.SDK_INT) < 24 || i >= 30) {
            return false;
        }
        if (!j9k.d(notificationManager, context.getPackageName(), 4096)) {
            return true;
        }
        notificationSortMessage.setGroup("mcs." + context.getPackageName());
        g(builder, notificationSortMessage);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(android.content.Context r7, android.app.NotificationManager r8, com.heytap.msp.push.mode.NotificationSortMessage r9) {
        /*
            r6 = this;
            int r0 = r6.f
            r1 = 3
            r2 = 0
            if (r0 < r1) goto L_0x0007
            return r2
        L_0x0007:
            int r1 = 3 - r0
            int r3 = r9.getImportantLevel()
            r4 = 7
            r5 = 1
            if (r3 != r4) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            int r9 = r9.getImportantLevel()
            r3 = 5
            if (r9 != r3) goto L_0x0020
            int r9 = r6.b
            if (r9 >= r1) goto L_0x001e
        L_0x001d:
            r2 = 1
        L_0x001e:
            r5 = r2
            goto L_0x0028
        L_0x0020:
            int r9 = r6.b
            int r3 = r6.c
            int r9 = r9 + r3
            if (r9 >= r1) goto L_0x001e
            goto L_0x001d
        L_0x0028:
            if (r5 == 0) goto L_0x002f
            int r9 = 2 - r0
            r6.e(r7, r8, r9)
        L_0x002f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y5n.o(android.content.Context, android.app.NotificationManager, com.heytap.msp.push.mode.NotificationSortMessage):boolean");
    }

    public final int p(List<NotificationSortMessage> list, int i) {
        int i2;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        if (i <= 0 || i2 == 0) {
            return i;
        }
        if (i2 < i) {
            int i3 = i - i2;
            list.clear();
            return i3;
        }
        for (int i4 = 0; i4 < i; i4++) {
            list.remove((i2 - 1) - i4);
        }
        return 0;
    }

    public final void q() {
        this.e = 0;
        this.f = 0;
        this.b = 0;
        this.c = 0;
        ((ArrayList) this.f31871a).clear();
        ((ArrayList) this.d).clear();
    }

    public void s(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder != null) {
            a(iSortListener, h(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
        }
    }

    public final void r(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list != null && list.size() != 0) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            f(context, notificationManager, jSONArray, list, arrayList);
            if (jSONArray.length() != 0) {
                try {
                    jSONObject.put("SORT_ARRAY", jSONArray);
                    HeytapPushManager.cancelNotification(jSONObject);
                } catch (JSONException unused) {
                }
            }
            if (arrayList.size() != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(McsEventConstant$EventId.EVENT_ID_PUSH_DELETE_BY_FOLD, arrayList);
                StatisticUtils.statisticEvent(context, hashMap);
            }
        }
    }
}
