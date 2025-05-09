package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl;

import android.graphics.PointF;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.fve;
import tb.j3h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f10753a = new HashSet<>();
    public FaceDetectorConfig.FaceDetectionConfigInfo b;

    static {
        t2o.a(491782349);
    }

    public static float a(CopyOnWriteArrayList<Float> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ceed5b", new Object[]{copyOnWriteArrayList})).floatValue();
        }
        Iterator<Float> it = copyOnWriteArrayList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += it.next().floatValue();
        }
        return f / copyOnWriteArrayList.size();
    }

    public static float[] b(CopyOnWriteArrayList<PointF> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("84ead425", new Object[]{copyOnWriteArrayList});
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return null;
        }
        int size = copyOnWriteArrayList.size();
        Iterator<PointF> it = copyOnWriteArrayList.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            PointF next = it.next();
            f2 += next.x;
            f3 += next.y;
        }
        float[] fArr = new float[4];
        float f4 = size;
        fArr[0] = f2 / f4;
        fArr[1] = f3 / f4;
        Iterator<PointF> it2 = copyOnWriteArrayList.iterator();
        float f5 = 0.0f;
        while (it2.hasNext()) {
            PointF next2 = it2.next();
            f = (float) (f + Math.pow(next2.x - fArr[0], 2.0d));
            f5 = (float) (f5 + Math.pow(next2.y - fArr[1], 2.0d));
        }
        fArr[2] = (float) Math.sqrt(f / f4);
        fArr[3] = (float) Math.sqrt(f5 / f4);
        return fArr;
    }

    public static float c(CopyOnWriteArrayList<Float> copyOnWriteArrayList, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a11dcd8", new Object[]{copyOnWriteArrayList, new Float(f)})).floatValue();
        }
        Iterator<Float> it = copyOnWriteArrayList.iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            f2 = (float) (f2 + Math.pow(it.next().floatValue() - f, 2.0d));
        }
        return (float) Math.sqrt(f2 / copyOnWriteArrayList.size());
    }

    public j3h d(j3h j3hVar, boolean z, Rect rect, int i, int i2, int i3, int i4) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j3h) ipChange.ipc$dispatch("6ef3f519", new Object[]{this, j3hVar, new Boolean(z), rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        FaceDetectorConfig.FaceDetectionConfigInfo faceDetectionConfigInfo = this.b;
        if (faceDetectionConfigInfo == null || j3hVar.t) {
            return j3hVar;
        }
        int i5 = j3hVar.h + 1;
        j3hVar.h = i5;
        if (i5 >= Integer.parseInt(faceDetectionConfigInfo.preDetectionThreshold)) {
            j3hVar.v = Long.parseLong(this.b.intervalTime);
        }
        if (z) {
            j3hVar.o = j3hVar.h;
            j3hVar.e.add(new PointF(rect.exactCenterX() - i3, rect.exactCenterY() - i4));
            float width = (i2 * i) / (rect.width() * rect.height());
            j3hVar.k.add(Float.valueOf(width));
            j3hVar.i++;
            j3hVar.s = rect;
            ArrayList<Float> farApartScaleList = this.b.getFarApartScaleList(width);
            if (farApartScaleList == null || farApartScaleList.size() <= 0) {
                int i6 = j3hVar.h;
                int min = Math.min(i6 - j3hVar.m, i6 - j3hVar.p);
                j3hVar.n = j3hVar.h;
                if (j3hVar.r == 1.0f && min >= Integer.parseInt(this.b.continuedIsNotFarApartCloseThreshold)) {
                    if (j3hVar.u) {
                        j3hVar.u = false;
                    } else {
                        j3hVar.t = true;
                        fve.e(FaceDetectionNet.BIZ_NAME, "has not far frame, close Detect");
                        this.f10753a.add(j3hVar.d);
                    }
                }
                if (min >= Integer.parseInt(this.b.continuedIsNotFarApartThreshold)) {
                    if (j3hVar.r != 1.0f) {
                        j3hVar.x++;
                    }
                    j3hVar.r = 1.0f;
                }
            } else {
                float floatValue = farApartScaleList.get(0).floatValue();
                if (farApartScaleList.size() >= 2) {
                    f = farApartScaleList.get(1).floatValue();
                } else {
                    f = floatValue;
                }
                j3hVar.j++;
                int i7 = j3hVar.h;
                int i8 = i7 - j3hVar.n;
                j3hVar.m = i7;
                if (i7 <= Integer.parseInt(this.b.preDetectionThreshold)) {
                    j3hVar.u = true;
                    j3hVar.v = Long.parseLong(this.b.intervalTime);
                    if (j3hVar.w == -1) {
                        j3hVar.w = j3hVar.h;
                    }
                }
                if (!j3hVar.u && i8 >= Integer.parseInt(this.b.continuedIsFarApartThreshold)) {
                    j3hVar.u = true;
                    j3hVar.v = Long.parseLong(this.b.intervalTime);
                    if (j3hVar.w == -1) {
                        j3hVar.w = j3hVar.h;
                    }
                }
                if (j3hVar.u) {
                    int i9 = i3 + (i / 2);
                    if (j3hVar.q == 1.0f) {
                        int i10 = i / 6;
                        if (rect.centerX() <= i9 - i10 || rect.centerX() >= i9 + i10) {
                            j3hVar.r = f;
                        } else {
                            j3hVar.r = floatValue;
                        }
                        j3hVar.x++;
                    }
                }
            }
            return j3hVar;
        }
        int i11 = j3hVar.h;
        int i12 = i11 - j3hVar.o;
        j3hVar.p = i11;
        j3hVar.n = i11;
        if (i12 >= this.b.getDetectionContinuedFailCloseThreshold() && !j3hVar.u) {
            j3hVar.t = true;
            fve.e(FaceDetectionNet.BIZ_NAME, "Too many failures, close Detect");
            this.f10753a.add(j3hVar.d);
        }
        if (i12 >= Integer.parseInt(this.b.detectionContinuedFailThreshold)) {
            if (j3hVar.r != 1.0f) {
                j3hVar.x++;
            }
            j3hVar.r = 1.0f;
        }
        return j3hVar;
    }

    public j3h e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j3h) ipChange.ipc$dispatch("27fdf501", new Object[]{this, str});
        }
        j3h j3hVar = new j3h();
        j3hVar.d = str;
        j3hVar.v = Long.parseLong(this.b.preDetectionIntervalTime);
        return j3hVar;
    }

    public void f(FaceDetectorConfig.FaceDetectionConfigInfo faceDetectionConfigInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c13e0e", new Object[]{this, faceDetectionConfigInfo});
        } else {
            this.b = faceDetectionConfigInfo;
        }
    }
}
