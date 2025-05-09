package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.HorizontalScrollView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ezo extends kd7<dzo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float COUPONVIEW_DEFAULTWIDTH = mr7.b * 154.0f;
    public final LinearLayout i;
    public final HorizontalScrollView j;
    public final LinearLayout k;
    public final int h = (int) (mr7.b * 3.0f);
    public int l = -1;
    public final ArrayList<kd7<md7>> m = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements HorizontalScrollView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e75cdfa3", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            if (ezo.w(ezo.this) == -1) {
                if (!ezo.y(ezo.this).isEmpty()) {
                    ezo ezoVar = ezo.this;
                    ezo.x(ezoVar, ((kd7) ezo.y(ezoVar).get(0)).j(null).getWidth());
                    int w = mr7.c / ezo.w(ezo.this);
                    if (w > 1) {
                        for (int i5 = 1; i5 < w; i5++) {
                            if (i5 < ezo.y(ezo.this).size()) {
                                md7 md7Var = ((dzo) ezo.this.g).b().get(i5);
                                ux1 ux1Var = ((kd7) ezo.y(ezo.this).get(i5)).e;
                                if (ux1Var != null && !md7Var.e) {
                                    q84.f(ezo.this.f22590a, ux1Var);
                                    md7Var.e = true;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            int w2 = (mr7.c + i) / ezo.w(ezo.this);
            if (w2 > 0 && w2 < ezo.y(ezo.this).size()) {
                md7 md7Var2 = ((dzo) ezo.this.g).b().get(w2);
                ux1 ux1Var2 = ((kd7) ezo.y(ezo.this).get(w2)).e;
                if (!(ux1Var2 == null || md7Var2.e)) {
                    q84.f(ezo.this.f22590a, ux1Var2);
                    md7Var2.e = true;
                }
            }
        }
    }

    static {
        t2o.a(912262394);
    }

    public ezo(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        this.i = linearLayout;
        linearLayout.setOrientation(1);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f22590a);
        this.j = horizontalScrollView;
        horizontalScrollView.setOverScrollMode(2);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout2 = new LinearLayout(this.f22590a);
        this.k = linearLayout2;
        linearLayout2.setOrientation(0);
        horizontalScrollView.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        horizontalScrollView.setOnScrollListener(new a());
    }

    public static /* synthetic */ Object ipc$super(ezo ezoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/ScrollableContainerViewHolder");
    }

    public static /* synthetic */ int w(ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("984feaf3", new Object[]{ezoVar})).intValue();
        }
        return ezoVar.l;
    }

    public static /* synthetic */ int x(ezo ezoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23c47ef8", new Object[]{ezoVar, new Integer(i)})).intValue();
        }
        ezoVar.l = i;
        return i;
    }

    public static /* synthetic */ ArrayList y(ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f4fbedf9", new Object[]{ezoVar});
        }
        return ezoVar.m;
    }

    /* renamed from: A */
    public void h(dzo dzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca99551", new Object[]{this, dzoVar});
            return;
        }
        int size = dzoVar.b().size();
        for (int i = 0; i < size; i++) {
            kd7<md7> kd7Var = this.m.get(i);
            kd7Var.g(dzoVar.b().get(i));
            if (i == 0 && kd7Var.e != null && !dzoVar.e) {
                q84.f(this.f22590a, this.e);
                dzoVar.e = true;
            }
        }
    }

    /* renamed from: B */
    public View j(dzo dzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("df60b145", new Object[]{this, dzoVar});
        }
        this.i.addView(this.j, new LinearLayout.LayoutParams(-1, -2));
        int a2 = mr7.a(9.0f);
        this.i.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
        if (dzoVar.l != null) {
            this.i.setPadding(0, 0, 0, a2);
        } else {
            this.i.setPadding(a2, a2, 0, a2);
        }
        Iterator<md7> it = dzoVar.b().iterator();
        while (it.hasNext()) {
            z(it.next());
        }
        if (!TextUtils.isEmpty(dzoVar.k)) {
            TextView textView = new TextView(this.f22590a);
            textView.setText(dzoVar.k);
            textView.setGravity(17);
            textView.setTextColor(this.c.getColor(R.color.tt_detail_desc_container_style2_nomoretip_textcolor));
            textView.setTextSize(1, 16.0f);
            textView.setBackgroundColor(this.c.getColor(R.color.tt_detail_desc_container_style2_nomoretip_bg));
            LinearLayout linearLayout = this.k;
            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(linearLayout.getChildCount() - 1).getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            textView.setLayoutParams(layoutParams);
            this.k.addView(textView, new LinearLayout.LayoutParams((int) COUPONVIEW_DEFAULTWIDTH, -1));
        }
        return this.i;
    }

    /* renamed from: C */
    public boolean m(dzo dzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15ce5bd5", new Object[]{this, dzoVar})).booleanValue();
        }
        return dzoVar.b().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(md7 md7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fec82fa", new Object[]{this, md7Var});
            return;
        }
        kd7<? extends md7> a2 = ld7.a(this.f22590a, md7Var);
        if (a2 != null) {
            this.m.add(a2);
            View o = a2.o(md7Var);
            if (o != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                layoutParams.rightMargin = this.h;
                this.k.addView(o, layoutParams);
            }
        }
    }
}
