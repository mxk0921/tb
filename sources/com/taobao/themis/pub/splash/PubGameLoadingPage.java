package com.taobao.themis.pub.splash;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import com.taobao.weex.utils.WXUtils;
import kotlin.Metadata;
import tb.ckf;
import tb.p8s;
import tb.qmc;
import tb.s0m;
import tb.t2o;
import tb.xxl;
import tb.zk4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0015R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lcom/taobao/themis/pub/splash/PubGameLoadingPage;", "Landroid/widget/RelativeLayout;", "Ltb/qmc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "image", "", MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, "Ltb/xhv;", "setImage", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "setLogo", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, "(Landroid/graphics/drawable/Drawable;)V", "name", "setAppName", "", xxl.PERCENT, "setProcess", "(F)V", "developer", "setDeveloper", "Landroid/view/View;", "mAppLogoWrapper", "Landroid/view/View;", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mIVLogo", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "Landroid/widget/TextView;", "mTVAppName", "Landroid/widget/TextView;", "mTVRateOfProgress", "mTVFrom", "mLogo", "Ljava/lang/String;", "mName", "themis_pub_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubGameLoadingPage extends RelativeLayout implements qmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final View mAppLogoWrapper;
    private final TUrlImageView mIVLogo;
    private String mLogo;
    private String mName;
    private final TextView mTVAppName;
    private final TextView mTVFrom;
    private final TextView mTVRateOfProgress;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements IImageAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f13692a;
        public final /* synthetic */ PubGameLoadingPage b;

        public a(ImageView imageView, PubGameLoadingPage pubGameLoadingPage) {
            this.f13692a = imageView;
            this.b = pubGameLoadingPage;
        }

        @Override // com.taobao.themis.kernel.adapter.IImageAdapter.a
        public void onImageFinish(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782fcf9a", new Object[]{this, drawable});
            } else if (drawable instanceof BitmapDrawable) {
                this.f13692a.setImageDrawable(drawable);
                if (this.f13692a.getContext() instanceof Activity) {
                    ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(PubGameLoadingPage.access$getMName$p(this.b), ((BitmapDrawable) drawable).getBitmap());
                    Context context = this.f13692a.getContext();
                    if (context != null) {
                        ((Activity) context).setTaskDescription(taskDescription);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    static {
        t2o.a(844103710);
        t2o.a(835715168);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubGameLoadingPage(Context context) {
        super(context);
        ckf.g(context, "context");
        View.inflate(getContext(), R.layout.tms_game_loading_view, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = findViewById(R.id.appLogo);
        ckf.f(findViewById, "findViewById(R.id.appLogo)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        this.mIVLogo = tUrlImageView;
        View findViewById2 = findViewById(R.id.appName);
        ckf.f(findViewById2, "findViewById(R.id.appName)");
        this.mTVAppName = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.rateOfProgress);
        ckf.f(findViewById3, "findViewById(R.id.rateOfProgress)");
        this.mTVRateOfProgress = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.from);
        ckf.f(findViewById4, "findViewById(R.id.from)");
        this.mTVFrom = (TextView) findViewById4;
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.tms_iv_background);
        if (tUrlImageView2 != null) {
            s0m.B().U("common", "https://ossgw.alicdn.com/taobao-miniapp/game/configImg/triver_game_loading_background_1.png").into(tUrlImageView2);
        }
        TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById(R.id.appLogoBackGround);
        if (tUrlImageView3 != null) {
            s0m.B().U("common", "https://ossgw.alicdn.com/taobao-miniapp/game/configImg/game_logo_loading.png").into(tUrlImageView3);
        }
        View findViewById5 = findViewById(R.id.appLogoWrapper);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        findViewById5.startAnimation(rotateAnimation);
        this.mAppLogoWrapper = findViewById5;
        tUrlImageView.addFeature(new RoundFeature());
        setClickable(true);
    }

    public static final /* synthetic */ String access$getMName$p(PubGameLoadingPage pubGameLoadingPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("336f6c70", new Object[]{pubGameLoadingPage});
        }
        return pubGameLoadingPage.mName;
    }

    public static /* synthetic */ Object ipc$super(PubGameLoadingPage pubGameLoadingPage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/splash/PubGameLoadingPage");
    }

    private final void setImage(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96f8524", new Object[]{this, imageView, str});
            return;
        }
        Object g = p8s.g(IImageAdapter.class);
        ckf.f(g, "getNotNull(IImageAdapter::class.java)");
        ((IImageAdapter) g).loadImage(str, null, new a(imageView, this));
    }

    @Override // tb.qmc
    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "name");
        this.mName = str;
        this.mTVAppName.setText(str);
    }

    @Override // tb.qmc
    public void setDeveloper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9dfe19", new Object[]{this, str});
            return;
        }
        ckf.g(str, "developer");
        TextView textView = this.mTVFrom;
        textView.setText("小游戏由 " + str + " 提供");
    }

    @Override // tb.qmc
    public void setLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
            return;
        }
        ckf.g(str, MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        if (!TextUtils.equals(str, this.mLogo)) {
            setImage(this.mIVLogo, str);
            this.mLogo = str;
        }
    }

    public void setProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36908c", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mTVRateOfProgress;
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(WXUtils.PERCENT);
        textView.setText(sb.toString());
    }

    public void setLogo(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfeeb458", new Object[]{this, drawable});
            return;
        }
        ckf.g(drawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        this.mIVLogo.setImageDrawable(drawable);
        ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(this.mName, ((BitmapDrawable) drawable).getBitmap());
        Context context = this.mIVLogo.getContext();
        if (context != null) {
            ((Activity) context).setTaskDescription(taskDescription);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubGameLoadingPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attributeSet");
        View.inflate(getContext(), R.layout.tms_game_loading_view, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = findViewById(R.id.appLogo);
        ckf.f(findViewById, "findViewById(R.id.appLogo)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        this.mIVLogo = tUrlImageView;
        View findViewById2 = findViewById(R.id.appName);
        ckf.f(findViewById2, "findViewById(R.id.appName)");
        this.mTVAppName = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.rateOfProgress);
        ckf.f(findViewById3, "findViewById(R.id.rateOfProgress)");
        this.mTVRateOfProgress = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.from);
        ckf.f(findViewById4, "findViewById(R.id.from)");
        this.mTVFrom = (TextView) findViewById4;
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.tms_iv_background);
        if (tUrlImageView2 != null) {
            s0m.B().U("common", "https://ossgw.alicdn.com/taobao-miniapp/game/configImg/triver_game_loading_background_1.png").into(tUrlImageView2);
        }
        TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById(R.id.appLogoBackGround);
        if (tUrlImageView3 != null) {
            s0m.B().U("common", "https://ossgw.alicdn.com/taobao-miniapp/game/configImg/game_logo_loading.png").into(tUrlImageView3);
        }
        View findViewById5 = findViewById(R.id.appLogoWrapper);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        findViewById5.startAnimation(rotateAnimation);
        this.mAppLogoWrapper = findViewById5;
        tUrlImageView.addFeature(new RoundFeature());
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubGameLoadingPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attributeSet");
        View.inflate(getContext(), R.layout.tms_game_loading_view, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = findViewById(R.id.appLogo);
        ckf.f(findViewById, "findViewById(R.id.appLogo)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        this.mIVLogo = tUrlImageView;
        View findViewById2 = findViewById(R.id.appName);
        ckf.f(findViewById2, "findViewById(R.id.appName)");
        this.mTVAppName = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.rateOfProgress);
        ckf.f(findViewById3, "findViewById(R.id.rateOfProgress)");
        this.mTVRateOfProgress = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.from);
        ckf.f(findViewById4, "findViewById(R.id.from)");
        this.mTVFrom = (TextView) findViewById4;
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.tms_iv_background);
        if (tUrlImageView2 != null) {
            s0m.B().U("common", "https://ossgw.alicdn.com/taobao-miniapp/game/configImg/triver_game_loading_background_1.png").into(tUrlImageView2);
        }
        TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById(R.id.appLogoBackGround);
        if (tUrlImageView3 != null) {
            s0m.B().U("common", "https://ossgw.alicdn.com/taobao-miniapp/game/configImg/game_logo_loading.png").into(tUrlImageView3);
        }
        View findViewById5 = findViewById(R.id.appLogoWrapper);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        findViewById5.startAnimation(rotateAnimation);
        this.mAppLogoWrapper = findViewById5;
        tUrlImageView.addFeature(new RoundFeature());
        setClickable(true);
    }
}
