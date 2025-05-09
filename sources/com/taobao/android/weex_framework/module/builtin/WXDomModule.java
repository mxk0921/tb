package com.taobao.android.weex_framework.module.builtin;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.widget.FontDO;
import tb.pu9;
import tb.t2o;
import tb.tvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXDomModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "dom";
    public static final String[] METHODS = {"scrollToElement", "addRule"};
    private static final Object LOCK = new Object();

    public static /* synthetic */ Object ipc$super(WXDomModule wXDomModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXDomModule");
    }

    private static FontDO parseFontDO(JSONObject jSONObject, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontDO) ipChange.ipc$dispatch("83abfde2", new Object[]{jSONObject, mUSDKInstance});
        }
        if (jSONObject == null) {
            return null;
        }
        return new FontDO(jSONObject.getString("fontFamily"), jSONObject.getString("src"), mUSDKInstance);
    }

    public void addRule(String str, JSONObject jSONObject) {
        FontDO parseFontDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63306aa2", new Object[]{this, str, jSONObject});
            return;
        }
        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
        if (weexInstanceImpl != null && !weexInstanceImpl.isDestroyed() && TextUtils.equals("fontFace", str)) {
            if (weexInstanceImpl instanceof WeexDOMInstance) {
                ((WeexDOMInstance) weexInstanceImpl).registerCSSRuleInJSThread(str, WeexValueImpl.ofJSON(jSONObject));
            } else if ((weexInstanceImpl instanceof WeexMUSInstance) && (parseFontDO = parseFontDO(jSONObject, weexInstanceImpl.getAdapterMUSInstance())) != null && !TextUtils.isEmpty(parseFontDO.b())) {
                synchronized (LOCK) {
                    try {
                        FontDO e = pu9.g().e(parseFontDO.b());
                        if (e != null && TextUtils.equals(e.f(), parseFontDO.f())) {
                            pu9.g().j(e, true);
                        }
                        pu9.g().l(parseFontDO);
                        pu9.g().j(parseFontDO, true);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        str2.hashCode();
        if (str2.equals("addRule")) {
            addRule(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toJSONObjectOrNull());
            return null;
        } else if (!str2.equals("scrollToElement")) {
            return null;
        } else {
            scrollToElement(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toJSONObjectOrNull());
            return null;
        }
    }

    public void scrollToElement(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d7b44b", new Object[]{this, str, jSONObject});
            return;
        }
        tvh adapterMUSInstance = ((WeexInstanceImpl) getWeexInstance()).getAdapterMUSInstance();
        if (adapterMUSInstance != null) {
            try {
                adapterMUSInstance.callNativeUINode(Integer.valueOf(str).intValue(), "scrollTo", new MUSValue[]{MUSValue.ofJSON(jSONObject)});
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(982516117);
    }
}
