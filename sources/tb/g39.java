package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f19708a;
    public Boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336911);
        }

        public a() {
        }

        @JvmStatic
        public final g39 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g39) ipChange.ipc$dispatch("95e8ff03", new Object[]{this});
            }
            return new g39((a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336910);
    }

    public g39() {
    }

    @JvmStatic
    public static final g39 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g39) ipChange.ipc$dispatch("95e8ff03", new Object[0]);
        }
        return Companion.a();
    }

    public /* synthetic */ g39(a07 a07Var) {
        this();
    }

    public g39(Map<String, ? extends Object> map) {
        this();
        this.f19708a = MegaUtils.x(map, "bizCode", null);
        this.b = MegaUtils.h(map, "hitNewFavorite", null);
    }
}
