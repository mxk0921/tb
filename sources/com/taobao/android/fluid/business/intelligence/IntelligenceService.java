package com.taobao.android.fluid.business.intelligence;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.List;
import tb.ar9;
import tb.f92;
import tb.ief;
import tb.p91;
import tb.t2o;
import tb.ywi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IntelligenceService implements IIntelligenceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IIntelligenceService";
    private f92 mBehaviorXManager;
    private final FluidContext mFluidContext;
    private final String TAG = "IntelligenceService";
    private ywi reorderContentBridge = null;
    private SmartMobileBroadcastHandler smartMobileBroadcastHandler = null;
    private final ief mIntelligenceServiceConfig = new ief();

    static {
        t2o.a(468713511);
        t2o.a(468713510);
    }

    public IntelligenceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    private List getBufferList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7205d16c", new Object[]{this});
        }
        return null;
    }

    private List getItemList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this});
        }
        return ((IDataService) this.mFluidContext.getService(IDataService.class)).getUnExposeItems();
    }

    public static void throwErrorCode(FluidContext fluidContext, int i, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e93c310", new Object[]{fluidContext, new Integer(i), str, th});
        } else if (fluidContext != null) {
            ar9 ar9Var = new ar9(ar9.PREFIX_FLUID_INTELLIGENCE_SERVICE + String.valueOf(i), str);
            if (th != null) {
                FluidException.throwException(fluidContext, ar9.SERVICE_CONSTRUCTOR_ERROR, th);
            } else {
                FluidException.throwException(fluidContext, ar9Var, str);
            }
        }
    }

    @Override // com.taobao.android.fluid.business.intelligence.IIntelligenceService
    public ief getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ief) ipChange.ipc$dispatch("afb1b4cc", new Object[]{this});
        }
        return this.mIntelligenceServiceConfig;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.reorderContentBridge = new ywi(this.mFluidContext);
        this.mBehaviorXManager = new f92(this.mFluidContext);
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this.mBehaviorXManager);
        if (!p91.l()) {
            this.smartMobileBroadcastHandler = new SmartMobileBroadcastHandler(this.mFluidContext);
            ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this.smartMobileBroadcastHandler);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    @Override // com.taobao.android.fluid.business.intelligence.IIntelligenceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getBehaviorInput(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.fluid.business.intelligence.IntelligenceService.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r7)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            r0 = 1
            r7[r0] = r2
            java.lang.String r0 = "a8ae5707"
            java.lang.Object r7 = r1.ipc$dispatch(r0, r7)
            return r7
        L_0x001b:
            com.taobao.android.fluid.core.FluidContext r1 = r6.mFluidContext
            java.lang.Class<com.taobao.android.fluid.framework.data.IDataService> r2 = com.taobao.android.fluid.framework.data.IDataService.class
            com.taobao.android.fluid.core.FluidService r1 = r1.getService(r2)
            com.taobao.android.fluid.framework.data.IDataService r1 = (com.taobao.android.fluid.framework.data.IDataService) r1
            tb.ws6 r1 = r1.getConfig()
            tb.ncp r1 = r1.j()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.n
            r2 = 0
            if (r1 == 0) goto L_0x0073
            java.lang.String r3 = "config"
            if (r7 == 0) goto L_0x0055
            java.lang.String r4 = "videoReRank"
            java.lang.Object r1 = r1.get(r4)
            boolean r4 = r1 instanceof java.util.Map
            if (r4 == 0) goto L_0x0073
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r1.get(r3)
            if (r4 == 0) goto L_0x0074
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L_0x0074
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            r1.put(r3, r4)
            goto L_0x0074
        L_0x0055:
            java.lang.String r4 = "dynamicRecommend"
            java.lang.Object r1 = r1.get(r4)
            boolean r4 = r1 instanceof java.util.Map
            if (r4 == 0) goto L_0x0073
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r1.get(r3)
            if (r4 == 0) goto L_0x0074
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L_0x0074
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            r1.put(r3, r4)
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.List r4 = r6.getItemList()
            if (r7 == 0) goto L_0x0083
            java.util.List r2 = r6.getBufferList()
        L_0x0083:
            if (r4 == 0) goto L_0x0089
            int r0 = r4.size()
        L_0x0089:
            if (r4 == 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0091:
            if (r2 == 0) goto L_0x0096
            r4.addAll(r2)
        L_0x0096:
            java.lang.String r7 = "itemList"
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r4)
            r3.put(r7, r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "unExposeCount"
            r3.put(r0, r7)
            if (r1 == 0) goto L_0x00ae
            r3.putAll(r1)
        L_0x00ae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.intelligence.IntelligenceService.getBehaviorInput(boolean):java.lang.Object");
    }
}
