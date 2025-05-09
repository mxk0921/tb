package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a5i extends RichTextContainerComponent implements StaticLayoutView.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316766);
        t2o.a(503317494);
        t2o.a(503317092);
    }

    public static /* synthetic */ Object ipc$super(a5i a5iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1814733277) {
            return super.onCreateView((Context) objArr[0]);
        }
        if (hashCode == -1619485803) {
            return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
        }
        if (hashCode == -613926416) {
            super.onLayout();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/MarqueeExComponent");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        String I = nwv.I(this.node.H("direction"), "left");
        if (TextUtils.equals(I, "left") || TextUtils.equals(I, "right")) {
            ((ymt) this.viewParams).F0 = TextUtils.TruncateAt.MARQUEE;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d
    public void onStateChange(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36319953", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        sendMessage(this.node, "onstatechanged", null, hashMap, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent, com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        StaticLayoutView staticLayoutView = (StaticLayoutView) super.onCreateView(context);
        staticLayoutView.enableNewMarquee(true, this);
        staticLayoutView.setLoopCount(nwv.t(this.node.H("loop"), -1));
        staticLayoutView.setLoopDelay(nwv.t(this.node.H("loopdelay"), 0));
        staticLayoutView.setDirection(nwv.I(this.node.H("direction"), "left"));
        n nVar = this.node;
        staticLayoutView.setScrollAmount(s6o.U(nVar, context, nwv.r(nVar.H("scrollamount"), 6)));
        n nVar2 = this.node;
        staticLayoutView.setMarqueeScrollGap(s6o.U(nVar2, context, nwv.t(nVar2.H("scrollgap"), 0)));
        return staticLayoutView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if ((gVar.d.equals("onwilldisappear") || gVar.d.equals("onwillappear")) && this.view != 0) {
            if (!gVar.d.equals("onwillappear")) {
                ((StaticLayoutView) this.view).pauseMarquee();
            } else if (((StaticLayoutView) this.view).getMarqueeState() == 1) {
                ((StaticLayoutView) this.view).startMarquee();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10, com.taobao.tao.flexbox.layoutmanager.ac.d.k r11) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = tb.a5i.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0025
            java.lang.String r5 = "9f789b95"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            r6[r2] = r8
            r6[r1] = r9
            r6[r0] = r10
            r8 = 4
            r6[r8] = r11
            java.lang.Object r8 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0025:
            V extends android.view.View r4 = r7.view
            if (r4 == 0) goto L_0x0089
            r9.hashCode()
            r4 = -1
            int r5 = r9.hashCode()
            switch(r5) {
                case 3540994: goto L_0x004d;
                case 106440182: goto L_0x0041;
                case 109757538: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0058
        L_0x0035:
            java.lang.String r5 = "start"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x003f
            goto L_0x0058
        L_0x003f:
            r4 = 2
            goto L_0x0058
        L_0x0041:
            java.lang.String r5 = "pause"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            r4 = 1
            goto L_0x0058
        L_0x004d:
            java.lang.String r5 = "stop"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            switch(r4) {
                case 0: goto L_0x007a;
                case 1: goto L_0x006b;
                case 2: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0089
        L_0x005c:
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.setMarqueeState(r2)
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.startMarquee()
            goto L_0x008a
        L_0x006b:
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.setMarqueeState(r1)
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.pauseMarquee()
            goto L_0x008a
        L_0x007a:
            V extends android.view.View r1 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r1 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r1
            r1.setMarqueeState(r0)
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView r0 = (com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView) r0
            r0.stopMarquee()
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 != 0) goto L_0x0090
            boolean r2 = super.invoke(r8, r9, r10, r11)
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a5i.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }
}
