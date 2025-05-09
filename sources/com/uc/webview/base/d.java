package com.uc.webview.base;

import com.uc.webview.base.SdkGlobalSettings;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d {
    protected static final String TAG = "GlobalSettings";
    protected static final AtomicReference<SdkGlobalSettings.Interface> sImpl;
    private static final SdkGlobalSettings.Interface sSdkImpl;

    static {
        e eVar = new e();
        sSdkImpl = eVar;
        sImpl = new AtomicReference<>(eVar);
    }

    public static SdkGlobalSettings.Interface switchToCore(SdkGlobalSettings.Interface r4) {
        AtomicReference<SdkGlobalSettings.Interface> atomicReference = sImpl;
        if (atomicReference.get() != sSdkImpl) {
            Log.i(TAG, "sdk switch to core(U4Patch warmup mode)");
            return atomicReference.get();
        }
        Log.d(TAG, "sdk switch to core");
        return atomicReference.getAndSet(r4);
    }
}
