package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.INavAdapter;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class km4 implements c7c, ylb, x5b, j0q, yid, p5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f22754a;
    public final olk<c7c> b = new olk<>();
    public final olk<ylb> c = new olk<>();
    public final olk<j0q> d = new olk<>();
    public final olk<x5b> e = new olk<>();
    public final olk<yid> f = new olk<>();
    public final olk<p5d> g = new olk<>();
    public Boolean h;

    static {
        t2o.a(468714133);
        t2o.a(468714134);
        t2o.a(468714137);
        t2o.a(468714136);
        t2o.a(468714135);
        t2o.a(468714141);
        t2o.a(468714139);
        t2o.a(468714138);
    }

    public km4(FluidContext fluidContext) {
        this.f22754a = fluidContext;
    }

    @Override // tb.yid
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63456940", new Object[]{this});
            return;
        }
        ir9.b("ContainerListenerManager", "onStartRender called");
        for (yid yidVar : this.f.b()) {
            try {
                yidVar.a();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f22754a, yidVar, "onStartRender", e);
            }
        }
    }

    public void addCardRenderListener(ylb ylbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69f43b0", new Object[]{this, ylbVar});
        } else if (ylbVar != null) {
            this.c.a(ylbVar);
        }
    }

    public void addFirstCardRenderListener(c7c c7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce1648a", new Object[]{this, c7cVar});
        } else if (c7cVar != null) {
            this.b.a(c7cVar);
        }
    }

    public void addHorizontalSlideListener(x5b x5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615d0abc", new Object[]{this, x5bVar});
        } else {
            this.e.a(x5bVar);
        }
    }

    public void addPageBackListener(p5d p5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd1bd50", new Object[]{this, p5dVar});
        } else {
            this.g.a(p5dVar);
        }
    }

    public void addRenderLifecycleListener(yid yidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a0069e", new Object[]{this, yidVar});
        } else {
            this.f.a(yidVar);
        }
    }

    public void addSizedChangeListener(j0q j0qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeb3990", new Object[]{this, j0qVar});
        } else {
            this.d.a(j0qVar);
        }
    }

    @Override // tb.x5b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd92d595", new Object[]{this});
            return;
        }
        ir9.b("ContainerListenerManager", "onHorizontalSlide called");
        for (x5b x5bVar : this.e.b()) {
            try {
                x5bVar.b();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f22754a, x5bVar, "onHorizontalSlide", e);
            }
        }
        try {
            if (((ISceneConfigService) this.f22754a.getService(ISceneConfigService.class)).getSlidePageLockConfigure().d()) {
                ir9.b("ContainerListenerManager", "MultiTab onHorizontalSlide disableSlide");
                return;
            }
            a.d e2 = ((IDataService) this.f22754a.getService(IDataService.class)).getCurrentMediaSetData().e();
            String H = e2.H();
            if (!TextUtils.isEmpty(H)) {
                ITrackService iTrackService = (ITrackService) this.f22754a.getService(ITrackService.class);
                if (iTrackService != null) {
                    Map<String, String> activeCardCommonTrack = iTrackService.getActiveCardCommonTrack();
                    activeCardCommonTrack.put("contentId", e2.f());
                    activeCardCommonTrack.put("videoId", e2.f());
                    activeCardCommonTrack.put("video_spm_cnt", activeCardCommonTrack.get("spm-cnt"));
                    activeCardCommonTrack.put("video_spm_url", activeCardCommonTrack.get("spm-url"));
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(hxf.d(activeCardCommonTrack));
                    ir9.b("ContainerListenerManager", "侧滑进个人页-- onHorizontalSlide ");
                }
                INavAdapter navAdapter = FluidSDK.getNavAdapter();
                FluidContext fluidContext = this.f22754a;
                navAdapter.nav(fluidContext, fluidContext.getContext(), H, null);
                ((IMessageService) this.f22754a.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_pageSlide", e2.c, null));
                xau.o(this.f22754a);
                return;
            }
            ir9.b("ContainerListenerManager", "MultiTab onHorizontalSlide slidePageUrl isEmpty");
        } catch (Exception e3) {
            ir9.b("ContainerListenerManager", e3.toString());
        }
    }

    public boolean isFirstCardRenderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79973262", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.h;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // tb.yid
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a60635", new Object[]{this});
            return;
        }
        ir9.b("ContainerListenerManager", "onRenderComplete called");
        for (yid yidVar : this.f.b()) {
            try {
                yidVar.j();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f22754a, yidVar, "onRenderComplete", e);
            }
        }
    }

    @Override // tb.ylb
    public void onCardRenderFailed(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4eefa3a", new Object[]{this, uq9Var});
        } else if (uq9Var != null) {
            ir9.b("ContainerListenerManager", "视频流卡片渲染成功：" + uq9Var);
            for (ylb ylbVar : this.c.b()) {
                try {
                    ylbVar.onCardRenderFailed(uq9Var);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f22754a, ylbVar, "onCardRenderFailed", e);
                }
            }
        }
    }

    @Override // tb.ylb
    public void onCardRenderSuccess(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a83ad6", new Object[]{this, uq9Var});
        } else if (uq9Var != null) {
            ir9.b("ContainerListenerManager", "视频流卡片渲染成功：" + uq9Var);
            for (ylb ylbVar : this.c.b()) {
                try {
                    ylbVar.onCardRenderSuccess(uq9Var);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f22754a, ylbVar, "onCardRenderSuccess", e);
                }
            }
        }
    }

    @Override // tb.c7c
    public void onFirstCardRenderFailed(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb19bec", new Object[]{this, uq9Var});
        } else if (this.h == null && uq9Var != null && uq9Var.k0()) {
            ir9.b("ContainerListenerManager", "视频流首卡渲染失败：" + uq9Var);
            this.h = Boolean.FALSE;
            onCardRenderFailed(uq9Var);
            for (c7c c7cVar : this.b.b()) {
                try {
                    c7cVar.onFirstCardRenderFailed(uq9Var);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f22754a, c7cVar, "onFirstCardRenderFailed", e);
                }
            }
        }
    }

    @Override // tb.c7c
    public void onFirstCardRenderSuccess(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2639cf64", new Object[]{this, uq9Var});
        } else if (this.h == null && uq9Var != null && uq9Var.k0()) {
            ir9.b("ContainerListenerManager", "视频流首卡渲染成功：" + uq9Var);
            this.h = Boolean.TRUE;
            onCardRenderSuccess(uq9Var);
            for (c7c c7cVar : this.b.b()) {
                try {
                    c7cVar.onFirstCardRenderSuccess(uq9Var);
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f22754a, c7cVar, "onFirstCardRenderSuccess", e);
                }
            }
        }
    }

    @Override // tb.j0q
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ir9.b("ContainerListenerManager", "onSizeChanged called width:" + i + " height:" + i2);
        for (j0q j0qVar : this.d.b()) {
            try {
                j0qVar.onSizeChanged(i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f22754a, j0qVar, "onSizeChanged", e);
            }
        }
    }

    public void removeCardRenderListener(ylb ylbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bd6bed", new Object[]{this, ylbVar});
        } else if (ylbVar != null) {
            this.c.e(ylbVar);
        }
    }

    public void removeFirstCardRenderListener(c7c c7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ec2487", new Object[]{this, c7cVar});
        } else if (c7cVar != null) {
            this.b.e(c7cVar);
        }
    }

    public void removeHorizontalSlideListener(x5b x5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642bd71f", new Object[]{this, x5bVar});
        } else {
            this.e.e(x5bVar);
        }
    }

    public void removePageBackListener(p5d p5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1f8c0d", new Object[]{this, p5dVar});
        } else {
            this.g.e(p5dVar);
        }
    }

    public void removeRenderLifecycleListener(yid yidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d5139b", new Object[]{this, yidVar});
        } else {
            this.f.e(yidVar);
        }
    }

    public void removeSizedChangeListener(j0q j0qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19218f3", new Object[]{this, j0qVar});
        } else {
            this.d.e(j0qVar);
        }
    }
}
