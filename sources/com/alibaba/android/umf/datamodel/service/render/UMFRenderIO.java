package com.alibaba.android.umf.datamodel.service.render;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;
import tb.zwu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFRenderIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final zwu mDirtyMap;
    private final List<AURARenderComponent> mRenderTreeList;

    static {
        t2o.a(80740677);
    }

    @Deprecated
    public UMFRenderIO(List<AURARenderComponent> list, zwu zwuVar) {
        this.mRenderTreeList = list;
        this.mDirtyMap = zwuVar;
    }

    public static /* synthetic */ Object ipc$super(UMFRenderIO uMFRenderIO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/service/render/UMFRenderIO");
    }

    @Deprecated
    public zwu getDirtyMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwu) ipChange.ipc$dispatch("96abd166", new Object[]{this});
        }
        return this.mDirtyMap;
    }

    @Deprecated
    public List<AURARenderComponent> getRenderTreeList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("835dabd8", new Object[]{this});
        }
        List<AURARenderComponent> list = this.mRenderTreeList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }
}
