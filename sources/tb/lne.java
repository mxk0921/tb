package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lne {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Double f23442a;
    public final Double b;
    public final Double c;
    public final Double d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337207);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337206);
    }

    public lne() {
    }

    public lne(Map<String, ? extends Object> map) {
        this();
        this.f23442a = MegaUtils.j(map, "x", null);
        this.b = MegaUtils.j(map, "y", null);
        this.c = MegaUtils.j(map, "width", null);
        this.d = MegaUtils.j(map, "height", null);
        MegaUtils.j(map, hij.KEY_CORNER_RADIUS, null);
    }
}
