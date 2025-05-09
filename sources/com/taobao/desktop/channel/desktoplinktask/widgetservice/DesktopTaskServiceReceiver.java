package com.taobao.desktop.channel.desktoplinktask.widgetservice;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.abu;
import tb.agu;
import tb.fp9;
import tb.rwk;
import tb.sd7;
import tb.t2o;
import tb.vd7;
import tb.w9h;
import tb.y2e;
import tb.yv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DesktopTaskServiceReceiver extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159103);
    }

    public static /* synthetic */ void a(Messenger messenger, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127dc46f", new Object[]{messenger, new Integer(i), bundle});
        } else {
            b(messenger, i, bundle);
        }
    }

    public static void b(Messenger messenger, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9da624", new Object[]{messenger, new Integer(i), bundle});
            return;
        }
        try {
            if (messenger == null) {
                yv8.a("DesktopTaskServiceReceiver.sendReplyMessage.replyMsg=null", new Object[0]);
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = i;
            if (bundle != null) {
                obtain.setData(bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(DesktopTaskServiceReceiver desktopTaskServiceReceiver, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1256323805) {
            return new Boolean(super.onUnbind((Intent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/desktop/channel/desktoplinktask/widgetservice/DesktopTaskServiceReceiver");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        yv8.a("DesktopTaskReceiver onBind", new Object[0]);
        return new Messenger(new b()).getBinder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        yv8.a("DesktopTaskReceiver onDestroy", new Object[0]);
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        yv8.a("DesktopTaskReceiver onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements y2e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10322a;
            public final /* synthetic */ String b;

            public a(b bVar, String str, String str2) {
                this.f10322a = str;
                this.b = str2;
            }

            @Override // tb.y2e
            public void a(agu aguVar, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f02acacd", new Object[]{this, aguVar, str});
                    return;
                }
                yv8.e("DesktopTaskServiceReceiver.triggerActiveTask.onFail.triggerEventId=%s.bizCode=%s.errorMessage=%s", this.f10322a, this.b, str);
                Bundle bundle = new Bundle();
                bundle.putString("bizCode", this.b);
                DesktopTaskServiceReceiver.a(aguVar.e, 2, bundle);
            }

            @Override // tb.y2e
            public void b(agu aguVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8987b37f", new Object[]{this, aguVar});
                    return;
                }
                yv8.e("DesktopTaskServiceReceiver.triggerActiveTask.onClose.triggerEventId=%s.bizCode=%s", this.f10322a, this.b);
                Bundle bundle = new Bundle();
                bundle.putString("bizCode", this.b);
                DesktopTaskServiceReceiver.a(aguVar.e, 3, bundle);
            }

            @Override // tb.y2e
            public void c(agu aguVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("336210ca", new Object[]{this, aguVar});
                    return;
                }
                yv8.e("DesktopTaskServiceReceiver.triggerActiveTask.onSuccess.triggerEventId=%s.bizCode=%s.", this.f10322a, this.b);
                Bundle bundle = new Bundle();
                bundle.putString("bizCode", this.b);
                DesktopTaskServiceReceiver.a(aguVar.e, 1, bundle);
            }
        }

        static {
            t2o.a(435159105);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/widgetservice/DesktopTaskServiceReceiver$MessengerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                int i = message.what;
                fp9 fp9Var = new fp9();
                if (i == 1 || i == 2) {
                    agu aguVar = new agu(i);
                    Bundle data = message.getData();
                    if (data == null) {
                        abu.e(i, aguVar.c, aguVar.d, abu.FUNNEL_STEP_LAUNCH_WIDGET, "bundleEmpty", "");
                        return;
                    }
                    String string = data.getString("config");
                    if (TextUtils.isEmpty(string)) {
                        abu.e(i, aguVar.c, aguVar.d, abu.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentEmpty", "");
                        return;
                    }
                    vd7.e(sd7.d().a()).i(data.getString("uid", ""));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("config", (Object) string);
                    jSONObject.put("abBucketId", (Object) data.getString("abBucketId", ""));
                    jSONObject.put(DnsNavConfigTask.MatchKey, (Object) data.getString(DnsNavConfigTask.MatchKey, ""));
                    jSONObject.put("localRecord", (Object) data.getString("record", ""));
                    aguVar.d = jSONObject;
                    aguVar.e = message.replyTo;
                    if (i == 1) {
                        new rwk().o(aguVar);
                    } else {
                        new w9h().o(aguVar);
                    }
                } else if (i == 3) {
                    Bundle data2 = message.getData();
                    if (data2 == null) {
                        abu.e(i, "", null, abu.FUNNEL_STEP_LAUNCH_WIDGET, "bundleEmpty", "");
                        return;
                    }
                    String string2 = data2.getString("triggerEventId", "");
                    String string3 = data2.getString("bizCode", "");
                    String string4 = data2.getString("action", "");
                    boolean z = data2.getBoolean("needToast", true);
                    if ("trigger".equals(string4)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("needToast", (Object) Boolean.valueOf(z));
                        fp9Var.c(string2, string3, jSONObject2, message.replyTo, new a(this, string2, string3));
                    } else if ("close".equals(string4)) {
                        fp9Var.a(string3);
                    } else if ("query".equals(string4)) {
                        int b = fp9Var.b(string3);
                        Bundle bundle = new Bundle();
                        bundle.putString("bizCode", string3);
                        bundle.putInt("status", b);
                        DesktopTaskServiceReceiver.a(message.replyTo, 4, bundle);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
