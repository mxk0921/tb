package com.etao.feimagesearch.capture.scan;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.model.PhotoFrom;
import tb.agh;
import tb.hvm;
import tb.kso;
import tb.lso;
import tb.oda;
import tb.pyb;
import tb.qyb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a implements qyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pyb f4665a;
    public final hvm b;
    public final oda c;

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.capture.scan.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class C0234a {
        public static final /* synthetic */ int[] $SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values;

        static {
            int[] iArr = new int[PhotoFrom.Values.values().length];
            $SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values = iArr;
            try {
                iArr[PhotoFrom.Values.TAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values[PhotoFrom.Values.OUTER_ALBUM_LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values[PhotoFrom.Values.ALBUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values[PhotoFrom.Values.AUTO_DETECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values[PhotoFrom.Values.Got_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(730857581);
        t2o.a(481296696);
    }

    public a(pyb pybVar, hvm hvmVar, oda odaVar) {
        this.f4665a = pybVar;
        this.b = hvmVar;
        this.c = odaVar;
    }

    public final boolean c(lso lsoVar) {
        kso[] d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0842644", new Object[]{this, lsoVar})).booleanValue();
        }
        if (lsoVar == null || (d = lsoVar.d()) == null || d.length <= 0) {
            return false;
        }
        return true;
    }

    public final void d(b bVar, lso lsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c4f368", new Object[]{this, bVar, lsoVar});
        } else {
            this.f4665a.a(bVar, lsoVar);
        }
    }

    @Override // tb.qyb
    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cd52db", new Object[]{this, bVar});
            return;
        }
        agh.h("_scancode_DecodeCallbackWrapper", "onDecodeTimeout: " + bVar.u().hashCode() + " isTimeout=" + bVar.E() + ", cancelled=" + bVar.z() + ", isScanCaptureMergeInIrp=" + bVar.D() + ", photoFrom=" + bVar.w());
        if (bVar.z() || bVar.E()) {
            agh.r("Scan", "_scancode_DecodeCallbackWrapper", "onDecodeTimeout: task is cancelled " + bVar);
            return;
        }
        bVar.f(IDecodeTask.TaskStatus.TIMEOUT);
        if (bVar.D()) {
            int i = C0234a.$SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values[bVar.w().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                d(bVar, null);
                return;
            }
            return;
        }
        bVar.f(IDecodeTask.TaskStatus.CANCELLED);
        d(bVar, null);
    }

    @Override // tb.qyb
    public void a(b bVar, lso lsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b7d12", new Object[]{this, bVar, lsoVar});
            return;
        }
        if (!bVar.A()) {
            agh.h("_scancode_DecodeCallbackWrapper", "onDecodeFinished " + bVar.u().hashCode() + ", isTimeout=" + bVar.E() + ", cancelled=" + bVar.z() + ", isScanCaptureMergeInIrp=" + bVar.D() + ", photoFrom=" + bVar.w());
        }
        if (!bVar.z()) {
            Bitmap a2 = bVar.u().a();
            if (!bVar.D() || a2 == null) {
                if (!bVar.E()) {
                    d(bVar, lsoVar);
                }
            } else if (bVar.E()) {
                bVar.f(IDecodeTask.TaskStatus.CANCELLED);
                int i = C0234a.$SwitchMap$com$etao$feimagesearch$model$PhotoFrom$Values[bVar.w().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                    oda odaVar = this.c;
                    if (odaVar != null) {
                        odaVar.b(bVar, lsoVar);
                    } else {
                        agh.r("Scan", "_scancode_DecodeCallbackWrapper", "onDecodeFinished: isScanCaptureMergeInIrp, goIrpIfNeededTask is null, something must be wrong");
                    }
                } else {
                    this.b.startPreview();
                }
            } else {
                bVar.f(IDecodeTask.TaskStatus.CANCELLED);
                if (bVar.w() != PhotoFrom.Values.Got_CODE || !c(lsoVar)) {
                    d(bVar, lsoVar);
                } else if (this.c != null) {
                    agh.h("_scancode_DecodeCallbackWrapper", "goIrp");
                    this.c.a(a2, bVar, lsoVar);
                } else {
                    agh.r("Scan", "_scancode_DecodeCallbackWrapper", "error: Got_CODE notify capture page");
                    d(bVar, lsoVar);
                }
            }
        }
    }
}
