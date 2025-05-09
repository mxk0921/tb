package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.etm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final etm e = new etm();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f16450a;
    public final String b;
    public final List<String> c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements etm.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xrm f16451a;

        public a(xrm xrmVar) {
            this.f16451a = xrmVar;
        }

        public atm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atm) ipChange.ipc$dispatch("abcfd39a", new Object[]{this});
            }
            return bkn.a(bkn.this, this.f16451a);
        }
    }

    static {
        t2o.a(912262212);
    }

    public bkn(String str) {
        this.f16450a = new AtomicBoolean(false);
        this.c = vbl.R0();
        this.d = false;
        this.b = str;
    }

    public static /* synthetic */ atm a(bkn bknVar, xrm xrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atm) ipChange.ipc$dispatch("636aefe7", new Object[]{bknVar, xrmVar});
        }
        return bknVar.b(xrmVar);
    }

    public static bkn c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bkn) ipChange.ipc$dispatch("69525", new Object[]{str});
        }
        return new bkn(str);
    }

    public static bkn d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bkn) ipChange.ipc$dispatch("9a9f0a99", new Object[]{str, new Boolean(z)});
        }
        return new bkn(str, z);
    }

    public final atm b(xrm xrmVar) {
        List<wrm> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atm) ipChange.ipc$dispatch("25212320", new Object[]{this, xrmVar});
        }
        if (this.d) {
            list = xrmVar.f();
        } else {
            list = xrmVar.e();
        }
        if (list.isEmpty()) {
            return null;
        }
        tgh.b("TTDetailRealTask", "预加载有效items=" + list.size());
        if (this.d) {
            return new ryh(e, new w0i(this.b, list));
        }
        return new njq(e, new PreloadRequestParams(this.b, list));
    }

    public synchronized void e(List<wrm> list, xrm xrmVar) {
        List<String> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257385aa", new Object[]{this, list, xrmVar});
        } else if (!this.f16450a.get()) {
            if (list != null && !list.isEmpty()) {
                for (wrm wrmVar : list) {
                    if (wrmVar != null) {
                        String str = wrmVar.b;
                        if (!TextUtils.isEmpty(str)) {
                            if (jtm.a().d(str) != null) {
                                tgh.b("TTDetailRealTask", "预加载缓存已有数据");
                            } else if (!TextUtils.isEmpty(wrmVar.d) && (list2 = this.c) != null && list2.contains(wrmVar.d)) {
                                tgh.b("TTDetailRealTask", "春晚限流黑名单, from=" + wrmVar.d);
                            } else if (e.d(str)) {
                                tgh.b("TTDetailRealTask", "已在预加载运行队列中");
                            } else {
                                xrmVar.a(wrmVar);
                            }
                        }
                    }
                }
                etm etmVar = e;
                etmVar.e(new a(xrmVar));
                if (!etmVar.a()) {
                    etmVar.b(b(xrmVar));
                }
                this.f16450a.set(true);
            }
        }
    }

    public bkn(String str, boolean z) {
        this.f16450a = new AtomicBoolean(false);
        this.c = vbl.R0();
        this.b = str;
        this.d = z;
    }
}
