package com.taobao.relationship.mtop.isfollow;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.mtop.isfollow.FollowDetailResponse;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import java.util.HashMap;
import tb.au9;
import tb.bt9;
import tb.ct9;
import tb.gt9;
import tb.nsw;
import tb.rt9;
import tb.t2o;
import tb.tt9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements ActionService.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bt9 f11494a;
    public final WVCallBackContext b;
    public final ct9 c;

    static {
        t2o.a(759169059);
        t2o.a(347078666);
    }

    public a(bt9 bt9Var) {
        this.f11494a = bt9Var;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.g
    public void a(ActionService.h hVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cfc144", new Object[]{this, hVar, obj});
            return;
        }
        try {
            rt9 rt9Var = (rt9) hVar.b;
            FollowDetailResponse.FollowDetail followDetail = (FollowDetailResponse.FollowDetail) JSON.parseObject(obj.toString(), FollowDetailResponse.FollowDetail.class);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(gt9.PARAMS_MTOP_RESULT_ISFOLLOW, Boolean.valueOf(followDetail.follow));
            hashMap.put(gt9.PARAMS_MTOP_RESULT_EXTRA, followDetail.followExtra);
            bt9 bt9Var = this.f11494a;
            if (bt9Var != null) {
                bt9Var.onBusSuccess(gt9.MTOP_ISFOLLOW, rt9Var.b, rt9Var.c, hashMap);
            }
            if (this.b != null) {
                nsw nswVar = new nsw();
                if (!TextUtils.isEmpty(followDetail.followExtra)) {
                    nswVar.b(gt9.PARAMS_MTOP_RESULT_EXTRA, followDetail.followExtra);
                }
                if (followDetail.follow) {
                    nswVar.b("followState", "true");
                    this.b.success(nswVar);
                } else {
                    nswVar.b("followState", "false");
                    this.b.success(nswVar);
                }
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(followDetail.followExtra)) {
                    jSONObject.put(gt9.PARAMS_MTOP_RESULT_EXTRA, (Object) followDetail.followExtra);
                }
                if (followDetail.follow) {
                    jSONObject.put("followState", (Object) "1");
                } else {
                    jSONObject.put("followState", (Object) "0");
                }
                this.c.onResult(tt9.d(jSONObject));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.g
    public void b(ActionService.h hVar, ActionService.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7f270b", new Object[]{this, hVar, iVar});
            return;
        }
        try {
            rt9 rt9Var = (rt9) hVar.b;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("errorCode", iVar.f11986a);
            hashMap.put("errorMsg", iVar.b);
            bt9 bt9Var = this.f11494a;
            if (bt9Var != null) {
                bt9Var.onBusFail(gt9.MTOP_ISFOLLOW, rt9Var.b, rt9Var.c, hashMap);
            }
            if (this.b != null) {
                nsw nswVar = new nsw();
                nswVar.b("errorMessage", iVar.b);
                this.b.error(nswVar);
            }
            ct9 ct9Var = this.c;
            if (ct9Var != null) {
                ct9Var.onResult(tt9.b("errorMessage", iVar.b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void d(rt9 rt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bd74c0", new Object[]{this, rt9Var});
        } else if (au9.e()) {
            c(rt9Var.b, rt9Var.c);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("followedId", (Object) Long.valueOf(rt9Var.b));
            jSONObject.put("accountType", (Object) Integer.valueOf(rt9Var.c));
            jSONObject.put("type", (Object) Integer.valueOf(rt9Var.d));
            if (!TextUtils.isEmpty(rt9Var.i)) {
                jSONObject.put("extra", (Object) rt9Var.i);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("followData", (Object) jSONObject);
            ActionService.h hVar = new ActionService.h(null, "native");
            hVar.a(rt9Var);
            ActionService.o().q(gt9.ACTION_SERVICE_ISFOLLOW, hVar, jSONObject2, this);
        }
    }

    public a(WVCallBackContext wVCallBackContext) {
        this.b = wVCallBackContext;
    }

    public final void c(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9975c71", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        if (this.f11494a != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(gt9.PARAMS_MTOP_RESULT_ISFOLLOW, Boolean.FALSE);
            this.f11494a.onBusSuccess(gt9.MTOP_ISFOLLOW, j, i, hashMap);
        }
        if (this.b != null) {
            nsw nswVar = new nsw();
            nswVar.b("followState", "false");
            this.b.success(nswVar);
        }
        ct9 ct9Var = this.c;
        if (ct9Var != null) {
            ct9Var.onResult(tt9.c("followState", "0"));
        }
    }

    public a(ct9 ct9Var) {
        this.c = ct9Var;
    }
}
