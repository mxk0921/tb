package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, j9e> f31259a = new HashMap<>();

    static {
        t2o.a(491782770);
    }

    public final j9e b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9e) ipChange.ipc$dispatch("5fc34cac", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        j9e j9eVar = this.f31259a.get(str);
        if (j9eVar != null) {
            return j9eVar;
        }
        j9e a2 = a(str);
        this.f31259a.put(str, a2);
        return a2;
    }

    public List<aaw> c(List<aaw> list, PlayControllerConfig playControllerConfig, a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a760a6f6", new Object[]{this, list, playControllerConfig, a69Var});
        }
        if (list == null || list.isEmpty() || playControllerConfig == null) {
            return null;
        }
        String playControlFocusAreaType = playControllerConfig.getPlayControlFocusAreaType();
        fve.e("VideoSequencer", "playControlStrategy : " + playControlFocusAreaType);
        j9e b = b(playControlFocusAreaType);
        if (b != null) {
            return b.a(list, a69Var);
        }
        fve.e("VideoSequencer", "playControlStrategy 未找到对应策略实现 ： playControlStrategy ： " + playControlFocusAreaType);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r6.equals(com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.PlayControlStrategy.PLAY_CONTROL_FOCUS_AREA_BOTTOM) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.j9e a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.xaw.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "cbf73972"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            tb.j9e r6 = (tb.j9e) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1108234311: goto L_0x003b;
                case -509845177: goto L_0x0031;
                case -490630287: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0046
        L_0x0025:
            java.lang.String r0 = "playControlFocusAreaCenter"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            r0 = 2
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "playControlFocusAreaBottom"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0046
            goto L_0x0023
        L_0x003b:
            java.lang.String r0 = "playControlFocusAreaTop"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x0023
        L_0x0045:
            r0 = 0
        L_0x0046:
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0051;
                case 2: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            r6 = 0
            goto L_0x005c
        L_0x004b:
            tb.ns9 r6 = new tb.ns9
            r6.<init>()
            goto L_0x005c
        L_0x0051:
            tb.ms9 r6 = new tb.ms9
            r6.<init>()
            goto L_0x005c
        L_0x0057:
            tb.os9 r6 = new tb.os9
            r6.<init>()
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xaw.a(java.lang.String):tb.j9e");
    }
}
