package com.taobao.android.weex_uikit.widget.video;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.UIKitEngine;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.List;
import tb.cxh;
import tb.egl;
import tb.pvh;
import tb.t2o;
import tb.tmu;
import tb.tpc;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_AUTO_PLAY = "autoplay";
    public static final String ATTR_BIZ_FROM = "bizFrom";
    public static final String ATTR_CONTENT_ID = "contentId";
    public static final String ATTR_CONTROLS = "controls";
    public static final String ATTR_CONTROL_BY_LIST = "controlByList";
    public static final String ATTR_DELAY_TIME = "delayTime";
    public static final String ATTR_ENABLE_PAN = "enablePan";
    public static final String ATTR_LOOP = "loop";
    public static final String ATTR_MUTE = "muted";
    public static final String ATTR_OBJECT_FIT = "objectFit";
    public static final String ATTR_PANO_TYPE = "panoType";
    public static final String ATTR_PLAY_SCENES = "playScenes";
    public static final String ATTR_POSTER = "poster";
    public static final String ATTR_SHOW_CENTER_PLAY_BTN = "showCenterPlayBtn";
    public static final String ATTR_SHOW_FULLSCREEN_BTN = "showFullscreenBtn";
    public static final String ATTR_SHOW_MUTE_BTN = "showMuteBtn";
    public static final String ATTR_SHOW_PLAY_BTN = "showPlayBtn";
    public static final String ATTR_SHOW_PLAY_RATE_BTN = "showPlayRateBtn";
    public static final String ATTR_SRC = "src";
    public static final String ATTR_UT_PARAMS = "utParams";
    public static final String ATTR_VIDEO_ID = "videoId";
    public static final String ATTR_VIDEO_SOURCE = "videoSource";
    public static final boolean DEFAULT_AUTO_PLAY = false;
    public static final boolean DEFAULT_CONTROL_BY_LIST = true;
    public static final boolean DEFAULT_LOOP = false;
    public static final boolean DEFAULT_MUTE = false;
    public static final String STATUS_FINISH = "finish";
    public static final String STATUS_PLAY = "play";
    public static final String STATUS_START = "start";
    public static final String STATUS_STOP = "stop";
    public static final String VIDEO_CALLBACK = "videocallback";
    public static final String VIDEO_STATUS = "videostatus";
    public static final String VISIBILITY_STATUS = "visibility";

    /* renamed from: a  reason: collision with root package name */
    public static final String f10032a = "detail";
    public static final String b = "videoDuration";
    public static final String c = tmu.CURRENT_TIME;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UINode f10033a;

        public a(UINode uINode) {
            this.f10033a = uINode;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.a(this.f10033a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ e e;
        public final /* synthetic */ tpc f;
        public final /* synthetic */ a.b g;

        public b(UINode uINode, e eVar, tpc tpcVar, a.b bVar) {
            this.d = uINode;
            this.e = eVar;
            this.f = tpcVar;
            this.g = bVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/VideoSpec$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (this.d.isMounted() && this.e.f10035a) {
                UINode uINode = this.d;
                c.o(uINode, uINode.getInstance(), (MUSVideoView) this.d.getMountContent(), this.f, this.g);
                UINode uINode2 = this.d;
                c.l(uINode2, uINode2.getInstance(), (MUSVideoView) this.d.getMountContent(), this.g, this.e, this.f);
            }
            this.e.f10035a = false;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.widget.video.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0528c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public C0528c(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(C0528c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/VideoSpec$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                c.a(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10034a = true;

        static {
            t2o.a(986710297);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10035a;
        public boolean b;

        static {
            t2o.a(986710298);
        }
    }

    public static void A(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6430624b", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("controls", Boolean.valueOf(z));
        }
    }

    public static void B(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16f8cfd", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(ATTR_DELAY_TIME, str);
        }
    }

    public static void C(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d616eb", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(ATTR_ENABLE_PAN, Boolean.valueOf(z));
        }
    }

    public static void D(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765508fa", new Object[]{uINode, jSONObject});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.setFov(jSONObject);
        }
    }

    public static void E(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee902b9", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("loop", Boolean.valueOf(z));
        }
    }

    public static void F(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8281c96e", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("muted", Boolean.valueOf(z));
        }
    }

    public static void G(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7953b5b", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("objectFit", str);
        }
    }

    public static void H(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d84d55d", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(ATTR_PANO_TYPE, str);
        }
    }

    public static void I(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d6e00e", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("playScenes", str);
        }
    }

    public static void J(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a9813c", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("poster", str);
        }
    }

    public static void K(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467e8047", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("showCenterPlayBtn", Boolean.valueOf(z));
        }
    }

    public static void L(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da589bf5", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("showFullscreenBtn", Boolean.valueOf(z));
        }
    }

    public static void M(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c645a17", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("showMuteBtn", Boolean.valueOf(z));
        }
    }

    public static void N(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1564c65c", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("showPlayBtn", Boolean.valueOf(z));
        }
    }

    public static void O(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ae56dc", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(ATTR_SHOW_PLAY_RATE_BTN, Boolean.valueOf(z));
        }
    }

    public static void P(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb65109", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("src", str);
        }
    }

    public static void Q(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d19a76", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute("utParams", jSONObject);
        }
    }

    public static void R(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9abf8b7", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("videoId", str);
        }
    }

    public static void S(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63c0237", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("videoSource", str);
        }
    }

    public static void T(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2267e31f", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.stop();
        }
    }

    public static void U(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13225df2", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.toggleFullScreen();
        }
    }

    public static void V(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44cbbaf", new Object[]{uINode, str});
        } else if (TextUtils.equals(str, "appear") && f(uINode) && !g(uINode)) {
            q(uINode);
        }
    }

    public static void X(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bf0e8f", new Object[]{uINode});
            return;
        }
        boolean g = g(uINode);
        String nativeState = uINode.getNativeState("videostatus");
        if (!j(uINode) && g && TextUtils.equals(nativeState, "play")) {
            q(uINode);
        }
    }

    public static /* synthetic */ void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d5af1", new Object[]{uINode});
        } else {
            X(uINode);
        }
    }

    public static void c(UINode uINode, String str, JSONObject jSONObject) {
        MUSDKInstance instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c3ee9", new Object[]{uINode, str, jSONObject});
        } else if (uINode.hasEvent(str) && (instance = uINode.getInstance()) != null && !instance.isDestroyed() && !TextUtils.isEmpty(str)) {
            instance.fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    public static int d(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4e36dda", new Object[]{uINode})).intValue();
        }
        String str = (String) uINode.getAttribute(ATTR_DELAY_TIME);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return cxh.g(str, 0);
    }

    public static void e(UINode uINode, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05c2393", new Object[]{uINode, pvhVar});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null && pvhVar != null) {
            pvhVar.b(mUSVideoView.getFov());
        }
    }

    public static boolean f(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e37a438", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("autoplay")).booleanValue();
    }

    public static boolean g(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a7889d", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("controlByList")).booleanValue();
    }

    public static boolean h(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c117b7", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("loop")).booleanValue();
    }

    public static boolean i(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae779b24", new Object[]{uINode})).booleanValue();
        }
        return ((Boolean) uINode.getAttribute("muted")).booleanValue();
    }

    public static boolean j(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d14dac72", new Object[]{uINode})).booleanValue();
        }
        return "disappear".equals(uINode.getNativeState("visibility"));
    }

    public static MUSVideoView k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSVideoView) ipChange.ipc$dispatch("f3d9a71b", new Object[]{context});
        }
        return new MUSVideoView(context);
    }

    public static void m(UINode uINode, egl<tpc> eglVar, egl<a.b> eglVar2, egl<e> eglVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200baa6b", new Object[]{uINode, eglVar, eglVar2, eglVar3});
            return;
        }
        d dVar = new d();
        eglVar3.c(new e());
        eglVar.c(new com.taobao.android.weex_uikit.widget.video.b(uINode, dVar));
        eglVar2.c(new com.taobao.android.weex_uikit.widget.video.a(uINode, dVar));
    }

    public static void n(UINode uINode, List<Runnable> list, e eVar, a.b bVar, tpc tpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b9b23d", new Object[]{uINode, list, eVar, bVar, tpcVar});
        } else {
            list.add(new b(uINode, eVar, tpcVar, bVar));
        }
    }

    public static void o(UINode uINode, MUSDKInstance mUSDKInstance, MUSVideoView mUSVideoView, tpc tpcVar, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51db6f3", new Object[]{uINode, mUSDKInstance, mUSVideoView, tpcVar, bVar});
            return;
        }
        uINode.unregisterNativeStateListener("videostatus", bVar);
        uINode.unregisterNativeStateListener("visibility", bVar);
        mUSVideoView.unmount(mUSDKInstance);
        tpcVar.onVideoStop();
    }

    public static void p(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc83e1ab", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.pause();
        }
    }

    public static void q(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfbe92d", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.play();
        }
    }

    public static void r(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274863b1", new Object[]{uINode, new Integer(i)});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.postDelayed(new a(uINode), i);
        }
    }

    public static void s(UINode uINode, MUSVideoView mUSVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c8c0dc", new Object[]{uINode, mUSVideoView, new Boolean(z)});
        } else {
            mUSVideoView.mute(z);
        }
    }

    public static void t(UINode uINode, MUSVideoView mUSVideoView, String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff40d75", new Object[]{uINode, mUSVideoView, str, eVar});
            return;
        }
        eVar.f10035a = true;
        eVar.b = false;
    }

    public static void u(UINode uINode, MUSVideoView mUSVideoView, String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed31e87", new Object[]{uINode, mUSVideoView, str, eVar});
            return;
        }
        eVar.f10035a = true;
        eVar.b = false;
    }

    public static void v(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ce5115", new Object[]{uINode, new Integer(i)});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.seekTo(i);
        }
    }

    public static void w(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb8aa58", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    public static void x(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778dab70", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("bizFrom", str);
        }
    }

    public static void y(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5740ff9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("contentId", str);
        }
    }

    public static void z(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3783ab23", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("controlByList", Boolean.valueOf(z));
        }
    }

    public static void W(UINode uINode, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b773bad", new Object[]{uINode, str, dVar});
        } else if (!g(uINode)) {
        } else {
            if (TextUtils.equals(str, "play")) {
                int d2 = d(uINode);
                if (d2 > 0) {
                    r(uINode, d2);
                } else {
                    q(uINode);
                }
            } else if (TextUtils.equals(str, "stop")) {
                T(uINode);
                if (!dVar.f10034a) {
                    c(uINode, "pause", null);
                    dVar.f10034a = true;
                }
            }
        }
    }

    public static void b(UINode uINode, MUSVideoView mUSVideoView, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c0de9a", new Object[]{uINode, mUSVideoView, eVar});
            return;
        }
        boolean g = g(uINode);
        String nativeState = uINode.getNativeState("videostatus");
        if (!j(uINode)) {
            if (g) {
                if (TextUtils.equals(nativeState, "play")) {
                    int d2 = d(uINode);
                    if (d2 > 0) {
                        mUSVideoView.postDelayed(new C0528c(uINode), d2);
                    } else {
                        mUSVideoView.play();
                    }
                } else {
                    T(uINode);
                }
            } else if (f(uINode) && !eVar.b) {
                eVar.b = true;
                mUSVideoView.play();
            }
        }
    }

    static {
        t2o.a(986710293);
    }

    public static void l(UINode uINode, MUSDKInstance mUSDKInstance, MUSVideoView mUSVideoView, a.b bVar, e eVar, tpc tpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5704d4", new Object[]{uINode, mUSDKInstance, mUSVideoView, bVar, eVar, tpcVar});
            return;
        }
        uINode.registerNativeStateListener("videostatus", bVar);
        uINode.registerNativeStateListener("visibility", bVar);
        mUSVideoView.mount(uINode, mUSDKInstance, UIKitEngine.getVideoCreator(), tpcVar, uINode.getContentWidth(), uINode.getContentHeight(), uINode.getPadding(), h(uINode), i(uINode));
        b(uINode, mUSVideoView, eVar);
    }
}
