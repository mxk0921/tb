package tb;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ud5 extends hd5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597732);
    }

    public static /* synthetic */ Object ipc$super(ud5 ud5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_smooth_butter/load/DXButterBinaryLoader");
    }

    @Override // tb.hd5
    /* renamed from: c */
    public oub<oub> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oub) ipChange.ipc$dispatch("dc6382b", new Object[]{this});
        }
        return new ud5();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039c A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8 A[Catch: Exception -> 0x007e, LOOP:4: B:146:0x03a6->B:147:0x03a8, LOOP_END, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0264 A[Catch: Exception -> 0x007e, TRY_ENTER, TryCatch #0 {Exception -> 0x007e, blocks: (B:10:0x0049, B:13:0x005c, B:16:0x0081, B:18:0x0089, B:20:0x00a2, B:22:0x00ac, B:24:0x00c7, B:32:0x00ed, B:34:0x00f3, B:37:0x00f9, B:39:0x0131, B:41:0x0138, B:43:0x0140, B:45:0x017a, B:46:0x01b3, B:49:0x01bb, B:52:0x01c1, B:75:0x020b, B:79:0x021e, B:81:0x022d, B:83:0x0236, B:84:0x023d, B:85:0x0249, B:88:0x0251, B:90:0x0257, B:94:0x0264, B:96:0x026f, B:98:0x0278, B:103:0x0289, B:105:0x028f, B:107:0x0299, B:109:0x02ca, B:111:0x02d6, B:112:0x02dc, B:114:0x02e9, B:116:0x02f1, B:118:0x02fd, B:120:0x0303, B:121:0x0306, B:124:0x031e, B:125:0x0327, B:128:0x0335, B:130:0x033b, B:133:0x0341, B:135:0x034b, B:137:0x0353, B:139:0x038c, B:140:0x0393, B:141:0x0396, B:143:0x039c, B:145:0x03a2, B:147:0x03a8, B:154:0x03e7, B:158:0x03f7, B:167:0x042c), top: B:171:0x0049 }] */
    @Override // tb.hd5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.DXWidgetNode e(tb.lg5 r20, com.taobao.android.dinamicx.DXRuntimeContext r21, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ud5.e(tb.lg5, com.taobao.android.dinamicx.DXRuntimeContext, android.content.Context):com.taobao.android.dinamicx.widget.DXWidgetNode");
    }

    @Override // tb.hd5
    public void h(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        dh5 dh5Var;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb68bcee", new Object[]{this, dXWidgetNode, dXWidgetNode2});
        } else if (dXWidgetNode2 != null) {
            if ((dXWidgetNode2 instanceof s4z) && (((s4z) dXWidgetNode2).t() instanceof o56)) {
                LongSparseArray<dh5> constAttributeMap = dXWidgetNode2.getConstAttributeMap();
                if (constAttributeMap != null && (dh5Var = constAttributeMap.get(-4416109363904538046L)) != null) {
                    if (dh5Var.c == 2) {
                        dh5 dh5Var2 = constAttributeMap.get(36442092789L);
                        dh5 dh5Var3 = constAttributeMap.get(5435381891761953165L);
                        if (dh5Var2 == null || dh5Var3 == null) {
                            str = "";
                        } else {
                            str = dh5Var2.e + "_" + dh5Var3.e;
                        }
                        dXWidgetNode = this.g.a(str);
                        dXWidgetNode2.addChild(dXWidgetNode, false);
                    }
                } else {
                    return;
                }
            }
            if (dXWidgetNode2.getChildrenCount() > 0) {
                for (int i = 0; i < dXWidgetNode2.getChildrenCount(); i++) {
                    h(dXWidgetNode, dXWidgetNode2.getChildAt(i));
                }
            }
        }
    }
}
