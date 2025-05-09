package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o4x extends es1<WeexCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "degradeItemType";
    public static final String c = "videoAutoPlay";

    /* renamed from: a  reason: collision with root package name */
    public final b4x f25145a = new b4x();

    public static /* synthetic */ Object ipc$super(o4x o4xVar, String str, Object... objArr) {
        if (str.hashCode() == 433644561) {
            super.l((JSONObject) objArr[0], (BaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/nx3/bean/WeexCellBeanParser");
    }

    @Override // tb.dx
    public Class<WeexCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return WeexCellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "NxCellBean";
    }

    /* renamed from: m */
    public WeexCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCellBean) ipChange.ipc$dispatch("782cee74", new Object[]{this});
        }
        return new WeexCellBean();
    }

    /* renamed from: n */
    public void i(JSONObject jSONObject, WeexCellBean weexCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8dfdf2", new Object[]{this, jSONObject, weexCellBean, baseSearchResult});
            return;
        }
        super.l(jSONObject, weexCellBean, baseSearchResult);
        WeexBean l = this.f25145a.a();
        this.f25145a.i(jSONObject, l, null);
        weexCellBean.mWeexBean = l;
        weexCellBean.degradeType = jSONObject.getString(b);
        try {
            String str = c;
            boolean booleanValue = jSONObject.getBooleanValue(str);
            weexCellBean.videoPlayable = booleanValue;
            if (!booleanValue) {
                Object obj = jSONObject.get("info");
                if (obj instanceof JSONObject) {
                    weexCellBean.videoPlayable = ((JSONObject) obj).getBooleanValue(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    static {
        t2o.a(993001917);
    }
}
