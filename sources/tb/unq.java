package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class unq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final unq EMPTY = new unq("EMPTY");

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f29519a = new ConcurrentHashMap();
    public final Map<String, Long> b = new ConcurrentHashMap();

    public unq(String str) {
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9b7e4cd", new Object[]{this, str, str2});
        }
        return str2 + "_2_" + str;
    }

    public Map<String, Long> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("129413ee", new Object[]{this});
        }
        return this.b;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85978de4", new Object[]{this, str});
        } else {
            ((ConcurrentHashMap) this.f29519a).put(str, Long.valueOf(uos.b()));
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d098b24", new Object[]{this, str, str2});
            return;
        }
        Long l = (Long) ((ConcurrentHashMap) this.f29519a).get(str2);
        if (l == null) {
            rbn.e("stopwatch.hitAfter(), afterWhoTime == null", "params -> hitTag=" + str + ", afterWhichTag=" + str2);
            return;
        }
        long b = uos.b();
        ((ConcurrentHashMap) this.f29519a).put(str, Long.valueOf(b));
        ((ConcurrentHashMap) this.b).put(a(str, str2), Long.valueOf(b - l.longValue()));
    }
}
