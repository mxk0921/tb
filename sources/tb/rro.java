package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rro {

    /* renamed from: a  reason: collision with root package name */
    public float f27571a;
    public float b;

    public rro(float f, float f2) {
        this.f27571a = f;
        this.b = f2;
    }

    public boolean a(float f, float f2) {
        if (this.f27571a == f && this.b == f2) {
            return true;
        }
        return false;
    }

    public float b() {
        return this.f27571a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f, float f2) {
        this.f27571a = f;
        this.b = f2;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public rro() {
        this(1.0f, 1.0f);
    }
}
