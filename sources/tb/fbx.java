package tb;

import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c3a9ad", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
        if (applicationContext == null) {
            return i2;
        }
        return (i * applicationContext.getResources().getDisplayMetrics().widthPixels) / 750;
    }

    public static int d(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56b2007c", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > 0) {
            return (i2 * i) / 750;
        }
        return c(i2, i3);
    }

    public static Boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a12ac17a", new Object[]{str});
        }
        try {
            if (Integer.parseInt(str) > 0) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    public static Boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("962b944b", new Object[]{str});
        }
        return Boolean.valueOf(new File(ey1.SWITCH_FILE_DIR, str).exists());
    }

    public static boolean g(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f422a384", new Object[]{context, jSONObject})).booleanValue();
        }
        if (f(".useThemisWidget").booleanValue()) {
            return true;
        }
        if (f(".useTriverWidget").booleanValue()) {
            return false;
        }
        return TMSSwitchUtils.useThemisWidget(context, jSONObject);
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null) {
            return i;
        }
        try {
            if (str.endsWith("rpx")) {
                str = str.substring(0, str.length() - 3);
            }
            return Integer.parseInt(str);
        } catch (Exception e) {
            RVLogger.e(e.getMessage());
            return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4.equals("vertical") == false) goto L_0x0048;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode a(com.alibaba.triver.cannal_engine.scene.WidgetStartParams r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.fbx.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "483b90c0"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = (com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode) r4
            return r4
        L_0x0015:
            if (r4 != 0) goto L_0x001a
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.DEFAULT
            return r4
        L_0x001a:
            java.lang.String r4 = r4.getSceneParams()
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x002d
            com.alibaba.fastjson.JSONObject r4 = com.alibaba.fastjson.JSON.parseObject(r4)     // Catch: Exception -> 0x0029
            goto L_0x002e
        L_0x0029:
            r4 = move-exception
            r4.printStackTrace()
        L_0x002d:
            r4 = 0
        L_0x002e:
            if (r4 == 0) goto L_0x0088
            java.lang.String r2 = "gestureMode"
            java.lang.String r3 = r4.getString(r2)
            if (r3 != 0) goto L_0x0039
            goto L_0x0088
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1984141450: goto L_0x006c;
                case 96673: goto L_0x0061;
                case 3387192: goto L_0x0055;
                case 1387629604: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r0 = -1
            goto L_0x0076
        L_0x004a:
            java.lang.String r0 = "horizontal"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0053
            goto L_0x0048
        L_0x0053:
            r0 = 3
            goto L_0x0076
        L_0x0055:
            java.lang.String r0 = "none"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005f
            goto L_0x0048
        L_0x005f:
            r0 = 2
            goto L_0x0076
        L_0x0061:
            java.lang.String r0 = "all"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x006a
            goto L_0x0048
        L_0x006a:
            r0 = 1
            goto L_0x0076
        L_0x006c:
            java.lang.String r1 = "vertical"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0076
            goto L_0x0048
        L_0x0076:
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0082;
                case 2: goto L_0x007f;
                case 3: goto L_0x007c;
                default: goto L_0x0079;
            }
        L_0x0079:
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.DEFAULT
            return r4
        L_0x007c:
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.HORIZONTAL
            return r4
        L_0x007f:
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.NONE
            return r4
        L_0x0082:
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.ALL
            return r4
        L_0x0085:
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.VERTICAL
            return r4
        L_0x0088:
            com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode r4 = com.alibaba.triver.cannal_engine.event.WidgetRenderContainer.GestureMode.DEFAULT
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fbx.a(com.alibaba.triver.cannal_engine.scene.WidgetStartParams):com.alibaba.triver.cannal_engine.event.WidgetRenderContainer$GestureMode");
    }
}
