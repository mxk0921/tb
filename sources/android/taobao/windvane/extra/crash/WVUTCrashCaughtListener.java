package android.taobao.windvane.extra.crash;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.uc.webview.export.Build;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.aka;
import tb.bka;
import tb.gtw;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.lqw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUTCrashCaughtListener implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String wv_currentStatus = "0";
    private LinkedList mUrlList = null;
    private String wv_currentUrl = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class PageStartWVEventListener implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989855937);
            t2o.a(989856388);
        }

        public PageStartWVEventListener() {
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            if (i != 1001) {
                switch (i) {
                    case 3001:
                    case 3003:
                        WVUTCrashCaughtListener.wv_currentStatus = "1";
                        return null;
                    case 3002:
                        WVUTCrashCaughtListener.wv_currentStatus = "0";
                        return null;
                    default:
                        return null;
                }
            } else {
                if (!(iqwVar == null || (str = iqwVar.b) == null)) {
                    if (WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this) != null) {
                        if (WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this).size() > 9) {
                            WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this).removeFirst();
                        }
                        WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this).addLast(str);
                    }
                    WVUTCrashCaughtListener.access$102(WVUTCrashCaughtListener.this, str);
                    v7t.l("WV_URL_CHANGE", "current Url : " + str);
                }
                WVUTCrashCaughtListener.wv_currentStatus = "2";
                return null;
            }
        }
    }

    static {
        t2o.a(989855936);
    }

    public WVUTCrashCaughtListener() {
        init();
    }

    public static /* synthetic */ LinkedList access$000(WVUTCrashCaughtListener wVUTCrashCaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("1c15c412", new Object[]{wVUTCrashCaughtListener});
        }
        return wVUTCrashCaughtListener.mUrlList;
    }

    public static /* synthetic */ String access$102(WVUTCrashCaughtListener wVUTCrashCaughtListener, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a024b73d", new Object[]{wVUTCrashCaughtListener, str});
        }
        wVUTCrashCaughtListener.wv_currentUrl = str;
        return str;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mUrlList = new LinkedList();
        lqw.d().b(new PageStartWVEventListener());
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        int size = this.mUrlList.size();
        HashMap hashMap = new HashMap();
        if (this.mUrlList != null && size >= 1) {
            bka c = bka.c();
            for (int i = 3; i < size; i++) {
                String str = (String) this.mUrlList.get(i);
                if (!TextUtils.isEmpty(str)) {
                    this.mUrlList.set(i, gtw.i(str));
                    aka b = c.b(str);
                    if (!z && b != null) {
                        v7t.a("WVUTCrashCaughtListener", "found grey page: " + str);
                        hashMap.put(aka.KEY_AIR_TAG, b.a());
                        z = true;
                    }
                }
            }
            hashMap.put("crash_url_list", this.mUrlList.toString());
            hashMap.put("wv_currentUrl", this.wv_currentUrl);
            hashMap.put("wv_currentStatus", wv_currentStatus);
            String str2 = Build.Version.NAME;
            String str3 = Build.TIME;
            String str4 = Build.UCM_VERSION;
            String str5 = Build.CORE_TIME;
            hashMap.put("uc_version_info", "ucbs " + str2 + "." + str3 + "-impl " + str4 + "." + str5);
        }
        return hashMap;
    }
}
