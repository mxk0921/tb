package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class el2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f18656a;
    public String b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336736);
        }

        public a() {
        }

        @JvmStatic
        public final el2 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (el2) ipChange.ipc$dispatch("7f5eeec3", new Object[]{this, str});
            }
            ckf.g(str, "eventName");
            el2 el2Var = new el2((a07) null);
            el2Var.b = str;
            return el2Var;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336735);
    }

    public el2() {
        this.b = "";
    }

    @JvmStatic
    public static final el2 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (el2) ipChange.ipc$dispatch("7f5eeec3", new Object[]{str});
        }
        return Companion.a(str);
    }

    public /* synthetic */ el2(a07 a07Var) {
        this();
    }

    public el2(Map<String, ? extends Object> map) {
        this();
        this.f18656a = MegaUtils.x(map, "bizId", null);
        String x = MegaUtils.x(map, "eventName", null);
        if (x != null) {
            this.b = x;
            Boolean h = MegaUtils.h(map, "once", Boolean.FALSE);
            this.c = h != null ? h.booleanValue() : false;
            return;
        }
        throw new RuntimeException("eventName 参数必传！");
    }
}
