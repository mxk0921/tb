package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistRequestNew;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lc4 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699858);
    }

    public lc4(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(lc4 lc4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/componentlist/ComponentListBusiness");
    }

    public void K(String str, String str2, String str3, String str4, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7703fcd5", new Object[]{this, str, str2, str3, str4, new Integer(i), new Long(j)});
            return;
        }
        MtopMediaplatformDetailComponentlistRequestNew mtopMediaplatformDetailComponentlistRequestNew = new MtopMediaplatformDetailComponentlistRequestNew();
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            mtopMediaplatformDetailComponentlistRequestNew.setContentId(Long.parseLong(str));
            mtopMediaplatformDetailComponentlistRequestNew.setChannel(str2);
            mtopMediaplatformDetailComponentlistRequestNew.entryLiveSource = str3;
            mtopMediaplatformDetailComponentlistRequestNew.liveSource = str4;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(z9u.KEY_ROOMTYPE, (Object) Integer.valueOf(i));
            jSONObject.put("newRoomType", (Object) Long.valueOf(j));
            mtopMediaplatformDetailComponentlistRequestNew.features = jSONObject.toJSONString();
        }
        C(0, mtopMediaplatformDetailComponentlistRequestNew, MtopMediaplatformDetailComponentlistResponse.class);
    }
}
