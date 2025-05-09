package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WidgetStartParams;
import tb.rde;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class npt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TMSEmbed.EmbedRootView f24884a;
    public TMSEmbed b;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.p();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.q();
        }
    }

    public void e(rde.a aVar) {
        rde rdeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7491661c", new Object[]{this, aVar});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null && (rdeVar = (rde) tMSEmbed.g(rde.class)) != null) {
            rdeVar.T0(aVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
    }

    public ViewGroup h(JSONObject jSONObject, Activity activity, TMSEmbed.EmbedRootView embedRootView, TMSEmbed.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("672d9d03", new Object[]{this, jSONObject, activity, embedRootView, aVar});
        }
        try {
            WidgetStartParams widgetStartParams = (WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class);
            widgetStartParams.build();
            this.f24884a = embedRootView;
            embedRootView.setBackgroundColor(0);
            TMSEmbed tMSEmbed = new TMSEmbed(activity, TMSEmbedSolutionType.WIDGET, this.f24884a, false);
            this.b = tMSEmbed;
            tMSEmbed.r(aVar);
            this.b.i(widgetStartParams);
            this.b.u();
        } catch (Exception e) {
            RVLogger.e("", e);
        }
        return this.f24884a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r4.equals("vertical") == false) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.themis.widget.event.GestureMode d(com.alibaba.fastjson.JSONObject r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.npt.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "77f6b0b0"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.taobao.themis.widget.event.GestureMode r4 = (com.taobao.themis.widget.event.GestureMode) r4
            return r4
        L_0x0015:
            if (r4 != 0) goto L_0x001a
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.DEFAULT
            return r4
        L_0x001a:
            java.lang.String r2 = "sceneParams"
            com.alibaba.fastjson.JSONObject r4 = r4.getJSONObject(r2)
            if (r4 == 0) goto L_0x007b
            java.lang.String r2 = "gestureMode"
            java.lang.String r3 = r4.getString(r2)
            if (r3 != 0) goto L_0x002c
            goto L_0x007b
        L_0x002c:
            java.lang.String r4 = r4.getString(r2)
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1984141450: goto L_0x005f;
                case 96673: goto L_0x0054;
                case 3387192: goto L_0x0048;
                case 1387629604: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r0 = -1
            goto L_0x0069
        L_0x003d:
            java.lang.String r0 = "horizontal"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0046
            goto L_0x003b
        L_0x0046:
            r0 = 3
            goto L_0x0069
        L_0x0048:
            java.lang.String r0 = "none"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0052
            goto L_0x003b
        L_0x0052:
            r0 = 2
            goto L_0x0069
        L_0x0054:
            java.lang.String r0 = "all"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005d
            goto L_0x003b
        L_0x005d:
            r0 = 1
            goto L_0x0069
        L_0x005f:
            java.lang.String r1 = "vertical"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0069
            goto L_0x003b
        L_0x0069:
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0075;
                case 2: goto L_0x0072;
                case 3: goto L_0x006f;
                default: goto L_0x006c;
            }
        L_0x006c:
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.DEFAULT
            return r4
        L_0x006f:
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.HORIZONTAL
            return r4
        L_0x0072:
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.NONE
            return r4
        L_0x0075:
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.ALL
            return r4
        L_0x0078:
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.VERTICAL
            return r4
        L_0x007b:
            com.taobao.themis.widget.event.GestureMode r4 = com.taobao.themis.widget.event.GestureMode.DEFAULT
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.npt.d(com.alibaba.fastjson.JSONObject):com.taobao.themis.widget.event.GestureMode");
    }
}
