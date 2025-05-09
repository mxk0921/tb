package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.LoadingStyle;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class u6h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f29179a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337247);
        }

        public a() {
        }

        @JvmStatic
        public final u6h a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u6h) ipChange.ipc$dispatch("30d71dab", new Object[]{this});
            }
            return new u6h((a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337246);
    }

    public u6h() {
    }

    @JvmStatic
    public static final u6h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u6h) ipChange.ipc$dispatch("30d71dab", new Object[0]);
        }
        return Companion.a();
    }

    public /* synthetic */ u6h(a07 a07Var) {
        this();
    }

    public u6h(Map<String, ? extends Object> map) {
        this();
        this.f29179a = MegaUtils.x(map, "message", null);
        this.b = LoadingStyle.Companion.a(MegaUtils.x(map, "style", null));
    }
}
