package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y5g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte TAG_BOOLEAN = 2;
    public static final byte TAG_FLOAT = 5;
    public static final byte TAG_INT = 3;
    public static final byte TAG_LONG = 4;
    public static final byte TAG_STRINGS = 6;
    public static final byte TAG_STRING_IN_UTF8 = 1;
    public static boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    public final mp6 f31865a;

    static {
        t2o.a(407896087);
    }

    public y5g(mp6 mp6Var) {
        this.f31865a = mp6Var;
    }

    public static Map<String, Object> d(mp6 mp6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce015730", new Object[]{mp6Var});
        }
        return new y5g(mp6Var).c();
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("345076c2", new Object[]{this});
        }
        byte[] bArr = new byte[((cli) this.f31865a).h()];
        ((cli) this.f31865a).e(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3e28f7f2", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        int h = ((cli) this.f31865a).h();
        if (!b) {
            while (true) {
                h--;
                if (h <= 0) {
                    break;
                }
                hashSet.add(a());
            }
        } else {
            for (int i = 0; i < h; i++) {
                hashSet.add(a());
            }
            uhh.b("KvParser", "fixed");
        }
        return hashSet;
    }

    public final String e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45235928", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte f = ((cli) this.f31865a).f();
            if (f == 0) {
                return sb.toString();
            }
            sb.append((char) f);
        }
    }

    public final int f() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ead94d", new Object[]{this})).intValue();
        }
        return ((cli) this.f31865a).f();
    }

    public Map<String, Object> c() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeed926f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            e();
            e();
            ((cli) this.f31865a).i();
            while (((cli) this.f31865a).c()) {
                if (f() == 1) {
                    String a2 = a();
                    switch (f()) {
                        case 1:
                            obj = a();
                            break;
                        case 2:
                            obj = Boolean.valueOf(((cli) this.f31865a).f() > 0);
                            break;
                        case 3:
                            obj = Integer.valueOf(((cli) this.f31865a).h());
                            break;
                        case 4:
                            obj = Long.valueOf(((cli) this.f31865a).i());
                            break;
                        case 5:
                            obj = Float.valueOf(((cli) this.f31865a).g());
                            break;
                        case 6:
                            obj = b();
                            break;
                        default:
                            throw new IllegalArgumentException("position:" + ((cli) this.f31865a).d() + ",remaining:" + ((cli) this.f31865a).j());
                    }
                    hashMap.put(a2, obj);
                } else {
                    throw new IllegalArgumentException("position:" + ((cli) this.f31865a).d() + ",remaining:" + ((cli) this.f31865a).j());
                }
            }
        } catch (Exception e) {
            hashMap.clear();
            uhh.d(e);
        }
        return hashMap;
    }
}
