package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import tb.imc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lyg implements imc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final rwg f23642a = new rwg();

    static {
        t2o.a(491782228);
        t2o.a(491782216);
    }

    @Override // tb.imc
    public void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d780d33a", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                fve.e("LiveCardPlayControl", "stopVideo invoke");
                TBLiveOpenCardView e = e(dXRuntimeContext);
                if (e != null) {
                    e.destroy();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                fve.c("LiveCardPlayControl", "stopVideo exception", e2);
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
            f(dXRuntimeContext, c, xwgVar);
        }
    }

    @Override // tb.imc
    public void c(imc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a10daa1", new Object[]{this, aVar});
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

    public final void f(DXRuntimeContext dXRuntimeContext, cfc cfcVar, xwg xwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba40324a", new Object[]{this, dXRuntimeContext, cfcVar, xwgVar});
            return;
        }
        try {
            fve.f("LiveCardPlayControl", "playVideoIfNecessary");
            TBLiveOpenCardView e = e(dXRuntimeContext);
            if (!d(cfcVar, xwgVar, e)) {
                fve.e("LiveCardPlayControl", "播放视频的条件没达到");
                return;
            }
            boolean playVideo = e.playVideo(null, null);
            fve.e("LiveCardPlayControl", "start play live video result = " + playVideo);
        } catch (Exception e2) {
            e2.printStackTrace();
            fve.c("LiveCardPlayControl", "play Live video exception", e2);
        }
    }

    public final boolean d(cfc cfcVar, xwg xwgVar, TBLiveOpenCardView tBLiveOpenCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eec6c881", new Object[]{this, cfcVar, xwgVar, tBLiveOpenCardView})).booleanValue();
        }
        if (!this.f23642a.a(cfcVar, xwgVar)) {
            fve.e("LiveCardPlayControl", "video相关的配置不对");
            return false;
        } else if (!this.f23642a.b(tBLiveOpenCardView)) {
            fve.e("LiveCardPlayControl", "上下文未初始化");
            return false;
        } else if (!this.f23642a.c(tBLiveOpenCardView, xwgVar)) {
            fve.e("LiveCardPlayControl", "can not play under current network");
            return false;
        } else if (!this.f23642a.e(tBLiveOpenCardView.getContext())) {
            fve.e("LiveCardPlayControl", "can not play under current network");
            return false;
        } else if (!tBLiveOpenCardView.isPlaying()) {
            return true;
        } else {
            fve.e("LiveCardPlayControl", "视频正在播放中，取消播放");
            return false;
        }
    }
}
