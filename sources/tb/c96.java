package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c96 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RSATISFYEXPOSE = -1656274909162066473L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16922a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(String str, String str2, String str3, String str4) {
            this.f16922a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uve.a("Page_Home", 2201, this.f16922a, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(486539368);
    }

    public static /* synthetic */ Object ipc$super(c96 c96Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXRSatisfyExposeEventHandler");
    }

    public final void b(DXRuntimeContext dXRuntimeContext, String str) {
        BaseSectionModel<?> e;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1eedbd", new Object[]{this, dXRuntimeContext, str});
        } else if (dXRuntimeContext != null && (e = j18.e(dXRuntimeContext)) != null && (ext = e.getExt()) != null) {
            ext.put(str, (Object) "true");
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length >= 2) {
            JSONObject jSONObject2 = (JSONObject) objArr[0];
            String str4 = (String) objArr[1];
            if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(i2b.TRACK_EXPOSURE_PARAM)) == null)) {
                String string = jSONObject.getString("arg1");
                String string2 = jSONObject.getString("arg2");
                String string3 = jSONObject.getString("arg3");
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (string != null && !a(dXRuntimeContext, string)) {
                    b(dXRuntimeContext, string);
                    if (string2 == null) {
                        str = "";
                    } else {
                        str = string2;
                    }
                    if (string3 == null) {
                        str2 = "";
                    } else {
                        str2 = string3;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str5 : jSONObject3.keySet()) {
                        Object obj = jSONObject3.get(str5);
                        if (obj == null) {
                            str3 = "";
                        } else {
                            str3 = obj.toString();
                        }
                        sb.append(str5);
                        sb.append("=");
                        sb.append(str3);
                        sb.append(", ");
                    }
                    if (sb.length() > 0) {
                        sb.setLength(sb.length() - 2);
                    }
                    get.a().i(new a(string, str, str2, sb.toString()));
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public final boolean a(DXRuntimeContext dXRuntimeContext, String str) {
        BaseSectionModel<?> e;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e62de13", new Object[]{this, dXRuntimeContext, str})).booleanValue();
        }
        if (dXRuntimeContext == null || (e = j18.e(dXRuntimeContext)) == null || (ext = e.getExt()) == null) {
            return false;
        }
        return TextUtils.equals("true", ext.getString(str));
    }
}
