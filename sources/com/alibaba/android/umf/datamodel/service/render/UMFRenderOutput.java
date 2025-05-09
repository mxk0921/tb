package com.alibaba.android.umf.datamodel.service.render;

import android.view.View;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFRenderOutput extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, View> mViews;

    static {
        t2o.a(80740678);
    }

    public static /* synthetic */ Object ipc$super(UMFRenderOutput uMFRenderOutput, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/service/render/UMFRenderOutput");
    }

    public Map<String, View> getViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea59a134", new Object[]{this});
        }
        return this.mViews;
    }

    public void setViews(Map<String, View> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868f572", new Object[]{this, map});
        } else {
            this.mViews = map;
        }
    }
}
