package com.alipay.android.msp.framework.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.phone.wallet.spmtracker.SpmTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SpmWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<MspWindowFrame, Integer> f3660a = new HashMap();

    public static void onPageAppear(MspWindowFrame mspWindowFrame, int i) {
        MspTrackInfo.SpmInfo spmInfo;
        MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ae1cb3", new Object[]{mspWindowFrame, new Integer(i)});
            return;
        }
        try {
            if (!(GlobalHelper.getInstance().getContext() == null || mspWindowFrame == null || (spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame)) == null || TextUtils.isEmpty(spmInfo.spmId))) {
                Map<MspWindowFrame, Integer> map = f3660a;
                if (((HashMap) map).get(mspWindowFrame) != null && ((Integer) ((HashMap) map).get(mspWindowFrame)).intValue() == i && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i)) != null) {
                    MqpBehavior.getInstance().onPageAppear(mspContextByBizId, spmInfo, mspWindowFrame);
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPageEnd(MspWindowFrame mspWindowFrame, int i) {
        MspTrackInfo.SpmInfo spmInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874e48c9", new Object[]{mspWindowFrame, new Integer(i)});
            return;
        }
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (!(context == null || mspWindowFrame == null || (spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame)) == null || TextUtils.isEmpty(spmInfo.spmId))) {
                Map<MspWindowFrame, Integer> map = f3660a;
                if (((HashMap) map).get(mspWindowFrame) != null && ((Integer) ((HashMap) map).get(mspWindowFrame)).intValue() == i) {
                    ((HashMap) map).remove(mspWindowFrame);
                    Map<String, String> hashMap = new HashMap<>();
                    if (!TextUtils.isEmpty(spmInfo.param4)) {
                        hashMap = JsonUtil.strJson2StringMap(spmInfo.param4);
                    }
                    updataParam4(i, hashMap);
                    if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_SPM_PAGE_MONITOR_STAY_TIME, false, context)) {
                        spmInfo.updateForStayTime(hashMap, "onExit");
                    }
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                    if (mspContextByBizId != null) {
                        MqpBehavior.getInstance().onPageOut(mspContextByBizId, spmInfo, mspWindowFrame);
                    }
                    String str = spmInfo.bizCode;
                    if (TextUtils.isEmpty(str)) {
                        str = "pay";
                    }
                    SpmTracker.onPagePause(mspWindowFrame, spmInfo.spmId, str, hashMap);
                    SpmTracker.onPageDestroy(mspWindowFrame);
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPageResume(MspWindowFrame mspWindowFrame) {
        MspTrackInfo.SpmInfo spmInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eda78e8", new Object[]{mspWindowFrame});
            return;
        }
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (!(context == null || mspWindowFrame == null || DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_SPM_PAGE_MONITOR_STAY_TIME, false, context) || (spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame)) == null || TextUtils.isEmpty(spmInfo.spmId))) {
                SpmTracker.onPageResume(mspWindowFrame, spmInfo.spmId);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPageStart(MspWindowFrame mspWindowFrame, int i) {
        MspTrackInfo.SpmInfo spmInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f982de2", new Object[]{mspWindowFrame, new Integer(i)});
            return;
        }
        try {
            if (!(GlobalHelper.getInstance().getContext() == null || mspWindowFrame == null || (spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame)) == null || TextUtils.isEmpty(spmInfo.spmId))) {
                Map<MspWindowFrame, Integer> map = f3660a;
                if (((HashMap) map).get(mspWindowFrame) == null || ((Integer) ((HashMap) map).get(mspWindowFrame)).intValue() != i) {
                    ((HashMap) map).put(mspWindowFrame, Integer.valueOf(i));
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                    if (mspContextByBizId != null) {
                        MqpBehavior.getInstance().onPageIn(mspContextByBizId, spmInfo, mspWindowFrame);
                    }
                    SpmTracker.onPageCreate(mspWindowFrame, spmInfo.spmId);
                    SpmTracker.onPageResume(mspWindowFrame, spmInfo.spmId);
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void updataParam4(int i, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4968115", new Object[]{new Integer(i), map});
            return;
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            Context context = GlobalHelper.getInstance().getContext();
            String str2 = "null";
            if (tradeContextByBizId != null) {
                if (!TextUtils.isEmpty(tradeContextByBizId.getSpmDpToken())) {
                    str2 = tradeContextByBizId.getSpmDpToken();
                }
                if (TextUtils.isEmpty(tradeContextByBizId.getSpmUniqueId())) {
                    str = i + GlobalHelper.getInstance().getUtdid(context);
                } else {
                    str = tradeContextByBizId.getSpmUniqueId();
                }
                String apLinkToken = tradeContextByBizId.getApLinkToken();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    map.put("ap_link_token", apLinkToken);
                }
            } else if (i == -1) {
                str = GlobalHelper.getInstance().getUtdid(context);
            } else {
                str = i + GlobalHelper.getInstance().getUtdid(context);
            }
            map.put("dpToken", str2);
            map.put("uniqId", str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPageClick(MspWindowFrame mspWindowFrame, String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ff9dd4", new Object[]{mspWindowFrame, str, str2, str3, str4, new Integer(i)});
            return;
        }
        try {
            if (!(GlobalHelper.getInstance().getContext() == null || mspWindowFrame == null)) {
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(str4)) {
                    hashMap = JsonUtil.strJson2StringMap(str4);
                }
                updataParam4(i, hashMap);
                if (TextUtils.isEmpty(str2)) {
                    str2 = "pay";
                }
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                if (mspContextByBizId != null) {
                    if (!FastStartActivityHelper.getBoolConfig(mspContextByBizId.getContext(), DrmKey.GRAY_BEHAVIOR_SPM_EVENT_PARAMS)) {
                        str4 = "";
                    }
                    AlertIntelligenceEngine.startAction(mspContextByBizId, AlertIntelligenceEngine.ACTION_CLICK, str, str4, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId(), null);
                }
                SpmTracker.click(mspWindowFrame, str, str2, 2, hashMap);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPageExposure(MspWindowFrame mspWindowFrame, String str, String str2, String str3, String str4, String str5, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4854f", new Object[]{mspWindowFrame, str, str2, str3, str4, str5, new Integer(i)});
            return;
        }
        try {
            if (!(GlobalHelper.getInstance().getContext() == null || mspWindowFrame == null || TextUtils.isEmpty(str))) {
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(str5)) {
                    hashMap = JsonUtil.strJson2StringMap(str5);
                }
                updataParam4(i, hashMap);
                if (TextUtils.isEmpty(str2)) {
                    str2 = "pay";
                }
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                if (mspContextByBizId != null) {
                    if (!FastStartActivityHelper.getBoolConfig(mspContextByBizId.getContext(), DrmKey.GRAY_BEHAVIOR_SPM_EVENT_PARAMS)) {
                        str5 = "";
                    }
                    AlertIntelligenceEngine.startAction(mspContextByBizId, "exp", str, str5, mspWindowFrame.getFrameId(), mspWindowFrame.getTplId(), null);
                }
                SpmTracker.expose(mspWindowFrame, str, str2, 2, hashMap);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPagePause(MspWindowFrame mspWindowFrame, int i) {
        MspTrackInfo.SpmInfo spmInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f995ce", new Object[]{mspWindowFrame, new Integer(i)});
            return;
        }
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (!(context == null || mspWindowFrame == null || DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_SPM_PAGE_MONITOR_STAY_TIME, false, context) || (spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame)) == null || TextUtils.isEmpty(spmInfo.spmId))) {
                if (TextUtils.isEmpty(spmInfo.bizCode)) {
                    str = "pay";
                } else {
                    str = spmInfo.bizCode;
                }
                Map<String, String> hashMap = new HashMap<>();
                if (!TextUtils.isEmpty(spmInfo.param4)) {
                    hashMap = JsonUtil.strJson2StringMap(spmInfo.param4);
                }
                updataParam4(i, hashMap);
                spmInfo.updateForStayTime(hashMap, "onPause");
                SpmTracker.onPagePause(mspWindowFrame, spmInfo.spmId, str, hashMap, null);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void onPageEnd(MspWindowFrame mspWindowFrame, int i, String str, String str2) {
        MspTrackInfo.SpmInfo spmInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af28d5d", new Object[]{mspWindowFrame, new Integer(i), str, str2});
            return;
        }
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (!(context == null || mspWindowFrame == null || (spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame)) == null || TextUtils.isEmpty(spmInfo.spmId))) {
                Map<MspWindowFrame, Integer> map = f3660a;
                if (((HashMap) map).get(mspWindowFrame) != null && ((Integer) ((HashMap) map).get(mspWindowFrame)).intValue() == i) {
                    ((HashMap) map).remove(mspWindowFrame);
                    Map<String, String> hashMap = new HashMap<>();
                    if (!TextUtils.isEmpty(str)) {
                        hashMap = JsonUtil.strJson2StringMap(spmInfo.param4);
                    }
                    updataParam4(i, hashMap);
                    if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_SPM_PAGE_MONITOR_STAY_TIME, false, context)) {
                        spmInfo.updateForStayTime(hashMap, "onExit");
                    }
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                    if (mspContextByBizId != null) {
                        MqpBehavior.getInstance().onPageOut(mspContextByBizId, spmInfo, mspWindowFrame);
                    }
                    SpmTracker.onPagePause(mspWindowFrame, spmInfo.spmId, str2, hashMap);
                    SpmTracker.onPageDestroy(mspWindowFrame);
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
