package com.taobao.mrt.task.desc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mqh;
import tb.sqh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRTPythonLibDescription extends MRTResourceDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mmd5;
    public String name;

    static {
        t2o.a(577765431);
    }

    public MRTPythonLibDescription(String str, String str2, String str3, String str4, MRTTaskDescription mRTTaskDescription) {
        super(str3, str4, mRTTaskDescription);
        this.name = str;
        this.mmd5 = str2;
        this.uniqueKey = str2;
        this.resourceRootDirectory = mqh.f24232a;
        this.resourceName = str;
        this.resourceOperation = new sqh(this);
    }

    public static /* synthetic */ Object ipc$super(MRTPythonLibDescription mRTPythonLibDescription, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/task/desc/MRTPythonLibDescription");
    }

    @Override // com.taobao.mrt.task.desc.MRTResourceDescription
    public String getValidationMD5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d738e3aa", new Object[]{this});
        }
        return this.mmd5;
    }
}
