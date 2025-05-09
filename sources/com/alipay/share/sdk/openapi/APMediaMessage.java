package com.alipay.share.sdk.openapi;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APMediaMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizType;
    public String description;
    public IMediaObject mediaObject;
    public int sdkVer;
    public byte[] thumbData;
    public String thumbUrl;
    public String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static APMediaMessage fromBundle(Bundle bundle) {
            APMediaMessage aPMediaMessage = new APMediaMessage();
            aPMediaMessage.bizType = bundle.getString(Constant.EXTRA_AP_OBJECT_BIZTYPE);
            aPMediaMessage.sdkVer = bundle.getInt(Constant.EXTRA_AP_OBJECT_SDK_VERSION);
            aPMediaMessage.title = bundle.getString(Constant.EXTRA_AP_OBJECT_TITLE);
            aPMediaMessage.description = bundle.getString(Constant.EXTRA_AP_OBJECT_DESCRIPTION);
            aPMediaMessage.thumbData = bundle.getByteArray(Constant.EXTRA_AP_OBJECT_THUMB_DATA);
            aPMediaMessage.thumbUrl = bundle.getString(Constant.EXTRA_AP_OBJECT_THUMB_URL);
            String string = bundle.getString(Constant.EXTRA_AP_OBJECT_IDENTIFIER);
            if (string != null && string.length() > 0) {
                try {
                    IMediaObject iMediaObject = (IMediaObject) Class.forName(string).newInstance();
                    aPMediaMessage.mediaObject = iMediaObject;
                    iMediaObject.unserialize(bundle);
                    return aPMediaMessage;
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("APSDK.ZFBMediaMessage", "get media object from bundle failed: unknown ident ".concat(string));
                }
            }
            return aPMediaMessage;
        }

        public static Bundle toBundle(APMediaMessage aPMediaMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("856fd594", new Object[]{aPMediaMessage});
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constant.EXTRA_AP_OBJECT_BIZTYPE, aPMediaMessage.bizType);
            bundle.putInt(Constant.EXTRA_AP_OBJECT_SDK_VERSION, aPMediaMessage.sdkVer);
            bundle.putString(Constant.EXTRA_AP_OBJECT_TITLE, aPMediaMessage.title);
            bundle.putString(Constant.EXTRA_AP_OBJECT_DESCRIPTION, aPMediaMessage.description);
            bundle.putByteArray(Constant.EXTRA_AP_OBJECT_THUMB_DATA, aPMediaMessage.thumbData);
            bundle.putString(Constant.EXTRA_AP_OBJECT_THUMB_URL, aPMediaMessage.thumbUrl);
            IMediaObject iMediaObject = aPMediaMessage.mediaObject;
            if (iMediaObject != null) {
                bundle.putString(Constant.EXTRA_AP_OBJECT_IDENTIFIER, iMediaObject.getClass().getSimpleName());
                aPMediaMessage.mediaObject.serialize(bundle);
            }
            return bundle;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IMediaObject {
        public static final int TYPE_FUND = 122;
        public static final int TYPE_IMAGE = 14;
        public static final int TYPE_STOCK = 120;
        public static final int TYPE_TAOBAO_GOODS = 1010;
        public static final int TYPE_TEXT = 11;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_URL = 1001;

        boolean checkArgs();

        void serialize(Bundle bundle);

        int type();

        void unserialize(Bundle bundle);
    }

    public APMediaMessage() {
        this(null);
    }

    public final boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        byte[] bArr = this.thumbData;
        if (bArr == null || bArr.length <= 32768) {
            String str = this.title;
            if (str == null || str.length() <= 512) {
                String str2 = this.description;
                if (str2 == null || str2.length() <= 1024) {
                    IMediaObject iMediaObject = this.mediaObject;
                    if (iMediaObject != null) {
                        return iMediaObject.checkArgs();
                    }
                    Log.e("APSDK.ZFBMediaMessage", "checkArgs fail, mediaObject is null");
                    return false;
                }
                Log.e("APSDK.ZFBMediaMessage", "checkArgs fail, description is invalid");
                return false;
            }
            Log.e("APSDK.ZFBMediaMessage", "checkArgs fail, title is invalid");
            return false;
        }
        Log.e("APSDK.ZFBMediaMessage", "checkArgs fail, thumbData is invalid");
        return false;
    }

    public final int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        IMediaObject iMediaObject = this.mediaObject;
        if (iMediaObject == null) {
            return 0;
        }
        return iMediaObject.type();
    }

    public final void setThumbImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55002dc0", new Object[]{this, bitmap});
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.thumbData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
            Log.e("APSDK.ZFBMediaMessage", "put thumb failed");
        }
    }

    public APMediaMessage(IMediaObject iMediaObject) {
        this.mediaObject = iMediaObject;
    }
}
