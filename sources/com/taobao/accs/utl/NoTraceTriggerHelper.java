package com.taobao.accs.utl;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.impl.device.VolumeChangeListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.BaseConnection;
import com.taobao.adaemon.TriggerChannelService;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.brt;
import tb.c71;
import tb.j8l;
import tb.re;
import tb.t2o;
import tb.va8;
import tb.vu3;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NoTraceTriggerHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_TYPE_TP_TRIGGER = 14;
    public static final String TAG = "trace";
    public static String b;
    public static String c;
    public static String d;
    public static final Random random = new Random();

    /* renamed from: a  reason: collision with root package name */
    public static int f6094a = 0;
    public static final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.taobao.accs.utl.NoTraceTriggerHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile long f6095a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.accs.utl.NoTraceTriggerHelper$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f6096a;
            public final /* synthetic */ Context b;

            public a(Intent intent, Context context) {
                this.f6096a = intent;
                this.b = context;
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.accs.utl.NoTraceTriggerHelper$1$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class RunnableC0314a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ BaseConnection f6097a;
                public final /* synthetic */ Message b;

                public RunnableC0314a(BaseConnection baseConnection, Message message) {
                    this.f6097a = baseConnection;
                    this.b = message;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.i("trace", "send event request", "in channel process");
                    this.f6097a.L(this.b, true);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String action = this.f6096a.getAction();
                ALog.i("trace", "onReceive action:" + action, new Object[0]);
                if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                    i = 10;
                } else if (VolumeChangeListener.VOLUME_CHANGED_ACTION.equals(action)) {
                    i = 13;
                } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                    i = 15;
                } else if ("android.intent.action.HEADSET_PLUG".equals(action)) {
                    i = 11;
                } else if ("android.intent.action.MEDIA_MOUNTED".equals(action)) {
                    i = 12;
                } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                    i = 5;
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    ALog.e("trace", "Trigger SCREEN_ON", new Object[0]);
                    i = 1;
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    ALog.e("trace", "Trigger SCREEN_OFF", new Object[0]);
                    i = 3;
                } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                    i = 2;
                } else if (NoTraceTriggerHelper.b.equals(action)) {
                    i = 0;
                } else if (NoTraceTriggerHelper.c.equals(action)) {
                    i = 7;
                } else {
                    i = NoTraceTriggerHelper.d.equals(action) ? 14 : -1;
                }
                if (!"com.taobao.taobao".equals(this.b.getPackageName()) && j8l.A(this.b)) {
                    NoTraceTriggerHelper.g(this.b, null, 8, i);
                }
                if (j8l.w(this.b)) {
                    try {
                        if (!TextUtils.isEmpty(j8l.m(this.b))) {
                            JSONObject jSONObject = new JSONObject(j8l.m(this.b));
                            int i2 = jSONObject.getInt(Constants.KEY_EVENT_COLLECT_RANDOM_TIME_LIMIT);
                            int i3 = jSONObject.getInt(Constants.KEY_EVENT_COLLECT_REPORT_INTERVAL);
                            JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_EVENT_COLLECT_EVENT_ID_LIST);
                            int length = jSONArray.length();
                            int[] iArr = new int[length];
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                iArr[i4] = ((Integer) jSONArray.get(i4)).intValue();
                            }
                            for (int i5 = 0; i5 < length; i5++) {
                                if (iArr[i5] == i) {
                                    BaseConnection connection = va8.getConnection(this.b, "default", true, 0);
                                    if (connection == null) {
                                        ALog.e("trace", "connection is null in channel", new Object[0]);
                                        return;
                                    } else if (System.currentTimeMillis() - AnonymousClass1.a(AnonymousClass1.this) >= i3) {
                                        AnonymousClass1.b(AnonymousClass1.this, System.currentTimeMillis());
                                        brt.h().schedule(new RunnableC0314a(connection, Message.buildEventMessage(i, System.currentTimeMillis(), connection.l(null), "default", this.b)), NoTraceTriggerHelper.random.nextInt(i2), TimeUnit.MILLISECONDS);
                                        return;
                                    } else {
                                        ALog.i("trace", "min interval", new Object[0]);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                        ALog.e("trace", "send event request error", new Object[0]);
                    }
                }
            }
        }

        public static /* synthetic */ long a(AnonymousClass1 r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5f94deff", new Object[]{r4})).longValue();
            }
            return r4.f6095a;
        }

        public static /* synthetic */ long b(AnonymousClass1 r2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("765ac54b", new Object[]{r2, new Long(j)})).longValue();
            }
            r2.f6095a = j;
            return j;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/utl/NoTraceTriggerHelper$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                brt.h().execute(new a(intent, context));
            }
        }
    };
    public static ScheduledFuture<?> f = null;
    public static c g = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6098a;
        public final /* synthetic */ Bundle b;

        public a(Context context, Bundle bundle) {
            this.f6098a = context;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NoTraceTriggerHelper.e(this.f6098a, this.b, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6099a;
        public final /* synthetic */ Bundle b;

        public b(Context context, Bundle bundle) {
            this.f6099a = context;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NoTraceTriggerHelper.d(this.f6099a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f6100a;
        private final long b;

        static {
            t2o.a(343933250);
        }

        public c(long j, Bundle bundle) {
            this.b = j;
            this.f6100a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() < this.b) {
                NoTraceTriggerHelper.e(re.r(), this.f6100a, false);
            } else if (NoTraceTriggerHelper.a() != null) {
                NoTraceTriggerHelper.a().cancel(false);
            }
        }
    }

    static {
        t2o.a(343933242);
    }

    public static /* synthetic */ ScheduledFuture a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("1f5966b5", new Object[0]);
        }
        return f;
    }

    public static void e(Context context, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac735a8", new Object[]{context, bundle, new Boolean(z)});
        } else if (z) {
            brt.h().execute(new b(context, bundle));
        } else {
            d(context, bundle);
        }
    }

    public static void f(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9ad70", new Object[]{context, str, new Integer(i)});
        } else if (!"com.taobao.taobao".equals(context.getPackageName()) && j8l.A(context)) {
            h(j8l.r(context), context, str, i, -1);
        }
    }

    public static void g(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6c7393", new Object[]{context, str, new Integer(i), new Integer(i2)});
        } else if (!"com.taobao.taobao".equals(context.getPackageName()) && j8l.A(context)) {
            h(j8l.r(context), context, str, i, i2);
        }
    }

    public static void h(String str, Context context, String str2, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a343c9", new Object[]{str, context, str2, new Integer(i), new Integer(i2)});
            return;
        }
        String str3 = "packageName";
        String str4 = "main";
        String str5 = "channel";
        String str6 = "type";
        String str7 = TriggerChannelService.EXTRA_ORIGIN;
        try {
            if (i != 4 && i != 3 && i != 6) {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() != 0) {
                    int i4 = 0;
                    while (i4 < jSONArray.length()) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i4);
                        if (jSONObject != null) {
                            String string = jSONObject.getString("package");
                            Bundle bundle = new Bundle();
                            jSONArray = jSONArray;
                            bundle.putString(str7, context.getPackageName());
                            bundle.putInt(str6, i);
                            bundle.putInt(str5, f6094a);
                            bundle.putBoolean(str4, true);
                            bundle.putString(str3, string);
                            JSONArray jSONArray2 = jSONObject.getJSONArray(Constants.KEY_PULL_SCENE);
                            int length = jSONArray2.length();
                            str3 = str3;
                            int[] iArr = new int[length];
                            str4 = str4;
                            str5 = str5;
                            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                                iArr[i5] = ((Integer) jSONArray2.get(i5)).intValue();
                            }
                            int i6 = 0;
                            while (i6 < length) {
                                int i7 = iArr[i6];
                                if (i7 == 1 && i == 1) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (jSONObject.has(Constants.SP_KEY_LAST_TRIGGER_TIME)) {
                                        currentTimeMillis = jSONObject.getLong(Constants.SP_KEY_LAST_TRIGGER_TIME);
                                    }
                                    str6 = str6;
                                    if (UtilityImpl.isSameDay(currentTimeMillis, System.currentTimeMillis())) {
                                        int i8 = jSONObject.getInt(Constants.KEY_TIMES);
                                        int i9 = jSONObject.has(Constants.SP_KEY_TRIGGER_TIMES) ? jSONObject.getInt(Constants.SP_KEY_TRIGGER_TIMES) : 0;
                                        if (i9 < i8) {
                                            str7 = str7;
                                            brt.h().schedule(new a(context, bundle), random.nextInt(jSONObject.getInt(Constants.KEY_DELAY_CEILING)), TimeUnit.SECONDS);
                                            jSONObject.put(Constants.SP_KEY_TRIGGER_TIMES, i9 + 1);
                                            jSONObject.put(Constants.SP_KEY_LAST_TRIGGER_TIME, System.currentTimeMillis());
                                        } else {
                                            str7 = str7;
                                        }
                                    } else {
                                        str7 = str7;
                                        jSONObject.put(Constants.SP_KEY_TRIGGER_TIMES, 0);
                                    }
                                } else {
                                    str6 = str6;
                                    str7 = str7;
                                    if (i7 == 2 && i == 8) {
                                        if (i2 == 14) {
                                            ALog.e("trace", "do nothing", new Object[0]);
                                        } else {
                                            JSONArray jSONArray3 = jSONObject.getJSONArray(Constants.KEY_EVENT_LIST);
                                            int length2 = jSONArray3.length();
                                            int[] iArr2 = new int[length2];
                                            for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                                                iArr2[i10] = ((Integer) jSONArray3.get(i10)).intValue();
                                            }
                                            for (int i11 = 0; i11 < length2; i11++) {
                                                if (i2 == iArr2[i11]) {
                                                    long currentTimeMillis2 = System.currentTimeMillis();
                                                    if (jSONObject.has(Constants.SP_KEY_LAST_EVENT_TRIGGER_TIME)) {
                                                        currentTimeMillis2 = jSONObject.getLong(Constants.SP_KEY_LAST_EVENT_TRIGGER_TIME);
                                                    }
                                                    iArr2 = iArr2;
                                                    if (UtilityImpl.isSameDay(currentTimeMillis2, System.currentTimeMillis())) {
                                                        int i12 = jSONObject.getInt(Constants.KEY_EVENT_TIMES);
                                                        int i13 = jSONObject.has(Constants.SP_KEY_EVENT_TRIGGER_TIMES) ? jSONObject.getInt(Constants.SP_KEY_EVENT_TRIGGER_TIMES) : 0;
                                                        if (i13 < i12) {
                                                            e(context, bundle, false);
                                                            jSONObject.put(Constants.SP_KEY_EVENT_TRIGGER_TIMES, i13 + 1);
                                                            jSONObject.put(Constants.SP_KEY_LAST_EVENT_TRIGGER_TIME, System.currentTimeMillis());
                                                        }
                                                    } else {
                                                        jSONObject.put(Constants.SP_KEY_EVENT_TRIGGER_TIMES, 0);
                                                    }
                                                } else {
                                                    iArr2 = iArr2;
                                                }
                                            }
                                        }
                                    } else if (i7 == 3 && i == 7) {
                                        long j = jSONObject.getLong(Constants.KEY_CYCLE_CUT_OFF_TIME);
                                        int i14 = jSONObject.getInt(Constants.KEY_CYCLE_INTERVAL);
                                        if (System.currentTimeMillis() < j) {
                                            if (g == null) {
                                                g = new c(j, bundle);
                                            }
                                            ScheduledFuture<?> scheduledFuture = f;
                                            if (scheduledFuture != null) {
                                                scheduledFuture.cancel(false);
                                            }
                                            f = brt.h().scheduleAtFixedRate(g, 0L, i14, TimeUnit.MINUTES);
                                        }
                                        i3 = 1;
                                        i4 += i3;
                                    } else {
                                        i6++;
                                        str6 = str6;
                                        str7 = str7;
                                    }
                                }
                                i3 = 1;
                                i4 += i3;
                            }
                            str6 = str6;
                            str7 = str7;
                        } else {
                            jSONArray = jSONArray;
                            str7 = str7;
                            str3 = str3;
                            str4 = str4;
                            str5 = str5;
                            str6 = str6;
                        }
                        i3 = 1;
                        i4 += i3;
                    }
                    j8l.K(context, jSONArray.toString());
                }
            } else if (!TextUtils.isEmpty(str2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(str7, context.getPackageName());
                bundle2.putInt(str6, i);
                bundle2.putInt(str5, f6094a);
                bundle2.putBoolean(str4, true);
                bundle2.putString(str3, str2);
                e(context, bundle2, true);
            }
        } catch (Exception e2) {
            ALog.e("trace", "trigger error:", e2, new Object[0]);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e63721b", new Object[]{context});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction(VolumeChangeListener.VOLUME_CHANGED_ACTION);
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(b)) {
            b = packageName + "_ACTION_STATE_FORE";
        }
        if (TextUtils.isEmpty(c)) {
            c = packageName + "_ACTION_STATE_BACK";
        }
        if (TextUtils.isEmpty(d)) {
            d = packageName + "_ACTION_TP_TRIGGER";
        }
        intentFilter.addAction(b);
        intentFilter.addAction(c);
        intentFilter.addAction(d);
        intentFilter.setPriority(Integer.MAX_VALUE);
        context.registerReceiver(e, intentFilter);
        ALog.e("trace", "registerEventReceiver", new Object[0]);
    }

    public static void d(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56b94bf", new Object[]{context, bundle});
            return;
        }
        String string = bundle.getString("packageName");
        c71.c("accs", BaseMonitor.COUNT_VERIFY, "TriggerInstrumentation", vu3.b.GEO_NOT_SUPPORT);
        if (!b(context, string)) {
            try {
                context.startInstrumentation(new ComponentName(string, "com.taobao.adaemon.TriggerInstrumentation"), null, bundle);
            } catch (Throwable th) {
                ALog.e("trace", "start trigger process error:", th, new Object[0]);
            }
        }
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3f983d", new Object[]{context, str})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, xd0.channelService));
            return context.stopService(intent);
        } catch (Throwable th) {
            ALog.e("trace", "isTargetAlive err", th, new Object[0]);
            return true;
        }
    }
}
