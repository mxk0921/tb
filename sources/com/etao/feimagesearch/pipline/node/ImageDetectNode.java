package com.etao.feimagesearch.pipline.node;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import tb.a07;
import tb.bym;
import tb.ckf;
import tb.eyw;
import tb.fre;
import tb.lg4;
import tb.pmf;
import tb.t2o;
import tb.w7m;
import tb.wxi;
import tb.x7m;
import tb.yy1;
import tb.z7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageDetectNode extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean d;
    public final boolean e;
    public Future<Map<String, String>> f;
    public Future<Map<String, String>> g;
    public int h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a<V> implements Callable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f4851a;

        public a(Bitmap bitmap) {
            this.f4851a = bitmap;
        }

        /* renamed from: a */
        public final Map<String, String> call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fa597d5a", new Object[]{this});
            }
            String a2 = eyw.a(this.f4851a);
            if (a2 == null) {
                a2 = "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (a2.length() > 0) {
                if (a2.length() > 6144) {
                    a2 = a2.substring(0, 6144);
                    ckf.f(a2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                linkedHashMap.put("videoWatermark", a2);
                linkedHashMap.put("watermark", "true");
            }
            return linkedHashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b<V> implements Callable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f4852a;

        public b(Bitmap bitmap) {
            this.f4852a = bitmap;
        }

        /* renamed from: a */
        public final Map<String, String> call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fa597d5a", new Object[]{this});
            }
            boolean b = eyw.b(this.f4852a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("watermark", String.valueOf(b));
            linkedHashMap.put(wxi.KEY_FROM_OUTER_APP, "true");
            return linkedHashMap;
        }
    }

    static {
        t2o.a(481297352);
    }

    public /* synthetic */ ImageDetectNode(boolean z, boolean z2, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ Object ipc$super(ImageDetectNode imageDetectNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageDetectNode");
    }

    public static final /* synthetic */ Future o(ImageDetectNode imageDetectNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("70f52099", new Object[]{imageDetectNode});
        }
        return imageDetectNode.g;
    }

    public static final /* synthetic */ Future p(ImageDetectNode imageDetectNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("bf06e12a", new Object[]{imageDetectNode});
        }
        return imageDetectNode.f;
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageDetect";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        Bitmap m = w7mVar.m();
        if (m == null) {
            m(-8, "需要检测的图片资源不存在");
            if (w7mVar.v()) {
                return f(null);
            }
            return yy1.e(this, -8, "需要检测的图片资源不存在", false, 4, null);
        }
        this.f = s(m);
        this.g = r(m);
        if (this.h != 0) {
            return t(w7mVar);
        }
        n();
        return f(null);
    }

    public final bym q(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bym) ipChange.ipc$dispatch("f1c95ff3", new Object[]{this, w7mVar});
        }
        return new bym(j(), new ImageDetectNode$assembleHoldEvent$event$1(this, w7mVar));
    }

    public final Future<Map<String, String>> r(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("e7f3e5a9", new Object[]{this, bitmap});
        }
        if (!this.e || !lg4.V3()) {
            return null;
        }
        this.h++;
        return z7m.a(new a(bitmap));
    }

    public final Future<Map<String, String>> s(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("89aaf95e", new Object[]{this, bitmap});
        }
        if (!this.d || !lg4.G4()) {
            return null;
        }
        this.h++;
        return z7m.a(new b(bitmap));
    }

    public final x7m t(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("6d1c22fd", new Object[]{this, w7mVar});
        }
        fre freVar = new fre();
        if (this.f == null && this.g == null) {
            a("watermarkTime", "-1");
            a("videoWatermarkTime", "-1");
            n();
            pmf.l0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
            return f(freVar);
        }
        pmf.l0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
        return q(w7mVar);
    }

    public ImageDetectNode(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
