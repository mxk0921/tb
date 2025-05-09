package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oao extends v80 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(oao oaoVar) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            s55.i("RestartChannelAction", "SupportService.onServiceConnected", new Object[0]);
            try {
                Messenger messenger = new Messenger(iBinder);
                Message obtain = Message.obtain();
                obtain.replyTo = new Messenger(new b());
                messenger.send(obtain);
            } catch (Throwable th) {
                s55.h("RestartChannelAction", "onServiceConnected err", th, new Object[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175906);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/chains/RestartChannelAction$RestartHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            s55.i("RestartChannelAction", "RestartHandler handleMessage", new Object[0]);
            if (message != null && message.what == 1) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    static {
        t2o.a(349175904);
    }

    public oao(String str, int i) {
        super(str, i);
    }

    public static oao e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oao) ipChange.ipc$dispatch("f26fcb0f", new Object[0]);
        }
        return new oao(null, -1);
    }

    public static /* synthetic */ Object ipc$super(oao oaoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/chains/RestartChannelAction");
    }

    @Override // tb.v80
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        s55.i("RestartChannelAction", xpc.RECORD_EXECUTE, new Object[0]);
        try {
            Intent intent = new Intent();
            intent.setClassName("com.taobao.taobao", "com.taobao.keepalive.SupportService");
            g.l().bindService(intent, new a(this), 1);
        } catch (Throwable th) {
            s55.h("RestartChannelAction", "execute err", th, new Object[0]);
        }
    }

    @Override // tb.v80
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
        }
    }
}
