package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f25 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CustomViewToast";

    /* renamed from: a  reason: collision with root package name */
    public final Context f18955a;
    public final ViewGroup b;
    public View c;
    public int d;
    public int e;
    public PopupWindow f;
    public final Runnable g = new a();
    public final Handler h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (f25.a(f25.this) != null) {
                f25.a(f25.this).dismiss();
            } else {
                o3s.b(f25.TAG, "dismiss PopupWindow失败");
            }
        }
    }

    static {
        t2o.a(295700129);
    }

    public f25(ViewGroup viewGroup, int i) {
        this.b = viewGroup;
        if (viewGroup == null) {
            o3s.b(TAG, "parentLayout为空");
            return;
        }
        Context context = viewGroup.getContext();
        this.f18955a = context;
        c(i);
        b(nw0.d(context, 50.0f));
        this.h = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ PopupWindow a(f25 f25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("423cf865", new Object[]{f25Var});
        }
        return f25Var.f;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d35d55f", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else if (view != null) {
            this.c = view;
            PopupWindow popupWindow = new PopupWindow(this.c, -2, -2, false);
            this.f = popupWindow;
            popupWindow.setTouchable(false);
        }
    }

    public void e() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.c == null || this.b == null || (handler = this.h) == null || this.f == null) {
            o3s.b(TAG, "显示失败：" + this.c + " " + this.b + " " + this.h + " " + this.f);
        } else {
            try {
                handler.removeCallbacks(this.g);
                this.f.showAtLocation(this.b, 81, 0, this.e);
                this.h.postDelayed(this.g, this.d);
            } catch (Exception e) {
                o3s.b(TAG, e.toString());
            }
        }
    }
}
