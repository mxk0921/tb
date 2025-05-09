package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TABINFO = 5360454983433149130L;
    public static final String TAG = "DXDataParserTabInfo";

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f23525a;
    public int b = 0;
    public boolean c = false;

    static {
        t2o.a(614465678);
    }

    public lr5(JSONArray jSONArray) {
        this.f23525a = jSONArray;
    }

    public static /* synthetic */ Object ipc$super(lr5 lr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserTabInfo");
    }

    public JSONArray c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fc3df55d", new Object[]{this});
        }
        return this.f23525a;
    }

    public String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8aaab0", new Object[]{this, new Integer(i)});
        }
        JSONArray jSONArray = this.f23525a;
        if (jSONArray != null && i >= 0 && i < jSONArray.size()) {
            JSONObject jSONObject = (JSONObject) this.f23525a.get(i);
            if (jSONObject.containsKey("tabCode")) {
                return jSONObject.getString("tabCode");
            }
        }
        return "";
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("801fe4c8", new Object[]{this})).intValue();
        }
        return this.f23525a.size();
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        g(dXRuntimeContext);
        JSONArray jSONArray = this.f23525a;
        if (jSONArray == null) {
            hav.d(TAG, "tabArray is null");
        } else {
            hav.d(TAG, jSONArray.toString());
        }
        return this.f23525a;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84de305", new Object[]{this, new Integer(i)});
            return;
        }
        JSONArray jSONArray = this.f23525a;
        if (jSONArray == null || jSONArray.isEmpty() || i == this.b) {
            hav.d(TAG, "tabArray is error");
            return;
        }
        ((JSONObject) this.f23525a.get(i)).put("isSelected", (Object) "true");
        ((JSONObject) this.f23525a.get(this.b)).put("isSelected", (Object) "false");
        hav.d(TAG, "index: " + i + this.f23525a.toString());
        this.b = i;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27abaf12", new Object[]{this})).intValue();
        }
        if (this.f23525a == null) {
            return 0;
        }
        for (int i = 0; i < this.f23525a.size(); i++) {
            Object obj = this.f23525a.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.containsKey("isSelected") && jSONObject.getString("isSelected").equals("true")) {
                    this.b = i;
                    return i;
                }
            }
        }
        return 0;
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a55a8c96", new Object[]{this, str})).intValue();
        }
        if (this.f23525a == null) {
            return -1;
        }
        for (int i = 0; i < this.f23525a.size(); i++) {
            Object obj = this.f23525a.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.containsKey("tabCode") && jSONObject.getString("tabCode").equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final void g(DXRuntimeContext dXRuntimeContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c09ed9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
            UnifyLog.e("DXDataParserTabInfo.setupTabArray", "dxRuntimeContext is null");
        } else {
            JSONObject i2 = dXRuntimeContext.i();
            if (i2 == null) {
                UnifyLog.e("DXDataParserTabInfo.setupTabArray", f4w.LOAD_DATA_NULL);
                return;
            }
            JSONObject jSONObject = i2.getJSONObject("fields");
            if (jSONObject == null) {
                UnifyLog.e("DXDataParserTabInfo.setupTabArray", "fields is null");
            } else if (TextUtils.equals(jSONObject.getString("isContainRefund"), "true")) {
                for (int i3 = 0; i3 < this.f23525a.size(); i3++) {
                    JSONObject jSONObject2 = this.f23525a.getJSONObject(i3);
                    if (jSONObject2 != null && TextUtils.equals("reFund", jSONObject2.getString("tabCode"))) {
                        return;
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("title", (Object) Localization.q(R.string.order_biz_refund));
                jSONObject3.put("isSelected", (Object) String.valueOf(this.c));
                jSONObject3.put("tabCode", (Object) "reFund");
                if (this.f23525a.size() - 1 > 0) {
                    i = this.f23525a.size() - 1;
                }
                this.f23525a.add(i, jSONObject3);
            } else {
                while (i < this.f23525a.size()) {
                    JSONObject jSONObject4 = this.f23525a.getJSONObject(i);
                    if (jSONObject4 != null && TextUtils.equals("reFund", jSONObject4.getString("tabCode"))) {
                        this.c = TextUtils.equals(jSONObject4.getString("isSelected"), "true");
                        this.f23525a.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }
    }
}
