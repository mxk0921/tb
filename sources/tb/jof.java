package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kof;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jof extends kd7<kof> implements ztb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RelativeLayout h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final LinearLayout m;
    public String n;
    public String o;
    public final ImageView p;
    public final int q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements kof.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(jof jofVar) {
        }
    }

    static {
        t2o.a(912262374);
        t2o.a(452985010);
    }

    public jof(Context context) {
        super(context);
        int a2 = mr7.a(9.0f);
        int a3 = mr7.a(12.0f);
        this.q = 0;
        this.q = (int) Math.ceil(((mr7.f(this.f22590a) - (a3 * 2)) - a2) / 2);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_iteminfo_video, (ViewGroup) null);
        this.h = relativeLayout;
        this.i = (ImageView) relativeLayout.findViewById(R.id.normalPic);
        this.k = (TextView) relativeLayout.findViewById(R.id.tvPrice);
        this.j = (TextView) relativeLayout.findViewById(R.id.tvItemTitle);
        this.l = (TextView) relativeLayout.findViewById(R.id.tvSaleCount);
        this.m = (LinearLayout) relativeLayout.findViewById(R.id.tagContainer);
        this.p = (ImageView) relativeLayout.findViewById(R.id.video_state);
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.videoContainer);
    }

    public static /* synthetic */ Object ipc$super(jof jofVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/ItemInfoViewHolder");
    }

    /* renamed from: A */
    public View j(kof kofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5a46b47d", new Object[]{this, kofVar});
        }
        return this.h;
    }

    public final boolean B(kof kofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("819b2f2f", new Object[]{this, kofVar})).booleanValue();
        }
        if (!e() || TextUtils.isEmpty(kofVar.v)) {
            return false;
        }
        kofVar.m(new a(this));
        return true;
    }

    /* renamed from: D */
    public boolean m(kof kofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53b620b1", new Object[]{this, kofVar})).booleanValue();
        }
        if (kofVar.k == null || kofVar.l == null || kofVar.m == null) {
            return true;
        }
        return false;
    }

    public final void E(kof kofVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d561c8", new Object[]{this, kofVar});
            return;
        }
        int f = mr7.f(this.f22590a);
        ImageView imageView = this.i;
        if (!TextUtils.isEmpty(kofVar.q)) {
            try {
                float parseFloat = Float.parseFloat(kofVar.q);
                i = ((int) (f * parseFloat)) - ((int) (((1.0f / parseFloat) - 1.0f) * mr7.a(3.0f)));
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            i = this.q;
        }
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(i, i);
        }
        layoutParams2.width = i;
        layoutParams2.height = i;
        imageView.setLayoutParams(layoutParams2);
        int ceil = (int) Math.ceil((i * 40) / 369);
        ViewGroup.LayoutParams layoutParams3 = this.p.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, ceil);
        }
        layoutParams3.width = -2;
        layoutParams3.height = ceil;
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.topMargin = i - ((int) Math.ceil((ceil * 3) / 4));
            marginLayoutParams.leftMargin = mr7.a(12.0f);
        }
        this.p.setLayoutParams(layoutParams3);
        G(this.p, kofVar);
        ViewGroup.LayoutParams layoutParams4 = this.j.getLayoutParams();
        if (layoutParams4 == null) {
            layoutParams4 = new ViewGroup.LayoutParams(i, -2);
        }
        layoutParams4.width = i;
        this.j.setLayoutParams(layoutParams4);
        this.h.setLayoutParams(layoutParams);
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53875fa1", new Object[]{this});
            return;
        }
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.i.setVisibility(4);
        }
    }

    public final void G(ImageView imageView, kof kofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997d288d", new Object[]{this, imageView, kofVar});
            return;
        }
        String str = kofVar.r;
        if (TextUtils.isEmpty(str)) {
            imageView.setVisibility(8);
            return;
        }
        mpe.m(imageView, str);
        imageView.setVisibility(0);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ef8a90c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ztb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ztb
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ztb
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ztb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ztb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ztb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ztb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            F();
        }
    }

    @Override // tb.kd7
    public void s(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.kd7
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void w(ArrayList<kof.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f1626a", new Object[]{this, arrayList});
            return;
        }
        this.m.removeAllViews();
        if (arrayList != null && arrayList.size() > 0) {
            View x = x(arrayList.get(0));
            if (x != null) {
                this.m.addView(x);
            }
        } else if (!TextUtils.isEmpty(this.n)) {
            String[] split = this.n.split(",");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            for (String str : split) {
                kof.a z = z(str);
                if (z != null) {
                    arrayList.add(z);
                }
            }
            View x2 = x(arrayList.get(0));
            if (x2 != null) {
                this.m.addView(x2);
            }
        }
        if (this.m.getChildCount() > 0) {
            this.j.setMaxLines(1);
            this.m.setVisibility(0);
            return;
        }
        this.j.setLines(2);
        this.j.setMaxLines(2);
        this.m.setVisibility(8);
    }

    public View x(kof.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6dc3a03c", new Object[]{this, aVar});
        }
        if (aVar == null || TextUtils.isEmpty(aVar.f22799a)) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, mr7.a(12.0f));
        layoutParams.rightMargin = mr7.a(3.0f);
        ImageView imageView = new ImageView(this.f22590a);
        imageView.setLayoutParams(layoutParams);
        mpe.m(imageView, aVar.f22799a);
        return imageView;
    }

    public final kof.a z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kof.a) ipChange.ipc$dispatch("ff679b45", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new kof.a(str, 0, 0);
    }

    /* renamed from: y */
    public void h(kof kofVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e0972d", new Object[]{this, kofVar});
            return;
        }
        String str = kofVar.k;
        String str2 = kofVar.l;
        String str3 = kofVar.m;
        String str4 = kofVar.n;
        String str5 = kofVar.o;
        this.o = kofVar.p;
        this.n = kofVar.t;
        if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(this.o)) {
            this.h.setClickable(true);
        } else {
            this.h.setClickable(false);
        }
        try {
            z = B(kofVar);
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            str = kofVar.u;
        }
        this.i.setVisibility(0);
        ImageView imageView = this.i;
        mpe.m(imageView, str);
        int i = -1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, mr7.a(10.0f), 0, 0);
        layoutParams.addRule(3, imageView.getId());
        this.j.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(7, imageView.getId());
        layoutParams2.addRule(5, imageView.getId());
        layoutParams2.addRule(3, this.j.getId());
        this.m.setLayoutParams(layoutParams2);
        if (!TextUtils.isEmpty(str2)) {
            String str6 = "¥ " + str2;
            i = str6.indexOf(".");
            if (i > 0) {
                String substring = str6.substring(1 + i);
                try {
                    if (TextUtils.isEmpty(substring) || Integer.parseInt(substring) > 0) {
                        i = i;
                    } else {
                        str6 = str6.substring(0, i);
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            SpannableString spannableString = new SpannableString(str6);
            spannableString.setSpan(new AbsoluteSizeSpan(mr7.a(12.0f)), 0, 2, 33);
            if (i > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(mr7.a(18.0f)), 2, i, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(mr7.a(12.0f)), i, str6.length(), 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(mr7.a(18.0f)), 2, str6.length(), 33);
            }
            this.k.setText(spannableString);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.j.setText(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.l.setText(str4);
        }
        w(kofVar.s);
        E(kofVar);
    }
}
