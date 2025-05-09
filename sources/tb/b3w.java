package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b3w implements Comparable<b3w> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f16166a;

    static {
        t2o.a(626000054);
    }

    public b3w(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Version can not be null");
        } else if (str.matches("[0-9]+(\\.[0-9]+)*")) {
            this.f16166a = str;
        } else {
            throw new IllegalArgumentException("Invalid version format");
        }
    }

    /* renamed from: a */
    public int compareTo(b3w b3wVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8adec7a3", new Object[]{this, b3wVar})).intValue();
        }
        if (b3wVar == null) {
            return 1;
        }
        String[] split = b().split("\\.");
        String[] split2 = b3wVar.b().split("\\.");
        int max = Math.max(split.length, split2.length);
        for (int i3 = 0; i3 < max; i3++) {
            if (i3 < split.length) {
                i = Integer.parseInt(split[i3]);
            } else {
                i = 0;
            }
            if (i3 < split2.length) {
                i2 = Integer.parseInt(split2[i3]);
            } else {
                i2 = 0;
            }
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
        }
        return 0;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5615b163", new Object[]{this});
        }
        return this.f16166a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && compareTo((b3w) obj) == 0) {
            return true;
        }
        return false;
    }
}
