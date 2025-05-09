package com.ap.zoloz.hummer.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseWebService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366828);
    }

    public abstract void exitPage(String str);

    public abstract void exitSession();

    public abstract boolean isPageAlreadyExisted(String str);

    public abstract void openPage(HashMap<String, Object> hashMap);
}
