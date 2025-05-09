package com.alibaba.security.realidentity;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.alibaba.security.realidentity.j3;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n3 implements o3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String h = "MediaMuxerManager";

    /* renamed from: a  reason: collision with root package name */
    public MediaMuxer f2774a;
    public Thread b;
    public int c = -1;
    public final LinkedBlockingQueue<j3.c> d = new LinkedBlockingQueue<>();
    public final Object e = new Object();
    public volatile boolean f;
    public volatile boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2775a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str);
            this.f2775a = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/n3$a");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (n3.a(n3.this)) {
                try {
                    n3.a(n3.this).wait();
                } catch (InterruptedException e) {
                    com.alibaba.security.realidentity.a.a(n3.h, e);
                }
            }
            while (n3.b(n3.this) && !Thread.interrupted()) {
                try {
                    j3.c cVar = (j3.c) n3.c(n3.this).take();
                    n3.e(n3.this).writeSampleData(n3.d(n3.this), cVar.b, cVar.c);
                } catch (InterruptedException unused) {
                } catch (Exception e2) {
                    TrackLog createSdkExceptionLog = TrackLog.createSdkExceptionLog(d.b(e2));
                    createSdkExceptionLog.addTag10(TimeCalculator.PLATFORM_ANDROID);
                    createSdkExceptionLog.setVerifyToken(this.f2775a);
                    RPTrack.a(createSdkExceptionLog);
                }
            }
            n3.c(n3.this).clear();
            n3.this.c();
        }
    }

    public static /* synthetic */ Object a(n3 n3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("60fc38a5", new Object[]{n3Var}) : n3Var.e;
    }

    public static /* synthetic */ boolean b(n3 n3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8848ccf2", new Object[]{n3Var})).booleanValue() : n3Var.g;
    }

    public static /* synthetic */ LinkedBlockingQueue c(n3 n3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedBlockingQueue) ipChange.ipc$dispatch("79349d8b", new Object[]{n3Var}) : n3Var.d;
    }

    public static /* synthetic */ int d(n3 n3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52cbaa63", new Object[]{n3Var})).intValue();
        }
        return n3Var.c;
    }

    public static /* synthetic */ MediaMuxer e(n3 n3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMuxer) ipChange.ipc$dispatch("cbb0fbb0", new Object[]{n3Var});
        }
        return n3Var.f2774a;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f) {
            synchronized (this.e) {
                try {
                    this.f2774a.start();
                    this.f = true;
                    this.e.notify();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed88149f", new Object[]{this, str, new Integer(i), str2})).booleanValue();
        }
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
            this.f2774a = mediaMuxer;
            mediaMuxer.setOrientationHint(i);
            a aVar = new a("muxer_thread", str2);
            this.b = aVar;
            aVar.start();
            this.g = true;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f) {
            try {
                this.f2774a.stop();
                this.f2774a.release();
                this.f = false;
            } catch (Throwable unused) {
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g = false;
        Thread thread = this.b;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // com.alibaba.security.realidentity.o3
    public void a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd127976", new Object[]{this, new Integer(i), byteBuffer, bufferInfo});
            return;
        }
        try {
            this.d.put(new j3.c(i, byteBuffer, bufferInfo));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.alibaba.security.realidentity.o3
    public void a(int i, MediaFormat mediaFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b40c76", new Object[]{this, new Integer(i), mediaFormat});
            return;
        }
        MediaMuxer mediaMuxer = this.f2774a;
        if (mediaMuxer != null) {
            this.c = mediaMuxer.addTrack(mediaFormat);
        }
        b();
    }
}
