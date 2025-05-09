package com.taobao.location.client;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import tb.e2u;
import tb.gbh;
import tb.p78;
import tb.t2o;
import tb.unr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBLocationClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG = "TBLocationClient";
    public static final String NAVI_RESULT = "tb_location_navi_result";

    /* renamed from: a  reason: collision with root package name */
    public static TBLocationClient f11009a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class TBLocationCallbackWrapper extends ITBLocationCallback.Stub {
        private static final int TYPE_LOCATION_CHANGED = 1;
        private unr callback;
        private boolean called = false;
        final Handler mListenerHandler;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(TBLocationClient tBLocationClient) {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/client/TBLocationClient$TBLocationCallbackWrapper$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else {
                    TBLocationCallbackWrapper.this.processMessage(message);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b(Looper looper, TBLocationClient tBLocationClient) {
                super(looper);
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/client/TBLocationClient$TBLocationCallbackWrapper$2");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else {
                    TBLocationCallbackWrapper.this.processMessage(message);
                }
            }
        }

        static {
            t2o.a(756023316);
        }

        public TBLocationCallbackWrapper(unr unrVar, Looper looper) {
            this.callback = unrVar;
            if (looper == null) {
                this.mListenerHandler = new a(TBLocationClient.this);
            } else {
                this.mListenerHandler = new b(looper, TBLocationClient.this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void processMessage(Message message) {
            if (!this.called) {
                this.called = true;
                if (message.what == 1) {
                    handleLocationChangeMessage(message);
                }
            }
        }

        public void handleLocationChangeMessage(Message message) {
            TBLocationDTO tBLocationDTO = (TBLocationDTO) message.obj;
            try {
                unr unrVar = this.callback;
                if (unrVar == null) {
                    TLog.loge(TBLocationClient.LOG, "call back ignore, Reason [timeout | done] !");
                } else {
                    unrVar.onLocationChanged(tBLocationDTO);
                    this.callback = null;
                    AppMonitor.Counter.commit("TBLocation", "handleLocationChangeMessage_success", 1.0d);
                }
            } catch (Exception unused) {
                TLog.loge(TBLocationClient.LOG, "call back fail!");
            }
        }

        @Override // com.taobao.location.aidl.ITBLocationCallback
        public void onLocationChanged(TBLocationDTO tBLocationDTO) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = tBLocationDTO;
            this.mListenerHandler.sendMessage(obtain);
        }
    }

    static {
        t2o.a(756023315);
    }

    public TBLocationClient(Context context) {
        new WeakReference(context);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[0]);
        }
        File filesDir = Globals.getApplication().getFilesDir();
        return filesDir.getPath() + "/tb_location_navi_result";
    }

    public static TBLocationDTO d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("15607dfe", new Object[0]);
        }
        AppMonitor.Counter.commit("TBLocation", "getCacheLocation", 1.0d);
        String i = i();
        if (!TextUtils.isEmpty(i)) {
            try {
                TBLocationDTO tBLocationDTO = (TBLocationDTO) JSON.parseObject(i, TBLocationDTO.class);
                AppMonitor.Counter.commit("TBLocation", "getCacheLocation_success", 1.0d);
                return tBLocationDTO;
            } catch (Exception unused) {
                Log.e(LOG, "posInfo invalid!");
            }
        }
        return null;
    }

    public static TBLocationDTO e(TBLocationOption tBLocationOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("fb01c2", new Object[]{tBLocationOption});
        }
        if (tBLocationOption == null) {
            return d();
        }
        AppMonitor.Counter.commit("TBLocation", "getCacheLocation-option", 1.0d);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            File file = new File(c());
            if (file.exists() && tBLocationOption.getTimeLimit().matchTimeLimit(file.lastModified(), currentTimeMillis)) {
                ReentrantLock reentrantLock = e2u.b;
                try {
                    if (reentrantLock.tryLock()) {
                        try {
                            String i = i();
                            if (TextUtils.isEmpty(i)) {
                                try {
                                    reentrantLock.unlock();
                                } catch (Throwable unused) {
                                }
                                return null;
                            }
                            TBLocationDTO tBLocationDTO = (TBLocationDTO) JSON.parseObject(i, TBLocationDTO.class);
                            if (!tBLocationOption.getTimeLimit().matchTimeLimit(tBLocationDTO.timeStamp.longValue(), currentTimeMillis) || !tBLocationOption.getAccuracy().matchAccuray(tBLocationDTO.accuracy.intValue()) || !tBLocationOption.getDataModel().matchAddressModel(tBLocationDTO) || !tBLocationOption.getDataModel().matchPoiModel(tBLocationDTO)) {
                                reentrantLock.unlock();
                            } else {
                                AppMonitor.Counter.commit("TBLocation", "getCacheLocation-option_matched", 1.0d);
                                TLog.loge(LOG, "posInfo matched");
                                try {
                                    reentrantLock.unlock();
                                } catch (Throwable unused2) {
                                }
                                return tBLocationDTO;
                            }
                        } catch (Exception e) {
                            TLog.loge(LOG, "getCacheLocation error = " + e);
                            AppMonitor.Counter.commit("TBLocation", "getCacheLocation-ERROR", 1.0d);
                            e2u.b.unlock();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        e2u.b.unlock();
                    } catch (Throwable unused3) {
                    }
                    throw th;
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    public static final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("636cf80c", new Object[0])).booleanValue();
        }
        if (ContextCompat.checkSelfPermission(Globals.getApplication().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        if (ContextCompat.checkSelfPermission(Globals.getApplication().getApplicationContext(), p78.ACCESS_FINE_LOCATION) != 0) {
            return false;
        }
        return ((LocationManager) Globals.getApplication().getSystemService("location")).isProviderEnabled("gps");
    }

    public static TBLocationClient g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationClient) ipChange.ipc$dispatch("467a4bf2", new Object[]{context});
        }
        return new TBLocationClient(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.location.client.TBLocationClient.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "717a9a07"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = c()     // Catch: all -> 0x0045, Exception -> 0x0047
            java.io.File r3 = new java.io.File     // Catch: all -> 0x0045, Exception -> 0x004b
            r3.<init>(r2)     // Catch: all -> 0x0045, Exception -> 0x004b
            boolean r3 = r3.exists()     // Catch: all -> 0x0045, Exception -> 0x004b
            if (r3 != 0) goto L_0x0025
            return r0
        L_0x0025:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x0045, Exception -> 0x0047
            r3.<init>(r2)     // Catch: all -> 0x0045, Exception -> 0x0047
            int r1 = r3.available()     // Catch: all -> 0x0040, Exception -> 0x0043
            byte[] r1 = new byte[r1]     // Catch: all -> 0x0040, Exception -> 0x0043
            r3.read(r1)     // Catch: all -> 0x0040, Exception -> 0x0043
            java.lang.String r2 = new java.lang.String     // Catch: all -> 0x0040, Exception -> 0x0043
            java.lang.String r4 = "utf-8"
            r2.<init>(r1, r4)     // Catch: all -> 0x0040, Exception -> 0x0043
            r3.close()     // Catch: all -> 0x003e
        L_0x003e:
            r0 = r2
            goto L_0x0059
        L_0x0040:
            r0 = move-exception
            r1 = r3
            goto L_0x005a
        L_0x0043:
            r1 = move-exception
            goto L_0x004c
        L_0x0045:
            r0 = move-exception
            goto L_0x005a
        L_0x0047:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x004c
        L_0x004b:
            return r0
        L_0x004c:
            java.lang.String r2 = "TBLocationClient"
            java.lang.String r4 = "读缓存异常"
            com.taobao.tao.log.TLog.loge(r2, r4, r1)     // Catch: all -> 0x0040
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch: all -> 0x0059
        L_0x0059:
            return r0
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.close()     // Catch: all -> 0x005f
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.location.client.TBLocationClient.i():java.lang.String");
    }

    public static synchronized TBLocationClient j() {
        synchronized (TBLocationClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationClient) ipChange.ipc$dispatch("51bb9127", new Object[0]);
            }
            if (f11009a == null) {
                f11009a = g(Globals.getApplication());
            }
            return f11009a;
        }
    }

    public final String b(LocationErrorCode locationErrorCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("519da6cc", new Object[]{this, locationErrorCode});
        }
        if (locationErrorCode == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errCode", (Object) Integer.valueOf(locationErrorCode.code));
        jSONObject.put("errmsg", (Object) locationErrorCode.desc);
        try {
            if (locationErrorCode == LocationErrorCode.FAIL_UNAVALIABLE_SERVICE) {
                jSONObject.put("enableTimes", (Object) Integer.valueOf(e2u.f18237a.get()));
            }
            return jSONObject.toJSONString();
        } catch (JSONException e) {
            TLog.loge(LOG, "generateArg error " + e.toString());
            return "{\"enableTimes\":" + e2u.f18237a.get() + ",\"errCode\":" + locationErrorCode.code + ",\"errmsg\":\"" + locationErrorCode.desc + "\"}";
        }
    }

    public void h(TBLocationOption tBLocationOption, unr unrVar, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f7a58e", new Object[]{this, tBLocationOption, unrVar, looper});
            return;
        }
        AppMonitor.Counter.commit("TBLocation", "onLocationChanged", 1.0d);
        if (tBLocationOption == null) {
            a(LocationErrorCode.FAIL_INVALID_OPTION, unrVar);
            return;
        }
        try {
            TBLocationCallbackWrapper tBLocationCallbackWrapper = new TBLocationCallbackWrapper(unrVar, looper);
            gbh r = gbh.r();
            r.y(Globals.getApplication());
            r.z(tBLocationOption, tBLocationCallbackWrapper);
            k(tBLocationOption, tBLocationCallbackWrapper);
        } catch (Exception unused) {
            a(LocationErrorCode.FAIL_INVALID_LOOPER, unrVar);
        }
    }

    public final void k(TBLocationOption tBLocationOption, TBLocationCallbackWrapper tBLocationCallbackWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52013d48", new Object[]{this, tBLocationOption, tBLocationCallbackWrapper});
        } else if (tBLocationOption != null && tBLocationOption.getTimeout() != null && tBLocationOption.getTimeout().getLength() > 0 && tBLocationCallbackWrapper != null) {
            TBLocationDTO tBLocationDTO = new TBLocationDTO();
            tBLocationDTO.isNavSuccess = false;
            tBLocationDTO.errorCode = Integer.valueOf(LocationErrorCode.FAIL_LOCATION_TIMEOUT.code);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = tBLocationDTO;
            tBLocationCallbackWrapper.mListenerHandler.sendMessageDelayed(obtain, tBLocationOption.getTimeout().getLength());
        }
    }

    public final void a(LocationErrorCode locationErrorCode, unr unrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d218374", new Object[]{this, locationErrorCode, unrVar});
            return;
        }
        AppMonitor.Counter.commit("TBLocation", "exeFailCallback", b(locationErrorCode), 1.0d);
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        tBLocationDTO.isNavSuccess = false;
        tBLocationDTO.errorCode = Integer.valueOf(locationErrorCode.getCode());
        try {
            unrVar.onLocationChanged(tBLocationDTO);
        } catch (Exception unused) {
            TLog.loge(LOG, "Callback call back fail!");
        }
    }
}
