package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y9w extends y30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<Class<? extends DXWidgetNode>> o;
    public final e6m k;
    public PlayControllerConfig l;
    public String m;
    public int n = 0;
    public final baw g = new baw(o);
    public final rp8 i = new rp8();
    public final xaw h = new xaw();
    public final f6m j = new f6m();

    static {
        t2o.a(491782757);
        ArrayList arrayList = new ArrayList();
        o = arrayList;
        arrayList.add(fra.class);
        arrayList.add(a06.class);
    }

    public y9w(cfc cfcVar, IVideoPlayControllerService.a aVar) {
        super(cfcVar, aVar);
        e6m e6mVar = new e6m(cfcVar);
        this.k = e6mVar;
        this.l = e6mVar.d();
    }

    public static /* synthetic */ Object ipc$super(y9w y9wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/videoplaycontrollerservice/impl/VideoPlayController");
    }

    @Override // tb.y30
    public void A(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0c7c2a", new Object[]{this, iContainerDataModel});
        } else {
            this.l = this.k.e(iContainerDataModel);
        }
    }

    public final void D(List<aaw> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99660aea", new Object[]{this, list});
            return;
        }
        fve.e("VideoPlayerController", "forcePlayItem:" + this.m);
        if (this.m == null || list == null) {
            fve.e("VideoPlayerController", "forcePlayItem id null return:");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            aaw aawVar = list.get(i);
            IVideoPlayControllerService.c e = aawVar.e();
            if ((e instanceof DXWidgetNode) && TextUtils.equals(((DXWidgetNode) e).getUserId(), this.m)) {
                try {
                    list.remove(i);
                    list.add(0, aawVar);
                } catch (Exception e2) {
                    fve.c("VideoPlayerController", "VideoPlayController#强制播放error：", e2);
                }
                fve.e("VideoPlayerController", "VideoPlayController#强制播放index：" + i + ", userId： " + this.m);
            }
        }
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("758475d5", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public void F(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4497cd46", new Object[]{this, cVar});
            return;
        }
        fve.e("VideoPlayerController", "playComplete :" + cVar);
    }

    public void G(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b205f2d", new Object[]{this, cVar});
            return;
        }
        fve.e("VideoPlayerController", "playError :" + cVar);
        this.j.d(this);
    }

    public void H(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca6799b", new Object[]{this, cVar});
            return;
        }
        fve.e("VideoPlayerController", "playPause:" + cVar);
    }

    public void I(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadcf107", new Object[]{this, cVar});
            return;
        }
        fve.e("VideoPlayerController", "playStart :" + cVar);
        this.j.g(cVar);
    }

    public void J(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23a9acf", new Object[]{this, cVar});
            return;
        }
        fve.e("VideoPlayerController", "playStop :" + cVar);
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1c1bf1", new Object[]{this});
            return;
        }
        fve.e("VideoPlayerController", "resetSeekState:");
        this.m = null;
        this.n = -1;
    }

    @Override // tb.y30
    public void u(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb734153", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.m = str;
        this.n = i;
        fve.e("VideoPlayerController", "forceInsertToQueueHeader:" + str + ",mSeekTime:" + this.n);
    }

    @Override // tb.y30
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        PlayControllerConfig playControllerConfig = this.l;
        if (playControllerConfig == null || !playControllerConfig.isPlayControlEnable()) {
            return false;
        }
        return true;
    }

    @Override // tb.y30
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.j.c(this);
        }
    }

    @Override // tb.y30
    public void x(List<View> list, a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3a0e0e", new Object[]{this, list, a69Var});
            return;
        }
        List<aaw> c = this.h.c(this.i.a(this.g.d(list, a69Var), this.l), this.l, a69Var);
        D(c);
        if (c == null || c.isEmpty()) {
            fve.e("VideoPlayerController", "无可播视频， videoPlayControllerItems isEmpty");
            y();
            return;
        }
        fve.e("VideoPlayerController", "屏上符合要求的视频个数：" + c.size() + ", 最小曝光比例： " + this.l.getPlayControlFocusAreaMinPercent());
        this.j.e(c);
        this.j.d(this);
    }

    @Override // tb.y30
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.j.f(this);
        }
    }

    @Override // tb.y30
    public void z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7941fd4a", new Object[]{this, view});
        } else if (!this.j.b()) {
            this.j.a(this, this.g.c(view, null));
        }
    }
}
