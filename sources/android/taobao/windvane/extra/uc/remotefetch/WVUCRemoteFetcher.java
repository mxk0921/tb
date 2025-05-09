package android.taobao.windvane.extra.uc.remotefetch;

import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.b79;
import tb.bzn;
import tb.r9u;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.y69;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCRemoteFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCRemoteFetcher";
    private static final String UC_CORE_REMOTE_SO_NAME = "kernelu4_7z_uc";
    private static volatile String sValidLocalUCPath = null;
    private static volatile boolean sHasSetEnableNewKernel = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface WVUCFetcherCallback {
        void onFetchFail(Throwable th);

        void onFetchSuccess(String str);
    }

    static {
        t2o.a(989856180);
    }

    public static /* synthetic */ boolean access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue();
        }
        return isValidRemoteSoPath(str);
    }

    public static void fetchUCRemote(final WVUCFetcherCallback wVUCFetcherCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac86fce", new Object[]{wVUCFetcherCallback});
            return;
        }
        try {
            String fetchUCRemoteLocal = fetchUCRemoteLocal();
            if (TextUtils.isEmpty(fetchUCRemoteLocal) || !isValidRemoteSoPath(fetchUCRemoteLocal)) {
                bzn.b().b(UC_CORE_REMOTE_SO_NAME, new y69() { // from class: android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.y69
                    public void onFetchFinished(b79 b79Var) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4302726d", new Object[]{this, b79Var});
                        } else if (!b79Var.i() || !WVUCRemoteFetcher.access$000(b79Var.d())) {
                            WVUCFetcherCallback wVUCFetcherCallback2 = WVUCFetcherCallback.this;
                            if (wVUCFetcherCallback2 != null) {
                                wVUCFetcherCallback2.onFetchFail(b79Var.c());
                            }
                        } else {
                            WVUCFetcherCallback wVUCFetcherCallback3 = WVUCFetcherCallback.this;
                            if (wVUCFetcherCallback3 != null) {
                                wVUCFetcherCallback3.onFetchSuccess(b79Var.d());
                            }
                        }
                    }
                });
            } else if (wVUCFetcherCallback != null) {
                wVUCFetcherCallback.onFetchSuccess(fetchUCRemoteLocal);
            }
        } catch (Throwable th) {
            if (wVUCFetcherCallback != null) {
                wVUCFetcherCallback.onFetchFail(th);
            }
        }
    }

    public static String fetchUCRemoteLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1042083c", new Object[0]);
        }
        r9u.b("fetchUCRemoteLocal");
        String str = sValidLocalUCPath;
        if (!vpw.commonConfig.S2 || TextUtils.isEmpty(str)) {
            str = fetchUCRemoteLocalInternal();
            sValidLocalUCPath = str;
        }
        r9u.d();
        return str;
    }

    private static String fetchUCRemoteLocalInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82b8467f", new Object[0]);
        }
        if (WVDevelopTool.isEnableUCRemoteDebug()) {
            String uCRemoteDebugFilePath = WVDevelopTool.getUCRemoteDebugFilePath();
            if (!TextUtils.isEmpty(uCRemoteDebugFilePath)) {
                v7t.d(TAG, "use uc remote debug file path:" + uCRemoteDebugFilePath);
                return uCRemoteDebugFilePath;
            }
        }
        b79 d = bzn.b().d(UC_CORE_REMOTE_SO_NAME);
        if (!d.i() || !isValidRemoteSoPath(d.d())) {
            return "";
        }
        return d.d();
    }

    public static String getCoreRemoteSoName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6808ac97", new Object[0]);
        }
        return UC_CORE_REMOTE_SO_NAME;
    }

    public static boolean hasUCRemoteLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7280108", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(fetchUCRemoteLocal());
    }

    private static boolean isValidRemoteSoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b786e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
