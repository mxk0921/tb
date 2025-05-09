package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kt9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static kt9 b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f22906a = new HashMap<>();

    static {
        t2o.a(759169031);
    }

    public static kt9 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kt9) ipChange.ipc$dispatch("52324cc2", new Object[0]);
        }
        if (b == null) {
            b = new kt9();
        }
        return b;
    }

    public boolean b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb8dd6f4", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        HashMap<String, String> hashMap = this.f22906a;
        if (hashMap != null) {
            return hashMap.containsKey(d(j, j2));
        }
        this.f22906a = new HashMap<>();
        return false;
    }

    public final String d(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e21e6f0", new Object[]{this, new Long(j), new Long(j2)});
        }
        return j + "_" + j2;
    }

    public final String e(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d79e7a1e", new Object[]{this, new Long(j), new Long(j2)});
        }
        HashMap<String, String> hashMap = this.f22906a;
        if (hashMap == null) {
            this.f22906a = new HashMap<>();
            return "";
        }
        String str = hashMap.get(d(j, j2));
        if (str != null) {
            return str.toString();
        }
        return "";
    }

    public void f(long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ff4a8b", new Object[]{this, new Long(j), new Long(j2), new Boolean(z)});
            return;
        }
        if (this.f22906a == null) {
            this.f22906a = new HashMap<>();
        }
        this.f22906a.put(d(j, j2), String.valueOf(z));
    }

    public boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ee4920a", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        return TextUtils.equals(e(j, j2), "true");
    }
}
