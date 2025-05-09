package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.i21;
import tb.oa7;
import tb.rbn;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TaobaoRSoLinkInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            if (i21.b()) {
                Log.e("RemoteSo", "TaobaoRSoLinkInit, skip, isFullNewInstall");
                TLog.loge("RemoteSo", "RemoteSo", "TaobaoRSoLinkInit, skip, isFullNewInstall");
                return;
            }
            Log.e("RemoteSo", "LinkInit.init(), start");
            TLog.loge("RemoteSo", "RemoteSo", "LinkInit.init(), start");
            oa7.c = true;
            Log.e("RemoteSo", "LinkInit.init(), success");
            TLog.loge("RemoteSo", "RemoteSo", "LinkInit.init(), success");
        } catch (Throwable th) {
            rbn.g("LinkInit.init()  error", th);
        }
    }
}
