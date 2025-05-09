package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ntm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VIEW_RENDER_LAYER_CELL = 2;
    public static final int VIEW_RENDER_LAYER_CONTAINER = 0;
    public static final int VIEW_RENDER_LAYER_INIT = -1;
    public static final int VIEW_RENDER_LAYER_LIST_ROOT = 1;

    /* renamed from: a  reason: collision with root package name */
    public final atb f24942a;
    public String b;
    public long c;
    public Map d;
    public Map e;
    public boolean f;
    public Map g;
    public Map h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public Drawable m;
    public TUrlImageView n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public DetailCacheData t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TUrlImageView tUrlImageView = ntm.this.n;
            if (tUrlImageView != null && (tUrlImageView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) ntm.this.n.getParent()).removeView(ntm.this.n);
                ntm.this.n = null;
                ir9.b("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "PickPreloadControllerNew,firstFrameImagerView 移除清空");
            }
        }
    }

    static {
        t2o.a(468714657);
    }

    public ntm(atb atbVar, String str) {
        System.currentTimeMillis();
        this.f24942a = atbVar;
        this.b = str;
        if (atbVar != null && atbVar.getView() != null) {
            atbVar.getView().setTag(R.id.fluid_sdk_tag_preloadVideo, this);
        }
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fd8173e", new Object[]{this, context})).booleanValue();
        }
        atb atbVar = this.f24942a;
        if (atbVar == null || atbVar.getView() == null) {
            return false;
        }
        String H2 = akt.H2("ShortVideo.videoAttachScenario", "huitui");
        if (TextUtils.equals(H2, "all") || (this.s && TextUtils.equals(H2, "huitui"))) {
            return true;
        }
        return e(context);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        atb atbVar = this.f24942a;
        if (atbVar != null) {
            try {
                ViewGroup view = atbVar.getView();
                if (view != null && view.getParent() == null) {
                    ir9.b("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "销毁预创建的DW实例");
                    this.f24942a.destroy();
                }
            } catch (Throwable th) {
                ir9.b("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "销毁预创建的DW实例:" + th.getMessage());
            }
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("362a1470", new Object[]{this})).intValue();
        }
        atb atbVar = this.f24942a;
        if (atbVar == null || atbVar.getView() == null) {
            return -1;
        }
        return nwv.t(this.f24942a.getView().getTag(R.id.fluid_sdk_tag_video_render_layer), -1);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8609dbed", new Object[]{this})).booleanValue();
        }
        if (this.f24942a != null) {
            return true;
        }
        return false;
    }

    public boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fcebba1", new Object[]{this, context})).booleanValue();
        }
        atb atbVar = this.f24942a;
        if (atbVar == null || atbVar.getView() == null || this.f24942a.getView().getContext() != context) {
            return false;
        }
        return true;
    }

    public boolean f(Context context) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("656c2b5f", new Object[]{this, context})).booleanValue();
        }
        atb atbVar = this.f24942a;
        if (!(atbVar == null || atbVar.getView() == null || !(this.f24942a.getView().getParent() instanceof ViewGroup))) {
            Context context2 = ((ViewGroup) this.f24942a.getView().getParent()).getContext();
            if (context == null || context2 != context) {
                z = false;
            }
            z2 = z;
        }
        ir9.b("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "isVideoAttachAtContext: " + z2 + " context:" + context);
        return z2;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226ea787", new Object[]{this});
            return;
        }
        ir9.b("PickPreloadController_PickPreloadVideoModule_PreloadVideoData", "PickPreloadControllerNew,removeFirstFrameLoadingView firstFrameImageView:" + this.n);
        if (this.n != null) {
            nwv.y0(new a());
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7dec942", new Object[]{this, new Boolean(z)});
            return;
        }
        g();
        atb atbVar = this.f24942a;
        if (atbVar == null) {
            return;
        }
        if (z || this.r || this.j) {
            atbVar.pauseVideo();
            this.f24942a.destroy();
            xau.u();
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88586b5b", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570f5632", new Object[]{this, new Integer(i)});
            return;
        }
        atb atbVar = this.f24942a;
        if (atbVar != null && atbVar.getView() != null) {
            this.f24942a.getView().setTag(R.id.fluid_sdk_tag_video_render_layer, Integer.valueOf(i));
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("PreloadedVideo{videoId='");
        sb.append(this.b);
        sb.append("', mixConfig=");
        String str = "true";
        sb.append(sz3.b(this.g) ? "false" : str);
        sb.append("', firstFrameUrl=");
        sb.append(TextUtils.isEmpty(this.l) ? "false" : str);
        sb.append("', cacheTime=");
        sb.append(this.c);
        sb.append(", videoResourceStr='");
        sb.append(TextUtils.isEmpty(this.i) ? "false" : str);
        sb.append("', isLocalVideo=");
        sb.append(this.j);
        sb.append(", localVideoStr='");
        sb.append(TextUtils.isEmpty(this.k) ? "false" : str);
        sb.append("', isExposed=");
        sb.append(this.o);
        sb.append(", fromIconStream=");
        sb.append(this.p);
        sb.append(", detailResponse=");
        if (sz3.b(this.d)) {
            str = "false";
        }
        sb.append(str);
        sb.append(", isFromLauncher=");
        sb.append(this.q);
        sb.append(", firstFrameUrl=");
        sb.append(this.l);
        sb.append('}');
        return sb.toString();
    }
}
