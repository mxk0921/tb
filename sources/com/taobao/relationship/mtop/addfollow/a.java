package com.taobao.relationship.mtop.addfollow;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.mtop.addfollow.AddFollowResponse;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.TBSoundPlayer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
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
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RETCODE_LOGIN_CANCEL = "ANDROID_SYS_LOGIN_CANCEL";

    /* renamed from: a  reason: collision with root package name */
    public final bt9 f11493a;
    public final WVCallBackContext b;
    public final ct9 c;

    static {
        t2o.a(759169049);
        t2o.a(347078666);
    }

    public a(bt9 bt9Var) {
        this.f11493a = bt9Var;
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
        jSONObject.put("option", (Object) Integer.valueOf(rt9Var.e));
        if (!TextUtils.isEmpty(rt9Var.i)) {
            jSONObject.put("extra", (Object) rt9Var.i);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("followData", (Object) jSONObject);
        TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", "execute add follow, params : " + jSONObject.toJSONString());
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("WEITAO_FOLLOW_SDK_ADD_FOLLOW_START");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Page_WEITAO_FOLLOW_SDK");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        ActionService.h hVar = new ActionService.h(null, "native");
        hVar.a(rt9Var);
        ActionService.o().q(gt9.ACTION_SERVICE_ADDFOLLOW, hVar, jSONObject2, this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.g
    public void a(ActionService.h hVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cfc144", new Object[]{this, hVar, obj});
            return;
        }
        try {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", "add follow onSuccess, message : " + obj.toString());
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("WEITAO_FOLLOW_SDK_ADD_FOLLOW_ONSUCESS");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("Page_WEITAO_FOLLOW_SDK");
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            rt9 rt9Var = (rt9) hVar.b;
            AddFollowResponse.AddFollowData addFollowData = (AddFollowResponse.AddFollowData) JSON.parseObject(obj.toString(), AddFollowResponse.AddFollowData.class);
            if (this.f11493a != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                if (!TextUtils.isEmpty(addFollowData.toastMsg)) {
                    hashMap.put("toast", addFollowData.toastMsg);
                }
                if (!TextUtils.isEmpty(addFollowData.followExtra)) {
                    hashMap.put(gt9.PARAMS_MTOP_RESULT_EXTRA, addFollowData.followExtra);
                }
                this.f11493a.onBusSuccess(gt9.MTOP_ADDFOLLOW, rt9Var.b, rt9Var.c, hashMap);
            }
            if (this.b != null) {
                nsw nswVar = new nsw();
                if (!TextUtils.isEmpty(addFollowData.followExtra)) {
                    nswVar.b(gt9.PARAMS_MTOP_RESULT_EXTRA, addFollowData.followExtra);
                }
                if (rt9Var.j) {
                    if (TextUtils.isEmpty(addFollowData.toastMsg)) {
                        rgw.e("关注成功，可以在微淘查看TA的动态啦~");
                    } else {
                        rgw.e(addFollowData.toastMsg);
                    }
                }
                this.b.success(nswVar);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(addFollowData.followExtra)) {
                    jSONObject.put(gt9.PARAMS_MTOP_RESULT_EXTRA, (Object) addFollowData.followExtra);
                }
                if (rt9Var.j) {
                    if (TextUtils.isEmpty(addFollowData.toastMsg)) {
                        rgw.e("关注成功，可以在微淘查看TA的动态啦~");
                    } else {
                        rgw.e(addFollowData.toastMsg);
                    }
                }
                this.c.onResult(tt9.d(jSONObject));
            }
            if (rt9Var != null && rt9Var.d == 3 && rt9Var.f27593a == null && rt9Var.j && !TextUtils.isEmpty(addFollowData.toastMsg)) {
                rgw.e(addFollowData.toastMsg);
            }
            TBSoundPlayer.getInstance().playScene(3);
        } catch (Exception e) {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", e.toString());
            e.printStackTrace();
        }
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
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", "add follow onFail, message : " + iVar.b + " errorcode: " + iVar.f11986a);
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("WEITAO_FOLLOW_SDK_ADD_FOLLOW_ONERROR");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("Page_WEITAO_FOLLOW_SDK");
            uTHitBuilders$UTCustomHitBuilder.setProperty("error_massage", iVar.b + " , " + iVar.f11986a);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            rt9 rt9Var = (rt9) hVar.b;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("errorCode", iVar.f11986a);
            hashMap.put("errorMsg", iVar.b);
            bt9 bt9Var = this.f11493a;
            if (bt9Var != null) {
                bt9Var.onBusFail(gt9.MTOP_ADDFOLLOW, rt9Var.b, rt9Var.c, hashMap);
            }
            if (this.b != null) {
                if (rt9Var.j) {
                    if (TextUtils.isEmpty(iVar.b)) {
                        rgw.e("关注失败");
                    } else {
                        rgw.e(iVar.b);
                    }
                }
                nsw nswVar = new nsw();
                nswVar.b("errorMessage", iVar.b);
                this.b.error(nswVar);
            }
            if (this.c != null) {
                if (rt9Var.j) {
                    if (TextUtils.isEmpty(iVar.b)) {
                        rgw.e("关注失败");
                    } else {
                        rgw.e(iVar.b);
                    }
                }
                this.c.onResult(tt9.b("errorMessage", iVar.b));
            }
        } catch (Exception e) {
            TLog.loge("WEITAO_FOLLOW_SDK", "ADD_FOLLOW", e.toString());
            e.printStackTrace();
        }
    }

    public a(ct9 ct9Var) {
        this.c = ct9Var;
    }
}
