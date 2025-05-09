package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final peg f22631a;
    public final View b;

    static {
        t2o.a(295699219);
    }

    public kfg(peg pegVar, View view) {
        this.f22631a = pegVar;
        this.b = view;
    }

    public static kfg e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfg) ipChange.ipc$dispatch("f6bbe9", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.taolive_gl_lv_view_tag);
        if (tag instanceof kfg) {
            return (kfg) tag;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kfg a(kfg kfgVar, peg pegVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfg) ipChange.ipc$dispatch("64384ec7", new Object[]{this, kfgVar, pegVar});
        }
        hha.e(pegVar + "add_layer");
        if (pegVar.d()) {
            LinearLayout linearLayout = new LinearLayout(kfgVar.d().getContext());
            linearLayout.setOrientation(1);
            frameLayout = linearLayout;
        } else {
            frameLayout = new FrameLayout(kfgVar.d().getContext());
        }
        kfg kfgVar2 = new kfg(pegVar, frameLayout);
        frameLayout.setTag(R.id.taolive_gl_lv_view_tag, kfgVar2);
        View d = kfgVar.d();
        if (d instanceof ViewGroup) {
            ((ViewGroup) d).addView(kfgVar2.d(), new FrameLayout.LayoutParams(-1, -2));
        }
        hha.f();
        return kfgVar2;
    }

    public List<kfg> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        View view = this.b;
        if (!(view instanceof ViewGroup)) {
            return arrayList;
        }
        int childCount = ((ViewGroup) view).getChildCount();
        if (childCount == 0) {
            return arrayList;
        }
        for (int i = 0; i < childCount; i++) {
            kfg e = e(((ViewGroup) this.b).getChildAt(i));
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public peg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (peg) ipChange.ipc$dispatch("2060ab04", new Object[]{this});
        }
        return this.f22631a;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }
}
