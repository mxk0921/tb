package com.taobao.taobao.scancode.huoyan.object;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class KakaLibImageWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SCAN_FROM = "unknown";

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12945a;
    public int b;
    public int c;
    public final int d;
    public WeakReference e;
    public String f;
    public Rect g;
    public Rect h = null;
    public YuvImage i;
    public Bitmap j;
    public final String k;
    public MaType[] l;
    public final String m;

    static {
        t2o.a(760217759);
    }

    public KakaLibImageWrapper(byte[] bArr, int i, int i2, int i3, String str) {
        this.f12945a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.m = str;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e4df54", new Object[]{this});
        }
        return this.j;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3ee615c9", new Object[]{this});
        }
        WeakReference weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fe8c7cf", new Object[]{this});
        }
        return this.k;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e23c59d2", new Object[]{this});
        }
        return this.f;
    }

    public MaType[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaType[]) ipChange.ipc$dispatch("a87b0da8", new Object[]{this});
        }
        return this.l;
    }

    public byte[] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("25ccfefa", new Object[]{this});
        }
        return this.f12945a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9f83ddc", new Object[]{this});
        }
        return this.m;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public YuvImage j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvImage) ipChange.ipc$dispatch("9e662b73", new Object[]{this});
        }
        if (this.i == null && this.f12945a != null && this.d > 0 && this.b > 0 && this.c > 0) {
            this.i = new YuvImage(this.f12945a, this.d, this.b, this.c, null);
        }
        return this.i;
    }

    public void k(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2a15ec", new Object[]{this, bitmap});
        } else {
            this.j = bitmap;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22209f8b", new Object[]{this, context});
        } else {
            this.e = new WeakReference(context);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02c3ae4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void o(MaType[] maTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69cc872", new Object[]{this, maTypeArr});
        } else {
            this.l = maTypeArr;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public KakaLibImageWrapper(Bitmap bitmap, String str) {
        this.j = bitmap;
        this.m = str;
    }

    public KakaLibImageWrapper(String str, String str2) {
        this.k = str;
        this.m = str2;
    }
}
