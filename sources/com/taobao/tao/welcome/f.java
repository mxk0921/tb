package com.taobao.tao.welcome;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_GENERAL = "general";
    public static final String TYPE_LAUNCH = "launch";

    static {
        t2o.a(734003242);
    }

    public static e a(String str, Activity activity, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("45c35f88", new Object[]{str, activity, dVar});
        }
        if (TextUtils.equals("launch", str)) {
            return new b(activity, dVar);
        }
        return new d(activity, dVar);
    }
}
