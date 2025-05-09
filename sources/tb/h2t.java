package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.app.OSType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h2t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h2t INSTANCE = new h2t();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f20380a;
    public static final njg b;
    public static final njg c;
    public static final njg d;
    public static final njg e;

    static {
        t2o.a(1003487279);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20380a = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.b2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean m;
                m = h2t.m();
                return Boolean.valueOf(m);
            }
        });
        c = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.c2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean j;
                j = h2t.j();
                return Boolean.valueOf(j);
            }
        });
        d = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.d2t
            @Override // tb.d1a
            public final Object invoke() {
                String e2;
                e2 = h2t.e();
                return e2;
            }
        });
        e = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.e2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean h;
                h = h2t.h();
                return Boolean.valueOf(h);
            }
        });
        b = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.f2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean i;
                i = h2t.i();
                return Boolean.valueOf(i);
            }
        });
    }

    public static final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d1bce8", new Object[0]);
        }
        return avs.INSTANCE.h("commentCommonPMExposeWhiteList", "liveAiInteractive");
    }

    public static final boolean h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8a7f0f", new Object[0])).booleanValue();
        }
        if (com.taobao.uniinfra_kmp.common_utils.app.a.d() == OSType.iOS) {
            str = "enableAccountIntimacy";
        } else {
            str = "enableAccountIntimacyAndroid";
        }
        boolean d2 = avs.INSTANCE.d("enableAccountIntimacy", true);
        if (d2) {
            return INSTANCE.n(str, true);
        }
        return d2;
    }

    public static final boolean i() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8b461bf", new Object[0])).booleanValue();
        }
        if (com.taobao.uniinfra_kmp.common_utils.app.a.d() == OSType.iOS) {
            str = "enableCommentDeNoise";
        } else {
            str = "enableCommentDeNoiseAndroid";
        }
        boolean d2 = avs.INSTANCE.d("enableCommentDeNoise", true);
        if (d2) {
            return INSTANCE.n(str, true);
        }
        return d2;
    }

    public static final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa1be7ec", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableLiveAIInteract", true);
    }

    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d5541e", new Object[0])).booleanValue();
        }
        if (zys.INSTANCE.b()) {
            return false;
        }
        return avs.INSTANCE.d("enableJumpGuangGuangPage", true);
    }

    public final boolean g(String str, String str2, String str3, boolean z) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad4326fd", new Object[]{this, str, str2, str3, new Boolean(z)})).booleanValue();
        }
        if (z) {
            str4 = "true";
        } else {
            str4 = "false";
        }
        return Boolean.parseBoolean(gus.INSTANCE.d(str, str2, str3, str4));
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a23e3683", new Object[]{this})).booleanValue();
        }
        return ((Boolean) e.getValue()).booleanValue();
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9464c4e", new Object[]{this})).booleanValue();
        }
        return ((Boolean) c.getValue()).booleanValue();
    }

    public final boolean n(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f992203f", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return o(str, str, z);
    }

    public final boolean o(String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31f16f54", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (com.taobao.uniinfra_kmp.common_utils.app.a.d() == OSType.iOS) {
            str3 = "taolive";
        } else {
            str3 = "tblive";
        }
        return g(str3, str, str2, z);
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e1b39e", new Object[]{this})).booleanValue();
        }
        return ((Boolean) b.getValue()).booleanValue();
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5464bbc1", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f20380a.getValue()).booleanValue();
    }
}
