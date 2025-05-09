package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.internal.e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class IRunningCoreInfo implements IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface FailedInfo {
        int errorCode();

        UCKnownException exception();

        String reason();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile IRunningCoreInfo sInstance;

        public static final IRunningCoreInfo get() {
            e.a();
            return sInstance;
        }

        public static final void set(IRunningCoreInfo iRunningCoreInfo) {
            sInstance = iRunningCoreInfo;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IntegrationType {
        public static final int NORMAL = 1;
        public static final int THICK = 3;
        public static final int THIN = 2;
        public static final int UNKNOWN = 0;
        public static final int UPDATE = 4;
    }

    public abstract ClassLoader coreClassLoader();

    public abstract ICoreVersion coreVersion();

    public abstract FailedInfo failedInfo();

    public abstract int integrationType();

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract boolean isFirstUsed();

    public abstract boolean isReUsed();

    public abstract String libPath();

    public abstract String path();

    public abstract ClassLoader sdkClassLoader();
}
