package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d0j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17487a = false;
    public static boolean b = true;
    public static final String tlogTag = "Monitor";

    static {
        t2o.a(625999983);
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b81073", new Object[]{aVar});
            return;
        }
        try {
            Event L = aVar.L();
            if (L != null) {
                OnePopModule k = aVar.k();
                abd processCallBack = L.getProcessCallBack();
                if (processCallBack != null) {
                    processCallBack.b(aVar.O(), Boolean.parseBoolean(k.B), Boolean.parseBoolean(k.C), k.c0.name(), k.d0);
                }
            }
        } catch (Throwable th) {
            wdm.h("MonitorTrackCommon.trackOnePop.processCallBack.onClosed.error", th);
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fce11a6e", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d9bfee", new Object[]{new Boolean(z)});
        } else {
            f17487a = z;
        }
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e49a8a", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44c4cca", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("configParseTime", c(String.valueOf(j)));
        o71.a().c(o71.POINT_CONFIG_PARSE_TIME, hashMap, new HashMap());
        wdm.d("MonitorTrackCommon.trackConfigParseTime.arg=%s", hashMap);
    }

    public static void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e934098a", new Object[]{aVar});
        }
    }

    public static Map<String, String> l(OnePopModule onePopModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("48683956", new Object[]{onePopModule});
        }
        HashMap hashMap = new HashMap();
        if (onePopModule == null) {
            onePopModule = new OnePopModule();
        }
        a(onePopModule, hashMap);
        try {
            hashMap.put("startTimeStamp", c(String.valueOf(onePopModule.l0)));
            hashMap.put("configCheckSuccess", c(onePopModule.x));
            hashMap.put("LMCheckSuccess", c(onePopModule.y));
            hashMap.put("crowdCheckSuccess", c(onePopModule.z));
            hashMap.put("mtopCheckSuccess", c(onePopModule.A));
            hashMap.put("viewCreated", c(onePopModule.B));
            hashMap.put("displayed", c(onePopModule.C));
            hashMap.put("continuousDisplayIndex", c(String.valueOf(onePopModule.D)));
            hashMap.put("crowdCheckSuccessReason", c(null));
            hashMap.put("mtopCheckSuccessReason", c(onePopModule.E));
            hashMap.put("mtopCheckTraceId", c(onePopModule.F));
            hashMap.put("configCheckTime", c(onePopModule.G));
            hashMap.put("LMTime", c(onePopModule.H));
            hashMap.put("LMEnqueueWaitTime", c(onePopModule.I));
            hashMap.put("LMEnqueueWaitEachTime", c(null));
            hashMap.put("viewLoadDelayTime", c(onePopModule.J));
            hashMap.put("crowdCheckTime", c(null));
            hashMap.put("preCheckTime", c(onePopModule.K));
            hashMap.put("prepareLoadTime", c(onePopModule.L));
            hashMap.put(z9u.KEY_LOAD_TIME, c(onePopModule.M));
            hashMap.put("invisibleTime", c(onePopModule.N));
            hashMap.put("retainTime", c(onePopModule.O));
            hashMap.put("viewPrepareCostTime", c(onePopModule.P));
            hashMap.put("viewRequestCostTime", c(onePopModule.Q));
            hashMap.put("viewLoadMaterialCostTime", c(onePopModule.R));
            hashMap.put("viewMtopCostTime", c(onePopModule.S));
            hashMap.put("increaseTimes", c(onePopModule.X));
            hashMap.put("jumpTimes", c(String.valueOf(onePopModule.b())));
            hashMap.put(rg0.JUMP_URL, c(onePopModule.c()));
            hashMap.put("finished", c(onePopModule.a0));
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = onePopModule.c0;
            String str = "";
            hashMap.put("loseReasonCode", c(onePopLoseReasonCode != null ? onePopLoseReasonCode.name() : str));
            hashMap.put("loseSubErrorCode", c(onePopModule.d0));
            hashMap.put("contentId", c(onePopModule.b0));
            hashMap.put("contentID", c(onePopModule.b0));
            hashMap.put("userResult", c(onePopModule.j0));
            hashMap.put("preDealTraceId", c(onePopModule.h0));
            hashMap.put("preDealResult", c(onePopModule.g0));
            hashMap.put("preDealConfigName", c(onePopModule.i0));
            hashMap.put("preDealCostTime", c(onePopModule.T));
            hashMap.put("receiveEventTime", c(onePopModule.U));
            hashMap.put(ufu.KEY_SDK_WAIT_TIME, c(onePopModule.W));
            if (!onePopModule.w0.isEmpty()) {
                str = onePopModule.w0.toJSONString();
            }
            hashMap.put("extras", c(str));
        } catch (Throwable th) {
            wdm.h("MonitorTrackCommon.transOnePopDimension.error.", th);
        }
        return hashMap;
    }

    public static void a(OnePopModule onePopModule, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74c2058", new Object[]{onePopModule, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            map.put("uuid", onePopModule.c);
            map.put("indexId", onePopModule.b);
            map.put("pageName", onePopModule.l);
            map.put("pageUrl", onePopModule.m);
            map.put(wdm.CATEGORY_TRIGGER_EVENT, onePopModule.n);
            map.put("sceneId", onePopModule.p);
            map.put("bizId", onePopModule.q);
            map.put("orangeVersion", onePopModule.r);
            map.put(WXBasicComponentType.EMBED, onePopModule.s);
            map.put("popTraceId", onePopModule.t);
            map.put("popTimeStamp", String.valueOf(PopLayer.getReference().getCurrentTimeStamp(false)));
            String str = "none_value";
            map.put("viewRenderType", !TextUtils.isEmpty(onePopModule.k0) ? onePopModule.k0 : str);
            map.put("gradualExposeABBucketId", !TextUtils.isEmpty(null) ? null : str);
            if (!TextUtils.isEmpty(null)) {
                str = null;
            }
            map.put("nativePopABBucketId", str);
            map.put("triggerToDisplayCostTime", c(onePopModule.V));
            map.put(s0j.MTS_TAG_IS_COLD_LAUNCH, c(String.valueOf(onePopModule.v0)));
        } catch (Throwable th) {
            wdm.h("AppMonitorAdapter addBaseDimensions error.", th);
        }
    }

    public static Map<String, String> m(OnePopModule onePopModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("52ed87aa", new Object[]{onePopModule});
        }
        HashMap hashMap = new HashMap();
        if (onePopModule == null) {
            onePopModule = new OnePopModule();
        }
        a(onePopModule, hashMap);
        try {
            hashMap.put("startTimeStamp", c(String.valueOf(onePopModule.l0)));
            hashMap.put("errorCode", c(onePopModule.c0.name()));
            hashMap.put("subErrorCode", c(onePopModule.d0));
            String str = onePopModule.e0;
            if (str != null && str.length() > 10240) {
                onePopModule.e0 = onePopModule.e0.substring(0, AccsConnection.DATA_PACKAGE_MAX);
            }
            hashMap.put("errorMessage", c(onePopModule.e0));
            String str2 = onePopModule.f0;
            if (str2 != null && str2.length() > 10240) {
                str2 = null;
            }
            hashMap.put("errorInfo", c(str2));
        } catch (Throwable th) {
            wdm.h("MonitorTrackCommon.transPopErrorDimension.error.", th);
        }
        return hashMap;
    }

    public static void f(a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7674eced", new Object[]{aVar});
        } else if (aVar != null && aVar.k() != null && aVar.k().c0 == OnePopModule.OnePopLoseReasonCode.ConfigCheckFail && !aVar.k().v && !aVar.k().u) {
            OnePopModule k = aVar.k();
            k.v = true;
            BaseConfigItem K = aVar.K();
            if (K == null || TextUtils.isEmpty(K.indexID)) {
                if (K != null) {
                    str = K.indexID;
                } else {
                    str = "";
                }
                wdm.b(tlogTag, "pageLifeCycle", str, "MonitorTrackCommon.trackConfigCheckFail.indexIdIsEmpty.");
                return;
            }
            Map<String, String> l = l(k);
            o71.a().c(o71.POINT_CONFIG_FAIL, l, new HashMap());
            wdm.d("MonitorTrackCommon.trackConfigCheckFail.arg=%s", l);
        }
    }

    public static void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181c8f0", new Object[]{aVar});
        } else if (aVar != null && aVar.k() != null && !aVar.k().v) {
            if (aVar.k().u) {
                b(aVar);
                return;
            }
            OnePopModule k = aVar.k();
            if (b) {
                k(aVar);
            }
            if (!b) {
                if (!f17487a || k.c0 != OnePopModule.OnePopLoseReasonCode.ConfigCheckFail) {
                    k.v = true;
                    BaseConfigItem K = aVar.K();
                    Event L = aVar.L();
                    if (aVar.S() || K == null || !TextUtils.isEmpty(K.indexID)) {
                        if (k.c0 == null) {
                            k.c0 = OnePopModule.OnePopLoseReasonCode.other;
                        }
                        Map<String, String> l = l(k);
                        o71.a().c("OnePop", l, new HashMap());
                        auv.a().d("OnePop", L.curPage, K, l);
                        wdm.d("MonitorTrackCommon.trackOnePop.arg=%s", l);
                    } else {
                        wdm.b(tlogTag, "pageLifeCycle", K.indexID, "MonitorTrackCommon.trackOnePop.indexIdIsEmpty.");
                        return;
                    }
                } else {
                    f(aVar);
                    return;
                }
            } else if ("true".equals(k.B)) {
                k.v = true;
                BaseConfigItem K2 = aVar.K();
                if (aVar.S() || K2 == null || !TextUtils.isEmpty(K2.indexID)) {
                    if (k.c0 == null) {
                        k.c0 = OnePopModule.OnePopLoseReasonCode.other;
                    }
                    Map<String, String> l2 = l(k);
                    o71.a().c("OnePop", l2, new HashMap());
                    wdm.d("MonitorTrackCommon.trackOnePop.arg=%s", l2);
                } else {
                    wdm.b(tlogTag, "pageLifeCycle", K2.indexID, "MonitorTrackCommon.trackOnePop.indexIdIsEmpty.");
                    return;
                }
            }
            b(aVar);
        }
    }

    public static void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93381804", new Object[]{aVar});
        } else if (aVar != null && aVar.k() != null && !aVar.k().w && !aVar.k().u) {
            OnePopModule k = aVar.k();
            if (k.c0 != null) {
                BaseConfigItem K = aVar.K();
                if (TextUtils.isEmpty(K.indexID)) {
                    wdm.b(tlogTag, "pageLifeCycle", K.indexID, "MonitorTrackCommon.trackPopError.indexIdIsEmpty.");
                    return;
                }
                k.w = true;
                Map<String, String> m = m(k);
                o71.a().c("PopError", m, new HashMap());
                wdm.d("MonitorTrackCommon.trackPopError.arg=%s", m);
            }
        }
    }

    public static void k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb036bd", new Object[]{aVar});
        } else if (aVar != null && aVar.k() != null && !aVar.k().v && !aVar.k().u) {
            OnePopModule k = aVar.k();
            k.v = true;
            BaseConfigItem K = aVar.K();
            if (aVar.S() || K == null || !TextUtils.isEmpty(K.indexID)) {
                if (k.c0 == null) {
                    k.c0 = OnePopModule.OnePopLoseReasonCode.other;
                }
                Map<String, String> l = l(k);
                o71.a().c("PopProcess", l, new HashMap());
                wdm.d("MonitorTrackCommon.trackPopProcess.arg=%s", l);
                nsu.j(aVar);
                return;
            }
            wdm.b(tlogTag, "pageLifeCycle", K.indexID, "MonitorTrackCommon.trackPopProcess.indexIdIsEmpty.");
        }
    }
}
