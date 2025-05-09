package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class mrh extends rz<FrameLayout, wtc> implements xtc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float n = 13.0f;
    public static final float o = 14.0f;
    public static final int p = Color.parseColor("#50607A");
    public static final int q = Color.parseColor("#999999");
    public FrameLayout d;
    public boolean e;
    public ProgressBar f;
    public TextView g;
    public TextView h;
    public View i;
    public View j;
    public View k;
    public View l;
    public boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792909);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792908);
        t2o.a(993001553);
    }

    public static final void b(mrh mrhVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e270150", new Object[]{mrhVar, view});
            return;
        }
        ckf.g(mrhVar, "this$0");
        if (mrhVar.m) {
            mrhVar.P().e();
        }
    }

    public static /* synthetic */ Object ipc$super(mrh mrhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/state/MSFootStateView");
    }

    @Override // tb.xtc
    public void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        String q2 = Localization.q(R.string.taobao_app_1005_1_16677);
        ckf.f(q2, "localizedString(...)");
        T(q2);
        this.m = true;
    }

    public final void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6c88de", new Object[]{this, str});
            return;
        }
        ProgressBar progressBar = this.f;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            View view = this.i;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.j;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.k;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        View view4 = this.l;
                        if (view4 != null) {
                            view4.setVisibility(8);
                            TextView textView = this.g;
                            if (textView != null) {
                                textView.setVisibility(0);
                                TextView textView2 = this.h;
                                if (textView2 != null) {
                                    textView2.setVisibility(0);
                                    TextView textView3 = this.g;
                                    if (textView3 != null) {
                                        textView3.setText("继续上滑逛逛 ");
                                        TextView textView4 = this.h;
                                        if (textView4 != null) {
                                            textView4.setText(str);
                                        } else {
                                            ckf.y(hpl.SECTION_NAME);
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("textView");
                                        throw null;
                                    }
                                } else {
                                    ckf.y(hpl.SECTION_NAME);
                                    throw null;
                                }
                            } else {
                                ckf.y("textView");
                                throw null;
                            }
                        } else {
                            ckf.y("noMoreDividerRight");
                            throw null;
                        }
                    } else {
                        ckf.y("noMoreDividerLeft");
                        throw null;
                    }
                } else {
                    ckf.y("dividerRight");
                    throw null;
                }
            } else {
                ckf.y("dividerLeft");
                throw null;
            }
        } else {
            ckf.y("progressBar");
            throw null;
        }
    }

    public final void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc434db", new Object[]{this, str});
            return;
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.j;
            if (view2 != null) {
                view2.setVisibility(8);
                TextView textView = this.h;
                if (textView != null) {
                    textView.setVisibility(8);
                    View view3 = this.k;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        View view4 = this.l;
                        if (view4 != null) {
                            view4.setVisibility(8);
                            ProgressBar progressBar = this.f;
                            if (progressBar != null) {
                                progressBar.setVisibility(8);
                                TextView textView2 = this.g;
                                if (textView2 != null) {
                                    textView2.setVisibility(0);
                                    TextView textView3 = this.g;
                                    if (textView3 != null) {
                                        textView3.setText(str);
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
                        } else {
                            ckf.y("noMoreDividerRight");
                            throw null;
                        }
                    } else {
                        ckf.y("noMoreDividerLeft");
                        throw null;
                    }
                } else {
                    ckf.y(hpl.SECTION_NAME);
                    throw null;
                }
            } else {
                ckf.y("dividerRight");
                throw null;
            }
        } else {
            ckf.y("dividerLeft");
            throw null;
        }
    }

    @Override // tb.xtc
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fa0d1a", new Object[]{this});
            return;
        }
        bsi a0 = P().a0();
        neq neqVar = a0 instanceof neq ? (neq) a0 : null;
        String h1 = neqVar != null ? neqVar.h1() : null;
        if (!TextUtils.isEmpty(h1)) {
            ckf.d(h1);
            S(h1);
        } else {
            String q2 = Localization.q(R.string.taobao_app_1005_1_16670);
            ckf.f(q2, "localizedString(...)");
            T(q2);
            View view = this.k;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.l;
                if (view2 != null) {
                    view2.setVisibility(0);
                } else {
                    ckf.y("noMoreDividerRight");
                    throw null;
                }
            } else {
                ckf.y("noMoreDividerLeft");
                throw null;
            }
        }
        this.m = false;
        MetaResult metaResult = (MetaResult) P().getDataSource().getTotalSearchResult();
        if (metaResult != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) metaResult;
            if (commonSearchResult.newSearch && P().getDataSource().getIndex() == 0) {
                FrameLayout frameLayout = this.d;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            } else if (commonSearchResult.guideSearch) {
                FrameLayout frameLayout2 = this.d;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            }
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
        ProgressBar progressBar = this.f;
        if (progressBar != null) {
            progressBar.setVisibility(i);
            TextView textView = this.g;
            if (textView != null) {
                textView.setVisibility(i);
                if (!z) {
                    TextView textView2 = this.h;
                    if (textView2 != null) {
                        textView2.setVisibility(i);
                    } else {
                        ckf.y(hpl.SECTION_NAME);
                        throw null;
                    }
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
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.k;
            if (view2 != null) {
                view2.setVisibility(8);
                View view3 = this.l;
                if (view3 != null) {
                    view3.setVisibility(8);
                    View view4 = this.j;
                    if (view4 != null) {
                        view4.setVisibility(8);
                        TextView textView = this.h;
                        if (textView != null) {
                            textView.setVisibility(8);
                            ProgressBar progressBar = this.f;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                                TextView textView2 = this.g;
                                if (textView2 != null) {
                                    textView2.setVisibility(4);
                                    this.m = false;
                                    return;
                                }
                                ckf.y("textView");
                                throw null;
                            }
                            ckf.y("progressBar");
                            throw null;
                        }
                        ckf.y(hpl.SECTION_NAME);
                        throw null;
                    }
                    ckf.y("dividerRight");
                    throw null;
                }
                ckf.y("noMoreDividerRight");
                throw null;
            }
            ckf.y("noMoreDividerLeft");
            throw null;
        }
        ckf.y("dividerLeft");
        throw null;
    }

    /* renamed from: R */
    public FrameLayout t(Context context, ViewGroup viewGroup) {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("59aa5e3a", new Object[]{this, context, viewGroup});
        }
        ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
        this.e = xyd.a((Activity) context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sf_tbsearch_ms_footer, viewGroup, false);
        ckf.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.d = frameLayout;
        this.f = (ProgressBar) frameLayout.findViewById(R.id.loading_progress_bar);
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 != null) {
            TextView textView = (TextView) frameLayout2.findViewById(R.id.tv_content);
            this.g = textView;
            if (textView != null) {
                if (this.e) {
                    i = p;
                } else {
                    i = q;
                }
                textView.setTextColor(i);
                TextView textView2 = this.g;
                if (textView2 != null) {
                    if (this.e) {
                        f = n;
                    } else {
                        f = o;
                    }
                    textView2.setTextSize(1, f);
                    FrameLayout frameLayout3 = this.d;
                    if (frameLayout3 != null) {
                        this.i = frameLayout3.findViewById(R.id.divider_left);
                        FrameLayout frameLayout4 = this.d;
                        if (frameLayout4 != null) {
                            this.k = frameLayout4.findViewById(R.id.no_more_divider_left);
                            FrameLayout frameLayout5 = this.d;
                            if (frameLayout5 != null) {
                                this.l = frameLayout5.findViewById(R.id.no_more_divider_right);
                                FrameLayout frameLayout6 = this.d;
                                if (frameLayout6 != null) {
                                    this.j = frameLayout6.findViewById(R.id.divider_right);
                                    FrameLayout frameLayout7 = this.d;
                                    if (frameLayout7 != null) {
                                        this.h = (TextView) frameLayout7.findViewById(R.id.tv_section_name);
                                        boolean z = context instanceof oxb;
                                        oxb oxbVar = z ? (oxb) context : null;
                                        if (oxbVar != null && oxbVar.E1()) {
                                            TextView textView3 = this.g;
                                            if (textView3 != null) {
                                                textView3.setTextColor(-1);
                                            } else {
                                                ckf.y("textView");
                                                throw null;
                                            }
                                        }
                                        FrameLayout frameLayout8 = this.d;
                                        if (frameLayout8 != null) {
                                            frameLayout8.setOnClickListener(new View.OnClickListener() { // from class: tb.ddz
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    mrh.b(mrh.this, view);
                                                }
                                            });
                                            MetaResult metaResult = (MetaResult) P().getDataSource().getTotalSearchResult();
                                            if (metaResult != null && ((CommonSearchResult) metaResult).newSearch) {
                                                oxb oxbVar2 = z ? (oxb) context : null;
                                                if (oxbVar2 == null || !oxbVar2.E1()) {
                                                    FrameLayout frameLayout9 = this.d;
                                                    if (frameLayout9 != null) {
                                                        frameLayout9.setBackgroundColor(-1);
                                                    } else {
                                                        ckf.y("rootView");
                                                        throw null;
                                                    }
                                                } else {
                                                    FrameLayout frameLayout10 = this.d;
                                                    if (frameLayout10 != null) {
                                                        frameLayout10.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
                                                    } else {
                                                        ckf.y("rootView");
                                                        throw null;
                                                    }
                                                }
                                            }
                                            FrameLayout frameLayout11 = this.d;
                                            if (frameLayout11 != null) {
                                                return frameLayout11;
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
                                ckf.y("rootView");
                                throw null;
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
                ckf.y("textView");
                throw null;
            }
            ckf.y("textView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
