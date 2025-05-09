package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainListViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class j00 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CardContainer";

    /* renamed from: a  reason: collision with root package name */
    public a f21674a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(310378771);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f21674a = null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db7f208", new Object[]{this});
            return;
        }
        a aVar = this.f21674a;
        if (aVar != null) {
            ((HomeMainListViewHolder.a) aVar).a(this);
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3206ab", new Object[]{this, view});
            return;
        }
        a aVar = this.f21674a;
        if (aVar != null) {
            ((HomeMainListViewHolder.a) aVar).b(this, view);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9844eb", new Object[]{this, aVar});
        } else {
            this.f21674a = aVar;
        }
    }
}
