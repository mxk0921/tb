package org.webrtc;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.Logging;
import tb.amu;
import tb.eal;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PeerConnectionFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class InitializationOptions {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Context applicationContext;
        public final boolean enableInternalTracer;
        public final boolean enableVideoHwAcceleration;
        public final String fieldTrials;
        public Loggable loggable;
        public Logging.Severity loggableSeverity;
        public final NativeLibraryLoader nativeLibraryLoader;
        public final String nativeLibraryName;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Context applicationContext;
            private String fieldTrials = "";
            private boolean enableInternalTracer = false;
            private boolean enableVideoHwAcceleration = true;
            private NativeLibraryLoader nativeLibraryLoader = amu.h();
            private String nativeLibraryName = "artc_engine";
            private Loggable loggable = null;
            private Logging.Severity loggableSeverity = null;

            static {
                t2o.a(395313795);
            }

            public Builder(Context context) {
                this.applicationContext = context;
            }

            public InitializationOptions createInitializationOptions() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (InitializationOptions) ipChange.ipc$dispatch("8fdb392f", new Object[]{this});
                }
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.enableVideoHwAcceleration, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity);
            }

            public Builder setNativeLibraryName(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("f3bafc83", new Object[]{this, str});
                }
                this.nativeLibraryName = str;
                return this;
            }
        }

        static {
            t2o.a(395313794);
        }

        public static Builder builder(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ccbabbfb", new Object[]{context});
            }
            return new Builder(context);
        }

        private InitializationOptions(Context context, String str, boolean z, boolean z2, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.enableVideoHwAcceleration = z2;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }
    }

    static {
        t2o.a(395313792);
    }

    public static void initialize(InitializationOptions initializationOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede8f199", new Object[]{initializationOptions});
            return;
        }
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        if (NativeLibrary.isLoaded()) {
            try {
                nativeInitializeAndroidGlobals();
            } catch (Throwable th) {
                TrtcLog.i(eal.TAG, "native load error, " + th.getMessage());
            }
        }
    }

    private static native void nativeInitializeAndroidGlobals();
}
