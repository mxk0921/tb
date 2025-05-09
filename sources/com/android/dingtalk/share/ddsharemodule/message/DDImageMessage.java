package com.android.dingtalk.share.ddsharemodule.message;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import java.io.ByteArrayOutputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DDImageMessage extends BaseMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_IMAGE_DATA_LENGTH = 10485760;
    private static final int MAX_IMAGE_THUMB_DATA_LENGTH = 32768;
    private static final int MAX_IMAGE_URL_LENGTH = 10240;
    private static final String TAG = "DDImageMessage";
    public byte[] mImageData;
    public String mImagePath;
    public Uri mImageUri;
    public String mImageUrl;

    static {
        t2o.a(90177550);
    }

    public DDImageMessage() {
    }

    public static /* synthetic */ Object ipc$super(DDImageMessage dDImageMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/dingtalk/share/ddsharemodule/message/DDImageMessage");
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void attachContext(Context context) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
        } else if (context != null && (uri = this.mImageUri) != null) {
            try {
                context.grantUriPermission(ShareConstant.DD_APP_PACKAGE, uri, 1);
                context.grantUriPermission(ShareConstant.ALI_DD_APP_PACKAGE, this.mImageUri, 1);
            } catch (Throwable th) {
                Log.e(TAG, "attachContext: ", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkArgs() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.android.dingtalk.share.ddsharemodule.message.DDImageMessage.$ipChange
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
            byte[] r2 = r8.mImageData
            java.lang.String r3 = "DDImageMessage"
            if (r2 == 0) goto L_0x0022
            int r2 = r2.length
            if (r2 != 0) goto L_0x003a
        L_0x0022:
            java.lang.String r2 = r8.mImagePath
            if (r2 == 0) goto L_0x002c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x003a
        L_0x002c:
            java.lang.String r2 = r8.mImageUrl
            if (r2 == 0) goto L_0x0036
            int r2 = r2.length()
            if (r2 != 0) goto L_0x003a
        L_0x0036:
            android.net.Uri r2 = r8.mImageUri
            if (r2 == 0) goto L_0x0090
        L_0x003a:
            byte[] r2 = r8.mImageData
            r4 = 10485760(0xa00000, float:1.469368E-38)
            if (r2 == 0) goto L_0x0049
            int r2 = r2.length
            if (r2 <= r4) goto L_0x0049
            java.lang.String r1 = "checkArgs fail, content is too large"
            android.util.Log.e(r3, r1)
            return r0
        L_0x0049:
            java.lang.String r2 = r8.mImagePath
            r5 = 10240(0x2800, float:1.4349E-41)
            if (r2 == 0) goto L_0x005b
            int r2 = r2.length()
            if (r2 <= r5) goto L_0x005b
            java.lang.String r1 = "checkArgs fail, path is invalid"
            android.util.Log.e(r3, r1)
            return r0
        L_0x005b:
            java.lang.String r2 = r8.mImagePath
            if (r2 == 0) goto L_0x007f
            int r6 = r2.length()
            if (r6 == 0) goto L_0x0070
            java.io.File r6 = new java.io.File
            r6.<init>(r2)
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x0072
        L_0x0070:
            r2 = 0
            goto L_0x0077
        L_0x0072:
            long r6 = r6.length()
            int r2 = (int) r6
        L_0x0077:
            if (r2 <= r4) goto L_0x007f
            java.lang.String r1 = "checkArgs fail, image content is too large"
            android.util.Log.e(r3, r1)
            return r0
        L_0x007f:
            java.lang.String r2 = r8.mImageUrl
            if (r2 == 0) goto L_0x008f
            int r2 = r2.length()
            if (r2 <= r5) goto L_0x008f
            java.lang.String r1 = "checkArgs fail, url is invalid"
            android.util.Log.e(r3, r1)
            return r0
        L_0x008f:
            return r1
        L_0x0090:
            java.lang.String r1 = "checkArgs fail, all arguments are null"
            android.util.Log.e(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dingtalk.share.ddsharemodule.message.DDImageMessage.checkArgs():boolean");
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int getSupportVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue();
        }
        return ShareConstant.DINGDING_SDK_SHARE_VERSION_V1;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
        } else if (bundle != null) {
            bundle.putByteArray(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_DATA, this.mImageData);
            bundle.putString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_PATH, this.mImagePath);
            bundle.putString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URL, this.mImageUrl);
            bundle.putParcelable(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URI, this.mImageUri);
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        } else if (bundle != null) {
            this.mImageData = bundle.getByteArray(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_DATA);
            this.mImagePath = bundle.getString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_PATH);
            this.mImageUrl = bundle.getString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URL);
            this.mImageUri = (Uri) bundle.getParcelable(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URI);
        }
    }

    public DDImageMessage(byte[] bArr) {
        this.mImageData = bArr;
    }

    public DDImageMessage(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
            this.mImageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
