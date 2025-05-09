package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleanActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xr2 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CacheCleanActivity f31551a;

    public xr2(CacheCleanActivity cacheCleanActivity) {
        this.f31551a = cacheCleanActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        CacheCleanActivity.N3(this.f31551a);
        CacheCleanActivity.O3(this.f31551a);
    }
}
