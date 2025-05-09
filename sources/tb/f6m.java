package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f19051a = -1;
    public IVideoPlayControllerService.c b;
    public List<aaw> c;

    static {
        t2o.a(491782756);
    }

    public void a(IVideoPlayControllerService.b bVar, List<aaw> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd13fb2f", new Object[]{this, bVar, list});
        } else if (list != null && !list.isEmpty() && this.b != null) {
            for (aaw aawVar : list) {
                if (this.b.equals(aawVar.e())) {
                    f(bVar);
                }
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void c(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f44c3f", new Object[]{this, bVar});
            return;
        }
        f(bVar);
        e(null);
    }

    public void e(List<aaw> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e21c2c", new Object[]{this, list});
            return;
        }
        this.c = list;
        this.f19051a = -1;
    }

    public void f(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33579853", new Object[]{this, bVar});
        } else if (this.b != null) {
            fve.e("PlayControllerQueues", "停止视频：" + this.f19051a);
            this.b.s(bVar);
            this.b = null;
        }
    }

    public void g(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c61e76", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public boolean d(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2af1506f", new Object[]{this, bVar})).booleanValue();
        }
        List<aaw> list = this.c;
        if (list == null || list.isEmpty()) {
            fve.e("PlayControllerQueues", "队列为空");
            return false;
        }
        int i = this.f19051a + 1;
        this.f19051a = i;
        if (i >= this.c.size()) {
            fve.e("PlayControllerQueues", "队列已播放完");
            return false;
        }
        IVideoPlayControllerService.c cVar = this.b;
        aaw aawVar = this.c.get(this.f19051a);
        IVideoPlayControllerService.c e = aawVar.e();
        if (cVar != null && !cVar.equals(e)) {
            fve.e("PlayControllerQueues", "停止播放旧视频");
            cVar.s(bVar);
        }
        fve.e("PlayControllerQueues", "播放：" + this.f19051a + ", 曝光比例：" + aawVar.f().a());
        aawVar.e().o(bVar);
        return true;
    }
}
