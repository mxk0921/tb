package org.webrtc;

import android.content.Context;
import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.VideoCapturer;
import tb.f7l;
import tb.lju;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileVideoCapturer implements VideoCapturer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileVideoCapturer";
    private VideoCapturer.CapturerObserver capturerObserver;
    private final VideoReader videoReader;
    private final Timer timer = new Timer("trtcTimer");
    private final TimerTask tickTask = new TimerTask() { // from class: org.webrtc.FileVideoCapturer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/FileVideoCapturer$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FileVideoCapturer.this.tick();
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class VideoReaderY4M implements VideoReader {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;

        static {
            t2o.a(395313764);
            t2o.a(395313763);
        }

        public VideoReaderY4M(String str) throws IOException {
            String[] split;
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = this.mediaFile.read();
                if (read == -1) {
                    throw new RuntimeException("Found end of file before end of header for file: " + str);
                } else if (read == 10) {
                    this.videoStart = this.mediaFileChannel.position();
                    String str2 = "";
                    int i = 0;
                    int i2 = 0;
                    for (String str3 : sb.toString().split("[ ]")) {
                        char charAt = str3.charAt(0);
                        if (charAt == 'C') {
                            str2 = str3.substring(1);
                        } else if (charAt == 'H') {
                            i2 = Integer.parseInt(str3.substring(1));
                        } else if (charAt == 'W') {
                            i = Integer.parseInt(str3.substring(1));
                        }
                    }
                    Logging.d(TAG, "Color space: " + str2);
                    if (!str2.equals("420") && !str2.equals("420mpeg2") && !str2.equals("420jpeg")) {
                        throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    } else if (i % 2 == 1 || i2 % 2 == 1) {
                        throw new IllegalArgumentException("Does not support odd width or height");
                    } else {
                        this.frameWidth = i;
                        this.frameHeight = i2;
                        Logging.d(TAG, "frame dim: (" + i + ", " + i2 + f7l.BRACKET_END_STR);
                        return;
                    }
                } else {
                    sb.append((char) read);
                }
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            try {
                this.mediaFile.close();
            } catch (IOException e) {
                Logging.e(TAG, "Problem closing file", e);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public VideoFrame getNextFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoFrame) ipChange.ipc$dispatch("ecf00073", new Object[]{this});
            }
            long rtcTimeNanos = TimestampAligner.getRtcTimeNanos();
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            allocate.getStrideY();
            allocate.getStrideU();
            allocate.getStrideV();
            try {
                int i = FRAME_DELIMETER_LENGTH;
                ByteBuffer allocate2 = ByteBuffer.allocate(i);
                if (this.mediaFileChannel.read(allocate2) < i) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < i) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(allocate2.array(), Charset.forName(EncodingUtils.US_ASCII));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(allocate, 0, rtcTimeNanos);
                }
                throw new RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        t2o.a(395313761);
        t2o.a(395313839);
    }

    public FileVideoCapturer(String str) throws IOException {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e) {
            Logging.d(TAG, "Could not open video file: " + str);
            throw e;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03670f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.videoReader.close();
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableBeautyProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92077f9d", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableShapeProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1558f91c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2bf1fa", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        } else {
            this.capturerObserver = capturerObserver;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db66480", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void onVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e83fa40", new Object[]{this, videoFrame});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void resetCapturerObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df0458", new Object[]{this});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBeautyParam(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c267736", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBlack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee5c90", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setDummyRender(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ed1b87", new Object[]{this, ljuVar});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd578fb5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubCapturerObserver(CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad1ce1", new Object[]{this, capturerObserver});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubDummyRender(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ceb6eb", new Object[]{this, ljuVar});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setVideoContentMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3c05ae", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95964b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.timer.schedule(this.tickTask, 0L, 1000 / i3);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
        } else {
            this.timer.cancel();
        }
    }

    public void tick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735fbfa4", new Object[]{this});
            return;
        }
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a2077", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        } else {
            initialize(surfaceTextureHelper, context, (VideoCapturer.CapturerObserver) capturerObserver);
        }
    }
}
