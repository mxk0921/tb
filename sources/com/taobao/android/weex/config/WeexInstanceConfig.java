package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bde;
import tb.k3x;
import tb.lce;
import tb.rce;
import tb.t2o;
import tb.v8x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexInstanceConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeexUnicornConfig f9923a;
    public v8x b;
    public lce c;
    public bde d;
    public rce e;
    public String f;
    public boolean g;
    public boolean h;
    public WeexEmbedPresentMode i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum WeexEmbedPresentMode {
        WeexEmbedPresentModeCard,
        WeexEmbedPresentModePopup,
        WeexEmbedPresentModePage;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WeexEmbedPresentMode weexEmbedPresentMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/config/WeexInstanceConfig$WeexEmbedPresentMode");
        }

        public static WeexEmbedPresentMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexEmbedPresentMode) ipChange.ipc$dispatch("acb5cc4c", new Object[]{str});
            }
            return (WeexEmbedPresentMode) Enum.valueOf(WeexEmbedPresentMode.class, str);
        }
    }

    static {
        t2o.a(982515862);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
        }
        return this.f;
    }

    public lce b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lce) ipChange.ipc$dispatch("42d7ad38", new Object[]{this});
        }
        return this.c;
    }

    public rce c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rce) ipChange.ipc$dispatch("3a4abcba", new Object[]{this});
        }
        return this.e;
    }

    public bde d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bde) ipChange.ipc$dispatch("153f3194", new Object[]{this});
        }
        return this.d;
    }

    public v8x e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8x) ipChange.ipc$dispatch("e8ca23ff", new Object[]{this});
        }
        return this.b;
    }

    public WeexUnicornConfig f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexUnicornConfig) ipChange.ipc$dispatch("5afb3853", new Object[]{this});
        }
        return this.f9923a;
    }

    public k3x g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k3x) ipChange.ipc$dispatch("19a0bf3d", new Object[]{this});
        }
        return null;
    }

    public WeexEmbedPresentMode h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexEmbedPresentMode) ipChange.ipc$dispatch("a95e9742", new Object[]{this});
        }
        return this.i;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c557ed", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("977d6492", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2b2626", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66ae5ae", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void m(lce lceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce706660", new Object[]{this, lceVar});
        } else {
            this.c = lceVar;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b03b43", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void o(rce rceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47cbc76", new Object[]{this, rceVar});
        } else {
            this.e = rceVar;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa263ce", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void q(bde bdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6911a0", new Object[]{this, bdeVar});
        } else {
            this.d = bdeVar;
        }
    }

    public void r(v8x v8xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8adf67", new Object[]{this, v8xVar});
        } else {
            this.b = v8xVar;
        }
    }

    public void s(WeexUnicornConfig weexUnicornConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba87ee7", new Object[]{this, weexUnicornConfig});
        } else {
            this.f9923a = weexUnicornConfig;
        }
    }

    public void t(WeexEmbedPresentMode weexEmbedPresentMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6f35de", new Object[]{this, weexEmbedPresentMode});
        } else {
            this.i = weexEmbedPresentMode;
        }
    }
}
