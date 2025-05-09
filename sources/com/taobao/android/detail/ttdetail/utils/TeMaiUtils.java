package com.taobao.android.detail.ttdetail.utils;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import tb.hxj;
import tb.oa4;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TeMaiUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262863);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("517b1f60", new Object[]{str});
        }
        try {
            return JSON.parseObject(str).getJSONObject("param");
        } catch (Throwable th) {
            tgh.c("TeMaiUtils", "getMultiBottomBarData error ", th);
            return null;
        }
    }

    public static boolean b(oa4 oa4Var, String str) {
        JSONObject f;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f8434e3", new Object[]{oa4Var, str})).booleanValue();
        }
        if (oa4Var == null || (f = oa4Var.getComponentData().f()) == null || (a2 = a(str)) == null) {
            return false;
        }
        try {
            f.put("lowPriceInfo", (Object) a2.getJSONObject("fields").getJSONObject("lowPriceInfo"));
            f.put("_detailInfo", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.TeMaiUtils.1
                {
                    put(PreloadTaskEntity.PAGE_TOKEN, (Object) (hxj.UNIQID + SystemClock.currentThreadTimeMillis()));
                }
            });
            oa4Var.updateComponent();
            return true;
        } catch (Throwable th) {
            tgh.c("TeMaiUtils", "update99TmBottomBar error", th);
            return false;
        }
    }
}
