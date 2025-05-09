package tb;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.net.InAppConnection;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.SymbolExpUtil;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class va8 implements IBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ElectionServiceImpl";
    public static ConcurrentHashMap<String, BaseConnection> mConnections = new ConcurrentHashMap<>(2);
    private Context mContext;

    static {
        t2o.a(343933059);
        t2o.a(343933011);
    }

    public va8(Service service) {
        this.mContext = service.getApplicationContext();
    }

    public static BaseConnection getConnection(Context context, String str, boolean z, int i, int i2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConnection) ipChange.ipc$dispatch("c9e2745d", new Object[]{context, str, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        BaseConnection baseConnection = null;
        try {
        } catch (Throwable th2) {
            ALog.e(TAG, "getConnection", th2, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.e(TAG, "getConnection configTag null or env invalid", "conns.size", Integer.valueOf(mConnections.size()));
            if (mConnections.size() > 0) {
                return mConnections.elements().nextElement();
            }
            return null;
        }
        int d = czv.d(context);
        String str2 = str + "|" + d;
        try {
            synchronized (va8.class) {
                BaseConnection baseConnection2 = mConnections.get(str2);
                if (baseConnection2 == null) {
                    try {
                        ALog.e(TAG, "new app connection", "key", str2);
                        AccsClientConfig.mEnv = d;
                        baseConnection = new InAppConnection(context, 1, str, i2);
                        mConnections.put(str2, baseConnection);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    baseConnection = baseConnection2;
                }
                if (z) {
                    baseConnection.P();
                }
                return baseConnection;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void removeConnection(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029d5e9", new Object[]{context, str});
            return;
        }
        int d = czv.d(context);
        mConnections.remove(str + "|" + d);
    }

    @Override // com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ALog.e(TAG, "Service onDestroy", new Object[0]);
        this.mContext = null;
    }

    public abstract int onHostStartCommand(Intent intent, int i, int i2);

    @Override // com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        return false;
    }

    public abstract void onVotedHost();

    public static synchronized void resetAllConnections(Context context) {
        synchronized (va8.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4044f3de", new Object[]{context});
                return;
            }
            c71.c("accs", BaseMonitor.COUNT_FULL_VERIFY, "resetAllConnections", vu3.b.GEO_NOT_SUPPORT);
            try {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, BaseConnection> entry : mConnections.entrySet()) {
                    hashSet.add(entry.getKey().split(SymbolExpUtil.SYMBOL_VERTICALBAR)[0]);
                    entry.getValue().O();
                }
                mConnections.clear();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    getConnection(context, (String) it.next(), false, 0).P();
                }
            } catch (Exception e) {
                ALog.e(TAG, "resetAllConnections", e, new Object[0]);
            }
        }
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            ALog.i(TAG, "onCreate,", "sdkVersion", 402);
        }
    }

    @Override // com.taobao.accs.base.IBaseService
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.i(TAG, "onStartCommand begin", "action", action);
        if (TextUtils.equals(action, Constants.ACTION_START_SERVICE)) {
            handleStartCommand(intent);
        }
        return onHostStartCommand(intent, i, i2);
    }

    private void handleStartCommand(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965a95", new Object[]{this, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("appKey");
            String stringExtra3 = intent.getStringExtra("ttid");
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            boolean booleanExtra = intent.getBooleanExtra("start", false);
            int intExtra = intent.getIntExtra("mode", 0);
            ALog.i(TAG, "handleStartCommand", Constants.KEY_CONFIG_TAG, stringExtra5, "appkey", stringExtra2, "appSecret", stringExtra4, "ttid", stringExtra3, "pkg", stringExtra);
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && stringExtra.equals(this.mContext.getPackageName())) {
                czv.k(this.mContext, intExtra);
                BaseConnection connection = getConnection(this.mContext, stringExtra5, booleanExtra, -1);
                if (connection != null) {
                    connection.f6078a = stringExtra3;
                } else {
                    ALog.e(TAG, "handleStartCommand start action, no connection", Constants.KEY_CONFIG_TAG, stringExtra5);
                }
                UtilityImpl.saveAppKey(this.mContext, stringExtra2);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "handleStartCommand", th, new Object[0]);
        }
    }

    public static BaseConnection getConnection(Context context, String str, boolean z, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConnection) ipChange.ipc$dispatch("7f782f4", new Object[]{context, str, new Boolean(z), new Integer(i)});
        }
        boolean isForeground = UtilityImpl.isForeground(context);
        if (!isForeground || !UtilityImpl.isChannelProcess(context) || UtilityImpl.isMainProcessAlive(context)) {
            i2 = isForeground ? 1 : 0;
        }
        return getConnection(context, str, z, i, i2);
    }
}
