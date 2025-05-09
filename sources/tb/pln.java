package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.biz.IRecbotService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pln extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long MIN_CLICK_INTERVAL = 800;
    public static final long RECBOTTAPEVENT = -1299205725976240467L;

    /* renamed from: a  reason: collision with root package name */
    public long f26157a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements osc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IRecbotService f26158a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(pln plnVar, IRecbotService iRecbotService, String str, String str2) {
            this.f26158a = iRecbotService;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.cfb
        public /* synthetic */ void B(AlertConfirmInfo alertConfirmInfo) {
            nsc.d(this, alertConfirmInfo);
        }

        @Override // tb.cfb
        public void J(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5529a063", new Object[]{this, alertConfirmInfo});
            }
        }

        @Override // tb.jdb
        public /* synthetic */ void O(ErrorResult errorResult) {
            nsc.c(this, errorResult);
        }

        @Override // tb.cfb
        public void n(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
            } else {
                this.f26158a.adjustStart(this.b, true, this.c, false);
            }
        }
    }

    static {
        t2o.a(729809430);
    }

    public static /* synthetic */ Object ipc$super(pln plnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/commonsubservice/recbot/impl/dx/eventhandler/RecbotTapEventHandler");
    }

    public final String a(DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode W;
        DXWidgetNode queryWidgetNodeByUserId;
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c3c554", new Object[]{this, dXRuntimeContext});
        }
        if (!(dXRuntimeContext == null || (W = dXRuntimeContext.W()) == null || (queryWidgetNodeByUserId = W.queryWidgetNodeByUserId("textInputView")) == null)) {
            View nativeView = queryWidgetNodeByUserId.getNativeView();
            if ((nativeView instanceof EditText) && (text = ((EditText) nativeView).getText()) != null) {
                return text.toString();
            }
        }
        return null;
    }

    public final String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7cffb", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return (String) lr8.b("ext.itemId", jSONObject);
    }

    public final void c(Activity activity, JSONObject jSONObject, IRecbotService iRecbotService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c781d53", new Object[]{this, activity, jSONObject, iRecbotService, str});
        } else if (jSONObject != null && activity != null) {
            String string = jSONObject.getString("revertParams");
            if (!TextUtils.isEmpty(string)) {
                bii a2 = bii.a();
                xk0 a3 = xk0.a();
                a3.f31435a = jSONObject.getString("dialogTitle");
                a3.b = jSONObject.getString("dialogDesc");
                a3.d = jSONObject.getString("dialogRevert");
                a3.e = jSONObject.getString("dialogCancel");
                if (!TextUtils.isEmpty(a3.f31435a) && !TextUtils.isEmpty(a3.b) && !TextUtils.isEmpty(a3.d) && !TextUtils.isEmpty(a3.e)) {
                    r5a.i("Page_Home", 2201, "Page_Home_Show_Recbotpage_Restore_show", "");
                    a2.b(activity, a3, new a(this, iRecbotService, string, str));
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null && SystemClock.uptimeMillis() - this.f26157a >= 800) {
            this.f26157a = SystemClock.uptimeMillis();
            String str = (String) j18.a(objArr, 0, String.class);
            IRecbotService iRecbotService = (IRecbotService) j18.c(dXRuntimeContext).a(IRecbotService.class);
            if (iRecbotService != null) {
                if (TextUtils.equals("showRecbotView", str)) {
                    iRecbotService.showRecbotView((String) j18.a(objArr, 1, String.class), dXRuntimeContext.i());
                } else if (TextUtils.equals("recbotClickSend", str)) {
                    String a2 = a(dXRuntimeContext);
                    if (!TextUtils.isEmpty(a2)) {
                        JSONObject jSONObject = (JSONObject) j18.a(objArr, 2, JSONObject.class);
                        iRecbotService.adjustStart(a2, false, b(dXRuntimeContext.i()), true);
                        if (jSONObject != null) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                                jSONObject.put("args", (Object) jSONObject2);
                            }
                            jSONObject2.put("prompt", (Object) a2);
                            r5a.f(jSONObject);
                        }
                    }
                } else if (TextUtils.equals("recbotClickQuestion", str)) {
                    JSONObject jSONObject3 = (JSONObject) j18.a(objArr, 1, JSONObject.class);
                    if (jSONObject3 != null) {
                        iRecbotService.adjustStart(jSONObject3.getString("title"), false, b(dXRuntimeContext.i()), false);
                    }
                } else if (TextUtils.equals("dismissRecbotView", str)) {
                    iRecbotService.hideRecbotView();
                } else if (TextUtils.equals("revert", str)) {
                    iRecbotService.hideRecbotView();
                    c(dXRuntimeContext.r().y(), (JSONObject) j18.a(objArr, 1, JSONObject.class), iRecbotService, b(dXRuntimeContext.i()));
                }
            }
        }
    }
}
