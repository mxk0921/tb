package com.alibaba.poplayer.config.manager;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.alibaba.poplayer.info.frequency.FrequencyManager;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.a;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.d0j;
import tb.dcm;
import tb.jd0;
import tb.lto;
import tb.lyv;
import tb.qtv;
import tb.qwk;
import tb.qy3;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConfigFilterRule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum ConfigStatus {
        INVALIED,
        VALIED,
        VALIED_BUT_UNSTARTED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ConfigStatus configStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/config/manager/ConfigFilterRule$ConfigStatus");
        }

        public static ConfigStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigStatus) ipChange.ipc$dispatch("705d7669", new Object[]{str});
            }
            return (ConfigStatus) Enum.valueOf(ConfigStatus.class, str);
        }
    }

    static {
        t2o.a(625999889);
    }

    public static boolean b(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("765ced02", new Object[]{baseConfigItem})).booleanValue();
        }
        return lyv.m(baseConfigItem.appVersions, PopLayer.getReference().getFaceAdapter().getCurAppVersion(PopLayer.getReference().getApp()));
    }

    public static boolean c(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f69d96", new Object[]{baseConfigItem})).booleanValue();
        }
        if (!baseConfigItem.appear) {
            return false;
        }
        wdm.d("CommonConfigRule.checkAppear.indexId{%s}.ignoreTime", baseConfigItem.indexID);
        return true;
    }

    public static boolean e(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67267cb9", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (2 != event.source) {
            return false;
        }
        long startTimeStamp = baseConfigItem.getStartTimeStamp();
        long endTimeStamp = baseConfigItem.getEndTimeStamp();
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
        if (startTimeStamp >= endTimeStamp || currentTimeStamp >= startTimeStamp) {
            return false;
        }
        return true;
    }

    public static ConfigStatus g(a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigStatus) ipChange.ipc$dispatch("e02746da", new Object[]{aVar, str, new Boolean(z)});
        }
        if (z) {
            OnePopModule k = aVar.k();
            k.c0 = OnePopModule.OnePopLoseReasonCode.ConfigCheckFail;
            k.d0 = str;
            d0j.h(aVar);
        }
        aVar.H(PopRequest.Status.REMOVED);
        String P = a.P(aVar);
        wdm.f(wdm.CATEGORY_CONFIG_CHECK, P, "CommonConfigRule.checkFail.reason=" + str);
        return ConfigStatus.INVALIED;
    }

    public static int h(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4139a5ee", new Object[]{baseConfigItem})).intValue();
        }
        int p = com.alibaba.poplayer.info.frequency.a.t().p(baseConfigItem);
        String str = baseConfigItem.indexID;
        wdm.f(wdm.CATEGORY_CONFIG_CHECK, str, "checkFrequency.result=" + p);
        return p;
    }

    public static boolean i(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa01db3", new Object[]{event, baseConfigItem})).booleanValue();
        }
        long startTimeStamp = baseConfigItem.getStartTimeStamp();
        long endTimeStamp = baseConfigItem.getEndTimeStamp();
        int i = event.source;
        if ((i == 3 || i == 5) && (startTimeStamp == Long.MAX_VALUE || endTimeStamp == Long.MAX_VALUE)) {
            return true;
        }
        if (endTimeStamp <= startTimeStamp) {
            wdm.f(wdm.CATEGORY_CONFIG_CHECK, baseConfigItem.indexID, "CommonConfigRule.checkTimeAndRescheduleIfNeed.error.endTime<=startTime");
            return false;
        }
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
        if (currentTimeStamp <= startTimeStamp || currentTimeStamp >= endTimeStamp) {
            wdm.d("CommonConfigRule.checkTimeAndRescheduleIfNeed.indexId{%s}.return.outOfTime", baseConfigItem.indexID);
            return false;
        }
        BaseConfigItem.DisableTimeParam[] disableTimeParamArr = baseConfigItem.disableTimeConfigs;
        if (disableTimeParamArr != null) {
            for (BaseConfigItem.DisableTimeParam disableTimeParam : disableTimeParamArr) {
                if (disableTimeParam != null) {
                    long startTimeStamp2 = disableTimeParam.getStartTimeStamp();
                    long endTimeStamp2 = disableTimeParam.getEndTimeStamp();
                    if (endTimeStamp2 <= startTimeStamp2) {
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, baseConfigItem.indexID, "CommonConfigRule.checkTimeAndRescheduleIfNeed.error.disableEndTime<=disableStartTime");
                        qtv.u("CommonConfigRule.checkTimeAndRescheduleIfNeed.timeError.", null, baseConfigItem);
                    } else if (currentTimeStamp >= startTimeStamp2 && currentTimeStamp < endTimeStamp2) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("curTime", currentTimeStamp + "");
                        hashMap.put("disableStartTime", startTimeStamp2 + "");
                        hashMap.put("disableEndTime", endTimeStamp2 + "");
                        qtv.u("CommonConfigRule.checkTimeAndRescheduleIfNeed.hitDisableTime.", hashMap, baseConfigItem);
                        wdm.f(wdm.CATEGORY_CONFIG_CHECK, baseConfigItem.indexID, "CommonConfigRule.checkTimeAndRescheduleIfNeed.return.inDisableTime");
                        return false;
                    }
                }
            }
        }
        wdm.d("CommonConfigRule.checkTimeAndRescheduleIfNeed.indexId{%s}.return.timeToStart", baseConfigItem.indexID);
        return true;
    }

    public static boolean j(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea103ae1", new Object[]{baseConfigItem})).booleanValue();
        }
        boolean a2 = qy3.b().a(baseConfigItem);
        String str = baseConfigItem.indexID;
        wdm.f("pageLifeCycle", str, "CommonConfigRule.coldLaunchedCheck.enable=" + a2);
        return a2;
    }

    public static boolean k(BaseConfigItem baseConfigItem) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("971035a9", new Object[]{baseConfigItem})).booleanValue();
        }
        String[] strArr2 = baseConfigItem.disableDeviceArray;
        if (!(strArr2 == null || strArr2.length == 0)) {
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            for (String str2 : baseConfigItem.disableDeviceArray) {
                if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean l(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c400308d", new Object[]{baseConfigItem})).booleanValue();
        }
        boolean c = PopMiscInfoFileHelper.g().c(baseConfigItem);
        String str = baseConfigItem.indexID;
        wdm.f("pageLifeCycle", str, "CommonConfigRule.enablePercentCheck.enable=" + c);
        return c;
    }

    public static boolean m(BaseConfigItem baseConfigItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5975ea6e", new Object[]{baseConfigItem, new Integer(i)})).booleanValue();
        }
        if (i != -1) {
            return true;
        }
        wdm.d("CommonConfigRule.popupCountCheck.This pop is finished.indexId=%s", baseConfigItem.indexID);
        return false;
    }

    public static boolean n(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02918e2", new Object[]{popRequest})).booleanValue();
        }
        return qwk.c().a((a) popRequest);
    }

    public static boolean o(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cc6401f", new Object[]{baseConfigItem})).booleanValue();
        }
        return lyv.m(baseConfigItem.osVersions, Build.VERSION.RELEASE);
    }

    public static boolean p(BaseConfigItem baseConfigItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7afb07fd", new Object[]{baseConfigItem, new Integer(i)})).booleanValue();
        }
        if (i == -1) {
            wdm.d("CommonConfigRule.popupCountCheck.This pop is finished.indexId=%s", baseConfigItem.indexID);
            return false;
        } else if (baseConfigItem.times == 0) {
            return true;
        } else {
            wdm.d("CommonConfigRule.popupCountCheck?localCount=%s&configTimes=%s", Integer.valueOf(i), Integer.valueOf(baseConfigItem.times));
            if (i < baseConfigItem.times) {
                return true;
            }
            return false;
        }
    }

    public static boolean q(Event event, BaseConfigItem baseConfigItem) {
        BaseConfigItem.ProtocolCheck protocolCheck;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21ce63a9", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (!Event.b.a(event.source) || (protocolCheck = baseConfigItem.protocolCheckInfo) == null || !protocolCheck.isValid() || TextUtils.isEmpty(event.curPage)) {
            return true;
        }
        if (event.curPage.equals(baseConfigItem.protocolCheckInfo.uri)) {
            z = true;
        } else {
            String[] strArr = baseConfigItem.protocolCheckInfo.uris;
            if (strArr != null) {
                boolean z2 = false;
                for (String str : strArr) {
                    if (event.curPage.equals(str)) {
                        z2 = true;
                    }
                }
                z = z2;
            }
        }
        if (z) {
            return lto.a(event.curPageUrl, baseConfigItem.protocolCheckInfo.paramContains);
        }
        return z;
    }

    public static boolean r(Event event, BaseConfigItem baseConfigItem) {
        List<BaseConfigItem.ProtocolCheckItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb08db6", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (!Event.b.a(event.source) || (list = baseConfigItem.protocolChecks) == null || list.isEmpty() || TextUtils.isEmpty(event.curPage)) {
            return true;
        }
        boolean z = false;
        for (BaseConfigItem.ProtocolCheckItem protocolCheckItem : baseConfigItem.protocolChecks) {
            String[] strArr = protocolCheckItem.uris;
            if (strArr != null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (event.curPage.equals(strArr[i])) {
                        z = lto.a(event.curPageUrl, protocolCheckItem.filter);
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public static boolean s(Event event, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e100049d", new Object[]{event, baseConfigItem})).booleanValue();
        }
        if (!Event.b.a(event.source) || TextUtils.isEmpty(baseConfigItem.sceneCheck)) {
            return true;
        }
        return lto.a(event.curPageUrl, baseConfigItem.sceneCheck);
    }

    public static String d(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9f5bf72", new Object[]{baseConfigItem});
        }
        try {
            int c = dcm.f().c(baseConfigItem.uuid, 0);
            if (!m(baseConfigItem, c)) {
                return "finished";
            }
            if (!p(baseConfigItem, c)) {
                return "popCount";
            }
            int h = h(baseConfigItem);
            if (h == 5) {
                return "freqInterval";
            }
            if (!(h == -1 || h == 0)) {
                return AURAPageEventStrategy.FREQUENCY;
            }
            if (jd0.c().a() != null && jd0.c().a().isRequestingFilterEnable()) {
                if (PageTriggerService.instance().getCurRequestingRequest(baseConfigItem.indexID) != null) {
                    return "isTriggering";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a(PopRequest popRequest) {
        KeepModel keepModel;
        UriModel uriModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d687035b", new Object[]{popRequest})).booleanValue();
        }
        try {
            BaseConfigItem J = a.J(popRequest);
            if (J.isAppMode() && (keepModel = J.keepConfigs) != null && keepModel.isValid()) {
                Iterator<UriModel> it = keepModel.pages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uriModel = null;
                        break;
                    }
                    uriModel = it.next();
                    if (uriModel != null && uriModel.isValid() && uriModel.uris.contains(InternalTriggerController.getCurUri())) {
                        break;
                    }
                }
                return KeepModel.STRATEGY_WHITE_LIST.equals(keepModel.strategy) ? uriModel != null : !KeepModel.STRATEGY_BLACK_LIST.equals(keepModel.strategy) || uriModel == null;
            }
            return true;
        } catch (Throwable th) {
            wdm.h("LMAppModeCheck.error.", th);
            return true;
        }
    }

    public static ConfigStatus f(a aVar, boolean z) {
        ConfigStatus configStatus;
        int i;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigStatus) ipChange.ipc$dispatch("fa6cf2cd", new Object[]{aVar, new Boolean(z)});
        }
        BaseConfigItem K = aVar.K();
        Event L = aVar.L();
        ConfigStatus configStatus2 = ConfigStatus.INVALIED;
        if (c(K)) {
            configStatus = ConfigStatus.VALIED;
        } else if (i(L, K)) {
            configStatus = ConfigStatus.VALIED;
        } else {
            configStatus = e(L, K) ? ConfigStatus.VALIED_BUT_UNSTARTED : configStatus2;
        }
        if (!j(K)) {
            return configStatus2;
        }
        ConfigStatus configStatus3 = ConfigStatus.VALIED;
        if (configStatus == configStatus3) {
            i = h(K);
            if (!(i == 4 || i == 2)) {
                configStatus2 = configStatus3;
            }
        } else {
            configStatus2 = configStatus;
            i = -1;
        }
        try {
            z2 = PopLayer.getReference().isValidConfigBeforeMonitor(K);
        } catch (Throwable th) {
            wdm.h("CommonConfigRule.checkConfigItemStatus.isValidConfigBeforeMonitor.error.", th);
        }
        if (!z2) {
            return g(aVar, "isValidConfigBeforeMonitor", false);
        }
        if (configStatus2 == ConfigStatus.VALIED) {
            if (z) {
                aVar.k().l0 = PopLayer.getReference().getCurrentTimeStamp(false);
                aVar.k().m0 = SystemClock.elapsedRealtime();
            }
            if (!b(K)) {
                return g(aVar, "appVersion", z);
            }
            if (!o(K)) {
                return g(aVar, "osVersion", z);
            }
            if (!k(K)) {
                return g(aVar, "disableDevice", z);
            }
            if (!q(L, K)) {
                return g(aVar, "protocolCheck", z);
            }
            if (!r(L, K)) {
                return g(aVar, "protocolChecks", z);
            }
            if (!s(L, K)) {
                return g(aVar, "sceneCheck", z);
            }
            Pair<Boolean, String> isValidConfigWithReason = PopLayer.getReference().isValidConfigWithReason(aVar);
            if (isValidConfigWithReason != null && !((Boolean) isValidConfigWithReason.first).booleanValue()) {
                return g(aVar, (String) isValidConfigWithReason.second, z);
            }
            if (!PopLayer.getReference().isValidConfig(K)) {
                return g(aVar, "validConfig", z);
            }
            if (!l(K)) {
                return g(aVar, "enablePercent", z);
            }
            int c = dcm.f().c(K.uuid, 0);
            if (!m(K, c)) {
                return g(aVar, "finished", z);
            }
            if (!p(K, c)) {
                return g(aVar, "popCount", z);
            }
            if (i == 5) {
                return g(aVar, "freqInterval", z);
            }
            if (!FrequencyManager.h(i)) {
                return g(aVar, AURAPageEventStrategy.FREQUENCY, z);
            }
        }
        if (z) {
            OnePopModule k = aVar.k();
            k.G = String.valueOf(SystemClock.elapsedRealtime() - k.m0);
        }
        return configStatus2;
    }
}
