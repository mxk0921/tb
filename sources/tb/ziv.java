package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ziv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32799a;
    public String b;
    public Long c;
    public Long d;
    public String e;
    public String f = "true";
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        t2o.a(1010827414);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447b4dc9", new Object[]{this});
        }
        return this.g;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8701e0", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5164035", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.f32799a = str;
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1038383", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final void f(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de59d0f2", new Object[]{this, l});
        } else {
            this.d = l;
        }
    }

    public final void g(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d569c77", new Object[]{this, l});
        } else {
            this.c = l;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0c66c6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f = str;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad15ee", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83d8a4c", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ff5431", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final Map<String, Object> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5878f065", new Object[]{this});
        }
        String str = this.f32799a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Pair a2 = jpu.a("liveId", str);
        String str3 = this.b;
        if (str3 == null) {
            str3 = str2;
        }
        Pair a3 = jpu.a("source", str3);
        Pair a4 = jpu.a("s", String.valueOf(this.c));
        Pair a5 = jpu.a("n", String.valueOf(this.d));
        String str4 = this.f;
        if (str4 == null) {
            str4 = str2;
        }
        Pair a6 = jpu.a("smartRecommend", str4);
        String str5 = this.g;
        if (str5 == null) {
            str5 = str2;
        }
        Pair a7 = jpu.a("lastBroadCastId", str5);
        String str6 = this.h;
        if (str6 == null) {
            str6 = str2;
        }
        Pair a8 = jpu.a("accountStays", str6);
        Pair a9 = jpu.a(WXConfig.devId, str2);
        String str7 = this.e;
        if (str7 == null) {
            str7 = str2;
        }
        Map<String, Object> k = a.k(a2, a3, a4, a5, a6, a7, a8, a9, jpu.a("tppParam", str7));
        String str8 = this.i;
        if (str8 != null) {
            if (str8 == null) {
                str8 = str2;
            }
            k.put("mockUserId", str8);
        }
        String str9 = this.j;
        if (str9 != null) {
            if (str9 != null) {
                str2 = str9;
            }
            k.put("extendMap", str2);
        }
        return k;
    }
}
