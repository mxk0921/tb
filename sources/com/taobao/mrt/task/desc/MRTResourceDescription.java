package com.taobao.mrt.task.desc;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;
import tb.vqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class MRTResourceDescription implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MRTTaskDescription associatedTask;
    public String fmd5;
    public String furl;
    public int resourceMask = MRTResourceNone;
    public String resourceName;
    public vqh resourceOperation;
    public String resourceRootDirectory;
    public String resourceType;
    public String uniqueKey;
    public static int MRTResourceNone = 0;
    public static int MRTResourceModel = 1;
    public static int MRTResourceFiles = 2;
    public static int MRTResourceLibs = 4;

    static {
        t2o.a(577765432);
    }

    public MRTResourceDescription(String str, String str2, MRTTaskDescription mRTTaskDescription) {
        this.furl = str;
        this.fmd5 = str2;
        this.associatedTask = mRTTaskDescription;
        this.uniqueKey = str2;
    }

    public abstract String getValidationMD5();
}
