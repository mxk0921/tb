package com.alibaba.poplayer.track;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.abd;
import tb.jd0;
import tb.nsu;
import tb.qtv;
import tb.t2o;
import tb.wdm;
import tb.zad;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UserResultTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_RESULT_CANCEL_ACTION = "CancelAction";
    public static final String USER_RESULT_CANCEL_ACTION_OLD = "Cancel";
    public static final String USER_RESULT_CLICK_ACTION = "ClickAction";
    public static final String USER_RESULT_CLICK_ACTION_OLD = "Click";
    public static final String USER_RESULT_EXPOSE = "Expose";
    public static final String USER_RESULT_EXPOSE_REAL = "ExposeReal";
    public static final String USER_RESULT_EXPOSE_STATE = "ExposeState";
    public static final String USER_RESULT_SCENE_ACTION = "SceneAction";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface UserResultAction {
    }

    static {
        t2o.a(625999985);
    }

    public static void a(PopRequest popRequest, String str, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871887c4", new Object[]{popRequest, str, new Boolean(z), jSONObject});
        } else if (popRequest != null && !TextUtils.isEmpty(str)) {
            if (jd0.c().a().isUseNewActionLine()) {
                if (!"Cancel".equals(str) && !"Click".equals(str)) {
                    c(popRequest, str, z, jSONObject);
                    wdm.d("UserResultTrack.new.track.userAction=%s.trackInfo=%s", str, jSONObject);
                }
            } else if ("Expose".equals(str) || "Cancel".equals(str) || "Click".equals(str)) {
                c(popRequest, str, z, jSONObject);
                wdm.d("UserResultTrack.old.track.userAction=%s.trackInfo=%s", str, jSONObject);
            }
        }
    }

    public static void b(a aVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a83ebb", new Object[]{aVar, jSONObject, new Boolean(z)});
            return;
        }
        qtv.p(aVar.k(), z);
        if (aVar.I()) {
            nsu.t("Expose", aVar.d(), aVar.e());
        } else {
            nsu.u(aVar, "Expose", jSONObject);
        }
    }

    public static void c(PopRequest popRequest, String str, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2ad345", new Object[]{popRequest, str, new Boolean(z), jSONObject});
        } else if (!TextUtils.isEmpty(str) && (popRequest instanceof a)) {
            popRequest.k().j0 = str;
            Event M = a.M(popRequest);
            if (M != null) {
                abd processCallBack = M.getProcessCallBack();
                if (processCallBack instanceof zad) {
                    ((zad) processCallBack).d(((a) popRequest).O(), str);
                }
            }
            boolean I = popRequest.I();
            OnePopModule k = popRequest.k();
            if (USER_RESULT_CLICK_ACTION.equals(str) || "Click".equals(str)) {
                qtv.n(k, z);
                if (I) {
                    nsu.t("Click", popRequest.d(), popRequest.e());
                    return;
                }
            } else if (USER_RESULT_CANCEL_ACTION.equals(str) || "Cancel".equals(str)) {
                qtv.o(k, z);
                if (Boolean.parseBoolean(k.C) && I) {
                    nsu.t("Cancel", popRequest.d(), popRequest.e());
                    return;
                }
            }
            if (!I) {
                nsu.u((a) popRequest, str, jSONObject);
            }
        }
    }
}
