package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import tb.b79;
import tb.bzn;
import tb.oa7;
import tb.rbn;
import tb.y69;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TaobaoRSoBootFinishInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else {
                RSoLog.d("TaobaoRSoBootFinishInit fetchAsync kernel uc finished");
            }
        }
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            RSoLog.d("BootFinishInit.init(), start");
            oa7.d = true;
            bzn.b().b("kernelu4_7z_uc", new a());
            RSoLog.d("BootFinishInit.init(), done");
        } catch (Throwable th) {
            rbn.g("BootFinishInit.init()  error", th);
        }
    }
}
