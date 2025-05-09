package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.ScheduleTask;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zto {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zto b = new zto();

    /* renamed from: a  reason: collision with root package name */
    public volatile a f33008a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f33009a;
        public List<ScheduleTask> b;

        static {
            t2o.a(329252892);
        }

        public List<ScheduleTask> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("db64ee08", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(329252891);
    }

    public static zto b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zto) ipChange.ipc$dispatch("e30e4931", new Object[0]);
        }
        return b;
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8aa121a", new Object[]{this, str});
        }
        a aVar = this.f33008a;
        if (aVar == null || str == null || !TextUtils.equals(str, aVar.f33009a)) {
            return null;
        }
        return aVar;
    }

    public void c(String str, List<ScheduleTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e82c5c2", new Object[]{this, str, list});
            return;
        }
        a aVar = new a();
        aVar.f33009a = str;
        aVar.b = list;
        this.f33008a = aVar;
    }
}
