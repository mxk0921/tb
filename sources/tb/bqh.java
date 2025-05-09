package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static List<MRTPythonLibDescription> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89b8d5a4", new Object[]{map});
        }
        Object obj = map.get("libs");
        if (obj == null || !(obj instanceof List)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (obj2 != null && (obj2 instanceof HashMap)) {
                try {
                    Map map2 = (Map) obj2;
                    arrayList.add(new MRTPythonLibDescription((String) map2.get("n"), (String) map2.get("md5"), (String) map2.get("furl"), (String) map2.get("fmd5"), null));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static List<MRTTaskDescription> b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57c2369d", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            kgh.s("WalleModelConfigConvert", "configMap is null");
            return arrayList;
        }
        Object obj = map.get("models");
        if (obj == null || !(obj instanceof List)) {
            kgh.s("WalleModelConfigConvert", "models is null or not list :" + obj);
            return arrayList;
        }
        for (Map map2 : (List) obj) {
            try {
                arrayList.add(d(map2));
            } catch (MRTRuntimeException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static MRTFilesDescription c(Map map, MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTFilesDescription) ipChange.ipc$dispatch("c4243003", new Object[]{map, mRTTaskDescription});
        }
        return new MRTFilesDescription((Map) map.get(vs3.FILES_DIR_NAME), map.get("furl") + "", map.get("fmd5") + "", mRTTaskDescription);
    }

    public static MRTTaskDescription d(Map map) throws MRTRuntimeException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("702404da", new Object[]{map});
        }
        String str2 = null;
        if (map == null) {
            return null;
        }
        Object obj = map.get("n");
        Object obj2 = map.get("furl");
        Object obj3 = map.get("mmd5");
        Object obj4 = map.get("fmd5");
        mwv.a(obj);
        mwv.a(obj2);
        mwv.a(obj3);
        Object obj5 = map.get("cln");
        Object obj6 = map.get("r");
        Object obj7 = map.get("or");
        MRTTaskDescription mRTTaskDescription = new MRTTaskDescription();
        mRTTaskDescription.name = mwv.h(obj);
        mRTTaskDescription.model = new MRTCodeDescription(mwv.h(obj2), mwv.h(obj3), mwv.h(obj4), mRTTaskDescription);
        mRTTaskDescription.clnName = mwv.h(obj5);
        if (obj6 != null && (obj6 instanceof Map)) {
            mRTTaskDescription.resource = c((Map) obj6, mRTTaskDescription);
        }
        Object obj8 = map.get("async");
        if (obj8 != null && (obj8 instanceof Boolean)) {
            mRTTaskDescription.async = ((Boolean) obj8).booleanValue();
        }
        if (obj7 != null && (obj7 instanceof List)) {
            List list = (List) obj7;
            if (list.size() > 0) {
                kgh.s("WalleModelConfigConvert", "option resource size >1");
            }
            if (list.get(0) != null && (list.get(0) instanceof Map)) {
                mRTTaskDescription.optResource = c((Map) list.get(0), mRTTaskDescription);
            }
        }
        if (map.get("cid") == null) {
            str = null;
        } else {
            str = map.get("cid") + "";
        }
        mRTTaskDescription.cid = str;
        if (map.get("ea1") != null) {
            str2 = map.get("ea1") + "";
        }
        mRTTaskDescription.extentAgr1 = str2;
        return mRTTaskDescription;
    }
}
