package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q1v implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "ut_max_len_kb";
    public static q1v b;

    /* renamed from: a  reason: collision with root package name */
    public int f26452a = 40960;

    static {
        t2o.a(962592841);
        t2o.a(962592825);
    }

    public q1v() {
        x2r.f().i(KEY, this);
        a(KEY, x2r.f().e(KEY));
    }

    public static synchronized q1v c() {
        synchronized (q1v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q1v) ipChange.ipc$dispatch("db5ceb84", new Object[0]);
            }
            if (b == null) {
                b = new q1v();
            }
            return b;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            int i = 40;
            int b2 = b(str2, 40);
            if (b2 > 40) {
                i = b2;
            }
            this.f26452a = i * 1024;
        }
    }

    public final int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efd7a04c", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37d7a601", new Object[]{this})).intValue();
        }
        return this.f26452a;
    }
}
