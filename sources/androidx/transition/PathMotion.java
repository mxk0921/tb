package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class PathMotion {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PathMotion() {
    }

    public abstract Path getPath(float f, float f2, float f3, float f4);

    public PathMotion(Context context, AttributeSet attributeSet) {
    }
}
