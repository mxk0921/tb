package com.taobao.android.detail.ttdetail.request.preload;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b5m;
import tb.kpw;
import tb.t2o;
import tb.tgh;
import tb.u4o;
import tb.vbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreloadDetailWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "PreloadDetail";
    private static final String START_PRELOAD = "start_preload_task";
    private static final String TAG = "PreloadPageDetailPlugin";

    static {
        t2o.a(912262201);
    }

    public static /* synthetic */ Object ipc$super(PreloadDetailWVPlugin preloadDetailWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/preload/PreloadDetailWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            tgh.b(TAG, "WVApi action为空");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            tgh.b(TAG, "WVApi params为空");
            return false;
        } else {
            JSONObject M0 = vbl.M0();
            boolean z = !vbl.U0(M0) && vbl.i1(null, M0);
            if (!vbl.h() || !z || ((b5m.H().isI18nEdition() && !vbl.M()) || !START_PRELOAD.equals(str))) {
                return false;
            }
            tgh.b(TAG, "WVApi 发起预加载请求");
            Intent intent = new Intent();
            intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, str2);
            u4o.j(intent);
            return true;
        }
    }
}
