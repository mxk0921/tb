package tb;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;
import okio.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a8l extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final ByteString[] f15597a;
    public final int[] b;

    public a8l(ByteString[] byteStringArr, int[] iArr) {
        this.f15597a = byteStringArr;
        this.b = iArr;
    }

    public static void a(long j, a aVar, int i, List<ByteString> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 < i3) {
            for (int i8 = i2; i8 < i3; i8++) {
                if (list.get(i8).size() < i) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            if (i == byteString.size()) {
                i5 = list2.get(i2).intValue();
                int i9 = i2 + 1;
                byteString = list.get(i9);
                i4 = i9;
            } else {
                i5 = -1;
                i4 = i2;
            }
            if (byteString.getByte(i) != byteString2.getByte(i)) {
                int i10 = 1;
                for (int i11 = i4 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).getByte(i) != list.get(i11).getByte(i)) {
                        i10++;
                    }
                }
                long c = j + c(aVar) + 2 + (i10 * 2);
                aVar.E0(i10);
                aVar.E0(i5);
                for (int i12 = i4; i12 < i3; i12++) {
                    byte b = list.get(i12).getByte(i);
                    if (i12 == i4 || b != list.get(i12 - 1).getByte(i)) {
                        aVar.E0(b & 255);
                    }
                }
                a aVar2 = new a();
                int i13 = i4;
                while (i13 < i3) {
                    byte b2 = list.get(i13).getByte(i);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i7 = i3;
                            break;
                        } else if (b2 != list.get(i15).getByte(i)) {
                            i7 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i14 == i7 && i + 1 == list.get(i13).size()) {
                        aVar.E0(list2.get(i13).intValue());
                        i13 = i7;
                        aVar2 = aVar2;
                    } else {
                        aVar.E0((int) ((c(aVar2) + c) * (-1)));
                        i13 = i7;
                        aVar2 = aVar2;
                        a(c, aVar2, i + 1, list, i13, i7, list2);
                    }
                }
                aVar.y0(aVar2, aVar2.f0());
                return;
            }
            int min = Math.min(byteString.size(), byteString2.size());
            int i16 = 0;
            for (int i17 = i; i17 < min && byteString.getByte(i17) == byteString2.getByte(i17); i17++) {
                i16++;
            }
            long c2 = 1 + j + c(aVar) + 2 + i16;
            aVar.E0(-i16);
            aVar.E0(i5);
            int i18 = i;
            while (true) {
                i6 = i + i16;
                if (i18 >= i6) {
                    break;
                }
                aVar.E0(byteString.getByte(i18) & 255);
                i18++;
            }
            if (i4 + 1 != i3) {
                a aVar3 = new a();
                aVar.E0((int) ((c(aVar3) + c2) * (-1)));
                a(c2, aVar3, i6, list, i4, i3, list2);
                aVar.y0(aVar3, aVar3.f0());
            } else if (i6 == list.get(i4).size()) {
                aVar.E0(list2.get(i4).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static int c(a aVar) {
        return (int) (aVar.f0() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.a8l d(okio.ByteString... r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.a8l.d(okio.ByteString[]):tb.a8l");
    }

    /* renamed from: b */
    public ByteString get(int i) {
        return this.f15597a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15597a.length;
    }
}
