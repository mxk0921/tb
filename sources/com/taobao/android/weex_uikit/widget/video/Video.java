package com.taobao.android.weex_uikit.widget.video;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.video.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.pvh;
import tb.t2o;
import tb.tpc;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Video extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public tpc callback;
    public c.e needRemount;
    public a.b stateCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public a(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.q(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public b(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$2");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.U(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public c(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$3");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.p(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public d(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$4");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.v(this.d, ((Integer) jxh.e(Video.this.getInstance(), null, Integer.TYPE, Video.access$000(Video.this, this.e, 0))).intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public e(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$5");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.T(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public f(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$6");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.D(this.d, (JSONObject) jxh.e(Video.this.getInstance(), null, JSONObject.class, Video.access$100(Video.this, this.e, 0)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public g(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$7");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.video.c.e(this.d, (pvh) jxh.e(Video.this.getInstance(), null, pvh.class, Video.access$200(Video.this, this.e, 0)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h extends ny1<Video> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710291);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/Video$NodeHolder");
        }

        /* renamed from: e */
        public Video d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Video) ipChange.ipc$dispatch("c4e50065", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Video video = new Video(i);
            video.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                video.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                video.updateAttrs(mUSProps2);
            }
            return video;
        }

        @Override // tb.vtf
        public String getMethods() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
            }
            return "[\"play\",\"toggleFullScreen\",\"pause\",\"seekTo\",\"stop\",\"setFov\",\"getFov\"]";
        }
    }

    public Video(int i) {
        super(i);
    }

    public static /* synthetic */ MUSValue access$000(Video video, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("cecee0f0", new Object[]{video, mUSValueArr, new Integer(i)});
        }
        return video.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(Video video, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("a75fd30f", new Object[]{video, mUSValueArr, new Integer(i)});
        }
        return video.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(Video video, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("7ff0c52e", new Object[]{video, mUSValueArr, new Integer(i)});
        }
        return video.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ Object ipc$super(Video video, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 474982114) {
            super.onActivityResume();
            return null;
        } else if (hashCode == 1692842255) {
            super.onActivityPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/video/Video");
        }
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acae82d0", new Object[]{this, str});
        }
        return ATTR_DEF_MAP.get(str);
    }

    public void getFov(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee9f658", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new g(uINode, mUSValueArr));
        }
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hvu
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        tpc tpcVar = this.callback;
        if (tpcVar != null) {
            tpcVar.onActivityPause();
        }
    }

    @Override // tb.hvu
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        tpc tpcVar = this.callback;
        if (tpcVar != null) {
            tpcVar.onActivityResume();
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return com.taobao.android.weex_uikit.widget.video.c.k(context);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.l(this, mUSDKInstance, (MUSVideoView) obj, this.stateCallback, this.needRemount, this.callback);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        egl eglVar = new egl();
        egl eglVar2 = new egl();
        egl eglVar3 = new egl();
        com.taobao.android.weex_uikit.widget.video.c.m(uINode, eglVar, eglVar2, eglVar3);
        if (eglVar.b()) {
            this.callback = (tpc) eglVar.a();
        }
        if (eglVar2.b()) {
            this.stateCallback = (a.b) eglVar2.a();
        }
        if (eglVar3.b()) {
            this.needRemount = (c.e) eglVar3.a();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.o(this, mUSDKInstance, (MUSVideoView) obj, this.callback, this.stateCallback);
        }
    }

    public void pause(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b09df7", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new c(uINode));
        }
    }

    public void play(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcde1b5", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new a(uINode));
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.n(this, list, this.needRemount, this.stateCallback, this.callback);
        }
    }

    public void refreshMute(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66e9b05", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.s(uINode, (MUSVideoView) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshSrc(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df32e30", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.t(uINode, (MUSVideoView) obj, (String) obj2, this.needRemount);
        }
    }

    public void refreshVideoId(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ce1de", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.u(uINode, (MUSVideoView) obj, (String) obj2, this.needRemount);
        }
    }

    public void seekTo(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8645d0d4", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new d(uINode, mUSValueArr));
        }
    }

    public void setAutoPlay(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca058a9", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.w(uINode, z);
    }

    public void setBizFrom(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af078d3", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.x(uINode, str);
    }

    public void setContentId(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c43d41c", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.y(uINode, str);
    }

    public void setControlByList(UINode uINode, MUSValue mUSValue) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246ce6fe", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.z(uINode, z);
    }

    public void setControls(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88446d6", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.A(uINode, z);
    }

    public void setDelayTime(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef15420", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.B(uINode, str);
    }

    public void setEnablePan(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97ee36", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.C(uINode, z);
    }

    public void setFov(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ff54cc", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new f(uINode, mUSValueArr));
        }
    }

    public void setLoop(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3ceda8", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.E(uINode, z);
    }

    public void setMute(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64ae7d3", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.F(uINode, z);
    }

    public void setObjectFit(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fda8fe", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.G(uINode, str);
    }

    public void setPanoType(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e2e480", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.H(uINode, str);
    }

    public void setPlayScenes(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136903f1", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.I(uINode, str);
    }

    public void setPoster(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad5679f", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.J(uINode, str);
    }

    public void setShowCenterPlayBtn(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1dc35a", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.K(uINode, z);
    }

    public void setShowFullscreenBtn(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd066ec", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.L(uINode, z);
    }

    public void setShowMuteBtn(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7fe78a", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.M(uINode, z);
    }

    public void setShowPlayBtn(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ac6225", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.N(uINode, z);
    }

    public void setShowPlayRateBtn(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643d81a5", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.video.c.O(uINode, z);
    }

    public void setSrc(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4157e12c", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.P(uINode, str);
    }

    public void setUtParams(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247e2b67", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.video.c.Q(uINode, (JSONObject) jxh.e(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setVideoId(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b142b5a", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.R(uINode, str);
    }

    public void setVideoSource(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c354da", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.video.c.S(uINode, str);
    }

    public void stop(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7066903", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new e(uINode));
        }
    }

    public void toggleFullScreen(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b393e910", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new b(uINode));
        }
    }

    static {
        t2o.a(986710283);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("controlByList", Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        hashMap.put("autoplay", bool);
        hashMap.put("muted", bool);
        hashMap.put("loop", bool);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r9.equals("videoId") == false) goto L_0x0029;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode r7, java.lang.Object r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.video.Video.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "fd3c7823"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001e:
            r9.hashCode()
            r3 = -1
            int r4 = r9.hashCode()
            switch(r4) {
                case 114148: goto L_0x0041;
                case 104264043: goto L_0x0035;
                case 452782838: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x004c
        L_0x002b:
            java.lang.String r1 = "videoId"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x004c
            goto L_0x0029
        L_0x0035:
            java.lang.String r0 = "muted"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r0 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r0 = "src"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004b
            goto L_0x0029
        L_0x004b:
            r0 = 0
        L_0x004c:
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0054;
                case 2: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x005b
        L_0x0050:
            r6.refreshVideoId(r7, r8, r10)
            goto L_0x005b
        L_0x0054:
            r6.refreshMute(r7, r8, r10)
            goto L_0x005b
        L_0x0058:
            r6.refreshSrc(r7, r8, r10)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.video.Video.onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode, java.lang.Object, java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r9.equals("play") == false) goto L_0x0026;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDispatchMethod(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue[] r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 4
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.weex_uikit.widget.video.Video.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "3d011af1"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r7
            r4[r2] = r8
            r4[r1] = r9
            r4[r0] = r10
            r5.ipc$dispatch(r6, r4)
            return
        L_0x001b:
            r9.hashCode()
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1249362537: goto L_0x006e;
                case -906224877: goto L_0x0062;
                case -905812725: goto L_0x0056;
                case 3443508: goto L_0x004c;
                case 3540994: goto L_0x0040;
                case 106440182: goto L_0x0034;
                case 1193403983: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0078
        L_0x0028:
            java.lang.String r0 = "toggleFullScreen"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r0 = 6
            goto L_0x0078
        L_0x0034:
            java.lang.String r0 = "pause"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003e
            goto L_0x0026
        L_0x003e:
            r0 = 5
            goto L_0x0078
        L_0x0040:
            java.lang.String r0 = "stop"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004a
            goto L_0x0026
        L_0x004a:
            r0 = 4
            goto L_0x0078
        L_0x004c:
            java.lang.String r1 = "play"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0078
            goto L_0x0026
        L_0x0056:
            java.lang.String r0 = "setFov"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0060
            goto L_0x0026
        L_0x0060:
            r0 = 2
            goto L_0x0078
        L_0x0062:
            java.lang.String r0 = "seekTo"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x006c
            goto L_0x0026
        L_0x006c:
            r0 = 1
            goto L_0x0078
        L_0x006e:
            java.lang.String r0 = "getFov"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0077
            goto L_0x0026
        L_0x0077:
            r0 = 0
        L_0x0078:
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0090;
                case 2: goto L_0x008c;
                case 3: goto L_0x0088;
                case 4: goto L_0x0084;
                case 5: goto L_0x0080;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x0097
        L_0x007c:
            r7.toggleFullScreen(r8, r10)
            goto L_0x0097
        L_0x0080:
            r7.pause(r8, r10)
            goto L_0x0097
        L_0x0084:
            r7.stop(r8, r10)
            goto L_0x0097
        L_0x0088:
            r7.play(r8, r10)
            goto L_0x0097
        L_0x008c:
            r7.setFov(r8, r10)
            goto L_0x0097
        L_0x0090:
            r7.seekTo(r8, r10)
            goto L_0x0097
        L_0x0094:
            r7.getFov(r8, r10)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.video.Video.onDispatchMethod(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:
        if (r9.equals(com.taobao.android.weex_uikit.widget.video.c.ATTR_ENABLE_PAN) == false) goto L_0x002d;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.video.Video.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }
}
