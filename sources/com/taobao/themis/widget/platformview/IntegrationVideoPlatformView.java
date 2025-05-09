package com.taobao.themis.widget.platformview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.weex.common.Constants;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.exp;
import tb.h2c;
import tb.jqf;
import tb.mks;
import tb.pg1;
import tb.pl4;
import tb.q9s;
import tb.t2o;
import tb.xhv;
import tb.ysi;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0014J#\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J{\u0010)\u001a\u00020\u000e2&\u0010$\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u0001`#2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u0001`#2\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010&j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`'H\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0007¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u000eH\u0007¢\u0006\u0004\b1\u0010/J\u0019\u00103\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b5\u00104J\u0019\u00106\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b6\u00104J!\u00107\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b7\u0010\u0014J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010/J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010/J\u000f\u0010:\u001a\u00020\u000eH\u0014¢\u0006\u0004\b:\u0010/R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/taobao/themis/widget/platformview/IntegrationVideoPlatformView;", "Lio/unicorn/plugin/platform/WeexPlatformView;", "Ltb/jqf;", "Landroid/content/Context;", "context", "", "id", "<init>", "(Landroid/content/Context;I)V", "Ltb/h2c;", "createEmbedImpl", "()Ltb/h2c;", "Lcom/alibaba/fastjson/JSONObject;", "param", "Ltb/xhv;", "parseReceiveRenderParam", "(Lcom/alibaba/fastjson/JSONObject;)V", "", "action", "onReceivedMessage", "(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "string", "parseJSONString", "(Ljava/lang/String;)Lcom/alibaba/fastjson/JSONObject;", "eventName", "data", "doSendEvent", "fireEventByInstance", "Ltb/exp;", "holder", "Ltb/ysi;", BaseExecutor.EXECUTOR_SUFFIX, Constants.Event.SLOT_LIFECYCLE.ATTACH, "(Ltb/exp;Ltb/ysi;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "styles", "attrs", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "events", "bindData", "(Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashSet;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "play", "()V", "pause", "stop", "params", "seek", "(Ljava/lang/String;)V", "mute", "playbackRate", "sendEvent", "onActivityPause", "onActivityResume", "onDispose", pl4.KEY_NODE_ID, TLogTracker.LEVEL_INFO, "mEmbedViewImpl", "Ltb/h2c;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class IntegrationVideoPlatformView extends WeexPlatformView implements jqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private h2c mEmbedViewImpl;
    private int nodeId;

    static {
        t2o.a(852492381);
        t2o.a(852492383);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrationVideoPlatformView(Context context, int i) {
        super(context, i);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ void access$fireEvent(IntegrationVideoPlatformView integrationVideoPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd93055f", new Object[]{integrationVideoPlatformView, str, obj});
        } else {
            integrationVideoPlatformView.fireEvent(str, obj);
        }
    }

    private final void doSendEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a65ef8", new Object[]{this, str, jSONObject});
        } else if (ckf.b("cameraFrame", str)) {
            fireEventByInstance(str, jSONObject);
        } else {
            CommonExtKt.o(new IntegrationVideoPlatformView$doSendEvent$1(this, str, jSONObject));
        }
    }

    private final void fireEventByInstance(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5239d4f", new Object[]{this, str, jSONObject});
            return;
        }
        MUSDKInstance mUSInstance = getMUSInstance();
        if (mUSInstance != null) {
            mUSInstance.fireEventOnNode(this.nodeId, str, jSONObject, true);
        }
    }

    public static /* synthetic */ Object ipc$super(IntegrationVideoPlatformView integrationVideoPlatformView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -658258689:
                super.bindData((HashMap) objArr[0], (HashMap) objArr[1], (HashSet) objArr[2]);
                return null;
            case -432271247:
                super.attach((exp) objArr[0], (ysi) objArr[1]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1056639943:
                super.onDispose();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/platformview/IntegrationVideoPlatformView");
        }
    }

    private final void onReceivedMessage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a306b98", new Object[]{this, str, jSONObject});
            return;
        }
        h2c h2cVar = this.mEmbedViewImpl;
        if (h2cVar != null) {
            h2cVar.onReceivedMessage(str, jSONObject);
        }
    }

    private final JSONObject parseJSONString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6285abd", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = JSON.parseObject(str);
            Result.m1108constructorimpl(xhv.INSTANCE);
            return jSONObject;
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
            return jSONObject;
        }
    }

    private final void parseReceiveRenderParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d94c5e2", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            if (!jSONObject.containsKey("showThinProgressBar")) {
                jSONObject.put((JSONObject) "show-thin-progress-bar", "false");
            }
            if (jSONObject.containsKey("objectFit")) {
                jSONObject.put((JSONObject) pg1.ATOM_EXT_UDL_object_fit, (String) jSONObject.get("objectFit"));
            }
            if (jSONObject.containsKey("initialTime")) {
                jSONObject.put((JSONObject) "initial-time", (String) jSONObject.get("initialTime"));
            }
            if (jSONObject.containsKey("enableProgressGesture")) {
                jSONObject.put((JSONObject) "enable-progress-gesture", (String) jSONObject.get("enableProgressGesture"));
            }
            if (jSONObject.containsKey("showCenterPlayBtn")) {
                jSONObject.put((JSONObject) "show-center-play-btn", (String) jSONObject.get("showCenterPlayBtn"));
            }
            if (jSONObject.containsKey("pageGesture")) {
                jSONObject.put((JSONObject) "page-gesture", (String) jSONObject.get("pageGesture"));
            }
            if (jSONObject.containsKey("mobilenetHintType")) {
                jSONObject.put((JSONObject) "mobilenet-hint-type", (String) jSONObject.get("mobilenetHintType"));
            }
            if (jSONObject.containsKey("showFullscreenBtn")) {
                jSONObject.put((JSONObject) "show-fullscreen-btn", (String) jSONObject.get("showFullscreenBtn"));
            }
            if (jSONObject.containsKey("showPlayBtn")) {
                jSONObject.put((JSONObject) "show-play-btn", (String) jSONObject.get("showPlayBtn"));
            }
            if (jSONObject.containsKey("fixProgressUnit")) {
                jSONObject.put((JSONObject) "fix-progress-unit", (String) jSONObject.get("fixProgressUnit"));
            }
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void attach(exp expVar, ysi ysiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63c1071", new Object[]{this, expVar, ysiVar});
            return;
        }
        ckf.g(expVar, "holder");
        ckf.g(ysiVar, BaseExecutor.EXECUTOR_SUFFIX);
        super.attach(expVar, ysiVar);
        h2c createEmbedImpl = createEmbedImpl();
        this.mEmbedViewImpl = createEmbedImpl;
        if (createEmbedImpl != null) {
            createEmbedImpl.setJSEventDelegate(this);
        }
        h2c h2cVar = this.mEmbedViewImpl;
        if (h2cVar != null) {
            MUSDKInstance mUSInstance = getMUSInstance();
            ckf.f(mUSInstance, "musInstance");
            h2cVar.onAttach(mUSInstance);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void bindData(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c3c4ff", new Object[]{this, hashMap, hashMap2, hashSet});
            return;
        }
        super.bindData(hashMap, hashMap2, hashSet);
        if (hashMap2 != null) {
            try {
                String str = hashMap2.get("uni_node_id");
                if (str != null) {
                    this.nodeId = Integer.parseInt(str);
                }
            } catch (Throwable th) {
                TMSLogger.d(TMSBasePlatformView.TAG, th);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(hashMap2);
            Object tag = getMUSInstance().getTag("widgetInitMuted");
            Boolean bool = Boolean.TRUE;
            if (ckf.b(tag, bool)) {
                jSONObject.put((JSONObject) "muted", "true");
            }
            parseReceiveRenderParam(jSONObject);
            if (ckf.b(getMUSInstance().getTag("widgetInitMuted"), bool)) {
                jSONObject.put((JSONObject) "muted", (String) bool);
            }
            h2c h2cVar = this.mEmbedViewImpl;
            if (h2cVar != null) {
                h2cVar.onBindData(jSONObject);
            }
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        h2c h2cVar = this.mEmbedViewImpl;
        if (h2cVar == null) {
            return null;
        }
        return h2cVar.getView();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            super.onActivityPause();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            super.onActivityResume();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        super.onDispose();
        h2c h2cVar = this.mEmbedViewImpl;
        if (h2cVar != null) {
            h2cVar.destroy();
        }
    }

    @JSMethod
    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            onReceivedMessage("pause", new JSONObject());
        }
    }

    @JSMethod
    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            onReceivedMessage("play", new JSONObject());
        }
    }

    @JSMethod
    public final void playbackRate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5a55ec", new Object[]{this, str});
        } else {
            onReceivedMessage("playbackRate", parseJSONString(str));
        }
    }

    @JSMethod
    public final void seek(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e25f09", new Object[]{this, str});
        } else {
            onReceivedMessage("seek", parseJSONString(str));
        }
    }

    @JSMethod
    public final void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            onReceivedMessage("stop", new JSONObject());
        }
    }

    @JSMethod
    public final void mute(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bd03ea", new Object[]{this, str});
            return;
        }
        JSONObject parseJSONString = parseJSONString(str);
        if (ckf.b(getMUSInstance().getTag("widgetInitMuted"), Boolean.TRUE) && q9s.v0()) {
            if (parseJSONString != null) {
                z = ckf.b(parseJSONString.getBoolean("ison"), Boolean.FALSE);
            }
            if (z) {
                return;
            }
        }
        onReceivedMessage("mute", parseJSONString);
    }

    @Override // tb.jqf
    public void sendEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "eventName");
        if (TextUtils.equals("onChangeState", str)) {
            Integer valueOf = jSONObject == null ? null : Integer.valueOf(jSONObject.getIntValue("state"));
            if (valueOf != null && valueOf.intValue() == 0) {
                doSendEvent("stop", null);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                doSendEvent("play", null);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                doSendEvent("pause", null);
            } else if (valueOf != null && valueOf.intValue() == 3) {
                doSendEvent("loading", null);
            } else if (valueOf != null && valueOf.intValue() == 4) {
                doSendEvent("ended", null);
            } else if (valueOf != null && valueOf.intValue() == 5) {
                doSendEvent("renderstart", null);
            }
        } else if (TextUtils.equals("onTimeUpdate", str)) {
            doSendEvent("timeupdate", jSONObject);
        } else {
            doSendEvent(str, jSONObject);
        }
    }

    private final h2c createEmbedImpl() {
        try {
            if (ckf.b(getMUSInstance().getTag("tmsWidget"), Boolean.TRUE)) {
                Context context = getContext();
                ckf.f(context, "context");
                return new TMSBasePlatformView(context, getViewId(), new mks(getContext(), this), "video");
            }
            Constructor<?> constructor = Class.forName("com.alibaba.triver.cannal_engine.platformview.view.TRWidgetEmbedPlatformViewV3").getConstructor(Context.class, Integer.TYPE, String.class);
            ckf.f(constructor, "forName(\"com.alibaba.tri…java, String::class.java)");
            Object newInstance = constructor.newInstance(getContext(), Integer.valueOf(getViewId()), "video");
            if (newInstance != null) {
                return (h2c) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.widget.platformview.IEmbedPlatformView");
        } catch (Throwable th) {
            TMSLogger.c("IntegrationVideoPlatformView", "", th);
            return null;
        }
    }
}
