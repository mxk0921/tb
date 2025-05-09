package tb;

import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zli implements bul, wja {

    /* renamed from: a  reason: collision with root package name */
    public final Path f32848a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final List<bul> d = new ArrayList();
    public final MergePaths e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32849a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f32849a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32849a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32849a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32849a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32849a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public zli(MergePaths mergePaths) {
        mergePaths.c();
        this.e = mergePaths;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.d;
            if (i < arrayList.size()) {
                this.c.addPath(((bul) arrayList.get(i)).getPath());
                i++;
            } else {
                return;
            }
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.d;
            if (i < arrayList.size()) {
                ((bul) arrayList.get(i)).c(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    public final void d(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.f32848a;
        path2.reset();
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            bul bulVar = (bul) arrayList.get(size);
            if (bulVar instanceof xo4) {
                xo4 xo4Var = (xo4) bulVar;
                List<bul> j = xo4Var.j();
                for (int size2 = j.size() - 1; size2 >= 0; size2--) {
                    Path path3 = j.get(size2).getPath();
                    path3.transform(xo4Var.k());
                    path.addPath(path3);
                }
            } else {
                path.addPath(bulVar.getPath());
            }
        }
        bul bulVar2 = (bul) arrayList.get(0);
        if (bulVar2 instanceof xo4) {
            xo4 xo4Var2 = (xo4) bulVar2;
            List<bul> j2 = xo4Var2.j();
            for (int i = 0; i < j2.size(); i++) {
                Path path4 = j2.get(i).getPath();
                path4.transform(xo4Var2.k());
                path2.addPath(path4);
            }
        } else {
            path2.set(bulVar2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // tb.wja
    public void f(ListIterator<fo4> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            fo4 previous = listIterator.previous();
            if (previous instanceof bul) {
                ((ArrayList) this.d).add((bul) previous);
                listIterator.remove();
            }
        }
    }

    @Override // tb.bul
    public Path getPath() {
        Path path = this.c;
        path.reset();
        MergePaths mergePaths = this.e;
        if (mergePaths.d()) {
            return path;
        }
        int i = a.f32849a[mergePaths.b().ordinal()];
        if (i == 1) {
            a();
        } else if (i == 2) {
            d(Path.Op.UNION);
        } else if (i == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            d(Path.Op.INTERSECT);
        } else if (i == 5) {
            d(Path.Op.XOR);
        }
        return path;
    }
}
