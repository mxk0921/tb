package tb;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596240);
    }

    public static void a(View view, Canvas canvas) {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f980e9f", new Object[]{view, canvas});
        } else if (canvas != null && canvas.getWidth() > 0 && (fArr = (float[]) view.getTag(jn7.LAYOUT_RADII)) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            canvas.isHardwareAccelerated();
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, width, height), fArr, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }

    public static en7 c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (en7) ipChange.ipc$dispatch("12701eaf", new Object[]{view});
        }
        if (view == null) {
            return new en7();
        }
        Object tag = view.getTag(jn7.PROPERTY_KEY);
        if (tag == null) {
            return new en7();
        }
        return (en7) tag;
    }

    public static Pair<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("b54ad04d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(f7l.BRACKET_START_STR);
        int indexOf2 = str.indexOf(f7l.BRACKET_END_STR);
        if (indexOf < 0 || indexOf2 < 0) {
            if (tl7.f()) {
                ym7.e(tl7.TAG, "事件属性:" + str + "语法出错,没有包含\"（）\"");
            }
            return null;
        }
        String trim = str.trim();
        String substring = trim.substring(0, indexOf);
        String substring2 = trim.substring(indexOf + 1, indexOf2);
        if (!TextUtils.isEmpty(substring)) {
            return new Pair<>(substring, substring2);
        }
        return null;
    }
}
