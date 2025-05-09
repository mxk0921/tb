package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20087a;
        public final int b;

        static {
            t2o.a(806355856);
        }

        public a(int i, int i2) {
            this.f20087a = i;
            this.b = i2;
        }
    }

    static {
        t2o.a(806355855);
    }

    public static xvd a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("89a53938", new Object[]{str});
        }
        return b(str, new a(hw0.i(), hw0.f()));
    }

    public static xvd b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("861003ae", new Object[]{str, aVar});
        }
        return c(str, aVar, true);
    }

    public static xvd c(String str, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvd) ipChange.ipc$dispatch("a01caf4a", new Object[]{str, aVar, new Boolean(z)});
        }
        String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(aVar.f20087a), Integer.valueOf(aVar.b), !z ? ImageStrategyConfig.u("liveroom").f(false).a() : null);
        q0h.b("ImageUtils", "imageUrl = " + decideUrl);
        return v2s.o().n().load(decideUrl);
    }
}
