package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ku<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f22922a = new AtomicBoolean();

    static {
        t2o.a(479199516);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public abstract T b(boolean z);

    public abstract void c(Context context);

    public final T d(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("db8ce86a", new Object[]{this, new Boolean(z)});
        }
        this.f22922a.set(true);
        T b = b(z);
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(",命中点击预加载：");
        if (b == null) {
            z2 = false;
        }
        sb.append(z2);
        hav.g("CartPreloader", simpleName, sb.toString());
        return b;
    }

    public final void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fcb7b8", new Object[]{this, context});
        } else if (this.f22922a.get()) {
            hav.i("CartPreloader", "无效点击预加载:" + this);
        } else {
            c(context);
        }
    }
}
