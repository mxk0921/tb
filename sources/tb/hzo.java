package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final pxh b;
    public boolean c;
    public final View d;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20988a = new a(Looper.getMainLooper());
    public int e = Integer.MIN_VALUE;
    public int f = Integer.MIN_VALUE;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/ScrollerStateObserver$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1 && hzo.a(hzo.this)) {
                hzo.b(hzo.this);
            }
        }
    }

    static {
        t2o.a(986710230);
    }

    public hzo(pxh pxhVar, View view) {
        this.b = pxhVar;
        this.d = view;
    }

    public static /* synthetic */ boolean a(hzo hzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e2707e3", new Object[]{hzoVar})).booleanValue();
        }
        return hzoVar.c;
    }

    public static /* synthetic */ void b(hzo hzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03e353e", new Object[]{hzoVar});
        } else {
            hzoVar.e();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6107cb1", new Object[]{this});
            return;
        }
        this.f20988a.removeMessages(1);
        this.f20988a.sendEmptyMessageDelayed(1, 80L);
    }

    public void d(int i, int i2, int i3, int i4) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.b.onRealTimeScroll(this.d, i, i2, i3, i4);
        c();
        if (!this.c) {
            f();
        }
        int i6 = this.f;
        if (i6 == Integer.MIN_VALUE || (i5 = this.e) == Integer.MIN_VALUE) {
            this.f = i;
            this.e = i2;
            this.b.onScrollChange(this.d, i, i2, i3, i4);
            this.g = true;
            return;
        }
        int i7 = i2 - i5;
        this.f = i;
        this.e = i2;
        if (Math.abs(i - i6) >= 10 || Math.abs(i7) >= 10) {
            this.b.onScrollChange(this.d, i, i2, i3, i4);
            this.g = true;
            return;
        }
        this.g = false;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee84ecb6", new Object[]{this});
            return;
        }
        if (!this.g) {
            pxh pxhVar = this.b;
            View view = this.d;
            int i = this.f;
            int i2 = this.e;
            pxhVar.onScrollChange(view, i, i2, i, i2);
            this.g = true;
        }
        this.f = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.b.onScrollEnd(this.d);
        this.c = false;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
            return;
        }
        this.b.onScrollStart(this.d);
        this.c = true;
    }
}
