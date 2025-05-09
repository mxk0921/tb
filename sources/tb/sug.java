package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a<T> {
        void a(T t);
    }

    static {
        t2o.a(511705626);
    }

    public static <T> void a(List<T> list, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5da18ea", new Object[]{list, aVar});
        } else if (list != null && list.size() > 0 && aVar != null) {
            for (T t : list) {
                aVar.a(t);
            }
        }
    }

    public static <T> void b(List<T> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d96c9e", new Object[]{list, new Integer(i), new Integer(i2)});
        } else if (list != null && list.size() > 1 && list.size() > i && list.size() > i2) {
            T t = list.get(i);
            list.remove(i);
            list.add(i2, t);
        }
    }

    public static String c(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c525313c", new Object[]{list});
        }
        if (list == null || list.size() <= 0) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        return "[" + TextUtils.join(",", list) + "]";
    }
}
