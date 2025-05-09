package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.OpenContainerOpenBizType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h3l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f20392a;
    public final String b;
    public final List<String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337346);
        }

        public a() {
        }

        @JvmStatic
        public final h3l a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h3l) ipChange.ipc$dispatch("c7913d7c", new Object[]{this});
            }
            return new h3l((a07) null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337345);
    }

    public h3l() {
        this.b = "MINIAPP";
    }

    public /* synthetic */ h3l(a07 a07Var) {
        this();
    }

    public h3l(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList = null;
        this.f20392a = MegaUtils.x(map, LogContext.STORAGE_APPID, null);
        String str = "MINIAPP";
        String a2 = OpenContainerOpenBizType.Companion.a(MegaUtils.x(map, "bizType", str));
        this.b = a2 != null ? a2 : str;
        List<Object> o = MegaUtils.o(map, "pluginIDs");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("pluginIDs 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("pluginIDs 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        this.c = arrayList;
    }
}
