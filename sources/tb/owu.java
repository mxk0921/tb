package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class owu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f25717a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25718a;

        public a(String str) {
            this.f25718a = str;
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else {
                owu.a(owu.this, this.f25718a);
            }
        }
    }

    public owu(String str) {
        OrangeConfig.getInstance().registerListener(new String[]{str}, new a(str));
        e(str);
    }

    public static /* synthetic */ void a(owu owuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484ecc0a", new Object[]{owuVar, str});
        } else {
            owuVar.e(str);
        }
    }

    public Boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("aa49ed2e", new Object[]{this, str});
        }
        String d = d(str, "");
        if (byu.a(d)) {
            return null;
        }
        return Boolean.valueOf(d);
    }

    public double c(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da222914", new Object[]{this, str, new Double(d)})).doubleValue();
        }
        try {
            return Double.parseDouble(d(str, String.valueOf(d)));
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ec4ecbd", new Object[]{this, str, str2});
        }
        if (byu.a(str)) {
            return str2;
        }
        if (!((ConcurrentHashMap) this.f25717a).containsKey(str)) {
            return str2;
        }
        String str3 = (String) ((ConcurrentHashMap) this.f25717a).get(str);
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81aff427", new Object[]{this, str});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        ((ConcurrentHashMap) this.f25717a).clear();
        j3i.b(this.f25717a, configs);
    }
}
