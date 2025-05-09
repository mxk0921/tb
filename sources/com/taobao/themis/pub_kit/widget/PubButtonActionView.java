package com.taobao.themis.pub_kit.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import kotlin.Metadata;
import tb.ckf;
import tb.p8s;
import tb.t2o;
import tb.xcs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/pub_kit/widget/PubButtonActionView;", "Landroid/widget/FrameLayout;", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;", "theme", "", "getIconByStyle", "(Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;)Ljava/lang/String;", "Ltb/xhv;", "setTheme", "(Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;)V", "lightIcon", "darkIcon", "setButtonIcon", "(Ljava/lang/String;Ljava/lang/String;)V", "mLightIcon", "Ljava/lang/String;", "mDarkIcon", "mTheme", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;", "Landroid/widget/ImageView;", "mImageView", "Landroid/widget/ImageView;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubButtonActionView extends FrameLayout implements IActionViewTheme {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GradientDrawable backgroundDrawable;
    private String mDarkIcon;
    private final ImageView mImageView;
    private String mLightIcon;
    private IActionViewTheme.Theme mTheme = IActionViewTheme.Theme.DARK;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(845152407);
            int[] iArr = new int[IActionViewTheme.Theme.values().length];
            iArr[IActionViewTheme.Theme.LIGHT.ordinal()] = 1;
            iArr[IActionViewTheme.Theme.DARK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(845152406);
        t2o.a(845152399);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubButtonActionView(Context context) {
        super(context);
        ckf.g(context, "context");
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xcs.a(context, 20.0f), xcs.a(context, 20.0f));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        this.mImageView = imageView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        IActionViewTheme.a aVar = IActionViewTheme.Companion;
        gradientDrawable.setColor(aVar.a());
        gradientDrawable.setStroke(xcs.a(context, 0.6f), aVar.c());
        gradientDrawable.setCornerRadius(xcs.a(context, 4.0f));
        this.backgroundDrawable = gradientDrawable;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xcs.a(context, 28.0f), xcs.a(context, 28.0f));
        layoutParams2.setMargins(xcs.a(context, 12.0f), 0, 0, 0);
        setLayoutParams(layoutParams2);
        setBackground(gradientDrawable);
        addView(imageView);
    }

    private final String getIconByStyle(IActionViewTheme.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8477a15", new Object[]{this, theme});
        }
        String str = this.mLightIcon;
        if (str == null || str.length() == 0) {
            return this.mDarkIcon;
        }
        String str2 = this.mDarkIcon;
        if (str2 == null || str2.length() == 0) {
            return this.mLightIcon;
        }
        int i = a.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return this.mDarkIcon;
        }
        if (i != 2) {
            return this.mLightIcon;
        }
        return this.mLightIcon;
    }

    public static /* synthetic */ Object ipc$super(PubButtonActionView pubButtonActionView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/widget/PubButtonActionView");
    }

    public final void setButtonIcon(String str, String str2) {
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f184a5e8", new Object[]{this, str, str2});
        } else if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            this.mLightIcon = str;
            this.mDarkIcon = str2;
            this.mImageView.setVisibility(0);
            String iconByStyle = getIconByStyle(this.mTheme);
            if (iconByStyle != null && iconByStyle.length() != 0 && (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) != null) {
                iImageAdapter.setImageUrl(this.mImageView, iconByStyle, null);
            }
        }
    }

    public void setTheme(IActionViewTheme.Theme theme) {
        IImageAdapter iImageAdapter;
        IImageAdapter iImageAdapter2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98afbc8f", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "theme");
        this.mTheme = theme;
        int i = a.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            GradientDrawable gradientDrawable = this.backgroundDrawable;
            IActionViewTheme.a aVar = IActionViewTheme.Companion;
            gradientDrawable.setColor(aVar.b());
            this.backgroundDrawable.setStroke(xcs.a(getContext(), 0.6f), aVar.d());
            String iconByStyle = getIconByStyle(theme);
            if (iconByStyle != null && (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) != null) {
                iImageAdapter.setImageUrl(this.mImageView, iconByStyle, null);
            }
        } else if (i == 2) {
            GradientDrawable gradientDrawable2 = this.backgroundDrawable;
            IActionViewTheme.a aVar2 = IActionViewTheme.Companion;
            gradientDrawable2.setColor(aVar2.a());
            this.backgroundDrawable.setStroke(xcs.a(getContext(), 0.6f), aVar2.c());
            String iconByStyle2 = getIconByStyle(theme);
            if (iconByStyle2 != null && (iImageAdapter2 = (IImageAdapter) p8s.b(IImageAdapter.class)) != null) {
                iImageAdapter2.setImageUrl(this.mImageView, iconByStyle2, null);
            }
        }
    }
}
