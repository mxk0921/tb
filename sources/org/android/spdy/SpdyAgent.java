package org.android.spdy;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.android.netutil.UtilTool;
import org.android.spdy.NetWorkStatusUtil;
import tb.atj;
import tb.d61;
import tb.frt;
import tb.l0r;
import tb.tiv;
import tb.txn;
import tb.u8n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SpdyAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final int ACCS_ONLINE_SERVER = 1;
    @Deprecated
    public static final int ACCS_TEST_SERVER = 0;
    private static final int JNI_ERR = -1;
    private static final int JNI_OK = 0;
    private static final int KB32 = 32768;
    private static final int KB8 = 8192;
    private static final int MAX_LONG_SESSION_COUNT = 150;
    private static final int MB5 = 5242880;
    private static final String TAG = "tnetsdk.SpdyAgent";
    private static Context context;
    private static volatile SpdyAgent gSingleInstance;
    private static volatile boolean loadTnetSoSucc;
    private static final Lock r;
    private static final ReentrantReadWriteLock rwLock;
    private static final Lock w;
    public static volatile int wifiConsecutiveFailCount;
    private volatile AccsSSLCallback accsSSLCallback;
    private long agentNativePtr;
    private final AtomicBoolean isAgentInit;
    private static final Object loadSolock = new Object();
    private static final Object ssLCallbackLock = new Object();
    private static final ConcurrentHashMap<String, Integer> domainHashMap = new ConcurrentHashMap<>();
    private static volatile int mSessionUniqueIndex = 0;
    private static final QuicCacher quicSecureSpCache = new u8n();
    private static final Map<String, byte[]> mStorageMap = new ConcurrentHashMap();
    private static volatile long initStartTime = 0;
    private static volatile long sinceInitStartLast = 0;
    public static volatile boolean enableDebug = false;
    public static volatile boolean enableTimeGaurd = false;
    private final AtomicBoolean isAgentClosed = new AtomicBoolean();
    private String proxyUsername = null;
    private String proxyPassword = null;
    private final HashMap<String, SpdySession> sessionMgr = new HashMap<>(5);
    private final LinkedList<SpdySession> sessionQueue = new LinkedList<>();

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        rwLock = reentrantReadWriteLock;
        r = reentrantReadWriteLock.readLock();
        w = reentrantReadWriteLock.writeLock();
    }

    private int AndroidVerifyProof(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67b1eb2f", new Object[]{this, strArr})).intValue();
        }
        return QuicProofVerifier.VerifyProof(null, strArr);
    }

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]);
        }
        return context;
    }

    public static /* synthetic */ QuicCacher access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QuicCacher) ipChange.ipc$dispatch("faa2009", new Object[0]);
        }
        return quicSecureSpCache;
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return mStorageMap;
    }

    private void agentIsOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f569fa00", new Object[]{this});
        } else if (!this.isAgentClosed.get()) {
            checkLoadSo();
        } else {
            throw new SpdyErrorException("SPDY_JNI_ERR_ASYNC_CLOSE", (int) TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
        }
    }

    private int bindSocketFd2NetworkInterfaceN(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2138c839", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == NetWorkStatusUtil.InterfaceStatus.ACTIVE_INTERFACE_WIFI.getInterfaceStatus()) {
            return NetWorkStatusUtil.bindSocketFdUnderWifiNetwork(i);
        }
        if (i2 == NetWorkStatusUtil.InterfaceStatus.ACTIVE_INTERFACE_CELLULAR.getInterfaceStatus()) {
            return NetWorkStatusUtil.bindSocketFdUnderCellularNetwork(i);
        }
        return -1;
    }

    private void bioPingRecvCallback(SpdySession spdySession, int i) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[bioPingRecvCallback] - ");
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[bioPingRecvCallback] - session|session.intenalcb is null");
        } else {
            intenalcb.bioPingRecvCallback(spdySession, i);
        }
    }

    private void checkLoadSo() throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7e0891", new Object[]{this});
            return;
        }
        if (SoInstallMgrSdk.fetchLocalSOStartTime == 0) {
            SoInstallMgrSdk.fetchLocalSoAndPluginLoad();
        }
        if (SoInstallMgrSdk.fetchRemoteSOStartTime == 0) {
            SoInstallMgrSdk.fetchRemoteSoAndPluginLoad();
        }
        if (!loadTnetSoSucc) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            synchronized (loadSolock) {
                if (!loadTnetSoSucc) {
                    loadTnetSoSucc = SoInstallMgrSdk.loadTnetSo();
                    this.agentNativePtr = initAgent(0, l0r.f(), l0r.d());
                    if (!loadTnetSoSucc) {
                        throw new SpdyErrorException("So load fail", (int) TnetStatusCode.TNET_JNI_ERR_LOAD_SO_FAIL);
                    }
                }
            }
        }
    }

    public static boolean checkLoadSucc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e356dfb", new Object[0])).booleanValue();
        }
        return loadTnetSoSucc;
    }

    private native int closeSessionN(long j);

    private byte[] commonCacheLoad(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("15118768", new Object[]{this, str, new Integer(i)});
        }
        try {
            Map<String, byte[]> map = mStorageMap;
            byte[] bArr = map.get(str);
            if (bArr != null) {
                return bArr;
            }
            if (!l0r.Q()) {
                return null;
            }
            byte[] load = quicSecureSpCache.load(str);
            if (load != null) {
                map.put(str, load);
            }
            return load;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void commonCacheRemove(final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd0f077", new Object[]{this, str, new Integer(i)});
            return;
        }
        try {
            frt.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SpdyAgent.access$200().remove(str);
                    if (l0r.Q()) {
                        SpdyAgent.access$100().remove(str);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static int configIpStackMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9011d64d", new Object[]{new Integer(i)})).intValue();
        }
        if (loadTnetSoSucc) {
            return configIpStackModeN(i);
        }
        return -1;
    }

    private static native int configIpStackModeN(int i);

    private native int configLogFileN(String str, int i, int i2);

    private native int configLogFileN(String str, int i, int i2, int i3);

    public static void configSwitchValueByKey(long j, int i, double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e175095", new Object[]{new Long(j), new Integer(i), new Double(d), str});
        } else if (loadTnetSoSucc) {
            configSwitchValueByKeyN(j, i, d, str);
        }
    }

    private static native int configSwitchValueByKeyN(long j, int i, double d, String str);

    private native long createSessionN(long j, SpdySession spdySession, int i, byte[] bArr, char c, byte[] bArr2, char c2, byte[] bArr3, byte[] bArr4, Object obj, int i2, int i3, int i4, byte[] bArr5, int i5, int i6, int i7, int i8, int i9, byte[] bArr6, byte[] bArr7, byte[] bArr8);

    public static byte[] dataproviderToByteArray(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("503d4861", new Object[]{spdyRequest, spdyDataProvider});
        }
        headJudge(spdyRequest.getHeaders());
        if (spdyDataProvider == null) {
            return null;
        }
        String mapBodyToString = mapBodyToString(spdyDataProvider.postBody);
        if (mapBodyToString != null) {
            bArr = mapBodyToString.getBytes();
        } else {
            bArr = spdyDataProvider.data;
        }
        if (bArr == null || bArr.length < 5242880) {
            return bArr;
        }
        throw new SpdyErrorException("INVALID_PARAM:total=" + bArr.length, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    private native int freeAgent(long j);

    private int getActiveInterfaceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48fbc471", new Object[]{this})).intValue();
        }
        return NetWorkStatusUtil.currentInterfaceStatus.getInterfaceStatus();
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        if (context == null) {
            context = UtilTool.getDefaultAppContext();
        }
        return context;
    }

    private int getDomainHashIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("812e90ce", new Object[]{this, str})).intValue();
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = domainHashMap;
        Integer num = concurrentHashMap.get(str);
        if (num == null) {
            int i = mSessionUniqueIndex + 1;
            mSessionUniqueIndex = i;
            concurrentHashMap.put(str, Integer.valueOf(i));
            num = Integer.valueOf(mSessionUniqueIndex);
        }
        return num.intValue();
    }

    public static SpdyAgent getInstance(Context context2, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind) throws UnsatisfiedLinkError, SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("3365208a", new Object[]{context2, spdyVersion, spdySessionKind});
        }
        if (context2 != null && context == null) {
            context = context2;
        }
        return getInstance(context2, spdyVersion, spdySessionKind, null);
    }

    private int getNetWorkStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9433a4", new Object[]{this})).intValue();
        }
        boolean isWifi = NetWorkStatusUtil.isWifi();
        return NetWorkStatusUtil.isMobile() ? (isWifi ? 1 : 0) | 2 : isWifi ? 1 : 0;
    }

    private byte[] getSSLMeta(SpdySession spdySession) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        if (spdySession != null && (intenalcb = spdySession.intenalcb) != null) {
            return intenalcb.getSSLMeta(spdySession);
        }
        spduLog.Logi(TAG, "[getSSLMeta] - session|session.intenalcb is null");
        return null;
    }

    private SpdySession getSpdySession(String str) {
        SpdySession spdySession;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("9ff52554", new Object[]{this, str});
        }
        agentIsOpen();
        Lock lock = r;
        lock.lock();
        try {
            SpdySession spdySession2 = this.sessionMgr.get(str);
            if (this.sessionMgr.size() < 150) {
                z = false;
            }
            lock.unlock();
            if (z) {
                throw new SpdyErrorException("SPDY_SESSION_EXCEED_MAXED", (int) TnetStatusCode.TNET_SESSION_EXCEED_MAXED);
            } else if (spdySession2 != null) {
                spdySession2.increRefCount();
                return spdySession2;
            } else {
                Lock lock2 = w;
                lock2.lock();
                try {
                    spdySession = this.sessionMgr.get(str);
                    lock2.unlock();
                } catch (Throwable unused) {
                    w.unlock();
                    spdySession = null;
                }
                if (spdySession == null) {
                    return null;
                }
                spdySession.increRefCount();
                return spdySession;
            }
        } catch (Throwable th) {
            r.unlock();
            throw th;
        }
    }

    public static void headJudge(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcc9da7", new Object[]{map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                InvlidCharJudge(key.getBytes(), value.getBytes());
                i += key.length() + 1 + value.length();
                securityCheck(i, value.length());
            }
        }
    }

    private native long initAgent(int i, int i2, int i3);

    public static boolean isInAllowLaunchTimePass(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48786d76", new Object[]{new Long(j)})).booleanValue();
        }
        if (sinceInitStartLast > j) {
            return false;
        }
        if (initStartTime == 0) {
            initStartTime = System.currentTimeMillis();
        }
        sinceInitStartLast = System.currentTimeMillis() - initStartTime;
        if (sinceInitStartLast < j) {
            return true;
        }
        return false;
    }

    public static boolean isQuicReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddbcf06", new Object[0])).booleanValue();
        }
        return SoInstallMgrSdk.loadQuicSucc;
    }

    private native void logFileCloseN();

    private native void logFileFlushN();

    private int logOutput(final int i, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3949ba8", new Object[]{this, new Integer(i), str, str2, str3})).intValue();
        }
        if (!l0r.W()) {
            return -1;
        }
        try {
            frt.d(new Runnable() { // from class: org.android.spdy.SpdyAgent.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        spduLog.logAdapter(i, str, str2, str3, new Object[0]);
                    }
                }
            });
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String mapBodyToString(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fbd8cec", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append('=');
            sb.append(value);
            sb.append('&');
            i += key.length() + 1 + value.length();
            tableListJudge(i);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static boolean pluginLoadQuicSo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6588d3a8", new Object[]{str})).booleanValue();
        }
        if (!loadTnetSoSucc || pluginLoadQuicSoN(str) != 0) {
            return false;
        }
        return true;
    }

    private static native int pluginLoadQuicSoN(String str);

    public static boolean pluginLoadZstdSo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c6d3d3", new Object[]{str})).booleanValue();
        }
        if (!loadTnetSoSucc || pluginLoadZstdSoN(str) != 0) {
            return false;
        }
        return true;
    }

    private static native int pluginLoadZstdSoN(String str);

    private int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        if (spdySession != null && (intenalcb = spdySession.intenalcb) != null) {
            return intenalcb.putSSLMeta(spdySession, bArr);
        }
        spduLog.Logi(TAG, "[putSSLMeta] - session|session.intenalcb is null");
        return -1;
    }

    public static void registerQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6577c030", new Object[]{iPluginFetchCallback});
        } else {
            SoInstallMgrSdk.registerQuicListener(iPluginFetchCallback);
        }
    }

    public static void securityCheck(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64b06cf", new Object[]{new Integer(i), new Integer(i2)});
        } else if (i >= 32768) {
            throw new SpdyErrorException("INVALID_PARAM:total1=" + i, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        } else if (i2 >= 8192) {
            throw new SpdyErrorException("INVALID_PARAM:value=" + i2, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
    }

    public static void setContext(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context2});
            return;
        }
        if (context2 == null) {
            context2 = UtilTool.getDefaultAppContext();
        }
        context = context2;
    }

    private void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[spdyCustomControlFrameFailCallback] - ");
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[spdyCustomControlFrameFailCallback] - session|session.intenalcb is null");
        } else {
            intenalcb.spdyCustomControlFrameFailCallback(spdySession, obj, i, i2);
        }
    }

    private void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, int i, SpdyByteArray spdyByteArray, ByteBuffer byteBuffer, int i2, int i3) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6aa066", new Object[]{this, spdySession, new Boolean(z), new Integer(i), spdyByteArray, byteBuffer, new Integer(i2), new Integer(i3)});
            return;
        }
        spduLog.Logi(TAG, "[spdyDataChunkRecvCB] - ");
        if (i2 == 1) {
            spdyByteArray.setDirectBufferMode(true);
            spdyByteArray.setDirectByteBuffer(byteBuffer);
        }
        long j = i & tiv.INT_MASK;
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[spdyDataChunkRecvCB] - session|session.intenalcb is null");
        } else {
            intenalcb.spdyDataChunkRecvCB(spdySession, z, j, spdyByteArray, i3);
        }
    }

    private void spdyDataSendCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a1009c", new Object[]{this, spdySession, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        long j = tiv.INT_MASK & i;
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[spdyDataSendCallback] - session|session.intenalcb is null");
        } else {
            intenalcb.spdyDataSendCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyRequestRecvCallback(SpdySession spdySession, int i, int i2) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f084c", new Object[]{this, spdySession, new Integer(i), new Integer(i2)});
            return;
        }
        long j = i & tiv.INT_MASK;
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[spdyRequestRecvCallback] - session|session.intenalcb is null");
        } else {
            intenalcb.spdyRequestRecvCallback(spdySession, j, i2);
        }
    }

    private void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionOnWritable] - ");
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[spdySessionOnWritable] - session|session.intenalcb is null");
            return;
        }
        try {
            intenalcb.spdySessionOnWritable(spdySession, obj, i);
        } catch (Throwable th) {
            spduLog.Loge(TAG, "[spdySessionOnWritable] - exception:", th);
        }
    }

    public static void tableListJudge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ae0d51", new Object[]{new Integer(i)});
        } else if (i >= 5242880) {
            throw new SpdyErrorException("INVALID_PARAM:total2=" + i, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
    }

    public static void unregisterQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba94277", new Object[]{iPluginFetchCallback});
        } else {
            SoInstallMgrSdk.unregisterQuicListener(iPluginFetchCallback);
        }
    }

    public void InitializeSecurityStuff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4747374b", new Object[]{this});
            return;
        }
        quicSecureSpCache.init(context);
        AndroidTrustAnchors.getInstance().InitializeFromPresetCertificat();
    }

    @Deprecated
    public native String ResolveHost(String str, String str2, int i);

    public void clearSpdySession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1bd48", new Object[]{this, str});
        } else if (str != null) {
            Lock lock = w;
            lock.lock();
            try {
                this.sessionMgr.remove(str);
                lock.unlock();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    w.unlock();
                }
            }
        }
    }

    public int closeSession(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfbf2c52", new Object[]{this, new Long(j)})).intValue();
        }
        return closeSessionN(j);
    }

    public int configLogFile(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec49f1e2", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (loadTnetSoSucc) {
            return configLogFileN(str, i, i2);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("4f35824", new Object[]{this, str, str2, obj, sessionCb, sslCertcb, new Integer(i), new Integer(i2)}) : createSession(str, str2, obj, sessionCb, null, i, i2, -1);
    }

    public HashMap<String, SpdySession> getAllSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2eb35595", new Object[]{this});
        }
        return this.sessionMgr;
    }

    public void logFileClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebac377f", new Object[]{this});
        } else if (loadTnetSoSucc) {
            logFileFlushN();
            logFileCloseN();
        }
    }

    public void logFileFlush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6092e8b", new Object[]{this});
        } else if (loadTnetSoSucc) {
            logFileFlushN();
        }
    }

    public void removeSession(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545ff676", new Object[]{this, spdySession});
            return;
        }
        Lock lock = w;
        lock.lock();
        try {
            this.sessionQueue.remove(spdySession);
            lock.unlock();
        } catch (Throwable th) {
            w.unlock();
            throw th;
        }
    }

    public void setProxyUsernamePassword(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0ac9f8", new Object[]{this, str, str2});
            return;
        }
        this.proxyUsername = str;
        this.proxyPassword = str2;
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("6957a2b4", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, sslCertcb, new Integer(i)});
        }
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, 0, spdyRequest.getConnectionTimeoutMs());
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    @Deprecated
    public void switchAccsServer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53144b3", new Object[]{this, new Integer(i)});
        }
    }

    private SpdyAgent(Context context2, AccsSSLCallback accsSSLCallback) throws UnsatisfiedLinkError {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.isAgentInit = atomicBoolean;
        try {
            initStartTime = System.currentTimeMillis();
            setContext(context2);
            if (atomicBoolean.compareAndSet(false, true)) {
                txn.g(context);
                loadTnetSoSucc = SoInstallMgrSdk.loadTnetSo();
                SoInstallMgrSdk.fetchLocalSoAndPluginLoad();
                this.agentNativePtr = initAgent(0, l0r.f(), l0r.d());
                setAccsSslCallback(accsSSLCallback);
                frt.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        txn.h(SpdyAgent.access$000());
                        NetWorkStatusUtil.registerNetwork(SpdyAgent.access$000());
                        d61.c(SpdyAgent.access$000());
                        long currentTimeMillis2 = System.currentTimeMillis();
                        SpdyAgent.this.InitializeSecurityStuff();
                        spduLog.Tloge(SpdyAgent.TAG, "[tnetInit]", " Async task cost:" + (System.currentTimeMillis() - currentTimeMillis), "spTime", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.isAgentClosed.set(false);
        spduLog.Tloge(TAG, "[tnetInit]", " core cost:" + (System.currentTimeMillis() - initStartTime), "thread", Integer.valueOf(l0r.f()));
    }

    private void spdyPingRecvCallback(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52c08cc", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        spduLog.Logi(TAG, "[spdyPingRecvCallback] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyPingRecvCallback] - session|session.intenalcb is null");
            return;
        }
        if (!spdySession.isForceUseCellular() && i > 0) {
            wifiConsecutiveFailCount = 0;
        }
        spdySession.intenalcb.spdyPingRecvCallback(spdySession, i, obj);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (l0r.l() && !this.isAgentClosed.getAndSet(true)) {
            w.lock();
            try {
                SpdySession poll = this.sessionQueue.poll();
                while (true) {
                    SpdySession spdySession = poll;
                    if (spdySession == null) {
                        break;
                    }
                    spdySession.closeInternal();
                    poll = this.sessionQueue.poll();
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                }
            }
            long j = this.agentNativePtr;
            if (j != 0) {
                try {
                    freeAgent(j);
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                }
                this.agentNativePtr = 0L;
            }
            Lock lock = w;
            lock.lock();
            try {
                this.sessionMgr.clear();
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    lock = w;
                } finally {
                }
            }
            lock.unlock();
        }
    }

    public int configLogFile(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cf4bee7", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (loadTnetSoSucc) {
            return configLogFileN(str, i, i2, i3);
        }
        return -1;
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2, int i3) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("537dce7f", new Object[]{this, str, str2, obj, sessionCb, sslCertcb, new Integer(i), new Integer(i2), new Integer(i3)}) : createSession(str, str2, obj, sessionCb, null, i, i2, i3, null, 0, 0, -1, null, null, false, false, false, 0);
    }

    public static void InvlidCharJudge(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65686c0", new Object[]{bArr, bArr2});
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if ((b & 255) < 32 || (b & 255) > 126) {
                bArr[i] = 63;
            }
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            byte b2 = bArr2[i2];
            if ((b2 & 255) < 32 || (b2 & 255) > 126) {
                bArr2[i2] = 63;
            }
        }
    }

    private boolean commonCacheStore(final String str, final String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2e988c2", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            mStorageMap.put(str, str2.getBytes());
            frt.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (l0r.Q()) {
                        SpdyAgent.access$100().store(str, str2);
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String[] mapToByteArray(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f2df51b3", new Object[]{map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        String[] strArr = new String[map.size() * 2];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr;
    }

    private void spdyDataRecvCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        Intenalcb intenalcb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd9167a", new Object[]{this, spdySession, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        spduLog.Logi(TAG, "[spdyDataRecvCallback] - ");
        long j = i & tiv.INT_MASK;
        if (spdySession == null || (intenalcb = spdySession.intenalcb) == null) {
            spduLog.Logi(TAG, "[spdyDataRecvCallback] - session|session.intenalcb is null");
        } else {
            intenalcb.spdyDataRecvCallback(spdySession, z, j, i2, i3);
        }
    }

    public static Map<String, List<String>> stringArrayToMap(String[] strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e6b9a414", new Object[]{strArr});
        }
        if (strArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap(5);
        while (true) {
            int i2 = i + 2;
            if (i2 <= strArr.length) {
                String str = strArr[i];
                if (str == null) {
                    break;
                }
                int i3 = i + 1;
                if (strArr[i3] == null) {
                    break;
                }
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList(1);
                    hashMap.put(strArr[i], list);
                }
                list.add(strArr[i3]);
                i = i2;
            } else {
                return hashMap;
            }
        }
        return null;
    }

    public SpdySession createSession(SessionInfo sessionInfo) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("b29f7bf5", new Object[]{this, sessionInfo}) : createSession(sessionInfo.getAuthority(), sessionInfo.getDomain(), sessionInfo.getSessonUserData(), sessionInfo.getSessionCb(), sessionInfo.getSessionCustomExtraCb(), sessionInfo.getMode(), sessionInfo.getPubKeySeqNum(), sessionInfo.getConnectionTimeoutMs(), sessionInfo.getCertHost(), sessionInfo.getXquicCongControl(), sessionInfo.getRecvRateBps(), sessionInfo.getMss(), sessionInfo.getTunnelDomain(), sessionInfo.getTunnelStrategyList(), sessionInfo.getMultiPathCompensateEnable(), sessionInfo.getMultiPathParallelAddSpeedEnable(), sessionInfo.isTryForceCellular(), sessionInfo.getConnectIndex());
    }

    @Deprecated
    public static SpdyAgent getInstance(Context context2, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback) throws UnsatisfiedLinkError, SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("2e985968", new Object[]{context2, spdyVersion, spdySessionKind, accsSSLCallback});
        }
        if (gSingleInstance == null) {
            synchronized (loadSolock) {
                try {
                    if (gSingleInstance == null) {
                        gSingleInstance = new SpdyAgent(context2, accsSSLCallback);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return gSingleInstance;
    }

    private void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionCloseCallback] - errorCode = ", i);
        if (spdySession == null) {
            spduLog.Logi(TAG, "[spdySessionCloseCallback] - session|session.intenalcb is null");
            return;
        }
        try {
            if (!spdySession.isBg && d61.d() && i == -2301) {
                superviseConnectInfo.bgForbiddenTime = System.currentTimeMillis() - d61.b();
            }
            spdySession.setSuperviseConnectInfoOnDisconnectedCB(superviseConnectInfo);
            spdySession.checkWifiConsecutiveFailStatus(i);
            spduLog.Tloge(TAG, spdySession.getSessionSeq(), "[SessionCloseCallback]", AmnetMonitorLoggerListener.LogModel.ERR_CODE, Integer.valueOf(i));
            Intenalcb intenalcb = spdySession.intenalcb;
            if (intenalcb != null) {
                intenalcb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i);
            }
            spdySession.cleanUp();
            spdySession.releasePptr();
        } catch (Throwable th) {
            spdySession.cleanUp();
            throw th;
        }
    }

    private void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionConnectCB] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdySessionConnectCB] - session|session.intenalcb is null");
            return;
        }
        spdySession.setSuperviseConnectInfoOnConnectedCB(superviseConnectInfo);
        spduLog.Tloge(TAG, spdySession.getSessionSeq(), "[SessionConnectCB]", "stat", spdySession.getConnectInfoOnConnected());
        spdySession.intenalcb.spdySessionConnectCB(spdySession, superviseConnectInfo);
    }

    public void setAccsSslCallback(AccsSSLCallback accsSSLCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dae67a6", new Object[]{this, accsSSLCallback});
        } else if (accsSSLCallback == null) {
            spduLog.Tloge(TAG, null, "[setAccsSslCallback] cb null", new Object[0]);
        } else {
            synchronized (ssLCallbackLock) {
                this.accsSSLCallback = accsSSLCallback;
                spduLog.Tloge(TAG, null, "[setAccsSslCallback]", accsSSLCallback.getClass(), atj.CALL_BACK, this.accsSSLCallback);
            }
        }
    }

    private byte[] getSSLPublicKey(int i, byte[] bArr) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
        }
        if (!isInAllowLaunchTimePass(l0r.a()) || !l0r.q() || i != 1) {
            synchronized (ssLCallbackLock) {
                try {
                    if (this.accsSSLCallback != null) {
                        bArr2 = this.accsSSLCallback.getSSLPublicKey(i, bArr);
                    } else {
                        spduLog.Tloge(TAG, null, "getSSLPublicKey fail, cb is null", new Object[0]);
                        bArr2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bArr2 == null) {
                spduLog.Tloge(TAG, null, "getSSLPublicKey fail", atj.CALL_BACK, this.accsSSLCallback, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(i), "cipher", bArr);
            }
            return bArr2;
        }
        spduLog.Tloge(TAG, null, "[getSSLPublicKey] second refresh cdn pubkey to plain", UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(i));
        return null;
    }

    private void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr, SuperviseData superviseData) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd9c77c", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr, superviseData});
            return;
        }
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - ");
        if (spdySession == null || (spdySession.intenalcb == null && spdySession.customExtraCb == null)) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session|session.intenalcb is null");
            return;
        }
        if (!spdySession.isForceUseCellular()) {
            wifiConsecutiveFailCount = 0;
        }
        System.currentTimeMillis();
        SessionCustomExtraCb sessionCustomExtraCb = spdySession.customExtraCb;
        if (sessionCustomExtraCb != null) {
            sessionCustomExtraCb.onCustomFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr, superviseData, null);
        } else {
            spdySession.intenalcb.spdyCustomControlFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr);
        }
        if ((spdySession.getMode() & 256) != 0 && (spdySession.getMode() & 16) != 0 && superviseData != null && (i5 = superviseData.unreliableChannelMss) > spdySession.unreliableChannelMss) {
            spdySession.unreliableChannelMss = i5;
        }
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("7ba2d5ef", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, sslCertcb, new Integer(i), new Integer(i2)});
        }
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, i2, spdyRequest.getConnectionTimeoutMs());
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    /* JADX WARN: Finally extract failed */
    private void spdySessionFailedError(SpdySession spdySession, int i, Object obj, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7421c3", new Object[]{this, spdySession, new Integer(i), obj, superviseConnectInfo});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionFailedError] - ");
        if (spdySession == null) {
            spduLog.Logi(TAG, "[spdySessionFailedError] - session|session.intenalcb is null");
            return;
        }
        try {
            spdySession.setSuperviseConnectInfoOnConnectedCB(superviseConnectInfo);
            spdySession.setSuperviseConnectInfoOnDisconnectedCB(superviseConnectInfo);
            spduLog.Tloge(TAG, spdySession.getSessionSeq(), "spdySessionFailedError", AmnetMonitorLoggerListener.LogModel.ERR_CODE, Integer.valueOf(i), "stat", spdySession.getConnectInfoOnDisConnected());
            spdySession.checkWifiConsecutiveFailStatus(i);
            Intenalcb intenalcb = spdySession.intenalcb;
            if (intenalcb != null) {
                intenalcb.spdySessionFailedError(spdySession, i, obj);
            }
            spdySession.cleanUp();
            spdySession.releasePptr();
        } catch (Throwable th) {
            spdySession.cleanUp();
            throw th;
        }
    }

    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i, int i2) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("e335a2a1", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, new Integer(i), new Integer(i2)}) : submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, null, i, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:(6:(3:140|45|(42:47|50|54|147|55|56|142|57|(28:62|63|65|(1:67)(1:68)|69|(1:71)(1:72)|(1:74)(1:75)|(4:82|83|144|84)(1:78)|79|85|(1:92)(1:89)|93|(1:95)(1:96)|(1:98)(2:99|100)|101|102|(1:104)(1:105)|106|(1:108)(1:109)|110|(1:112)(1:113)|114|(1:116)(1:117)|118|146|(4:120|121|122|123)(2:125|(1:127)(2:130|131))|128|129)|64|63|65|(0)(0)|69|(0)(0)|(0)(0)|(0)|82|83|144|84|79|85|(1:87)|92|93|(0)(0)|(0)(0)|101|102|(0)(0)|106|(0)(0)|110|(0)(0)|114|(0)(0)|118|146|(0)(0)|128|129))|(34:59|62|63|65|(0)(0)|69|(0)(0)|(0)(0)|(0)|82|83|144|84|79|85|(0)|92|93|(0)(0)|(0)(0)|101|102|(0)(0)|106|(0)(0)|110|(0)(0)|114|(0)(0)|118|146|(0)(0)|128|129)|146|(0)(0)|128|129)|147|55|56|142|57|64|63|65|(0)(0)|69|(0)(0)|(0)(0)|(0)|82|83|144|84|79|85|(0)|92|93|(0)(0)|(0)(0)|101|102|(0)(0)|106|(0)(0)|110|(0)(0)|114|(0)(0)|118) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cf, code lost:
        if (r69 != 10) goto L_0x00e5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c2, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f6, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036f A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:57:0x0259, B:59:0x0273, B:64:0x027d, B:65:0x0284, B:69:0x0297, B:72:0x02a0, B:75:0x02ab, B:78:0x02b5, B:82:0x02c7, B:102:0x034d, B:105:0x036f, B:106:0x0376, B:110:0x0385, B:114:0x0393, B:116:0x047e, B:120:0x0489), top: B:142:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x047e A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:57:0x0259, B:59:0x0273, B:64:0x027d, B:65:0x0284, B:69:0x0297, B:72:0x02a0, B:75:0x02ab, B:78:0x02b5, B:82:0x02c7, B:102:0x034d, B:105:0x036f, B:106:0x0376, B:110:0x0385, B:114:0x0393, B:116:0x047e, B:120:0x0489), top: B:142:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0489 A[Catch: all -> 0x02c2, TRY_LEAVE, TryCatch #1 {all -> 0x02c2, blocks: (B:57:0x0259, B:59:0x0273, B:64:0x027d, B:65:0x0284, B:69:0x0297, B:72:0x02a0, B:75:0x02ab, B:78:0x02b5, B:82:0x02c7, B:102:0x034d, B:105:0x036f, B:106:0x0376, B:110:0x0385, B:114:0x0393, B:116:0x047e, B:120:0x0489), top: B:142:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a0 A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:57:0x0259, B:59:0x0273, B:64:0x027d, B:65:0x0284, B:69:0x0297, B:72:0x02a0, B:75:0x02ab, B:78:0x02b5, B:82:0x02c7, B:102:0x034d, B:105:0x036f, B:106:0x0376, B:110:0x0385, B:114:0x0393, B:116:0x047e, B:120:0x0489), top: B:142:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ab A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:57:0x0259, B:59:0x0273, B:64:0x027d, B:65:0x0284, B:69:0x0297, B:72:0x02a0, B:75:0x02ab, B:78:0x02b5, B:82:0x02c7, B:102:0x034d, B:105:0x036f, B:106:0x0376, B:110:0x0385, B:114:0x0393, B:116:0x047e, B:120:0x0489), top: B:142:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e3 A[Catch: all -> 0x02f6, TryCatch #2 {all -> 0x02f6, blocks: (B:84:0x02da, B:85:0x02df, B:87:0x02e3, B:89:0x02e7, B:93:0x02fe, B:99:0x031d), top: B:144:0x02da }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031d A[Catch: all -> 0x02f6, TRY_LEAVE, TryCatch #2 {all -> 0x02f6, blocks: (B:84:0x02da, B:85:0x02df, B:87:0x02e3, B:89:0x02e7, B:93:0x02fe, B:99:0x031d), top: B:144:0x02da }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.android.spdy.SpdySession createSession(java.lang.String r63, java.lang.String r64, java.lang.Object r65, org.android.spdy.SessionCb r66, org.android.spdy.SessionCustomExtraCb r67, int r68, int r69, int r70, java.lang.String r71, int r72, int r73, int r74, java.lang.String r75, java.util.ArrayList<org.android.spdy.StrategyInfo> r76, boolean r77, boolean r78, boolean r79, int r80) throws org.android.spdy.SpdyErrorException {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdyAgent.createSession(java.lang.String, java.lang.String, java.lang.Object, org.android.spdy.SessionCb, org.android.spdy.SessionCustomExtraCb, int, int, int, java.lang.String, int, int, int, java.lang.String, java.util.ArrayList, boolean, boolean, boolean, int):org.android.spdy.SpdySession");
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("aebf77c2", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, new Integer(i)}) : submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, (SslCertcb) null, i);
    }

    private void spdyStreamCloseCallback(SpdySession spdySession, int i, int i2, int i3, SuperviseData superviseData) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce3a38b", new Object[]{this, spdySession, new Integer(i), new Integer(i2), new Integer(i3), superviseData});
            return;
        }
        spduLog.Logi(TAG, "[spdyStreamCloseCallback] - ");
        long j = i & tiv.INT_MASK;
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyStreamCloseCallback] - session|session.intenalcb is null");
            return;
        }
        if (!spdySession.isForceUseCellular() && i2 == 0) {
            wifiConsecutiveFailCount = 0;
        }
        if (superviseData != null) {
            try {
                superviseData.spdySession = spdySession;
                if (spdySession.isQUIC() && (i4 = superviseData.unreliableChannelMss) != spdySession.unreliableChannelMss) {
                    spdySession.unreliableChannelMss = i4;
                }
                if (spdySession.isTunnel()) {
                    superviseData.tunnelType = spdySession.mSuperviseConnectInfo.tunnelType;
                    if (spdySession.isTunnelProxyClose()) {
                        superviseData.tunnelDegraded = 1;
                        superviseData.tunnelErrorCode = spdySession.mSuperviseConnectInfo.tunnelErrorCode;
                    }
                }
            } catch (Exception unused) {
            }
        }
        spdySession.intenalcb.spdyStreamCloseCallback(spdySession, j, i2, i3, superviseData);
    }

    private void spdyStreamResponseRecv(SpdySession spdySession, int i, byte[] bArr, int[] iArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a81d4a8", new Object[]{this, spdySession, new Integer(i), bArr, iArr, new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[spdyStreamResponseRecv] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyStreamResponseRecv] - session|session.intenalcb is null");
            return;
        }
        String[] strArr = new String[iArr.length];
        HTTPHeaderPool instance = HTTPHeaderPool.getInstance();
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            strArr[i4] = instance.GetValueString(ByteBuffer.wrap(bArr, i3, iArr[i4]));
            int i5 = i3 + iArr[i4];
            int i6 = i4 + 1;
            int i7 = iArr[i6];
            if (i7 > 32) {
                strArr[i6] = new String(bArr, i5, i7);
            } else {
                strArr[i6] = instance.GetValueString(ByteBuffer.wrap(bArr, i5, i7));
            }
            i3 = i5 + iArr[i6];
        }
        spdySession.intenalcb.spdyOnStreamResponse(spdySession, i & tiv.INT_MASK, stringArrayToMap(strArr), i2);
    }
}
