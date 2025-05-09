package com.taobao.message.sp.framework.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0007H\u0007¢\u0006\u0002\u0010\u000eR*\u0010\u0003\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleServiceFactory;", "", "()V", "serviceHolder", "", "Lkotlin/Pair;", "", "Ljava/lang/Class;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "obtain", "T", "identifier", "channelType", "serviceClazz", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleServiceFactory INSTANCE = new SimpleServiceFactory();
    private static final Map<Pair<String, Class<?>>, ISimpleDataService> serviceHolder = new LinkedHashMap();

    static {
        t2o.a(552599714);
    }

    private SimpleServiceFactory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends com.taobao.message.sp.framework.service.ISimpleDataService> T obtain(java.lang.String r7, java.lang.String r8, java.lang.Class<T> r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.sp.framework.service.SimpleServiceFactory.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "8b8abbb6"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r7 = 1
            r2[r7] = r8
            r7 = 2
            r2[r7] = r9
            java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
            com.taobao.message.sp.framework.service.ISimpleDataService r7 = (com.taobao.message.sp.framework.service.ISimpleDataService) r7
            return r7
        L_0x001b:
            java.lang.String r0 = "identifier"
            tb.ckf.h(r7, r0)
            java.lang.String r0 = "channelType"
            tb.ckf.h(r8, r0)
            java.lang.String r0 = "serviceClazz"
            tb.ckf.h(r9, r0)
            java.util.Map<kotlin.Pair<java.lang.String, java.lang.Class<?>>, com.taobao.message.sp.framework.service.ISimpleDataService> r0 = com.taobao.message.sp.framework.service.SimpleServiceFactory.serviceHolder
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = r7.concat(r8)
            r1.<init>(r2, r9)
            java.lang.Object r1 = r0.get(r1)
            com.taobao.message.sp.framework.service.ISimpleDataService r1 = (com.taobao.message.sp.framework.service.ISimpleDataService) r1
            if (r1 != 0) goto L_0x00d7
            int r1 = r8.hashCode()
            r2 = 96673(0x179a1, float:1.35468E-40)
            java.lang.Class<com.taobao.message.sp.framework.service.ISimpleConversationService> r3 = com.taobao.message.sp.framework.service.ISimpleConversationService.class
            r4 = 0
            if (r1 == r2) goto L_0x00b4
            r2 = 3235939(0x316063, float:4.534516E-39)
            java.lang.Class<com.taobao.message.sp.framework.service.ISimpleProfileService> r5 = com.taobao.message.sp.framework.service.ISimpleProfileService.class
            java.lang.Class<com.taobao.message.sp.framework.service.ISimpleMessageService> r6 = com.taobao.message.sp.framework.service.ISimpleMessageService.class
            if (r1 == r2) goto L_0x0088
            r2 = 100311356(0x5faa13c, float:2.3569115E-35)
            if (r1 == r2) goto L_0x005a
            goto L_0x00d6
        L_0x005a:
            java.lang.String r1 = "im_bc"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r9.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x006e
            com.taobao.message.sp.framework.implement.SimpleBCConversationService r1 = new com.taobao.message.sp.framework.implement.SimpleBCConversationService
            r1.<init>(r7, r8)
            goto L_0x00c7
        L_0x006e:
            boolean r1 = r9.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x007a
            com.taobao.message.sp.framework.implement.SimpleBCMessageService r1 = new com.taobao.message.sp.framework.implement.SimpleBCMessageService
            r1.<init>(r7, r8)
            goto L_0x00c7
        L_0x007a:
            boolean r1 = r9.isAssignableFrom(r5)
            if (r1 == 0) goto L_0x0086
            com.taobao.message.sp.framework.implement.SimpleBCProfileService r1 = new com.taobao.message.sp.framework.implement.SimpleBCProfileService
            r1.<init>(r7, r8)
            goto L_0x00c7
        L_0x0086:
            r1 = r4
            goto L_0x00c7
        L_0x0088:
            java.lang.String r1 = "imba"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r9.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x009c
            com.taobao.message.sp.framework.implement.SimpleIMBAConversationService r1 = new com.taobao.message.sp.framework.implement.SimpleIMBAConversationService
            r1.<init>(r7, r8)
            goto L_0x00c7
        L_0x009c:
            boolean r1 = r9.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x00a8
            com.taobao.message.sp.framework.implement.SimpleIMBAMessageService r1 = new com.taobao.message.sp.framework.implement.SimpleIMBAMessageService
            r1.<init>(r7, r8)
            goto L_0x00c7
        L_0x00a8:
            boolean r1 = r9.isAssignableFrom(r5)
            if (r1 == 0) goto L_0x0086
            com.taobao.message.sp.framework.implement.SimpleIMBAProfileService r1 = new com.taobao.message.sp.framework.implement.SimpleIMBAProfileService
            r1.<init>(r7, r8)
            goto L_0x00c7
        L_0x00b4:
            java.lang.String r1 = "all"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r9.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x0086
            com.taobao.message.sp.framework.implement.SimpleAllConversationService r1 = new com.taobao.message.sp.framework.implement.SimpleAllConversationService
            r1.<init>(r7, r8)
        L_0x00c7:
            if (r1 == 0) goto L_0x00d7
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r7 = r7.concat(r8)
            r2.<init>(r7, r9)
            r0.put(r2, r1)
            goto L_0x00d7
        L_0x00d6:
            return r4
        L_0x00d7:
            if (r1 == 0) goto L_0x00da
            return r1
        L_0x00da:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type T"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.framework.service.SimpleServiceFactory.obtain(java.lang.String, java.lang.String, java.lang.Class):com.taobao.message.sp.framework.service.ISimpleDataService");
    }
}
