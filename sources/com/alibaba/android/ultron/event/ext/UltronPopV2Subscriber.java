package com.alibaba.android.ultron.event.ext;

import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b8v;
import tb.et6;
import tb.n6v;
import tb.o58;
import tb.p5e;
import tb.t2o;
import tb.u55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronPopV2Subscriber extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ULTRON_DATA = "ultronData";
    public static final String NEXT_TAG_DISMISS = "dismiss";
    public static boolean k = false;
    public p5e j = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements CommonPopupWindow.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f2269a;

        public a(b8v b8vVar) {
            this.f2269a = b8vVar;
        }

        @Override // com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow.f
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc0c1594", new Object[]{this, new Boolean(z)});
            } else {
                UltronPopV2Subscriber.this.C(this.f2269a, "dismiss");
            }
        }
    }

    static {
        t2o.a(614465565);
    }

    public static /* synthetic */ Object ipc$super(UltronPopV2Subscriber ultronPopV2Subscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UltronPopV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-6850332895952941978";
    }

    public UltronPopV2Subscriber J(p5e p5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronPopV2Subscriber) ipChange.ipc$dispatch("e933dcbb", new Object[]{this, p5eVar});
        }
        this.j = p5eVar;
        return this;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DXTemplateHookProcessor implements a.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Map<String, String[]> f2268a = new HashMap<String, String[]>() { // from class: com.alibaba.android.ultron.event.ext.UltronPopV2Subscriber.DXTemplateHookProcessor.1
            {
                put("ultron_pop_title", new String[]{"overseas_babel_order_cancel_title", "4", "https://dinamicx.alibabausercontent.com/l_pub/overseas_babel_order_cancel_title/1718781844952/overseas_babel_order_cancel_title.zip"});
                put("tborder_dialog_tip_d3", new String[]{"overseas_tborder_dialog_tip_d3", "6", "https://dinamicx.alibabausercontent.com/l_pub/overseas_tborder_dialog_tip_d3/1721289356826/overseas_tborder_dialog_tip_d3.zip"});
                put("tborder_dialog_check_tip", new String[]{"overseas_tborder_dialog_check_tip", "2", "https://dinamicx.alibabausercontent.com/l_pub/overseas_tborder_dialog_check_tip/1721290028555/overseas_tborder_dialog_check_tip.zip"});
                put("ultron_pop_check", new String[]{"overseas_ultron_pop_check", "5", "https://dinamicx.alibabausercontent.com/l_pub/overseas_ultron_pop_check/1740124287292/overseas_ultron_pop_check.zip"});
                put("tborder_dialog_two_button_d3", new String[]{"overseas_tborder_dialog_two_button_d3", "7", "https://dinamicx.alibabausercontent.com/l_pub/overseas_tborder_dialog_two_button_d3/1721301067694/overseas_tborder_dialog_two_button_d3.zip"});
            }
        };

        static {
            t2o.a(614465567);
            t2o.a(157286653);
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.h
        public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
            } else if (u55Var != null && list != null) {
                if (Localization.o()) {
                    b(list, u55Var);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent != null) {
                        String h = ParseModule.h(iDMComponent);
                        if ("footer".equals(h)) {
                            arrayList2.add(iDMComponent);
                        } else if ("header".equals(h)) {
                            arrayList.add(iDMComponent);
                        } else if ("foreground".equalsIgnoreCase(h)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(iDMComponent);
                        } else if ("background".equalsIgnoreCase(h)) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(iDMComponent);
                        }
                    }
                    arrayList3.add(iDMComponent);
                }
                et6Var.q(arrayList);
                et6Var.o(arrayList2);
                et6Var.l(arrayList3);
                et6Var.p(arrayList4);
                et6Var.k(arrayList5);
            }
        }

        public final void d(o58 o58Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae2f1fb7", new Object[]{this, o58Var});
                return;
            }
            String[] strArr = (String[]) ((HashMap) f2268a).get(o58Var.c);
            if (strArr != null) {
                o58Var.c = strArr[0];
                o58Var.e = strArr[1];
                o58Var.d = strArr[2];
                o58Var.f = "";
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final void b(List<IDMComponent> list, u55 u55Var) {
            char c;
            char c2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad5c26ef", new Object[]{this, list, u55Var});
                return;
            }
            for (IDMComponent iDMComponent : list) {
                JSONObject containerInfo = iDMComponent.getContainerInfo();
                String string = containerInfo.getString("name");
                string.hashCode();
                switch (string.hashCode()) {
                    case -1135153941:
                        if (string.equals("tborder_dialog_tip_d3")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -929622164:
                        if (string.equals("tborder_dialog_check_tip")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 48723153:
                        if (string.equals("tborder_dialog_two_button_d3")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1001206543:
                        if (string.equals("ultron_pop_check")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1016950879:
                        if (string.equals("ultron_pop_title")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        c(containerInfo, string);
                        break;
                }
            }
            for (o58 o58Var : u55Var.h()) {
                String str = o58Var.c;
                str.hashCode();
                switch (str.hashCode()) {
                    case -1135153941:
                        if (str.equals("tborder_dialog_tip_d3")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -929622164:
                        if (str.equals("tborder_dialog_check_tip")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 48723153:
                        if (str.equals("tborder_dialog_two_button_d3")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1001206543:
                        if (str.equals("ultron_pop_check")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1016950879:
                        if (str.equals("ultron_pop_title")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        d(o58Var);
                        break;
                }
            }
        }

        public final void c(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38787ff8", new Object[]{this, jSONObject, str});
                return;
            }
            String[] strArr = (String[]) ((HashMap) f2268a).get(str);
            if (strArr != null) {
                jSONObject.put("name", (Object) strArr[0]);
                jSONObject.put("version", (Object) strArr[1]);
                jSONObject.put("url", (Object) strArr[2]);
                jSONObject.put("md5", "");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    @Override // tb.n6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I(tb.b8v r14) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.event.ext.UltronPopV2Subscriber.I(tb.b8v):void");
    }
}
