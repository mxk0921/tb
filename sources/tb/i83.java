package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.business.videocollection.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IUTAdapter;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class i83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f21150a;
        public final /* synthetic */ s83 b;

        public a(vrp vrpVar, s83 s83Var) {
            this.f21150a = vrpVar;
            this.b = s83Var;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else if (this.f21150a.g != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "failed");
                this.f21150a.g.b(this.b, jSONObject);
                ir9.b("CardNativeMessageHandler", "【requestCollectionNextVideo】recommend api request failed");
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (this.f21150a.g != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "success");
                this.f21150a.g.b(this.b, jSONObject);
                ir9.b("CardNativeMessageHandler", "【requestCollectionNextVideo】recommend api request success");
            }
        }
    }

    static {
        t2o.a(468713914);
    }

    public static void a(FluidContext fluidContext, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4302113c", new Object[]{fluidContext, vrpVar});
        } else if (vrpVar == null) {
            ir9.b("CardNativeMessageHandler", "【clearCollectionNextVideo】The param mediaController or message is null");
        } else {
            ((ICollectionService) fluidContext.getService(ICollectionService.class)).cancelPlayCollectionNextVideo();
        }
    }

    public static void b(FluidContext fluidContext, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e76b0dd", new Object[]{fluidContext, vrpVar});
        } else if (vrpVar == null) {
            ir9.b("CardNativeMessageHandler", "【clearCollectionNextVideo】The param mediaController or message is null");
        } else {
            ((ICollectionService) fluidContext.getService(ICollectionService.class)).clearCollectionNextVideo();
        }
    }

    public static void c(uq9 uq9Var, vrp vrpVar) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba4be5e", new Object[]{uq9Var, vrpVar});
            return;
        }
        try {
            boolean equals = "true".equals(vrpVar.h.get("isDPV"));
            String str = (String) vrpVar.h.get("pageName");
            int parseInt = Integer.parseInt((String) vrpVar.h.get("eventId"));
            String str2 = (String) vrpVar.h.get("arg1");
            String str3 = (String) vrpVar.h.get("arg2");
            String str4 = (String) vrpVar.h.get("arg3");
            JSONObject jSONObject = (JSONObject) vrpVar.h.get("utArgs");
            HashMap hashMap = new HashMap();
            if (equals) {
                map = ((ITrackService) uq9Var.U().getService(ITrackService.class)).getDPVCommonTrack();
            } else {
                map = ((ITrackService) uq9Var.U().getService(ITrackService.class)).getThisCardCommonTrack(uq9Var);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
            IUTAdapter withFluidContext = FluidSDK.getUTAdapter().withFluidContext(uq9Var.U());
            if (TextUtils.isEmpty(str)) {
                str = "Page_videointeract";
            }
            withFluidContext.trackCustom(str, parseInt, str2, str3, str4, hashMap);
        } catch (Exception e) {
            ir9.c("CardNativeMessageHandler", "ShortVideoMessage.MSG_COMMIT_UT error", e);
            e.printStackTrace();
        }
    }

    public static Map e(FluidContext fluidContext, ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5cce25d", new Object[]{fluidContext, viewGroup, str});
        }
        if (TextUtils.equals(str, "moreButton")) {
            return f(((IContainerService) fluidContext.getService(IContainerService.class)).getMoreButton(), viewGroup);
        }
        return new HashMap();
    }

    public static ncp g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ncp) ipChange.ipc$dispatch("30f3288f", new Object[]{fluidContext});
        }
        return ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80f3285b", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableSetPlayerVolume", true);
    }

    public static void i(FluidContext fluidContext, kep kepVar, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552deb3f", new Object[]{fluidContext, kepVar, vrpVar});
            return;
        }
        ncp g = g(fluidContext);
        if (b93.C() || !g.a()) {
            Map map = vrpVar.h;
            Boolean bool = Boolean.FALSE;
            if (map.get("triggerFromModel") != null) {
                try {
                    Boolean bool2 = (Boolean) map.get("triggerFromModel");
                    try {
                        map.remove("triggerFromModel");
                        bool = bool2;
                    } catch (Error unused) {
                        bool = bool2;
                        ir9.b("CardNativeMessageHandler", "triggerFromModel 数据异常");
                        d(fluidContext, bool, kepVar.b(vrpVar.d), map);
                    }
                } catch (Error unused2) {
                }
            }
            d(fluidContext, bool, kepVar.b(vrpVar.d), map);
        }
    }

    public static void j(uq9 uq9Var, vrp vrpVar, String str, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b82364", new Object[]{uq9Var, vrpVar, str, new Boolean(z), map});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
                FluidContext U = uq9Var.U();
                kep sessionIdRecorder = ((ICardService) uq9Var.U().getService(ICardService.class)).getSessionIdRecorder();
                if (sessionIdRecorder != null) {
                    int indexOfList = ((IDataService) U.getService(IDataService.class)).getIndexOfList(sessionIdRecorder.b(vrpVar.d));
                    List unmodifiableMediaSetList = ((IDataService) U.getService(IDataService.class)).getUnmodifiableMediaSetList();
                    if (!(unmodifiableMediaSetList == null || indexOfList == -1)) {
                        int totalCount = ((IDataService) U.getService(IDataService.class)).getTotalCount();
                        if (z) {
                            for (int i = indexOfList - 1; i >= 0 && !l(str, map, unmodifiableMediaSetList, i); i--) {
                            }
                            return;
                        }
                        do {
                            indexOfList++;
                            if (indexOfList >= totalCount) {
                                return;
                            }
                        } while (!l(str, map, unmodifiableMediaSetList, indexOfList));
                    }
                }
            }
        } catch (Throwable th) {
            ir9.c("CardNativeMessageHandler", "", th);
        }
    }

    public static void k(FluidContext fluidContext, s83 s83Var, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c79fe7", new Object[]{fluidContext, s83Var, vrpVar});
            return;
        }
        Map map = vrpVar.h;
        if (map == null) {
            ir9.b("CardNativeMessageHandler", "【requestCollectionNextVideo】The message args is null");
        } else {
            ((ICollectionService) fluidContext.getService(ICollectionService.class)).requestCollectionNextVideo(String.valueOf(map.get("nextNid")), new a(vrpVar, s83Var));
        }
    }

    public static boolean l(String str, Map map, List<com.taobao.android.fluid.framework.data.datamodel.a> list, int i) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38dd67cc", new Object[]{str, map, list, new Integer(i)})).booleanValue();
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar = list.get(i);
        if (aVar == null || (e = aVar.e()) == null || !str.equals(e.f())) {
            return false;
        }
        e.f7801a.putAll(map);
        return true;
    }

    public static void d(FluidContext fluidContext, Boolean bool, com.taobao.android.fluid.framework.data.datamodel.a aVar, Map map) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d55d3bb", new Object[]{fluidContext, bool, aVar, map});
            return;
        }
        ir9.b("CardNativeMessageHandler", "[动态推荐] feedBack args=" + map);
        if (aVar != null && map != null && (e = aVar.e()) != null) {
            Object obj = map.get("repeatable");
            Object obj2 = map.get("needVideo");
            map.remove("repeatable");
            map.remove("needVideo");
            String O = e.O();
            if (TextUtils.isEmpty(O)) {
                O = e.f();
            }
            iaw detailVideoPositiveFeedbackIdsModel = ((IDataService) fluidContext.getService(IDataService.class)).getDetailVideoPositiveFeedbackIdsModel();
            if (TextUtils.isEmpty(O)) {
                ir9.a("CardNativeMessageHandler", "positiveFeedback videoDetailInfo.videoId isEmpty");
                return;
            }
            if (!bool.booleanValue() && !nwv.o(obj, false)) {
                int videoProgress = ((IMediaService) fluidContext.getService(IMediaService.class)).getVideoProgress();
                if (e.C() && videoProgress < 3) {
                    ir9.b("CardNativeMessageHandler", "[动态推荐] 播放时长<3s, positiveFeedback currentVideoProgressInSecond=" + videoProgress);
                    return;
                } else if (detailVideoPositiveFeedbackIdsModel != null && detailVideoPositiveFeedbackIdsModel.b(O)) {
                    ir9.b("CardNativeMessageHandler", "[动态推荐] 已经正向反馈过，不重复发送 positiveFeedback videoId=" + O);
                    return;
                }
            }
            aon g = aon.g(((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams(), g(fluidContext));
            g.b = aVar;
            g.a(map);
            if (!((IDataService) fluidContext.getService(IDataService.class)).dynamicRecommend(g)) {
                return;
            }
            if ((obj2 == null || nwv.o(obj2, false)) && !bool.booleanValue()) {
                detailVideoPositiveFeedbackIdsModel.a(O);
            }
        }
    }

    public static Map f(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("639d5d3d", new Object[]{view, viewGroup});
        }
        if (view == null) {
            return new HashMap();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        float width = 750.0f / viewGroup.getWidth();
        HashMap hashMap = new HashMap(6);
        hashMap.put("x", Float.valueOf(i * width));
        hashMap.put("y", Float.valueOf(i2 * width));
        hashMap.put("width", Float.valueOf(view.getWidth() * width));
        hashMap.put("height", Float.valueOf(view.getHeight() * width));
        return hashMap;
    }
}
