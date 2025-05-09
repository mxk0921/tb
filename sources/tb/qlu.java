package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.window.FloatWindowListener;
import com.taobao.message.window.FloatWindowManager;
import com.taobao.message.window.FloatWindowVO;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.rtcroom.c;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qlu implements FloatWindowListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26819a;
    public boolean b = false;
    public final c c;
    public TrtcCallImpl.CallStatus d;
    public b e;
    public final FloatWindowManager f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f26820a;
        public String b;
        public String c;
        public boolean d;
        public int e;
        public Map<String, String> f;

        static {
            t2o.a(395313617);
        }

        public b() {
        }
    }

    static {
        t2o.a(395313615);
        t2o.a(530579514);
    }

    public qlu(Context context, c cVar, JSONObject jSONObject) {
        this.c = cVar;
        g(jSONObject, false);
        FloatWindowManager instance = FloatWindowManager.getInstance();
        this.f = instance;
        instance.addListener(this);
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        TrtcLog.j("FloatWindowAdapter", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        FloatWindowManager floatWindowManager = this.f;
        if (floatWindowManager != null) {
            this.b = false;
            floatWindowManager.removeListener(this);
            this.f.destroy();
        }
    }

    public final String b(TrtcCallImpl.CallStatus callStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff5b82e7", new Object[]{this, callStatus});
        }
        try {
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_CALLING) {
                return this.e.f.get("waitAnswerText");
            }
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                return this.e.f.get("answeredText");
            }
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_IDLE) {
                return this.e.f.get("hangUpText");
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[]{this})).booleanValue();
        }
        return this.f26819a;
    }

    public synchronized void d(TrtcCallImpl.CallStatus callStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e280ec07", new Object[]{this, callStatus});
            return;
        }
        TrtcLog.j("FloatWindowAdapter", "Update call status: " + callStatus);
        this.d = callStatus;
        if (this.f != null && this.f26819a) {
            String b2 = b(callStatus);
            this.f.setText(b2);
            TrtcLog.j("FloatWindowAdapter", "Update text: " + b2);
            if (callStatus == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                TrtcLog.h("FloatWindowAdapter", "Update | callDuration: 1");
                this.f.setTimeSecond(1);
            }
        }
    }

    public synchronized void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242f09f7", new Object[]{this, jSONObject});
            return;
        }
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null)) {
            String string = jSONObject2.getString("icon");
            if (!TextUtils.isEmpty(string)) {
                TrtcLog.j("FloatWindowAdapter", "[serverCmd] Update iconUrl: " + string);
                this.e.f26820a = string;
                FloatWindowManager floatWindowManager = this.f;
                if (floatWindowManager != null && this.f26819a) {
                    floatWindowManager.setIcon(string);
                }
            }
        }
    }

    public synchronized void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772e149f", new Object[]{this, jSONObject});
        } else {
            g(jSONObject, true);
        }
    }

    public synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.f26819a) {
            int B = this.c.B();
            String b2 = b(this.d);
            if (!this.b) {
                TrtcLog.j("FloatWindowAdapter", "create float window");
                this.b = true;
                FloatWindowVO floatWindowVO = new FloatWindowVO();
                floatWindowVO.setIconUrl(this.e.f26820a);
                floatWindowVO.setIconBackgroundUrl(this.e.b);
                floatWindowVO.setNavUrl(this.e.c);
                floatWindowVO.setBigMode(this.e.d);
                floatWindowVO.setGravity(this.e.e);
                this.f.create(floatWindowVO);
            }
            FloatWindowManager floatWindowManager = this.f;
            if (floatWindowManager != null) {
                floatWindowManager.setText(b2);
                this.f.setIcon(this.e.f26820a);
                this.f.setIconBackground(this.e.b);
                if (this.d == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                    this.f.setTimeSecond(B / 1000);
                }
                this.f.setVisible(true);
            }
            this.f26819a = true;
            TrtcLog.j("FloatWindowAdapter", "Start | duration: " + B + ", text: " + b2 + ", icon: " + this.e.f26820a + ", iconBg: " + this.e.b + ", status: " + this.d + ", nav: " + this.e.c + ", bigMode: " + this.e.d + ", gravity: " + this.e.e);
        }
    }

    @Override // com.taobao.message.window.FloatWindowListener
    public void onClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        TrtcLog.j("FloatWindowAdapter", "onClick");
        c cVar = this.c;
        if (cVar != null) {
            cVar.R("click");
        }
    }

    public final void g(JSONObject jSONObject, boolean z) {
        FloatWindowManager floatWindowManager;
        FloatWindowManager floatWindowManager2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738c182c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        if (jSONObject == null) {
            TrtcLog.i("FloatWindowAdapter", "config is null");
        } else {
            TrtcLog.j("FloatWindowAdapter", "parserConfig: " + jSONObject.toJSONString());
        }
        if (this.e == null) {
            b bVar = new b();
            this.e = bVar;
            bVar.f26820a = "";
            bVar.c = "";
            bVar.b = "";
            bVar.f = new HashMap();
            ((HashMap) this.e.f).put("waitAnswerText", "呼叫中");
            ((HashMap) this.e.f).put("answeredText", "通话中");
            ((HashMap) this.e.f).put("hangUpText", "已结束");
        }
        if (jSONObject != null) {
            try {
                String e = vrf.e(jSONObject, "iconUrl", this.e.f26820a);
                if (!TextUtils.isEmpty(e) && !e.equalsIgnoreCase(this.e.f26820a)) {
                    this.e.f26820a = e;
                    if (this.f26819a && (floatWindowManager2 = this.f) != null) {
                        floatWindowManager2.setIcon(e);
                        TrtcLog.j("FloatWindowAdapter", "Update iconUrl: ".concat(e));
                    }
                }
                String e2 = vrf.e(jSONObject, "iconBgUrl", this.e.b);
                if (!TextUtils.isEmpty(e2) && !e2.equalsIgnoreCase(this.e.b)) {
                    this.e.b = e2;
                    if (this.f26819a && (floatWindowManager = this.f) != null) {
                        floatWindowManager.setIconBackground(e2);
                        TrtcLog.j("FloatWindowAdapter", "Update iconBgUrl: ".concat(e2));
                    }
                }
                String e3 = vrf.e(jSONObject, "navUrl", this.e.c);
                if (!TextUtils.isEmpty(e3) && !e3.equalsIgnoreCase(this.e.c)) {
                    this.e.c = e3;
                }
                if (!z) {
                    this.e.d = vrf.a(jSONObject, "bigMode", false);
                    this.e.e = vrf.c(jSONObject, "gravity", 85);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("textList");
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("waitAnswerText");
                    if (!TextUtils.isEmpty(string)) {
                        ((HashMap) this.e.f).put("waitAnswerText", string);
                    }
                    String string2 = jSONObject2.getString("answeredText");
                    if (!TextUtils.isEmpty(string2)) {
                        ((HashMap) this.e.f).put("answeredText", string2);
                    }
                    String string3 = jSONObject2.getString("hangUpText");
                    if (!TextUtils.isEmpty(string3)) {
                        ((HashMap) this.e.f).put("hangUpText", string3);
                    }
                    if (this.f26819a && this.f != null) {
                        String b2 = b(this.d);
                        this.f.setText(b2);
                        TrtcLog.j("FloatWindowAdapter", "Update text: " + b2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.f26819a) {
            TrtcLog.h("FloatWindowAdapter", "stop");
            this.f26819a = false;
            FloatWindowManager floatWindowManager = this.f;
            if (floatWindowManager != null) {
                floatWindowManager.setVisible(false);
            }
        }
    }

    @Override // com.taobao.message.window.FloatWindowListener
    public void onLifecycleChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47430d13", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.j("FloatWindowAdapter", "status change : " + i);
        if (i == 0) {
            this.f26819a = true;
            this.c.R("on");
        } else if (i == 1) {
            this.f26819a = false;
            this.c.R("off");
        }
    }
}
