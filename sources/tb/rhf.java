package tb;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.HashMap;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rhf implements cpr.b, hbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = rhf.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f27385a;
    public final TBLiveDataModel b;
    public ukr c;
    public final ArrayList<Integer> d = new ArrayList<>();
    public final ArrayList<Integer> e = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(rhf rhfVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/jsbridge/InteractivePM$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1036 || i == 102 || i == 1039 || i == 1055 || i == 18790) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(295699901);
        t2o.a(806356196);
        t2o.a(806356060);
    }

    public rhf(String str, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, ukr ukrVar) {
        this.f27385a = ux9Var;
        this.b = tBLiveDataModel;
        this.c = ukrVar;
        f();
    }

    @Override // tb.hbd
    public boolean a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca817c1", new Object[]{this, tLiveMsg})).booleanValue();
        }
        ArrayList<Integer> arrayList = this.d;
        if (arrayList != null && arrayList.contains(Integer.valueOf(tLiveMsg.type))) {
            JSONObject h = h(tLiveMsg);
            ukr ukrVar = this.c;
            if (ukrVar != null) {
                ukrVar.o("TBLiveWVPlugin.Event.powermessage", h.toString());
            }
        }
        ArrayList<Integer> arrayList2 = this.e;
        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(tLiveMsg.type))) {
            JSONObject h2 = h(tLiveMsg);
            ukr ukrVar2 = this.c;
            if (ukrVar2 != null) {
                ukrVar2.f0("TBLiveWVPlugin.Event.powermessage", h2.toString());
            }
        }
        return false;
    }

    public final void b(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82283c4b", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                ukr ukrVar = this.c;
                if (ukrVar != null && tws.v(ukrVar.getContext())) {
                    jSONObject.put("liveToken", this.c.c0());
                }
            } catch (Exception unused) {
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ffcd4e", new Object[]{this});
        } else {
            f();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0881535", new Object[]{this});
            return;
        }
        ArrayList<Integer> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.f27385a;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.f27385a.t().a(this);
            this.f27385a.t().e(null);
        }
        this.c = null;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad39ae8", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.f27385a;
        if (ux9Var != null && ux9Var.t() != null) {
            this.f27385a.t().l(this, new a(this));
            this.f27385a.t().e(this);
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1675fe", new Object[]{this, str, str2});
            return;
        }
        ukr ukrVar = this.c;
        if (ukrVar != null) {
            ukrVar.o(str, str2);
        }
    }

    public final JSONObject h(TLiveMsg tLiveMsg) {
        String str;
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aaa461b4", new Object[]{this, tLiveMsg});
        }
        cwd A = v2s.o().A();
        String str2 = f;
        A.a(str2, "onInterceptPowerMessage = " + JSON.toJSONString(tLiveMsg));
        switch (tLiveMsg.type) {
            case 10101:
            case 10103:
            case 10104:
            case 10105:
                try {
                    str = JSON.toJSONString(tLiveMsg.data);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    str = "";
                    break;
                }
            case 10102:
            default:
                str = new String(tLiveMsg.data);
                break;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgType", (Object) Integer.valueOf(tLiveMsg.type));
            jSONObject.put("data", (Object) str);
            ukr ukrVar = this.c;
            if (ukrVar != null && tws.v(ukrVar.getContext())) {
                jSONObject.put("liveToken", (Object) this.c.c0());
            }
        } catch (Exception unused) {
        }
        TBLiveDataModel tBLiveDataModel = this.b;
        if (!(tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || TextUtils.isEmpty(tLiveMsg.topic) || !tLiveMsg.topic.equals(this.b.mVideoInfo.topic) || (ux9Var = this.f27385a) == null || ux9Var.w() == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("interactPmError", "1");
            this.f27385a.w().b(hashMap);
        }
        return jSONObject;
    }

    public void i(IWVWebView iWVWebView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac26ee8c", new Object[]{this, iWVWebView, new Integer(i)});
            return;
        }
        Object a2 = roa.a(iWVWebView);
        if (a2 instanceof pu) {
            if (!this.d.contains(Integer.valueOf(i))) {
                this.d.add(Integer.valueOf(i));
            }
        } else if ((a2 instanceof com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a) && !this.e.contains(Integer.valueOf(i))) {
            this.e.add(Integer.valueOf(i));
        }
    }

    public void j(IWVWebView iWVWebView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9068a85", new Object[]{this, iWVWebView, new Integer(i)});
            return;
        }
        Object a2 = roa.a(iWVWebView);
        if (a2 instanceof pu) {
            if (this.d.contains(Integer.valueOf(i))) {
                this.d.remove(i);
            }
        } else if ((a2 instanceof com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a) && this.e.contains(Integer.valueOf(i))) {
            this.e.remove(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // tb.gtc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessageReceived(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rhf.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r4
            r2 = 1
            r5[r2] = r1
            r1 = 2
            r5[r1] = r6
            java.lang.String r6 = "5b152aef"
            r0.ipc$dispatch(r6, r5)
            return
        L_0x001d:
            tb.v2s r0 = tb.v2s.o()
            tb.cwd r0 = r0.A()
            java.lang.String r1 = tb.rhf.f
            java.lang.String r2 = "tblivedataservice onMessageReceived ----"
            r0.a(r1, r2)
            r0 = 1036(0x40c, float:1.452E-42)
            java.lang.String r1 = "TBLiveWVPlugin.Event.message"
            if (r5 != r0) goto L_0x005d
            if (r6 == 0) goto L_0x005d
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00dc
            r0 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: JSONException -> 0x004d
            java.lang.String r6 = (java.lang.String) r6     // Catch: JSONException -> 0x004d
            r2.<init>(r6)     // Catch: JSONException -> 0x004d
            r4.b(r2)     // Catch: JSONException -> 0x004a
            goto L_0x0052
        L_0x004a:
            r6 = move-exception
            r0 = r2
            goto L_0x004e
        L_0x004d:
            r6 = move-exception
        L_0x004e:
            r6.printStackTrace()
            r2 = r0
        L_0x0052:
            if (r2 == 0) goto L_0x0058
            java.lang.String r5 = r2.toString()
        L_0x0058:
            r4.g(r1, r5)
            goto L_0x00dc
        L_0x005d:
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "data"
            java.lang.String r3 = "type"
            if (r5 != r0) goto L_0x008d
            boolean r5 = r6 instanceof com.taobao.taolive.sdk.model.message.JoinNotifyMessage
            if (r5 == 0) goto L_0x00dc
            com.taobao.taolive.sdk.model.message.JoinNotifyMessage r6 = (com.taobao.taolive.sdk.model.message.JoinNotifyMessage) r6
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "joinMsg"
            r5.put(r3, r0)     // Catch: JSONException -> 0x0081
            java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r6)     // Catch: JSONException -> 0x0081
            r5.put(r2, r6)     // Catch: JSONException -> 0x0081
            r4.b(r5)     // Catch: JSONException -> 0x0081
            goto L_0x0085
        L_0x0081:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0085:
            java.lang.String r5 = r5.toString()
            r4.g(r1, r5)
            goto L_0x00dc
        L_0x008d:
            r0 = 1039(0x40f, float:1.456E-42)
            if (r5 != r0) goto L_0x00b6
            boolean r5 = r6 instanceof com.taobao.taolive.sdk.model.message.TBTVProgramMessage
            if (r5 == 0) goto L_0x00dc
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "changeTBTVProgram"
            r5.put(r3, r0)     // Catch: JSONException -> 0x00aa
            java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r6)     // Catch: JSONException -> 0x00aa
            r5.put(r2, r6)     // Catch: JSONException -> 0x00aa
            r4.b(r5)     // Catch: JSONException -> 0x00aa
            goto L_0x00ae
        L_0x00aa:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00ae:
            java.lang.String r5 = r5.toString()
            r4.g(r1, r5)
            goto L_0x00dc
        L_0x00b6:
            r0 = 18790(0x4966, float:2.633E-41)
            if (r5 == r0) goto L_0x00be
            r0 = 1055(0x41f, float:1.478E-42)
            if (r5 != r0) goto L_0x00dc
        L_0x00be:
            if (r6 == 0) goto L_0x00dc
            com.taobao.taolive.sdk.model.message.LiveInteractiveMessage r6 = (com.taobao.taolive.sdk.model.message.LiveInteractiveMessage) r6
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "taskInteractive"
            r5.put(r3, r0)     // Catch: Exception -> 0x00d5
            java.lang.String r6 = r6.data     // Catch: Exception -> 0x00d5
            r5.put(r2, r6)     // Catch: Exception -> 0x00d5
            r4.b(r5)     // Catch: Exception -> 0x00d5
        L_0x00d5:
            java.lang.String r5 = r5.toString()
            r4.g(r1, r5)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rhf.onMessageReceived(int, java.lang.Object):void");
    }
}
