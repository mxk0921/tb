package org.android.spdy;

import android.text.TextUtils;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.netutil.UtilTool;
import tb.b79;
import tb.bzn;
import tb.l0r;
import tb.y69;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SoInstallMgrSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String QUIC_SO_NAME = "xquic";
    private static final String TAG = "tnetsdk.SoInstallMgrSdk";
    private static final String TNET_SO_NAME = "tnet";
    private static final String ZSTD_SO_NAME = "zstd";
    private static String mQuicSoPath;
    private static String mZstdSoPath;
    private static final AtomicBoolean isLocalSOInit = new AtomicBoolean(false);
    private static final CopyOnWriteArraySet<IPluginFetchCallback> quicListeners = new CopyOnWriteArraySet<>();
    public static volatile long fetchLocalSOStartTime = 0;
    private static long fetchQuicTime = 0;
    public static volatile boolean loadQuicSucc = false;
    public static int loadQuicStat = -1;
    private static final AtomicBoolean isRemoteSOInit = new AtomicBoolean(false);
    public static volatile long fetchRemoteSOStartTime = 0;
    private static long fetchZstdTime = 0;
    public static int loadZstdStat = -1;

    public static /* synthetic */ long access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue();
        }
        return fetchQuicTime;
    }

    public static /* synthetic */ long access$002(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550f5f", new Object[]{new Long(j)})).longValue();
        }
        fetchQuicTime = j;
        return j;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return mQuicSoPath;
    }

    public static /* synthetic */ String access$102(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de613c1c", new Object[]{str});
        }
        mQuicSoPath = str;
        return str;
    }

    public static /* synthetic */ CopyOnWriteArraySet access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("c59b2470", new Object[0]);
        }
        return quicListeners;
    }

    public static /* synthetic */ long access$302(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f895fc", new Object[]{new Long(j)})).longValue();
        }
        fetchZstdTime = j;
        return j;
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return mZstdSoPath;
    }

    public static /* synthetic */ String access$402(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f490db79", new Object[]{str});
        }
        mZstdSoPath = str;
        return str;
    }

    public static void fetchLocalSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bb8cea", new Object[0]);
        } else if (isLocalSOInit.compareAndSet(false, true)) {
            fetchLocalSOStartTime = System.currentTimeMillis();
            fetchQuicSoAndPluginLoad();
        }
    }

    public static void fetchRemoteSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72339bb", new Object[0]);
        } else if (isRemoteSOInit.compareAndSet(false, true)) {
            fetchRemoteSOStartTime = System.currentTimeMillis();
            fetchZstdSoAndPluginLoad();
        }
    }

    public static void fetchZstdSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35cf38", new Object[0]);
        } else if (!l0r.Z()) {
            loadZstdStat = 0;
        } else {
            try {
                bzn.b().b("zstd", new y69() { // from class: org.android.spdy.SoInstallMgrSdk.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.y69
                    public void onFetchFinished(b79 b79Var) {
                        int i;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4302726d", new Object[]{this, b79Var});
                            return;
                        }
                        SoInstallMgrSdk.access$302(System.currentTimeMillis() - SoInstallMgrSdk.fetchRemoteSOStartTime);
                        if (!TextUtils.isEmpty(b79Var.d())) {
                            SoInstallMgrSdk.access$402(b79Var.d());
                            boolean pluginLoadZstdSo = SpdyAgent.pluginLoadZstdSo(SoInstallMgrSdk.access$400());
                            if (pluginLoadZstdSo) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            SoInstallMgrSdk.loadZstdStat = i;
                            spduLog.Tloge(SoInstallMgrSdk.TAG, null, "[RemoteZstd] succ=" + pluginLoadZstdSo, "path", SoInstallMgrSdk.access$400());
                            return;
                        }
                        int errorCode = b79Var.c().getErrorCode();
                        SoInstallMgrSdk.loadZstdStat = errorCode;
                        spduLog.Tloge(SoInstallMgrSdk.TAG, null, "[RemoteZstd] path null", "errCode", Integer.valueOf(errorCode));
                    }
                });
            } catch (Throwable th) {
                loadZstdStat = 3;
                spduLog.Tloge(TAG, null, "[RemoteZstd] fail", "e", th);
            }
        }
    }

    public static Long getFetchQuicTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("107655ff", new Object[0]);
        }
        long j = fetchQuicTime;
        if (j <= 0) {
            j = System.currentTimeMillis() - fetchLocalSOStartTime;
        }
        return Long.valueOf(j);
    }

    public static Long getFetchZstdTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("bab22474", new Object[0]);
        }
        long j = fetchZstdTime;
        if (j <= 0) {
            j = System.currentTimeMillis() - fetchRemoteSOStartTime;
        }
        return Long.valueOf(j);
    }

    public static void registerQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6577c030", new Object[]{iPluginFetchCallback});
        } else if (iPluginFetchCallback != null) {
            quicListeners.add(iPluginFetchCallback);
        }
    }

    public static void unregisterQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba94277", new Object[]{iPluginFetchCallback});
        } else {
            quicListeners.remove(iPluginFetchCallback);
        }
    }

    public static boolean loadTnetSo() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d84ac76", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            System.loadLibrary(TNET_SO_NAME);
            z = true;
        } catch (Throwable th) {
            th.printStackTrace();
            z = false;
        }
        spduLog.Tloge(TAG, null, "loadTnet so", "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "succ", Boolean.valueOf(z));
        return z;
    }

    public static void fetchQuicSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4e7e43", new Object[0]);
        } else if (!l0r.N()) {
            spduLog.Tloge(TAG, null, "disable load quic", "enable", Boolean.valueOf(l0r.S()), "process", UtilTool.getProcessName());
            loadQuicStat = 0;
        } else {
            try {
                bzn.b().b(QUIC_SO_NAME, new y69() { // from class: org.android.spdy.SoInstallMgrSdk.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.y69
                    public void onFetchFinished(b79 b79Var) {
                        int i;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4302726d", new Object[]{this, b79Var});
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        SoInstallMgrSdk.access$002(currentTimeMillis - SoInstallMgrSdk.fetchLocalSOStartTime);
                        if (!TextUtils.isEmpty(b79Var.d())) {
                            SoInstallMgrSdk.access$102(b79Var.d());
                            SoInstallMgrSdk.loadQuicSucc = SpdyAgent.pluginLoadQuicSo(SoInstallMgrSdk.access$100());
                            if (SoInstallMgrSdk.loadQuicSucc) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            SoInstallMgrSdk.loadQuicStat = i;
                        } else {
                            SoInstallMgrSdk.loadQuicStat = b79Var.c().getErrorCode();
                        }
                        spduLog.Tloge(SoInstallMgrSdk.TAG, null, "[RemoteXquic] succ=" + SoInstallMgrSdk.loadQuicSucc, "stat", Integer.valueOf(SoInstallMgrSdk.loadQuicStat), "path", SoInstallMgrSdk.access$100(), CredentialRpcData.ACTION_FETCH, Long.valueOf(SoInstallMgrSdk.access$000()), "load", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        Iterator it = SoInstallMgrSdk.access$200().iterator();
                        while (it.hasNext()) {
                            try {
                                ((IPluginFetchCallback) it.next()).onFetchFinished(SoInstallMgrSdk.loadQuicSucc, null);
                            } catch (Exception e) {
                                spduLog.Tloge(SoInstallMgrSdk.TAG, null, "listener exception", e);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                loadQuicStat = 3;
                spduLog.Tloge(TAG, null, "[RemoteXquic] fail", "qcStat", 3, "e", th);
            }
        }
    }
}
