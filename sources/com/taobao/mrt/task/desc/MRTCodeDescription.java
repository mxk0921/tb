package com.taobao.mrt.task.desc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.mqh;
import tb.t2o;
import tb.zph;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRTCodeDescription extends MRTResourceDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mmd5;

    static {
        t2o.a(577765429);
    }

    public MRTCodeDescription(String str, String str2, String str3, MRTTaskDescription mRTTaskDescription) {
        super(str, str3, mRTTaskDescription);
        this.mmd5 = str2;
        this.uniqueKey = str2;
        this.resourceRootDirectory = mqh.b;
        this.resourceName = this.associatedTask.name;
        this.resourceMask = MRTResourceDescription.MRTResourceModel;
        this.resourceOperation = new zph(this);
        this.resourceType = "model";
    }

    public static /* synthetic */ Object ipc$super(MRTCodeDescription mRTCodeDescription, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/task/desc/MRTCodeDescription");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MRTCodeDescription mRTCodeDescription = (MRTCodeDescription) obj;
        if (!Objects.equals(this.resourceName, mRTCodeDescription.resourceName) || !Objects.equals(this.furl, mRTCodeDescription.furl) || !Objects.equals(this.fmd5, mRTCodeDescription.fmd5)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.mrt.task.desc.MRTResourceDescription
    public String getValidationMD5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d738e3aa", new Object[]{this});
        }
        return this.mmd5;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.resourceName, this.furl, this.fmd5);
    }
}
