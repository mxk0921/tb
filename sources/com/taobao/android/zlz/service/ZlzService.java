package com.taobao.android.zlz.service;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ea8;
import tb.efe;
import tb.fa8;
import tb.ga8;
import tb.kpw;
import tb.nsw;
import tb.pu1;
import tb.tqx;
import tb.uqx;
import tb.vqx;
import tb.y1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ZlzService extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "ZlzService";
    public static final String TAG = "ZlzBridgeExtension";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements efe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10041a;

        public a(ZlzService zlzService, WVCallBackContext wVCallBackContext) {
            this.f10041a = wVCallBackContext;
        }

        @Override // tb.efe
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef6534f2", new Object[]{this, new Boolean(z)});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.a("result", Boolean.valueOf(z));
            this.f10041a.success(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements y1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10042a;

        public b(ZlzService zlzService, WVCallBackContext wVCallBackContext) {
            this.f10042a = wVCallBackContext;
        }

        @Override // tb.y1c
        public void a(ga8 ga8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d76c595", new Object[]{this, ga8Var});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.a("code", Integer.valueOf(ga8Var.f19831a));
            nswVar.b("subCode", ga8Var.b);
            nswVar.b("result", ga8Var.c);
            nswVar.a("extInfo", null);
            this.f10042a.success(nswVar);
        }
    }

    public static /* synthetic */ Object ipc$super(ZlzService zlzService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/zlz/service/ZlzService");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (tqx.b().a() == null) {
            tqx.b().c(this.mContext);
        }
        if (uqx.ZIM_IDENTIFY_GET_META_INFO.equals(str)) {
            try {
                String b2 = pu1.b(this.mContext);
                if (b2 != null && !"".equals(b2)) {
                    nsw nswVar = new nsw();
                    nswVar.b("metaInfo", b2);
                    wVCallBackContext.success(nswVar);
                }
                wVCallBackContext.error("metainfo is null");
            } catch (Exception e) {
                wVCallBackContext.error(e.getMessage());
            }
        } else if ("downloadFaceModel".equals(str)) {
            try {
                ea8.o().q(this.mContext, new a(this, wVCallBackContext));
            } catch (Exception e2) {
                wVCallBackContext.error(e2.getMessage());
            }
        } else if ("checkModelReady".equals(str)) {
            try {
                boolean k = ea8.o().k();
                nsw nswVar2 = new nsw();
                nswVar2.a("result", Boolean.valueOf(k));
                wVCallBackContext.success(nswVar2);
            } catch (Exception e3) {
                wVCallBackContext.error(e3.getMessage());
            }
        } else if (vqx.ZIM_IDENTIFY_START_EKYC.equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            fa8 fa8Var = new fa8();
            fa8Var.f19139a = parseObject.getString("eKYCId");
            fa8Var.d = parseObject.getString("eKYCConfig");
            ((HashMap) fa8Var.c).put("hummerContext", this.mContext);
            try {
                ea8.o().r(fa8Var, new b(this, wVCallBackContext));
            } catch (Exception e4) {
                wVCallBackContext.error(e4.getMessage());
            }
        } else if ("deliveryContext".equals(str)) {
            tqx.b().c(this.mContext);
            wVCallBackContext.success();
        }
        return false;
    }
}
