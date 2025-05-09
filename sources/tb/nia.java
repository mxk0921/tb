package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nia {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f24750a;
    public final int[] b;

    public nia(float[] fArr, int[] iArr) {
        this.f24750a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.f24750a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(nia niaVar, nia niaVar2, float f) {
        int length = niaVar.b.length;
        int length2 = niaVar2.b.length;
        int[] iArr = niaVar.b;
        int[] iArr2 = niaVar2.b;
        if (length != length2) {
            zhh.b("Cannot interpolate between gradients. Lengths vary (" + iArr.length + " vs " + iArr2.length + f7l.BRACKET_END_STR);
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            this.f24750a[i] = uvi.k(niaVar.f24750a[i], niaVar2.f24750a[i], f);
            this.b[i] = p4a.c(f, iArr[i], iArr2[i]);
        }
    }
}
