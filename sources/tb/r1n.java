package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class r1n implements yib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ProtocolParamBuilder f27048a;

    static {
        t2o.a(589299825);
        t2o.a(589299813);
    }

    public r1n(ProtocolParamBuilder protocolParamBuilder) {
        this.f27048a = protocolParamBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    @Override // tb.yib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(tb.w4j r11) {
        /*
            r10 = this;
            java.lang.String r0 = "mtopsdk.ProtocolParamBuilderBeforeFilter"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.r1n.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r0 = "8127648a"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            java.lang.Object r11 = r1.ipc$dispatch(r0, r2)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L_0x001b:
            mtopsdk.mtop.domain.MtopRequest r1 = r11.b
            boolean r2 = r10.e(r11)
            java.lang.String r3 = "CONTINUE"
            if (r2 == 0) goto L_0x0026
            return r3
        L_0x0026:
            r2 = 0
            mtopsdk.mtop.protocol.builder.ProtocolParamBuilder r4 = r10.f27048a     // Catch: all -> 0x0085
            java.util.Map r4 = r4.buildParams(r11)     // Catch: all -> 0x0085
            if (r4 != 0) goto L_0x0044
            mtopsdk.mtop.domain.MtopResponse r2 = new mtopsdk.mtop.domain.MtopResponse     // Catch: all -> 0x0042
            java.lang.String r5 = r1.getApiName()     // Catch: all -> 0x0042
            java.lang.String r6 = r1.getVersion()     // Catch: all -> 0x0042
            java.lang.String r7 = "ANDROID_SYS_INIT_MTOP_ISIGN_ERROR"
            java.lang.String r8 = "初始化Mtop签名类ISign失败"
            r2.<init>(r5, r6, r7, r8)     // Catch: all -> 0x0042
            goto L_0x00a2
        L_0x0042:
            r2 = move-exception
            goto L_0x0089
        L_0x0044:
            java.lang.String r5 = "sign"
            java.lang.Object r5 = r4.get(r5)     // Catch: all -> 0x0042
            if (r5 != 0) goto L_0x00a2
            java.lang.String r2 = "SG_ERROR_CODE"
            java.lang.Object r2 = r4.get(r2)     // Catch: all -> 0x0042
            java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x0042
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0042
            r6 = 48
            r5.<init>(r6)     // Catch: all -> 0x0042
            java.lang.String r6 = "ANDROID_SYS_GENERATE_MTOP_SIGN_ERROR"
            r5.append(r6)     // Catch: all -> 0x0042
            if (r2 == 0) goto L_0x0070
            java.lang.String r6 = "("
            r5.append(r6)     // Catch: all -> 0x0042
            r5.append(r2)     // Catch: all -> 0x0042
            java.lang.String r2 = ")"
            r5.append(r2)     // Catch: all -> 0x0042
        L_0x0070:
            mtopsdk.mtop.domain.MtopResponse r2 = new mtopsdk.mtop.domain.MtopResponse     // Catch: all -> 0x0042
            java.lang.String r6 = r1.getApiName()     // Catch: all -> 0x0042
            java.lang.String r7 = r1.getVersion()     // Catch: all -> 0x0042
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x0042
            java.lang.String r8 = "生成Mtop签名sign失败"
            r2.<init>(r6, r7, r5, r8)     // Catch: all -> 0x0042
            goto L_0x00a2
        L_0x0085:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
        L_0x0089:
            java.lang.String r5 = r11.h
            java.lang.String r6 = "[deBefore]execute ProtocolParamBuilder buildParams error."
            mtopsdk.common.util.TBSdkLog.e(r0, r5, r6, r2)
            mtopsdk.mtop.domain.MtopResponse r2 = new mtopsdk.mtop.domain.MtopResponse
            java.lang.String r5 = r1.getApiName()
            java.lang.String r1 = r1.getVersion()
            java.lang.String r6 = "ANDROID_SYS_BUILD_PROTOCOL_PARAMS_ERROR"
            java.lang.String r7 = "组装MTOP协议参数错误"
            r2.<init>(r5, r1, r6, r7)
        L_0x00a2:
            java.lang.String r1 = "STOP"
            if (r2 == 0) goto L_0x00ac
            r11.c = r2
            tb.ui9.b(r11)
            return r1
        L_0x00ac:
            r11.i = r4
            mtopsdk.mtop.global.SwitchConfig r2 = mtopsdk.mtop.global.SwitchConfig.getInstance()
            boolean r2 = r2.isPrefetchLocalModeEnable()
            if (r2 == 0) goto L_0x00e0
            mtopsdk.mtop.intf.MtopBuilder r2 = r11.o
            mtopsdk.mtop.intf.MtopPrefetch r2 = r2.getMtopPrefetch()
            if (r2 == 0) goto L_0x00e0
            mtopsdk.mtop.intf.MtopBuilder r2 = r11.o
            mtopsdk.mtop.intf.MtopPrefetch r2 = r2.getMtopPrefetch()
            boolean r2 = r2.isLocalMode()
            if (r2 == 0) goto L_0x00e0
            mtopsdk.mtop.intf.MtopBuilder r2 = r11.o
            mtopsdk.mtop.intf.MtopPrefetch r2 = r2.getMtopPrefetch()
            long r3 = java.lang.System.currentTimeMillis()
            r2.prefetchResponseTime = r3
            java.lang.String r11 = r11.h
            java.lang.String r2 = "[prefetch]prefetch protocolParams finish, stop."
            mtopsdk.common.util.TBSdkLog.e(r0, r11, r2)
            return r1
        L_0x00e0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r1n.a(tb.w4j):java.lang.String");
    }

    public final boolean e(w4j w4jVar) {
        MtopBuilder mtopBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ce343", new Object[]{this, w4jVar})).booleanValue();
        }
        if (SwitchConfig.getInstance().isPrefetchLocalModeEnable() && w4jVar.o.getMtopPrefetch() == null && (mtopBuilder = w4jVar.f30449a.getPrefetchBuilderMap().get(w4jVar.b.getKey())) != null && mtopBuilder.getMtopPrefetch().isLocalMode()) {
            long currentTimeMillis = System.currentTimeMillis();
            MtopPrefetch.CompareResult compare = mtopBuilder.getMtopPrefetch().getComparator().compare(w4jVar.o, mtopBuilder);
            HashMap<String, String> hashMap = null;
            if (compare == null || !compare.isSame()) {
                MtopPrefetch mtopPrefetch = mtopBuilder.getMtopPrefetch();
                if (compare != null) {
                    hashMap = compare.getData();
                }
                MtopPrefetch.onPrefetchAndCommit("TYPE_MISS", mtopPrefetch, w4jVar, hashMap);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.ProtocolParamBuilderBeforeFilter", w4jVar.h + "not hit, miss not the same request");
                }
            } else if (currentTimeMillis - mtopBuilder.getMtopPrefetch().prefetchResponseTime > mtopBuilder.getMtopPrefetch().getPrefetchExpireTime()) {
                MtopPrefetch.onPrefetchAndCommit("TYPE_EXPIRE", mtopBuilder.getMtopPrefetch(), w4jVar, null);
                w4jVar.f30449a.getPrefetchBuilderMap().remove(w4jVar.b.getKey());
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.ProtocolParamBuilderBeforeFilter", w4jVar.h + "not hit, time expired");
                }
                return false;
            } else if (mtopBuilder.getMtopContext().i != null) {
                w4jVar.i = mtopBuilder.getMtopContext().i;
                MtopStatistics mtopStatistics = w4jVar.g;
                mtopStatistics.isPrefetch = true;
                mtopStatistics.prefetchLocalMode = true;
                TBSdkLog.e("mtopsdk.ProtocolParamBuilderBeforeFilter", w4jVar.h, "hit prefetch.");
                w4jVar.f30449a.getPrefetchBuilderMap().remove(w4jVar.b.getKey());
                return true;
            }
        }
        return false;
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.ProtocolParamBuilderBeforeFilter";
    }
}
