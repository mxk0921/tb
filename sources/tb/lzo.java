package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static lzo b;

    /* renamed from: a  reason: collision with root package name */
    public Context f23670a;

    static {
        t2o.a(404750528);
    }

    public static synchronized lzo b() {
        synchronized (lzo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lzo) ipChange.ipc$dispatch("6c6374c5", new Object[0]);
            }
            if (b == null) {
                b = new lzo();
            }
            return b;
        }
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.f23670a;
        if (context == null) {
            return gwv.l();
        }
        return context;
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f23670a = context;
        }
    }
}
