package com.taobao.android.nanocompose.runtime.context;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.c6z;
import tb.ckf;
import tb.drz;
import tb.hrz;
import tb.k2z;
import tb.mlz;
import tb.njg;
import tb.qgz;
import tb.shz;
import tb.t2o;
import tb.xhv;
import tb.zgz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCBusinessContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f9025a;
    public final k2z b;
    public final njg c;
    public final njg d;
    public final njg e;
    public final zgz f;
    public final shz g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737270);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final NCBusinessContext a(c6z c6zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NCBusinessContext) ipChange.ipc$dispatch("beef76d5", new Object[]{this, c6zVar});
            }
            ckf.g(c6zVar, "engineConfig");
            NCBusinessContext nCBusinessContext = new NCBusinessContext(c6zVar.a(), null);
            nCBusinessContext.b().b(c6zVar.b());
            nCBusinessContext.d().d(c6zVar.c());
            return nCBusinessContext;
        }

        public a() {
        }
    }

    static {
        t2o.a(598737269);
    }

    public /* synthetic */ NCBusinessContext(String str, a07 a07Var) {
        this(str);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
        }
        return this.f9025a;
    }

    public final k2z b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2z) ipChange.ipc$dispatch("e68a80c5", new Object[]{this});
        }
        return this.b;
    }

    public final qgz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qgz) ipChange.ipc$dispatch("a9180677", new Object[]{this});
        }
        return (qgz) this.e.getValue();
    }

    public final zgz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zgz) ipChange.ipc$dispatch("9a2ec019", new Object[]{this});
        }
        return this.f;
    }

    public final AbilityHubAdapter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("afa6abe", new Object[]{this});
        }
        return (AbilityHubAdapter) this.d.getValue();
    }

    public final mlz f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlz) ipChange.ipc$dispatch("e812f20c", new Object[]{this});
        }
        return (mlz) this.c.getValue();
    }

    public final shz g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shz) ipChange.ipc$dispatch("d46d4995", new Object[]{this});
        }
        return this.g;
    }

    public NCBusinessContext(String str) {
        this.f9025a = str;
        this.b = new k2z();
        this.c = kotlin.a.b(new NCBusinessContext$scheduler$2(this));
        this.d = kotlin.a.b(NCBusinessContext$megaEngine$2.INSTANCE);
        this.e = kotlin.a.b(new NCBusinessContext$eventDispatcher$2(this));
        this.f = zgz.Companion.a();
        shz shzVar = new shz();
        shzVar.f(hrz.b((byte) 1));
        shzVar.e(drz.b((byte) 0));
        shzVar.d(null);
        xhv xhvVar = xhv.INSTANCE;
        this.g = shzVar;
    }
}
