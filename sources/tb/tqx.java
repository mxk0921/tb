package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tqx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebServiceImpl";
    public static final tqx b = new tqx();

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f28894a;

    public static tqx b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tqx) ipChange.ipc$dispatch("5b6804ac", new Object[0]);
        }
        return b;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f28894a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f28894a.get();
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f28894a = new WeakReference<>(context);
        }
    }
}
