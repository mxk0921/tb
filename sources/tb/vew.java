package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vew implements adf<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sfw f29975a;

    static {
        t2o.a(676331625);
        t2o.a(676331614);
    }

    public vew(sfw sfwVar) {
        this.f29975a = sfwVar;
    }

    /* renamed from: b */
    public View a() {
        View view;
        sfw sfwVar = this.f29975a;
        try {
            if (!(sfwVar.c() == null || sfwVar.c().get() == null || TextUtils.isEmpty(sfwVar.d()))) {
                ((cad) bcq.a()).i().n(sfwVar.c().get(), sfwVar.d());
            }
            Class<?> cls = Class.forName(sfwVar.b());
            if (!(sfwVar.j() == null || sfwVar.h().length == 0)) {
                view = (View) cls.getDeclaredConstructor(sfwVar.j()).newInstance(sfwVar.h());
                if (!(view == null || sfwVar.e() == null)) {
                    sfwVar.e().b(view, sfwVar.a());
                }
                return view;
            }
            view = (View) cls.getDeclaredConstructor(Context.class).newInstance(sfwVar.c().get());
            if (view == null) {
                sfwVar.e().b(view, sfwVar.a());
            }
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            if (sfwVar.e() == null) {
                return null;
            }
            sfwVar.e().a(e.getMessage(), sfwVar.a());
            return null;
        }
    }
}
