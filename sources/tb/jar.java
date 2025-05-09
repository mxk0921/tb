package tb;

import com.alibaba.poplayer.norm.IConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jar implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21872a;
    public ufm b;
    public opb c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        t2o.a(790626342);
        t2o.a(625999969);
    }

    public jar(String str) {
        this.f21872a = str;
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str});
        }
        if (a9l.w().E()) {
            return this.b.d(str);
        }
        return OrangeConfig.getInstance().getConfig(this.f21872a, str, "");
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public String getConfigsIdSetString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0ac231c", new Object[]{this});
        }
        if (a9l.w().E()) {
            return this.b.d("poplayer_config");
        }
        return OrangeConfig.getInstance().getConfig(this.f21872a, "poplayer_config", "");
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void init(opb opbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f8e94", new Object[]{this, opbVar});
            return;
        }
        this.b = new ufm();
        this.c = opbVar;
    }

    @Override // com.alibaba.poplayer.norm.IConfigAdapter
    public void startFetchConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb53c61", new Object[]{this});
        } else if (!this.d.getAndSet(true)) {
            final boolean E = a9l.w().E();
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "TBConfigAdapter.addConfigObserver.isLocalConfigEnable=" + E);
            if (E) {
                wdm.d("TBConfigAdapter.addConfigObserver.isLocalConfigEnable.updateCacheConfigAsync.", new Object[0]);
                this.c.a(true, this.b.b(), null, null);
            }
            OrangeConfig.getInstance().registerListener(new String[]{this.f21872a}, new obk() { // from class: tb.iar
                @Override // tb.obk
                public final void onConfigUpdate(String str, Map map) {
                    jar.this.b(E, str, map);
                }
            }, true);
            wdm.d("OrangeRegisterListener.group=%s", this.f21872a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {all -> 0x003e, blocks: (B:8:0x002b, B:10:0x0031, B:16:0x0041, B:19:0x0058, B:22:0x006a, B:25:0x0077, B:26:0x007d), top: B:29:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(boolean r9, java.lang.String r10, java.util.Map r11) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "configVersion"
            java.lang.String r4 = "configGroup="
            java.lang.String r5 = "is mocking. configVersion="
            com.android.alibaba.ip.runtime.IpChange r6 = tb.jar.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0027
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r9)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r8
            r9[r1] = r3
            r9[r0] = r10
            r10 = 3
            r9[r10] = r11
            java.lang.String r10 = "5ddaa956"
            r6.ipc$dispatch(r10, r9)
            return
        L_0x0027:
            java.lang.String r6 = ""
            if (r11 == 0) goto L_0x0040
            boolean r7 = r11.containsKey(r3)     // Catch: all -> 0x003e
            if (r7 == 0) goto L_0x0040
            java.lang.Object r11 = r11.get(r3)     // Catch: all -> 0x003e
            java.lang.String r11 = (java.lang.String) r11     // Catch: all -> 0x003e
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch: all -> 0x003e
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x003e:
            r9 = move-exception
            goto L_0x0095
        L_0x0040:
            r11 = r6
        L_0x0041:
            java.lang.String r3 = "OrangeGetConfig.group=%s.configVersion=%s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x003e
            r0[r2] = r10     // Catch: all -> 0x003e
            r0[r1] = r11     // Catch: all -> 0x003e
            tb.wdm.d(r3, r0)     // Catch: all -> 0x003e
            com.alibaba.poplayer.info.mock.PopLayerMockManager r0 = com.alibaba.poplayer.info.mock.PopLayerMockManager.instance()     // Catch: all -> 0x003e
            boolean r0 = r0.isPersistentMocking()     // Catch: all -> 0x003e
            java.lang.String r1 = "configUpdate"
            if (r0 == 0) goto L_0x0068
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: all -> 0x003e
            r9.<init>(r5)     // Catch: all -> 0x003e
            r9.append(r11)     // Catch: all -> 0x003e
            java.lang.String r9 = r9.toString()     // Catch: all -> 0x003e
            tb.wdm.g(r1, r6, r9)     // Catch: all -> 0x003e
            return
        L_0x0068:
            if (r9 == 0) goto L_0x0073
            tb.ufm r0 = r8.b     // Catch: all -> 0x003e
            java.lang.String r2 = "poplayer_config"
            boolean r2 = r0.g(r10, r2, r11)     // Catch: all -> 0x003e
        L_0x0073:
            if (r9 == 0) goto L_0x0077
            if (r2 == 0) goto L_0x007d
        L_0x0077:
            tb.opb r9 = r8.c     // Catch: all -> 0x003e
            r0 = 0
            r9.a(r2, r11, r0, r0)     // Catch: all -> 0x003e
        L_0x007d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: all -> 0x003e
            r9.<init>(r4)     // Catch: all -> 0x003e
            r9.append(r10)     // Catch: all -> 0x003e
            java.lang.String r10 = ".configVersion="
            r9.append(r10)     // Catch: all -> 0x003e
            r9.append(r11)     // Catch: all -> 0x003e
            java.lang.String r9 = r9.toString()     // Catch: all -> 0x003e
            tb.wdm.g(r1, r6, r9)     // Catch: all -> 0x003e
            goto L_0x009b
        L_0x0095:
            java.lang.String r10 = "onConfigUpdate error"
            tb.wdm.h(r10, r9)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jar.b(boolean, java.lang.String, java.util.Map):void");
    }
}
