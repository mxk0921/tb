package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.av9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class px5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile px5 c;
    public static final Map<String, String> d = new ConcurrentHashMap(512);
    public static final Map<Double, Double> e = new ConcurrentHashMap(512);

    /* renamed from: a  reason: collision with root package name */
    public a f26371a;
    public int b = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(444596895);
    }

    public static px5 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (px5) ipChange.ipc$dispatch("d97a4127", new Object[0]);
        }
        if (c != null) {
            return c;
        }
        synchronized (px5.class) {
            try {
                if (c == null) {
                    c = new px5();
                    return c;
                }
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b127ae4d", new Object[]{this})).intValue();
        }
        a aVar = this.f26371a;
        if (aVar == null) {
            return this.b;
        }
        return ((av9.a) aVar).a();
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58037b92", new Object[]{this, aVar});
        } else {
            this.f26371a = aVar;
        }
    }

    public Double d(Double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("e38ea0a8", new Object[]{this, d2});
        }
        if (this.f26371a == null) {
            return d2;
        }
        Map<Double, Double> map = e;
        if (((ConcurrentHashMap) map).containsKey(d2)) {
            return (Double) ((ConcurrentHashMap) map).get(d2);
        }
        Double valueOf = Double.valueOf(new BigDecimal(((av9.a) this.f26371a).b(d2.doubleValue())).setScale(1, 4).doubleValue());
        ((ConcurrentHashMap) map).put(d2, valueOf);
        return valueOf;
    }

    public Double e(Double d2, Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("ec025dde", new Object[]{this, d2, d3});
        }
        if (this.b == 4) {
            return d3;
        }
        return d(d2);
    }

    public Double f(Double d2, Double d3, Double d4, Double d5, Double d6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("703f4c80", new Object[]{this, d2, d3, d4, d5, d6});
        }
        int i = this.b;
        if (i == 4) {
            return d6;
        }
        if (i == 3) {
            return d5;
        }
        if (i == 2) {
            return d4;
        }
        if (i == 0) {
            return d2;
        }
        return d3;
    }

    public String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b2fa1e", new Object[]{this, str, str2});
        }
        if (this.b == 4) {
            return str2;
        }
        return g(str);
    }

    public String i(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9a6a580", new Object[]{this, str, str2, str3, str4, str5});
        }
        int i = this.b;
        if (i == 4) {
            return str5;
        }
        if (i == 3) {
            return str4;
        }
        if (i == 2) {
            return str3;
        }
        if (i == 0) {
            return str;
        }
        return str2;
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ab3c11", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        ((ConcurrentHashMap) d).clear();
        ((ConcurrentHashMap) e).clear();
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40868a52", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.f26371a;
        if (aVar != null) {
            ((av9.a) aVar).c(i);
        }
    }

    public String g(String str) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efae88a8", new Object[]{this, str});
        }
        if (this.f26371a == null) {
            return str;
        }
        Map<String, String> map = d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        try {
            if (str.contains("np")) {
                format = String.format(Locale.CHINA, "%.1f", Double.valueOf(((av9.a) this.f26371a).b(Double.parseDouble(str.replace("np", ""))))).concat("np");
                ((ConcurrentHashMap) map).put(str, format);
            } else if (str.contains("ap")) {
                String replace = str.replace("ap", "");
                format = String.format(Locale.CHINA, "%.1f", Double.valueOf(((av9.a) this.f26371a).b(Double.parseDouble(replace))));
                ((ConcurrentHashMap) map).put(str, format);
                ((ConcurrentHashMap) map).put(replace, format);
            } else {
                format = String.format(Locale.CHINA, "%.1f", Double.valueOf(((av9.a) this.f26371a).b(Double.parseDouble(str))));
                ((ConcurrentHashMap) map).put(str, format);
                ((ConcurrentHashMap) map).put(str.concat("ap"), format);
            }
            return format;
        } catch (NumberFormatException unused) {
            if (DinamicXEngine.j0()) {
                h36.w(h36.TAG, str, "写法错误，解析出错");
            }
            ((ConcurrentHashMap) d).put(str, str);
            return str;
        }
    }
}
