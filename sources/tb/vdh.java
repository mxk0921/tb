package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vdh implements aoc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f29943a;
    public boolean b = false;

    static {
        t2o.a(962593297);
        t2o.a(962592987);
    }

    public vdh() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        this.f29943a = hashMap;
        hashMap.put("V", 5);
        hashMap.put(TLogTracker.LEVEL_DEBUG, 4);
        hashMap.put(TLogTracker.LEVEL_INFO, 3);
        hashMap.put("W", 2);
        hashMap.put("E", 1);
        hashMap.put("L", 0);
    }

    @Override // tb.aoc
    public int getLogLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d423990", new Object[]{this})).intValue();
        }
        String logLevel = AdapterForTLog.getLogLevel("Analytics");
        if (!this.f29943a.containsKey(logLevel)) {
            return 0;
        }
        try {
            return this.f29943a.get(logLevel).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // tb.aoc
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        try {
            return AdapterForTLog.isValid();
        } catch (Throwable unused) {
            this.b = true;
            return false;
        }
    }

    @Override // tb.aoc
    public void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }

    @Override // tb.aoc
    public void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    @Override // tb.aoc
    public void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // tb.aoc
    public void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }

    @Override // tb.aoc
    public void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    @Override // tb.aoc
    public void logw(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192407e7", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.logw(str, str2, th);
        }
    }
}
