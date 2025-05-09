package com.alibaba.android.ultron.vfw.instance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.i5e;
import tb.kz;
import tb.t2o;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronInstanceConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_REFRESH_AFTER_DOWNLOAD = 2;
    public static final int TYPE_REFRESH_NEXT_CREATE = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f2327a;
    public ExposureStrategy e;
    public boolean f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public z7v k;
    public kz l;
    public boolean b = false;
    public boolean c = true;
    public int d = 1001;
    public boolean m = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum ExposureStrategy {
        EXPOSURE_DEAFULT,
        EXPOSURE_ONCE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ExposureStrategy exposureStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/UltronInstanceConfig$ExposureStrategy");
        }

        public static ExposureStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExposureStrategy) ipChange.ipc$dispatch("59cf1a8f", new Object[]{str});
            }
            return (ExposureStrategy) Enum.valueOf(ExposureStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ItemCreateStrategy {
        public static final int ON_EXPOSURE = 0;
        public static final int ON_FIRST_SCROLL = 1;
    }

    static {
        t2o.a(157286655);
    }

    public void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5744df37", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Deprecated
    public UltronInstanceConfig B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceConfig) ipChange.ipc$dispatch("a04e383c", new Object[]{this, new Integer(i)});
        }
        return this;
    }

    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cf07e7", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void D(kz kzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61472130", new Object[]{this, kzVar});
        } else {
            this.l = kzVar;
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf91208", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void G(z7v z7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a02734", new Object[]{this, z7vVar});
        } else {
            this.k = z7vVar;
        }
    }

    public void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eaa330e", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cde7d2", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78f1562", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public UltronInstanceConfig K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceConfig) ipChange.ipc$dispatch("161efc66", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4867c17e", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void b(ExposureStrategy exposureStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0b5465", new Object[]{this, exposureStrategy});
        } else {
            this.e = exposureStrategy;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1adfa133", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public ExposureStrategy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposureStrategy) ipChange.ipc$dispatch("40cd0fed", new Object[]{this});
        }
        return this.e;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36982e5b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84d33c21", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4691074d", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70fd2ea8", new Object[]{this});
        }
        return null;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.f2327a;
    }

    public kz j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kz) ipChange.ipc$dispatch("75dfb786", new Object[]{this});
        }
        return this.l;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        String str = this.g;
        if (str == null) {
            return "";
        }
        return str;
    }

    public i5e l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i5e) ipChange.ipc$dispatch("583ef97d", new Object[]{this});
        }
        return null;
    }

    public z7v m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7v) ipChange.ipc$dispatch("6bcb494c", new Object[]{this});
        }
        return this.k;
    }

    public UltronInstanceConfig n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceConfig) ipChange.ipc$dispatch("d789ad6f", new Object[]{this, new Boolean(z)});
        }
        this.b = z;
        return this;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b28584b6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f09819f2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34e27e4", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("123d1ea7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98c43888", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dafc4402", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ead52", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8f500e", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3103192", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e535609", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public UltronInstanceConfig z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceConfig) ipChange.ipc$dispatch("fc0b5d3a", new Object[]{this, str});
        }
        this.f2327a = str;
        return this;
    }
}
