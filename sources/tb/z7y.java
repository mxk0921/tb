package tb;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z7y {

    /* renamed from: a  reason: collision with root package name */
    public final String f32597a;
    public final int b;

    public z7y(String str) {
        this.f32597a = str;
        this.b = a(str);
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static z7y b(String str) {
        return new z7y(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7y.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f32597a, ((z7y) obj).f32597a);
    }

    public final int hashCode() {
        return this.b;
    }
}
