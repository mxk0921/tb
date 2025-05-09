package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.Metadata;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u000b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000b\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u000f\u0010\t\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u000f\u0010\n\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0010\u0010\t\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0010\u0010\n\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0011\u0010\t\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0011\u0010\n\u001a7\u0010\u0018\u001a\u00020\u0016*\u00020\u00002!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "contains", "(Landroid/graphics/Region;Landroid/graphics/Point;)Z", "Landroid/graphics/Rect;", "r", "plus", "(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;", "minus", "unaryMinus", "(Landroid/graphics/Region;)Landroid/graphics/Region;", "not", "or", "and", "xor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rect", "Ltb/xhv;", "action", pg1.ATOM_EXT_forEach, "(Landroid/graphics/Region;Ltb/g1a;)V", "", pg1.ATOM_EXT_iterator, "(Landroid/graphics/Region;)Ljava/util/Iterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RegionKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Region and(Region region, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("4d312cc7", new Object[]{region, rect});
        }
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(Region region, Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb0428a", new Object[]{region, point})).booleanValue();
        }
        return region.contains(point.x, point.y);
    }

    public static final void forEach(Region region, g1a<? super Rect, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13320b3e", new Object[]{region, g1aVar});
            return;
        }
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (regionIterator.next(rect)) {
                g1aVar.invoke(rect);
            } else {
                return;
            }
        }
    }

    public static final Iterator<Rect> iterator(Region region) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("f470c903", new Object[]{region});
        }
        return new RegionKt$iterator$1(region);
    }

    public static final Region minus(Region region, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("1e5b5e0", new Object[]{region, rect});
        }
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region not(Region region) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("2c8fa268", new Object[]{region});
        }
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region or(Region region, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("baffaed3", new Object[]{region, rect});
        }
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region plus(Region region, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("71921c0a", new Object[]{region, rect});
        }
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region unaryMinus(Region region) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("1511597a", new Object[]{region});
        }
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region xor(Region region, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("1629bd4b", new Object[]{region, rect});
        }
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    public static final Region and(Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("688b3337", new Object[]{region, region2});
        }
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final Region minus(Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("c241da10", new Object[]{region, region2});
        }
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    public static final Region or(Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("9cc16243", new Object[]{region, region2});
        }
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region plus(Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("f86d5dba", new Object[]{region, region2});
        }
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region xor(Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("d5a1b2bb", new Object[]{region, region2});
        }
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
