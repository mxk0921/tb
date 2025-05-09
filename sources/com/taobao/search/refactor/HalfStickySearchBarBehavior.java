package com.taobao.search.refactor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import tb.ej4;
import tb.slo;
import tb.sra;
import tb.t2o;
import tb.zwm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HalfStickySearchBarBehavior extends sra {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class StatusBarClipView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View themeView;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HalfStickySearchBarBehavior f11601a;

            public a(HalfStickySearchBarBehavior halfStickySearchBarBehavior) {
                this.f11601a = halfStickySearchBarBehavior;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    StatusBarClipView.access$100(StatusBarClipView.this);
                }
            }
        }

        static {
            t2o.a(815792858);
        }

        public StatusBarClipView(Context context) {
            super(context);
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            post(new a(HalfStickySearchBarBehavior.this));
        }

        public static /* synthetic */ View access$000(StatusBarClipView statusBarClipView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("770bf8ce", new Object[]{statusBarClipView});
            }
            return statusBarClipView.themeView;
        }

        public static /* synthetic */ void access$100(StatusBarClipView statusBarClipView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("838e018d", new Object[]{statusBarClipView});
            } else {
                statusBarClipView.findThemeView();
            }
        }

        private void findThemeView() {
            ViewGroup viewGroup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e24f45c", new Object[]{this});
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (!(viewGroup2 == null || (viewGroup = (ViewGroup) viewGroup2.getParent()) == null)) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ThemeFrameLayout) {
                        this.themeView = childAt;
                    }
                }
            }
        }

        public static /* synthetic */ Object ipc$super(StatusBarClipView statusBarClipView, String str, Object... objArr) {
            if (str.hashCode() == -1952076612) {
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/HalfStickySearchBarBehavior$StatusBarClipView");
        }

        @Override // android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
            }
            int save = canvas.save();
            canvas.clipRect(0, ej4.b, canvas.getWidth(), canvas.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return drawChild;
        }
    }

    static {
        t2o.a(815792857);
    }

    public HalfStickySearchBarBehavior(View view, boolean z, int i) {
        super(view, z, i, new zwm(3000, 1000, 2000));
        o(ej4.b);
    }

    public static /* synthetic */ Object ipc$super(HalfStickySearchBarBehavior halfStickySearchBarBehavior, String str, Object... objArr) {
        if (str.hashCode() == 246639415) {
            super.j(((Number) objArr[0]).floatValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/HalfStickySearchBarBehavior");
    }

    @Override // tb.kr1
    public void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb36b37", new Object[]{this, new Float(f)});
            return;
        }
        super.j(f);
        r(f);
    }

    @Override // tb.sra
    public FrameLayout l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7451d442", new Object[]{this, context});
        }
        return new StatusBarClipView(context);
    }

    public final void r(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b7e987", new Object[]{this, new Float(f)});
            return;
        }
        int measuredHeight = k().getMeasuredHeight();
        int m = m();
        float min = Math.min(Math.max(((measuredHeight * f) - m) / (measuredHeight - m), 0.0f), 1.0f);
        StatusBarClipView statusBarClipView = (StatusBarClipView) getView();
        if (StatusBarClipView.access$000(statusBarClipView) != null) {
            StatusBarClipView.access$000(statusBarClipView).setAlpha(min);
        }
        s(min);
    }

    public final void s(float f) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7740ae", new Object[]{this, new Float(f)});
        } else if (TextUtils.equals(FestivalMgr.i().f("global", slo.KEY_NAVI_STYLE), "0") && Build.VERSION.SDK_INT >= 23) {
            View decorView = ((Activity) getView().getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (f <= 0.5d) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & (-8193);
            }
            decorView.setSystemUiVisibility(i);
        }
    }
}
