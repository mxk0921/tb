package com.taobao.taolivehome.dinamicx.sdk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import tb.d9m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(776994825);
        t2o.a(444598042);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{this, sVar});
        } else {
            d9m.H().previewEngineDidInitialized(sVar);
        }
    }
}
