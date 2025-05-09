package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r08 extends kx1<List<Bitmap>, List<Integer>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705205);
    }

    public static /* synthetic */ Object ipc$super(r08 r08Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/comprehension/mnn/detector/DuplicateImageDetector");
    }

    @Override // tb.kx1
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea51c263", new Object[]{this});
        }
        return ckg.MODULE_NAME_DUP_IMAGE;
    }

    public final float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("165c4317", new Object[]{this})).floatValue();
        }
        return eag.n(0.1f);
    }

    /* renamed from: m */
    public List<Integer> h(List<Bitmap> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46bdf433", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            b();
            k(false);
            return null;
        }
        HashMap hashMap = new HashMap();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        int t = eag.t();
        for (Bitmap bitmap : list) {
            if (bitmap != null) {
                vector.add(new MNNCVImage(bitmap));
                vector2.add(Integer.valueOf(t));
                vector3.add(Integer.valueOf(bitmap.getWidth()));
                vector4.add(Integer.valueOf(bitmap.getHeight()));
            }
        }
        hashMap.put("_format_list", vector2);
        hashMap.put("_image_list", vector);
        hashMap.put("_image_width_list", vector3);
        hashMap.put("_image_height_list", vector4);
        hashMap.put("_threshold", Float.valueOf(l()));
        Map<String, Object> i = this.f22979a.i(hashMap);
        odg.d("LCMNN.DuplicateDetector", c() + " process result: " + i);
        List<Integer> arrayList = new ArrayList<>();
        if (i != null && i.containsKey("image_index")) {
            Object obj = i.get("image_index");
            if (obj instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj;
                if (arrayList2.size() > 0 && (arrayList2.get(0) instanceof Integer)) {
                    arrayList = (List) obj;
                }
            }
        }
        if (i == null) {
            z = false;
        }
        k(z);
        return arrayList;
    }
}
