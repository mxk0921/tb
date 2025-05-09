package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.exception.MaterialException;
import com.taobao.taopai2.material.exception.ResponseDataException;
import com.taobao.taopai2.material.request.Response;
import java.util.ArrayList;
import tb.erc;
import tb.hrc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k9i<A extends erc, R extends hrc> implements mzp<Response<R>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public azp<Response<R>> f22499a;
    public final erc b;
    public final Class<R> c;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                k9i.c(k9i.this);
            }
        }
    }

    static {
        t2o.a(782237925);
    }

    public k9i(A a2, Class<R> cls) {
        this.b = a2;
        this.c = cls;
    }

    public static /* synthetic */ void c(k9i k9iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b92d052", new Object[]{k9iVar});
        } else {
            k9iVar.f();
        }
    }

    public final /* synthetic */ void d(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3e5631", new Object[]{this, response});
        } else if (response.getData() != null) {
            this.f22499a.onSuccess(response);
        } else {
            this.f22499a.onError(new MaterialException(String.valueOf(response.errorCode), response.errorMsg));
        }
    }

    public final /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925c7bc6", new Object[]{this});
        } else {
            this.f22499a.onError(new ResponseDataException(null, "not data"));
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ls2());
        arrayList.add(new yrj());
        erc ercVar = this.b;
        final Response c = new wjn(ercVar, this.c, arrayList).c(ercVar);
        if (c != null) {
            this.d.post(new Runnable() { // from class: tb.i9i
                @Override // java.lang.Runnable
                public final void run() {
                    k9i.this.d(c);
                }
            });
        } else {
            this.d.post(new Runnable() { // from class: tb.j9i
                @Override // java.lang.Runnable
                public final void run() {
                    k9i.this.e();
                }
            });
        }
    }

    public yyp<Response<R>> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("d5d3045a", new Object[]{this});
        }
        return yyp.create(this);
    }

    public void subscribe(azp azpVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0f4dd3", new Object[]{this, azpVar});
            return;
        }
        this.f22499a = azpVar;
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
    }
}
