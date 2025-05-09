package com.taobao.taobao.scancode.gateway.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hvm;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ScancodeController implements hvm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ScanController";
    private hvm currentPreviewController;
    public boolean isFragmentStarted = false;

    static {
        t2o.a(760217736);
        t2o.a(760217732);
    }

    public ScancodeController(hvm hvmVar) {
        this.currentPreviewController = hvmVar;
    }

    @Override // tb.hvm
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        hvm hvmVar = this.currentPreviewController;
        if (hvmVar != null) {
            hvmVar.startPreview();
        }
    }

    @Override // tb.hvm
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            return;
        }
        hvm hvmVar = this.currentPreviewController;
        if (hvmVar != null) {
            hvmVar.stopPreview();
        }
    }
}
