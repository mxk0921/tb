package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f30081a;
    public String b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336743);
        }

        public a() {
        }

        @JvmStatic
        public final vl2 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vl2) ipChange.ipc$dispatch("88cdaee4", new Object[]{this, str});
            }
            ckf.g(str, "eventName");
            vl2 vl2Var = new vl2((a07) null);
            vl2Var.b = str;
            return vl2Var;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336742);
    }

    public vl2() {
        this.b = "";
    }

    @JvmStatic
    public static final vl2 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vl2) ipChange.ipc$dispatch("88cdaee4", new Object[]{str});
        }
        return Companion.a(str);
    }

    public /* synthetic */ vl2(a07 a07Var) {
        this();
    }

    public vl2(Map<String, ? extends Object> map) {
        this();
        this.f30081a = MegaUtils.x(map, "bizId", null);
        String x = MegaUtils.x(map, "eventName", null);
        if (x != null) {
            this.b = x;
            this.c = MegaUtils.x(map, "listenerId", null);
            return;
        }
        throw new RuntimeException("eventName 参数必传！");
    }
}
