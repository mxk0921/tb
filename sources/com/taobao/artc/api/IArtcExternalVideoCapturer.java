package com.taobao.artc.api;

import android.view.Surface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface IArtcExternalVideoCapturer {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum CapturerType {
        PRI,
        SUB;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CapturerType capturerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/IArtcExternalVideoCapturer$CapturerType");
        }

        public static CapturerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CapturerType) ipChange.ipc$dispatch("f3bb3664", new Object[]{str});
            }
            return (CapturerType) Enum.valueOf(CapturerType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class FrameInfo {
        public int preCostMs;

        static {
            t2o.a(395313197);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum MixMode {
        NONE,
        NEED_MIX,
        NEED_SCALE,
        NEED_MIX_SCALE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MixMode mixMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/IArtcExternalVideoCapturer$MixMode");
        }

        public static MixMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MixMode) ipChange.ipc$dispatch("69cbefed", new Object[]{str});
            }
            return (MixMode) Enum.valueOf(MixMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface Observer {
        void onExternalVideoCaptureInitialized();

        void onExternalVideoCaptureMixMode(MixMode mixMode);

        void onExternalVideoCaptureStarted();

        void onExternalVideoCaptureStopped();
    }

    Surface getSurface(CapturerType capturerType);

    void setObserver(CapturerType capturerType, Observer observer);

    void setVideoSize(CapturerType capturerType, int i, int i2);

    void updateFrameInfo(CapturerType capturerType, FrameInfo frameInfo);
}
