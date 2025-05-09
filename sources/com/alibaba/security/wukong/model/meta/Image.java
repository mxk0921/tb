package com.alibaba.security.wukong.model.meta;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class Image extends BaseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Image(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(Image image, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/meta/Image");
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "image";
    }
}
