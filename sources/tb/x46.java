package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.muise.DXCoreRefModule;
import com.taobao.android.dinamicx.muise.DXCoreRenderModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x46 implements zvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, a> f31134a = new HashMap();

    static {
        MUSEngine.registerModule("DXCoreRef", DXCoreRefModule.class);
        MUSEngine.registerModule("DXCoreRender", DXCoreRenderModule.class);
    }

    public static MUSValue[] d(int i, int i2, mw5[] mw5VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue[]) ipChange.ipc$dispatch("51dd61ab", new Object[]{new Integer(i), new Integer(i2), mw5VarArr});
        }
        MUSValue[] mUSValueArr = new MUSValue[i2 + i];
        for (int i3 = 0; i3 < i2; i3++) {
            mw5 mw5Var = mw5VarArr[i3];
            switch (mw5Var.q()) {
                case 1:
                case 8:
                case 9:
                    mUSValueArr[i + i3] = MUSValue.ofNill();
                    break;
                case 2:
                    mUSValueArr[i + i3] = MUSValue.ofInt((int) mw5Var.m());
                    break;
                case 3:
                    mUSValueArr[i + i3] = MUSValue.ofFloat((float) mw5Var.k());
                    break;
                case 4:
                    mUSValueArr[i + i3] = MUSValue.ofBool(mw5Var.i());
                    break;
                case 5:
                    mUSValueArr[i + i3] = MUSValue.ofString(mw5Var.p());
                    break;
                case 6:
                    mUSValueArr[i + i3] = MUSValue.ofJSON(mw5Var.h());
                    break;
                case 7:
                    mUSValueArr[i + i3] = MUSValue.ofJSON(mw5Var.o());
                    break;
            }
        }
        return mUSValueArr;
    }

    @Override // tb.zvb
    public void a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24c7ca", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        a aVar = (a) ((HashMap) this.f31134a).get(Integer.valueOf(i));
        if (aVar != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            aVar.dispatchEvent(str, MUSValue.ofJSON(jSONObject));
        }
    }

    @Override // tb.zvb
    public int b(DXRuntimeContext dXRuntimeContext, byte[] bArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7f50d60", new Object[]{this, dXRuntimeContext, bArr})).intValue();
        }
        Context h = dXRuntimeContext.h();
        if (h instanceof fkb) {
            fkb fkbVar = (fkb) h;
            if (!TextUtils.isEmpty(fkbVar.getBundleUrl())) {
                str = fkbVar.getBundleUrl();
                Uri parse = Uri.parse(str);
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                Uri build = parse.buildUpon().appendQueryParameter("inspect_breakpt_key", dXRuntimeContext.p().f7343a).build();
                mUSInstanceConfig.p(build.toString());
                mUSInstanceConfig.r(dXRuntimeContext.p().f7343a);
                mUSInstanceConfig.C(true);
                a c = b.f().c(dXRuntimeContext.h(), mUSInstanceConfig);
                c.initWithData(bArr, build);
                ((HashMap) this.f31134a).put(Integer.valueOf(c.getInstanceId()), c);
                return c.getInstanceId();
            }
        }
        if (!TextUtils.isEmpty(dXRuntimeContext.p().c)) {
            str = dXRuntimeContext.p().c;
        } else {
            str = "dx://" + dXRuntimeContext.p().f7343a;
        }
        Uri parse2 = Uri.parse(str);
        MUSInstanceConfig mUSInstanceConfig2 = new MUSInstanceConfig();
        Uri build2 = parse2.buildUpon().appendQueryParameter("inspect_breakpt_key", dXRuntimeContext.p().f7343a).build();
        mUSInstanceConfig2.p(build2.toString());
        mUSInstanceConfig2.r(dXRuntimeContext.p().f7343a);
        mUSInstanceConfig2.C(true);
        a c2 = b.f().c(dXRuntimeContext.h(), mUSInstanceConfig2);
        c2.initWithData(bArr, build2);
        ((HashMap) this.f31134a).put(Integer.valueOf(c2.getInstanceId()), c2);
        return c2.getInstanceId();
    }

    @Override // tb.zvb
    public void c(int i, DXRuntimeContext dXRuntimeContext, String str, String str2, int i2, mw5[] mw5VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38082a6", new Object[]{this, new Integer(i), dXRuntimeContext, str, str2, new Integer(i2), mw5VarArr});
            return;
        }
        a aVar = (a) ((HashMap) this.f31134a).get(Integer.valueOf(i));
        if (aVar != null) {
            JSONArray c = rn6.c(dXRuntimeContext);
            if (c != null && !c.isEmpty()) {
                aVar.register(c, "__refs");
            }
            MUSValue[] d = d(2, i2, mw5VarArr);
            d[0] = MUSValue.ofString(str);
            d[1] = MUSValue.ofString(str2);
            aVar.setExecuteContext(dXRuntimeContext);
            aVar.execute(d);
        }
    }

    @Override // tb.zvb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (a aVar : ((HashMap) this.f31134a).values()) {
            if (aVar != null) {
                aVar.destroy();
            }
        }
        ((HashMap) this.f31134a).clear();
    }

    @Override // tb.zvb
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = (a) ((HashMap) this.f31134a).remove(Integer.valueOf(i));
        if (aVar != null) {
            aVar.destroy();
        }
    }
}
