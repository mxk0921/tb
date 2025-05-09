package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.marvel.java.OnFrameCallback;
import com.alibaba.marvel.toolbox.FrameParam;
import com.alibaba.marvel.toolbox.ToolBox;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23948a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ qp6 d;
        public final /* synthetic */ Runnable e;

        /* compiled from: Taobao */
        /* renamed from: tb.mcw$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0994a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f23949a;
            public final /* synthetic */ int b;

            public RunnableC0994a(Bitmap bitmap, int i) {
                this.f23949a = bitmap;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.d.a(this.f23949a, Integer.valueOf(this.b));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.e.run();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements OnFrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FrameParam f23951a;

            /* compiled from: Taobao */
            /* renamed from: tb.mcw$a$c$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0995a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f23952a;
                public final /* synthetic */ Bitmap b;

                public RunnableC0995a(int i, Bitmap bitmap) {
                    this.f23952a = i;
                    this.b = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int i = this.f23952a;
                    a aVar = a.this;
                    if (i < aVar.b) {
                        aVar.d.a(this.b, Integer.valueOf(i));
                    }
                }
            }

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.this.e.run();
                    }
                }
            }

            public c(FrameParam frameParam, int i) {
                this.f23951a = frameParam;
            }

            public void onEnd() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("efc72903", new Object[]{this});
                } else {
                    trt.h(new b());
                }
            }

            public boolean onFrame(ByteBuffer byteBuffer, long j, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("2371addf", new Object[]{this, byteBuffer, new Long(j), new Integer(i)})).booleanValue();
                }
                if (byteBuffer == null) {
                    return false;
                }
                FrameParam frameParam = this.f23951a;
                Bitmap createBitmap = Bitmap.createBitmap(frameParam.imgWidth, frameParam.imgHeight, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(byteBuffer);
                Bitmap a2 = mcw.a(createBitmap, 256);
                if (a2 != null) {
                    createBitmap = a2;
                }
                trt.h(new RunnableC0995a(i, createBitmap));
                return false;
            }
        }

        public a(String str, int i, long j, qp6 qp6Var, Runnable runnable) {
            this.f23948a = str;
            this.b = i;
            this.c = j;
            this.d = qp6Var;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mcw.c(this.f23948a)) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f23948a);
                    while (true) {
                        int i2 = this.b;
                        if (i >= i2) {
                            break;
                        }
                        long j = (i / i2) * ((float) this.c) * 1000;
                        if (Build.VERSION.SDK_INT >= 27) {
                            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, 3, 256, 256);
                        } else {
                            bitmap = mcw.a(mediaMetadataRetriever.getFrameAtTime(j), 256);
                        }
                        trt.h(new RunnableC0994a(bitmap, i));
                        i++;
                    }
                } catch (Throwable unused) {
                }
                mediaMetadataRetriever.release();
                trt.h(new b());
            } else {
                FrameParam frameParam = new FrameParam(this.f23948a);
                frameParam.startTimeUs = 0L;
                long j2 = this.c;
                frameParam.stopTimeUs = j2 * 1000;
                frameParam.fps = 1.0f / (((float) (j2 / 1000)) / this.b);
                frameParam.imgWidth = 256;
                frameParam.imgHeight = 256;
                ToolBox.generateVideoFrame(frameParam, new c(frameParam, 256));
            }
        }
    }

    static {
        t2o.a(511705661);
    }

    public static /* synthetic */ Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cb51da2a", new Object[]{bitmap, new Integer(i)});
        }
        return d(bitmap, i);
    }

    public static void b(String str, long j, int i, qp6<Bitmap, Integer> qp6Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e9f024", new Object[]{str, new Long(j), new Integer(i), qp6Var, runnable});
        } else {
            trt.g(new a(str, i, j, qp6Var, runnable));
        }
    }

    public static Bitmap d(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6bd6d5fd", new Object[]{bitmap, new Integer(i)});
        }
        float max = i / Math.max(bitmap.getWidth(), bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false).copy(Bitmap.Config.RGB_565, false);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37290fa8", new Object[]{str})).booleanValue();
        }
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            int e = e(mediaExtractor);
            if (e < 0) {
                return false;
            }
            mediaExtractor.selectTrack(e);
            return TextUtils.equals(mediaExtractor.getTrackFormat(e).getString("mime"), "video/hevc");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int e(MediaExtractor mediaExtractor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5e708cd", new Object[]{mediaExtractor})).intValue();
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }
}
