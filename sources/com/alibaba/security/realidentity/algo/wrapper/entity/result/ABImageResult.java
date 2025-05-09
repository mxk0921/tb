package com.alibaba.security.realidentity.algo.wrapper.entity.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ABImageResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long serialVersionUID = 1;
    public int[] faceRect;
    public byte[] imageBuffer;
    public String imagePath;
    public float[] landmarks;

    public int[] getFaceRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("5ca72046", new Object[]{this});
        }
        return this.faceRect;
    }

    public float[] getLandmarks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("66058ad5", new Object[]{this});
        }
        return this.landmarks;
    }

    public ABImageResult setFaceRect(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABImageResult) ipChange.ipc$dispatch("280b55af", new Object[]{this, iArr});
        }
        this.faceRect = iArr;
        return this;
    }

    public ABImageResult setLandmarks(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABImageResult) ipChange.ipc$dispatch("9dc48dfc", new Object[]{this, fArr});
        }
        this.landmarks = fArr;
        return this;
    }
}
