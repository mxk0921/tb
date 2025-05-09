package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zak implements f64.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSCallback f32649a;

    static {
        t2o.a(993002194);
        t2o.a(993001803);
    }

    public zak(JSCallback jSCallback) {
        this.f32649a = jSCallback;
    }

    public static f64.a a(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f64.a) ipChange.ipc$dispatch("65dd80db", new Object[]{jSCallback});
        }
        if (jSCallback != null) {
            return new zak(jSCallback);
        }
        return null;
    }

    @Override // tb.f64.a
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
        } else {
            this.f32649a.invoke(obj);
        }
    }
}
