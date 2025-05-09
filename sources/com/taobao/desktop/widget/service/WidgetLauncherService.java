package com.taobao.desktop.widget.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.util.Map;
import tb.bcx;
import tb.dcx;
import tb.gno;
import tb.hgh;
import tb.o8l;
import tb.obx;
import tb.t2o;
import tb.vd7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetLauncherService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_MAIN_PROCESS = 1;
    public static final int MSG_MAIN_WIDGET_DATA_SYNC = 2;
    public static final int MSG_WIDGET_PROCESS_REPLY = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TypeReference<Map<String, String>> {
    }

    static {
        t2o.a(437256293);
    }

    public static /* synthetic */ void a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c6503", new Object[]{context, bundle});
        } else {
            c(context, bundle);
        }
    }

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            d(context);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61f6e62", new Object[]{context});
        } else {
            dcx.I(context).M(true);
        }
    }

    public static /* synthetic */ Object ipc$super(WidgetLauncherService widgetLauncherService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1256323805) {
            return new Boolean(super.onUnbind((Intent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/desktop/widget/service/WidgetLauncherService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        hgh.d("WidgetLauncherService onBind");
        return new Messenger(new b(this)).getBinder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        hgh.d("WidgetLauncherService onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        hgh.d("WidgetLauncherService onUnbind");
        return super.onUnbind(intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f10332a;

        static {
            t2o.a(437256295);
        }

        public b(Context context) {
            this.f10332a = context.getApplicationContext();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/service/WidgetLauncherService$MessengerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    hgh.b("MSG_MAIN_PROCESS receiver msg from main process " + message.getData());
                    if (message.getData() != null) {
                        WidgetLauncherService.a(this.f10332a, message.getData());
                    }
                    WidgetLauncherService.b(this.f10332a);
                } catch (Throwable th) {
                    hgh.b("receiver msg from main process error" + th.getMessage());
                }
            } else if (i != 2) {
                if (i == 3) {
                    try {
                        hgh.b("MSG_MAIN_REPLY receiver msg from main process " + message.getData());
                        Bundle data = message.getData();
                        if (!(data.getString("widget_id") == null || data.getString("widget_type_id") == null)) {
                            String string = data.getString("widget_id");
                            String string2 = data.getString("widget_type_id");
                            if (obx.f(this.f10332a).a(string, string2)) {
                                Messenger messenger = message.replyTo;
                                Message obtain = Message.obtain((Handler) null, 3);
                                Bundle bundle = new Bundle();
                                bundle.putString("result", "success");
                                obtain.setData(bundle);
                                messenger.send(obtain);
                            }
                            bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(string2).w("widget_state_default_receive"));
                        }
                        return;
                    } catch (Throwable th2) {
                        hgh.d("MSG_MAIN_REPLY receiver msg from main process error" + th2.getMessage());
                    }
                }
                super.handleMessage(message);
            } else {
                try {
                    hgh.b("MSG_MAIN_WIDGET_DATA_SYNC receiver msg from main process " + message.getData());
                    if (message.getData() != null) {
                        WidgetLauncherService.a(this.f10332a, message.getData());
                    }
                } catch (Throwable th3) {
                    hgh.b("receiver msg from main process error" + th3.getMessage());
                }
            }
        }
    }

    public static void c(Context context, Bundle bundle) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b6f5f0", new Object[]{context, bundle});
            return;
        }
        if (bundle.getString("login_uid") != null) {
            String string = bundle.getString("login_uid");
            hgh.b("receiver msg from main process uid: " + string);
            vd7.e(context).l(string);
        }
        if (bundle.getString("login_encrypt_uid") != null) {
            String string2 = bundle.getString("login_encrypt_uid");
            hgh.b("receiver msg from main process eUid: " + string2);
            vd7.e(context).j(string2);
        }
        if (!(bundle.getString("process_share_orange") == null || (map = (Map) JSON.parseObject(bundle.getString("process_share_orange"), new a(), new Feature[0])) == null)) {
            hgh.b("receiver msg from main process orange: " + map);
            gno.b(context).f(o8l.SP_ORANGE_MANUFACTURER_REACH, map);
        }
        if (bundle.get("mockSet") != null) {
            String string3 = bundle.getString("mockSet");
            hgh.b("receiver msg from main process mock data: " + string3);
            vd7.e(context).k(string3);
        }
        if (bundle.get("widget_data") != null) {
            String string4 = bundle.getString("widget_data");
            hgh.b("receiver msg from main process widget data: " + string4);
            obx.f(context).i(string4);
        }
    }
}
