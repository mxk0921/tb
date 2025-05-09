package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.utl.ALog;
import tb.amo;
import tb.brt;
import tb.o2j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MsgDistributeService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Messenger f6052a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/data/MsgDistributeService$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                ALog.i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
                Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent != null) {
                    ALog.i("MsgDistributeService", "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                    MsgDistributeService.this.onStartCommand(intent, 0, 0);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f6054a;

        public b(Intent intent) {
            this.f6054a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i("MsgDistributeService", "onStartCommand send message", new Object[0]);
            ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f6054a.getSerializableExtra(Constants.KEY_SEND_REQDATA);
            String stringExtra = this.f6054a.getStringExtra("packageName");
            String stringExtra2 = this.f6054a.getStringExtra("appKey");
            String stringExtra3 = this.f6054a.getStringExtra(Constants.KEY_CONFIG_TAG);
            if (TextUtils.isEmpty(stringExtra3)) {
                stringExtra3 = stringExtra2;
            }
            ACCSManager.getAccsInstance(GlobalClientInfo.getContext(), stringExtra2, stringExtra3).sendRequest(GlobalClientInfo.getContext(), accsRequest, stringExtra, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f6056a;

        public d(Intent intent) {
            this.f6056a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean booleanExtra = this.f6056a.getBooleanExtra("c", false);
            ALog.e("MsgDistributeService", "ACTION_CHANNEL_CONNECTION_CHANGED", amo.a.POINT_NAME, Boolean.valueOf(booleanExtra));
            ConnectionServiceManager.getInstance().onChannelConnectionChanged(booleanExtra);
        }
    }

    static {
        t2o.a(343933096);
    }

    public static /* synthetic */ Object ipc$super(MsgDistributeService msgDistributeService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/data/MsgDistributeService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.f6052a == null) {
            this.f6052a = new Messenger(new a());
        }
        return this.f6052a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f6055a;

        public c(Intent intent) {
            this.f6055a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ConnectionServiceManager.getInstance().getConnectionWrapper(this.f6055a.getStringExtra("tag")).send((Message) this.f6055a.getSerializableExtra("m"), this.f6055a.getBooleanExtra("c", true));
            } catch (Throwable th) {
                ALog.e("MsgDistributeService", "exception in send", th, new Object[0]);
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            ALog.e("MsgDistributeService", "onStartCommand", "action", intent.getAction());
            String action = intent.getAction();
            if (Constants.ACTION_SEND.equals(action)) {
                brt.h().execute(new b(intent));
            } else if (Constants.ACTION_SENDMESSAGE_INMAIN.equals(action)) {
                brt.h().execute(new c(intent));
            } else if (Constants.ACTION_CHANNEL_CONNECTION_CHANGED.equals(action)) {
                brt.h().execute(new d(intent));
            } else {
                ALog.i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                intent.setFlags(0);
                o2j.d(GlobalClientInfo.getContext(), intent);
            }
        } catch (Throwable th) {
            ALog.e("MsgDistributeService", "onStartCommand", th, new Object[0]);
        }
        return 2;
    }
}
