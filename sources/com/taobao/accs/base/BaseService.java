package com.taobao.accs.base;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.base.BaseService;
import com.taobao.accs.internal.ServiceImpl;
import com.taobao.accs.utl.ALog;
import tb.brt;
import tb.czv;
import tb.m8l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BaseService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BaseService";
    private static boolean isBinded = false;
    public IBaseService mBaseService = null;
    private Messenger messenger = new Messenger(new Handler() { // from class: com.taobao.accs.base.BaseService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/base/BaseService$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                ALog.i(BaseService.TAG, "handleMessage on receive msg", "msg", message.toString());
                Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent != null) {
                    ALog.i(BaseService.TAG, "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                    BaseService.this.onStartCommand(intent, 0, 0);
                }
            }
        }
    });

    static {
        t2o.a(343933005);
    }

    public static /* synthetic */ Object ipc$super(BaseService baseService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/base/BaseService");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f5e394", new Object[]{this});
            return;
        }
        IBaseService iBaseService = this.mBaseService;
        if (iBaseService != null) {
            iBaseService.onDestroy();
            this.mBaseService = null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        brt.b(new Runnable() { // from class: com.taobao.accs.base.BaseService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    BaseService.this.mBaseService = new ServiceImpl(BaseService.this);
                    BaseService.this.mBaseService.onCreate();
                } catch (Exception e) {
                    ALog.e(BaseService.TAG, "create ServiceImpl error", e.getMessage());
                }
            }
        });
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        brt.b(new Runnable() { // from class: tb.r02
            @Override // java.lang.Runnable
            public final void run() {
                BaseService.this.lambda$onDestroy$3();
            }
        });
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        brt.b(new Runnable() { // from class: com.taobao.accs.base.BaseService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BaseService baseService = BaseService.this;
                IBaseService iBaseService = baseService.mBaseService;
                if (iBaseService != null) {
                    iBaseService.onStartCommand(intent, i, i2);
                    return;
                }
                baseService.onCreate();
                BaseService.this.onStartCommand(intent, i, i2);
            }
        });
        return 1;
    }

    private void bindImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07bd204", new Object[]{this});
        } else {
            getApplicationContext().bindService(new Intent(getApplicationContext(), getClass()), new ServiceConnection() { // from class: com.taobao.accs.base.BaseService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    }
                }
            }, 1);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        ALog.e(TAG, "onBind", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        try {
            if (czv.h(this) && !isBinded) {
                isBinded = true;
                if (!m8l.r()) {
                    bindImpl();
                }
            }
        } catch (Throwable th) {
            ALog.i(TAG, "onBind bind service with exception", th.toString());
        }
        return this.messenger.getBinder();
    }
}
