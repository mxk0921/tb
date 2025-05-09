package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MotionEvent f20696a;

    static {
        t2o.a(912263008);
    }

    public hjx(MotionEvent motionEvent) {
        this.f20696a = motionEvent;
    }

    public static hjx g(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjx) ipChange.ipc$dispatch("3c643e7e", new Object[]{motionEvent});
        }
        try {
            return new x68(motionEvent);
        } catch (VerifyError unused) {
            return new hjx(motionEvent);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c8fafa6", new Object[]{this})).intValue();
        }
        return this.f20696a.getAction();
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue();
        }
        return this.f20696a.getX();
    }

    public float c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34782cca", new Object[]{this, new Integer(i)})).floatValue();
        }
        f(i);
        return b();
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue();
        }
        return this.f20696a.getY();
    }

    public float e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("362d0569", new Object[]{this, new Integer(i)})).floatValue();
        }
        f(i);
        return d();
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b465d46e", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            throw new IllegalArgumentException("Invalid pointer index for Donut/Cupcake");
        }
    }
}
