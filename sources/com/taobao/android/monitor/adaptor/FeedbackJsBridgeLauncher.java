package com.taobao.android.monitor.adaptor;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.fsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FeedbackJsBridgeLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            fsw.i(FeedbackJsBridge.CLASS_FEEDBACK, FeedbackJsBridge.class, false);
        }
    }
}
