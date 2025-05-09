package com.taobao.desktop.widget.action;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.action.FloatWindowStateManager;
import com.taobao.desktop.widget.monitor.MonitorType;
import tb.agu;
import tb.bcx;
import tb.dbx;
import tb.fp9;
import tb.gp9;
import tb.hgh;
import tb.m32;
import tb.obx;
import tb.pde;
import tb.t2o;
import tb.y2e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FloatWindowLinkAction extends dbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final fp9 f = new fp9();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements y2e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.y2e
        public void a(agu aguVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f02acacd", new Object[]{this, aguVar, str});
                return;
            }
            hgh.d("[WidgetFloatWin] floatWindowOpen fail bizCode: " + aguVar.c + ",msg: " + str);
        }

        @Override // tb.y2e
        public void b(agu aguVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8987b37f", new Object[]{this, aguVar});
            }
        }

        @Override // tb.y2e
        public void c(agu aguVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("336210ca", new Object[]{this, aguVar});
                return;
            }
            hgh.d("[WidgetFloatWin] floatWindowOpen success bizCode: " + aguVar.c);
            FloatWindowLinkAction.c(FloatWindowLinkAction.this);
        }
    }

    static {
        t2o.a(437256205);
    }

    public static /* synthetic */ void c(FloatWindowLinkAction floatWindowLinkAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1a319e", new Object[]{floatWindowLinkAction});
        } else {
            floatWindowLinkAction.i();
        }
    }

    public static /* synthetic */ Object ipc$super(FloatWindowLinkAction floatWindowLinkAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/action/FloatWindowLinkAction");
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beddee47", new Object[]{this, str});
        }
        try {
            String g = g();
            JSONObject parseObject = JSON.parseObject(str);
            JSONObject jSONObject = parseObject.getJSONObject("dataContent");
            if (jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("floatWindowLink", (Object) g);
                jSONObject.put("native", (Object) jSONObject2);
            }
            return parseObject.toString();
        } catch (Exception e) {
            hgh.d("[WidgetFloatWin] disposeFloatWinDslData error: " + e);
            return "";
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4800fd7d", new Object[]{this, str});
            return;
        }
        hgh.d("[WidgetFloatWin] floatWindowClose bizCode: " + str);
        this.f.a(str);
        i();
    }

    public final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fedf1", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(agu.PARAM_KEY_NEED_LOCAL_REQUEST_CACHE, (Object) Boolean.TRUE);
        this.f.c(str, str2, jSONObject, null, new a());
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c342431", new Object[]{this});
        }
        try {
            if (this.f != null) {
                return JSON.parseObject(JSON.toJSONString(gp9.b())).toString();
            }
            return "";
        } catch (Exception e) {
            hgh.d("[WidgetFloatWin] stateReset error: " + e);
            return "";
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c90fcf", new Object[]{this});
        } else {
            FloatWindowStateManager.a(this.f17719a, new FloatWindowStateManager.FloatWindowStateReceiver() { // from class: com.taobao.desktop.widget.action.FloatWindowLinkAction.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1006950490) {
                        super.onReceive((Context) objArr[0], (Intent) objArr[1]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/action/FloatWindowLinkAction$2");
                }

                @Override // com.taobao.desktop.widget.action.FloatWindowStateManager.FloatWindowStateReceiver, android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    super.onReceive(context, intent);
                    hgh.d("[WidgetFloatWin] intent: " + intent);
                    if ("com.taobao.desktop.float_window_close".equals(intent.getAction())) {
                        FloatWindowLinkAction.c(FloatWindowLinkAction.this);
                    }
                }
            });
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ceb50c5", new Object[]{this});
            return;
        }
        String z = obx.f(this.f17719a).z(this.c);
        if (!TextUtils.isEmpty(z)) {
            String d = d(z);
            pde pdeVar = this.b;
            if (pdeVar != null) {
                ((m32) pdeVar).c(this.e, this.d, d);
            }
        }
    }

    @Override // tb.dbx
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999d5fc5", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (this.f != null) {
                String string = jSONObject.getString("bizCode");
                String string2 = jSONObject.getString("triggerEventId");
                int b = this.f.b(string);
                hgh.d("[WidgetFloatWin] checkState: " + b);
                if (b == 0) {
                    f(string2, string);
                } else if (b == 1) {
                    e(string);
                }
                h();
                bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(this.c).w("widget_click_float_window"));
            }
        } catch (Throwable th) {
            hgh.d("[WidgetFloatWin] actionFloatWindowLink error: " + th.getMessage());
        }
    }
}
