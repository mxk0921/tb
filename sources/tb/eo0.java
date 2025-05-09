package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.linkage.adjust.streamResponse")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class eo0 extends hs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public io0 e;

    static {
        t2o.a(301990017);
    }

    public static /* synthetic */ Object ipc$super(eo0 eo0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/stream/queryParams/AliBuyStreamQueryParamsOperateExtension");
    }

    public final io0 J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io0) ipChange.ipc$dispatch("ea1f99eb", new Object[]{this});
        }
        if (this.e == null) {
            this.e = (io0) x().get("aliBuyGlobalDataStreamResponseProcessor", io0.class);
        }
        return this.e;
    }

    public final void K0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11b7874", new Object[]{this, jSONObject});
        } else if (!TextUtils.isEmpty(jSONObject.getString("queryParams"))) {
            ck.g().e("stream", "queryParams is not null");
        } else {
            io0 J0 = J0();
            if (J0 == null) {
                ck.g().e("stream", "streamExceptionProcessor is null !!");
                return;
            }
            String n = J0.n();
            if (TextUtils.isEmpty(n)) {
                ck.g().e("stream", "queryParams is null !!");
            } else {
                jSONObject.put("queryParams", (Object) n);
            }
        }
    }

    @Override // tb.hs
    public void L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c47e4f3", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        if (jSONObject2 == null) {
            ck.g().e("stream", "linkage is null !!");
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("common");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (L0()) {
            ck.g().e("stream", "neeUploadQueryParams = true");
            K0(jSONObject3);
            return;
        }
        ck.g().e("stream", "neeUploadQueryParams = false");
        m0(jSONObject3);
    }

    public final void m0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffc64b", new Object[]{this, jSONObject});
            return;
        }
        Object remove = jSONObject.remove("queryParams");
        if (remove instanceof String) {
            io0 J0 = J0();
            if (J0 == null) {
                ck.g().e("stream", "streamExceptionProcessor is null !!");
            } else {
                J0.h((String) remove);
            }
        }
    }

    public final boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f58e78ca", new Object[]{this})).booleanValue();
        }
        io0 J0 = J0();
        if (J0 == null) {
            ck.g().e("stream", "streamExceptionProcessor is null !!");
            return true;
        }
        toq o = J0.o();
        if (o != null) {
            return o.d();
        }
        ck.g().e("stream", "uploadModel is null !!");
        return true;
    }
}
