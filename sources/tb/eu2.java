package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eu2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f18814a;
    public final boolean b;
    public final View c;

    public eu2(Class cls, float f, boolean z, View view) {
        this.f18814a = f;
        this.b = z;
        this.c = view;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6e2e55fd", new Object[]{this});
        }
        return this.c;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa4017b1", new Object[]{this})).floatValue();
        }
        return this.f18814a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37dce16f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
