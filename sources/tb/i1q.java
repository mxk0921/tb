package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i1q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_PHENIX = "PhenixPrefetch";
    public static final String TYPE_ZIP = "ZipPrefetch";

    /* renamed from: a  reason: collision with root package name */
    public int f21043a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a();

        void onFailure(String str, String str2);
    }

    static {
        t2o.a(464519195);
    }

    public static /* synthetic */ int a(i1q i1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57fa36cc", new Object[]{i1qVar})).intValue();
        }
        return i1qVar.f21043a;
    }

    public static /* synthetic */ int b(i1q i1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1cfc2d4", new Object[]{i1qVar})).intValue();
        }
        int i = i1qVar.f21043a;
        i1qVar.f21043a = 1 + i;
        return i;
    }

    public void c(List<String> list, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a960cb2e", new Object[]{this, list, bVar});
        } else if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(ImageStrategyDecider.decideUrl(str, 960, 960, null));
            }
            s0m.B().e0("common", arrayList).a(new a(list, bVar)).b();
        }
    }

    public void d(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70f67d7", new Object[]{this, str, str2, bVar});
            return;
        }
        try {
            if (!b1q.a(str)) {
                byte[] a2 = f1q.a(str2);
                if (a2 != null && a2.length > 0) {
                    b1q.l(str, a2);
                    if (bVar != null) {
                        bVar.a();
                    }
                } else if (bVar != null) {
                    bVar.onFailure(TYPE_ZIP, "zip download error");
                }
            } else if (bVar != null) {
                bVar.a();
            }
        } catch (Exception e) {
            if (bVar != null) {
                bVar.onFailure(TYPE_ZIP, "unzip error:" + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<lqm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f21044a;
        public final b b;

        static {
            t2o.a(464519196);
            t2o.a(620757101);
        }

        public a(List<String> list, b bVar) {
            this.f21044a = list;
            this.b = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(lqm lqmVar) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f8c43379", new Object[]{this, lqmVar})).booleanValue();
            }
            if (lqmVar == null) {
                b bVar = this.b;
                if (bVar != null) {
                    bVar.onFailure(i1q.TYPE_PHENIX, "prefetchEvent is null");
                }
                return false;
            }
            if (lqmVar.d) {
                b bVar2 = this.b;
                if (bVar2 != null) {
                    bVar2.a();
                }
            } else if (i1q.a(i1q.this) < 1 && (list = lqmVar.f) != null && list.size() > 0) {
                i1q.b(i1q.this);
                i1q.this.c(lqmVar.f, this.b);
                return false;
            } else if (!(this.b == null || lqmVar.f == null)) {
                b bVar3 = this.b;
                bVar3.onFailure(i1q.TYPE_PHENIX, "phenix prefetch error:" + (lqmVar.f.size() + " pic in " + this.f21044a.size() + " error"));
            }
            return false;
        }
    }
}
