package com.taobao.message.lab.comfrm.support.dinamic;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import tb.bew;
import tb.t2o;

/* compiled from: Taobao */
@IgnoreVirtualThread
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXAsyncCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DXAsyncCacheManager";
    public static boolean isOpen = true;
    public static boolean isOpenPostBeforeParsePrefetch = true;
    public static Set<String> uniqueId = Collections.newSetFromMap(new ConcurrentHashMap());
    public static LruCache<String, DXRootView> dxCache = new LruCache<>(50);
    private static ScheduledExecutorService preLoadPool = VExecutors.newScheduledThreadPool(2, new Schedules.MyThreadNameFactory("MessagePreload-DX"));
    private static boolean msgPreLoadDX = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "MsgPreLoadDX");

    static {
        t2o.a(537919774);
    }

    public static /* synthetic */ DXResult access$000(DinamicXEngine dinamicXEngine, Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("799acf38", new Object[]{dinamicXEngine, context, dXTemplateItem});
        }
        return dxCreateView(dinamicXEngine, context, dXTemplateItem);
    }

    public static void asyncRender(final Context context, final DinamicXEngine dinamicXEngine, final DXTemplateItem dXTemplateItem, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4adb925", new Object[]{context, dinamicXEngine, dXTemplateItem, obj});
            return;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.containsKey("VC_UNI_ID") && uniqueId.contains(jSONObject.getString("VC_UNI_ID"))) {
                return;
            }
        }
        if (!uniqueId.contains(Integer.valueOf(obj.hashCode()))) {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    DXResult access$000;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Object obj2 = obj;
                    if (obj2 instanceof JSONObject) {
                        str = ((JSONObject) obj2).getString("VC_UNI_ID");
                        if (DXAsyncCacheManager.uniqueId.contains(str)) {
                            return;
                        }
                    } else {
                        str = "";
                    }
                    if (!DXAsyncCacheManager.uniqueId.contains(String.valueOf(obj.hashCode()))) {
                        DXAsyncCacheManager.ban(obj);
                        TraceUtil.beginSection("DXASYNC-MSG-" + dXTemplateItem.f7343a);
                        DXRenderOptions.b bVar = new DXRenderOptions.b();
                        try {
                            access$000 = DXAsyncCacheManager.access$000(dinamicXEngine, context, dXTemplateItem);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (!access$000.d()) {
                            DXRootView dXRootView = (DXRootView) access$000.f7291a;
                            if (!dinamicXEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), (JSONObject) obj, -1, bVar.q()).d()) {
                                DXAsyncCacheManager.dxCache.put(String.valueOf(obj.hashCode()), dXRootView);
                                if (!TextUtils.isEmpty(str)) {
                                    DXAsyncCacheManager.dxCache.put(str, dXRootView);
                                }
                                TraceUtil.endTrace();
                            }
                        }
                    }
                }
            });
        }
    }

    public static void ban(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81be7772", new Object[]{obj});
        } else {
            uniqueId.add(String.valueOf(obj.hashCode()));
        }
    }

    private static DXResult<DXRootView> dxCreateView(DinamicXEngine dinamicXEngine, Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("34e1c23d", new Object[]{dinamicXEngine, context, dXTemplateItem});
        }
        if (ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "enableDXPreRender")) {
            return dinamicXEngine.z0(context, dXTemplateItem);
        }
        return dinamicXEngine.o(context, dXTemplateItem);
    }

    public static Context getDxRootViewContext(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b7d5dc1e", new Object[]{dXRootView});
        }
        if (dXRootView == null) {
            return null;
        }
        if (dXRootView.getContext() == null || bew.a(dXRootView.getContext()) == null) {
            return dXRootView.getContext();
        }
        return bew.a(dXRootView.getContext());
    }

    public static void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{runnable});
        } else {
            preLoadPool.execute(runnable);
        }
    }

    public static void preLoadDX(final List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539c0775", new Object[]{list});
        } else if (msgPreLoadDX) {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("preLoadDX");
                    MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false).A0(list);
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void prefetch(final Context context, final ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec7aef5", new Object[]{context, viewObject});
        } else if (msgPreLoadDX) {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("prefetch");
                    DinamicXEngine createNewEngine = MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false);
                    RenderTemplate renderTemplate = ViewObject.this.info.renderTemplate;
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f7343a = (String) renderTemplate.renderData.get("name");
                    dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
                    dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
                    createNewEngine.E0(context, (JSONObject) ViewObject.this.data, dXTemplateItem, -1, new DXRenderOptions.b().B(2).q());
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void prefetchParseToInnerCache(final Context context, final ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24aa43c1", new Object[]{context, viewObject});
        } else {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("prefetchParseToInnerCache");
                    try {
                        DinamicXEngine createNewEngine = MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false);
                        DXWidgetInstance.setupFullPageEngine(createNewEngine);
                        RenderTemplate renderTemplate = ViewObject.this.info.renderTemplate;
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f7343a = (String) renderTemplate.renderData.get("name");
                        dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
                        dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
                        int intSharedPreference = SharedPreferencesUtil.getIntSharedPreference(DXWidgetInstance.DEFAULT_CAHCE_KEY, 0);
                        DXRenderOptions.b B = new DXRenderOptions.b().B(2);
                        if (intSharedPreference > 0) {
                            B.t(DXWidgetNode.DXMeasureSpec.c(intSharedPreference + 1, 1073741824));
                        }
                        createNewEngine.E0(context, (JSONObject) ViewObject.this.data, dXTemplateItem, -1, B.q());
                        TraceUtil.endTrace();
                    } catch (Throwable th) {
                        TraceUtil.endTrace();
                        throw th;
                    }
                }
            });
        }
    }

    public static void prefetch(final Context context, final DXTemplateItem dXTemplateItem, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c412009d", new Object[]{context, dXTemplateItem, jSONObject});
        } else if (msgPreLoadDX) {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("prefetch");
                    MsgDinamicxEngine.createNewEngine(null, MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT, "alimp_message", null, 100, false).E0(context, jSONObject, dXTemplateItem, -1, new DXRenderOptions.b().B(2).q());
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static void asyncRender(final Context context, final DinamicXEngine dinamicXEngine, final DXTemplateItem dXTemplateItem, final Object obj, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3076c3af", new Object[]{context, dinamicXEngine, dXTemplateItem, obj, str});
        } else if (!uniqueId.contains(str) && !uniqueId.contains(String.valueOf(obj.hashCode()))) {
            post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DXResult access$000;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!DXAsyncCacheManager.uniqueId.contains(str)) {
                        TraceUtil.beginSection("DXASYNC-MSG-" + dXTemplateItem.f7343a);
                        DXRenderOptions.b bVar = new DXRenderOptions.b();
                        try {
                            access$000 = DXAsyncCacheManager.access$000(dinamicXEngine, context, dXTemplateItem);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (!access$000.d()) {
                            DXRootView dXRootView = (DXRootView) access$000.f7291a;
                            if (!dinamicXEngine.i1(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), (JSONObject) obj, -1, bVar.q()).d()) {
                                DXAsyncCacheManager.dxCache.put(String.valueOf(obj.hashCode()), dXRootView);
                                TLog.loge(DXAsyncCacheManager.TAG, "asyncRender " + str);
                                DXAsyncCacheManager.dxCache.put(str, dXRootView);
                                TraceUtil.endTrace();
                            }
                        }
                    }
                }
            });
        }
    }
}
