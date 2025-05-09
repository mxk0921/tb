package com.taobao.themis.ability.basic.apm;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.APMProcedureResult;
import com.taobao.android.abilityidl.ability.AbsAPMAbility;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;
import tb.ckf;
import tb.kdb;
import tb.mab;
import tb.mc;
import tb.mdd;
import tb.nab;
import tb.nc;
import tb.o9s;
import tb.oab;
import tb.pgd;
import tb.rbe;
import tb.rxm;
import tb.t2o;
import tb.tao;
import tb.vxm;
import tb.wua;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/ability/basic/apm/TMSAPMAbility;", "Lcom/taobao/android/abilityidl/ability/AbsAPMAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/mc;", "params", "Ltb/oab;", "callback", "Ltb/xhv;", "addPageProperty", "(Ltb/kdb;Ltb/mc;Ltb/oab;)V", "Ltb/tao;", "Lcom/taobao/android/abilityidl/ability/APMProcedureResult;", "Lcom/alibaba/ability/result/ErrorResult;", "getCurrentProcedure", "(Ltb/kdb;)Ltb/tao;", "Ltb/nab;", "requestSubCurrentProcedure", "(Ltb/kdb;Ltb/nab;)V", "Ltb/nc;", "addPageStage", "(Ltb/kdb;Ltb/nc;Ltb/oab;)V", "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSAPMAbility extends AbsAPMAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(830472202);
    }

    public static /* synthetic */ Object ipc$super(TMSAPMAbility tMSAPMAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/apm/TMSAPMAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public tao<APMProcedureResult, ErrorResult> getCurrentProcedure(kdb kdbVar) {
        mab mabVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("fac9be0c", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "context");
        if (CommonExtKt.g(kdbVar) == null) {
            return new tao<>(null, ErrorResult.a.c(null));
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        mdd m1 = (h == null || (mabVar = (mab) h.getExtension(mab.class)) == null) ? null : mabVar.m1();
        if (m1 != null) {
            mab mabVar2 = (mab) h.getExtension(mab.class);
            if (mabVar2 != null) {
                mabVar2.k0();
            }
            JSONObject jSONObject = JSON.parseObject(rxm.a(m1)).getJSONObject("value");
            if (jSONObject != null) {
                APMProcedureResult aPMProcedureResult = new APMProcedureResult();
                if (jSONObject.getJSONObject("stages") != null) {
                    aPMProcedureResult.stages = jSONObject.getJSONObject("stages").getInnerMap();
                }
                if (jSONObject.getJSONObject(wua.KEY_PROPERTIES) != null) {
                    aPMProcedureResult.properties = jSONObject.getJSONObject(wua.KEY_PROPERTIES).getInnerMap();
                }
                return new tao<>(aPMProcedureResult);
            }
        }
        return new tao<>(null, ErrorResult.a.d(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public void requestSubCurrentProcedure(kdb kdbVar, nab nabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee57894d", new Object[]{this, kdbVar, nabVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(nabVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            nabVar.O(ErrorResult.a.d(null));
            return;
        }
        rbe rbeVar = (rbe) h.getExtension(rbe.class);
        if (rbeVar == null) {
            nabVar.O(ErrorResult.a.b(null));
            return;
        }
        APMProcedureResult aPMProcedureResult = new APMProcedureResult();
        aPMProcedureResult.stages = rbeVar.d1();
        aPMProcedureResult.properties = rbeVar.t0();
        nabVar.p1(aPMProcedureResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public void addPageStage(kdb kdbVar, nc ncVar, oab oabVar) {
        mab mabVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cee632e", new Object[]{this, kdbVar, ncVar, oabVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ncVar, "params");
        ckf.g(oabVar, "callback");
        if (ncVar.f24627a.length() == 0) {
            oabVar.O(ErrorResult.a.g(null));
        } else if (CommonExtKt.g(kdbVar) == null) {
            oabVar.O(ErrorResult.a.c(null));
        } else {
            ITMSPage h = CommonExtKt.h(kdbVar);
            mdd m1 = (h == null || (mabVar = (mab) h.getExtension(mab.class)) == null) ? null : mabVar.m1();
            mdd e = vxm.b.e();
            ckf.f(e, "PROXY.launcherProcedure");
            pgd pgdVar = h == null ? null : (pgd) h.getExtension(pgd.class);
            if (m1 == null && pgdVar == null) {
                oabVar.O(ErrorResult.a.b(null));
                return;
            }
            if (m1 != null) {
                m1.j(ncVar.f24627a, o9s.c((long) ncVar.b));
            }
            e.j(ncVar.f24627a, o9s.c((long) ncVar.b));
            if (pgdVar != null) {
                pgdVar.R0(ncVar.f24627a, (long) ncVar.b, TMSRumTarget.CONTAINER);
            }
            oabVar.onResult(true);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public void addPageProperty(kdb kdbVar, mc mcVar, oab oabVar) {
        pgd pgdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596619ee", new Object[]{this, kdbVar, mcVar, oabVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(mcVar, "params");
        ckf.g(oabVar, "callback");
        if (mcVar.f23933a.length() == 0 || mcVar.b.length() == 0) {
            oabVar.onResult(false);
        } else if (CommonExtKt.g(kdbVar) == null) {
            oabVar.O(ErrorResult.a.c(null));
        } else {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                oabVar.O(ErrorResult.a.d(null));
                return;
            }
            if (TextUtils.equals(mcVar.f23933a, "renderStrategy") && (pgdVar = (pgd) h.getExtension(pgd.class)) != null) {
                pgdVar.D(mcVar.b);
            }
            mab mabVar = (mab) h.getExtension(mab.class);
            mdd m1 = mabVar == null ? null : mabVar.m1();
            mdd e = vxm.b.e();
            ckf.f(e, "PROXY.launcherProcedure");
            pgd pgdVar2 = (pgd) h.getExtension(pgd.class);
            if (m1 == null && pgdVar2 == null) {
                oabVar.O(ErrorResult.a.b(null));
                return;
            }
            if (m1 != null) {
                m1.a(mcVar.f23933a, mcVar.b);
            }
            e.a(mcVar.f23933a, mcVar.b);
            if (pgdVar2 != null) {
                pgdVar2.F(mcVar.f23933a, mcVar.b, TMSRumTarget.CONTAINER);
            }
            oabVar.onResult(true);
        }
    }
}
