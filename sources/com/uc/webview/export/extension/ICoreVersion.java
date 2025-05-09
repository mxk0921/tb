package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ICoreVersion implements IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile ICoreVersion sInstance;

        public static final ICoreVersion get() {
            return sInstance;
        }

        public static final void set(ICoreVersion iCoreVersion) {
            if (sInstance == null) {
                sInstance = iCoreVersion;
            }
        }
    }

    public abstract int apiLevel();

    public abstract String buildTimestamp();

    public String chromeVersion() {
        Object invoke = invoke(1992344604, null);
        if (invoke instanceof String) {
            return (String) invoke;
        }
        return "";
    }

    public abstract String cpuArch();

    public int getCoreFeature() {
        Object invoke = invoke(1, null);
        if (invoke instanceof Integer) {
            return ((Integer) invoke).intValue();
        }
        return 0;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public boolean isChromeExtensionSupported() {
        return isCoreFeatureSupported(2);
    }

    public boolean isCoreFeatureSupported(int i) {
        if (i == (getCoreFeature() & i)) {
            return true;
        }
        return false;
    }

    public boolean isFullCapacitySupported() {
        return isCoreFeatureSupported(1);
    }

    public abstract String lastCommitAuthor();

    public abstract String lastCommitRevision();

    public abstract String minSupportVersion();

    public abstract boolean supportInspector();

    public String toString() {
        return version() + "." + buildTimestamp();
    }

    public abstract String version();
}
