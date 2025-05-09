package com.facebook.yoga;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YogaConfig {
    public static int SPACING_TYPE = 1;
    public static boolean useBatchingForLayoutOutputs = true;
    private YogaLogger mLogger;
    long mNativePointer;
    private YogaNodeCloneFunction mYogaNodeCloneFunction;

    static {
        t2o.a(503316492);
    }

    public YogaConfig() {
        long jni_YGConfigNew = YogaNative.jni_YGConfigNew();
        this.mNativePointer = jni_YGConfigNew;
        if (jni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public void finalize() throws Throwable {
        try {
            YogaNative.jni_YGConfigFree(this.mNativePointer);
        } finally {
            super.finalize();
        }
    }

    public YogaLogger getLogger() {
        return this.mLogger;
    }

    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabled(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        YogaNative.jni_YGConfigSetLogger(this.mNativePointer, yogaLogger);
    }

    public void setPointScaleFactor(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactor(this.mNativePointer, f);
    }

    public void setPrintTreeFlag(boolean z) {
        YogaNative.jni_YGConfigSetPrintTreeFlag(this.mNativePointer, z);
    }

    public void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseWebDefaults(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaults(this.mNativePointer, z);
    }
}
