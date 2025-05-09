package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c9l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "ConfigManagerWrapper";
    public static volatile c9l b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16928a = false;

    static {
        t2o.a(1034944633);
    }

    public static c9l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c9l) ipChange.ipc$dispatch("f2f8808a", new Object[0]);
        }
        if (b == null) {
            synchronized (ral.class) {
                try {
                    if (b == null) {
                        b = new c9l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d362202e", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"jarvis_config_v2", "ODCP_walle_config", "walle_feature", "ODCP_python_base_lib"}, new a(this));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else if (ral.e().h() && !this.f16928a) {
            d42.h().j();
            ptf.b().e();
            b();
            this.f16928a = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(c9l c9lVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
            if (android.text.TextUtils.equals(r5.get("enableFeatureCenter"), com.tmall.android.dai.DAIKVStoreage.getDiskValue("walle_orange_config_cache_name", r12 + "__enableFeatureCenter")) == false) goto L_0x0094;
         */
        @Override // tb.z8l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onConfigUpdate(java.lang.String r12, boolean r13) {
            /*
                r11 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = tb.c9l.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x001d
                java.lang.Boolean r3 = new java.lang.Boolean
                r3.<init>(r13)
                r13 = 3
                java.lang.Object[] r13 = new java.lang.Object[r13]
                r13[r1] = r11
                r13[r0] = r12
                r12 = 2
                r13[r12] = r3
                java.lang.String r12 = "9458c0f9"
                r2.ipc$dispatch(r12, r13)
                return
            L_0x001d:
                java.lang.String r2 = "walle_feature"
                boolean r3 = android.text.TextUtils.equals(r12, r2)
                java.lang.String r4 = ""
                r5 = 0
                if (r3 == 0) goto L_0x0032
                com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()
                java.lang.String r6 = r6.getCustomConfig(r12, r4)
                goto L_0x003d
            L_0x0032:
                com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()
                java.util.Map r6 = r6.getConfigs(r12)
                r10 = r6
                r6 = r5
                r5 = r10
            L_0x003d:
                java.lang.String r7 = "ODCP_walle_config"
                boolean r7 = android.text.TextUtils.equals(r12, r7)
                if (r7 == 0) goto L_0x004c
                tb.d42 r7 = tb.d42.h()
                r7.i()
            L_0x004c:
                java.lang.String r7 = "ODCP_python_base_lib"
                boolean r7 = android.text.TextUtils.equals(r7, r12)
                if (r7 == 0) goto L_0x005b
                tb.ptf r7 = tb.ptf.b()
                r7.e()
            L_0x005b:
                java.lang.String r7 = "walle_orange_config_cache_name"
                if (r13 != 0) goto L_0x009b
                boolean r13 = android.text.TextUtils.equals(r2, r12)
                java.lang.String r2 = "jarvis_config_v2"
                boolean r2 = android.text.TextUtils.equals(r2, r12)
                if (r2 == 0) goto L_0x0093
                if (r5 == 0) goto L_0x0093
                java.lang.String r2 = "enableFeatureCenter"
                java.lang.Object r2 = r5.get(r2)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r12)
                java.lang.String r9 = "__enableFeatureCenter"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = com.tmall.android.dai.DAIKVStoreage.getDiskValue(r7, r8)
                boolean r2 = android.text.TextUtils.equals(r2, r8)
                if (r2 != 0) goto L_0x0093
                goto L_0x0094
            L_0x0093:
                r0 = 0
            L_0x0094:
                if (r13 != 0) goto L_0x0098
                if (r0 == 0) goto L_0x009b
            L_0x0098:
                com.tmall.android.dai.DAI.initFeatureCenter()
            L_0x009b:
                if (r3 == 0) goto L_0x00a3
                if (r6 == 0) goto L_0x00d7
                com.tmall.android.dai.DAIKVStoreage.putToDisk(r7, r12, r6)
                goto L_0x00d7
            L_0x00a3:
                if (r5 == 0) goto L_0x00d7
                java.util.Set r13 = r5.keySet()
                java.util.Iterator r13 = r13.iterator()
            L_0x00ad:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x00d7
                java.lang.Object r0 = r13.next()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r4)
                r1.append(r12)
                java.lang.String r2 = "__"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.tmall.android.dai.DAIKVStoreage.putToDisk(r7, r1, r0)
                goto L_0x00ad
            L_0x00d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.c9l.a.onConfigUpdate(java.lang.String, boolean):void");
        }
    }
}
