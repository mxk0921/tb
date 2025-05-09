package com.taobao.themis.pub.splash;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.ProgressView;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import kotlin.Metadata;
import tb.ckf;
import tb.p8s;
import tb.qmc;
import tb.t2o;
import tb.xxl;
import tb.zk4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0015R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,¨\u0006."}, d2 = {"Lcom/taobao/themis/pub/splash/PubLoadingPage;", "Landroid/widget/RelativeLayout;", "Ltb/qmc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "image", "", MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, "Ltb/xhv;", "setImage", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "setLogo", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, "(Landroid/graphics/drawable/Drawable;)V", "name", "setAppName", "", xxl.PERCENT, "setProcess", "(F)V", "developer", "setDeveloper", "Lcom/taobao/themis/container/splash/ProgressView;", "mProgressView", "Lcom/taobao/themis/container/splash/ProgressView;", "Landroid/widget/TextView;", "mTips", "Landroid/widget/TextView;", "mTextView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mImageView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "mName", "Ljava/lang/String;", "mLogo", "themis_pub_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubLoadingPage extends RelativeLayout implements qmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TUrlImageView mImageView;
    private String mLogo;
    private String mName;
    private final ProgressView mProgressView;
    private final TextView mTextView;
    private final TextView mTips;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements IImageAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f13693a;
        public final /* synthetic */ PubLoadingPage b;

        public a(ImageView imageView, PubLoadingPage pubLoadingPage) {
            this.f13693a = imageView;
            this.b = pubLoadingPage;
        }

        @Override // com.taobao.themis.kernel.adapter.IImageAdapter.a
        public void onImageFinish(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782fcf9a", new Object[]{this, drawable});
            } else if (drawable instanceof BitmapDrawable) {
                this.f13693a.setImageDrawable(drawable);
                if (this.f13693a.getContext() instanceof Activity) {
                    ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(PubLoadingPage.access$getMName$p(this.b), ((BitmapDrawable) drawable).getBitmap());
                    Context context = this.f13693a.getContext();
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
        t2o.a(844103713);
        t2o.a(835715168);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingPage(Context context) {
        super(context);
        ckf.g(context, "context");
        View.inflate(getContext(), R.layout.tms_pub_loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.tips);
        ckf.f(findViewById, "findViewById(R.id.tips)");
        this.mTips = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progressView);
        ProgressView progressView = (ProgressView) findViewById2;
        progressView.setDotMargin(4.5f);
        progressView.setDotSize(3.0f);
        ckf.f(findViewById2, "findViewById<ProgressVie… setDotSize(3f)\n        }");
        this.mProgressView = (ProgressView) findViewById2;
        View findViewById3 = findViewById(R.id.appName);
        TextView textView = (TextView) findViewById3;
        if (!TextUtils.isEmpty(this.mName)) {
            textView.setText(this.mName);
        }
        ckf.f(findViewById3, "findViewById<TextView?>(…e\n            }\n        }");
        this.mTextView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.appLogo);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.addFeature(new RoundFeature());
        if (!TextUtils.isEmpty(this.mLogo)) {
            String str = this.mLogo;
            ckf.d(str);
            setImage(tUrlImageView, str);
        }
        ckf.f(findViewById4, "findViewById<TUrlImageVi…)\n            }\n        }");
        this.mImageView = (TUrlImageView) findViewById4;
    }

    public static final /* synthetic */ String access$getMName$p(PubLoadingPage pubLoadingPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acde5642", new Object[]{pubLoadingPage});
        }
        return pubLoadingPage.mName;
    }

    public static /* synthetic */ Object ipc$super(PubLoadingPage pubLoadingPage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/splash/PubLoadingPage");
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
        this.mTextView.setText(str);
    }

    @Override // tb.qmc
    public void setDeveloper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9dfe19", new Object[]{this, str});
        } else {
            ckf.g(str, "developer");
        }
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
            setImage(this.mImageView, str);
            this.mLogo = str;
        }
    }

    public void setProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36908c", new Object[]{this, new Float(f)});
        }
    }

    public void setLogo(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfeeb458", new Object[]{this, drawable});
            return;
        }
        ckf.g(drawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        this.mImageView.setImageDrawable(drawable);
        ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(this.mName, ((BitmapDrawable) drawable).getBitmap());
        Context context = this.mImageView.getContext();
        if (context != null) {
            ((Activity) context).setTaskDescription(taskDescription);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attributeSet");
        View.inflate(getContext(), R.layout.tms_pub_loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.tips);
        ckf.f(findViewById, "findViewById(R.id.tips)");
        this.mTips = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progressView);
        ProgressView progressView = (ProgressView) findViewById2;
        progressView.setDotMargin(4.5f);
        progressView.setDotSize(3.0f);
        ckf.f(findViewById2, "findViewById<ProgressVie… setDotSize(3f)\n        }");
        this.mProgressView = (ProgressView) findViewById2;
        View findViewById3 = findViewById(R.id.appName);
        TextView textView = (TextView) findViewById3;
        if (!TextUtils.isEmpty(this.mName)) {
            textView.setText(this.mName);
        }
        ckf.f(findViewById3, "findViewById<TextView?>(…e\n            }\n        }");
        this.mTextView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.appLogo);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.addFeature(new RoundFeature());
        if (!TextUtils.isEmpty(this.mLogo)) {
            String str = this.mLogo;
            ckf.d(str);
            setImage(tUrlImageView, str);
        }
        ckf.f(findViewById4, "findViewById<TUrlImageVi…)\n            }\n        }");
        this.mImageView = (TUrlImageView) findViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attributeSet");
        View.inflate(getContext(), R.layout.tms_pub_loading_view, this);
        setClickable(true);
        View findViewById = findViewById(R.id.tips);
        ckf.f(findViewById, "findViewById(R.id.tips)");
        this.mTips = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progressView);
        ProgressView progressView = (ProgressView) findViewById2;
        progressView.setDotMargin(4.5f);
        progressView.setDotSize(3.0f);
        ckf.f(findViewById2, "findViewById<ProgressVie… setDotSize(3f)\n        }");
        this.mProgressView = (ProgressView) findViewById2;
        View findViewById3 = findViewById(R.id.appName);
        TextView textView = (TextView) findViewById3;
        if (!TextUtils.isEmpty(this.mName)) {
            textView.setText(this.mName);
        }
        ckf.f(findViewById3, "findViewById<TextView?>(…e\n            }\n        }");
        this.mTextView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.appLogo);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById4;
        tUrlImageView.addFeature(new RoundFeature());
        if (!TextUtils.isEmpty(this.mLogo)) {
            String str = this.mLogo;
            ckf.d(str);
            setImage(tUrlImageView, str);
        }
        ckf.f(findViewById4, "findViewById<TUrlImageVi…)\n            }\n        }");
        this.mImageView = (TUrlImageView) findViewById4;
    }
}
