package com.taobao.mytaobao.pop.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.nsw;
import tb.qsh;
import tb.t2o;
import tb.trf;
import tb.voc;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBMyTaobaoPopWVApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_GET_ICON_POSITION_V2 = "getPopIconInfoV2";
    public static final String K_LOCAL_POP_ICON_V2 = "localPopIconV2";
    public static final String TAG = "TBMyTaobaoPopWVApiPlugin";
    private static voc mIconPositionListener;

    static {
        t2o.a(745538011);
    }

    private void getIconLocalInfo(String str, WVCallBackContext wVCallBackContext) {
        voc vocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b105958", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        if (str == null || (vocVar = mIconPositionListener) == null) {
            nswVar.j("params || IconPositionListener is null!");
            wVCallBackContext.onFailure(nswVar);
            return;
        }
        nswVar.h(trf.a((JSONObject) JSON.toJSON(((qsh) vocVar).a(str))));
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(TBMyTaobaoPopWVApiPlugin tBMyTaobaoPopWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pop/bridge/TBMyTaobaoPopWVApiPlugin");
    }

    private void localPopIcon(String str, WVCallBackContext wVCallBackContext) {
        voc vocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48cd0d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        if (str == null || (vocVar = mIconPositionListener) == null) {
            nswVar.j("params || IconPositionListener is null!");
            wVCallBackContext.onFailure(nswVar);
            return;
        }
        ((qsh) vocVar).b(str);
        nswVar.l();
    }

    public static void registerMTBIconPositionListener(voc vocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b960c9", new Object[]{vocVar});
        } else {
            mIconPositionListener = vocVar;
        }
    }

    public static void unregisterMTBIconPositionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa1b5fc", new Object[0]);
        } else {
            mIconPositionListener = null;
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && wVCallBackContext != null) {
            if (K_GET_ICON_POSITION_V2.equals(str)) {
                getIconLocalInfo(str2, wVCallBackContext);
            } else if (K_LOCAL_POP_ICON_V2.equals(str)) {
                localPopIcon(str2, wVCallBackContext);
            }
        }
        return false;
    }
}
