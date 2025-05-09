package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f17213a = -2147483648L;
    public String b;

    static {
        t2o.a(774897906);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33609457", new Object[]{this})).longValue();
        }
        return this.f17213a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7e6108f", new Object[]{this});
        }
        return this.b;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf17e235", new Object[]{this, new Long(j)});
        } else {
            this.f17213a = j;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95b41c7", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
