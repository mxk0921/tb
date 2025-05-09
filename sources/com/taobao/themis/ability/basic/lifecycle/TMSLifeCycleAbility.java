package com.taobao.themis.ability.basic.lifecycle;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.abilityidl.ability.AbsLifeCycleAbility;
import com.taobao.android.abilityidl.ability.LifeCyclePageLifeCycleEventParams;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import tb.akc;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/ability/basic/lifecycle/TMSLifeCycleAbility;", "Lcom/taobao/android/abilityidl/ability/AbsLifeCycleAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/akc;", "callback", "Ltb/xhv;", "addPageLifeCycleListener", "(Ltb/kdb;Ltb/akc;)V", "Ltb/jdb;", "removePageLifeCycleListener", "(Ltb/kdb;Ltb/jdb;)V", "onDestroy", "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSLifeCycleAbility extends AbsLifeCycleAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArraySet<ITMSPage.a> f13443a = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ akc f13444a;

        public a(akc akcVar) {
            this.f13444a = akcVar;
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            akc akcVar = this.f13444a;
            LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams = new LifeCyclePageLifeCycleEventParams();
            lifeCyclePageLifeCycleEventParams.pageId = iTMSPage.getPageParams().e().g();
            akcVar.X0(lifeCyclePageLifeCycleEventParams);
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.c(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            akc akcVar = this.f13444a;
            LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams = new LifeCyclePageLifeCycleEventParams();
            lifeCyclePageLifeCycleEventParams.pageId = iTMSPage.getPageParams().e().g();
            akcVar.G0(lifeCyclePageLifeCycleEventParams);
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.d(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void l(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a6418b", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.e(this, iTMSPage);
            a(iTMSPage);
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            ITMSPage.a.C0773a.f(this, iTMSPage);
            g(iTMSPage);
        }
    }

    static {
        t2o.a(830472211);
    }

    public static /* synthetic */ Object ipc$super(TMSLifeCycleAbility tMSLifeCycleAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/lifecycle/TMSLifeCycleAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLifeCycleAbility
    public void addPageLifeCycleListener(kdb kdbVar, akc akcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9761dd62", new Object[]{this, kdbVar, akcVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(akcVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            akcVar.O(ErrorResult.a.c(null));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            akcVar.O(ErrorResult.a.d(null));
            return;
        }
        a aVar = new a(akcVar);
        this.f13443a.add(aVar);
        h.C(aVar);
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLifeCycleAbility
    public void removePageLifeCycleListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9c315d", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c(null));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d(null));
            return;
        }
        for (ITMSPage.a aVar : this.f13443a) {
            ckf.f(aVar, DataReceiveMonitor.CB_LISTENER);
            h.u(aVar);
        }
    }
}
