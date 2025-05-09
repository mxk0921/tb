package tb;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f28670a;
    public View b;
    public final HashSet<Drawable> c = new HashSet<>();
    public boolean d = false;

    public tew(View view, View view2) {
        this.f28670a = view;
        this.b = view2;
    }

    public static boolean a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4aede4", new Object[]{view, view2})).booleanValue();
        }
        if (qgw.d(view, view2) && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static boolean f(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30e7e67b", new Object[]{view, view2})).booleanValue();
        }
        if (!Boolean.TRUE.equals(view.getTag(dgw.APM_PAGE_ROOT_VIEW)) || view2 == view) {
            return false;
        }
        return true;
    }

    public static boolean g(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bd6cfdf", new Object[]{drawable})).booleanValue();
        }
        if ((drawable instanceof BitmapDrawable) || (drawable instanceof NinePatchDrawable) || (drawable instanceof AnimationDrawable) || (drawable instanceof ShapeDrawable) || (drawable instanceof PictureDrawable)) {
            return true;
        }
        return false;
    }

    public static boolean h(View view, boolean z, HashSet<Drawable> hashSet, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f00807f", new Object[]{view, new Boolean(z), hashSet, zArr})).booleanValue();
        }
        if (zArr == null) {
            zArr = new boolean[1];
        }
        if (view instanceof ImageView) {
            Drawable drawable = ((ImageView) view).getDrawable();
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && uax.a(drawable)) {
                drawable = vax.a(drawable).getDrawable();
            }
            if (!g(drawable) || hashSet.contains(drawable)) {
                Drawable background = view.getBackground();
                if (i >= 23 && !z && uax.a(background)) {
                    background = vax.a(background).getDrawable();
                }
                if (!g(background) || hashSet.contains(background)) {
                    return false;
                }
                hashSet.add(background);
                return true;
            }
            hashSet.add(drawable);
            return true;
        } else if (view instanceof TextView) {
            if (view instanceof EditText) {
                zArr[0] = view.isFocusable();
                return true;
            } else if (z || !(view instanceof Button)) {
                return !TextUtils.isEmpty(((TextView) view).getText().toString());
            } else {
                return true;
            }
        } else if (z || !"com.taobao.android.dinamicx.view.DXNativeFastText".equals(view.getClass().getName())) {
            return z;
        } else {
            return true;
        }
    }

    public static boolean i(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44c8e6d9", new Object[]{viewGroup})).booleanValue();
        }
        if ((viewGroup instanceof WebView) || t1x.INSTANCE.b(viewGroup)) {
            return true;
        }
        return false;
    }

    public static boolean j(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6db55d2", new Object[]{viewGroup})).booleanValue();
        }
        if (!(viewGroup instanceof WebView)) {
            t1x t1xVar = t1x.INSTANCE;
            if (!t1xVar.b(viewGroup) || t1xVar.a(viewGroup) != 100) {
                return false;
            }
            return true;
        } else if (i97.INSTANCE.a((WebView) viewGroup) == 100) {
            return true;
        } else {
            return false;
        }
    }

    public void b(List<sew> list, List<sew> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886344a2", new Object[]{this, list, list2});
            return;
        }
        this.c.clear();
        this.d = false;
        c(this.f28670a, this.b, list, list2);
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37dce16f", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768c9720", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    public final void l(List<sew> list, sew sewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde17799", new Object[]{this, list, sewVar});
        } else if (list != null) {
            list.add(sewVar);
        }
    }

    public final void c(View view, View view2, List<sew> list, List<sew> list2) {
        View[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4408e493", new Object[]{this, view, view2, list, list2});
        } else if (a(view, view2)) {
            if (f(view, view2)) {
                this.b = view;
                return;
            }
            Object tag = view.getTag(dgw.APM_VIEW_TOKEN);
            if (tag instanceof String) {
                if (dgw.APM_VIEW_IGNORE.equals(tag)) {
                    return;
                }
                if (dgw.APM_VIEW_VALID.equals(tag)) {
                    l(list, sew.b(view, view2));
                    return;
                } else if (dgw.APM_VIEW_INVALID.equals(tag)) {
                    l(list2, sew.b(view, view2));
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!i(viewGroup) || !j(viewGroup)) {
                    for (View view3 : qgw.b(viewGroup)) {
                        if (view3 != null) {
                            c(view3, view2, list, list2);
                        } else {
                            return;
                        }
                    }
                    return;
                }
                l(list, sew.b(view, view2));
                return;
            }
            boolean[] zArr = new boolean[1];
            if (h(view, false, this.c, zArr)) {
                l(list, sew.b(view, view2));
            }
            this.d = zArr[0];
        }
    }
}
