package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class air extends t54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public cba Z;
    public RoomPlayerObserver a0;
    public VideoInfo b0;
    public boolean c0 = false;
    public long d0;
    public boolean e0;
    public tjl f0;

    static {
        t2o.a(779093443);
    }

    public static /* synthetic */ Object ipc$super(air airVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/core/TBLIveCommonFrameContext");
    }

    /* renamed from: G0 */
    public cba j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        return this.Z;
    }

    public tjl H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tjl) ipChange.ipc$dispatch("be3fb369", new Object[]{this});
        }
        return this.f0;
    }

    public RoomPlayerObserver I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoomPlayerObserver) ipChange.ipc$dispatch("6900104c", new Object[]{this});
        }
        return this.a0;
    }

    public VideoInfo J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        return this.b0;
    }

    @Deprecated
    public m9e K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9e) ipChange.ipc$dispatch("d2b09f5c", new Object[]{this});
        }
        return null;
    }

    public boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478a5e71", new Object[]{this})).booleanValue();
        }
        return this.c0;
    }

    public void M0(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
        } else {
            this.Z = cbaVar;
        }
    }

    public void N0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c34a5cf", new Object[]{this, new Boolean(z)});
        } else {
            this.c0 = z;
        }
    }

    public void O0(tjl tjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988650af", new Object[]{this, tjlVar});
        } else {
            this.f0 = tjlVar;
        }
    }

    public void P0(RoomPlayerObserver roomPlayerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8416b852", new Object[]{this, roomPlayerObserver});
        } else {
            this.a0 = roomPlayerObserver;
        }
    }

    public void Q0(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2da7f", new Object[]{this, videoInfo});
        } else {
            this.b0 = videoInfo;
        }
    }
}
