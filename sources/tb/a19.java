package tb;

import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a19 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_CLICK_DELAY_TIME_LONG = 600;

    /* renamed from: a  reason: collision with root package name */
    public int f15478a;
    public long b;
    public final View.OnClickListener c;

    static {
        t2o.a(511705560);
    }

    public a19(View.OnClickListener onClickListener) {
        this(onClickListener, 300);
        int l = eag.l();
        if (l >= 0) {
            a(l);
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5edb164", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.f15478a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.b > this.f15478a) {
            this.b = uptimeMillis;
            this.c.onClick(view);
        }
    }

    public a19(View.OnClickListener onClickListener, int i) {
        a(i);
        this.c = onClickListener;
        this.b = 0L;
    }
}
