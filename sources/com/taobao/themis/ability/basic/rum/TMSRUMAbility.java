package com.taobao.themis.ability.basic.rum;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsRUMAbility;
import com.taobao.android.abilityidl.ability.RUMDataResult;
import com.taobao.android.abilityidl.ability.RUMResultCallbackParams;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;
import tb.ckf;
import tb.dcn;
import tb.ecn;
import tb.kdb;
import tb.pgd;
import tb.qgd;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/ability/basic/rum/TMSRUMAbility;", "Lcom/taobao/android/abilityidl/ability/AbsRUMAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/ecn;", "params", "Ltb/qgd;", "callback", "Ltb/xhv;", "addStandardStage", "(Ltb/kdb;Ltb/ecn;Ltb/qgd;)V", "Ltb/dcn;", "addStandardProperty", "(Ltb/kdb;Ltb/dcn;Ltb/qgd;)V", "addCustomStage", "addContainerProperty", "addContainerStage", "addCustomProperty", "Ltb/tao;", "Lcom/taobao/android/abilityidl/ability/RUMDataResult;", "Lcom/alibaba/ability/result/ErrorResult;", "getCurrentPageData", "(Ltb/kdb;)Ltb/tao;", "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSRUMAbility extends AbsRUMAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(830472223);
    }

    public static /* synthetic */ Object ipc$super(TMSRUMAbility tMSRUMAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/rum/TMSRUMAbility");
    }

    public final pgd a(kdb kdbVar, dcn dcnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgd) ipChange.ipc$dispatch("810f3bdb", new Object[]{this, kdbVar, dcnVar, qgdVar});
        }
        if (dcnVar.f17728a.length() == 0 || dcnVar.b.length() == 0) {
            qgdVar.N(new RUMResultCallbackParams());
            return null;
        } else if (CommonExtKt.g(kdbVar) == null) {
            qgdVar.O(ErrorResult.a.c(null));
            return null;
        } else {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                qgdVar.O(ErrorResult.a.d(null));
                return null;
            }
            pgd pgdVar = (pgd) h.getExtension(pgd.class);
            if (pgdVar != null) {
                return pgdVar;
            }
            qgdVar.O(ErrorResult.a.b(null));
            return null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public void addContainerProperty(kdb kdbVar, dcn dcnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bedff5", new Object[]{this, kdbVar, dcnVar, qgdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(dcnVar, "params");
        ckf.g(qgdVar, "callback");
        if (CommonExtKt.h(kdbVar) == null) {
            qgdVar.O(ErrorResult.a.d(null));
            return;
        }
        pgd a2 = a(kdbVar, dcnVar, qgdVar);
        if (a2 != null) {
            a2.F(dcnVar.f17728a, dcnVar.b, TMSRumTarget.CONTAINER);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public void addContainerStage(kdb kdbVar, ecn ecnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dfefcf", new Object[]{this, kdbVar, ecnVar, qgdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ecnVar, "params");
        ckf.g(qgdVar, "callback");
        if (CommonExtKt.h(kdbVar) == null) {
            qgdVar.O(ErrorResult.a.d(null));
            return;
        }
        pgd b = b(kdbVar, ecnVar, qgdVar);
        if (b != null) {
            b.R0(ecnVar.f18475a, (long) ecnVar.b, TMSRumTarget.CONTAINER);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public void addCustomProperty(kdb kdbVar, dcn dcnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ca5d07", new Object[]{this, kdbVar, dcnVar, qgdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(dcnVar, "params");
        ckf.g(qgdVar, "callback");
        if (CommonExtKt.h(kdbVar) == null) {
            qgdVar.O(ErrorResult.a.d(null));
            return;
        }
        pgd a2 = a(kdbVar, dcnVar, qgdVar);
        if (a2 != null) {
            a2.F(dcnVar.f17728a, dcnVar.b, TMSRumTarget.CUSTOM);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public void addCustomStage(kdb kdbVar, ecn ecnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4b2261", new Object[]{this, kdbVar, ecnVar, qgdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ecnVar, "params");
        ckf.g(qgdVar, "callback");
        if (CommonExtKt.h(kdbVar) == null) {
            qgdVar.O(ErrorResult.a.d(null));
            return;
        }
        pgd b = b(kdbVar, ecnVar, qgdVar);
        if (b != null) {
            b.R0(ecnVar.f18475a, (long) ecnVar.b, TMSRumTarget.CUSTOM);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public void addStandardProperty(kdb kdbVar, dcn dcnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1c8b13", new Object[]{this, kdbVar, dcnVar, qgdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(dcnVar, "params");
        ckf.g(qgdVar, "callback");
        pgd a2 = a(kdbVar, dcnVar, qgdVar);
        if (a2 != null) {
            a2.F(dcnVar.f17728a, dcnVar.b, TMSRumTarget.STANDARD);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public void addStandardStage(kdb kdbVar, ecn ecnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222bc96d", new Object[]{this, kdbVar, ecnVar, qgdVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ecnVar, "params");
        ckf.g(qgdVar, "callback");
        pgd b = b(kdbVar, ecnVar, qgdVar);
        if (b != null) {
            b.R0(ecnVar.f18475a, (long) ecnVar.b, TMSRumTarget.STANDARD);
        }
    }

    public final pgd b(kdb kdbVar, ecn ecnVar, qgd qgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pgd) ipChange.ipc$dispatch("1c3eac6b", new Object[]{this, kdbVar, ecnVar, qgdVar});
        }
        if (ecnVar.f18475a.length() == 0) {
            qgdVar.N(new RUMResultCallbackParams());
            return null;
        } else if (CommonExtKt.g(kdbVar) == null) {
            qgdVar.O(ErrorResult.a.c(null));
            return null;
        } else {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                qgdVar.O(ErrorResult.a.d(null));
                return null;
            }
            pgd pgdVar = (pgd) h.getExtension(pgd.class);
            if (pgdVar != null) {
                return pgdVar;
            }
            qgdVar.O(ErrorResult.a.b(null));
            return null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsRUMAbility
    public tao<RUMDataResult, ErrorResult> getCurrentPageData(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("6f8f4c20", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        if (CommonExtKt.g(kdbVar) == null) {
            return new tao<>(null, ErrorResult.a.d(null));
        }
        if (CommonExtKt.h(kdbVar) == null) {
            return new tao<>(null, ErrorResult.a.d(null));
        }
        return new tao<>(null, ErrorResult.a.d(null));
    }
}
