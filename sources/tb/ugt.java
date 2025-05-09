package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.dojo.ability.messiah.impl.foundation.DataUploader;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ugt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int d;
    public final DataUploader b = new DataUploader();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29366a = h();
    public final wgt c = new wgt();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements tvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tgt f29367a;

        public a(tgt tgtVar) {
            this.f29367a = tgtVar;
        }

        @Override // tb.tvk
        public void a(e9u e9uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4cdcf0f6", new Object[]{this, e9uVar});
                return;
            }
            ugt.b(ugt.this).c(e9uVar);
            ugt.c(ugt.this, 0);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader数据上报成功，清空暂存区的数据");
        }

        @Override // tb.tvk
        public void b(e9u e9uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("beaea93d", new Object[]{this, e9uVar});
                return;
            }
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,数据上报失败");
            ugt.a(ugt.this, this.f29367a, e9uVar);
            ugt.b(ugt.this).c(e9uVar);
            ugt.d(ugt.this);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,数据上报失败，清空暂存区的数据");
        }
    }

    static {
        t2o.a(447741967);
    }

    public static /* synthetic */ void a(ugt ugtVar, tgt tgtVar, e9u e9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e022c48", new Object[]{ugtVar, tgtVar, e9uVar});
        } else {
            ugtVar.o(tgtVar, e9uVar);
        }
    }

    public static /* synthetic */ wgt b(ugt ugtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wgt) ipChange.ipc$dispatch("d593ed2c", new Object[]{ugtVar});
        }
        return ugtVar.c;
    }

    public static /* synthetic */ int c(ugt ugtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74ca8521", new Object[]{ugtVar, new Integer(i)})).intValue();
        }
        ugtVar.d = i;
        return i;
    }

    public static /* synthetic */ int d(ugt ugtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cabd806e", new Object[]{ugtVar})).intValue();
        }
        int i = ugtVar.d;
        ugtVar.d = 1 + i;
        return i;
    }

    public final List<TbHRLogModel> e(e9u e9uVar, tgt tgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5f9f2bc", new Object[]{this, e9uVar, tgtVar});
        }
        ArrayList arrayList = new ArrayList();
        List<TbHRLogModel> a2 = tgtVar.a();
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        List<TbHRLogModel> b = tgtVar.b();
        if (b != null) {
            arrayList.addAll(b);
        }
        this.c.d(e9uVar, a2, b);
        return arrayList;
    }

    public final e9u f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e9u) ipChange.ipc$dispatch("2b7500d9", new Object[]{this, str});
        }
        return new e9u("TbHRLogDataUploader_" + SystemClock.uptimeMillis(), str);
    }

    public final tvk g(tgt tgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tvk) ipChange.ipc$dispatch("d444ee04", new Object[]{this, tgtVar});
        }
        return new a(tgtVar);
    }

    public final List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("47e697b0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String b = ebl.b("stabilityDataUploadTimingWhiteList", "Page_Home_monitor_page_disappear");
        if (!TextUtils.isEmpty(b)) {
            arrayList.addAll(Arrays.asList(b.split(",")));
        }
        return arrayList;
    }

    public final boolean k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2ff2261", new Object[]{this, str, str2, str3})).booleanValue();
        }
        return this.f29366a.contains(str3 + "_" + str2 + "_" + str);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bffdbb31", new Object[]{this})).booleanValue();
        }
        if (this.d > 3) {
            return true;
        }
        return false;
    }

    public final void m(tgt tgtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b4c39e", new Object[]{this, tgtVar, str});
            return;
        }
        List<TbHRLogModel> a2 = this.c.a(str);
        if (a2 != null && !a2.isEmpty()) {
            tgtVar.g(a2);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,数据上报失败，回存日志数据");
        }
    }

    public final void n(tgt tgtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e5d1b4", new Object[]{this, tgtVar, str});
            return;
        }
        List<TbHRLogModel> b = this.c.b(str);
        if (b != null && !b.isEmpty()) {
            tgtVar.i(b);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,数据上报失败，回存监控数据");
        }
    }

    public final void o(tgt tgtVar, e9u e9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f825543", new Object[]{this, tgtVar, e9uVar});
            return;
        }
        String b = e9uVar.b();
        String a2 = e9uVar.a();
        if ("log".equals(b)) {
            m(tgtVar, a2);
        } else if ("monitor".equals(b)) {
            n(tgtVar, a2);
        } else if ("all".equals(b)) {
            m(tgtVar, a2);
            n(tgtVar, a2);
        }
    }

    public void p(String str, String str2, String str3, tgt tgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce09772", new Object[]{this, str, str2, str3, tgtVar});
        } else if (k(str, str2, str3)) {
            q(str, tgtVar);
        } else if ("monitor".equals(str2)) {
            s(tgtVar, str2);
        } else if ("investigate".equals(str2)) {
            r(tgtVar, str2);
        }
    }

    public final void q(String str, tgt tgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab095e", new Object[]{this, str, tgtVar});
            return;
        }
        e9u f = f("all");
        List<TbHRLogModel> e = e(f, tgtVar);
        if (e.isEmpty()) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,uploadInWhiteList 需要上报的数据为空");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        tgtVar.c();
        this.b.g(f, e, g(tgtVar));
        sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader当前白名单阶段上报，上报耗时：" + (System.currentTimeMillis() - currentTimeMillis) + " 当前的actionType是：" + str);
    }

    public final void r(tgt tgtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed315f9", new Object[]{this, tgtVar, str});
            return;
        }
        List<TbHRLogModel> a2 = tgtVar.a();
        if (!i(a2)) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,uploadInvestigateList 不允许上报日志，当前的logType是：" + str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(a2);
        tgtVar.d(a2);
        e9u f = f("log");
        this.b.g(f, arrayList, g(tgtVar));
        this.c.d(f, arrayList, null);
        sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader当前的日志缓存大于50主动上报一次，上报耗时：" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public final void s(tgt tgtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166ef234", new Object[]{this, tgtVar, str});
            return;
        }
        List<TbHRLogModel> b = tgtVar.b();
        if (!j(b)) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploaderuploadMonitorList 不允许上报日志，当前的logType是：" + str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(b);
        tgtVar.e(b);
        e9u f = f("monitor");
        this.b.g(f, arrayList, g(tgtVar));
        this.c.d(f, null, arrayList);
        sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataUploader,当前的监控缓存大于50主动上报一次，上报耗时：" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public final boolean i(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b985e4d", new Object[]{this, list})).booleanValue();
        }
        return list != null && list.size() > ebl.a("logsUploadMaxCount", 50);
    }

    public final boolean j(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0c1748", new Object[]{this, list})).booleanValue();
        }
        return list != null && list.size() > ebl.a("monitorsUploadMaxCount", 50);
    }
}
