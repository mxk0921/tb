package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.view.LiveListViewHolder;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class l00 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CardContainer";

    /* renamed from: a  reason: collision with root package name */
    public a f23033a;
    public ArrayList<cpb> b = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(806355410);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator<cpb> it = this.b.iterator();
        while (it.hasNext()) {
            cpb next = it.next();
            if (next != null) {
                next.destroy();
            }
        }
        this.b.clear();
        this.f23033a = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db7f208", new Object[]{this});
            return;
        }
        a aVar = this.f23033a;
        if (aVar != null) {
            ((LiveListViewHolder.a) aVar).a(this);
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3206ab", new Object[]{this, view});
            return;
        }
        a aVar = this.f23033a;
        if (aVar != null) {
            ((LiveListViewHolder.a) aVar).b(this, view);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        Iterator<cpb> it = this.b.iterator();
        while (it.hasNext()) {
            cpb next = it.next();
            if (next != null) {
                next.pause();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        Iterator<cpb> it = this.b.iterator();
        while (it.hasNext()) {
            cpb next = it.next();
            if (next != null) {
                next.resume();
            }
        }
    }

    public void f(ArrayList<cpb> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3427e70", new Object[]{this, arrayList});
        } else {
            this.b = arrayList;
        }
    }

    public void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7c8df0", new Object[]{this, aVar});
        } else {
            this.f23033a = aVar;
        }
    }
}
