package com.alibaba.wireless.aliprivacyext;

import android.app.Application;
import com.alibaba.wireless.aliprivacyext.recommendation.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AliPrivacyInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else {
            c.R().P();
        }
    }
}
