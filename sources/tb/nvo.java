package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nvo implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile nvo c;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f24982a;
    public final List<huk> b = new CopyOnWriteArrayList();

    static {
        t2o.a(779092274);
    }

    public static nvo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nvo) ipChange.ipc$dispatch("ec08cc88", new Object[0]);
        }
        if (c == null) {
            synchronized (nvo.class) {
                try {
                    if (c == null) {
                        c = new nvo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (this.f24982a == null) {
            this.f24982a = new AtomicBoolean(!TBAutoSizeConfig.x().T(context));
        }
        return this.f24982a.get();
    }

    public void c(huk hukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18c829f", new Object[]{this, hukVar});
        } else if (hukVar != null) {
            if (((CopyOnWriteArrayList) this.b).isEmpty()) {
                TBAutoSizeConfig.x().d0(this);
            }
            ((CopyOnWriteArrayList) this.b).add(hukVar);
        }
    }

    public void d(huk hukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be85eb8", new Object[]{this, hukVar});
        } else if (hukVar != null) {
            ((CopyOnWriteArrayList) this.b).remove(hukVar);
            if (((CopyOnWriteArrayList) this.b).isEmpty()) {
                this.f24982a = null;
                TBAutoSizeConfig.x().h0(this);
            }
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        guk.a(this, activity, i, configuration);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        if (this.f24982a == null) {
            this.f24982a = new AtomicBoolean();
        }
        if (2 == i) {
            this.f24982a.set(true);
        } else {
            this.f24982a.set(false);
        }
        if (!((CopyOnWriteArrayList) this.b).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((huk) it.next()).onScreenOrientationChange(this.f24982a.get());
            }
        }
    }
}
