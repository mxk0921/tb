package com.taobao.mmad.ability.biz.coupon;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.i4v;
import tb.j0u;
import tb.jgh;
import tb.ku1;
import tb.m0j;
import tb.nwi;
import tb.rln;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ReceiveCouponEvent extends ku1<rln> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<RemoteBusiness> c = new ArrayList();

    static {
        t2o.a(573571095);
    }

    public static /* synthetic */ List g(ReceiveCouponEvent receiveCouponEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8faba3d", new Object[]{receiveCouponEvent});
        }
        return receiveCouponEvent.c;
    }

    public static /* synthetic */ void h(ReceiveCouponEvent receiveCouponEvent, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a15dfbee", new Object[]{receiveCouponEvent, mtopResponse});
        } else {
            receiveCouponEvent.k(mtopResponse);
        }
    }

    public static /* synthetic */ Object ipc$super(ReceiveCouponEvent receiveCouponEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/ability/biz/coupon/ReceiveCouponEvent");
    }

    @Override // tb.ku1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adef98ca", new Object[]{this});
        }
        return "claimedCoupon";
    }

    public final void k(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7257e024", new Object[]{this, mtopResponse});
            return;
        }
        try {
            if (Globals.getApplication() != null) {
                if (mtopResponse == null) {
                    i("UNKNOWN_ERROR", "领券失败: response_null");
                    j0u.a("抱歉，优惠券已领光");
                } else if ("ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode())) {
                    jgh.a("ReceiveCouponEvent", "ANDROID_SYS_LOGIN_CANCEL");
                    i(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                } else {
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    if (dataJsonObject == null) {
                        i("UNKNOWN_ERROR", "领券失败: data_null");
                        j0u.a("抱歉，优惠券已领光");
                        return;
                    }
                    String optString = dataJsonObject.optString("failure");
                    if (mtopResponse.isApiSuccess() && !TextUtils.isEmpty(optString) && "false".equals(optString)) {
                        j();
                        j0u.a("已领取优惠券 可在我的卡券包查看");
                    } else if ("FAIL_BIZ_ACTIVITY_APPLY_PERSON_COUNT_EXCEED".equals(mtopResponse.getRetCode())) {
                        i(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                        j0u.a("抱歉，已领券");
                    } else {
                        i(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                        j0u.a("抱歉，优惠券已领光");
                    }
                }
            }
        } catch (Exception e) {
            jgh.b("ReceiveCouponEvent", "handleReceiveError", e);
            j0u.a("抱歉，优惠券已领光");
        }
    }

    /* renamed from: l */
    public void e(rln rlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f5a675", new Object[]{this, rlnVar});
        } else if (rlnVar == null) {
            jgh.a("ReceiveCouponEvent", "data null");
        } else {
            CouponApplyRequest couponApplyRequest = new CouponApplyRequest();
            couponApplyRequest.benefitSupplier = rlnVar.e;
            couponApplyRequest.benefitId = rlnVar.b;
            couponApplyRequest.benefitQuerySource = rlnVar.c;
            couponApplyRequest.benefitSource = rlnVar.d;
            couponApplyRequest.asac = rlnVar.g;
            couponApplyRequest.benefitStrategyCode = rlnVar.f;
            couponApplyRequest.benefitType = rlnVar.f27459a;
            final RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) couponApplyRequest);
            build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mmad.ability.biz.coupon.ReceiveCouponEvent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ReceiveCouponEvent.g(ReceiveCouponEvent.this).remove(build);
                    ReceiveCouponEvent.h(ReceiveCouponEvent.this, mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    ReceiveCouponEvent.g(ReceiveCouponEvent.this).remove(build);
                    ReceiveCouponEvent.h(ReceiveCouponEvent.this, mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ReceiveCouponEvent.g(ReceiveCouponEvent.this).remove(build);
                    ReceiveCouponEvent.h(ReceiveCouponEvent.this, mtopResponse);
                }
            });
            build.startRequest();
            ((ArrayList) this.c).add(build);
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7b6a10", new Object[]{this, str, str2});
            return;
        }
        try {
            jgh.a("ReceiveCouponEvent", "领券失败：retCode=" + str + ";retMsg=" + str2);
            i4v.u(0, str, str2, this.b);
            c(str, str2);
            nwi nwiVar = this.b;
            String d = d();
            m0j.f(nwiVar, d, str + str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c67153", new Object[]{this});
            return;
        }
        try {
            jgh.a("ReceiveCouponEvent", "领券成功");
            i4v.u(1, "", "", this.b);
            f(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
