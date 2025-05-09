package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hqa implements IMediaPlayer.OnInfoListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ iqa f20813a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (iqa.b(hqa.this.f20813a) != null && iqa.b(hqa.this.f20813a).f19424a != null) {
                iqa.b(hqa.this.f20813a).f19424a.onVideoStart();
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
            } else if (iqa.b(hqa.this.f20813a) == null) {
            } else {
                if (2 != iqa.b(hqa.this.f20813a).e) {
                    hqa.this.f20813a.n();
                } else if (!iqa.b(hqa.this.f20813a).j) {
                    hqa.this.f20813a.n();
                }
            }
        }
    }

    public hqa(iqa iqaVar) {
        this.f20813a = iqaVar;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j == 3 && iqa.a(this.f20813a) != null) {
            iqa.a(this.f20813a).post(new a());
            iqa.a(this.f20813a).postDelayed(new b(), iqa.c(this.f20813a) * 1000);
        }
        return false;
    }
}
