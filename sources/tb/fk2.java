package tb;

import android.graphics.RectF;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fk2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final zjb f19350a = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b implements zjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296416);
            t2o.a(481296422);
        }

        public b() {
        }

        public ixn a(Map<String, Object> map) {
            JSONObject jSONObject;
            List<RectF> c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ixn) ipChange.ipc$dispatch("bac38a37", new Object[]{this, map});
            }
            JSONObject jSONObject2 = (JSONObject) map.get(HorizontalXslComponent.ATTR_PAGE_INFO);
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("pltInfo")) == null) {
                return null;
            }
            ixn ixnVar = new ixn();
            String string = jSONObject.getString("bboxes_str");
            String string2 = jSONObject.getString("region");
            if (TextUtils.isEmpty(string) || (c = c(string)) == null || c.size() <= 0) {
                RectF b = b(string2);
                if (b != null) {
                    ixnVar.d(b);
                }
                return ixnVar;
            }
            ixnVar.e(c);
            return ixnVar;
        }

        public final RectF b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("f6b117a9", new Object[]{this, str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(",");
            if (split.length != 4) {
                return null;
            }
            try {
                return new RectF(Float.parseFloat(split[0]), Float.parseFloat(split[2]), Float.parseFloat(split[1]), Float.parseFloat(split[3]));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }

        public final List<RectF> c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2b5811ea", new Object[]{this, str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(";");
            ArrayList arrayList = new ArrayList();
            if (split.length == 0) {
                return null;
            }
            for (String str2 : split) {
                try {
                    String[] split2 = str2.split(",");
                    if (split2.length < 4) {
                        return null;
                    }
                    arrayList.add(new RectF(Float.parseFloat(split2[0]), Float.parseFloat(split2[2]), Float.parseFloat(split2[1]), Float.parseFloat(split2[3])));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return arrayList;
        }
    }

    static {
        t2o.a(481296414);
    }

    public static ixn a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixn) ipChange.ipc$dispatch("65c3caa4", new Object[]{map});
        }
        zjb zjbVar = f19350a;
        if (zjbVar != null) {
            return ((b) zjbVar).a(map);
        }
        return null;
    }
}
