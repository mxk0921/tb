package com.ap.zoloz.lzd;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.ubc;
import tb.uqx;
import tb.vqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZolozH5Plugin extends kpw implements INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HUMMER_FOUDATION = "hummerFoundation";
    private static final String ZOLOZ_IDENTITY = "zimIdentity";
    private static List<String> list;
    private uqx mZolozBaseH5Handler;
    private vqx mZolozEkycH5Handler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ubc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f4613a;

        public a(ZolozH5Plugin zolozH5Plugin, WVCallBackContext wVCallBackContext) {
            this.f4613a = wVCallBackContext;
        }

        @Override // tb.ubc
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ad2c50e", new Object[]{this, jSONObject});
                return;
            }
            BioLog.i("jsapi response " + jSONObject.toJSONString());
            nsw nswVar = new nsw();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                nswVar.a(entry.getKey(), entry.getValue());
            }
            this.f4613a.success(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ubc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f4614a;

        public b(ZolozH5Plugin zolozH5Plugin, WVCallBackContext wVCallBackContext) {
            this.f4614a = wVCallBackContext;
        }

        @Override // tb.ubc
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ad2c50e", new Object[]{this, jSONObject});
                return;
            }
            BioLog.i("jsapi response " + jSONObject.toJSONString());
            this.f4614a.success(jSONObject.toJSONString());
        }
    }

    private void identify(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205bdb5a", new Object[]{this, str, wVCallBackContext});
            return;
        }
        BioLog.i("jsapi request " + str);
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (uqx.ZIM_IDENTIFY_GET_META_INFO.equals(parseObject.getString("action"))) {
                if (this.mZolozBaseH5Handler == null) {
                    this.mZolozBaseH5Handler = new uqx();
                }
                this.mZolozBaseH5Handler.a(parseObject, wVCallBackContext.getWebview().getContext(), new a(this, wVCallBackContext));
                return;
            }
            if (this.mZolozEkycH5Handler == null) {
                this.mZolozEkycH5Handler = new vqx();
            }
            this.mZolozEkycH5Handler.b(parseObject, wVCallBackContext.getWebview().getContext(), new b(this, wVCallBackContext));
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }

    public static /* synthetic */ Object ipc$super(ZolozH5Plugin zolozH5Plugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zoloz/lzd/ZolozH5Plugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!list.contains(str)) {
            return false;
        }
        identify(str2, wVCallBackContext);
        return true;
    }

    static {
        t2o.a(245366874);
        ArrayList arrayList = new ArrayList();
        list = arrayList;
        arrayList.add(ZOLOZ_IDENTITY);
        list.add(HUMMER_FOUDATION);
    }
}
