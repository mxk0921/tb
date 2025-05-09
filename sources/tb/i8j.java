package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i8j extends es1<MuiseCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "videoAutoPlay";
    public static final String c = "videoForcePlay";

    /* renamed from: a  reason: collision with root package name */
    public final h8j f21156a = new h8j();

    public static /* synthetic */ Object ipc$super(i8j i8jVar, String str, Object... objArr) {
        if (str.hashCode() == 433644561) {
            super.l((JSONObject) objArr[0], (BaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/nx3/bean/MuiseCellBeanParser");
    }

    @Override // tb.dx
    public Class<MuiseCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return MuiseCellBean.class;
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
    public MuiseCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("888880a", new Object[]{this});
        }
        return new MuiseCellBean();
    }

    /* renamed from: n */
    public void i(JSONObject jSONObject, MuiseCellBean muiseCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961a53c6", new Object[]{this, jSONObject, muiseCellBean, baseSearchResult});
            return;
        }
        super.l(jSONObject, muiseCellBean, baseSearchResult);
        MuiseBean l = this.f21156a.a();
        this.f21156a.i(jSONObject, l, null);
        muiseCellBean.mMuiseBean = l;
        try {
            String str = b;
            muiseCellBean.videoPlayable = jSONObject.getBooleanValue(str);
            String str2 = c;
            muiseCellBean.videoForcePlay = jSONObject.getBooleanValue(str2);
            muiseCellBean.ndPreviewBizName = jSONObject.getString("ndPreviewBizName");
            muiseCellBean.ndPreview = jSONObject.getBooleanValue("ndPreview");
            muiseCellBean.ndPreviewUrl = jSONObject.getString("ndPreviewUrl");
            Object obj = jSONObject.get("info");
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (!muiseCellBean.videoPlayable) {
                    muiseCellBean.videoPlayable = jSONObject2.getBooleanValue(str);
                    if (!muiseCellBean.videoForcePlay) {
                        muiseCellBean.videoForcePlay = jSONObject2.getBooleanValue(str2);
                    }
                }
                if (!muiseCellBean.ndPreview) {
                    muiseCellBean.ndPreview = jSONObject2.getBooleanValue("ndPreview");
                }
                if (TextUtils.isEmpty(muiseCellBean.ndPreviewUrl)) {
                    muiseCellBean.ndPreviewUrl = jSONObject2.getString("ndPreviewUrl");
                }
                if (TextUtils.isEmpty(muiseCellBean.ndPreviewBizName)) {
                    muiseCellBean.ndPreviewBizName = jSONObject2.getString("ndPreviewBizName");
                }
            }
        } catch (Exception unused) {
        }
        long j = muiseCellBean.id;
        if (j > 0) {
            MuiseCellBean.recordLongId(j, muiseCellBean);
        }
    }

    static {
        t2o.a(993001912);
    }
}
