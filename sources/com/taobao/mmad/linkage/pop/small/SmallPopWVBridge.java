package com.taobao.mmad.linkage.pop.small;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import tb.fsw;
import tb.jgh;
import tb.kpw;
import tb.nsw;
import tb.rr6;
import tb.t2o;
import tb.usg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SmallPopWVBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_NAME = "getPopLinkedData";
    private static final String BIZ_NAME = "com.taobao.tao.TBMainActivity";
    private static final String MODULE_NAME = "BootImageWVBridge";
    private static final String POINT_NAME_WVBRIDGE = "wvbridge";
    private static final String TAG = "SmallPopWVBridge";

    static {
        t2o.a(573571169);
    }

    public static /* synthetic */ Object ipc$super(SmallPopWVBridge smallPopWVBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/linkage/pop/small/SmallPopWVBridge");
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            fsw.h(MODULE_NAME, SmallPopWVBridge.class);
        }
    }

    private void result(WVCallBackContext wVCallBackContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785497af", new Object[]{this, wVCallBackContext, jSONObject});
            return;
        }
        nsw nswVar = new nsw();
        if (jSONObject == null) {
            nswVar.j("HY_FAILED");
            wVCallBackContext.error(nswVar);
            return;
        }
        nswVar.j("HY_SUCCESS");
        nswVar.h(new org.json.JSONObject(jSONObject));
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            jgh.a(TAG, "callback == null, action = " + str);
            return false;
        } else if (!TextUtils.equals(ACTION_NAME, str)) {
            jgh.a(TAG, "unknown action, action = " + str);
            return false;
        } else {
            LinkedSplashData f = usg.d().b().f();
            if (f == null) {
                jgh.a(TAG, "currentSplashData == null, action = " + str);
                result(wVCallBackContext, null);
                return true;
            }
            JSONObject linkedData = f.getLinkedData(rr6.TYPE_POPVIEW);
            if (linkedData == null || linkedData.isEmpty()) {
                jgh.a(TAG, "popViewJsonObj is empty, action = " + str);
                result(wVCallBackContext, null);
                return true;
            }
            jgh.a(TAG, "return result, action = " + str + ", popViewJsonObj = " + linkedData.toJSONString());
            result(wVCallBackContext, linkedData);
            return true;
        }
    }
}
