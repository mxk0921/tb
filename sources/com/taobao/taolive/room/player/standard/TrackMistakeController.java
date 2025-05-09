package com.taobao.taolive.room.player.standard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.o3s;
import tb.pvs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrackMistakeController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f13211a = pvs.b();
    public Handler b;
    public final String c;
    public final b d;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface CheckStreamMistakeStatus {
        public static final String STATUS_STREAM_ERROR = "1";
        public static final String STATUS_STREAM_NORMAL = "0";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/TrackMistakeController$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 0 && TrackMistakeController.a(TrackMistakeController.this) != null) {
                TrackMistakeController.a(TrackMistakeController.this).v();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void v();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
    }

    static {
        t2o.a(779093153);
    }

    public TrackMistakeController(b bVar, String str) {
        this.c = str;
        this.d = bVar;
    }

    public static /* synthetic */ b a(TrackMistakeController trackMistakeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fc5ebb20", new Object[]{trackMistakeController});
        }
        return trackMistakeController.d;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e19fa1", new Object[]{this});
        } else if (this.b == null) {
            this.b = new a(Looper.getMainLooper());
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(this.c)) {
            o3s.b("TrackMistakeController", this.c + " " + str);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3565fb93", new Object[]{this});
            return;
        }
        c("串流上报任务stopCheckTask,mHandler:" + this.b);
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e685ff3", new Object[]{this});
            return;
        }
        b();
        Handler handler = this.b;
        if (handler != null) {
            if (handler.hasMessages(0)) {
                e();
            }
            c("串流上报任务startBackupPlayTask，延迟：" + this.f13211a + " ms");
            this.b.sendEmptyMessageDelayed(0, this.f13211a);
        }
    }
}
