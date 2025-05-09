package com.taobao.android.weex_uikit.widget.video;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.video.c;
import tb.t2o;
import tb.tpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements tpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f10031a;
    public final c.d b;
    public boolean c = false;
    public JSONObject d = null;

    static {
        t2o.a(986710278);
        t2o.a(986710280);
    }

    public b(UINode uINode, c.d dVar) {
        this.f10031a = uINode;
        this.b = dVar;
    }

    public static JSONObject a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a09182f", new Object[]{new Integer(i), new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(c.c, (Object) Float.valueOf(i2 / 1000.0f));
        jSONObject2.put(c.b, (Object) Float.valueOf(i / 1000.0f));
        jSONObject.put(c.f10032a, (Object) jSONObject2);
        return jSONObject;
    }

    public static void b(UINode uINode, String str, JSONObject jSONObject) {
        MUSDKInstance instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c3ee9", new Object[]{uINode, str, jSONObject});
        } else if (uINode.hasEvent(str) && (instance = uINode.getInstance()) != null && !instance.isDestroyed() && !TextUtils.isEmpty(str)) {
            instance.fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    @Override // tb.tpc
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        this.c = true;
        this.d = null;
    }

    @Override // tb.tpc
    public void onVideoFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4f4ea1", new Object[]{this});
        } else {
            b(this.f10031a, "error", null);
        }
    }

    @Override // tb.tpc
    public void onVideoProgressChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115f132", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.c) {
            this.d = a(i2, i);
        } else {
            b(this.f10031a, "timeupdate", a(i2, i));
        }
        if (this.f10031a.getInstance() != null && !this.f10031a.getInstance().isDestroyed() && this.f10031a.getMountContent() != null) {
            ((MUSVideoView) this.f10031a.getMountContent()).hidePoster();
        }
    }

    @Override // tb.tpc
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        this.c = false;
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            b(this.f10031a, "timeupdate", jSONObject);
            this.d = null;
        }
    }

    @Override // tb.tpc
    public void onVideoFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d2b296", new Object[]{this});
        } else if (!c.h(this.f10031a)) {
            c.T(this.f10031a);
            this.b.f10034a = true;
            b(this.f10031a, "ended", null);
            this.f10031a.fireNativeEvent("videocallback", "finish");
        }
    }

    @Override // tb.tpc
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) this.f10031a.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.onPlayed();
        }
        if (this.b.f10034a) {
            b(this.f10031a, "play", null);
            this.b.f10034a = false;
        }
        this.f10031a.fireNativeEvent("videocallback", "start");
    }

    @Override // tb.tpc
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
        } else if (!this.b.f10034a) {
            b(this.f10031a, "pause", null);
            this.b.f10034a = true;
        }
    }
}
