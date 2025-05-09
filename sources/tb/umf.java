package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class umf extends tv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CORNER_ADDRESS = "https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png";
    public static final a Companion = new a(null);
    public static final String TAG = "IrpScanLoadingWidget";
    public final d1a<xhv> l;
    public RelativeLayout m;
    public TUrlImageView n;
    public TUrlImageView o;
    public TUrlImageView p;
    public TUrlImageView q;
    public TUrlImageView r;
    public ValueAnimator s;
    public final boolean t = o0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297199);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d1a j0 = umf.j0(umf.this);
            if (j0 != null) {
                j0.invoke();
            }
        }
    }

    static {
        t2o.a(481297198);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, d1a<xhv> d1aVar) {
        super(activity, vzVar, irpDatasource, xfwVar);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.l = d1aVar;
        zb7.a(30.0f);
        zb7.a(30.0f);
    }

    public static /* synthetic */ Object ipc$super(umf umfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpScanLoadingWidget");
    }

    public static final /* synthetic */ d1a j0(umf umfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("28505285", new Object[]{umfVar});
        }
        return umfVar.l;
    }

    public static final /* synthetic */ TUrlImageView k0(umf umfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("178f178", new Object[]{umfVar});
        }
        return umfVar.n;
    }

    public static final /* synthetic */ void l0(umf umfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60c1573", new Object[]{umfVar});
        } else {
            umfVar.n0();
        }
    }

    public static final /* synthetic */ void m0(umf umfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa95361", new Object[]{umfVar});
        } else {
            umfVar.p0();
        }
    }

    @Override // tb.tv
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2af0e9", new Object[]{this});
            return;
        }
        s0();
        ViewGroup X = X();
        if (X != null) {
            X.setVisibility(8);
        }
    }

    @Override // tb.tv
    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        r0();
        ViewGroup X = X();
        if (X != null) {
            X.setVisibility(0);
        }
    }

    public final void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767aea6a", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.o;
        if (tUrlImageView != null) {
            tUrlImageView.getX();
            TUrlImageView tUrlImageView2 = this.o;
            if (tUrlImageView2 != null) {
                tUrlImageView2.getY();
                TUrlImageView tUrlImageView3 = this.p;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.getX();
                    TUrlImageView tUrlImageView4 = this.p;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.getY();
                        TUrlImageView tUrlImageView5 = this.q;
                        if (tUrlImageView5 != null) {
                            tUrlImageView5.getX();
                            TUrlImageView tUrlImageView6 = this.q;
                            if (tUrlImageView6 != null) {
                                tUrlImageView6.getY();
                                TUrlImageView tUrlImageView7 = this.r;
                                if (tUrlImageView7 != null) {
                                    tUrlImageView7.getX();
                                    TUrlImageView tUrlImageView8 = this.r;
                                    if (tUrlImageView8 != null) {
                                        tUrlImageView8.getY();
                                    } else {
                                        ckf.y("mRightBottomCorner");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("mRightBottomCorner");
                                    throw null;
                                }
                            } else {
                                ckf.y("mLeftBottomCorner");
                                throw null;
                            }
                        } else {
                            ckf.y("mLeftBottomCorner");
                            throw null;
                        }
                    } else {
                        ckf.y("mRightTopCorner");
                        throw null;
                    }
                } else {
                    ckf.y("mRightTopCorner");
                    throw null;
                }
            } else {
                ckf.y("mLeftTopCorner");
                throw null;
            }
        } else {
            ckf.y("mLeftTopCorner");
            throw null;
        }
    }

    public final boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c91e6", new Object[]{this})).booleanValue();
        }
        PhotoFrom B = W().B();
        if (B == PhotoFrom.Values.OUTER_ALBUM_LOCAL || B == PhotoFrom.Values.ALBUM || B == PhotoFrom.Values.ALBUM_SYS) {
            return true;
        }
        return false;
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b438664c", new Object[]{this});
            return;
        }
        agh.h(TAG, "startAnimation");
        RelativeLayout relativeLayout = this.m;
        if (relativeLayout != null) {
            relativeLayout.post(new xmf(this));
        } else {
            ckf.y("mLoadingContainer");
            throw null;
        }
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef48d6ac", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            RelativeLayout relativeLayout = this.m;
            if (relativeLayout != null) {
                relativeLayout.post(new ymf(valueAnimator, this));
            } else {
                ckf.y("mLoadingContainer");
                throw null;
            }
        }
        this.s = null;
    }

    /* renamed from: q0 */
    public RelativeLayout b0() {
        Integer b2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("f5824c57", new Object[]{this});
        }
        View inflate = LayoutInflater.from(E()).inflate(R.layout.feis_view_irp_scan_loading, V(), false);
        if (inflate != null) {
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            this.m = relativeLayout;
            View findViewById = relativeLayout.findViewById(R.id.cancel_btn);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(p1p.b(12.0f));
            gradientDrawable.setStroke(p1p.a(2.0f), Color.parseColor("#FFFFFF"));
            findViewById.setBackground(gradientDrawable);
            ViewProxy.setOnClickListener(findViewById, new b());
            RelativeLayout relativeLayout2 = this.m;
            if (relativeLayout2 != null) {
                View findViewById2 = relativeLayout2.findViewById(R.id.scan_line_view);
                ckf.f(findViewById2, "mLoadingContainer.findVi…ById(R.id.scan_line_view)");
                TUrlImageView tUrlImageView = (TUrlImageView) findViewById2;
                this.n = tUrlImageView;
                tUrlImageView.setImageUrl(lg4.F2());
                int intValue = (!(E() instanceof AppCompatActivity) || (b2 = ipj.INSTANCE.b((AppCompatActivity) E())) == null) ? 0 : b2.intValue();
                if (E() instanceof AppCompatActivity) {
                    i = ipj.INSTANCE.a((AppCompatActivity) E());
                }
                RelativeLayout relativeLayout3 = this.m;
                if (relativeLayout3 != null) {
                    View findViewById3 = relativeLayout3.findViewById(R.id.left_top_corner);
                    TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById3;
                    tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png");
                    if ((tUrlImageView2.getLayoutParams() instanceof RelativeLayout.LayoutParams) && intValue > 0 && i > 0) {
                        ViewGroup.LayoutParams layoutParams = tUrlImageView2.getLayoutParams();
                        if (layoutParams != null) {
                            ((RelativeLayout.LayoutParams) layoutParams).topMargin = intValue + i + zb7.a(13.0f);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    }
                    ckf.f(findViewById3, "mLoadingContainer.findVi…dip2px(13f)\n      }\n    }");
                    this.o = (TUrlImageView) findViewById3;
                    RelativeLayout relativeLayout4 = this.m;
                    if (relativeLayout4 != null) {
                        View findViewById4 = relativeLayout4.findViewById(R.id.right_top_corner);
                        TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById4;
                        tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png");
                        tUrlImageView3.setRotation(90.0f);
                        if ((tUrlImageView3.getLayoutParams() instanceof RelativeLayout.LayoutParams) && intValue > 0 && i > 0) {
                            ViewGroup.LayoutParams layoutParams2 = tUrlImageView3.getLayoutParams();
                            if (layoutParams2 != null) {
                                ((RelativeLayout.LayoutParams) layoutParams2).topMargin = intValue + i + zb7.a(13.0f);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            }
                        }
                        ckf.f(findViewById4, "mLoadingContainer.findVi…dip2px(13f)\n      }\n    }");
                        this.p = (TUrlImageView) findViewById4;
                        RelativeLayout relativeLayout5 = this.m;
                        if (relativeLayout5 != null) {
                            View findViewById5 = relativeLayout5.findViewById(R.id.left_bottom_corner);
                            TUrlImageView tUrlImageView4 = (TUrlImageView) findViewById5;
                            tUrlImageView4.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png");
                            tUrlImageView4.setRotation(270.0f);
                            ckf.f(findViewById5, "mLoadingContainer.findVi…s.rotation = 270f\n      }");
                            this.q = (TUrlImageView) findViewById5;
                            RelativeLayout relativeLayout6 = this.m;
                            if (relativeLayout6 != null) {
                                View findViewById6 = relativeLayout6.findViewById(R.id.right_bottom_corner);
                                TUrlImageView tUrlImageView5 = (TUrlImageView) findViewById6;
                                tUrlImageView5.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png");
                                tUrlImageView5.setRotation(180.0f);
                                ckf.f(findViewById6, "mLoadingContainer.findVi…s.rotation = 180f\n      }");
                                this.r = (TUrlImageView) findViewById6;
                                if (this.t) {
                                    TUrlImageView tUrlImageView6 = this.o;
                                    if (tUrlImageView6 != null) {
                                        tUrlImageView6.setAlpha(0.0f);
                                        TUrlImageView tUrlImageView7 = this.p;
                                        if (tUrlImageView7 != null) {
                                            tUrlImageView7.setAlpha(0.0f);
                                            TUrlImageView tUrlImageView8 = this.q;
                                            if (tUrlImageView8 != null) {
                                                tUrlImageView8.setAlpha(0.0f);
                                                TUrlImageView tUrlImageView9 = this.r;
                                                if (tUrlImageView9 != null) {
                                                    tUrlImageView9.setAlpha(0.0f);
                                                } else {
                                                    ckf.y("mRightBottomCorner");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("mLeftBottomCorner");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("mRightTopCorner");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("mLeftTopCorner");
                                        throw null;
                                    }
                                }
                                RelativeLayout relativeLayout7 = this.m;
                                if (relativeLayout7 != null) {
                                    relativeLayout7.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
                                    RelativeLayout relativeLayout8 = this.m;
                                    if (relativeLayout8 != null) {
                                        return relativeLayout8;
                                    }
                                    ckf.y("mLoadingContainer");
                                    throw null;
                                }
                                ckf.y("mLoadingContainer");
                                throw null;
                            }
                            ckf.y("mLoadingContainer");
                            throw null;
                        }
                        ckf.y("mLoadingContainer");
                        throw null;
                    }
                    ckf.y("mLoadingContainer");
                    throw null;
                }
                ckf.y("mLoadingContainer");
                throw null;
            }
            ckf.y("mLoadingContainer");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bd4e58", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.n;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
            TUrlImageView tUrlImageView2 = this.n;
            if (tUrlImageView2 != null) {
                float translationY = tUrlImageView2.getTranslationY() - zb7.a(10.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, zb7.a(427.0f) + translationY);
                ofFloat.addUpdateListener(new vmf(this));
                ofFloat.addListener(new wmf(this));
                ofFloat.setRepeatCount(10);
                ofFloat.setDuration(1500L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                this.s = ofFloat;
                return;
            }
            ckf.y("mScanLine");
            throw null;
        }
        ckf.y("mScanLine");
        throw null;
    }
}
