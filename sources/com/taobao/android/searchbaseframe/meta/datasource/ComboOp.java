package com.taobao.android.searchbaseframe.meta.datasource;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ComboOp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f9342a;
    public final int b;
    public final int c;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Behavior {
    }

    static {
        t2o.a(993001844);
    }

    public ComboOp(int i, int i2, int i3) {
        this.f9342a = i;
        this.b = i2;
        this.c = i3;
    }

    public static ComboOp b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComboOp) ipChange.ipc$dispatch("83aca3ad", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new ComboOp(1, i, i2);
    }

    public static ComboOp c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComboOp) ipChange.ipc$dispatch("4dec9dc4", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new ComboOp(3, i, i2);
    }

    public static ComboOp d(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComboOp) ipChange.ipc$dispatch("71dbae2c", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return new ComboOp(2, i3 + i, i + i2);
    }

    public void a(int i, RecyclerView.Adapter<?> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e8079e", new Object[]{this, new Integer(i), adapter});
            return;
        }
        int i2 = this.f9342a;
        if (i2 == 1) {
            int i3 = this.b;
            adapter.notifyItemRangeChanged(i + i3, this.c - i3);
        } else if (i2 == 2) {
            int i4 = this.b;
            adapter.notifyItemRangeRemoved(i + i4, this.c - i4);
        } else if (i2 == 3) {
            int i5 = this.b;
            adapter.notifyItemRangeInserted(i + i5, this.c - i5);
        }
    }
}
