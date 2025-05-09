package tb;

import com.android.alibaba.ip.runtime.IpChange;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x9x implements kde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<WeexPlatformView, Boolean> f31241a = new WeakHashMap<>();
    public WeakReference<WeexPlatformView> b = new WeakReference<>(null);

    public x9x() {
        new WeakHashMap();
    }

    public void a(WeexPlatformView weexPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ad0c85", new Object[]{this, weexPlatformView});
        } else {
            this.f31241a.put(weexPlatformView, Boolean.FALSE);
        }
    }

    public void b(WeexPlatformView weexPlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47e5aa8", new Object[]{this, weexPlatformView});
            return;
        }
        this.f31241a.remove(weexPlatformView);
        if (this.b.get() == weexPlatformView) {
            this.b = new WeakReference<>(null);
        }
    }

    public void c(WeexPlatformView weexPlatformView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ed2aeb", new Object[]{this, weexPlatformView, new Boolean(z)});
        } else if (this.f31241a.containsKey(weexPlatformView)) {
            this.f31241a.put(weexPlatformView, Boolean.valueOf(z));
            if (z) {
                this.b = new WeakReference<>(weexPlatformView);
            }
        }
    }
}
