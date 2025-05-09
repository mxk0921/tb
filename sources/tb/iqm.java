package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weaver.prefetch.PerformanceData;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f21511a = -1;
    public int b = 10;
    public volatile int c = 1;
    public PerformanceData d = null;
    public Map<String, Object> e;

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4606236", new Object[]{this})).booleanValue();
        }
        if (this.f21511a != -1 && System.currentTimeMillis() > this.f21511a) {
            return true;
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130d70d", new Object[]{this});
        } else if (this.c != -1 && this.c > 0) {
            this.c--;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf98c52", new Object[]{this})).booleanValue();
        }
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30dc7310", new Object[]{this});
        } else if (this.b != 0) {
            this.f21511a = System.currentTimeMillis() + (this.b * 1000);
        }
    }
}
