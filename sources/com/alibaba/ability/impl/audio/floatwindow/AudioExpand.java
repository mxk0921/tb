package com.alibaba.ability.impl.audio.floatwindow;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import java.util.Arrays;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.kei;
import tb.l0r;
import tb.t2o;
import tb.te;
import tb.xhv;
import tb.ywo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioExpand extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final a Companion = new a(null);
    public static final String IMAGE_URL_CLOSE = "https://img.alicdn.com/imgextra/i2/O1CN01FQ2Qw01JyTMCdIX4D_!!6000000001097-2-tps-38-38.png";
    public static final String IMAGE_URL_PAUSE = "https://img.alicdn.com/imgextra/i3/O1CN01WlUn0T1GlF4P1B9Y8_!!6000000000662-2-tps-78-94.png";
    public static final String IMAGE_URL_PLAY = "https://img.alicdn.com/imgextra/i2/O1CN01rngDiY1Gy49x2Rq1X_!!6000000000690-2-tps-62-70.png";
    private static final String IMG_URL_SERCH_CLOSE = "https://img.alicdn.com/imgextra/i2/O1CN012zxMHE1WR7Z3xr0SU_!!6000000002784-2-tps-833-834.png";
    public static final float STROKE_WIDTH = 2.0f;
    public boolean defaultPlaying;
    private GradientDrawable drawable;
    private FrameLayout flCD;
    private View flClose;
    private FrameLayout flCloseLayout;
    private FrameLayout frameLayout;
    private FrameLayout frameLayoutClose;
    private TUrlImageView ivCD;
    private TUrlImageView ivClose;
    private TUrlImageView ivStatus;
    private float[] leftRadii;
    private te playParams;
    private float[] rightRadii;
    private ObjectAnimator rotateAnimation;
    private TUrlImageView searchImageView;
    private FrameLayout thisView;
    private AudioFloatWindow.a triggerListener;
    private TextView tvTitle;
    private TextView tvTitleClose;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(98566193);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            TUrlImageView access$getIvStatus$p = AudioExpand.access$getIvStatus$p(AudioExpand.this);
            ckf.d(access$getIvStatus$p);
            String imageUrl = access$getIvStatus$p.getImageUrl();
            AudioExpand.access$Companion();
            if (ckf.b(imageUrl, AudioExpand.IMAGE_URL_PLAY)) {
                AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(0, null);
            } else {
                AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(1, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AudioExpand.access$getFrameLayout$p(AudioExpand.this).setVisibility(8);
                AudioExpand.access$getFrameLayoutClose$p(AudioExpand.this).setVisibility(0);
                AudioExpand.access$showCloseUIAndExit(AudioExpand.this);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(2, null);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.impl.audio.floatwindow.AudioExpand$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0043c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0043c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(2, null);
                }
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Map<?, ?> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TUrlImageView access$getIvStatus$p = AudioExpand.access$getIvStatus$p(AudioExpand.this);
            if (access$getIvStatus$p != null) {
                access$getIvStatus$p.setVisibility(4);
            }
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.0f);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.0f);
            TUrlImageView access$getIvCD$p = AudioExpand.access$getIvCD$p(AudioExpand.this);
            if (access$getIvCD$p != null) {
                te access$getPlayParams$p = AudioExpand.access$getPlayParams$p(AudioExpand.this);
                if (access$getPlayParams$p != null) {
                    map = access$getPlayParams$p.d;
                } else {
                    map = null;
                }
                if (map != null) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(access$getIvCD$p, ofFloat, ofFloat2);
                    ckf.f(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…r(cdView, scaleX, scaleY)");
                    ofPropertyValuesHolder.setDuration(300L);
                    ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                    ofPropertyValuesHolder.start();
                    MegaUtils.z(new a(), 300L);
                    MegaUtils.z(new b(), 2600L);
                    return;
                }
            }
            MegaUtils.z(new RunnableC0043c(), 0L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AudioExpand.access$getTriggerListener$p(AudioExpand.this).a(3, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int[] b;

        public e(int[] iArr) {
            this.b = iArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AudioExpand audioExpand = AudioExpand.this;
            if (this.b[0] > 0) {
                z = true;
            }
            AudioExpand.access$showCloseTranslateAnimation(audioExpand, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public f(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ViewGroup.LayoutParams layoutParams = AudioExpand.this.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } catch (Throwable unused) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(AudioExpand.this.getWidth(), AudioExpand.this.getHeight());
            }
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(AudioExpand.this.getWidth(), AudioExpand.this.getHeight());
            }
            if (this.b) {
                Context context = AudioExpand.this.getContext();
                ckf.f(context, "context");
                marginLayoutParams.rightMargin = ywo.a(context, -2.0f);
            } else {
                Context context2 = AudioExpand.this.getContext();
                ckf.f(context2, "context");
                marginLayoutParams.leftMargin = ywo.a(context2, -2.0f);
            }
            AudioExpand.this.setLayoutParams(marginLayoutParams);
        }
    }

    static {
        t2o.a(98566192);
    }

    public AudioExpand(Context context, AudioFloatWindow.a aVar) {
        this(context, aVar, null, 0, 12, null);
    }

    public static final /* synthetic */ a access$Companion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a8c8425f", new Object[0]);
        }
        return Companion;
    }

    public static final /* synthetic */ FrameLayout access$getFrameLayout$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("92f76621", new Object[]{audioExpand});
        }
        FrameLayout frameLayout = audioExpand.frameLayout;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("frameLayout");
        throw null;
    }

    public static final /* synthetic */ FrameLayout access$getFrameLayoutClose$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("42e4b26b", new Object[]{audioExpand});
        }
        FrameLayout frameLayout = audioExpand.frameLayoutClose;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("frameLayoutClose");
        throw null;
    }

    public static final /* synthetic */ TUrlImageView access$getIvCD$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("7c0c7521", new Object[]{audioExpand});
        }
        return audioExpand.ivCD;
    }

    public static final /* synthetic */ TUrlImageView access$getIvStatus$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b01f1f10", new Object[]{audioExpand});
        }
        return audioExpand.ivStatus;
    }

    public static final /* synthetic */ te access$getPlayParams$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (te) ipChange.ipc$dispatch("5b824b5e", new Object[]{audioExpand});
        }
        return audioExpand.playParams;
    }

    public static final /* synthetic */ AudioFloatWindow.a access$getTriggerListener$p(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioFloatWindow.a) ipChange.ipc$dispatch("24504da0", new Object[]{audioExpand});
        }
        return audioExpand.triggerListener;
    }

    public static final /* synthetic */ void access$setFrameLayout$p(AudioExpand audioExpand, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246299af", new Object[]{audioExpand, frameLayout});
        } else {
            audioExpand.frameLayout = frameLayout;
        }
    }

    public static final /* synthetic */ void access$setFrameLayoutClose$p(AudioExpand audioExpand, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7ea3d", new Object[]{audioExpand, frameLayout});
        } else {
            audioExpand.frameLayoutClose = frameLayout;
        }
    }

    public static final /* synthetic */ void access$setIvCD$p(AudioExpand audioExpand, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb31da6d", new Object[]{audioExpand, tUrlImageView});
        } else {
            audioExpand.ivCD = tUrlImageView;
        }
    }

    public static final /* synthetic */ void access$setIvStatus$p(AudioExpand audioExpand, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e37885e", new Object[]{audioExpand, tUrlImageView});
        } else {
            audioExpand.ivStatus = tUrlImageView;
        }
    }

    public static final /* synthetic */ void access$setPlayParams$p(AudioExpand audioExpand, te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30f47b4", new Object[]{audioExpand, teVar});
        } else {
            audioExpand.playParams = teVar;
        }
    }

    public static final /* synthetic */ void access$setTriggerListener$p(AudioExpand audioExpand, AudioFloatWindow.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abce142", new Object[]{audioExpand, aVar});
        } else {
            audioExpand.triggerListener = aVar;
        }
    }

    public static final /* synthetic */ void access$showCloseTranslateAnimation(AudioExpand audioExpand, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4fd738", new Object[]{audioExpand, new Boolean(z)});
        } else {
            audioExpand.showCloseTranslateAnimation(z);
        }
    }

    public static final /* synthetic */ void access$showCloseUIAndExit(AudioExpand audioExpand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245bd5b1", new Object[]{audioExpand});
        } else {
            audioExpand.showCloseUIAndExit();
        }
    }

    private final void initSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9873538", new Object[]{this});
        } else if (getLayoutParams() == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                setLayoutParams(layoutParams);
                invalidate();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AudioExpand audioExpand, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/floatwindow/AudioExpand");
    }

    private final void setBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91c7b7", new Object[]{this});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        ckf.f(context, "context");
        gradientDrawable.setStroke(ywo.a(context, 2.0f), Color.parseColor("#0DFFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#FF363636"));
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackground(gradientDrawable);
            FrameLayout frameLayout2 = this.frameLayoutClose;
            if (frameLayout2 != null) {
                frameLayout2.setBackground(gradientDrawable);
                this.drawable = gradientDrawable;
                return;
            }
            ckf.y("frameLayoutClose");
            throw null;
        }
        ckf.y("frameLayout");
        throw null;
    }

    private final void shapeCorner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84109add", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivCD;
        if (tUrlImageView != null) {
            AbsFeature<? super ImageView> findFeature = tUrlImageView.findFeature(ImageShapeFeature.class);
            if (!(findFeature instanceof ImageShapeFeature)) {
                findFeature = null;
            }
            ImageShapeFeature imageShapeFeature = (ImageShapeFeature) findFeature;
            if (imageShapeFeature == null) {
                imageShapeFeature = new ImageShapeFeature();
                tUrlImageView.addFeature(imageShapeFeature);
            }
            int i = tUrlImageView.getLayoutParams().width / 2;
            if (i > 0) {
                imageShapeFeature.setShape(1);
                float f2 = i;
                imageShapeFeature.setCornerRadius(f2, f2, f2, f2);
            }
        }
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivStatus;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(IMAGE_URL_PLAY);
        }
        ObjectAnimator objectAnimator = this.rotateAnimation;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    public final void play(te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81e090c", new Object[]{this, teVar});
            return;
        }
        ckf.g(teVar, "playParams");
        if (this.defaultPlaying) {
            play();
        } else {
            pause();
        }
        kei keiVar = teVar.c;
        TextView textView = this.tvTitle;
        if (textView != null) {
            textView.setText(keiVar.b);
            TUrlImageView tUrlImageView = this.ivCD;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(keiVar.d);
            }
            this.playParams = teVar;
            TextView textView2 = this.tvTitleClose;
            if (textView2 != null) {
                textView2.setText(getTipsFromPlayParams(teVar));
            } else {
                ckf.y("tvTitleClose");
                throw null;
            }
        } else {
            ckf.y("tvTitle");
            throw null;
        }
    }

    public AudioExpand(Context context, AudioFloatWindow.a aVar, AttributeSet attributeSet) {
        this(context, aVar, attributeSet, 0, 8, null);
    }

    public final void layout(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749dba23", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.thisView;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = i;
                layoutParams2.topMargin = i2;
                if (z) {
                    FrameLayout frameLayout2 = this.flCD;
                    ckf.d(frameLayout2);
                    ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    if (layoutParams3 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        Context context = getContext();
                        ckf.f(context, "context");
                        layoutParams4.leftMargin = ywo.a(context, 6.5f);
                        FrameLayout frameLayout3 = this.flCD;
                        ckf.d(frameLayout3);
                        frameLayout3.setLayoutParams(layoutParams4);
                        TextView textView = this.tvTitle;
                        if (textView != null) {
                            ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
                            if (layoutParams5 != null) {
                                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                Context context2 = getContext();
                                ckf.f(context2, "context");
                                layoutParams6.leftMargin = ywo.a(context2, 48.5f);
                                TextView textView2 = this.tvTitle;
                                if (textView2 != null) {
                                    textView2.setGravity(19);
                                    TextView textView3 = this.tvTitle;
                                    if (textView3 != null) {
                                        textView3.setLayoutParams(layoutParams6);
                                        View view = this.flClose;
                                        ViewGroup.LayoutParams layoutParams7 = view != null ? view.getLayoutParams() : null;
                                        if (layoutParams7 != null) {
                                            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                                            FrameLayout frameLayout4 = this.flCloseLayout;
                                            ViewGroup.LayoutParams layoutParams9 = frameLayout4 != null ? frameLayout4.getLayoutParams() : null;
                                            if (layoutParams9 != null) {
                                                FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                                                TUrlImageView tUrlImageView = this.ivClose;
                                                if (tUrlImageView != null) {
                                                    ViewGroup.LayoutParams layoutParams11 = tUrlImageView.getLayoutParams();
                                                    if (layoutParams11 != null) {
                                                        FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                                                        Context context3 = getContext();
                                                        ckf.f(context3, "context");
                                                        layoutParams8.leftMargin = ywo.a(context3, 134.0f);
                                                        Context context4 = getContext();
                                                        ckf.f(context4, "context");
                                                        layoutParams10.leftMargin = ywo.a(context4, 144.5f);
                                                        layoutParams12.gravity = 19;
                                                        TUrlImageView tUrlImageView2 = this.ivClose;
                                                        if (tUrlImageView2 != null) {
                                                            tUrlImageView2.setLayoutParams(layoutParams12);
                                                            FrameLayout frameLayout5 = this.flCloseLayout;
                                                            if (frameLayout5 != null) {
                                                                frameLayout5.setLayoutParams(layoutParams10);
                                                            }
                                                            GradientDrawable gradientDrawable = this.drawable;
                                                            if (gradientDrawable != null) {
                                                                gradientDrawable.setCornerRadii(this.rightRadii);
                                                            }
                                                        } else {
                                                            ckf.y("ivClose");
                                                            throw null;
                                                        }
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                    }
                                                } else {
                                                    ckf.y("ivClose");
                                                    throw null;
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                        }
                                    } else {
                                        ckf.y("tvTitle");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("tvTitle");
                                    throw null;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        } else {
                            ckf.y("tvTitle");
                            throw null;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                } else {
                    FrameLayout frameLayout6 = this.flCD;
                    ViewGroup.LayoutParams layoutParams13 = frameLayout6 != null ? frameLayout6.getLayoutParams() : null;
                    if (layoutParams13 != null) {
                        FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
                        Context context5 = getContext();
                        ckf.f(context5, "context");
                        layoutParams14.leftMargin = ywo.a(context5, 120.5f);
                        FrameLayout frameLayout7 = this.flCD;
                        if (frameLayout7 != null) {
                            frameLayout7.setLayoutParams(layoutParams14);
                        }
                        TextView textView4 = this.tvTitle;
                        if (textView4 != null) {
                            ViewGroup.LayoutParams layoutParams15 = textView4.getLayoutParams();
                            if (layoutParams15 != null) {
                                FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) layoutParams15;
                                Context context6 = getContext();
                                ckf.f(context6, "context");
                                layoutParams16.leftMargin = ywo.a(context6, 24.5f);
                                TextView textView5 = this.tvTitle;
                                if (textView5 != null) {
                                    textView5.setGravity(21);
                                    TextView textView6 = this.tvTitle;
                                    if (textView6 != null) {
                                        textView6.setLayoutParams(layoutParams16);
                                        View view2 = this.flClose;
                                        ViewGroup.LayoutParams layoutParams17 = view2 != null ? view2.getLayoutParams() : null;
                                        if (layoutParams17 != null) {
                                            FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) layoutParams17;
                                            FrameLayout frameLayout8 = this.flCloseLayout;
                                            ViewGroup.LayoutParams layoutParams19 = frameLayout8 != null ? frameLayout8.getLayoutParams() : null;
                                            if (layoutParams19 != null) {
                                                FrameLayout.LayoutParams layoutParams20 = (FrameLayout.LayoutParams) layoutParams19;
                                                TUrlImageView tUrlImageView3 = this.ivClose;
                                                if (tUrlImageView3 != null) {
                                                    ViewGroup.LayoutParams layoutParams21 = tUrlImageView3 != null ? tUrlImageView3.getLayoutParams() : null;
                                                    if (layoutParams21 != null) {
                                                        FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) layoutParams21;
                                                        layoutParams18.leftMargin = 0;
                                                        layoutParams20.leftMargin = 0;
                                                        layoutParams22.gravity = 21;
                                                        TUrlImageView tUrlImageView4 = this.ivClose;
                                                        if (tUrlImageView4 != null) {
                                                            tUrlImageView4.setLayoutParams(layoutParams22);
                                                            FrameLayout frameLayout9 = this.flCloseLayout;
                                                            if (frameLayout9 != null) {
                                                                frameLayout9.setLayoutParams(layoutParams20);
                                                            }
                                                            GradientDrawable gradientDrawable2 = this.drawable;
                                                            if (gradientDrawable2 != null) {
                                                                gradientDrawable2.setCornerRadii(this.leftRadii);
                                                            }
                                                        } else {
                                                            ckf.y("ivClose");
                                                            throw null;
                                                        }
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                    }
                                                } else {
                                                    ckf.y("ivClose");
                                                    throw null;
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                        }
                                    } else {
                                        ckf.y("tvTitle");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("tvTitle");
                                    throw null;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        } else {
                            ckf.y("tvTitle");
                            throw null;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
                TUrlImageView tUrlImageView5 = this.searchImageView;
                if (tUrlImageView5 != null) {
                    ViewGroup.LayoutParams layoutParams23 = tUrlImageView5.getLayoutParams();
                    ckf.d(layoutParams23);
                    FrameLayout.LayoutParams layoutParams24 = (FrameLayout.LayoutParams) layoutParams23;
                    TextView textView7 = this.tvTitleClose;
                    if (textView7 != null) {
                        ViewGroup.LayoutParams layoutParams25 = textView7.getLayoutParams();
                        ckf.d(layoutParams25);
                        FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) layoutParams25;
                        if (z) {
                            Context context7 = getContext();
                            ckf.f(context7, "context");
                            layoutParams24.leftMargin = ywo.a(context7, 14.0f);
                            Context context8 = getContext();
                            ckf.f(context8, "context");
                            layoutParams26.leftMargin = ywo.a(context8, 46.0f);
                            TextView textView8 = this.tvTitleClose;
                            if (textView8 != null) {
                                textView8.setGravity(19);
                            } else {
                                ckf.y("tvTitleClose");
                                throw null;
                            }
                        } else {
                            Context context9 = getContext();
                            ckf.f(context9, "context");
                            layoutParams24.leftMargin = ywo.a(context9, 129.0f);
                            Context context10 = getContext();
                            ckf.f(context10, "context");
                            layoutParams26.leftMargin = ywo.a(context10, 6.5f);
                            TextView textView9 = this.tvTitleClose;
                            if (textView9 != null) {
                                textView9.setGravity(19);
                            } else {
                                ckf.y("tvTitleClose");
                                throw null;
                            }
                        }
                        requestLayout();
                        return;
                    }
                    ckf.y("tvTitleClose");
                    throw null;
                }
                ckf.y("searchImageView");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        ckf.y("thisView");
        throw null;
    }

    public /* synthetic */ AudioExpand(Context context, AudioFloatWindow.a aVar, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    private final String getTipsFromPlayParams(te teVar) {
        Map<?, ?> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41bc01d2", new Object[]{this, teVar});
        }
        String obj2 = (teVar == null || (map = teVar.d) == null || (obj = map.get("searchKey")) == null) ? null : obj.toString();
        if (obj2 == null || obj2.length() == 0) {
            obj2 = "undefined";
        }
        String q = Localization.q(R.string.taobao_app_1012_1_21332);
        ckf.f(q, "Localization.localizedSt….taobao_app_1012_1_21332)");
        return String.format(q, Arrays.copyOf(new Object[]{obj2}, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioExpand(Context context, AudioFloatWindow.a aVar, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        ckf.g(aVar, "triggerListener");
        this.triggerListener = aVar;
        this.defaultPlaying = true;
        initLayout();
    }

    private final void showCloseTranslateAnimation(boolean z) {
        ObjectAnimator objectAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f51179c", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = getContext();
        ckf.f(context, "context");
        float f2 = ywo.b(context).widthPixels;
        FrameLayout frameLayout = this.frameLayoutClose;
        if (frameLayout == null) {
            ckf.y("frameLayoutClose");
            throw null;
        } else if (frameLayout.getVisibility() == 0) {
            if (z) {
                objectAnimator = ObjectAnimator.ofFloat(this, "translationX", 0.0f, f2);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this, "translationX", 0.0f, -f2);
            }
            ckf.f(objectAnimator, "animator");
            objectAnimator.setDuration(500L);
            objectAnimator.start();
        }
    }

    private final void showCloseUIAndExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f084d54d", new Object[]{this});
            return;
        }
        TextView textView = this.tvTitleClose;
        if (textView != null) {
            textView.setText(getTipsFromPlayParams(this.playParams));
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f);
            TUrlImageView tUrlImageView = this.searchImageView;
            if (tUrlImageView != null) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tUrlImageView, ofFloat, ofFloat2);
                ckf.f(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…mageView, scaleX, scaleY)");
                ofPropertyValuesHolder.setDuration(200L);
                ofPropertyValuesHolder.start();
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                MegaUtils.z(new e(iArr), 1500L);
                return;
            }
            ckf.y("searchImageView");
            throw null;
        }
        ckf.y("tvTitleClose");
        throw null;
    }

    public final void showOpenTranslateAnimation(boolean z) {
        ObjectAnimator objectAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f6e830", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = getContext();
        ckf.f(context, "context");
        float f2 = ywo.b(context).widthPixels;
        setTranslationX(z ? f2 : -f2);
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this, "translationX", f2, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this, "translationX", -f2, 0.0f);
        }
        ckf.f(objectAnimator, "animator");
        objectAnimator.setDuration(200L);
        objectAnimator.start();
        MegaUtils.z(new f(z), 200L);
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.ivStatus;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(IMAGE_URL_PAUSE);
        }
        ObjectAnimator objectAnimator = this.rotateAnimation;
        if (objectAnimator == null) {
            return;
        }
        if (objectAnimator.isStarted()) {
            objectAnimator.resume();
        } else {
            objectAnimator.start();
        }
    }

    private final void initLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.audio_expand_layout, this);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.thisView = frameLayout;
            View findViewById = frameLayout.findViewById(R.id.layout_expand);
            ckf.d(findViewById);
            this.frameLayout = (FrameLayout) findViewById;
            View findViewById2 = frameLayout.findViewById(R.id.layout_expand_close);
            ckf.d(findViewById2);
            this.frameLayoutClose = (FrameLayout) findViewById2;
            View findViewById3 = findViewById(R.id.iv_cd);
            if (findViewById3 != null) {
                this.ivCD = (TUrlImageView) findViewById3;
                View findViewById4 = findViewById(R.id.img_search);
                ckf.d(findViewById4);
                TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
                tUrlImageView.setImageUrl(IMG_URL_SERCH_CLOSE);
                xhv xhvVar = xhv.INSTANCE;
                this.searchImageView = tUrlImageView;
                FrameLayout frameLayout2 = this.frameLayout;
                if (frameLayout2 != null) {
                    float f2 = frameLayout2.getLayoutParams().height / 2.0f;
                    if (f2 <= 0) {
                        f2 = 90.0f;
                    }
                    this.rightRadii = new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
                    this.leftRadii = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
                    shapeCorner();
                    View findViewById5 = findViewById(R.id.fl_cd);
                    if (findViewById5 != null) {
                        this.flCD = (FrameLayout) findViewById5;
                        View findViewById6 = findViewById(R.id.iv_close);
                        if (findViewById6 != null) {
                            this.ivClose = (TUrlImageView) findViewById6;
                            View findViewById7 = findViewById(R.id.fl_close);
                            if (findViewById7 != null) {
                                this.flClose = findViewById7;
                                View findViewById8 = findViewById(R.id.fl_close_layout);
                                if (findViewById8 != null) {
                                    this.flCloseLayout = (FrameLayout) findViewById8;
                                    View findViewById9 = findViewById(R.id.iv_status);
                                    if (findViewById9 != null) {
                                        this.ivStatus = (TUrlImageView) findViewById9;
                                        View findViewById10 = findViewById(R.id.tv_title);
                                        if (findViewById10 != null) {
                                            this.tvTitle = (TextView) findViewById10;
                                            View findViewById11 = findViewById(R.id.tv_title_close);
                                            ckf.f(findViewById11, "findViewById(R.id.tv_title_close)");
                                            this.tvTitleClose = (TextView) findViewById11;
                                            FrameLayout frameLayout3 = this.flCD;
                                            ckf.d(frameLayout3);
                                            frameLayout3.setOnClickListener(new b());
                                            View view = this.flClose;
                                            if (view != null) {
                                                ViewProxy.setOnClickListener(view, new c());
                                            }
                                            TextView textView = this.tvTitle;
                                            if (textView != null) {
                                                textView.setOnClickListener(new d());
                                                TUrlImageView tUrlImageView2 = this.ivClose;
                                                if (tUrlImageView2 != null) {
                                                    tUrlImageView2.setImageUrl(IMAGE_URL_CLOSE);
                                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ivCD, Key.ROTATION, 0.0f, 360.0f);
                                                    ckf.f(ofFloat, "rotateAnimation");
                                                    ofFloat.setDuration(l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
                                                    ofFloat.setRepeatCount(-1);
                                                    ofFloat.setInterpolator(new LinearInterpolator());
                                                    this.rotateAnimation = ofFloat;
                                                    initSize();
                                                    setBackground();
                                                    return;
                                                }
                                                ckf.y("ivClose");
                                                throw null;
                                            }
                                            ckf.y("tvTitle");
                                            throw null;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                ckf.y("frameLayout");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
