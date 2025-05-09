package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.HashMap;
import java.util.Map;
import tb.fmi;
import tb.kpw;
import tb.lcn;
import tb.mmi;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVBroadcastChannel extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_INSTANCE_ID = "instanceId";
    private static final String CHANNEL_KEY = "name";
    private static final String CHANNEL_MESSAGE = "message";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_RESULT = "result";
    private static final String TAG = "WVBroadcast";
    private Map<String, mmi> messageTokenChannels = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1790a;
        public final /* synthetic */ String b;

        public a(WVBroadcastChannel wVBroadcastChannel, WVCallBackContext wVCallBackContext, String str) {
            this.f1790a = wVCallBackContext;
            this.b = str;
        }

        @Override // tb.fmi
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else if (this.f1790a != null) {
                String str = "Broadcast.Message." + this.b;
                String jSONString = JSON.toJSONString(obj);
                lcn.a(RVLLevel.Error, WVBroadcastChannel.TAG).j(str).a("params", jSONString).f();
                this.f1790a.fireEvent(str, jSONString);
            }
        }
    }

    static {
        t2o.a(989856257);
    }

    public static /* synthetic */ Object ipc$super(WVBroadcastChannel wVBroadcastChannel, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVBroadcastChannel");
    }

    private void onMessage(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5683de", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (this.messageTokenChannels != null) {
            String string = jSONObject.getString("instanceId");
            if (!TextUtils.isEmpty(string)) {
                mmi mmiVar = this.messageTokenChannels.get(string);
                if (mmiVar != null) {
                    mmiVar.e(new a(this, wVCallBackContext, string));
                } else if (wVCallBackContext != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) "-1");
                    jSONObject2.put("message", (Object) "channel token not exist");
                    wVCallBackContext.error(jSONObject2.toJSONString());
                }
            } else if (wVCallBackContext != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("result", (Object) "-1");
                jSONObject3.put("message", (Object) "channel token empty error");
                wVCallBackContext.error(jSONObject3.toJSONString());
            }
        }
    }

    public void closeChannel(JSONObject jSONObject) {
        mmi remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39dba3e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.messageTokenChannels != null && (remove = this.messageTokenChannels.remove(jSONObject.getString("instanceId"))) != null) {
            remove.a();
        }
    }

    public void createChannel(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f973b17f", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (wVCallBackContext == null || wVCallBackContext.getWebview().getContext() == null || jSONObject == null || TextUtils.isEmpty(jSONObject.getString("name")) || TextUtils.isEmpty(jSONObject.getString("instanceId"))) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", (Object) "-1");
            jSONObject2.put("message", (Object) "channel args error");
            wVCallBackContext.error(new nsw(jSONObject2.toJSONString()));
        } else {
            synchronized (this) {
                try {
                    if (this.messageTokenChannels == null) {
                        this.messageTokenChannels = new HashMap();
                    }
                    String string = jSONObject.getString("name");
                    String string2 = jSONObject.getString("instanceId");
                    if (this.messageTokenChannels.get(string2) != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("result", (Object) "-1");
                        jSONObject3.put("message", (Object) "channel error token has been used");
                        wVCallBackContext.error(jSONObject3.toJSONString());
                        return;
                    }
                    this.messageTokenChannels.put(string2, new mmi(wVCallBackContext.getWebview().getContext(), string, null));
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("result", (Object) "0");
                    jSONObject4.put("message", (Object) "channel create success");
                    wVCallBackContext.success(jSONObject4.toJSONString());
                    onMessage(jSONObject, wVCallBackContext);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Map<String, mmi> map = this.messageTokenChannels;
        if (map != null) {
            for (Map.Entry<String, mmi> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().a();
                }
            }
            this.messageTokenChannels.clear();
        }
        super.onDestroy();
    }

    public void postMessage(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab1429f", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (this.messageTokenChannels != null) {
            if (!TextUtils.isEmpty(jSONObject.getString("instanceId")) && jSONObject.containsKey("message")) {
                String string = jSONObject.getString("instanceId");
                Object obj = jSONObject.get("message");
                mmi mmiVar = this.messageTokenChannels.get(string);
                if (mmiVar == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) "-1");
                    jSONObject2.put("message", (Object) "channel token not exist");
                    wVCallBackContext.error(jSONObject2.toJSONString());
                    return;
                }
                mmiVar.d(obj);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("result", (Object) "0");
                jSONObject3.put("message", (Object) "post message success");
                wVCallBackContext.success(jSONObject3.toJSONString());
            } else if (wVCallBackContext != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", (Object) "-1");
                jSONObject4.put("message", (Object) "post message args error");
                wVCallBackContext.error(jSONObject4.toJSONString());
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            if ("createChannel".equals(str)) {
                createChannel(parseObject, wVCallBackContext);
            } else if ("closeChannel".equals(str)) {
                closeChannel(parseObject);
            } else if (!"postMessage".equals(str)) {
                return false;
            } else {
                postMessage(parseObject, wVCallBackContext);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }
}
