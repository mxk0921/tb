package com.taobao.android.xsearchplugin.muise;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.acx;
import tb.c4p;
import tb.ckf;
import tb.hy1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MusTrimMemoryManager extends hy1 implements ComponentCallbacks2, LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public final acx<?> c;
    public final String d = "MusTrimMemoryManager";
    public final ArrayList<AbsMuiseViewHolder<?, ?>> e = new ArrayList<>();

    static {
        t2o.a(993002155);
    }

    public MusTrimMemoryManager(Context context, acx<?> acxVar) {
        ckf.g(context, "context");
        ckf.g(acxVar, "widgetModelAdapter");
        this.b = context;
        this.c = acxVar;
        context.registerComponentCallbacks(this);
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
    }

    public static /* synthetic */ Object ipc$super(MusTrimMemoryManager musTrimMemoryManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MusTrimMemoryManager");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.unregisterComponentCallbacks(this);
        if (!a().isEmpty()) {
            a().clear();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
            return;
        }
        Iterator<AbsMuiseViewHolder<?, ?>> it = this.e.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            AbsMuiseViewHolder<?, ?> next = it.next();
            ckf.f(next, "next(...)");
            next.m1();
        }
        this.e.clear();
    }

    public final void f(AbsMuiseViewHolder<?, ?> absMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2ba3f6", new Object[]{this, absMuiseViewHolder});
            return;
        }
        View view = absMuiseViewHolder.itemView;
        view.getLayoutParams().height = view.getHeight();
        absMuiseViewHolder.J0();
        if (absMuiseViewHolder.R0()) {
            this.e.add(absMuiseViewHolder);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }

    public void e() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baeb4328", new Object[]{this});
            return;
        }
        Iterator<AbsMuiseViewHolder<?, ?>> it = a().iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            AbsMuiseViewHolder<?, ?> next = it.next();
            ckf.f(next, "next(...)");
            AbsMuiseViewHolder<?, ?> absMuiseViewHolder = next;
            if (!absMuiseViewHolder.R0()) {
                f(absMuiseViewHolder);
                i++;
            }
        }
        String str = this.d;
        c4p.m(str, "destroy " + i + " cells when tab leave");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        String str = this.d;
        c4p.n(str, "onTrimMemory: " + i);
        if (ckf.b(this.c.e(), this.c.a())) {
            Iterator<AbsMuiseViewHolder<?, ?>> it = a().iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                AbsMuiseViewHolder<?, ?> next = it.next();
                ckf.f(next, "next(...)");
                AbsMuiseViewHolder<?, ?> absMuiseViewHolder = next;
                if (!absMuiseViewHolder.R0() && absMuiseViewHolder.q) {
                    f(absMuiseViewHolder);
                    i2++;
                }
            }
        } else {
            Iterator<AbsMuiseViewHolder<?, ?>> it2 = a().iterator();
            ckf.f(it2, "iterator(...)");
            while (it2.hasNext()) {
                AbsMuiseViewHolder<?, ?> next2 = it2.next();
                ckf.f(next2, "next(...)");
                f(next2);
                i2++;
            }
        }
        String str2 = this.d;
        c4p.n(str2, "destroy " + i2 + " cells when trim memory");
    }
}
