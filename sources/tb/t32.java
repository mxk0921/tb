package tb;

import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t32 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BasementPageTimeHelper";

    /* renamed from: a  reason: collision with root package name */
    public long f28448a = -1;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final t32 f28449a = new t32();

        static {
            t2o.a(745537612);
        }

        public static /* synthetic */ t32 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t32) ipChange.ipc$dispatch("4c2f6d7c", new Object[0]);
            }
            return f28449a;
        }
    }

    static {
        t2o.a(745537611);
    }

    public static t32 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t32) ipChange.ipc$dispatch("2a426c97", new Object[0]);
        }
        return a.a();
    }

    public final String a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16611f56", new Object[]{this, fragment});
        }
        if (fragment.isResumed()) {
            return "foreground";
        }
        return "background";
    }

    public void c(String str, ew ewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844dabf7", new Object[]{this, str, ewVar});
            return;
        }
        TLog.loge(TAG, "changeToBasement, behavior=" + str + "forground=" + a(ewVar.m()));
        if (this.f28448a != -1) {
            TLog.loge(TAG, "onChangeToBasement, but enterTime is not null!!!!");
            return;
        }
        this.f28448a = System.currentTimeMillis();
        this.b = str;
    }

    public void d(String str, ew ewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447fc9e", new Object[]{this, str, ewVar});
            return;
        }
        String a2 = a(ewVar.m());
        long currentTimeMillis = System.currentTimeMillis() - this.f28448a;
        boolean d = com.taobao.mytaobao.basement.a.d();
        TLog.loge(TAG, "changeToMainPage, enterBasementTimestamp=" + this.f28448a + ",leaveBehavior=" + str + ",enterBehavior=" + this.b + ",foreground=" + a2 + ",browseTime=" + currentTimeMillis + ",isWeex=" + d);
        if (this.f28448a == -1) {
            TLog.loge(TAG, "onChangeToMainPage, but enterTime is null!!!!");
            return;
        }
        this.f28448a = -1L;
        this.b = null;
    }

    public void e(uib uibVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89db9d90", new Object[]{this, uibVar});
            return;
        }
        if (uibVar == null || !uibVar.a()) {
            z = false;
        }
        TLog.loge(TAG, "viewAppear, isInBasement=" + z);
        if (z) {
            if (this.f28448a != -1) {
                TLog.loge(TAG, "onViewAppear, but enterTime is not null!!!!");
                return;
            }
            this.f28448a = System.currentTimeMillis();
            this.b = "appear";
        }
    }

    public void f(uib uibVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9b69ca", new Object[]{this, uibVar});
            return;
        }
        if (uibVar == null || !uibVar.a()) {
            z = false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f28448a;
        boolean d = com.taobao.mytaobao.basement.a.d();
        TLog.loge(TAG, "viewDisappear, isInBasement=" + z + ", enterBasementTimestamp=" + this.f28448a + ",browseTime=" + currentTimeMillis + ",isWeex=" + d);
        if (z) {
            if (this.f28448a == -1) {
                TLog.loge(TAG, "onViewDisappear, but enterTime is null!!!!");
                return;
            }
            this.f28448a = -1L;
            this.b = null;
        }
    }
}
