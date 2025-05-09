package com.taobao.android.weex_framework;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.config.WeexInstanceConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kpc;
import tb.lce;
import tb.rrd;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSInstanceConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UNICORN_TRACE_METHODS_COUNT = 9;

    /* renamed from: a  reason: collision with root package name */
    public Float f9965a;
    public boolean b;
    public boolean c;
    public boolean d;
    public rrd f;
    public kpc g;
    public Map<String, Long> j;
    public lce l;
    public String m;
    public WeexInstanceConfig.WeexEmbedPresentMode n;
    public boolean e = true;
    public MUSRenderType h = MUSRenderType.MUSRenderTypeUnspecific;
    public RenderMode i = RenderMode.surface;
    public HashMap<String, String> k = new HashMap<>();
    public boolean o = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum MUSRenderType {
        MUSRenderTypeUnspecific(0),
        MUSRenderTypePlatform(1),
        MUSRenderTypeUnicorn(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        MUSRenderType(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(MUSRenderType mUSRenderType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/MUSInstanceConfig$MUSRenderType");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public static MUSRenderType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSRenderType) ipChange.ipc$dispatch("c386c56d", new Object[]{str});
            }
            return (MUSRenderType) Enum.valueOf(MUSRenderType.class, str);
        }

        public int value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum PlatformViewMode {
        TextureDisplay,
        HybridComposition,
        PunchingDisplay;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PlatformViewMode platformViewMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/MUSInstanceConfig$PlatformViewMode");
        }

        public static PlatformViewMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PlatformViewMode) ipChange.ipc$dispatch("b3c08b13", new Object[]{str});
            }
            return (PlatformViewMode) Enum.valueOf(PlatformViewMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum RenderMode {
        surface,
        texture,
        image,
        offscreen;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RenderMode renderMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/MUSInstanceConfig$RenderMode");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public static RenderMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderMode) ipChange.ipc$dispatch("c9229c35", new Object[]{str});
            }
            return (RenderMode) Enum.valueOf(RenderMode.class, str);
        }
    }

    static {
        t2o.a(982516019);
    }

    public MUSInstanceConfig() {
        new HashMap();
        new ArrayList();
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public void A(rrd rrdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b051908e", new Object[]{this, rrdVar});
        } else {
            this.f = rrdVar;
        }
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe4bdb0", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f099c5f1", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6396c9f2", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void E(WeexInstanceConfig.WeexEmbedPresentMode weexEmbedPresentMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6f35de", new Object[]{this, weexEmbedPresentMode});
        } else {
            this.n = weexEmbedPresentMode;
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("980b06ea", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fffa4", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.m;
    }

    public lce b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lce) ipChange.ipc$dispatch("42d7ad38", new Object[]{this});
        }
        return this.l;
    }

    public HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9f1d05d1", new Object[]{this});
        }
        return this.k;
    }

    public MUSRenderType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSRenderType) ipChange.ipc$dispatch("2f806f60", new Object[]{this});
        }
        return this.h;
    }

    public kpc e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kpc) ipChange.ipc$dispatch("be1abee2", new Object[]{this});
        }
        return this.g;
    }

    public RenderMode f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderMode) ipChange.ipc$dispatch("e0a01af8", new Object[]{this});
        }
        return this.i;
    }

    public Float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("57142604", new Object[]{this});
        }
        return this.f9965a;
    }

    public rrd h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrd) ipChange.ipc$dispatch("c4868f26", new Object[]{this});
        }
        return this.f;
    }

    public WeexInstanceConfig.WeexEmbedPresentMode i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceConfig.WeexEmbedPresentMode) ipChange.ipc$dispatch("a95e9742", new Object[]{this});
        }
        return this.n;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47f8f0db", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce718cf6", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a92b00", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6fded7f", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void o(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab5e1db", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void q(lce lceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce706660", new Object[]{this, lceVar});
        } else {
            this.l = lceVar;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88695840", new Object[]{this, str});
        }
    }

    public void s(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae481979", new Object[]{this, hashMap});
        } else {
            this.k = hashMap;
        }
    }

    public void t(MUSRenderType mUSRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5624e724", new Object[]{this, mUSRenderType});
        } else {
            this.h = mUSRenderType;
        }
    }

    public void u(kpc kpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2868da", new Object[]{this, kpcVar});
        } else {
            this.g = kpcVar;
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c407e1ea", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906463c", new Object[]{this, new Boolean(z)});
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25563890", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void y(RenderMode renderMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b7bf5a", new Object[]{this, renderMode});
        } else {
            this.i = renderMode;
        }
    }

    public void z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327b2c71", new Object[]{this, new Float(f)});
        } else {
            this.f9965a = Float.valueOf(f);
        }
    }
}
