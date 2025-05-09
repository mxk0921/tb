package com.alibaba.security.realidentity;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l3 extends j3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] B;
    public String C;
    public MediaCodec o;
    public long p;
    public volatile boolean q;
    public n3 s;
    public Thread u;
    public boolean v;
    public final m3 w;
    public long x;
    public long y;
    public long z;
    public int A = -1;
    public final MediaCodec.BufferInfo r = new MediaCodec.BufferInfo();
    public final LinkedBlockingQueue<byte[]> t = new LinkedBlockingQueue<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/l3$a");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (l3.a(l3.this) && !Thread.interrupted()) {
                try {
                    l3.a(l3.this, (byte[]) l3.b(l3.this).take());
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public l3(Context context) {
        super(context);
        this.w = new m3(context);
    }

    public static /* synthetic */ LinkedBlockingQueue b(l3 l3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedBlockingQueue) ipChange.ipc$dispatch("be4623ee", new Object[]{l3Var}) : l3Var.t;
    }

    private void c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5ddb1", new Object[]{this, bArr});
            return;
        }
        try {
            LinkedBlockingQueue<byte[]> linkedBlockingQueue = this.t;
            if (linkedBlockingQueue != null && bArr != null) {
                linkedBlockingQueue.put(bArr);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(l3 l3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/l3");
    }

    @Override // com.alibaba.security.realidentity.j3
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == 19 || i == 21;
    }

    @Override // com.alibaba.security.realidentity.j3
    public boolean b(int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98e561b7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str})).booleanValue();
        }
        this.C = str;
        return c(i, i2, i3, i4, str);
    }

    public static /* synthetic */ boolean a(l3 l3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2eb2f2f", new Object[]{l3Var})).booleanValue() : l3Var.v;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LinkedBlockingQueue<byte[]> linkedBlockingQueue = this.t;
        if (linkedBlockingQueue != null && !linkedBlockingQueue.isEmpty()) {
            com.alibaba.security.realidentity.a.b(j3.i, "video record exception,mVideoQueue is not empty when stop recording");
            TrackLog recordException = TrackLog.recordException(this.t.isEmpty(), this.t.size());
            recordException.setVerifyToken(this.C);
            recordException.addTag9(g2.f2719a + "/3.3.0");
            recordException.addTag10(TimeCalculator.PLATFORM_ANDROID);
            RPTrack.a(recordException);
        }
    }

    public static /* synthetic */ void a(l3 l3Var, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f28532", new Object[]{l3Var, bArr});
        } else {
            l3Var.b(bArr);
        }
    }

    @Override // com.alibaba.security.realidentity.j3
    public void b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4faf26d0", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else if (this.o != null) {
            c(bArr);
        }
    }

    @Override // com.alibaba.security.realidentity.j3
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            c();
            this.q = true;
            this.v = false;
            MediaCodec mediaCodec = this.o;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.o.release();
            }
            n3 n3Var = this.s;
            if (n3Var != null) {
                n3Var.c();
                this.s.a();
            }
        } catch (Exception unused) {
        }
    }

    private void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{this, bArr});
            return;
        }
        try {
            int i = this.A;
            if (i == 21) {
                s.a().b(bArr, this.B, this.b, this.c);
            } else if (i == 19) {
                s.a().a(bArr, this.B, this.b, this.c);
            } else if (i == 39) {
                System.arraycopy(bArr, 0, this.B, 0, ((this.b * this.c) * 3) / 2);
            } else if (i == 20) {
                s.a().c(bArr, this.B, this.b, this.c);
            }
            ByteBuffer[] inputBuffers = this.o.getInputBuffers();
            int dequeueInputBuffer = this.o.dequeueInputBuffer(10000L);
            if (dequeueInputBuffer != -1) {
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                byteBuffer.put(this.B);
                long currentTimeMillis = (System.currentTimeMillis() * 1000) - this.p;
                if (this.q) {
                    this.o.queueInputBuffer(dequeueInputBuffer, 0, this.B.length, currentTimeMillis, 4);
                } else {
                    this.o.queueInputBuffer(dequeueInputBuffer, 0, this.B.length, currentTimeMillis, 0);
                }
            }
            ByteBuffer[] outputBuffers = this.o.getOutputBuffers();
            int dequeueOutputBuffer = this.o.dequeueOutputBuffer(this.r, 10000L);
            if (dequeueOutputBuffer == -3) {
                outputBuffers = this.o.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.o.getOutputFormat();
                if (this.s != null && !this.q) {
                    this.s.a(0, outputFormat);
                }
            }
            while (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer2 != null) {
                    MediaCodec.BufferInfo bufferInfo = this.r;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (!(bufferInfo.size == 0 || this.s == null || this.q)) {
                        long j = this.y;
                        if (j > 0) {
                            MediaCodec.BufferInfo bufferInfo2 = this.r;
                            if (bufferInfo2.presentationTimeUs < j) {
                                bufferInfo2.presentationTimeUs = j + 10000;
                            }
                        }
                        a(this.r);
                        byteBuffer2.position(this.r.offset);
                        MediaCodec.BufferInfo bufferInfo3 = this.r;
                        byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                        this.s.a(0, byteBuffer2, this.r);
                    }
                    this.o.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.o.dequeueOutputBuffer(this.r, 0L);
                    if ((this.r.flags & 4) != 0) {
                        this.u.interrupt();
                        this.v = false;
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean c(int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2367278", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str})).booleanValue();
        }
        try {
            String b = this.w.b();
            this.A = this.w.a();
            if (TextUtils.isEmpty(b) || this.A == -1) {
                MediaCodecInfo a2 = a(j3.m);
                if (a2 == null) {
                    return false;
                }
                String name = a2.getName();
                this.w.a(name);
                List<Integer> a3 = a(a2, j3.m);
                int i5 = 0;
                while (true) {
                    if (i5 >= a3.size()) {
                        break;
                    } else if (a(a3.get(i5).intValue())) {
                        this.A = a3.get(i5).intValue();
                        break;
                    } else {
                        i5++;
                    }
                }
                int i6 = this.A;
                if (i6 == -1) {
                    return false;
                }
                this.w.a(i6);
                b = name;
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(j3.m, i, i2);
            createVideoFormat.setInteger("bitrate-mode", 2);
            createVideoFormat.setInteger(VideoControllerManager.KEY_BITRATE, i * i2 * 3);
            createVideoFormat.setInteger("frame-rate", i3);
            createVideoFormat.setInteger("color-format", this.A);
            createVideoFormat.setInteger("i-frame-interval", 1);
            createVideoFormat.setInteger("rotation-degrees", i4);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(b);
            this.o = createByCodecName;
            createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.o.start();
            this.q = false;
            this.p = System.currentTimeMillis() * 1000;
            this.B = new byte[((this.b * this.c) * 3) / 2];
            n3 n3Var = new n3();
            this.s = n3Var;
            n3Var.a(this.e, i4, str);
            a aVar = new a("video_record_thread");
            this.u = aVar;
            this.v = true;
            aVar.start();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private List<Integer> a(MediaCodecInfo mediaCodecInfo, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4ef81971", new Object[]{this, mediaCodecInfo, str});
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i >= iArr.length) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(iArr[i]));
            i++;
        }
    }

    private MediaCodecInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaCodecInfo) ipChange.ipc$dispatch("319f9ac8", new Object[]{this, str});
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private void a(MediaCodec.BufferInfo bufferInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa598e4", new Object[]{this, bufferInfo});
            return;
        }
        long j = bufferInfo.presentationTimeUs;
        this.y = j;
        long j2 = this.x;
        if (j2 == 0) {
            this.x = j;
        } else {
            this.z = j - j2;
        }
    }
}
