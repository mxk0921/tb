package com.alipay.android.phone.iifaa.did.rpc.model;

import com.alipay.android.phone.iifaa.did.model.VCFilter;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ServiceProviderModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String algorithm;
    public String banner;
    public String challenge;
    public String icon;
    public String isNeedAudited;
    public String isPush;
    public String jumpMethod;
    public String jumpType;
    public String name;
    public String publicKey;
    public String scene;
    public String securityLevel;
    public String spVmId;
    public String spdid;
    public List<VCFilter> vcFilterList;
    public String vmType;
    public List<String> vpTpList;
    public String vpType;

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:686)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:765)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static boolean isValid(com.alipay.android.phone.iifaa.did.rpc.model.ServiceProviderModel r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.phone.iifaa.did.rpc.model.ServiceProviderModel.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "5812ce68"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0019:
            if (r6 == 0) goto L_0x004d
            java.lang.String r2 = r6.spVmId
            java.lang.String r3 = r6.securityLevel
            java.lang.String r4 = r6.spdid
            java.lang.String r5 = r6.publicKey
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5}
            boolean r2 = tb.lsx.i(r2)
            if (r2 != 0) goto L_0x004d
            java.util.List<com.alipay.android.phone.iifaa.did.model.VCFilter> r2 = r6.vcFilterList
            if (r2 == 0) goto L_0x004d
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0038
            goto L_0x004d
        L_0x0038:
            java.lang.String r2 = r6.vpType     // Catch: Exception -> 0x004d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.util.List r2 = com.alibaba.fastjson.JSON.parseArray(r2, r3)     // Catch: Exception -> 0x004d
            r6.vpTpList = r2     // Catch: Exception -> 0x004d
            java.util.List<com.alipay.android.phone.iifaa.did.model.VCFilter> r6 = r6.vcFilterList
            if (r6 == 0) goto L_0x004d
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x004d
            r0 = 1
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.iifaa.did.rpc.model.ServiceProviderModel.isValid(com.alipay.android.phone.iifaa.did.rpc.model.ServiceProviderModel):boolean");
    }
}
