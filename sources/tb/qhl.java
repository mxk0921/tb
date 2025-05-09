package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.privacyguard.config.RuleConfig;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qhl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BACKGROUND_START_CODE = -1;
    public static final String[] DEFAULT_ACTIVITY_BLACKLIST = {"com.taobao.runtimepermission.PermissionActivity"};
    public static final int DEFAULT_REPORT_STACK_LEVEL = 15;
    public static final long DEFAULT_TIME = -1;
    public static final int FOREGROUND_START_CODE = 0;
    public static final int STACK_TRACE_FROM_LEVEL_INDEX = 2;
    public static final String TAG = "BizContextManager";
    public static final boolean TIME_PROFILE = true;
    public static volatile qhl g;

    /* renamed from: a  reason: collision with root package name */
    public i5d f26758a;
    public final String b;
    public volatile String c;
    public long e = -1;
    public int f = -1;
    public final long d = System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 2) {
                qhl.a(qhl.this, System.currentTimeMillis());
                qhl.b(qhl.this, UUID.randomUUID().toString().replaceAll("-", ""));
                qhl qhlVar = qhl.this;
                int i2 = qhlVar.f;
                if (i2 == -1) {
                    qhlVar.f = 2;
                } else if (i2 % 2 == 0) {
                    Log.e(qhl.TAG, "onEvent: occur error! mStageCount is even when in app background!");
                } else {
                    qhlVar.f = i2 + 1;
                }
            }
            if (i == 1) {
                qhl.a(qhl.this, System.currentTimeMillis());
                qhl.b(qhl.this, UUID.randomUUID().toString().replaceAll("-", ""));
                qhl qhlVar2 = qhl.this;
                int i3 = qhlVar2.f;
                if (i3 % 2 == 1) {
                    Log.e(qhl.TAG, "onEvent: occur error! mStageCount is odd when in app forward!");
                } else {
                    qhlVar2.f = i3 + 1;
                }
            }
        }
    }

    static {
        t2o.a(757071889);
    }

    public qhl() {
        String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
        this.b = replaceAll;
        this.c = replaceAll;
    }

    public static /* synthetic */ long a(qhl qhlVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff93b6b", new Object[]{qhlVar, new Long(j)})).longValue();
        }
        qhlVar.e = j;
        return j;
    }

    public static /* synthetic */ String b(qhl qhlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9804704a", new Object[]{qhlVar, str});
        }
        qhlVar.c = str;
        return str;
    }

    public static qhl d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qhl) ipChange.ipc$dispatch("e084b708", new Object[0]);
        }
        if (g == null) {
            synchronized (qhl.class) {
                g = new qhl();
            }
        }
        return g;
    }

    public static String h(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a23081", new Object[]{invocation});
        }
        RuleConfig b = yhl.a().b();
        if (b == null || !b.isReportStack()) {
            return "";
        }
        int i = b.stackLevel;
        if (i <= 0) {
            i = 15;
        }
        long nanoTime = System.nanoTime();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String arrays = Arrays.toString(Arrays.copyOfRange(stackTrace, 2, Math.min(i + 2, stackTrace.length)));
        invocation.stackTimeCost = (System.nanoTime() - nanoTime) / 1000;
        StringBuilder sb = new StringBuilder("getStackTrace: stack Info : [ ");
        sb.append(arrays);
        sb.append("]");
        return arrays;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc72aa1f", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b8eb866", new Object[]{this})).longValue();
        }
        long j = this.e;
        if (j == -1) {
            return this.d;
        }
        return j;
    }

    public String f(Invocation invocation) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cddf9a4", new Object[]{this, invocation});
        }
        RuleConfig b = yhl.a().b();
        if (b == null || !b.isReportParams()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = invocation.args;
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj == null || !obj.getClass().isArray()) {
                    if (obj != null) {
                        str = obj.toString();
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                } else {
                    sb.append(Arrays.toString((Object[]) obj));
                }
                sb.append("^^");
            }
            if (invocation.args.length > 0 && sb.length() >= 2) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98ff90a5", new Object[]{this});
        }
        i5d i5dVar = this.f26758a;
        if (i5dVar == null) {
            return "UNKNOWN";
        }
        return ((uhl) i5dVar).a();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cd809c2", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb928dd6", new Object[]{this});
        }
        return this.c;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e102a0", new Object[]{this});
        }
        i5d i5dVar = this.f26758a;
        if (i5dVar == null) {
            return "UNKNOWN";
        }
        return ((uhl) i5dVar).b();
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8312b388", new Object[]{this});
        }
        return this.b;
    }

    public void m() {
        List<String> list;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (!n(shl.b().c())) {
            i = -1;
        }
        this.f = i;
        c21.c(new a());
        RuleConfig b = yhl.a().b();
        if (b == null || (list = b.reportActivityBlackList) == null) {
            list = Arrays.asList(DEFAULT_ACTIVITY_BLACKLIST);
        }
        this.f26758a = new uhl(list);
    }

    public final boolean n(String str) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57ed44f", new Object[]{this, str})).booleanValue();
        }
        Application a2 = shl.b().a();
        if (!TextUtils.isEmpty(str) && a2 != null) {
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) a2.getSystemService("activity")).getRunningTasks(1);
                if (runningTasks != null && runningTasks.size() >= 1) {
                    componentName = runningTasks.get(0).topActivity;
                    String packageName = componentName.getPackageName();
                    if (!TextUtils.isEmpty(packageName)) {
                        if (packageName.equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
