package com.ali.user.mobile.verify.model;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CloseBiometricApiRequest implements Serializable {
    public String appKey;
    public String biometricType = "fingerprint";
    public List<BiometricCloseUsers> closeUsers;
    public String requestScene;
    public int site;

    static {
        t2o.a(69206224);
    }
}
