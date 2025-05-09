package com.alibaba.android.aura.datamodel.render;

import android.view.View;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARenderOutput extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)
    private View mView;

    static {
        t2o.a(80740408);
    }

    public static /* synthetic */ Object ipc$super(AURARenderOutput aURARenderOutput, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/datamodel/render/AURARenderOutput");
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mView;
    }

    public void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else {
            this.mView = view;
        }
    }
}
