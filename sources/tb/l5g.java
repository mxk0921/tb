package tb;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import tb.faw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l5g extends faw<g5g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public i5g C;

    static {
        t2o.a(352321656);
    }

    public l5g(cxj cxjVar, dh7 dh7Var, ViewGroup viewGroup, j83 j83Var) {
        super(cxjVar, dh7Var, viewGroup, j83Var);
    }

    public static /* synthetic */ Object ipc$super(l5g l5gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/media/player/KirinVideoPlayer");
    }

    @Override // tb.faw
    public btb A() {
        DWAspectRatio dWAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btb) ipChange.ipc$dispatch("d303706f", new Object[]{this});
        }
        this.C = new i5g(this.f19150a);
        EngineModel m = ((g5g) this.d).m();
        ue7 ue7Var = this.c;
        if (ue7Var != null && ue7Var.f31127a == 0) {
            m.mediaModel.enableSurfaceView = false;
        }
        if (m != null) {
            MediaModel mediaModel = m.mediaModel;
            qrc qrcVar = this.j;
            mediaModel.videoWidth = qrcVar.d;
            mediaModel.videoHeight = qrcVar.c;
            if (qrcVar.h == ImageView.ScaleType.CENTER_CROP) {
                dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            } else {
                dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
            }
            mediaModel.videoAspectRatio = dWAspectRatio;
        }
        this.e = new f5g(this.C.m(((g5g) this.d).m(), this.b.I()), this.C);
        txj.e(txj.TAG_MEDIA_CONTROLLER, "NdVideoRec:DwOnCreate (KirinInstanceProxy) hCode:" + this.e.hashCode());
        return this.e;
    }

    @Override // tb.faw
    public faw.g B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (faw.g) ipChange.ipc$dispatch("2f5a581b", new Object[]{this});
        }
        faw.g gVar = new faw.g(this);
        this.A = gVar;
        return gVar;
    }
}
