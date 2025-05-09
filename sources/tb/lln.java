package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final njg f23399a = a.b(new d1a() { // from class: tb.kln
        @Override // tb.d1a
        public final Object invoke() {
            int f;
            f = lln.f();
            return Integer.valueOf(f);
        }
    });

    static {
        t2o.a(1007681589);
    }

    public static final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fcb2c8e", new Object[0])).intValue();
        }
        try {
            String a2 = h8l.INSTANCE.a("favorite_sdk", "rebaseStatusSize");
            if (a2 != null) {
                return Integer.parseInt(a2);
            }
            return 600;
        } catch (Throwable th) {
            th.printStackTrace();
            return 600;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return "mtop.taobao.mercury.collectionids.get";
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return ((Number) this.f23399a.getValue()).intValue();
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return "2.0";
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this});
        }
        return kotlin.collections.a.k(jpu.a("appName", "detail"), jpu.a("size", Integer.valueOf(d())), jpu.a("favType", 1));
    }
}
