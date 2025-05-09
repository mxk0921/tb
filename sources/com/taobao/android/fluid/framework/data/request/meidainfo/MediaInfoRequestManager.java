package com.taobao.android.fluid.framework.data.request.meidainfo;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.atb;
import tb.g8w;
import tb.ij9;
import tb.ir9;
import tb.k75;
import tb.pep;
import tb.sj4;
import tb.src;
import tb.t2o;
import tb.vrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MediaInfoRequestManager implements src {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7803a;

    static {
        t2o.a(468714277);
        t2o.a(468714276);
    }

    public MediaInfoRequestManager(FluidContext fluidContext) {
        this.f7803a = fluidContext;
    }

    public static /* synthetic */ FluidContext a(MediaInfoRequestManager mediaInfoRequestManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("d24b905f", new Object[]{mediaInfoRequestManager});
        }
        return mediaInfoRequestManager.f7803a;
    }

    @Override // tb.src
    public void fetchVideoInfoAndPrecreateDwInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f797c6", new Object[]{this});
            return;
        }
        ir9.b("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() 单独请求播控");
        pep sessionParams = ((ISceneConfigService) this.f7803a.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            String str = sessionParams.d;
            if (!TextUtils.isEmpty(str)) {
                b.O(this.f7803a, "videoinfo_mtop_start", k75.VIDEOCONFIG_API_NAME);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                g8w.f(str, sj4.PLAY_SCENES, "ggpick_preload", false, new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.data.request.meidainfo.MediaInfoRequestManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        try {
                            b.R(MediaInfoRequestManager.a(MediaInfoRequestManager.this), "videoinfo_mtop_error", mtopResponse, SystemClock.elapsedRealtime() - elapsedRealtime);
                            ir9.b("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() error请求播控失败。" + mtopResponse.getRetCode() + " " + mtopResponse.getRetMsg());
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        try {
                            b.R(MediaInfoRequestManager.a(MediaInfoRequestManager.this), "videoinfo_mtop_error", mtopResponse, SystemClock.elapsedRealtime() - elapsedRealtime);
                            ir9.b("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() error请求播控失败。" + mtopResponse.getRetCode() + " " + mtopResponse.getRetMsg());
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        atb c;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        b.R(MediaInfoRequestManager.a(MediaInfoRequestManager.this), "videoinfo_mtop_end", mtopResponse, SystemClock.elapsedRealtime() - elapsedRealtime);
                        ir9.b("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance() onSuccess请求播控成功返回 " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        String k = vrl.k(mtopResponse, null, true);
                        ir9.b("MediaInfoRequestManager", "请求播控成功：videoResourceStr：" + (true ^ TextUtils.isEmpty(k)));
                        if (!TextUtils.isEmpty(k) && !((ISharePlayerService) MediaInfoRequestManager.a(MediaInfoRequestManager.this).getService(ISharePlayerService.class)).isHasCreateDWInstance() && (c = ij9.c(MediaInfoRequestManager.a(MediaInfoRequestManager.this), MediaInfoRequestManager.a(MediaInfoRequestManager.this).getContext(), null, null, 0, 0, k, null, null, null, false)) != null) {
                            ir9.b("MediaInfoRequestManager", "VideoProcess fetchVideoInfoAndPrecreateDwInstance 播控分离，创建播放器。idwInstance=" + c);
                            ((ISharePlayerService) MediaInfoRequestManager.a(MediaInfoRequestManager.this).getService(ISharePlayerService.class)).setDWInstance(c);
                        }
                    }
                });
            }
        }
    }
}
