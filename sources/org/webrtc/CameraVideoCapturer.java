package org.webrtc;

import android.graphics.Bitmap;
import android.media.MediaRecorder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcVideoLayout;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.trtc.api.TrtcVideoLayout;
import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        int onCameraPreview(int i, int i2, int i3, float[] fArr, long j);

        int onCameraPreview(ByteBuffer byteBuffer, AConstants.ColorSpace colorSpace, int i, int i2, int i3, long j);

        void onFirstFrameAvailable();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class CameraStatistics {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 6000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final String TAG = "CameraStatistics";
        private final Runnable cameraObserver;
        private final CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private int preProcessCostCount;
        private long preProcessCostTimeTotal;
        private int preProcessFrameCount;
        private int subFrameCount;
        private final SurfaceTextureHelper surfaceTextureHelper;
        public static int cameraFps = 0;
        public static int preProcessFps = 0;
        public static int preProcessCostTime = 0;
        public static int subCameraFps = 0;

        static {
            t2o.a(395313730);
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    CameraStatistics.cameraFps = Math.round((CameraStatistics.access$000(CameraStatistics.this) * 1000.0f) / 2000.0f);
                    CameraStatistics.preProcessFps = Math.round((CameraStatistics.access$100(CameraStatistics.this) * 1000.0f) / 2000.0f);
                    if (CameraStatistics.access$200(CameraStatistics.this) != 0) {
                        CameraStatistics.preProcessCostTime = Math.round((float) (CameraStatistics.access$300(CameraStatistics.this) / CameraStatistics.access$200(CameraStatistics.this)));
                    }
                    CameraStatistics.subCameraFps = Math.round((CameraStatistics.access$400(CameraStatistics.this) * 1000.0f) / 2000.0f);
                    ArtcLog.d(CameraStatistics.TAG, "PriFps:" + CameraStatistics.cameraFps + "  PriProcFps:" + CameraStatistics.preProcessFps + "  PriProcCostTime:" + CameraStatistics.preProcessCostTime + "ms SubFps:" + CameraStatistics.subCameraFps, new Object[0]);
                    if (CameraStatistics.access$000(CameraStatistics.this) == 0) {
                        CameraStatistics.access$504(CameraStatistics.this);
                        if (CameraStatistics.access$500(CameraStatistics.this) * 2000 >= 6000 && CameraStatistics.access$600(CameraStatistics.this) != null) {
                            Logging.e(CameraStatistics.TAG, "Camera freezed.");
                            if (CameraStatistics.access$700(CameraStatistics.this).isTextureInUse()) {
                                CameraStatistics.access$600(CameraStatistics.this).onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                CameraStatistics.access$600(CameraStatistics.this).onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        CameraStatistics.access$502(CameraStatistics.this, 0);
                    }
                    CameraStatistics.access$002(CameraStatistics.this, 0);
                    CameraStatistics.access$102(CameraStatistics.this, 0);
                    CameraStatistics.access$202(CameraStatistics.this, 0);
                    CameraStatistics.access$302(CameraStatistics.this, 0L);
                    CameraStatistics.access$402(CameraStatistics.this, 0);
                    CameraStatistics.access$700(CameraStatistics.this).getHandler().postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                this.preProcessFrameCount = 0;
                this.preProcessCostCount = 0;
                this.preProcessCostTimeTotal = 0L;
                this.subFrameCount = 0;
                ArtcLog.d(TAG, "start capture thread, cameraObserver: " + runnable, new Object[0]);
                surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }

        public static /* synthetic */ int access$000(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2022897c", new Object[]{cameraStatistics})).intValue();
            }
            return cameraStatistics.frameCount;
        }

        public static /* synthetic */ int access$002(CameraStatistics cameraStatistics, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36d7c50f", new Object[]{cameraStatistics, new Integer(i)})).intValue();
            }
            cameraStatistics.frameCount = i;
            return i;
        }

        public static /* synthetic */ int access$100(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2158dc5b", new Object[]{cameraStatistics})).intValue();
            }
            return cameraStatistics.preProcessFrameCount;
        }

        public static /* synthetic */ int access$102(CameraStatistics cameraStatistics, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c6bce10", new Object[]{cameraStatistics, new Integer(i)})).intValue();
            }
            cameraStatistics.preProcessFrameCount = i;
            return i;
        }

        public static /* synthetic */ int access$200(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("228f2f3a", new Object[]{cameraStatistics})).intValue();
            }
            return cameraStatistics.preProcessCostCount;
        }

        public static /* synthetic */ int access$202(CameraStatistics cameraStatistics, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("81ffd711", new Object[]{cameraStatistics, new Integer(i)})).intValue();
            }
            cameraStatistics.preProcessCostCount = i;
            return i;
        }

        public static /* synthetic */ long access$300(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23c5821a", new Object[]{cameraStatistics})).longValue();
            }
            return cameraStatistics.preProcessCostTimeTotal;
        }

        public static /* synthetic */ long access$302(CameraStatistics cameraStatistics, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a793e3d4", new Object[]{cameraStatistics, new Long(j)})).longValue();
            }
            cameraStatistics.preProcessCostTimeTotal = j;
            return j;
        }

        public static /* synthetic */ int access$400(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("24fbd4f8", new Object[]{cameraStatistics})).intValue();
            }
            return cameraStatistics.subFrameCount;
        }

        public static /* synthetic */ int access$402(CameraStatistics cameraStatistics, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cd27e913", new Object[]{cameraStatistics, new Integer(i)})).intValue();
            }
            cameraStatistics.subFrameCount = i;
            return i;
        }

        public static /* synthetic */ int access$500(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("263227d7", new Object[]{cameraStatistics})).intValue();
            }
            return cameraStatistics.freezePeriodCount;
        }

        public static /* synthetic */ int access$502(CameraStatistics cameraStatistics, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f2bbf214", new Object[]{cameraStatistics, new Integer(i)})).intValue();
            }
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        public static /* synthetic */ int access$504(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ea02253", new Object[]{cameraStatistics})).intValue();
            }
            int i = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        public static /* synthetic */ CameraEventsHandler access$600(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CameraEventsHandler) ipChange.ipc$dispatch("3fc814ef", new Object[]{cameraStatistics});
            }
            return cameraStatistics.eventsHandler;
        }

        public static /* synthetic */ SurfaceTextureHelper access$700(CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SurfaceTextureHelper) ipChange.ipc$dispatch("35aa5180", new Object[]{cameraStatistics});
            }
            return cameraStatistics.surfaceTextureHelper;
        }

        private void checkThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10d94b9", new Object[]{this});
            } else if (Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void addBeautyCostTime(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e187b5e5", new Object[]{this, new Integer(i)});
                return;
            }
            checkThread();
            this.preProcessCostTimeTotal += i;
            this.preProcessCostCount++;
        }

        public void addBeautyFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb95377", new Object[]{this});
                return;
            }
            checkThread();
            this.preProcessFrameCount++;
        }

        public void addFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18337bd3", new Object[]{this});
                return;
            }
            checkThread();
            this.frameCount++;
        }

        public void addSubFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("190dfc55", new Object[]{this});
            } else {
                this.subFrameCount++;
            }
        }

        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            ArtcLog.d(TAG, "stop capture thread, cameraObserver: " + this.cameraObserver, new Object[0]);
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    @Deprecated
    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    int getBrightness();

    boolean isFrontFacing();

    @Deprecated
    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void setBrightness(int i);

    void setNeedMix(boolean z);

    void setVideoLayout(ArtcVideoLayout artcVideoLayout);

    void setVideoLayout(TrtcVideoLayout trtcVideoLayout);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    Bitmap takeSnapshot();
}
