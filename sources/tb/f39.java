package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteItemType;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class f39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f18970a;
    public String b;
    public String c;
    public String d;
    public final Map<String, ? extends Object> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336909);
        }

        public a() {
        }

        @JvmStatic
        public final f39 a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f39) ipChange.ipc$dispatch("c5ee9c1b", new Object[]{this, str, str2, str3, str4});
            }
            ckf.g(str, "bizCode");
            ckf.g(str2, "id");
            ckf.g(str3, "defaultCount");
            ckf.g(str4, "type");
            f39 f39Var = new f39((a07) null);
            f39Var.f18970a = str;
            f39Var.b = str2;
            f39Var.c = str3;
            try {
                String a2 = FavoriteItemType.Companion.a(str4);
                if (a2 != null) {
                    f39Var.d = a2;
                    return f39Var;
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
        t2o.a(525336908);
    }

    public f39() {
        this.f18970a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public /* synthetic */ f39(a07 a07Var) {
        this();
    }

    public f39(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizCode", null);
        if (x != null) {
            this.f18970a = x;
            String x2 = MegaUtils.x(map, "id", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "defaultCount", null);
                if (x3 != null) {
                    this.c = x3;
                    String a2 = FavoriteItemType.Companion.a(MegaUtils.x(map, "type", null));
                    if (a2 != null) {
                        this.d = a2;
                        this.e = MegaUtils.s(map, "ext");
                        return;
                    }
                    throw new RuntimeException("type 参数必传！");
                }
                throw new RuntimeException("defaultCount 参数必传！");
            }
            throw new RuntimeException("id 参数必传！");
        }
        throw new RuntimeException("bizCode 参数必传！");
    }
}
