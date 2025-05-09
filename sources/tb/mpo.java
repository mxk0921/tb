package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mpo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAUNCH_CRASH_KEY = "launch_crash_enable";
    public static final String NORMAL_CRASH_KEY = "normal_crash_enable";
    public static final String SAFEMODE_ANDROID = "safemode_android";
    public static final String SAFEMODE_SP_NAME = "safemode_sp";
    public static final mpo b = new mpo();

    /* renamed from: a  reason: collision with root package name */
    public y8l f24214a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            } else {
                mpo.a(mpo.this);
            }
        }
    }

    static {
        t2o.a(775946253);
    }

    public static /* synthetic */ void a(mpo mpoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3274100c", new Object[]{mpoVar});
        } else {
            mpoVar.d();
        }
    }

    public static mpo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpo) ipChange.ipc$dispatch("7b1ed2a5", new Object[0]);
        }
        return b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        String[] strArr = {SAFEMODE_ANDROID};
        this.f24214a = new a();
        OrangeConfig.getInstance().registerListener(strArr, this.f24214a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:20|6)|(7:8|18|10|(3:12|14|15)|13|14|15)|9|18|10|(0)|13|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0032, B:12:0x0040), top: B:18:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "launch_crash_enable"
            java.lang.String r2 = "normal_crash_enable"
            java.lang.String r3 = "safemode_android"
            java.lang.String r4 = "true"
            com.android.alibaba.ip.runtime.IpChange r5 = tb.mpo.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001e
            java.lang.String r1 = "66161766"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            r5.ipc$dispatch(r1, r2)
            return
        L_0x001e:
            com.taobao.orange.OrangeConfig r5 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: Exception -> 0x0031
            java.lang.String r5 = r5.getConfig(r3, r2, r4)     // Catch: Exception -> 0x0031
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: Exception -> 0x0031
            if (r6 != 0) goto L_0x0031
            boolean r5 = r4.equals(r5)     // Catch: Exception -> 0x0031
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: Exception -> 0x0045
            java.lang.String r3 = r6.getConfig(r3, r1, r4)     // Catch: Exception -> 0x0045
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: Exception -> 0x0045
            if (r6 != 0) goto L_0x0045
            boolean r3 = r4.equals(r3)     // Catch: Exception -> 0x0045
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            android.app.Application r4 = com.taobao.tao.Globals.getApplication()
            java.lang.String r6 = "safemode_sp"
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r6, r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r5)
            r0.putBoolean(r1, r3)
            r0.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mpo.d():void");
    }
}
