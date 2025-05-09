package com.taobao.privacyguard.minors;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsPrivacyComplianceAbility;
import com.taobao.android.abilityidl.ability.PrivacyComplianceMinorsStatusResult;
import tb.kdb;
import tb.ldd;
import tb.t2o;
import tb.vhl;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MegaPrivacyComplianceAbility extends AbsPrivacyComplianceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(757071892);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4388a7a", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "V1";
        }
        if (i == 2) {
            return "V2";
        }
        if (i == 3) {
            return "V3";
        }
        if (i == 4) {
            return "V4";
        }
        if (i != 5) {
            return "SYSTEM_ERROR";
        }
        return "V5";
    }

    public static /* synthetic */ Object ipc$super(MegaPrivacyComplianceAbility megaPrivacyComplianceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/privacyguard/minors/MegaPrivacyComplianceAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPrivacyComplianceAbility
    public void requestMinorsStatus(kdb kdbVar, ldd lddVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f108f6", new Object[]{this, kdbVar, lddVar});
            return;
        }
        if (kdbVar.a() == null) {
            context = null;
        } else {
            context = kdbVar.a().getContext();
        }
        if (context == null) {
            vhl.b("MegaPrivacyComplianceAbility", "context is null");
            lddVar.O(new ErrorResult("ERROR", "context is null"));
            return;
        }
        PrivacyComplianceMinorsStatusResult privacyComplianceMinorsStatusResult = new PrivacyComplianceMinorsStatusResult();
        privacyComplianceMinorsStatusResult.isMinors = Boolean.valueOf(xpr.y(context));
        privacyComplianceMinorsStatusResult.isSystemMinors = Boolean.valueOf(xpr.A(context));
        privacyComplianceMinorsStatusResult.ageLevel = a(xpr.s(context));
        lddVar.g1(privacyComplianceMinorsStatusResult);
    }
}
