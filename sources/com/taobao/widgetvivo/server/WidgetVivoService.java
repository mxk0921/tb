package com.taobao.widgetvivo.server;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.widgetvivo.server.IWidgetVivoManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.ae7;
import tb.b9l;
import tb.gno;
import tb.hcx;
import tb.hgh;
import tb.nwc;
import tb.qj7;
import tb.t2o;
import tb.x3o;
import tb.xd7;
import tb.yyb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WidgetVivoService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "widget_order_server";
    public static final int WIDGET_ORDER_MAX_REQUEST_DEFAULT_VALUES = 30;
    public static final String WIDGET_ORDER_MAX_REQUEST_TIMES = "widget_order_max_req";
    public Context b;
    public ScheduledThreadPoolExecutor d;

    /* renamed from: a  reason: collision with root package name */
    public final RemoteCallbackList<IDataRequestListener> f14161a = new RemoteCallbackList<>();
    public final yyb c = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class IManager extends IWidgetVivoManager.Stub {
        static {
            t2o.a(437256365);
        }

        private IManager() {
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void postOrderRequest() {
            WidgetVivoService.d(WidgetVivoService.this);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void postRequest() throws RemoteException {
            hgh.e(WidgetVivoService.LOG_TAG, "postRequest");
            WidgetVivoService.b(WidgetVivoService.this);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void postTaoGoldRequest() {
            WidgetVivoService.c(WidgetVivoService.this);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void registerListener(IDataRequestListener iDataRequestListener) throws RemoteException {
            hgh.e(WidgetVivoService.LOG_TAG, "listenerList register");
            WidgetVivoService.a(WidgetVivoService.this).register(iDataRequestListener);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void unregisterListener(IDataRequestListener iDataRequestListener) throws RemoteException {
            hgh.e(WidgetVivoService.LOG_TAG, "listenerList unregister");
            WidgetVivoService.a(WidgetVivoService.this).unregister(iDataRequestListener);
        }

        public /* synthetic */ IManager(WidgetVivoService widgetVivoService, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14162a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.f14162a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WidgetVivoService.e(WidgetVivoService.this, this.f14162a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements nwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.nwc
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            hgh.e(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onError: " + str2);
            WidgetVivoService.f(WidgetVivoService.this, str2, false);
        }

        @Override // tb.nwc
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            hgh.e(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onSuccess: " + str);
            if (str != null) {
                WidgetVivoService.f(WidgetVivoService.this, str, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements yyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.yyb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
                return;
            }
            hgh.e(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onError: " + str);
            if (!TextUtils.isEmpty(str)) {
                WidgetVivoService.f(WidgetVivoService.this, str, false);
            }
        }

        @Override // tb.yyb
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                hgh.e(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onSuccess: " + str);
                WidgetVivoService.f(WidgetVivoService.this, str, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(WidgetVivoService widgetVivoService) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "WIDGET_ORDER");
        }
    }

    static {
        t2o.a(437256360);
    }

    public static /* synthetic */ RemoteCallbackList a(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteCallbackList) ipChange.ipc$dispatch("286950bf", new Object[]{widgetVivoService});
        }
        return widgetVivoService.f14161a;
    }

    public static /* synthetic */ void b(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e241c3", new Object[]{widgetVivoService});
        } else {
            widgetVivoService.k();
        }
    }

    public static /* synthetic */ void c(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab369704", new Object[]{widgetVivoService});
        } else {
            widgetVivoService.m();
        }
    }

    public static /* synthetic */ void d(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48aec45", new Object[]{widgetVivoService});
        } else {
            widgetVivoService.l();
        }
    }

    public static /* synthetic */ void e(WidgetVivoService widgetVivoService, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc61704", new Object[]{widgetVivoService, str, new Boolean(z)});
        } else {
            widgetVivoService.o(str, z);
        }
    }

    public static /* synthetic */ void f(WidgetVivoService widgetVivoService, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6371023", new Object[]{widgetVivoService, str, new Boolean(z)});
        } else {
            widgetVivoService.i(str, z);
        }
    }

    public static /* synthetic */ Object ipc$super(WidgetVivoService widgetVivoService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/widgetvivo/server/WidgetVivoService");
    }

    public static void n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3357688", new Object[]{context, str});
        } else if (!b9l.l(context) || qj7.p()) {
            hgh.e(LOG_TAG, "sendBroadcastToWidgetClient action: " + str);
            Intent intent = new Intent("android.appwidget.action.TAOBAO_STATE");
            intent.setPackage("com.taobao.widgetvivo");
            intent.putExtra("state", str);
            context.sendBroadcast(intent);
        }
    }

    public final String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa91b81d", new Object[]{this, str});
        }
        try {
            return SecurityGuardManager.getInstance(this.b).getStaticDataEncryptComp().staticSafeEncrypt(16, "21646297", str, "");
        } catch (SecException e) {
            hgh.e(LOG_TAG, "SecurityGuardManager_strEncrypted_error code: " + e.getErrorCode() + e.toString());
            return str;
        }
    }

    public synchronized ScheduledThreadPoolExecutor h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("46f0cbe6", new Object[]{this});
        }
        if (this.d == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new d(this));
            this.d = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
            this.d.allowCoreThreadTimeOut(true);
        }
        return this.d;
    }

    public final void i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452541ba", new Object[]{this, str, new Boolean(z)});
        } else {
            h().execute(new a(str, z));
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62404f9e", new Object[]{this});
            return;
        }
        try {
            if (j()) {
                hcx.c("61", this.c, new x3o());
            }
        } catch (Throwable th) {
            hgh.e(LOG_TAG, "requestOrderDataNew error: " + th.getMessage());
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29239e4", new Object[]{this});
            return;
        }
        try {
            if (j()) {
                hcx.c("43", this.c, new x3o());
            }
        } catch (Throwable th) {
            hgh.e(LOG_TAG, "requestTaoGoldData error: " + th.getMessage());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return new IManager(this, null);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ac6a50", new Object[]{this});
            return;
        }
        try {
            if (j()) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("id", "61");
                xd7.a("mtop.taobao.growth.starlink.config.get", "1.0", hashMap, new b());
            }
        } catch (Throwable th) {
            hgh.e(LOG_TAG, "WidgetVivoService requestData error: " + th.getMessage());
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f73f1487", new Object[]{this})).booleanValue();
        }
        Application b2 = ae7.c().b();
        this.b = b2;
        int d2 = b9l.d(b2);
        if (d2 == 0) {
            return true;
        }
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
            String str = (String) gno.b(this.b).a(WIDGET_ORDER_MAX_REQUEST_TIMES, "");
            hgh.e(LOG_TAG, "today: " + format + ",localTime: " + str);
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(":");
                String str2 = split[0];
                int parseInt = Integer.parseInt(split[1]);
                if (str2.equals(format)) {
                    if (parseInt > d2) {
                        hgh.e(LOG_TAG, "reach max request limit,configTimes：" + d2);
                        return false;
                    }
                    gno b3 = gno.b(this.b);
                    b3.e(WIDGET_ORDER_MAX_REQUEST_TIMES, format + ":" + (parseInt + 1));
                    return true;
                }
            }
            gno b4 = gno.b(this.b);
            b4.e(WIDGET_ORDER_MAX_REQUEST_TIMES, format + ":1");
            hgh.e(LOG_TAG, "saveFirstRequestTime");
            return true;
        } catch (Exception e) {
            hgh.e(LOG_TAG, e.getMessage());
            return false;
        }
    }

    public final void o(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c765c06", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int beginBroadcast = this.f14161a.beginBroadcast();
        hgh.e(LOG_TAG, " handleSuccess num" + beginBroadcast);
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                IDataRequestListener broadcastItem = this.f14161a.getBroadcastItem(i);
                if (broadcastItem == null) {
                    hgh.e(LOG_TAG, " handleSuccess mListener=null");
                } else if (z) {
                    broadcastItem.dataRequestSuccess(g(str));
                } else {
                    broadcastItem.dataRequestFailure(g(str));
                }
            } catch (RemoteException e) {
                hgh.e(LOG_TAG, e.getMessage());
                this.f14161a.finishBroadcast();
            }
        }
        this.f14161a.finishBroadcast();
    }
}
