package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.a1v;
import tb.brf;
import tb.ckf;
import tb.jpu;
import tb.kew;
import tb.t2o;
import tb.tuc;
import tb.wh6;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023ImageViewer extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f3326a;
    public TextView c;
    public ViewPager d;
    public int f;
    public View g;
    public ShopDataParser h;
    public int e = -1;
    public final List<a> i = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class MyAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Shop2023ImageViewer f3330a;

        static {
            t2o.a(766510375);
        }

        public MyAdapter(Shop2023ImageViewer shop2023ImageViewer) {
            ckf.g(shop2023ImageViewer, "this$0");
            this.f3330a = shop2023ImageViewer;
        }

        public static /* synthetic */ Object ipc$super(MyAdapter myAdapter, String str, Object... objArr) {
            if (str.hashCode() == -2093417530) {
                super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023ImageViewer$MyAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            ckf.g(viewGroup, "container");
            if (obj != null) {
                View view = (View) obj;
                viewGroup.removeView(view);
                if (view.getTag() instanceof tuc) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        ((tuc) tag).onDestroyed();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IMiniVideo");
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return Shop2023ImageViewer.v2(this.f3330a).size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            ckf.g(viewGroup, "container");
            Shop2023ImageViewer shop2023ImageViewer = this.f3330a;
            Context context = viewGroup.getContext();
            ckf.f(context, "container.context");
            ItemView itemView = new ItemView(shop2023ImageViewer, context, (a) Shop2023ImageViewer.v2(this.f3330a).get(i));
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                itemView.setLayoutParams(layoutParams);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.width = -1;
                marginLayoutParams2.height = -1;
                xhv xhvVar = xhv.INSTANCE;
                itemView.setLayoutParams(marginLayoutParams2);
            }
            viewGroup.addView(itemView);
            return itemView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            return ckf.b(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            super.setPrimaryItem(viewGroup, i, obj);
            if (Shop2023ImageViewer.p2(this.f3330a) != i) {
                View r2 = Shop2023ImageViewer.r2(this.f3330a);
                Object obj2 = null;
                if ((r2 == null ? null : r2.getTag()) instanceof tuc) {
                    View r22 = Shop2023ImageViewer.r2(this.f3330a);
                    Object tag = r22 == null ? null : r22.getTag();
                    if (tag != null) {
                        ((tuc) tag).pause();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IMiniVideo");
                    }
                }
                Shop2023ImageViewer.z2(this.f3330a, i);
                Shop2023ImageViewer.A2(this.f3330a, obj instanceof View ? (View) obj : null);
                View r23 = Shop2023ImageViewer.r2(this.f3330a);
                if ((r23 == null ? null : r23.getTag()) instanceof tuc) {
                    View r24 = Shop2023ImageViewer.r2(this.f3330a);
                    if (r24 != null) {
                        obj2 = r24.getTag();
                    }
                    if (obj2 != null) {
                        ((tuc) obj2).play();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IMiniVideo");
                    }
                }
                a aVar = (a) Shop2023ImageViewer.v2(this.f3330a).get(i);
                Shop2023ImageViewer.B2(this.f3330a, aVar.a(), aVar.b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f3331a;
        public final String b;

        static {
            t2o.a(766510370);
        }

        public a(String str, String str2) {
            ckf.g(str, "type");
            ckf.g(str2, "url");
            this.f3331a = str;
            this.b = str2;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.f3331a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.b;
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
            } else {
                Shop2023ImageViewer.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ViewGroup s2 = Shop2023ImageViewer.s2(Shop2023ImageViewer.this);
            if (s2 != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    s2.setAlpha(((Float) animatedValue).floatValue());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    static {
        t2o.a(766510369);
    }

    public static final /* synthetic */ void A2(Shop2023ImageViewer shop2023ImageViewer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3c44f1", new Object[]{shop2023ImageViewer, view});
        } else {
            shop2023ImageViewer.g = view;
        }
    }

    public static final /* synthetic */ void B2(Shop2023ImageViewer shop2023ImageViewer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3478923", new Object[]{shop2023ImageViewer, str, str2});
        } else {
            shop2023ImageViewer.M2(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(Shop2023ImageViewer shop2023ImageViewer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 2089880052) {
            super.onDismiss((DialogInterface) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023ImageViewer");
        }
    }

    public static final /* synthetic */ int p2(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d205af26", new Object[]{shop2023ImageViewer})).intValue();
        }
        return shop2023ImageViewer.e;
    }

    public static final /* synthetic */ View r2(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("865a88cf", new Object[]{shop2023ImageViewer});
        }
        return shop2023ImageViewer.g;
    }

    public static final /* synthetic */ ViewGroup s2(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2ce73a12", new Object[]{shop2023ImageViewer});
        }
        return shop2023ImageViewer.f3326a;
    }

    public static final /* synthetic */ TextView u2(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("620c9aa6", new Object[]{shop2023ImageViewer});
        }
        return shop2023ImageViewer.c;
    }

    public static final /* synthetic */ List v2(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7748bc05", new Object[]{shop2023ImageViewer});
        }
        return shop2023ImageViewer.i;
    }

    public static final /* synthetic */ void z2(Shop2023ImageViewer shop2023ImageViewer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaefa4", new Object[]{shop2023ImageViewer, new Integer(i)});
        } else {
            shop2023ImageViewer.e = i;
        }
    }

    public final HashMap<String, String> C2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6b54a579", new Object[]{this, str, str2});
        }
        ShopDataParser shopDataParser = this.h;
        if (shopDataParser == null) {
            return new HashMap<>();
        }
        HashMap<String, String> l1 = shopDataParser.l1();
        l1.put("shop_id", shopDataParser.W0());
        l1.put("seller_id", shopDataParser.N0());
        l1.put("btn_type", str);
        l1.put("return", str2);
        return l1;
    }

    public final Shop2023ImageViewer E2(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023ImageViewer) ipChange.ipc$dispatch("a5aa7d79", new Object[]{this, shopDataParser});
        }
        this.h = shopDataParser;
        return this;
    }

    public final void J2(Context context, String str) {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa33c00e", new Object[]{this, context, str});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "data");
        Bundle bundle = new Bundle();
        bundle.putString("data", str);
        setArguments(bundle);
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            show(fragmentActivity.getSupportFragmentManager(), "");
        }
    }

    public final void K2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3566b57", new Object[]{this, str, str2});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, "Page_Shop_Os_Heidengye_click", C2(str, str2));
        }
    }

    public final void M2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f82cab", new Object[]{this, str, str2});
        } else {
            a1v.n(ShopConstants.PAGE_SHOP, "Page_Shop_Os_Heidengye_exp", C2(str, str2));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.ShopFullScreenDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        D2();
        initView();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new c());
        ofFloat.start();
        ViewGroup viewGroup2 = this.f3326a;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(0.0f);
        }
        return this.f3326a;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        View view = this.g;
        Object obj = null;
        if ((view == null ? null : view.getTag()) instanceof tuc) {
            View view2 = this.g;
            if (view2 != null) {
                obj = view2.getTag();
            }
            if (obj != null) {
                ((tuc) obj).onDestroyed();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IMiniVideo");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ItemView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ImageView ivImage;
        private TUrlImageView ivPlay;
        private ProgressBar progressBar;
        public final /* synthetic */ Shop2023ImageViewer this$0;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements xpd.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.xpd.c
            public void p(String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4d37024", new Object[]{this, str, jSONObject});
                } else if (ckf.b(str, "onPause")) {
                    TUrlImageView access$getIvPlay$p = ItemView.access$getIvPlay$p(ItemView.this);
                    if (access$getIvPlay$p != null) {
                        kew.g0(access$getIvPlay$p);
                    } else {
                        ckf.y("ivPlay");
                        throw null;
                    }
                } else if (ckf.b(str, "onPlay")) {
                    TUrlImageView access$getIvPlay$p2 = ItemView.access$getIvPlay$p(ItemView.this);
                    if (access$getIvPlay$p2 != null) {
                        kew.C(access$getIvPlay$p2);
                        ProgressBar access$getProgressBar$p = ItemView.access$getProgressBar$p(ItemView.this);
                        if (access$getProgressBar$p != null) {
                            kew.C(access$getProgressBar$p);
                        } else {
                            ckf.y("progressBar");
                            throw null;
                        }
                    } else {
                        ckf.y("ivPlay");
                        throw null;
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ tuc f3328a;

            public b(tuc tucVar) {
                this.f3328a = tucVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    this.f3328a.pause();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ tuc f3329a;

            public c(tuc tucVar) {
                this.f3329a = tucVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    this.f3329a.play();
                }
            }
        }

        static {
            t2o.a(766510371);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemView(Shop2023ImageViewer shop2023ImageViewer, Context context, a aVar) {
            super(context);
            ckf.g(shop2023ImageViewer, "this$0");
            ckf.g(context, "context");
            ckf.g(aVar, "info");
            this.this$0 = shop2023ImageViewer;
            String b2 = aVar.b();
            if (ckf.b(aVar.a(), "image")) {
                ImageView shopGestureImageView = new ShopGestureImageView(context);
                ViewGroup.LayoutParams layoutParams = shopGestureImageView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    shopGestureImageView.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    xhv xhvVar = xhv.INSTANCE;
                    shopGestureImageView.setLayoutParams(marginLayoutParams);
                }
                setIvImage(shopGestureImageView);
                ViewGroup.LayoutParams layoutParams2 = shopGestureImageView.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.width = -1;
                    marginLayoutParams2.height = -1;
                    shopGestureImageView.setLayoutParams(layoutParams2);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams3.width = -1;
                    marginLayoutParams3.height = -1;
                    xhv xhvVar2 = xhv.INSTANCE;
                    shopGestureImageView.setLayoutParams(marginLayoutParams3);
                }
                kew.J(shopGestureImageView, b2);
                addView(shopGestureImageView);
                return;
            }
            addPlayer(this, b2);
        }

        public static final /* synthetic */ TUrlImageView access$getIvPlay$p(ItemView itemView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("48d8680a", new Object[]{itemView});
            }
            return itemView.ivPlay;
        }

        public static final /* synthetic */ ProgressBar access$getProgressBar$p(ItemView itemView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProgressBar) ipChange.ipc$dispatch("613aabd1", new Object[]{itemView});
            }
            return itemView.progressBar;
        }

        public static /* synthetic */ Object ipc$super(ItemView itemView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023ImageViewer$ItemView");
        }

        public final ImageView getIvImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageView) ipChange.ipc$dispatch("fe9d57f1", new Object[]{this});
            }
            ImageView imageView = this.ivImage;
            if (imageView != null) {
                return imageView;
            }
            ckf.y("ivImage");
            throw null;
        }

        public final void setIvImage(ImageView imageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("655b09ed", new Object[]{this, imageView});
                return;
            }
            ckf.g(imageView, "<set-?>");
            this.ivImage = imageView;
        }

        private final void addPlayer(ItemView itemView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227f28fd", new Object[]{this, itemView, str});
                return;
            }
            xpd miniVideoView = ShopLoftViewManager.getMiniVideoView();
            if (miniVideoView != null) {
                tuc tucVar = (tuc) miniVideoView;
                tucVar.setAspectRatio(MediaAspectRatio.DW_FIT_CENTER);
                FrameLayout.LayoutParams layoutParams = null;
                tucVar.initWithData(itemView.getContext(), brf.a(jpu.a("videoUrl", str)), new a(), null);
                View view = tucVar.getView();
                ckf.d(view);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    view.setLayoutParams(layoutParams2);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    xhv xhvVar = xhv.INSTANCE;
                    view.setLayoutParams(marginLayoutParams);
                }
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 == null) {
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams5.width = -1;
                    layoutParams5.height = -2;
                    layoutParams5.gravity = 17;
                    xhv xhvVar2 = xhv.INSTANCE;
                    view.setLayoutParams(layoutParams5);
                } else {
                    layoutParams4.width = -1;
                    layoutParams4.height = -2;
                    layoutParams4.gravity = 17;
                }
                ViewProxy.setOnClickListener(view, new b(tucVar));
                itemView.addView(view);
                xhv xhvVar3 = xhv.INSTANCE;
                TUrlImageView tUrlImageView = new TUrlImageView(itemView.getContext());
                ViewGroup.LayoutParams layoutParams6 = tUrlImageView.getLayoutParams();
                if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                    tUrlImageView.setLayoutParams(layoutParams6);
                } else {
                    tUrlImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                }
                this.ivPlay = tUrlImageView;
                kew.C(tUrlImageView);
                ViewGroup.LayoutParams layoutParams7 = tUrlImageView.getLayoutParams();
                FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
                if (layoutParams8 == null) {
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams9.width = kew.v(100);
                    layoutParams9.height = kew.v(100);
                    layoutParams9.gravity = 17;
                    tUrlImageView.setLayoutParams(layoutParams9);
                } else {
                    layoutParams8.width = kew.v(100);
                    layoutParams8.height = kew.v(100);
                    layoutParams8.gravity = 17;
                }
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01uhGFKU1RNOH8xQCj6_!!6000000002099-2-tps-400-400.png");
                tUrlImageView.setOnClickListener(new c(tucVar));
                itemView.addView(tUrlImageView);
                ProgressBar progressBar = new ProgressBar(itemView.getContext());
                ViewGroup.LayoutParams layoutParams10 = progressBar.getLayoutParams();
                if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
                    progressBar.setLayoutParams(layoutParams10);
                } else {
                    progressBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                }
                this.progressBar = progressBar;
                ViewGroup.LayoutParams layoutParams11 = progressBar.getLayoutParams();
                if (layoutParams11 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams11;
                }
                if (layoutParams == null) {
                    FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams12.width = kew.v(50);
                    layoutParams12.height = kew.v(50);
                    layoutParams12.gravity = 17;
                    progressBar.setLayoutParams(layoutParams12);
                } else {
                    layoutParams.width = kew.v(50);
                    layoutParams.height = kew.v(50);
                    layoutParams.gravity = 17;
                }
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(-5592406));
                itemView.addView(progressBar);
                itemView.setTag(tucVar);
                tucVar.mute(false);
                tucVar.prepareToFirstFrame();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IMiniVideo");
        }
    }

    public final void D2() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be2ab04", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSON.parseObject(getArguments().getString("data"));
        if (!(parseObject == null || (jSONObject2 = parseObject.getJSONObject("browserData")) == null)) {
            i = jSONObject2.getIntValue("activeIndex");
        }
        this.f = i;
        if (!(parseObject == null || (jSONObject = parseObject.getJSONObject("browserData")) == null || (jSONArray = jSONObject.getJSONArray("contentList")) == null)) {
            for (Object obj : jSONArray) {
                if (obj != null) {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    String string = jSONObject3.getString("type");
                    List<a> list = this.i;
                    ckf.f(string, "type");
                    String string2 = jSONObject3.getString("url");
                    ckf.f(string2, "item.getString(\"url\")");
                    ((ArrayList) list).add(new a(string, string2));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        a aVar = (a) ((ArrayList) this.i).get(this.f);
        K2(aVar.a(), aVar.b());
    }

    public final void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(-16777216);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            frameLayout.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.setLayoutParams(marginLayoutParams2);
        }
        this.f3326a = frameLayout;
        ViewPager viewPager = new ViewPager(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            viewPager.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar2 = xhv.INSTANCE;
            viewPager.setLayoutParams(marginLayoutParams3);
        }
        this.d = viewPager;
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(new MyAdapter(this));
        frameLayout.addView(viewPager);
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams3 = tUrlImageView.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams4);
        }
        ViewGroup.LayoutParams layoutParams4 = tUrlImageView.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams5.width = kew.v(66);
            marginLayoutParams5.height = kew.v(66);
            Context context = tUrlImageView.getContext();
            ckf.f(context, "context");
            marginLayoutParams5.topMargin = kew.y(context);
            tUrlImageView.setLayoutParams(layoutParams4);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams6.width = kew.v(66);
            marginLayoutParams6.height = kew.v(66);
            Context context2 = tUrlImageView.getContext();
            ckf.f(context2, "context");
            marginLayoutParams6.topMargin = kew.y(context2);
            xhv xhvVar4 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams6);
        }
        int v = kew.v(6);
        tUrlImageView.setPadding(v, v, v, v);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01veFzJg1GGYWcBCdcm_!!6000000000595-2-tps-108-108.png");
        tUrlImageView.setOnClickListener(new b());
        frameLayout.addView(tUrlImageView);
        TextView textView = new TextView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar5 = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams7);
        }
        this.c = textView;
        ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams7 == null) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams8.gravity = 5;
            layoutParams8.topMargin = kew.v(Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR));
            layoutParams8.rightMargin = kew.v(24);
            xhv xhvVar6 = xhv.INSTANCE;
            textView.setLayoutParams(layoutParams8);
        } else {
            layoutParams7.gravity = 5;
            layoutParams7.topMargin = kew.v(Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR));
            layoutParams7.rightMargin = kew.v(24);
        }
        textView.setTextColor(-1);
        kew.c0(textView, kew.v(26));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f + 1);
        sb.append(wh6.DIR);
        sb.append(((ArrayList) this.i).size());
        textView.setText(sb.toString());
        frameLayout.addView(textView);
        ViewPager viewPager2 = this.d;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023ImageViewer$initView$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    TextView u2 = Shop2023ImageViewer.u2(Shop2023ImageViewer.this);
                    if (u2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i + 1);
                        sb2.append(wh6.DIR);
                        sb2.append(Shop2023ImageViewer.v2(Shop2023ImageViewer.this).size());
                        u2.setText(sb2.toString());
                    }
                }
            });
        }
        ViewPager viewPager3 = this.d;
        if (viewPager3 != null) {
            viewPager3.setCurrentItem(this.f);
        }
    }
}
