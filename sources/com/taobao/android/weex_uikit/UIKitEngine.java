package com.taobao.android.weex_uikit;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.cache.UIRenderView;
import com.taobao.android.weex_uikit.widget.a.A;
import com.taobao.android.weex_uikit.widget.div.Div;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.android.weex_uikit.widget.input.Input;
import com.taobao.android.weex_uikit.widget.musview.MUSUrlView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import com.taobao.android.weex_uikit.widget.scroller.Scroller;
import com.taobao.android.weex_uikit.widget.slide.Slide;
import com.taobao.android.weex_uikit.widget.text.Text;
import com.taobao.android.weex_uikit.widget.video.Video;
import java.util.ConcurrentModificationException;
import tb.dwh;
import tb.gyp;
import tb.ivu;
import tb.lxh;
import tb.ovh;
import tb.pg1;
import tb.t2o;
import tb.upc;
import tb.uvh;
import tb.wpc;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UIKitEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static upc imusViewCreator;
    private static final Bitmap sBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    private static boolean hasInitSo = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements wpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View a(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("12e103dd", new Object[]{this, mUSDKInstance});
            }
            MUSView mUSView = new MUSView(mUSDKInstance);
            mUSView.setBackground(new BitmapDrawable(mUSDKInstance.getUIContext().getResources(), UIKitEngine.access$000()));
            return mUSView;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/UIKitEngine$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            new Div(0);
            new Text(0);
            new Image(0);
            new A(0);
            new RichText(0);
            new Input(0);
        }
    }

    static {
        t2o.a(986710018);
    }

    public static /* synthetic */ Bitmap access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6512155", new Object[0]);
        }
        return sBitmap;
    }

    public static upc getVideoCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upc) ipChange.ipc$dispatch("ecfe52ac", new Object[0]);
        }
        return imusViewCreator;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        loadSo();
        lxh.b().c(new a());
        UIRenderView.init();
        registerInnerNode();
    }

    private static void innerNodeWarmUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f501f", new Object[0]);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b());
        }
    }

    private static void loadSo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bcf169", new Object[0]);
        } else if (!hasInitSo) {
            for (int i = 0; i < 3; i++) {
                try {
                    System.loadLibrary("MuiseCore");
                    hasInitSo = true;
                    return;
                } catch (Throwable th) {
                    dwh.g("loadSo", "UIKitEngine.loadSo failed", th);
                    if (th instanceof ConcurrentModificationException) {
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                        }
                    } else if (uvh.f().c() != null) {
                        uvh.f().c().c(WeexErrorType.SO_LOAD_FAIL, "DEFAULT", "MuiseCore loadLibrary error", dwh.m(th));
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private static void registerInnerNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d338801c", new Object[0]);
            return;
        }
        ivu.h("div", new Div.a());
        ivu.i("text", new Text.a(), true);
        ivu.i(pg1.ATOM_EXT_span, new Text.a(), true);
        ivu.i("input", new Input.d(), false);
        ivu.h("image", new Image.a());
        ivu.i("img", new Image.a(), true);
        ivu.h("a", new A.a());
        ivu.i("richtext", new RichText.a(), true);
        ivu.i("p", new RichText.a(), true);
        ivu.h("mus-scroll", new Scroller.a());
        ivu.h("mus-video", new Video.h());
        ivu.h("mus-slide", new Slide.a());
        ivu.i("mus-view", new MUSUrlView.a(), true);
        ivu.h(MUSOverlay.LOG_TAG, new gyp(new ovh(), MUSOverlay.class));
        innerNodeWarmUp();
    }

    public static void registerVideoCreator(upc upcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff324ff", new Object[]{upcVar});
        } else {
            imusViewCreator = upcVar;
        }
    }
}
