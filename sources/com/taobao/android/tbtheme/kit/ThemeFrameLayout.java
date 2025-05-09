package com.taobao.android.tbtheme.kit;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.fpt;
import tb.n14;
import tb.n1q;
import tb.pb6;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.tot;
import tb.var;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ThemeFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final HashMap<String, Integer> mPicColor = new HashMap<>();
    private View.OnLayoutChangeListener layoutChangeListener;
    private ConstraintLayout mBgImageContainerLayout;
    private View mBlurView;
    private int mScrollY;
    private tot mThemeConfig;
    private ThemeData mThemeData;
    private TUrlImageView mUrlIvBg;
    private LinearLayout mViewMantle;
    private View mViewMantleBG;
    private View mViewMantleBlur;
    private TUrlImageView pendant;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f54b8", new Object[]{this, new Integer(i)});
                return;
            }
            ThemeFrameLayout.access$000(ThemeFrameLayout.this, i);
            ThemeFrameLayout.access$100(ThemeFrameLayout.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends TypeReference<PendantInfo> {
        public b(ThemeFrameLayout themeFrameLayout) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PendantInfo f9602a;

        public c(PendantInfo pendantInfo) {
            this.f9602a = pendantInfo;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i5 != i || i7 != i3 || i8 != i4 || i6 != i2) {
                ThemeFrameLayout.access$200(ThemeFrameLayout.this, view, this.f9602a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9603a;
        public final /* synthetic */ f b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SuccPhenixEvent f9604a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.tbtheme.kit.ThemeFrameLayout$d$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class RunnableC0493a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f9605a;

                public RunnableC0493a(int i) {
                    this.f9605a = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ThemeFrameLayout.access$300().put(d.this.f9603a, Integer.valueOf(this.f9605a));
                    ((a) d.this.b).a(this.f9605a);
                }
            }

            public a(SuccPhenixEvent succPhenixEvent) {
                this.f9604a = succPhenixEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SuccPhenixEvent succPhenixEvent = this.f9604a;
                if (succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
                    n1q.d(new RunnableC0493a(n14.b(this.f9604a.getDrawable().getBitmap())));
                }
            }
        }

        public d(ThemeFrameLayout themeFrameLayout, String str, f fVar) {
            this.f9603a = str;
            this.b = fVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            Coordinator.execute(new a(succPhenixEvent));
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            ThemeFrameLayout.access$400(ThemeFrameLayout.this, succPhenixEvent);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
    }

    static {
        t2o.a(464519259);
    }

    public ThemeFrameLayout(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void access$000(ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f9bf87", new Object[]{themeFrameLayout, new Integer(i)});
        } else {
            themeFrameLayout.setBlurColor(i);
        }
    }

    public static /* synthetic */ void access$100(ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688dc888", new Object[]{themeFrameLayout, new Integer(i)});
        } else {
            themeFrameLayout.setPicColor(i);
        }
    }

    public static /* synthetic */ void access$200(ThemeFrameLayout themeFrameLayout, View view, PendantInfo pendantInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b15af5d", new Object[]{themeFrameLayout, view, pendantInfo});
        } else {
            themeFrameLayout.updatePendantLayout(view, pendantInfo);
        }
    }

    public static /* synthetic */ HashMap access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9061d41d", new Object[0]);
        }
        return mPicColor;
    }

    public static /* synthetic */ void access$400(ThemeFrameLayout themeFrameLayout, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8feea980", new Object[]{themeFrameLayout, succPhenixEvent});
        } else {
            themeFrameLayout.resizeImageViewWhenPictureSuccessDownloaded(succPhenixEvent);
        }
    }

    private void doImageResizeAfterPictureDownload() {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d806a35", new Object[]{this});
            return;
        }
        tot totVar = this.mThemeConfig;
        if (totVar != null && (tUrlImageView = this.mUrlIvBg) != null && totVar.d > 0) {
            tUrlImageView.succListener(new e());
        }
    }

    private void handlePendant(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a189d54d", new Object[]{this, context});
            return;
        }
        TUrlImageView tUrlImageView = this.pendant;
        PendantInfo pendantInfo = null;
        if (tUrlImageView != null) {
            this.mBgImageContainerLayout.removeView(tUrlImageView);
            this.pendant = null;
        }
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
        if (onLayoutChangeListener != null) {
            this.mBgImageContainerLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.layoutChangeListener = null;
        }
        if (!TextUtils.isEmpty(this.mThemeData.skinPendant)) {
            try {
                pendantInfo = (PendantInfo) JSON.parseObject(this.mThemeData.skinPendant, new b(this), new Feature[0]);
            } catch (Throwable th) {
                TLog.loge("ThemeFrameLayout", th.getMessage());
            }
            if (pendantInfo != null) {
                this.pendant = new TUrlImageView(context);
                int generateViewId = View.generateViewId();
                this.pendant.setId(generateViewId);
                this.pendant.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.pendant.setSkipAutoSize(true);
                this.pendant.setImageUrl(pendantInfo.getUrl());
                this.mBgImageContainerLayout.addView(this.pendant, new ConstraintLayout.LayoutParams(0, 0));
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(this.mBgImageContainerLayout);
                constraintSet.connect(generateViewId, 3, 0, 3, 0);
                constraintSet.connect(generateViewId, 6, 0, 6, 0);
                constraintSet.applyTo(this.mBgImageContainerLayout);
                updatePendantLayout(this.mBgImageContainerLayout, pendantInfo);
                this.mBgImageContainerLayout.addOnLayoutChangeListener(new c(pendantInfo));
            }
        }
    }

    private void initMantle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cbb58a", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mViewMantle = linearLayout;
        linearLayout.setOrientation(1);
        this.mViewMantleBlur = new View(getContext());
        View view = new View(getContext());
        this.mViewMantleBG = view;
        int i = n14.f24438a;
        view.setBackgroundColor(i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{n14.F2COLOR_TRANSPARENT, i});
        this.mViewMantleBlur.setBackground(gradientDrawable);
        this.mViewMantle.addView(this.mViewMantleBlur, -1, pb6.f(getContext(), 20.0f));
        this.mViewMantle.addView(this.mViewMantleBG, -1, -1);
    }

    private void initView(tot totVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2130f5c0", new Object[]{this, totVar});
            return;
        }
        Context context = getContext();
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.mUrlIvBg = tUrlImageView;
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mUrlIvBg.setAutoRelease(false);
        this.mUrlIvBg.setId(View.generateViewId());
        this.mUrlIvBg.setWhenNullClearImg(true);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.mBgImageContainerLayout = constraintLayout;
        constraintLayout.addView(this.mUrlIvBg, -1, -1);
        initMantle();
        View view = new View(context);
        this.mBlurView = view;
        view.setVisibility(8);
        addView(this.mBgImageContainerLayout, -1, -1);
        addView(this.mBlurView, -1, 0);
        addView(this.mViewMantle, -1, 0);
        setSkinViewConfig(totVar);
    }

    public static /* synthetic */ Object ipc$super(ThemeFrameLayout themeFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbtheme/kit/ThemeFrameLayout");
    }

    private void loadData() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
        } else if (this.mThemeData != null) {
            Context context = getContext();
            ThemeData themeData = this.mThemeData;
            String str = themeData.skinColor;
            String str2 = themeData.skinPic;
            if (this.mThemeConfig.b == 1) {
                str = themeData.actionBarBackgroundColor;
                str2 = themeData.actionBarBackgroundImage;
            } else {
                handlePendant(context);
            }
            boolean c2 = var.c(context);
            if (!TextUtils.isEmpty(str) && !c2) {
                i = n14.c(str);
                this.mUrlIvBg.setBackgroundColor(i);
            }
            doImageResizeAfterPictureDownload();
            if (!c2) {
                this.mUrlIvBg.setImageUrl(str2);
                setBlurColor(i);
            }
            if (this.mThemeConfig.d > 0) {
                setPicColor(i);
                if (!TextUtils.isEmpty(str2) && !this.mThemeData.ignoreImageColor) {
                    loadPicColor(str2, new a());
                }
            }
        }
    }

    private void loadPicColor(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d325c1c4", new Object[]{this, str, fVar});
            return;
        }
        Integer num = mPicColor.get(str);
        if (num != null) {
            ((a) fVar).a(num.intValue());
        } else {
            s0m.B().T(str).succListener(new d(this, str, fVar)).fetch();
        }
    }

    private void resizeImageViewWhenPictureSuccessDownloaded(SuccPhenixEvent succPhenixEvent) {
        ViewGroup.LayoutParams layoutParams;
        BitmapDrawable drawable;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15af1ec1", new Object[]{this, succPhenixEvent});
            return;
        }
        TUrlImageView tUrlImageView = this.mUrlIvBg;
        if (tUrlImageView != null && succPhenixEvent != null && (layoutParams = tUrlImageView.getLayoutParams()) != null && (drawable = succPhenixEvent.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0 && (width = (int) (this.mUrlIvBg.getWidth() * ((intrinsicHeight * 1.0f) / intrinsicWidth))) > 0 && layoutParams.height != width) {
                ViewGroup.LayoutParams layoutParams2 = this.mBgImageContainerLayout.getLayoutParams();
                layoutParams2.height = width;
                this.mBgImageContainerLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    private void setBlurColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9fa2a2", new Object[]{this, new Integer(i)});
        } else if (this.mThemeConfig.j) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (this.mThemeConfig.d > 0) {
                gradientDrawable.setColors(new int[]{n14.a(0, i), i});
            } else {
                gradientDrawable.setColors(new int[]{n14.F2COLOR_TRANSPARENT, n14.f24438a});
            }
            this.mBlurView.setBackground(gradientDrawable);
        }
    }

    private void setPicColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b241c1", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(i);
        }
    }

    private void updatePendantLayout(View view, PendantInfo pendantInfo) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ae1133", new Object[]{this, view, pendantInfo});
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0 && (tUrlImageView = this.pendant) != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) tUrlImageView.getLayoutParams();
            float f2 = width;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) (pendantInfo.getWeightPercent() * f2);
            float f3 = height;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) (pendantInfo.getHeightPercent() * f3);
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) (f2 * pendantInfo.getHorizontalBias());
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (f3 * pendantInfo.getVerticalBias());
            this.pendant.setLayoutParams(layoutParams);
        }
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        tot totVar = this.mThemeConfig;
        if (totVar != null) {
            return totVar.f28850a;
        }
        return null;
    }

    public void onScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7c332f", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollY += i;
        LinearLayout linearLayout = this.mViewMantle;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams.height < fpt.b() || layoutParams.height > 0) {
                tot totVar = this.mThemeConfig;
                int i2 = totVar.h;
                int i3 = this.mScrollY;
                int i4 = totVar.c;
                if (i3 > i4) {
                    i3 = i4;
                }
                layoutParams.height = i2 + i3;
                this.mViewMantle.setLayoutParams(layoutParams);
                this.mViewMantle.requestLayout();
            }
        }
    }

    public void setOnScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a6831", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollY = i;
        LinearLayout linearLayout = this.mViewMantle;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams.height < fpt.b() || layoutParams.height > 0) {
                tot totVar = this.mThemeConfig;
                int i2 = totVar.h;
                int i3 = this.mScrollY;
                int i4 = totVar.c;
                if (i3 > i4) {
                    i3 = i4;
                }
                layoutParams.height = i2 + i3;
                this.mViewMantle.setLayoutParams(layoutParams);
            }
        }
    }

    public void setSkinViewConfig(tot totVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca91fc91", new Object[]{this, totVar});
        } else if (totVar != null) {
            this.mThemeConfig = totVar;
            if (totVar.f) {
                this.mViewMantle.setVisibility(0);
                this.mViewMantleBG.setBackgroundColor(totVar.g);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mViewMantle.getLayoutParams();
                layoutParams.height = totVar.h;
                layoutParams.gravity = 80;
                this.mViewMantle.setLayoutParams(layoutParams);
            } else {
                this.mViewMantle.setVisibility(8);
            }
            if (this.mThemeConfig.d > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.mBgImageContainerLayout.getLayoutParams();
                layoutParams2.height = this.mThemeConfig.d;
                this.mBgImageContainerLayout.setLayoutParams(layoutParams2);
            }
            if (this.mThemeConfig.i > 0) {
                ViewGroup.LayoutParams layoutParams3 = this.mViewMantleBlur.getLayoutParams();
                layoutParams3.height = this.mThemeConfig.i;
                this.mViewMantleBlur.setLayoutParams(layoutParams3);
            }
            if (this.mThemeConfig.j) {
                this.mBlurView.setVisibility(0);
                tot totVar2 = this.mThemeConfig;
                if (totVar2.k <= 0) {
                    totVar2.k = pb6.f(getContext(), 20.0f);
                }
                tot totVar3 = this.mThemeConfig;
                int i2 = totVar3.k;
                int i3 = totVar3.d;
                if (i3 > 0) {
                    i = (i3 - i2) + 2;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.mBlurView.getLayoutParams();
                layoutParams4.height = i2;
                if (i > 0) {
                    layoutParams4.topMargin = i;
                } else {
                    layoutParams4.gravity = 80;
                }
                this.mBlurView.setLayoutParams(layoutParams4);
            }
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            if (layoutParams5 == null) {
                layoutParams5 = new ViewGroup.LayoutParams(-1, totVar.c);
            } else {
                layoutParams5.height = totVar.c;
            }
            setLayoutParams(layoutParams5);
        }
    }

    public void setTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06178af", new Object[]{this, new Integer(i)});
        } else {
            setTranslationY(i);
        }
    }

    public void updateCoverHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11540547", new Object[]{this, new Integer(i)});
            return;
        }
        tot totVar = this.mThemeConfig;
        if (totVar != null && totVar.f) {
            totVar.h = i;
            ViewGroup.LayoutParams layoutParams = this.mViewMantle.getLayoutParams();
            layoutParams.height = i;
            this.mViewMantle.setLayoutParams(layoutParams);
        }
    }

    public void updateHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb3d60c", new Object[]{this, new Integer(i)});
            return;
        }
        tot totVar = this.mThemeConfig;
        if (totVar != null) {
            totVar.c = i;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public void updateImageHeight(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d78123", new Object[]{this, new Integer(i)});
            return;
        }
        tot totVar = this.mThemeConfig;
        if (totVar != null) {
            totVar.d = i;
        }
        ViewGroup.LayoutParams layoutParams = this.mBgImageContainerLayout.getLayoutParams();
        layoutParams.height = i;
        this.mBgImageContainerLayout.setLayoutParams(layoutParams);
        tot totVar2 = this.mThemeConfig;
        if (totVar2 != null && totVar2.j) {
            this.mBlurView.setVisibility(0);
            tot totVar3 = this.mThemeConfig;
            if (totVar3.k <= 0) {
                totVar3.k = pb6.f(getContext(), 20.0f);
            }
            tot totVar4 = this.mThemeConfig;
            int i3 = totVar4.k;
            int i4 = totVar4.d;
            if (i4 > 0) {
                i2 = (i4 - i3) + 2;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mBlurView.getLayoutParams();
            layoutParams2.height = i3;
            if (i2 > 0) {
                layoutParams2.topMargin = i2;
            } else {
                layoutParams2.gravity = 80;
            }
            this.mBlurView.setLayoutParams(layoutParams2);
        }
    }

    public ThemeFrameLayout(Context context, tot totVar) {
        this(context, null, 0, totVar);
    }

    public ThemeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThemeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public ThemeFrameLayout(Context context, AttributeSet attributeSet, int i, tot totVar) {
        super(context, attributeSet, i);
        this.mScrollY = 0;
        initView(totVar);
        loadData();
    }

    public void loadData(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3189973", new Object[]{this, themeData});
            return;
        }
        this.mThemeData = themeData;
        loadData();
    }
}
