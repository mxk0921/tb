package tb;

import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31459a;
    public final String b;
    public final String c;

    static {
        t2o.a(1022361888);
    }

    public xlm(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f31459a = ht4.e(map, "addTime");
        this.b = ht4.e(map, LoggingSPCache.STORAGE_USERID);
        this.c = ht4.e(map, "nick");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c546a321", new Object[]{this});
        }
        return this.f31459a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f5e75d", new Object[]{this});
        }
        return this.b;
    }
}
