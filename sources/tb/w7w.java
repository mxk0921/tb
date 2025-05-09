package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Surface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import tb.khs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w7w extends AsyncTask<String, Bitmap, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c07 f30510a;
    public final khs.a b;
    public final long[] c;
    public long d;
    public final int f;
    public int j;
    public int e = 1;
    public MediaExtractor g = null;
    public MediaCodec h = null;
    public boolean i = false;
    public int k = 0;

    static {
        t2o.a(511705225);
    }

    public w7w(c07 c07Var, long[] jArr, int i, khs.a aVar) {
        this.f30510a = c07Var;
        this.b = aVar;
        this.f = i;
        this.c = jArr;
        this.d = jArr[0];
    }

    public static int d(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcd1c67", new Object[]{new Integer(i)})).intValue();
        }
        while (i >= Math.pow(2.0d, i2)) {
            i2++;
        }
        return (int) Math.pow(2.0d, i2 - 1);
    }

    public static boolean f(int i, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7b46afe", new Object[]{new Integer(i), codecCapabilities})).booleanValue();
        }
        for (int i2 : codecCapabilities.colorFormats) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Image image) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec910c48", new Object[]{image})).booleanValue();
        }
        int format = image.getFormat();
        if (format == 17 || format == 35 || format == 842094169) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(w7w w7wVar, String str, Object... objArr) {
        if (str.hashCode() == 1050423957) {
            super.onProgressUpdate((Object[]) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/comprehension/video/VideoFrameOnThumbnail");
    }

    public final void a(Image image, int i) {
        Rect cropRect;
        Throwable e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37a04e5", new Object[]{this, image, new Integer(i)});
        } else if (image != null && (cropRect = image.getCropRect()) != null && cropRect.width() > 0 && cropRect.height() > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                YuvImage yuvImage = new YuvImage(e(image, 2), 17, cropRect.width(), cropRect.height(), null);
                int width = cropRect.width();
                int height = cropRect.height();
                yuvImage.compressToJpeg(cropRect, 80, byteArrayOutputStream);
                int max = Math.max(1, Math.min(width / i, height / i));
                if (max > 1) {
                    max = d(max);
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inSampleSize = max;
                publishProgress(i(BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size(), options), i));
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                e = e2;
                Log.e("FrameTask", "", e);
            } catch (OutOfMemoryError e3) {
                e = e3;
                Log.e("FrameTask", "", e);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:37|6|(6:8|(1:10)|17|18|(1:20)(1:21)|22))|24|35|25|(1:27)|30|(1:32)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        android.util.Log.e("FrameTask", "", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: IllegalStateException -> 0x00a4, TryCatch #0 {IllegalStateException -> 0x00a4, blocks: (B:25:0x009a, B:27:0x009e, B:30:0x00a6, B:32:0x00aa), top: B:35:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: IllegalStateException -> 0x00a4, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x00a4, blocks: (B:25:0x009a, B:27:0x009e, B:30:0x00a6, B:32:0x00aa), top: B:35:0x009a }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean doInBackground(java.lang.String... r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "FrameTask"
            java.lang.String r2 = "rotation-degrees"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.w7w.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r0 = "523c617"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r0, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            return r6
        L_0x001f:
            android.media.MediaExtractor r6 = new android.media.MediaExtractor     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r6.<init>()     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r5.g = r6     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            tb.c07 r3 = r5.f30510a     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            tb.oei.a(r6, r3)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaExtractor r6 = r5.g     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            int r6 = j(r6)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            if (r6 < 0) goto L_0x0099
            android.media.MediaExtractor r3 = r5.g     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r3.selectTrack(r6)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaExtractor r3 = r5.g     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaFormat r6 = r3.getTrackFormat(r6)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            java.lang.String r3 = "mime"
            java.lang.String r3 = r6.getString(r3)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            boolean r4 = r6.containsKey(r2)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            if (r4 == 0) goto L_0x0058
            int r2 = r6.getInteger(r2)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r5.j = r2     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            goto L_0x0058
        L_0x0052:
            r6 = move-exception
            goto L_0x0096
        L_0x0054:
            r6 = move-exception
            goto L_0x0096
        L_0x0056:
            r6 = move-exception
            goto L_0x0096
        L_0x0058:
            android.media.MediaCodec r2 = android.media.MediaCodec.createDecoderByType(r3)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r5.h = r2     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaCodecInfo r2 = r2.getCodecInfo()     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.getCapabilitiesForType(r3)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            k(r2)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaCodec r2 = r5.h     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaCodecInfo r2 = r2.getCodecInfo()     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.getCapabilitiesForType(r3)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r3 = 2135033992(0x7f420888, float:2.5791453E38)
            boolean r2 = f(r3, r2)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            java.lang.String r4 = "color-format"
            if (r2 == 0) goto L_0x0082
            r6.setInteger(r4, r3)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            goto L_0x0087
        L_0x0082:
            r2 = 19
            r6.setInteger(r4, r2)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
        L_0x0087:
            android.media.MediaCodec r2 = r5.h     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaExtractor r3 = r5.g     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            int r4 = r5.f     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r5.b(r2, r3, r6, r4)     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            android.media.MediaCodec r6 = r5.h     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            r6.stop()     // Catch: IOException -> 0x0052, IllegalStateException -> 0x0054, IllegalArgumentException -> 0x0056
            goto L_0x0099
        L_0x0096:
            android.util.Log.e(r1, r0, r6)
        L_0x0099:
            r6 = 0
            android.media.MediaCodec r2 = r5.h     // Catch: IllegalStateException -> 0x00a4
            if (r2 == 0) goto L_0x00a6
            r2.release()     // Catch: IllegalStateException -> 0x00a4
            r5.h = r6     // Catch: IllegalStateException -> 0x00a4
            goto L_0x00a6
        L_0x00a4:
            r2 = move-exception
            goto L_0x00b0
        L_0x00a6:
            android.media.MediaExtractor r2 = r5.g     // Catch: IllegalStateException -> 0x00a4
            if (r2 == 0) goto L_0x00b3
            r2.release()     // Catch: IllegalStateException -> 0x00a4
            r5.g = r6     // Catch: IllegalStateException -> 0x00a4
            goto L_0x00b3
        L_0x00b0:
            android.util.Log.e(r1, r0, r2)
        L_0x00b3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w7w.doInBackground(java.lang.String[]):java.lang.Boolean");
    }

    /* renamed from: h */
    public void onProgressUpdate(Bitmap... bitmapArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4450555", new Object[]{this, bitmapArr});
            return;
        }
        super.onProgressUpdate(bitmapArr);
        khs.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.k, bitmapArr[0]);
            this.k++;
        }
    }

    public final Bitmap i(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7a32ec9e", new Object[]{this, bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        float f = i;
        float min = Math.min(bitmap.getWidth() / f, bitmap.getHeight() / f);
        matrix.postRotate(this.j);
        float f2 = 1.0f / min;
        matrix.postScale(f2, f2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static int j(MediaExtractor mediaExtractor) {
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

    public static void k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71ac40c", new Object[]{codecCapabilities});
            return;
        }
        System.out.print("supported color format: ");
        for (int i : codecCapabilities.colorFormats) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(android.media.Image r20, int r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w7w.e(android.media.Image, int):byte[]");
    }

    public final void b(MediaCodec mediaCodec, MediaExtractor mediaExtractor, MediaFormat mediaFormat, int i) {
        int dequeueInputBuffer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52f6d9b", new Object[]{this, mediaCodec, mediaExtractor, mediaFormat, new Integer(i)});
            return;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            mediaCodec.start();
            mediaFormat.getInteger("width");
            mediaFormat.getInteger("height");
            boolean z = false;
            boolean z2 = false;
            int i2 = 0;
            while (!z) {
                if (!this.i && !isCancelled()) {
                    if (!z2 && (dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L)) >= 0) {
                        int readSampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(dequeueInputBuffer), 0);
                        if (readSampleData < 0) {
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            z2 = true;
                        } else {
                            mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                        }
                        int i3 = this.e;
                        long[] jArr = this.c;
                        if (i3 < jArr.length) {
                            this.d = jArr[i3];
                            this.e = i3 + 1;
                        }
                        mediaExtractor.seekTo(this.d, 2);
                    }
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            z = true;
                        }
                        if (bufferInfo.size != 0) {
                            int i4 = i2 + 1;
                            Image outputImage = mediaCodec.getOutputImage(dequeueOutputBuffer);
                            if (outputImage != null) {
                                a(outputImage, i);
                                outputImage.close();
                            }
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if (i4 == this.c.length) {
                                this.i = true;
                            }
                            i2 = i4;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        System.out.println(mediaCodec.getOutputFormat());
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            Log.e("FrameTask", "", e);
        }
    }
}
