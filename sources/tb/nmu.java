package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.c;
import com.taobao.trtc.utils.TrtcLog;
import tb.nfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = nmu.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public final c f24833a;
    public boolean b = false;
    public boolean c;
    public boolean d;
    public final nfs.b e;

    static {
        t2o.a(395313618);
    }

    public nmu(c cVar, int i, int i2, int i3, nfs.b bVar) {
        this.f24833a = cVar;
        this.e = bVar;
        if (i == 1) {
            bVar.setTargetScreenSize(720, 1280);
        } else {
            bVar.setTargetScreenSize(1080, 1920);
        }
        bVar.setCursorMoveAnimDuration(100L);
        bVar.setCursorThemeColor(i2, i3);
        TrtcLog.j(f, "ScreenInteractionAdapter - definition: " + i + ", animDuration: 100, Color: " + i2 + "/" + i3);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        TrtcLog.j(f, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        this.b = false;
        this.c = false;
        this.d = false;
        try {
            this.e.close();
        } catch (Throwable unused) {
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3568f17e", new Object[]{this});
            return;
        }
        try {
            TrtcLog.j(f, "reshow");
            this.e.stop();
            this.e.show();
        } catch (Throwable unused) {
        }
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d77e71", new Object[]{this, jSONObject});
        } else if (!PermissionActivity.e(this.f24833a.A())) {
            TrtcLog.j(f, "drop cmd for no overlay permission");
        } else {
            try {
                if (!this.c && this.d) {
                    this.c = true;
                    this.e.show();
                    TrtcLog.j(f, "show");
                }
                this.e.update(jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(int r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.nmu.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0025
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r5
            r7[r1] = r4
            r7[r0] = r6
            r6 = 3
            r7[r6] = r8
            java.lang.String r6 = "ab7b8aea"
            r3.ipc$dispatch(r6, r7)
            return
        L_0x0025:
            if (r6 == r1) goto L_0x002c
            if (r6 != r0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            r5.b = r3
            if (r6 != 0) goto L_0x0044
            r5.c = r2     // Catch: all -> 0x0042
            r5.d = r2     // Catch: all -> 0x0042
            tb.nfs$b r0 = r5.e     // Catch: all -> 0x0042
            r0.close()     // Catch: all -> 0x0042
            java.lang.String r0 = tb.nmu.f     // Catch: all -> 0x0042
            java.lang.String r1 = "close"
            com.taobao.trtc.utils.TrtcLog.j(r0, r1)     // Catch: all -> 0x0042
            goto L_0x005c
        L_0x0042:
            goto L_0x005c
        L_0x0044:
            if (r6 != r1) goto L_0x0049
            r5.d = r1     // Catch: all -> 0x0042
            goto L_0x005c
        L_0x0049:
            if (r6 != r0) goto L_0x005c
            r5.d = r2     // Catch: all -> 0x0042
            r5.c = r2     // Catch: all -> 0x0042
            tb.nfs$b r0 = r5.e     // Catch: all -> 0x0042
            r0.stop()     // Catch: all -> 0x0042
            java.lang.String r0 = tb.nmu.f     // Catch: all -> 0x0042
            java.lang.String r1 = "stop"
            com.taobao.trtc.utils.TrtcLog.j(r0, r1)     // Catch: all -> 0x0042
        L_0x005c:
            com.taobao.trtc.rtcroom.c r0 = r5.f24833a
            if (r0 == 0) goto L_0x0086
            r0.U(r6, r7, r8)
            java.lang.String r0 = tb.nmu.f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ScreenInteractionStatus: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = ", code: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ", action: "
            r1.append(r6)
            r1.append(r8)
            java.lang.String r6 = r1.toString()
            tb.tmu.f(r0, r6)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nmu.d(int, int, java.lang.String):void");
    }
}
