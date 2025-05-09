package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class az<BEAN extends TypedBean, CTX> extends dx<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ID = "__id__";
    public static final String KEY_TYPE = "tItemType";
    public static final String KEY_TYPE_BACKUP = "type";

    static {
        t2o.a(993001926);
    }

    public static /* synthetic */ Object ipc$super(az azVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/parse/AbsTypedBeanParser");
    }

    /* renamed from: i */
    public void e(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c3cb30", new Object[]{this, jSONObject, bean, ctx});
            return;
        }
        String string = jSONObject.getString("tItemType");
        bean.type = string;
        if (TextUtils.isEmpty(string)) {
            bean.type = jSONObject.getString("type");
        }
        Long l = jSONObject.getLong(KEY_ID);
        if (l != null) {
            bean.id = l.longValue();
        }
    }

    /* renamed from: j */
    public void h(BEAN bean, JSONObject jSONObject, CTX ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa93f9a", new Object[]{this, bean, jSONObject, ctx});
        } else if (TextUtils.isEmpty(bean.type)) {
            bean.type = jSONObject.getString("type");
        }
    }
}
