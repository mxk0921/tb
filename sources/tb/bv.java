package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class bv implements nm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596265);
        t2o.a(444596269);
    }

    @Override // tb.nm7
    public void b(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be48737", new Object[]{this, view, str, obj, obj2, obj3});
        } else {
            d(view, obj);
        }
    }

    @Override // tb.nm7
    public void c(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3adb4d", new Object[]{this, view, obj, obj2});
        }
    }

    public void d(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8062f5", new Object[]{this, view, obj});
        }
    }
}
