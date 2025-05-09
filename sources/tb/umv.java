package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uploader.export.IUploaderLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class umv implements IUploaderLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, Integer> c;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f29502a = 31;
    public volatile boolean b = true;

    static {
        HashMap hashMap = new HashMap(6);
        c = hashMap;
        hashMap.put("V", 31);
        hashMap.put(TLogTracker.LEVEL_DEBUG, 30);
        hashMap.put(TLogTracker.LEVEL_INFO, 28);
        hashMap.put("W", 24);
        hashMap.put("E", 16);
        hashMap.put("L", 0);
    }

    @Override // com.uploader.export.IUploaderLog
    public int a(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f8cb565", new Object[]{this, new Integer(i), str, str2, th})).intValue();
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            return 0;
                        }
                        if (!this.b) {
                            return Log.e(str, str2, th);
                        }
                        if (th == null) {
                            AdapterForTLog.loge(str, str2);
                        } else {
                            AdapterForTLog.loge(str, str2, th);
                        }
                        return 0;
                    } else if (!this.b) {
                        return Log.w(str, str2, th);
                    } else {
                        AdapterForTLog.logw(str, str2, th);
                        return 0;
                    }
                } else if (!this.b) {
                    return Log.i(str, str2);
                } else {
                    AdapterForTLog.logi(str, str2);
                    return 0;
                }
            } else if (!this.b) {
                return Log.d(str, str2);
            } else {
                AdapterForTLog.logd(str, str2);
                return 0;
            }
        } else if (!this.b) {
            return Log.v(str, str2);
        } else {
            AdapterForTLog.logv(str, str2);
            return 0;
        }
    }

    public final boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fff9833", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int intValue = ((Integer) ((HashMap) c).get(AdapterForTLog.getLogLevel())).intValue();
        if (intValue != this.f29502a) {
            this.f29502a = intValue;
        }
        if ((i & this.f29502a) != 0) {
            return true;
        }
        return false;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb21ff8", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // com.uploader.export.IUploaderLog
    public boolean isEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8714c709", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.b) {
            return b(i);
        }
        if ((i & this.f29502a) != 0) {
            return true;
        }
        return false;
    }
}
