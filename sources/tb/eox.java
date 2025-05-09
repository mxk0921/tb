package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class eox extends rz<FrameLayout, wtc> implements xtc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout d;
    public View e;
    public TextView f;
    public boolean g;

    static {
        t2o.a(815792309);
        t2o.a(993001553);
    }

    public static final void b(eox eoxVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebba876e", new Object[]{eoxVar, view});
            return;
        }
        ckf.g(eoxVar, "this$0");
        if (eoxVar.g) {
            eoxVar.P().e();
        }
    }

    public static /* synthetic */ Object ipc$super(eox eoxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/XslFooterView");
    }

    @Override // tb.xtc
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fa0d1a", new Object[]{this});
            return;
        }
        String q = Localization.q(R.string.taobao_app_1005_1_16670);
        ckf.f(q, "localizedString(...)");
        S(q);
        this.g = false;
    }

    @Override // tb.xtc
    public void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        String q = Localization.q(R.string.taobao_app_1005_1_16677);
        ckf.f(q, "localizedString(...)");
        S(q);
        this.g = true;
    }

    /* renamed from: R */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.sf_tbsearch_ms_footer, viewGroup, false);
        ckf.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.d = frameLayout;
        this.e = frameLayout.findViewById(R.id.loading_progress_bar);
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 != null) {
            this.f = (TextView) frameLayout2.findViewById(R.id.tv_content);
            FrameLayout frameLayout3 = this.d;
            if (frameLayout3 != null) {
                frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: tb.wtz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        eox.b(eox.this, view);
                    }
                });
                FrameLayout frameLayout4 = this.d;
                if (frameLayout4 != null) {
                    return frameLayout4;
                }
                ckf.y("rootView");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }

    public final void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc434db", new Object[]{this, str});
            return;
        }
        View view = this.e;
        if (view != null) {
            view.setVisibility(8);
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.f;
                if (textView2 != null) {
                    textView2.setText(str);
                } else {
                    ckf.y("textView");
                    throw null;
                }
            } else {
                ckf.y("textView");
                throw null;
            }
        } else {
            ckf.y("progressBar");
            throw null;
        }
    }

    @Override // tb.xtc
    public void setVisible(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            } else {
                ckf.y("rootView");
                throw null;
            }
        } else {
            i = 4;
        }
        View view = this.e;
        if (view != null) {
            view.setVisibility(i);
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(i);
            } else {
                ckf.y("textView");
                throw null;
            }
        } else {
            ckf.y("progressBar");
            throw null;
        }
    }

    @Override // tb.xtc
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(4);
                this.g = false;
                return;
            }
            ckf.y("textView");
            throw null;
        }
        ckf.y("progressBar");
        throw null;
    }
}
