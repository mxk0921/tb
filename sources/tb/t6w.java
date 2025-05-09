package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.media.dwinstance.creator.DW_SCENE_ENUM;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.kirinvideoengine.model.ConfigModel;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.media.MediaConstant;
import com.taobao.taobao.R;
import java.util.HashMap;
import org.json.JSONObject;
import tb.b85;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t6w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714524);
    }

    public static HashMap<String, String> a(FluidContext fluidContext, DW_SCENE_ENUM dw_scene_enum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ab8056ec", new Object[]{fluidContext, dw_scene_enum});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("keepScreenOnDoNotCarePlayerState", "true");
        if (aps.l()) {
            hashMap.put(MediaConstant.USE_SETUP_DECODER_EARLY_BY_CONTROL_PARAM, "true");
            hashMap.put(MediaConstant.USE_OPEN_DEVICE_EARLY_BY_CONTROL_PARAM, "true");
        }
        if (aps.m()) {
            hashMap.put("useMediaInfoLength", "true");
        }
        if (aps.c()) {
            hashMap.put("useCacheLengthNew", "true");
        }
        if (aps.k()) {
            hashMap.put("useNewUrlPolicy", "true");
        }
        if (aps.n()) {
            hashMap.put("useRealVideoLength", "true");
        }
        if (!dw_scene_enum.isInList() && Math.random() < aps.D()) {
            hashMap.put("NoUseProxyByControl", "true");
        }
        return hashMap;
    }

    public static HashMap<String, String> b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("23b81701", new Object[]{fluidContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("optSourcerPipeSize", "true");
        if (pto.h(fluidContext)) {
            hashMap.put("bizGroup", "guangguang_fullscreen");
        }
        return hashMap;
    }

    public static atb c(FluidContext fluidContext, Context context, DW_SCENE_ENUM dw_scene_enum, boolean z, String str, String str2, JSONObject jSONObject, r8e r8eVar, String str3, String str4, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object obj;
        long j;
        atb atbVar;
        FluidContext fluidContext2;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("8c26c37", new Object[]{fluidContext, context, dw_scene_enum, new Boolean(z), str, str2, jSONObject, r8eVar, str3, str4, hashMap, hashMap2});
        }
        if (kfj.b(fluidContext)) {
            bool2 = Boolean.TRUE;
            bool = Boolean.FALSE;
        } else {
            bool2 = null;
            bool = null;
        }
        if (!dw_scene_enum.isInList()) {
            if (FluidInstanceConfig.CONTAINER_NAME_SHOP_LOFT.equals(fluidContext.getInstanceConfig().getBizType())) {
                Boolean bool4 = Boolean.FALSE;
                bool2 = Boolean.TRUE;
                bool3 = bool4;
                ir9.b("VideoDwInstanceCreator", "店铺二楼，set initMute initMute=false");
            } else {
                bool2 = bool2;
                bool3 = null;
            }
            if (dw_scene_enum.isBeforeContainer()) {
                bool3 = Boolean.TRUE;
            }
        } else {
            bool3 = null;
        }
        boolean isBeforeContainer = dw_scene_enum.isBeforeContainer();
        String playScenes = fluidContext.getInstanceConfig().getPlayScenes();
        HashMap<String, String> a2 = a(fluidContext, dw_scene_enum);
        HashMap<String, String> b = b(fluidContext);
        boolean isBeforeContainer2 = dw_scene_enum.isBeforeContainer();
        boolean c = c5g.c("video");
        boolean d = c5g.d("video");
        StringBuilder sb = new StringBuilder("createInstance: scene:");
        sb.append(dw_scene_enum);
        sb.append(",enableKirin:");
        sb.append(c);
        sb.append(",isLocalVideo:");
        sb.append(d);
        sb.append(",enableStd:");
        sb.append(z);
        sb.append(",videoId:");
        sb.append(str);
        sb.append(",videoUrl:");
        sb.append(str2);
        sb.append(",videoResObj:");
        sb.append(jSONObject != null);
        sb.append(",mute:");
        sb.append(bool3);
        sb.append(",useShortAudioFocus:");
        sb.append(bool2);
        sb.append(",releaseShortFocusWhenPause:");
        sb.append(bool);
        ir9.b("VideoDwInstanceCreator", sb.toString());
        if (d) {
            a2.putAll(b);
        }
        if (c) {
            EngineModel engineModel = new EngineModel();
            ConfigModel.a aVar = new ConfigModel.a();
            aVar.l(d);
            engineModel.configModel = aVar.i();
            DWAspectRatio dWAspectRatio = r8eVar.f == ImageView.ScaleType.CENTER_CROP ? DWAspectRatio.DW_CENTER_CROP : DWAspectRatio.DW_FIT_CENTER;
            if (d && dWAspectRatio != DWAspectRatio.DW_CENTER_CROP) {
                isBeforeContainer = true;
            }
            MediaModel.b bVar = new MediaModel.b(str);
            bVar.f0(str2).H("guangguang").J(str).b0(str).Q(z).T("DWVideo").d0(jSONObject).g0(r8eVar.d).a0(r8eVar.c).Z(dWAspectRatio).e0(str4).c0(playScenes).W(str3).M(true).N(true).K(a2).O(!isBeforeContainer);
            if (bool3 != null) {
                bVar.U(bool3);
            }
            if (bool2 != null) {
                bVar.P(bool2);
            }
            if (bool != null) {
                bVar.V(bool);
            }
            if (!isBeforeContainer2) {
                bVar.L("pic");
            }
            engineModel.utParams = hashMap;
            engineModel.playExpUTParams = hashMap2;
            engineModel.mediaModel = bVar.G();
            i5g i5gVar = new i5g(context);
            j2 = System.currentTimeMillis();
            d(dw_scene_enum);
            qic m = i5gVar.m(engineModel, ((IMediaService) fluidContext.getService(IMediaService.class)).getKirinEngineDelegate());
            j = System.currentTimeMillis();
            atbVar = new d5g(m, i5gVar, engineModel);
            if (!d) {
                atbVar.p(b);
            }
            obj = IMediaService.class;
            fluidContext2 = fluidContext;
        } else {
            fluidContext2 = fluidContext;
            obj = IMediaService.class;
            b85.b bVar2 = new b85.b((Activity) context);
            bVar2.s(str);
            bVar2.u(str2);
            bVar2.k(z);
            bVar2.l(jSONObject);
            ir9.b("VideoDwInstanceCreator", "videoResJsonObj=" + jSONObject);
            bVar2.v(r8eVar.d);
            bVar2.j(r8eVar.c);
            bVar2.r(r8eVar.f == ImageView.ScaleType.CENTER_CROP ? DWAspectRatio.DW_CENTER_CROP : DWAspectRatio.DW_FIT_CENTER);
            bVar2.t(str4);
            bVar2.p(fluidContext.getInstanceConfig().getPlayScenes());
            bVar2.f(str3);
            bVar2.q(hashMap);
            bVar2.o(hashMap2);
            bVar2.e(true);
            bVar2.n(true);
            bVar2.g(a2);
            mfj.b(bVar2, fluidContext2);
            if (bool3 != null) {
                bVar2.m(bool3.booleanValue());
            }
            if (bool2 != null) {
                bVar2.a(bool2.booleanValue());
            }
            if (bool != null) {
                bVar2.b(bool.booleanValue());
            }
            bVar2.i(isBeforeContainer);
            if (!isBeforeContainer2) {
                bVar2.h(DWInstanceType.PIC);
            }
            ir9.b("VideoDwInstanceCreator", "before dw builder create, video id: " + str);
            j2 = System.currentTimeMillis();
            d(dw_scene_enum);
            atbVar = bVar2.c();
            j = System.currentTimeMillis();
            atbVar.p(b);
        }
        ir9.b("VideoDwInstanceCreator", "after dw builder create, video id: " + str + " , logToken: " + atbVar.t());
        ViewGroup view = atbVar.getView();
        view.setTag(R.id.fluid_sdk_tag_create_dw_pure_time, Long.valueOf(j - j2));
        view.setTag(R.id.fluid_sdk_tag_create_dw_before_time, Long.valueOf(j2));
        view.setTag(R.id.fluid_sdk_tag_create_dw_after_time, Long.valueOf(j));
        view.setTag(R.id.fluid_sdk_tag_prerender_videosize_object, r8eVar);
        atbVar.i(DWInstanceType.VIDEO);
        xau.s(fluidContext2, 0);
        if (sz3.e(hashMap2)) {
            ((ITrackService) fluidContext2.getService(ITrackService.class)).setFirstSetUTParams(false);
        }
        ((IMediaService) fluidContext2.getService(obj)).getConfig().f(true);
        ((ISharePlayerService) fluidContext2.getService(ISharePlayerService.class)).setHasCreateDWInstance(true);
        return atbVar;
    }

    public static void d(DW_SCENE_ENUM dw_scene_enum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712ee0ef", new Object[]{dw_scene_enum});
        } else if (aps.g() && dw_scene_enum.isBeforeContainer() && dw_scene_enum.isAfterClick() && p91.f() < aps.H()) {
            double b = lak.b(aps.E(), aps.F(), vu3.b.GEO_NOT_SUPPORT, aps.G());
            StringBuilder sb = new StringBuilder("mock dw cost time:");
            long j = (long) b;
            sb.append(j);
            ir9.b("VideoDwInstanceCreator", sb.toString());
            if (b > vu3.b.GEO_NOT_SUPPORT) {
                try {
                    Thread.sleep(j);
                } catch (Throwable th) {
                    ir9.c("VideoDwInstanceCreator", "mock dw cost error", th);
                }
            }
        }
    }
}
