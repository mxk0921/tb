package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\r\u001a\u00020\u0002*\u00020\u0004H\u0086\b\u001a\r\u0010\u000e\u001a\u00020\u0004*\u00020\u0002H\u0086\b\u001a\r\u0010\u000f\u001a\u00020\u0002*\u00020\u0002H\u0086\n\u001a\r\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0086\n¨\u0006\u0010"}, d2 = {"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "div", "scalar", "minus", "p", "xy", "plus", Constants.KEY_TIMES, "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PointKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final int component1(Point point) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9066a1f1", new Object[]{point})).intValue() : point.x;
    }

    public static final int component2(Point point) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b9b68672", new Object[]{point})).intValue() : point.y;
    }

    public static final Point div(Point point, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("409bb1f4", new Object[]{point, new Float(f)}) : new Point(Math.round(point.x / f), Math.round(point.y / f));
    }

    public static final Point minus(Point point, Point point2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("6cc14a9c", new Object[]{point, point2});
        }
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    public static final Point plus(Point point, Point point2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("ec3a7732", new Object[]{point, point2});
        }
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    public static final Point times(Point point, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("2ad0b429", new Object[]{point, new Float(f)}) : new Point(Math.round(point.x * f), Math.round(point.y * f));
    }

    public static final Point toPoint(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("cb79252e", new Object[]{pointF});
        }
        return new Point((int) pointF.x, (int) pointF.y);
    }

    public static final PointF toPointF(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("77ad73f2", new Object[]{point});
        }
        return new PointF(point);
    }

    public static final Point unaryMinus(Point point) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("6802cdee", new Object[]{point}) : new Point(-point.x, -point.y);
    }

    public static final float component1(PointF pointF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c72dc3c", new Object[]{pointF})).floatValue() : pointF.x;
    }

    public static final float component2(PointF pointF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d1f87db", new Object[]{pointF})).floatValue() : pointF.y;
    }

    public static final PointF div(PointF pointF, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("ea1ff28", new Object[]{pointF, new Float(f)}) : new PointF(pointF.x / f, pointF.y / f);
    }

    public static final PointF times(PointF pointF, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("3f9f481d", new Object[]{pointF, new Float(f)}) : new PointF(pointF.x * f, pointF.y * f);
    }

    public static final PointF unaryMinus(PointF pointF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("6dbe1cf6", new Object[]{pointF}) : new PointF(-pointF.x, -pointF.y);
    }

    public static final PointF minus(PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("bb4cd64e", new Object[]{pointF, pointF2});
        }
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    public static final PointF plus(PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("f17859f8", new Object[]{pointF, pointF2});
        }
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    public static final Point minus(Point point, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("f45cadb0", new Object[]{point, new Integer(i)});
        }
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    public static final Point plus(Point point, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("aa2871da", new Object[]{point, new Integer(i)});
        }
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    public static final PointF minus(PointF pointF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("39fe5c7", new Object[]{pointF, new Float(f)});
        }
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    public static final PointF plus(PointF pointF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("758b4771", new Object[]{pointF, new Float(f)});
        }
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }
}
