package com.taobao.relationship.mtop.removefollow;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.mtop.removefollow.RemoveFollowResponse;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import java.util.HashMap;
import tb.bt9;
import tb.ct9;
import tb.gt9;
import tb.nsw;
import tb.rgw;
import tb.rt9;
import tb.t2o;
import tb.tt9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements ActionService.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bt9 f11495a;
    public final WVCallBackContext b;
    public final ct9 c;

    static {
        t2o.a(759169060);
        t2o.a(347078666);
    }

    public a(bt9 bt9Var) {
        this.f11495a = bt9Var;
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
            RemoveFollowResponse.RemoveFollowData removeFollowData = (RemoveFollowResponse.RemoveFollowData) JSON.parseObject(obj.toString(), RemoveFollowResponse.RemoveFollowData.class);
            if (this.f11495a != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                if (!TextUtils.isEmpty(removeFollowData.toastMsg)) {
                    hashMap.put("toast", removeFollowData.toastMsg);
                }
                if (!TextUtils.isEmpty(removeFollowData.followExtra)) {
                    hashMap.put(gt9.PARAMS_MTOP_RESULT_EXTRA, removeFollowData.followExtra);
                }
                this.f11495a.onBusSuccess(gt9.MTOP_REMOVEFOLLOW, rt9Var.b, rt9Var.c, hashMap);
            }
            if (this.b != null) {
                nsw nswVar = new nsw();
                if (!TextUtils.isEmpty(removeFollowData.followExtra)) {
                    nswVar.b(gt9.PARAMS_MTOP_RESULT_EXTRA, removeFollowData.followExtra);
                }
                if (rt9Var.j) {
                    if (TextUtils.isEmpty(removeFollowData.toastMsg)) {
                        rgw.e("已取消关注");
                    } else {
                        rgw.e(removeFollowData.toastMsg);
                    }
                }
                this.b.success(nswVar);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(removeFollowData.followExtra)) {
                    jSONObject.put(gt9.PARAMS_MTOP_RESULT_EXTRA, (Object) removeFollowData.followExtra);
                }
                if (rt9Var.j) {
                    if (TextUtils.isEmpty(removeFollowData.toastMsg)) {
                        rgw.e("已取消关注");
                    } else {
                        rgw.e(removeFollowData.toastMsg);
                    }
                }
                this.c.onResult(tt9.d(jSONObject));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c(rt9 rt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bd74c0", new Object[]{this, rt9Var});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("followedId", (Object) Long.valueOf(rt9Var.b));
        jSONObject.put("accountType", (Object) Integer.valueOf(rt9Var.c));
        jSONObject.put("originBiz", (Object) rt9Var.f);
        jSONObject.put("originPage", (Object) rt9Var.g);
        jSONObject.put("originFlag", (Object) rt9Var.h);
        jSONObject.put("type", (Object) Integer.valueOf(rt9Var.d));
        if (!TextUtils.isEmpty(rt9Var.i)) {
            jSONObject.put("extra", (Object) rt9Var.i);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("followData", (Object) jSONObject);
        ActionService.h hVar = new ActionService.h(null, "native");
        hVar.a(rt9Var);
        ActionService.o().q(gt9.ACTION_SERVICE_REMOVEFOLLOW, hVar, jSONObject2, this);
    }

    public a(WVCallBackContext wVCallBackContext) {
        this.b = wVCallBackContext;
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
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", iVar.f11986a);
            hashMap.put("errorMsg", iVar.b);
            if (this.b != null) {
                if (rt9Var.j) {
                    rgw.e("取消关注失败");
                }
                nsw nswVar = new nsw();
                nswVar.b("errorMessage", iVar.b);
                this.b.error(nswVar);
            }
            if (this.c != null) {
                if (rt9Var.j) {
                    rgw.e("取消关注失败");
                }
                this.c.onResult(tt9.b("errorMessage", iVar.b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public a(ct9 ct9Var) {
        this.c = ct9Var;
    }
}
