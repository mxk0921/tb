package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.Map;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p9v extends lmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)
    private String mBizName;
    @JSONField(serialize = false)
    private IDMComponent mComponent;
    @JSONField(serialize = false)
    private Map<String, bsb> mComponentChangedListenerMap;
    @JSONField(serialize = false)
    private ViewEngine mViewEngine;

    static {
        t2o.a(157286580);
    }

    public p9v(String str, ppi ppiVar, String str2, IDMComponent iDMComponent, Map<String, bsb> map, ViewEngine viewEngine) {
        super(str, ppiVar);
        this.mBizName = str2 == null ? "default" : str2;
        this.mComponent = iDMComponent;
        this.mComponentChangedListenerMap = map;
        this.mViewEngine = viewEngine;
    }

    public static /* synthetic */ Object ipc$super(p9v p9vVar, String str, Object... objArr) {
        if (str.hashCode() == -1467730997) {
            super.c(objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/core/UltronMessageChannel");
    }

    @Override // tb.lmi
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            return;
        }
        try {
            f(this.mComponent, obj);
            super.c(obj);
        } catch (Throwable th) {
            UnifyLog.m(this.mBizName, "UltronMessageChannel", xpd.c.EVENT_ON_MESSAGE, th.getMessage());
        }
    }

    public final void f(IDMComponent iDMComponent, Object obj) {
        bsb bsbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1e71aa", new Object[]{this, iDMComponent, obj});
        } else if (obj instanceof JSONObject) {
            g(iDMComponent, (JSONObject) obj);
        } else if (obj instanceof Map) {
            try {
                Map map = (Map) obj;
                JSONObject b = esb.b(iDMComponent);
                if (b != null) {
                    IDMComponent iDMComponent2 = (IDMComponent) map.get("postModel");
                    JSONObject jSONObject = b.getJSONObject(iDMComponent2.getKey());
                    if (jSONObject != null) {
                        String string = jSONObject.getString("type");
                        if (!TextUtils.isEmpty(string) && (bsbVar = this.mComponentChangedListenerMap.get(string)) != null) {
                            bsbVar.a(iDMComponent, iDMComponent2, jSONObject.getJSONObject("fields"));
                        }
                    }
                }
            } catch (Throwable th) {
                UnifyLog.m(this.mBizName, "UltronMessageChannel", th.toString(), new String[0]);
            }
        }
    }

    public final void g(IDMComponent iDMComponent, JSONObject jSONObject) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743f4599", new Object[]{this, iDMComponent, jSONObject});
        } else if (TextUtils.equals(jSONObject.getString("type"), "updateItem")) {
            String h = ParseModule.h(iDMComponent);
            if (TextUtils.equals(h, "stickyTop") || TextUtils.equals(h, "stickyBottom")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("message");
                if (!(jSONObject2 == null || (data = iDMComponent.getData()) == null)) {
                    data.putAll(jSONObject2);
                    iDMComponent.writeBackData(data, false);
                }
                if (TextUtils.equals(h, "stickyTop")) {
                    this.mViewEngine.H0(8);
                } else if (TextUtils.equals(h, "stickyBottom")) {
                    this.mViewEngine.H0(16);
                }
            }
        }
    }
}
