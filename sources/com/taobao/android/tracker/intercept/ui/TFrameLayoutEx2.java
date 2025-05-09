package com.taobao.android.tracker.intercept.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.bed;
import tb.ejx;
import tb.fgc;
import tb.k71;
import tb.t2o;
import tb.t5b;
import tb.u5b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TFrameLayoutEx2 extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "TEXFrameLayout";
    private bed mInnerClickProxy = new c();
    private fgc mListener;
    private String mUrl;
    private Field sHookField;
    private Method sHookMethod;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9681a;

        public a(View view) {
            this.f9681a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else {
                TFrameLayoutEx2.access$000(TFrameLayoutEx2.this, this.f9681a, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ViewTreeObserver.OnScrollChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9682a;

        public b(View view) {
            this.f9682a = view;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            } else {
                TFrameLayoutEx2.access$000(TFrameLayoutEx2.this, this.f9682a, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements bed {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public boolean a(ejx ejxVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e744ff6", new Object[]{this, ejxVar, view})).booleanValue();
            }
            if (TFrameLayoutEx2.access$100(TFrameLayoutEx2.this) != null) {
                TFrameLayoutEx2.access$100(TFrameLayoutEx2.this).a(TFrameLayoutEx2.access$200(TFrameLayoutEx2.this), view);
            }
            return false;
        }
    }

    static {
        t2o.a(455082009);
    }

    public TFrameLayoutEx2(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ void access$000(TFrameLayoutEx2 tFrameLayoutEx2, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e5e303", new Object[]{tFrameLayoutEx2, view, new Integer(i)});
        } else {
            tFrameLayoutEx2.hookViews(view, i);
        }
    }

    public static /* synthetic */ fgc access$100(TFrameLayoutEx2 tFrameLayoutEx2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgc) ipChange.ipc$dispatch("dcc2386b", new Object[]{tFrameLayoutEx2});
        }
        return tFrameLayoutEx2.mListener;
    }

    public static /* synthetic */ String access$200(TFrameLayoutEx2 tFrameLayoutEx2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb626b50", new Object[]{tFrameLayoutEx2});
        }
        return tFrameLayoutEx2.mUrl;
    }

    private void hookClickListener(View view, int i, boolean z) {
        View.OnClickListener onClickListener;
        if (!z && (z = view.isClickable()) && i == 0) {
            z = view.getTag(u5b.PrivateTagKey) == null;
        }
        if (z) {
            try {
                Object invoke = this.sHookMethod.invoke(view, new Object[0]);
                if (invoke == null) {
                    onClickListener = null;
                } else {
                    onClickListener = (View.OnClickListener) this.sHookField.get(invoke);
                }
                if (onClickListener != null && !(onClickListener instanceof ejx)) {
                    this.sHookField.set(invoke, new ejx(onClickListener, this.mInnerClickProxy));
                    view.setTag(u5b.PrivateTagKey, Integer.valueOf(i));
                }
            } catch (Exception e) {
                k71.a("hookClickListener", this.mUrl, "", e.getMessage());
            }
        }
    }

    private void hookViews(View view, int i) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf1183", new Object[]{this, view, new Integer(i)});
        } else if (view.getVisibility() == 0) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (view instanceof ViewGroup) {
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (((viewGroup instanceof AbsListView) || (viewGroup instanceof RecyclerView)) && !z2) {
                    i = 1;
                } else {
                    hookClickListener(view, i, z);
                    if (z2) {
                        i++;
                    }
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    hookViews(viewGroup.getChildAt(i2), i);
                }
                return;
            }
            hookClickListener(view, i, z);
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        initHook();
        initHookListener();
    }

    private void initHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcee95a", new Object[]{this});
            return;
        }
        initHookMethod();
        initHookField();
    }

    private void initHookField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cdf6e", new Object[]{this});
            return;
        }
        t5b a2 = u5b.a();
        if (a2 == null) {
            return;
        }
        if (a2.f28497a) {
            this.sHookField = a2.c;
        } else {
            k71.a("hookOnClickListener", this.mUrl, "", a2.d);
        }
    }

    private void initHookListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4481052e", new Object[]{this});
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
        getViewTreeObserver().addOnScrollChangedListener(new b(this));
    }

    private void initHookMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5389139b", new Object[]{this});
            return;
        }
        t5b b2 = u5b.b();
        if (b2 == null) {
            return;
        }
        if (b2.f28497a) {
            this.sHookMethod = b2.b;
        } else {
            k71.a("hookGetListenerInfo", this.mUrl, "", b2.d);
        }
    }

    public static /* synthetic */ Object ipc$super(TFrameLayoutEx2 tFrameLayoutEx2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/intercept/ui/TFrameLayoutEx2");
    }

    public void setListener(fgc fgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab314ed", new Object[]{this, fgcVar});
        } else {
            this.mListener = fgcVar;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.mUrl = str;
        }
    }

    public TFrameLayoutEx2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TFrameLayoutEx2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
