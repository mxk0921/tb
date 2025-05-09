package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vne {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f30124a;
    public final String b;
    public final String c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337232);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337231);
    }

    public vne() {
        this.d = true;
    }

    public vne(Map<String, ? extends Object> map) {
        this();
        this.f30124a = MegaUtils.x(map, "bizCode", null);
        this.b = MegaUtils.x(map, "subBizCode", null);
        this.c = MegaUtils.x(map, "playScene", null);
        Boolean h = MegaUtils.h(map, "mute", Boolean.TRUE);
        this.d = h != null ? h.booleanValue() : true;
    }
}
