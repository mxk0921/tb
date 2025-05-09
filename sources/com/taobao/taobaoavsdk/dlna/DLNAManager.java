package com.taobao.taobaoavsdk.dlna;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import java.util.LinkedList;
import tb.fq;
import tb.t2o;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DLNAManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = "AVSDK-dlna";
    private static DLNAManager mDLNAManager = null;
    private boolean mObjReady;
    public a mSearchCallback;
    public b mStartCallback;
    private HashMap<String, String> mStatMap = new HashMap<>();
    public c mStopCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(LinkedList<DLNADeviceInfo> linkedList);

        void b(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(int i);
    }

    static {
        t2o.a(774897918);
    }

    private DLNAManager() {
    }

    private static void OnEventNotify(Object obj, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b89d650", new Object[]{obj, new Integer(i), str, str2});
        }
    }

    private static void OnLog(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ceb72", new Object[]{obj, str});
        }
    }

    private static void OnRefreshResult(Object obj, long[] jArr, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a5f474", new Object[]{obj, jArr, strArr});
            return;
        }
        String str = TAG;
        AVSDKLog.e(str, "OnRefreshResult, callback=" + getInstance().mSearchCallback + ", ids=" + jArr + ", names=" + strArr);
        if (getInstance().mSearchCallback == null) {
            return;
        }
        if (jArr == null || strArr == null || jArr.length <= 0 || jArr.length != strArr.length) {
            getInstance().mSearchCallback.b(-1);
            return;
        }
        LinkedList<DLNADeviceInfo> linkedList = new LinkedList<>();
        for (int i = 0; i < jArr.length; i++) {
            DLNADeviceInfo dLNADeviceInfo = new DLNADeviceInfo();
            dLNADeviceInfo.deviceId = jArr[i];
            dLNADeviceInfo.deviceName = "" + strArr[i];
            linkedList.add(dLNADeviceInfo);
        }
        getInstance().mSearchCallback.a(linkedList);
    }

    private static void OnStartResult(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8caa1320", new Object[]{obj, new Integer(i)});
            return;
        }
        String str = TAG;
        AVSDKLog.e(str, "OnStartResult, resultCode=" + i);
        if (getInstance().mStartCallback != null) {
            getInstance().mStartCallback.a(i);
            getInstance().mStartCallback = null;
        }
    }

    private static void OnTrace(Object obj, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc4b0c4", new Object[]{obj, new Integer(i), str});
            return;
        }
        String str2 = TAG;
        AVSDKLog.e(str2, "OnTrace, traceType=" + i + ", info=" + str);
        commitStat(i, str);
    }

    private native long _createObjInNative(int i);

    private native boolean _initRo(String str);

    private native long _refreshInNative();

    private native long _releaseInNative();

    private native long _startInNative(long j, String[] strArr);

    private native long _stopInNative();

    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void commitStat(int r9, java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.taobaoavsdk.dlna.DLNAManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001c
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r9)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2 = 0
            r9[r2] = r0
            r0 = 1
            r9[r0] = r10
            java.lang.String r10 = "4f95d99b"
            r1.ipc$dispatch(r10, r9)
            return
        L_0x001c:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: Exception -> 0x006a
            r1.<init>()     // Catch: Exception -> 0x006a
            com.taobao.taobaoavsdk.dlna.DLNAManager r2 = getInstance()     // Catch: Exception -> 0x006a
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.mStatMap     // Catch: Exception -> 0x006a
            r1.putAll(r2)     // Catch: Exception -> 0x006a
            java.util.Set r1 = r1.entrySet()     // Catch: Exception -> 0x006a
            java.util.Iterator r1 = r1.iterator()     // Catch: Exception -> 0x006a
            r2 = r0
        L_0x0033:
            boolean r3 = r1.hasNext()     // Catch: Exception -> 0x0068
            if (r3 == 0) goto L_0x0083
            java.lang.Object r3 = r1.next()     // Catch: Exception -> 0x0068
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: Exception -> 0x0068
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: Exception -> 0x0068
            r4.<init>()     // Catch: Exception -> 0x0068
            r4.append(r2)     // Catch: Exception -> 0x0068
            java.lang.String r5 = ","
            r4.append(r5)     // Catch: Exception -> 0x0068
            java.lang.Object r5 = r3.getKey()     // Catch: Exception -> 0x0068
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x0068
            r4.append(r5)     // Catch: Exception -> 0x0068
            java.lang.String r5 = "="
            r4.append(r5)     // Catch: Exception -> 0x0068
            java.lang.Object r3 = r3.getValue()     // Catch: Exception -> 0x0068
            java.lang.String r3 = (java.lang.String) r3     // Catch: Exception -> 0x0068
            r4.append(r3)     // Catch: Exception -> 0x0068
            java.lang.String r2 = r4.toString()     // Catch: Exception -> 0x0068
            goto L_0x0033
        L_0x0068:
            r1 = move-exception
            goto L_0x006c
        L_0x006a:
            r1 = move-exception
            r2 = r0
        L_0x006c:
            java.lang.String r3 = com.taobao.taobaoavsdk.dlna.DLNAManager.TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "commitStat exception. "
            r4.<init>(r5)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.taobao.taobaoavsdk.AVSDKLog.e(r3, r1)
        L_0x0083:
            tb.c2v r1 = tb.c2v.getInstance()
            java.lang.String r1 = r1.getCurrentPageName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "artcDlnaTraceType="
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "artcDlnaTraceData="
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            if (r1 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r0 = r1
        L_0x00ab:
            java.lang.String r1 = "pageName="
            java.lang.String r0 = r1.concat(r0)
            java.lang.String[] r8 = new java.lang.String[]{r9, r10, r0, r2}
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r3 = "Page_Video"
            r4 = 19997(0x4e1d, float:2.8022E-41)
            java.lang.String r5 = "Page_Video_Button-TBPlayerScreenCast"
            com.taobao.statistic.TBS.Ext.commitEvent(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobaoavsdk.dlna.DLNAManager.commitStat(int, java.lang.String):void");
    }

    private void createObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e10162", new Object[]{this});
            return;
        }
        long _createObjInNative = _createObjInNative(2000);
        log("init result=" + _createObjInNative);
        if (_createObjInNative == 0) {
            this.mObjReady = true;
        }
    }

    private void createObjIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf818b4", new Object[]{this});
        } else if (!this.mObjReady) {
            createObj();
        }
    }

    public static synchronized DLNAManager getInstance() {
        synchronized (DLNAManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DLNAManager) ipChange.ipc$dispatch("7847d7fa", new Object[0]);
            }
            if (mDLNAManager == null) {
                DLNAManager dLNAManager = new DLNAManager();
                mDLNAManager = dLNAManager;
                dLNAManager.init();
            }
            return mDLNAManager;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        log("init");
        String t = fq.t();
        if (TextUtils.isEmpty(t)) {
            log("get so path fail.");
            return;
        }
        if (!TaobaoMediaPlayer.isLibLoaded()) {
            TaobaoMediaPlayer.loadLibrariesOnce(null);
            if (!TaobaoMediaPlayer.isLibLoaded()) {
                log("load player so fails");
                return;
            }
        }
        log("init osPath=" + t);
        if (!_initRo(t)) {
            log("init so fail.");
        }
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        AVSDKLog.e(str2, this + ", " + str);
    }

    public void searchProjectionScreenDevice(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626a3ac6", new Object[]{this, aVar});
            return;
        }
        createObjIfNeeded();
        log("searchProjectionScreenDevice, " + aVar + ", mObjReady=" + this.mObjReady);
        if (!this.mObjReady) {
            aVar.b(-99);
            return;
        }
        this.mSearchCallback = aVar;
        long _refreshInNative = _refreshInNative();
        log("searchProjectionScreenDevice, result=" + _refreshInNative);
        if (_refreshInNative < 0) {
            getInstance().mSearchCallback.b(-1);
        }
    }

    public void stopProjectScreenToDevice(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfc79d1", new Object[]{this, cVar});
            return;
        }
        createObjIfNeeded();
        log("stopProjectScreenToDevice, " + cVar + ", mObjReady=" + this.mObjReady);
        if (this.mObjReady) {
            long _stopInNative = _stopInNative();
            log("stopProjectScreenToDevice, stopResult=" + _stopInNative);
        } else if (cVar != null) {
            cVar.a(-99);
        }
    }

    public void updateStat(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db542e6f", new Object[]{this, hashMap});
        } else if (hashMap != null && hashMap.size() != 0) {
            this.mStatMap.putAll(hashMap);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        long _releaseInNative = _releaseInNative();
        this.mSearchCallback = null;
        this.mStartCallback = null;
        this.mObjReady = false;
        log("release, releaseResult=" + _releaseInNative);
    }

    public void startProjectScreenToDevice(DLNADeviceInfo dLNADeviceInfo, HashMap<String, String> hashMap, b bVar) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d0f327", new Object[]{this, dLNADeviceInfo, hashMap, bVar});
            return;
        }
        createObjIfNeeded();
        log("startProjectScreenToDevice " + dLNADeviceInfo + ", " + hashMap + ", " + bVar + ", mObjReady=" + this.mObjReady);
        if (!this.mObjReady) {
            if (bVar != null) {
                bVar.a(-99);
            }
        } else if (hashMap != null && hashMap.size() != 0) {
            this.mStartCallback = bVar;
            String str = hashMap.get("projectScreenPlayUrl");
            String str2 = hashMap.get("projectScreenPlayUrlBackup");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    i = 1;
                } else {
                    return;
                }
            }
            String[] strArr = new String[i];
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                strArr[0] = str;
                strArr[1] = str2;
            } else if (!TextUtils.isEmpty(str)) {
                strArr[0] = str;
            } else if (!TextUtils.isEmpty(str2)) {
                strArr[1] = str2;
            }
            long _startInNative = _startInNative(dLNADeviceInfo.deviceId, strArr);
            log("startProjectScreenToDevice, result=" + _startInNative);
            if (_startInNative < 0) {
                OnStartResult(null, (int) _startInNative);
            }
        }
    }
}
