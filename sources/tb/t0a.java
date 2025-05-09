package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t0a extends kd7<u0a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView h = new TextView(this.f22590a);

    static {
        t2o.a(912262368);
    }

    public t0a(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(t0a t0aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/FullTextViewHolder");
    }

    /* renamed from: w */
    public void h(u0a u0aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdade0a8", new Object[]{this, u0aVar});
            return;
        }
        String str = u0aVar.l;
        String str2 = u0aVar.k;
        String str3 = u0aVar.m;
        int i = u0aVar.n;
        int i2 = u0aVar.p;
        int i3 = u0aVar.o;
        this.h.setText(str);
        if (i2 > 0 || i2 == -1 || i2 == -2) {
            ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, i2);
            }
            layoutParams.height = i2;
            this.h.setLayoutParams(layoutParams);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.h.setTextColor(w14.a(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            this.h.setBackgroundColor(w14.a(str3));
        }
        if (i3 > 0) {
            this.h.setTextSize(0, i3);
        }
        if (i == 0) {
            this.h.setGravity(17);
        } else if (i == 1) {
            this.h.setGravity(21);
        } else if (i == 2) {
            this.h.setGravity(19);
        }
    }

    /* renamed from: x */
    public View j(u0a u0aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4090b538", new Object[]{this, u0aVar});
        }
        return this.h;
    }

    /* renamed from: y */
    public boolean m(u0a u0aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c836a2c", new Object[]{this, u0aVar})).booleanValue();
        }
        return TextUtils.isEmpty(u0aVar.l);
    }
}
