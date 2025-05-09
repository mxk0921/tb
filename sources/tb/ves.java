package tb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ves extends d9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final String e;
    public final ViewGroup f;
    public WeexFragment g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(840957975);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements PixelCopy.OnPixelCopyFinishedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f29970a;
        public final /* synthetic */ CountDownLatch b;

        public b(boolean[] zArr, CountDownLatch countDownLatch) {
            this.f29970a = zArr;
            this.b = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
                return;
            }
            boolean[] zArr = this.f29970a;
            if (i != 0) {
                z = false;
            }
            zArr[0] = z;
            this.b.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements WeexFragment.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // com.taobao.android.weex_ability.page.WeexFragment.c
            public final void onDowngrade() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("877656dd", new Object[]{this});
                } else {
                    TMSLogger.b("TMSWeexRender", "onDowngrade");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements npc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ves f29972a;

            public b(ves vesVar) {
                this.f29972a = vesVar;
            }

            @Override // tb.npc
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else {
                    TMSLogger.b("TMSWeexRender", "weex instance destroy");
                }
            }

            @Override // tb.npc
            public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                    return;
                }
                vbs.k(ves.q1(this.f29972a), str == null ? "" : str);
                TMSLogger.b("TMSWeexRender", "onJSException, type: " + i + ", errorMsg: " + ((Object) str));
            }

            @Override // tb.npc
            public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
                } else {
                    TMSLogger.a("TMSWeexRender", "weex instance prepare success");
                }
            }

            @Override // tb.npc
            public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                TMSLogger.b("TMSWeexRender", "onRefreshFailed, type: " + i + ", errorMsg: " + ((Object) str) + ", isFatal: " + z);
            }

            @Override // tb.npc
            public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
                } else {
                    TMSLogger.a("TMSWeexRender", "weex instance refresh success");
                }
            }

            @Override // tb.npc
            public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                TMSLogger.b("TMSWeexRender", "onRenderFailed, type: " + i + ", errorMsg: " + ((Object) str) + ", isFatal: " + z);
            }

            @Override // tb.npc
            public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                } else {
                    TMSLogger.a("TMSWeexRender", "weex instance render success");
                }
            }
        }

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            ves vesVar = ves.this;
            ves.u1(vesVar, WeexFragment.B2(ves.r1(vesVar), ves.r1(ves.this), null, null, null));
            WeexFragment t1 = ves.t1(ves.this);
            if (t1 != null) {
                t1.R2(a.INSTANCE);
            }
            WeexFragment t12 = ves.t1(ves.this);
            if (t12 != null) {
                t12.T2(new b(ves.this));
            }
            FragmentTransaction beginTransaction = ((FragmentActivity) ves.q1(ves.this).I()).getSupportFragmentManager().beginTransaction();
            beginTransaction.add(ves.s1(ves.this).getId(), ves.t1(ves.this), "ali_mus_fragment_tag");
            beginTransaction.commit();
            ves.this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static {
        t2o.a(840957974);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ves(ITMSPage iTMSPage, String str, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        ckf.g(iTMSPage, "mPage");
        ckf.g(str, "mRenderUrl");
        ckf.g(ocsVar, "renderListener");
        this.e = str;
        FrameLayout frameLayout = new FrameLayout(this.d.I());
        this.f = frameLayout;
        frameLayout.setId(R.id.tms_weex_fragment);
    }

    public static /* synthetic */ Object ipc$super(ves vesVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/weex_render/TMSWeexFragmentRender");
        }
    }

    public static final /* synthetic */ bbs q1(ves vesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("cf7c680d", new Object[]{vesVar});
        }
        return vesVar.d;
    }

    public static final /* synthetic */ String r1(ves vesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da3eb851", new Object[]{vesVar});
        }
        return vesVar.e;
    }

    public static final /* synthetic */ ViewGroup s1(ves vesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("944f0002", new Object[]{vesVar});
        }
        return vesVar.f;
    }

    public static final /* synthetic */ WeexFragment t1(ves vesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFragment) ipChange.ipc$dispatch("b776e679", new Object[]{vesVar});
        }
        return vesVar.g;
    }

    public static final /* synthetic */ void u1(ves vesVar, WeexFragment weexFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbd9e4b", new Object[]{vesVar, weexFragment});
        } else {
            vesVar.g = weexFragment;
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        WeexFragment weexFragment = this.g;
        if (weexFragment != null) {
            if (json instanceof JSONObject) {
                jSONObject = (JSONObject) json;
            } else {
                jSONObject = null;
            }
            weexFragment.u2(str, jSONObject);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WeexFragment weexFragment = this.g;
        if (weexFragment != null) {
            weexFragment.onDestroy();
        }
        super.destroy();
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "Weex";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
        } else {
            ckf.g(str, "script");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WeexFragment weexFragment = this.g;
        if (weexFragment != null) {
            weexFragment.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // tb.d9s, tb.qcs
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // tb.d9s, tb.qcs
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        } else {
            ckf.g(bArr, "script");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else if (this.d.I() != null) {
            this.f.getViewTreeObserver().addOnGlobalLayoutListener(new c());
            TMSLogger.f("TMSWeexRender", "WeexRender do render");
        }
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        if (!q9s.I2()) {
            return null;
        }
        SurfaceView surfaceView = (SurfaceView) o9s.e(this.f, SurfaceView.class);
        if (surfaceView != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.f.getWidth(), this.f.getHeight(), Bitmap.Config.ARGB_8888);
            surfaceView.getLocationInWindow(new int[2]);
            boolean[] zArr = new boolean[1];
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                HandlerThread handlerThread = new HandlerThread("themis_snapshot");
                handlerThread.start();
                if (i >= 24) {
                    PixelCopy.request(surfaceView, new Rect(0, 0, surfaceView.getWidth(), surfaceView.getHeight()), createBitmap, dgy.a(new b(zArr, countDownLatch)), new Handler(handlerThread.getLooper()));
                    countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                }
                handlerThread.quit();
                if (zArr[0]) {
                    return createBitmap;
                }
                return null;
            } catch (Throwable th) {
                TMSLogger.c("TMSWeexRender", th.getMessage(), th);
                return null;
            }
        } else {
            TextureView textureView = (TextureView) o9s.e(this.f, TextureView.class);
            if (textureView != null) {
                return textureView.getBitmap();
            }
            ViewGroup viewGroup = this.f;
            return f9s.a(viewGroup, viewGroup.getWidth(), this.f.getHeight(), 0, 0);
        }
    }
}
