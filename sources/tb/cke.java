package tb;

import android.graphics.RectF;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297604);
    }

    public static RectF a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("321e5432", new Object[]{str});
        }
        List parseArray = JSON.parseArray(str, Float.class);
        if (parseArray == null || parseArray.size() != 4) {
            return null;
        }
        return new RectF(((Float) parseArray.get(0)).floatValue(), ((Float) parseArray.get(1)).floatValue(), ((Float) parseArray.get(2)).floatValue(), ((Float) parseArray.get(3)).floatValue());
    }
}
