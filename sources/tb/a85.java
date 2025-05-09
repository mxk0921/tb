package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.media.MediaConstant;
import java.util.HashMap;
import org.json.JSONObject;
import tb.b85;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a85 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_START_MEDIA_SET_KEEP_SCREEN_ON = "keepScreenOnDoNotCarePlayerState";

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f15590a;
    public final prp b;

    static {
        t2o.a(468714069);
        t2o.a(468714514);
    }

    public a85(prp prpVar) {
        this.f15590a = prpVar.U();
        this.b = prpVar;
    }

    public final atb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("6b4fcd9e", new Object[]{this});
        }
        ir9.b("DWInstanceCreateManager", "PickPreloadController创建播放器" + this.b.D1().m() + "，url：" + this.b.D1().w() + "id:" + this.b.P() + ",使用sameCreator:" + c5g.g());
        if (!(this.b.R() instanceof Activity)) {
            FluidException.throwException(this.f15590a, FluidInstance.INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY);
            ir9.b("DWInstanceCreateManager", "创建 DWInstance 播放器失败，context 不是 activity");
            return null;
        } else if (c5g.g()) {
            return b();
        } else {
            return c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.atb b() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a85.b():tb.atb");
    }

    public atb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("26b6f08b", new Object[]{this});
        }
        return a();
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("534d0fb9", new Object[]{this});
        }
        prp prpVar = this.b;
        if (prpVar == null || prpVar.D1() == null) {
            return "";
        }
        String u = this.b.D1().u();
        if (f()) {
            return hnn.VALUE_TB_VIDEO_URL;
        }
        return u;
    }

    public final atb c() {
        DWAspectRatio dWAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("a41db51d", new Object[]{this});
        }
        int f = this.b.T().f();
        b85.b bVar = new b85.b((Activity) this.b.R());
        if (!f()) {
            bVar.s(this.b.D1().t());
        }
        mfj.b(bVar, this.b.U());
        bVar.v(this.b.G1().c().d);
        bVar.j(this.b.G1().c().c);
        if (this.b.G1().c().f == ImageView.ScaleType.CENTER_CROP) {
            dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
        } else {
            dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
        }
        bVar.r(dWAspectRatio);
        bVar.h(DWInstanceType.PIC);
        bVar.e(true);
        bVar.n(true);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("keepScreenOnDoNotCarePlayerState", "true");
        if (aps.l()) {
            hashMap.put(MediaConstant.USE_SETUP_DECODER_EARLY_BY_CONTROL_PARAM, "true");
            hashMap.put(MediaConstant.USE_OPEN_DEVICE_EARLY_BY_CONTROL_PARAM, "true");
            ir9.b("DWInstanceCreateManager", "使用 PlayerSetupDecoderOPT");
        }
        if (aps.m()) {
            hashMap.put("useMediaInfoLength", "true");
            ir9.b("DWInstanceCreateManager", "使用 PlayerUseMediaInfoLength");
        }
        if (aps.c()) {
            hashMap.put("useCacheLengthNew", "true");
            ir9.b("DWInstanceCreateManager", "使用 useCacheLengthNew");
        }
        if (aps.k()) {
            hashMap.put("useNewUrlPolicy", "true");
            ir9.b("DWInstanceCreateManager", "使用 useNewUrlPolicy");
        }
        if (aps.n()) {
            hashMap.put("useRealVideoLength", "true");
            ir9.b("DWInstanceCreateManager", "使用 useRealVideoLength");
        }
        bVar.g(hashMap);
        boolean isFirstSetUTParams = ((ITrackService) this.f15590a.getService(ITrackService.class)).isFirstSetUTParams();
        ((ITrackService) this.f15590a.getService(ITrackService.class)).setFirstSetUTParams(false);
        bVar.o(d5w.k(this.b.U(), f, this.b.D1().f7800a, isFirstSetUTParams, true));
        this.b.A1().u(f);
        String playScenes = this.f15590a.getInstanceConfig().getPlayScenes();
        pep sessionParams = ((ISceneConfigService) this.b.U().getService(ISceneConfigService.class)).getSessionParams();
        String str = sessionParams != null ? sessionParams.c : null;
        if (this.b.D1().o()) {
            bVar.k(true);
            bVar.u(this.b.D1().w());
        } else if (!f()) {
            String m = this.b.D1().m();
            if (!TextUtils.isEmpty(m)) {
                ir9.b("DWInstanceCreateManager", "PickPreloadController创建播放器使用播控");
                try {
                    bVar.l(new JSONObject(m));
                } catch (Exception e) {
                    ir9.c("DWInstanceCreateManager", "", e);
                }
            } else {
                ir9.b("DWInstanceCreateManager", "PickPreloadController创建播放器播控为null");
            }
        } else if (f()) {
            bVar.u(this.b.D1().w());
            bVar.t(e());
        }
        bVar.p(playScenes);
        if (str != null) {
            bVar.f(str);
        }
        bVar.q(this.b.A1().n(this.b.D1()));
        atb c = bVar.c();
        if (pto.h(this.b.U())) {
            HashMap<String, String> hashMap2 = new HashMap<>(1);
            hashMap2.put("bizGroup", "guangguang_fullscreen");
            c.p(hashMap2);
        }
        HashMap<String, String> hashMap3 = new HashMap<>(1);
        hashMap3.put("optSourcerPipeSize", "true");
        c.p(hashMap3);
        ((IMediaService) this.f15590a.getService(IMediaService.class)).getConfig().f(true);
        c.i(DWInstanceType.VIDEO);
        ((ISharePlayerService) this.b.U().getService(ISharePlayerService.class)).setHasCreateDWInstance(true);
        return c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a75dd21", new Object[]{this})).booleanValue();
        }
        prp prpVar = this.b;
        return (prpVar == null || prpVar.D1() == null || !TextUtils.equals(this.b.D1().v(), "url")) ? false : true;
    }
}
