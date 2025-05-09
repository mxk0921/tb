package com.taobao.desktop.widget.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hgh;
import tb.obx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DesktopMainService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_WIDGET_PROCESS_DATA_SYNC = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f10331a;

        static {
            t2o.a(437256290);
        }

        public a(Context context) {
            this.f10331a = context.getApplicationContext();
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/service/DesktopMainService$MessengerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1) {
                super.handleMessage(message);
            } else {
                DesktopMainService.a(this.f10331a, message);
            }
        }
    }

    static {
        t2o.a(437256289);
    }

    public static /* synthetic */ void a(Context context, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944eb704", new Object[]{context, message});
        } else {
            b(context, message);
        }
    }

    public static void b(Context context, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad70902", new Object[]{context, message});
            return;
        }
        try {
            hgh.b(message.what + " receiver msg from widget process：" + message.getData());
            Bundle data = message.getData();
            if (data != null && data.get("widget_data") != null) {
                obx.f(context).o(data.getString("widget_data"));
            }
        } catch (Throwable th) {
            hgh.b("receiver msg from widget process error" + th.getMessage());
        }
    }

    public static /* synthetic */ Object ipc$super(DesktopMainService desktopMainService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1256323805) {
            return new Boolean(super.onUnbind((Intent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/desktop/widget/service/DesktopMainService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        hgh.d("DesktopMainService onBind");
        return new Messenger(new a(this)).getBinder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        hgh.d("DesktopMainService onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        hgh.d("DesktopMainService onUnbind");
        return super.onUnbind(intent);
    }
}
