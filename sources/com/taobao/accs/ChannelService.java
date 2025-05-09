package com.taobao.accs;

import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.BaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.accs.utl.UtilityImpl;
import tb.brt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ChannelService extends BaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChannelService";
    private static ChannelService mInstance;
    private boolean mFristStarted = true;
    private volatile boolean isRegisterReceiver = false;
    private final EventReceiver eventReceiver = new EventReceiver();

    static {
        t2o.a(343932942);
    }

    public static /* synthetic */ EventReceiver access$000(ChannelService channelService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventReceiver) ipChange.ipc$dispatch("77feaf1c", new Object[]{channelService});
        }
        return channelService.eventReceiver;
    }

    public static /* synthetic */ boolean access$102(ChannelService channelService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b35f986b", new Object[]{channelService, new Boolean(z)})).booleanValue();
        }
        channelService.isRegisterReceiver = z;
        return z;
    }

    public static ChannelService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChannelService) ipChange.ipc$dispatch("c4f626d7", new Object[0]);
        }
        return mInstance;
    }

    public static /* synthetic */ Object ipc$super(ChannelService channelService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/ChannelService");
        }
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        GlobalClientInfo.setContext(getApplicationContext());
        UtilityImpl.debug(GlobalClientInfo.getContext());
        mInstance = this;
        brt.h().execute(new a());
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.isRegisterReceiver) {
            try {
                unregisterReceiver(this.eventReceiver);
            } catch (Throwable th) {
                ALog.e(TAG, "ChannelService unregisterReceiver", th, new Object[0]);
            }
        }
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.mFristStarted) {
            this.mFristStarted = false;
        }
        return super.onStartCommand(intent, i, i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                NoTraceTriggerHelper.c(GlobalClientInfo.mContext);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addDataScheme("package");
                GlobalClientInfo.mContext.registerReceiver(ChannelService.access$000(ChannelService.this), intentFilter);
                ChannelService.access$102(ChannelService.this, true);
            } catch (Throwable th) {
                ALog.e(ChannelService.TAG, "ChannelService onCreate registerReceiver", th, new Object[0]);
            }
        }
    }
}
