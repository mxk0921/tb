package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.template.combine.WidgetCombineMiuiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoCaiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgNewReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoVideoReceiver;
import com.taobao.desktop.widget.template.gold.WidgetTaoGoldReceiver;
import com.taobao.desktop.widget.template.standard.WidgetMainInteractionReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardMiuiReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoCartReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGameReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGuessReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoShakeReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoSignReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoVideoSmallReceiver;
import com.taobao.desktop.widget.template.taolife.WidgetTaoLifeReceiver;
import com.taobao.wireless.link.widget.combine.WidgetCombineReceiver;
import com.taobao.wireless.link.widget.dynamic.WidgetDynamicReceiver;
import com.taobao.wireless.link.widget.farm.WidgetFarmReceiver;
import com.taobao.wireless.link.widget.live.WidgetLiveReceiver;
import com.taobao.wireless.link.widget.order.WidgetOrderReceiver;
import com.taobao.wireless.link.widget.tjb.TjbWidgetReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<?>> f32688a;
    public static final List<String> b;
    public static final List<String> c = new ArrayList();

    public static Class<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ecc04b2a", new Object[]{str});
        }
        Class<?> cls = null;
        if (qj7.m(ae7.c().b())) {
            for (Map.Entry entry : ((HashMap) nbx.c).entrySet()) {
                if (((String) entry.getValue()).equals(str)) {
                    cls = (Class) entry.getKey();
                }
            }
        } else {
            for (Map.Entry entry2 : ((HashMap) nbx.b).entrySet()) {
                if (((String) entry2.getValue()).equals(str)) {
                    cls = (Class) entry2.getKey();
                }
            }
        }
        return cls;
    }

    public static Class<?> b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8a43bf11", new Object[]{str, str2});
        }
        Class<?> a2 = a(str2);
        if (a2 == null) {
            HashMap hashMap = (HashMap) f32688a;
            if (hashMap.containsKey(str) && (a2 = d(str)) == null) {
                a2 = (Class) hashMap.get(str);
            }
        }
        StringBuilder sb = new StringBuilder("getWidgetReceiver: typeId: ");
        sb.append(str2);
        sb.append(",receiver: ");
        if (a2 == null) {
            str3 = null;
        } else {
            str3 = a2.getName();
        }
        sb.append(str3);
        hgh.d(sb.toString());
        return a2;
    }

    public static String c(String str) {
        Class cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a0ac03b", new Object[]{str});
        }
        Map<String, Class<?>> map = f32688a;
        if (!((HashMap) map).containsKey(str) || (cls = (Class) ((HashMap) map).get(str)) == null) {
            return "";
        }
        return cls.getName();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r5.equals("widget_gold") == false) goto L_0x003f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Class<?> d(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.zcx.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "752a92ec"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
        L_0x0015:
            tb.ae7 r2 = tb.ae7.c()
            android.app.Application r2 = r2.b()
            boolean r2 = tb.b9l.n(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0025
            return r3
        L_0x0025:
            tb.ae7 r2 = tb.ae7.c()
            android.app.Application r2 = r2.b()
            boolean r2 = tb.qj7.m(r2)
            if (r2 != 0) goto L_0x0034
            return r3
        L_0x0034:
            r5.hashCode()
            r2 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -923424389: goto L_0x0059;
                case 275479108: goto L_0x004d;
                case 1875001944: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = -1
            goto L_0x0063
        L_0x0041:
            java.lang.String r0 = "widget_standard"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x004b
            goto L_0x003f
        L_0x004b:
            r0 = 2
            goto L_0x0063
        L_0x004d:
            java.lang.String r0 = "widget_combine"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0057
            goto L_0x003f
        L_0x0057:
            r0 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r1 = "widget_gold"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0063
            goto L_0x003f
        L_0x0063:
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0075;
                case 2: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            return r3
        L_0x0067:
            java.util.Map<java.lang.String, java.lang.Class<?>> r5 = tb.zcx.f32688a
            java.lang.String r0 = "widget_standard_miui"
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r0)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
        L_0x0075:
            java.util.Map<java.lang.String, java.lang.Class<?>> r5 = tb.zcx.f32688a
            java.lang.String r0 = "widget_combine_miui"
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r0)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
        L_0x0083:
            java.util.Map<java.lang.String, java.lang.Class<?>> r5 = tb.zcx.f32688a
            java.lang.String r0 = "widget_gold_miui"
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r0)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zcx.d(java.lang.String):java.lang.Class");
    }

    static {
        t2o.a(437256276);
        HashMap hashMap = new HashMap();
        f32688a = hashMap;
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        hashMap.put("widget_dynamic", WidgetDynamicReceiver.class);
        hashMap.put("widget_combine", WidgetCombineReceiver.class);
        hashMap.put("widget_combine_miui", WidgetCombineMiuiReceiver.class);
        hashMap.put("widget_standard", WidgetStandardReceiver.class);
        hashMap.put("widget_standard_miui", WidgetStandardMiuiReceiver.class);
        hashMap.put("widget_gold", TjbWidgetReceiver.class);
        hashMap.put("widget_live", WidgetLiveReceiver.class);
        hashMap.put("widget_life", WidgetTaoLifeReceiver.class);
        hashMap.put("widget_gold_miui", WidgetTaoGoldReceiver.class);
        hashMap.put("widget_new_order", WidgetOrderReceiver.class);
        hashMap.put("widget_farm", WidgetFarmReceiver.class);
        hashMap.put("widget_tao_sign", WidgetTaoSignReceiver.class);
        hashMap.put("widget_tao_game", WidgetTaoGameReceiver.class);
        hashMap.put("widget_taoVideo", WidgetTaoVideoReceiver.class);
        hashMap.put("widget_taoCai", WidgetTaoCaiReceiver.class);
        hashMap.put("widget_taoMessage", WidgetTaoMsgReceiver.class);
        hashMap.put("widget_standard_two_one", WidgetTaoGuessReceiver.class);
        hashMap.put("widget_mainInteraction", WidgetMainInteractionReceiver.class);
        hashMap.put("widget_taoMsgNew", WidgetTaoMsgNewReceiver.class);
        hashMap.put("widget_taoVideoMini", WidgetTaoVideoSmallReceiver.class);
        hashMap.put("widget_taoShake", WidgetTaoShakeReceiver.class);
        hashMap.put("widget_taoCart", WidgetTaoCartReceiver.class);
        arrayList.add(WidgetTaoGoldReceiver.class.getName());
        arrayList.add(WidgetCombineReceiver.class.getName());
        arrayList.add(WidgetCombineMiuiReceiver.class.getName());
        arrayList.add(WidgetStandardReceiver.class.getName());
        arrayList.add(WidgetStandardMiuiReceiver.class.getName());
        arrayList.add(WidgetOrderReceiver.class.getName());
        arrayList.add(WidgetTaoLifeReceiver.class.getName());
        arrayList.add(WidgetFarmReceiver.class.getName());
        arrayList.add(WidgetDynamicReceiver.class.getName());
        arrayList.add(TjbWidgetReceiver.class.getName());
        arrayList.add(WidgetLiveReceiver.class.getName());
        arrayList.add(WidgetTaoSignReceiver.class.getName());
        arrayList.add(WidgetTaoGameReceiver.class.getName());
        arrayList.add(WidgetTaoVideoReceiver.class.getName());
        arrayList.add(WidgetTaoCaiReceiver.class.getName());
        arrayList.add(WidgetTaoMsgReceiver.class.getName());
        arrayList.add(WidgetTaoGuessReceiver.class.getName());
        arrayList.add(WidgetMainInteractionReceiver.class.getName());
        arrayList.add(WidgetTaoMsgNewReceiver.class.getName());
        arrayList.add(WidgetTaoVideoSmallReceiver.class.getName());
        arrayList.add(WidgetTaoShakeReceiver.class.getName());
        arrayList.add(WidgetTaoCartReceiver.class.getName());
    }
}
