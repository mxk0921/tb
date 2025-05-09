package tb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class iv<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f21595a;

    static {
        t2o.a(912263037);
    }

    public iv() {
        a(null, null, 0);
    }

    public abstract void a(Context context, AttributeSet attributeSet, int i);

    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, t});
        } else {
            this.f21595a = t;
        }
    }
}
