package com.taobao.tao.combo;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a4w;
import tb.drp;
import tb.frp;
import tb.jbx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends a4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int h;
    public static final int i;
    public static final int j = frp.b() - (frp.a(84.0f) * 2);
    public final Context b;
    public ArrayList<String> c;
    public ArrayList<View> d;
    public c e;
    public boolean f = true;
    public boolean g = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.combo.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class View$OnClickListenerC0674a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0674a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.s(a.this) != null) {
                view.setTag(Boolean.TRUE);
                if (!b.f11943a) {
                    jbx.b(view.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), a.t());
                    b.f11943a = true;
                } else {
                    jbx.b(view.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), a.u());
                    b.f11943a = false;
                }
                a.v(a.this, false);
                a.s(a.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f11943a = false;

        static {
            t2o.a(764412042);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a();
    }

    static {
        t2o.a(764412040);
        int a2 = frp.a(72.0f);
        h = a2;
        i = a2 - frp.a(48.0f);
    }

    public a(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.o((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ComboVerticalPagerAdater");
    }

    public static /* synthetic */ c s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("118ada0b", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return h;
    }

    public static /* synthetic */ int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return i;
    }

    public static /* synthetic */ boolean v(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b8d356", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.g = z;
        return z;
    }

    @Override // tb.a4w
    public void b(ViewGroup viewGroup, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i2), obj});
        } else {
            viewGroup.removeView(this.d.get(i2));
        }
    }

    @Override // tb.a4w
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a80a62f", new Object[]{this, view});
        }
    }

    @Override // tb.a4w
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        ArrayList<String> arrayList = this.c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // tb.a4w
    public int f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    @Override // tb.a4w
    public Object h(ViewGroup viewGroup, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i2)});
        }
        viewGroup.addView(this.d.get(i2));
        return this.d.get(i2);
    }

    @Override // tb.a4w
    public boolean i(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        if (view == obj) {
            return true;
        }
        return false;
    }

    @Override // tb.a4w
    public void l(Parcelable parcelable, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ccff61", new Object[]{this, parcelable, classLoader});
        }
    }

    @Override // tb.a4w
    public Parcelable m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("b5f2b05e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.a4w
    public void o(ViewGroup viewGroup, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i2), obj});
        } else {
            super.o(viewGroup, i2, obj);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8eb8285", new Object[]{this});
        } else if (this.c != null) {
            this.d = new ArrayList<>();
            int size = this.c.size();
            LayoutInflater from = LayoutInflater.from(this.b);
            for (int i2 = 0; i2 < size; i2++) {
                this.d.add(from.inflate(R.layout.shop_combo_vertical_view_pager_item, (ViewGroup) null));
            }
        }
    }

    public void x(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5a5901", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public void y(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9909d7", new Object[]{this, arrayList});
            return;
        }
        this.f = true;
        this.c = arrayList;
        w();
        j();
    }

    @Override // tb.a4w
    public void p(View view) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481d94c0", new Object[]{this, view});
        } else if (this.f) {
            this.f = false;
            Iterator<String> it = this.c.iterator();
            while (it.hasNext()) {
                i2++;
                LinearLayout linearLayout = (LinearLayout) this.d.get(i2);
                TUrlImageView tUrlImageView = (TUrlImageView) linearLayout.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview);
                tUrlImageView.setStrategyConfig(ImageStrategyConfig.v("shop", 90).a());
                int i3 = j;
                tUrlImageView.setImageUrl(drp.a(it.next(), i3));
                tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(tUrlImageView.getLayoutParams().width, i3));
                linearLayout.setTag(Boolean.FALSE);
                linearLayout.setOnClickListener(new View$OnClickListenerC0674a());
            }
        } else if (!this.g) {
            this.g = true;
            z();
        }
    }

    public void z() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d08937", new Object[]{this});
            return;
        }
        int size = this.c.size();
        if (b.f11943a) {
            while (i2 < size) {
                LinearLayout linearLayout = (LinearLayout) this.d.get(i2);
                if (linearLayout != null && (linearLayout.getTag() instanceof Boolean) && !((Boolean) linearLayout.getTag()).booleanValue()) {
                    jbx.b((TUrlImageView) linearLayout.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), h);
                } else if (linearLayout != null) {
                    linearLayout.setTag(Boolean.FALSE);
                }
                i2++;
            }
            return;
        }
        while (i2 < size) {
            StringBuilder sb = new StringBuilder("setMargin  UNCLICKEDsize---");
            sb.append(size);
            sb.append("i------");
            sb.append(i2);
            LinearLayout linearLayout2 = (LinearLayout) this.d.get(i2);
            if (linearLayout2 != null && (linearLayout2.getTag() instanceof Boolean) && !((Boolean) linearLayout2.getTag()).booleanValue()) {
                jbx.b((TUrlImageView) linearLayout2.findViewById(R.id.shop_combo_vertical_viewpager_item_turlImgview), i);
            } else if (linearLayout2 != null) {
                linearLayout2.setTag(Boolean.FALSE);
            }
            i2++;
        }
    }
}
