package com.taobao.taobaoavsdk.widget.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.a;
import tb.qbi;
import tb.t2o;
import tb.tfb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TextureRenderView extends TextureView implements com.taobao.taobaoavsdk.widget.media.a, TextureView.SurfaceTextureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = "TextureRenderView";
    private a.AbstractC0740a mCallback;
    private boolean mEnableStaySurfaceTexture = true;
    private int mHeight;
    private boolean mIsFormatChanged;
    private qbi mMeasureHelper;
    private a mSurfaceHolder;
    private SurfaceTexture mSurfaceTexture;
    private int mWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextureRenderView f12988a;
        public SurfaceTexture b;
        public Surface c;

        static {
            t2o.a(774897991);
            t2o.a(774897967);
        }

        public a(TextureRenderView textureRenderView, SurfaceTexture surfaceTexture) {
            this.f12988a = textureRenderView;
            this.b = surfaceTexture;
        }

        public static /* synthetic */ Surface b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("58aa013c", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ Surface c(a aVar, Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("a9b85472", new Object[]{aVar, surface});
            }
            aVar.c = surface;
            return surface;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61c8e096", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer != null) {
                if (this.b == null) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " InternalSurfaceHolder bindToMediaPlayer null and return");
                    iMediaPlayer.setSurface(null);
                    return;
                }
                if (this.c == null || Build.VERSION.SDK_INT < TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE) {
                    this.c = new Surface(this.b);
                } else if (!TextureRenderView.access$000(this.f12988a)) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " InternalSurfaceHolder bindToMediaPlayer " + this.b);
                    this.c = new Surface(this.b);
                }
                iMediaPlayer.setSurface(this.c);
            }
        }

        public void d(SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d6fbf8", new Object[]{this, surfaceTexture});
                return;
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " InternalSurfaceHolder setSurfaceTexture " + surfaceTexture);
            this.b = surfaceTexture;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public com.taobao.taobaoavsdk.widget.media.a getRenderView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.taobaoavsdk.widget.media.a) ipChange.ipc$dispatch("12305290", new Object[]{this});
            }
            return this.f12988a;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public Surface getSurface() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
            }
            return this.c;
        }
    }

    static {
        t2o.a(774897990);
        t2o.a(774897965);
    }

    public TextureRenderView(Context context) {
        super(context);
        initView(context);
    }

    public static /* synthetic */ boolean access$000(TextureRenderView textureRenderView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4f36543", new Object[]{textureRenderView})).booleanValue();
        }
        return textureRenderView.mEnableStaySurfaceTexture;
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mMeasureHelper = new qbi();
        setSurfaceTextureListener(this);
    }

    public static /* synthetic */ Object ipc$super(TextureRenderView textureRenderView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/widget/media/TextureRenderView");
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void addRenderCallback(a.AbstractC0740a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672fa3e5", new Object[]{this, aVar});
            return;
        }
        this.mCallback = aVar;
        if (this.mSurfaceHolder == null && this.mSurfaceTexture != null) {
            a aVar2 = new a(this, this.mSurfaceTexture);
            this.mSurfaceHolder = aVar2;
            aVar.a(aVar2, this.mWidth, this.mHeight);
        }
        if (this.mIsFormatChanged) {
            if (this.mSurfaceHolder == null) {
                this.mSurfaceHolder = new a(this, this.mSurfaceTexture);
            }
            aVar.b(this.mSurfaceHolder, 0, this.mWidth, this.mHeight);
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mMeasureHelper.a(i, i2);
        setMeasuredDimension(this.mMeasureHelper.e(), this.mMeasureHelper.d());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbd3ac", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable " + surfaceTexture + ", w=" + i + ", h=" + i2);
        if (Build.VERSION.SDK_INT < TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE || !this.mEnableStaySurfaceTexture) {
            this.mSurfaceTexture = surfaceTexture;
        } else {
            SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            if (surfaceTexture2 != null) {
                setSurfaceTexture(surfaceTexture2);
            }
            if (this.mSurfaceTexture == null) {
                this.mSurfaceTexture = surfaceTexture;
            }
        }
        this.mIsFormatChanged = false;
        this.mWidth = 0;
        this.mHeight = 0;
        a aVar = this.mSurfaceHolder;
        if (aVar == null) {
            this.mSurfaceHolder = new a(this, this.mSurfaceTexture);
        } else {
            aVar.d(this.mSurfaceTexture);
        }
        a.AbstractC0740a aVar2 = this.mCallback;
        if (aVar2 != null) {
            aVar2.a(this.mSurfaceHolder, 0, 0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        this.mIsFormatChanged = false;
        this.mWidth = 0;
        this.mHeight = 0;
        if (this.mEnableStaySurfaceTexture && Build.VERSION.SDK_INT >= TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE) {
            z = false;
        }
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = new a(this, surfaceTexture);
        }
        a.AbstractC0740a aVar = this.mCallback;
        if (aVar != null) {
            aVar.c(this.mSurfaceHolder, z);
        }
        return z;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsFormatChanged = true;
        this.mWidth = i;
        this.mHeight = i2;
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = new a(this, surfaceTexture);
        }
        a.AbstractC0740a aVar = this.mCallback;
        if (aVar != null) {
            aVar.b(this.mSurfaceHolder, 0, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
        }
    }

    public void releaseSurface() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE && (aVar = this.mSurfaceHolder) != null && a.b(aVar) != null) {
            a.b(this.mSurfaceHolder).release();
            a.c(this.mSurfaceHolder, null);
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void removeRenderCallback(a.AbstractC0740a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f887322", new Object[]{this, aVar});
        } else {
            this.mCallback = null;
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.f(i);
        requestLayout();
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.i(i);
        setRotation(i);
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSampleAspectRatio(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886d77", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.mMeasureHelper.j(i, i2);
            requestLayout();
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            this.mMeasureHelper.k(i, i2);
            requestLayout();
        }
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
