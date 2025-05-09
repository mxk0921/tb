package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i3q extends o5l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_openUrl";

    static {
        t2o.a(442499140);
    }

    public static /* synthetic */ Object ipc$super(i3q i3qVar, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/bizevent/SkuOpenUrlHandler");
    }

    @Override // tb.o5l, tb.l6v
    public void t(b8v b8vVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuOpenUrlHandler.handleEvent");
        }
        if (b8vVar != null) {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = (Object[]) b8vVar.i("extraParams");
            if (objArr != null && objArr.length > 1) {
                int length = objArr.length;
                for (int i = 1; i < length; i++) {
                    arrayList.add(objArr[i]);
                }
            }
            gsb j = j();
            if (!(j == null || (fields = j.getFields()) == null || fields.isEmpty())) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(arrayList.get(i2));
                }
                JSONObject parseObject = JSON.parseObject(fields.toJSONString());
                jr8.a(new JSONObject(), arrayList2, parseObject);
                b8vVar.r(new DMEvent(j.getType(), parseObject, j.getComponents()));
                super.t(b8vVar);
            }
        }
    }
}
