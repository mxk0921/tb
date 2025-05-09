package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.pvh;
import tb.t2o;
import tb.txj;
import tb.uaw;
import tb.z74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VideoWeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "newdetail_video";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f7103a;
        public final /* synthetic */ pvh b;

        public a(Bitmap bitmap, pvh pvhVar) {
            this.f7103a = bitmap;
            this.b = pvhVar;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
                return;
            }
            txj.e(txj.TAG_RENDER, "onPixelCopyFinished, copyResult=" + i);
            VideoWeexModule.access$000(VideoWeexModule.this, this.f7103a, this.b);
        }
    }

    static {
        t2o.a(352321753);
    }

    public VideoWeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ void access$000(VideoWeexModule videoWeexModule, Bitmap bitmap, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7592685", new Object[]{videoWeexModule, bitmap, pvhVar});
        } else {
            videoWeexModule.sendBitmap(bitmap, pvhVar);
        }
    }

    private SurfaceView findSurfaceView(ViewGroup viewGroup) {
        SurfaceView findSurfaceView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceView) ipChange.ipc$dispatch("22e6c51e", new Object[]{this, viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof SurfaceView) {
                return (SurfaceView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (findSurfaceView = findSurfaceView((ViewGroup) childAt)) != null) {
                return findSurfaceView;
            }
        }
        return null;
    }

    private View findVideoParent(ViewParent viewParent) {
        ViewGroup viewGroup;
        int id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c30dc97", new Object[]{this, viewParent});
        }
        if (viewParent == null) {
            return null;
        }
        if (!(viewParent instanceof ViewGroup) || ((id = (viewGroup = (ViewGroup) viewParent).getId()) != R.id.main_render_fl && id != 16908290)) {
            return findVideoParent(viewParent.getParent());
        }
        View findViewById = viewGroup.findViewById(R.id.mainpic_layout);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return viewGroup.findViewById(R.id.video_host);
        }
        return findViewById.findViewById(R.id.video_host);
    }

    private void getAndSendBitmapFromSurfaceView(SurfaceView surfaceView, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e20507", new Object[]{this, surfaceView, pvhVar});
        } else if (surfaceView != null && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && Build.VERSION.SDK_INT >= 24) {
            Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            PixelCopy.request(surfaceView, createBitmap, new a(createBitmap, pvhVar), new Handler(Looper.getMainLooper()));
        }
    }

    private Bitmap getBitmapFromTextureView(TextureView textureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2538420f", new Object[]{this, textureView});
        }
        Context uIContext = getInstance().getUIContext();
        if (uIContext == null) {
            return null;
        }
        int i = uIContext.getResources().getDisplayMetrics().widthPixels;
        if (textureView.getWidth() >= i) {
            return textureView.getBitmap(i, textureView.getHeight());
        }
        return textureView.getBitmap();
    }

    public static /* synthetic */ Object ipc$super(VideoWeexModule videoWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/weex/VideoWeexModule");
    }

    @MUSMethod
    public void getSnapshotImage(float f, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d01be1", new Object[]{this, new Float(f), pvhVar});
            return;
        }
        View findVideoParent = findVideoParent(getInstance().getRenderView().getParent());
        if (findVideoParent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findVideoParent;
            TextureView a2 = z74.a(viewGroup);
            if (a2 != null) {
                sendBitmap(getBitmapFromTextureView(a2), pvhVar);
            } else {
                getAndSendBitmapFromSurfaceView(findSurfaceView(viewGroup), pvhVar);
            }
        }
    }

    private void sendBitmap(Bitmap bitmap, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31dc779", new Object[]{this, bitmap, pvhVar});
        } else if (bitmap != null) {
            String str = "video" + System.currentTimeMillis();
            uaw.b().c(str, bitmap);
            HashMap hashMap = new HashMap(1);
            hashMap.put("fileName", str);
            pvhVar.b(MUSValue.ofJSON(hashMap));
        }
    }
}
