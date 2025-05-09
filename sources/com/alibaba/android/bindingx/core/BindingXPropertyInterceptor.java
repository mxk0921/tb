package com.alibaba.android.bindingx.core;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.qyw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BindingXPropertyInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BindingXPropertyInterceptor sInstance = new BindingXPropertyInterceptor();
    private final Handler sUIHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<b> mPropertyInterceptors = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2167a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ a.c d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ Object[] f;

        public a(View view, String str, Object obj, a.c cVar, Map map, Object[] objArr) {
            this.f2167a = view;
            this.b = str;
            this.c = obj;
            this.d = cVar;
            this.e = map;
            this.f = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = BindingXPropertyInterceptor.access$000(BindingXPropertyInterceptor.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(this.f2167a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        boolean a(View view, String str, Object obj, a.c cVar, Map<String, Object> map, Object... objArr);
    }

    static {
        t2o.a(87031821);
    }

    private BindingXPropertyInterceptor() {
    }

    public static /* synthetic */ CopyOnWriteArrayList access$000(BindingXPropertyInterceptor bindingXPropertyInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("c07768ef", new Object[]{bindingXPropertyInterceptor});
        }
        return bindingXPropertyInterceptor.mPropertyInterceptors;
    }

    public static BindingXPropertyInterceptor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BindingXPropertyInterceptor) ipChange.ipc$dispatch("f9f755db", new Object[0]);
        }
        return sInstance;
    }

    public void addInterceptor(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff85380", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.mPropertyInterceptors.add(bVar);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mPropertyInterceptors.clear();
        }
    }

    public void clearCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32273508", new Object[]{this});
        } else {
            this.sUIHandler.removeCallbacksAndMessages(null);
        }
    }

    public List<b> getInterceptors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ce4b9afc", new Object[]{this});
        }
        return Collections.unmodifiableList(this.mPropertyInterceptors);
    }

    public void performIntercept(View view, String str, Object obj, a.c cVar, Map<String, Object> map, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d340c17", new Object[]{this, view, str, obj, cVar, map, objArr});
        } else if (!this.mPropertyInterceptors.isEmpty()) {
            this.sUIHandler.post(new qyw(new a(view, str, obj, cVar, map, objArr)));
        }
    }

    public boolean removeInterceptor(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f0d6701", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar != null) {
            return this.mPropertyInterceptors.remove(bVar);
        }
        return false;
    }
}
