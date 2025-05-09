package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rd2 extends g22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f27291a = new HashMap();

    static {
        t2o.a(737149063);
    }

    public static /* synthetic */ Object ipc$super(rd2 rd2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/monitor/tracker/BizDirTracker");
    }

    @Override // tb.st2.b
    public void a(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d1c4db", new Object[]{this, yveVar});
        }
    }

    @Override // tb.st2.b
    public void b(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6edb02", new Object[]{this, yveVar});
        }
    }

    @Override // tb.st2.b
    public void c(yve yveVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d372155", new Object[]{this, yveVar, new Long(j)});
        }
    }

    @Override // tb.ot2.a
    public void d(File file, yve yveVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43775f3", new Object[]{this, file, yveVar, new Long(j)});
            return;
        }
        yve parent = yveVar.parent();
        if (parent == null) {
            return;
        }
        if (f(yveVar) || TextUtils.equals(parent.getName(), "/ExternalCache/cache") || TextUtils.equals(parent.getName(), "/ExternalFiles/files")) {
            ((HashMap) this.f27291a).put(yveVar.path(), Long.valueOf(j >> 10));
        }
    }

    @Override // tb.ot2.b
    public void e(File file, yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69a004", new Object[]{this, file, yveVar});
        }
    }

    @Override // tb.g22
    public void j(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69dff9c", new Object[]{this, cacheOverviewInfo});
        }
    }

    public Map<String, Long> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba770548", new Object[]{this});
        }
        return this.f27291a;
    }
}
