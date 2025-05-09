package com.alibaba.security.wukong.bx.workconf;

import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.service.build.Ta;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseWorkConfHandler implements Ta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class WorkConfResult implements IKeep {
        public String featureNeedDelete;
        public Map<String, Object> finalResult;
    }

    @Override // com.alibaba.security.ccrc.service.build.Ta
    public Map<String, Object> a(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6619832e", new Object[]{this, map, map2, list}) : (list == null || list.isEmpty()) ? map2 : b(map, map2, list);
    }

    public abstract Map<String, Object> b(Map<String, Object> map, Map<String, Object> map2, List<BxData.OpConfItemValue> list);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final String f2922a = "toFilter";
        public static final String b = "toGroup";
        public static final String c = "toCopy";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
            if (r4.equals(com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler.a.b) == false) goto L_0x0020;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler a(java.lang.String r4) {
            /*
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0015
                java.lang.String r3 = "a7d0c166"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r4
                java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
                com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler r4 = (com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler) r4
                return r4
            L_0x0015:
                r4.hashCode()
                r2 = -1
                int r3 = r4.hashCode()
                switch(r3) {
                    case -1176843068: goto L_0x003a;
                    case -869368688: goto L_0x002e;
                    case 2135539155: goto L_0x0022;
                    default: goto L_0x0020;
                }
            L_0x0020:
                r0 = -1
                goto L_0x0044
            L_0x0022:
                java.lang.String r0 = "toFilter"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x002c
                goto L_0x0020
            L_0x002c:
                r0 = 2
                goto L_0x0044
            L_0x002e:
                java.lang.String r0 = "toCopy"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0038
                goto L_0x0020
            L_0x0038:
                r0 = 1
                goto L_0x0044
            L_0x003a:
                java.lang.String r1 = "toGroup"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L_0x0044
                goto L_0x0020
            L_0x0044:
                switch(r0) {
                    case 0: goto L_0x0055;
                    case 1: goto L_0x004f;
                    case 2: goto L_0x0049;
                    default: goto L_0x0047;
                }
            L_0x0047:
                r4 = 0
                return r4
            L_0x0049:
                com.alibaba.security.ccrc.service.build.Va r4 = new com.alibaba.security.ccrc.service.build.Va
                r4.<init>()
                return r4
            L_0x004f:
                com.alibaba.security.ccrc.service.build.Ua r4 = new com.alibaba.security.ccrc.service.build.Ua
                r4.<init>()
                return r4
            L_0x0055:
                com.alibaba.security.ccrc.service.build.Wa r4 = new com.alibaba.security.ccrc.service.build.Wa
                r4.<init>()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler.a.a(java.lang.String):com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler");
        }
    }

    public static <T> List<T> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18196f83", new Object[]{obj});
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException("The provided object is not a List.");
    }
}
