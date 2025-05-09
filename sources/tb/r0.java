package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(629145645);
        }

        public a() {
        }

        @JvmStatic
        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("948684b6", new Object[]{this})).booleanValue();
            }
            String config = OrangeConfig.getInstance().getConfig(xbl.ORANGE_NAMESPACE, "enable_single_column_list", "");
            if (!TextUtils.isEmpty(config)) {
                return Boolean.parseBoolean(config);
            }
            return a("promotion_single_column_list_component", "promotion_single_column_list_module", "enable_single_column_list");
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final boolean a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("24b04512", new Object[]{this, str, str2, str3})).booleanValue();
            }
            ckf.g(str, "component");
            ckf.g(str2, "module");
            ckf.g(str3, "key");
            VariationSet activate = UTABTest.activate(str, str2);
            Boolean bool = null;
            Variation variation = activate != null ? activate.getVariation(str3) : null;
            if (variation != null) {
                bool = Boolean.valueOf(variation.getValueAsBoolean(false));
            }
            return ckf.b(bool, Boolean.TRUE);
        }
    }

    static {
        t2o.a(629145644);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("948684b6", new Object[0])).booleanValue();
        }
        return Companion.b();
    }
}
