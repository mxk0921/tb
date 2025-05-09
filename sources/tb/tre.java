package tb;

import android.animation.Animator;
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
import com.etao.feimagesearch.immerse.IrpManager;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.struct.ViewWidget;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class tre extends ViewWidget<View, IrpManager, tre> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CORNER_ADDRESS = "https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png";
    public static final a Companion = new a(null);
    public static final String TAG = "ImmerseLoadingWidget";
    public RelativeLayout l;
    public TUrlImageView m;
    public TUrlImageView n;
    public TUrlImageView o;
    public TUrlImageView p;
    public TUrlImageView q;
    public ValueAnimator r;
    public final boolean s = m0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296959);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                Float f = (Float) animatedValue;
                float floatValue = f.floatValue();
                agh.h(tre.TAG, ckf.p("onAnimationUpdate: ", f));
                TUrlImageView h0 = tre.h0(tre.this);
                if (h0 != null) {
                    h0.setTranslationY(floatValue);
                } else {
                    ckf.y("mScanLine");
                    throw null;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TUrlImageView h0 = tre.h0(tre.this);
            if (h0 != null) {
                h0.setVisibility(8);
            } else {
                ckf.y("mScanLine");
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TUrlImageView h0 = tre.h0(tre.this);
            if (h0 != null) {
                h0.setVisibility(8);
            } else {
                ckf.y("mScanLine");
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            tre.k0(tre.this);
            tre.this.E().finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/ImmerseLoadingWidget$startScanAnimation$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            tre.i0(tre.this);
            tre.j0(tre.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ValueAnimator c;
        public final /* synthetic */ tre d;

        public f(ValueAnimator valueAnimator, tre treVar) {
            this.c = valueAnimator;
            this.d = treVar;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/ImmerseLoadingWidget$stopScanAnimation$1$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            this.c.cancel();
            this.c.removeAllListeners();
            this.c.removeAllUpdateListeners();
            TUrlImageView h0 = tre.h0(this.d);
            if (h0 != null) {
                h0.setVisibility(8);
            } else {
                ckf.y("mScanLine");
                throw null;
            }
        }
    }

    static {
        t2o.a(481296958);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tre(Activity activity, vz vzVar, IrpManager irpManager, xfw xfwVar) {
        super(activity, vzVar, irpManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpManager, ThemisConfig.SCENE_MANAGER);
        ckf.g(xfwVar, "setter");
        p1p.a(30.0f);
        p1p.a(30.0f);
    }

    public static final /* synthetic */ TUrlImageView h0(tre treVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("646d2784", new Object[]{treVar});
        }
        return treVar.m;
    }

    public static final /* synthetic */ void i0(tre treVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e7d729", new Object[]{treVar});
        } else {
            treVar.l0();
        }
    }

    public static /* synthetic */ Object ipc$super(tre treVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1250151579) {
            super.G();
            return null;
        } else if (hashCode == 1585798659) {
            super.q((String) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/immerse/ImmerseLoadingWidget");
        }
    }

    public static final /* synthetic */ void j0(tre treVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1086957b", new Object[]{treVar});
        } else {
            treVar.n0();
        }
    }

    public static final /* synthetic */ void k0(tre treVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a8e027", new Object[]{treVar});
        } else {
            treVar.q0();
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        W().c().c(gnf.EVENT_LOADING_STATE_OPERATE, this);
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767aea6a", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.n;
        if (tUrlImageView != null) {
            tUrlImageView.getX();
            TUrlImageView tUrlImageView2 = this.n;
            if (tUrlImageView2 != null) {
                tUrlImageView2.getY();
                TUrlImageView tUrlImageView3 = this.o;
                if (tUrlImageView3 != null) {
                    tUrlImageView3.getX();
                    TUrlImageView tUrlImageView4 = this.o;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.getY();
                        TUrlImageView tUrlImageView5 = this.p;
                        if (tUrlImageView5 != null) {
                            tUrlImageView5.getX();
                            TUrlImageView tUrlImageView6 = this.p;
                            if (tUrlImageView6 != null) {
                                tUrlImageView6.getY();
                                TUrlImageView tUrlImageView7 = this.q;
                                if (tUrlImageView7 != null) {
                                    tUrlImageView7.getX();
                                    TUrlImageView tUrlImageView8 = this.q;
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

    public final boolean m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c91e6", new Object[]{this})).booleanValue();
        }
        PhotoFrom B = W().b().B();
        if (B == PhotoFrom.Values.OUTER_ALBUM_LOCAL || B == PhotoFrom.Values.ALBUM || B == PhotoFrom.Values.ALBUM_SYS) {
            return true;
        }
        return false;
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b438664c", new Object[]{this});
            return;
        }
        agh.h(TAG, "startAnimation");
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.post(new e());
        } else {
            ckf.y("mLoadingContainer");
            throw null;
        }
    }

    public final void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef48d6ac", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            RelativeLayout relativeLayout = this.l;
            if (relativeLayout != null) {
                relativeLayout.post(new f(valueAnimator, this));
            } else {
                ckf.y("mLoadingContainer");
                throw null;
            }
        }
        this.r = null;
    }

    /* renamed from: o0 */
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
            this.l = relativeLayout;
            View findViewById = relativeLayout.findViewById(R.id.cancel_btn);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(p1p.b(12.0f));
            gradientDrawable.setStroke(p1p.a(2.0f), Color.parseColor("#FFFFFF"));
            findViewById.setBackground(gradientDrawable);
            ViewProxy.setOnClickListener(findViewById, new d());
            RelativeLayout relativeLayout2 = this.l;
            if (relativeLayout2 != null) {
                View findViewById2 = relativeLayout2.findViewById(R.id.scan_line_view);
                ckf.f(findViewById2, "mLoadingContainer.findVi…ById(R.id.scan_line_view)");
                TUrlImageView tUrlImageView = (TUrlImageView) findViewById2;
                this.m = tUrlImageView;
                tUrlImageView.setImageUrl(lg4.F2());
                int intValue = (!(E() instanceof AppCompatActivity) || (b2 = ipj.INSTANCE.b((AppCompatActivity) E())) == null) ? 0 : b2.intValue();
                if (E() instanceof AppCompatActivity) {
                    i = ipj.INSTANCE.a((AppCompatActivity) E());
                }
                RelativeLayout relativeLayout3 = this.l;
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
                    this.n = (TUrlImageView) findViewById3;
                    RelativeLayout relativeLayout4 = this.l;
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
                        this.o = (TUrlImageView) findViewById4;
                        RelativeLayout relativeLayout5 = this.l;
                        if (relativeLayout5 != null) {
                            View findViewById5 = relativeLayout5.findViewById(R.id.left_bottom_corner);
                            TUrlImageView tUrlImageView4 = (TUrlImageView) findViewById5;
                            tUrlImageView4.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png");
                            tUrlImageView4.setRotation(270.0f);
                            ckf.f(findViewById5, "mLoadingContainer.findVi…s.rotation = 270f\n      }");
                            this.p = (TUrlImageView) findViewById5;
                            RelativeLayout relativeLayout6 = this.l;
                            if (relativeLayout6 != null) {
                                View findViewById6 = relativeLayout6.findViewById(R.id.right_bottom_corner);
                                TUrlImageView tUrlImageView5 = (TUrlImageView) findViewById6;
                                tUrlImageView5.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0127sMMz1FYaV8T1m6N_!!6000000000499-2-tps-126-126.png");
                                tUrlImageView5.setRotation(180.0f);
                                ckf.f(findViewById6, "mLoadingContainer.findVi…s.rotation = 180f\n      }");
                                this.q = (TUrlImageView) findViewById6;
                                if (this.s) {
                                    TUrlImageView tUrlImageView6 = this.n;
                                    if (tUrlImageView6 != null) {
                                        tUrlImageView6.setAlpha(0.0f);
                                        TUrlImageView tUrlImageView7 = this.o;
                                        if (tUrlImageView7 != null) {
                                            tUrlImageView7.setAlpha(0.0f);
                                            TUrlImageView tUrlImageView8 = this.p;
                                            if (tUrlImageView8 != null) {
                                                tUrlImageView8.setAlpha(0.0f);
                                                TUrlImageView tUrlImageView9 = this.q;
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
                                RelativeLayout relativeLayout7 = this.l;
                                if (relativeLayout7 != null) {
                                    relativeLayout7.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
                                    RelativeLayout relativeLayout8 = this.l;
                                    if (relativeLayout8 != null) {
                                        relativeLayout8.setVisibility(8);
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

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.v9e
    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "action");
        super.q(str, obj);
        if (ckf.b(str, gnf.EVENT_LOADING_STATE_OPERATE) && (obj instanceof Boolean)) {
            if (((Boolean) obj).booleanValue()) {
                p0();
                View X = X();
                if (X != null) {
                    X.setVisibility(0);
                    return;
                }
                return;
            }
            q0();
            View X2 = X();
            if (X2 != null) {
                X2.setVisibility(8);
            }
        }
    }

    public final void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bd4e58", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.m;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
            TUrlImageView tUrlImageView2 = this.m;
            if (tUrlImageView2 != null) {
                float translationY = tUrlImageView2.getTranslationY() - zb7.a(10.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, zb7.a(427.0f) + translationY);
                ofFloat.addUpdateListener(new b());
                ofFloat.addListener(new c());
                ofFloat.setRepeatCount(10);
                ofFloat.setDuration(1500L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                this.r = ofFloat;
                return;
            }
            ckf.y("mScanLine");
            throw null;
        }
        ckf.y("mScanLine");
        throw null;
    }
}
