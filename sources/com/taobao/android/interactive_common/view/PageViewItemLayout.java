package com.taobao.android.interactive_common.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.view.photoview.PhotoView;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.taobao.uikit.feature.features.ImageSaveFeature;
import tb.ain;
import tb.ewk;
import tb.s8d;
import tb.tyr;
import tb.ztk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PageViewItemLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PhotoView photoView;
    private TBProgressBar progressBar;
    private View videoLayout;
    private String waterMarkIconUrl;
    private String waterMarkText;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ewk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageSaveFeature f8116a;

        public a(PageViewItemLayout pageViewItemLayout, ImageSaveFeature imageSaveFeature) {
            this.f8116a = imageSaveFeature;
        }

        @Override // tb.ewk
        public boolean a(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8cdb997", new Object[]{this, view, motionEvent})).booleanValue();
            }
            this.f8116a.beforeOnTouchEvent(motionEvent);
            this.f8116a.beforePerformLongClick();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ewk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalImageSaveFeature f8117a;

        public b(PageViewItemLayout pageViewItemLayout, LocalImageSaveFeature localImageSaveFeature) {
            this.f8117a = localImageSaveFeature;
        }

        @Override // tb.ewk
        public boolean a(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8cdb997", new Object[]{this, view, motionEvent})).booleanValue();
            }
            this.f8117a.beforeOnTouchEvent(motionEvent);
            this.f8117a.beforePerformLongClick();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f8118a;

        public c(d dVar) {
            this.f8118a = dVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null) {
                if (PageViewItemLayout.access$000(PageViewItemLayout.this) != null) {
                    PageViewItemLayout.access$000(PageViewItemLayout.this).setVisibility(8);
                }
                if (!(succPhenixEvent.getDrawable() == null || PageViewItemLayout.access$100(PageViewItemLayout.this) == null)) {
                    PageViewItemLayout.access$100(PageViewItemLayout.this).setBackgroundColor(0);
                }
                d dVar = this.f8118a;
                if (dVar != null) {
                    dVar.onLoad();
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void onLoad();
    }

    public PageViewItemLayout(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ TBProgressBar access$000(PageViewItemLayout pageViewItemLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBProgressBar) ipChange.ipc$dispatch("1bd0b363", new Object[]{pageViewItemLayout});
        }
        return pageViewItemLayout.progressBar;
    }

    public static /* synthetic */ PhotoView access$100(PageViewItemLayout pageViewItemLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoView) ipChange.ipc$dispatch("d85f617a", new Object[]{pageViewItemLayout});
        }
        return pageViewItemLayout.photoView;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.cx_rate_preview_video_layout, this);
        this.videoLayout = inflate;
        this.photoView = (PhotoView) inflate.findViewById(R.id.rate_image_preview);
        this.progressBar = (TBProgressBar) this.videoLayout.findViewById(R.id.rate_loading_progress);
    }

    public static /* synthetic */ Object ipc$super(PageViewItemLayout pageViewItemLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/view/PageViewItemLayout");
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.videoLayout;
    }

    public PhotoView initPhotoView(String str, ImageView.ScaleType scaleType, String str2, String str3, d dVar, ztk ztkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoView) ipChange.ipc$dispatch("ab262c08", new Object[]{this, str, scaleType, str2, str3, dVar, ztkVar});
        }
        this.photoView.setVisibility(0);
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.photoView.setScaleType(scaleType);
        if (TextUtils.isEmpty(str) || !str.endsWith(".gif")) {
            this.photoView.setSkipAutoSize(false);
        } else if (ain.d()) {
            this.photoView.setSkipAutoSize(false);
        } else {
            this.photoView.setSkipAutoSize(true);
        }
        if (tyr.j()) {
            ImageSaveFeature imageSaveFeature = new ImageSaveFeature();
            this.photoView.addFeature(imageSaveFeature);
            this.photoView.setOnLongClickListener(new a(this, imageSaveFeature));
        } else {
            LocalImageSaveFeature localImageSaveFeature = new LocalImageSaveFeature();
            localImageSaveFeature.setWater(str2, str3);
            this.photoView.addFeature(localImageSaveFeature);
            this.photoView.setOnLongClickListener(new b(this, localImageSaveFeature));
        }
        this.photoView.setOnScaleChangeListener(ztkVar);
        this.photoView.succListener(new c(dVar));
        TBProgressBar tBProgressBar = this.progressBar;
        if (tBProgressBar != null) {
            tBProgressBar.setVisibility(0);
        }
        this.photoView.setImageUrl(str);
        return this.photoView;
    }

    public PageViewItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public PageViewItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
