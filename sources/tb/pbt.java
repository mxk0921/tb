package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.single.OpenSingleViewContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pbt extends df {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final w3d f;

    static {
        t2o.a(779093048);
    }

    public pbt(w3d w3dVar) {
        this.f = w3dVar;
        b0(new y5l(w3dVar));
        a0(new x5l(w3dVar));
        Y(new e4l(w3dVar));
    }

    public static /* synthetic */ Object ipc$super(pbt pbtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/opencompent/listener/openplatform/TaoliveOpenPlatformListener");
    }

    @Override // tb.df
    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f297880f", new Object[]{this, str});
            return;
        }
        w3d w3dVar = this.f;
        if (w3dVar instanceof OpenSingleViewContainer) {
            ((OpenSingleViewContainer) w3dVar).m(str);
        }
    }
}
