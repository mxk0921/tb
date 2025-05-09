package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PathUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static float[] approximate(Path path, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("20c3269e", new Object[]{path, new Float(f)});
            }
            return path.approximate(f);
        }
    }

    private PathUtils() {
    }

    public static Collection<PathSegment> flatten(Path path) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("bb1c4b1a", new Object[]{path}) : flatten(path, 0.5f);
    }

    public static Collection<PathSegment> flatten(Path path, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("b01be914", new Object[]{path, new Float(f)});
        }
        float[] approximate = Api26Impl.approximate(path, f);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = approximate[i2];
            float f3 = approximate[i2 + 1];
            float f4 = approximate[i2 + 2];
            float f5 = approximate[i3];
            float f6 = approximate[i3 + 1];
            float f7 = approximate[i3 + 2];
            if (!(f2 == f5 || (f3 == f6 && f4 == f7))) {
                arrayList.add(new PathSegment(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
