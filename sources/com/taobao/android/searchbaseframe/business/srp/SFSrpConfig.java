package com.taobao.android.searchbaseframe.business.srp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.io.Serializable;
import tb.ay4;
import tb.kae;
import tb.pib;
import tb.qib;
import tb.t2o;
import tb.x02;
import tb.xua;
import tb.yko;
import tb.zx1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SFSrpConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final yko mCore;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001657);
        }

        public a() {
        }

        public void a(zx1<? extends BaseTypedBean, ? extends BaseSearchResult> zx1Var, Class cls, ay4<x02, ? extends kae> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2531d8c8", new Object[]{this, zx1Var, cls, ay4Var});
                return;
            }
            SFSrpConfig.access$000(SFSrpConfig.this).n().e(zx1Var);
            SFSrpConfig.access$000(SFSrpConfig.this).m().b(cls, ay4Var);
        }

        public void b(zx1<? extends BaseTypedBean, ? extends BaseSearchResult> zx1Var, ay4<x02, ? extends kae> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43a44ebd", new Object[]{this, zx1Var, ay4Var});
                return;
            }
            SFSrpConfig.access$000(SFSrpConfig.this).n().e(zx1Var);
            SFSrpConfig.access$000(SFSrpConfig.this).m().b(zx1Var.b(), ay4Var);
        }

        public void c(ay4<Void, ? extends pib> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0ea2ef0", new Object[]{this, ay4Var});
            } else {
                ((xua) SFSrpConfig.access$000(SFSrpConfig.this).j().a()).b = ay4Var;
            }
        }

        public void d(ay4<Void, ? extends qib> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("687286f3", new Object[]{this, ay4Var});
            } else {
                ((xua) SFSrpConfig.access$000(SFSrpConfig.this).j().a()).f31610a = ay4Var;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993001658);
        }

        public b() {
        }

        public void a(zx1<? extends BaseTypedBean, ? extends BaseSearchResult> zx1Var, ay4<x02, ? extends kae> ay4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa4be6a", new Object[]{this, zx1Var, ay4Var});
                return;
            }
            SFSrpConfig.access$000(SFSrpConfig.this).n().e(zx1Var);
            SFSrpConfig.access$000(SFSrpConfig.this).m().b(zx1Var.b(), ay4Var);
        }
    }

    static {
        t2o.a(993001656);
    }

    private SFSrpConfig(yko ykoVar) {
        this.mCore = ykoVar;
        ykoVar.f().m(new b());
        ykoVar.f().k(new a());
        ykoVar.j().b(new xua());
    }

    public static /* synthetic */ yko access$000(SFSrpConfig sFSrpConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("c27117b8", new Object[]{sFSrpConfig});
        }
        return sFSrpConfig.mCore;
    }

    public static void install(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc27d2d", new Object[]{ykoVar});
        } else {
            new SFSrpConfig(ykoVar);
        }
    }
}
