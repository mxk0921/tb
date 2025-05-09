package com.taobao.android.weex_uikit.widget.input;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.input.a;
import java.lang.ref.WeakReference;
import tb.cxh;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int b;
        public final /* synthetic */ View d;
        public final /* synthetic */ AbstractC0524c e;

        /* renamed from: a  reason: collision with root package name */
        public final Rect f10017a = new Rect();
        public boolean c = false;

        public a(Activity activity, View view, AbstractC0524c cVar) {
            this.d = view;
            this.e = cVar;
            this.b = cxh.a(activity, 100.0f);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.d.getWindowVisibleDisplayFrame(this.f10017a);
            if (this.d.getRootView().getHeight() - this.f10017a.height() > this.b) {
                z = true;
            }
            if (z != this.c) {
                this.c = z;
                ((a.C0523a) this.e).a(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Activity> f10018a;
        public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> b;

        static {
            t2o.a(986710176);
            t2o.a(986710178);
        }

        public b(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f10018a = new WeakReference<>(activity);
            this.b = new WeakReference<>(onGlobalLayoutListener);
        }

        @Override // com.taobao.android.weex_uikit.widget.input.c.d
        public void execute() {
            View a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
                return;
            }
            Activity activity = this.f10018a.get();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.b.get();
            if (!(activity == null || onGlobalLayoutListener == null || (a2 = c.a(activity)) == null)) {
                a2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f10018a.clear();
            this.b.clear();
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.widget.input.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0524c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void execute();
    }

    static {
        t2o.a(986710174);
    }

    public static View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ca9afd22", new Object[]{activity});
        }
        if (activity != null) {
            return activity.findViewById(16908290);
        }
        return null;
    }

    public static d b(Activity activity, AbstractC0524c cVar) {
        WindowManager.LayoutParams attributes;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("eca8d63", new Object[]{activity, cVar});
        }
        if (activity == null || cVar == null) {
            dwh.e("Activity or listener is null!");
            return null;
        } else if (activity.getWindow() == null || (attributes = activity.getWindow().getAttributes()) == null || !((i = attributes.softInputMode) == 48 || i == 32)) {
            View a2 = a(activity);
            if (a2 == null) {
                dwh.e("Activity root is null!");
                return null;
            }
            a aVar = new a(activity, a2, cVar);
            a2.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            return new b(activity, aVar);
        } else {
            dwh.e("SoftKeyboard detector can't work with softInputMode is SOFT_INPUT_ADJUST_NOTHING or SOFT_INPUT_ADJUST_PAN");
            return null;
        }
    }
}
