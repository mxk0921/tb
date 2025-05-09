package androidx.core.graphics;

import android.graphics.Path;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PathParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGTAG = "PathParser";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ExtractFloatResult {
        public int mEndPosition;
        public boolean mEndWithNegOrDot;
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb1268", new Object[]{arrayList, new Character(c), fArr});
        } else {
            arrayList.add(new PathDataNode(c, fArr));
        }
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bd7fb83", new Object[]{pathDataNodeArr, pathDataNodeArr2})).booleanValue();
        }
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (!(PathDataNode.access$000(pathDataNodeArr[i]) == PathDataNode.access$000(pathDataNodeArr2[i]) && PathDataNode.access$100(pathDataNodeArr[i]).length == PathDataNode.access$100(pathDataNodeArr2[i]).length)) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("c2f1635e", new Object[]{fArr, new Integer(i), new Integer(i2)});
        }
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathDataNode[]) ipChange.ipc$dispatch("bbb610fc", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int nextStart = nextStart(str, i);
            String trim = str.substring(i2, nextStart).trim();
            if (!trim.isEmpty()) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i2 = nextStart;
            i = nextStart + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("77a04d13", new Object[]{str});
        }
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathDataNode[]) ipChange.ipc$dispatch("b234be33", new Object[]{pathDataNodeArr});
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[LOOP:0: B:7:0x0023->B:26:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.core.graphics.PathParser.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r8
            r9[r1] = r3
            r8 = 2
            r9[r8] = r10
            java.lang.String r8 = "3acc4fc2"
            r2.ipc$dispatch(r8, r9)
            return
        L_0x001d:
            r10.mEndWithNegOrDot = r0
            r2 = r9
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0023:
            int r6 = r8.length()
            if (r2 >= r6) goto L_0x0056
            char r6 = r8.charAt(r2)
            r7 = 32
            if (r6 == r7) goto L_0x0044
            r7 = 69
            if (r6 == r7) goto L_0x0050
            r7 = 101(0x65, float:1.42E-43)
            if (r6 == r7) goto L_0x0050
            switch(r6) {
                case 44: goto L_0x0044;
                case 45: goto L_0x0047;
                case 46: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004e
        L_0x003d:
            if (r4 != 0) goto L_0x0042
            r3 = 0
            r4 = 1
            goto L_0x0051
        L_0x0042:
            r10.mEndWithNegOrDot = r1
        L_0x0044:
            r3 = 0
            r5 = 1
            goto L_0x0051
        L_0x0047:
            if (r2 == r9) goto L_0x004e
            if (r3 != 0) goto L_0x004e
            r10.mEndWithNegOrDot = r1
            goto L_0x0044
        L_0x004e:
            r3 = 0
            goto L_0x0051
        L_0x0050:
            r3 = 1
        L_0x0051:
            if (r5 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            int r2 = r2 + r1
            goto L_0x0023
        L_0x0056:
            r10.mEndPosition = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5514bb", new Object[]{pathDataNodeArr, new Float(f), pathDataNodeArr2, pathDataNodeArr3});
        } else if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int nextStart(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0537c76", new Object[]{str, new Integer(i)})).intValue();
        }
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964f06e3", new Object[]{pathDataNodeArr, path});
            return;
        }
        float[] fArr = new float[6];
        char c = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.access$200(path, fArr, c, PathDataNode.access$000(pathDataNode), PathDataNode.access$100(pathDataNode));
            c = PathDataNode.access$000(pathDataNode);
        }
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade9bcf", new Object[]{pathDataNodeArr, pathDataNodeArr2});
            return;
        }
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            PathDataNode.access$002(pathDataNodeArr[i], PathDataNode.access$000(pathDataNodeArr2[i]));
            for (int i2 = 0; i2 < PathDataNode.access$100(pathDataNodeArr2[i]).length; i2++) {
                PathDataNode.access$100(pathDataNodeArr[i])[i2] = PathDataNode.access$100(pathDataNodeArr2[i])[i2];
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PathDataNode {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final float[] mParams;
        private char mType;

        public PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        public static /* synthetic */ char access$000(PathDataNode pathDataNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Character) ipChange.ipc$dispatch("b787a75c", new Object[]{pathDataNode})).charValue();
            }
            return pathDataNode.mType;
        }

        public static /* synthetic */ char access$002(PathDataNode pathDataNode, char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Character) ipChange.ipc$dispatch("6da4a019", new Object[]{pathDataNode, new Character(c)})).charValue();
            }
            pathDataNode.mType = c;
            return c;
        }

        public static /* synthetic */ float[] access$100(PathDataNode pathDataNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("3aa39a31", new Object[]{pathDataNode});
            }
            return pathDataNode.mParams;
        }

        public static /* synthetic */ void access$200(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2788ed15", new Object[]{path, fArr, new Character(c), new Character(c2), fArr2});
            } else {
                addCommand(path, fArr, c, c2, fArr2);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("309b71d", new Object[]{path, fArr, new Character(c), new Character(c3), fArr2});
                return;
            }
            char c4 = c;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c3 == 'A') {
                    i2 = i3;
                    int i4 = i2 + 5;
                    float f19 = fArr2[i4];
                    int i5 = i2 + 6;
                    float f20 = fArr2[i5];
                    float f21 = fArr2[i2];
                    float f22 = fArr2[i2 + 1];
                    float f23 = fArr2[i2 + 2];
                    if (fArr2[i2 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i2 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    drawArc(path, f15, f16, f19, f20, f21, f22, f23, z, z2);
                    f15 = fArr2[i4];
                    f16 = fArr2[i5];
                    f12 = f16;
                    f11 = f15;
                } else if (c3 == 'C') {
                    i2 = i3;
                    int i6 = i2 + 2;
                    int i7 = i2 + 3;
                    int i8 = i2 + 4;
                    int i9 = i2 + 5;
                    path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    float f24 = fArr2[i8];
                    float f25 = fArr2[i9];
                    float f26 = fArr2[i6];
                    float f27 = fArr2[i7];
                    f15 = f24;
                    f16 = f25;
                    f12 = f27;
                    f11 = f26;
                } else if (c3 == 'H') {
                    i2 = i3;
                    path.lineTo(fArr2[i2], f16);
                    f15 = fArr2[i2];
                } else if (c3 == 'Q') {
                    i2 = i3;
                    int i10 = i2 + 1;
                    int i11 = i2 + 2;
                    int i12 = i2 + 3;
                    path.quadTo(fArr2[i2], fArr2[i10], fArr2[i11], fArr2[i12]);
                    float f28 = fArr2[i2];
                    float f29 = fArr2[i10];
                    f15 = fArr2[i11];
                    f16 = fArr2[i12];
                    f11 = f28;
                    f12 = f29;
                } else if (c3 == 'V') {
                    i2 = i3;
                    path.lineTo(f15, fArr2[i2]);
                    f16 = fArr2[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        i2 = i3;
                        int i13 = i2 + 2;
                        int i14 = i2 + 3;
                        int i15 = i2 + 4;
                        int i16 = i2 + 5;
                        path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        f = fArr2[i13] + f15;
                        f2 = fArr2[i14] + f16;
                        f15 += fArr2[i15];
                        f3 = fArr2[i16];
                    } else if (c3 == 'h') {
                        i2 = i3;
                        path.rLineTo(fArr2[i2], 0.0f);
                        f15 += fArr2[i2];
                    } else if (c3 != 'q') {
                        if (c3 == 'v') {
                            i2 = i3;
                            path.rLineTo(0.0f, fArr2[i2]);
                            f4 = fArr2[i2];
                        } else if (c3 == 'L') {
                            i2 = i3;
                            int i17 = i2 + 1;
                            path.lineTo(fArr2[i2], fArr2[i17]);
                            f15 = fArr2[i2];
                            f16 = fArr2[i17];
                        } else if (c3 == 'M') {
                            i2 = i3;
                            f15 = fArr2[i2];
                            f16 = fArr2[i2 + 1];
                            if (i2 > 0) {
                                path.lineTo(f15, f16);
                            } else {
                                path.moveTo(f15, f16);
                                f18 = f16;
                                f17 = f15;
                            }
                        } else if (c3 == 'S') {
                            i2 = i3;
                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                f15 = (f15 * 2.0f) - f11;
                                f16 = (f16 * 2.0f) - f12;
                            }
                            int i18 = i2 + 1;
                            int i19 = i2 + 2;
                            int i20 = i2 + 3;
                            path.cubicTo(f15, f16, fArr2[i2], fArr2[i18], fArr2[i19], fArr2[i20]);
                            f = fArr2[i2];
                            f2 = fArr2[i18];
                            f15 = fArr2[i19];
                            f16 = fArr2[i20];
                            f11 = f;
                            f12 = f2;
                        } else if (c3 == 'T') {
                            i2 = i3;
                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                f15 = (f15 * 2.0f) - f11;
                                f16 = (f16 * 2.0f) - f12;
                            }
                            int i21 = i2 + 1;
                            path.quadTo(f15, f16, fArr2[i2], fArr2[i21]);
                            f12 = f16;
                            f11 = f15;
                            f15 = fArr2[i2];
                            f16 = fArr2[i21];
                        } else if (c3 == 'l') {
                            i2 = i3;
                            int i22 = i2 + 1;
                            path.rLineTo(fArr2[i2], fArr2[i22]);
                            f15 += fArr2[i2];
                            f4 = fArr2[i22];
                        } else if (c3 == 'm') {
                            i2 = i3;
                            float f30 = fArr2[i2];
                            f15 += f30;
                            float f31 = fArr2[i2 + 1];
                            f16 += f31;
                            if (i2 > 0) {
                                path.rLineTo(f30, f31);
                            } else {
                                path.rMoveTo(f30, f31);
                                f18 = f16;
                                f17 = f15;
                            }
                        } else if (c3 != 's') {
                            if (c3 == 't') {
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f7 = f15 - f11;
                                    f8 = f16 - f12;
                                } else {
                                    f8 = 0.0f;
                                    f7 = 0.0f;
                                }
                                int i23 = i3 + 1;
                                path.rQuadTo(f7, f8, fArr2[i3], fArr2[i23]);
                                float f32 = f7 + f15;
                                float f33 = f8 + f16;
                                f15 += fArr2[i3];
                                f16 += fArr2[i23];
                                f12 = f33;
                                f11 = f32;
                            }
                            i2 = i3;
                        } else {
                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                f5 = f16 - f12;
                                f6 = f15 - f11;
                            } else {
                                f6 = 0.0f;
                                f5 = 0.0f;
                            }
                            int i24 = i3 + 1;
                            int i25 = i3 + 2;
                            int i26 = i3 + 3;
                            i2 = i3;
                            path.rCubicTo(f6, f5, fArr2[i3], fArr2[i24], fArr2[i25], fArr2[i26]);
                            f = fArr2[i2] + f15;
                            f2 = fArr2[i24] + f16;
                            f15 += fArr2[i25];
                            f3 = fArr2[i26];
                        }
                        f16 += f4;
                    } else {
                        i2 = i3;
                        int i27 = i2 + 1;
                        int i28 = i2 + 2;
                        int i29 = i2 + 3;
                        path.rQuadTo(fArr2[i2], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f = fArr2[i2] + f15;
                        f2 = fArr2[i27] + f16;
                        f15 += fArr2[i28];
                        f3 = fArr2[i29];
                    }
                    f16 += f3;
                    f11 = f;
                    f12 = f2;
                } else {
                    i2 = i3;
                    int i30 = i2 + 5;
                    float f34 = fArr2[i30] + f15;
                    int i31 = i2 + 6;
                    float f35 = fArr2[i31] + f16;
                    float f36 = fArr2[i2];
                    float f37 = fArr2[i2 + 1];
                    float f38 = fArr2[i2 + 2];
                    if (fArr2[i2 + 3] != 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (fArr2[i2 + 4] != 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    drawArc(path, f15, f16, f34, f35, f36, f37, f38, z3, z4);
                    f15 += fArr2[i30];
                    f16 += fArr2[i31];
                    f12 = f16;
                    f11 = f15;
                }
                i3 = i2 + i;
                c4 = c2;
                c3 = c4;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d;
            double d11 = d2;
            double d12 = d3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940efbb9", new Object[]{path, new Double(d10), new Double(d11), new Double(d12), new Double(d4), new Double(d5), new Double(d6), new Double(d7), new Double(d8), new Double(d9)});
                return;
            }
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d13 = -d12;
            double d14 = d13 * cos;
            double d15 = d4 * sin;
            double d16 = d13 * sin;
            double d17 = d4 * cos;
            double d18 = d9 / ceil;
            double d19 = d5;
            double d20 = (sin2 * d16) + (cos2 * d17);
            double d21 = (d14 * sin2) - (d15 * cos2);
            int i = 0;
            double d22 = d6;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d10 + ((d12 * cos) * cos3)) - (d15 * sin3);
                double d26 = d11 + (d12 * sin * cos3) + (d17 * sin3);
                double d27 = (d14 * sin3) - (d15 * cos3);
                double d28 = (sin3 * d16) + (cos3 * d17);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d19 + (d21 * sin4)), (float) (d22 + (d20 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                d18 = d18;
                d19 = d25;
                i++;
                d16 = d16;
                d17 = d17;
                d23 = d24;
                d20 = d28;
                d21 = d27;
                d12 = d3;
                d22 = d26;
                d10 = d;
                d11 = d2;
            }
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("964f06e3", new Object[]{pathDataNodeArr, path});
            } else {
                PathParser.nodesToPath(pathDataNodeArr, path);
            }
        }

        public float[] getParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("3d635e3e", new Object[]{this});
            }
            return this.mParams;
        }

        public char getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Character) ipChange.ipc$dispatch("53782424", new Object[]{this})).charValue();
            }
            return this.mType;
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64c65b7", new Object[]{this, pathDataNode, pathDataNode2, new Float(f)});
                return;
            }
            this.mType = pathDataNode.mType;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i < fArr.length) {
                    this.mParams[i] = (fArr[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3556c7d", new Object[]{path, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Boolean(z), new Boolean(z2)});
                return;
            }
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d3 * cos) + (d4 * sin)) / d5;
            double d7 = f6;
            double d8 = (((-f) * sin) + (d4 * cos)) / d7;
            double d9 = f4;
            double d10 = ((f3 * cos) + (d9 * sin)) / d5;
            double d11 = (((-f3) * sin) + (d9 * cos)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d12 * d12) + (d13 * d13);
            if (d16 != vu3.b.GEO_NOT_SUPPORT) {
                double d17 = (1.0d / d16) - 0.25d;
                if (d17 < vu3.b.GEO_NOT_SUPPORT) {
                    new StringBuilder("Points are too far apart ").append(d16);
                    float sqrt = (float) (Math.sqrt(d16) / 1.99999d);
                    drawArc(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                    return;
                }
                double sqrt2 = Math.sqrt(d17);
                double d18 = d12 * sqrt2;
                double d19 = sqrt2 * d13;
                if (z == z2) {
                    d2 = d14 - d19;
                    d = d15 + d18;
                } else {
                    d2 = d14 + d19;
                    d = d15 - d18;
                }
                double atan2 = Math.atan2(d8 - d, d6 - d2);
                double atan22 = Math.atan2(d11 - d, d10 - d2) - atan2;
                int i = (atan22 > vu3.b.GEO_NOT_SUPPORT ? 1 : (atan22 == vu3.b.GEO_NOT_SUPPORT ? 0 : -1));
                if (z2 != (i >= 0)) {
                    atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                }
                double d20 = d2 * d5;
                double d21 = d * d7;
                arcToBezier(path, (d20 * cos) - (d21 * sin), (d20 * sin) + (d21 * cos), d5, d7, d3, d4, radians, atan2, atan22);
            }
        }
    }

    private static float[] getFloats(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ea26fd43", new Object[]{str});
        }
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    i2++;
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6643797f", new Object[]{pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, new Float(f)})).booleanValue();
        }
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        } else if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        } else {
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
            }
            return true;
        }
    }
}
