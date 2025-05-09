package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.hme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t5w extends kd7<s5w> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout h;
    public final ArrayList<kd7<md7>> i = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends kd7<l8w> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ITEM_LETF_VIEW = 0;
        public static final int ITEM_RIGHT1_VIEW = 1;
        public static final int ITEM_RIGHT2_VIEW = 2;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final View m;
        public DetailImageView n;
        public TextView o;

        static {
            t2o.a(912262411);
        }

        public a(Context context, int i, View view) {
            super(context);
            int a2 = mr7.a(2.0f);
            this.h = a2;
            int ceil = (int) Math.ceil(((mr7.f(this.f22590a) / 3) * 2) - a2);
            this.i = ceil;
            int ceil2 = (int) Math.ceil((mr7.f(this.f22590a) - ceil) - a2);
            this.j = ceil2;
            this.k = (int) Math.ceil((ceil2 * 2) + a2);
            this.l = ceil2;
            if (i == 0) {
                this.m = w(view);
            } else if (i == 1) {
                this.m = x(view);
            } else if (i == 2) {
                this.m = y(view);
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/VideoContainerViewHolder$VideoItemViewHolder");
        }

        /* renamed from: A */
        public View j(l8w l8wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("7d5bbf2c", new Object[]{this, l8wVar});
            }
            return this.m;
        }

        /* renamed from: e */
        public boolean m(l8w l8wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f72e90fc", new Object[]{this, l8wVar})).booleanValue();
            }
            return false;
        }

        public final View w(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("bfa6ed05", new Object[]{this, view});
            }
            View findViewById = view.findViewById(R.id.dec_video_left_layout);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.i;
            layoutParams.height = this.k;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.h;
            }
            findViewById.setLayoutParams(layoutParams);
            this.n = (DetailImageView) view.findViewById(R.id.des_first_video_c);
            return findViewById;
        }

        public final View x(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("b8333137", new Object[]{this, view});
            }
            View findViewById = view.findViewById(R.id.video_right1_layout);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.j;
            layoutParams.height = this.l;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.h;
            }
            findViewById.setLayoutParams(layoutParams);
            this.n = (DetailImageView) view.findViewById(R.id.des_second_video_c);
            return findViewById;
        }

        public final View y(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("71aabed6", new Object[]{this, view});
            }
            View findViewById = view.findViewById(R.id.video_right2_layout);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.j;
            layoutParams.height = this.l;
            findViewById.setLayoutParams(layoutParams);
            this.n = (DetailImageView) view.findViewById(R.id.des_third_video_c);
            this.o = (TextView) view.findViewById(R.id.des_video_count);
            return findViewById;
        }

        /* renamed from: z */
        public void h(l8w l8wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("268a2a78", new Object[]{this, l8wVar});
                return;
            }
            hme.a aVar = new hme.a();
            int i = R.drawable.tt_detail_img_load_fail;
            hme m = aVar.p(i).q(i).t(this.n.getScaleType()).s(this.n.getScaleType()).m();
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            n(this.n, l8wVar.k, new koe(layoutParams.width, layoutParams.height), null, m);
            TextView textView = this.o;
            if (textView != null) {
                textView.setText(l8wVar.l);
            }
        }
    }

    static {
        t2o.a(912262410);
    }

    public t5w(Context context) {
        super(context);
        int a2 = mr7.a(2.0f);
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        this.h = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, a2);
    }

    public static /* synthetic */ Object ipc$super(t5w t5wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/VideoContainerViewHolder");
    }

    /* renamed from: e */
    public boolean m(s5w s5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4347051", new Object[]{this, s5wVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.kd7
    public void s(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        Iterator<kd7<md7>> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().s(z, z2);
        }
    }

    @Override // tb.kd7
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Iterator<kd7<md7>> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().t();
        }
    }

    public final View w(s5w s5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6de4ca9", new Object[]{this, s5wVar});
        }
        View inflate = LayoutInflater.from(this.f22590a).inflate(R.layout.tt_detail_video_collection, (ViewGroup) null);
        if (s5wVar == null) {
            return inflate;
        }
        if (s5wVar.b().size() < 3) {
            return inflate;
        }
        for (int i = 0; i < 3; i++) {
            a aVar = new a(this.f22590a, i, inflate);
            aVar.o(s5wVar.b().get(i));
            this.i.add(aVar);
        }
        return inflate;
    }

    /* renamed from: x */
    public void h(s5w s5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349b46cd", new Object[]{this, s5wVar});
            return;
        }
        int size = s5wVar.b().size();
        for (int i = 0; i < size; i++) {
            kd7<md7> kd7Var = this.i.get(i);
            if (i <= size - 1) {
                kd7Var.g(s5wVar.b().get(i));
            }
        }
    }

    /* renamed from: y */
    public View j(s5w s5wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f024609d", new Object[]{this, s5wVar});
        }
        if (!s5wVar.b().isEmpty()) {
            this.h.addView(w(s5wVar), new LinearLayout.LayoutParams(-1, -2));
        }
        return this.h;
    }
}
