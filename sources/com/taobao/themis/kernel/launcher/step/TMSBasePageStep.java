package com.taobao.themis.kernel.launcher.step;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import tb.a9s;
import tb.bbs;
import tb.ckf;
import tb.eas;
import tb.gld;
import tb.ngb;
import tb.q9s;
import tb.t2o;
import tb.wzi;
import tb.x4b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TMSBasePageStep extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ITMSPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d0ee080", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            TMSBasePageStep.this.j.onRenderReady();
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.b
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e2d820", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            TMSBasePageStep.this.j.a();
            TMSBasePageStep.this.b.S().b("firstPageRenderSuccess");
        }
    }

    static {
        t2o.a(839909749);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBasePageStep(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(TMSBasePageStep tMSBasePageStep, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/step/TMSBasePageStep");
    }

    public static final /* synthetic */ void k(TMSBasePageStep tMSBasePageStep) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced73530", new Object[]{tMSBasePageStep});
        } else {
            tMSBasePageStep.l();
        }
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
        } else if (ckf.b(this.b.c0().getExtraData().getString("tms_weex_async_create"), "true")) {
            l();
        } else {
            CommonExtKt.o(new TMSBasePageStep$onExecuting$1(this));
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce25d117", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        if (bbsVar != null && !bbsVar.g0()) {
            this.b.X().e("firstPageStartCreate");
            bbs bbsVar2 = this.b;
            ckf.f(bbsVar2, "mInstance");
            gld m = CommonExtKt.m(bbsVar2);
            if (m != null) {
                m.C("firstPageStartCreate");
            }
            this.b.S().b("firstPageRenderStart");
            bbs bbsVar3 = this.b;
            ckf.f(bbsVar3, "mInstance");
            gld m2 = CommonExtKt.m(bbsVar3);
            if (m2 != null) {
                m2.C("engineInitStart");
            }
            bbs bbsVar4 = this.b;
            ckf.f(bbsVar4, "mInstance");
            gld m3 = CommonExtKt.m(bbsVar4);
            if (m3 != null) {
                m3.C("pageCreateStart");
            }
            ITMSPage m4 = m();
            bbs bbsVar5 = this.b;
            ckf.f(bbsVar5, "mInstance");
            gld m5 = CommonExtKt.m(bbsVar5);
            if (m5 != null) {
                m5.C("pageCreateEnd");
            }
            if (m4 == null) {
                g(eas.h);
                return;
            }
            if (q9s.x1()) {
                Object extension = this.b.getExtension(ngb.class);
                x4b x4bVar = extension instanceof x4b ? (x4b) extension : null;
                if (x4bVar != null) {
                    x4bVar.t(m4);
                }
            }
            this.b.S().b("firstPageCreated");
            m4.v(new a());
            i();
        }
    }

    public abstract ITMSPage m();
}
