package com.taobao.message.lab.comfrm.render;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RenderResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RenderError error;

    static {
        t2o.a(537919753);
    }

    public RenderResult(RenderError renderError) {
        this.error = renderError;
    }

    public RenderError getError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderError) ipChange.ipc$dispatch("19dc30a1", new Object[]{this});
        }
        return this.error;
    }

    public boolean hasError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        if (this.error != null) {
            return true;
        }
        return false;
    }

    public RenderResult() {
    }
}
