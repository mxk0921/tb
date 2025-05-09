package com.taobao.tab2interact.core.redpackage.pop;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.HashMap;
import java.util.Map;
import tb.at4;
import tb.ckf;
import tb.mqu;
import tb.rx7;
import tb.t2o;
import tb.xhv;
import tb.yey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class NewUserPop extends yey<Map<String, ? extends Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView bgImage;
    private boolean clickOnOpen;
    private ImageView closeButton;
    private final int contentWidth;
    private int currentTimeout;
    private ImageView handImage;
    private Handler handler = new a();
    private ImageView logoImage;
    private TextView nickText;
    private View openButton;
    private FrameLayout redpackageLayout;
    private LinearLayout rootView;
    private TextView tipsText;
    private TextView titleText;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/pop/NewUserPop$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            super.handleMessage(message);
            NewUserPop newUserPop = NewUserPop.this;
            NewUserPop.access$setCurrentTimeout$p(newUserPop, NewUserPop.access$getCurrentTimeout$p(newUserPop) - 1);
            if (NewUserPop.access$getCurrentTimeout$p(NewUserPop.this) > 0) {
                TextView access$getTipsText$p = NewUserPop.access$getTipsText$p(NewUserPop.this);
                access$getTipsText$p.setText(NewUserPop.access$getCurrentTimeout$p(NewUserPop.this) + "s后自动开启");
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            NewUserPop.access$onOpen(NewUserPop.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Context context) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NewUserPop.access$onOpen(NewUserPop.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(Context context) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NewUserPop.access$onClose(NewUserPop.this);
            }
        }
    }

    static {
        t2o.a(689963177);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserPop(Context context) {
        super(context);
        ckf.g(context, "context");
        this.contentWidth = at4.Companion.b(context, 750, false);
    }

    public static final /* synthetic */ int access$getCurrentTimeout$p(NewUserPop newUserPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a99c52bc", new Object[]{newUserPop})).intValue();
        }
        return newUserPop.currentTimeout;
    }

    public static final /* synthetic */ TextView access$getTipsText$p(NewUserPop newUserPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("b6a867da", new Object[]{newUserPop});
        }
        TextView textView = newUserPop.tipsText;
        if (textView != null) {
            return textView;
        }
        ckf.y("tipsText");
        throw null;
    }

    public static final /* synthetic */ void access$onClose(NewUserPop newUserPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3721ddb8", new Object[]{newUserPop});
        } else {
            newUserPop.onClose();
        }
    }

    public static final /* synthetic */ void access$onOpen(NewUserPop newUserPop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3483e9a8", new Object[]{newUserPop});
        } else {
            newUserPop.onOpen();
        }
    }

    public static final /* synthetic */ void access$setCurrentTimeout$p(NewUserPop newUserPop, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1573fce", new Object[]{newUserPop, new Integer(i)});
        } else {
            newUserPop.currentTimeout = i;
        }
    }

    public static final /* synthetic */ void access$setTipsText$p(NewUserPop newUserPop, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4e2512", new Object[]{newUserPop, textView});
        } else {
            newUserPop.tipsText = textView;
        }
    }

    private final void animateHand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29c9b77", new Object[]{this});
            return;
        }
        float c2 = at4.a.c(at4.Companion, getContext(), 20, false, 4, null);
        ImageView imageView = this.handImage;
        if (imageView != null) {
            float f = -c2;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, 0.0f), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, 0.0f));
            ofPropertyValuesHolder.setDuration(500L);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.start();
            return;
        }
        ckf.y("handImage");
        throw null;
    }

    public static /* synthetic */ Object ipc$super(NewUserPop newUserPop, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/redpackage/pop/NewUserPop");
        }
    }

    private final void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            dismiss();
        }
    }

    private final void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
            return;
        }
        this.clickOnOpen = true;
        dismiss();
    }

    @Override // tb.yey
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        this.handler.removeCallbacksAndMessages(null);
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(this.clickOnOpen ? 1 : 0));
        getDismissCallback().invoke(hashMap);
    }

    @Override // tb.yey
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        animateHand();
        checkAutoOpen();
    }

    public View onCreateView(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("288f1886", new Object[]{this, context, map});
        }
        ckf.g(context, "context");
        ckf.g(map, "data");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(this.contentWidth, -1));
        at4.a aVar = at4.Companion;
        linearLayout.setPadding(0, at4.a.c(aVar, context, 114, false, 4, null), 0, 0);
        linearLayout.setBackgroundColor(Color.argb(153, 0, 0, 0));
        linearLayout.setOrientation(1);
        xhv xhvVar = xhv.INSTANCE;
        this.rootView = linearLayout;
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        view.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = this.rootView;
        if (linearLayout2 != null) {
            linearLayout2.addView(view);
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 590, false, 4, null), at4.a.c(aVar, context, 734, false, 4, null));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
            this.redpackageLayout = frameLayout;
            LinearLayout linearLayout3 = this.rootView;
            if (linearLayout3 != null) {
                linearLayout3.addView(frameLayout);
                TUrlImageView tUrlImageView = new TUrlImageView(context);
                tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01P59yiE1iZ9pAU91nd_!!6000000004426-2-tps-1196-1468.png");
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.bgImage = tUrlImageView;
                FrameLayout frameLayout2 = this.redpackageLayout;
                if (frameLayout2 != null) {
                    frameLayout2.addView(tUrlImageView);
                    TUrlImageView tUrlImageView2 = new TUrlImageView(context);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 72, false, 4, null), at4.a.c(aVar, context, 72, false, 4, null));
                    layoutParams3.topMargin = at4.a.c(aVar, context, 89, false, 4, null);
                    layoutParams3.gravity = 1;
                    tUrlImageView2.setBackgroundDrawable(rx7.Companion.a(0, Color.parseColor("#FCC8B3"), at4.a.c(aVar, context, 2, false, 4, null), at4.a.c(aVar, context, 36, false, 4, null)));
                    tUrlImageView2.setLayoutParams(layoutParams3);
                    mqu.a aVar2 = mqu.Companion;
                    tUrlImageView2.setImageUrl(aVar2.i(aVar2.j(map, "userInfo.avatarUrl"), ""));
                    tUrlImageView2.addFeature(new RoundFeature());
                    this.logoImage = tUrlImageView2;
                    FrameLayout frameLayout3 = this.redpackageLayout;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(tUrlImageView2);
                        TextView textView = new TextView(context);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams4.gravity = 1;
                        layoutParams4.topMargin = at4.a.c(aVar, context, 177, false, 4, null);
                        textView.setTextSize(0, at4.a.c(aVar, context, 28, false, 4, null));
                        textView.setLayoutParams(layoutParams4);
                        textView.setText(aVar2.i(aVar2.j(map, "userInfo.nickName"), ""));
                        textView.setTextColor(Color.parseColor("#FCC8B3"));
                        this.nickText = textView;
                        FrameLayout frameLayout4 = this.redpackageLayout;
                        if (frameLayout4 != null) {
                            frameLayout4.addView(textView);
                            TextView textView2 = new TextView(context);
                            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams5.gravity = 1;
                            layoutParams5.topMargin = at4.a.c(aVar, context, 256, false, 4, null);
                            textView2.setTextSize(0, at4.a.c(aVar, context, 60, false, 4, null));
                            textView2.setTypeface(null, 1);
                            textView2.setLayoutParams(layoutParams5);
                            textView2.setText("送你一笔专属福利");
                            textView2.setTextColor(-1);
                            this.titleText = textView2;
                            FrameLayout frameLayout5 = this.redpackageLayout;
                            if (frameLayout5 != null) {
                                frameLayout5.addView(textView2);
                                TUrlImageView tUrlImageView3 = new TUrlImageView(context);
                                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 150, false, 4, null), at4.a.c(aVar, context, 150, false, 4, null));
                                layoutParams6.gravity = 85;
                                layoutParams6.rightMargin = at4.a.c(aVar, context, 130, false, 4, null);
                                layoutParams6.bottomMargin = at4.a.c(aVar, context, 70, false, 4, null);
                                tUrlImageView3.setLayoutParams(layoutParams6);
                                tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016bVBav1OliN6EiXl0_!!6000000001746-2-tps-300-300.png");
                                this.handImage = tUrlImageView3;
                                FrameLayout frameLayout6 = this.redpackageLayout;
                                if (frameLayout6 != null) {
                                    frameLayout6.addView(tUrlImageView3);
                                    TextView textView3 = new TextView(context);
                                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
                                    layoutParams7.gravity = 81;
                                    layoutParams7.bottomMargin = at4.a.c(aVar, context, 30, false, 4, null);
                                    textView3.setLayoutParams(layoutParams7);
                                    textView3.setTextColor(-1);
                                    textView3.setTextSize(0, at4.a.c(aVar, context, 18, false, 4, null));
                                    this.tipsText = textView3;
                                    FrameLayout frameLayout7 = this.redpackageLayout;
                                    if (frameLayout7 != null) {
                                        frameLayout7.addView(textView3);
                                        View view2 = new View(context);
                                        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 150, false, 4, null), at4.a.c(aVar, context, 150, false, 4, null));
                                        layoutParams8.bottomMargin = at4.a.c(aVar, context, Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR), false, 4, null);
                                        layoutParams8.gravity = 81;
                                        view2.setLayoutParams(layoutParams8);
                                        ViewProxy.setOnClickListener(view2, new b(context));
                                        this.openButton = view2;
                                        FrameLayout frameLayout8 = this.redpackageLayout;
                                        if (frameLayout8 != null) {
                                            frameLayout8.addView(view2);
                                            TUrlImageView tUrlImageView4 = new TUrlImageView(context);
                                            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 72, false, 4, null), at4.a.c(aVar, context, 72, false, 4, null));
                                            layoutParams9.gravity = 1;
                                            layoutParams9.topMargin = at4.a.c(aVar, context, 42, false, 4, null);
                                            tUrlImageView4.setLayoutParams(layoutParams9);
                                            tUrlImageView4.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN014Ox3dR1OxAGy4cTAH_!!6000000001771-2-tps-73-72.png");
                                            tUrlImageView4.setOnClickListener(new c(context));
                                            this.closeButton = tUrlImageView4;
                                            LinearLayout linearLayout4 = this.rootView;
                                            if (linearLayout4 != null) {
                                                linearLayout4.addView(tUrlImageView4);
                                                View view3 = new View(context);
                                                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                                                layoutParams10.weight = 1.0f;
                                                view3.setLayoutParams(layoutParams10);
                                                LinearLayout linearLayout5 = this.rootView;
                                                if (linearLayout5 != null) {
                                                    linearLayout5.addView(view3);
                                                    LinearLayout linearLayout6 = this.rootView;
                                                    if (linearLayout6 != null) {
                                                        return linearLayout6;
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
                                        ckf.y("redpackageLayout");
                                        throw null;
                                    }
                                    ckf.y("redpackageLayout");
                                    throw null;
                                }
                                ckf.y("redpackageLayout");
                                throw null;
                            }
                            ckf.y("redpackageLayout");
                            throw null;
                        }
                        ckf.y("redpackageLayout");
                        throw null;
                    }
                    ckf.y("redpackageLayout");
                    throw null;
                }
                ckf.y("redpackageLayout");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }

    private final void checkAutoOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335485c8", new Object[]{this});
            return;
        }
        mqu.a aVar = mqu.Companion;
        int d = aVar.d(aVar.j(getData(), "userPop.autoOpenTime"), 0);
        if (d > 0) {
            this.currentTimeout = d;
            this.handler.sendEmptyMessageDelayed(1, 1000L);
        }
    }
}
