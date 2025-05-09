package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f19464a;
        public final String b;

        static {
            t2o.a(442499259);
        }

        public a(String str, String str2) {
            this.f19464a = str;
            this.b = str2;
            if (cjz.a()) {
                SkuLogUtils.x("DealResult_init");
            }
        }
    }

    static {
        t2o.a(442499258);
    }

    public static a a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9adcad4a", new Object[]{context, str, str2, map});
        }
        if (cjz.a()) {
            SkuLogUtils.x("dealJavaScriptLogics");
        }
        return new a(str, str2);
    }

    public static a b(Context context, String str, String str2, Map<String, List<String>> map, Map<String, List<String>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("68ee7aa4", new Object[]{context, str, str2, map, map2});
        }
        if (cjz.a()) {
            SkuLogUtils.x("dealUltronComponent");
        }
        return new a(str, str2);
    }
}
