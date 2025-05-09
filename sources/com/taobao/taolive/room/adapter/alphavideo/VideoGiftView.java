package com.taobao.taolive.room.adapter.alphavideo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.room.adapter.alphavideo.a;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bl9;
import tb.d9e;
import tb.d9m;
import tb.hyb;
import tb.mvc;
import tb.p9d;
import tb.r9d;
import tb.t2o;
import tb.v7t;
import tb.z8a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoGiftView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoGiftView";
    private boolean isPlaying;
    private r9d mPlayerController;
    private RelativeLayout mVideoContainer;
    private TBLiveGiftEntity playGiftEntity;
    private final List<d9e> mObservers = new CopyOnWriteArrayList();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final p9d mPlayerAction = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements p9d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.p9d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("767d46f8", new Object[]{this});
                return;
            }
            VideoGiftView.access$002(VideoGiftView.this, false);
            VideoGiftView.access$200(VideoGiftView.this);
        }

        @Override // tb.p9d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df9305bf", new Object[]{this});
                return;
            }
            VideoGiftView.access$002(VideoGiftView.this, true);
            VideoGiftView.access$100(VideoGiftView.this);
        }

        @Override // tb.p9d
        public void c(int i, int i2, ScaleType scaleType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed0c935b", new Object[]{this, new Integer(i), new Integer(i2), scaleType});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13131a;
        public final /* synthetic */ LifecycleOwner b;

        public b(Context context, LifecycleOwner lifecycleOwner) {
            this.f13131a = context;
            this.b = lifecycleOwner;
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                VideoGiftView.access$300(VideoGiftView.this, this.f13131a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.taolive.room.adapter.alphavideo.a.b
        public void onError(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724a699a", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            VideoGiftView.access$400(VideoGiftView.this, str);
            if (VideoGiftView.access$500(VideoGiftView.this) != null) {
                v7t.i(VideoGiftView.TAG, "startVideoGiftError | url=" + VideoGiftView.access$500(VideoGiftView.this).mAnimationMp4 + "| giftId=" + VideoGiftView.access$500(VideoGiftView.this).mGiftId);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements mvc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(VideoGiftView videoGiftView) {
        }

        @Override // tb.mvc
        public void a(boolean z, String str, int i, int i2, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b60b6c7", new Object[]{this, new Boolean(z), str, new Integer(i), new Integer(i2), str2});
                return;
            }
            v7t.i(VideoGiftView.TAG, "mPlayerController monitor: b=" + z + "    s=" + str + " i=" + i + " i1=" + i2 + "  s1=" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hyb f13133a;

        public e(hyb hybVar) {
            this.f13133a = hybVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (VideoGiftView.access$600(VideoGiftView.this) != null) {
                VideoGiftView.access$600(VideoGiftView.this).f(this.f13133a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (VideoGiftView.access$600(VideoGiftView.this) != null) {
                VideoGiftView.access$600(VideoGiftView.this).b(VideoGiftView.access$700(VideoGiftView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (VideoGiftView.access$600(VideoGiftView.this) != null) {
                VideoGiftView.access$600(VideoGiftView.this).d(VideoGiftView.access$700(VideoGiftView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            VideoGiftView.access$002(VideoGiftView.this, false);
            if (VideoGiftView.access$600(VideoGiftView.this) != null) {
                VideoGiftView.access$600(VideoGiftView.this).d(VideoGiftView.access$700(VideoGiftView.this));
                VideoGiftView.access$600(VideoGiftView.this).release();
                if ((VideoGiftView.access$600(VideoGiftView.this) instanceof r9d) && (VideoGiftView.this.getContext() instanceof LifecycleOwner)) {
                    ((LifecycleOwner) VideoGiftView.this.getContext()).getLifecycle().removeObserver((LifecycleObserver) VideoGiftView.access$600(VideoGiftView.this));
                }
            }
            VideoGiftView.access$800(VideoGiftView.this).clear();
        }
    }

    static {
        t2o.a(806355658);
    }

    public VideoGiftView(Context context) {
        super(context);
        initView();
    }

    public static /* synthetic */ boolean access$002(VideoGiftView videoGiftView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1528ce", new Object[]{videoGiftView, new Boolean(z)})).booleanValue();
        }
        videoGiftView.isPlaying = z;
        return z;
    }

    public static /* synthetic */ void access$100(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beca62c9", new Object[]{videoGiftView});
        } else {
            videoGiftView.notifyPlayStart();
        }
    }

    public static /* synthetic */ void access$200(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89daca", new Object[]{videoGiftView});
        } else {
            videoGiftView.notifyPlayEnd();
        }
    }

    public static /* synthetic */ void access$300(VideoGiftView videoGiftView, Context context, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883a5250", new Object[]{videoGiftView, context, lifecycleOwner});
        } else {
            videoGiftView.initPlayerControllerInner(context, lifecycleOwner);
        }
    }

    public static /* synthetic */ void access$400(VideoGiftView videoGiftView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db55996", new Object[]{videoGiftView, str});
        } else {
            videoGiftView.notifyPlayError(str);
        }
    }

    public static /* synthetic */ TBLiveGiftEntity access$500(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveGiftEntity) ipChange.ipc$dispatch("660fae", new Object[]{videoGiftView});
        }
        return videoGiftView.playGiftEntity;
    }

    public static /* synthetic */ r9d access$600(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r9d) ipChange.ipc$dispatch("f9739203", new Object[]{videoGiftView});
        }
        return videoGiftView.mPlayerController;
    }

    public static /* synthetic */ RelativeLayout access$700(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("d5c13b9f", new Object[]{videoGiftView});
        }
        return videoGiftView.mVideoContainer;
    }

    public static /* synthetic */ List access$800(VideoGiftView videoGiftView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d89a2d77", new Object[]{videoGiftView});
        }
        return videoGiftView.mObservers;
    }

    public static String getGiftDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208dba66", new Object[]{context});
        }
        String f2 = z8a.f(context);
        if (TextUtils.isEmpty(f2)) {
            return "";
        }
        String str = File.separator;
        if (f2.endsWith(str)) {
            return f2;
        }
        return f2 + str;
    }

    private void initPlayerControllerInner(Context context, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ff89d5", new Object[]{this, context, lifecycleOwner});
        } else if (d9m.c() != null) {
            r9d createGLTextureViewPlayerController = d9m.c().createGLTextureViewPlayerController(context, lifecycleOwner, new c());
            this.mPlayerController = createGLTextureViewPlayerController;
            if (createGLTextureViewPlayerController != null) {
                createGLTextureViewPlayerController.c(this.mPlayerAction);
                this.mPlayerController.e(new d(this));
            }
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.view_video_gift, this);
        this.mVideoContainer = (RelativeLayout) findViewById(R.id.video_view);
    }

    public static /* synthetic */ Object ipc$super(VideoGiftView videoGiftView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/adapter/alphavideo/VideoGiftView");
    }

    private void notifyPlayEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef5cb05", new Object[]{this});
            return;
        }
        List<d9e> list = this.mObservers;
        if (list != null && list.size() > 0) {
            for (d9e d9eVar : this.mObservers) {
                d9eVar.c(this.playGiftEntity);
            }
        }
    }

    private void notifyPlayError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf20a3c", new Object[]{this, str});
            return;
        }
        List<d9e> list = this.mObservers;
        if (list != null && list.size() > 0) {
            for (d9e d9eVar : this.mObservers) {
                d9eVar.a(str, this.playGiftEntity);
            }
        }
    }

    private void notifyPlayStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3bae4c", new Object[]{this});
            return;
        }
        List<d9e> list = this.mObservers;
        if (list != null && list.size() > 0) {
            for (d9e d9eVar : this.mObservers) {
                d9eVar.b(this.playGiftEntity);
            }
        }
    }

    public void addObserver(d9e d9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceec92cb", new Object[]{this, d9eVar});
        } else if (d9eVar != null) {
            this.mObservers.add(d9eVar);
        }
    }

    public void attachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed22211", new Object[]{this});
        } else {
            this.mMainHandler.post(new f());
        }
    }

    public void detachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
        } else {
            this.mMainHandler.post(new g());
        }
    }

    public void initPlayerController(Context context, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6f899", new Object[]{this, context, lifecycleOwner});
            return;
        }
        v7t.i(TAG, "initPlayerController");
        if (bl9.g().b()) {
            initPlayerControllerInner(context, lifecycleOwner);
        } else {
            bl9.g().i(new b(context, lifecycleOwner));
        }
    }

    public boolean isVideoPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a32d388", new Object[]{this})).booleanValue();
        }
        return this.isPlaying;
    }

    public void releasePlayerController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05a160b", new Object[]{this});
        } else {
            this.mMainHandler.post(new h());
        }
    }

    public void removeObserver(d9e d9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327c9588", new Object[]{this, d9eVar});
        } else if (d9eVar != null) {
            this.mObservers.remove(d9eVar);
        }
    }

    public void startVideoGift(TBLiveGiftEntity tBLiveGiftEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b08d7e1", new Object[]{this, tBLiveGiftEntity});
        } else if (bl9.g().b()) {
            this.isPlaying = true;
            this.playGiftEntity = tBLiveGiftEntity;
            if (tBLiveGiftEntity != null) {
                String e2 = z8a.e(tBLiveGiftEntity.mAnimationMp4);
                if (!TextUtils.isEmpty(e2)) {
                    hyb createDataSource = d9m.c() != null ? d9m.c().createDataSource() : null;
                    if (createDataSource != null) {
                        createDataSource.b(e2, ScaleType.BottomFit.ordinal()).c(e2, ScaleType.ScaleAspectFitCenter.ordinal());
                        createDataSource.a(getGiftDir(getContext()));
                        if (!createDataSource.isValid()) {
                            Log.e(TAG, "startVideoGift: dataSource is invalid.");
                            return;
                        }
                        v7t.i(TAG, "startVideoGift | url=" + this.playGiftEntity.mAnimationMp4 + "| giftId=" + this.playGiftEntity.mGiftId);
                        this.mMainHandler.post(new e(createDataSource));
                    }
                }
            }
        }
    }

    public VideoGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public VideoGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    public VideoGiftView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView();
    }
}
