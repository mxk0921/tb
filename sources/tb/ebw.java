package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ebw implements b3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356456);
        t2o.a(806356092);
    }

    @Override // tb.b3d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b440782", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537088aa", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public boolean c(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f446f10a", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
        }
        return false;
    }

    @Override // tb.b3d
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tb.b3d
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return false;
    }

    @Override // tb.b3d
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tb.b3d
    public void onPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
        }
    }
}
