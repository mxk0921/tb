package com.taobao.themis.canvas.launch_step;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.CommonExtKt;
import tb.a07;
import tb.a9s;
import tb.bbs;
import tb.c8;
import tb.ckf;
import tb.h9;
import tb.hij;
import tb.n8;
import tb.n9;
import tb.nbf;
import tb.q9s;
import tb.t2o;
import tb.u8;
import tb.wzi;
import tb.xhv;
import tb.y7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSGameStopServiceStep extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666574);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13476a;

        public b(bbs bbsVar) {
            this.f13476a = bbsVar;
        }

        @Override // tb.u8
        public final void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                return;
            }
            if (ckf.b(str, "onClose")) {
                this.f13476a.W().e();
            }
            TMSLogger.f("TMSGameStopServiceStep", ckf.p(str, c8Var));
        }
    }

    static {
        t2o.a(834666573);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameStopServiceStep(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(TMSGameStopServiceStep tMSGameStopServiceStep, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/launch_step/TMSGameStopServiceStep");
    }

    public static final /* synthetic */ void k(TMSGameStopServiceStep tMSGameStopServiceStep, bbs bbsVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db24faeb", new Object[]{tMSGameStopServiceStep, bbsVar, jSONObject});
        } else {
            tMSGameStopServiceStep.m(bbsVar, jSONObject);
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSGameStopServiceStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        ckf.f(bbsVar, "mInstance");
        if (!l(bbsVar)) {
            i();
        }
    }

    public final void m(bbs bbsVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b2aa7", new Object[]{this, bbsVar, jSONObject});
            return;
        }
        n9 n9Var = new n9();
        n9Var.i(bbsVar.I());
        n9Var.m(bbsVar.I().getWindow().getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "url", q9s.i3());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "gravity", "center");
        Boolean bool = Boolean.TRUE;
        jSONObject4.put((JSONObject) "tapEnable", (String) bool);
        jSONObject4.put((JSONObject) "pushType", "outterJump");
        jSONObject4.put((JSONObject) "maxHeight", (String) 1);
        jSONObject4.put((JSONObject) "originHeight", (String) 1);
        jSONObject4.put((JSONObject) "useViewMode", (String) bool);
        jSONObject4.put((JSONObject) "animation", nbf.STDPOP_ANIMATION_BOTTOM);
        jSONObject4.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) Float.valueOf(0.0f));
        jSONObject4.put((JSONObject) "shouldBlockClose", (String) bool);
        jSONObject3.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject4);
        jSONObject3.put((JSONObject) "popId", ckf.p("stop_service_", bbsVar.L()));
        jSONObject3.put((JSONObject) "content", (String) jSONObject);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put((JSONObject) "params", (String) jSONObject3);
        new y7().b(new n8(jSONObject2), n9Var, new b(bbsVar));
    }

    public final boolean l(bbs bbsVar) {
        JSONObject jSONObject;
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e01f04", new Object[]{this, bbsVar})).booleanValue();
        }
        if (!q9s.D0()) {
            return false;
        }
        try {
            TMSMetaInfoWrapper U = bbsVar.U();
            jSONObject = null;
            if (!(U == null || (e = U.e()) == null)) {
                jSONObject = e.getJSONObject("stopServiceInfo");
            }
        } catch (Throwable th) {
            TMSLogger.c("TMSGameStopServiceStep", "needStopService failed", th);
        }
        if (jSONObject == null) {
            return false;
        }
        Long l = jSONObject.getLong("startTime");
        Long l2 = jSONObject.getLong("endTime");
        long currentTimeMillis = System.currentTimeMillis();
        ckf.f(l, "startTime");
        if (currentTimeMillis >= l.longValue()) {
            ckf.f(l2, "endTime");
            if (currentTimeMillis <= l2.longValue()) {
                CommonExtKt.o(new TMSGameStopServiceStep$needStopService$1(this, jSONObject));
                return true;
            }
        }
        return false;
    }
}
