package tb;

import android.os.CountDownTimer;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kir {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static kir b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, CountDownTimer> f22694a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f22695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kir kirVar, long j, long j2, u8 u8Var) {
            super(j, j2);
            this.f22695a = u8Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLTimerManager$1");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            u8 u8Var = this.f22695a;
            if (u8Var != null) {
                u8Var.callback("success", new f8());
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
            }
        }
    }

    static {
        t2o.a(806355384);
    }

    public static kir c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kir) ipChange.ipc$dispatch("eccdda52", new Object[0]);
        }
        if (b == null) {
            b = new kir();
        }
        return b;
    }

    public void a(String str, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c54ffa", new Object[]{this, str, u8Var});
            return;
        }
        HashMap<String, CountDownTimer> hashMap = this.f22694a;
        if (hashMap == null || hashMap.size() == 0 || TextUtils.isEmpty(str)) {
            b = null;
            return;
        }
        try {
            this.f22694a.remove(str).cancel();
        } catch (Exception unused) {
        }
        if (u8Var != null) {
            u8Var.callback("success", new f8());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        HashMap<String, CountDownTimer> hashMap = this.f22694a;
        if (hashMap == null || hashMap.size() == 0) {
            b = null;
            return;
        }
        try {
            for (Map.Entry<String, CountDownTimer> entry : this.f22694a.entrySet()) {
                entry.getValue().cancel();
            }
        } catch (Exception unused) {
        }
        this.f22694a.clear();
        this.f22694a = null;
        b = null;
    }

    public void d(String str, long j, long j2, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a0428f", new Object[]{this, str, new Long(j), new Long(j2), u8Var});
        } else if (!this.f22694a.containsKey(str)) {
            a aVar = new a(this, j, j2, u8Var);
            aVar.start();
            this.f22694a.put(str, aVar);
        }
    }
}
