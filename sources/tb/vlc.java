package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface vlc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements vlc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714533);
            t2o.a(468714532);
        }

        @Override // tb.vlc
        public void onCompletion(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c77df115", new Object[]{this, uq9Var, iMediaPlayer});
            }
        }

        @Override // tb.vlc
        public boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9aa6fc07", new Object[]{this, uq9Var, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            return false;
        }

        @Override // tb.vlc
        public boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b531195d", new Object[]{this, uq9Var, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            return false;
        }

        @Override // tb.vlc
        public void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a78defb6", new Object[]{this, uq9Var, iMediaPlayer});
            }
        }
    }

    void onCompletion(uq9 uq9Var, IMediaPlayer iMediaPlayer);

    boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2);

    boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);

    void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer);
}
