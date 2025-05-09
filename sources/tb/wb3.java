package tb;

import android.graphics.Point;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f30577a;
    public String b;
    public String c;
    public String d = "up";
    public Point e;

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c99627", new Object[]{this});
        }
        return this.c;
    }

    public final Point b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("f2cabe4d", new Object[]{this});
        }
        Point point = this.e;
        if (point != null) {
            return point;
        }
        ckf.y("anchorPoint");
        throw null;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de293c48", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        ckf.y("cartId");
        throw null;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("944a0e98", new Object[]{this})).floatValue();
        }
        return this.f30577a;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79d83dd0", new Object[]{this});
        }
        return this.d;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3aea2f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void g(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c2fbc3", new Object[]{this, point});
            return;
        }
        ckf.g(point, "<set-?>");
        this.e = point;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a83a2e", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.b = str;
    }

    public final void i(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f4c324", new Object[]{this, new Float(f)});
        } else {
            this.f30577a = f;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436d380e", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.d = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("CartJoinGroupModel(delaySecond=");
        sb.append(this.f30577a);
        sb.append(", cartId=");
        String str = this.b;
        if (str != null) {
            sb.append(str);
            sb.append(", addToGroupExParams=");
            sb.append(this.c);
            sb.append(", direction='");
            sb.append(this.d);
            sb.append("', anchorPoint=");
            Point point = this.e;
            if (point != null) {
                sb.append(point);
                sb.append(')');
                return sb.toString();
            }
            ckf.y("anchorPoint");
            throw null;
        }
        ckf.y("cartId");
        throw null;
    }
}
