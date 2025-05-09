package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qqo implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qqo b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26885a = false;

    static {
        t2o.a(962592945);
        t2o.a(962592825);
    }

    public qqo() {
        d(x2r.f().e("ut_sample_nw"));
        x2r.f().i("ut_sample_nw", this);
    }

    public static synchronized qqo b() {
        synchronized (qqo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qqo) ipChange.ipc$dispatch("fcb602b1", new Object[0]);
            }
            if (b == null) {
                b = new qqo();
            }
            return b;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            d(str2);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e649939a", new Object[]{this})).booleanValue();
        }
        return this.f26885a;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("SampleNetworkLogListener", "ut_sample_nw", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("1".equalsIgnoreCase(str)) {
            this.f26885a = true;
        } else {
            this.f26885a = false;
        }
    }
}
