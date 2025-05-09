package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.lg4;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpRainbowManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static volatile IrpRainbowManager e;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f4786a;
    public Integer b;
    public Boolean c;
    public final njg d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297115);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final IrpRainbowManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpRainbowManager) ipChange.ipc$dispatch("8336f1a2", new Object[]{this});
            }
            IrpRainbowManager a2 = IrpRainbowManager.a();
            if (a2 == null) {
                synchronized (this) {
                    a2 = IrpRainbowManager.a();
                    if (a2 == null) {
                        a2 = new IrpRainbowManager(null);
                        IrpRainbowManager.b(a2);
                    }
                }
            }
            return a2;
        }

        public a() {
        }
    }

    static {
        t2o.a(481297114);
    }

    public /* synthetic */ IrpRainbowManager(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ IrpRainbowManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpRainbowManager) ipChange.ipc$dispatch("74da35fd", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ void b(IrpRainbowManager irpRainbowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6d809f", new Object[]{irpRainbowManager});
        } else {
            e = irpRainbowManager;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            e = null;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4641f13b", new Object[]{this})).booleanValue();
        }
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba2acf3", new Object[]{this})).intValue();
        }
        Integer num = this.b;
        if (num == null) {
            num = Integer.valueOf(lg4.B2());
            this.b = num;
        }
        return num.intValue();
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee43c554", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.f4786a;
        if (bool == null) {
            bool = Boolean.valueOf(lg4.t0());
            this.f4786a = bool;
        }
        return bool.booleanValue();
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58116f96", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.c;
        if (bool == null) {
            bool = Boolean.valueOf(lg4.A0());
            this.c = bool;
        }
        return bool.booleanValue();
    }

    public IrpRainbowManager() {
        this.d = kotlin.a.a(LazyThreadSafetyMode.NONE, IrpRainbowManager$enableHeaderCardScrollOpt$2.INSTANCE);
    }
}
