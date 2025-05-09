package com.tmall.android.dai.internal.compute;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.List;
import java.util.Map;
import tb.cxw;
import tb.ewv;
import tb.kgh;
import tb.lu0;
import tb.mdt;
import tb.nqh;
import tb.oqh;
import tb.stv;
import tb.t2o;
import tb.xdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ServiceListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_MONITOR_TYPE_ALARM_FAIL = "alarm-fail";
    public static final String APP_MONITOR_TYPE_ALARM_SUCCESS = "alarm-success";
    public static final String APP_MONITOR_TYPE_COUNT = "count";
    public static final int CACHE_READ_ALL = 2;
    public static final int CACHE_READ_DISK = 1;
    public static final int CACHE_READ_FILE_ONLY = 9;
    public static final int CACHE_READ_MEMORY = 0;
    public static final int CACHE_REMOVE_ALL = 8;
    public static final int CACHE_REMOVE_DISK = 7;
    public static final int CACHE_REMOVE_FILE_ONLY = 11;
    public static final int CACHE_REMOVE_MEMORY = 6;
    public static final int CACHE_WRITE_ALL = 5;
    public static final int CACHE_WRITE_DISK = 4;
    public static final int CACHE_WRITE_FILE_ONLY = 10;
    public static final int CACHE_WRITE_MEMORY = 3;
    private static final String TAG = "ServiceListener";
    private static final String WALLE = "walle";
    private long nativeHandle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14202a;

        public a(String str) {
            this.f14202a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UserTrackDO userTrackDO = new UserTrackDO();
            userTrackDO.setEventId(99099);
            userTrackDO.setPageName(this.f14202a);
            stv.d().f(userTrackDO);
        }
    }

    static {
        t2o.a(1034944616);
    }

    public ServiceListener() {
        this.nativeHandle = 0L;
        this.nativeHandle = nativeGetNativeHandle(this);
    }

    private static native void nativeFinalize(long j);

    private static native long nativeGetNativeHandle(ServiceListener serviceListener);

    public boolean dispatchTimer(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eee9670c", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        xdt.c(new a(str), j);
        return true;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        nativeFinalize(this.nativeHandle);
        this.nativeHandle = 0L;
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onBroadcast(String str, String str2, int i, boolean z, String str3) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cadcf8", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str3)) {
                try {
                    map = (Map) JSON.parse(str3);
                } catch (Throwable unused) {
                }
                ewv.d(str2, str, map, z);
            }
            map = null;
            ewv.d(str2, str, map, z);
        } catch (Throwable unused2) {
        }
    }

    public String onDownload(String str, String str2) {
        MRTFilesDescription mRTFilesDescription;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cce723e", new Object[]{this, str, str2});
        }
        MRTTaskDescription e = oqh.d().e(str);
        if (e == null || (mRTFilesDescription = e.resource) == null) {
            return "";
        }
        return ((nqh) mRTFilesDescription.resourceOperation).d(str2);
    }

    public void onLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7cbfca", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            kgh.n(str, str2, str3);
        } catch (Throwable unused) {
        }
    }

    public Object onTask(String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ec2745b", new Object[]{this, str, new Integer(i), map});
        }
        try {
            return mdt.e().d(str, i, map);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean onAppmonitorUpload(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f153ac", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        try {
            StringBuilder sb = new StringBuilder("onAppmonitorUpload");
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            sb.append(str4);
            if (str4.equals(APP_MONITOR_TYPE_ALARM_FAIL)) {
                AppMonitor.Alarm.commitFail(str, str2, str3, "-1", "");
            } else if (str4.equals(APP_MONITOR_TYPE_ALARM_SUCCESS)) {
                AppMonitor.Alarm.commitSuccess(str, str2, str3);
            } else {
                AppMonitor.Counter.commit(str, str2, str3, 1.0d);
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public boolean onAppMonitorStatReg(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b771549", new Object[]{this, str, str2, list, list2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || list == null || list2 == null) {
            return false;
        }
        try {
            lu0.e(str, str2, MeasureSet.create(list2), DimensionSet.create(list));
        } catch (Throwable th) {
            kgh.d(TAG, "onAppMonitorStatUpload", th);
        }
        return true;
    }

    public boolean onAppMonitorStatUpload(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9e0bb4c", new Object[]{this, str, str2, map, map2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null || map2 == null) {
            return false;
        }
        try {
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map);
            MeasureValueSet create2 = MeasureValueSet.create();
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                create2.setValue(entry.getKey(), Double.parseDouble(entry.getValue()));
            }
            lu0.b(str, str2, create, create2);
        } catch (Throwable th) {
            kgh.d(TAG, "onAppMonitorStatUpload", th);
        }
        return true;
    }

    public String onCache(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("320ba71d", new Object[]{this, str, new Integer(i), str2, str3});
        }
        try {
            kgh.a(TAG, "modelName=" + str + " ,cacheType=" + i + ",key=" + str2 + ",value=" + str3);
        } catch (Throwable unused) {
        }
        if (i < 0) {
            return "";
        }
        if (i == 0) {
            return DAIKVStoreage.getMemoryValue(str, str2);
        }
        if (i == 1) {
            return DAIKVStoreage.getDiskValue(str, str2);
        }
        if (i == 2) {
            return DAIKVStoreage.getValue(str, str2);
        }
        if (i == 3) {
            if (DAIKVStoreage.putToMemory(str, str2, str3)) {
                return "walle_success";
            }
            return "walle_fail";
        } else if (i == 4) {
            if (DAIKVStoreage.putToDisk(str, str2, str3)) {
                return "walle_success";
            }
            return "walle_fail";
        } else if (i == 5) {
            if (DAIKVStoreage.put(str, str2, str3)) {
                return "walle_success";
            }
            return "walle_fail";
        } else if (i == 6) {
            DAIKVStoreage.putToMemory(str, str2, null);
            return "walle_success";
        } else if (i == 7) {
            DAIKVStoreage.putToDisk(str, str2, null);
            return "walle_success";
        } else if (i == 8) {
            DAIKVStoreage.put(str, str2, null);
            return "walle_success";
        } else if (i == 9) {
            return cxw.a(str, str2);
        } else {
            if (i == 10) {
                cxw.b(str, str2, str3);
            } else if (i == 11) {
                cxw.b(str, str2, "");
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:8:0x0035, B:10:0x003b, B:14:0x0050, B:16:0x0056, B:17:0x005d, B:19:0x0065, B:20:0x006a, B:23:0x0079, B:25:0x0083, B:26:0x008b, B:28:0x0091, B:29:0x00a7, B:31:0x00bf, B:33:0x00c5, B:36:0x00cf, B:38:0x00d5, B:40:0x00de), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUtUpload(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tmall.android.dai.internal.compute.ServiceListener.onUtUpload(java.lang.String, java.lang.String, java.lang.String, java.util.Map):boolean");
    }
}
