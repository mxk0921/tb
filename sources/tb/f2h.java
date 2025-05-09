package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import java.util.HashMap;
import java.util.Map;
import tb.imc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f2h implements imc, qlr, rlr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBLiveOpenCardView b;
    public imc.a e;
    public final DXRuntimeContext f;

    /* renamed from: a  reason: collision with root package name */
    public final rwg f18962a = new rwg();
    public long c = 0;
    public long d = 0;

    static {
        t2o.a(491782229);
        t2o.a(491782216);
        t2o.a(806356527);
        t2o.a(806356528);
    }

    public f2h(DXRuntimeContext dXRuntimeContext) {
        this.f = dXRuntimeContext;
    }

    @Override // tb.imc
    public void a(DXRuntimeContext dXRuntimeContext) {
        cfc c;
        IFaceDetectorService iFaceDetectorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d780d33a", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                fve.e("LiveCardPlayControlWhenPlayControl", "stopVideo invoke");
                TBLiveOpenCardView e = e(dXRuntimeContext);
                if (e != null) {
                    e.stopVideo();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                fve.c("LiveCardPlayControlWhenPlayControl", "stopVideo exception", e2);
            }
            if (this.f != null && (c = j18.c(dXRuntimeContext)) != null && (iFaceDetectorService = (IFaceDetectorService) c.a(IFaceDetectorService.class)) != null) {
                iFaceDetectorService.stopFaceDetector();
            }
        }
    }

    @Override // tb.imc
    public void b(DXRuntimeContext dXRuntimeContext, xwg xwgVar) {
        cfc c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2d5e99", new Object[]{this, dXRuntimeContext, xwgVar});
        } else if (dXRuntimeContext != null && xwgVar != null && (c = j18.c(dXRuntimeContext)) != null) {
            h(dXRuntimeContext, c, xwgVar);
        }
    }

    @Override // tb.imc
    public void c(imc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a10daa1", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public final TBLiveOpenCardView e(DXRuntimeContext dXRuntimeContext) {
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveOpenCardView) ipChange.ipc$dispatch("e4e9642c", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || (D = dXRuntimeContext.D()) == null) {
            return null;
        }
        return (TBLiveOpenCardView) D.findViewById(10);
    }

    public final Map<String, String> f(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("838d975", new Object[]{this, dXRuntimeContext});
        }
        HashMap hashMap = new HashMap(8);
        DXTemplateItem p = dXRuntimeContext == null ? null : dXRuntimeContext.p();
        if (p != null) {
            hashMap.put("template", p.f7343a + "_" + p.b);
        }
        return hashMap;
    }

    public final void g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f16e847", new Object[]{this, new Integer(i), str});
            return;
        }
        imc.a aVar = this.e;
        if (aVar != null) {
            aVar.a(i, str);
        }
    }

    public final void h(DXRuntimeContext dXRuntimeContext, cfc cfcVar, xwg xwgVar) {
        IFaceDetectorService iFaceDetectorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50bc6bae", new Object[]{this, dXRuntimeContext, cfcVar, xwgVar});
            return;
        }
        try {
            TBLiveOpenCardView e = e(dXRuntimeContext);
            this.b = e;
            if (!d(cfcVar, xwgVar, e)) {
                fve.e("LiveCardPlayControlWhenPlayControl", "播放视频的条件没达到");
                return;
            }
            this.d = System.currentTimeMillis();
            tve.c("live", "live_startPlay", "", "Page_Home_VideoPlayer_Count", "", f(dXRuntimeContext));
            boolean playVideo = this.b.playVideo(this, this);
            fve.e("LiveCardPlayControlWhenPlayControl", "start play live video result = " + playVideo);
            if (this.f != null && (iFaceDetectorService = (IFaceDetectorService) cfcVar.a(IFaceDetectorService.class)) != null) {
                iFaceDetectorService.startFaceDetector(this.b, this.f.i(), xwgVar.p());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            fve.c("LiveCardPlayControlWhenPlayControl", "play Live video when play Controller exception", e2);
        }
    }

    @Override // tb.qlr
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        tve.b("live", "live_playFail", "", "Page_Home_VideoPlayer", "", f(this.f), String.valueOf(i), "");
        g(4, "直播组件播放失败");
    }

    @Override // tb.qlr
    public void onInfo(int i) {
        IFaceDetectorService iFaceDetectorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case cit.ERROR_TEMPLATE_INIT_FAILED /* 100005 */:
                tve.c("live", "live_firstFrameRendered", "", "Page_Home_VideoPlayer_Count", "", f(this.f));
                if (this.d > 0) {
                    Map<String, String> f = f(this.f);
                    f.put("cost", String.valueOf(System.currentTimeMillis() - this.d));
                    tve.c("live", "live_playerFirstFrameRenderedCost", "", "Page_Home_VideoPlayer_Count", "", f);
                }
                if (this.c > 0) {
                    Map<String, String> f2 = f(this.f);
                    f2.put("cost", String.valueOf(System.currentTimeMillis() - this.c));
                    tve.c("live", "live_startMediaPlayCost", "", "Page_Home_VideoPlayer_Count", "", f2);
                }
                cfc c = j18.c(this.f);
                if (c != null && (iFaceDetectorService = (IFaceDetectorService) c.a(IFaceDetectorService.class)) != null) {
                    iFaceDetectorService.setFirstFrameRendered();
                    return;
                }
                return;
            case 100006:
                this.c = System.currentTimeMillis();
                tve.c("live", "live_mediaStartPlay", "", "Page_Home_VideoPlayer_Count", "", f(this.f));
                return;
            case 100007:
                if (this.d > 0) {
                    Map<String, String> f3 = f(this.f);
                    f3.put("cost", String.valueOf(System.currentTimeMillis() - this.d));
                    tve.c("live", "live_playerPreparedCost", "", "Page_Home_VideoPlayer_Count", "", f3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // tb.rlr
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // tb.rlr
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        tve.b("live", "live_playMediaFail", "", "Page_Home_VideoPlayer", "", f(this.f), String.valueOf(i), String.valueOf(i2));
        g(2, "直播播放器播放失败");
    }

    public final boolean d(cfc cfcVar, xwg xwgVar, TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eec6c881", new Object[]{this, cfcVar, xwgVar, tBLiveOpenCardView})).booleanValue();
        }
        if (!this.f18962a.a(cfcVar, xwgVar)) {
            fve.e("LiveCardPlayControlWhenPlayControl", "video相关的配置不对");
            g(1, "参数不合法");
            return false;
        } else if (!this.f18962a.b(tBLiveOpenCardView)) {
            g(1, "上下文不合法");
            fve.e("LiveCardPlayControlWhenPlayControl", "上下文未初始化");
            return false;
        } else if (!this.f18962a.e(tBLiveOpenCardView.getContext())) {
            fve.e("LiveCardPlayControlWhenPlayControl", "can not play under current network");
            g(1, "网络状态不合法");
            return false;
        } else if (!tBLiveOpenCardView.isPlaying()) {
            return true;
        } else {
            fve.e("LiveCardPlayControlWhenPlayControl", "视频正在播放中，不重复执行");
            return false;
        }
    }
}
