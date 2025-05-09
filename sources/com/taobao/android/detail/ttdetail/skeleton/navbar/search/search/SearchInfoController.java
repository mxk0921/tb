package com.taobao.android.detail.ttdetail.skeleton.navbar.search.search;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchRequestParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hjh;
import tb.nj7;
import tb.pos;
import tb.s3p;
import tb.t2o;
import tb.u3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SearchInfoController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public s3p c;
    public b d;
    public final boolean e;
    public u3p g;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6936a = new Handler(Looper.getMainLooper());
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class SearchRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f6937a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController$SearchRequestCallback$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class RunnableC0384a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ u3p f6938a;

                public RunnableC0384a(u3p u3pVar) {
                    this.f6938a = u3pVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z = false;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    u3p u3pVar = this.f6938a;
                    if (u3pVar != null) {
                        z = true;
                    }
                    SearchInfoController.b(SearchInfoController.this, u3pVar);
                    if (z) {
                        SearchInfoController.c(SearchInfoController.this, this.f6938a);
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.f6937a = mtopResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SearchInfoController.d(SearchInfoController.this).post(new RunnableC0384a(u3p.a(this.f6937a)));
                }
            }
        }

        static {
            t2o.a(912262620);
            t2o.a(589299719);
        }

        private SearchRequestCallback() {
        }

        private void reportMtopError(boolean z, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6709be6", new Object[]{this, new Boolean(z), mtopResponse});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                reportMtopError(false, mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                pos.a(new a(mtopResponse));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                reportMtopError(true, mtopResponse);
            }
        }

        public /* synthetic */ SearchRequestCallback(SearchInfoController searchInfoController, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SearchInfoController searchInfoController = SearchInfoController.this;
            SearchInfoController.c(searchInfoController, SearchInfoController.a(searchInfoController));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(912262617);
    }

    public SearchInfoController(Context context, Boolean bool) {
        this.b = context;
        this.e = bool.booleanValue();
    }

    public static /* synthetic */ u3p a(SearchInfoController searchInfoController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3p) ipChange.ipc$dispatch("f60e23fb", new Object[]{searchInfoController});
        }
        return searchInfoController.g;
    }

    public static /* synthetic */ u3p b(SearchInfoController searchInfoController, u3p u3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3p) ipChange.ipc$dispatch("69656351", new Object[]{searchInfoController, u3pVar});
        }
        searchInfoController.g = u3pVar;
        return u3pVar;
    }

    public static /* synthetic */ void c(SearchInfoController searchInfoController, u3p u3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193b7d32", new Object[]{searchInfoController, u3pVar});
        } else {
            searchInfoController.f(u3pVar);
        }
    }

    public static /* synthetic */ Handler d(SearchInfoController searchInfoController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3d6d06c1", new Object[]{searchInfoController});
        }
        return searchInfoController.f6936a;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
            return;
        }
        SearchRequestParams.Params params = new SearchRequestParams.Params();
        params.itemId = str;
        params.utdid = UTDevice.getUtdid(this.b);
        params.userId = hjh.b();
        params.nick = hjh.a();
        params.ttid = nj7.c();
        params.area = "detail_hintq_new";
        SearchRequestParams searchRequestParams = new SearchRequestParams();
        searchRequestParams.appId = "35522";
        searchRequestParams.params = params;
        s3p s3pVar = new s3p(searchRequestParams);
        this.c = s3pVar;
        s3pVar.q(new SearchRequestCallback(this, null));
    }

    public final void f(u3p u3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe12a424", new Object[]{this, u3pVar});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            ((NavBarHolderV3) bVar).V(u3pVar);
        }
    }

    public void g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ab28a1", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
        } else if (this.e) {
            if (this.g != null) {
                Context context = this.b;
                if (context instanceof Activity) {
                    ((Activity) context).runOnUiThread(new a());
                }
            } else if (!this.f) {
                this.f = true;
                this.c.c();
            }
        }
    }
}
