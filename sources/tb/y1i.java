package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y1i implements s29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final m5c f31785a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f31786a;

        public a(boolean z) {
            this.f31786a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y1i.a(y1i.this, this.f31786a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31787a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f31787a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y1i.b(y1i.this, this.f31787a, this.b);
            }
        }
    }

    static {
        t2o.a(463470666);
        t2o.a(1007681566);
    }

    public y1i(m5c m5cVar) {
        this.f31785a = m5cVar;
    }

    public static /* synthetic */ void a(y1i y1iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff33bebc", new Object[]{y1iVar, new Boolean(z)});
        } else {
            y1iVar.d(z);
        }
    }

    public static /* synthetic */ void b(y1i y1iVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc197ed", new Object[]{y1iVar, str, str2});
        } else {
            y1iVar.c(str, str2);
        }
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9281c79", new Object[]{this, str, str2});
        } else {
            this.f31785a.O(new ErrorResult(str, str2));
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f41df4", new Object[]{this, new Boolean(z)});
            return;
        }
        FavoriteResultData favoriteResultData = new FavoriteResultData();
        favoriteResultData.favorite = Boolean.valueOf(z);
        this.f31785a.q0(favoriteResultData);
    }

    @Override // tb.s29
    public void onError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
        } else if (this.f31785a != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                c(str, str2);
            } else {
                new Handler(Looper.getMainLooper()).post(new b(str, str2));
            }
        }
    }

    @Override // tb.s29
    public void onSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
        } else if (this.f31785a != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                d(z);
            } else {
                new Handler(Looper.getMainLooper()).post(new a(z));
            }
        }
    }
}
