package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32945a;
    public final String b;
    public final fr8 c;
    public final String d;
    public final String e;
    public final Map<String, Object> f;

    static {
        t2o.a(87031857);
    }

    public zq8(String str, String str2, fr8 fr8Var, String str3, String str4, Map<String, Object> map) {
        this.f32945a = str;
        this.b = str2;
        this.c = fr8Var;
        this.d = str3;
        this.e = str4;
        if (map == null) {
            this.f = Collections.emptyMap();
        } else {
            this.f = map;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || zq8.class != obj.getClass()) {
            return false;
        }
        zq8 zq8Var = (zq8) obj;
        String str = this.f32945a;
        if (str == null ? zq8Var.f32945a != null : !str.equals(zq8Var.f32945a)) {
            return false;
        }
        fr8 fr8Var = this.c;
        if (fr8Var == null ? zq8Var.c != null : !fr8Var.equals(zq8Var.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? zq8Var.d != null : !str2.equals(zq8Var.d)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null ? zq8Var.e != null : !str3.equals(zq8Var.e)) {
            return false;
        }
        Map<String, Object> map = this.f;
        Map<String, Object> map2 = zq8Var.f;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f32945a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        fr8 fr8Var = this.c;
        if (fr8Var != null) {
            i2 = fr8Var.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Map<String, Object> map = this.f;
        if (map != null) {
            i5 = map.hashCode();
        }
        return i9 + i5;
    }
}
