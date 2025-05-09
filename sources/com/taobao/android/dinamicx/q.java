package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.pb6;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596578);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|39|11|(2:44|12)|42|20|(2:22|(1:31)(1:28))(1:32)|41) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        if (com.taobao.android.dinamicx.DinamicXEngine.j0() != false) goto L_0x00cc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
        r9 = (java.util.ArrayList) r9.m().c;
        r9.add(new com.taobao.android.dinamicx.f.a("Pipeline", "Pipeline_Stage_Load_Binary", com.taobao.android.dinamicx.f.DXERROR_PIPELINE_PARSE_WT_EXPR_SET_VALUE));
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: Exception -> 0x00b4, TryCatch #1 {Exception -> 0x00b4, blocks: (B:20:0x0074, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:28:0x009c, B:31:0x00b6, B:32:0x00be), top: B:42:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b4, blocks: (B:20:0x0074, B:22:0x0078, B:24:0x0082, B:26:0x008c, B:28:0x009c, B:31:0x00b6, B:32:0x00be), top: B:42:0x0074 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cf -> B:41:0x00e2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(com.taobao.android.dinamicx.widget.DXWidgetNode r8, com.taobao.android.dinamicx.DXRuntimeContext r9) {
        /*
            java.lang.String r0 = "Pipeline_Stage_Load_Binary"
            java.lang.String r1 = "Pipeline"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.q.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.String r0 = "9e9072e4"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r8
            r8 = 1
            r1[r8] = r9
            java.lang.Object r8 = r2.ipc$dispatch(r0, r1)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            return r8
        L_0x0020:
            androidx.collection.LongSparseArray r2 = r8.getDataParsersExprNode()
            if (r2 == 0) goto L_0x00e2
            androidx.collection.LongSparseArray r2 = r8.getDataParsersExprNode()
            r3 = 5802348655878590802(0x5086155c409bd152, double:8.182680092428053E79)
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L_0x00e2
            androidx.collection.LongSparseArray r2 = r8.getDataParsersExprNode()
            java.lang.Object r2 = r2.get(r3)
            tb.fw5 r2 = (tb.fw5) r2
            r5 = 0
            tb.o4c r6 = tb.gw5.e()     // Catch: Exception -> 0x0056
            r6.d(r2, r5, r9)     // Catch: Exception -> 0x0056
            java.lang.Object r6 = r2.b(r5, r9)     // Catch: Exception -> 0x0056
            tb.o4c r7 = tb.gw5.e()     // Catch: Exception -> 0x0053
            r7.b(r2, r5, r9)     // Catch: Exception -> 0x0053
            goto L_0x0074
        L_0x0053:
            r2 = move-exception
            r5 = r6
            goto L_0x0057
        L_0x0056:
            r2 = move-exception
        L_0x0057:
            boolean r6 = com.taobao.android.dinamicx.DinamicXEngine.j0()
            if (r6 == 0) goto L_0x0060
            r2.printStackTrace()
        L_0x0060:
            com.taobao.android.dinamicx.f r2 = r9.m()
            java.util.List<com.taobao.android.dinamicx.f$a> r2 = r2.c
            com.taobao.android.dinamicx.f$a r6 = new com.taobao.android.dinamicx.f$a
            r7 = 71002(0x1155a, float:9.9495E-41)
            r6.<init>(r1, r0, r7)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r6)
            r6 = r5
        L_0x0074:
            boolean r2 = r6 instanceof java.lang.String     // Catch: Exception -> 0x00b4
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: Exception -> 0x00b4
            com.taobao.android.dinamicx.model.DXLongSparseArray r5 = r8.getEnumMap()     // Catch: Exception -> 0x00b4
            if (r5 == 0) goto L_0x00b6
            com.taobao.android.dinamicx.model.DXLongSparseArray r5 = r8.getEnumMap()     // Catch: Exception -> 0x00b4
            java.lang.Object r5 = r5.get(r3)     // Catch: Exception -> 0x00b4
            if (r5 == 0) goto L_0x00b6
            com.taobao.android.dinamicx.model.DXLongSparseArray r5 = r8.getEnumMap()     // Catch: Exception -> 0x00b4
            java.lang.Object r5 = r5.get(r3)     // Catch: Exception -> 0x00b4
            java.util.Map r5 = (java.util.Map) r5     // Catch: Exception -> 0x00b4
            java.lang.Object r5 = r5.get(r2)     // Catch: Exception -> 0x00b4
            if (r5 == 0) goto L_0x00b6
            com.taobao.android.dinamicx.model.DXLongSparseArray r5 = r8.getEnumMap()     // Catch: Exception -> 0x00b4
            java.lang.Object r5 = r5.get(r3)     // Catch: Exception -> 0x00b4
            java.util.Map r5 = (java.util.Map) r5     // Catch: Exception -> 0x00b4
            java.lang.Object r2 = r5.get(r2)     // Catch: Exception -> 0x00b4
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: Exception -> 0x00b4
            int r2 = r2.intValue()     // Catch: Exception -> 0x00b4
            r8.setIntAttribute(r3, r2)     // Catch: Exception -> 0x00b4
            goto L_0x00e2
        L_0x00b4:
            r2 = move-exception
            goto L_0x00c6
        L_0x00b6:
            int r2 = r8.getDefaultValueForIntAttr(r3)     // Catch: Exception -> 0x00b4
            r8.setIntAttribute(r3, r2)     // Catch: Exception -> 0x00b4
            goto L_0x00e2
        L_0x00be:
            int r2 = r8.getDefaultValueForIntAttr(r3)     // Catch: Exception -> 0x00b4
            r8.setIntAttribute(r3, r2)     // Catch: Exception -> 0x00b4
            goto L_0x00e2
        L_0x00c6:
            boolean r3 = com.taobao.android.dinamicx.DinamicXEngine.j0()
            if (r3 == 0) goto L_0x00cf
            r2.printStackTrace()
        L_0x00cf:
            com.taobao.android.dinamicx.f r9 = r9.m()
            java.util.List<com.taobao.android.dinamicx.f$a> r9 = r9.c
            com.taobao.android.dinamicx.f$a r2 = new com.taobao.android.dinamicx.f$a
            r3 = 71003(0x1155b, float:9.9496E-41)
            r2.<init>(r1, r0, r3)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r2)
        L_0x00e2:
            int r8 = r8.getVisibility()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.q.a(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext):int");
    }

    public final void b(Context context, DXWidgetNode dXWidgetNode, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8aaa5", new Object[]{this, context, dXWidgetNode, new Long(j), obj});
        } else {
            dXWidgetNode.setIntAttribute(j, pb6.p(dXWidgetNode.getEngine(), context, String.valueOf(obj), dXWidgetNode.getDefaultValueForIntAttr(j)));
        }
    }

    @Deprecated
    public DXWidgetNode c(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("897a7876", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        try {
            e(dXWidgetNode);
            f(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
            return dXWidgetNode;
        } catch (Exception e) {
            xv5.b(e);
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_PARSE_WT_EXCEPTION, xv5.a(e)));
            return null;
        }
    }

    public final void e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7139e453", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null && dXWidgetNode.getDxv3VariableInfo() != null) {
            dXWidgetNode.getDxv3VariableInfo().a();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:47|273|48|(2:291|49)|280|58|(2:60|(1:75)(3:66|67|(2:69|(2:71|72)(1:301))))(1:76)|279) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r15 == false) goto L_0x00a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r24.getStatInPrivateFlags(2) != false) goto L_0x00a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0157, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016e, code lost:
        if (com.taobao.android.dinamicx.DinamicXEngine.j0() != false) goto L_0x0170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0173, code lost:
        ((java.util.ArrayList) r25.m().c).add(new com.taobao.android.dinamicx.f.a(r13, r2, com.taobao.android.dinamicx.f.DXERROR_PIPELINE_PARSE_WT_EXPR_SET_VALUE));
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3 A[Catch: all -> 0x0051, Exception -> 0x0055, TryCatch #8 {Exception -> 0x0055, blocks: (B:6:0x0023, B:8:0x0029, B:13:0x0059, B:15:0x0064, B:17:0x006a, B:23:0x007e, B:25:0x0084, B:27:0x008a, B:30:0x0092, B:32:0x0098, B:37:0x00a3, B:40:0x00aa, B:42:0x00af, B:44:0x00b5, B:47:0x00c7, B:54:0x00ee, B:56:0x00f4, B:57:0x00f7, B:77:0x016a, B:79:0x0170, B:80:0x0173, B:82:0x0187, B:84:0x0191, B:87:0x01ae, B:99:0x01dd, B:101:0x01e3, B:102:0x01e6, B:103:0x01f9, B:105:0x0201, B:109:0x022e, B:111:0x0238, B:113:0x0242, B:115:0x0252, B:116:0x026b, B:145:0x02b9, B:146:0x02bd, B:147:0x02c5, B:149:0x02c9, B:151:0x02d3, B:153:0x02dd, B:155:0x02ed, B:156:0x0305, B:157:0x030d, B:159:0x0317, B:161:0x031d, B:163:0x0323, B:166:0x032f, B:167:0x034a, B:169:0x0351, B:171:0x0357, B:173:0x0360, B:176:0x036d, B:177:0x0388, B:178:0x038d, B:184:0x03ae, B:186:0x03b8, B:187:0x040b, B:188:0x0410, B:189:0x0414, B:192:0x041d, B:194:0x0421, B:195:0x0428, B:198:0x0435, B:200:0x0447, B:203:0x0466, B:205:0x0478, B:208:0x0497, B:212:0x04ab, B:213:0x0508, B:216:0x051e, B:217:0x0521, B:220:0x0529, B:222:0x0534, B:224:0x053d, B:226:0x0545, B:229:0x0551, B:231:0x0559, B:233:0x055d, B:235:0x0566, B:236:0x0569, B:237:0x0570, B:239:0x0576, B:240:0x057d, B:241:0x0583, B:242:0x0588, B:244:0x058e, B:246:0x059f, B:248:0x05a5, B:250:0x05ab, B:252:0x05b5, B:255:0x05cb, B:256:0x05d5, B:257:0x05d7), top: B:284:0x0023, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0201 A[Catch: all -> 0x0051, Exception -> 0x0055, TryCatch #8 {Exception -> 0x0055, blocks: (B:6:0x0023, B:8:0x0029, B:13:0x0059, B:15:0x0064, B:17:0x006a, B:23:0x007e, B:25:0x0084, B:27:0x008a, B:30:0x0092, B:32:0x0098, B:37:0x00a3, B:40:0x00aa, B:42:0x00af, B:44:0x00b5, B:47:0x00c7, B:54:0x00ee, B:56:0x00f4, B:57:0x00f7, B:77:0x016a, B:79:0x0170, B:80:0x0173, B:82:0x0187, B:84:0x0191, B:87:0x01ae, B:99:0x01dd, B:101:0x01e3, B:102:0x01e6, B:103:0x01f9, B:105:0x0201, B:109:0x022e, B:111:0x0238, B:113:0x0242, B:115:0x0252, B:116:0x026b, B:145:0x02b9, B:146:0x02bd, B:147:0x02c5, B:149:0x02c9, B:151:0x02d3, B:153:0x02dd, B:155:0x02ed, B:156:0x0305, B:157:0x030d, B:159:0x0317, B:161:0x031d, B:163:0x0323, B:166:0x032f, B:167:0x034a, B:169:0x0351, B:171:0x0357, B:173:0x0360, B:176:0x036d, B:177:0x0388, B:178:0x038d, B:184:0x03ae, B:186:0x03b8, B:187:0x040b, B:188:0x0410, B:189:0x0414, B:192:0x041d, B:194:0x0421, B:195:0x0428, B:198:0x0435, B:200:0x0447, B:203:0x0466, B:205:0x0478, B:208:0x0497, B:212:0x04ab, B:213:0x0508, B:216:0x051e, B:217:0x0521, B:220:0x0529, B:222:0x0534, B:224:0x053d, B:226:0x0545, B:229:0x0551, B:231:0x0559, B:233:0x055d, B:235:0x0566, B:236:0x0569, B:237:0x0570, B:239:0x0576, B:240:0x057d, B:241:0x0583, B:242:0x0588, B:244:0x058e, B:246:0x059f, B:248:0x05a5, B:250:0x05ab, B:252:0x05b5, B:255:0x05cb, B:256:0x05d5, B:257:0x05d7), top: B:284:0x0023, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x051e A[Catch: all -> 0x0051, Exception -> 0x0055, TryCatch #8 {Exception -> 0x0055, blocks: (B:6:0x0023, B:8:0x0029, B:13:0x0059, B:15:0x0064, B:17:0x006a, B:23:0x007e, B:25:0x0084, B:27:0x008a, B:30:0x0092, B:32:0x0098, B:37:0x00a3, B:40:0x00aa, B:42:0x00af, B:44:0x00b5, B:47:0x00c7, B:54:0x00ee, B:56:0x00f4, B:57:0x00f7, B:77:0x016a, B:79:0x0170, B:80:0x0173, B:82:0x0187, B:84:0x0191, B:87:0x01ae, B:99:0x01dd, B:101:0x01e3, B:102:0x01e6, B:103:0x01f9, B:105:0x0201, B:109:0x022e, B:111:0x0238, B:113:0x0242, B:115:0x0252, B:116:0x026b, B:145:0x02b9, B:146:0x02bd, B:147:0x02c5, B:149:0x02c9, B:151:0x02d3, B:153:0x02dd, B:155:0x02ed, B:156:0x0305, B:157:0x030d, B:159:0x0317, B:161:0x031d, B:163:0x0323, B:166:0x032f, B:167:0x034a, B:169:0x0351, B:171:0x0357, B:173:0x0360, B:176:0x036d, B:177:0x0388, B:178:0x038d, B:184:0x03ae, B:186:0x03b8, B:187:0x040b, B:188:0x0410, B:189:0x0414, B:192:0x041d, B:194:0x0421, B:195:0x0428, B:198:0x0435, B:200:0x0447, B:203:0x0466, B:205:0x0478, B:208:0x0497, B:212:0x04ab, B:213:0x0508, B:216:0x051e, B:217:0x0521, B:220:0x0529, B:222:0x0534, B:224:0x053d, B:226:0x0545, B:229:0x0551, B:231:0x0559, B:233:0x055d, B:235:0x0566, B:236:0x0569, B:237:0x0570, B:239:0x0576, B:240:0x057d, B:241:0x0583, B:242:0x0588, B:244:0x058e, B:246:0x059f, B:248:0x05a5, B:250:0x05ab, B:252:0x05b5, B:255:0x05cb, B:256:0x05d5, B:257:0x05d7), top: B:284:0x0023, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0534 A[Catch: all -> 0x0051, Exception -> 0x0055, TryCatch #8 {Exception -> 0x0055, blocks: (B:6:0x0023, B:8:0x0029, B:13:0x0059, B:15:0x0064, B:17:0x006a, B:23:0x007e, B:25:0x0084, B:27:0x008a, B:30:0x0092, B:32:0x0098, B:37:0x00a3, B:40:0x00aa, B:42:0x00af, B:44:0x00b5, B:47:0x00c7, B:54:0x00ee, B:56:0x00f4, B:57:0x00f7, B:77:0x016a, B:79:0x0170, B:80:0x0173, B:82:0x0187, B:84:0x0191, B:87:0x01ae, B:99:0x01dd, B:101:0x01e3, B:102:0x01e6, B:103:0x01f9, B:105:0x0201, B:109:0x022e, B:111:0x0238, B:113:0x0242, B:115:0x0252, B:116:0x026b, B:145:0x02b9, B:146:0x02bd, B:147:0x02c5, B:149:0x02c9, B:151:0x02d3, B:153:0x02dd, B:155:0x02ed, B:156:0x0305, B:157:0x030d, B:159:0x0317, B:161:0x031d, B:163:0x0323, B:166:0x032f, B:167:0x034a, B:169:0x0351, B:171:0x0357, B:173:0x0360, B:176:0x036d, B:177:0x0388, B:178:0x038d, B:184:0x03ae, B:186:0x03b8, B:187:0x040b, B:188:0x0410, B:189:0x0414, B:192:0x041d, B:194:0x0421, B:195:0x0428, B:198:0x0435, B:200:0x0447, B:203:0x0466, B:205:0x0478, B:208:0x0497, B:212:0x04ab, B:213:0x0508, B:216:0x051e, B:217:0x0521, B:220:0x0529, B:222:0x0534, B:224:0x053d, B:226:0x0545, B:229:0x0551, B:231:0x0559, B:233:0x055d, B:235:0x0566, B:236:0x0569, B:237:0x0570, B:239:0x0576, B:240:0x057d, B:241:0x0583, B:242:0x0588, B:244:0x058e, B:246:0x059f, B:248:0x05a5, B:250:0x05ab, B:252:0x05b5, B:255:0x05cb, B:256:0x05d5, B:257:0x05d7), top: B:284:0x0023, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x058e A[Catch: all -> 0x0051, Exception -> 0x0055, TryCatch #8 {Exception -> 0x0055, blocks: (B:6:0x0023, B:8:0x0029, B:13:0x0059, B:15:0x0064, B:17:0x006a, B:23:0x007e, B:25:0x0084, B:27:0x008a, B:30:0x0092, B:32:0x0098, B:37:0x00a3, B:40:0x00aa, B:42:0x00af, B:44:0x00b5, B:47:0x00c7, B:54:0x00ee, B:56:0x00f4, B:57:0x00f7, B:77:0x016a, B:79:0x0170, B:80:0x0173, B:82:0x0187, B:84:0x0191, B:87:0x01ae, B:99:0x01dd, B:101:0x01e3, B:102:0x01e6, B:103:0x01f9, B:105:0x0201, B:109:0x022e, B:111:0x0238, B:113:0x0242, B:115:0x0252, B:116:0x026b, B:145:0x02b9, B:146:0x02bd, B:147:0x02c5, B:149:0x02c9, B:151:0x02d3, B:153:0x02dd, B:155:0x02ed, B:156:0x0305, B:157:0x030d, B:159:0x0317, B:161:0x031d, B:163:0x0323, B:166:0x032f, B:167:0x034a, B:169:0x0351, B:171:0x0357, B:173:0x0360, B:176:0x036d, B:177:0x0388, B:178:0x038d, B:184:0x03ae, B:186:0x03b8, B:187:0x040b, B:188:0x0410, B:189:0x0414, B:192:0x041d, B:194:0x0421, B:195:0x0428, B:198:0x0435, B:200:0x0447, B:203:0x0466, B:205:0x0478, B:208:0x0497, B:212:0x04ab, B:213:0x0508, B:216:0x051e, B:217:0x0521, B:220:0x0529, B:222:0x0534, B:224:0x053d, B:226:0x0545, B:229:0x0551, B:231:0x0559, B:233:0x055d, B:235:0x0566, B:236:0x0569, B:237:0x0570, B:239:0x0576, B:240:0x057d, B:241:0x0583, B:242:0x0588, B:244:0x058e, B:246:0x059f, B:248:0x05a5, B:250:0x05ab, B:252:0x05b5, B:255:0x05cb, B:256:0x05d5, B:257:0x05d7), top: B:284:0x0023, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b A[Catch: all -> 0x0051, Exception -> 0x0157, TryCatch #6 {Exception -> 0x0157, blocks: (B:58:0x0107, B:60:0x010b, B:62:0x0115, B:64:0x011f, B:66:0x012f, B:75:0x015a, B:76:0x0162), top: B:280:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162 A[Catch: all -> 0x0051, Exception -> 0x0157, TRY_LEAVE, TryCatch #6 {Exception -> 0x0157, blocks: (B:58:0x0107, B:60:0x010b, B:62:0x0115, B:64:0x011f, B:66:0x012f, B:75:0x015a, B:76:0x0162), top: B:280:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191 A[Catch: all -> 0x0051, Exception -> 0x0055, TryCatch #8 {Exception -> 0x0055, blocks: (B:6:0x0023, B:8:0x0029, B:13:0x0059, B:15:0x0064, B:17:0x006a, B:23:0x007e, B:25:0x0084, B:27:0x008a, B:30:0x0092, B:32:0x0098, B:37:0x00a3, B:40:0x00aa, B:42:0x00af, B:44:0x00b5, B:47:0x00c7, B:54:0x00ee, B:56:0x00f4, B:57:0x00f7, B:77:0x016a, B:79:0x0170, B:80:0x0173, B:82:0x0187, B:84:0x0191, B:87:0x01ae, B:99:0x01dd, B:101:0x01e3, B:102:0x01e6, B:103:0x01f9, B:105:0x0201, B:109:0x022e, B:111:0x0238, B:113:0x0242, B:115:0x0252, B:116:0x026b, B:145:0x02b9, B:146:0x02bd, B:147:0x02c5, B:149:0x02c9, B:151:0x02d3, B:153:0x02dd, B:155:0x02ed, B:156:0x0305, B:157:0x030d, B:159:0x0317, B:161:0x031d, B:163:0x0323, B:166:0x032f, B:167:0x034a, B:169:0x0351, B:171:0x0357, B:173:0x0360, B:176:0x036d, B:177:0x0388, B:178:0x038d, B:184:0x03ae, B:186:0x03b8, B:187:0x040b, B:188:0x0410, B:189:0x0414, B:192:0x041d, B:194:0x0421, B:195:0x0428, B:198:0x0435, B:200:0x0447, B:203:0x0466, B:205:0x0478, B:208:0x0497, B:212:0x04ab, B:213:0x0508, B:216:0x051e, B:217:0x0521, B:220:0x0529, B:222:0x0534, B:224:0x053d, B:226:0x0545, B:229:0x0551, B:231:0x0559, B:233:0x055d, B:235:0x0566, B:236:0x0569, B:237:0x0570, B:239:0x0576, B:240:0x057d, B:241:0x0583, B:242:0x0588, B:244:0x058e, B:246:0x059f, B:248:0x05a5, B:250:0x05ab, B:252:0x05b5, B:255:0x05cb, B:256:0x05d5, B:257:0x05d7), top: B:284:0x0023, outer: #10 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0173 -> B:279:0x0186). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.taobao.android.dinamicx.widget.DXWidgetNode r24, com.taobao.android.dinamicx.DXRuntimeContext r25, com.taobao.android.dinamicx.DXRenderOptions r26) {
        /*
            Method dump skipped, instructions count: 1519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.q.f(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):void");
    }

    public final void g(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187814b9", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setDoubleAttribute(j, dXWidgetNode.getDefaultValueForDoubleAttr(j));
        }
    }

    public final void h(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61679a30", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setIntAttribute(j, dXWidgetNode.getDefaultValueForIntAttr(j));
        }
    }

    public final void i(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec4990c", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setListAttribute(j, dXWidgetNode.getDefaultValueForListAttr(j));
        }
    }

    public final void j(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a272eee", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setLongAttribute(j, dXWidgetNode.getDefaultValueForLongAttr(j));
        }
    }

    public final void k(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad17ad2", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setMapAttribute(j, dXWidgetNode.getDefaultValueForMapAttr(j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.taobao.android.dinamicx.widget.DXWidgetNode r18, com.taobao.android.dinamicx.DXRuntimeContext r19) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.q.d(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
