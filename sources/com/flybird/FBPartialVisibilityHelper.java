package com.flybird;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.WeakHashMap;
import tb.pgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBPartialVisibilityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FBDocument f4952a;
    public final int b;
    public WeakHashMap<FBView, NodeVisibility> c;
    public long d = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class CalculateVisibilityChangeRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f4954a;

        public CalculateVisibilityChangeRunnable(long j) {
            this.f4954a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            FBPartialVisibilityHelper fBPartialVisibilityHelper = FBPartialVisibilityHelper.this;
            long j = fBPartialVisibilityHelper.d;
            if (j > this.f4954a) {
                this.f4954a = elapsedRealtime;
                fBPartialVisibilityHelper.f4952a.b0.postDelayed(this, (int) ((elapsedRealtime - j) + 100));
                return;
            }
            fBPartialVisibilityHelper.d = 0L;
            synchronized (fBPartialVisibilityHelper) {
                WeakHashMap<FBView, NodeVisibility> weakHashMap = fBPartialVisibilityHelper.c;
                if (weakHashMap != null) {
                    try {
                        for (Map.Entry<FBView, NodeVisibility> entry : weakHashMap.entrySet()) {
                            fBPartialVisibilityHelper.a(entry.getKey(), entry.getValue());
                        }
                    } catch (ConcurrentModificationException e) {
                        pgh.g("concurrent modification while calculate visibility change", e);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum NodeVisibility {
        TOTAL_VISIBLE,
        TOTAL_INVISIBLE,
        PARTIAL_VISIBLE
    }

    public FBPartialVisibilityHelper(FBDocument fBDocument) {
        this.f4952a = fBDocument;
        this.b = fBDocument.mRoot.getInnerViewTag();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.d;
        if (j == 0) {
            this.d = elapsedRealtime;
            this.f4952a.b0.postDelayed(new CalculateVisibilityChangeRunnable(elapsedRealtime), 100);
        } else if (j < elapsedRealtime) {
            this.d = elapsedRealtime;
        }
    }

    public final void a(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3d84c5", new Object[]{this, fBView});
            return;
        }
        View innerView = fBView.getInnerView();
        while (innerView != null) {
            ViewParent parent = innerView.getParent();
            if (!(parent instanceof FBRootFrameLayout) && (parent instanceof View)) {
                if ((parent instanceof ScrollView) || (parent instanceof HorizontalScrollView)) {
                    Object tag = ((View) parent).getTag(this.b);
                    if ((tag instanceof FBView) && ((FBView) tag).mScrollVisibleDetectEnabled) {
                        synchronized (this) {
                            try {
                                WeakHashMap<FBView, NodeVisibility> weakHashMap = this.c;
                                if (weakHashMap == null) {
                                    weakHashMap = new WeakHashMap<>();
                                    this.c = weakHashMap;
                                }
                                weakHashMap.put(fBView, NodeVisibility.TOTAL_INVISIBLE);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        a();
                        return;
                    }
                }
                innerView = (View) parent;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.flybird.FBView r10, com.flybird.FBPartialVisibilityHelper.NodeVisibility r11) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBPartialVisibilityHelper.a(com.flybird.FBView, com.flybird.FBPartialVisibilityHelper$NodeVisibility):void");
    }
}
