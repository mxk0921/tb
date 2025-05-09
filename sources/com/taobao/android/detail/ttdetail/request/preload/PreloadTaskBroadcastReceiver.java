package com.taobao.android.detail.ttdetail.request.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b5m;
import tb.t2o;
import tb.tgh;
import tb.u4o;
import tb.vbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreloadTaskBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String START_PRELOAD_TASKS = "startPreloadTasks";

    static {
        t2o.a(912262205);
    }

    public static /* synthetic */ Object ipc$super(PreloadTaskBroadcastReceiver preloadTaskBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/request/preload/PreloadTaskBroadcastReceiver");
    }

    public final boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c94c830", new Object[]{this, context, intent})).booleanValue();
        }
        if (context == null) {
            tgh.b("PreloadTaskBroadcastReceiver", "参数context为空");
            return false;
        } else if (intent != null) {
            return "com.taobao.android.detail.StartPreloadTasks".equals(intent.getAction());
        } else {
            tgh.b("PreloadTaskBroadcastReceiver", "参数Intent为空");
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            JSONObject M0 = vbl.M0();
            if (vbl.U0(M0) || !vbl.i1(null, M0)) {
                z = false;
            }
            if (vbl.h() && z) {
                if (b5m.H().isI18nEdition() && !vbl.M()) {
                    return;
                }
                if (!a(context, intent)) {
                    tgh.b("PreloadTaskBroadcastReceiver", "intent参数合法校验");
                } else if (!TextUtils.isEmpty(intent.getStringExtra(START_PRELOAD_TASKS))) {
                    tgh.b("PreloadTaskBroadcastReceiver", "开始发送预加载请求");
                    u4o.j(intent);
                }
            }
        } catch (Exception e) {
            tgh.c("PreloadTaskBroadcastReceiver", "预加载逻辑接收处理异常", e);
        }
    }
}
