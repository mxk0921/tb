package tb;

import android.content.Context;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.ability.impl.rocketbundle.RocketBundleAbility;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.android.abilitykit.mega.MegaHubBuilder;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.tbabilitykit.BatchCompExposureAbility;
import com.taobao.android.tbabilitykit.dx.webview.DXWebViewAbilityAbility;
import com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule;
import com.taobao.android.tbabilitykit.windvane.pop.render.TAKAbilityHubPlugin;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.common.TypeModuleFactory;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.h8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k4r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22399a = false;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements rsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.k4r$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0963a implements k1c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j1c f22400a;
            public final /* synthetic */ c48 b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ DXRenderOptions d;

            public C0963a(a aVar, j1c j1cVar, c48 c48Var, Context context, DXRenderOptions dXRenderOptions) {
                this.f22400a = j1cVar;
                this.b = c48Var;
                this.c = context;
                this.d = dXRenderOptions;
            }

            @Override // tb.k1c
            public void a(DXRootView dXRootView) {
                j1c j1cVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                    return;
                }
                DXResult<DXRootView> i1 = this.b.h().i1(this.c, dXRootView, dXRootView.getDxTemplateItem(), null, -1, this.d);
                if (i1.f7291a != null && !i1.d() && (j1cVar = this.f22400a) != null) {
                    j1cVar.a(i1.f7291a);
                }
            }

            @Override // tb.k1c
            public void b(String str, f fVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
                    return;
                }
                j1c j1cVar = this.f22400a;
                if (j1cVar != null) {
                    j1cVar.onError(str);
                }
            }
        }

        public void a(Context context, JSONObject jSONObject, String str, String str2, DinamicXEngine dinamicXEngine, j1c j1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("723a4e37", new Object[]{this, context, jSONObject, str, str2, dinamicXEngine, j1cVar});
            } else if (str != null && context != null && jSONObject != null) {
                c48 c48Var = new c48(context, new p18(jSONObject), str, str2, dinamicXEngine);
                c48Var.g(new C0963a(this, j1cVar, c48Var, context, new DXRenderOptions.b().q()));
            }
        }
    }

    static {
        t2o.a(786432050);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155312f6", new Object[0]);
            return;
        }
        h8.b bVar = new h8.b();
        HashMap<String, w8> hashMap = new HashMap<>(200);
        MegaHubBuilder megaHubBuilder = new MegaHubBuilder("MTOP", MtopAbility.API_REQUEST_DATA, new n5j());
        hashMap.put("36174867460", megaHubBuilder);
        hashMap.put("mtop", megaHubBuilder);
        q8 q8Var = new q8(m4r.class);
        hashMap.put("startLocationService", q8Var);
        hashMap.put(m4r.STARTLOCATIONSERVICE, q8Var);
        q8 q8Var2 = new q8(j4r.class);
        hashMap.put("checkLocationService", q8Var2);
        hashMap.put(j4r.CHECKLOCATIONSERVICE, q8Var2);
        q8 q8Var3 = new q8(s4r.class);
        hashMap.put("sendBroadcast", q8Var3);
        hashMap.put(s4r.SENDBROADCAST, q8Var3);
        MegaHubBuilder megaHubBuilder2 = new MegaHubBuilder("SharePannel", "open", new njp());
        hashMap.put("openShare", megaHubBuilder2);
        hashMap.put("-5311945073853041490", megaHubBuilder2);
        vhi vhiVar = new vhi(new qq(BatchCompExposureAbility.class), BatchCompExposureAbility.API_BATCH_COMP_EXPOSURE);
        hashMap.put(BatchCompExposureAbility.BATCH_COMP_EXPOSURE, vhiVar);
        hashMap.put(BatchCompExposureAbility.API_BATCH_COMP_EXPOSURE, vhiVar);
        hashMap.put("2783373117543948173", new MegaHubBuilder("zCache", "prefetch"));
        hashMap.put(ndm.SHOWPOPLAYER, new vhi(new qq(ndm.class), "show"));
        MegaHubBuilder megaHubBuilder3 = new MegaHubBuilder("stdPop", StdPopAbility.API_WEEX2);
        hashMap.put("6247991069320077767", megaHubBuilder3);
        hashMap.put("showWeex2Pop", megaHubBuilder3);
        MegaHubBuilder megaHubBuilder4 = new MegaHubBuilder("stdPop", StdPopAbility.API_CHG_SIZE);
        hashMap.put("9130609484923694635", megaHubBuilder4);
        hashMap.put("changeSTDPopSize", megaHubBuilder4);
        MegaHubBuilder megaHubBuilder5 = new MegaHubBuilder("stdPop", StdPopAbility.API_DX);
        hashMap.put("3986215614396433045", megaHubBuilder5);
        hashMap.put("showDxPop", megaHubBuilder5);
        MegaHubBuilder megaHubBuilder6 = new MegaHubBuilder("stdPop", StdPopAbility.API_STD_DX);
        hashMap.put("6190661440942079171", megaHubBuilder6);
        hashMap.put("showStdDXPop", megaHubBuilder6);
        hashMap.put("showStdDxPop", megaHubBuilder6);
        MegaHubBuilder megaHubBuilder7 = new MegaHubBuilder("stdPop", StdPopAbility.API_WEEX);
        hashMap.put("3531760516767156884", megaHubBuilder7);
        hashMap.put(o3w.OPERATE_SHOW_WEEX_POP, megaHubBuilder7);
        MegaHubBuilder megaHubBuilder8 = new MegaHubBuilder("stdPop", StdPopAbility.API_H5);
        hashMap.put("-2141506650088772581", megaHubBuilder8);
        hashMap.put(jht.actionShowWindVanePop, megaHubBuilder8);
        MegaHubBuilder megaHubBuilder9 = new MegaHubBuilder("stdPop", StdPopAbility.API_ULTRON);
        hashMap.put("5675667486637347457", megaHubBuilder9);
        hashMap.put("showUltronPop", megaHubBuilder9);
        MegaHubBuilder megaHubBuilder10 = new MegaHubBuilder("stdPop", StdPopAbility.API_NATIVE);
        hashMap.put("3120050928529867108", megaHubBuilder10);
        hashMap.put("showNativePop", megaHubBuilder10);
        MegaHubBuilder megaHubBuilder11 = new MegaHubBuilder("stdPop", "close");
        hashMap.put("-5054721624037696157", megaHubBuilder11);
        hashMap.put("dismissStdPop", megaHubBuilder11);
        hashMap.put("-8725661404328822574", megaHubBuilder11);
        hashMap.put("dismissWeexPop", megaHubBuilder11);
        hashMap.put("-2460236430925693351", megaHubBuilder11);
        hashMap.put("dismissWindVanePop", megaHubBuilder11);
        hashMap.put("1450428148730664147", megaHubBuilder11);
        hashMap.put("dismissDxPop", megaHubBuilder11);
        MegaHubBuilder megaHubBuilder12 = new MegaHubBuilder("actionSheet", "show");
        MegaHubBuilder megaHubBuilder13 = new MegaHubBuilder("actionSheet", "hide");
        hashMap.put("5287615107804184871", megaHubBuilder12);
        hashMap.put("-4433317478730044928", megaHubBuilder13);
        MegaHubBuilder megaHubBuilder14 = new MegaHubBuilder("broadcast", "addEventListener");
        MegaHubBuilder megaHubBuilder15 = new MegaHubBuilder("broadcast", "dispatchEvent");
        MegaHubBuilder megaHubBuilder16 = new MegaHubBuilder("broadcast", "removeEventListener");
        hashMap.put("-2919304423709841379", megaHubBuilder14);
        hashMap.put("-2389238501438587909", megaHubBuilder15);
        hashMap.put("8151353824511600005", megaHubBuilder16);
        hashMap.put("-1539189599379090005", new MegaHubBuilder("kvStorage", pg1.ATOM_EXT_clear));
        hashMap.put("907788072915818654", new MegaHubBuilder("kvStorage", "getAllKeys"));
        hashMap.put("-1412245266610504100", new MegaHubBuilder("kvStorage", RocketBundleAbility.API_GET_CURRENT_INFO));
        hashMap.put("4255344915554475637", new MegaHubBuilder("kvStorage", "getItem"));
        hashMap.put("36941670233356486", new MegaHubBuilder("kvStorage", "removeItem"));
        hashMap.put("7761715384706918017", new MegaHubBuilder("kvStorage", "setItem"));
        hashMap.put("-2537001326812726218", new MegaHubBuilder(AttributionReporter.SYSTEM_PERMISSION, "check"));
        hashMap.put("-3773705679919406269", new MegaHubBuilder(AttributionReporter.SYSTEM_PERMISSION, "request"));
        hashMap.put("7826242793715424349", new MegaHubBuilder("location", "getCache"));
        hashMap.put("-3650228991512889007", new MegaHubBuilder("location", "request"));
        hashMap.put("-1643122694260496165", new MegaHubBuilder("system", "openLocationSettings"));
        MegaHubBuilder megaHubBuilder17 = new MegaHubBuilder("appMonitor", "alarmSuccess", new p71());
        hashMap.put("6178545469881757715", megaHubBuilder17);
        hashMap.put(z71.TYPE_SUCCESS, megaHubBuilder17);
        MegaHubBuilder megaHubBuilder18 = new MegaHubBuilder("appMonitor", "alarmFail", new p71());
        hashMap.put("617925804773697203", megaHubBuilder18);
        hashMap.put(z71.TYPE_FAIL, megaHubBuilder18);
        MegaHubBuilder megaHubBuilder19 = new MegaHubBuilder("appMonitor", IWXUserTrackAdapter.COUNTER, new p71());
        hashMap.put("-3175030764863182054", megaHubBuilder19);
        hashMap.put(z71.TYPE_COUNTER, megaHubBuilder19);
        q8 q8Var4 = new q8(dl6.class);
        hashMap.put("dxUpdateTemplate", q8Var4);
        hashMap.put(dl6.DXDXUPDATETEMPLATE_DXUPDATETEMPLATE, q8Var4);
        q8 q8Var5 = new q8(usn.class);
        hashMap.put("recyclerUpdateState", q8Var5);
        hashMap.put(usn.RECYCLERUPDATESTATE, q8Var5);
        q8 q8Var6 = new q8(dsn.class);
        hashMap.put("recyclerAppendItems", q8Var6);
        hashMap.put(dsn.RECYCLERAPPENDITEMS, q8Var6);
        q8 q8Var7 = new q8(fsn.class);
        hashMap.put("recyclerDeleteItems", q8Var7);
        hashMap.put(fsn.RECYCLERDELETEITEMS, q8Var7);
        q8 q8Var8 = new q8(gsn.class);
        hashMap.put("recyclerInsertItems", q8Var8);
        hashMap.put(gsn.DXRECYCLERINSERTITEMS, q8Var8);
        q8 q8Var9 = new q8(hsn.class);
        hashMap.put("recyclerInsertItemsByOffset", q8Var9);
        hashMap.put(hsn.RECYCLERINSERTITEMSBYOFFSET, q8Var9);
        q8 q8Var10 = new q8(rsn.class);
        hashMap.put("recyclerUpdateAllItems", q8Var10);
        hashMap.put(rsn.RECYCLERUPDATEALLITEMS, q8Var10);
        q8 q8Var11 = new q8(ssn.class);
        hashMap.put("recyclerUpdateCurrentItem", q8Var11);
        hashMap.put(ssn.RECYCLERUPDATECURRENTITEM, q8Var11);
        q8 q8Var12 = new q8(osn.class);
        hashMap.put("recyclerRefreshData", q8Var12);
        hashMap.put(osn.RECYCLERREFRESHDATA, q8Var12);
        q8 q8Var13 = new q8(tsn.class);
        hashMap.put("recyclerUpdateItems", q8Var13);
        hashMap.put(tsn.RECYCLERUPDATEITEMS, q8Var13);
        q8 q8Var14 = new q8(qsn.class);
        hashMap.put("recyclerScrollToPosition", q8Var14);
        hashMap.put(qsn.RECYCLER_SCROLL_TO_POSITION, q8Var14);
        q8 q8Var15 = new q8(ksn.class);
        hashMap.put("recyclerModifyCurrentItemData", q8Var15);
        hashMap.put(ksn.RECYCLERMODIFYCURRENTITEMDATA, q8Var15);
        q8 q8Var16 = new q8(q76.class);
        hashMap.put("partialUpdateTemplate", q8Var16);
        hashMap.put(q76.DX_PARTIAL_UPDATE, q8Var16);
        q8 q8Var17 = new q8(ia6.class);
        hashMap.put("refreshTemplate", q8Var17);
        hashMap.put(ia6.REFRESHTEMPLATE, q8Var17);
        q8 q8Var18 = new q8(ym6.class);
        hashMap.put("viewPagerChangeIndex", q8Var18);
        hashMap.put(ym6.VIEWPAGERCHANGEINDEX, q8Var18);
        q8 q8Var19 = new q8(zv5.class);
        hashMap.put("exposureAbility", q8Var19);
        hashMap.put(zv5.EXPOSURE_ABILITY, q8Var19);
        q8 q8Var20 = new q8(pm6.class);
        hashMap.put("videoControlAbility", q8Var20);
        hashMap.put(pm6.VIDEO_CONTROL_ABILITY, q8Var20);
        q8 q8Var21 = new q8(DXWebViewAbilityAbility.class);
        hashMap.put("DXWebViewAbility", q8Var21);
        hashMap.put(DXWebViewAbilityAbility.DXWEBVIEWABILITY, q8Var21);
        q8 q8Var22 = new q8(sm6.class);
        hashMap.put("DXVideoViewAbility", q8Var22);
        hashMap.put(sm6.DXVIDEOVIEWABILITY, q8Var22);
        bVar.k(hashMap);
        bVar.i(new l4r());
        bVar.j(new t4r());
        bVar.h(new r4r());
        bVar.l(new n4r());
        bVar.m(new e48());
        y7.h(bVar.g());
        c();
        nii niiVar = nii.INSTANCE;
        niiVar.d(new e48());
        niiVar.c(new a());
        d48.INSTANCE.e(mii.NAME_SPACE_MEGA_DESIGN, mii.class);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f22399a) {
            try {
                a();
            } catch (Throwable th) {
                TLog.loge("AbilityKit", "TbAkInit", "init exp:" + pr.d(th));
            }
            f22399a = true;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f173ac4", new Object[0]);
        } else if (b.compareAndSet(false, true)) {
            try {
                WXSDKEngine.registerModule("abilityHub", (ModuleFactory) new TypeModuleFactory(TAKAbilityHubModule.class), true);
            } catch (Throwable th) {
                if (!(th instanceof NoClassDefFoundError)) {
                    th.printStackTrace();
                }
            }
            try {
                fsw.h("AbilityHub", TAKAbilityHubPlugin.class);
            } catch (Throwable th2) {
                if (!(th2 instanceof NoClassDefFoundError)) {
                    th2.printStackTrace();
                }
            }
        }
    }
}
