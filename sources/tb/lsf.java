package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lsf implements wa7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f23542a;

    static {
        t2o.a(921698355);
        t2o.a(921698332);
    }

    public lsf(Long l) {
        long longValue = l.longValue();
        this.f23542a = longValue;
        if (longValue != 0) {
            lwx.b(this);
        }
    }

    public ksf a(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("d1e5f09e", new Object[]{this, dqfVar});
        }
        Object cmd = Bridge.cmd(dqfVar, (int) IMediaPlayer.MEDIA_INFO_RTC_VIDEO_FIRST_FRAME_TIME, this.f23542a);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
        }
        return null;
    }

    @Override // tb.wa7
    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        long j = this.f23542a;
        if (j != 0) {
            Bridge.cmd((dqf) null, (int) IMediaPlayer.MEDIA_INFO_RTC_AUDIO_FIRST_PACKET_TIME, j);
            this.f23542a = 0L;
            lwx.g(this);
        }
    }
}
