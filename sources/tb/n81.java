package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.global.setting.util.GuideUtils;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n81 implements dhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ulp f24565a;
    public final String b;
    public final b c = new b();

    public n81(Context context) {
        this.f24565a = ulp.c(context.getApplicationContext());
    }

    public static <T> T l(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("33b417bd", new Object[]{str, t});
        }
        if (!TextUtils.isEmpty(str)) {
            SharedPreferences c = tfp.c();
            if (t instanceof Integer) {
                return (T) Integer.valueOf(c.getInt(str, ((Integer) t).intValue()));
            }
            if (t instanceof String) {
                return (T) c.getString(str, (String) t);
            }
            if (t instanceof Boolean) {
                return (T) Boolean.valueOf(c.getBoolean(str, ((Boolean) t).booleanValue()));
            }
            throw new IllegalArgumentException("the type of defaultValue must be one of the Integer, String or Boolean!");
        }
        throw new IllegalArgumentException("key cannot be empty!");
    }

    @Override // tb.dhb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0067bc5", new Object[]{this});
        }
        return "http://m.taobao.com/go/newmytaobaocommonsettings2";
    }

    @Override // tb.dhb
    public <T> T b(String str, String str2, T t, gyb gybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("efe3f30b", new Object[]{this, str, str2, t, gybVar});
        }
        if (mba.b().c()) {
            return (T) d(str, str2, t, gybVar);
        }
        T t2 = null;
        if (!tfp.d(str, str2)) {
            tfp.b(gybVar, 261, "bizName and key cannot be empty!");
            return null;
        }
        if (r0k.KEY_LIVE_MUTE.equals(str2)) {
            str2 = "mute";
        }
        try {
            t2 = (T) nng.b().a(str2, t);
        } catch (IllegalArgumentException e) {
            tfp.b(gybVar, 261, e.getMessage());
        }
        if (t2 != null) {
            AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_GET_LIFE_CICLE_SETTING_STATE, quv.c(str, str2, t2), 1.0d);
            tfp.e(gybVar, t2);
        }
        return t2;
    }

    @Override // tb.dhb
    public boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b464d4a8", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return GuideUtils.c(this.b, str, z);
    }

    @Override // tb.dhb
    public <T> T d(String str, String str2, T t, gyb gybVar) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7620a109", new Object[]{this, str, str2, t, gybVar});
        }
        try {
            Object k = k(str, str2);
            if (k == null) {
                AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_GET_SETTING_STATE, quv.c(str, str2, ""), 1.0d);
                tfp.e(gybVar, t);
                return t;
            }
            try {
                if (t instanceof Boolean) {
                    t2 = (T) ((Boolean) k);
                } else if (t instanceof String) {
                    t2 = (T) String.valueOf(k);
                } else {
                    t2 = t instanceof Integer ? (T) ((Integer) k) : (T) k;
                }
                AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_GET_SETTING_STATE, quv.c(str, str2, ""), 1.0d);
                tfp.e(gybVar, k);
                return t2;
            } catch (Throwable th) {
                TLog.loge(mba.BIZ_NAME, "开关类型和defaultValue不一致,key=" + str2 + " trace=" + th.toString());
                tfp.b(gybVar, 261, th.getMessage());
                if (!Versions.isDebug()) {
                    return null;
                }
                throw th;
            }
        } catch (Throwable th2) {
            tfp.b(gybVar, 261, th2.getMessage());
            return t;
        }
    }

    @Override // tb.dhb
    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a727f80", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.f24565a.a("Global_App_Video_Play_Network_Type")) {
            return this.f24565a.d("Global_App_Video_Play_Network_Type", i);
        }
        if (this.f24565a.a("Global_App_Auto_Play_Video")) {
            if (this.f24565a.b("Global_App_Auto_Play_Video", true)) {
                i = 0;
            } else {
                i = 2;
            }
        }
        SharedPreferences e = this.f24565a.e();
        if (e != null) {
            SharedPreferences.Editor edit = e.edit();
            edit.putInt("Global_App_Video_Play_Network_Type", i);
            edit.commit();
        }
        return i;
    }

    @Override // tb.dhb
    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2903b911", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.f24565a.b("server_enable_locationsampling", z);
    }

    @Override // tb.dhb
    public boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7bab98", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.f24565a.b("Global_App_Is_TaoPassWord_Cut", z);
    }

    @Override // tb.dhb
    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b47bc858", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.equals(str, "tbGlobalMuteSetting")) {
            return mba.b().c();
        }
        boolean a2 = z0.a(str);
        AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_GET_HIT_AB, quv.c(this.b, str, Boolean.valueOf(a2)), 1.0d);
        return a2;
    }

    @Override // tb.dhb
    public boolean i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db039092", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.f24565a.b("Global_App_Auto_Play_Video", z);
    }

    @Override // tb.dhb
    public boolean isAutoPlayVideoUnderCurrentNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5748a6", new Object[]{this, context})).booleanValue();
        }
        int e = e(0);
        if (1 == e) {
            return true;
        }
        if (2 == e) {
            return false;
        }
        if (e != 0 || 1 == fwj.a(context)) {
            return true;
        }
        return false;
    }

    public Object j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79d09a51", new Object[]{this, str, str2});
        }
        b.a(this.c, str, str2);
        try {
            SharedPreferences c = tfp.c();
            Object b2 = m81.b(str2);
            return b2 == null ? c.getAll().get(str2) : b2;
        } catch (IllegalArgumentException e) {
            TLog.loge(mba.BIZ_NAME, "coreGetSettingCurrentStateObj exception, bizName=" + str + " key=" + str2 + " e=" + e);
            return null;
        }
    }

    public Object k(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7f88b052", new Object[]{this, str, str2});
        }
        if (tfp.d(str, str2)) {
            if (mba.b().c()) {
                if ("inTimeFrameMute".equals(str2) || "mute".equals(str2) || r0k.KEY_LIVE_MUTE.equals(str2)) {
                    Object b2 = b.b(this.c, str, str2);
                    TLog.loge(mba.BIZ_NAME, "getMuteSettingStateV2 key=" + str2 + " result=" + b2);
                    return b2;
                }
            } else if (r0k.KEY_LIVE_MUTE.equals(str2)) {
                str2 = "mute";
            }
            SharedPreferences c = tfp.c();
            Object b3 = m81.b(str2);
            return b3 == null ? c.getAll().get(str2) : b3;
        }
        throw new RuntimeException("bizName and key cannot be empty!");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ void a(b bVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30ef36e8", new Object[]{bVar, str, str2});
            } else {
                bVar.c(str, str2);
            }
        }

        public static /* synthetic */ Object b(b bVar, String str, String str2) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b1b75e9", new Object[]{bVar, str, str2});
            }
            return bVar.d(str, str2);
        }

        public final void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3658eead", new Object[]{this, str, str2});
            } else if (r0k.KEY_LIVE_MUTE.equals(str2) && !tfp.c().contains(str2)) {
                try {
                    Boolean bool = (Boolean) n81.l(str2, Boolean.FALSE);
                    bool.booleanValue();
                    j9t.e(Globals.getApplication(), str).c().c("mytaobao", r0k.KEY_LIVE_MUTE, bool, null);
                } catch (IllegalArgumentException unused) {
                }
            }
        }

        public final Object d(String str, String str2) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c981e10b", new Object[]{this, str, str2});
            }
            if ("inTimeFrameMute".equals(str2)) {
                return e(str);
            }
            if (str2.equals("mute") || str2.equals(r0k.KEY_LIVE_MUTE)) {
                Object j = n81.this.j(str, str2);
                return Boolean.TRUE.equals(j) ? j : e(str);
            }
            throw new IllegalArgumentException("key不合法");
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
            if (r3.before(r7) != false) goto L_0x00cd;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
            if (r3.before(r7) != false) goto L_0x00cd;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object e(java.lang.String r13) {
            /*
                r12 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = tb.n81.b.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0016
                java.lang.String r3 = "405ec074"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r12
                r4[r0] = r13
                java.lang.Object r13 = r2.ipc$dispatch(r3, r4)
                return r13
            L_0x0016:
                tb.mba r2 = tb.mba.b()
                boolean r2 = r2.c()
                r3 = 0
                if (r2 != 0) goto L_0x0022
                return r3
            L_0x0022:
                tb.n81 r2 = tb.n81.this
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                java.lang.String r5 = "timeFrameMute"
                java.lang.Object r2 = r2.d(r13, r5, r4, r3)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0036
                return r4
            L_0x0036:
                tb.n81 r2 = tb.n81.this
                java.lang.String r4 = "timeFrameMuteSub"
                java.lang.Object r13 = r2.d(r13, r4, r3, r3)
                java.lang.String r13 = (java.lang.String) r13
                if (r13 != 0) goto L_0x0046
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                return r13
            L_0x0046:
                com.alibaba.fastjson.JSONObject r13 = com.alibaba.fastjson.JSON.parseObject(r13)     // Catch: all -> 0x00d2
                java.lang.String r2 = "startHour"
                java.lang.Integer r2 = r13.getInteger(r2)     // Catch: all -> 0x00d2
                int r2 = r2.intValue()     // Catch: all -> 0x00d2
                java.lang.String r4 = "starMinute"
                java.lang.Integer r4 = r13.getInteger(r4)     // Catch: all -> 0x00d2
                int r4 = r4.intValue()     // Catch: all -> 0x00d2
                java.lang.String r5 = "endHour"
                java.lang.Integer r5 = r13.getInteger(r5)     // Catch: all -> 0x00d2
                int r5 = r5.intValue()     // Catch: all -> 0x00d2
                java.lang.String r6 = "endMinute"
                java.lang.Integer r13 = r13.getInteger(r6)     // Catch: all -> 0x00d2
                int r13 = r13.intValue()     // Catch: all -> 0x00d2
                java.util.Date r3 = new java.util.Date
                r3.<init>()
                java.util.Date r6 = new java.util.Date
                r6.<init>()
                java.util.Date r7 = new java.util.Date
                r7.<init>()
                if (r2 != r5) goto L_0x0088
                if (r4 != r13) goto L_0x0088
                goto L_0x00cd
            L_0x0088:
                if (r5 < r2) goto L_0x00aa
                if (r5 != r2) goto L_0x008f
                if (r13 > r4) goto L_0x008f
                goto L_0x00aa
            L_0x008f:
                r6.setHours(r2)
                r6.setMinutes(r4)
                r7.setHours(r5)
                r7.setMinutes(r13)
                boolean r13 = r3.after(r6)
                if (r13 == 0) goto L_0x00a8
                boolean r13 = r3.before(r7)
                if (r13 == 0) goto L_0x00a8
                goto L_0x00cd
            L_0x00a8:
                r0 = 0
                goto L_0x00cd
            L_0x00aa:
                r6.setHours(r2)
                r6.setMinutes(r4)
                long r8 = java.lang.System.currentTimeMillis()
                r10 = 86400000(0x5265c00, double:4.2687272E-316)
                long r8 = r8 + r10
                r7.setTime(r8)
                r7.setHours(r5)
                r7.setMinutes(r13)
                boolean r13 = r3.after(r6)
                if (r13 == 0) goto L_0x00a8
                boolean r13 = r3.before(r7)
                if (r13 == 0) goto L_0x00a8
            L_0x00cd:
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
                return r13
            L_0x00d2:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.n81.b.e(java.lang.String):java.lang.Object");
        }
    }

    public n81(String str, Context context) {
        this.b = str;
        this.f24565a = ulp.c(context.getApplicationContext());
    }
}
