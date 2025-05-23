package com.tencent.mm.opensdk.modelmsg;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXImageObject implements WXMediaMessage.IMediaObject {
    private static final int CONTENT_LENGTH_LIMIT = 26214400;
    private static final int PATH_LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXImageObject";
    public String entranceMiniProgramPath;
    public String entranceMiniProgramUsername;
    public byte[] imageData;
    public String imagePath;
    public String imgDataHash;

    public WXImageObject() {
    }

    private int getFileSize(String str) {
        return b.a(str);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2;
        byte[] bArr = this.imageData;
        if ((bArr == null || bArr.length == 0) && ((str2 = this.imagePath) == null || str2.length() == 0)) {
            str = "checkArgs fail, all arguments are null";
        } else {
            byte[] bArr2 = this.imageData;
            if (bArr2 == null || bArr2.length <= CONTENT_LENGTH_LIMIT) {
                String str3 = this.imagePath;
                if (str3 == null || str3.length() <= 10240) {
                    String str4 = this.imagePath;
                    if (str4 == null || getFileSize(str4) <= CONTENT_LENGTH_LIMIT) {
                        return true;
                    }
                    str = "checkArgs fail, image content is too large";
                } else {
                    str = "checkArgs fail, path is invalid";
                }
            } else {
                str = "checkArgs fail, content is too large";
            }
        }
        Log.e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wximageobject_imageData", this.imageData);
        bundle.putString("_wximageobject_imagePath", this.imagePath);
        bundle.putString("_wximageobject_imgDataHash", this.imgDataHash);
        bundle.putString("_wximageobject_entranceMiniProgramUsername", this.entranceMiniProgramUsername);
        bundle.putString("_wximageobject_entranceMiniProgramPath", this.entranceMiniProgramPath);
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 2;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.imageData = bundle.getByteArray("_wximageobject_imageData");
        this.imagePath = bundle.getString("_wximageobject_imagePath");
        this.imgDataHash = bundle.getString("_wximageobject_imgDataHash");
        this.entranceMiniProgramUsername = bundle.getString("_wximageobject_entranceMiniProgramUsername");
        this.entranceMiniProgramPath = bundle.getString("_wximageobject_entranceMiniProgramPath");
    }

    public WXImageObject(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            Log.e(TAG, "WXImageObject <init>, exception:" + e.getMessage());
        }
    }

    public WXImageObject(byte[] bArr) {
        this.imageData = bArr;
    }
}
