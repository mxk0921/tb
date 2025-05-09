package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y23 implements rkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f31796a;
    public View b;
    public final HashSet<Drawable> c = new HashSet<>();
    public boolean d = false;
    public boolean e = false;

    @Override // tb.rkb
    public void a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b6b95", new Object[]{this, view, view2});
            return;
        }
        this.f31796a = view;
        this.b = view2;
    }

    @Override // tb.rkb
    public eu2 b() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eu2) ipChange.ipc$dispatch("c4772dca", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        float c = c(this.f31796a, arrayList, this.b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sew) it.next()).c();
        }
        this.c.clear();
        boolean z = this.d;
        if (this.e) {
            view = this.b;
        } else {
            view = null;
        }
        return new eu2(y23.class, c, z, view);
    }

    public final float c(View view, List<sew> list, View view2) {
        View view3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3359768", new Object[]{this, view, list, view2})).floatValue();
        }
        float f = 0.0f;
        if (!tew.a(view, view2)) {
            return 0.0f;
        }
        if (view.getHeight() < qgw.screenHeight / 20) {
            return 1.0f;
        }
        if (view instanceof ViewStub) {
            return 0.0f;
        }
        if (tew.f(view, view2)) {
            this.b = view;
            this.e = true;
            return 0.0f;
        }
        Object tag = view.getTag(dgw.APM_VIEW_TOKEN);
        if (tag instanceof String) {
            if (dgw.APM_VIEW_VALID.equals(tag)) {
                return 1.0f;
            }
            if (dgw.APM_VIEW_IGNORE.equals(tag) || dgw.APM_VIEW_INVALID.equals(tag)) {
                return 0.0f;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (tew.i(viewGroup)) {
                return tew.j(viewGroup) ? 1.0f : 0.0f;
            }
            View[] b = qgw.b(viewGroup);
            int length = b.length;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length && (view3 = b[i3]) != null; i3++) {
                i++;
                ArrayList arrayList = new ArrayList();
                if (c(view3, arrayList, view2) > 0.8f) {
                    i2++;
                    list.add(sew.a(view3, view2));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((sew) it.next()).c();
                    }
                } else {
                    list.addAll(arrayList);
                }
            }
            if (view.getHeight() < qgw.screenHeight / 8 && (((viewGroup instanceof LinearLayout) || (viewGroup instanceof RelativeLayout)) && i == i2 && i != 0)) {
                return 1.0f;
            }
            float a2 = new hpg(tj7.a(30)).a(viewGroup, list, view2);
            if (a2 > 0.8f) {
                return 1.0f;
            }
            return a2;
        }
        boolean[] zArr = new boolean[1];
        if (tew.h(view, true, this.c, zArr)) {
            f = 1.0f;
        }
        this.d = zArr[0];
        return f;
    }
}
