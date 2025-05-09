package com.taobao.keepalive;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.o41;
import tb.pxx;
import tb.t2o;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SupportService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Messenger f10868a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f10869a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.keepalive.SupportService$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class C0571a implements IBinder.DeathRecipient {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Messenger f10870a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.keepalive.SupportService$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class ServiceConnectionC0572a implements ServiceConnection {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                static {
                    t2o.a(499122189);
                }

                public ServiceConnectionC0572a() {
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    pxx.f26392a.e("SupportService", "ChannelService.onServiceConnected", new Object[0]);
                    try {
                        a.this.f10869a.unbindService(this);
                    } catch (Throwable unused) {
                    }
                    Process.killProcess(Process.myPid());
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    }
                }
            }

            static {
                t2o.a(499122188);
            }

            public C0571a(Messenger messenger) {
                this.f10870a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                    return;
                }
                pxx.f26392a.e("SupportService", "binderDied", new Object[0]);
                try {
                    Intent intent = new Intent();
                    intent.setClassName("com.taobao.taobao", xd0.channelService);
                    a.this.f10869a.bindService(intent, new ServiceConnectionC0572a(), 1);
                    this.f10870a.getBinder().unlinkToDeath(this, 0);
                } catch (Throwable th) {
                    pxx.f26392a.d("SupportService", "binderDied err", th, new Object[0]);
                }
            }
        }

        static {
            t2o.a(499122187);
        }

        public a(Context context) {
            this.f10869a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/SupportService$a");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message == null || message.replyTo == null) {
                pxx.f26392a.e("SupportService", "handleMessage empty", new Object[0]);
            } else {
                pxx.f26392a.e("SupportService", "handleMessage", new Object[0]);
                Messenger messenger = message.replyTo;
                try {
                    messenger.getBinder().linkToDeath(new C0571a(messenger), 0);
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    messenger.send(obtain);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static {
        t2o.a(499122186);
    }

    public static /* synthetic */ Object ipc$super(SupportService supportService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/SupportService");
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        o41.c(getApplicationContext());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        pxx.f26392a.e("SupportService", "onBind", new Object[0]);
        if (this.f10868a == null) {
            this.f10868a = new Messenger(new a(getApplicationContext()));
        }
        return this.f10868a.getBinder();
    }
}
