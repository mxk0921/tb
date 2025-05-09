package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ar9;
import tb.g8w;
import tb.grm;
import tb.ir9;
import tb.ntm;
import tb.nwv;
import tb.ryr;
import tb.sj4;
import tb.sv2;
import tb.t2o;
import tb.vrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IconStreamPreloadTask extends BasePreloadTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;

    static {
        t2o.a(468714701);
    }

    public IconStreamPreloadTask(FluidContext fluidContext, Context context, JSONObject jSONObject, grm grmVar) {
        super(fluidContext, context, jSONObject, grmVar);
        this.l = true;
        this.m = true;
        this.n = false;
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        this.o = jSONObject.getIntValue("duration");
        if (jSONObject2 != null) {
            this.k = nwv.I(jSONObject2.get("videoId"), null);
            this.l = nwv.o(jSONObject2.get("requestPlayControl"), true);
            this.m = nwv.o(jSONObject2.get("createPlayer"), true);
            this.n = nwv.o(jSONObject2.get("preDownload"), false);
        }
        ir9.b("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "IconStreamPreloadTask PickPreloadControllerNew, info=" + jSONObject2);
    }

    public static /* synthetic */ Object ipc$super(IconStreamPreloadTask iconStreamPreloadTask, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return iconStreamPreloadTask.toString();
            case -798600422:
                return iconStreamPreloadTask.getPreloadVideoData();
            case -512593800:
                return iconStreamPreloadTask.getContext();
            case 299334352:
                iconStreamPreloadTask.a((ntm) objArr[0], (sv2) objArr[1]);
                return null;
            case 462157602:
                return new Boolean(iconStreamPreloadTask.b((JSONObject) objArr[0]));
            case 1777338802:
                iconStreamPreloadTask.n((String) objArr[0], objArr[1]);
                return null;
            case 2019319885:
                return iconStreamPreloadTask.i();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/task/IconStreamPreloadTask");
        }
    }

    public static /* synthetic */ boolean p(IconStreamPreloadTask iconStreamPreloadTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da0022d4", new Object[]{iconStreamPreloadTask})).booleanValue();
        }
        return iconStreamPreloadTask.m;
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void c(final sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d7286e", new Object[]{this, sv2Var});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType()));
        hashMap.put("videoId", this.k);
        JSONObject jSONObject = this.f7899a;
        if (jSONObject != null) {
            hashMap.put("extraParams", Uri.encode(jSONObject.toJSONString()));
        }
        ir9.b("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "[preloadvideo]IconStreamPreloadTask execute. videoId=" + this.k + " requestPlayControl=" + this.l);
        if (TextUtils.isEmpty(this.k) || !this.l) {
            g(this.f7899a, this.o, hashMap, this.n, this.m, sv2Var);
            return;
        }
        ir9.b("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "request PlayControl");
        ryr.b(this.b, null, "gg_pickpreload_request_videoinfo");
        g8w.f(this.k, sj4.PLAY_SCENES, "ggpick_preload", false, new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.preload.task.IconStreamPreloadTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ir9.b("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "requestCloudVideoInfo onError,code:" + mtopResponse.getRetCode());
                IconStreamPreloadTask.this.m(sv2Var);
                FluidException.throwException(IconStreamPreloadTask.this.c, ar9.ICON_STREAM_REQUEST_VIDEO_INFO_ERROR, mtopResponse.getRetCode());
                ryr.c(IconStreamPreloadTask.this.b, null, "gg_pickpreload_request_videoinfo", mtopResponse.getRetCode(), hashMap);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ir9.b("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "[preloadvideo]PickPreloadControllerNew,requestCloudVideoInfo success");
                ryr.d(IconStreamPreloadTask.this.b, null, "gg_pickpreload_request_videoinfo", hashMap);
                String k = vrl.k(mtopResponse, null, true);
                IconStreamPreloadTask iconStreamPreloadTask = IconStreamPreloadTask.this;
                iconStreamPreloadTask.o(null, null, IconStreamPreloadTask.p(iconStreamPreloadTask), k, IconStreamPreloadTask.this.f7899a, hashMap, sv2Var);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ir9.b("PickPreloadController_IconStreamPreloadTask_PreloadVideoModule", "requestCloudVideoInfo onSystemError");
                IconStreamPreloadTask.this.m(sv2Var);
                FluidException.throwException(IconStreamPreloadTask.this.c, ar9.ICON_STREAM_REQUEST_VIDEO_INFO_ERROR, mtopResponse.getRetCode());
                ryr.c(IconStreamPreloadTask.this.b, null, "gg_pickpreload_request_videoinfo", mtopResponse.getRetCode(), hashMap);
            }
        });
    }
}
