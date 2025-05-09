package com.taobao.tbpoplayer.mock;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.info.frequency.a;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import org.json.JSONTokener;
import tb.dcm;
import tb.kpw;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WVPopLayerMock extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626373);
    }

    public static /* synthetic */ Object ipc$super(WVPopLayerMock wVPopLayerMock, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/mock/WVPopLayerMock");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if ("enableMock".equals(str)) {
                wdm.d("PopLayerManager.jsEnableMock.params{%s}", str2);
                org.json.JSONObject jSONObject = (org.json.JSONObject) new JSONTokener(str2).nextValue();
                PopLayerMockManager.instance().setMock(jSONObject.optBoolean("enable", false), jSONObject.optString("config", ""), jSONObject.optBoolean("isPersistent", false), jSONObject.optBoolean("isConstraintMock", false), jSONObject.optLong("timeTravelSec", 0L), str2);
                wVCallBackContext.success();
                return true;
            } else if ("enableMockTimeTravelSec".equals(str)) {
                wdm.d("PopLayerManager.jsEnableMockTimeTravelSec.params{%s}", str2);
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) new JSONTokener(str2).nextValue();
                PopLayerMockManager.instance().setMockTimeTravelSec(jSONObject2.optBoolean("enable", false), jSONObject2.optBoolean("isPersistent", false), jSONObject2.optLong("timeTravelSec", 0L));
                wVCallBackContext.success();
                return true;
            } else if ("clearCount".equals(str)) {
                int intValue = (TextUtils.isEmpty(str2) || (parseObject = JSON.parseObject(str2)) == null) ? 0 : parseObject.getInteger("clearMode").intValue();
                if (intValue == 0) {
                    dcm.f().a();
                } else if (intValue == 1) {
                    a.t().q();
                } else if (intValue == 2) {
                    dcm.f().a();
                    a.t().q();
                }
                wVCallBackContext.success();
                return true;
            } else if ("clearConfigPercentInfo".equals(str)) {
                PopMiscInfoFileHelper.g().a();
                wVCallBackContext.success();
                return true;
            } else if (!"openConsole".equals(str)) {
                wVCallBackContext.error("PopLayerManager.execute.noMethodFound");
                return false;
            } else if (!PopLayer.DEBUG) {
                wVCallBackContext.error("Release包不允许使用，请用Debug包调试");
                return false;
            } else {
                org.json.JSONObject jSONObject3 = (org.json.JSONObject) new JSONTokener(str2).nextValue();
                String optString = jSONObject3.optString("windvane", "");
                int optInt = jSONObject3.optInt("logCacheSize", 50);
                Nav.from(this.mContext).toUri("http://tb.cn/n/poplayerdebug?windvane=" + optString + "&log_cache_size=" + optInt);
                return true;
            }
        } catch (Throwable th) {
            wdm.h("PopLayerManager.execute.error", th);
            wVCallBackContext.error(th.toString() + "\n" + th.getMessage());
            return false;
        }
    }
}
