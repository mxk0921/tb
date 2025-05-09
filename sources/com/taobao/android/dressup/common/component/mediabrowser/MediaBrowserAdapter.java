package com.taobao.android.dressup.common.component.mediabrowser;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.LivePhotoModel;
import com.taobao.android.dressup.common.model.MediaBrowserModel;
import com.taobao.android.dressup.common.model.PhotoModel;
import com.taobao.android.dressup.common.model.VideoModel;
import com.taobao.android.dressup.common.view.photo.PhotoView;
import com.taobao.android.dressup.common.view.photo.PinchImageView;
import com.taobao.android.dressup.common.view.video.VideoView;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.livephoto.LivePhotoView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import tb.a07;
import tb.afi;
import tb.b7d;
import tb.cec;
import tb.ckf;
import tb.d2e;
import tb.jpu;
import tb.nz3;
import tb.t2o;
import tb.tpu;
import tb.vu0;
import tb.xhv;
import tb.yz3;
import tb.z9u;
import tb.zk4;
import tb.zrt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/dressup/common/component/mediabrowser/MediaBrowserAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$k;", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaBrowserAdapter extends PagerAdapter implements PinchImageView.k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int STATE_APPEAR = 1;
    public static final int STATE_DESTROY = 3;
    public static final int STATE_DISAPPEAR = 2;
    public static final int STATE_INIT = 0;
    public static final String TAG = "MediaBrowserAdapter";

    /* renamed from: a  reason: collision with root package name */
    public MediaBrowserModel f7551a;
    public List<? extends afi> b;
    public final SparseArray<FrameLayout> c = new SparseArray<>();
    public ArrayList<Integer> d = new ArrayList<>();
    public boolean e = true;
    public final MediaBrowserComponent f;
    public final Context g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552632);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/dressup/common/component/mediabrowser/MediaBrowserAdapter$$special$$inlined$let$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7552a;
        public final /* synthetic */ MediaBrowserAdapter b;
        public final /* synthetic */ int c;
        public final /* synthetic */ FrameLayout d;

        public b(View view, MediaBrowserAdapter mediaBrowserAdapter, int i, FrameLayout frameLayout) {
            this.f7552a = view;
            this.b = mediaBrowserAdapter;
            this.c = i;
            this.d = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MediaBrowserAdapter.h(this.b).D().t(((PhotoView) this.f7552a).getImageView());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LivePhotoModel b;
        public final /* synthetic */ int c;

        public c(LivePhotoModel livePhotoModel, int i) {
            this.b = livePhotoModel;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MediaBrowserComponent h = MediaBrowserAdapter.h(MediaBrowserAdapter.this);
            List i2 = MediaBrowserAdapter.i(MediaBrowserAdapter.this);
            if (i2 != null) {
                i = i2.indexOf(this.b);
            } else {
                i = this.c;
            }
            h.I(i, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements cec.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f7554a;

        public d(ImageView imageView, Ref$ObjectRef ref$ObjectRef, FrameLayout frameLayout, afi afiVar, Ref$ObjectRef ref$ObjectRef2) {
            this.f7554a = imageView;
        }

        @Override // tb.cec.a
        public void onImageLoadFailed(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.cec.a
        public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
                return;
            }
            ckf.g(str, "url");
            ckf.g(bitmapDrawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
            this.f7554a.setImageDrawable(bitmapDrawable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ afi b;
        public final /* synthetic */ int c;

        public e(afi afiVar, int i) {
            this.b = afiVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MediaBrowserComponent h = MediaBrowserAdapter.h(MediaBrowserAdapter.this);
            List i2 = MediaBrowserAdapter.i(MediaBrowserAdapter.this);
            if (i2 != null) {
                i = i2.indexOf(this.b);
            } else {
                i = this.c;
            }
            h.I(i, this.b);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnchorViews f7556a;

        public f(AnchorViews anchorViews) {
            this.f7556a = anchorViews;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f7556a.f();
            }
        }
    }

    static {
        t2o.a(918552631);
        t2o.a(918552804);
    }

    public MediaBrowserAdapter(MediaBrowserComponent mediaBrowserComponent, Context context) {
        ckf.g(mediaBrowserComponent, "browserComponent");
        ckf.g(context, "context");
        this.f = mediaBrowserComponent;
        this.g = context;
    }

    public static /* synthetic */ void e(MediaBrowserAdapter mediaBrowserAdapter, int i, long j, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246ab495", new Object[]{mediaBrowserAdapter, new Integer(i), new Long(j), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            j = 100;
        }
        mediaBrowserAdapter.d(i, j);
    }

    public static final /* synthetic */ MediaBrowserComponent h(MediaBrowserAdapter mediaBrowserAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaBrowserComponent) ipChange.ipc$dispatch("e4dcbb0a", new Object[]{mediaBrowserAdapter});
        }
        return mediaBrowserAdapter.f;
    }

    public static final /* synthetic */ List i(MediaBrowserAdapter mediaBrowserAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5a603e17", new Object[]{mediaBrowserAdapter});
        }
        return mediaBrowserAdapter.b;
    }

    public static /* synthetic */ Object ipc$super(MediaBrowserAdapter mediaBrowserAdapter, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/mediabrowser/MediaBrowserAdapter");
    }

    public final void A(FrameLayout frameLayout, VideoModel videoModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f5eb7e", new Object[]{this, frameLayout, videoModel, new Boolean(z)});
            return;
        }
        Context context = frameLayout.getContext();
        ckf.f(context, "view.context");
        VideoView videoView = new VideoView(context);
        videoView.setVideoModel(videoModel);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(videoModel.getDisplayWidth(), videoModel.getDisplayHeight());
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.gravity = 17;
        frameLayout.addView(videoView, layoutParams);
    }

    public final void B(MediaBrowserModel mediaBrowserModel) {
        List<afi> list;
        List<afi> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7495e0a3", new Object[]{this, mediaBrowserModel});
        } else if (mediaBrowserModel != null || this.f7551a != null) {
            if (mediaBrowserModel == null || !ckf.b(mediaBrowserModel, this.f7551a) || (list2 = mediaBrowserModel.getList()) == null || !list2.equals(this.b)) {
                this.f7551a = mediaBrowserModel;
                if (mediaBrowserModel != null) {
                    list = mediaBrowserModel.getList();
                } else {
                    list = null;
                }
                if (list != null) {
                    List<afi> list3 = mediaBrowserModel.getList();
                    ckf.d(list3);
                    this.b = new ArrayList(list3);
                } else {
                    this.b = yz3.i();
                }
                int size = this.d.size();
                List<? extends afi> list4 = this.b;
                ckf.d(list4);
                if (size != list4.size()) {
                    List<? extends afi> list5 = this.b;
                    ckf.d(list5);
                    ArrayList<Integer> arrayList = new ArrayList<>(list5.size());
                    List<? extends afi> list6 = this.b;
                    ckf.d(list6);
                    int size2 = list6.size();
                    for (int i = 0; i < size2; i++) {
                        arrayList.add(0);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                    this.d = arrayList;
                }
                notifyDataSetChanged();
            }
        }
    }

    public final void C(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16193123", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.d.set(i, Integer.valueOf(i2));
        }
    }

    @Override // com.taobao.android.dressup.common.view.photo.PinchImageView.k
    public void a(float f2) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eecc90", new Object[]{this, new Float(f2)});
        } else if (f2 == 1.0f) {
            ViewPager E = this.f.E();
            if (E != null) {
                i2 = E.getCurrentItem();
            }
            w(i2);
        } else if (f2 > 1.0f) {
            ViewPager E2 = this.f.E();
            if (E2 != null) {
                i = E2.getCurrentItem();
            } else {
                i = 0;
            }
            e(this, i, 0L, 2, null);
        }
    }

    @Override // com.taobao.android.dressup.common.view.photo.PinchImageView.k
    public void c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6ac5b7", new Object[]{this});
            return;
        }
        ViewPager E = this.f.E();
        if (E != null) {
            i = E.getCurrentItem();
        } else {
            i = 0;
        }
        e(this, i, 0L, 2, null);
    }

    public final void d(int i, long j) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1054a964", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        FrameLayout p = p(i);
        if (p != null && (findViewById = p.findViewById(R.id.turbo_id_anchor_view)) != null) {
            b(findViewById, j);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        ckf.g(viewGroup, "container");
        ckf.g(obj, "object");
        viewGroup.removeView((View) obj);
        t(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<? extends afi> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final List<afi> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.b;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        afi afiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, "container");
        FrameLayout frameLayout = new FrameLayout(this.g);
        this.c.put(i, frameLayout);
        List<? extends afi> list = this.b;
        if (list != null) {
            afiVar = (afi) list.get(i);
        } else {
            afiVar = null;
        }
        ckf.d(afiVar);
        frameLayout.setTag(R.id.turbo_id_media_model, afiVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(afiVar.getDisplayWidth(), afiVar.getDisplayHeight());
        if (q()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        viewGroup.addView(frameLayout, layoutParams);
        x(i, frameLayout, afiVar);
        return frameLayout;
    }

    public final View m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2671aa2b", new Object[]{this, new Integer(i)});
        }
        FrameLayout p = p(i);
        if (p != null) {
            return p.getChildAt(0);
        }
        return null;
    }

    public final int n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad095c7", new Object[]{this, new Integer(i)})).intValue();
        }
        Integer num = this.d.get(i);
        ckf.f(num, "itemStates[position]");
        return num.intValue();
    }

    public final afi o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afi) ipChange.ipc$dispatch("2a0a1545", new Object[]{this, new Integer(i)});
        }
        List<? extends afi> list = this.b;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (afi) list.get(i);
    }

    public final FrameLayout p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a16d481a", new Object[]{this, new Integer(i)});
        }
        return this.c.get(i);
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2f676c", new Object[]{this})).booleanValue();
        }
        return this.f instanceof ZoomMediaBrowserComponent;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419eb303", new Object[]{this});
            return;
        }
        List<? extends afi> list = this.b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                t(i);
            }
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9714c9f5", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout p = p(i);
        if (p != null && n(i) != 1) {
            C(i, 1);
            View childAt = p.getChildAt(0);
            if (childAt != null) {
                if (childAt instanceof LivePhotoView) {
                    try {
                        ((LivePhotoView) childAt).start();
                    } catch (Throwable th) {
                        tpu.Companion.a(TAG, "LivePhotoView start error", th);
                    }
                } else if (childAt instanceof VideoView) {
                    try {
                        ((VideoView) childAt).start();
                    } catch (Throwable th2) {
                        tpu.Companion.a(TAG, "VideoView start error", th2);
                    }
                } else if (q() && (childAt instanceof PhotoView)) {
                    zrt.Companion.b(new b(childAt, this, i, p));
                }
            }
            afi o = o(i);
            if (o != null) {
                D(i, o);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        ckf.g(viewGroup, "container");
        ckf.g(obj, "object");
        super.setPrimaryItem(viewGroup, i, obj);
        this.f.J(i);
        s(i);
    }

    public final void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51274a54", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout p = p(i);
        if (p != null && n(i) != 3) {
            C(i, 3);
            View childAt = p.getChildAt(0);
            if (childAt == null) {
                return;
            }
            if (childAt instanceof LivePhotoView) {
                try {
                    ((LivePhotoView) childAt).stop();
                    ((LivePhotoView) childAt).destroy();
                } catch (Throwable th) {
                    tpu.Companion.a(TAG, "LivePhotoView destroy error", th);
                }
            } else if (childAt instanceof VideoView) {
                try {
                    ((VideoView) childAt).destroy();
                } catch (Throwable th2) {
                    tpu.Companion.a(TAG, "VideoView destroy error", th2);
                }
            }
        }
    }

    public final void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65237cb", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout p = p(i);
        if (p != null && n(i) != 2) {
            C(i, 2);
            View childAt = p.getChildAt(0);
            if (childAt == null) {
                return;
            }
            if (childAt instanceof LivePhotoView) {
                ((LivePhotoView) childAt).stop();
            } else if (childAt instanceof VideoView) {
                ((VideoView) childAt).pause();
            }
        }
    }

    public final void w(int i) {
        View findViewById;
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b526f1", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout p = p(i);
        if (p != null && (findViewById = p.findViewById(R.id.turbo_id_anchor_view)) != null && (tag = findViewById.getTag()) != null) {
            ((AnchorViews) tag).f();
        }
    }

    public final void y(FrameLayout frameLayout, int i, LivePhotoModel livePhotoModel, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9624cbf9", new Object[]{this, frameLayout, new Integer(i), livePhotoModel, new Boolean(z)});
        } else if (z) {
            z(frameLayout, i, livePhotoModel, true);
        } else {
            LivePhotoView livePhotoView = new LivePhotoView(frameLayout.getContext());
            com.alibaba.fastjson.JSONObject originalData = livePhotoModel.getOriginalData();
            if (originalData != null) {
                jSONObject = new JSONObject(originalData);
            } else {
                jSONObject = null;
            }
            livePhotoView.setLivePhotoInfo(jSONObject);
            livePhotoView.setPlayScenes(livePhotoModel.getPlayScene());
            livePhotoView.setVideoSource(livePhotoModel.getPlaySource());
            livePhotoView.setBizCode(livePhotoModel.getBizCode());
            livePhotoView.setIsMute(true);
            livePhotoView.setVideoAspectRatio(DWAspectRatio.DW_CENTER_CROP);
            livePhotoView.setWidthAndHeight(livePhotoModel.getDisplayWidth(), livePhotoModel.getDisplayHeight());
            livePhotoView.setLiveIconVisible(true);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(livePhotoModel.getDisplayWidth(), livePhotoModel.getDisplayHeight());
            layoutParams.gravity = 17;
            frameLayout.addView(livePhotoView, layoutParams);
            if (livePhotoModel.getMainPicUrl() != null) {
                livePhotoView.setTransitionName(livePhotoModel.getMainPicUrl());
            }
            livePhotoView.setOnClickListener(new c(livePhotoModel, i));
            try {
                livePhotoView.prepare();
            } catch (Throwable th) {
                tpu.Companion.a(TAG, "LivePhotoView prepare error", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Type inference failed for: r11v15, types: [T, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r11v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.widget.FrameLayout r10, int r11, tb.afi r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserAdapter.z(android.widget.FrameLayout, int, tb.afi, boolean):void");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        ckf.g(obj, "object");
        List<? extends afi> list = this.b;
        if (list == null) {
            return -2;
        }
        View view = (View) obj;
        List<? extends afi> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((afi) list.get(i)) == view.getTag(R.id.turbo_id_media_model)) {
                return i;
            }
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (ckf.b((afi) list.get(i2), view.getTag(R.id.turbo_id_media_model))) {
                return i2;
            }
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        ckf.g(view, "view");
        ckf.g(obj, "object");
        return view == obj;
    }

    public final void x(int i, FrameLayout frameLayout, afi afiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39b1b26", new Object[]{this, new Integer(i), frameLayout, afiVar});
            return;
        }
        frameLayout.removeAllViews();
        C(i, 0);
        boolean q = q();
        if (afiVar instanceof PhotoModel) {
            z(frameLayout, i, afiVar, q);
        } else if (afiVar instanceof LivePhotoModel) {
            y(frameLayout, i, (LivePhotoModel) afiVar, q);
        } else if (afiVar instanceof VideoModel) {
            A(frameLayout, (VideoModel) afiVar, q);
        }
        if (afiVar.getAnchors() instanceof vu0) {
            MediaBrowserComponent mediaBrowserComponent = this.f;
            Context context = frameLayout.getContext();
            ckf.f(context, "view.context");
            AnchorViews anchorViews = new AnchorViews(mediaBrowserComponent, context);
            Object anchors = afiVar.getAnchors();
            if (anchors != null) {
                anchorViews.e((vu0) anchors);
                anchorViews.c().setId(R.id.turbo_id_anchor_view);
                anchorViews.c().setTag(anchorViews);
                ViewGroup.LayoutParams layoutParams = anchorViews.c().getLayoutParams();
                if (q) {
                    int height = ((b7d) this.f.o().getService(b7d.class)).getHeight();
                    MediaBrowserComponent mediaBrowserComponent2 = this.f;
                    if (mediaBrowserComponent2 != null) {
                        VIEW view = ((ZoomMediaBrowserComponent) mediaBrowserComponent2).U().getView();
                        ckf.d(view);
                        int height2 = ((FrameLayout) view).getHeight();
                        if (layoutParams != null) {
                            ((FrameLayout.LayoutParams) layoutParams).topMargin = (height - height2) / 2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.component.mediabrowser.ZoomMediaBrowserComponent");
                    }
                }
                frameLayout.addView(anchorViews.c(), layoutParams);
                if (this.e) {
                    anchorViews.c().setAlpha(0.0f);
                    zrt.Companion.d(new f(anchorViews), 100L);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.AnchorModel");
            }
        }
        this.e = false;
    }

    public final void D(int i, afi afiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a33592a", new Object[]{this, new Integer(i), afiVar});
            return;
        }
        try {
            d2e d2eVar = (d2e) this.f.o().getService(d2e.class);
            String type = afiVar.getType();
            int hashCode = type.hashCode();
            if (hashCode != 110986) {
                if (hashCode == 112202875 && type.equals("video")) {
                    Boolean bool = Boolean.FALSE;
                    d2eVar.H("Video", null, bool, null, (i + 1) + ".2");
                }
            } else if (type.equals("pic")) {
                int i2 = i + 1;
                Map<String, ? extends Object> k = kotlin.collections.a.k(jpu.a(nz3.X_POSITION, Integer.valueOf(i2)));
                if (afiVar instanceof LivePhotoModel) {
                    k.put("livephoto", "true");
                }
                Boolean bool2 = Boolean.FALSE;
                d2eVar.H("Pic", k, bool2, null, i2 + ".2");
            }
            Object anchors = afiVar.getAnchors();
            int size = anchors != null ? ((vu0) anchors).b().size() + ((vu0) anchors).a().size() : 0;
            if (size > 0) {
                d2eVar.H(z9u.SEARCH_ANCHOR_FEED, kotlin.collections.a.j(jpu.a("picPosition", Integer.valueOf(i + 1)), jpu.a("anchorNum", Integer.valueOf(size))), Boolean.FALSE, null, null);
            }
        } catch (Throwable th) {
            tpu.Companion.a(TAG, "trackItemExpose error", th);
        }
    }

    public final void b(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c059a7", new Object[]{this, view, new Long(j)});
        } else if (j == 0) {
            view.setAlpha(0.0f);
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
            ckf.f(ofFloat, "this");
            ofFloat.setDuration(j);
            ofFloat.start();
        }
    }
}
