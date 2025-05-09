package com.taobao.android.dinamicx.muise;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.pvh;
import tb.rn6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXCoreRenderModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DXCoreRenderModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(DXCoreRenderModule dXCoreRenderModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/muise/DXCoreRenderModule");
    }

    @MUSMethod(uiThread = true)
    public void refresh(JSONObject jSONObject, pvh pvhVar) {
        DXRuntimeContext dXRuntimeContext;
        DXWidgetNode W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b51237", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        a instance = getInstance();
        if (instance != null) {
            Object executeContext = instance.getExecuteContext();
            if ((executeContext instanceof DXRuntimeContext) && (W = (dXRuntimeContext = (DXRuntimeContext) executeContext).W()) != null) {
                rn6.e(jSONObject, W, false);
                if (pvhVar != null) {
                    JSONArray c = rn6.c(dXRuntimeContext);
                    if (c != null && !c.isEmpty()) {
                        instance.register(c, "__refs");
                    }
                    pvhVar.b(new Object[0]);
                }
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void render(JSONObject jSONObject, pvh pvhVar) {
        DXRuntimeContext dXRuntimeContext;
        DXWidgetNode W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ba5e9c", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        a instance = getInstance();
        if (instance != null) {
            Object executeContext = instance.getExecuteContext();
            if ((executeContext instanceof DXRuntimeContext) && (W = (dXRuntimeContext = (DXRuntimeContext) executeContext).W()) != null) {
                rn6.f(jSONObject, W, false);
                if (pvhVar != null) {
                    JSONArray c = rn6.c(dXRuntimeContext);
                    if (c != null && !c.isEmpty()) {
                        instance.register(c, "__refs");
                    }
                    pvhVar.b(new Object[0]);
                }
            }
        }
    }
}
