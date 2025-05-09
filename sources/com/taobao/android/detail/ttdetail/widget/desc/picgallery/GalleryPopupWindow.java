package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.GalleryTracker;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.BasePagerAdapter;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager;
import com.taobao.avplayer.q;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.b4a;
import tb.b5m;
import tb.egr;
import tb.hme;
import tb.mr7;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.z3a;
import tb.ztb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GalleryPopupWindow extends PopupWindow implements BasePagerAdapter.a, ViewPager.OnPageChangeListener, CustomViewPager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String DEFAULT_APP_PIC_DIR_PATH = null;
    public static final String TAG = "GalleryPopupWindow";
    private Dialog dialog;
    private boolean fromDetailMain;
    private z3a galleryDTO;
    private int imageOffset;
    private Application mApp;
    private GalleryViewPager mBigGallery;
    private BigGalleryImageAdapter mBigGalleryAdapter;
    private View mContainer;
    private Context mContext;
    private IndexView mIndexView;
    private int mLastIndex = 0;
    private View mSubDescContainer;
    private SystemBarDecorator mSystemBarDecorator;
    private TextView mTvDesc;
    private TextView mTvSubDesc;
    private boolean needVideoAutoPlay;
    private boolean supportLongPress;
    private int totalPages;
    private HashMap<String, String> utParams;
    private int videoCurrentPosition;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class BigGalleryImageAdapter extends BasePagerAdapter implements ztb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public View c;
        public q d;
        public ImageView e;
        public DetailImageView f;
        public final boolean q = vbl.g1();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
                BigGalleryImageAdapter.i(BigGalleryImageAdapter.this).setVisibility(4);
                BigGalleryImageAdapter.j(BigGalleryImageAdapter.this).setVisibility(4);
                GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                int videoState = BigGalleryImageAdapter.k(BigGalleryImageAdapter.this).getVideoState();
                if (videoState == 4 || videoState == 2 || videoState == 6) {
                    BigGalleryImageAdapter.k(BigGalleryImageAdapter.this).playVideo();
                } else {
                    BigGalleryImageAdapter.k(BigGalleryImageAdapter.this).start();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    GalleryPopupWindow.access$1400(GalleryPopupWindow.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
                BigGalleryImageAdapter.i(BigGalleryImageAdapter.this).setVisibility(4);
                BigGalleryImageAdapter.j(BigGalleryImageAdapter.this).setVisibility(4);
                GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                int videoState = BigGalleryImageAdapter.k(BigGalleryImageAdapter.this).getVideoState();
                if (videoState == 2 || videoState == 4 || videoState == 6) {
                    BigGalleryImageAdapter.k(BigGalleryImageAdapter.this).playVideo();
                } else {
                    BigGalleryImageAdapter.k(BigGalleryImageAdapter.this).start();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class d implements View.OnLongClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d(BigGalleryImageAdapter bigGalleryImageAdapter) {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class e implements View.OnLongClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final TouchImageView f7002a;
            public final String b;

            static {
                t2o.a(912262997);
            }

            public e(TouchImageView touchImageView, String str) {
                this.f7002a = touchImageView;
                this.b = str;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                if (this.f7002a == null || !GalleryPopupWindow.access$1500(GalleryPopupWindow.this) || this.f7002a.isZoomState() || b5m.H().isI18nEdition()) {
                    return false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("share_businessId", (Object) "picture-desc");
                jSONObject.put("share_imageUrl", (Object) this.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("detailShareParams", (Object) jSONObject);
                q84.f(GalleryPopupWindow.access$600(GalleryPopupWindow.this), new rc7("share", jSONObject2, new RuntimeAbilityParam[0]));
                return false;
            }
        }

        static {
            t2o.a(912262992);
            t2o.a(452985010);
        }

        public BigGalleryImageAdapter() {
        }

        public static /* synthetic */ ImageView i(BigGalleryImageAdapter bigGalleryImageAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageView) ipChange.ipc$dispatch("ca337835", new Object[]{bigGalleryImageAdapter});
            }
            return bigGalleryImageAdapter.e;
        }

        public static /* synthetic */ Object ipc$super(BigGalleryImageAdapter bigGalleryImageAdapter, String str, Object... objArr) {
            if (str.hashCode() == -2093417530) {
                super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/picgallery/GalleryPopupWindow$BigGalleryImageAdapter");
        }

        public static /* synthetic */ DetailImageView j(BigGalleryImageAdapter bigGalleryImageAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailImageView) ipChange.ipc$dispatch("593a0f56", new Object[]{bigGalleryImageAdapter});
            }
            return bigGalleryImageAdapter.f;
        }

        public static /* synthetic */ q k(BigGalleryImageAdapter bigGalleryImageAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("40b5bdc0", new Object[]{bigGalleryImageAdapter});
            }
            return bigGalleryImageAdapter.d;
        }

        public static /* synthetic */ q l(BigGalleryImageAdapter bigGalleryImageAdapter, q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("baa188ef", new Object[]{bigGalleryImageAdapter, qVar});
            }
            bigGalleryImageAdapter.d = qVar;
            return qVar;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.BasePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (obj != null) {
                egr d2 = egr.d();
                if (d2 != null && (obj instanceof ImageView)) {
                    d2.e(null, (DetailImageView) obj);
                }
                if (i == 0) {
                    GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
                    if (!TextUtils.isEmpty(null)) {
                        GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
                        if (!TextUtils.isEmpty(null)) {
                            q qVar = this.d;
                            if (qVar != null) {
                                qVar.b(this.f);
                                this.d.b(this.e);
                                if (this.d.getVideoState() == 1) {
                                    GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
                                }
                                GalleryPopupWindow.access$1602(GalleryPopupWindow.this, this.d.getCurrentPosition());
                                viewGroup.removeView(this.d.getView());
                                this.d.destroy();
                            }
                            this.d = null;
                            return;
                        }
                    }
                }
                if (obj instanceof TouchImageView) {
                    ((TouchImageView) obj).destroy();
                }
                if (viewGroup != null) {
                    viewGroup.removeView((View) obj);
                }
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (GalleryPopupWindow.access$400(GalleryPopupWindow.this).c == null || GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.isEmpty()) {
                return 0;
            }
            GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
            if (TextUtils.isEmpty(null)) {
                return GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.size() + (GalleryPopupWindow.access$300(GalleryPopupWindow.this) ? 1 : 0);
            }
            return GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.size() + (GalleryPopupWindow.access$300(GalleryPopupWindow.this) ? 1 : 0) + 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (i == 0) {
                GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
                if (!TextUtils.isEmpty(null)) {
                    GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
                    if (!TextUtils.isEmpty(null)) {
                        if (this.d == null && (GalleryPopupWindow.access$600(GalleryPopupWindow.this) instanceof Activity)) {
                            q.a aVar = new q.a((Activity) GalleryPopupWindow.access$600(GalleryPopupWindow.this));
                            aVar.n("DETAILMAIN");
                            aVar.n0("TBVideo");
                            aVar.J(false);
                            aVar.U(true);
                            aVar.d0(false);
                            GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
                            aVar.p0(null);
                            aVar.S(false);
                            aVar.q0(mr7.f(GalleryPopupWindow.access$600(GalleryPopupWindow.this)));
                            aVar.x(mr7.e(GalleryPopupWindow.access$600(GalleryPopupWindow.this)) - GalleryPopupWindow.access$700(GalleryPopupWindow.this));
                            aVar.f0(GalleryPopupWindow.access$800(GalleryPopupWindow.this));
                            q r0 = aVar.r0();
                            this.d = r0;
                            r0.setVideoLifecycleListener(this);
                            this.d.hideCloseView();
                            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                        }
                        q qVar = this.d;
                        if (!(qVar == null || qVar.getView().getParent() == null)) {
                            ((ViewGroup) this.d.getView().getParent()).removeView(this.d.getView());
                        }
                        viewGroup.addView(this.d.getView(), 0);
                        if (this.f == null) {
                            GalleryPopupWindow.access$400(GalleryPopupWindow.this).getClass();
                            DetailImageView m = m(null);
                            this.f = m;
                            m.setVisibility(0);
                        }
                        if (this.f.getParent() != null) {
                            ((ViewGroup) this.f.getParent()).removeView(this.f);
                        }
                        this.d.a(this.f, new FrameLayout.LayoutParams(-1, -1));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        layoutParams.width = (int) GalleryPopupWindow.access$600(GalleryPopupWindow.this).getResources().getDimension(R.dimen.tt_detail_video_play_btn_width);
                        layoutParams.height = (int) GalleryPopupWindow.access$600(GalleryPopupWindow.this).getResources().getDimension(R.dimen.tt_detail_video_play_btn_height);
                        if (this.e == null) {
                            ImageView imageView = new ImageView(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
                            this.e = imageView;
                            imageView.setLayoutParams(layoutParams);
                            this.e.setImageResource(R.drawable.tt_detail_video_play);
                            this.e.setVisibility(0);
                            this.e.setOnClickListener(new a());
                        }
                        if (this.e.getParent() != null) {
                            ((ViewGroup) this.e.getParent()).removeView(this.e);
                        }
                        this.d.a(this.e, layoutParams);
                        if (GalleryPopupWindow.access$1000(GalleryPopupWindow.this)) {
                            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
                            this.e.setVisibility(4);
                            this.f.setVisibility(4);
                            this.d.start();
                        } else {
                            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
                            this.e.setVisibility(0);
                            this.f.setVisibility(0);
                        }
                        return this.d.getView();
                    }
                }
            }
            int access$1300 = i - GalleryPopupWindow.access$1300(GalleryPopupWindow.this);
            if (!GalleryPopupWindow.access$300(GalleryPopupWindow.this) || access$1300 < GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.size()) {
                String str = GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.get(access$1300);
                TouchImageView touchImageView = new TouchImageView(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
                touchImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                touchImageView.setContentDescription(GalleryPopupWindow.access$600(GalleryPopupWindow.this).getString(R.string.tt_detail_content_description_pic));
                touchImageView.setOnClickListener(new b());
                touchImageView.setOnSinglePointLongClickListener(new e(touchImageView, str));
                hme.a o = new hme.a().p(R.drawable.tt_detail_img_load_fail).n(ImageView.ScaleType.CENTER_INSIDE).t(touchImageView.getScaleType()).u(mr7.f(GalleryPopupWindow.access$600(GalleryPopupWindow.this))).o(mr7.e(GalleryPopupWindow.access$600(GalleryPopupWindow.this)));
                if (this.q) {
                    o.w(true);
                }
                hme m2 = o.m();
                egr d2 = egr.d();
                if (d2 != null) {
                    try {
                        d2.f(str, touchImageView, m2);
                    } catch (Throwable unused) {
                    }
                }
                viewGroup.addView(touchImageView, 0);
                return touchImageView;
            }
            if (this.c == null) {
                this.c = LayoutInflater.from(GalleryPopupWindow.access$600(GalleryPopupWindow.this)).inflate(R.layout.tt_detail_main_gallery_scroll_limit_tip_blackbg, (ViewGroup) null);
                this.c.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
            viewGroup.addView(this.c, 0);
            return this.c;
        }

        public final DetailImageView m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailImageView) ipChange.ipc$dispatch("70365afb", new Object[]{this, str});
            }
            DetailImageView detailImageView = new DetailImageView(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.height = this.d.getView().getLayoutParams().height;
            layoutParams.width = this.d.getView().getLayoutParams().width;
            detailImageView.setLayoutParams(layoutParams);
            detailImageView.setContentDescription(GalleryPopupWindow.access$600(GalleryPopupWindow.this).getString(R.string.tt_detail_content_description_pic));
            detailImageView.setOnClickListener(new c());
            detailImageView.setOnLongClickListener(new d(this));
            hme m = new hme.a().p(R.drawable.tt_detail_img_load_fail).n(ImageView.ScaleType.CENTER_INSIDE).t(detailImageView.getScaleType()).m();
            egr d2 = egr.d();
            if (d2 != null) {
                try {
                    d2.f(str, detailImageView, m);
                } catch (Throwable unused) {
                }
            }
            return detailImageView;
        }

        @Override // tb.ztb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.ztb
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoFullScreen");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.f.getLayoutParams().width = mr7.f(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
            this.f.getLayoutParams().height = mr7.e(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
        }

        @Override // tb.ztb
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.ztb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.ztb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.ztb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoStart");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.f.setVisibility(4);
            this.e.setVisibility(4);
            if (GalleryPopupWindow.access$1600(GalleryPopupWindow.this) > 0) {
                this.d.seekTo(GalleryPopupWindow.access$1600(GalleryPopupWindow.this));
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.BasePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            super.setPrimaryItem(viewGroup, i, obj);
            if (obj instanceof TouchImageView) {
                ((GalleryViewPager) viewGroup).mCurrentView = (TouchImageView) obj;
            } else {
                ((GalleryViewPager) viewGroup).mCurrentView = null;
            }
        }

        @Override // tb.ztb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoClose");
            this.f.setVisibility(0);
            this.e.setVisibility(0);
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
            GalleryPopupWindow.access$1602(GalleryPopupWindow.this, this.d.getCurrentPosition());
        }

        @Override // tb.ztb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoComplete");
            if (!this.d.isFullScreen()) {
                GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
            }
            this.f.setVisibility(0);
            this.e.setVisibility(0);
            GalleryPopupWindow.access$1602(GalleryPopupWindow.this, 0);
            GalleryPopupWindow.access$1002(GalleryPopupWindow.this, false);
        }

        @Override // tb.ztb
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoNormalScreen");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(0);
            this.f.getLayoutParams().width = mr7.f(GalleryPopupWindow.access$600(GalleryPopupWindow.this));
        }

        @Override // tb.ztb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoPause");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.f.setVisibility(4);
            this.e.setVisibility(4);
            if (z) {
                GalleryPopupWindow.access$1002(GalleryPopupWindow.this, true);
            }
            GalleryPopupWindow.access$1602(GalleryPopupWindow.this, this.d.getCurrentPosition());
        }

        @Override // tb.ztb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoPlay");
            GalleryPopupWindow.access$1002(GalleryPopupWindow.this, false);
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.f.setVisibility(4);
            this.e.setVisibility(4);
            this.d.showController();
        }

        @Override // tb.ztb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            tgh.b(GalleryPopupWindow.TAG, "onVideoPrepared");
            GalleryPopupWindow.access$900(GalleryPopupWindow.this).setVisibility(8);
            this.f.setVisibility(0);
            this.e.setVisibility(0);
        }
    }

    static {
        t2o.a(912262990);
        t2o.a(912262984);
        t2o.a(912262986);
        t2o.a(912262999);
    }

    public GalleryPopupWindow(View view, int i, int i2, Context context) {
        super(view, i, i2);
        this.mContext = context;
        if (context instanceof Activity) {
            this.mSystemBarDecorator = new SystemBarDecorator((Activity) context);
        }
        Application a2 = b5m.z().a();
        this.mApp = a2;
        DEFAULT_APP_PIC_DIR_PATH = getPicDir(a2);
        this.mContainer = view;
        this.needVideoAutoPlay = false;
        init();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                GalleryPopupWindow.access$000(GalleryPopupWindow.this);
                if (BigGalleryImageAdapter.k(GalleryPopupWindow.access$100(GalleryPopupWindow.this)) != null && BigGalleryImageAdapter.k(GalleryPopupWindow.access$100(GalleryPopupWindow.this)).isFullScreen()) {
                    BigGalleryImageAdapter.k(GalleryPopupWindow.access$100(GalleryPopupWindow.this)).toggleScreen();
                }
                if (GalleryPopupWindow.access$300(GalleryPopupWindow.this)) {
                    b4a b4aVar = new b4a();
                    int currentIndex = GalleryPopupWindow.this.getCurrentIndex();
                    b4aVar.f16172a = currentIndex;
                    if (currentIndex < GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.size()) {
                        GalleryPopupWindow.access$400(GalleryPopupWindow.this).c.get(b4aVar.f16172a);
                    }
                }
                if (GalleryPopupWindow.access$500(GalleryPopupWindow.this) != null) {
                    GalleryPopupWindow.access$500(GalleryPopupWindow.this).setStatusBarColor("#00000000", false);
                }
                GalleryPopupWindow.this.stop();
            }
        });
    }

    public static /* synthetic */ void access$000(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b66c3bb", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.dismissPopup();
        }
    }

    public static /* synthetic */ BigGalleryImageAdapter access$100(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigGalleryImageAdapter) ipChange.ipc$dispatch("f96e14ae", new Object[]{galleryPopupWindow});
        }
        return galleryPopupWindow.mBigGalleryAdapter;
    }

    public static /* synthetic */ boolean access$1000(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb727aae", new Object[]{galleryPopupWindow})).booleanValue();
        }
        return galleryPopupWindow.needVideoAutoPlay;
    }

    public static /* synthetic */ boolean access$1002(GalleryPopupWindow galleryPopupWindow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42dc4a2c", new Object[]{galleryPopupWindow, new Boolean(z)})).booleanValue();
        }
        galleryPopupWindow.needVideoAutoPlay = z;
        return z;
    }

    public static /* synthetic */ int access$1300(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e337c320", new Object[]{galleryPopupWindow})).intValue();
        }
        return galleryPopupWindow.imageOffset;
    }

    public static /* synthetic */ void access$1400(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2430ae", new Object[]{galleryPopupWindow});
        } else {
            galleryPopupWindow.dismissGalleryPopupWindow();
        }
    }

    public static /* synthetic */ boolean access$1500(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53109e33", new Object[]{galleryPopupWindow})).booleanValue();
        }
        return galleryPopupWindow.supportLongPress;
    }

    public static /* synthetic */ int access$1600(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afd0ba3", new Object[]{galleryPopupWindow})).intValue();
        }
        return galleryPopupWindow.videoCurrentPosition;
    }

    public static /* synthetic */ int access$1602(GalleryPopupWindow galleryPopupWindow, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4a39a04", new Object[]{galleryPopupWindow, new Integer(i)})).intValue();
        }
        galleryPopupWindow.videoCurrentPosition = i;
        return i;
    }

    public static /* synthetic */ boolean access$300(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("432c0c42", new Object[]{galleryPopupWindow})).booleanValue();
        }
        return galleryPopupWindow.fromDetailMain;
    }

    public static /* synthetic */ z3a access$400(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z3a) ipChange.ipc$dispatch("3148e638", new Object[]{galleryPopupWindow});
        }
        return galleryPopupWindow.galleryDTO;
    }

    public static /* synthetic */ SystemBarDecorator access$500(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarDecorator) ipChange.ipc$dispatch("593ea9c1", new Object[]{galleryPopupWindow});
        }
        return galleryPopupWindow.mSystemBarDecorator;
    }

    public static /* synthetic */ Context access$600(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("49abc0b9", new Object[]{galleryPopupWindow});
        }
        return galleryPopupWindow.mContext;
    }

    public static /* synthetic */ int access$700(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ddc235", new Object[]{galleryPopupWindow})).intValue();
        }
        return galleryPopupWindow.getStatusBarHeight();
    }

    public static /* synthetic */ HashMap access$800(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("baa01a66", new Object[]{galleryPopupWindow});
        }
        return galleryPopupWindow.utParams;
    }

    public static /* synthetic */ IndexView access$900(GalleryPopupWindow galleryPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndexView) ipChange.ipc$dispatch("816252bf", new Object[]{galleryPopupWindow});
        }
        return galleryPopupWindow.mIndexView;
    }

    private void changeIndexPos(int i) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1a56aa", new Object[]{this, new Integer(i)});
            return;
        }
        z3a z3aVar = this.galleryDTO;
        if (z3aVar != null && z3aVar.c != null) {
            int i2 = this.totalPages;
            if (i < i2) {
                this.mLastIndex = i;
            }
            this.mIndexView.setTotalCount(i2);
            if (this.totalPages < 2) {
                this.mIndexView.setVisibility(8);
            }
            if (i == 0 && BigGalleryImageAdapter.k(this.mBigGalleryAdapter) != null && (BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState() == 1 || BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState() == 2 || BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState() == 5)) {
                this.mIndexView.setVisibility(8);
            } else {
                this.mIndexView.setVisibility(0);
            }
            this.mIndexView.setSelectedIndex(i);
            int size = this.galleryDTO.c.size();
            int i3 = i - this.imageOffset;
            String str3 = null;
            if (i3 < 0 || i3 >= size) {
                str = null;
            } else {
                String str4 = this.galleryDTO.d.get(i3);
                HashMap<String, String> hashMap = this.galleryDTO.f;
                if (hashMap == null) {
                    str2 = null;
                } else {
                    str2 = hashMap.get(str4);
                }
                HashMap<String, String> hashMap2 = this.galleryDTO.g;
                if (hashMap2 != null) {
                    str3 = hashMap2.get(str4);
                }
                str = str3;
                str3 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.mTvDesc.setText(str3);
                this.mTvDesc.setVisibility(0);
            } else {
                this.mTvDesc.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str)) {
                this.mTvSubDesc.setText(str);
                this.mSubDescContainer.setVisibility(0);
                return;
            }
            this.mSubDescContainer.setVisibility(8);
        }
    }

    private void dismissGalleryPopupWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6183bbb", new Object[]{this});
        } else if (this.mContext != null && isShowing()) {
            Dialog dialog = this.dialog;
            if (dialog == null || !dialog.isShowing()) {
                try {
                    dismiss();
                } catch (Exception e) {
                    tgh.c(TAG, "dismissGalleryPopupWindow", e);
                }
            }
        }
    }

    private void dismissPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a167c9", new Object[]{this});
            return;
        }
        Dialog dialog = this.dialog;
        if (dialog != null && dialog.isShowing()) {
            this.dialog.dismiss();
            this.dialog = null;
        }
    }

    private String getPicDir(Context context) {
        File externalFilesDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86461378", new Object[]{this, context});
        }
        if (context == null || (externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)) == null) {
            return "";
        }
        return externalFilesDir.getPath();
    }

    private int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        return SystemBarDecorator.SystemBarConfig.getStatusBarHeight(b5m.z().a());
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setFocusable(true);
        setBackgroundDrawable(new PaintDrawable());
        setAnimationStyle(16973826);
        setSoftInputMode(16);
        this.mIndexView = (IndexView) this.mContainer.findViewById(R.id.index_image_viewer);
        this.mBigGallery = (GalleryViewPager) this.mContainer.findViewById(R.id.big_gallery);
        this.mTvDesc = (TextView) this.mContainer.findViewById(R.id.tv_image_desc);
        this.mTvSubDesc = (TextView) this.mContainer.findViewById(R.id.tv_image_sub_desc);
        this.mSubDescContainer = this.mContainer.findViewById(R.id.ll_sub_img_desc);
        this.mBigGallery.setOffscreenPageLimit(0);
        this.mBigGallery.setOnPageChangeListener(this);
        this.mBigGallery.setOnPageEdgeScrollLimitListener(this);
    }

    public static /* synthetic */ Object ipc$super(GalleryPopupWindow galleryPopupWindow, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -742181306) {
            return new Boolean(super.isShowing());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/desc/picgallery/GalleryPopupWindow");
        }
    }

    private void reviewBitImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d88114d", new Object[]{this});
            return;
        }
        int currentImageIndex = getCurrentImageIndex();
        this.galleryDTO.c.set(currentImageIndex, this.galleryDTO.d.get(currentImageIndex));
        BigGalleryImageAdapter bigGalleryImageAdapter = this.mBigGalleryAdapter;
        if (bigGalleryImageAdapter != null) {
            bigGalleryImageAdapter.notifyDataSetChanged();
        }
    }

    private String standardUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa70d87d", new Object[]{this, str});
        }
        int indexOf = str.indexOf(".jpg");
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf) + ".jpg";
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mApp = null;
        this.mContainer = null;
        GalleryViewPager galleryViewPager = this.mBigGallery;
        if (galleryViewPager != null) {
            galleryViewPager.setAdapter(null);
            this.mBigGallery.setOnPageChangeListener(null);
            this.mBigGallery.setOnPageEdgeScrollLimitListener(null);
            this.mBigGallery = null;
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            super.dismiss();
        }
    }

    public int getCurrentImageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce519554", new Object[]{this})).intValue();
        }
        return this.mLastIndex - this.imageOffset;
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        int i = this.mLastIndex;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.widget.PopupWindow
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return super.isShowing();
    }

    public boolean onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2372e0f1", new Object[]{this})).booleanValue();
        }
        if (!isShowing()) {
            return false;
        }
        pause();
        try {
            dismiss();
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.BasePagerAdapter.a
    public void onItemChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb11cba", new Object[]{this, new Integer(i)});
            return;
        }
        changeIndexPos(i);
        if (i == 0 && BigGalleryImageAdapter.k(this.mBigGalleryAdapter) != null) {
            this.galleryDTO.getClass();
            if (!TextUtils.isEmpty(null)) {
                this.galleryDTO.getClass();
                if (!TextUtils.isEmpty(null)) {
                    Context context = this.mContext;
                    this.galleryDTO.getClass();
                    this.galleryDTO.getClass();
                    GalleryTracker.b(context, null, null, null);
                }
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager.a
    public void onPageFirstScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20337d3", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager.a
    public void onPageLastScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8877511", new Object[]{this});
        } else if (this.fromDetailMain) {
            onBack();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        if (i == 0) {
            this.galleryDTO.getClass();
            if (!TextUtils.isEmpty(null)) {
                return;
            }
        }
        if (i == 0) {
            this.galleryDTO.getClass();
            if (!TextUtils.isEmpty(null) && BigGalleryImageAdapter.k(this.mBigGalleryAdapter) != null) {
                int videoState = BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState();
                if (f >= 0.5d && videoState == 1) {
                    BigGalleryImageAdapter.k(this.mBigGalleryAdapter).pauseVideo();
                    this.needVideoAutoPlay = true;
                } else if (i2 == 0 && videoState == 2 && this.needVideoAutoPlay) {
                    BigGalleryImageAdapter.k(this.mBigGalleryAdapter).playVideo();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (!this.fromDetailMain) {
        } else {
            if (i >= this.mBigGallery.getAdapter().getCount() - 1) {
                GalleryViewPager galleryViewPager = this.mBigGallery;
                galleryViewPager.setCurrentItem(galleryViewPager.getAdapter().getCount() - 1);
                changeIndexPos(this.mBigGallery.getAdapter().getCount() - 1);
            } else if (i == 0 && BigGalleryImageAdapter.k(this.mBigGalleryAdapter) != null) {
                if (this.needVideoAutoPlay && (BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState() == 0 || BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState() == 2)) {
                    BigGalleryImageAdapter.k(this.mBigGalleryAdapter).playVideo();
                } else if (!this.needVideoAutoPlay && BigGalleryImageAdapter.k(this.mBigGalleryAdapter).getVideoState() == 0 && this.videoCurrentPosition > 0) {
                    BigGalleryImageAdapter.k(this.mBigGalleryAdapter).playVideo();
                }
            }
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public ArrayList<String> processBigImageUrl(z3a z3aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("97338527", new Object[]{this, z3aVar});
        }
        ArrayList<String> arrayList = z3aVar.c;
        if (arrayList != null) {
            return arrayList;
        }
        z3aVar.c = new ArrayList<>();
        Iterator<String> it = z3aVar.d.iterator();
        while (it.hasNext()) {
            z3aVar.c.add(standardUrl(it.next()));
        }
        return z3aVar.c;
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void setBigImgUrls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b12430", new Object[]{this});
            return;
        }
        BigGalleryImageAdapter bigGalleryImageAdapter = this.mBigGalleryAdapter;
        if (bigGalleryImageAdapter == null) {
            BigGalleryImageAdapter bigGalleryImageAdapter2 = new BigGalleryImageAdapter();
            this.mBigGalleryAdapter = bigGalleryImageAdapter2;
            bigGalleryImageAdapter2.h(this);
            this.mBigGallery.setAdapter(this.mBigGalleryAdapter);
            return;
        }
        bigGalleryImageAdapter.notifyDataSetChanged();
    }

    public void showGalleryDialog(z3a z3aVar) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25dce5c5", new Object[]{this, z3aVar});
        } else if (z3aVar != null && (arrayList = z3aVar.d) != null && !arrayList.isEmpty()) {
            this.galleryDTO = z3aVar;
            this.supportLongPress = z3aVar.f32510a;
            this.fromDetailMain = false;
            this.imageOffset = !TextUtils.isEmpty(null) ? 1 : 0;
            this.totalPages = this.galleryDTO.d.size() + this.imageOffset;
            processBigImageUrl(this.galleryDTO);
            ArrayList<String> arrayList2 = this.galleryDTO.c;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                setBigImgUrls();
                z3a z3aVar2 = this.galleryDTO;
                showGalleryDialog(z3aVar2.b, z3aVar2.e);
            }
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        BigGalleryImageAdapter bigGalleryImageAdapter = this.mBigGalleryAdapter;
        if (bigGalleryImageAdapter != null && BigGalleryImageAdapter.k(bigGalleryImageAdapter) != null) {
            BigGalleryImageAdapter.k(this.mBigGalleryAdapter).closeVideo();
            BigGalleryImageAdapter.k(this.mBigGalleryAdapter).destroy();
            BigGalleryImageAdapter.l(this.mBigGalleryAdapter, null);
            this.mBigGalleryAdapter = null;
        }
    }

    private void showGalleryDialog(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53603033", new Object[]{this, new Integer(i), view});
            return;
        }
        this.mBigGallery.setCurrentItem(i);
        changeIndexPos(i);
        if (!isShowing()) {
            SystemBarDecorator systemBarDecorator = this.mSystemBarDecorator;
            if (systemBarDecorator != null) {
                systemBarDecorator.setStatusBarColor("#000000");
            }
            try {
                showAtLocation(view, 0, 0, 0);
                update();
                setFocusable(true);
            } catch (Throwable unused) {
            }
        }
        this.mBigGalleryAdapter.notifyDataSetChanged();
        resume();
    }
}
