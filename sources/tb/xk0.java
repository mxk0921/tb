package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f31435a;
    public String b;
    public final tk0 c;
    public String d;
    public String e;
    public final String f;
    public final String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336699);
        }

        public a() {
        }

        @JvmStatic
        public final xk0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xk0) ipChange.ipc$dispatch("ec32ae0b", new Object[]{this});
            }
            return new xk0((a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336698);
    }

    public xk0() {
    }

    @JvmStatic
    public static final xk0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xk0) ipChange.ipc$dispatch("ec32ae0b", new Object[0]);
        }
        return Companion.a();
    }

    public /* synthetic */ xk0(a07 a07Var) {
        this();
    }

    public xk0(Map<String, ? extends Object> map) {
        this();
        this.f31435a = MegaUtils.x(map, "title", null);
        this.b = MegaUtils.x(map, "content", null);
        this.c = (map == null || !map.containsKey(UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) ? null : new tk0(MegaUtils.s(map, UiUtil.INPUT_TYPE_VALUE_CHECKBOX));
        this.d = MegaUtils.x(map, "confirmButtonText", null);
        this.e = MegaUtils.x(map, "cancelButtonText", null);
        this.f = MegaUtils.x(map, "otherButtonText", null);
        this.g = MegaUtils.x(map, "imageUrl", null);
    }
}
