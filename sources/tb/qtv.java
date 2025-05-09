package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qtv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999987);
    }

    public static /* synthetic */ void d(boolean z, Event event, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e696913", new Object[]{new Boolean(z), event, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("configExist", String.valueOf(z));
            hashMap.put("pageName", PopLayer.getReference().getFaceAdapter().getUTCurPageName());
            hashMap.put("pageUri", String.valueOf(event.curPage));
            hashMap.put("pageUrl", URLEncoder.encode(event.curPageUrl, "UTF-8"));
            hashMap.put("triggerType", Event.b.b(event.source));
            hashMap.put("triggerUri", event.uri);
            auv.a().f(19999, "PopMonitor", "configExist", str, "PopLayer", hashMap);
        } catch (Throwable th) {
            wdm.h("UserTrackCommon.trackPopPoint.error.", th);
        }
    }

    public static /* synthetic */ void e(OnePopModule onePopModule, boolean z, Map map, int i, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33412c75", new Object[]{onePopModule, new Boolean(z), map, new Integer(i), str});
            return;
        }
        try {
            if (!onePopModule.u) {
                HashMap hashMap = new HashMap();
                hashMap.put("pageName", onePopModule.k);
                hashMap.put("pageUri", onePopModule.l);
                hashMap.put("pageUrl", URLEncoder.encode(onePopModule.m, "UTF-8"));
                hashMap.put("triggerType", onePopModule.n);
                hashMap.put("triggerUri", onePopModule.o);
                hashMap.put("renderType", onePopModule.k0);
                hashMap.put("augePlanId", onePopModule.j);
                hashMap.put("traceId", onePopModule.t);
                if (!TextUtils.isEmpty(onePopModule.f)) {
                    str2 = onePopModule.f;
                } else {
                    str2 = "";
                }
                hashMap.put("exposeTraceId", str2);
                if (!TextUtils.isEmpty(onePopModule.g)) {
                    str3 = onePopModule.g;
                } else {
                    str3 = "";
                }
                hashMap.put("exposeType", str3);
                if (!TextUtils.isEmpty(onePopModule.d)) {
                    str4 = onePopModule.d;
                } else {
                    str4 = "";
                }
                hashMap.put("traceInfo", str4);
                if (!TextUtils.isEmpty(onePopModule.e)) {
                    str5 = URLEncoder.encode(onePopModule.e, "UTF-8");
                } else {
                    str5 = "";
                }
                hashMap.put("viewTraceInfo", str5);
                hashMap.put("countTire", z + "");
                if (map != null && !map.isEmpty()) {
                    hashMap.putAll(map);
                }
                auv.a().f(i, "PopMonitor", str, onePopModule.b, onePopModule.f2533a, hashMap);
            }
        } catch (Throwable th) {
            wdm.h("UserTrackCommon.trackPopPoint.error.", th);
        }
    }

    public static /* synthetic */ void f(OnePopModule onePopModule, ActionLineModule actionLineModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd2cf70", new Object[]{onePopModule, actionLineModule, str});
        } else if (onePopModule != null && actionLineModule != null) {
            try {
                HashMap hashMap = new HashMap();
                String str2 = "";
                hashMap.put("traceId", !TextUtils.isEmpty(onePopModule.t) ? onePopModule.t : str2);
                hashMap.put("exposeTraceId", !TextUtils.isEmpty(onePopModule.f) ? onePopModule.f : str2);
                hashMap.put("exposeType", !TextUtils.isEmpty(onePopModule.g) ? onePopModule.g : str2);
                hashMap.put("traceInfo", !TextUtils.isEmpty(onePopModule.d) ? onePopModule.d : str2);
                hashMap.put("viewTraceInfo", !TextUtils.isEmpty(onePopModule.e) ? URLEncoder.encode(onePopModule.e, "UTF-8") : str2);
                hashMap.put("stateId", !TextUtils.isEmpty(actionLineModule.stateId) ? actionLineModule.stateId : str2);
                hashMap.put("stateVer", !TextUtils.isEmpty(actionLineModule.stateVer) ? actionLineModule.stateVer : str2);
                hashMap.put("stateIndex", actionLineModule.stateIndex + str2);
                hashMap.put("countTire", actionLineModule.countTire + str2);
                hashMap.put("triggerType", !TextUtils.isEmpty(actionLineModule.triggerType) ? actionLineModule.triggerType : str2);
                List<ActionLineModule.ActionItem> list = actionLineModule.actions;
                hashMap.put("actions", list != null ? URLEncoder.encode(JSON.toJSONString(list), "UTF-8") : str2);
                List<ActionLineModule.ActionItem> list2 = actionLineModule.animations;
                if (list2 != null) {
                    str2 = URLEncoder.encode(JSON.toJSONString(list2), "UTF-8");
                }
                hashMap.put("animations", str2);
                auv.a().f(2101, "PopMonitor", str, onePopModule.b, onePopModule.f2533a, hashMap);
            } catch (Throwable th) {
                wdm.h("UserTrackCommon.trackPopPointActionLine.error.", th);
            }
        }
    }

    public static void g(final Event event, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b5c35f", new Object[]{event, str, new Boolean(z)});
        } else {
            hst.b(new Runnable() { // from class: tb.otv
                @Override // java.lang.Runnable
                public final void run() {
                    qtv.d(z, event, str);
                }
            });
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767054d6", new Object[]{str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ProgramLogic", "trackPopFileHelperFix");
            hashMap.put("pageJson", String.valueOf(str));
            hashMap.put("userId", PopLayer.getReference().getFaceAdapter().getUserId());
            hashMap.put("deviceId", PopLayer.getReference().getFaceAdapter().getDeviceId());
            auv.a().d("other", "", null, hashMap);
        } catch (Throwable th) {
            wdm.h("UserTrackCommon.trackPopFileHelperFix.error.", th);
        }
    }

    public static void i(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc02a525", new Object[]{str, map});
            return;
        }
        try {
            auv.a().f(UtUtils.CHANGED_UPP_EVENT_ID, "PopLayerPerf", "Perf", str, String.valueOf(System.currentTimeMillis()), map);
        } catch (Throwable th) {
            wdm.h("UserTrackCommon.trackPopFileHelperFix.error.", th);
        }
    }

    public static void j(final OnePopModule onePopModule, final int i, final String str, final boolean z, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78484386", new Object[]{onePopModule, new Integer(i), str, new Boolean(z), map});
        } else {
            hst.b(new Runnable() { // from class: tb.ntv
                @Override // java.lang.Runnable
                public final void run() {
                    qtv.e(OnePopModule.this, z, map, i, str);
                }
            });
        }
    }

    public static void k(OnePopModule onePopModule, ActionLineModule actionLineModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb08536", new Object[]{onePopModule, actionLineModule});
        } else {
            l(onePopModule, actionLineModule, "action");
        }
    }

    public static void l(final OnePopModule onePopModule, final ActionLineModule actionLineModule, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a1094", new Object[]{onePopModule, actionLineModule, str});
        } else {
            hst.b(new Runnable() { // from class: tb.ptv
                @Override // java.lang.Runnable
                public final void run() {
                    qtv.f(OnePopModule.this, actionLineModule, str);
                }
            });
        }
    }

    public static void m(OnePopModule onePopModule, ActionLineModule actionLineModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def2ab0", new Object[]{onePopModule, actionLineModule});
        } else {
            l(onePopModule, actionLineModule, "animation");
        }
    }

    public static void n(OnePopModule onePopModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7e1748", new Object[]{onePopModule, new Boolean(z)});
        } else {
            j(onePopModule, 2101, "click", z, null);
        }
    }

    public static void o(OnePopModule onePopModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6464d8", new Object[]{onePopModule, new Boolean(z)});
        } else {
            j(onePopModule, 2101, "close", z, null);
        }
    }

    public static void p(OnePopModule onePopModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d389ce", new Object[]{onePopModule, new Boolean(z)});
        } else {
            j(onePopModule, 2201, "display", z, null);
        }
    }

    public static void q(OnePopModule onePopModule, ActionLineModule actionLineModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f339bfd9", new Object[]{onePopModule, actionLineModule});
        } else {
            l(onePopModule, actionLineModule, "exposeState");
        }
    }

    public static void s(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e1c355", new Object[]{str, str2, map});
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            map.put("ProgramLogic", "PopReceiver");
            map.put("pointName", str);
            map.put("traceId", str2);
            map.put("userId", PopLayer.getReference().getFaceAdapter().getUserId());
            map.put("deviceId", PopLayer.getReference().getFaceAdapter().getDeviceId());
            auv.a().f(19999, "PopLayer_appLifeCycle", "PopReceiver", str, str2, map);
        } catch (Throwable th) {
            wdm.h("UserTrackCommon.trackPopFileHelperFix.error.", th);
        }
    }

    public static void t(String str, Throwable th) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da482558", new Object[]{str, th});
        } else if (th != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("ErrorCatch", str);
                    if (TextUtils.isEmpty(th.getMessage())) {
                        str2 = "empty";
                    } else {
                        str2 = th.getMessage();
                    }
                    hashMap.put("ErrorMessage", str2);
                    auv.a().d("other", "PopProgramError", null, hashMap);
                }
            } catch (Throwable th2) {
                wdm.h("UserTrackCommon.trackProgramErrorCatch.error.", th2);
            }
        }
    }

    public static void u(String str, Map<String, String> map, BaseConfigItem baseConfigItem) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6aaa819", new Object[]{str, map, baseConfigItem});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("ProgramLogicName", str);
                if (baseConfigItem != null) {
                    str2 = baseConfigItem.indexID;
                } else {
                    str2 = "none";
                }
                hashMap.put("configItem", str2);
                if (map != null) {
                    hashMap.putAll(map);
                }
                auv.a().d("other", "", null, hashMap);
            }
        } catch (Throwable th) {
            wdm.h("UserTrackCommon.trackProgramPoint.error.", th);
        }
    }

    public static void r(OnePopModule onePopModule, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8391e046", new Object[]{onePopModule, map});
        } else {
            j(onePopModule, 2101, "refresh", false, map);
        }
    }
}
