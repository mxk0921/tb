package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.history.CaptureHistoryView;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.history.HistoryResult;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.gateway.util.ScancodeController;
import com.taobao.taobao.scancode.history.object.ScanDo;
import com.taobao.taobao.scancode.history.object.ScanList;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class v53 extends mz1<CaptureHistoryView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.taobao.scancode.gateway.util.a d;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final nmd e = new e();
    public volatile long f = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements hvm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.hvm
        public void startPreview() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            }
        }

        @Override // tb.hvm
        public void stopPreview() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ v53 f29784a;

            public a(v53 v53Var) {
                this.f29784a = v53Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((CaptureHistoryView) v53.D(this.f29784a)).d0(new ArrayList());
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.v53$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC1075b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ v53 f29785a;
            public final /* synthetic */ List<Object> b;

            public RunnableC1075b(v53 v53Var, List<Object> list) {
                this.f29785a = v53Var;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((CaptureHistoryView) v53.D(this.f29785a)).d0(this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c<T> implements Comparator {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue();
                }
                return t84.a(((u53) t2).b(), ((u53) t).b());
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            long j;
            long j2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object obj = v53.F(v53.this).get();
            Object obj2 = v53.E(v53.this).get();
            ArrayList arrayList = new ArrayList();
            if (obj != null) {
                arrayList.addAll(kqu.c(obj));
            }
            if (obj2 != null) {
                arrayList.addAll(kqu.c(obj2));
            }
            if (arrayList.isEmpty()) {
                v53.C(v53.this).post(new a(v53.this));
                return;
            }
            List<u53> t0 = i04.t0(arrayList, new c());
            ArrayList arrayList2 = new ArrayList();
            String str2 = "";
            for (u53 u53Var : t0) {
                if (Localization.o()) {
                    Long b = u53Var.b();
                    if (b == null) {
                        j2 = System.currentTimeMillis();
                    } else {
                        j2 = b.longValue();
                    }
                    str = iu6.a(j2, 6);
                } else {
                    uu6 uu6Var = uu6.INSTANCE;
                    Long b2 = u53Var.b();
                    if (b2 == null) {
                        j = System.currentTimeMillis();
                    } else {
                        j = b2.longValue();
                    }
                    str = uu6Var.a(j);
                }
                ckf.f(str, "if (Localization.isI18nE…ntTimeMillis())\n        }");
                if (!ckf.b(str2, str)) {
                    arrayList2.add(str);
                    str2 = str;
                }
                arrayList2.add(u53Var);
            }
            v53.C(v53.this).post(new RunnableC1075b(v53.this, arrayList2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Callable<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Callable
        public Object call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            ScanList k = dso.k(caa.c());
            if (k == null || k.getList() == null || k.getList().isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (ScanDo scanDo : k.getList()) {
                u53 u53Var = new u53();
                u53Var.d(Long.valueOf(scanDo.getTime()));
                u53Var.c(scanDo);
                arrayList.add(u53Var);
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Callable<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            HistoryResult i = com.etao.feimagesearch.history.a.j().i("all", false, 50);
            v53 v53Var = v53.this;
            Map<Long, AuctionItemVO> map = i.resultData;
            if (map == null || map.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Map<Long, AuctionItemVO> map2 = i.resultData;
            ckf.f(map2, "result.resultData");
            for (Map.Entry<Long, AuctionItemVO> entry : map2.entrySet()) {
                AuctionItemVO value = entry.getValue();
                u53 u53Var = new u53();
                u53Var.d(entry.getKey());
                u53Var.c(value);
                arrayList.add(u53Var);
                if (value.hasAllowance() && v53.y(v53Var) < 0) {
                    Long b = u53Var.b();
                    v53.G(v53Var, b == null ? -1L : b.longValue());
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements nmd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.nmd
        public final HashMap<String, String> a() {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("5f815aaa", new Object[]{this});
            }
            try {
                str2 = ((CaptureHistoryView) v53.D(v53.this)).p().getPageSpm();
                ckf.f(str2, "view.pageModel.pageSpm");
                str = ((CaptureHistoryView) v53.D(v53.this)).p().getPssource();
                ckf.f(str, "view.pageModel.pssource");
            } catch (Exception unused) {
                str2 = "";
                str = str2;
            }
            return tro.a(str2, str);
        }
    }

    static {
        t2o.a(481296593);
    }

    public static final /* synthetic */ Handler C(v53 v53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("15297ef7", new Object[]{v53Var});
        }
        return v53Var.c;
    }

    public static final /* synthetic */ d32 D(v53 v53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("5c964b94", new Object[]{v53Var});
        }
        return v53Var.f24401a;
    }

    public static final /* synthetic */ Future E(v53 v53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("6d4ee3dc", new Object[]{v53Var});
        }
        return v53Var.M();
    }

    public static final /* synthetic */ Future F(v53 v53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a562d666", new Object[]{v53Var});
        }
        return v53Var.N();
    }

    public static final /* synthetic */ void G(v53 v53Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9671cdad", new Object[]{v53Var, new Long(j)});
        } else {
            v53Var.f = j;
        }
    }

    public static /* synthetic */ Object ipc$super(v53 v53Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.v();
            return null;
        } else if (hashCode == -1504501726) {
            super.q();
            return null;
        } else if (hashCode == 267248023) {
            super.n();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryPresenter");
        }
    }

    public static final /* synthetic */ long y(v53 v53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a800d6df", new Object[]{v53Var})).longValue();
        }
        return v53Var.f;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0101d8", new Object[]{this});
            return;
        }
        dso.h(caa.c());
        com.etao.feimagesearch.history.a.j().d();
        tie.e().d();
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580c8f7d", new Object[]{this})).booleanValue();
        }
        if (this.f <= 0) {
            return false;
        }
        return uu6.e(Long.valueOf(this.f));
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a726fe", new Object[]{this});
            return;
        }
        a aVar = new a();
        jso jsoVar = new jso();
        jsoVar.j(((CaptureHistoryView) this.f24401a).I());
        ScancodeController scancodeController = new ScancodeController(aVar);
        Activity I = ((CaptureHistoryView) this.f24401a).I();
        if (I != null) {
            this.d = new com.taobao.taobao.scancode.gateway.util.a(jsoVar, scancodeController, (FragmentActivity) I, this.e);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1223ce1f", new Object[]{this});
        } else {
            z7m.c(new b());
        }
    }

    public final Future<Object> M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("e395762e", new Object[]{this});
        }
        return z7m.b(new c());
    }

    public final Future<Object> N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("2840b0e4", new Object[]{this});
        }
        this.f = -1L;
        return z7m.b(new d());
    }

    @Override // tb.mz1
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        K();
    }

    @Override // tb.mz1
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.q();
        this.c.removeCallbacksAndMessages(null);
    }

    @Override // tb.mz1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.v();
        L();
    }

    public final void O(ScanDo scanDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b3546d", new Object[]{this, scanDo});
            return;
        }
        ckf.g(scanDo, "item");
        mzu.k(s63.ALBUM_PAGE_NAME, "ScanHistoryClick", new String[0]);
        dso.i(n4p.c(), ((CaptureHistoryView) this.f24401a).I(), scanDo, this.d, this.e);
    }

    public final void P(AuctionItemVO auctionItemVO) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6d6b78", new Object[]{this, auctionItemVO});
            return;
        }
        ckf.g(auctionItemVO, "item");
        mzu.k(s63.ALBUM_PAGE_NAME, "PicHistoryClick", new String[0]);
        if (auctionItemVO.isVideo) {
            String str = auctionItemVO.fileUrl;
            if (str == null || !yf9.d(str)) {
                i0u.f(((CaptureHistoryView) this.f24401a).I(), Localization.q(R.string.taobao_app_1007_1_18953), 0);
            } else if (!wyn.INSTANCE.h()) {
                i0u.f(((CaptureHistoryView) this.f24401a).I(), Localization.q(R.string.taobao_app_1007_not_supported_now), 0);
            } else {
                String uri = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(auctionItemVO.fileUrl)).build().toString();
                ckf.f(uri, "parse(\"https://m.taobao.…d()\n          .toString()");
                nmj.a(((CaptureHistoryView) this.f24401a).I(), uri);
            }
        } else {
            IrpParamModel irpParamModel = new IrpParamModel(((CaptureHistoryView) this.f24401a).p());
            irpParamModel.setPicUrl(auctionItemVO.picPath);
            irpParamModel.setPhotoFrom(PhotoFrom.Values.HISTORY);
            Integer num = auctionItemVO.mSource;
            if (num != null) {
                ckf.f(num, "item.mSource");
                i = num.intValue();
            }
            irpParamModel.setPhotoSource(i);
            Map<String, String> map = auctionItemVO.mExtraJSKV;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    irpParamModel.addJsExtraParam(entry.getKey(), entry.getValue());
                }
            }
            nmj.e(((CaptureHistoryView) this.f24401a).I(), irpParamModel);
        }
    }
}
