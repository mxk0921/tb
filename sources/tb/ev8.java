package tb;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.middletier.fc.FCAction;
import com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.ApiLockHelper;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ev8 implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dq9 f18835a = new dq9();
    public final f01 b = new f01();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements IFCActionCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w4j f18836a;
        public final /* synthetic */ MtopBuilder b;
        public final /* synthetic */ Mtop c;
        public final /* synthetic */ MtopResponse d;

        /* compiled from: Taobao */
        /* renamed from: tb.ev8$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class RunnableC0916a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f18837a;
            public final /* synthetic */ FCAction.FCMainAction b;
            public final /* synthetic */ long c;
            public final /* synthetic */ HashMap d;

            public RunnableC0916a(long j, FCAction.FCMainAction fCMainAction, long j2, HashMap hashMap) {
                this.f18837a = j;
                this.b = fCMainAction;
                this.c = j2;
                this.d = hashMap;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TBSdkLog.e("mtopsdk.FCDuplexFilter", " [IFCActionCallback] onAction: " + ("--->###sessionId = " + this.f18837a + ", MainAction = " + this.b + ", subAction = " + this.c + ", extraInfo = " + this.d.toString() + "### ") + a.this.f18836a.h);
                MtopStatistics mtopStatistics = a.this.f18836a.g;
                mtopStatistics.fcProcessCallbackTime = mtopStatistics.currentTimeMillis();
                a.this.f18836a.g.bxMainAction = this.b.ordinal();
                MtopStatistics mtopStatistics2 = a.this.f18836a.g;
                long j = this.c;
                mtopStatistics2.bxSubAction = j;
                FCAction.FCMainAction fCMainAction = this.b;
                if (fCMainAction == FCAction.FCMainAction.RETRY) {
                    mtopStatistics2.bxRetry = 1;
                    String str = (String) this.d.get(C0139.f198);
                    if (StringUtils.isNotBlank(str)) {
                        HashMap hashMap = new HashMap();
                        try {
                            hashMap.put(C0139.f198, URLEncoder.encode(str, "utf-8"));
                            a.this.b.headers(hashMap);
                        } catch (UnsupportedEncodingException unused) {
                            TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback]urlEncode x-bx-resend=" + str + "error");
                        }
                    }
                    if ((this.c & FCAction.FCSubAction.LOGIN.getValue()) > 0) {
                        k5o a2 = l5o.a("ANTI");
                        a aVar = a.this;
                        a2.d(aVar.c, "", (MtopBusiness) aVar.b);
                        String str2 = a.this.b.mtopProp.userInfo;
                        k5o a3 = l5o.a("SESSION");
                        a aVar2 = a.this;
                        a3.a(aVar2.c, str2, (MtopBusiness) aVar2.b);
                        MtopBuilder mtopBuilder = a.this.b;
                        if (mtopBuilder instanceof MtopBusiness) {
                            MtopListener mtopListener = ((MtopBusiness) mtopBuilder).listener;
                            if (mtopListener instanceof IInteractingListener) {
                                ((IInteractingListener) mtopListener).onInteract("login");
                            }
                        }
                        a aVar3 = a.this;
                        nyn.e(aVar3.c, str2, true, aVar3.b);
                    } else if ((this.c & FCAction.FCSubAction.WUA.getValue()) > 0) {
                        a.this.f18836a.d.wuaRetry = true;
                        k5o a4 = l5o.a("ANTI");
                        a aVar4 = a.this;
                        a4.f(aVar4.c, "", (MtopBusiness) aVar4.b);
                    } else {
                        k5o a5 = l5o.a("ANTI");
                        a aVar5 = a.this;
                        a5.f(aVar5.c, "", (MtopBusiness) aVar5.b);
                    }
                } else if (fCMainAction != FCAction.FCMainAction.FAIL) {
                    k5o a6 = l5o.a("ANTI");
                    a aVar6 = a.this;
                    a6.d(aVar6.c, "", (MtopBusiness) aVar6.b);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                        TBSdkLog.w("mtopsdk.FCDuplexFilter", a.this.f18836a.h, "[IFCActionCallback][SUCCESS/CANCEL/TIMEOUT] execute FCDuplexFilter apiKey=" + a.this.f18836a.b.getKey());
                    }
                    a.this.f18836a.c.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
                    a.this.f18836a.c.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                    ui9.b(a.this.f18836a);
                } else if ((j & FCAction.FCSubAction.LOGIN.getValue()) > 0) {
                    MtopBuilder mtopBuilder2 = a.this.b;
                    String str3 = mtopBuilder2.mtopProp.userInfo;
                    if (mtopBuilder2 instanceof MtopBusiness) {
                        MtopListener mtopListener2 = ((MtopBusiness) mtopBuilder2).listener;
                        if (mtopListener2 instanceof IInteractingListener) {
                            ((IInteractingListener) mtopListener2).onInteract("login");
                        }
                    }
                    a aVar7 = a.this;
                    nyn.e(aVar7.c, str3, true, aVar7.b);
                    k5o a7 = l5o.a("ANTI");
                    a aVar8 = a.this;
                    a7.d(aVar8.c, "", (MtopBusiness) aVar8.b);
                    a.this.d.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
                    a.this.d.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                        TBSdkLog.w("mtopsdk.FCDuplexFilter", a.this.f18836a.h, "[IFCActionCallback] execute FCDuplexFilter apiKey=" + a.this.f18836a.b.getKey());
                    }
                    ui9.b(a.this.f18836a);
                } else if ((this.c & FCAction.FCSubAction.FL.getValue()) > 0) {
                    k5o a8 = l5o.a("ANTI");
                    a aVar9 = a.this;
                    a8.d(aVar9.c, "", (MtopBusiness) aVar9.b);
                    String key = a.this.f18836a.b.getKey();
                    Object obj = this.d.get("bx-sleep");
                    if (obj != null) {
                        long longValue = ((Long) obj).longValue();
                        if (longValue > 0) {
                            ApiLockHelper.lock(key, SDKUtils.getCorrectionTime(), longValue);
                        }
                        a.this.f18836a.g.bxSleep = longValue;
                    }
                    ui9.c(a.this.d);
                    if (StringUtils.isBlank(a.this.d.getRetCode())) {
                        a.this.f18836a.c.setRetCode("ANDROID_SYS_API_FLOW_LIMIT_LOCKED");
                        a.this.f18836a.c.setRetMsg(ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED);
                    }
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                        TBSdkLog.w("mtopsdk.FCDuplexFilter", a.this.f18836a.h, "[IFCActionCallback] doAfter execute FlowLimitDuplexFilter apiKey=" + key + " ,retCode=" + a.this.d.getRetCode());
                    }
                    ui9.b(a.this.f18836a);
                } else {
                    k5o a9 = l5o.a("ANTI");
                    a aVar10 = a.this;
                    a9.d(aVar10.c, "", (MtopBusiness) aVar10.b);
                    a.this.f18836a.c.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
                    a.this.f18836a.c.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                        TBSdkLog.w("mtopsdk.FCDuplexFilter", a.this.f18836a.h, "[IFCActionCallback][FAIL] execute FCDuplexFilter apiKey=" + a.this.f18836a.b.getKey());
                    }
                    ui9.b(a.this.f18836a);
                }
            }
        }

        public a(ev8 ev8Var, w4j w4jVar, MtopBuilder mtopBuilder, Mtop mtop, MtopResponse mtopResponse) {
            this.f18836a = w4jVar;
            this.b = mtopBuilder;
            this.c = mtop;
            this.d = mtopResponse;
        }

        @Override // com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback
        public void onAction(long j, FCAction.FCMainAction fCMainAction, long j2, HashMap hashMap) {
            int hashCode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c828ff09", new Object[]{this, new Long(j), fCMainAction, new Long(j2), hashMap});
                return;
            }
            String str = this.f18836a.h;
            if (str != null) {
                hashCode = str.hashCode();
            } else {
                hashCode = hashCode();
            }
            MtopSDKThreadPoolExecutorFactory.submitCallbackTask(hashCode, new RunnableC0916a(j, fCMainAction, j2, hashMap));
        }

        @Override // com.alibaba.wireless.security.open.middletier.fc.IFCActionCallback
        public void onPreAction(long j, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9a58b71", new Object[]{this, new Long(j), new Boolean(z)});
                return;
            }
            this.f18836a.g.bxSessionId = String.valueOf(j);
            this.f18836a.g.bxUI = z;
        }
    }

    static {
        t2o.a(589299832);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        dq9 dq9Var = this.f18835a;
        if (dq9Var != null) {
            return dq9Var.a(w4jVar);
        }
        return "CONTINUE";
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        if ((SwitchConfig.getInstance().getUseSecurityAdapter() & 2) != 2) {
            w4jVar.g.oldFCType = 1;
            return e(w4jVar);
        }
        MtopResponse mtopResponse = w4jVar.c;
        int responseCode = mtopResponse.getResponseCode();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.FCDuplexFilter", " [doAfter]response code " + responseCode);
        }
        MtopStatistics mtopStatistics = w4jVar.g;
        if (mtopStatistics.isSignDegraded) {
            if (w4jVar.t) {
                String str = w4jVar.h;
                TBSdkLog.e("mtopsdk.FCDuplexFilter", str, "[doAfter]skip fc filter, code=" + responseCode);
                return "CONTINUE";
            } else if (!(mtopStatistics.isSignDegradedRetry || responseCode == 419 || responseCode == 420)) {
                return "CONTINUE";
            }
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, "bx-usesg");
        if (StringUtils.isNotBlank(singleHeaderFieldByKey) && !Boolean.parseBoolean(singleHeaderFieldByKey)) {
            w4jVar.g.oldFCType = 2;
            return e(w4jVar);
        } else if (!(w4jVar.o instanceof MtopBusiness)) {
            w4jVar.g.oldFCType = 3;
            return e(w4jVar);
        } else {
            if (headerFields != null) {
                try {
                    HashMap hashMap = new HashMap(headerFields);
                    hashMap.put("requestId", Arrays.asList(w4jVar.o.requestId));
                    IFCComponent iFCComponent = (IFCComponent) SecurityGuardManager.getInstance(w4jVar.f30449a.getMtopConfig().context).getInterface(IFCComponent.class);
                    MtopStatistics mtopStatistics2 = w4jVar.g;
                    mtopStatistics2.fcProcessCheckStartTime = mtopStatistics2.currentTimeMillis();
                    if (iFCComponent != null) {
                        IFCComponent.ResponseHeaderType responseHeaderType = IFCComponent.ResponseHeaderType.KVL;
                        if (iFCComponent.needFCProcessOrNot(responseCode, hashMap, responseHeaderType)) {
                            MtopStatistics mtopStatistics3 = w4jVar.g;
                            mtopStatistics3.fcProcessCheckEndTime = mtopStatistics3.currentTimeMillis();
                            MtopBuilder mtopBuilder = w4jVar.o;
                            Mtop mtop = w4jVar.f30449a;
                            l5o.a("ANTI").a(mtop, "", (MtopBusiness) mtopBuilder);
                            a aVar = new a(this, w4jVar, mtopBuilder, mtop, mtopResponse);
                            MtopStatistics mtopStatistics4 = w4jVar.g;
                            mtopStatistics4.fcProcessStartTime = mtopStatistics4.currentTimeMillis();
                            TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback]start process fc ", w4jVar.h);
                            iFCComponent.processFCContent(responseCode, hashMap, aVar, responseHeaderType);
                            return FilterManager.STOP;
                        }
                    }
                    MtopStatistics mtopStatistics5 = w4jVar.g;
                    mtopStatistics5.fcProcessCheckEndTime = mtopStatistics5.currentTimeMillis();
                } catch (SecException e) {
                    TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback] fc component exception , err code = " + e.getErrorCode());
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.FCDuplexFilter", "[IFCActionCallback] fc component exception , msg = " + th.getMessage());
                }
            }
            return "CONTINUE";
        }
    }

    public final String e(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe31fdc", new Object[]{this, w4jVar});
        }
        if (this.f18835a == null || this.b == null) {
            TBSdkLog.i("mtopsdk.FCDuplexFilter", " [doAfter]flowLimitDuplexFilter or antiAttackAfterFilter create fail ");
            return FilterManager.STOP;
        }
        MtopResponse mtopResponse = w4jVar.c;
        if (mtopResponse != null) {
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.BX_ACTION);
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, "location");
            if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                w4jVar.g.bxAction = singleHeaderFieldByKey;
            }
            if (!TextUtils.isEmpty(singleHeaderFieldByKey2)) {
                w4jVar.g.location = singleHeaderFieldByKey2;
            }
        }
        TBSdkLog.e("mtopsdk.FCDuplexFilter", " [doOldFCAndAntiFilter] use old to do flow control, " + w4jVar.h);
        String c = this.b.c(w4jVar);
        if (c == null || FilterManager.STOP.equals(c)) {
            return c;
        }
        return this.f18835a.c(w4jVar);
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.FCDuplexFilter";
    }
}
