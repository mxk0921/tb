package com.alipay.share.sdk.openapi;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APImageObject implements APMediaMessage.IMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] imageData;
    public String imagePath;
    public String imageUrl;

    public APImageObject() {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkArgs() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.share.sdk.openapi.APImageObject.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "30f26010"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            byte[] r2 = r8.imageData
            java.lang.String r3 = "APSDK.ZFBImageObject"
            if (r2 == 0) goto L_0x0022
            int r2 = r2.length
            if (r2 != 0) goto L_0x0037
        L_0x0022:
            java.lang.String r2 = r8.imagePath
            if (r2 == 0) goto L_0x002c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0037
        L_0x002c:
            java.lang.String r2 = r8.imageUrl
            if (r2 == 0) goto L_0x008f
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0037
            goto L_0x008f
        L_0x0037:
            byte[] r2 = r8.imageData
            r4 = 10485760(0xa00000, float:1.469368E-38)
            if (r2 == 0) goto L_0x0046
            int r2 = r2.length
            if (r2 <= r4) goto L_0x0046
            java.lang.String r1 = "checkArgs fail, content is too large"
            android.util.Log.e(r3, r1)
            return r0
        L_0x0046:
            java.lang.String r2 = r8.imagePath
            r5 = 10240(0x2800, float:1.4349E-41)
            if (r2 == 0) goto L_0x0058
            int r2 = r2.length()
            if (r2 <= r5) goto L_0x0058
            java.lang.String r1 = "checkArgs fail, path is invalid"
            android.util.Log.e(r3, r1)
            return r0
        L_0x0058:
            java.lang.String r2 = r8.imagePath
            if (r2 == 0) goto L_0x007e
            if (r2 == 0) goto L_0x006f
            int r6 = r2.length()
            if (r6 == 0) goto L_0x006f
            java.io.File r6 = new java.io.File
            r6.<init>(r2)
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x0071
        L_0x006f:
            r2 = 0
            goto L_0x0076
        L_0x0071:
            long r6 = r6.length()
            int r2 = (int) r6
        L_0x0076:
            if (r2 <= r4) goto L_0x007e
            java.lang.String r1 = "checkArgs fail, image content is too large"
            android.util.Log.e(r3, r1)
            return r0
        L_0x007e:
            java.lang.String r2 = r8.imageUrl
            if (r2 == 0) goto L_0x008e
            int r2 = r2.length()
            if (r2 <= r5) goto L_0x008e
            java.lang.String r1 = "checkArgs fail, url is invalid"
            android.util.Log.e(r3, r1)
            return r0
        L_0x008e:
            return r1
        L_0x008f:
            java.lang.String r1 = "checkArgs fail, all arguments are null"
            android.util.Log.e(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APImageObject.checkArgs():boolean");
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
            return;
        }
        bundle.putByteArray(Constant.EXTRA_IMAGE_OBJECT_IMAGE_DATA, this.imageData);
        bundle.putString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_PATH, this.imagePath);
        bundle.putString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_URL, this.imageUrl);
    }

    public void setImagePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dedef", new Object[]{this, str});
        } else {
            this.imagePath = str;
        }
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 14;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
            return;
        }
        this.imageData = bundle.getByteArray(Constant.EXTRA_IMAGE_OBJECT_IMAGE_DATA);
        this.imagePath = bundle.getString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_PATH);
        this.imageUrl = bundle.getString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_URL);
    }

    public APImageObject(byte[] bArr) {
        this.imageData = bArr;
    }

    public APImageObject(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
