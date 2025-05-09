package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u8o implements uqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(577765396);
        t2o.a(577765385);
    }

    public static MRTFilesDescription b(MRTTaskDescription mRTTaskDescription, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTFilesDescription) ipChange.ipc$dispatch("89463927", new Object[]{mRTTaskDescription, str});
        }
        ArrayList arrayList = new ArrayList();
        MRTFilesDescription mRTFilesDescription = mRTTaskDescription.resource;
        if (mRTFilesDescription != null) {
            arrayList.add(mRTFilesDescription);
        }
        MRTFilesDescription mRTFilesDescription2 = mRTTaskDescription.optResource;
        if (mRTFilesDescription2 != null) {
            arrayList.add(mRTFilesDescription2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MRTFilesDescription mRTFilesDescription3 = (MRTFilesDescription) it.next();
            Map<String, String> map = mRTFilesDescription3.files;
            if (map != null && map.containsKey(str)) {
                return mRTFilesDescription3;
            }
        }
        return null;
    }

    @Override // tb.uqh
    public Map<String, Object> a(String str, Map<String, Object> map) {
        vqh vqhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("36d6b146", new Object[]{this, str, map});
        }
        if ("get_resource_path".equalsIgnoreCase(str)) {
            if (map == null || map.size() == 0) {
                kgh.s("ResourcePathApi", "params  is empty");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(map.get(BaseMnnRunUnit.KEY_TASK_NAME));
                String str2 = "";
                sb.append(str2);
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(sb2)) {
                    kgh.s("ResourcePathApi", "taskName  is empty");
                    return null;
                }
                if (map.get("fileName") != null) {
                    str2 = map.get("fileName") + str2;
                }
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                String f = oqh.d().f(sb2 + ".local");
                kgh.s("ResourcePathApi", "task " + sb2 + " localTaskName: " + f);
                if (!TextUtils.isEmpty(f)) {
                    sb2 = f;
                }
                MRTTaskDescription e = oqh.d().e(sb2);
                if (e == null) {
                    kgh.s("ResourcePathApi", "task " + sb2 + " not register");
                    return null;
                }
                MRTFilesDescription b = b(e, str2);
                if (b == null || (vqhVar = b.resourceOperation) == null || !(vqhVar instanceof nqh)) {
                    kgh.s("ResourcePathApi", "task " + sb2 + " not resource");
                    return null;
                }
                String d = ((nqh) vqhVar).d(str2);
                if (TextUtils.isEmpty(d)) {
                    kgh.s("ResourcePathApi", "task " + sb2 + " resource :" + str2 + " not exist");
                    return null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("filePath", d);
                return hashMap;
            }
        }
        return null;
    }
}
