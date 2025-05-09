package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConfigAdapter;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoAudioOnlyPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s65 extends fr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TaobaoAudioOnlyPlayer f27819a;
    public ksb b;

    static {
        t2o.a(452984836);
    }

    public s65(Context context) {
        this.f27819a = new TaobaoAudioOnlyPlayer(context, new MediaConfigAdapter());
        c();
    }

    public static /* synthetic */ Object ipc$super(s65 s65Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWAudioOnlyInstance");
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6365f098", new Object[]{this, str})).longValue();
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            return taobaoAudioOnlyPlayer.getCurrentPosition(str);
        }
        return -1L;
    }

    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e59f820f", new Object[]{this, str})).longValue();
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            return taobaoAudioOnlyPlayer.getDuration(str);
        }
        return -1L;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecf412e", new Object[]{this});
            return;
        }
        this.f27819a.registerOnAudioPreparedListener(this);
        this.f27819a.registerOnAudioPreCompletionListener(this);
        this.f27819a.registerOnAudioCompletionListener(this);
        this.f27819a.registerOnAudioErrorListener(this);
        this.f27819a.registerOnAudioInfoListener(this);
        this.f27819a.registerOnAudioLoopCompletionListener(this);
        this.f27819a.registerOnAudioSeekStartListener(this);
        this.f27819a.registerOnAudioPauseListener(this);
        this.f27819a.registerOnAudioStartListener(this);
        this.f27819a.registerOnAudioSeekCompleteListener(this);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8202e407", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.pause(str);
        }
    }

    public void e(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe686", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.prepareAsync(str);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.f27819a.unregisterOnAudioPreparedListener(this);
        this.f27819a.unregisterOnAudioPreCompletionListener(this);
        this.f27819a.unregisterOnAudioCompletionListener(this);
        this.f27819a.unregisterOnAudioErrorListener(this);
        this.f27819a.unregisterOnAudioInfoListener(this);
        this.f27819a.unregisterOnAudioLoopCompletionListener(this);
        this.f27819a.unregisterOnAudioSeekStartListener(this);
        this.f27819a.unregisterOnAudioPauseListener(this);
        this.f27819a.unregisterOnAudioStartListener(this);
        this.f27819a.unregisterOnAudioSeekCompleteListener(this);
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.release();
        }
    }

    public void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3fade0", new Object[]{this, str, new Long(j)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.seekTo(str, j);
        }
    }

    public String h(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfe2f75e", new Object[]{this, str, str2});
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            return taobaoAudioOnlyPlayer.setDataSource(str, str2);
        }
        return "";
    }

    public void i(ksb ksbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538dbdf2", new Object[]{this, ksbVar});
        } else {
            this.b = ksbVar;
        }
    }

    public void j(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7f66e7", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.setLooping(str, z);
        }
    }

    public void k(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7481ba1a", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.setMuted(str, z);
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.setPauseInBackground(z);
        }
    }

    public void m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccbee5", new Object[]{this, str, new Long(j)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.setStateChangeGap(str, j);
        }
    }

    public void n(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e97c6d", new Object[]{this, str, new Float(f), new Float(f2)});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.setVolume(str, f, f2);
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.start(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbc2ce", new Object[]{this, iMediaPlayer, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).c(str);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "Completion token " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioLoopCompletionListener
    public void onLoopCompletion(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1f9112", new Object[]{this, iMediaPlayer, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).f(str);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onLoopCompletion index " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioPauseListener
    public void onPause(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).g(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioPreCompletionListener
    public void onPreCompletion(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b47ef3", new Object[]{this, iMediaPlayer, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).h(str);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onPreCompletion index " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc4aeef", new Object[]{this, iMediaPlayer, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).i(str);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onPrepared index " + str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioSeekCompletionListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e24f03", new Object[]{this, iMediaPlayer, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).j(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioSeekStartListener
    public void onSeekStart(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66368d5e", new Object[]{this, iMediaPlayer, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).k(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioStartListener
    public void onStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            return;
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).l(str);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.f27819a;
        if (taobaoAudioOnlyPlayer != null) {
            taobaoAudioOnlyPlayer.stop(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5ceb300", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2), str})).booleanValue();
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).d(i, i2, str);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onError index " + str);
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnAudioInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1313bb98", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj, str})).booleanValue();
        }
        ksb ksbVar = this.b;
        if (ksbVar != null) {
            ((mar) ksbVar).e(j, j2, j3, obj, str);
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "onInfo index " + j);
        return false;
    }
}
