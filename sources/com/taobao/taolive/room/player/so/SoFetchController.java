package com.taobao.taolive.room.player.so;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.cq;
import tb.d4s;
import tb.e7m;
import tb.eq;
import tb.gq;
import tb.t2o;
import tb.ux9;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SoFetchController implements eq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_WHAT_DEFAULT = -1;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f13204a;
    public e7m b;
    public boolean c;
    public boolean e = false;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface SoFetchState {
        public static final int STATE_INIT = 0;
        public static final int STATE_RECEIVE_ERROR = 2;
        public static final int STATE_UN_INIT = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gq f13205a;

        public a(gq gqVar) {
            this.f13205a = gqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SoFetchController.a(SoFetchController.this, this.f13205a);
            }
        }
    }

    static {
        t2o.a(779093138);
        t2o.a(774897938);
    }

    public SoFetchController(ux9 ux9Var) {
        this.f13204a = ux9Var;
    }

    public static /* synthetic */ void a(SoFetchController soFetchController, gq gqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc0ef94", new Object[]{soFetchController, gqVar});
        } else {
            soFetchController.c(gqVar);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[0])).booleanValue();
        }
        return d4s.e("enableSoFetch", true);
    }

    public final void c(gq gqVar) {
        e7m e7mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e8878c", new Object[]{this, gqVar});
            return;
        }
        e("handleInstallFinish isAllReady = " + gqVar.a());
        if (this.c && gqVar.a() && (e7mVar = this.b) != null) {
            e7mVar.onInstallReadyRetry();
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.f13204a != null) {
            x5t.h("SoFetchController", this.f13204a.p() + " " + str);
        } else {
            x5t.h("SoFetchController", str + "直播间外实例没有mFrameContext");
        }
    }

    public void g(e7m e7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1fac7b", new Object[]{this, e7mVar});
        } else {
            this.b = e7mVar;
        }
    }

    @Override // tb.eq
    public void onFetchFinished(gq gqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4a6f3", new Object[]{this, gqVar});
        } else if (gqVar != null) {
            e("onFetchFinished isAllReady isRemoteSoError = " + this.c + " isAllReady = " + gqVar.a());
            if (this.c) {
                this.d.post(new a(gqVar));
            }
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483ccd78", new Object[]{this, new Integer(i)});
        } else if (b() && i == -70000) {
            e("onError ERROR_REMOTE_SO_NOT_LOAD");
            this.c = true;
            e7m e7mVar = this.b;
            if (e7mVar != null) {
                e7mVar.onNotInstallPlayError();
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba6cf11", new Object[]{this});
        } else if (b()) {
            e("unInitPlayer");
            if (this.e) {
                e("unregisterFetchCallback");
                cq.h(this);
                this.e = false;
            }
            this.c = false;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36df418", new Object[]{this});
        } else if (b()) {
            boolean d = cq.d();
            e("initPlayer isFetchSoReady " + d);
            if (!d) {
                e("registerFetchCallback");
                cq.f(this);
                this.e = true;
            }
            this.c = false;
        }
    }
}
