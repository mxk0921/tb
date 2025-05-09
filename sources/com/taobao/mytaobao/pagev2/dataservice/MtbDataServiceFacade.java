package com.taobao.mytaobao.pagev2.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.g1a;
import tb.h3j;
import tb.iln;
import tb.jqc;
import tb.k2b;
import tb.r3j;
import tb.s3j;
import tb.t2o;
import tb.tz9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbDataServiceFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbDataServiceFacade INSTANCE = new MtbDataServiceFacade();

    /* renamed from: a  reason: collision with root package name */
    public static final k2b f11283a = new k2b();
    public static s3j b;
    public static WeakReference<tz9> c;

    static {
        t2o.a(745537926);
    }

    public static final /* synthetic */ WeakReference a(MtbDataServiceFacade mtbDataServiceFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("7c7aac8c", new Object[]{mtbDataServiceFacade});
        }
        return c;
    }

    public static final /* synthetic */ s3j b(MtbDataServiceFacade mtbDataServiceFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3j) ipChange.ipc$dispatch("7d5aea7d", new Object[]{mtbDataServiceFacade});
        }
        return b;
    }

    public static final /* synthetic */ k2b c(MtbDataServiceFacade mtbDataServiceFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2b) ipChange.ipc$dispatch("1bc73214", new Object[]{mtbDataServiceFacade});
        }
        return f11283a;
    }

    public static final /* synthetic */ void d(MtbDataServiceFacade mtbDataServiceFacade, s3j s3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8285c7", new Object[]{mtbDataServiceFacade, s3jVar});
        }
    }

    public static final /* synthetic */ void e(MtbDataServiceFacade mtbDataServiceFacade, s3j s3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a7c17", new Object[]{mtbDataServiceFacade, s3jVar});
        } else {
            b = s3jVar;
        }
    }

    @JvmStatic
    public static final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65273e6a", new Object[0]);
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            return a2.o();
        }
        return null;
    }

    @JvmStatic
    public static final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fd160cb", new Object[0]);
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    @JvmStatic
    public static final s3j h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3j) ipChange.ipc$dispatch("dc7b3289", new Object[0]);
        }
        s3j s3jVar = b;
        if (s3jVar != null) {
            return s3jVar;
        }
        jqc a2 = r3j.Companion.a();
        JSONObject m = a2 != null ? a2.m() : null;
        if (m == null) {
            TLog.loge("mtbMainLink", "MtbDataServiceFacade.getLocalData返回null");
            return null;
        }
        s3j a3 = f11283a.a(new iln(2), m);
        b = a3;
        return a3;
    }

    @JvmStatic
    public static final s3j i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3j) ipChange.ipc$dispatch("651fab39", new Object[0]);
        }
        s3j s3jVar = b;
        if (s3jVar != null) {
            return s3jVar;
        }
        jqc a2 = r3j.Companion.a();
        JSONObject s = a2 != null ? a2.s() : null;
        if (s == null) {
            TLog.loge("mtbMainLink", "MtbDataServiceFacade.getPageData返回null");
            return null;
        }
        s3j a3 = f11283a.a(new iln(2), s);
        b = a3;
        return a3;
    }

    @JvmStatic
    public static final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd05495", new Object[0]);
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            return a2.n();
        }
        return null;
    }

    @JvmStatic
    public static final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("767a76f6", new Object[0]);
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            return a2.h();
        }
        return null;
    }

    @JvmStatic
    public static final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[0]);
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            return a2.getUserNick();
        }
        return null;
    }

    @JvmStatic
    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c9c91e", new Object[0])).booleanValue();
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            return a2.is88Vip();
        }
        return false;
    }

    @JvmStatic
    public static final void n(u1a<? super iln, ? super JSONObject, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a65a490", new Object[]{u1aVar});
            return;
        }
        ckf.h(u1aVar, "globalChangeListener");
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.k(new MtbDataServiceFacade$listenGlobalDataChange$1(u1aVar));
        }
    }

    @JvmStatic
    public static final void o(u1a<? super iln, ? super List<String>, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7f310d", new Object[]{u1aVar});
            return;
        }
        ckf.h(u1aVar, "layoutChangeListener");
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.j(new MtbDataServiceFacade$listenLayoutChange$1(u1aVar));
        }
    }

    @JvmStatic
    public static final void p(u1a<? super iln, ? super Map<String, h3j>, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f239b43c", new Object[]{u1aVar});
            return;
        }
        ckf.h(u1aVar, "dataChangeListener");
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.c(new MtbDataServiceFacade$listenPageDataChange$1(u1aVar));
        }
    }

    @JvmStatic
    public static final void q(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cc123e", new Object[]{g1aVar});
            return;
        }
        ckf.h(g1aVar, "refreshFailedListener");
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.a(new MtbDataServiceFacade$listenRefreshFailed$1(g1aVar));
        }
    }

    @JvmStatic
    public static final void r(u1a<? super iln, ? super List<h3j>, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adba009d", new Object[]{u1aVar});
            return;
        }
        ckf.h(u1aVar, "templateChangeListener");
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.g(new MtbDataServiceFacade$listenTemplateChange$1(u1aVar));
        }
    }

    @JvmStatic
    public static final void s(tz9 tz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c1ef7a", new Object[]{tz9Var});
            return;
        }
        ckf.h(tz9Var, "fullDataChangeListener");
        c = new WeakReference<>(tz9Var);
    }

    @JvmStatic
    public static final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fabc53a", new Object[]{str});
            return;
        }
        ckf.h(str, "userId");
        r3j.a aVar = r3j.Companion;
        if (aVar.b(str)) {
            TLog.loge("mtbMainLink", "login,数据层创建");
            jqc a2 = aVar.a();
            if (a2 != null) {
                a2.f(MtbDataServiceFacade$login$1.INSTANCE);
            }
        }
    }

    @JvmStatic
    public static final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e233c511", new Object[0]);
            return;
        }
        r3j.Companion.c();
        INSTANCE.z();
    }

    @JvmStatic
    public static final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e986d4df", new Object[0]);
            return;
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.d();
        }
    }

    @JvmStatic
    public static final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[0]);
            return;
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.l();
        }
    }

    @JvmStatic
    public static final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786ce346", new Object[0]);
            return;
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.e();
        }
    }

    @JvmStatic
    public static final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1795108", new Object[]{new Integer(i)});
            return;
        }
        jqc a2 = r3j.Companion.a();
        if (a2 != null) {
            a2.i(i);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        b = null;
        c = null;
    }
}
