package com.taobao.errorview.mega;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsErrorViewWidgetAbility;
import com.taobao.android.abilityidl.ability.ErrorViewWidgetRequestError;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.d3c;
import tb.jdb;
import tb.kdb;
import tb.ldb;
import tb.t2o;
import tb.ui8;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ErrorViewWidgetAbility extends AbsErrorViewWidgetAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, c> f10424a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ErrorViewWidgetAbility errorViewWidgetAbility) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d3c f10425a;
        public final /* synthetic */ ui8 b;

        public b(d3c d3cVar, ui8 ui8Var) {
            this.f10425a = d3cVar;
            this.b = ui8Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f10425a.r1(this.b.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<FrameLayout> f10426a;
        public WeakReference<TBErrorViewWidget> b;

        static {
            t2o.a(932184068);
        }

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        t2o.a(932184065);
    }

    public static void b(c cVar, String str, String str2) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58305273", new Object[]{cVar, str, str2});
        } else if (cVar != null) {
            if (!TextUtils.isEmpty(str2)) {
                TLog.loge("TBErrorView", "ErrorViewWidgetAbility", str2);
            }
            WeakReference<FrameLayout> weakReference = cVar.f10426a;
            TBErrorViewWidget tBErrorViewWidget = null;
            if (weakReference == null) {
                frameLayout = null;
            } else {
                frameLayout = weakReference.get();
            }
            WeakReference<TBErrorViewWidget> weakReference2 = cVar.b;
            if (weakReference2 != null) {
                tBErrorViewWidget = weakReference2.get();
            }
            if (tBErrorViewWidget != null) {
                ViewGroup viewGroup = (ViewGroup) tBErrorViewWidget.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(tBErrorViewWidget);
                } else {
                    TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[dismiss] parent of widget is null");
                }
            } else {
                TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[dismiss] widget is null");
            }
            if (frameLayout != null) {
                ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(frameLayout);
                } else {
                    TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[dismiss] parent of layout is null");
                }
            } else {
                TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[dismiss] layout is null");
            }
        } else if (!TextUtils.isEmpty(str)) {
            TLog.loge("TBErrorView", "ErrorViewWidgetAbility", str);
        }
    }

    public static Activity c(kdb kdbVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ee452099", new Object[]{kdbVar});
        }
        ldb a2 = kdbVar.a();
        if (a2 == null || (context = a2.getContext()) == null || !(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a8e5bfa", new Object[]{str})).intValue();
        }
        if ("BUTTON_STYLE_NONE".equals(str)) {
            return 0;
        }
        if ("BUTTON_STYLE_ALL".equals(str)) {
            return 7;
        }
        if ("BUTTON_STYLE_FEEDBACK".equals(str)) {
            return 2;
        }
        if ("BUTTON_STYLE_NORMAL_ACTION".equals(str)) {
            return 4;
        }
        return 6;
    }

    public static Error e(ErrorViewWidgetRequestError errorViewWidgetRequestError) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("7e5fd56f", new Object[]{errorViewWidgetRequestError});
        }
        if (!TextUtils.isEmpty(errorViewWidgetRequestError.responseCode)) {
            try {
                parseInt = Integer.parseInt(errorViewWidgetRequestError.responseCode);
            } catch (Exception unused) {
            }
            return Error.Factory.fromMtopResponse(errorViewWidgetRequestError.api, parseInt, errorViewWidgetRequestError.mappingCode, errorViewWidgetRequestError.code, errorViewWidgetRequestError.message, errorViewWidgetRequestError.reqFalcoId);
        }
        parseInt = -1;
        return Error.Factory.fromMtopResponse(errorViewWidgetRequestError.api, parseInt, errorViewWidgetRequestError.mappingCode, errorViewWidgetRequestError.code, errorViewWidgetRequestError.message, errorViewWidgetRequestError.reqFalcoId);
    }

    public static FrameLayout f(Activity activity, String str) {
        FrameLayout frameLayout;
        Window window;
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3671038a", new Object[]{activity, str});
        }
        if (TBMainHost.b().getContext() == activity && (currentFragment = com.taobao.tao.navigation.a.o().getCurrentFragment()) != null) {
            View view = currentFragment.getView();
            if (view instanceof FrameLayout) {
                frameLayout = (FrameLayout) view;
                if (frameLayout != null && (window = activity.getWindow()) != null) {
                    View decorView = window.getDecorView();
                    if (decorView instanceof FrameLayout) {
                        return (FrameLayout) decorView;
                    }
                    TLog.loge("TBErrorView", "ErrorViewWidgetAbility", str + " decorView is not a FrameLayout");
                    return frameLayout;
                }
            } else {
                TLog.loge("TBErrorView", "ErrorViewWidgetAbility", str + " fragment view of tabHost is not a FrameLayout");
            }
        }
        frameLayout = null;
        return frameLayout != null ? frameLayout : frameLayout;
    }

    public static TBErrorViewWidget.UserInterfaceStyle g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorViewWidget.UserInterfaceStyle) ipChange.ipc$dispatch("d28a5e90", new Object[]{str});
        }
        TBErrorViewWidget.UserInterfaceStyle userInterfaceStyle = TBErrorViewWidget.UserInterfaceStyle.UNSPECIFIED;
        if ("DARK".equals(str)) {
            return TBErrorViewWidget.UserInterfaceStyle.DARK;
        }
        if ("LIGHT".equals(str)) {
            return TBErrorViewWidget.UserInterfaceStyle.LIGHT;
        }
        return userInterfaceStyle;
    }

    public static /* synthetic */ Object ipc$super(ErrorViewWidgetAbility errorViewWidgetAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/errorview/mega/ErrorViewWidgetAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsErrorViewWidgetAbility
    public void dismiss(kdb kdbVar, jdb jdbVar) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab2377c", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        Activity c2 = c(kdbVar);
        if (c2 == null) {
            TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[dismiss] activity is null");
            jdbVar.O(new ErrorResult("ERROR", "[dismiss] activity is null"));
            return;
        }
        FrameLayout f = f(c2, "[dismiss]");
        if (f != null) {
            cVar = (c) ((ConcurrentHashMap) f10424a).remove(Integer.valueOf(f.hashCode()));
            b(cVar, "[dismiss] not a FrameLayout", "[dismiss] is a FrameLayout");
        } else {
            cVar = null;
        }
        if (cVar == null) {
            b((c) ((ConcurrentHashMap) f10424a).remove(Integer.valueOf(c2.hashCode())), "[dismiss] not viewHolder find", "[dismiss] is a ContentView");
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsErrorViewWidgetAbility
    public void show(kdb kdbVar, ui8 ui8Var, d3c d3cVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3049aff6", new Object[]{this, kdbVar, ui8Var, d3cVar});
            return;
        }
        Activity c2 = c(kdbVar);
        if (c2 == null) {
            TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[show] activity is null");
            d3cVar.O(new ErrorResult("ERROR", "[show] activity is null"));
            return;
        }
        FrameLayout f = f(c2, "[show]");
        if (f == null) {
            i = c2.hashCode();
        } else {
            i = f.hashCode();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f10424a;
        b((c) concurrentHashMap.remove(Integer.valueOf(i)), null, "[show] widget already exists, dismiss first");
        int max = Math.max(0, ui8Var.b);
        TBErrorViewWidget a2 = a(c2, ui8Var, d3cVar);
        c cVar = new c(null);
        cVar.b = new WeakReference<>(a2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.setMargins(0, 0, 0, TBErrorViewWidget.dp2px(c2, max));
        if (f != null) {
            TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[show] targetView is a FrameLayout");
            f.addView(a2, layoutParams);
            cVar.f10426a = null;
        } else {
            TLog.loge("TBErrorView", "ErrorViewWidgetAbility", "[show] targetView is not a FrameLayout");
            FrameLayout frameLayout = new FrameLayout(c2);
            frameLayout.addView(a2, layoutParams);
            frameLayout.setOnTouchListener(new a(this));
            c2.addContentView(frameLayout, new ViewGroup.MarginLayoutParams(-1, -1));
            cVar.f10426a = new WeakReference<>(frameLayout);
        }
        concurrentHashMap.put(Integer.valueOf(i), cVar);
    }

    public static TBErrorViewWidget a(Activity activity, ui8 ui8Var, d3c d3cVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorViewWidget) ipChange.ipc$dispatch("a069896d", new Object[]{activity, ui8Var, d3cVar});
        }
        String str = ui8Var.f29395a;
        int d = d(ui8Var.c);
        TBErrorViewWidget.UserInterfaceStyle g = g(ui8Var.d);
        Error e = e(ui8Var.e);
        String str2 = ui8Var.f;
        String str3 = ui8Var.g;
        b bVar = new b(d3cVar, ui8Var);
        if (TextUtils.isEmpty(str3) || str3.contains(wmc.REFRESH) || str3.toLowerCase().contains("refresh")) {
            z = true;
        }
        TBErrorViewWidget tBErrorViewWidget = new TBErrorViewWidget(activity);
        tBErrorViewWidget.setTopic(str);
        tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_CUSTOM);
        tBErrorViewWidget.setAdaptiveWidth(true);
        tBErrorViewWidget.setUserInterfaceStyle(g);
        tBErrorViewWidget.setCustomTitle(str2);
        tBErrorViewWidget.setCustomEnableButtons(d);
        if (z) {
            tBErrorViewWidget.setRefreshButtonWithProgress(str3, str3, bVar);
        } else {
            tBErrorViewWidget.setRefreshButtonWithoutProgress(str3, bVar);
        }
        tBErrorViewWidget.setError(e);
        return tBErrorViewWidget;
    }
}
