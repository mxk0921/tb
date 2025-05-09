package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteItemType;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f20385a;
    public String b;
    public String c;
    public Map<String, ? extends Object> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336913);
        }

        public a() {
        }

        @JvmStatic
        public final h39 a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h39) ipChange.ipc$dispatch("1f40b1c8", new Object[]{this, str, str2});
            }
            ckf.g(str, "id");
            ckf.g(str2, "type");
            h39 h39Var = new h39((a07) null);
            h39Var.b = str;
            try {
                String a2 = FavoriteItemType.Companion.a(str2);
                if (a2 != null) {
                    h39Var.c = a2;
                    return h39Var;
                }
                throw new RuntimeException("type 参数类型错误！");
            } catch (Throwable unused) {
                return null;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336912);
    }

    public h39() {
        this.b = "";
        this.c = "";
    }

    @JvmStatic
    public static final h39 a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h39) ipChange.ipc$dispatch("1f40b1c8", new Object[]{str, str2});
        }
        return Companion.a(str, str2);
    }

    public /* synthetic */ h39(a07 a07Var) {
        this();
    }

    public h39(Map<String, ? extends Object> map) {
        this();
        this.f20385a = MegaUtils.x(map, "bizCode", null);
        String x = MegaUtils.x(map, "id", null);
        if (x != null) {
            this.b = x;
            String a2 = FavoriteItemType.Companion.a(MegaUtils.x(map, "type", null));
            if (a2 != null) {
                this.c = a2;
                this.d = MegaUtils.s(map, "ext");
                return;
            }
            throw new RuntimeException("type 参数必传！");
        }
        throw new RuntimeException("id 参数必传！");
    }
}
