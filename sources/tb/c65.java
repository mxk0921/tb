package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c65 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_videointeract";

    static {
        t2o.a(468713633);
    }

    public static void a(Map<String, String> map, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f254546f", new Object[]{map, hashMap});
        } else {
            map.put("utLogMap", hxf.d(hashMap));
        }
    }

    public static void c(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2270d7", new Object[]{map, new Integer(i)});
        } else {
            map.put("index", String.valueOf(i));
        }
    }

    public static void b(FluidContext fluidContext, HashMap<String, String> hashMap, a.d dVar) {
        MediaContentDetailData g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a101a62a", new Object[]{fluidContext, hashMap, dVar});
            return;
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        hashMap.put("x_object_type", "common_video_page");
        hashMap.put("common_video_page", sessionParams.c);
        hashMap.put("version", AfcCustomSdk.SDK_VERSION);
        if (!(dVar == null || (g = dVar.g()) == null)) {
            hashMap.put("x_object_id", g.id);
            if (dVar.C()) {
                hashMap.put("videoid", dVar.O());
            }
            if (vt6.h(g.trackInfo)) {
                hashMap.put("trackInfo", g.trackInfo);
            } else if (!TextUtils.isEmpty(sessionParams.n)) {
                hashMap.put("trackInfo", sessionParams.n);
            }
            hashMap.put("content_account_id", dVar.d());
            Map<String, String> map = g.utPairs;
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(g.utPairs);
            }
            if (!oau.h()) {
                hashMap.remove(yj4.PARAM_UT_PARAMS);
            }
        }
        if (j.o) {
            hashMap.put("is_tab", "1");
        } else {
            hashMap.put("is_tab", "0");
        }
        if (((IHostAppService) fluidContext.getService(IHostAppService.class)).getCurrentTabIndex() == 1) {
            hashMap.put("tab_name", "follow");
        } else {
            hashMap.put("tab_name", "recommend");
        }
    }

    public static void d(FluidContext fluidContext, Map<String, String> map, a.d dVar, int i) {
        String str;
        MediaContentDetailData g;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510932b", new Object[]{fluidContext, map, dVar, new Integer(i)});
            return;
        }
        map.clear();
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        map.put("spm", sj4.f28084a);
        map.put("spm-url", sessionParams.e);
        map.put("scm", sessionParams.o);
        if (!(dVar == null || (g = dVar.g()) == null)) {
            map.put("content_type", dVar.N());
            map.put("card_type", g.cardType);
            map.put("fluid_data_version", String.valueOf(dVar.g() == null ? -1 : dVar.g().currentDataVersion));
            MediaContentDetailData.Content content = g.content;
            if (!(content == null || (list = content.itemIds) == null || list.size() <= 0)) {
                String str2 = g.content.itemIds.get(0);
                if (!TextUtils.isEmpty(str2)) {
                    map.put("item_id", str2);
                }
            }
        }
        HashMap hashMap = new HashMap();
        b(fluidContext, hashMap, dVar);
        c(hashMap, i);
        a(map, hashMap);
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (!(j == null || (str = j.f24645a) == null)) {
            map.put(IStorage.TYPE_DSL, str.replace("/", "@"));
        }
        map.put("dsl_is_orange", "" + akt.B0());
        kgv kgvVar = kgv.INSTANCE;
        map.put("is_underage_mode", String.valueOf(kgvVar.h(fluidContext.getContext())));
        map.put("isSystemMinors", String.valueOf(kgvVar.g(fluidContext.getContext())));
        map.put("minorsAgeLevel", String.valueOf(kgvVar.b(fluidContext.getContext())));
        ITrackService iTrackService = (ITrackService) fluidContext.getService(ITrackService.class);
        map.put(yj4.PARAM_ENTRY_UT_PARAM, iTrackService.getUtparamUrl());
        map.put("entryUtparamPre", iTrackService.getUtparamPre());
        String tabId = fluidContext.getInstanceConfig().getTabId();
        map.put("tnode_tab_id", String.valueOf(tabId));
        ir9.b("TrackUtils", "initdpvCommonTrack tnodeTabId=" + tabId);
        sj4.a(map);
    }
}
