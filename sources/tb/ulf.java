package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.view.ContentOffsetView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedList;
import java.util.List;
import tb.ylf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ulf extends ylf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ContentOffsetView n;
    public TUrlImageView o;
    public TUrlImageView p;
    public TextView q;
    public final int r = p1p.a(47.0f);
    public boolean s = t0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ylf.a m0 = ulf.this.m0();
            if (m0 != null) {
                m0.m();
            }
            jzu.g("Page_PhotoSearchResult", "clickBackBtn", "pssource", ulf.this.W().y());
        }
    }

    static {
        t2o.a(481297246);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(ulf ulfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/Irp2024TextTitleBarWidget");
    }

    @Override // tb.ylf
    public void A0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a432185f", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ylf
    public void B0(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c156873f", new Object[]{this, rectF, new Boolean(z)});
        }
    }

    @Override // tb.ylf
    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3498b50c", new Object[]{this});
        }
    }

    @Override // tb.ylf
    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a670c62", new Object[]{this});
        }
    }

    @Override // tb.ylf
    public void E0(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcbf3f4", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            F0();
        }
    }

    public final void F0() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e03a82", new Object[]{this});
            return;
        }
        boolean t0 = t0();
        if (this.s != t0) {
            this.s = t0;
            TUrlImageView tUrlImageView = this.p;
            if (tUrlImageView != null) {
                if (t0) {
                    str = "https://gw.alicdn.com/imgextra/i1/O1CN01G0d6mE1rQlEVY7dMZ_!!6000000005626-2-tps-500-500.png";
                } else {
                    str = "https://gw.alicdn.com/imgextra/i2/O1CN01MuKMFl1fWSm53sqkF_!!6000000004014-2-tps-500-500.png";
                }
                tUrlImageView.setImageUrl(str);
                TUrlImageView tUrlImageView2 = this.o;
                if (tUrlImageView2 != null) {
                    if (this.s) {
                        str2 = "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png";
                    } else {
                        str2 = "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp";
                    }
                    tUrlImageView2.setImageUrl(str2);
                    TextView textView = this.q;
                    if (textView != null) {
                        if (this.s) {
                            str3 = "#AAAAAA";
                        } else {
                            str3 = "#11192D";
                        }
                        textView.setTextColor(Color.parseColor(str3));
                        return;
                    }
                    ckf.y("contentTv");
                    throw null;
                }
                ckf.y("closeBtn");
                throw null;
            }
            ckf.y("scanHintIv");
            throw null;
        }
    }

    @Override // tb.ylf
    public void h0(List<mh7> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ec9921", new Object[]{this, list});
        }
    }

    @Override // tb.ylf
    public void i0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c52d4d5", new Object[]{this, rectF});
        }
    }

    @Override // tb.ylf
    public int j0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93b23a73", new Object[]{this, rectF})).intValue();
        }
        return -1;
    }

    @Override // tb.ylf
    public Bitmap k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bd9231c7", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ylf
    public int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.r;
    }

    @Override // tb.ylf
    public int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9332553", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // tb.ylf
    public LinkedList<p9j> o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("8847d4ab", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ylf
    public int p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb2bb8", new Object[]{this})).intValue();
        }
        ContentOffsetView contentOffsetView = this.n;
        if (contentOffsetView != null) {
            return (int) contentOffsetView.getTranslationY();
        }
        ckf.y("mRootView");
        throw null;
    }

    @Override // tb.ylf
    public void q0(List<mh7> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e751c1a", new Object[]{this, list, new Integer(i)});
        }
    }

    @Override // tb.ylf
    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a70437", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ylf
    public boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5242a8f4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ylf
    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d413c", new Object[]{this});
        }
    }

    @Override // tb.ylf
    public void x0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede5fbdf", new Object[]{this, bitmap});
        }
    }

    @Override // tb.ylf
    public void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
        }
    }

    @Override // tb.ylf
    public void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b729aa24", new Object[]{this, str});
        }
    }

    /* renamed from: G0 */
    public ContentOffsetView b0() {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("9599a722", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_irp_titlebar_text_2024, V(), false);
        if (inflate != null) {
            ContentOffsetView contentOffsetView = (ContentOffsetView) inflate;
            this.n = contentOffsetView;
            View findViewById = contentOffsetView.findViewById(R.id.tiv_scan_hint);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
            if (this.s) {
                str = "https://gw.alicdn.com/imgextra/i1/O1CN01G0d6mE1rQlEVY7dMZ_!!6000000005626-2-tps-500-500.png";
            } else {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN0191LCEX1IGg0DorX6h_!!6000000000866-49-tps-160-160.webp";
            }
            tUrlImageView.setImageUrl(str);
            ckf.f(findViewById, "mRootView.findViewById<T…9-tps-160-160.webp\"\n    }");
            this.p = (TUrlImageView) findViewById;
            ContentOffsetView contentOffsetView2 = this.n;
            if (contentOffsetView2 != null) {
                View findViewById2 = contentOffsetView2.findViewById(R.id.btn_back);
                TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById2;
                tUrlImageView2.setContentDescription(Localization.q(R.string.taobao_app_1007_close) + (char) 65292 + Localization.q(R.string.taobao_app_1007_button));
                tUrlImageView2.setOnClickListener(new a());
                if (this.s) {
                    str2 = "https://gw.alicdn.com/imgextra/i2/O1CN01hCUxb026keiU0D2n8_!!6000000007700-49-tps-160-160.webp";
                } else {
                    str2 = "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp";
                }
                tUrlImageView2.setImageUrl(str2);
                ckf.f(findViewById2, "mRootView.findViewById<T…9-tps-500-500.webp\"\n    }");
                this.o = (TUrlImageView) findViewById2;
                ContentOffsetView contentOffsetView3 = this.n;
                if (contentOffsetView3 != null) {
                    View findViewById3 = contentOffsetView3.findViewById(R.id.tv_content);
                    TextView textView = (TextView) findViewById3;
                    if (W().c0()) {
                        str3 = Localization.q(R.string.taobao_app_1007_1_18958);
                    } else {
                        str3 = Localization.q(R.string.taobao_app_1007_1_19009);
                    }
                    textView.setText(str3);
                    if (this.s) {
                        str4 = "#AAAAAA";
                    } else {
                        str4 = "#50607A";
                    }
                    textView.setTextColor(Color.parseColor(str4));
                    textView.setTextSize(1, W().Y() ? 19.0f : 16.0f);
                    ckf.f(findViewById3, "mRootView.findViewById<T…de()) 19f else 16f)\n    }");
                    this.q = (TextView) findViewById3;
                    ContentOffsetView contentOffsetView4 = this.n;
                    if (contentOffsetView4 != null) {
                        return contentOffsetView4;
                    }
                    ckf.y("mRootView");
                    throw null;
                }
                ckf.y("mRootView");
                throw null;
            }
            ckf.y("mRootView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.view.ContentOffsetView");
    }
}
