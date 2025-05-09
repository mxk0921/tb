package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yhj implements ouc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ssi b = new ssi(Color.parseColor("#f2f2f2"), DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, 0, 0, false, true);
    public static final ssi c = new ssi(-1, DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, DensityUtil.dip2px(Globals.getApplication(), 10.0f), -1, false, false);
    public static final ssi d = new ssi(Color.parseColor("#222222"), DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, 0, 0, false, true);
    public static final ssi e = new ssi(Color.parseColor("#222222"), DensityUtil.dip2px(Globals.getApplication(), 10.0f), 0, DensityUtil.dip2px(Globals.getApplication(), 10.0f), Color.parseColor("#222222"), false, false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32100a;

    static {
        t2o.a(815793416);
        t2o.a(993001852);
    }

    public yhj(boolean z) {
        this.f32100a = z;
    }

    @Override // tb.ouc
    public ssi a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ssi) ipChange.ipc$dispatch("d27f29c3", new Object[]{this, new Integer(i)});
        }
        if (this.f32100a) {
            if (i == 0) {
                return d;
            }
            return e;
        } else if (i == 0) {
            return b;
        } else {
            return c;
        }
    }
}
