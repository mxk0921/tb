package com.taobao.accs;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.utl.ALog;
import tb.brt;
import tb.d2r;
import tb.f2r;
import tb.t2o;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsMainService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANNEL_STARTUP = "com.taobao.accs.main.action_channel_startup";
    public static final String className = "com.taobao.accs.AccsMainService";

    /* renamed from: a  reason: collision with root package name */
    public Messenger f5999a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343932941);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/AccsMainService$AccsHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                try {
                    ALog.i("AccsMainService", "handleMessage on receive msg", "msg", message.toString());
                    AccsMainService.b((Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK), GlobalClientInfo.getContext());
                } catch (Throwable th) {
                    ALog.e("AccsMainService", "handleMessage err", th, new Object[0]);
                }
            }
        }
    }

    static {
        t2o.a(343932939);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734ca706", new Object[]{intent});
            return;
        }
        String stringExtra = intent.getStringExtra("serviceId");
        String stringExtra2 = intent.getStringExtra(Constants.KEY_STREAM_ID);
        int intExtra = intent.getIntExtra(Constants.KEY_STREAM_SEQ, 0);
        if (TextUtils.isEmpty(stringExtra2) || intExtra <= 0) {
            ALog.e("AccsMainService", "inputSyncMessage drop", "serviceId", stringExtra, "streamId", stringExtra2, y1r.COL_SEQ, Integer.valueOf(intExtra));
            return;
        }
        f2r f2rVar = new f2r(stringExtra, stringExtra2, intExtra);
        f2rVar.g(intent);
        d2r.b().c(f2rVar);
    }

    public static void b(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b0b7bc", new Object[]{intent, context});
        } else {
            brt.b(new a(intent));
        }
    }

    public static /* synthetic */ Object ipc$super(AccsMainService accsMainService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/AccsMainService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.f5999a == null) {
            this.f5999a = new Messenger(new b());
        }
        return this.f5999a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        GlobalClientInfo.setContext(getApplicationContext());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        b(intent, GlobalClientInfo.getContext());
        return 2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f6000a;

        public a(Intent intent) {
            this.f6000a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String str = "";
                Intent intent = this.f6000a;
                if (intent != null) {
                    str = intent.getAction();
                    if (!TextUtils.isEmpty(str)) {
                        ALog.e("AccsMainService", "onStartCommand", "action", str);
                        if (AccsMainService.ACTION_CHANNEL_STARTUP.equals(str)) {
                            com.taobao.accs.connection.state.a.v().c((StateMachine.Event) this.f6000a.getSerializableExtra("event"));
                            return;
                        } else if (Constants.ACTION_RECEIVE.equals(str) && this.f6000a.getIntExtra("command", -1) == 101) {
                            AccsMainService.a(this.f6000a);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                ALog.e("AccsMainService", "onStartCommandImpl lost", "action", str);
            } catch (Throwable th) {
                ALog.e("AccsMainService", "onStartCommandImpl err", th, new Object[0]);
            }
        }
    }
}
